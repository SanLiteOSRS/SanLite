import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ok")
public class class372 {
	@ObfuscatedName("wr")
	@ObfuscatedGetter(
		intValue = 1975263355
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1337034941"
	)
	static final void method6935(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 133
			for (int var4 = 0; var4 < 8; ++var4) { // L: 134
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 136
			for (var3 = 1; var3 < 8; ++var3) { // L: 137
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 139
			for (var3 = 1; var3 < 8; ++var3) { // L: 140
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 142
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 143
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 144
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 145

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-1"
	)
	static int method6930(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2663
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.cycle; // L: 2664
			return 1; // L: 2665
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2667
				SoundCache.Interpreter_intStackSize -= 2; // L: 2668
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2669
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2670
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class209.method4072(var3, var4); // L: 2671
				return 1; // L: 2672
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2674
				SoundCache.Interpreter_intStackSize -= 2; // L: 2675
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2676
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2677
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = DynamicObject.ItemContainer_getCount(var3, var4); // L: 2678
				return 1; // L: 2679
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2681
				SoundCache.Interpreter_intStackSize -= 2; // L: 2682
				var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2683
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2684
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class212.method4145(var3, var4); // L: 2685
				return 1; // L: 2686
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2688
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2689
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = AbstractArchive.getInvDefinition(var3).size; // L: 2690
				return 1; // L: 2691
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2693
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2694
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2695
				return 1; // L: 2696
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2698
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2699
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2700
				return 1; // L: 2701
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2703
				var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2704
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2705
				return 1; // L: 2706
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2708
					var3 = HealthBar.Client_plane; // L: 2709
					var4 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7); // L: 2710
					var5 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7); // L: 2711
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2712
					return 1; // L: 2713
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2715
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2716
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2717
					return 1; // L: 2718
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2720
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2721
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2722
					return 1; // L: 2723
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2725
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2726
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2727
					return 1; // L: 2728
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2730
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2731
					return 1; // L: 2732
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2734
					SoundCache.Interpreter_intStackSize -= 2; // L: 2735
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] + 32768; // L: 2736
					var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2737
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class209.method4072(var3, var4); // L: 2738
					return 1; // L: 2739
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2741
					SoundCache.Interpreter_intStackSize -= 2; // L: 2742
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] + 32768; // L: 2743
					var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2744
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = DynamicObject.ItemContainer_getCount(var3, var4); // L: 2745
					return 1; // L: 2746
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2748
					SoundCache.Interpreter_intStackSize -= 2; // L: 2749
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] + 32768; // L: 2750
					var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2751
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class212.method4145(var3, var4); // L: 2752
					return 1; // L: 2753
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2755
					if (Client.staffModLevel >= 2) { // L: 2756
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2757
					}

					return 1; // L: 2758
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2760
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2761
					return 1; // L: 2762
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2764
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.worldId; // L: 2765
					return 1; // L: 2766
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2768
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field643 / 100; // L: 2769
					return 1; // L: 2770
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2772
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.weight; // L: 2773
					return 1; // L: 2774
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2776
					if (Client.playerMod) { // L: 2777
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2778
					}

					return 1; // L: 2779
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2781
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2782
					return 1; // L: 2783
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2785
					SoundCache.Interpreter_intStackSize -= 4; // L: 2786
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2787
					var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2788
					var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 2789
					int var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 2790
					var3 += var4 << 14; // L: 2791
					var3 += var5 << 28; // L: 2792
					var3 += var6; // L: 2793
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3; // L: 2794
					return 1; // L: 2795
				} else if (var0 == 3326) { // L: 2797
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field542; // L: 2798
					return 1; // L: 2799
				} else if (var0 == 3327) { // L: 2801
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field543; // L: 2802
					return 1; // L: 2803
				} else if (var0 == 3331) { // L: 2805
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field643; // L: 2806
					return 1; // L: 2807
				} else {
					return 2; // L: 2809
				}
			}
		}
	}
}
