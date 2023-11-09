import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("au")
	int field383;
	@ObfuscatedName("ae")
	@Export("entries")
	int entries;
	@ObfuscatedName("ao")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("at")
	int[] field378;
	@ObfuscatedName("ac")
	float[][] field382;
	@ObfuscatedName("ai")
	@Export("keys")
	int[] keys;

	VorbisCodebook() {
		class60 var1 = VorbisSample.field393; // L: 22
		var1.method1161(24); // L: 23
		this.field383 = var1.method1161(16); // L: 24
		this.entries = var1.method1161(24); // L: 25
		this.lengthMap = new int[this.entries]; // L: 26
		boolean var2 = var1.method1162() != 0; // L: 27
		int var3;
		int var4;
		int var6;
		if (var2) { // L: 28
			var3 = 0; // L: 29

			for (var4 = var1.method1161(5) + 1; var3 < this.entries; ++var4) { // L: 30 31 34
				int var5 = var1.method1161(class16.iLog(this.entries - var3)); // L: 32

				for (var6 = 0; var6 < var5; ++var6) { // L: 33
					this.lengthMap[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1162() != 0; // L: 38

			for (var4 = 0; var4 < this.entries; ++var4) { // L: 39
				if (var15 && var1.method1162() == 0) { // L: 40
					this.lengthMap[var4] = 0;
				} else {
					this.lengthMap[var4] = var1.method1161(5) + 1; // L: 41
				}
			}
		}

		this.method1068(); // L: 44
		var3 = var1.method1161(4); // L: 45
		if (var3 > 0) { // L: 46
			float var16 = VorbisSample.float32Unpack(var1.method1161(32)); // L: 47
			float var17 = VorbisSample.float32Unpack(var1.method1161(32)); // L: 48
			var6 = var1.method1161(4) + 1; // L: 49
			boolean var7 = var1.method1162() != 0; // L: 50
			int var8;
			if (var3 == 1) { // L: 52
				var8 = mapType1QuantValues(this.entries, this.field383);
			} else {
				var8 = this.entries * this.field383; // L: 53
			}

			this.field378 = new int[var8]; // L: 54

			int var9;
			for (var9 = 0; var9 < var8; ++var9) { // L: 55
				this.field378[var9] = var1.method1161(var6);
			}

			this.field382 = new float[this.entries][this.field383]; // L: 56
			float var10;
			int var11;
			int var12;
			if (var3 == 1) { // L: 57
				for (var9 = 0; var9 < this.entries; ++var9) { // L: 58
					var10 = 0.0F; // L: 59
					var11 = 1; // L: 60

					for (var12 = 0; var12 < this.field383; ++var12) { // L: 61
						int var13 = var9 / var11 % var8; // L: 62
						float var14 = (float)this.field378[var13] * var17 + var16 + var10; // L: 63
						this.field382[var9][var12] = var14; // L: 64
						if (var7) { // L: 65
							var10 = var14;
						}

						var11 *= var8; // L: 66
					}
				}
			} else {
				for (var9 = 0; var9 < this.entries; ++var9) { // L: 71
					var10 = 0.0F; // L: 72
					var11 = var9 * this.field383; // L: 73

					for (var12 = 0; var12 < this.field383; ++var12) { // L: 74
						float var18 = (float)this.field378[var11] * var17 + var16 + var10; // L: 75
						this.field382[var9][var12] = var18; // L: 76
						if (var7) { // L: 77
							var10 = var18;
						}

						++var11; // L: 78
					}
				}
			}
		}

	} // L: 83

	@ObfuscatedName("ae")
	void method1068() {
		int[] var1 = new int[this.entries]; // L: 86
		int[] var2 = new int[33]; // L: 88

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) { // L: 89
			var4 = this.lengthMap[var3]; // L: 90
			if (var4 != 0) { // L: 91
				var5 = 1 << 32 - var4; // L: 92
				var6 = var2[var4]; // L: 93
				var1[var3] = var6; // L: 94
				int var12;
				if ((var6 & var5) != 0) { // L: 96
					var7 = var2[var4 - 1]; // L: 97
				} else {
					var7 = var6 | var5; // L: 100

					for (var8 = var4 - 1; var8 >= 1; --var8) { // L: 101
						var12 = var2[var8]; // L: 102
						if (var12 != var6) { // L: 103
							break;
						}

						var10 = 1 << 32 - var8; // L: 104
						if ((var12 & var10) != 0) { // L: 105
							var2[var8] = var2[var8 - 1]; // L: 106
							break; // L: 107
						}

						var2[var8] = var12 | var10; // L: 110
					}
				}

				var2[var4] = var7; // L: 116

				for (var8 = var4 + 1; var8 <= 32; ++var8) { // L: 117
					var12 = var2[var8]; // L: 118
					if (var12 == var6) { // L: 119
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8]; // L: 123
		int var11 = 0; // L: 124

		for (var3 = 0; var3 < this.entries; ++var3) { // L: 125
			var4 = this.lengthMap[var3]; // L: 126
			if (var4 != 0) { // L: 127
				var5 = var1[var3]; // L: 128
				var6 = 0; // L: 129

				for (var7 = 0; var7 < var4; ++var7) { // L: 130
					var8 = Integer.MIN_VALUE >>> var7; // L: 131
					if ((var5 & var8) != 0) { // L: 132
						if (this.keys[var6] == 0) { // L: 133
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6]; // L: 134
					} else {
						++var6; // L: 137
					}

					if (var6 >= this.keys.length) { // L: 139
						int[] var9 = new int[this.keys.length * 2]; // L: 140

						for (var10 = 0; var10 < this.keys.length; ++var10) { // L: 141
							var9[var10] = this.keys[var10];
						}

						this.keys = var9; // L: 142
					}

					var8 >>>= 1; // L: 144
				}

				this.keys[var6] = ~var3; // L: 146
				if (var6 >= var11) { // L: 147
					var11 = var6 + 1;
				}
			}
		}

	} // L: 149

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lce;)I"
	)
	int method1071(class60 var1) {
		int var2;
		for (var2 = 0; this.keys[var2] >= 0; var2 = var1.method1162() != 0 ? this.keys[var2] : var2 + 1) { // L: 152 153
		}

		return ~this.keys[var2]; // L: 154
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lce;)[F"
	)
	float[] method1069(class60 var1) {
		return this.field382[this.method1071(var1)]; // L: 158
	}

	@ObfuscatedName("au")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; NPC.method2636(var2, var1) > var0; --var2) { // L: 16 17
		}

		return var2; // L: 18
	}
}
