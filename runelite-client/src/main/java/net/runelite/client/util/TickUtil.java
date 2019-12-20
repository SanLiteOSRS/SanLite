package net.runelite.client.util;

public class TickUtil
{
	public static String convertTimerFormat(int clientTicksRemaining, TimerFormat formatTo)
	{
		String remainingTime = "";

		switch (formatTo)
		{
			case SECONDS_MILLISECONDS:
				remainingTime = Math.abs((clientTicksRemaining / 5) / 10) + "." + (Math.abs((clientTicksRemaining / 5)) % 10);
				break;

			case SECONDS:
				remainingTime = Integer.toString(Math.abs((clientTicksRemaining / 5) / 10));
				break;

			case GAME_TICKS:
				//remainingTime = Integer.toString((int)Math.ceil(Math.abs((clientTicksRemaining / 5) / 10) * 0.6));
				remainingTime = Integer.toString((clientTicksRemaining * 30));
				break;
			default:
				break;
		}

		return remainingTime;
	}
}
