package net.runelite.client.plugins.hidersn;

import com.google.inject.Provides;
import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.VarClientStr;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.util.Arrays;

@PluginDescriptor(
		name = "Hide RSN",
		description = "Hide your own/clan members RSNs from the chatbox",
		tags = {"hide", "rsn"},
		type = PluginType.SANLITE
)

@Slf4j
@Singleton
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


	/*
	@Override
	protected void startUp() throws Exception
	{
		if (config.hideRSN())
		{
			log.debug("change rsn triggered");
			Widget widget = client.getWidget(WidgetInfo.CHATBOX_INPUT);
			String[] splitRSN = widget.getText().split(":");
			splitRSN[0] = "rev-rs.net";
			widget.setText(Arrays.toString(splitRSN));
		}
	}

	 */

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		if (config.hideRSN())
		{
			Widget widget = client.getWidget(WidgetInfo.CHATBOX_MESSAGE);
			Widget[] widgetArray = widget.getDynamicChildren();

			for (int i = 0; i < widgetArray.length; i++)
			{
				String[] splitRSN = widgetArray[i].getText().split(":");
				if (client.isClanMember(splitRSN[0]) || client.getLocalPlayer().getName().equals(splitRSN[0]))
				{
					widgetArray[i].setText("rev-rs.net:");
					widgetArray[i + 1].setRelativeX(67);
				}
			}
		}
	}


	@Subscribe
	public void onClientTick (ClientTick clientTick)
	{
		/*
		if (config.hideRSN())
		{
			Widget widget = client.getWidget(WidgetInfo.CHATBOX_INPUT);
			String chatboxRSN = widget.getText();
			String newRSN = chatboxRSN.replace(client.getLocalPlayer().getName(), "rev-rs.net");
			//log.debug(newRSN);
			widget.setText(newRSN);
			widget.revalidate();
			//log.debug(client.getUsername());
			//client.setUsername("rev.rs-net");

		}
		*/
		if (config.hideRSN())
		{
			Widget widget = client.getWidget(WidgetInfo.CHATBOX_INPUT);
			String[] splitRSN = widget.getText().split(":");
			splitRSN[0] = "rev-rs.net:";
			String newChatRSN = Arrays.toString(splitRSN);
			log.debug(newChatRSN + " newChatRSN");
			widget.setText(newChatRSN);
		}
	}



	/*
	@Subscribe
	public void onVarClientStrChanged (VarClientStrChanged varClientStr)
	{
		log.debug("event triggered");
		log.debug(varClientStr + " varClientStr");
		log.debug(varClientStr.getIndex() + " varClientStr.getIndex()");
		String index = String.valueOf(varClientStr.getIndex());
		log.debug(index + " index as string");
		if (varClientStr.getIndex() == VarClientStr.CHATBOX_TYPED_TEXT.getIndex())
		{
			if (config.hideRSN())
			{
				log.debug("change rsn triggered");
				Widget widget = client.getWidget(WidgetInfo.CHATBOX_INPUT);
				String[] splitRSN = widget.getText().split(":");
				splitRSN[0] = "rev-rs.net";
				widget.setText(Arrays.toString(splitRSN));
				widget.revalidate();
			}
		}
	}
	*/

}
