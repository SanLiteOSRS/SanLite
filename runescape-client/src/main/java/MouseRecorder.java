import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("de")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("wo")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("aw")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ay")
	@Export("lock")
	Object lock;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1880415427
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("as")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("aj")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class13.method180(50L)) { // L: 18
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;III)Luu;",
		garbageValue = "-1148229033"
	)
	static IndexedSprite method2298(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			VarbitComposition.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		return !var3 ? null : Script.method2172(); // L: 33 34
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lmt;",
		garbageValue = "-365664003"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = VarbitComposition.getWidget(var0); // L: 235
		if (var1 == -1) { // L: 236
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 237 238
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1818117868"
	)
	public static int method2292(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 41
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 42
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 43
		var0 += var0 >>> 8; // L: 44
		var0 += var0 >>> 16; // L: 45
		return var0 & 255; // L: 46
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1736369402"
	)
	static int method2297(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3576
			Interpreter.Interpreter_intStackSize -= 2; // L: 3577
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3578
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3579
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3580
			return 1; // L: 3581
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3583
			Interpreter.Interpreter_intStackSize -= 2; // L: 3584
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3585
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3586
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3587
			return 1; // L: 3588
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3590
			Interpreter.Interpreter_intStackSize -= 2; // L: 3591
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3592
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3593
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9; // L: 3594
			return 1; // L: 3595
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3597
			Interpreter.Interpreter_intStackSize -= 2; // L: 3598
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3599
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3600
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3601
			return 1; // L: 3602
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3604
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3605
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3606
			return 1; // L: 3607
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3609
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3610
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3611
			return 1; // L: 3612
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3614
				Interpreter.Interpreter_intStackSize -= 5; // L: 3615
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3616
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3617
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3618
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3619
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3620
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3621
				return 1; // L: 3622
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3624
				Interpreter.Interpreter_intStackSize -= 2; // L: 3625
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3626
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3627
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3628
				return 1; // L: 3629
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3631
				Interpreter.Interpreter_intStackSize -= 2; // L: 3632
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3633
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3634
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3635
				return 1; // L: 3636
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3638
				Interpreter.Interpreter_intStackSize -= 2; // L: 3639
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3640
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3641
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3642
				return 1; // L: 3643
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3645
				Interpreter.Interpreter_intStackSize -= 2; // L: 3646
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3647
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3648
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3649
				return 1; // L: 3650
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3652
				Interpreter.Interpreter_intStackSize -= 2; // L: 3653
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3654
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3655
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3656
				return 1; // L: 3657
			} else if (var0 == ScriptOpcodes.POW) { // L: 3659
				Interpreter.Interpreter_intStackSize -= 2; // L: 3660
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3661
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3662
				if (var9 == 0) { // L: 3663
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3664
				}

				return 1; // L: 3665
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3667
				Interpreter.Interpreter_intStackSize -= 2; // L: 3668
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3669
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3670
				if (var9 == 0) { // L: 3671
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3672
					return 1; // L: 3673
				} else {
					switch(var4) { // L: 3675
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3683
						break; // L: 3684
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3678
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3693
						break; // L: 3694
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3688
						break; // L: 3689
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3698
						break; // L: 3699
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3703
					}

					return 1; // L: 3707
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3709
				Interpreter.Interpreter_intStackSize -= 2; // L: 3710
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3711
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3712
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3713
				return 1; // L: 3714
			} else if (var0 == ScriptOpcodes.OR) { // L: 3716
				Interpreter.Interpreter_intStackSize -= 2; // L: 3717
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3718
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3719
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3720
				return 1; // L: 3721
			} else if (var0 == 4016) { // L: 3723
				Interpreter.Interpreter_intStackSize -= 2; // L: 3724
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3725
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3726
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3727
				return 1; // L: 3728
			} else if (var0 == 4017) { // L: 3730
				Interpreter.Interpreter_intStackSize -= 2; // L: 3731
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3732
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3733
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3734
				return 1; // L: 3735
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3737
				Interpreter.Interpreter_intStackSize -= 3; // L: 3738
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3739
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3740
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3741
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3742
				return 1; // L: 3743
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3745
				var9 = method2292(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3746
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3747
				return 1; // L: 3748
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3750
				Interpreter.Interpreter_intStackSize -= 2; // L: 3751
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3752
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3753
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3754
				return 1; // L: 3755
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3757
				Interpreter.Interpreter_intStackSize -= 3; // L: 3758
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3759
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3760
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3761
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class232.method4739(var9, var4, var5); // L: 3762
				return 1; // L: 3763
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3765
				Interpreter.Interpreter_intStackSize -= 3; // L: 3766
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3767
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3768
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3769
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KeyHandler.method431(var9, var4, var5); // L: 3770
				return 1; // L: 3771
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3773
				Interpreter.Interpreter_intStackSize -= 3; // L: 3774
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3775
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3776
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3777
				var6 = 31 - var5; // L: 3778
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3779
				return 1; // L: 3780
			} else if (var0 == 4030) { // L: 3782
				Interpreter.Interpreter_intStackSize -= 4; // L: 3783
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3784
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3785
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3786
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3787
				var9 = KeyHandler.method431(var9, var5, var6); // L: 3788
				var7 = class228.method4505(var6 - var5 + 1); // L: 3789
				if (var4 > var7) { // L: 3790
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3791
				return 1; // L: 3792
			} else if (var0 == 4032) { // L: 3794
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = TriBool.method8079(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3795
				return 1; // L: 3796
			} else if (var0 == 4033) { // L: 3798
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = AbstractSocket.method8104(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3799
				return 1; // L: 3800
			} else if (var0 == 4034) { // L: 3802
				Interpreter.Interpreter_intStackSize -= 2; // L: 3803
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3804
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3805
				var5 = GrandExchangeOfferUnitPriceComparator.method6962(var9, var4); // L: 3806
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3807
				return 1; // L: 3808
			} else if (var0 == 4035) { // L: 3810
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3811
				return 1; // L: 3812
			} else if (var0 == 4036) { // L: 3814
				String var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3815
				var4 = -1; // L: 3816
				if (Skeleton.isNumber(var3)) { // L: 3817
					var4 = class306.method5811(var3); // L: 3818
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3820
				return 1; // L: 3821
			} else {
				return 2; // L: 3823
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1998229147"
	)
	static int method2295(int var0, Script var1, boolean var2) {
		return 2; // L: 5092
	}
}
