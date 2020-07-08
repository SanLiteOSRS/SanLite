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

import javax.inject.Inject;
import java.awt.*;

@PluginDescriptor(
		name = "Hide RSN",
		description = "Hide your own/clan members RSNs from the chatbox",
		tags = {"hide", "rsn"}
)

@Singleton
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
		setRSN();
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
				//Calc name length

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

	private void setRSN()
	{
		String customRSN = config.getCustomRSN();
		Widget chatboxInput = client.getWidget(WidgetInfo.CHATBOX_INPUT);
		if (chatboxInput != null)
		{
			String[] splitRSN = chatboxInput.getText().split(":");
			splitRSN[0] = customRSN + ":";
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
