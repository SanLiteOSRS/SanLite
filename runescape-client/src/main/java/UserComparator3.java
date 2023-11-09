import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("am")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;B)I",
		garbageValue = "-10"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)[Ltq;",
		garbageValue = "1271520368"
	)
	public static SpritePixels[] method2923(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 57
		boolean var3;
		if (var4 == null) { // L: 58
			var3 = false; // L: 59
		} else {
			class485.SpriteBuffer_decode(var4); // L: 62
			var3 = true; // L: 63
		}

		if (!var3) { // L: 65
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class503.SpriteBuffer_spriteCount]; // L: 68

			for (int var6 = 0; var6 < class503.SpriteBuffer_spriteCount; ++var6) { // L: 69
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 70
				var7.width = class503.SpriteBuffer_spriteWidth; // L: 71
				var7.height = class503.SpriteBuffer_spriteHeight; // L: 72
				var7.xOffset = class503.SpriteBuffer_xOffsets[var6]; // L: 73
				var7.yOffset = class17.SpriteBuffer_yOffsets[var6]; // L: 74
				var7.subWidth = class97.SpriteBuffer_spriteWidths[var6]; // L: 75
				var7.subHeight = class138.SpriteBuffer_spriteHeights[var6]; // L: 76
				int var8 = var7.subHeight * var7.subWidth; // L: 77
				byte[] var9 = VarbitComposition.SpriteBuffer_pixels[var6]; // L: 78
				var7.pixels = new int[var8]; // L: 79

				for (int var10 = 0; var10 < var8; ++var10) { // L: 80
					var7.pixels[var10] = class394.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class398.method7709(); // L: 82
			return var5; // L: 85
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "2115875003"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck(); // L: 123
		var2.size = var0.readUnsignedByte(); // L: 124
		var2.id = var0.readInt(); // L: 125
		var2.operations = new int[var2.size]; // L: 126
		var2.creationErrors = new int[var2.size]; // L: 127
		var2.fields = new Field[var2.size]; // L: 128
		var2.intReplaceValues = new int[var2.size]; // L: 129
		var2.methods = new Method[var2.size]; // L: 130
		var2.arguments = new byte[var2.size][][]; // L: 131

		for (int var3 = 0; var3 < var2.size; ++var3) { // L: 132
			try {
				int var4 = var0.readUnsignedByte(); // L: 134
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) { // L: 135
					if (var4 == 3 || var4 == 4) { // L: 145
						var5 = var0.readStringCp1252NullTerminated(); // L: 146
						var6 = var0.readStringCp1252NullTerminated(); // L: 147
						var7 = var0.readUnsignedByte(); // L: 148
						String[] var8 = new String[var7]; // L: 149

						for (int var9 = 0; var9 < var7; ++var9) { // L: 150
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated(); // L: 151
						byte[][] var10 = new byte[var7][]; // L: 152
						int var12;
						if (var4 == 3) { // L: 153
							for (int var11 = 0; var11 < var7; ++var11) { // L: 154
								var12 = var0.readInt(); // L: 155
								var10[var11] = new byte[var12]; // L: 156
								var0.readBytes(var10[var11], 0, var12); // L: 157
							}
						}

						var2.operations[var3] = var4; // L: 160
						Class[] var21 = new Class[var7]; // L: 161

						for (var12 = 0; var12 < var7; ++var12) { // L: 162
							var21[var12] = class33.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = class33.loadClassFromDescriptor(var20); // L: 163
						if (class33.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 164
							throw new SecurityException();
						}

						Method[] var13 = class33.loadClassFromDescriptor(var5).getDeclaredMethods(); // L: 165
						Method[] var14 = var13; // L: 167

						for (int var15 = 0; var15 < var14.length; ++var15) { // L: 168
							Method var16 = var14[var15]; // L: 169
							if (Reflection.getMethodName(var16).equals(var6)) { // L: 171
								Class[] var17 = Reflection.getParameterTypes(var16); // L: 172
								if (var17.length == var21.length) { // L: 173
									boolean var18 = true; // L: 174

									for (int var19 = 0; var19 < var21.length; ++var19) { // L: 175
										if (var21[var19] != var17[var19]) { // L: 176
											var18 = false; // L: 177
											break; // L: 178
										}
									}

									if (var18 && var22 == var16.getReturnType()) { // L: 181
										var2.methods[var3] = var16; // L: 182
									}
								}
							}
						}

						var2.arguments[var3] = var10; // L: 189
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated(); // L: 136
					var6 = var0.readStringCp1252NullTerminated(); // L: 137
					var7 = 0; // L: 138
					if (var4 == 1) { // L: 139
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4; // L: 140
					var2.intReplaceValues[var3] = var7; // L: 141
					if (class33.loadClassFromDescriptor(var5).getClassLoader() == null) { // L: 142
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(class33.loadClassFromDescriptor(var5), var6); // L: 143
				}
			} catch (ClassNotFoundException var24) { // L: 192
				var2.creationErrors[var3] = -1; // L: 193
			} catch (SecurityException var25) { // L: 195
				var2.creationErrors[var3] = -2; // L: 196
			} catch (NullPointerException var26) { // L: 198
				var2.creationErrors[var3] = -3; // L: 199
			} catch (Exception var27) { // L: 201
				var2.creationErrors[var3] = -4; // L: 202
			} catch (Throwable var28) { // L: 204
				var2.creationErrors[var3] = -5; // L: 205
			}
		}

		class36.reflectionChecks.addFirst(var2); // L: 208
	} // L: 209

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "190306276"
	)
	static int method2930(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 3528
			Interpreter.Interpreter_intStackSize -= 2; // L: 3529
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3530
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3531
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9; // L: 3532
			return 1; // L: 3533
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3535
			Interpreter.Interpreter_intStackSize -= 2; // L: 3536
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3537
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3538
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4; // L: 3539
			return 1; // L: 3540
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3542
			Interpreter.Interpreter_intStackSize -= 2; // L: 3543
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3544
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3545
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4; // L: 3546
			return 1; // L: 3547
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3549
			Interpreter.Interpreter_intStackSize -= 2; // L: 3550
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3551
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3552
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4; // L: 3553
			return 1; // L: 3554
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3556
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3557
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 3558
			return 1; // L: 3559
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3561
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3562
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 3563
			return 1; // L: 3564
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3566
				Interpreter.Interpreter_intStackSize -= 5; // L: 3567
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3568
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3569
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3570
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3571
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4]; // L: 3572
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5); // L: 3573
				return 1; // L: 3574
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3576
				Interpreter.Interpreter_intStackSize -= 2; // L: 3577
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3578
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3579
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100; // L: 3580
				return 1; // L: 3581
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3583
				Interpreter.Interpreter_intStackSize -= 2; // L: 3584
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3585
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3586
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 3587
				return 1; // L: 3588
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3590
				Interpreter.Interpreter_intStackSize -= 2; // L: 3591
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3592
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3593
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 3594
				return 1; // L: 3595
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3597
				Interpreter.Interpreter_intStackSize -= 2; // L: 3598
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3599
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3600
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 3601
				return 1; // L: 3602
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3604
				Interpreter.Interpreter_intStackSize -= 2; // L: 3605
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3606
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3607
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4; // L: 3608
				return 1; // L: 3609
			} else if (var0 == ScriptOpcodes.POW) { // L: 3611
				Interpreter.Interpreter_intStackSize -= 2; // L: 3612
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3613
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3614
				if (var9 == 0) { // L: 3615
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 3616
				}

				return 1; // L: 3617
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3619
				Interpreter.Interpreter_intStackSize -= 2; // L: 3620
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3621
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3622
				if (var9 == 0) { // L: 3623
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3624
					return 1; // L: 3625
				} else {
					switch(var4) { // L: 3627
					case 0:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3655
						break;
					case 1:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3645
						break; // L: 3646
					case 2:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 3650
						break; // L: 3651
					case 3:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 3640
						break; // L: 3641
					case 4:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 3630
						break;
					default:
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 3635
					}

					return 1; // L: 3659
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3661
				Interpreter.Interpreter_intStackSize -= 2; // L: 3662
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3663
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3664
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4; // L: 3665
				return 1; // L: 3666
			} else if (var0 == ScriptOpcodes.OR) { // L: 3668
				Interpreter.Interpreter_intStackSize -= 2; // L: 3669
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3670
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3671
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4; // L: 3672
				return 1; // L: 3673
			} else if (var0 == 4016) { // L: 3675
				Interpreter.Interpreter_intStackSize -= 2; // L: 3676
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3677
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3678
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4; // L: 3679
				return 1; // L: 3680
			} else if (var0 == 4017) { // L: 3682
				Interpreter.Interpreter_intStackSize -= 2; // L: 3683
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3684
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3685
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4; // L: 3686
				return 1; // L: 3687
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3689
				Interpreter.Interpreter_intStackSize -= 3; // L: 3690
				long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3691
				long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3692
				long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3693
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12); // L: 3694
				return 1; // L: 3695
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3697
				var9 = class18.method289(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 3698
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9; // L: 3699
				return 1; // L: 3700
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3702
				Interpreter.Interpreter_intStackSize -= 2; // L: 3703
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3704
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3705
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4; // L: 3706
				return 1; // L: 3707
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3709
				Interpreter.Interpreter_intStackSize -= 3; // L: 3710
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3711
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3712
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3713
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class134.method3179(var9, var4, var5); // L: 3714
				return 1; // L: 3715
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3717
				Interpreter.Interpreter_intStackSize -= 3; // L: 3718
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3719
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3720
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3721
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.method331(var9, var4, var5); // L: 3722
				return 1; // L: 3723
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3725
				Interpreter.Interpreter_intStackSize -= 3; // L: 3726
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3727
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3728
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3729
				var6 = 31 - var5; // L: 3730
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6; // L: 3731
				return 1; // L: 3732
			} else if (var0 == 4030) { // L: 3734
				Interpreter.Interpreter_intStackSize -= 4; // L: 3735
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3736
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3737
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3738
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3739
				var9 = Canvas.method331(var9, var5, var6); // L: 3740
				var7 = class140.method3220(var6 - var5 + 1); // L: 3741
				if (var4 > var7) { // L: 3742
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5; // L: 3743
				return 1; // L: 3744
			} else if (var0 == 4032) { // L: 3746
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = AttackOption.method2661(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3747
				return 1; // L: 3748
			} else if (var0 == 4033) { // L: 3750
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = TriBool.method7974(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3751
				return 1; // L: 3752
			} else if (var0 == 4034) { // L: 3754
				Interpreter.Interpreter_intStackSize -= 2; // L: 3755
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3756
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3757
				var5 = UserComparator8.method2890(var9, var4); // L: 3758
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 3759
				return 1; // L: 3760
			} else if (var0 == 4035) { // L: 3762
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]); // L: 3763
				return 1; // L: 3764
			} else if (var0 == 4036) { // L: 3766
				String var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3767
				var4 = -1; // L: 3768
				if (WorldMapSectionType.isNumber(var3)) { // L: 3769
					var4 = PacketBufferNode.method5709(var3); // L: 3770
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3772
				return 1; // L: 3773
			} else {
				return 2; // L: 3775
			}
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "76"
	)
	static final int method2932() {
		if (class20.clientPreferences.method2513()) { // L: 4840
			return GameEngine.Client_plane;
		} else {
			int var0 = 3; // L: 4841
			if (WorldMapSectionType.cameraPitch < 310) { // L: 4842
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4845
					var1 = class33.oculusOrbFocalPointX >> 7; // L: 4846
					var2 = class144.oculusOrbFocalPointY >> 7; // L: 4847
				} else {
					var1 = MusicPatchNode.localPlayer.x >> 7; // L: 4850
					var2 = MusicPatchNode.localPlayer.y >> 7; // L: 4851
				}

				int var3 = class36.cameraX >> 7; // L: 4853
				int var4 = class297.cameraZ >> 7; // L: 4854
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4855
					return GameEngine.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4856
					return GameEngine.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) { // L: 4857
					var0 = GameEngine.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4859
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4860
				}

				int var6;
				if (var2 > var4) { // L: 4862
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4863
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4864
					var7 = var6 * 65536 / var5; // L: 4865
					var8 = 32768; // L: 4866

					while (var1 != var3) { // L: 4867
						if (var3 < var1) { // L: 4868
							++var3;
						} else if (var3 > var1) { // L: 4869
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) { // L: 4870
							var0 = GameEngine.Client_plane;
						}

						var8 += var7; // L: 4871
						if (var8 >= 65536) { // L: 4872
							var8 -= 65536; // L: 4873
							if (var4 < var2) { // L: 4874
								++var4;
							} else if (var4 > var2) { // L: 4875
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) { // L: 4876
								var0 = GameEngine.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4880
					var7 = var5 * 65536 / var6; // L: 4881
					var8 = 32768; // L: 4882

					while (var4 != var2) { // L: 4883
						if (var4 < var2) { // L: 4884
							++var4;
						} else if (var4 > var2) { // L: 4885
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) { // L: 4886
							var0 = GameEngine.Client_plane;
						}

						var8 += var7; // L: 4887
						if (var8 >= 65536) { // L: 4888
							var8 -= 65536; // L: 4889
							if (var3 < var1) { // L: 4890
								++var3;
							} else if (var3 > var1) { // L: 4891
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) { // L: 4892
								var0 = GameEngine.Client_plane;
							}
						}
					}
				}
			}

			if (MusicPatchNode.localPlayer.x >= 0 && MusicPatchNode.localPlayer.y >= 0 && MusicPatchNode.localPlayer.x < 13312 && MusicPatchNode.localPlayer.y < 13312) { // L: 4897
				if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][MusicPatchNode.localPlayer.x >> 7][MusicPatchNode.localPlayer.y >> 7] & 4) != 0) { // L: 4898
					var0 = GameEngine.Client_plane;
				}

				return var0;
			} else {
				return GameEngine.Client_plane; // L: 4899
			}
		}
	}
}
