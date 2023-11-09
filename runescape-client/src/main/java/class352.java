import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("np")
public enum class352 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4228(-1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4226(0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4225(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4224(2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1651266547
	)
	final int field4227;

	class352(int var3) {
		this.field4227 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4227; // L: 20
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "1"
	)
	static int method6623(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3579
			SoundCache.Interpreter_intStackSize -= 2; // L: 3580
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3581
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3582
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + var4; // L: 3583
			return 1; // L: 3584
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3586
			SoundCache.Interpreter_intStackSize -= 2; // L: 3587
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3588
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3589
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 - var4; // L: 3590
			return 1; // L: 3591
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3593
			SoundCache.Interpreter_intStackSize -= 2; // L: 3594
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3595
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3596
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 * var4; // L: 3597
			return 1; // L: 3598
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3600
			SoundCache.Interpreter_intStackSize -= 2; // L: 3601
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3602
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3603
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 / var4; // L: 3604
			return 1; // L: 3605
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3607
			var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3608
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3609
			return 1; // L: 3610
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3612
			var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3613
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3614
			return 1; // L: 3615
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3617
				SoundCache.Interpreter_intStackSize -= 5; // L: 3618
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3619
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3620
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3621
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 3622
				var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4]; // L: 3623
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3624
				return 1; // L: 3625
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3627
				SoundCache.Interpreter_intStackSize -= 2; // L: 3628
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3629
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3630
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3631
				return 1; // L: 3632
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3634
				SoundCache.Interpreter_intStackSize -= 2; // L: 3635
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3636
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3637
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3638
				return 1; // L: 3639
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3641
				SoundCache.Interpreter_intStackSize -= 2; // L: 3642
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3643
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3644
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3645
				return 1; // L: 3646
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3648
				SoundCache.Interpreter_intStackSize -= 2; // L: 3649
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3650
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3651
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3652
				return 1; // L: 3653
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3655
				SoundCache.Interpreter_intStackSize -= 2; // L: 3656
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3657
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3658
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 % var4; // L: 3659
				return 1; // L: 3660
			} else if (var0 == ScriptOpcodes.POW) { // L: 3662
				SoundCache.Interpreter_intStackSize -= 2; // L: 3663
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3664
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3665
				if (var9 == 0) { // L: 3666
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3667
				}

				return 1; // L: 3668
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3670
				SoundCache.Interpreter_intStackSize -= 2; // L: 3671
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3672
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3673
				if (var9 == 0) { // L: 3674
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3675
					return 1; // L: 3676
				} else {
					switch(var4) { // L: 3678
					case 0:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3681
						break;
					case 1:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9; // L: 3691
						break; // L: 3692
					case 2:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3706
						break;
					case 3:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3686
						break; // L: 3687
					case 4:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3701
						break; // L: 3702
					default:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3696
					}

					return 1; // L: 3710
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3712
				SoundCache.Interpreter_intStackSize -= 2; // L: 3713
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3714
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3715
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 & var4; // L: 3716
				return 1; // L: 3717
			} else if (var0 == ScriptOpcodes.OR) { // L: 3719
				SoundCache.Interpreter_intStackSize -= 2; // L: 3720
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3721
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3722
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | var4; // L: 3723
				return 1; // L: 3724
			} else if (var0 == 4016) { // L: 3726
				SoundCache.Interpreter_intStackSize -= 2; // L: 3727
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3728
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3729
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3730
				return 1; // L: 3731
			} else if (var0 == 4017) { // L: 3733
				SoundCache.Interpreter_intStackSize -= 2; // L: 3734
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3735
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3736
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3737
				return 1; // L: 3738
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3740
				SoundCache.Interpreter_intStackSize -= 3; // L: 3741
				long var10 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3742
				long var12 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3743
				long var14 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3744
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3745
				return 1; // L: 3746
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3748
				var9 = PacketBufferNode.method5706(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 3749
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9; // L: 3750
				return 1; // L: 3751
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3753
				SoundCache.Interpreter_intStackSize -= 2; // L: 3754
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3755
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3756
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3757
				return 1; // L: 3758
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3760
				SoundCache.Interpreter_intStackSize -= 3; // L: 3761
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3762
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3763
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3764
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Widget.method6533(var9, var4, var5); // L: 3765
				return 1; // L: 3766
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3768
				SoundCache.Interpreter_intStackSize -= 3; // L: 3769
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3770
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3771
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3772
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.method3563(var9, var4, var5); // L: 3773
				return 1; // L: 3774
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3776
				SoundCache.Interpreter_intStackSize -= 3; // L: 3777
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3778
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3779
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3780
				var6 = 31 - var5; // L: 3781
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3782
				return 1; // L: 3783
			} else if (var0 == 4030) { // L: 3785
				SoundCache.Interpreter_intStackSize -= 4; // L: 3786
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3787
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3788
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 3789
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3]; // L: 3790
				var9 = InvDefinition.method3563(var9, var5, var6); // L: 3791
				var7 = Projectile.method2147(var6 - var5 + 1); // L: 3792
				if (var4 > var7) { // L: 3793
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3794
				return 1; // L: 3795
			} else if (var0 == 4032) { // L: 3797
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = Frames.method4722(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]); // L: 3798
				return 1; // L: 3799
			} else if (var0 == 4033) { // L: 3801
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = class406.method7613(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]); // L: 3802
				return 1; // L: 3803
			} else if (var0 == 4034) { // L: 3805
				SoundCache.Interpreter_intStackSize -= 2; // L: 3806
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3807
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3808
				var5 = class350.method6620(var9, var4); // L: 3809
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5; // L: 3810
				return 1; // L: 3811
			} else if (var0 == 4035) { // L: 3813
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]); // L: 3814
				return 1; // L: 3815
			} else if (var0 == 4036) { // L: 3817
				String var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3818
				var4 = -1; // L: 3819
				if (class218.isNumber(var3)) { // L: 3820
					var4 = HealthBarUpdate.method2412(var3); // L: 3821
				}

				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4; // L: 3823
				return 1; // L: 3824
			} else {
				return 2; // L: 3826
			}
		}
	}
}
