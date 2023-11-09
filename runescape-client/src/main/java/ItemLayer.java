import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1634075517
	)
	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -302907033
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1448377563
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -8670153185654999153L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 691025921
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqw;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-2065416187"
	)
	static float method3821(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 200

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 201
			var3 = var0[var4] + var3 * var2; // L: 202
		}

		return var3; // L: 204
	}
}
