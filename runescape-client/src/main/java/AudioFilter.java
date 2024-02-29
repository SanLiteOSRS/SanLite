import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("as")
	static float[][] field415;
	@ObfuscatedName("aa")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("az")
	static float field418;
	@ObfuscatedName("ao")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("aq")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("al")
	int[][][] field412;
	@ObfuscatedName("ai")
	int[][][] field419;
	@ObfuscatedName("ar")
	int[] field414;

	static {
		field415 = new float[2][8]; // L: 13
		coefficients = new int[2][8]; // L: 14
	}

	AudioFilter() {
		this.pairs = new int[2]; // L: 8
		this.field412 = new int[2][2][4]; // L: 10
		this.field419 = new int[2][2][4]; // L: 11
		this.field414 = new int[2]; // L: 12
	} // L: 21

	@ObfuscatedName("aq")
	float method1109(int var1, int var2, float var3) {
		float var4 = (float)this.field419[var1][0][var2] + var3 * (float)(this.field419[var1][1][var2] - this.field419[var1][0][var2]); // L: 24
		var4 *= 0.0015258789F; // L: 25
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F)); // L: 26
	}

	@ObfuscatedName("al")
	float method1121(int var1, int var2, float var3) {
		float var4 = (float)this.field412[var1][0][var2] + var3 * (float)(this.field412[var1][1][var2] - this.field412[var1][0][var2]); // L: 35
		var4 *= 1.2207031E-4F; // L: 36
		return normalize(var4); // L: 37
	}

	@ObfuscatedName("ai")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) { // L: 41
			var3 = (float)this.field414[0] + (float)(this.field414[1] - this.field414[0]) * var2; // L: 42
			var3 *= 0.0030517578F; // L: 43
			field418 = (float)Math.pow(0.1D, (double)(var3 / 20.0F)); // L: 44
			forwardMultiplier = (int)(field418 * 65536.0F); // L: 45
		}

		if (this.pairs[var1] == 0) { // L: 47
			return 0;
		} else {
			var3 = this.method1109(var1, 0, var2); // L: 48
			field415[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1121(var1, 0, var2)); // L: 49
			field415[var1][1] = var3 * var3; // L: 50

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) { // L: 51
				var3 = this.method1109(var1, var4, var2); // L: 52
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1121(var1, var4, var2)); // L: 53
				float var6 = var3 * var3; // L: 54
				field415[var1][var4 * 2 + 1] = field415[var1][var4 * 2 - 1] * var6; // L: 55
				field415[var1][var4 * 2] = field415[var1][var4 * 2 - 1] * var5 + field415[var1][var4 * 2 - 2] * var6; // L: 56

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) { // L: 57
					var10000 = field415[var1];
					var10000[var7] += field415[var1][var7 - 1] * var5 + field415[var1][var7 - 2] * var6;
				}

				var10000 = field415[var1]; // L: 58
				var10000[1] += field415[var1][0] * var5 + var6;
				var10000 = field415[var1]; // L: 59
				var10000[0] += var5;
			}

			if (var1 == 0) { // L: 61
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field415[0];
					var10000[var4] *= field418;
				}
			}

			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) { // L: 62
				coefficients[var1][var4] = (int)(field415[var1][var4] * 65536.0F);
			}

			return this.pairs[var1] * 2; // L: 63
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luq;Lbg;)V"
	)
	final void method1113(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte(); // L: 67
		this.pairs[0] = var3 >> 4; // L: 68
		this.pairs[1] = var3 & 15; // L: 69
		if (var3 != 0) { // L: 70
			this.field414[0] = var1.readUnsignedShort(); // L: 71
			this.field414[1] = var1.readUnsignedShort(); // L: 72
			int var7 = var1.readUnsignedByte(); // L: 73

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) { // L: 74
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) { // L: 75
					this.field412[var5][0][var6] = var1.readUnsignedShort(); // L: 76
					this.field419[var5][0][var6] = var1.readUnsignedShort(); // L: 77
				}
			}

			for (var5 = 0; var5 < 2; ++var5) { // L: 80
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) { // L: 81
					if ((var7 & 1 << var5 * 4 << var6) != 0) { // L: 82
						this.field412[var5][1][var6] = var1.readUnsignedShort(); // L: 83
						this.field419[var5][1][var6] = var1.readUnsignedShort(); // L: 84
					} else {
						this.field412[var5][1][var6] = this.field412[var5][0][var6]; // L: 87
						this.field419[var5][1][var6] = this.field419[var5][0][var6]; // L: 88
					}
				}
			}

			if (var7 != 0 || this.field414[1] != this.field414[0]) { // L: 92
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field414; // L: 95
			this.field414[1] = 0; // L: 96
			var4[0] = 0; // L: 97
		}

	} // L: 99

	@ObfuscatedName("aw")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0); // L: 30
		return var1 * 3.1415927F / 11025.0F; // L: 31
	}
}
