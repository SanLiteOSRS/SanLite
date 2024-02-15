import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("at")
public class class19 implements Callable {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 738415591
	)
	static int field90;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class10 field91;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;Lak;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field91 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field91.method92()) { // L: 53
				class143.method3209(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field91.method89(); // L: 60
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1281441350"
	)
	static int method258(Widget var0) {
		if (var0.type != 11) { // L: 1592
			--class60.Interpreter_stringStackSize; // L: 1593
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 1594
			return 1; // L: 1595
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1597
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6813(var1); // L: 1598
			return 1; // L: 1599
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "94"
	)
	static int method255(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3473
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3474
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3475
			return 1; // L: 3476
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3478
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3479
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3480
			return 1; // L: 3481
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3483
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3484
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3485
			return 1; // L: 3486
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3488
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3489
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3490
			return 1; // L: 3491
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3493
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3494
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3495
			return 1; // L: 3496
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3498
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3499
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3500
			return 1; // L: 3501
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3503
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3504
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3505
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3506
				return 1; // L: 3507
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3509
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3510
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3511
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3512
				return 1; // L: 3513
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3515
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3516
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3517
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3518
				return 1; // L: 3519
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3521
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3522
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3523
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3524
				return 1; // L: 3525
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3527
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3528
					if (FileSystem.grandExchangeEvents != null) { // L: 3529
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3530
					}

					return 1; // L: 3532
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3534
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3535
					if (FileSystem.grandExchangeEvents != null) { // L: 3536
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3537
					}

					return 1; // L: 3539
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3541
					Interpreter.Interpreter_intStackSize -= 2; // L: 3542
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1; // L: 3543
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3544
					if (FileSystem.grandExchangeEvents != null) { // L: 3545
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3546
						FileSystem.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3547
					}

					return 1; // L: 3549
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3551
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3552
					if (FileSystem.grandExchangeEvents != null) { // L: 3553
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3554
					}

					return 1; // L: 3556
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3558
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 3559
					if (FileSystem.grandExchangeEvents != null) { // L: 3560
						FileSystem.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3561
					}

					return 1; // L: 3563
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3565
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.grandExchangeEvents == null ? 0 : FileSystem.grandExchangeEvents.events.size(); // L: 3566
					return 1; // L: 3567
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3569
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3570
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3571
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world; // L: 3572
						return 1; // L: 3573
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3575
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3576
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3577
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3578
						return 1; // L: 3579
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3581
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3582
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3583
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3584
						return 1; // L: 3585
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3587
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3588
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3589
						long var5 = SecureRandomCallable.method2320() - class334.field3609 - var4.age; // L: 3590
						int var7 = (int)(var5 / 3600000L); // L: 3591
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3592
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3593
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3594
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var10; // L: 3595
						return 1; // L: 3596
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3598
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3599
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3600
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3601
						return 1; // L: 3602
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3604
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3605
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3606
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3607
						return 1; // L: 3608
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3610
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3611
						var4 = (GrandExchangeEvent)FileSystem.grandExchangeEvents.events.get(var3); // L: 3612
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3613
						return 1; // L: 3614
					} else if (var0 == 3939) { // L: 3616
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3617
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3618
						return 1; // L: 3619
					} else {
						return 2; // L: 3621
					}
				}
			}
		}
	}

	@ObfuscatedName("me")
	static final void method260(double var0) {
		Rasterizer3D.method5280(var0); // L: 12347
		((TextureProvider)Rasterizer3D.field2820.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12348
		if (Tiles.worldMap != null) { // L: 12349
			Tiles.worldMap.method8920(); // L: 12350
		}

		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12353
		class30.clientPreferences.method2538(var0); // L: 12355
	} // L: 12356
}
