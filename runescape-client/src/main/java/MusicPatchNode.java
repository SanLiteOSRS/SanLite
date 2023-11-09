import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mu")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2133441521
	)
	int field3485;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	MusicPatchNode2 field3478;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1086120267
	)
	int field3479;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1179755589
	)
	int field3477;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1314576927
	)
	int field3481;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1892171455
	)
	int field3482;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1597955719
	)
	int field3493;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 96008211
	)
	int field3484;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -454168831
	)
	int field3488;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 666358887
	)
	int field3480;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -318125051
	)
	int field3487;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 832101661
	)
	int field3486;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1795406779
	)
	int field3489;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1789308678
	)
	int field3490;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1479177187
	)
	int field3491;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1052213181
	)
	int field3492;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1308617755
	)
	int field3476;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1502050821
	)
	int field3495;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1577335012"
	)
	void method6047() {
		this.table = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3478 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmn;B)V",
		garbageValue = "0"
	)
	public static void method6042(Huffman var0) {
		class332.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "1"
	)
	static int method6049(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2621
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.cycle; // L: 2622
			return 1; // L: 2623
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2625
				class336.Interpreter_intStackSize -= 2; // L: 2626
				var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2627
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2628
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = BufferedSource.method8019(var3, var4); // L: 2629
				return 1; // L: 2630
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2632
				class336.Interpreter_intStackSize -= 2; // L: 2633
				var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2634
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2635
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class36.ItemContainer_getCount(var3, var4); // L: 2636
				return 1; // L: 2637
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2639
				class336.Interpreter_intStackSize -= 2; // L: 2640
				var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2641
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2642
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class341.method6638(var3, var4); // L: 2643
				return 1; // L: 2644
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2646
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2647
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = RouteStrategy.getInvDefinition(var3).size; // L: 2648
				return 1; // L: 2649
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2651
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2652
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2653
				return 1; // L: 2654
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2656
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2657
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2658
				return 1; // L: 2659
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2661
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2662
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2663
				return 1; // L: 2664
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2666
					var3 = NetFileRequest.Client_plane; // L: 2667
					var4 = class147.baseX * 64 + (HitSplatDefinition.localPlayer.x >> 7); // L: 2668
					var5 = ModeWhere.baseY * 64 + (HitSplatDefinition.localPlayer.y >> 7); // L: 2669
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2670
					return 1; // L: 2671
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2673
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2674
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2675
					return 1; // L: 2676
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2678
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2679
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2680
					return 1; // L: 2681
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2683
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 2684
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2685
					return 1; // L: 2686
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2688
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2689
					return 1; // L: 2690
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2692
					class336.Interpreter_intStackSize -= 2; // L: 2693
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] + 32768; // L: 2694
					var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2695
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = BufferedSource.method8019(var3, var4); // L: 2696
					return 1; // L: 2697
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2699
					class336.Interpreter_intStackSize -= 2; // L: 2700
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] + 32768; // L: 2701
					var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2702
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class36.ItemContainer_getCount(var3, var4); // L: 2703
					return 1; // L: 2704
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2706
					class336.Interpreter_intStackSize -= 2; // L: 2707
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize] + 32768; // L: 2708
					var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2709
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class341.method6638(var3, var4); // L: 2710
					return 1; // L: 2711
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2713
					if (Client.staffModLevel >= 2) { // L: 2714
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2715
					}

					return 1; // L: 2716
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2718
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2719
					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2722
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.worldId; // L: 2723
					return 1; // L: 2724
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2726
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field630 / 100; // L: 2727
					return 1; // L: 2728
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2730
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.weight; // L: 2731
					return 1; // L: 2732
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2734
					if (Client.playerMod) { // L: 2735
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 2736
					}

					return 1; // L: 2737
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2739
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2740
					return 1; // L: 2741
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2743
					class336.Interpreter_intStackSize -= 4; // L: 2744
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 2745
					var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 2746
					var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 2747
					int var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 2748
					var3 += var4 << 14; // L: 2749
					var3 += var5 << 28; // L: 2750
					var3 += var6; // L: 2751
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3; // L: 2752
					return 1; // L: 2753
				} else if (var0 == 3326) { // L: 2755
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field496; // L: 2756
					return 1; // L: 2757
				} else if (var0 == 3327) { // L: 2759
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field497; // L: 2760
					return 1; // L: 2761
				} else if (var0 == 3331) { // L: 2763
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field630; // L: 2764
					return 1; // L: 2765
				} else {
					return 2; // L: 2767
				}
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1052357643"
	)
	static int method6048(int var0, Script var1, boolean var2) {
		return 2; // L: 5069
	}
}
