package net.runelite.client.plugins.scammerlist;

import com.google.common.base.Splitter;
import com.google.inject.Provides;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ClanMember;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Varbits;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ConfigChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import static net.runelite.api.widgets.WidgetID.TRADING_SCREEN;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import net.runelite.client.util.Text;
import net.runelite.http.api.RuneLiteAPI;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

@PluginDescriptor(
		name = "Scammer List",
		description = "Displays warning in chat when you join a clan chat/new member join your clan chat and he is in a WDR/RuneWatch/Manual List",
		tags = {"PVM", "WDR", "RuneWatch", "scammer", "list", "toxic"},
		type = PluginType.SANLITE,
		enabledByDefault = false
)
@Singleton
@Slf4j
public class ScammerListPlugin extends Plugin
{
	private final Set<String> wdrScamSet = new HashSet<>();
	private final Set<String> wdrToxicSet = new HashSet<>();
	private final Set<String> runeWatchSet = new HashSet<>();
	private final Set<String> manualBans = new HashSet<>();

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Inject
	private ScammerListConfig config;

	@Inject
	private ChatMessageManager chatMessageManager;

	@Inject
	private EventBus eventBus;

	private String tobNames = "";

	@Provides
	ScammerListConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ScammerListConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		populateManualList();
		fetchFromWebsites();
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(this);
		wdrScamSet.clear();
		wdrToxicSet.clear();
		runeWatchSet.clear();
		manualBans.clear();
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		if (event.getGroup().equals("scammerlist") && event.getKey().equals("bannedPlayers"))
		{
			populateManualList();
		}

		if (event.getGroup().equals("scammerlist") && event.getKey().equals("highlightInClan"))
		{
			if (!config.highlightInClan())
			{
				clientThread.invokeLater(() ->
				{
					Widget widget = client.getWidget(WidgetInfo.CLAN_CHAT_LIST);
					for (Widget widgetChild : widget.getDynamicChildren())
					{
						if (widgetChild.getTextColor() != new Color(255, 255, 255).getRGB() && widgetChild.hasListener())
						{
							widgetChild.setTextColor(new Color(255, 255, 255).getRGB());
						}
					}
				});
			}
			else if (config.highlightInClan())
			{
				highlightRedInCC();
			}
		}
	}

	private void populateManualList()
	{
		List<String> bannedPlayers = Splitter
				.on(",")
				.trimResults()
				.omitEmptyStrings()
				.splitToList(config.getBannedPlayers());

		manualBans.clear();
		for (String bannedPlayer : bannedPlayers)
		{
			if (!manualBans.contains(bannedPlayer))
			{
				manualBans.add(Text.standardize(bannedPlayer));
			}
		}
	}

	/**
	 * Event to keep making sure player names are highlighted red in clan chat, since the red name goes away frequently
	 */
	@Subscribe
	private void onWidgetHiddenChanged(WidgetHiddenChanged widgetHiddenChanged)
	{
		if (client.getGameState() != GameState.LOGGED_IN
				|| client.getWidget(WidgetInfo.LOGIN_CLICK_TO_PLAY_SCREEN) != null
				|| client.getViewportWidget() == null
				|| client.getWidget(WidgetInfo.CLAN_CHAT) == null
				|| !config.highlightInClan())
		{
			return;
		}

		clientThread.invokeLater(() ->
		{
			if (!client.getWidget(WidgetInfo.CLAN_CHAT).isHidden())
			{
				highlightRedInCC();
			}
		});
	}

	@Subscribe
	private void onClanMemberJoined(ClanMemberJoined event)
	{
		ClanMember member = event.getMember();
		String memberUsername = Text.standardize(member.getUsername().toLowerCase());

		ListType scamList = checkScamList(memberUsername);
		ListType toxicList = checkToxicList(memberUsername);

		if (scamList != null)
		{
			sendWarning(member.getUsername(), scamList);
			if (config.highlightInClan())
			{
				highlightRedInCC();
			}
		}

		if (toxicList != null)
		{
			sendWarning(member.getUsername(), toxicList);
			if (config.highlightInClan())
			{
				highlightRedInCC();
			}
		}
	}

	/**
	 * If a trade window is opened and the person trading us is on the list, modify "trading with"
	 */
	@Subscribe
	private void onWidgetLoaded(WidgetLoaded widgetLoaded)
	{
		if (config.highlightInTrade() && widgetLoaded.getGroupId() == TRADING_SCREEN)
		{ //if trading window was loaded
			clientThread.invokeLater(() ->
			{
				Widget tradingWith = client.getWidget(TRADING_SCREEN, 31);
				String name = tradingWith.getText().replaceAll("Trading With: ", "");
				if (checkScamList(name.toLowerCase()) != null)
				{
					sendWarning(name, checkScamList(name.toLowerCase()));
					client.getWidget(335, 31).setText("Trading With: " + name + " (scammer)");
					client.getWidget(335, 31).setTextColor(new Color(255, 0, 0).getRGB());
				}
				if (checkToxicList(name.toLowerCase()) != null)
				{
					sendWarning(name, checkToxicList(name.toLowerCase()));
					client.getWidget(335, 31).setText("Trading With: " + name + " (toxic)");
					client.getWidget(335, 31).setTextColor(new Color(255, 0, 0).getRGB());
				}
			});
		}
	}

	@Subscribe
	private void onGameTick(GameTick event)
	{
		if (client.getWidget(WidgetInfo.THEATRE_OF_BLOOD_RAIDING_PARTY) == null)
		{
			return;
		}

		Widget raidingParty = client.getWidget(WidgetInfo.THEATRE_OF_BLOOD_RAIDING_PARTY);
		String allNames = raidingParty.getText();

		if (allNames.equalsIgnoreCase(tobNames))
		{
			return;
		}

		tobNames = allNames;

		String[] split = allNames.split("<br>");

		for (int i = 0; i < 5; i++)
		{
			String name = split[i];
			if (!name.equalsIgnoreCase("-"))
			{
				ListType scamList = checkScamList(Text.standardize(name));

				if (scamList != null)
				{
					sendWarning(name, scamList);
				}

				ListType toxicList = checkToxicList(Text.standardize(name));

				if (toxicList != null)
				{
					sendWarning(name, toxicList);
				}
			}
		}
	}

	private boolean inTobParty()
	{
		return client.getVar(Varbits.THEATRE_OF_BLOOD) == 1;
	}

	/**
	 * Compares player name to everything in the ban lists
	 */
	private ListType checkScamList(String nameToBeChecked)
	{
		if (wdrScamSet.size() > 0 && config.enableWDRScam() && wdrScamSet.contains(nameToBeChecked))
		{
			return ListType.WEDORAIDSSCAM_LIST;
		}

		if (runeWatchSet.size() > 0 && config.enableRuneWatch() && runeWatchSet.contains(nameToBeChecked))
		{
			return ListType.RUNEWATCH_LIST;
		}

		if (manualBans.size() > 0 && manualBans.contains(nameToBeChecked))
		{
			return ListType.MANUAL_LIST;
		}

		return null;
	}

	private ListType checkToxicList(String nameToBeChecked)
	{

		if (wdrToxicSet.size() > 0 && config.enableWDRToxic() && wdrToxicSet.contains(nameToBeChecked))
		{
			return ListType.WEDORAIDSTOXIC_LIST;
		}

		return null;
	}

	/**
	 * Sends a warning to our player, notifying them that a player is on a ban list
	 */
	private void sendWarning(String playerName, ListType listType)
	{
		switch (listType)
		{
			case WEDORAIDSSCAM_LIST:
				final String wdr__scam_message = new ChatMessageBuilder()
						.append(ChatColorType.HIGHLIGHT)
						.append("Warning! " + playerName + " is on WeDoRaids\' scammer list!")
						.build();

				chatMessageManager.queue(
						QueuedMessage.builder()
								.type(ChatMessageType.CONSOLE)
								.runeLiteFormattedMessage(wdr__scam_message)
								.build());
				break;

			case WEDORAIDSTOXIC_LIST:
				final String wdr__toxic_message = new ChatMessageBuilder()
						.append(ChatColorType.HIGHLIGHT)
						.append("Warning! " + playerName + " is on WeDoRaids\' toxic list!")
						.build();

				chatMessageManager.queue(
						QueuedMessage.builder()
								.type(ChatMessageType.CONSOLE)
								.runeLiteFormattedMessage(wdr__toxic_message)
								.build());
				break;

			case RUNEWATCH_LIST:
				final String rw_message = new ChatMessageBuilder()
						.append(ChatColorType.HIGHLIGHT)
						.append("Warning! " + playerName + " is on the Runewatch\'s potential scammer list!")
						.build();

				chatMessageManager.queue(
						QueuedMessage.builder()
								.type(ChatMessageType.CONSOLE)
								.runeLiteFormattedMessage(rw_message)
								.build());
				break;
			case MANUAL_LIST:
				final String manual_message = new ChatMessageBuilder()
						.append(ChatColorType.HIGHLIGHT)
						.append("Warning! " + playerName + " is on your manual scammer list!")
						.build();

				chatMessageManager.queue(
						QueuedMessage.builder()
								.type(ChatMessageType.CONSOLE)
								.runeLiteFormattedMessage(manual_message)
								.build());
				break;
		}
	}

	/**
	 * Pulls data from wdr and runewatch to build a list of blacklisted usernames
	 */
	private void fetchFromWebsites()
	{
		Request request = new Request.Builder()
				.url("https://wdrdev.github.io/index")
				.build();
		RuneLiteAPI.CLIENT.newCall(request).enqueue(new Callback()
		{
			@Override
			public void onFailure(Call call, IOException e)
			{
				log.debug("error retrieving names from wdr");
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException
			{
				String text = response.body().string();
				text = text.substring(text.indexOf("<p>") + 3, text.indexOf("</p>"));
				text = text.replace("/", ",");
				text = text.replace(", $", "");

				ArrayList<String> wdrList = new ArrayList<>(Arrays.asList(text.split(",")));
				ArrayList<String> wdrList2 = new ArrayList<>();
				wdrList.forEach((name) -> wdrList2.add(Text.standardize(name).toLowerCase()));

				wdrScamSet.addAll(wdrList2);
			}
		});


		Request secondRequest = new Request.Builder()
				.url("https://runewatch.com/incident-index-page/")
				.build();
		RuneLiteAPI.CLIENT.newCall(secondRequest).enqueue(new Callback()
		{
			@Override
			public void onFailure(Call call, IOException e)
			{
				log.debug("error retrieving names from runewatch");
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException
			{
				String text = response.body().string();
				String mytext = text.substring(text.indexOf("lcp_instance_0"), text.indexOf("strong>Evidence Quality Suggestion"));
				String[] split = mytext.split("href=");
				for (String x : split)
				{
					if (x.contains("title"))
					{
						x = x.substring(x.indexOf("title"), x.indexOf('>'));
						x = x.substring(x.indexOf('=') + 2, x.length() - 1);
						runeWatchSet.add(Text.standardize(x).toLowerCase());
					}
				}
			}
		});

		Request thirdRequest = new Request.Builder()
				.url("https://wdrdev.github.io/toxic")
				.build();
		RuneLiteAPI.CLIENT.newCall(thirdRequest).enqueue(new Callback()
		{
			@Override
			public void onFailure(Call call, IOException e)
			{
				log.debug("error retrieving names from wdr");
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException
			{
				String text = response.body().string();
				text = text.substring(text.indexOf("<p>") + 3, text.indexOf("</p>"));
				text = text.replace("/", ",");
				text = text.replace(", $", "");

				ArrayList<String> wdrToxicList = new ArrayList<>(Arrays.asList(text.split(",")));
				ArrayList<String> wdrToxicList2 = new ArrayList<>();
				wdrToxicList.forEach((name) -> wdrToxicList2.add(Text.standardize(name).toLowerCase()));

				wdrToxicSet.addAll(wdrToxicList2);
			}
		});
	}

	/**
	 * Iterates through the clan chat list widget and checks if a string (name) is on any of the ban lists to highlight them red.
	 */
	private void highlightRedInCC()
	{
		clientThread.invokeLater(() ->
		{
			Widget widget = client.getWidget(WidgetInfo.CLAN_CHAT_LIST);
			for (Widget widgetChild : widget.getDynamicChildren())
			{
				ListType scamList = checkScamList(widgetChild.getText().toLowerCase());
				ListType toxicList = checkToxicList(widgetChild.getText().toLowerCase());

				if (scamList != null)
				{
					widgetChild.setTextColor(new Color(255, 0, 0).getRGB());
				}
				else if (toxicList != null)
				{
					widgetChild.setTextColor(new Color(255, 0, 0).getRGB());
				}
			}
		});
	}
}