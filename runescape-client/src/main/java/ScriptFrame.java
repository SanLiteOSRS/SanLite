import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("vy")
	static Iterator field450;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -243693225
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ac")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ab")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "1931889583"
	)
	static int method1152(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3507
			Interpreter.Interpreter_intStackSize -= 2; // L: 3508
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3509
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3510
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3511
			return 1; // L: 3512
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3514
			Interpreter.Interpreter_intStackSize -= 2; // L: 3515
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3516
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3517
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3518
			return 1; // L: 3519
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3521
			Interpreter.Interpreter_intStackSize -= 2; // L: 3522
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3523
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3524
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9; // L: 3525
			return 1; // L: 3526
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3528
			Interpreter.Interpreter_intStackSize -= 2; // L: 3529
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3530
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3531
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3532
			return 1; // L: 3533
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3535
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3536
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3537
			return 1; // L: 3538
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3540
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3541
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3542
			return 1; // L: 3543
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3545
				Interpreter.Interpreter_intStackSize -= 5; // L: 3546
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3547
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3548
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3549
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3550
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3551
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3552
				return 1; // L: 3553
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3555
				Interpreter.Interpreter_intStackSize -= 2; // L: 3556
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3557
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3558
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3559
				return 1; // L: 3560
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3562
				Interpreter.Interpreter_intStackSize -= 2; // L: 3563
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3564
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3565
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3566
				return 1; // L: 3567
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3569
				Interpreter.Interpreter_intStackSize -= 2; // L: 3570
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3571
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3572
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3573
				return 1; // L: 3574
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3576
				Interpreter.Interpreter_intStackSize -= 2; // L: 3577
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3578
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3579
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3580
				return 1; // L: 3581
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3583
				Interpreter.Interpreter_intStackSize -= 2; // L: 3584
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3585
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3586
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3587
				return 1; // L: 3588
			} else if (var0 == ScriptOpcodes.POW) { // L: 3590
				Interpreter.Interpreter_intStackSize -= 2; // L: 3591
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3592
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3593
				if (var9 == 0) { // L: 3594
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3595
				}

				return 1; // L: 3596
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3598
				Interpreter.Interpreter_intStackSize -= 2; // L: 3599
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3600
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3601
				if (var9 == 0) { // L: 3602
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3603
					return 1; // L: 3604
				} else {
					switch(var4) { // L: 3606
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3629
						break; // L: 3630
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3614
						break; // L: 3615
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3624
						break; // L: 3625
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3619
						break; // L: 3620
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3634
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3609
					}

					return 1; // L: 3638
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3640
				Interpreter.Interpreter_intStackSize -= 2; // L: 3641
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3642
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3643
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3644
				return 1; // L: 3645
			} else if (var0 == ScriptOpcodes.OR) { // L: 3647
				Interpreter.Interpreter_intStackSize -= 2; // L: 3648
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3649
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3650
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3651
				return 1; // L: 3652
			} else if (var0 == 4016) { // L: 3654
				Interpreter.Interpreter_intStackSize -= 2; // L: 3655
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3656
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3657
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3658
				return 1; // L: 3659
			} else if (var0 == 4017) { // L: 3661
				Interpreter.Interpreter_intStackSize -= 2; // L: 3662
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3663
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3664
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3665
				return 1; // L: 3666
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3668
				Interpreter.Interpreter_intStackSize -= 3; // L: 3669
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3670
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3671
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3672
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12); // L: 3673
				return 1; // L: 3674
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3676
				var9 = class287.method5476(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3677
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3678
				return 1; // L: 3679
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3681
				Interpreter.Interpreter_intStackSize -= 2; // L: 3682
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3683
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3684
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3685
				return 1; // L: 3686
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3688
				Interpreter.Interpreter_intStackSize -= 3; // L: 3689
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3690
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3691
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3692
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class331.method6351(var9, var4, var5); // L: 3693
				return 1; // L: 3694
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3696
				Interpreter.Interpreter_intStackSize -= 3; // L: 3697
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3698
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3699
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3700
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator8.method2849(var9, var4, var5); // L: 3701
				return 1; // L: 3702
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3704
				Interpreter.Interpreter_intStackSize -= 3; // L: 3705
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3706
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3707
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3708
				var6 = 31 - var5; // L: 3709
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6; // L: 3710
				return 1; // L: 3711
			} else if (var0 == 4030) { // L: 3713
				Interpreter.Interpreter_intStackSize -= 4; // L: 3714
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3715
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3716
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3717
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3718
				var9 = UserComparator8.method2849(var9, var5, var6); // L: 3719
				var7 = class206.method4069(var6 - var5 + 1); // L: 3720
				if (var4 > var7) { // L: 3721
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3722
				return 1; // L: 3723
			} else if (var0 == 4032) { // L: 3725
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = SequenceDefinition.method4012(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3726
				return 1; // L: 3727
			} else if (var0 == 4033) { // L: 3729
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = NPC.method2622(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3730
				return 1; // L: 3731
			} else if (var0 == 4034) { // L: 3733
				Interpreter.Interpreter_intStackSize -= 2; // L: 3734
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3735
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3736
				var5 = WorldMapRegion.method4951(var9, var4); // L: 3737
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3738
				return 1; // L: 3739
			} else if (var0 == 4035) { // L: 3741
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3742
				return 1; // L: 3743
			} else if (var0 == 4036) { // L: 3745
				String var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3746
				var4 = -1; // L: 3747
				if (class162.isNumber(var3)) { // L: 3748
					var4 = GrandExchangeEvent.method6573(var3); // L: 3749
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3751
				return 1; // L: 3752
			} else {
				return 2; // L: 3754
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "124991534"
	)
	static int method1154(int var0, Script var1, boolean var2) {
		return 2; // L: 5023
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1564152216"
	)
	static final void method1153(int var0) {
		if (var0 >= 0) { // L: 8848
			int var1 = Client.menuArguments1[var0]; // L: 8849
			int var2 = Client.menuArguments2[var0]; // L: 8850
			int var3 = Client.menuOpcodes[var0]; // L: 8851
			int var4 = Client.menuIdentifiers[var0]; // L: 8852
			int var5 = Client.field628[var0]; // L: 8853
			String var6 = Client.menuActions[var0]; // L: 8854
			String var7 = Client.menuTargets[var0]; // L: 8855
			class287.method5475(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8856
		}
	} // L: 8857
}
