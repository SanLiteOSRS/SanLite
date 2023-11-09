import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("ai")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("aj")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("ac")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length; // L: 9
		this.masks = new int[var2]; // L: 10
		this.bits = var1; // L: 11
		int[] var3 = new int[33]; // L: 12
		this.keys = new int[8]; // L: 13
		int var4 = 0; // L: 14

		for (int var5 = 0; var5 < var2; ++var5) { // L: 15
			byte var6 = var1[var5]; // L: 16
			if (var6 != 0) { // L: 17
				int var7 = 1 << 32 - var6; // L: 18
				int var8 = var3[var6]; // L: 19
				this.masks[var5] = var8; // L: 20
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) { // L: 22
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7; // L: 24

					for (var10 = var6 - 1; var10 >= 1; --var10) { // L: 25
						var11 = var3[var10]; // L: 26
						if (var8 != var11) { // L: 27
							break;
						}

						var12 = 1 << 32 - var10; // L: 28
						if ((var11 & var12) != 0) { // L: 29
							var3[var10] = var3[var10 - 1]; // L: 30
							break;
						}

						var3[var10] = var11 | var12; // L: 33
					}
				}

				var3[var6] = var9; // L: 38

				for (var10 = var6 + 1; var10 <= 32; ++var10) { // L: 39
					if (var8 == var3[var10]) { // L: 40
						var3[var10] = var9;
					}
				}

				var10 = 0; // L: 42

				for (var11 = 0; var11 < var6; ++var11) { // L: 43
					var12 = Integer.MIN_VALUE >>> var11; // L: 44
					if ((var8 & var12) != 0) { // L: 45
						if (this.keys[var10] == 0) { // L: 46
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10]; // L: 47
					} else {
						++var10; // L: 49
					}

					if (var10 >= this.keys.length) { // L: 50
						int[] var13 = new int[this.keys.length * 2]; // L: 51

						for (int var14 = 0; var14 < this.keys.length; ++var14) { // L: 52
							var13[var14] = this.keys[var14];
						}

						this.keys = var13; // L: 53
					}

					var12 >>>= 1; // L: 55
				}

				this.keys[var10] = ~var5; // L: 57
				if (var10 >= var4) { // L: 58
					var4 = var10 + 1;
				}
			}
		}

	} // L: 60

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BII[BII)I",
		garbageValue = "-554976557"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0; // L: 63
		int var7 = var5 << 3; // L: 64

		for (var3 += var2; var2 < var3; ++var2) { // L: 65 66
			int var8 = var1[var2] & 255; // L: 67
			int var9 = this.masks[var8]; // L: 68
			byte var10 = this.bits[var8]; // L: 69
			if (var10 == 0) { // L: 70
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3; // L: 71
			int var12 = var7 & 7; // L: 72
			var6 &= -var12 >> 31; // L: 73
			int var13 = (var12 + var10 - 1 >> 3) + var11; // L: 74
			var12 += 24; // L: 76
			var4[var11] = (byte)(var6 |= var9 >>> var12); // L: 77
			if (var11 < var13) { // L: 78
				++var11; // L: 79
				var12 -= 8; // L: 80
				var4[var11] = (byte)(var6 = var9 >>> var12); // L: 81
				if (var11 < var13) { // L: 82
					++var11; // L: 83
					var12 -= 8; // L: 84
					var4[var11] = (byte)(var6 = var9 >>> var12); // L: 85
					if (var11 < var13) { // L: 86
						++var11; // L: 87
						var12 -= 8; // L: 88
						var4[var11] = (byte)(var6 = var9 >>> var12); // L: 89
						if (var11 < var13) { // L: 90
							++var11; // L: 91
							var12 -= 8; // L: 92
							var4[var11] = (byte)(var6 = var9 << -var12); // L: 93
						}
					}
				}
			}

			var7 += var10; // L: 95
		}

		return (var7 + 7 >> 3) - var5; // L: 97
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI[BIIB)I",
		garbageValue = "13"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) { // L: 101
			return 0;
		} else {
			int var6 = 0; // L: 102
			var5 += var4; // L: 103
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7]; // L: 106
				if (var8 < 0) { // L: 108
					var6 = this.keys[var6];
				} else {
					++var6; // L: 109
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) { // L: 110
					var3[var4++] = (byte)(~var9); // L: 111
					if (var4 >= var5) { // L: 112
						break;
					}

					var6 = 0; // L: 113
				}

				if ((var8 & 64) != 0) { // L: 115
					var6 = this.keys[var6];
				} else {
					++var6; // L: 116
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 117
					var3[var4++] = (byte)(~var9); // L: 118
					if (var4 >= var5) { // L: 119
						break;
					}

					var6 = 0; // L: 120
				}

				if ((var8 & 32) != 0) { // L: 122
					var6 = this.keys[var6];
				} else {
					++var6; // L: 123
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 124
					var3[var4++] = (byte)(~var9); // L: 125
					if (var4 >= var5) { // L: 126
						break;
					}

					var6 = 0; // L: 127
				}

				if ((var8 & 16) != 0) { // L: 129
					var6 = this.keys[var6];
				} else {
					++var6; // L: 130
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 131
					var3[var4++] = (byte)(~var9); // L: 132
					if (var4 >= var5) { // L: 133
						break;
					}

					var6 = 0; // L: 134
				}

				if ((var8 & 8) != 0) { // L: 136
					var6 = this.keys[var6];
				} else {
					++var6; // L: 137
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 138
					var3[var4++] = (byte)(~var9); // L: 139
					if (var4 >= var5) { // L: 140
						break;
					}

					var6 = 0; // L: 141
				}

				if ((var8 & 4) != 0) { // L: 143
					var6 = this.keys[var6];
				} else {
					++var6; // L: 144
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 145
					var3[var4++] = (byte)(~var9); // L: 146
					if (var4 >= var5) { // L: 147
						break;
					}

					var6 = 0; // L: 148
				}

				if ((var8 & 2) != 0) { // L: 150
					var6 = this.keys[var6];
				} else {
					++var6; // L: 151
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 152
					var3[var4++] = (byte)(~var9); // L: 153
					if (var4 >= var5) { // L: 154
						break;
					}

					var6 = 0; // L: 155
				}

				if ((var8 & 1) != 0) { // L: 157
					var6 = this.keys[var6];
				} else {
					++var6; // L: 158
				}

				if ((var9 = this.keys[var6]) < 0) { // L: 159
					var3[var4++] = (byte)(~var9); // L: 160
					if (var4 >= var5) { // L: 161
						break;
					}

					var6 = 0; // L: 162
				}

				++var7; // L: 105
			}

			return var7 + 1 - var2; // L: 165
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZS)I",
		garbageValue = "-21918"
	)
	static int method6593(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class506 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5121
			if (var0 != 7501) { // L: 5143
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5152
					Interpreter.Interpreter_intStackSize -= 3; // L: 5153
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5154
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5155
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5156
					var20 = UserComparator8.method2937(var19); // L: 5157
					var7 = ArchiveLoader.method2283(var19); // L: 5158
					int var21 = class301.method5776(var19); // L: 5159
					class507 var26 = class345.method6654(var3); // L: 5160
					class505 var27 = class129.method3056(var20); // L: 5161
					int[] var28 = var27.field5043[var7]; // L: 5162
					int var12 = 0; // L: 5163
					int var13 = var28.length; // L: 5164
					if (var21 >= 0) { // L: 5165
						if (var21 >= var13) { // L: 5166
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5167
						}

						var12 = var21; // L: 5169
						var13 = var21 + 1; // L: 5170
					}

					Object[] var14 = var26.method8969(var7); // L: 5172
					if (var14 == null && var27.field5041 != null) { // L: 5173 5174
						var14 = var27.field5041[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5176
						for (var15 = var12; var15 < var13; ++var15) { // L: 5177
							var16 = var28[var15]; // L: 5178
							class502 var22 = class11.method129(var16); // L: 5179
							if (var22 == class502.field5034) { // L: 5180
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SequenceDefinition.method4222(var16); // L: 5181
							}
						}

						return 1; // L: 5183
					} else {
						var15 = var14.length / var28.length; // L: 5185
						if (var5 >= 0 && var5 < var15) { // L: 5186
							for (var16 = var12; var16 < var13; ++var16) { // L: 5189
								int var17 = var16 + var28.length * var5; // L: 5190
								class502 var18 = class11.method129(var28[var16]); // L: 5191
								if (var18 == class502.field5034) { // L: 5192
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5193
								}
							}

							return 1; // L: 5195
						} else {
							throw new RuntimeException(); // L: 5187
						}
					}
				} else if (var0 == 7503) { // L: 5197
					Interpreter.Interpreter_intStackSize -= 2; // L: 5198
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5199
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5200
					var5 = 0; // L: 5201
					var20 = UserComparator8.method2937(var19); // L: 5202
					var7 = ArchiveLoader.method2283(var19); // L: 5203
					class507 var25 = class345.method6654(var3); // L: 5204
					class505 var9 = class129.method3056(var20); // L: 5205
					int[] var10 = var9.field5043[var7]; // L: 5206
					Object[] var11 = var25.method8969(var7); // L: 5207
					if (var11 == null && var9.field5041 != null) { // L: 5208 5209
						var11 = var9.field5041[var7]; // L: 5210
					}

					if (var11 != null) { // L: 5213
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5214
					return 1; // L: 5215
				} else if (var0 != 7504 && var0 != 7510) { // L: 5217
					if (var0 == 7505) { // L: 5234
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5235
						class507 var24 = class345.method6654(var3); // L: 5236
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field5049; // L: 5237
						return 1; // L: 5238
					} else if (var0 == 7506) { // L: 5240
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5241
						var19 = -1; // L: 5242
						if (Canvas.field110 != null && var3 >= 0 && var3 < Canvas.field110.size()) { // L: 5243
							var19 = (Integer)Canvas.field110.get(var3); // L: 5244
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5246
						return 1; // L: 5247
					} else if (var0 != 7507 && var0 != 7509) { // L: 5249
						return 2; // L: 5276
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5250
						var4 = Client.method1810(var3); // L: 5251
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5252
						var6 = class448.method8169(var5); // L: 5253
						if (var6 == null) { // L: 5254
							throw new RuntimeException(); // L: 5255
						} else if (UserComparator8.method2937(var5) != Client.field791) { // L: 5257
							throw new RuntimeException(); // L: 5258
						} else if (Canvas.field110 == null && Canvas.field110.isEmpty()) { // L: 5260
							throw new RuntimeException(); // L: 5261
						} else {
							var7 = class301.method5776(var5); // L: 5263
							List var8 = var6.method8948(var4, var7); // L: 5264
							Canvas.field110 = new LinkedList(Canvas.field110); // L: 5265
							if (var8 != null) { // L: 5266
								Canvas.field110.retainAll(var8); // L: 5267
							} else {
								Canvas.field110.clear(); // L: 5270
							}

							Tiles.field1015 = Canvas.field110.iterator(); // L: 5272
							if (var0 == 7507) { // L: 5273
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.field110.size();
							}

							return 1; // L: 5274
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5218
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5219
					class506 var23 = SecureRandomCallable.method2274(var3); // L: 5220
					if (var23 == null) { // L: 5221
						throw new RuntimeException(); // L: 5222
					} else {
						Canvas.field110 = var23.method8948(0, 0); // L: 5224
						var5 = 0; // L: 5225
						if (Canvas.field110 != null) { // L: 5226
							Client.field791 = var3; // L: 5227
							Tiles.field1015 = Canvas.field110.iterator(); // L: 5228
							var5 = Canvas.field110.size(); // L: 5229
						}

						if (var0 == 7504) { // L: 5231
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5232
					}
				}
			} else {
				if (Tiles.field1015 != null && Tiles.field1015.hasNext()) { // L: 5144
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)Tiles.field1015.next(); // L: 5145
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5148
				}

				return 1; // L: 5150
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5122
			var4 = Client.method1810(var3); // L: 5123
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5124
			var6 = class448.method8169(var5); // L: 5125
			if (var6 == null) { // L: 5126
				throw new RuntimeException(); // L: 5127
			} else {
				var7 = class301.method5776(var5); // L: 5129
				Canvas.field110 = var6.method8948(var4, var7); // L: 5130
				if (Canvas.field110 != null) { // L: 5131
					Client.field791 = UserComparator8.method2937(var5); // L: 5132
					Tiles.field1015 = Canvas.field110.iterator(); // L: 5133
					if (var0 == 7500) { // L: 5134
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.field110.size();
					}
				} else {
					Client.field791 = -1; // L: 5137
					Tiles.field1015 = null; // L: 5138
					if (var0 == 7500) { // L: 5139
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5141
			}
		}
	}
}
