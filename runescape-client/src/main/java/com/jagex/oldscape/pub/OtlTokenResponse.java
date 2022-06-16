package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenResponse")
@ObfuscatedName("com/jagex/oldscape/pub/RefreshAccessTokenResponse")
public interface OtlTokenResponse {
	boolean isSuccess();

	String getToken();

	String getAccessToken();

	String getRefreshToken();
}
