import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class101 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("World_request")
	static UrlRequest World_request;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "38"
	)
	static final int method2725(int var0, int var1) {
		int var2 = Huffman.method6900(var0 - 1, var1 - 1) + Huffman.method6900(1 + var0, var1 - 1) + Huffman.method6900(var0 - 1, var1 + 1) + Huffman.method6900(1 + var0, var1 + 1); // L: 1007
		int var3 = Huffman.method6900(var0 - 1, var1) + Huffman.method6900(1 + var0, var1) + Huffman.method6900(var0, var1 - 1) + Huffman.method6900(var0, var1 + 1); // L: 1008
		int var4 = Huffman.method6900(var0, var1); // L: 1009
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 1010
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "133972153"
	)
	static int method2719(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class522 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5170
			if (var0 != 7501) { // L: 5192
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5201
					UserComparator6.Interpreter_intStackSize -= 3; // L: 5202
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 5203
					var19 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 5204
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 5205
					var20 = RouteStrategy.method4509(var19); // L: 5206
					var7 = JagexCache.method4249(var19); // L: 5207
					int var21 = FriendsChatManager.method8218(var19); // L: 5208
					class523 var26 = class464.method8510(var3); // L: 5209
					class521 var27 = class435.method8115(var20); // L: 5210
					int[] var28 = var27.field5115[var7]; // L: 5211
					int var12 = 0; // L: 5212
					int var13 = var28.length; // L: 5213
					if (var21 >= 0) { // L: 5214
						if (var21 >= var13) { // L: 5215
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5216
						}

						var12 = var21; // L: 5218
						var13 = var21 + 1; // L: 5219
					}

					Object[] var14 = var26.method9284(var7); // L: 5221
					if (var14 == null && var27.field5117 != null) { // L: 5222 5223
						var14 = var27.field5117[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5225
						for (var15 = var12; var15 < var13; ++var15) { // L: 5226
							var16 = var28[var15]; // L: 5227
							class518 var22 = class270.method5345(var16); // L: 5228
							if (var22 == class518.field5103) { // L: 5229
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class509.method9132(var16); // L: 5230
							}
						}

						return 1; // L: 5232
					} else {
						var15 = var14.length / var28.length; // L: 5234
						if (var5 >= 0 && var5 < var15) { // L: 5235
							for (var16 = var12; var16 < var13; ++var16) { // L: 5238
								int var17 = var16 + var28.length * var5; // L: 5239
								class518 var18 = class270.method5345(var28[var16]); // L: 5240
								if (var18 == class518.field5103) { // L: 5241
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5242
								}
							}

							return 1; // L: 5244
						} else {
							throw new RuntimeException(); // L: 5236
						}
					}
				} else if (var0 == 7503) { // L: 5246
					UserComparator6.Interpreter_intStackSize -= 2; // L: 5247
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 5248
					var19 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 5249
					var5 = 0; // L: 5250
					var20 = RouteStrategy.method4509(var19); // L: 5251
					var7 = JagexCache.method4249(var19); // L: 5252
					class523 var25 = class464.method8510(var3); // L: 5253
					class521 var9 = class435.method8115(var20); // L: 5254
					int[] var10 = var9.field5115[var7]; // L: 5255
					Object[] var11 = var25.method9284(var7); // L: 5256
					if (var11 == null && var9.field5117 != null) { // L: 5257 5258
						var11 = var9.field5117[var7]; // L: 5259
					}

					if (var11 != null) { // L: 5262
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5; // L: 5263
					return 1; // L: 5264
				} else if (var0 != 7504 && var0 != 7510) { // L: 5266
					if (var0 == 7505) { // L: 5283
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5284
						class523 var24 = class464.method8510(var3); // L: 5285
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var24.field5127; // L: 5286
						return 1; // L: 5287
					} else if (var0 == 7506) { // L: 5289
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5290
						var19 = -1; // L: 5291
						if (UserComparator4.field1444 != null && var3 >= 0 && var3 < UserComparator4.field1444.size()) { // L: 5292
							var19 = (Integer)UserComparator4.field1444.get(var3); // L: 5293
						}

						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var19; // L: 5295
						return 1; // L: 5296
					} else if (var0 != 7507 && var0 != 7509) { // L: 5298
						return 2; // L: 5325
					} else {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5299
						var4 = class17.method268(var3); // L: 5300
						var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5301
						var6 = class161.method3476(var5); // L: 5302
						if (var6 == null) { // L: 5303
							throw new RuntimeException(); // L: 5304
						} else if (RouteStrategy.method4509(var5) != Client.field730) { // L: 5306
							throw new RuntimeException(); // L: 5307
						} else if (UserComparator4.field1444 == null && UserComparator4.field1444.isEmpty()) { // L: 5309
							throw new RuntimeException(); // L: 5310
						} else {
							var7 = FriendsChatManager.method8218(var5); // L: 5312
							List var8 = var6.method9281(var4, var7); // L: 5313
							UserComparator4.field1444 = new LinkedList(UserComparator4.field1444); // L: 5314
							if (var8 != null) { // L: 5315
								UserComparator4.field1444.retainAll(var8); // L: 5316
							} else {
								UserComparator4.field1444.clear(); // L: 5319
							}

							KeyHandler.field144 = UserComparator4.field1444.iterator(); // L: 5321
							if (var0 == 7507) { // L: 5322
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = UserComparator4.field1444.size();
							}

							return 1; // L: 5323
						}
					}
				} else {
					--UserComparator6.Interpreter_intStackSize; // L: 5267
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 5268
					class522 var23 = JagexCache.method4248(var3); // L: 5269
					if (var23 == null) { // L: 5270
						throw new RuntimeException(); // L: 5271
					} else {
						UserComparator4.field1444 = var23.method9281(0, 0); // L: 5273
						var5 = 0; // L: 5274
						if (UserComparator4.field1444 != null) { // L: 5275
							Client.field730 = var3; // L: 5276
							KeyHandler.field144 = UserComparator4.field1444.iterator(); // L: 5277
							var5 = UserComparator4.field1444.size(); // L: 5278
						}

						if (var0 == 7504) { // L: 5280
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5281
					}
				}
			} else {
				if (KeyHandler.field144 != null && KeyHandler.field144.hasNext()) { // L: 5193
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (Integer)KeyHandler.field144.next(); // L: 5194
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5197
				}

				return 1; // L: 5199
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5171
			var4 = class17.method268(var3); // L: 5172
			var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5173
			var6 = class161.method3476(var5); // L: 5174
			if (var6 == null) { // L: 5175
				throw new RuntimeException(); // L: 5176
			} else {
				var7 = FriendsChatManager.method8218(var5); // L: 5178
				UserComparator4.field1444 = var6.method9281(var4, var7); // L: 5179
				if (UserComparator4.field1444 != null) { // L: 5180
					Client.field730 = RouteStrategy.method4509(var5); // L: 5181
					KeyHandler.field144 = UserComparator4.field1444.iterator(); // L: 5182
					if (var0 == 7500) { // L: 5183
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = UserComparator4.field1444.size();
					}
				} else {
					Client.field730 = -1; // L: 5186
					KeyHandler.field144 = null; // L: 5187
					if (var0 == 7500) { // L: 5188
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5190
			}
		}
	}
}
