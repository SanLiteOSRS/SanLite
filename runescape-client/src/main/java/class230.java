import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class230 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ac")
	final int[][] field2420;
	@ObfuscatedName("al")
	final int[][] field2418;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -992174991
	)
	int field2419;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2040661997
	)
	int field2423;
	@ObfuscatedName("ao")
	final int[] field2421;
	@ObfuscatedName("ah")
	final int[] field2424;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -124856799
	)
	final int field2417;

	class230(int var1, int var2) {
		this.field2420 = new int[var1][var2]; // L: 15
		this.field2418 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = EnumComposition.method3749(var3 / 4); // L: 18
		this.field2421 = new int[var4]; // L: 19
		this.field2424 = new int[var4]; // L: 20
		this.field2417 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	void method4343() {
		for (int var1 = 0; var1 < this.field2420.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2420[var1].length; ++var2) { // L: 26
				this.field2420[var1][var2] = 0; // L: 27
				this.field2418[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-19"
	)
	void method4344(int var1, int var2) {
		this.field2419 = var1; // L: 34
		this.field2423 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-9624"
	)
	int method4345() {
		return this.field2419; // L: 39
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3816"
	)
	int method4346() {
		return this.field2423; // L: 43
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-796520814"
	)
	int method4380() {
		return this.field2420.length; // L: 47
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493129305"
	)
	int method4348() {
		return this.field2420[0].length; // L: 51
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1798810715"
	)
	int[][] method4349() {
		return this.field2420; // L: 55
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "19"
	)
	int[][] method4350() {
		return this.field2418; // L: 59
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "40"
	)
	int[] method4351() {
		return this.field2421; // L: 63
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1267204855"
	)
	int[] method4352() {
		return this.field2424; // L: 67
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2043277042"
	)
	int method4353() {
		return this.field2417; // L: 71
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-575404360"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (UserComparator3.World_worlds != null) { // L: 172
			GroundObject.doWorldSorting(0, UserComparator3.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-527981427"
	)
	public static int method4347(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 77
			boolean var3 = false; // L: 78
			boolean var4 = false; // L: 79
			int var5 = 0; // L: 80
			int var6 = var0.length(); // L: 81

			for (int var7 = 0; var7 < var6; ++var7) { // L: 82
				char var8 = var0.charAt(var7); // L: 83
				if (var7 == 0) { // L: 84
					if (var8 == '-') { // L: 85
						var3 = true; // L: 86
						continue;
					}

					if (var8 == '+') { // L: 89
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 91
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 92
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 93
						throw new NumberFormatException(); // L: 94
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 95
					throw new NumberFormatException();
				}

				if (var3) { // L: 96
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 97
				if (var9 / var1 != var5) { // L: 98
					throw new NumberFormatException();
				}

				var5 = var9; // L: 99
				var4 = true; // L: 100
			}

			if (!var4) { // L: 102
				throw new NumberFormatException();
			} else {
				return var5; // L: 103
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
