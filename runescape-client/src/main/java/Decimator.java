import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("c")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 364790869
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 126236859
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("q")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1; // L: 16
			int var5 = var2; // L: 17
			if (var2 > var1) { // L: 19
				var4 = var2; // L: 21
				var5 = var1; // L: 22
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5; // L: 25
				var4 = var5; // L: 26
				var5 = var6; // L: 27
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = (double)var7 / (double)var1 + 6.0D; // L: 39
				int var11 = (int)Math.floor(var9 - 7.0D + 1.0D); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(7.0D + var9); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(((double)var11 - var9) * 0.2243994752564138D); // L: 49
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "77"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var8[var9] * var7;
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1104276170"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate); // L: 82
		}

		return var1; // L: 83
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-256"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}
}
