import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("gn")
	static String field3475;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1484188043
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 939947663
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("aw")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ac")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1139
		this.height = var2; // L: 1140
		this.xWidths = var3; // L: 1141
		this.xStarts = var4; // L: 1142
	} // L: 1143

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-746690647"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1146
			int var3 = this.xStarts[var2]; // L: 1147
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1148
				return true;
			}
		}

		return false; // L: 1150
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "575322475"
	)
	public static int method5990(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}
}
