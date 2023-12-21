import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qy")
public class class422 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1931631729
	)
	static int field4568;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1115750469
	)
	int field4572;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -435074305
	)
	int field4569;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1589929039
	)
	int field4570;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1861640221
	)
	int field4571;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4572).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4570).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4569).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4572 + var5 + "Created: " + this.field4569 + var7 + "Total used: " + this.field4570 + var6 + "Max-In-Use: " + this.field4571; // L: 22
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-2144991667"
	)
	public static void method7907(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 73
			int var4 = (var3 + var2) / 2; // L: 74
			int var5 = var2; // L: 75
			int var6 = var0[var4]; // L: 76
			var0[var4] = var0[var3]; // L: 77
			var0[var3] = var6; // L: 78
			int var7 = var1[var4]; // L: 79
			var1[var4] = var1[var3]; // L: 80
			var1[var3] = var7; // L: 81
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1; // L: 82

			for (int var9 = var2; var9 < var3; ++var9) { // L: 83
				if (var0[var9] < (var9 & var8) + var6) { // L: 84
					int var10 = var0[var9]; // L: 85
					var0[var9] = var0[var5]; // L: 86
					var0[var5] = var10; // L: 87
					int var11 = var1[var9]; // L: 88
					var1[var9] = var1[var5]; // L: 89
					var1[var5++] = var11; // L: 90
				}
			}

			var0[var3] = var0[var5]; // L: 94
			var0[var5] = var6; // L: 95
			var1[var3] = var1[var5]; // L: 96
			var1[var5] = var7; // L: 97
			method7907(var0, var1, var2, var5 - 1); // L: 98
			method7907(var0, var1, var5 + 1, var3); // L: 99
		}

	} // L: 101

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1334389960"
	)
	static int method7905(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3594
			class517.Interpreter_intStackSize -= 2; // L: 3595
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3596
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3597
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 + var4; // L: 3598
			return 1; // L: 3599
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3601
			class517.Interpreter_intStackSize -= 2; // L: 3602
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3603
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3604
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 - var4; // L: 3605
			return 1; // L: 3606
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3608
			class517.Interpreter_intStackSize -= 2; // L: 3609
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3610
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3611
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 * var9; // L: 3612
			return 1; // L: 3613
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3615
			class517.Interpreter_intStackSize -= 2; // L: 3616
			var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3617
			var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3618
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 / var4; // L: 3619
			return 1; // L: 3620
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3622
			var9 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3623
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3624
			return 1; // L: 3625
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3627
			var9 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3628
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3629
			return 1; // L: 3630
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3632
				class517.Interpreter_intStackSize -= 5; // L: 3633
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3634
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3635
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3636
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 3637
				var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 4]; // L: 3638
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3639
				return 1; // L: 3640
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3642
				class517.Interpreter_intStackSize -= 2; // L: 3643
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3644
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3645
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3646
				return 1; // L: 3647
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3649
				class517.Interpreter_intStackSize -= 2; // L: 3650
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3651
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3652
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3653
				return 1; // L: 3654
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3656
				class517.Interpreter_intStackSize -= 2; // L: 3657
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3658
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3659
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3660
				return 1; // L: 3661
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3663
				class517.Interpreter_intStackSize -= 2; // L: 3664
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3665
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3666
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3667
				return 1; // L: 3668
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3670
				class517.Interpreter_intStackSize -= 2; // L: 3671
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3672
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3673
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 % var4; // L: 3674
				return 1; // L: 3675
			} else if (var0 == ScriptOpcodes.POW) { // L: 3677
				class517.Interpreter_intStackSize -= 2; // L: 3678
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3679
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3680
				if (var9 == 0) { // L: 3681
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3682
				}

				return 1; // L: 3683
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3685
				class517.Interpreter_intStackSize -= 2; // L: 3686
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3687
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3688
				if (var9 == 0) { // L: 3689
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 3690
					return 1; // L: 3691
				} else {
					switch(var4) { // L: 3693
					case 0:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3706
						break; // L: 3707
					case 1:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9; // L: 3721
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3701
						break; // L: 3702
					case 3:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3696
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3716
						break; // L: 3717
					default:
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3711
					}

					return 1; // L: 3725
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3727
				class517.Interpreter_intStackSize -= 2; // L: 3728
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3729
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3730
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 & var4; // L: 3731
				return 1; // L: 3732
			} else if (var0 == ScriptOpcodes.OR) { // L: 3734
				class517.Interpreter_intStackSize -= 2; // L: 3735
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3736
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3737
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 | var4; // L: 3738
				return 1; // L: 3739
			} else if (var0 == 4016) { // L: 3741
				class517.Interpreter_intStackSize -= 2; // L: 3742
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3743
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3744
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3745
				return 1; // L: 3746
			} else if (var0 == 4017) { // L: 3748
				class517.Interpreter_intStackSize -= 2; // L: 3749
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3750
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3751
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3752
				return 1; // L: 3753
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3755
				class517.Interpreter_intStackSize -= 3; // L: 3756
				long var10 = (long)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3757
				long var12 = (long)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3758
				long var14 = (long)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3759
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3760
				return 1; // L: 3761
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3763
				var9 = UserComparator4.method2943(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 3764
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9; // L: 3765
				return 1; // L: 3766
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3768
				class517.Interpreter_intStackSize -= 2; // L: 3769
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3770
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3771
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3772
				return 1; // L: 3773
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3775
				class517.Interpreter_intStackSize -= 3; // L: 3776
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3777
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3778
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3779
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class197.method3811(var9, var4, var5); // L: 3780
				return 1; // L: 3781
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3783
				class517.Interpreter_intStackSize -= 3; // L: 3784
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3785
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3786
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3787
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class93.method2451(var9, var4, var5); // L: 3788
				return 1; // L: 3789
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3791
				class517.Interpreter_intStackSize -= 3; // L: 3792
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3793
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3794
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3795
				var6 = 31 - var5; // L: 3796
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3797
				return 1; // L: 3798
			} else if (var0 == 4030) { // L: 3800
				class517.Interpreter_intStackSize -= 4; // L: 3801
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3802
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3803
				var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 3804
				var6 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 3]; // L: 3805
				var9 = class93.method2451(var9, var5, var6); // L: 3806
				var7 = class214.method4227(var6 - var5 + 1); // L: 3807
				if (var4 > var7) { // L: 3808
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3809
				return 1; // L: 3810
			} else if (var0 == 4032) { // L: 3812
				Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = class174.method3539(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]); // L: 3813
				return 1; // L: 3814
			} else if (var0 == 4033) { // L: 3816
				Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = class195.method3800(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]); // L: 3817
				return 1; // L: 3818
			} else if (var0 == 4034) { // L: 3820
				class517.Interpreter_intStackSize -= 2; // L: 3821
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 3822
				var4 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 3823
				var5 = PacketBufferNode.method5929(var9, var4); // L: 3824
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5; // L: 3825
				return 1; // L: 3826
			} else if (var0 == 4035) { // L: 3828
				Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]); // L: 3829
				return 1; // L: 3830
			} else if (var0 == 4036) { // L: 3832
				String var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 3833
				var4 = -1; // L: 3834
				if (ClientPacket.isNumber(var3)) { // L: 3835
					var4 = Huffman.method6840(var3); // L: 3836
				}

				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4; // L: 3838
				return 1; // L: 3839
			} else {
				return 2; // L: 3841
			}
		}
	}
}
