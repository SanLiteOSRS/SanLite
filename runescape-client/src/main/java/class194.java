import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class194 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2356;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2349;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2359;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2348;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2352;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2351;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2354;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2353;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2355;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	public static final class194 field2357;

	static {
		field2356 = new class194(3);
		field2349 = new class194(6);
		field2359 = new class194(2);
		field2348 = new class194(4);
		field2352 = new class194(15);
		field2351 = new class194(5);
		field2354 = new class194(4);
		field2353 = new class194(5);
		field2355 = new class194(14);
		field2357 = new class194(7);
	}

	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-893482237"
	)
	public static int method3753(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Lij;",
		garbageValue = "1718964805"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}
