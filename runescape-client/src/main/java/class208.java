import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class208 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2303;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2293;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2298;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2296;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2297;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2304;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2294;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2300;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2301;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2302;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2295;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	public static final class208 field2299;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2305;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static final class208 field2306;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1787676189
	)
	public final int field2307;

	static {
		field2303 = new class208(0); // L: 4
		field2293 = new class208(1); // L: 5
		field2298 = new class208(2); // L: 6
		field2296 = new class208(3); // L: 7
		field2297 = new class208(4, class196.field2059); // L: 8
		field2304 = new class208(5); // L: 9
		field2294 = new class208(6, class196.field2060); // L: 10
		field2300 = new class208(7, class196.field2061); // L: 11
		field2301 = new class208(8, class196.field2058); // L: 12
		field2302 = new class208(9, class196.field2063); // L: 13
		field2295 = new class208(10, class196.field2057); // L: 14
		field2299 = new class208(11, class196.field2062); // L: 15
		field2305 = new class208(12); // L: 16
		field2306 = new class208(13); // L: 17
	}

	class208(int var1) {
		this(var1, (class196)null); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(ILhd;)V"
	)
	class208(int var1, class196 var2) {
		this.field2307 = var1; // L: 21
	} // L: 22

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1403140723"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5689
		int var4 = var1 >> 7; // L: 5690
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5691
			int var5 = var2; // L: 5692
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5693
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5694
			int var7 = var1 & 127; // L: 5695
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5696
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7; // L: 5697
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5698
		} else {
			return 0;
		}
	}
}
