import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ot")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 1403299061
	)
	static int field4580;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "-37"
	)
	static int method7752(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3260
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3261
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3262
			return 1; // L: 3263
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3265
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3266
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3267
			return 1; // L: 3268
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3270
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3271
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3272
			return 1; // L: 3273
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3275
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3276
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3277
			return 1; // L: 3278
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3280
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3281
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3282
			return 1; // L: 3283
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3285
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3286
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3287
			return 1; // L: 3288
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3290
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3291
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3292
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3293
				return 1; // L: 3294
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3296
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3297
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3298
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3299
				return 1; // L: 3300
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3302
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3303
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3304
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3305
				return 1; // L: 3306
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3308
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3309
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3310
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3311
				return 1; // L: 3312
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3314
					var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3315
					if (EnumComposition.grandExchangeEvents != null) { // L: 3316
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3317
					}

					return 1; // L: 3319
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3321
					var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3322
					if (EnumComposition.grandExchangeEvents != null) { // L: 3323
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3324
					}

					return 1; // L: 3326
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3328
					class302.Interpreter_intStackSize -= 2; // L: 3329
					var12 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize] == 1; // L: 3330
					boolean var11 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1; // L: 3331
					if (EnumComposition.grandExchangeEvents != null) { // L: 3332
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3333
						EnumComposition.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3334
					}

					return 1; // L: 3336
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3338
					var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3339
					if (EnumComposition.grandExchangeEvents != null) { // L: 3340
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3341
					}

					return 1; // L: 3343
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3345
					var12 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 3346
					if (EnumComposition.grandExchangeEvents != null) { // L: 3347
						EnumComposition.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3348
					}

					return 1; // L: 3350
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3352
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = EnumComposition.grandExchangeEvents == null ? 0 : EnumComposition.grandExchangeEvents.events.size(); // L: 3353
					return 1; // L: 3354
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3356
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3357
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3358
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.world; // L: 3359
						return 1; // L: 3360
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3362
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3363
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3364
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3365
						return 1; // L: 3366
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3368
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3369
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3370
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3371
						return 1; // L: 3372
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3374
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3375
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3376
						long var5 = class153.method3317() - class361.field4359 - var4.age; // L: 3377
						int var7 = (int)(var5 / 3600000L); // L: 3378
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3379
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3380
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3381
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var10; // L: 3382
						return 1; // L: 3383
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3385
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3386
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3387
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3388
						return 1; // L: 3389
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3391
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3392
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3393
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3394
						return 1; // L: 3395
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3397
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3398
						var4 = (GrandExchangeEvent)EnumComposition.grandExchangeEvents.events.get(var3); // L: 3399
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3400
						return 1; // L: 3401
					} else {
						return 2; // L: 3403
					}
				}
			}
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "1"
	)
	static String method7753(int var0) {
		if (var0 < 0) { // L: 10463
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 10464 10465
		}
	}
}
