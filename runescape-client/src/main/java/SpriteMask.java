import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1325150283
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -606386499
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ac")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ab")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1003
		this.height = var2; // L: 1004
		this.xWidths = var3; // L: 1005
		this.xStarts = var4; // L: 1006
	} // L: 1007

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2050749327"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1010
			int var3 = this.xStarts[var2]; // L: 1011
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1012
				return true;
			}
		}

		return false; // L: 1014
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Lnt;IB)Lnt;",
		garbageValue = "108"
	)
	@Export("findEnumerated")
	public static class352 findEnumerated(class352[] var0, int var1) {
		class352[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class352 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1516793225"
	)
	public static void method5743() {
		ByteArrayPool.field4424.clear(); // L: 43
		ByteArrayPool.field4424.add(100); // L: 44
		ByteArrayPool.field4424.add(5000); // L: 45
		ByteArrayPool.field4424.add(10000); // L: 46
		ByteArrayPool.field4424.add(30000); // L: 47
	} // L: 48
}
