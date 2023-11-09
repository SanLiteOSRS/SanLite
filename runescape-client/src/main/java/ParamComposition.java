import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("du")
	static boolean field2121;
	@ObfuscatedName("v")
	@Export("type")
	char type;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 818744259
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("m")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("q")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "125"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "1176853720"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			byte var4 = var1.readByte(); // L: 48
			int var5 = var4 & 255; // L: 50
			if (var5 == 0) { // L: 51
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) { // L: 52
				char var6 = class358.cp1252AsciiExtension[var5 - 128]; // L: 53
				if (var6 == 0) { // L: 54
					var6 = '?';
				}

				var5 = var6; // L: 55
			}

			char var3 = (char)var5; // L: 57
			this.type = var3; // L: 59
		} else if (var2 == 2) { // L: 61
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) { // L: 62
			this.autoDisable = false;
		} else if (var2 == 5) { // L: 63
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 65

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1916237971"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 68
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-114129637"
	)
	static int method3803(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3410
			class87.Interpreter_intStackSize -= 2; // L: 3411
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3412
			var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3413
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 + var3; // L: 3414
			return 1; // L: 3415
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3417
			class87.Interpreter_intStackSize -= 2; // L: 3418
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3419
			var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3420
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 - var4; // L: 3421
			return 1; // L: 3422
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3424
			class87.Interpreter_intStackSize -= 2; // L: 3425
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3426
			var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3427
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 * var3; // L: 3428
			return 1; // L: 3429
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3431
			class87.Interpreter_intStackSize -= 2; // L: 3432
			var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3433
			var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3434
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 / var4; // L: 3435
			return 1; // L: 3436
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3438
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3439
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3440
			return 1; // L: 3441
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3443
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 3444
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3445
			return 1; // L: 3446
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3448
				class87.Interpreter_intStackSize -= 5; // L: 3449
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3450
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3451
				var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3452
				var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 3453
				var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 4]; // L: 3454
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 + (var7 - var5) * (var4 - var3) / (var6 - var5); // L: 3455
				return 1; // L: 3456
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3458
				class87.Interpreter_intStackSize -= 2; // L: 3459
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3460
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3461
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3462
				return 1; // L: 3463
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3465
				class87.Interpreter_intStackSize -= 2; // L: 3466
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3467
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3468
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3469
				return 1; // L: 3470
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3472
				class87.Interpreter_intStackSize -= 2; // L: 3473
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3474
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3475
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3476
				return 1; // L: 3477
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3479
				class87.Interpreter_intStackSize -= 2; // L: 3480
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3481
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3482
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3483
				return 1; // L: 3484
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3486
				class87.Interpreter_intStackSize -= 2; // L: 3487
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3488
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3489
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 % var4; // L: 3490
				return 1; // L: 3491
			} else if (var0 == ScriptOpcodes.POW) { // L: 3493
				class87.Interpreter_intStackSize -= 2; // L: 3494
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3495
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3496
				if (var3 == 0) { // L: 3497
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3498
				}

				return 1; // L: 3499
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3501
				class87.Interpreter_intStackSize -= 2; // L: 3502
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3503
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3504
				if (var3 == 0) { // L: 3505
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3506
					return 1; // L: 3507
				} else {
					switch(var4) { // L: 3509
					case 0:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3532
						break; // L: 3533
					case 1:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3527
						break; // L: 3528
					case 2:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3522
						break; // L: 3523
					case 3:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3537
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3512
						break;
					default:
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3517
					}

					return 1; // L: 3541
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3543
				class87.Interpreter_intStackSize -= 2; // L: 3544
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3545
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3546
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 & var4; // L: 3547
				return 1; // L: 3548
			} else if (var0 == ScriptOpcodes.OR) { // L: 3550
				class87.Interpreter_intStackSize -= 2; // L: 3551
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3552
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3553
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | var4; // L: 3554
				return 1; // L: 3555
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3557
				class87.Interpreter_intStackSize -= 3; // L: 3558
				long var9 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3559
				long var11 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3560
				long var13 = (long)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3561
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 3562
				return 1; // L: 3563
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3565
				var3 = class233.method4850(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 3566
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3; // L: 3567
				return 1; // L: 3568
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3570
				class87.Interpreter_intStackSize -= 2; // L: 3571
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3572
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3573
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3574
				return 1; // L: 3575
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3577
				class87.Interpreter_intStackSize -= 3; // L: 3578
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3579
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3580
				var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3581
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = WorldMapEvent.method5405(var3, var4, var5); // L: 3582
				return 1; // L: 3583
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3585
				class87.Interpreter_intStackSize -= 3; // L: 3586
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3587
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3588
				var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3589
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class159.method3346(var3, var4, var5); // L: 3590
				return 1; // L: 3591
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3593
				class87.Interpreter_intStackSize -= 3; // L: 3594
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3595
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3596
				var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3597
				var6 = 31 - var5; // L: 3598
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 3599
				return 1; // L: 3600
			} else if (var0 == 4030) { // L: 3602
				class87.Interpreter_intStackSize -= 4; // L: 3603
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3604
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3605
				var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3606
				var6 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 3]; // L: 3607
				var3 = class159.method3346(var3, var5, var6); // L: 3608
				var7 = Actor.method2362(var6 - var5 + 1); // L: 3609
				if (var4 > var7) { // L: 3610
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3611
				return 1; // L: 3612
			} else if (var0 == 4032) { // L: 3614
				Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = class163.method3416(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]); // L: 3615
				return 1; // L: 3616
			} else if (var0 == 4033) { // L: 3618
				Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = SoundSystem.method874(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]); // L: 3619
				return 1; // L: 3620
			} else if (var0 == 4034) { // L: 3622
				class87.Interpreter_intStackSize -= 2; // L: 3623
				var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3624
				var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3625
				var5 = Ignored.method7614(var3, var4); // L: 3626
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5; // L: 3627
				return 1; // L: 3628
			} else if (var0 == 4035) { // L: 3630
				Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]); // L: 3631
				return 1; // L: 3632
			} else {
				return 2; // L: 3634
			}
		}
	}
}
