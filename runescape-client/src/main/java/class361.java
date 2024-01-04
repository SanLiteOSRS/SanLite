import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class361 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	static {
		int var0 = 0; // L: 9
		int var1 = 0; // L: 10
		class357[] var2 = new class357[]{class357.field3895, class357.field3897}; // L: 14
		class357[] var3 = var2; // L: 16

		for (int var4 = 0; var4 < var3.length; ++var4) { // L: 17
			class357 var5 = var3[var4]; // L: 18
			if (var5.field3894 > var0) { // L: 20
				var0 = var5.field3894;
			}

			if (var5.field3893 > var1) { // L: 21
				var1 = var5.field3893;
			}
		}

	} // L: 25

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1795808199"
	)
	public static int method6868(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 87 88 91
			var2 = var2 << 1 | var0 & 1; // L: 89
			var0 >>>= 1; // L: 90
		}

		return var2; // L: 93
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "571282441"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12748
		return var1 != null ? var1.integer : var0.flags; // L: 12749 12750
	}
}
