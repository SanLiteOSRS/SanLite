import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("my")
public class class358 {
	@ObfuscatedName("h")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1844618131
	)
	static int field4347;
	@ObfuscatedName("f")
	static byte[][][] field4344;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1164204793
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "85706073"
	)
	static int method6920(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3263
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3264
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3265
			return 1; // L: 3266
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3268
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3269
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3270
			return 1; // L: 3271
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3273
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3274
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3275
			return 1; // L: 3276
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3278
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3279
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3280
			return 1; // L: 3281
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3283
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3284
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3285
			return 1; // L: 3286
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3288
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3289
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3290
			return 1; // L: 3291
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3293
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3294
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3295
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3296
				return 1; // L: 3297
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3299
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3300
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3301
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3302
				return 1; // L: 3303
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3305
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3306
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3307
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3308
				return 1; // L: 3309
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3311
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3312
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3313
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3314
				return 1; // L: 3315
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3317
					var12 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3318
					if (ItemContainer.grandExchangeEvents != null) { // L: 3319
						ItemContainer.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3320
					}

					return 1; // L: 3322
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3324
					var12 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3325
					if (ItemContainer.grandExchangeEvents != null) { // L: 3326
						ItemContainer.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3327
					}

					return 1; // L: 3329
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3331
					class87.Interpreter_intStackSize -= 2; // L: 3332
					var12 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] == 1; // L: 3333
					boolean var11 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1; // L: 3334
					if (ItemContainer.grandExchangeEvents != null) { // L: 3335
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3336
						ItemContainer.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3337
					}

					return 1; // L: 3339
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3341
					var12 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3342
					if (ItemContainer.grandExchangeEvents != null) { // L: 3343
						ItemContainer.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3344
					}

					return 1; // L: 3346
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3348
					var12 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 3349
					if (ItemContainer.grandExchangeEvents != null) { // L: 3350
						ItemContainer.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3351
					}

					return 1; // L: 3353
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3355
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ItemContainer.grandExchangeEvents == null ? 0 : ItemContainer.grandExchangeEvents.events.size(); // L: 3356
					return 1; // L: 3357
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3359
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3360
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3361
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.world; // L: 3362
						return 1; // L: 3363
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3365
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3366
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3367
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3368
						return 1; // L: 3369
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3371
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3372
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3373
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3374
						return 1; // L: 3375
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3377
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3378
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3379
						long var5 = Message.method1197() - WorldMapLabelSize.field2824 - var4.age; // L: 3380
						int var7 = (int)(var5 / 3600000L); // L: 3381
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3382
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3383
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3384
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 3385
						return 1; // L: 3386
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3388
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3389
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3390
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3391
						return 1; // L: 3392
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3394
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3395
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3396
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3397
						return 1; // L: 3398
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3400
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3401
						var4 = (GrandExchangeEvent)ItemContainer.grandExchangeEvents.events.get(var3); // L: 3402
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3403
						return 1; // L: 3404
					} else {
						return 2; // L: 3406
					}
				}
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1783114355"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class383.Client_plane][var0][var1]; // L: 8237
		if (var2 == null) { // L: 8238
			ReflectionCheck.scene.removeGroundItemPile(class383.Client_plane, var0, var1); // L: 8239
		} else {
			long var3 = -99999999L; // L: 8242
			TileItem var5 = null; // L: 8243

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8244 8245 8253
				ItemComposition var7 = NPCComposition.ItemComposition_get(var6.id); // L: 8246
				long var11 = (long)var7.price; // L: 8247
				if (var7.isStackable == 1) { // L: 8248
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 8249
					var3 = var11; // L: 8250
					var5 = var6; // L: 8251
				}
			}

			if (var5 == null) { // L: 8255
				ReflectionCheck.scene.removeGroundItemPile(class383.Client_plane, var0, var1); // L: 8256
			} else {
				var2.addLast(var5); // L: 8259
				TileItem var13 = null; // L: 8260
				TileItem var8 = null; // L: 8261

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8262 8263 8268
					if (var5.id != var6.id) { // L: 8264
						if (var13 == null) { // L: 8265
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8266
							var8 = var6;
						}
					}
				}

				long var9 = GameEngine.calculateTag(var0, var1, 3, false, 0); // L: 8270
				ReflectionCheck.scene.newGroundItemPile(class383.Client_plane, var0, var1, SpotAnimationDefinition.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class383.Client_plane), var5, var9, var13, var8); // L: 8271
			}
		}
	} // L: 8240 8257 8272

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1198990155"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 11323
	} // L: 11324
}
