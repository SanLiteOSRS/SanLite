import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rj")
public class class463 {
	@ObfuscatedName("at")
	float field4776;
	@ObfuscatedName("ah")
	float field4775;
	@ObfuscatedName("ar")
	float field4785;
	@ObfuscatedName("ao")
	float field4777;
	@ObfuscatedName("ab")
	float field4778;
	@ObfuscatedName("au")
	float field4779;
	@ObfuscatedName("aa")
	float field4780;
	@ObfuscatedName("ac")
	float field4781;
	@ObfuscatedName("al")
	float field4782;
	@ObfuscatedName("az")
	float field4783;
	@ObfuscatedName("ap")
	float field4784;
	@ObfuscatedName("av")
	float field4774;

	static {
		new class463();
	} // L: 6

	class463() {
		this.method8497(); // L: 22
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1136254272"
	)
	void method8497() {
		this.field4774 = 0.0F; // L: 26
		this.field4784 = 0.0F; // L: 27
		this.field4783 = 0.0F; // L: 28
		this.field4781 = 0.0F; // L: 29
		this.field4780 = 0.0F; // L: 30
		this.field4779 = 0.0F; // L: 31
		this.field4777 = 0.0F; // L: 32
		this.field4785 = 0.0F; // L: 33
		this.field4775 = 0.0F; // L: 34
		this.field4782 = 1.0F; // L: 35
		this.field4778 = 1.0F; // L: 36
		this.field4776 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1766211153"
	)
	void method8498(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4775; // L: 43
		float var5 = this.field4778; // L: 44
		float var6 = this.field4781; // L: 45
		float var7 = this.field4784; // L: 46
		this.field4775 = var2 * var4 - this.field4785 * var3; // L: 47
		this.field4785 = var4 * var3 + var2 * this.field4785; // L: 48
		this.field4778 = var5 * var2 - this.field4779 * var3; // L: 49
		this.field4779 = this.field4779 * var2 + var5 * var3; // L: 50
		this.field4781 = var2 * var6 - var3 * this.field4782; // L: 51
		this.field4782 = this.field4782 * var2 + var3 * var6; // L: 52
		this.field4784 = var7 * var2 - this.field4774 * var3; // L: 53
		this.field4774 = var3 * var7 + var2 * this.field4774; // L: 54
	} // L: 55

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "16"
	)
	void method8514(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4776; // L: 60
		float var5 = this.field4777; // L: 61
		float var6 = this.field4780; // L: 62
		float var7 = this.field4783; // L: 63
		this.field4776 = var3 * this.field4785 + var2 * var4; // L: 64
		this.field4785 = var2 * this.field4785 - var3 * var4; // L: 65
		this.field4777 = var3 * this.field4779 + var5 * var2; // L: 66
		this.field4779 = this.field4779 * var2 - var3 * var5; // L: 67
		this.field4780 = var2 * var6 + var3 * this.field4782; // L: 68
		this.field4782 = var2 * this.field4782 - var3 * var6; // L: 69
		this.field4783 = var7 * var2 + var3 * this.field4774; // L: 70
		this.field4774 = var2 * this.field4774 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1612992617"
	)
	void method8499(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4776; // L: 77
		float var5 = this.field4777; // L: 78
		float var6 = this.field4780; // L: 79
		float var7 = this.field4783; // L: 80
		this.field4776 = var4 * var2 - this.field4775 * var3; // L: 81
		this.field4775 = this.field4775 * var2 + var4 * var3; // L: 82
		this.field4777 = var5 * var2 - var3 * this.field4778; // L: 83
		this.field4778 = var2 * this.field4778 + var3 * var5; // L: 84
		this.field4780 = var6 * var2 - var3 * this.field4781; // L: 85
		this.field4781 = var3 * var6 + var2 * this.field4781; // L: 86
		this.field4783 = var7 * var2 - var3 * this.field4784; // L: 87
		this.field4784 = var3 * var7 + this.field4784 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "4"
	)
	void method8501(float var1, float var2, float var3) {
		this.field4783 += var1; // L: 92
		this.field4784 += var2; // L: 93
		this.field4774 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4776 + "," + this.field4777 + "," + this.field4780 + "," + this.field4783 + "\n" + this.field4775 + "," + this.field4778 + "," + this.field4781 + "," + this.field4784 + "\n" + this.field4785 + "," + this.field4779 + "," + this.field4782 + "," + this.field4774; // L: 99
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-99"
	)
	static int method8506(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2673
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.cycle; // L: 2674
			return 1; // L: 2675
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2677
				class517.Interpreter_intStackSize -= 2; // L: 2678
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2679
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2680
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ClientPreferences.method2570(var3, var4); // L: 2681
				return 1; // L: 2682
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2684
				class517.Interpreter_intStackSize -= 2; // L: 2685
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2686
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2687
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class182.ItemContainer_getCount(var3, var4); // L: 2688
				return 1; // L: 2689
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2691
				class517.Interpreter_intStackSize -= 2; // L: 2692
				var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2693
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2694
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class27.method446(var3, var4); // L: 2695
				return 1; // L: 2696
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2698
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2699
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = LoginPacket.getInvDefinition(var3).size; // L: 2700
				return 1; // L: 2701
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2703
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2704
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2705
				return 1; // L: 2706
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2708
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2709
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2710
				return 1; // L: 2711
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2713
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2714
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2715
				return 1; // L: 2716
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2718
					var3 = ItemLayer.Client_plane; // L: 2719
					var4 = class187.baseX * 64 + (class229.localPlayer.x >> 7); // L: 2720
					var5 = class101.baseY * 64 + (class229.localPlayer.y >> 7); // L: 2721
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2722
					return 1; // L: 2723
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2725
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2726
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2727
					return 1; // L: 2728
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2730
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2731
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2732
					return 1; // L: 2733
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2735
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2736
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2737
					return 1; // L: 2738
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2740
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2741
					return 1; // L: 2742
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2744
					class517.Interpreter_intStackSize -= 2; // L: 2745
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] + 32768; // L: 2746
					var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2747
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = ClientPreferences.method2570(var3, var4); // L: 2748
					return 1; // L: 2749
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2751
					class517.Interpreter_intStackSize -= 2; // L: 2752
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] + 32768; // L: 2753
					var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2754
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class182.ItemContainer_getCount(var3, var4); // L: 2755
					return 1; // L: 2756
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2758
					class517.Interpreter_intStackSize -= 2; // L: 2759
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] + 32768; // L: 2760
					var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2761
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class27.method446(var3, var4); // L: 2762
					return 1; // L: 2763
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2765
					if (Client.staffModLevel >= 2) { // L: 2766
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2767
					}

					return 1; // L: 2768
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2770
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2771
					return 1; // L: 2772
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2774
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.worldId; // L: 2775
					return 1; // L: 2776
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2778
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field663 / 100; // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2782
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.weight; // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2786
					if (Client.playerMod) { // L: 2787
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2788
					}

					return 1; // L: 2789
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2791
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2792
					return 1; // L: 2793
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2795
					class517.Interpreter_intStackSize -= 4; // L: 2796
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2797
					var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2798
					var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 2799
					int var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 2800
					var3 += var4 << 14; // L: 2801
					var3 += var5 << 28; // L: 2802
					var3 += var6; // L: 2803
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3; // L: 2804
					return 1; // L: 2805
				} else if (var0 == 3326) { // L: 2807
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field501; // L: 2808
					return 1; // L: 2809
				} else if (var0 == 3327) { // L: 2811
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field502; // L: 2812
					return 1; // L: 2813
				} else if (var0 == 3331) { // L: 2815
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field663; // L: 2816
					return 1; // L: 2817
				} else if (var0 == 3332) { // L: 2819
					var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2820
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.field540[var3]; // L: 2821
					return 1; // L: 2822
				} else {
					return 2; // L: 2824
				}
			}
		}
	}
}
