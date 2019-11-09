package net.runelite.client.plugins.hidersn;

import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginType;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Hide RSN",
		description = "Hide your own/clan members RSNs from the chatbox",
		tags = {"hide", "rsn"},
		type = PluginType.SANLITE
)

@Singleton
public class HideRsnPlugin extends Plugin
{
	@Inject
	private Client client;


	@Override
	protected void startUp() throws Exception
	{
		setRSN(true);
	}

	@Override
	protected void shutDown() throws Exception
	{
		setRSN(false);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		int chatBoxHeight = 16;
		Widget widget = client.getWidget(WidgetInfo.CHATBOX_MESSAGE);
		Widget[] widgetArray = widget.getDynamicChildren();

		//No need to update messages not viewable in the chatbox
		for (int i = 0; i < chatBoxHeight; i++)
		{
			String[] splitRSN = widgetArray[i].getText().split(":");
			if (client.isClanMember(splitRSN[0]) || client.getLocalPlayer().getName().equals(splitRSN[0]))
			{
				widgetArray[i].setText("rev-rs.net:");
				widgetArray[i + 1].setRelativeX(67);
			}
		}
	}

	@Subscribe
	public void onScriptCallbackEvent(ScriptCallbackEvent scriptCallbackEvent)
	{
		if (scriptCallbackEvent.getEventName().equals("setChatboxInput"))
		{
			setRSN(true);
		}
	}

	private void setRSN(Boolean custom)
	{
		Widget chatboxInput = client.getWidget(WidgetInfo.CHATBOX_INPUT);
		if (chatboxInput != null)
		{
			String[] splitRSN = chatboxInput.getText().split(":");
			if (custom)
			{
				splitRSN[0] = "rev-rs.net:";
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
}
