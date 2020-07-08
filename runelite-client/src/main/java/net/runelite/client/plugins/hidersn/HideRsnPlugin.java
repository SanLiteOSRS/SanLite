package net.runelite.client.plugins.hidersn;

import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

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

	@Override
	protected void startUp() throws Exception
	{
		setRSN();
	}

	@Override
	protected void shutDown() throws Exception
	{
		setRSN(true);
	}

	@Subscribe
	public void onGameTick(GameTick gameTick)
	{
		int chatBoxHeight = 16;
		Widget widget = client.getWidget(WidgetInfo.CHATBOX_INPUT);
		Widget[] widgetArray = widget.getDynamicChildren();

		//No need to update messages not viewable in the chatbox
		for (int i = 0; i < chatBoxHeight; i++)
		{
			String[] splitRSN = widgetArray[i].getText().split(":");
			if (client.getLocalPlayer().getName().equals(splitRSN[0]))
			{
				String rsn = config.getCustomRSN();
				widgetArray[i].setText(rsn);

				int rsnLength = stringWidth(rsn);
				widgetArray[i + 1].setRelativeX(rsnLength);
			}
		}
	}

	private int stringWidth(String str)
	{
		int len = str.length();
		char data[] = new char[len];
		str.getChars(0, len, data, 0);
		return charsWidth(data, 0, len);
	}

	private int charsWidth(char data[], int off, int len) {
		return stringWidth(new String(data, off, len));
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
		boolean reset = (optionalReset.length >= 1) ? optionalReset[0] : false;
		String customRSN = config.getCustomRSN();
		Widget chatboxInput = client.getWidget(WidgetInfo.CHATBOX_INPUT);
		if (chatboxInput != null)
		{
			String[] splitRSN = chatboxInput.getText().split(":");
			if (reset)
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
}
