import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -163617677
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 22061403
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1595377211
	)
	@Export("z")
	int z;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1156289521
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lhr;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIB)V",
		garbageValue = "-5"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10565
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10566
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10567
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10568
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10569
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10570
		}

		if (var0.yAlignment == 0) { // L: 10571
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10572
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10573
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10574
		} else if (var0.yAlignment == 4) { // L: 10575
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10576
		}

	} // L: 10577
}
