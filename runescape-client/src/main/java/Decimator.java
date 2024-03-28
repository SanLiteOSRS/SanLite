import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static ArchiveDisk field392;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field395;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2080347225
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1126485821
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ao")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = ItemContainer.method2301(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4];
				double var6 = (double)var4 / (double)var1 + 6.0D; // L: 23
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D)); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = ((double)var8 - var6) * 3.141592653589793D; // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) { // L: 32
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(0.5D + 65536.0D * var14); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1061414363"
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
					var3[var9 + var4] += var7 * var8[var9];
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "446395893"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 66
		}

		return var1; // L: 67
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "512990791"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "284284053"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "888621734"
	)
	public static void method1085(boolean var0) {
		if (var0 != class168.ItemComposition_inMembersWorld) { // L: 575
			ItemComposition.ItemComposition_cached.clear(); // L: 577
			ItemComposition.ItemComposition_cachedModels.clear(); // L: 578
			ItemComposition.ItemComposition_cachedSprites.clear(); // L: 579
			class168.ItemComposition_inMembersWorld = var0; // L: 581
		}

	} // L: 583
}
