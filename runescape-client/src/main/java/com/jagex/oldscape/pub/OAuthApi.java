package com.jagex.oldscape.pub;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("OAuthApi")
public interface OAuthApi {

	@Export("isOnLoginScreen")
	boolean isOnLoginScreen();

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	@Export("setOtlTokenRequester")
	void setOtlTokenRequester(OtlTokenRequester var1);

	@Export("getAccountHash")
	long getAccountHash();
}
