import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("je")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("aw")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "587641451"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 19
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1553568189"
	)
	static int method5040(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3625
			Interpreter.Interpreter_intStackSize -= 2; // L: 3626
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3627
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3628
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3629
			return 1; // L: 3630
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3632
			Interpreter.Interpreter_intStackSize -= 2; // L: 3633
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3634
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3635
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3636
			return 1; // L: 3637
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3639
			Interpreter.Interpreter_intStackSize -= 2; // L: 3640
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3641
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3642
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4; // L: 3643
			return 1; // L: 3644
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3646
			Interpreter.Interpreter_intStackSize -= 2; // L: 3647
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3648
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3649
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3650
			return 1; // L: 3651
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3653
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3654
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3655
			return 1; // L: 3656
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3658
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3659
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3660
			return 1; // L: 3661
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3663
				Interpreter.Interpreter_intStackSize -= 5; // L: 3664
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3665
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3666
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3667
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3668
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3669
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3670
				return 1; // L: 3671
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3673
				Interpreter.Interpreter_intStackSize -= 2; // L: 3674
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3675
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3676
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3677
				return 1; // L: 3678
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3680
				Interpreter.Interpreter_intStackSize -= 2; // L: 3681
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3682
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3683
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3684
				return 1; // L: 3685
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3687
				Interpreter.Interpreter_intStackSize -= 2; // L: 3688
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3689
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3690
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3691
				return 1; // L: 3692
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3694
				Interpreter.Interpreter_intStackSize -= 2; // L: 3695
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3696
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3697
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3698
				return 1; // L: 3699
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3701
				Interpreter.Interpreter_intStackSize -= 2; // L: 3702
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3703
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3704
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3705
				return 1; // L: 3706
			} else if (var0 == ScriptOpcodes.POW) { // L: 3708
				Interpreter.Interpreter_intStackSize -= 2; // L: 3709
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3710
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3711
				if (var9 == 0) { // L: 3712
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3713
				}

				return 1; // L: 3714
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3716
				Interpreter.Interpreter_intStackSize -= 2; // L: 3717
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3718
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3719
				if (var9 == 0) { // L: 3720
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3721
					return 1; // L: 3722
				} else {
					switch(var4) { // L: 3724
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3732
						break; // L: 3733
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3752
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3742
						break; // L: 3743
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3727
						break;
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3747
						break; // L: 3748
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3737
					}

					return 1; // L: 3756
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3758
				Interpreter.Interpreter_intStackSize -= 2; // L: 3759
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3760
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3761
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3762
				return 1; // L: 3763
			} else if (var0 == ScriptOpcodes.OR) { // L: 3765
				Interpreter.Interpreter_intStackSize -= 2; // L: 3766
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3767
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3768
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3769
				return 1; // L: 3770
			} else if (var0 == 4016) { // L: 3772
				Interpreter.Interpreter_intStackSize -= 2; // L: 3773
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3774
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3775
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3776
				return 1; // L: 3777
			} else if (var0 == 4017) { // L: 3779
				Interpreter.Interpreter_intStackSize -= 2; // L: 3780
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3781
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3782
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3783
				return 1; // L: 3784
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3786
				Interpreter.Interpreter_intStackSize -= 3; // L: 3787
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3788
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3789
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3790
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3791
				return 1; // L: 3792
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3794
				var9 = class333.method6389(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3795
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3796
				return 1; // L: 3797
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3799
				Interpreter.Interpreter_intStackSize -= 2; // L: 3800
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3801
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3802
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3803
				return 1; // L: 3804
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3806
				Interpreter.Interpreter_intStackSize -= 3; // L: 3807
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3808
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3809
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3810
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class94.method2452(var9, var4, var5); // L: 3811
				return 1; // L: 3812
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3814
				Interpreter.Interpreter_intStackSize -= 3; // L: 3815
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3816
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3817
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3818
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.method1107(var9, var4, var5); // L: 3819
				return 1; // L: 3820
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3822
				Interpreter.Interpreter_intStackSize -= 3; // L: 3823
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3824
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3825
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3826
				var6 = 31 - var5; // L: 3827
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6; // L: 3828
				return 1; // L: 3829
			} else if (var0 == 4030) { // L: 3831
				Interpreter.Interpreter_intStackSize -= 4; // L: 3832
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3833
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3834
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3835
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3836
				var9 = Decimator.method1107(var9, var5, var6); // L: 3837
				var7 = class315.method6060(var6 - var5 + 1); // L: 3838
				if (var4 > var7) { // L: 3839
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3840
				return 1; // L: 3841
			} else if (var0 == 4032) { // L: 3843
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class307.method6031(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3844
				return 1; // L: 3845
			} else if (var0 == 4033) { // L: 3847
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = SoundCache.method830(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3848
				return 1; // L: 3849
			} else if (var0 == 4034) { // L: 3851
				Interpreter.Interpreter_intStackSize -= 2; // L: 3852
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3853
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3854
				var5 = class409.method7645(var9, var4); // L: 3855
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3856
				return 1; // L: 3857
			} else if (var0 == 4035) { // L: 3859
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3860
				return 1; // L: 3861
			} else if (var0 == 4036) { // L: 3863
				String var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 3864
				var4 = -1; // L: 3865
				if (WallObject.isNumber(var3)) { // L: 3866
					var4 = class129.method3066(var3); // L: 3867
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3869
				return 1; // L: 3870
			} else {
				return 2; // L: 3872
			}
		}
	}
}
