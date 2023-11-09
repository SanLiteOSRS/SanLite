import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hj")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		longValue = -3395560641786882595L
	)
	static long field2530;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractSocket field2528;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1883161689"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1139752609"
	)
	static int method4469(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2508
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.cycle; // L: 2509
			return 1; // L: 2510
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2512
				class379.Interpreter_intStackSize -= 2; // L: 2513
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2514
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2515
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class457.method8304(var3, var4); // L: 2516
				return 1; // L: 2517
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2519
				class379.Interpreter_intStackSize -= 2; // L: 2520
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2521
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2522
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class139.ItemContainer_getCount(var3, var4); // L: 2523
				return 1; // L: 2524
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2526
				class379.Interpreter_intStackSize -= 2; // L: 2527
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2528
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2529
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapAreaData.method5266(var3, var4); // L: 2530
				return 1; // L: 2531
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2533
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2534
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getInvDefinition(var3).size; // L: 2535
				return 1; // L: 2536
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2538
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2539
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2540
				return 1; // L: 2541
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2543
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2544
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2545
				return 1; // L: 2546
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2548
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2549
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2550
				return 1; // L: 2551
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2553
					var3 = ApproximateRouteStrategy.Client_plane; // L: 2554
					var4 = class26.baseX * 64 + (class296.localPlayer.x >> 7); // L: 2555
					var5 = class158.baseY * 64 + (class296.localPlayer.y >> 7); // L: 2556
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2557
					return 1; // L: 2558
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2560
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2561
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2562
					return 1; // L: 2563
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2565
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2566
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2567
					return 1; // L: 2568
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2570
					var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2571
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2572
					return 1; // L: 2573
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2575
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2576
					return 1; // L: 2577
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2579
					class379.Interpreter_intStackSize -= 2; // L: 2580
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + 32768; // L: 2581
					var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2582
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class457.method8304(var3, var4); // L: 2583
					return 1; // L: 2584
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2586
					class379.Interpreter_intStackSize -= 2; // L: 2587
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + 32768; // L: 2588
					var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2589
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class139.ItemContainer_getCount(var3, var4); // L: 2590
					return 1; // L: 2591
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2593
					class379.Interpreter_intStackSize -= 2; // L: 2594
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize] + 32768; // L: 2595
					var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2596
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapAreaData.method5266(var3, var4); // L: 2597
					return 1; // L: 2598
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2600
					if (Client.staffModLevel >= 2) { // L: 2601
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2602
					}

					return 1; // L: 2603
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2605
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2606
					return 1; // L: 2607
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2609
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.worldId; // L: 2610
					return 1; // L: 2611
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2613
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.runEnergy; // L: 2614
					return 1; // L: 2615
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2617
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.weight; // L: 2618
					return 1; // L: 2619
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2621
					if (Client.playerMod) { // L: 2622
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2623
					}

					return 1; // L: 2624
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2626
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2627
					return 1; // L: 2628
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2630
					class379.Interpreter_intStackSize -= 4; // L: 2631
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2632
					var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2633
					var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 2634
					int var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 2635
					var3 += var4 << 14; // L: 2636
					var3 += var5 << 28; // L: 2637
					var3 += var6; // L: 2638
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 2639
					return 1; // L: 2640
				} else if (var0 == 3326) { // L: 2642
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field504; // L: 2643
					return 1; // L: 2644
				} else if (var0 == 3327) { // L: 2646
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.field630; // L: 2647
					return 1; // L: 2648
				} else {
					return 2; // L: 2650
				}
			}
		}
	}
}
