import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2056638961
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -548354981
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ah")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = ModeWhere.method7170(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = 6.0D + (double)var4 / (double)var1; // L: 23
				int var8 = (int)Math.floor(var6 - 7.0D + 1.0D); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(var6 + 7.0D); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = 3.141592653589793D * ((double)var8 - var6); // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(0.5D + var14 * 65536.0D); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-668170179"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "470837923"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 66
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1; // L: 67
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "551468970"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "1896465710"
	)
	public static void method1135(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "463489265"
	)
	static final void method1132(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					Tiles.field1045[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4]; // L: 81
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1378992941"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 155
	}
}
