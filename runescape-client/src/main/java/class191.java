import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
public class class191 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field1979;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;

	static {
		field1979 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-236515639"
	)
	static final void method3716(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) { // L: 154
			for (int var4 = 0; var4 < 8; ++var4) { // L: 155
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) { // L: 157
			for (var3 = 1; var3 < 8; ++var3) { // L: 158
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) { // L: 160
			for (var3 = 1; var3 < 8; ++var3) { // L: 161
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) { // L: 163
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) { // L: 164
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) { // L: 165
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	} // L: 166

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "555486507"
	)
	static int method3713(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3627
			class19.Interpreter_intStackSize -= 2; // L: 3628
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3629
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3630
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 + var4; // L: 3631
			return 1; // L: 3632
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3634
			class19.Interpreter_intStackSize -= 2; // L: 3635
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3636
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3637
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 - var4; // L: 3638
			return 1; // L: 3639
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3641
			class19.Interpreter_intStackSize -= 2; // L: 3642
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3643
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3644
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 * var4; // L: 3645
			return 1; // L: 3646
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3648
			class19.Interpreter_intStackSize -= 2; // L: 3649
			var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3650
			var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3651
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 / var4; // L: 3652
			return 1; // L: 3653
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3655
			var9 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3656
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3657
			return 1; // L: 3658
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3660
			var9 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3661
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3662
			return 1; // L: 3663
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3665
				class19.Interpreter_intStackSize -= 5; // L: 3666
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3667
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3668
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3669
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 3670
				var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 4]; // L: 3671
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3672
				return 1; // L: 3673
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3675
				class19.Interpreter_intStackSize -= 2; // L: 3676
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3677
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3678
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3679
				return 1; // L: 3680
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3682
				class19.Interpreter_intStackSize -= 2; // L: 3683
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3684
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3685
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3686
				return 1; // L: 3687
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3689
				class19.Interpreter_intStackSize -= 2; // L: 3690
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3691
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3692
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3693
				return 1; // L: 3694
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3696
				class19.Interpreter_intStackSize -= 2; // L: 3697
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3698
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3699
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3700
				return 1; // L: 3701
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3703
				class19.Interpreter_intStackSize -= 2; // L: 3704
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3705
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3706
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 % var4; // L: 3707
				return 1; // L: 3708
			} else if (var0 == ScriptOpcodes.POW) { // L: 3710
				class19.Interpreter_intStackSize -= 2; // L: 3711
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3712
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3713
				if (var9 == 0) { // L: 3714
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3715
				}

				return 1; // L: 3716
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3718
				class19.Interpreter_intStackSize -= 2; // L: 3719
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3720
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3721
				if (var9 == 0) { // L: 3722
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3723
					return 1; // L: 3724
				} else {
					switch(var4) { // L: 3726
					case 0:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3729
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9; // L: 3749
						break; // L: 3750
					case 2:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3754
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3744
						break; // L: 3745
					case 4:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3739
						break; // L: 3740
					default:
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3734
					}

					return 1; // L: 3758
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3760
				class19.Interpreter_intStackSize -= 2; // L: 3761
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3762
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3763
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 & var4; // L: 3764
				return 1; // L: 3765
			} else if (var0 == ScriptOpcodes.OR) { // L: 3767
				class19.Interpreter_intStackSize -= 2; // L: 3768
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3769
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3770
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 | var4; // L: 3771
				return 1; // L: 3772
			} else if (var0 == 4016) { // L: 3774
				class19.Interpreter_intStackSize -= 2; // L: 3775
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3776
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3777
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3778
				return 1; // L: 3779
			} else if (var0 == 4017) { // L: 3781
				class19.Interpreter_intStackSize -= 2; // L: 3782
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3783
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3784
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3785
				return 1; // L: 3786
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3788
				class19.Interpreter_intStackSize -= 3; // L: 3789
				long var10 = (long)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3790
				long var12 = (long)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3791
				long var14 = (long)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3792
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3793
				return 1; // L: 3794
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3796
				var9 = class90.method2322(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 3797
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9; // L: 3798
				return 1; // L: 3799
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3801
				class19.Interpreter_intStackSize -= 2; // L: 3802
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3803
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3804
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3805
				return 1; // L: 3806
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3808
				class19.Interpreter_intStackSize -= 3; // L: 3809
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3810
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3811
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3812
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class106.method2696(var9, var4, var5); // L: 3813
				return 1; // L: 3814
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3816
				class19.Interpreter_intStackSize -= 3; // L: 3817
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3818
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3819
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3820
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class73.method2084(var9, var4, var5); // L: 3821
				return 1; // L: 3822
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3824
				class19.Interpreter_intStackSize -= 3; // L: 3825
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3826
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3827
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3828
				var6 = 31 - var5; // L: 3829
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3830
				return 1; // L: 3831
			} else if (var0 == 4030) { // L: 3833
				class19.Interpreter_intStackSize -= 4; // L: 3834
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3835
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3836
				var5 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 3837
				var6 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 3]; // L: 3838
				var9 = class73.method2084(var9, var5, var6); // L: 3839
				var7 = class75.method2089(var6 - var5 + 1); // L: 3840
				if (var4 > var7) { // L: 3841
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3842
				return 1; // L: 3843
			} else if (var0 == 4032) { // L: 3845
				Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = BuddyRankComparator.method2933(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]); // L: 3846
				return 1; // L: 3847
			} else if (var0 == 4033) { // L: 3849
				Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = class243.method4661(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]); // L: 3850
				return 1; // L: 3851
			} else if (var0 == 4034) { // L: 3853
				class19.Interpreter_intStackSize -= 2; // L: 3854
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3855
				var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3856
				var5 = class471.method8475(var9, var4); // L: 3857
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5; // L: 3858
				return 1; // L: 3859
			} else if (var0 == 4035) { // L: 3861
				Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]); // L: 3862
				return 1; // L: 3863
			} else if (var0 == 4036) { // L: 3865
				String var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3866
				var4 = -1; // L: 3867
				if (CollisionMap.isNumber(var3)) { // L: 3868
					var4 = KitDefinition.method3778(var3); // L: 3869
				}

				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4; // L: 3871
				return 1; // L: 3872
			} else {
				return 2; // L: 3874
			}
		}
	}
}
