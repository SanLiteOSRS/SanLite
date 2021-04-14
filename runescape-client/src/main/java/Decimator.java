import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Let;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("z")
	public static String field510;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1135278343
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -463713673
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("e")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = GrandExchangeOfferUnitPriceComparator.method4652(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = (double)var4 / (double)var1 + 6.0D;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = ((double)var8 - var6) * 3.141592653589793D;
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6));
					var5[var8] = (int)Math.floor(0.5D + 65536.0D * var14);
				}
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([BI)[B",
		garbageValue = "-867512678"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-649772260"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "546685264"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IILeb;Lel;B)Z",
		garbageValue = "105"
	)
	public static final boolean method1113(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class137.directions[var6][var7] = 99;
		class137.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class137.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class137.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var11 != var18) {
			var4 = class137.bufferX[var11];
			var5 = class137.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				Messages.field1377 = var4;
				CollisionMap.field1535 = var5;
				return true;
			}

			int var15 = class137.distances[var16][var17] + 1;
			if (var16 > 0 && class137.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class137.bufferX[var18] = var4 - 1;
				class137.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 - 1][var17] = 2;
				class137.distances[var16 - 1][var17] = var15;
			}

			if (var16 < 126 && class137.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class137.bufferX[var18] = var4 + 1;
				class137.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 + 1][var17] = 8;
				class137.distances[var16 + 1][var17] = var15;
			}

			if (var17 > 0 && class137.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class137.bufferX[var18] = var4;
				class137.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16][var17 - 1] = 1;
				class137.distances[var16][var17 - 1] = var15;
			}

			if (var17 < 126 && class137.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class137.bufferX[var18] = var4;
				class137.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16][var17 + 1] = 4;
				class137.distances[var16][var17 + 1] = var15;
			}

			if (var16 > 0 && var17 > 0 && class137.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class137.bufferX[var18] = var4 - 1;
				class137.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 - 1][var17 - 1] = 3;
				class137.distances[var16 - 1][var17 - 1] = var15;
			}

			if (var16 < 126 && var17 > 0 && class137.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class137.bufferX[var18] = var4 + 1;
				class137.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 + 1][var17 - 1] = 9;
				class137.distances[var16 + 1][var17 - 1] = var15;
			}

			if (var16 > 0 && var17 < 126 && class137.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class137.bufferX[var18] = var4 - 1;
				class137.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 - 1][var17 + 1] = 6;
				class137.distances[var16 - 1][var17 + 1] = var15;
			}

			if (var16 < 126 && var17 < 126 && class137.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class137.bufferX[var18] = var4 + 1;
				class137.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class137.directions[var16 + 1][var17 + 1] = 12;
				class137.distances[var16 + 1][var17 + 1] = var15;
			}
		}

		Messages.field1377 = var4;
		CollisionMap.field1535 = var5;
		return false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;I)V",
		garbageValue = "-269408259"
	)
	public static void method1114(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.NpcDefinition_modelArchive = var1;
	}
}
