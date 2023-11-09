import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jp")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1148791337
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1927773105
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1965169437
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1819175199
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1773446457
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1477913661
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1509749317
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1331461521
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1242590627
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 577069867
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1023812635
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 438844335
	)
	int field2634;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2044772523
	)
	int field2635;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1905669369
	)
	int field2636;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 262703333
	)
	int field2631;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -207007623
	)
	int field2638;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1859003431
	)
	int field2623;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1187966279
	)
	int field2640;

	Occluder() {
	} // L: 23

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "402674072"
	)
	static int method4753(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3424
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3425
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3426
			return 1; // L: 3427
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3429
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3430
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3431
			return 1; // L: 3432
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3434
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3435
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3436
			return 1; // L: 3437
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3439
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3440
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3441
			return 1; // L: 3442
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3444
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3445
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3446
			return 1; // L: 3447
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3449
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3450
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3451
			return 1; // L: 3452
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3454
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3455
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3456
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3457
				return 1; // L: 3458
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3460
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3461
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3462
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3463
				return 1; // L: 3464
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3466
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3467
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3468
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3469
				return 1; // L: 3470
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3472
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3473
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3474
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3475
				return 1; // L: 3476
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3478
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3479
					if (KeyHandler.grandExchangeEvents != null) { // L: 3480
						KeyHandler.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3481
					}

					return 1; // L: 3483
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3485
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3486
					if (KeyHandler.grandExchangeEvents != null) { // L: 3487
						KeyHandler.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3488
					}

					return 1; // L: 3490
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3492
					Interpreter.Interpreter_intStackSize -= 2; // L: 3493
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3494
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3495
					if (KeyHandler.grandExchangeEvents != null) { // L: 3496
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3497
						KeyHandler.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3498
					}

					return 1; // L: 3500
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3502
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3503
					if (KeyHandler.grandExchangeEvents != null) { // L: 3504
						KeyHandler.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3505
					}

					return 1; // L: 3507
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3509
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3510
					if (KeyHandler.grandExchangeEvents != null) { // L: 3511
						KeyHandler.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3512
					}

					return 1; // L: 3514
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3516
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KeyHandler.grandExchangeEvents == null ? 0 : KeyHandler.grandExchangeEvents.events.size(); // L: 3517
					return 1; // L: 3518
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3520
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3521
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3522
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3523
						return 1; // L: 3524
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3526
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3527
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3528
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3529
						return 1; // L: 3530
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3532
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3533
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3534
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3535
						return 1; // L: 3536
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3538
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3539
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3540
						long var5 = class113.method2835() - VerticalAlignment.field2049 - var4.age; // L: 3541
						int var7 = (int)(var5 / 3600000L); // L: 3542
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3543
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3544
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3545
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10; // L: 3546
						return 1; // L: 3547
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3549
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3550
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3551
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3552
						return 1; // L: 3553
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3555
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3556
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3557
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3558
						return 1; // L: 3559
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3561
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3562
						var4 = (GrandExchangeEvent)KeyHandler.grandExchangeEvents.events.get(var3); // L: 3563
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3564
						return 1; // L: 3565
					} else if (var0 == 3939) { // L: 3567
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3568
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class125.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3569
						return 1; // L: 3570
					} else {
						return 2; // L: 3572
					}
				}
			}
		}
	}
}
