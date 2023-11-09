import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 35817219
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1619140395
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1648907397
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1378537689
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2109242451
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 943209293
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -101053359
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -2054777205
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1338466827
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -605414873
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 657340511
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -548338019
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -989921259
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1376821153
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lit;S)V",
		garbageValue = "2518"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "24"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1979934212"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2141431041"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lki;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "2122367720"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-707218127"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044547637"
	)
	public static void method5106() {
		synchronized(MouseHandler.KeyHandler_instance) { // L: 45
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 46
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 47
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 48
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 49
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 51
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 52
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 53
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 54
		}
	} // L: 56

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396413547"
	)
	static final void method5101() {
		if (Client.logoutTimer > 0) { // L: 3047
			class376.logOut(); // L: 3048
		} else {
			Client.timer.method7168(); // L: 3051
			class21.method305(40); // L: 3052
			Frames.field2528 = Client.packetWriter.getSocket(); // L: 3053
			Client.packetWriter.removeSocket(); // L: 3054
		}
	} // L: 3049 3055

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(ZLqk;B)V",
		garbageValue = "71"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field626 = 0; // L: 8330
		Client.field550 = 0; // L: 8331
		ClanChannelMember.method3000(); // L: 8332

		int var2;
		int var3;
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var17;
		while (true) {
			var2 = GameObject.field2733 ? 16 : 15; // L: 8335
			var3 = 1 << var2; // L: 8336
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) { // L: 8337
				break;
			}

			int var4 = var1.readBits(var2); // L: 8338
			if (var4 == var3 - 1) { // L: 8339
				break;
			}

			boolean var5 = false; // L: 8340
			if (Client.npcs[var4] == null) { // L: 8341
				Client.npcs[var4] = new NPC(); // L: 8342
				var5 = true; // L: 8343
			}

			NPC var15 = Client.npcs[var4]; // L: 8345
			Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8346
			var15.npcCycle = Client.cycle; // L: 8347
			if (GameObject.field2733) { // L: 8351
				var10 = var1.readBits(1); // L: 8352
				if (var10 == 1) { // L: 8353
					Client.field551[++Client.field550 - 1] = var4;
				}

				boolean var11 = var1.readBits(1) == 1; // L: 8354
				if (var11) { // L: 8355
					var1.readBits(32); // L: 8356
				}

				var7 = var1.readBits(1); // L: 8358
				var15.definition = HealthBarDefinition.getNpcDefinition(var1.readBits(14)); // L: 8359
				if (var0) { // L: 8360
					var8 = var1.readBits(8); // L: 8361
					if (var8 > 127) { // L: 8362
						var8 -= 256;
					}
				} else {
					var8 = var1.readBits(5); // L: 8365
					if (var8 > 15) { // L: 8366
						var8 -= 32;
					}
				}

				var12 = Client.field631[var1.readBits(3)]; // L: 8368
				if (var5) { // L: 8369
					var15.orientation = var15.rotation = var12;
				}

				if (var0) { // L: 8370
					var9 = var1.readBits(8); // L: 8371
					if (var9 > 127) { // L: 8372
						var9 -= 256;
					}
				} else {
					var9 = var1.readBits(5); // L: 8375
					if (var9 > 15) { // L: 8376
						var9 -= 32;
					}
				}
			} else {
				var15.definition = HealthBarDefinition.getNpcDefinition(var1.readBits(14)); // L: 8380
				if (var0) { // L: 8381
					var9 = var1.readBits(8); // L: 8382
					if (var9 > 127) { // L: 8383
						var9 -= 256;
					}
				} else {
					var9 = var1.readBits(5); // L: 8386
					if (var9 > 15) { // L: 8387
						var9 -= 32;
					}
				}

				if (var0) { // L: 8389
					var8 = var1.readBits(8); // L: 8390
					if (var8 > 127) { // L: 8391
						var8 -= 256;
					}
				} else {
					var8 = var1.readBits(5); // L: 8394
					if (var8 > 15) { // L: 8395
						var8 -= 32;
					}
				}

				var7 = var1.readBits(1); // L: 8397
				var10 = Client.field631[var1.readBits(3)]; // L: 8398
				if (var5) { // L: 8399
					var15.orientation = var15.rotation = var10;
				}

				var17 = var1.readBits(1); // L: 8400
				if (var17 == 1) { // L: 8401
					Client.field551[++Client.field550 - 1] = var4;
				}

				boolean var18 = var1.readBits(1) == 1; // L: 8402
				if (var18) { // L: 8403
					var1.readBits(32); // L: 8404
				}
			}

			var15.field1201 = var15.definition.size; // L: 8407
			var15.field1205 = var15.definition.rotation; // L: 8408
			if (var15.field1205 == 0) { // L: 8409
				var15.rotation = 0;
			}

			var15.walkSequence = var15.definition.walkSequence; // L: 8410
			var15.walkBackSequence = var15.definition.walkBackSequence; // L: 8411
			var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 8412
			var15.walkRightSequence = var15.definition.walkRightSequence; // L: 8413
			var15.idleSequence = var15.definition.idleSequence; // L: 8414
			var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 8415
			var15.turnRightSequence = var15.definition.turnRightSequence; // L: 8416
			var15.runSequence = var15.definition.field1970; // L: 8417
			var15.field1181 = var15.definition.field1984; // L: 8418
			var15.field1151 = var15.definition.field1972; // L: 8419
			var15.field1152 = var15.definition.field1954; // L: 8420
			var15.field1153 = var15.definition.field1971; // L: 8421
			var15.field1209 = var15.definition.field1975; // L: 8422
			var15.field1184 = var15.definition.field1995; // L: 8423
			var15.field1156 = var15.definition.field1992; // L: 8424
			var15.method2497(class296.localPlayer.pathX[0] + var8, class296.localPlayer.pathY[0] + var9, var7 == 1); // L: 8425
		}

		var1.exportIndex(); // L: 8427

		for (var2 = 0; var2 < Client.field550; ++var2) { // L: 8430
			var3 = Client.field551[var2]; // L: 8431
			NPC var14 = Client.npcs[var3]; // L: 8432
			int var16 = var1.readUnsignedByte(); // L: 8433
			int var6;
			if ((var16 & 32) != 0) { // L: 8434
				var6 = var1.readUnsignedByte(); // L: 8435
				var16 += var6 << 8; // L: 8436
			}

			if ((var16 & 2) != 0) { // L: 8438
				var14.spotAnimation = var1.method8444(); // L: 8439
				var6 = var1.readInt(); // L: 8440
				var14.field1159 = var6 >> 16; // L: 8441
				var14.field1186 = (var6 & 65535) + Client.cycle; // L: 8442
				var14.spotAnimationFrame = 0; // L: 8443
				var14.field1142 = 0; // L: 8444
				if (var14.field1186 > Client.cycle) { // L: 8445
					var14.spotAnimationFrame = -1;
				}

				if (var14.spotAnimation == 65535) { // L: 8446
					var14.spotAnimation = -1;
				}
			}

			if ((var16 & 8) != 0) { // L: 8448
				var6 = var1.method8623(); // L: 8449
				if (var6 > 0) { // L: 8450
					for (var7 = 0; var7 < var6; ++var7) { // L: 8451
						var9 = -1; // L: 8453
						var10 = -1; // L: 8454
						var17 = -1; // L: 8455
						var8 = var1.readUShortSmart(); // L: 8456
						if (var8 == 32767) { // L: 8457
							var8 = var1.readUShortSmart(); // L: 8458
							var10 = var1.readUShortSmart(); // L: 8459
							var9 = var1.readUShortSmart(); // L: 8460
							var17 = var1.readUShortSmart(); // L: 8461
						} else if (var8 != 32766) { // L: 8463
							var10 = var1.readUShortSmart(); // L: 8464
						} else {
							var8 = -1; // L: 8466
						}

						var12 = var1.readUShortSmart(); // L: 8467
						var14.addHitSplat(var8, var10, var9, var17, Client.cycle, var12); // L: 8468
					}
				}

				var7 = var1.method8435(); // L: 8471
				if (var7 > 0) { // L: 8472
					for (var8 = 0; var8 < var7; ++var8) { // L: 8473
						var9 = var1.readUShortSmart(); // L: 8474
						var10 = var1.readUShortSmart(); // L: 8475
						if (var10 != 32767) { // L: 8476
							var17 = var1.readUShortSmart(); // L: 8477
							var12 = var1.method8623(); // L: 8478
							int var13 = var10 > 0 ? var1.method8435() : var12; // L: 8479
							var14.addHealthBar(var9, Client.cycle, var10, var17, var12, var13); // L: 8480
						} else {
							var14.removeHealthBar(var9); // L: 8482
						}
					}
				}
			}

			if ((var16 & 2048) != 0) { // L: 8486
				var14.method2488(var1.readStringCp1252NullTerminated()); // L: 8487
			}

			if ((var16 & 512) != 0) { // L: 8489
				var14.field1212 = var1.method8456(); // L: 8490
			}

			if ((var16 & 4) != 0) { // L: 8492
				var6 = var1.method8444(); // L: 8493
				var7 = var1.method8446(); // L: 8494
				var14.field1173 = var1.method8435() == 1; // L: 8495
				var8 = var14.x - (var6 - class26.baseX * 64 - class26.baseX * 64) * 64; // L: 8496
				var9 = var14.y - (var7 - class158.baseY * 64 - class158.baseY * 64) * 64; // L: 8497
				if (var8 != 0 || var9 != 0) { // L: 8498
					var14.field1203 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
				}
			}

			if ((var16 & 128) != 0) { // L: 8500
				var6 = var1.readUnsignedShort(); // L: 8501
				if (var6 == 65535) { // L: 8502
					var6 = -1; // L: 8503
				}

				var7 = var1.method8623(); // L: 8505
				if (var6 == var14.sequence && var6 != -1) { // L: 8506
					var8 = WorldMapElement.SequenceDefinition_get(var6).field2232; // L: 8507
					if (var8 == 1) { // L: 8508
						var14.sequenceFrame = 0; // L: 8509
						var14.sequenceFrameCycle = 0; // L: 8510
						var14.sequenceDelay = var7; // L: 8511
						var14.field1210 = 0; // L: 8512
					}

					if (var8 == 2) { // L: 8514
						var14.field1210 = 0; // L: 8515
					}
				} else if (var6 == -1 || var14.sequence == -1 || WorldMapElement.SequenceDefinition_get(var6).field2225 >= WorldMapElement.SequenceDefinition_get(var14.sequence).field2225) { // L: 8518
					var14.sequence = var6; // L: 8519
					var14.sequenceFrame = 0; // L: 8520
					var14.sequenceFrameCycle = 0; // L: 8521
					var14.sequenceDelay = var7; // L: 8522
					var14.field1210 = 0; // L: 8523
					var14.field1211 = var14.pathLength; // L: 8524
				}
			}

			if ((var16 & 64) != 0) { // L: 8528
				var14.overheadText = var1.readStringCp1252NullTerminated(); // L: 8529
				var14.overheadTextCyclesRemaining = 100; // L: 8530
			}

			if ((var16 & 1024) != 0) { // L: 8532
				var14.field1150 = var1.method8617(); // L: 8533
				var14.field1190 = var1.method8469(); // L: 8534
				var14.field1189 = var1.method8617(); // L: 8535
				var14.field1188 = var1.readByte(); // L: 8536
				var14.field1192 = var1.readUnsignedShort() + Client.cycle; // L: 8537
				var14.field1193 = var1.readUnsignedShort() + Client.cycle; // L: 8538
				var14.field1194 = var1.method8446(); // L: 8539
				var14.pathLength = 1; // L: 8540
				var14.field1211 = 0; // L: 8541
				var14.field1150 += var14.pathX[0]; // L: 8542
				var14.field1190 += var14.pathY[0]; // L: 8543
				var14.field1189 += var14.pathX[0]; // L: 8544
				var14.field1188 += var14.pathY[0]; // L: 8545
			}

			if ((var16 & 4096) != 0) { // L: 8547
				var14.field1197 = Client.cycle + var1.method8446(); // L: 8548
				var14.field1198 = Client.cycle + var1.method8484(); // L: 8549
				var14.field1199 = var1.readByte(); // L: 8550
				var14.field1200 = var1.method8440(); // L: 8551
				var14.field1185 = var1.readByte(); // L: 8552
				var14.field1202 = (byte)var1.readUnsignedByte(); // L: 8553
			}

			if ((var16 & 1) != 0) { // L: 8555
				var14.targetIndex = var1.method8444(); // L: 8557
				if (GameObject.field2733) { // L: 8558
					var14.targetIndex += var1.method8435() << 16; // L: 8559
					var6 = 16777215; // L: 8560
				} else {
					var6 = 65535; // L: 8563
				}

				if (var6 == var14.targetIndex) { // L: 8565
					var14.targetIndex = -1; // L: 8566
				}
			}

			if ((var16 & 16) != 0) { // L: 8569
				var14.definition = HealthBarDefinition.getNpcDefinition(var1.method8444()); // L: 8570
				var14.field1201 = var14.definition.size; // L: 8571
				var14.field1205 = var14.definition.rotation; // L: 8572
				var14.walkSequence = var14.definition.walkSequence; // L: 8573
				var14.walkBackSequence = var14.definition.walkBackSequence; // L: 8574
				var14.walkLeftSequence = var14.definition.walkLeftSequence; // L: 8575
				var14.walkRightSequence = var14.definition.walkRightSequence; // L: 8576
				var14.idleSequence = var14.definition.idleSequence; // L: 8577
				var14.turnLeftSequence = var14.definition.turnLeftSequence; // L: 8578
				var14.turnRightSequence = var14.definition.turnRightSequence; // L: 8579
			}

			if ((var16 & 256) != 0) { // L: 8581
				var14.method2489(var1.method8435()); // L: 8582
			}
		}

		for (var2 = 0; var2 < Client.field626; ++var2) { // L: 8586
			var3 = Client.field627[var2]; // L: 8587
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8588
				Client.npcs[var3].definition = null; // L: 8589
				Client.npcs[var3] = null; // L: 8590
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8593
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8594
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8595
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8596
				}
			}

		}
	} // L: 8599
}
