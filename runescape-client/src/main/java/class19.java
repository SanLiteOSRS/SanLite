import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class19 implements Callable {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 139624089
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	static ClanSettings field84;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1232628059
	)
	static int field85;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class10 field83;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Las;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field83 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field83.method89()) { // L: 53
				class499.method8677(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field83.method90(); // L: 60
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "5336"
	)
	static int method270(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class526 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5181
			if (var0 != 7501) { // L: 5203
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5212
					Interpreter_intStackSize -= 3; // L: 5213
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5214
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 5215
					var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 5216
					var20 = StructComposition.method4042(var19); // L: 5217
					var7 = class163.method3378(var19); // L: 5218
					int var21 = class311.method5914(var19); // L: 5219
					class527 var26 = GrandExchangeOfferNameComparator.method7101(var3); // L: 5220
					class525 var27 = TriBool.method8249(var20); // L: 5221
					int[] var28 = var27.field5165[var7]; // L: 5222
					int var12 = 0; // L: 5223
					int var13 = var28.length; // L: 5224
					if (var21 >= 0) { // L: 5225
						if (var21 >= var13) { // L: 5226
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5227
						}

						var12 = var21; // L: 5229
						var13 = var21 + 1; // L: 5230
					}

					Object[] var14 = var26.method9167(var7); // L: 5232
					if (var14 == null && var27.field5166 != null) { // L: 5233 5234
						var14 = var27.field5166[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5236
						for (var15 = var12; var15 < var13; ++var15) { // L: 5237
							var16 = var28[var15]; // L: 5238
							class522 var22 = class211.method3931(var16); // L: 5239
							if (var22 == class522.field5155) { // L: 5240
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class214.method3983(var16); // L: 5241
							}
						}

						return 1; // L: 5243
					} else {
						var15 = var14.length / var28.length; // L: 5245
						if (var5 >= 0 && var5 < var15) { // L: 5246
							for (var16 = var12; var16 < var13; ++var16) { // L: 5249
								int var17 = var16 + var28.length * var5; // L: 5250
								class522 var18 = class211.method3931(var28[var16]); // L: 5251
								if (var18 == class522.field5155) { // L: 5252
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5253
								}
							}

							return 1; // L: 5255
						} else {
							throw new RuntimeException(); // L: 5247
						}
					}
				} else if (var0 == 7503) { // L: 5257
					Interpreter_intStackSize -= 2; // L: 5258
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5259
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 5260
					var5 = 0; // L: 5261
					var20 = StructComposition.method4042(var19); // L: 5262
					var7 = class163.method3378(var19); // L: 5263
					class527 var25 = GrandExchangeOfferNameComparator.method7101(var3); // L: 5264
					class525 var9 = TriBool.method8249(var20); // L: 5265
					int[] var10 = var9.field5165[var7]; // L: 5266
					Object[] var11 = var25.method9167(var7); // L: 5267
					if (var11 == null && var9.field5166 != null) { // L: 5268 5269
						var11 = var9.field5166[var7]; // L: 5270
					}

					if (var11 != null) { // L: 5273
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5; // L: 5274
					return 1; // L: 5275
				} else if (var0 != 7504 && var0 != 7510) { // L: 5277
					if (var0 == 7505) { // L: 5294
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5295
						class527 var24 = GrandExchangeOfferNameComparator.method7101(var3); // L: 5296
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var24.field5177; // L: 5297
						return 1; // L: 5298
					} else if (var0 == 7506) { // L: 5300
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5301
						var19 = -1; // L: 5302
						if (ArchiveLoader.field1055 != null && var3 >= 0 && var3 < ArchiveLoader.field1055.size()) { // L: 5303
							var19 = (Integer)ArchiveLoader.field1055.get(var3); // L: 5304
						}

						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var19; // L: 5306
						return 1; // L: 5307
					} else if (var0 != 7507 && var0 != 7509) { // L: 5309
						return 2; // L: 5336
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5310
						var4 = GameObject.method5218(var3); // L: 5311
						var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5312
						var6 = Language.method7198(var5); // L: 5313
						if (var6 == null) { // L: 5314
							throw new RuntimeException(); // L: 5315
						} else if (StructComposition.method4042(var5) != Client.field807) { // L: 5317
							throw new RuntimeException(); // L: 5318
						} else if (ArchiveLoader.field1055 == null && ArchiveLoader.field1055.isEmpty()) { // L: 5320
							throw new RuntimeException(); // L: 5321
						} else {
							var7 = class311.method5914(var5); // L: 5323
							List var8 = var6.method9164(var4, var7); // L: 5324
							ArchiveLoader.field1055 = new LinkedList(ArchiveLoader.field1055); // L: 5325
							if (var8 != null) { // L: 5326
								ArchiveLoader.field1055.retainAll(var8); // L: 5327
							} else {
								ArchiveLoader.field1055.clear(); // L: 5330
							}

							class149.field1705 = ArchiveLoader.field1055.iterator(); // L: 5332
							if (var0 == 7507) { // L: 5333
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = ArchiveLoader.field1055.size();
							}

							return 1; // L: 5334
						}
					}
				} else {
					--Interpreter_intStackSize; // L: 5278
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5279
					class526 var23 = Archive.method6948(var3); // L: 5280
					if (var23 == null) { // L: 5281
						throw new RuntimeException(); // L: 5282
					} else {
						ArchiveLoader.field1055 = var23.method9164(0, 0); // L: 5284
						var5 = 0; // L: 5285
						if (ArchiveLoader.field1055 != null) { // L: 5286
							Client.field807 = var3; // L: 5287
							class149.field1705 = ArchiveLoader.field1055.iterator(); // L: 5288
							var5 = ArchiveLoader.field1055.size(); // L: 5289
						}

						if (var0 == 7504) { // L: 5291
							Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5292
					}
				}
			} else {
				if (class149.field1705 != null && class149.field1705.hasNext()) { // L: 5204
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)class149.field1705.next(); // L: 5205
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = -1; // L: 5208
				}

				return 1; // L: 5210
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5182
			var4 = GameObject.method5218(var3); // L: 5183
			var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5184
			var6 = Language.method7198(var5); // L: 5185
			if (var6 == null) { // L: 5186
				throw new RuntimeException(); // L: 5187
			} else {
				var7 = class311.method5914(var5); // L: 5189
				ArchiveLoader.field1055 = var6.method9164(var4, var7); // L: 5190
				if (ArchiveLoader.field1055 != null) { // L: 5191
					Client.field807 = StructComposition.method4042(var5); // L: 5192
					class149.field1705 = ArchiveLoader.field1055.iterator(); // L: 5193
					if (var0 == 7500) { // L: 5194
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = ArchiveLoader.field1055.size();
					}
				} else {
					Client.field807 = -1; // L: 5197
					class149.field1705 = null; // L: 5198
					if (var0 == 7500) { // L: 5199
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5201
			}
		}
	}
}
