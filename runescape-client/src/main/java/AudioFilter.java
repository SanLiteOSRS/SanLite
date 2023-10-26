import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("ah")
	static float[][] field435;
	@ObfuscatedName("ar")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("ab")
	static float field437;
	@ObfuscatedName("am")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("ac")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("ak")
	int[][][] field434;
	@ObfuscatedName("ax")
	int[][][] field433;
	@ObfuscatedName("ao")
	int[] field432;

	static {
		field435 = new float[2][8]; // L: 13
		coefficients = new int[2][8]; // L: 14
	}

	AudioFilter() {
		this.pairs = new int[2]; // L: 8
		this.field434 = new int[2][2][4]; // L: 10
		this.field433 = new int[2][2][4]; // L: 11
		this.field432 = new int[2]; // L: 12
	} // L: 21

	@ObfuscatedName("ac")
	float method1151(int var1, int var2, float var3) {
		float var4 = (float)this.field433[var1][0][var2] + var3 * (float)(this.field433[var1][1][var2] - this.field433[var1][0][var2]); // L: 24
		var4 *= 0.0015258789F; // L: 25
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F)); // L: 26
	}

	@ObfuscatedName("ak")
	float method1143(int var1, int var2, float var3) {
		float var4 = (float)this.field434[var1][0][var2] + var3 * (float)(this.field434[var1][1][var2] - this.field434[var1][0][var2]); // L: 35
		var4 *= 1.2207031E-4F; // L: 36
		return normalize(var4); // L: 37
	}

	@ObfuscatedName("ax")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) { // L: 41
			var3 = (float)this.field432[0] + (float)(this.field432[1] - this.field432[0]) * var2; // L: 42
			var3 *= 0.0030517578F; // L: 43
			field437 = (float)Math.pow(0.1D, (double)(var3 / 20.0F)); // L: 44
			forwardMultiplier = (int)(field437 * 65536.0F); // L: 45
		}

		if (this.pairs[var1] == 0) { // L: 47
			return 0;
		} else {
			var3 = this.method1151(var1, 0, var2); // L: 48
			field435[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1143(var1, 0, var2)); // L: 49
			field435[var1][1] = var3 * var3; // L: 50

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) { // L: 51
				var3 = this.method1151(var1, var4, var2); // L: 52
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1143(var1, var4, var2)); // L: 53
				float var6 = var3 * var3; // L: 54
				field435[var1][var4 * 2 + 1] = field435[var1][var4 * 2 - 1] * var6; // L: 55
				field435[var1][var4 * 2] = field435[var1][var4 * 2 - 1] * var5 + field435[var1][var4 * 2 - 2] * var6; // L: 56

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) { // L: 57
					var10000 = field435[var1];
					var10000[var7] += field435[var1][var7 - 1] * var5 + field435[var1][var7 - 2] * var6;
				}

				var10000 = field435[var1]; // L: 58
				var10000[1] += field435[var1][0] * var5 + var6;
				var10000 = field435[var1]; // L: 59
				var10000[0] += var5;
			}

			if (var1 == 0) { // L: 61
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field435[0];
					var10000[var4] *= field437;
				}
			}

			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) { // L: 62
				coefficients[var1][var4] = (int)(field435[var1][var4] * 65536.0F);
			}

			return this.pairs[var1] * 2; // L: 63
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lul;Lbf;)V"
	)
	final void method1145(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte(); // L: 67
		this.pairs[0] = var3 >> 4; // L: 68
		this.pairs[1] = var3 & 15; // L: 69
		if (var3 != 0) { // L: 70
			this.field432[0] = var1.readUnsignedShort(); // L: 71
			this.field432[1] = var1.readUnsignedShort(); // L: 72
			int var7 = var1.readUnsignedByte(); // L: 73

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) { // L: 74
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) { // L: 75
					this.field434[var5][0][var6] = var1.readUnsignedShort(); // L: 76
					this.field433[var5][0][var6] = var1.readUnsignedShort(); // L: 77
				}
			}

			for (var5 = 0; var5 < 2; ++var5) { // L: 80
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) { // L: 81
					if ((var7 & 1 << var5 * 4 << var6) != 0) { // L: 82
						this.field434[var5][1][var6] = var1.readUnsignedShort(); // L: 83
						this.field433[var5][1][var6] = var1.readUnsignedShort(); // L: 84
					} else {
						this.field434[var5][1][var6] = this.field434[var5][0][var6]; // L: 87
						this.field433[var5][1][var6] = this.field433[var5][0][var6]; // L: 88
					}
				}
			}

			if (var7 != 0 || this.field432[1] != this.field432[0]) { // L: 92
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field432; // L: 95
			this.field432[1] = 0; // L: 96
			var4[0] = 0; // L: 97
		}

	} // L: 99

	@ObfuscatedName("al")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0); // L: 30
		return var1 * 3.1415927F / 11025.0F; // L: 31
	}
}
