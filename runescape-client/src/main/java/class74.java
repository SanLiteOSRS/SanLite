import java.math.BigInteger;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ct")
public class class74 {
	@ObfuscatedName("ao")
	static final BigInteger field906;
	@ObfuscatedName("ah")
	static final BigInteger field907;

	static {
		field906 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field907 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-25"
	)
	static final int method2119(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 13
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6345"
	)
	public static void method2120() {
		class522.DBRowType_cache.clear(); // L: 75
	} // L: 76

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-970557765"
	)
	static void method2113() {
		Iterator var0 = class319.field3433.iterator(); // L: 236

		while (var0.hasNext()) {
			class331 var1 = (class331)var0.next(); // L: 237
			if (var1 != null) { // L: 239
				var1.field3538.clear(); // L: 242
				var1.field3538.method6044(); // L: 243
				var1.field3538.setPcmStreamVolume(0); // L: 244
				var1.field3538.field3450 = 0; // L: 245
				WorldMapDecorationType.method6793(var1.field3539, var1.field3540); // L: 246
			}
		}

		class319.field3433.clear(); // L: 249
	} // L: 250

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1821439381"
	)
	static int method2118(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3438
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3439
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3440
			return 1; // L: 3441
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3443
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3444
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3445
			return 1; // L: 3446
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3448
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3449
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3450
			return 1; // L: 3451
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3453
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3454
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3455
			return 1; // L: 3456
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3458
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3459
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3460
			return 1; // L: 3461
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3463
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3464
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3465
			return 1; // L: 3466
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3468
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3469
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3470
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3471
				return 1; // L: 3472
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3474
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3475
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3476
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3477
				return 1; // L: 3478
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3480
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3481
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3482
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3483
				return 1; // L: 3484
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3486
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3487
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3488
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3489
				return 1; // L: 3490
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3492
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3493
					if (Varps.grandExchangeEvents != null) { // L: 3494
						Varps.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3495
					}

					return 1; // L: 3497
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3499
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3500
					if (Varps.grandExchangeEvents != null) { // L: 3501
						Varps.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3502
					}

					return 1; // L: 3504
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3506
					Interpreter.Interpreter_intStackSize -= 2; // L: 3507
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3508
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3509
					if (Varps.grandExchangeEvents != null) { // L: 3510
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3511
						Varps.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3512
					}

					return 1; // L: 3514
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3516
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3517
					if (Varps.grandExchangeEvents != null) { // L: 3518
						Varps.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3519
					}

					return 1; // L: 3521
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3523
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3524
					if (Varps.grandExchangeEvents != null) { // L: 3525
						Varps.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3526
					}

					return 1; // L: 3528
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3530
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.grandExchangeEvents == null ? 0 : Varps.grandExchangeEvents.events.size(); // L: 3531
					return 1; // L: 3532
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3534
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3535
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3536
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3537
						return 1; // L: 3538
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3540
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3541
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3542
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3543
						return 1; // L: 3544
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3546
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3547
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3548
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3549
						return 1; // L: 3550
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3552
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3553
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3554
						long var5 = GrandExchangeOfferTotalQuantityComparator.method7049() - class411.field4526 - var4.age; // L: 3555
						int var7 = (int)(var5 / 3600000L); // L: 3556
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3557
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3558
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3559
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var10; // L: 3560
						return 1; // L: 3561
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3563
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3564
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3565
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3566
						return 1; // L: 3567
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3569
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3570
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3571
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3572
						return 1; // L: 3573
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3575
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3576
						var4 = (GrandExchangeEvent)Varps.grandExchangeEvents.events.get(var3); // L: 3577
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3578
						return 1; // L: 3579
					} else if (var0 == 3939) { // L: 3581
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3582
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3583
						return 1; // L: 3584
					} else {
						return 2; // L: 3586
					}
				}
			}
		}
	}
}
