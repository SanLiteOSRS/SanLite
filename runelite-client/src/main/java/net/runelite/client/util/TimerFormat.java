package net.runelite.client.util;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum TimerFormat
{
	SECONDS_MILLISECONDS("Seconds + Milliseconds"),
	SECONDS("Seconds"),
	GAME_TICKS("Game Ticks");

	private final String value;
}

