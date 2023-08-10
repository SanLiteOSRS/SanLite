import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class25 implements KeyListener, FocusListener {
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static StudioGame field138;
	@ObfuscatedName("ay")
	Collection field136;
	@ObfuscatedName("ar")
	Collection field135;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	class29[] field133;
	@ObfuscatedName("as")
	boolean[] field134;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1158140685
	)
	volatile int field137;

	class25() {
		this.field133 = new class29[3]; // L: 16
		this.field134 = new boolean[112]; // L: 17
		this.field137 = 0; // L: 18
		this.field136 = new ArrayList(100); // L: 21
		this.field135 = new ArrayList(100); // L: 22
	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "801097328"
	)
	void method345(class29 var1, int var2) {
		this.field133[var2] = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "661246345"
	)
	int method347() {
		return this.field137; // L: 30
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1935152839"
	)
	void method348(Component var1) {
		var1.setFocusTraversalKeysEnabled(false); // L: 34
		var1.addKeyListener(this); // L: 35
		var1.addFocusListener(this); // L: 36
	} // L: 37

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "26"
	)
	synchronized void method349(Component var1) {
		var1.removeKeyListener(this); // L: 40
		var1.removeFocusListener(this); // L: 41
		synchronized(this) { // L: 42
			this.field136.add(new class33(4, 0)); // L: 43
		}
	} // L: 45

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1132854168"
	)
	void method350() {
		++this.field137; // L: 48
		this.method351(); // L: 49
		Iterator var1 = this.field135.iterator(); // L: 50

		while (var1.hasNext()) {
			class33 var2 = (class33)var1.next(); // L: 51

			for (int var3 = 0; var3 < this.field133.length && !var2.method470(this.field133[var3]); ++var3) { // L: 53 54
			}
		}

		this.field135.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "325496091"
	)
	synchronized void method351() {
		Collection var1 = this.field135; // L: 148
		this.field135 = this.field136; // L: 149
		this.field136 = var1; // L: 150
	} // L: 151

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label24: {
			var2 = var1.getKeyCode(); // L: 64
			if (var2 >= 0) { // L: 66
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 70
				if (var2 < var4) { // L: 72
					var2 = class343.method6643(var2); // L: 73
					boolean var5 = (var2 & 128) != 0; // L: 76
					if (var5) { // L: 78
						var2 = -1;
					}
					break label24;
				}
			}

			var2 = -1; // L: 82
		}

		if (var2 >= 0) { // L: 84
			this.field134[var2] = true; // L: 85
			this.field136.add(new class33(1, var2)); // L: 86
			this.field137 = 0; // L: 87
		}

		var1.consume(); // L: 89
	} // L: 90

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label17: {
			var2 = var1.getKeyCode(); // L: 93
			if (var2 >= 0) { // L: 95
				int var4 = KeyHandler.KeyHandler_keyCodes.length; // L: 99
				if (var2 < var4) { // L: 101
					var2 = class343.method6643(var2) & -129; // L: 102
					break label17;
				}
			}

			var2 = -1; // L: 106
		}

		if (var2 >= 0) { // L: 108
			this.field134[var2] = false; // L: 109
			this.field136.add(new class33(2, var2)); // L: 110
		}

		var1.consume(); // L: 112
	} // L: 113

	public final synchronized void focusGained(FocusEvent var1) {
		this.field136.add(new class33(4, 1)); // L: 154
	} // L: 155

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) { // L: 158
			if (this.field134[var2]) { // L: 159
				this.field134[var2] = false; // L: 160
				this.field136.add(new class33(2, var2)); // L: 161
			}
		}

		this.field136.add(new class33(4, 0)); // L: 164
	} // L: 165

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar(); // L: 116
		if (var2 != 0 && var2 != '\uffff') { // L: 117
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 120
				label49: {
					if (var2 != 0) { // L: 124
						char[] var4 = class385.cp1252AsciiExtension; // L: 126

						for (int var5 = 0; var5 < var4.length; ++var5) { // L: 127
							char var6 = var4[var5]; // L: 128
							if (var6 == var2) { // L: 130
								var3 = true; // L: 131
								break label49; // L: 132
							}
						}
					}

					var3 = false; // L: 138
				}
			} else {
				var3 = true; // L: 121
			}

			if (var3) { // L: 140
				this.field136.add(new class33(3, var2)); // L: 141
			}
		}

		var1.consume(); // L: 144
	} // L: 145

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "483892465"
	)
	static final void method377(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 444
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 445
			Player var3 = Client.players[var2]; // L: 446
			int var4 = var0.readUnsignedByte(); // L: 447
			if ((var4 & 4) != 0) { // L: 448
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) { // L: 449
				var4 += var0.readUnsignedByte() << 16;
			}

			byte var5 = class218.field2381.field2379; // L: 451
			if ((var4 & 512) != 0) { // L: 452
				class218[] var6 = Players.field1363; // L: 453
				class218[] var8 = new class218[]{class218.field2381, class218.field2384, class218.field2378, class218.field2377}; // L: 457
				var6[var2] = (class218)ClientPreferences.findEnumerated(var8, var0.method9122()); // L: 459
			}

			int var17;
			if ((var4 & 32) != 0) { // L: 461
				var3.targetIndex = var0.method9130(); // L: 463
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 464
				var17 = 16777215; // L: 465
				if (var17 == var3.targetIndex) { // L: 466
					var3.targetIndex = -1; // L: 467
				}
			}

			int var7;
			if ((var4 & 2) != 0) { // L: 470
				var17 = var0.method9087(); // L: 471
				if (var17 == 65535) { // L: 472
					var17 = -1;
				}

				var7 = var0.method9119(); // L: 473
				WorldMapSectionType.performPlayerAnimation(var3, var17, var7); // L: 474
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) { // L: 476
				var17 = var0.readUnsignedShort(); // L: 477
				PlayerType var18 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var0.method9120()); // L: 478
				boolean var19 = var0.readUnsignedByte() == 1; // L: 479
				var9 = var0.method9089(); // L: 480
				var10 = var0.offset; // L: 481
				if (var3.username != null && var3.appearance != null) { // L: 482
					boolean var11 = false; // L: 483
					if (var18.isUser && class177.friendSystem.isIgnored(var3.username)) { // L: 484 485
						var11 = true;
					}

					if (!var11 && Client.field637 == 0 && !var3.isHidden) { // L: 487
						Players.field1374.offset = 0; // L: 488
						var0.method9144(Players.field1374.array, 0, var9); // L: 489
						Players.field1374.offset = 0; // L: 490
						String var12 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(Players.field1374))); // L: 491
						var3.field1213 = var12.trim(); // L: 492
						var3.field1207 = var17 >> 8; // L: 493
						var3.field1208 = var17 & 255; // L: 494
						var3.field1182 = 150; // L: 495
						var3.field1189 = null; // L: 496
						var3.field1204 = var19; // L: 497
						var3.field1192 = var3 != class136.localPlayer && var18.isUser && !Client.field747.isEmpty() && var12.toLowerCase().indexOf(Client.field747) == -1; // L: 498
						if (var18.isPrivileged) { // L: 500
							var13 = var19 ? 91 : 1;
						} else {
							var13 = var19 ? 90 : 2; // L: 501
						}

						if (var18.modIcon != -1) { // L: 502
							class415.addGameMessage(var13, SecureRandomCallable.method2253(var18.modIcon) + var3.username.getName(), var12);
						} else {
							class415.addGameMessage(var13, var3.username.getName(), var12); // L: 503
						}
					}
				}

				var0.offset = var10 + var9; // L: 506
			}

			if ((var4 & 8192) != 0) { // L: 508
				for (var17 = 0; var17 < 3; ++var17) { // L: 509
					var3.actions[var17] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 4096) != 0) { // L: 511
				var3.field1234 = var0.method9124(); // L: 512
				var3.field1236 = var0.method9122(); // L: 513
				var3.field1196 = var0.method9122(); // L: 514
				var3.field1224 = var0.method9124(); // L: 515
				var3.spotAnimation = var0.method9116() + Client.cycle; // L: 516
				var3.field1239 = var0.method9130() + Client.cycle; // L: 517
				var3.field1232 = var0.method9130(); // L: 518
				if (var3.field1118) { // L: 519
					var3.field1234 += var3.tileX; // L: 520
					var3.field1236 += var3.tileY; // L: 521
					var3.field1196 += var3.tileX; // L: 522
					var3.field1224 += var3.tileY; // L: 523
					var3.pathLength = 0; // L: 524
				} else {
					var3.field1234 += var3.pathX[0]; // L: 527
					var3.field1236 += var3.pathY[0]; // L: 528
					var3.field1196 += var3.pathX[0]; // L: 529
					var3.field1224 += var3.pathY[0]; // L: 530
					var3.pathLength = 1; // L: 531
				}

				var3.field1257 = 0; // L: 533
			}

			if ((var4 & 64) != 0) { // L: 535
				var3.field1213 = var0.readStringCp1252NullTerminated(); // L: 536
				if (var3.field1213.charAt(0) == '~') { // L: 537
					var3.field1213 = var3.field1213.substring(1); // L: 538
					class415.addGameMessage(2, var3.username.getName(), var3.field1213); // L: 539
				} else if (var3 == class136.localPlayer) { // L: 541
					class415.addGameMessage(2, var3.username.getName(), var3.field1213); // L: 542
				}

				var3.field1204 = false; // L: 544
				var3.field1207 = 0; // L: 545
				var3.field1208 = 0; // L: 546
				var3.field1182 = 150; // L: 547
			}

			if ((var4 & 32768) != 0) { // L: 549
				var5 = var0.method9124(); // L: 550
			}

			int var21;
			int var25;
			int var29;
			if ((var4 & 2048) != 0) { // L: 552
				var17 = var0.method9130(); // L: 553
				var7 = var17 >> 8; // L: 554
				var29 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0; // L: 555
				PlayerType var20 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var0.method9119()); // L: 556
				boolean var24 = var0.method9119() == 1; // L: 557
				var25 = var0.method9119(); // L: 558
				var21 = var0.offset; // L: 559
				if (var3.username != null && var3.appearance != null) { // L: 560
					boolean var26 = false; // L: 561
					if (var20.isUser && class177.friendSystem.isIgnored(var3.username)) { // L: 562 563
						var26 = true;
					}

					if (!var26 && Client.field637 == 0 && !var3.isHidden) { // L: 565
						Players.field1374.offset = 0; // L: 566
						var0.method9335(Players.field1374.array, 0, var25); // L: 567
						Players.field1374.offset = 0; // L: 568
						String var14 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(Players.field1374))); // L: 569
						var3.field1213 = var14.trim(); // L: 570
						var3.field1207 = var17 >> 8; // L: 571
						var3.field1208 = var17 & 255; // L: 572
						var3.field1182 = 150; // L: 573
						byte[] var15 = null; // L: 574
						int var16;
						if (var29 > 0 && var29 <= 8) { // L: 575
							var15 = new byte[var29]; // L: 576

							for (var16 = 0; var16 < var29; ++var16) { // L: 577
								var15[var16] = var0.method9123(); // L: 578
							}
						}

						var3.field1189 = Ignored.method8066(var15); // L: 581
						var3.field1204 = var24; // L: 582
						var3.field1192 = var3 != class136.localPlayer && var20.isUser && !Client.field747.isEmpty() && var14.toLowerCase().indexOf(Client.field747) == -1; // L: 583
						if (var20.isPrivileged) { // L: 585
							var16 = var24 ? 91 : 1;
						} else {
							var16 = var24 ? 90 : 2; // L: 586
						}

						if (var20.modIcon != -1) { // L: 587
							class415.addGameMessage(var16, SecureRandomCallable.method2253(var20.modIcon) + var3.username.getName(), var14);
						} else {
							class415.addGameMessage(var16, var3.username.getName(), var14); // L: 588
						}
					}
				}

				var0.offset = var29 + var21 + var25; // L: 591
			}

			if ((var4 & 65536) != 0) { // L: 593
				var17 = var0.method9119(); // L: 594

				for (var7 = 0; var7 < var17; ++var7) { // L: 595
					var29 = var0.method9089(); // L: 596
					var9 = var0.readUnsignedShort(); // L: 597
					var10 = var0.method9142(); // L: 598
					var3.method2399(var29, var9, var10 >> 16, var10 & 65535); // L: 599
				}
			}

			if ((var4 & 8) != 0) { // L: 602
				var17 = var0.method9119(); // L: 603
				if (var17 > 0) { // L: 604
					for (var7 = 0; var7 < var17; ++var7) { // L: 605
						var9 = -1; // L: 607
						var10 = -1; // L: 608
						var25 = -1; // L: 609
						var29 = var0.readUShortSmart(); // L: 610
						if (var29 == 32767) { // L: 611
							var29 = var0.readUShortSmart(); // L: 612
							var10 = var0.readUShortSmart(); // L: 613
							var9 = var0.readUShortSmart(); // L: 614
							var25 = var0.readUShortSmart(); // L: 615
						} else if (var29 != 32766) { // L: 617
							var10 = var0.readUShortSmart(); // L: 618
						} else {
							var29 = -1; // L: 620
						}

						var21 = var0.readUShortSmart(); // L: 621
						var3.addHitSplat(var29, var10, var9, var25, Client.cycle, var21); // L: 622
					}
				}

				var7 = var0.method9120(); // L: 625
				if (var7 > 0) { // L: 626
					for (var29 = 0; var29 < var7; ++var29) { // L: 627
						var9 = var0.readUShortSmart(); // L: 628
						var10 = var0.readUShortSmart(); // L: 629
						if (var10 != 32767) { // L: 630
							var25 = var0.readUShortSmart(); // L: 631
							var21 = var0.readUnsignedByte(); // L: 632
							var13 = var10 > 0 ? var0.method9120() : var21; // L: 633
							var3.addHealthBar(var9, Client.cycle, var10, var25, var21, var13); // L: 634
						} else {
							var3.removeHealthBar(var9); // L: 636
						}
					}
				}
			}

			if ((var4 & 128) != 0) { // L: 640
				var3.field1219 = var0.method9116(); // L: 641
				if (var3.pathLength == 0) { // L: 642
					var3.orientation = var3.field1219; // L: 643
					var3.method2392(); // L: 644
				}
			}

			if ((var4 & 256) != 0) { // L: 647
				var3.field1183 = Client.cycle + var0.readUnsignedShort(); // L: 648
				var3.field1244 = Client.cycle + var0.method9130(); // L: 649
				var3.field1245 = var0.method9124(); // L: 650
				var3.field1238 = var0.method9123(); // L: 651
				var3.field1247 = var0.readByte(); // L: 652
				var3.field1248 = (byte)var0.readUnsignedByte(); // L: 653
			}

			if ((var4 & 1) != 0) { // L: 655
				var17 = var0.readUnsignedByte(); // L: 656
				byte[] var27 = new byte[var17]; // L: 657
				Buffer var23 = new Buffer(var27); // L: 658
				var0.method9335(var27, 0, var17); // L: 659
				Players.field1360[var2] = var23; // L: 660
				var3.read(var23); // L: 661
			}

			if (var3.field1118) { // L: 663
				if (var5 == 127) { // L: 664
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class218 var22;
					if (var5 != class218.field2381.field2379) { // L: 667
						class218[] var28 = new class218[]{class218.field2381, class218.field2384, class218.field2378, class218.field2377}; // L: 670
						var22 = (class218)ClientPreferences.findEnumerated(var28, var5); // L: 672
					} else {
						var22 = Players.field1363[var2]; // L: 674
					}

					var3.method2326(var3.tileX, var3.tileY, var22); // L: 675
				}
			}
		}

	} // L: 681

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1524159145"
	)
	static final void method352(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11047
		int var7 = var3 - var1; // L: 11048
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11049
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11050
		int var10 = var8; // L: 11051
		if (var8 < var9) { // L: 11052
			var10 = var9;
		}

		if (var10 != 0) { // L: 11053
			int var11 = (var6 << 16) / var10; // L: 11054
			int var12 = (var7 << 16) / var10; // L: 11055
			if (var12 <= var11) { // L: 11056
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11057
			}

			int var13 = var5 * var12 >> 17; // L: 11058
			int var14 = var5 * var12 + 1 >> 17; // L: 11059
			int var15 = var5 * var11 >> 17; // L: 11060
			int var16 = var5 * var11 + 1 >> 17; // L: 11061
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11062
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11063
			int var17 = var0 + var13; // L: 11064
			int var18 = var0 - var14; // L: 11065
			int var19 = var0 + var6 - var14; // L: 11066
			int var20 = var0 + var13 + var6; // L: 11067
			int var21 = var15 + var1; // L: 11068
			int var22 = var1 - var16; // L: 11069
			int var23 = var7 + var1 - var16; // L: 11070
			int var24 = var7 + var15 + var1; // L: 11071
			Rasterizer3D.method4444(var17, var18, var19); // L: 11072
			Rasterizer3D.method4457(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 11073
			Rasterizer3D.method4444(var17, var19, var20); // L: 11074
			Rasterizer3D.method4457(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11075
		}
	} // L: 11076
}
