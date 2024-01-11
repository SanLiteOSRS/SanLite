import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nb")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("bg")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("aq")
	@Export("name")
	public final String name;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2142977125
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
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("ap")
	static final void method6934(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "321012486"
	)
	static int method6935(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2704
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.cycle; // L: 2705
			return 1; // L: 2706
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2708
				UserComparator6.Interpreter_intStackSize -= 2; // L: 2709
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2710
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2711
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Buddy.method8383(var3, var4); // L: 2712
				return 1; // L: 2713
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2715
				UserComparator6.Interpreter_intStackSize -= 2; // L: 2716
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2717
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2718
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = EnumComposition.ItemContainer_getCount(var3, var4); // L: 2719
				return 1; // L: 2720
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2722
				UserComparator6.Interpreter_intStackSize -= 2; // L: 2723
				var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2724
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2725
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class149.method3293(var3, var4); // L: 2726
				return 1; // L: 2727
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2729
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2730
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = SoundSystem.getInvDefinition(var3).size; // L: 2731
				return 1; // L: 2732
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2734
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2735
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2736
				return 1; // L: 2737
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2739
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2740
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2741
				return 1; // L: 2742
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2744
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2745
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2746
				return 1; // L: 2747
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2749
					var3 = class113.Client_plane; // L: 2750
					var4 = HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7); // L: 2751
					var5 = WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7); // L: 2752
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2753
					return 1; // L: 2754
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2756
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2757
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2758
					return 1; // L: 2759
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2761
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2762
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2763
					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2766
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2767
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2768
					return 1; // L: 2769
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2771
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2772
					return 1; // L: 2773
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2775
					UserComparator6.Interpreter_intStackSize -= 2; // L: 2776
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768; // L: 2777
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2778
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Buddy.method8383(var3, var4); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2782
					UserComparator6.Interpreter_intStackSize -= 2; // L: 2783
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768; // L: 2784
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2785
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = EnumComposition.ItemContainer_getCount(var3, var4); // L: 2786
					return 1; // L: 2787
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2789
					UserComparator6.Interpreter_intStackSize -= 2; // L: 2790
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] + 32768; // L: 2791
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2792
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class149.method3293(var3, var4); // L: 2793
					return 1; // L: 2794
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2796
					if (Client.staffModLevel >= 2) { // L: 2797
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2798
					}

					return 1; // L: 2799
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2801
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2805
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.worldId; // L: 2806
					return 1; // L: 2807
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2809
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field671 / 100; // L: 2810
					return 1; // L: 2811
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2813
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.weight; // L: 2814
					return 1; // L: 2815
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2817
					if (Client.playerMod) { // L: 2818
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2819
					}

					return 1; // L: 2820
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2822
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2823
					return 1; // L: 2824
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2826
					UserComparator6.Interpreter_intStackSize -= 4; // L: 2827
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2828
					var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2829
					var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 2830
					int var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 2831
					var3 += var4 << 14; // L: 2832
					var3 += var5 << 28; // L: 2833
					var3 += var6; // L: 2834
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3; // L: 2835
					return 1; // L: 2836
				} else if (var0 == 3326) { // L: 2838
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field512; // L: 2839
					return 1; // L: 2840
				} else if (var0 == 3327) { // L: 2842
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field783; // L: 2843
					return 1; // L: 2844
				} else if (var0 == 3331) { // L: 2846
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field671; // L: 2847
					return 1; // L: 2848
				} else if (var0 == 3332) { // L: 2850
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2851
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field644[var3]; // L: 2852
					return 1; // L: 2853
				} else {
					return 2; // L: 2855
				}
			}
		}
	}
}
