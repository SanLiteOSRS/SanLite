package net.runelite.client.plugins.hidersn;

import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.FontManager;

import javax.inject.Inject;
import java.awt.*;

@PluginDescriptor(
		name = "Hide RSN",
		description = "Hide your own RSN from the chatbox",
		tags = {"hide", "rsn", "custom", "hidden"}
)

public class HideRsnPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private HideRsnConfig config;

	@Provides
	HideRsnConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(HideRsnConfig.class);
	}

	@Override
	protected void startUp() throws Exception
	{
		setRSN();
	}

	@Override
	protected void shutDown() throws Exception
	{
		setRSN(true);
		setChatbox(true);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		setChatbox();
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("hidersn"))
		{
			return;
		}

		setRSN();
		setChatbox();
	}

	@Subscribe
	public void onScriptCallbackEvent(ScriptCallbackEvent scriptCallbackEvent)
	{
		if (scriptCallbackEvent.getEventName().equals("setChatboxInput"))
		{
			setRSN();
		}
	}

	private void setRSN(boolean... optionalReset)
	{
		boolean reset = (optionalReset.length >= 1) && optionalReset[0];
		String customRSN = config.getCustomRSN();
		Widget chatboxInput = client.getWidget(WidgetInfo.CHATBOX_INPUT);
		if (chatboxInput != null)
		{
			String[] splitRSN = chatboxInput.getText().split(":");
			if (!reset)
			{
				splitRSN[0] = customRSN + ":";
			}
			else
			{
				splitRSN[0] = client.getLocalPlayer().getName() + ":";
			}

			StringBuilder stringBuilder = new StringBuilder();

			for (int i = 0; i < splitRSN.length; i++)
			{
				stringBuilder.append(splitRSN[i]);
			}
			String newChatRSN = stringBuilder.toString();

			chatboxInput.setText(newChatRSN);
		}
	}

	private void setChatbox(boolean... optionalReset)
	{
		boolean reset = (optionalReset.length >= 1) && optionalReset[0];

		int chatBoxHeight = 16;
		Widget widget = client.getWidget(WidgetInfo.CHATBOX_MESSAGE_LINES);
		Widget[] widgetArray = widget.getDynamicChildren();

		//No need to update messages not viewable in the chatbox
		for (int i = 0; i < chatBoxHeight; i++)
		{
			String[] splitRSN = widgetArray[i].getText().split(":");
			final String defaultRSN = client.getLocalPlayer().getName();
			final String customRSN = config.getCustomRSN();
			String newRSN = "";

			if (!reset && client.getLocalPlayer().getName().equals(splitRSN[0]))
			{
				newRSN = customRSN + ":";
			}
			else if (reset && customRSN.equals(splitRSN[0]))
			{
				newRSN = defaultRSN + ":";
			}

			if (!newRSN.equals(""))
			{
				widgetArray[i].setText(newRSN);
				final FontMetrics smallFM = client.getCanvas().getFontMetrics(FontManager.getRunescapeSmallFont());
				int rsnLength = smallFM.stringWidth(newRSN);
				System.out.println("RSN LENGTH: " + rsnLength);
				widgetArray[i + 1].setRelativeX((int)Math.round(rsnLength * 1.18) + 2);
			}
		}
	}
}
