import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nb")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ac")
	@Export("name")
	public final String name;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2123855839
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1216130805"
	)
	static int method6608(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3427
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3428
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3429
			return 1; // L: 3430
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3432
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3433
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3434
			return 1; // L: 3435
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3437
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3438
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3439
			return 1; // L: 3440
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3442
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3443
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3444
			return 1; // L: 3445
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3447
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3448
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3449
			return 1; // L: 3450
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3452
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3453
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3454
			return 1; // L: 3455
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3457
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3458
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3459
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3460
				return 1; // L: 3461
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3463
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3464
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3465
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3466
				return 1; // L: 3467
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3469
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3470
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3471
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3472
				return 1; // L: 3473
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3475
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3476
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3477
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3478
				return 1; // L: 3479
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3481
					var12 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3482
					if (class392.grandExchangeEvents != null) { // L: 3483
						class392.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3484
					}

					return 1; // L: 3486
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3488
					var12 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3489
					if (class392.grandExchangeEvents != null) { // L: 3490
						class392.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3491
					}

					return 1; // L: 3493
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3495
					SoundCache.Interpreter_intStackSize -= 2; // L: 3496
					var12 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] == 1; // L: 3497
					boolean var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1; // L: 3498
					if (class392.grandExchangeEvents != null) { // L: 3499
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3500
						class392.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3501
					}

					return 1; // L: 3503
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3505
					var12 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3506
					if (class392.grandExchangeEvents != null) { // L: 3507
						class392.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3508
					}

					return 1; // L: 3510
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3512
					var12 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 3513
					if (class392.grandExchangeEvents != null) { // L: 3514
						class392.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3515
					}

					return 1; // L: 3517
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3519
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class392.grandExchangeEvents == null ? 0 : class392.grandExchangeEvents.events.size(); // L: 3520
					return 1; // L: 3521
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3523
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3524
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3525
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.world; // L: 3526
						return 1; // L: 3527
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3529
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3530
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3531
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3532
						return 1; // L: 3533
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3535
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3536
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3537
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3538
						return 1; // L: 3539
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3541
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3542
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3543
						long var5 = GameEngine.method661() - class132.field1605 - var4.age; // L: 3544
						int var7 = (int)(var5 / 3600000L); // L: 3545
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3546
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3547
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3548
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var10; // L: 3549
						return 1; // L: 3550
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3552
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3553
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3554
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3555
						return 1; // L: 3556
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3558
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3559
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3560
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3561
						return 1; // L: 3562
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3564
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3565
						var4 = (GrandExchangeEvent)class392.grandExchangeEvents.events.get(var3); // L: 3566
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3567
						return 1; // L: 3568
					} else if (var0 == 3939) { // L: 3570
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3571
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3572
						return 1; // L: 3573
					} else {
						return 2; // L: 3575
					}
				}
			}
		}
	}
}
