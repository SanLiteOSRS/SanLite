import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class144 extends class139 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1518641849
	)
	static int field1677;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -365969735
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 327631731
	)
	int field1671;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2041660067
	)
	int field1672;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1801165299
	)
	int field1673;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 116080323
	)
	int field1676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class144(class142 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1671 = var1.readInt(); // L: 292
		this.field1676 = var1.readInt(); // L: 293
		this.field1672 = var1.readUnsignedByte(); // L: 294
		this.field1673 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.method3316(this.field1671, this.field1676, this.field1672, this.field1673); // L: 299
	} // L: 300

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILia;Lif;Z[I[II)I",
		garbageValue = "1716451155"
	)
	public static int method3246(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) { // L: 19
			for (var9 = 0; var9 < 128; ++var9) { // L: 20
				class211.directions[var8][var9] = 0; // L: 21
				class211.distances[var8][var9] = 99999999; // L: 22
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) { // L: 26
			var28 = class88.method2359(var0, var1, var3, var4);
		} else if (var2 == 2) { // L: 27
			var10 = var0; // L: 30
			var11 = var1; // L: 31
			byte var12 = 64; // L: 32
			var13 = 64; // L: 33
			var14 = var0 - var12; // L: 34
			var15 = var1 - var13; // L: 35
			class211.directions[var12][var13] = 99; // L: 36
			class211.distances[var12][var13] = 0; // L: 37
			byte var16 = 0; // L: 38
			var17 = 0; // L: 39
			class211.bufferX[var16] = var0; // L: 40
			var33 = var16 + 1;
			class211.bufferY[var16] = var1; // L: 41
			int[][] var18 = var4.flags; // L: 42

			boolean var29;
			while (true) {
				if (var17 == var33) { // L: 43
					class18.field94 = var10; // L: 143
					class397.field4534 = var11; // L: 144
					var29 = false; // L: 145
					break;
				}

				var10 = class211.bufferX[var17]; // L: 44
				var11 = class211.bufferY[var17]; // L: 45
				var17 = var17 + 1 & 4095; // L: 46
				var30 = var10 - var14; // L: 47
				var31 = var11 - var15; // L: 48
				var19 = var10 - var4.xInset; // L: 49
				var20 = var11 - var4.yInset; // L: 50
				if (var3.hasArrived(2, var10, var11, var4)) { // L: 51
					class18.field94 = var10; // L: 52
					class397.field4534 = var11; // L: 53
					var29 = true; // L: 54
					break;
				}

				var21 = class211.distances[var30][var31] + 1; // L: 57
				if (var30 > 0 && class211.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + 1] & 19136824) == 0) { // L: 58 59 60 61
					class211.bufferX[var33] = var10 - 1;
					class211.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095;
					class211.directions[var30 - 1][var31] = 2;
					class211.distances[var30 - 1][var31] = var21;
				}

				if (var30 < 126 && class211.directions[var30 + 1][var31] == 0 && (var18[var19 + 2][var20] & 19136899) == 0 && (var18[var19 + 2][var20 + 1] & 19136992) == 0) {
					class211.bufferX[var33] = var10 + 1; // L: 72
					class211.bufferY[var33] = var11;
					var33 = var33 + 1 & 4095; // L: 74
					class211.directions[var30 + 1][var31] = 8;
					class211.distances[var30 + 1][var31] = var21; // L: 76
				}

				if (var31 > 0 && class211.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + 1][var20 - 1] & 19136899) == 0) { // L: 78
					class211.bufferX[var33] = var10;
					class211.bufferY[var33] = var11 - 1;
					var33 = var33 + 1 & 4095;
					class211.directions[var30][var31 - 1] = 1;
					class211.distances[var30][var31 - 1] = var21;
				}

				if (var31 < 126 && class211.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + 2] & 19136824) == 0 && (var18[var19 + 1][var20 + 2] & 19136992) == 0) { // L: 89
					class211.bufferX[var33] = var10; // L: 92
					class211.bufferY[var33] = var11 + 1; // L: 93
					var33 = var33 + 1 & 4095; // L: 94
					class211.directions[var30][var31 + 1] = 4; // L: 95
					class211.distances[var30][var31 + 1] = var21; // L: 96
				}

				if (var30 > 0 && var31 > 0 && class211.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20] & 19136830) == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0 && (var18[var19][var20 - 1] & 19136911) == 0) { // L: 98 99 100
					class211.bufferX[var33] = var10 - 1;
					class211.bufferY[var33] = var11 - 1; // L: 104
					var33 = var33 + 1 & 4095;
					class211.directions[var30 - 1][var31 - 1] = 3; // L: 106
					class211.distances[var30 - 1][var31 - 1] = var21;
				}

				if (var30 < 126 && var31 > 0 && class211.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + 1][var20 - 1] & 19136911) == 0 && (var18[var19 + 2][var20 - 1] & 19136899) == 0 && (var18[var19 + 2][var20] & 19136995) == 0) { // L: 109 111 112 113
					class211.bufferX[var33] = var10 + 1; // L: 114
					class211.bufferY[var33] = var11 - 1; // L: 115
					var33 = var33 + 1 & 4095; // L: 116
					class211.directions[var30 + 1][var31 - 1] = 9; // L: 117
					class211.distances[var30 + 1][var31 - 1] = var21; // L: 118
				}

				if (var30 > 0 && var31 < 126 && class211.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + 1] & 19136830) == 0 && (var18[var19 - 1][var20 + 2] & 19136824) == 0 && (var18[var19][var20 + 2] & 19137016) == 0) { // L: 120 121 122 123 124
					class211.bufferX[var33] = var10 - 1; // L: 125
					class211.bufferY[var33] = var11 + 1; // L: 126
					var33 = var33 + 1 & 4095; // L: 127
					class211.directions[var30 - 1][var31 + 1] = 6; // L: 128
					class211.distances[var30 - 1][var31 + 1] = var21; // L: 129
				}

				if (var30 < 126 && var31 < 126 && class211.directions[var30 + 1][var31 + 1] == 0 && (var18[var19 + 1][var20 + 2] & 19137016) == 0 && (var18[var19 + 2][var20 + 2] & 19136992) == 0 && (var18[var19 + 2][var20 + 1] & 19136995) == 0) { // L: 131 132 133 134 135
					class211.bufferX[var33] = var10 + 1; // L: 136
					class211.bufferY[var33] = var11 + 1; // L: 137
					var33 = var33 + 1 & 4095; // L: 138
					class211.directions[var30 + 1][var31 + 1] = 12; // L: 139
					class211.distances[var30 + 1][var31 + 1] = var21; // L: 140
				}
			}

			var28 = var29; // L: 147
		} else {
			var28 = KitDefinition.method3698(var0, var1, var2, var3, var4); // L: 149
		}

		var9 = var0 - 64; // L: 150
		var10 = var1 - 64; // L: 151
		var11 = class18.field94; // L: 152
		var30 = class397.field4534; // L: 153
		if (!var28) { // L: 154
			var31 = Integer.MAX_VALUE; // L: 156
			var14 = Integer.MAX_VALUE; // L: 157
			byte var32 = 10; // L: 158
			var33 = var3.approxDestinationX; // L: 159
			var17 = var3.approxDestinationY; // L: 160
			int var27 = var3.approxDestinationSizeX; // L: 161
			var19 = var3.approxDestinationSizeY; // L: 162

			for (var20 = var33 - var32; var20 <= var33 + var32; ++var20) { // L: 163
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) { // L: 164
					int var22 = var20 - var9; // L: 165
					int var23 = var21 - var10; // L: 166
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class211.distances[var22][var23] < 100) { // L: 167 168
						int var24 = 0; // L: 169
						if (var20 < var33) { // L: 170
							var24 = var33 - var20;
						} else if (var20 > var27 + var33 - 1) { // L: 171
							var24 = var20 - (var27 + var33 - 1);
						}

						int var25 = 0; // L: 172
						if (var21 < var17) { // L: 173
							var25 = var17 - var21;
						} else if (var21 > var19 + var17 - 1) { // L: 174
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var25 * var25 + var24 * var24; // L: 175
						if (var26 < var31 || var31 == var26 && class211.distances[var22][var23] < var14) {
							var31 = var26;
							var14 = class211.distances[var22][var23]; // L: 178
							var11 = var20; // L: 179
							var30 = var21; // L: 180
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) { // L: 186
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) { // L: 190
			var6[0] = var11; // L: 191
			var7[0] = var30; // L: 192
			return 0; // L: 193
		} else {
			var13 = 0; // L: 195
			class211.bufferX[var13] = var11; // L: 198
			var31 = var13 + 1;
			class211.bufferY[var13] = var30; // L: 199

			for (var14 = var15 = class211.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class211.directions[var11 - var9][var30 - var10]) { // L: 200 201 211
				if (var14 != var15) { // L: 202
					var15 = var14; // L: 203
					class211.bufferX[var31] = var11; // L: 204
					class211.bufferY[var31++] = var30; // L: 205
				}

				if ((var14 & 2) != 0) { // L: 207
					++var11;
				} else if ((var14 & 8) != 0) { // L: 208
					--var11;
				}

				if ((var14 & 1) != 0) { // L: 209
					++var30;
				} else if ((var14 & 4) != 0) { // L: 210
					--var30;
				}
			}

			var33 = 0; // L: 213

			while (var31-- > 0) { // L: 214
				var6[var33] = class211.bufferX[var31]; // L: 215
				var7[var33++] = class211.bufferY[var31]; // L: 216
				if (var33 >= var6.length) { // L: 217
					break;
				}
			}

			return var33; // L: 219
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhq;",
		garbageValue = "2415"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-253703196"
	)
	static String method3257(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class370.field4377[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class370.field4377[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class370.field4377[(var6 & 15) << 2 | var7 >>> 6]).append(class370.field4377[var7 & 63]); // L: 71
				} else {
					var3.append(class370.field4377[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class370.field4377[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1444508047"
	)
	public static void method3252() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 101
			if (ArchiveDiskActionHandler.field4196 != 0) { // L: 102
				ArchiveDiskActionHandler.field4196 = 1; // L: 103

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait(); // L: 105
				} catch (InterruptedException var3) { // L: 107
				}
			}

		}
	} // L: 110

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIFFFII)V",
		garbageValue = "-515253774"
	)
	public static void method3256(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		Rasterizer3D.field2519.vmethod4961(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 176
	} // L: 177

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "38"
	)
	static int method3251(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class482 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5073
			if (var0 != 7501) { // L: 5095
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5104
					Interpreter.Interpreter_intStackSize -= 3; // L: 5105
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5106
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5107
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5108
					var20 = class373.method7203(var19); // L: 5109
					var7 = BufferedSink.method8064(var19); // L: 5110
					int var21 = class146.method3272(var19); // L: 5111
					class483 var26 = class125.method3093(var3); // L: 5112
					class481 var27 = GameBuild.method6587(var20); // L: 5113
					int[] var28 = var27.field4959[var7]; // L: 5114
					int var12 = 0; // L: 5115
					int var13 = var28.length; // L: 5116
					if (var21 >= 0) { // L: 5117
						if (var21 >= var13) { // L: 5118
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5119
						}

						var12 = var21; // L: 5121
						var13 = var21 + 1; // L: 5122
					}

					Object[] var14 = var26.method8969(var7); // L: 5124
					if (var14 == null && var27.field4960 != null) { // L: 5125 5126
						var14 = var27.field4960[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5128
						for (var15 = var12; var15 < var13; ++var15) { // L: 5129
							var16 = var28[var15]; // L: 5130
							class478 var22 = class103.method2717(var16); // L: 5131
							if (var22 == class478.field4946) { // L: 5132
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.method6884(var16); // L: 5133
							}
						}

						return 1; // L: 5135
					} else {
						var15 = var14.length / var28.length; // L: 5137
						if (var5 >= 0 && var5 < var15) { // L: 5138
							for (var16 = var12; var16 < var13; ++var16) { // L: 5141
								int var17 = var16 + var28.length * var5; // L: 5142
								class478 var18 = class103.method2717(var28[var16]); // L: 5143
								if (var18 == class478.field4946) { // L: 5144
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5145
								}
							}

							return 1; // L: 5147
						} else {
							throw new RuntimeException(); // L: 5139
						}
					}
				} else if (var0 == 7503) { // L: 5149
					Interpreter.Interpreter_intStackSize -= 2; // L: 5150
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5151
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5152
					var5 = 0; // L: 5153
					var20 = class373.method7203(var19); // L: 5154
					var7 = BufferedSink.method8064(var19); // L: 5155
					class483 var25 = class125.method3093(var3); // L: 5156
					class481 var9 = GameBuild.method6587(var20); // L: 5157
					int[] var10 = var9.field4959[var7]; // L: 5158
					Object[] var11 = var25.method8969(var7); // L: 5159
					if (var11 == null && var9.field4960 != null) { // L: 5160 5161
						var11 = var9.field4960[var7]; // L: 5162
					}

					if (var11 != null) { // L: 5165
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5166
					return 1; // L: 5167
				} else if (var0 != 7504 && var0 != 7510) { // L: 5169
					if (var0 == 7505) { // L: 5186
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5187
						class483 var24 = class125.method3093(var3); // L: 5188
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field4970; // L: 5189
						return 1; // L: 5190
					} else if (var0 == 7506) { // L: 5192
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5193
						var19 = -1; // L: 5194
						if (class9.field35 != null && var3 >= 0 && var3 < class9.field35.size()) { // L: 5195
							var19 = (Integer)class9.field35.get(var3); // L: 5196
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5198
						return 1; // L: 5199
					} else if (var0 != 7507 && var0 != 7509) { // L: 5201
						return 2; // L: 5228
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5202
						var4 = ScriptEvent.method2253(var3); // L: 5203
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5204
						var6 = class206.method4205(var5); // L: 5205
						if (var6 == null) { // L: 5206
							throw new RuntimeException(); // L: 5207
						} else if (class373.method7203(var5) != Client.field746) { // L: 5209
							throw new RuntimeException(); // L: 5210
						} else if (class9.field35 == null && class9.field35.isEmpty()) { // L: 5212
							throw new RuntimeException(); // L: 5213
						} else {
							var7 = class146.method3272(var5); // L: 5215
							List var8 = var6.method8949(var4, var7); // L: 5216
							class9.field35 = new LinkedList(class9.field35); // L: 5217
							if (var8 != null) { // L: 5218
								class9.field35.retainAll(var8); // L: 5219
							} else {
								class9.field35.clear(); // L: 5222
							}

							class1.field6 = class9.field35.iterator(); // L: 5224
							if (var0 == 7507) { // L: 5225
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class9.field35.size();
							}

							return 1; // L: 5226
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5170
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5171
					class482 var23 = class10.method99(var3); // L: 5172
					if (var23 == null) { // L: 5173
						throw new RuntimeException(); // L: 5174
					} else {
						class9.field35 = var23.method8949(0, 0); // L: 5176
						var5 = 0; // L: 5177
						if (class9.field35 != null) { // L: 5178
							Client.field746 = var3; // L: 5179
							class1.field6 = class9.field35.iterator(); // L: 5180
							var5 = class9.field35.size(); // L: 5181
						}

						if (var0 == 7504) { // L: 5183
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5184
					}
				}
			} else {
				if (class1.field6 != null && class1.field6.hasNext()) { // L: 5096
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class1.field6.next(); // L: 5097
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5100
				}

				return 1; // L: 5102
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5074
			var4 = ScriptEvent.method2253(var3); // L: 5075
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5076
			var6 = class206.method4205(var5); // L: 5077
			if (var6 == null) { // L: 5078
				throw new RuntimeException(); // L: 5079
			} else {
				var7 = class146.method3272(var5); // L: 5081
				class9.field35 = var6.method8949(var4, var7); // L: 5082
				if (class9.field35 != null) { // L: 5083
					Client.field746 = class373.method7203(var5); // L: 5084
					class1.field6 = class9.field35.iterator(); // L: 5085
					if (var0 == 7500) { // L: 5086
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class9.field35.size();
					}
				} else {
					Client.field746 = -1; // L: 5089
					class1.field6 = null; // L: 5090
					if (var0 == 7500) { // L: 5091
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5093
			}
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I)V",
		garbageValue = "-1541166442"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field659) { // L: 11538
			Client.field705[var0.rootIndex] = true; // L: 11539
		}

	} // L: 11541
}
