import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("ay")
	int field345;
	@ObfuscatedName("an")
	@Export("entries")
	int entries;
	@ObfuscatedName("ar")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("ab")
	int[] field348;
	@ObfuscatedName("at")
	float[][] field349;
	@ObfuscatedName("ax")
	@Export("keys")
	int[] keys;

	VorbisCodebook() {
		class60 var1 = VorbisSample.field354; // L: 41
		var1.method1141(24); // L: 42
		this.field345 = var1.method1141(16); // L: 43
		this.entries = var1.method1141(24); // L: 44
		this.lengthMap = new int[this.entries]; // L: 45
		boolean var2 = var1.method1145() != 0; // L: 46
		int var3;
		int var4;
		int var6;
		if (var2) { // L: 47
			var3 = 0; // L: 48

			for (var4 = var1.method1141(5) + 1; var3 < this.entries; ++var4) { // L: 49 50 53
				int var5 = var1.method1141(Friend.iLog(this.entries - var3)); // L: 51

				for (var6 = 0; var6 < var5; ++var6) { // L: 52
					this.lengthMap[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1145() != 0; // L: 57

			for (var4 = 0; var4 < this.entries; ++var4) { // L: 58
				if (var15 && var1.method1145() == 0) { // L: 59
					this.lengthMap[var4] = 0;
				} else {
					this.lengthMap[var4] = var1.method1141(5) + 1; // L: 60
				}
			}
		}

		this.method1050(); // L: 63
		var3 = var1.method1141(4); // L: 64
		if (var3 > 0) { // L: 65
			float var16 = VorbisSample.float32Unpack(var1.method1141(32)); // L: 66
			float var17 = VorbisSample.float32Unpack(var1.method1141(32)); // L: 67
			var6 = var1.method1141(4) + 1; // L: 68
			boolean var7 = var1.method1145() != 0; // L: 69
			int var8;
			if (var3 == 1) { // L: 71
				var8 = mapType1QuantValues(this.entries, this.field345);
			} else {
				var8 = this.entries * this.field345; // L: 72
			}

			this.field348 = new int[var8]; // L: 73

			int var9;
			for (var9 = 0; var9 < var8; ++var9) { // L: 74
				this.field348[var9] = var1.method1141(var6);
			}

			this.field349 = new float[this.entries][this.field345]; // L: 75
			float var10;
			int var11;
			int var12;
			if (var3 == 1) { // L: 76
				for (var9 = 0; var9 < this.entries; ++var9) { // L: 77
					var10 = 0.0F; // L: 78
					var11 = 1; // L: 79

					for (var12 = 0; var12 < this.field345; ++var12) { // L: 80
						int var13 = var9 / var11 % var8; // L: 81
						float var14 = (float)this.field348[var13] * var17 + var16 + var10; // L: 82
						this.field349[var9][var12] = var14; // L: 83
						if (var7) { // L: 84
							var10 = var14;
						}

						var11 *= var8; // L: 85
					}
				}
			} else {
				for (var9 = 0; var9 < this.entries; ++var9) { // L: 90
					var10 = 0.0F; // L: 91
					var11 = var9 * this.field345; // L: 92

					for (var12 = 0; var12 < this.field345; ++var12) { // L: 93
						float var18 = (float)this.field348[var11] * var17 + var16 + var10; // L: 94
						this.field349[var9][var12] = var18; // L: 95
						if (var7) { // L: 96
							var10 = var18;
						}

						++var11; // L: 97
					}
				}
			}
		}

	} // L: 102

	@ObfuscatedName("an")
	void method1050() {
		int[] var1 = new int[this.entries]; // L: 105
		int[] var2 = new int[33]; // L: 107

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) { // L: 108
			var4 = this.lengthMap[var3]; // L: 109
			if (var4 != 0) { // L: 110
				var5 = 1 << 32 - var4; // L: 111
				var6 = var2[var4]; // L: 112
				var1[var3] = var6; // L: 113
				int var12;
				if ((var6 & var5) != 0) { // L: 115
					var7 = var2[var4 - 1]; // L: 116
				} else {
					var7 = var6 | var5; // L: 119

					for (var8 = var4 - 1; var8 >= 1; --var8) { // L: 120
						var12 = var2[var8]; // L: 121
						if (var12 != var6) { // L: 122
							break;
						}

						var10 = 1 << 32 - var8; // L: 123
						if ((var12 & var10) != 0) { // L: 124
							var2[var8] = var2[var8 - 1]; // L: 125
							break; // L: 126
						}

						var2[var8] = var12 | var10; // L: 129
					}
				}

				var2[var4] = var7; // L: 135

				for (var8 = var4 + 1; var8 <= 32; ++var8) { // L: 136
					var12 = var2[var8]; // L: 137
					if (var12 == var6) { // L: 138
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8]; // L: 142
		int var11 = 0; // L: 143

		for (var3 = 0; var3 < this.entries; ++var3) { // L: 144
			var4 = this.lengthMap[var3]; // L: 145
			if (var4 != 0) { // L: 146
				var5 = var1[var3]; // L: 147
				var6 = 0; // L: 148

				for (var7 = 0; var7 < var4; ++var7) { // L: 149
					var8 = Integer.MIN_VALUE >>> var7; // L: 150
					if ((var5 & var8) != 0) { // L: 151
						if (this.keys[var6] == 0) { // L: 152
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6]; // L: 153
					} else {
						++var6; // L: 156
					}

					if (var6 >= this.keys.length) { // L: 158
						int[] var9 = new int[this.keys.length * 2]; // L: 159

						for (var10 = 0; var10 < this.keys.length; ++var10) { // L: 160
							var9[var10] = this.keys[var10];
						}

						this.keys = var9; // L: 161
					}

					var8 >>>= 1; // L: 163
				}

				this.keys[var6] = ~var3; // L: 165
				if (var6 >= var11) { // L: 166
					var11 = var6 + 1;
				}
			}
		}

	} // L: 168

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lck;)I"
	)
	int method1049(class60 var1) {
		int var2;
		for (var2 = 0; this.keys[var2] >= 0; var2 = var1.method1145() != 0 ? this.keys[var2] : var2 + 1) { // L: 171 172
		}

		return ~this.keys[var2]; // L: 173
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lck;)[F"
	)
	float[] method1047(class60 var1) {
		return this.field349[this.method1049(var1)]; // L: 177
	}

	@ObfuscatedName("ay")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; // L: 16

		while (true) {
			int var4 = var2; // L: 19
			int var5 = var1; // L: 20

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) { // L: 22 23 26
				if ((var5 & 1) != 0) { // L: 24
					var6 *= var4;
				}

				var4 *= var4; // L: 25
			}

			int var3;
			if (var5 == 1) { // L: 28
				var3 = var4 * var6; // L: 29
			} else {
				var3 = var6; // L: 32
			}

			if (var3 <= var0) { // L: 34
				return var2; // L: 37
			}

			--var2; // L: 35
		}
	}
}
