package com.jagex.oldscape.pub;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements("OtlTokenResponse")
@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {

	@Export("isSuccess")
	boolean isSuccess();

	@Export("getToken")
	String getToken();
}
