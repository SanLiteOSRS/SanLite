import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tt")
public class class502 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	public static final class502 field5037;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	public static final class502 field5031;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	public static final class502 field5034;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -1597923649
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1748590617
	)
	public final int field5036;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 712733929
	)
	public final int field5030;
	@ObfuscatedName("ap")
	public final Class field5035;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	final class498 field5032;

	static {
		field5037 = new class502(1, 0, Integer.class, new class499()); // L: 10
		field5031 = new class502(0, 1, Long.class, new class501());
		field5034 = new class502(2, 2, String.class, new class503()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltx;)V"
	)
	class502(int var1, int var2, Class var3, class498 var4) {
		this.field5036 = var1; // L: 62
		this.field5030 = var2; // L: 63
		this.field5035 = var3; // L: 64
		this.field5032 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5030;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)Ljava/lang/Object;",
		garbageValue = "24"
	)
	public Object method8895(Buffer var1) {
		return this.field5032.vmethod8919(var1); // L: 100
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-29"
	)
	public static int method8917(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 24
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)[Ltt;",
		garbageValue = "51"
	)
	public static class502[] method8908() {
		return new class502[]{field5037, field5031, field5034}; // L: 58
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1275294441"
	)
	public static void method8897() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 96
	} // L: 97

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Ltt;",
		garbageValue = "-851669518"
	)
	public static class502 method8891(Class var0) {
		class502[] var1 = method8908(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class502 var3 = var1[var2]; // L: 72
			if (var3.field5035 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltl;I)V",
		garbageValue = "1375975980"
	)
	public static void method8892(Object var0, Buffer var1) {
		class498 var2 = method8910(var0.getClass()); // L: 83
		var2.vmethod8920(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Ltx;",
		garbageValue = "783801864"
	)
	static class498 method8910(Class var0) {
		class502 var1 = method8891(var0); // L: 89
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 90
		} else {
			return var1.field5032; // L: 91
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZS)I",
		garbageValue = "-16644"
	)
	static int method8909(int var0, Script var1, boolean var2) {
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
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4; // L: 3594
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
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5); // L: 3621
				return 1; // L: 3622
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3624
				Interpreter.Interpreter_intStackSize -= 2; // L: 3625
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3626
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3627
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3628
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
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3678
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3703
						break;
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3698
						break; // L: 3699
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3683
						break; // L: 3684
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3688
						break; // L: 3689
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3693
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
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3742
				return 1; // L: 3743
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3745
				var9 = class139.method3174(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3746
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
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class33.method503(var9, var4, var5); // L: 3762
				return 1; // L: 3763
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3765
				Interpreter.Interpreter_intStackSize -= 3; // L: 3766
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3767
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3768
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3769
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapEvent.method5678(var9, var4, var5); // L: 3770
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
				var9 = WorldMapEvent.method5678(var9, var5, var6); // L: 3788
				var7 = class217.method4380(var6 - var5 + 1); // L: 3789
				if (var4 > var7) { // L: 3790
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3791
				return 1; // L: 3792
			} else if (var0 == 4032) { // L: 3794
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Buddy.method8045(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3795
				return 1; // L: 3796
			} else if (var0 == 4033) { // L: 3798
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Actor.method2448(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3799
				return 1; // L: 3800
			} else if (var0 == 4034) { // L: 3802
				Interpreter.Interpreter_intStackSize -= 2; // L: 3803
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3804
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3805
				var5 = method8917(var9, var4); // L: 3806
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3807
				return 1; // L: 3808
			} else if (var0 == 4035) { // L: 3810
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3811
				return 1; // L: 3812
			} else if (var0 == 4036) { // L: 3814
				String var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3815
				var4 = -1; // L: 3816
				if (class194.isNumber(var3)) { // L: 3817
					var4 = class317.method6078(var3); // L: 3818
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3820
				return 1; // L: 3821
			} else {
				return 2; // L: 3823
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lng;",
		garbageValue = "1778574114"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2007
		if (JagexCache.JagexCache_dat2File != null) { // L: 2008
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, GrandExchangeOfferOwnWorldComparator.JagexCache_idxFiles[var0], 1000000); // L: 2009
		}

		return new Archive(var5, class419.field4580, class101.field1332, var0, var1, var2, var3, var4); // L: 2011
	}
}
