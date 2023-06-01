import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class404 {
	@ObfuscatedName("ad")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "63"
	)
	static int method7612(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class494 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5082
			if (var0 != 7501) { // L: 5104
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5113
					class336.Interpreter_intStackSize -= 3; // L: 5114
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 5115
					var19 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 5116
					var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 5117
					var20 = ScriptFrame.method1163(var19); // L: 5118
					var7 = HitSplatDefinition.method3844(var19); // L: 5119
					int var21 = AbstractArchive.method6810(var19); // L: 5120
					class495 var26 = UserComparator3.method2866(var3); // L: 5121
					class493 var27 = class269.method5496(var20); // L: 5122
					int[] var28 = var27.field4984[var7]; // L: 5123
					int var12 = 0; // L: 5124
					int var13 = var28.length; // L: 5125
					if (var21 >= 0) { // L: 5126
						if (var21 >= var13) { // L: 5127
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5128
						}

						var12 = var21; // L: 5130
						var13 = var21 + 1; // L: 5131
					}

					Object[] var14 = var26.method8877(var7); // L: 5133
					if (var14 == null && var27.field4986 != null) { // L: 5134 5135
						var14 = var27.field4986[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5137
						for (var15 = var12; var15 < var13; ++var15) { // L: 5138
							var16 = var28[var15]; // L: 5139
							class490 var22 = Coord.method6069(var16); // L: 5140
							if (var22 == class490.field4975) { // L: 5141
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Fonts.method8638(var16); // L: 5142
							}
						}

						return 1; // L: 5144
					} else {
						var15 = var14.length / var28.length; // L: 5146
						if (var5 >= 0 && var5 < var15) { // L: 5147
							for (var16 = var12; var16 < var13; ++var16) { // L: 5150
								int var17 = var16 + var28.length * var5; // L: 5151
								class490 var18 = Coord.method6069(var28[var16]); // L: 5152
								if (var18 == class490.field4975) { // L: 5153
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5154
								}
							}

							return 1; // L: 5156
						} else {
							throw new RuntimeException(); // L: 5148
						}
					}
				} else if (var0 == 7503) { // L: 5158
					class336.Interpreter_intStackSize -= 2; // L: 5159
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 5160
					var19 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 5161
					var5 = 0; // L: 5162
					var20 = ScriptFrame.method1163(var19); // L: 5163
					var7 = HitSplatDefinition.method3844(var19); // L: 5164
					class495 var25 = UserComparator3.method2866(var3); // L: 5165
					class493 var9 = class269.method5496(var20); // L: 5166
					int[] var10 = var9.field4984[var7]; // L: 5167
					Object[] var11 = var25.method8877(var7); // L: 5168
					if (var11 == null && var9.field4986 != null) { // L: 5169 5170
						var11 = var9.field4986[var7]; // L: 5171
					}

					if (var11 != null) { // L: 5174
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5; // L: 5175
					return 1; // L: 5176
				} else if (var0 != 7504 && var0 != 7510) { // L: 5178
					if (var0 == 7505) { // L: 5195
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5196
						class495 var24 = UserComparator3.method2866(var3); // L: 5197
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var24.field4992; // L: 5198
						return 1; // L: 5199
					} else if (var0 == 7506) { // L: 5201
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5202
						var19 = -1; // L: 5203
						if (class306.field3402 != null && var3 >= 0 && var3 < class306.field3402.size()) { // L: 5204
							var19 = (Integer)class306.field3402.get(var3); // L: 5205
						}

						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var19; // L: 5207
						return 1; // L: 5208
					} else if (var0 != 7507 && var0 != 7509) { // L: 5210
						return 2; // L: 5237
					} else {
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5211
						var4 = class135.method3030(var3); // L: 5212
						var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5213
						var6 = FileSystem.method3486(var5); // L: 5214
						if (var6 == null) { // L: 5215
							throw new RuntimeException(); // L: 5216
						} else if (ScriptFrame.method1163(var5) != Client.field775) { // L: 5218
							throw new RuntimeException(); // L: 5219
						} else if (class306.field3402 == null && class306.field3402.isEmpty()) { // L: 5221
							throw new RuntimeException(); // L: 5222
						} else {
							var7 = AbstractArchive.method6810(var5); // L: 5224
							List var8 = var6.method8870(var4, var7); // L: 5225
							class306.field3402 = new LinkedList(class306.field3402); // L: 5226
							if (var8 != null) { // L: 5227
								class306.field3402.retainAll(var8); // L: 5228
							} else {
								class306.field3402.clear(); // L: 5231
							}

							PacketWriter.field1395 = class306.field3402.iterator(); // L: 5233
							if (var0 == 7507) { // L: 5234
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class306.field3402.size();
							}

							return 1; // L: 5235
						}
					}
				} else {
					--class336.Interpreter_intStackSize; // L: 5179
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 5180
					class494 var23 = class137.method3039(var3); // L: 5181
					if (var23 == null) { // L: 5182
						throw new RuntimeException(); // L: 5183
					} else {
						class306.field3402 = var23.method8870(0, 0); // L: 5185
						var5 = 0; // L: 5186
						if (class306.field3402 != null) { // L: 5187
							Client.field775 = var3; // L: 5188
							PacketWriter.field1395 = class306.field3402.iterator(); // L: 5189
							var5 = class306.field3402.size(); // L: 5190
						}

						if (var0 == 7504) { // L: 5192
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5193
					}
				}
			} else {
				if (PacketWriter.field1395 != null && PacketWriter.field1395.hasNext()) { // L: 5105
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (Integer)PacketWriter.field1395.next(); // L: 5106
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 5109
				}

				return 1; // L: 5111
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5083
			var4 = class135.method3030(var3); // L: 5084
			var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 5085
			var6 = FileSystem.method3486(var5); // L: 5086
			if (var6 == null) { // L: 5087
				throw new RuntimeException(); // L: 5088
			} else {
				var7 = AbstractArchive.method6810(var5); // L: 5090
				class306.field3402 = var6.method8870(var4, var7); // L: 5091
				if (class306.field3402 != null) { // L: 5092
					Client.field775 = ScriptFrame.method1163(var5); // L: 5093
					PacketWriter.field1395 = class306.field3402.iterator(); // L: 5094
					if (var0 == 7500) { // L: 5095
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class306.field3402.size();
					}
				} else {
					Client.field775 = -1; // L: 5098
					PacketWriter.field1395 = null; // L: 5099
					if (var0 == 7500) { // L: 5100
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5102
			}
		}
	}
}
