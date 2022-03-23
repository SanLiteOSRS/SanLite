package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

import java.net.URL;
import java.util.concurrent.Future;

@Implements("OtlTokenRequester")
@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenRequester")
public interface OtlTokenRequester {
	Future request(URL var1);
}
