import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class284 {
	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1344957864"
	)
	static void method5687(int var0) {
		if (var0 != Client.loginState) { // L: 12236
			Client.loginState = var0; // L: 12237
		}
	} // L: 12238
}
