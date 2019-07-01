package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSRawSound
{
	@Import("resample")
	RSRawSound applyResampler(RSDecimator resampler);
}
