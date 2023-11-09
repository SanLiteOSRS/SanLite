import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
final class class130 implements ThreadFactory {
	@ObfuscatedName("av")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	static Widget field1574;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 49
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-29"
	)
	static int method3127(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2617
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2618
			return 1; // L: 2619
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2621
				Interpreter.Interpreter_intStackSize -= 2; // L: 2622
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2623
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2624
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.method2357(var3, var4); // L: 2625
				return 1; // L: 2626
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2628
				Interpreter.Interpreter_intStackSize -= 2; // L: 2629
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2630
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2631
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class431.ItemContainer_getCount(var3, var4); // L: 2632
				return 1; // L: 2633
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2635
				Interpreter.Interpreter_intStackSize -= 2; // L: 2636
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2637
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2638
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BufferedNetSocket.method8016(var3, var4); // L: 2639
				return 1; // L: 2640
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2642
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2643
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getInvDefinition(var3).size; // L: 2644
				return 1; // L: 2645
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2647
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2648
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2649
				return 1; // L: 2650
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2652
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2653
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2654
				return 1; // L: 2655
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2657
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2658
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2659
				return 1; // L: 2660
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2662
					var3 = GameEngine.Client_plane; // L: 2663
					var4 = WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7); // L: 2664
					var5 = GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7); // L: 2665
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2666
					return 1; // L: 2667
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2669
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2670
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2671
					return 1; // L: 2672
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2674
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2675
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2676
					return 1; // L: 2677
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2679
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2680
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2681
					return 1; // L: 2682
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2684
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2685
					return 1; // L: 2686
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2688
					Interpreter.Interpreter_intStackSize -= 2; // L: 2689
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2690
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2691
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.method2357(var3, var4); // L: 2692
					return 1; // L: 2693
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2695
					Interpreter.Interpreter_intStackSize -= 2; // L: 2696
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2697
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2698
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class431.ItemContainer_getCount(var3, var4); // L: 2699
					return 1; // L: 2700
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2702
					Interpreter.Interpreter_intStackSize -= 2; // L: 2703
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2704
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2705
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BufferedNetSocket.method8016(var3, var4); // L: 2706
					return 1; // L: 2707
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2709
					if (Client.staffModLevel >= 2) { // L: 2710
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2711
					}

					return 1; // L: 2712
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2714
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2715
					return 1; // L: 2716
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2718
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2719
					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2722
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field624 / 100; // L: 2723
					return 1; // L: 2724
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2726
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2727
					return 1; // L: 2728
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2730
					if (Client.playerMod) { // L: 2731
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2732
					}

					return 1; // L: 2733
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2735
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2736
					return 1; // L: 2737
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2739
					Interpreter.Interpreter_intStackSize -= 4; // L: 2740
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2741
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2742
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2743
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2744
					var3 += var4 << 14; // L: 2745
					var3 += var5 << 28; // L: 2746
					var3 += var6; // L: 2747
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2748
					return 1; // L: 2749
				} else if (var0 == 3326) { // L: 2751
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field502; // L: 2752
					return 1; // L: 2753
				} else if (var0 == 3327) { // L: 2755
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field503; // L: 2756
					return 1; // L: 2757
				} else if (var0 == 3331) { // L: 2759
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field624; // L: 2760
					return 1; // L: 2761
				} else {
					return 2; // L: 2763
				}
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "625679186"
	)
	static final void method3125(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11674
		class20.clientPreferences.updateSoundEffectVolume(var0); // L: 11675
	} // L: 11676
}
