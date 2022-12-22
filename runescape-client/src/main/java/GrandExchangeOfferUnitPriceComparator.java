import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mx")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("x")
	static boolean field4275;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;I)I",
		garbageValue = "1387071428"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "843888430"
	)
	static int method6641(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2500
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.cycle; // L: 2501
			return 1; // L: 2502
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2504
				class87.Interpreter_intStackSize -= 2; // L: 2505
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2506
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2507
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method267(var3, var4); // L: 2508
				return 1; // L: 2509
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2511
				class87.Interpreter_intStackSize -= 2; // L: 2512
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2513
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2514
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ClientPreferences.ItemContainer_getCount(var3, var4); // L: 2515
				return 1; // L: 2516
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2518
				class87.Interpreter_intStackSize -= 2; // L: 2519
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2520
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2521
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class200.method4095(var3, var4); // L: 2522
				return 1; // L: 2523
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2525
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2526
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class324.getInvDefinition(var3).size; // L: 2527
				return 1; // L: 2528
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2530
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2531
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2532
				return 1; // L: 2533
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2535
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2536
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2537
				return 1; // L: 2538
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2540
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2541
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2542
				return 1; // L: 2543
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2545
					var3 = class383.Client_plane; // L: 2546
					var4 = class154.baseX * 64 + (class155.localPlayer.x >> 7); // L: 2547
					var5 = class365.baseY * 64 + (class155.localPlayer.y >> 7); // L: 2548
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2549
					return 1; // L: 2550
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2552
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2553
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2554
					return 1; // L: 2555
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2557
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2558
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2559
					return 1; // L: 2560
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2562
					var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2563
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2564
					return 1; // L: 2565
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2567
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2568
					return 1; // L: 2569
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2571
					class87.Interpreter_intStackSize -= 2; // L: 2572
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + 32768; // L: 2573
					var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2574
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method267(var3, var4); // L: 2575
					return 1; // L: 2576
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2578
					class87.Interpreter_intStackSize -= 2; // L: 2579
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + 32768; // L: 2580
					var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2581
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = ClientPreferences.ItemContainer_getCount(var3, var4); // L: 2582
					return 1; // L: 2583
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2585
					class87.Interpreter_intStackSize -= 2; // L: 2586
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize] + 32768; // L: 2587
					var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2588
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class200.method4095(var3, var4); // L: 2589
					return 1; // L: 2590
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2592
					if (Client.staffModLevel >= 2) { // L: 2593
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2594
					}

					return 1; // L: 2595
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2597
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2598
					return 1; // L: 2599
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2601
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.worldId; // L: 2602
					return 1; // L: 2603
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2605
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field629 / 100; // L: 2606
					return 1; // L: 2607
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2609
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.weight; // L: 2610
					return 1; // L: 2611
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2613
					if (Client.playerMod) { // L: 2614
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2615
					}

					return 1; // L: 2616
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2618
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2619
					return 1; // L: 2620
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2622
					class87.Interpreter_intStackSize -= 4; // L: 2623
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2624
					var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2625
					var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 2626
					int var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 2627
					var3 += var4 << 14; // L: 2628
					var3 += var5 << 28; // L: 2629
					var3 += var6; // L: 2630
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 2631
					return 1; // L: 2632
				} else if (var0 == 3326) { // L: 2634
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field520; // L: 2635
					return 1; // L: 2636
				} else if (var0 == 3327) { // L: 2638
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field552; // L: 2639
					return 1; // L: 2640
				} else if (var0 == 3331) { // L: 2642
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.field629; // L: 2643
					return 1; // L: 2644
				} else {
					return 2; // L: 2646
				}
			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-49"
	)
	static void method6640() {
		if (class155.localPlayer.x >> 7 == Client.destinationX && class155.localPlayer.y >> 7 == Client.destinationY) { // L: 4829
			Client.destinationX = 0; // L: 4830
		}

	} // L: 4832
}
