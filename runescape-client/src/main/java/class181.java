import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
final class class181 implements ThreadFactory {
	@ObfuscatedName("aq")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load"); // L: 390
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ltg;",
		garbageValue = "2034130252"
	)
	public static PrivateChatMode method3544(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5040, PrivateChatMode.field5037, PrivateChatMode.field5039}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field5038) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lew;FZI)F",
		garbageValue = "-1190281991"
	)
	static float method3541(class127 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 147
		if (var0 != null && var0.method2980() != 0) { // L: 148
			float var4 = (float)var0.field1501[0].field1455; // L: 151
			float var5 = (float)var0.field1501[var0.method2980() - 1].field1455; // L: 152
			float var6 = var5 - var4; // L: 153
			if (0.0D == (double)var6) { // L: 154
				return var0.field1501[0].field1446; // L: 155
			} else {
				float var7 = 0.0F; // L: 157
				if (var1 > var5) { // L: 158
					var7 = (var1 - var5) / var6; // L: 159
				} else {
					var7 = (var1 - var4) / var6; // L: 162
				}

				double var8 = (double)((int)var7); // L: 164
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 165
				float var11 = var10 * var6; // L: 166
				var8 = Math.abs(var8 + 1.0D); // L: 167
				double var12 = var8 / 2.0D; // L: 168
				double var14 = (double)((int)var12); // L: 169
				var10 = (float)(var12 - var14); // L: 170
				float var16;
				float var17;
				if (var2) { // L: 173
					if (var0.field1499 == class125.field1486) { // L: 174
						if ((double)var10 != 0.0D) { // L: 175
							var11 += var4; // L: 176
						} else {
							var11 = var5 - var11; // L: 179
						}
					} else if (var0.field1499 != class125.field1484 && var0.field1499 != class125.field1483) { // L: 182
						if (var0.field1499 == class125.field1489) { // L: 185
							var11 = var4 - var1; // L: 186
							var16 = var0.field1501[0].field1447; // L: 187
							var17 = var0.field1501[0].field1448; // L: 188
							var3 = var0.field1501[0].field1446; // L: 189
							if ((double)var16 != 0.0D) { // L: 190
								var3 -= var11 * var17 / var16; // L: 191
							}

							return var3; // L: 193
						}
					} else {
						var11 = var5 - var11; // L: 183
					}
				} else if (var0.field1512 == class125.field1486) { // L: 197
					if (0.0D != (double)var10) { // L: 198
						var11 = var5 - var11; // L: 199
					} else {
						var11 += var4; // L: 202
					}
				} else if (var0.field1512 != class125.field1484 && var0.field1512 != class125.field1483) { // L: 205
					if (var0.field1512 == class125.field1489) { // L: 208
						var11 = var1 - var5; // L: 209
						var16 = var0.field1501[var0.method2980() - 1].field1449; // L: 210
						var17 = var0.field1501[var0.method2980() - 1].field1450; // L: 211
						var3 = var0.field1501[var0.method2980() - 1].field1446; // L: 212
						if (0.0D != (double)var16) { // L: 213
							var3 += var11 * var17 / var16; // L: 214
						}

						return var3; // L: 216
					}
				} else {
					var11 += var4; // L: 206
				}

				var3 = AttackOption.method2646(var0, var11); // L: 219
				float var18;
				if (var2 && var0.field1499 == class125.field1483) { // L: 221
					var18 = var0.field1501[var0.method2980() - 1].field1446 - var0.field1501[0].field1446; // L: 222
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 223
				} else if (!var2 && var0.field1512 == class125.field1483) { // L: 225
					var18 = var0.field1501[var0.method2980() - 1].field1446 - var0.field1501[0].field1446; // L: 226
					var3 = (float)((double)var3 + var8 * (double)var18); // L: 227
				}

				return var3; // L: 229
			}
		} else {
			return var3; // L: 149
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "-1830172640"
	)
	static final void method3542(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field539; ++var1) { // L: 8353
			int var2 = Client.field662[var1]; // L: 8354
			NPC var3 = Client.npcs[var2]; // L: 8355
			int var4 = var0.readUnsignedByte(); // L: 8356
			int var5;
			if ((var4 & 8) != 0) { // L: 8357
				var5 = var0.readUnsignedByte(); // L: 8358
				var4 += var5 << 8; // L: 8359
			}

			if ((var4 & 4096) != 0) { // L: 8361
				var5 = var0.readUnsignedByte(); // L: 8362
				var4 += var5 << 16; // L: 8363
			}

			int var6;
			int var7;
			if ((var4 & 16) != 0) { // L: 8365
				var5 = var0.method8831(); // L: 8366
				if (var5 == 65535) { // L: 8367
					var5 = -1; // L: 8368
				}

				var6 = var0.method8650(); // L: 8370
				if (var5 == var3.sequence && var5 != -1) { // L: 8371
					var7 = Coord.SequenceDefinition_get(var5).field2276; // L: 8372
					if (var7 == 1) { // L: 8373
						var3.sequenceFrame = 0; // L: 8374
						var3.sequenceFrameCycle = 0; // L: 8375
						var3.sequenceDelay = var6; // L: 8376
						var3.field1186 = 0; // L: 8377
					}

					if (var7 == 2) { // L: 8379
						var3.field1186 = 0; // L: 8380
					}
				} else if (var5 == -1 || var3.sequence == -1 || Coord.SequenceDefinition_get(var5).field2269 >= Coord.SequenceDefinition_get(var3.sequence).field2269) { // L: 8383
					var3.sequence = var5; // L: 8384
					var3.sequenceFrame = 0; // L: 8385
					var3.sequenceFrameCycle = 0; // L: 8386
					var3.sequenceDelay = var6; // L: 8387
					var3.field1186 = 0; // L: 8388
					var3.field1215 = var3.pathLength; // L: 8389
				}
			}

			int var8;
			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) { // L: 8393
				var5 = var0.readUnsignedByte(); // L: 8394
				var13 = new int[8]; // L: 8395
				var14 = new short[8]; // L: 8396

				for (var8 = 0; var8 < 8; ++var8) { // L: 8397
					if ((var5 & 1 << var8) != 0) { // L: 8398
						var13[var8] = var0.method8638(); // L: 8399
						var14[var8] = (short)var0.method8628(); // L: 8400
					} else {
						var13[var8] = -1; // L: 8403
						var14[var8] = -1; // L: 8404
					}
				}

				var3.method2563(var13, var14); // L: 8407
			}

			if ((var4 & 8192) != 0) { // L: 8409
				var3.method2570(var0.method8651()); // L: 8410
			}

			if ((var4 & 4) != 0) { // L: 8412
				var3.targetIndex = var0.method8660(); // L: 8414
				var3.targetIndex += var0.method8614() << 16; // L: 8415
				var5 = 16777215; // L: 8416
				if (var5 == var3.targetIndex) { // L: 8417
					var3.targetIndex = -1; // L: 8418
				}
			}

			if ((var4 & 65536) != 0) { // L: 8421
				var5 = var0.method8616(); // L: 8422
				var3.turnLeftSequence = (var5 & 1) != 0 ? var0.method8831() : var3.definition.turnLeftSequence; // L: 8423
				var3.turnRightSequence = (var5 & 2) != 0 ? var0.method8662() : var3.definition.turnRightSequence; // L: 8424
				var3.walkSequence = (var5 & 4) != 0 ? var0.method8660() : var3.definition.walkSequence; // L: 8425
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence; // L: 8426
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.method8662() : var3.definition.walkLeftSequence; // L: 8427
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.method8662() : var3.definition.walkRightSequence; // L: 8428
				var3.runSequence = (var5 & 64) != 0 ? var0.method8660() : var3.definition.field2003; // L: 8429
				var3.field1152 = (var5 & 128) != 0 ? var0.method8831() : var3.definition.field2004; // L: 8430
				var3.field1153 = (var5 & 256) != 0 ? var0.method8660() : var3.definition.field2005; // L: 8431
				var3.field1154 = (var5 & 512) != 0 ? var0.method8660() : var3.definition.field2006; // L: 8432
				var3.field1155 = (var5 & 1024) != 0 ? var0.method8660() : var3.definition.field2007; // L: 8433
				var3.field1200 = (var5 & 2048) != 0 ? var0.method8660() : var3.definition.field2008; // L: 8434
				var3.field1212 = (var5 & 4096) != 0 ? var0.method8662() : var3.definition.field2009; // L: 8435
				var3.field1158 = (var5 & 8192) != 0 ? var0.method8831() : var3.definition.field1989; // L: 8436
				var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShort() : var3.definition.idleSequence; // L: 8437
			}

			if ((var4 & 32) != 0) { // L: 8439
				var3.spotAnimation = var0.method8831(); // L: 8440
				var5 = var0.readInt(); // L: 8441
				var3.field1191 = var5 >> 16; // L: 8442
				var3.field1190 = (var5 & 65535) + Client.cycle; // L: 8443
				var3.spotAnimationFrame = 0; // L: 8444
				var3.field1175 = 0; // L: 8445
				if (var3.field1190 > Client.cycle) { // L: 8446
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8447
					var3.spotAnimation = -1;
				}
			}

			int var9;
			int var10;
			if ((var4 & 1) != 0) { // L: 8449
				var5 = var0.readUnsignedByte(); // L: 8450
				int var11;
				if (var5 > 0) { // L: 8451
					for (var6 = 0; var6 < var5; ++var6) { // L: 8452
						var8 = -1; // L: 8454
						var9 = -1; // L: 8455
						var10 = -1; // L: 8456
						var7 = var0.readUShortSmart(); // L: 8457
						if (var7 == 32767) { // L: 8458
							var7 = var0.readUShortSmart(); // L: 8459
							var9 = var0.readUShortSmart(); // L: 8460
							var8 = var0.readUShortSmart(); // L: 8461
							var10 = var0.readUShortSmart(); // L: 8462
						} else if (var7 != 32766) { // L: 8464
							var9 = var0.readUShortSmart(); // L: 8465
						} else {
							var7 = -1; // L: 8467
						}

						var11 = var0.readUShortSmart(); // L: 8468
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8469
					}
				}

				var6 = var0.method8651(); // L: 8472
				if (var6 > 0) { // L: 8473
					for (var7 = 0; var7 < var6; ++var7) { // L: 8474
						var8 = var0.readUShortSmart(); // L: 8475
						var9 = var0.readUShortSmart(); // L: 8476
						if (var9 != 32767) { // L: 8477
							var10 = var0.readUShortSmart(); // L: 8478
							var11 = var0.method8651(); // L: 8479
							int var12 = var9 > 0 ? var0.method8651() : var11; // L: 8480
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8481
						} else {
							var3.removeHealthBar(var8); // L: 8483
						}
					}
				}
			}

			if ((var4 & 32768) != 0) { // L: 8487
				var3.field1201 = Client.cycle + var0.method8831(); // L: 8488
				var3.field1159 = Client.cycle + var0.readUnsignedShort(); // L: 8489
				var3.field1203 = var0.readByte(); // L: 8490
				var3.field1185 = var0.method8604(); // L: 8491
				var3.field1165 = var0.method8604(); // L: 8492
				var3.field1206 = (byte)var0.readUnsignedByte(); // L: 8493
			}

			if ((var4 & 512) != 0) { // L: 8495
				var3.field1189 = var0.readInt(); // L: 8496
			}

			short[] var15;
			long var16;
			if ((var4 & 2048) != 0) { // L: 8498
				var5 = var0.readUnsignedByte(); // L: 8499
				if ((var5 & 1) == 1) { // L: 8500
					var3.method2589(); // L: 8501
				} else {
					var13 = null; // L: 8504
					if ((var5 & 2) == 2) { // L: 8505
						var7 = var0.method8614(); // L: 8506
						var13 = new int[var7]; // L: 8507

						for (var8 = 0; var8 < var7; ++var8) { // L: 8508
							var9 = var0.method8660(); // L: 8509
							var9 = var9 == 65535 ? -1 : var9; // L: 8510
							var13[var8] = var9; // L: 8511
						}
					}

					var14 = null; // L: 8514
					if ((var5 & 4) == 4) { // L: 8515
						var8 = 0; // L: 8516
						if (var3.definition.recolorTo != null) { // L: 8517
							var8 = var3.definition.recolorTo.length; // L: 8518
						}

						var14 = new short[var8]; // L: 8520

						for (var9 = 0; var9 < var8; ++var9) { // L: 8521
							var14[var9] = (short)var0.readUnsignedShort(); // L: 8522
						}
					}

					var15 = null; // L: 8525
					if ((var5 & 8) == 8) { // L: 8526
						var9 = 0; // L: 8527
						if (var3.definition.retextureTo != null) { // L: 8528
							var9 = var3.definition.retextureTo.length; // L: 8529
						}

						var15 = new short[var9]; // L: 8531

						for (var10 = 0; var10 < var9; ++var10) { // L: 8532
							var15[var10] = (short)var0.method8660(); // L: 8533
						}
					}

					var16 = (long)(++NPC.field1284 - 1); // L: 8536
					var3.method2565(new class191(var16, var13, var14, var15)); // L: 8537
				}
			}

			if ((var4 & 256) != 0) { // L: 8540
				var3.method2619(var0.readStringCp1252NullTerminated()); // L: 8541
			}

			if ((var4 & 2) != 0) { // L: 8543
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8544
				var3.overheadTextCyclesRemaining = 100; // L: 8545
			}

			if ((var4 & 1024) != 0) { // L: 8547
				var3.field1192 = var0.method8656(); // L: 8548
				var3.field1194 = var0.method8604(); // L: 8549
				var3.field1202 = var0.readByte(); // L: 8550
				var3.field1195 = var0.method8656(); // L: 8551
				var3.field1196 = var0.method8660() + Client.cycle; // L: 8552
				var3.field1197 = var0.method8660() + Client.cycle; // L: 8553
				var3.field1162 = var0.method8660(); // L: 8554
				var3.pathLength = 1; // L: 8555
				var3.field1215 = 0; // L: 8556
				var3.field1192 += var3.pathX[0]; // L: 8557
				var3.field1194 += var3.pathY[0]; // L: 8558
				var3.field1202 += var3.pathX[0]; // L: 8559
				var3.field1195 += var3.pathY[0]; // L: 8560
			}

			if ((var4 & 64) != 0) { // L: 8562
				var3.definition = class188.getNpcDefinition(var0.readUnsignedShort()); // L: 8563
				class418.method7808(var3); // L: 8564
				var3.method2585(); // L: 8565
			}

			if ((var4 & 128) != 0) { // L: 8567
				var5 = var0.method8662(); // L: 8568
				var6 = var0.method8662(); // L: 8569
				var3.field1157 = var0.readUnsignedByte() == 1; // L: 8570
				if (Client.field557 >= 212) { // L: 8571
					var3.field1180 = var5; // L: 8572
					var3.field1176 = var6; // L: 8573
				} else {
					var7 = var3.x - (var5 - GameEngine.baseX * 64 - GameEngine.baseX * 64) * 64; // L: 8576
					var8 = var3.y - (var6 - class178.baseY * 64 - class178.baseY * 64) * 64; // L: 8577
					if (var7 != 0 || var8 != 0) { // L: 8578
						var3.field1164 = HitSplatDefinition.method3856(var7, var8);
					}
				}
			}

			if ((var4 & 16384) != 0) { // L: 8581
				var5 = var0.method8650(); // L: 8582
				if ((var5 & 1) == 1) { // L: 8583
					var3.method2607(); // L: 8584
				} else {
					var13 = null; // L: 8587
					if ((var5 & 2) == 2) { // L: 8588
						var7 = var0.method8614(); // L: 8589
						var13 = new int[var7]; // L: 8590

						for (var8 = 0; var8 < var7; ++var8) { // L: 8591
							var9 = var0.method8831(); // L: 8592
							var9 = var9 == 65535 ? -1 : var9; // L: 8593
							var13[var8] = var9; // L: 8594
						}
					}

					var14 = null; // L: 8597
					if ((var5 & 4) == 4) { // L: 8598
						var8 = 0; // L: 8599
						if (var3.definition.recolorTo != null) { // L: 8600
							var8 = var3.definition.recolorTo.length; // L: 8601
						}

						var14 = new short[var8]; // L: 8603

						for (var9 = 0; var9 < var8; ++var9) { // L: 8604
							var14[var9] = (short)var0.method8662(); // L: 8605
						}
					}

					var15 = null; // L: 8608
					if ((var5 & 8) == 8) { // L: 8609
						var9 = 0; // L: 8610
						if (var3.definition.retextureTo != null) { // L: 8611
							var9 = var3.definition.retextureTo.length; // L: 8612
						}

						var15 = new short[var9]; // L: 8614

						for (var10 = 0; var10 < var9; ++var10) { // L: 8615
							var15[var10] = (short)var0.method8831(); // L: 8616
						}
					}

					var16 = (long)(++NPC.field1282 - 1); // L: 8619
					var3.method2567(new class191(var16, var13, var14, var15)); // L: 8620
				}
			}
		}

	} // L: 8624
}
