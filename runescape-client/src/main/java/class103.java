import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
final class class103 implements class304 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmy;)V"
	)
	class103(Widget var1) {
		this.val$cc = var1; // L: 518
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "177803302"
	)
	public void vmethod5776() {
		if (this.val$cc != null && this.val$cc.method6163().field3459 != null) { // L: 520
			ScriptEvent var1 = new ScriptEvent(); // L: 521
			var1.method2260(this.val$cc); // L: 522
			var1.setArgs(this.val$cc.method6163().field3459); // L: 523
			class144.method3139().addFirst(var1); // L: 524
		}

	} // L: 526

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "107"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 85
		if (var3) { // L: 86
			var5 |= 65536L;
		}

		return var5; // L: 87
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "26"
	)
	static int method2670(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2596
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2597
			return 1; // L: 2598
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2600
				Interpreter.Interpreter_intStackSize -= 2; // L: 2601
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2602
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2603
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.method2220(var3, var4); // L: 2604
				return 1; // L: 2605
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2607
				Interpreter.Interpreter_intStackSize -= 2; // L: 2608
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2609
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2610
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.ItemContainer_getCount(var3, var4); // L: 2611
				return 1; // L: 2612
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2614
				Interpreter.Interpreter_intStackSize -= 2; // L: 2615
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2616
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2617
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.method4791(var3, var4); // L: 2618
				return 1; // L: 2619
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2621
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2622
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.getInvDefinition(var3).size; // L: 2623
				return 1; // L: 2624
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2626
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2627
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2628
				return 1; // L: 2629
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2631
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2632
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2633
				return 1; // L: 2634
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2636
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2637
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2638
				return 1; // L: 2639
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2641
					var3 = TaskHandler.Client_plane; // L: 2642
					var4 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7); // L: 2643
					var5 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7); // L: 2644
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2645
					return 1; // L: 2646
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2648
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2649
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2650
					return 1; // L: 2651
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2653
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2654
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2655
					return 1; // L: 2656
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2658
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2659
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2660
					return 1; // L: 2661
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2663
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2664
					return 1; // L: 2665
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2667
					Interpreter.Interpreter_intStackSize -= 2; // L: 2668
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2669
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2670
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.method2220(var3, var4); // L: 2671
					return 1; // L: 2672
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2674
					Interpreter.Interpreter_intStackSize -= 2; // L: 2675
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2676
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2677
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.ItemContainer_getCount(var3, var4); // L: 2678
					return 1; // L: 2679
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2681
					Interpreter.Interpreter_intStackSize -= 2; // L: 2682
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2683
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2684
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_0.method4791(var3, var4); // L: 2685
					return 1; // L: 2686
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2688
					if (Client.staffModLevel >= 2) { // L: 2689
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2690
					}

					return 1; // L: 2691
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2693
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2694
					return 1; // L: 2695
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2697
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2698
					return 1; // L: 2699
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2701
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field652 / 100; // L: 2702
					return 1; // L: 2703
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2705
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2706
					return 1; // L: 2707
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2709
					if (Client.playerMod) { // L: 2710
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2711
					}

					return 1; // L: 2712
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2714
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2715
					return 1; // L: 2716
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2718
					Interpreter.Interpreter_intStackSize -= 4; // L: 2719
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2720
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2721
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2722
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2723
					var3 += var4 << 14; // L: 2724
					var3 += var5 << 28; // L: 2725
					var3 += var6; // L: 2726
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2727
					return 1; // L: 2728
				} else if (var0 == 3326) { // L: 2730
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field515; // L: 2731
					return 1; // L: 2732
				} else if (var0 == 3327) { // L: 2734
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field496; // L: 2735
					return 1; // L: 2736
				} else if (var0 == 3331) { // L: 2738
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field652; // L: 2739
					return 1; // L: 2740
				} else {
					return 2; // L: 2742
				}
			}
		}
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)V",
		garbageValue = "1656599991"
	)
	static final void method2671(Widget var0) {
		int var1 = var0.contentType; // L: 11736
		if (var1 == 324) { // L: 11737
			if (Client.field756 == -1) { // L: 11738
				Client.field756 = var0.spriteId2; // L: 11739
				Client.field718 = var0.spriteId; // L: 11740
			}

			if (Client.playerAppearance.field3464 == 1) { // L: 11742
				var0.spriteId2 = Client.field756;
			} else {
				var0.spriteId2 = Client.field718; // L: 11743
			}

		} else if (var1 == 325) { // L: 11746
			if (Client.field756 == -1) { // L: 11747
				Client.field756 = var0.spriteId2; // L: 11748
				Client.field718 = var0.spriteId; // L: 11749
			}

			if (Client.playerAppearance.field3464 == 1) { // L: 11751
				var0.spriteId2 = Client.field718;
			} else {
				var0.spriteId2 = Client.field756; // L: 11752
			}

		} else if (var1 == 327) { // L: 11755
			var0.modelAngleX = 150; // L: 11756
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11757
			var0.modelType = 5; // L: 11758
			var0.modelId = 0; // L: 11759
		} else if (var1 == 328) { // L: 11762
			var0.modelAngleX = 150; // L: 11763
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11764
			var0.modelType = 5; // L: 11765
			var0.modelId = 1; // L: 11766
		}
	} // L: 11744 11753 11760 11767 11769
}
