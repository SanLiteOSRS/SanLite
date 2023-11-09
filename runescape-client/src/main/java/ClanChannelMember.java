import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fd")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 248330947
	)
	static int field1637;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ay")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1463881655
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "109062113"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 77
		if (var1 == null) { // L: 78
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 79 80
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "935240110"
	)
	static int method3122(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3385
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3386
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3387
			return 1; // L: 3388
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3390
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3391
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3392
			return 1; // L: 3393
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3395
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3396
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3397
			return 1; // L: 3398
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3400
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3401
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3402
			return 1; // L: 3403
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3405
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3406
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3407
			return 1; // L: 3408
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3410
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3411
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3412
			return 1; // L: 3413
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3415
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3416
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3417
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3418
				return 1; // L: 3419
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3421
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3422
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3423
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3424
				return 1; // L: 3425
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3427
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3428
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3429
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3430
				return 1; // L: 3431
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3433
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3434
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3435
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3436
				return 1; // L: 3437
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3439
					var12 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3440
					if (GraphicsObject.grandExchangeEvents != null) { // L: 3441
						GraphicsObject.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3442
					}

					return 1; // L: 3444
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3446
					var12 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3447
					if (GraphicsObject.grandExchangeEvents != null) { // L: 3448
						GraphicsObject.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3449
					}

					return 1; // L: 3451
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3453
					class336.Interpreter_intStackSize -= 2; // L: 3454
					var12 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] == 1; // L: 3455
					boolean var11 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1] == 1; // L: 3456
					if (GraphicsObject.grandExchangeEvents != null) { // L: 3457
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3458
						GraphicsObject.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3459
					}

					return 1; // L: 3461
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3463
					var12 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3464
					if (GraphicsObject.grandExchangeEvents != null) { // L: 3465
						GraphicsObject.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3466
					}

					return 1; // L: 3468
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3470
					var12 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 3471
					if (GraphicsObject.grandExchangeEvents != null) { // L: 3472
						GraphicsObject.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3473
					}

					return 1; // L: 3475
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3477
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = GraphicsObject.grandExchangeEvents == null ? 0 : GraphicsObject.grandExchangeEvents.events.size(); // L: 3478
					return 1; // L: 3479
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3481
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3482
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3483
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.world; // L: 3484
						return 1; // L: 3485
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3487
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3488
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3489
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3490
						return 1; // L: 3491
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3493
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3494
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3495
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3496
						return 1; // L: 3497
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3499
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3500
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3501
						long var5 = Canvas.method310() - VarcInt.field1940 - var4.age; // L: 3502
						int var7 = (int)(var5 / 3600000L); // L: 3503
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3504
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3505
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3506
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var10; // L: 3507
						return 1; // L: 3508
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3510
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3511
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3512
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3513
						return 1; // L: 3514
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3516
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3517
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3518
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3519
						return 1; // L: 3520
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3522
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3523
						var4 = (GrandExchangeEvent)GraphicsObject.grandExchangeEvents.events.get(var3); // L: 3524
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3525
						return 1; // L: 3526
					} else if (var0 == 3939) { // L: 3528
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3529
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3530
						return 1; // L: 3531
					} else {
						return 2; // L: 3533
					}
				}
			}
		}
	}
}
