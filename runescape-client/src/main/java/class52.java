import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
public final class class52 {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 1416486083
	)
	static int field396;

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		signature = "(Lhq;I)V",
		garbageValue = "2097597667"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field881) {
			Client.field882[var0.rootIndex] = true;
		}

	}
}
