import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class1 implements Callable {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 735259681
	)
	static int field2;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final Buffer field5;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lr;Lqy;Lx;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field5 = var2; // L: 48
		this.field1 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field1.vmethod13(this.field5); // L: 54
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2058763970"
	)
	static final void method10(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 109
		KitDefinition.addGameMessage(30, "", var1); // L: 111
	} // L: 113

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1539382446"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (StructComposition.clientPreferences.method2426() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3493
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3494
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3495
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3496
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3497
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3498
			++Client.soundEffectCount; // L: 3499
		}

	} // L: 3501

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "0"
	)
	static final void method7(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field564; ++var1) { // L: 8431
			int var2 = Client.field565[var1]; // L: 8432
			NPC var3 = Client.npcs[var2]; // L: 8433
			int var4 = var0.readUnsignedByte(); // L: 8434
			int var5;
			if ((var4 & 1) != 0) { // L: 8435
				var5 = var0.readUnsignedByte(); // L: 8436
				var4 += var5 << 8; // L: 8437
			}

			if ((var4 & 2048) != 0) { // L: 8439
				var5 = var0.readUnsignedByte(); // L: 8440
				var4 += var5 << 16; // L: 8441
			}

			if ((var4 & 131072) != 0) { // L: 8443
				var5 = var0.method8760(); // L: 8444
				var3.turnLeftSequence = (var5 & 1) != 0 ? var0.method8592() : var3.definition.turnLeftSequence; // L: 8445
				var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShort() : var3.definition.turnRightSequence; // L: 8446
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShort() : var3.definition.walkSequence; // L: 8447
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence; // L: 8448
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShort() : var3.definition.walkLeftSequence; // L: 8449
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method8530() : var3.definition.walkRightSequence; // L: 8450
				var3.runSequence = (var5 & 64) != 0 ? var0.method8591() : var3.definition.field2035; // L: 8451
				var3.field1191 = (var5 & 128) != 0 ? var0.method8530() : var3.definition.field2038; // L: 8452
				var3.field1201 = (var5 & 256) != 0 ? var0.method8530() : var3.definition.field2039; // L: 8453
				var3.field1193 = (var5 & 512) != 0 ? var0.method8592() : var3.definition.field2040; // L: 8454
				var3.field1194 = (var5 & 1024) != 0 ? var0.method8591() : var3.definition.field2041; // L: 8455
				var3.field1195 = (var5 & 2048) != 0 ? var0.method8530() : var3.definition.field2042; // L: 8456
				var3.field1226 = (var5 & 4096) != 0 ? var0.method8530() : var3.definition.field2043; // L: 8457
				var3.field1197 = (var5 & 8192) != 0 ? var0.method8591() : var3.definition.field2044; // L: 8458
				var3.idleSequence = (var5 & 16384) != 0 ? var0.method8530() : var3.definition.idleSequence; // L: 8459
			}

			if ((var4 & 4) != 0) { // L: 8461
				var3.definition = class129.getNpcDefinition(var0.method8530()); // L: 8462
				GameObject.method4832(var3); // L: 8463
				var3.method2541(); // L: 8464
			}

			if ((var4 & 1024) != 0) { // L: 8466
				var3.field1238 = Client.cycle + var0.method8592(); // L: 8467
				var3.field1200 = Client.cycle + var0.method8592(); // L: 8468
				var3.field1240 = var0.method8718(); // L: 8469
				var3.field1220 = var0.readByte(); // L: 8470
				var3.field1232 = var0.method8718(); // L: 8471
				var3.field1243 = (byte)var0.method8581(); // L: 8472
			}

			int[] var6;
			int var7;
			int var8;
			int var9;
			int var10;
			short[] var13;
			short[] var14;
			long var15;
			if ((var4 & 512) != 0) { // L: 8474
				var5 = var0.method8581(); // L: 8475
				if ((var5 & 1) == 1) { // L: 8476
					var3.method2567(); // L: 8477
				} else {
					var6 = null; // L: 8480
					if ((var5 & 2) == 2) { // L: 8481
						var7 = var0.method8699(); // L: 8482
						var6 = new int[var7]; // L: 8483

						for (var8 = 0; var8 < var7; ++var8) { // L: 8484
							var9 = var0.method8530(); // L: 8485
							var9 = var9 == 65535 ? -1 : var9; // L: 8486
							var6[var8] = var9; // L: 8487
						}
					}

					var13 = null; // L: 8490
					if ((var5 & 4) == 4) { // L: 8491
						var8 = 0; // L: 8492
						if (var3.definition.recolorTo != null) { // L: 8493
							var8 = var3.definition.recolorTo.length; // L: 8494
						}

						var13 = new short[var8]; // L: 8496

						for (var9 = 0; var9 < var8; ++var9) { // L: 8497
							var13[var9] = (short)var0.method8592(); // L: 8498
						}
					}

					var14 = null; // L: 8501
					if ((var5 & 8) == 8) { // L: 8502
						var9 = 0; // L: 8503
						if (var3.definition.retextureTo != null) { // L: 8504
							var9 = var3.definition.retextureTo.length; // L: 8505
						}

						var14 = new short[var9]; // L: 8507

						for (var10 = 0; var10 < var9; ++var10) { // L: 8508
							var14[var10] = (short)var0.method8530(); // L: 8509
						}
					}

					var15 = (long)(++NPC.field1315 - 1); // L: 8512
					var3.method2544(new class185(var15, var6, var13, var14)); // L: 8513
				}
			}

			if ((var4 & 8192) != 0) { // L: 8516
				var3.field1253 = var0.method8585(); // L: 8517
			}

			int var17;
			if ((var4 & 32) != 0) { // L: 8519
				var5 = var0.method8591(); // L: 8520
				if (var5 == 65535) { // L: 8521
					var5 = -1; // L: 8522
				}

				var17 = var0.readUnsignedByte(); // L: 8524
				if (var5 == var3.sequence && var5 != -1) { // L: 8525
					var7 = class216.SequenceDefinition_get(var5).field2276; // L: 8526
					if (var7 == 1) { // L: 8527
						var3.sequenceFrame = 0; // L: 8528
						var3.sequenceFrameCycle = 0; // L: 8529
						var3.sequenceDelay = var17; // L: 8530
						var3.field1223 = 0; // L: 8531
					}

					if (var7 == 2) { // L: 8533
						var3.field1223 = 0; // L: 8534
					}
				} else if (var5 == -1 || var3.sequence == -1 || class216.SequenceDefinition_get(var5).field2300 >= class216.SequenceDefinition_get(var3.sequence).field2300) { // L: 8537
					var3.sequence = var5; // L: 8538
					var3.sequenceFrame = 0; // L: 8539
					var3.sequenceFrameCycle = 0; // L: 8540
					var3.sequenceDelay = var17; // L: 8541
					var3.field1223 = 0; // L: 8542
					var3.field1252 = var3.pathLength; // L: 8543
				}
			}

			if ((var4 & 16) != 0) { // L: 8547
				var5 = var0.method8702(); // L: 8548
				int var11;
				if (var5 > 0) { // L: 8549
					for (var17 = 0; var17 < var5; ++var17) { // L: 8550
						var8 = -1; // L: 8552
						var9 = -1; // L: 8553
						var10 = -1; // L: 8554
						var7 = var0.readUShortSmart(); // L: 8555
						if (var7 == 32767) { // L: 8556
							var7 = var0.readUShortSmart(); // L: 8557
							var9 = var0.readUShortSmart(); // L: 8558
							var8 = var0.readUShortSmart(); // L: 8559
							var10 = var0.readUShortSmart(); // L: 8560
						} else if (var7 != 32766) { // L: 8562
							var9 = var0.readUShortSmart(); // L: 8563
						} else {
							var7 = -1; // L: 8565
						}

						var11 = var0.readUShortSmart(); // L: 8566
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8567
					}
				}

				var17 = var0.readUnsignedByte(); // L: 8570
				if (var17 > 0) { // L: 8571
					for (var7 = 0; var7 < var17; ++var7) { // L: 8572
						var8 = var0.readUShortSmart(); // L: 8573
						var9 = var0.readUShortSmart(); // L: 8574
						if (var9 != 32767) { // L: 8575
							var10 = var0.readUShortSmart(); // L: 8576
							var11 = var0.method8702(); // L: 8577
							int var12 = var9 > 0 ? var0.method8581() : var11; // L: 8578
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8579
						} else {
							var3.removeHealthBar(var8); // L: 8581
						}
					}
				}
			}

			if ((var4 & 128) != 0) { // L: 8585
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8586
				var3.field1248 = 100; // L: 8587
			}

			if ((var4 & 4096) != 0) { // L: 8589
				var3.method2531(var0.readUnsignedByte()); // L: 8590
			}

			if ((var4 & 256) != 0) { // L: 8592
				var3.method2573(var0.readStringCp1252NullTerminated()); // L: 8593
			}

			if ((var4 & 8) != 0) { // L: 8595
				var5 = var0.readUnsignedShort(); // L: 8596
				var17 = var0.readUnsignedShort(); // L: 8597
				var3.field1228 = var0.readUnsignedByte() == 1; // L: 8598
				var7 = var3.x - (var5 - class154.baseX * 64 - class154.baseX * 64) * 64; // L: 8599
				var8 = var3.y - (var17 - class365.baseY * 64 - class365.baseY * 64) * 64; // L: 8600
				if (var7 != 0 || var8 != 0) { // L: 8601
					var3.field1190 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 32768) != 0) { // L: 8603
				var3.field1196 = var0.method8718(); // L: 8604
				var3.field1185 = var0.readByte(); // L: 8605
				var3.field1230 = var0.method8718(); // L: 8606
				var3.field1213 = var0.method8701(); // L: 8607
				var3.field1233 = var0.readUnsignedShort() + Client.cycle; // L: 8608
				var3.field1234 = var0.method8530() + Client.cycle; // L: 8609
				var3.field1235 = var0.readUnsignedShort(); // L: 8610
				var3.pathLength = 1; // L: 8611
				var3.field1252 = 0; // L: 8612
				var3.field1196 += var3.pathX[0]; // L: 8613
				var3.field1185 += var3.pathY[0]; // L: 8614
				var3.field1230 += var3.pathX[0]; // L: 8615
				var3.field1213 += var3.pathY[0]; // L: 8616
			}

			if ((var4 & 16384) != 0) { // L: 8618
				var5 = var0.method8699(); // L: 8619
				if ((var5 & 1) == 1) { // L: 8620
					var3.method2560(); // L: 8621
				} else {
					var6 = null; // L: 8624
					if ((var5 & 2) == 2) { // L: 8625
						var7 = var0.readUnsignedByte(); // L: 8626
						var6 = new int[var7]; // L: 8627

						for (var8 = 0; var8 < var7; ++var8) { // L: 8628
							var9 = var0.method8591(); // L: 8629
							var9 = var9 == 65535 ? -1 : var9; // L: 8630
							var6[var8] = var9; // L: 8631
						}
					}

					var13 = null; // L: 8634
					if ((var5 & 4) == 4) { // L: 8635
						var8 = 0; // L: 8636
						if (var3.definition.recolorTo != null) { // L: 8637
							var8 = var3.definition.recolorTo.length; // L: 8638
						}

						var13 = new short[var8]; // L: 8640

						for (var9 = 0; var9 < var8; ++var9) { // L: 8641
							var13[var9] = (short)var0.method8530(); // L: 8642
						}
					}

					var14 = null; // L: 8645
					if ((var5 & 8) == 8) { // L: 8646
						var9 = 0; // L: 8647
						if (var3.definition.retextureTo != null) { // L: 8648
							var9 = var3.definition.retextureTo.length; // L: 8649
						}

						var14 = new short[var9]; // L: 8651

						for (var10 = 0; var10 < var9; ++var10) { // L: 8652
							var14[var10] = (short)var0.method8591(); // L: 8653
						}
					}

					var15 = (long)(++NPC.field1317 - 1); // L: 8656
					var3.method2542(new class185(var15, var6, var13, var14)); // L: 8657
				}
			}

			if ((var4 & 64) != 0) { // L: 8660
				var3.targetIndex = var0.readUnsignedShort(); // L: 8662
				if (ParamComposition.field2121) { // L: 8663
					var3.targetIndex += var0.method8699() << 16; // L: 8664
					var5 = 16777215; // L: 8665
				} else {
					var5 = 65535; // L: 8668
				}

				if (var5 == var3.targetIndex) { // L: 8670
					var3.targetIndex = -1; // L: 8671
				}
			}

			if ((var4 & 2) != 0) { // L: 8674
				var3.spotAnimation = var0.readUnsignedShort(); // L: 8675
				var5 = var0.method8585(); // L: 8676
				var3.spotAnimationHeight = var5 >> 16; // L: 8677
				var3.field1227 = (var5 & 65535) + Client.cycle; // L: 8678
				var3.spotAnimationFrame = 0; // L: 8679
				var3.spotAnimationFrameCycle = 0; // L: 8680
				if (var3.field1227 > Client.cycle) { // L: 8681
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8682
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 65536) != 0) { // L: 8684
				var5 = var0.method8699(); // L: 8685
				var6 = new int[8]; // L: 8686
				var13 = new short[8]; // L: 8687

				for (var8 = 0; var8 < 8; ++var8) { // L: 8688
					if ((var5 & 1 << var8) != 0) { // L: 8689
						var6[var8] = var0.method8568(); // L: 8690
						var13[var8] = (short)var0.method8781(); // L: 8691
					} else {
						var6[var8] = -1; // L: 8694
						var13[var8] = -1; // L: 8695
					}
				}

				var3.method2540(var6, var13); // L: 8698
			}
		}

	} // L: 8701
}
