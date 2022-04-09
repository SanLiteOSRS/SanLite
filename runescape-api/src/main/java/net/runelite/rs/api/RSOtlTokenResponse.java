package net.runelite.rs.api;

import com.jagex.oldscape.pub.OtlTokenResponse;
import net.runelite.mapping.Import;

public interface RSOtlTokenResponse extends OtlTokenResponse
{
	@Import("isSuccess")
	boolean isSuccess();

	@Import("getToken")
	String getToken();
}
