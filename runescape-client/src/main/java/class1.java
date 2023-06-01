import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
public class class1 implements Callable {
	@ObfuscatedName("ad")
	public static short[] field3;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	final Buffer field1;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laj;Ltc;Lab;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod11(this.field1); // L: 54
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "237604772"
	)
	public static final void method7(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field279 = var0; // L: 50
			PcmPlayer.PcmPlayer_stereo = var1; // L: 51
			class167.field1793 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-2066838705"
	)
	static int method9(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3537
			class336.Interpreter_intStackSize -= 2; // L: 3538
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3539
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3540
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 + var4; // L: 3541
			return 1; // L: 3542
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3544
			class336.Interpreter_intStackSize -= 2; // L: 3545
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3546
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3547
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 - var4; // L: 3548
			return 1; // L: 3549
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3551
			class336.Interpreter_intStackSize -= 2; // L: 3552
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3553
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3554
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 * var4; // L: 3555
			return 1; // L: 3556
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3558
			class336.Interpreter_intStackSize -= 2; // L: 3559
			var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3560
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3561
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 / var4; // L: 3562
			return 1; // L: 3563
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3565
			var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3566
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3567
			return 1; // L: 3568
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3570
			var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3571
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3572
			return 1; // L: 3573
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3575
				class336.Interpreter_intStackSize -= 5; // L: 3576
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3577
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3578
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3579
				var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 3580
				var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 4]; // L: 3581
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3582
				return 1; // L: 3583
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3585
				class336.Interpreter_intStackSize -= 2; // L: 3586
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3587
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3588
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 3589
				return 1; // L: 3590
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3592
				class336.Interpreter_intStackSize -= 2; // L: 3593
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3594
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3595
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3596
				return 1; // L: 3597
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3599
				class336.Interpreter_intStackSize -= 2; // L: 3600
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3601
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3602
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3603
				return 1; // L: 3604
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3606
				class336.Interpreter_intStackSize -= 2; // L: 3607
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3608
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3609
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3610
				return 1; // L: 3611
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3613
				class336.Interpreter_intStackSize -= 2; // L: 3614
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3615
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3616
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 % var4; // L: 3617
				return 1; // L: 3618
			} else if (var0 == ScriptOpcodes.POW) { // L: 3620
				class336.Interpreter_intStackSize -= 2; // L: 3621
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3622
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3623
				if (var9 == 0) { // L: 3624
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3625
				}

				return 1; // L: 3626
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3628
				class336.Interpreter_intStackSize -= 2; // L: 3629
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3630
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3631
				if (var9 == 0) { // L: 3632
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3633
					return 1; // L: 3634
				} else {
					switch(var4) { // L: 3636
					case 0:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3644
						break; // L: 3645
					case 1:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9; // L: 3659
						break; // L: 3660
					case 2:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3649
						break; // L: 3650
					case 3:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3639
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3664
						break;
					default:
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3654
					}

					return 1; // L: 3668
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3670
				class336.Interpreter_intStackSize -= 2; // L: 3671
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3672
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3673
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 & var4; // L: 3674
				return 1; // L: 3675
			} else if (var0 == ScriptOpcodes.OR) { // L: 3677
				class336.Interpreter_intStackSize -= 2; // L: 3678
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3679
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3680
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 | var4; // L: 3681
				return 1; // L: 3682
			} else if (var0 == 4016) { // L: 3684
				class336.Interpreter_intStackSize -= 2; // L: 3685
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3686
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3687
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3688
				return 1; // L: 3689
			} else if (var0 == 4017) { // L: 3691
				class336.Interpreter_intStackSize -= 2; // L: 3692
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3693
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3694
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3695
				return 1; // L: 3696
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3698
				class336.Interpreter_intStackSize -= 3; // L: 3699
				long var10 = (long)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3700
				long var12 = (long)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3701
				long var14 = (long)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3702
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3703
				return 1; // L: 3704
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3706
				var9 = BuddyRankComparator.method2894(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 3707
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9; // L: 3708
				return 1; // L: 3709
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3711
				class336.Interpreter_intStackSize -= 2; // L: 3712
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3713
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3714
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3715
				return 1; // L: 3716
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3718
				class336.Interpreter_intStackSize -= 3; // L: 3719
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3720
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3721
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3722
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Calendar.method6612(var9, var4, var5); // L: 3723
				return 1; // L: 3724
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3726
				class336.Interpreter_intStackSize -= 3; // L: 3727
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3728
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3729
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3730
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class143.method3103(var9, var4, var5); // L: 3731
				return 1; // L: 3732
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3734
				class336.Interpreter_intStackSize -= 3; // L: 3735
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3736
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3737
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3738
				var6 = 31 - var5; // L: 3739
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4; // L: 3740
				return 1; // L: 3741
			} else if (var0 == 4030) { // L: 3743
				class336.Interpreter_intStackSize -= 4; // L: 3744
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3745
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3746
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 3747
				var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 3748
				var9 = class143.method3103(var9, var5, var6); // L: 3749
				var7 = WorldMapElement.method3585(var6 - var5 + 1); // L: 3750
				if (var4 > var7) { // L: 3751
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3752
				return 1; // L: 3753
			} else if (var0 == 4032) { // L: 3755
				Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.method3768(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]); // L: 3756
				return 1; // L: 3757
			} else if (var0 == 4033) { // L: 3759
				Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = WorldMapArea.method5173(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]); // L: 3760
				return 1; // L: 3761
			} else if (var0 == 4034) { // L: 3763
				class336.Interpreter_intStackSize -= 2; // L: 3764
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3765
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3766
				var5 = class150.method3164(var9, var4); // L: 3767
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5; // L: 3768
				return 1; // L: 3769
			} else if (var0 == 4035) { // L: 3771
				Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]); // L: 3772
				return 1; // L: 3773
			} else if (var0 == 4036) { // L: 3775
				String var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3776
				var4 = -1; // L: 3777
				if (DynamicObject.isNumber(var3)) { // L: 3778
					var4 = VarbitComposition.method3780(var3); // L: 3779
				}

				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4; // L: 3781
				return 1; // L: 3782
			} else {
				return 2; // L: 3784
			}
		}
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IILip;B)V",
		garbageValue = "1"
	)
	static final void method5(Player var0, int var1, int var2, class216 var3) {
		int var4 = var0.pathX[0]; // L: 8859
		int var5 = var0.pathY[0]; // L: 8860
		int var6 = var0.transformedSize(); // L: 8861
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8862
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8863
				int var7 = Players.method2676(var4, var5, var0.transformedSize(), Widget.method6467(var1, var2), Client.collisionMaps[var0.plane], true, Client.field554, Client.field783); // L: 8864
				if (var7 >= 1) { // L: 8865
					for (int var8 = 0; var8 < var7 - 1; ++var8) { // L: 8866
						var0.method2289(Client.field554[var8], Client.field783[var8], var3);
					}

				}
			}
		}
	} // L: 8867

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1999087411"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ItemLayer.method4225(); // L: 12038
		class6.method44(); // L: 12039
		int var1 = class132.VarpDefinition_get(var0).type; // L: 12040
		if (var1 != 0) { // L: 12041
			int var2 = Varps.Varps_main[var0]; // L: 12042
			if (var1 == 1) { // L: 12043
				if (var2 == 1) { // L: 12044
					Rasterizer3D.Rasterizer3D_setBrightness(0.9D); // L: 12045
					((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).setBrightness(0.9D); // L: 12046
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12048
					WorldMapManager.clientPreferences.method2503(0.9D); // L: 12050
				}

				if (var2 == 2) { // L: 12052
					GameEngine.method625(0.8D);
				}

				if (var2 == 3) { // L: 12053
					Rasterizer3D.Rasterizer3D_setBrightness(0.7D); // L: 12054
					((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).setBrightness(0.7D); // L: 12055
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12057
					WorldMapManager.clientPreferences.method2503(0.7D); // L: 12059
				}

				if (var2 == 4) { // L: 12061
					Rasterizer3D.Rasterizer3D_setBrightness(0.6D); // L: 12062
					((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).setBrightness(0.6D); // L: 12063
					ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12065
					WorldMapManager.clientPreferences.method2503(0.6D); // L: 12067
				}
			}

			if (var1 == 3) { // L: 12070
				if (var2 == 0) { // L: 12071
					UserComparator7.method2857(255);
				}

				if (var2 == 1) { // L: 12072
					UserComparator7.method2857(192);
				}

				if (var2 == 2) { // L: 12073
					UserComparator7.method2857(128);
				}

				if (var2 == 3) { // L: 12074
					UserComparator7.method2857(64);
				}

				if (var2 == 4) { // L: 12075
					UserComparator7.method2857(0);
				}
			}

			if (var1 == 4) { // L: 12077
				if (var2 == 0) { // L: 12078
					class133.method3024(127);
				}

				if (var2 == 1) { // L: 12079
					class133.method3024(96);
				}

				if (var2 == 2) { // L: 12080
					class133.method3024(64);
				}

				if (var2 == 3) { // L: 12081
					class133.method3024(32);
				}

				if (var2 == 4) { // L: 12082
					class133.method3024(0);
				}
			}

			if (var1 == 5) { // L: 12084
				Client.field532 = var2 == 1;
			}

			if (var1 == 6) { // L: 12085
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12086
			}

			if (var1 == 10) { // L: 12087
				if (var2 == 0) { // L: 12088
					class157.method3272(127);
				}

				if (var2 == 1) { // L: 12089
					class157.method3272(96);
				}

				if (var2 == 2) { // L: 12090
					class157.method3272(64);
				}

				if (var2 == 3) { // L: 12091
					class157.method3272(32);
				}

				if (var2 == 4) { // L: 12092
					class157.method3272(0);
				}
			}

			if (var1 == 17) { // L: 12094
				Client.followerIndex = var2 & 65535; // L: 12095
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 12097
				var3 = new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1305, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303}; // L: 12100
				Client.playerAttackOption = (AttackOption)class217.findEnumerated(var3, var2); // L: 12102
				if (Client.playerAttackOption == null) { // L: 12103
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12105
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1; // L: 12106
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12107
				}
			}

			if (var1 == 22) { // L: 12109
				var3 = new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1305, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1303}; // L: 12112
				Client.npcAttackOption = (AttackOption)class217.findEnumerated(var3, var2); // L: 12114
				if (Client.npcAttackOption == null) { // L: 12115
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12117
}
