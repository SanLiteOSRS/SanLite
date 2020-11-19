import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class200 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgj;"
	)
	static final class200 field2391;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgj;"
	)
	static final class200 field2390;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgj;"
	)
	static final class200 field2392;

	static {
		field2391 = new class200();
		field2390 = new class200();
		field2392 = new class200();
	}

	class200() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "96"
	)
	public static void method3803() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1508888429"
	)
	static void method3804() {
		if (PlayerType.localPlayer.x >> 7 == Client.destinationX && PlayerType.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

	}
}
