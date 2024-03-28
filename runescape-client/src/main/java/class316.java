import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@mq
@ObfuscatedName("ma")
public final class class316 {
	@ObfuscatedName("af")
	static final HashMap field3466;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		field3466 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3466) { // L: 16
			TimeZone var2 = (TimeZone)field3466.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3466.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0);
	} // L: 26

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmf;",
		garbageValue = "-1958860708"
	)
	static class314[] method5942() {
		return new class314[]{class314.field3457, class314.field3450, class314.field3453, class314.field3451, class314.field3454, class314.field3455, class314.field3449, class314.field3448}; // L: 25
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1009527792"
	)
	static int method5941(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2706
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.cycle; // L: 2707
			return 1; // L: 2708
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2710
				class19.Interpreter_intStackSize -= 2; // L: 2711
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2712
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2713
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class184.method3662(var3, var4); // L: 2714
				return 1; // L: 2715
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2717
				class19.Interpreter_intStackSize -= 2; // L: 2718
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2719
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2720
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = World.ItemContainer_getCount(var3, var4); // L: 2721
				return 1; // L: 2722
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2724
				class19.Interpreter_intStackSize -= 2; // L: 2725
				var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2726
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2727
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = UserComparator8.method2872(var3, var4); // L: 2728
				return 1; // L: 2729
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2731
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2732
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = FriendsChatManager.getInvDefinition(var3).size; // L: 2733
				return 1; // L: 2734
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2736
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2737
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2738
				return 1; // L: 2739
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2741
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2742
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2743
				return 1; // L: 2744
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2746
				var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2747
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2748
				return 1; // L: 2749
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2751
					var3 = class172.Client_plane; // L: 2752
					var4 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class133.localPlayer.x >> 7); // L: 2753
					var5 = DevicePcmPlayerProvider.baseY * 64 + (class133.localPlayer.y >> 7); // L: 2754
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2755
					return 1; // L: 2756
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2758
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2759
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2760
					return 1; // L: 2761
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2763
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2764
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2765
					return 1; // L: 2766
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2768
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2769
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2770
					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2773
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2774
					return 1; // L: 2775
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2777
					class19.Interpreter_intStackSize -= 2; // L: 2778
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] + 32768; // L: 2779
					var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2780
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class184.method3662(var3, var4); // L: 2781
					return 1; // L: 2782
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2784
					class19.Interpreter_intStackSize -= 2; // L: 2785
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] + 32768; // L: 2786
					var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2787
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = World.ItemContainer_getCount(var3, var4); // L: 2788
					return 1; // L: 2789
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2791
					class19.Interpreter_intStackSize -= 2; // L: 2792
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize] + 32768; // L: 2793
					var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2794
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = UserComparator8.method2872(var3, var4); // L: 2795
					return 1; // L: 2796
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2798
					if (Client.staffModLevel >= 2) { // L: 2799
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2800
					}

					return 1; // L: 2801
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2803
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2804
					return 1; // L: 2805
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2807
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.worldId; // L: 2808
					return 1; // L: 2809
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2811
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field633 / 100; // L: 2812
					return 1; // L: 2813
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2815
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.weight; // L: 2816
					return 1; // L: 2817
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2819
					if (Client.playerMod) { // L: 2820
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2821
					}

					return 1; // L: 2822
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2824
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2825
					return 1; // L: 2826
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2828
					class19.Interpreter_intStackSize -= 4; // L: 2829
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2830
					var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2831
					var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 2832
					int var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 2833
					var3 += var4 << 14; // L: 2834
					var3 += var5 << 28; // L: 2835
					var3 += var6; // L: 2836
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3; // L: 2837
					return 1; // L: 2838
				} else if (var0 == 3326) { // L: 2840
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field795; // L: 2841
					return 1; // L: 2842
				} else if (var0 == 3327) { // L: 2844
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field525; // L: 2845
					return 1; // L: 2846
				} else if (var0 == 3331) { // L: 2848
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field633; // L: 2849
					return 1; // L: 2850
				} else if (var0 == 3332) { // L: 2852
					var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2853
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.field656[var3]; // L: 2854
					return 1; // L: 2855
				} else {
					return 2; // L: 2857
				}
			}
		}
	}
}
