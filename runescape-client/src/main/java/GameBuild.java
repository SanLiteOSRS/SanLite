import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 501795079
	)
	static int field3978;
	@ObfuscatedName("ar")
	@Export("name")
	public final String name;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2048598199
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lun;ILdj;IB)V",
		garbageValue = "97"
	)
	static final void method6999(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class233.field2471.field2473; // L: 455
		if ((var3 & 4096) != 0) { // L: 456
			var2.field1257 = var0.method9511(); // L: 457
			var2.field1259 = var0.method9511(); // L: 458
			var2.field1258 = var0.method9511(); // L: 459
			var2.field1248 = var0.method9510(); // L: 460
			var2.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 461
			var2.field1271 = var0.method9492() + Client.cycle; // L: 462
			var2.field1223 = var0.method9636(); // L: 463
			if (var2.field1147) { // L: 464
				var2.field1257 += var2.tileX; // L: 465
				var2.field1259 += var2.tileY; // L: 466
				var2.field1258 += var2.tileX; // L: 467
				var2.field1248 += var2.tileY; // L: 468
				var2.pathLength = 0; // L: 469
			} else {
				var2.field1257 += var2.pathX[0]; // L: 472
				var2.field1259 += var2.pathY[0]; // L: 473
				var2.field1258 += var2.pathX[0]; // L: 474
				var2.field1248 += var2.pathY[0]; // L: 475
				var2.pathLength = 1; // L: 476
			}

			var2.field1280 = 0; // L: 478
		}

		if ((var3 & 16384) != 0) { // L: 480
			var2.field1262 = Client.cycle + var0.method9636(); // L: 481
			var2.field1278 = Client.cycle + var0.method9492(); // L: 482
			var2.field1268 = var0.method9509(); // L: 483
			var2.field1269 = var0.method9509(); // L: 484
			var2.field1276 = var0.readByte(); // L: 485
			var2.field1255 = (byte)var0.method9579(); // L: 486
		}

		int var5;
		if ((var3 & 8) != 0) { // L: 488
			var2.targetIndex = var0.method9703(); // L: 490
			var2.targetIndex += var0.method9579() << 16; // L: 491
			var5 = 16777215; // L: 492
			if (var2.targetIndex == var5) { // L: 493
				var2.targetIndex = -1; // L: 494
			}
		}

		int var6;
		if ((var3 & 128) != 0) { // L: 497
			var5 = var0.method9703(); // L: 498
			if (var5 == 65535) { // L: 499
				var5 = -1;
			}

			var6 = var0.readUnsignedByte(); // L: 500
			class485.performPlayerAnimation(var2, var5, var6); // L: 501
		}

		if ((var3 & 32) != 0) { // L: 503
			var5 = var0.method9506(); // L: 504
			byte[] var16 = new byte[var5]; // L: 505
			Buffer var7 = new Buffer(var16); // L: 506
			var0.method9562(var16, 0, var5); // L: 507
			Players.field1389[var1] = var7; // L: 508
			var2.read(var7); // L: 509
		}

		if ((var3 & 2) != 0) { // L: 511
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 512
			if (var2.overheadText.charAt(0) == '~') { // L: 513
				var2.overheadText = var2.overheadText.substring(1); // L: 514
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 515
			} else if (var2 == VarpDefinition.localPlayer) { // L: 517
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 518
			}

			var2.isAutoChatting = false; // L: 520
			var2.overheadTextColor = 0; // L: 521
			var2.overheadTextEffect = 0; // L: 522
			var2.overheadTextCyclesRemaining = 150; // L: 523
		}

		if ((var3 & 256) != 0) { // L: 525
			class233[] var17 = Players.field1378; // L: 526
			class233[] var21 = new class233[]{class233.field2472, class233.field2469, class233.field2470, class233.field2471}; // L: 530
			var17[var1] = (class233)class356.findEnumerated(var21, var0.readByte()); // L: 532
		}

		int var8;
		int var9;
		int var10;
		int var12;
		int var18;
		int var20;
		if ((var3 & 4) != 0) { // L: 534
			var5 = var0.readUnsignedByte(); // L: 535
			if (var5 > 0) { // L: 536
				for (var6 = 0; var6 < var5; ++var6) { // L: 537
					var8 = -1; // L: 539
					var9 = -1; // L: 540
					var10 = -1; // L: 541
					var18 = var0.readUShortSmart(); // L: 542
					if (var18 == 32767) { // L: 543
						var18 = var0.readUShortSmart(); // L: 544
						var9 = var0.readUShortSmart(); // L: 545
						var8 = var0.readUShortSmart(); // L: 546
						var10 = var0.readUShortSmart(); // L: 547
					} else if (var18 != 32766) { // L: 549
						var9 = var0.readUShortSmart(); // L: 550
					} else {
						var18 = -1; // L: 552
					}

					var20 = var0.readUShortSmart(); // L: 553
					var2.addHitSplat(var18, var9, var8, var10, Client.cycle, var20); // L: 554
				}
			}

			var6 = var0.readUnsignedByte(); // L: 557
			if (var6 > 0) { // L: 558
				for (var18 = 0; var18 < var6; ++var18) { // L: 559
					var8 = var0.readUShortSmart(); // L: 560
					var9 = var0.readUShortSmart(); // L: 561
					if (var9 != 32767) { // L: 562
						var10 = var0.readUShortSmart(); // L: 563
						var20 = var0.method9506(); // L: 564
						var12 = var9 > 0 ? var0.method9605() : var20; // L: 565
						var2.addHealthBar(var8, Client.cycle, var9, var10, var20, var12); // L: 566
					} else {
						var2.removeHealthBar(var8); // L: 568
					}
				}
			}
		}

		if ((var3 & 64) != 0) { // L: 572
			var5 = var0.method9636(); // L: 573
			PlayerType var25 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.readUnsignedByte()); // L: 574
			boolean var28 = var0.readUnsignedByte() == 1; // L: 575
			var8 = var0.readUnsignedByte(); // L: 576
			var9 = var0.offset; // L: 577
			if (var2.username != null && var2.appearance != null) { // L: 578
				boolean var23 = false; // L: 579
				if (var25.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) { // L: 580 581
					var23 = true;
				}

				if (!var23 && Client.field649 == 0 && !var2.isHidden) { // L: 583
					Players.field1381.offset = 0; // L: 584
					var0.readBytes(Players.field1381.array, 0, var8); // L: 585
					Players.field1381.offset = 0; // L: 586
					String var11 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(Players.field1381))); // L: 587
					var2.overheadText = var11.trim(); // L: 588
					var2.overheadTextColor = var5 >> 8; // L: 589
					var2.overheadTextEffect = var5 & 255; // L: 590
					var2.overheadTextCyclesRemaining = 150; // L: 591
					var2.field1226 = null; // L: 592
					var2.isAutoChatting = var28; // L: 593
					var2.field1205 = var2 != VarpDefinition.localPlayer && var25.isUser && !Client.field643.isEmpty() && var11.toLowerCase().indexOf(Client.field643) == -1; // L: 594
					if (var25.isPrivileged) { // L: 596
						var12 = var28 ? 91 : 1;
					} else {
						var12 = var28 ? 90 : 2; // L: 597
					}

					if (var25.modIcon != -1) {
						class209.addGameMessage(var12, class415.method7833(var25.modIcon) + var2.username.getName(), var11); // L: 598
					} else {
						class209.addGameMessage(var12, var2.username.getName(), var11); // L: 599
					}
				}
			}

			var0.offset = var9 + var8; // L: 602
		}

		if ((var3 & 512) != 0) { // L: 604
			var5 = var0.readUnsignedShort(); // L: 605
			var6 = var5 >> 8; // L: 606
			var18 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0; // L: 607
			PlayerType var19 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.method9579()); // L: 608
			boolean var22 = var0.readUnsignedByte() == 1; // L: 609
			var10 = var0.method9506(); // L: 610
			var20 = var0.offset; // L: 611
			if (var2.username != null && var2.appearance != null) { // L: 612
				boolean var24 = false; // L: 613
				if (var19.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) { // L: 614 615
					var24 = true;
				}

				if (!var24 && Client.field649 == 0 && !var2.isHidden) { // L: 617
					Players.field1381.offset = 0; // L: 618
					var0.method9531(Players.field1381.array, 0, var10); // L: 619
					Players.field1381.offset = 0; // L: 620
					String var13 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(Players.field1381))); // L: 621
					var2.overheadText = var13.trim(); // L: 622
					var2.overheadTextColor = var5 >> 8; // L: 623
					var2.overheadTextEffect = var5 & 255; // L: 624
					var2.overheadTextCyclesRemaining = 150; // L: 625
					byte[] var14 = null; // L: 626
					int var15;
					if (var18 > 0 && var18 <= 8) { // L: 627
						var14 = new byte[var18]; // L: 628

						for (var15 = 0; var15 < var18; ++var15) { // L: 629
							var14[var15] = var0.method9511(); // L: 630
						}
					}

					var2.field1226 = class321.method6147(var14); // L: 633
					var2.isAutoChatting = var22; // L: 634
					var2.field1205 = var2 != VarpDefinition.localPlayer && var19.isUser && !Client.field643.isEmpty() && var13.toLowerCase().indexOf(Client.field643) == -1; // L: 635
					if (var19.isPrivileged) { // L: 637
						var15 = var22 ? 91 : 1;
					} else {
						var15 = var22 ? 90 : 2; // L: 638
					}

					if (var19.modIcon != -1) { // L: 639
						class209.addGameMessage(var15, class415.method7833(var19.modIcon) + var2.username.getName(), var13);
					} else {
						class209.addGameMessage(var15, var2.username.getName(), var13); // L: 640
					}
				}
			}

			var0.offset = var20 + var10 + var18; // L: 643
		}

		if ((var3 & 1024) != 0) { // L: 645
			for (var5 = 0; var5 < 3; ++var5) { // L: 646
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 65536) != 0) { // L: 648
			var5 = var0.method9579(); // L: 649

			for (var6 = 0; var6 < var5; ++var6) { // L: 650
				var18 = var0.method9506(); // L: 651
				var8 = var0.readUnsignedShort(); // L: 652
				var9 = var0.method9585(); // L: 653
				var2.method2466(var18, var8, var9 >> 16, var9 & 65535); // L: 654
			}
		}

		if ((var3 & 32768) != 0) { // L: 657
			var4 = var0.readByte(); // L: 658
		}

		if ((var3 & 1) != 0) { // L: 660
			var2.field1242 = var0.method9492(); // L: 661
			if (var2.pathLength == 0) { // L: 662
				var2.orientation = var2.field1242; // L: 663
				var2.method2470(); // L: 664
			}
		}

		if (var2.field1147) { // L: 667
			if (var4 == 127) { // L: 668
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class233 var27;
				if (var4 != class233.field2471.field2473) { // L: 671
					class233[] var26 = new class233[]{class233.field2472, class233.field2469, class233.field2470, class233.field2471}; // L: 674
					var27 = (class233)class356.findEnumerated(var26, var4); // L: 676
				} else {
					var27 = Players.field1378[var1]; // L: 678
				}

				var2.method2433(var2.tileX, var2.tileY, var27); // L: 679
			}
		}

	} // L: 683
}
