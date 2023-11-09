package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("OAuthApi")
public interface OAuthApi {
	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	void setRefreshTokenRequester(.RefreshAccessTokenRequester var1);

	boolean isOnLoginScreen();

	long getAccountHash();

	void setClient(int var1);

	void setOtlTokenRequester(OtlTokenRequester var1);
}
