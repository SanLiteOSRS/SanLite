import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -701150667
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ah")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luy;II)V",
		garbageValue = "2004765344"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 448
		if (var2) { // L: 449
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 450
		Player var4 = Client.players[var1]; // L: 451
		if (var3 == 0) { // L: 452
			if (var2) { // L: 453
				var4.field1124 = false; // L: 454
			} else if (Client.localPlayerIndex == var1) { // L: 457
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class20.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class19.baseY * 64 + var4.pathY[0] >> 13); // L: 458
				if (var4.field1223 != -1) { // L: 459
					Players.Players_orientations[var1] = var4.field1223;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 460
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 461
				Client.players[var1] = null; // L: 462
				if (var0.readBits(1) != 0) { // L: 463
					class304.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 466
				var5 = var0.readBits(3); // L: 467
				var6 = var4.pathX[0]; // L: 468
				var7 = var4.pathY[0]; // L: 469
				if (var5 == 0) { // L: 470
					--var6; // L: 471
					--var7; // L: 472
				} else if (var5 == 1) { // L: 474
					--var7;
				} else if (var5 == 2) { // L: 475
					++var6; // L: 476
					--var7; // L: 477
				} else if (var5 == 3) { // L: 479
					--var6;
				} else if (var5 == 4) { // L: 480
					++var6;
				} else if (var5 == 5) { // L: 481
					--var6; // L: 482
					++var7; // L: 483
				} else if (var5 == 6) { // L: 485
					++var7;
				} else if (var5 == 7) { // L: 486
					++var6; // L: 487
					++var7; // L: 488
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 490
					var4.resetPath(var6, var7); // L: 491
					var4.field1124 = false; // L: 492
				} else if (var2) { // L: 494
					var4.field1124 = true; // L: 495
					var4.tileX = var6; // L: 496
					var4.tileY = var7; // L: 497
				} else {
					var4.field1124 = false; // L: 500
					var4.method2374(var6, var7, Players.field1370[var1]); // L: 501
				}

			} else if (var3 == 2) { // L: 505
				var5 = var0.readBits(4); // L: 506
				var6 = var4.pathX[0]; // L: 507
				var7 = var4.pathY[0]; // L: 508
				if (var5 == 0) { // L: 509
					var6 -= 2; // L: 510
					var7 -= 2; // L: 511
				} else if (var5 == 1) { // L: 513
					--var6; // L: 514
					var7 -= 2; // L: 515
				} else if (var5 == 2) { // L: 517
					var7 -= 2;
				} else if (var5 == 3) { // L: 518
					++var6; // L: 519
					var7 -= 2; // L: 520
				} else if (var5 == 4) { // L: 522
					var6 += 2; // L: 523
					var7 -= 2; // L: 524
				} else if (var5 == 5) { // L: 526
					var6 -= 2; // L: 527
					--var7; // L: 528
				} else if (var5 == 6) { // L: 530
					var6 += 2; // L: 531
					--var7; // L: 532
				} else if (var5 == 7) { // L: 534
					var6 -= 2;
				} else if (var5 == 8) { // L: 535
					var6 += 2;
				} else if (var5 == 9) { // L: 536
					var6 -= 2; // L: 537
					++var7; // L: 538
				} else if (var5 == 10) { // L: 540
					var6 += 2; // L: 541
					++var7; // L: 542
				} else if (var5 == 11) { // L: 544
					var6 -= 2; // L: 545
					var7 += 2; // L: 546
				} else if (var5 == 12) { // L: 548
					--var6; // L: 549
					var7 += 2; // L: 550
				} else if (var5 == 13) { // L: 552
					var7 += 2;
				} else if (var5 == 14) { // L: 553
					++var6; // L: 554
					var7 += 2; // L: 555
				} else if (var5 == 15) { // L: 557
					var6 += 2; // L: 558
					var7 += 2; // L: 559
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 561
					var4.resetPath(var6, var7); // L: 562
					var4.field1124 = false; // L: 563
				} else if (var2) { // L: 565
					var4.field1124 = true; // L: 566
					var4.tileX = var6; // L: 567
					var4.tileY = var7; // L: 568
				} else {
					var4.field1124 = false; // L: 571
					var4.method2374(var6, var7, Players.field1370[var1]); // L: 572
				}

			} else {
				var5 = var0.readBits(1); // L: 576
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 577
					var6 = var0.readBits(12); // L: 578
					var7 = var6 >> 10; // L: 579
					var8 = var6 >> 5 & 31; // L: 580
					if (var8 > 15) { // L: 581
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 582
					if (var9 > 15) { // L: 583
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 584
					var11 = var9 + var4.pathY[0]; // L: 585
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 586
						if (var2) { // L: 590
							var4.field1124 = true; // L: 591
							var4.tileX = var10; // L: 592
							var4.tileY = var11; // L: 593
						} else {
							var4.field1124 = false; // L: 596
							var4.method2374(var10, var11, Players.field1370[var1]); // L: 597
						}
					} else {
						var4.resetPath(var10, var11); // L: 587
						var4.field1124 = false; // L: 588
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 599
					if (Client.localPlayerIndex == var1) { // L: 600
						class87.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 603
					var7 = var6 >> 28; // L: 604
					var8 = var6 >> 14 & 16383; // L: 605
					var9 = var6 & 16383; // L: 606
					var10 = (class20.baseX * 64 + var8 + var4.pathX[0] & 16383) - class20.baseX * 64; // L: 607
					var11 = (class19.baseY * 64 + var9 + var4.pathY[0] & 16383) - class19.baseY * 64; // L: 608
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 609
						var4.resetPath(var10, var11); // L: 610
						var4.field1124 = false; // L: 611
					} else if (var2) { // L: 613
						var4.field1124 = true; // L: 614
						var4.tileX = var10; // L: 615
						var4.tileY = var11; // L: 616
					} else {
						var4.field1124 = false; // L: 619
						var4.method2374(var10, var11, Players.field1370[var1]); // L: 620
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 622
					if (Client.localPlayerIndex == var1) { // L: 623
						class87.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 455 464 503 574 601 624

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1356138757"
	)
	static final void method5616(int var0, int var1, int var2) {
		if (Client.cameraX < var0) { // L: 4046
			Client.cameraX = (var0 - Client.cameraX) * class131.field1535 / 1000 + Client.cameraX + SecureRandomCallable.field1049; // L: 4047
			if (Client.cameraX > var0) { // L: 4048
				Client.cameraX = var0;
			}
		}

		if (Client.cameraX > var0) { // L: 4050
			Client.cameraX -= (Client.cameraX - var0) * class131.field1535 / 1000 + SecureRandomCallable.field1049; // L: 4051
			if (Client.cameraX < var0) { // L: 4052
				Client.cameraX = var0;
			}
		}

		if (class17.cameraY < var1) { // L: 4054
			class17.cameraY = (var1 - class17.cameraY) * class131.field1535 / 1000 + class17.cameraY + SecureRandomCallable.field1049; // L: 4055
			if (class17.cameraY > var1) { // L: 4056
				class17.cameraY = var1;
			}
		}

		if (class17.cameraY > var1) { // L: 4058
			class17.cameraY -= (class17.cameraY - var1) * class131.field1535 / 1000 + SecureRandomCallable.field1049; // L: 4059
			if (class17.cameraY < var1) { // L: 4060
				class17.cameraY = var1;
			}
		}

		if (WorldMapArea.cameraZ < var2) { // L: 4062
			WorldMapArea.cameraZ = (var2 - WorldMapArea.cameraZ) * class131.field1535 / 1000 + WorldMapArea.cameraZ + SecureRandomCallable.field1049; // L: 4063
			if (WorldMapArea.cameraZ > var2) { // L: 4064
				WorldMapArea.cameraZ = var2;
			}
		}

		if (WorldMapArea.cameraZ > var2) { // L: 4066
			WorldMapArea.cameraZ -= (WorldMapArea.cameraZ - var2) * class131.field1535 / 1000 + SecureRandomCallable.field1049; // L: 4067
			if (WorldMapArea.cameraZ < var2) { // L: 4068
				WorldMapArea.cameraZ = var2;
			}
		}

	} // L: 4070
}
