import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nf")
public final class class358 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "10"
	)
	public static int method6929(int var0, int var1, int var2) {
		int var3 = SpotAnimationDefinition.method3814(var2 - var1 + 1); // L: 45
		var3 <<= var1; // L: 46
		var0 |= var3; // L: 47
		return var0; // L: 48
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-40"
	)
	static int method6930(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3625
			UserComparator6.Interpreter_intStackSize -= 2; // L: 3626
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3627
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3628
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 + var9; // L: 3629
			return 1; // L: 3630
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3632
			UserComparator6.Interpreter_intStackSize -= 2; // L: 3633
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3634
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3635
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 - var4; // L: 3636
			return 1; // L: 3637
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3639
			UserComparator6.Interpreter_intStackSize -= 2; // L: 3640
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3641
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3642
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 * var9; // L: 3643
			return 1; // L: 3644
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3646
			UserComparator6.Interpreter_intStackSize -= 2; // L: 3647
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3648
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3649
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 / var4; // L: 3650
			return 1; // L: 3651
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3653
			var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3654
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3655
			return 1; // L: 3656
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3658
			var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3659
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3660
			return 1; // L: 3661
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3663
				UserComparator6.Interpreter_intStackSize -= 5; // L: 3664
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3665
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3666
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3667
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 3668
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4]; // L: 3669
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3670
				return 1; // L: 3671
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3673
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3674
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3675
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3676
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3677
				return 1; // L: 3678
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3680
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3681
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3682
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3683
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3684
				return 1; // L: 3685
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3687
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3688
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3689
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3690
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3691
				return 1; // L: 3692
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3694
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3695
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3696
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3697
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3698
				return 1; // L: 3699
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3701
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3702
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3703
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3704
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 % var4; // L: 3705
				return 1; // L: 3706
			} else if (var0 == ScriptOpcodes.POW) { // L: 3708
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3709
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3710
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3711
				if (var9 == 0) { // L: 3712
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3713
				}

				return 1; // L: 3714
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3716
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3717
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3718
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3719
				if (var9 == 0) { // L: 3720
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3721
					return 1; // L: 3722
				} else {
					switch(var4) { // L: 3724
					case 0:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3732
						break; // L: 3733
					case 1:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9; // L: 3742
						break; // L: 3743
					case 2:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3727
						break;
					case 3:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3737
						break; // L: 3738
					case 4:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3747
						break; // L: 3748
					default:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3752
					}

					return 1; // L: 3756
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3758
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3759
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3760
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3761
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 & var4; // L: 3762
				return 1; // L: 3763
			} else if (var0 == ScriptOpcodes.OR) { // L: 3765
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3766
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3767
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3768
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | var4; // L: 3769
				return 1; // L: 3770
			} else if (var0 == 4016) { // L: 3772
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3773
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3774
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3775
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3776
				return 1; // L: 3777
			} else if (var0 == 4017) { // L: 3779
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3780
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3781
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3782
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3783
				return 1; // L: 3784
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3786
				UserComparator6.Interpreter_intStackSize -= 3; // L: 3787
				long var10 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3788
				long var12 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3789
				long var14 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3790
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3791
				return 1; // L: 3792
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3794
				var9 = class295.method5903(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 3795
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9; // L: 3796
				return 1; // L: 3797
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3799
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3800
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3801
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3802
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3803
				return 1; // L: 3804
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3806
				UserComparator6.Interpreter_intStackSize -= 3; // L: 3807
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3808
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3809
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3810
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = method6929(var9, var4, var5); // L: 3811
				return 1; // L: 3812
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3814
				UserComparator6.Interpreter_intStackSize -= 3; // L: 3815
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3816
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3817
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3818
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class169.method3550(var9, var4, var5); // L: 3819
				return 1; // L: 3820
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3822
				UserComparator6.Interpreter_intStackSize -= 3; // L: 3823
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3824
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3825
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3826
				var6 = 31 - var5; // L: 3827
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3828
				return 1; // L: 3829
			} else if (var0 == 4030) { // L: 3831
				UserComparator6.Interpreter_intStackSize -= 4; // L: 3832
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3833
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3834
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 3835
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 3836
				var9 = class169.method3550(var9, var5, var6); // L: 3837
				var7 = SpotAnimationDefinition.method3814(var6 - var5 + 1); // L: 3838
				if (var4 > var7) { // L: 3839
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3840
				return 1; // L: 3841
			} else if (var0 == 4032) { // L: 3843
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class172.method3570(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]); // L: 3844
				return 1; // L: 3845
			} else if (var0 == 4033) { // L: 3847
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class316.method6013(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]); // L: 3848
				return 1; // L: 3849
			} else if (var0 == 4034) { // L: 3851
				UserComparator6.Interpreter_intStackSize -= 2; // L: 3852
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3853
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3854
				var5 = Widget.method6843(var9, var4); // L: 3855
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5; // L: 3856
				return 1; // L: 3857
			} else if (var0 == 4035) { // L: 3859
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]); // L: 3860
				return 1; // L: 3861
			} else if (var0 == 4036) { // L: 3863
				String var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3864
				var4 = -1; // L: 3865
				if (Login.isNumber(var3)) { // L: 3866
					var4 = HealthBar.method2644(var3); // L: 3867
				}

				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4; // L: 3869
				return 1; // L: 3870
			} else {
				return 2; // L: 3872
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldn;III)V",
		garbageValue = "-1743578094"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4557
			int var3 = class9.SequenceDefinition_get(var1).field2246; // L: 4558
			if (var3 == 1) { // L: 4559
				var0.sequenceFrame = 0; // L: 4560
				var0.sequenceFrameCycle = 0; // L: 4561
				var0.sequenceDelay = var2; // L: 4562
				var0.field1220 = 0; // L: 4563
			}

			if (var3 == 2) { // L: 4565
				var0.field1220 = 0; // L: 4566
			}
		} else if (var1 == -1 || var0.sequence == -1 || class9.SequenceDefinition_get(var1).field2220 >= class9.SequenceDefinition_get(var0.sequence).field2220) { // L: 4569
			var0.sequence = var1; // L: 4570
			var0.sequenceFrame = 0; // L: 4571
			var0.sequenceFrameCycle = 0; // L: 4572
			var0.sequenceDelay = var2; // L: 4573
			var0.field1220 = 0; // L: 4574
			var0.field1215 = var0.pathLength; // L: 4575
		}

	} // L: 4577
}
