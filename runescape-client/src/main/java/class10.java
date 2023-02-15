import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("c")
public class class10 {
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = -427670217
	)
	static int field55;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	static Buffer field56;
	@ObfuscatedName("ft")
	@ObfuscatedGetter(
		intValue = -1048604885
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("f")
	final HttpsURLConnection field48;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	final class387 field49;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class9 field47;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	class428 field57;
	@ObfuscatedName("z")
	boolean field50;
	@ObfuscatedName("j")
	boolean field51;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1357961717
	)
	int field52;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lk;Lnx;Z)V"
	)
	public class10(URL var1, class9 var2, class387 var3, boolean var4) throws IOException {
		this.field50 = false; // L: 17
		this.field51 = false; // L: 18
		this.field52 = 300000; // L: 19
		if (!var2.method92()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method80()); // L: 27
		} else {
			this.field48 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				this.field48.setSSLSocketFactory(class15.method190()); // L: 31
			}

			this.field47 = var2; // L: 33
			this.field49 = var3 != null ? var3 : new class387(); // L: 34
		}
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lk;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class387(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lnx;",
		garbageValue = "977984904"
	)
	public class387 method100() {
		return this.field49; // L: 38
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpm;I)V",
		garbageValue = "-564673124"
	)
	public void method96(class428 var1) {
		if (!this.field50) { // L: 42
			if (var1 == null) { // L: 43
				this.field49.method7418("Content-Type"); // L: 44
				this.field57 = null; // L: 45
			} else {
				this.field57 = var1; // L: 48
				if (this.field57.vmethod8059() != null) { // L: 49
					this.field49.method7422(this.field57.vmethod8059()); // L: 50
				} else {
					this.field49.method7423(); // L: 53
				}

			}
		}
	} // L: 46 55

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1395013465"
	)
	void method97() throws ProtocolException {
		if (!this.field50) { // L: 58
			this.field48.setRequestMethod(this.field47.method80()); // L: 59
			this.field49.method7415(this.field48); // L: 60
			if (this.field47.method84() && this.field57 != null) { // L: 61
				this.field48.setDoOutput(true); // L: 62
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 63

				try {
					var1.write(this.field57.vmethod8061()); // L: 65
					var1.writeTo(this.field48.getOutputStream()); // L: 66
				} catch (IOException var11) { // L: 68
					var11.printStackTrace(); // L: 69
				} finally {
					try {
						var1.close(); // L: 73
					} catch (IOException var10) { // L: 75
						var10.printStackTrace(); // L: 76
					}

				}
			}

			this.field48.setConnectTimeout(this.field52); // L: 80
			this.field48.setInstanceFollowRedirects(this.field51); // L: 81
			this.field50 = true; // L: 82
		}
	} // L: 83

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1031693459"
	)
	boolean method103() throws IOException {
		if (!this.field50) { // L: 86
			this.method97();
		}

		this.field48.connect(); // L: 87
		return this.field48.getResponseCode() == -1; // L: 88
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)La;",
		garbageValue = "-711497669"
	)
	class20 method99() {
		try {
			if (!this.field50 || this.field48.getResponseCode() == -1) { // L: 93
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 95
			this.field48.disconnect(); // L: 96
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 97
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field48); // L: 101
			return var1; // L: 109
		} catch (IOException var8) { // L: 103
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field48.disconnect(); // L: 107
		}

		return var3; // L: 104
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-191772835"
	)
	static int method112(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3407
			class302.Interpreter_intStackSize -= 2; // L: 3408
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3409
			var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3410
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 + var3; // L: 3411
			return 1; // L: 3412
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3414
			class302.Interpreter_intStackSize -= 2; // L: 3415
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3416
			var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3417
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 - var4; // L: 3418
			return 1; // L: 3419
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3421
			class302.Interpreter_intStackSize -= 2; // L: 3422
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3423
			var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3424
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 * var3; // L: 3425
			return 1; // L: 3426
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3428
			class302.Interpreter_intStackSize -= 2; // L: 3429
			var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3430
			var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3431
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 / var4; // L: 3432
			return 1; // L: 3433
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3435
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3436
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3437
			return 1; // L: 3438
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3440
			var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 3441
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3442
			return 1; // L: 3443
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3445
				class302.Interpreter_intStackSize -= 5; // L: 3446
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3447
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3448
				var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3449
				var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 3450
				var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 4]; // L: 3451
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3452
				return 1; // L: 3453
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3455
				class302.Interpreter_intStackSize -= 2; // L: 3456
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3457
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3458
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3459
				return 1; // L: 3460
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3462
				class302.Interpreter_intStackSize -= 2; // L: 3463
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3464
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3465
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3466
				return 1; // L: 3467
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3469
				class302.Interpreter_intStackSize -= 2; // L: 3470
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3471
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3472
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3473
				return 1; // L: 3474
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3476
				class302.Interpreter_intStackSize -= 2; // L: 3477
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3478
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3479
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3480
				return 1; // L: 3481
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3483
				class302.Interpreter_intStackSize -= 2; // L: 3484
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3485
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3486
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 % var4; // L: 3487
				return 1; // L: 3488
			} else if (var0 == ScriptOpcodes.POW) { // L: 3490
				class302.Interpreter_intStackSize -= 2; // L: 3491
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3492
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3493
				if (var3 == 0) { // L: 3494
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3495
				}

				return 1; // L: 3496
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3498
				class302.Interpreter_intStackSize -= 2; // L: 3499
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3500
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3501
				if (var3 == 0) { // L: 3502
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 3503
					return 1; // L: 3504
				} else {
					switch(var4) { // L: 3506
					case 0:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3519
						break; // L: 3520
					case 1:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3514
						break; // L: 3515
					case 2:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3529
						break; // L: 3530
					case 3:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3524
						break; // L: 3525
					case 4:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3509
						break;
					default:
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3534
					}

					return 1; // L: 3538
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3540
				class302.Interpreter_intStackSize -= 2; // L: 3541
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3542
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3543
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 & var4; // L: 3544
				return 1; // L: 3545
			} else if (var0 == ScriptOpcodes.OR) { // L: 3547
				class302.Interpreter_intStackSize -= 2; // L: 3548
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3549
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3550
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | var4; // L: 3551
				return 1; // L: 3552
			} else if (var0 == 4016) { // L: 3554
				class302.Interpreter_intStackSize -= 2; // L: 3555
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3556
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3557
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 < var4 ? var3 : var4; // L: 3558
				return 1; // L: 3559
			} else if (var0 == 4017) { // L: 3561
				class302.Interpreter_intStackSize -= 2; // L: 3562
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3563
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3564
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 > var4 ? var3 : var4; // L: 3565
				return 1; // L: 3566
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3568
				class302.Interpreter_intStackSize -= 3; // L: 3569
				long var9 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3570
				long var11 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3571
				long var13 = (long)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3572
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 3573
				return 1; // L: 3574
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3576
				var3 = class366.method7028(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 3577
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3; // L: 3578
				return 1; // L: 3579
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3581
				class302.Interpreter_intStackSize -= 2; // L: 3582
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3583
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3584
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3585
				return 1; // L: 3586
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3588
				class302.Interpreter_intStackSize -= 3; // L: 3589
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3590
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3591
				var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3592
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class152.method3307(var3, var4, var5); // L: 3593
				return 1; // L: 3594
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3596
				class302.Interpreter_intStackSize -= 3; // L: 3597
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3598
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3599
				var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3600
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.method6471(var3, var4, var5); // L: 3601
				return 1; // L: 3602
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3604
				class302.Interpreter_intStackSize -= 3; // L: 3605
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3606
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3607
				var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3608
				var6 = 31 - var5; // L: 3609
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4; // L: 3610
				return 1; // L: 3611
			} else if (var0 == 4030) { // L: 3613
				class302.Interpreter_intStackSize -= 4; // L: 3614
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3615
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3616
				var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3617
				var6 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 3]; // L: 3618
				var3 = ArchiveDiskActionHandler.method6471(var3, var5, var6); // L: 3619
				var7 = SoundCache.method871(var6 - var5 + 1); // L: 3620
				if (var4 > var7) { // L: 3621
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3622
				return 1; // L: 3623
			} else if (var0 == 4032) { // L: 3625
				Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = NPC.method2679(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]); // L: 3626
				return 1; // L: 3627
			} else if (var0 == 4033) { // L: 3629
				Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = class388.method7467(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]); // L: 3630
				return 1; // L: 3631
			} else if (var0 == 4034) { // L: 3633
				class302.Interpreter_intStackSize -= 2; // L: 3634
				var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3635
				var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3636
				var5 = Renderable.method4639(var3, var4); // L: 3637
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5; // L: 3638
				return 1; // L: 3639
			} else if (var0 == 4035) { // L: 3641
				Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]); // L: 3642
				return 1; // L: 3643
			} else {
				return 2; // L: 3645
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgp;I)Z",
		garbageValue = "-1689076560"
	)
	static boolean method113(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 565
			int[] var1 = var0.transforms; // L: 567

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 568
				int var3 = var1[var2]; // L: 569
				ObjectComposition var4 = class463.getObjectDefinition(var3); // L: 571
				if (var4.mapIconId != -1) { // L: 572
					return true; // L: 573
				}
			}
		} else if (var0.mapIconId != -1) { // L: 579
			return true; // L: 580
		}

		return false; // L: 582
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1554651935"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5096
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5097
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5098
				int var3 = var2.x >> 7; // L: 5099
				int var4 = var2.y >> 7; // L: 5100
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5101
					if (var2.field1163 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5102
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5103
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5104
					}

					long var5 = ItemLayer.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5106
					var2.playerCycle = Client.cycle; // L: 5107
					WorldMapAreaData.scene.drawEntity(class103.Client_plane, var2.x, var2.y, GrandExchangeOfferNameComparator.getTileHeight(var2.field1163 * 64 - 64 + var2.x, var2.field1163 * 64 - 64 + var2.y, class103.Client_plane), var2.field1163 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5108
				}
			}
		}

	} // L: 5112

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Lcq;ZI)V",
		garbageValue = "1348971257"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12915
		int var3 = (int)var0.key; // L: 12916
		var0.remove(); // L: 12917
		if (var1 && var2 != -1 && class431.Widget_loadedInterfaces[var2]) { // L: 12918 12919 12920
			UserComparator8.Widget_archive.clearFilesGroup(var2); // L: 12921
			if (WorldMapLabel.Widget_interfaceComponents[var2] != null) { // L: 12922
				boolean var4 = true; // L: 12923

				for (int var5 = 0; var5 < WorldMapLabel.Widget_interfaceComponents[var2].length; ++var5) { // L: 12924
					if (WorldMapLabel.Widget_interfaceComponents[var2][var5] != null) { // L: 12925
						if (WorldMapLabel.Widget_interfaceComponents[var2][var5].type != 2) { // L: 12926
							WorldMapLabel.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 12927
						}
					}
				}

				if (var4) { // L: 12930
					WorldMapLabel.Widget_interfaceComponents[var2] = null;
				}

				class431.Widget_loadedInterfaces[var2] = false; // L: 12931
			}
		}

		GrandExchangeEvents.method6645(var2); // L: 12933
		Widget var6 = class133.getWidget(var3); // L: 12934
		if (var6 != null) { // L: 12935
			LoginScreenAnimation.invalidateWidget(var6);
		}

		if (Client.rootInterface != -1) { // L: 12936
			class147.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12937

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "1064424296"
	)
	static void method95(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 13290
		if (Client.randomDatData == null) { // L: 13292
			Client.randomDatData = new byte[24];
		}

		class377.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 13293
		Language.method6776(var0, var1); // L: 13295
	} // L: 13296
}
