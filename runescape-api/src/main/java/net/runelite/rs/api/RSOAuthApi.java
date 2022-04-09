package net.runelite.rs.api;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.mapping.Import;

public interface RSOAuthApi extends OAuthApi
{
	@Import("isOnLoginScreen")
	boolean isOnLoginScreen();

	@Import("setOtlTokenRequester")
	void setOtlTokenRequester(OtlTokenRequester otlTokenRequester);

	@Import("getAccountHash")
	long getAccountHash();
}
