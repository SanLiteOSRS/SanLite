package net.runelite.client.plugins.theatreofblood;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TheatreOfBloodTimerFormat
{
	SECONDS_MILLISECONDS("Seconds + Milliseconds"),
	SECONDS("Seconds"),
	GAME_TICKS("Game Ticks");

	private final String value;
}
