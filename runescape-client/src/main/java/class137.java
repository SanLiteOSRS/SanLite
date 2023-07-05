import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public enum class137 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1601(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1593(1, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1594(2, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1595(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1592(4, 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1597(5, 5),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1598(6, 6),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1599(7, 7),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1600(8, 8);

	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = 974564480
	)
	static int field1605;
	@ObfuscatedName("hj")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1599000033
	)
	final int field1602;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 851635983
	)
	final int field1596;

	class137(int var3, int var4) {
		this.field1602 = var3; // L: 117
		this.field1596 = var4; // L: 118
	} // L: 119

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1596; // L: 122
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "959853468"
	)
	static final float method3092(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 29
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 30
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltl;ILdh;II)V",
		garbageValue = "-1720676100"
	)
	static final void method3090(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class216.field2397.field2393; // L: 455
		int var5;
		int var6;
		if ((var3 & 32) != 0) { // L: 456
			var5 = var0.method8952(); // L: 457
			if (var5 == 65535) { // L: 458
				var5 = -1;
			}

			var6 = var0.method8941(); // L: 459
			ServerPacket.performPlayerAnimation(var2, var5, var6); // L: 460
		}

		int var7;
		int var10;
		int var11;
		if ((var3 & 256) != 0) { // L: 462
			var5 = var0.method8950(); // L: 463
			var6 = var5 >> 8; // L: 464
			var7 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0; // L: 465
			PlayerType var8 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.method8941()); // L: 466
			boolean var9 = var0.readUnsignedByte() == 1; // L: 467
			var10 = var0.method8941(); // L: 468
			var11 = var0.offset; // L: 469
			if (var2.username != null && var2.appearance != null) { // L: 470
				boolean var12 = false; // L: 471
				if (var8.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) { // L: 472 473
					var12 = true;
				}

				if (!var12 && Client.field626 == 0 && !var2.isHidden) { // L: 475
					Players.field1342.offset = 0; // L: 476
					var0.method9041(Players.field1342.array, 0, var10); // L: 477
					Players.field1342.offset = 0; // L: 478
					String var13 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(Players.field1342))); // L: 479
					var2.overheadText = var13.trim(); // L: 480
					var2.field1189 = var5 >> 8; // L: 481
					var2.field1177 = var5 & 255; // L: 482
					var2.overheadTextCyclesRemaining = 150; // L: 483
					byte[] var14 = null; // L: 484
					int var15;
					if (var7 > 0 && var7 <= 8) { // L: 485
						var14 = new byte[var7]; // L: 486

						for (var15 = 0; var15 < var7; ++var15) { // L: 487
							var14[var15] = var0.method9022(); // L: 488
						}
					}

					var2.field1224 = class169.method3407(var14); // L: 491
					var2.field1165 = var9; // L: 492
					var2.field1174 = var2 != Projectile.localPlayer && var8.isUser && "" != Client.field736 && var13.toLowerCase().indexOf(Client.field736) == -1; // L: 493
					if (var8.isPrivileged) { // L: 495
						var15 = var9 ? 91 : 1;
					} else {
						var15 = var9 ? 90 : 2; // L: 496
					}

					if (var8.modIcon != -1) { // L: 497
						class59.addGameMessage(var15, class100.method2624(var8.modIcon) + var2.username.getName(), var13);
					} else {
						class59.addGameMessage(var15, var2.username.getName(), var13); // L: 498
					}
				}
			}

			var0.offset = var11 + var10 + var7; // L: 501
		}

		if ((var3 & 16384) != 0) { // L: 503
			var4 = var0.method8971(); // L: 504
		}

		int var19;
		int var22;
		if ((var3 & 65536) != 0) { // L: 506
			var5 = var0.method8943(); // L: 507

			for (var6 = 0; var6 < var5; ++var6) { // L: 508
				var7 = var0.readUnsignedByte(); // L: 509
				var19 = var0.method8950(); // L: 510
				var22 = var0.method8918(); // L: 511
				var2.method2363(var7, var19, var22 >> 16, var22 & 65535); // L: 512
			}
		}

		if ((var3 & 4096) != 0) { // L: 515
			for (var5 = 0; var5 < 3; ++var5) { // L: 516
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 2048) != 0) { // L: 518
			class216[] var16 = Players.field1328; // L: 519
			class216[] var17 = new class216[]{class216.field2394, class216.field2395, class216.field2396, class216.field2397}; // L: 523
			var16[var1] = (class216)GameObject.findEnumerated(var17, var0.method9022()); // L: 525
		}

		int var24;
		if ((var3 & 64) != 0) { // L: 527
			var5 = var0.readUnsignedShort(); // L: 528
			PlayerType var18 = (PlayerType)GameObject.findEnumerated(HealthBarDefinition.PlayerType_values(), var0.method8941()); // L: 529
			boolean var21 = var0.method8942() == 1; // L: 530
			var19 = var0.readUnsignedByte(); // L: 531
			var22 = var0.offset; // L: 532
			if (var2.username != null && var2.appearance != null) { // L: 533
				boolean var23 = false; // L: 534
				if (var18.isUser && ApproximateRouteStrategy.friendSystem.isIgnored(var2.username)) { // L: 535 536
					var23 = true;
				}

				if (!var23 && Client.field626 == 0 && !var2.isHidden) { // L: 538
					Players.field1342.offset = 0; // L: 539
					var0.method9041(Players.field1342.array, 0, var19); // L: 540
					Players.field1342.offset = 0; // L: 541
					String var20 = AbstractFont.escapeBrackets(class290.method5660(class16.method218(Players.field1342))); // L: 542
					var2.overheadText = var20.trim(); // L: 543
					var2.field1189 = var5 >> 8; // L: 544
					var2.field1177 = var5 & 255; // L: 545
					var2.overheadTextCyclesRemaining = 150; // L: 546
					var2.field1224 = null; // L: 547
					var2.field1165 = var21; // L: 548
					var2.field1174 = var2 != Projectile.localPlayer && var18.isUser && "" != Client.field736 && var20.toLowerCase().indexOf(Client.field736) == -1; // L: 549
					if (var18.isPrivileged) { // L: 551
						var24 = var21 ? 91 : 1;
					} else {
						var24 = var21 ? 90 : 2; // L: 552
					}

					if (var18.modIcon != -1) { // L: 553
						class59.addGameMessage(var24, class100.method2624(var18.modIcon) + var2.username.getName(), var20);
					} else {
						class59.addGameMessage(var24, var2.username.getName(), var20); // L: 554
					}
				}
			}

			var0.offset = var22 + var19; // L: 557
		}

		if ((var3 & 1) != 0) { // L: 559
			var5 = var0.method8941(); // L: 560
			if (var5 > 0) { // L: 561
				for (var6 = 0; var6 < var5; ++var6) { // L: 562
					var19 = -1; // L: 564
					var22 = -1; // L: 565
					var10 = -1; // L: 566
					var7 = var0.readUShortSmart(); // L: 567
					if (var7 == 32767) { // L: 568
						var7 = var0.readUShortSmart(); // L: 569
						var22 = var0.readUShortSmart(); // L: 570
						var19 = var0.readUShortSmart(); // L: 571
						var10 = var0.readUShortSmart(); // L: 572
					} else if (var7 != 32766) { // L: 574
						var22 = var0.readUShortSmart(); // L: 575
					} else {
						var7 = -1; // L: 577
					}

					var11 = var0.readUShortSmart(); // L: 578
					var2.addHitSplat(var7, var22, var19, var10, Client.cycle, var11); // L: 579
				}
			}

			var6 = var0.method8942(); // L: 582
			if (var6 > 0) { // L: 583
				for (var7 = 0; var7 < var6; ++var7) { // L: 584
					var19 = var0.readUShortSmart(); // L: 585
					var22 = var0.readUShortSmart(); // L: 586
					if (var22 != 32767) { // L: 587
						var10 = var0.readUShortSmart(); // L: 588
						var11 = var0.method8943(); // L: 589
						var24 = var22 > 0 ? var0.method8943() : var11; // L: 590
						var2.addHealthBar(var19, Client.cycle, var22, var10, var11, var24); // L: 591
					} else {
						var2.removeHealthBar(var19); // L: 593
					}
				}
			}
		}

		if ((var3 & 16) != 0) { // L: 597
			var2.targetIndex = var0.method8950(); // L: 599
			var2.targetIndex += var0.method8941() << 16; // L: 600
			var5 = 16777215; // L: 601
			if (var2.targetIndex == var5) { // L: 602
				var2.targetIndex = -1; // L: 603
			}
		}

		if ((var3 & 1024) != 0) { // L: 606
			var2.field1203 = var0.method9022(); // L: 607
			var2.field1205 = var0.method8971(); // L: 608
			var2.field1173 = var0.method9022(); // L: 609
			var2.field1206 = var0.readByte(); // L: 610
			var2.spotAnimation = var0.method9030() + Client.cycle; // L: 611
			var2.field1208 = var0.readUnsignedShort() + Client.cycle; // L: 612
			var2.field1209 = var0.method8950(); // L: 613
			if (var2.field1124) { // L: 614
				var2.field1203 += var2.tileX; // L: 615
				var2.field1205 += var2.tileY; // L: 616
				var2.field1173 += var2.tileX; // L: 617
				var2.field1206 += var2.tileY; // L: 618
				var2.pathLength = 0; // L: 619
			} else {
				var2.field1203 += var2.pathX[0]; // L: 622
				var2.field1205 += var2.pathY[0]; // L: 623
				var2.field1173 += var2.pathX[0]; // L: 624
				var2.field1206 += var2.pathY[0]; // L: 625
				var2.pathLength = 1; // L: 626
			}

			var2.field1226 = 0; // L: 628
		}

		if ((var3 & 128) != 0) { // L: 630
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 631
			if (var2.overheadText.charAt(0) == '~') { // L: 632
				var2.overheadText = var2.overheadText.substring(1); // L: 633
				class59.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 634
			} else if (var2 == Projectile.localPlayer) { // L: 636
				class59.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 637
			}

			var2.field1165 = false; // L: 639
			var2.field1189 = 0; // L: 640
			var2.field1177 = 0; // L: 641
			var2.overheadTextCyclesRemaining = 150; // L: 642
		}

		if ((var3 & 4) != 0) { // L: 644
			var5 = var0.method8943(); // L: 645
			byte[] var27 = new byte[var5]; // L: 646
			Buffer var26 = new Buffer(var27); // L: 647
			var0.method9155(var27, 0, var5); // L: 648
			Players.field1332[var1] = var26; // L: 649
			var2.read(var26); // L: 650
		}

		if ((var3 & 2) != 0) { // L: 652
			var2.field1228 = var0.method8952(); // L: 653
			if (var2.pathLength == 0) { // L: 654
				var2.orientation = var2.field1228; // L: 655
				var2.method2375(); // L: 656
			}
		}

		if ((var3 & 32768) != 0) { // L: 659
			var2.field1170 = Client.cycle + var0.readUnsignedShort(); // L: 660
			var2.field1213 = Client.cycle + var0.readUnsignedShort(); // L: 661
			var2.field1164 = var0.readByte(); // L: 662
			var2.field1215 = var0.method8971(); // L: 663
			var2.field1196 = var0.readByte(); // L: 664
			var2.field1217 = (byte)var0.readUnsignedByte(); // L: 665
		}

		if (var2.field1124) { // L: 667
			if (var4 == 127) { // L: 668
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class216 var25;
				if (var4 != class216.field2397.field2393) { // L: 671
					class216[] var28 = new class216[]{class216.field2394, class216.field2395, class216.field2396, class216.field2397}; // L: 674
					var25 = (class216)GameObject.findEnumerated(var28, var4); // L: 676
				} else {
					var25 = Players.field1328[var1]; // L: 678
				}

				var2.method2301(var2.tileX, var2.tileY, var25); // L: 679
			}
		}

	} // L: 683
}
