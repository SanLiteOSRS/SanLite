import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1398646947
	)
	static int field2593;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lig;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 35
		int var6 = var1.getGroupFileCount(var3); // L: 36
		this.frames = new Animation[var6]; // L: 37
		int[] var7 = var1.getGroupFileIds(var3); // L: 38

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 39
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 40
			Skeleton var10 = null; // L: 41
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 42

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 43 44 49
				if (var11 == var12.id) { // L: 45
					var10 = var12; // L: 46
					break;
				}
			}

			if (var10 == null) { // L: 51
				byte[] var13;
				if (var4) { // L: 53
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0); // L: 54
				}

				var10 = new Skeleton(var11, var13); // L: 55
				var5.addFirst(var10); // L: 56
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 58
		}

	} // L: 60

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1355530944"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 63
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILdh;II)V",
		garbageValue = "1494438010"
	)
	static final void method4561(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class211.field2336.field2338; // L: 453
		int var5;
		if ((var3 & 8192) != 0) { // L: 454
			var2.spotAnimation = var0.method8831(); // L: 455
			var5 = var0.method8724(); // L: 456
			var2.field1191 = var5 >> 16; // L: 457
			var2.field1190 = (var5 & 65535) + Client.cycle; // L: 458
			var2.spotAnimationFrame = 0; // L: 459
			var2.field1175 = 0; // L: 460
			if (var2.field1190 > Client.cycle) { // L: 461
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 462
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 64) != 0) { // L: 464
			var5 = var0.readUnsignedByte(); // L: 465
			byte[] var6 = new byte[var5]; // L: 466
			Buffer var7 = new Buffer(var6); // L: 467
			var0.method8608(var6, 0, var5); // L: 468
			Players.field1335[var1] = var7; // L: 469
			var2.read(var7); // L: 470
		}

		if ((var3 & 4096) != 0) { // L: 472
			var2.field1192 = var0.method8654(); // L: 473
			var2.field1194 = var0.method8654(); // L: 474
			var2.field1202 = var0.method8654(); // L: 475
			var2.field1195 = var0.method8604(); // L: 476
			var2.field1196 = var0.readUnsignedShort() + Client.cycle; // L: 477
			var2.field1197 = var0.method8662() + Client.cycle; // L: 478
			var2.field1162 = var0.method8660(); // L: 479
			if (var2.field1111) { // L: 480
				var2.field1192 += var2.tileX; // L: 481
				var2.field1194 += var2.tileY; // L: 482
				var2.field1202 += var2.tileX; // L: 483
				var2.field1195 += var2.tileY; // L: 484
				var2.pathLength = 0; // L: 485
			} else {
				var2.field1192 += var2.pathX[0]; // L: 488
				var2.field1194 += var2.pathY[0]; // L: 489
				var2.field1202 += var2.pathX[0]; // L: 490
				var2.field1195 += var2.pathY[0]; // L: 491
				var2.pathLength = 1; // L: 492
			}

			var2.field1215 = 0; // L: 494
		}

		int var8;
		int var9;
		int var12;
		int var13;
		if ((var3 & 4) != 0) { // L: 496
			var5 = var0.method8614(); // L: 497
			int var10;
			int var14;
			int var16;
			if (var5 > 0) { // L: 498
				for (var13 = 0; var13 < var5; ++var13) { // L: 499
					var8 = -1; // L: 501
					var9 = -1; // L: 502
					var10 = -1; // L: 503
					var14 = var0.readUShortSmart(); // L: 504
					if (var14 == 32767) { // L: 505
						var14 = var0.readUShortSmart(); // L: 506
						var9 = var0.readUShortSmart(); // L: 507
						var8 = var0.readUShortSmart(); // L: 508
						var10 = var0.readUShortSmart(); // L: 509
					} else if (var14 != 32766) { // L: 511
						var9 = var0.readUShortSmart(); // L: 512
					} else {
						var14 = -1; // L: 514
					}

					var16 = var0.readUShortSmart(); // L: 515
					var2.addHitSplat(var14, var9, var8, var10, Client.cycle, var16); // L: 516
				}
			}

			var13 = var0.method8651(); // L: 519
			if (var13 > 0) { // L: 520
				for (var14 = 0; var14 < var13; ++var14) { // L: 521
					var8 = var0.readUShortSmart(); // L: 522
					var9 = var0.readUShortSmart(); // L: 523
					if (var9 != 32767) { // L: 524
						var10 = var0.readUShortSmart(); // L: 525
						var16 = var0.method8614(); // L: 526
						var12 = var9 > 0 ? var0.method8614() : var16; // L: 527
						var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12); // L: 528
					} else {
						var2.removeHealthBar(var8); // L: 530
					}
				}
			}
		}

		if ((var3 & 256) != 0) { // L: 534
			var4 = var0.method8656(); // L: 535
		}

		if ((var3 & 1) != 0) { // L: 537
			var5 = var0.method8831(); // L: 538
			PlayerType var17 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var0.method8614()); // L: 539
			boolean var19 = var0.method8650() == 1; // L: 540
			var8 = var0.method8650(); // L: 541
			var9 = var0.offset; // L: 542
			if (var2.username != null && var2.appearance != null) { // L: 543
				boolean var18 = false; // L: 544
				if (var17.isUser && class6.friendSystem.isIgnored(var2.username)) { // L: 545 546
					var18 = true;
				}

				if (!var18 && Client.field667 == 0 && !var2.isHidden) { // L: 548
					Players.field1330.offset = 0; // L: 549
					var0.method8675(Players.field1330.array, 0, var8); // L: 550
					Players.field1330.offset = 0; // L: 551
					String var11 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(Players.field1330))); // L: 552
					var2.overheadText = var11.trim(); // L: 553
					var2.field1163 = var5 >> 8; // L: 554
					var2.field1156 = var5 & 255; // L: 555
					var2.overheadTextCyclesRemaining = 150; // L: 556
					var2.field1160 = var19; // L: 557
					var2.field1161 = var2 != BuddyRankComparator.localPlayer && var17.isUser && "" != Client.field637 && var11.toLowerCase().indexOf(Client.field637) == -1; // L: 558
					if (var17.isPrivileged) { // L: 560
						var12 = var19 ? 91 : 1;
					} else {
						var12 = var19 ? 90 : 2; // L: 561
					}

					if (var17.modIcon != -1) { // L: 562
						MusicPatchNode.addGameMessage(var12, class7.method53(var17.modIcon) + var2.username.getName(), var11);
					} else {
						MusicPatchNode.addGameMessage(var12, var2.username.getName(), var11); // L: 563
					}
				}
			}

			var0.offset = var9 + var8; // L: 566
		}

		if ((var3 & 16384) != 0) { // L: 568
			Players.field1332[var1] = (class211)SpriteMask.findEnumerated(VarcInt.method3594(), var0.method8654()); // L: 569
		}

		if ((var3 & 16) != 0) { // L: 571
			var5 = var0.readUnsignedShort(); // L: 572
			if (var5 == 65535) { // L: 573
				var5 = -1;
			}

			var13 = var0.method8650(); // L: 574
			Language.performPlayerAnimation(var2, var5, var13); // L: 575
		}

		if ((var3 & 2048) != 0) { // L: 577
			var2.field1201 = Client.cycle + var0.readUnsignedShort(); // L: 578
			var2.field1159 = Client.cycle + var0.method8660(); // L: 579
			var2.field1203 = var0.method8654(); // L: 580
			var2.field1185 = var0.readByte(); // L: 581
			var2.field1165 = var0.method8604(); // L: 582
			var2.field1206 = (byte)var0.method8614(); // L: 583
		}

		if ((var3 & 128) != 0) { // L: 585
			var2.field1164 = var0.method8831(); // L: 586
			if (var2.pathLength == 0) { // L: 587
				var2.orientation = var2.field1164; // L: 588
				var2.method2362(); // L: 589
			}
		}

		if ((var3 & 32) != 0) { // L: 592
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 593
			if (var2.overheadText.charAt(0) == '~') { // L: 594
				var2.overheadText = var2.overheadText.substring(1); // L: 595
				MusicPatchNode.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 596
			} else if (var2 == BuddyRankComparator.localPlayer) { // L: 598
				MusicPatchNode.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 599
			}

			var2.field1160 = false; // L: 601
			var2.field1163 = 0; // L: 602
			var2.field1156 = 0; // L: 603
			var2.overheadTextCyclesRemaining = 150; // L: 604
		}

		if ((var3 & 1024) != 0) { // L: 606
			for (var5 = 0; var5 < 3; ++var5) { // L: 607
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) { // L: 609
			var2.targetIndex = var0.method8660(); // L: 611
			var2.targetIndex += var0.method8650() << 16; // L: 612
			var5 = 16777215; // L: 613
			if (var2.targetIndex == var5) { // L: 614
				var2.targetIndex = -1; // L: 615
			}
		}

		if (var2.field1111) { // L: 618
			if (var4 == 127) { // L: 619
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class211 var15;
				if (var4 != class211.field2336.field2338) { // L: 622
					var15 = (class211)SpriteMask.findEnumerated(VarcInt.method3594(), var4);
				} else {
					var15 = Players.field1332[var1]; // L: 623
				}

				var2.method2336(var2.tileX, var2.tileY, var15); // L: 624
			}
		}

	} // L: 628

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(IIIILsn;Llx;I)V",
		garbageValue = "1091031252"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 11936
		if (var6 > 4225 && var6 < 90000) { // L: 11937
			int var7 = Client.camAngleY & 2047; // L: 11938
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 11939
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 11940
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11941
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11942
			double var12 = Math.atan2((double)var10, (double)var11); // L: 11943
			int var14 = var5.width / 2 - 25; // L: 11944
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 11945
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 11946
			byte var17 = 20; // L: 11947
			class136.redHintArrowSprite.method9078(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 11948
		} else {
			class149.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 11950
		}

	} // L: 11951
}
