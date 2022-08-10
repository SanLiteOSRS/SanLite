import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1322628773
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2003342179
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 662622231
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2048363861
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1187515461
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1467757539
	)
	public static int field4045;
	@ObfuscatedName("k")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Llu;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1007973587
	)
	static int field4048;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1157700571
	)
	static int field4046;
	@ObfuscatedName("i")
	public static byte field4033;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1786371509
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 83406129
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field4045 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field4048 = -1; // L: 33
		field4046 = 255; // L: 34
		field4033 = 0; // L: 35
		NetCache_crcMismatches = 0; // L: 36
		NetCache_ioExceptions = 0; // L: 37
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "0"
	)
	static final void method5973(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 445
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 446
			Player var3 = Client.players[var2]; // L: 447
			int var4 = var0.readUnsignedByte(); // L: 448
			if ((var4 & 32) != 0) { // L: 449
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = class192.field2201.field2196; // L: 451
			if ((var4 & 256) != 0) { // L: 452
				var3.field1177 = var0.method7743(); // L: 453
				var3.field1182 = var0.method7769(); // L: 454
				var3.field1188 = var0.readByte(); // L: 455
				var3.field1183 = var0.method7768(); // L: 456
				var3.field1194 = var0.method7741() + Client.cycle; // L: 457
				var3.field1166 = var0.method7776() + Client.cycle; // L: 458
				var3.field1186 = var0.method7774(); // L: 459
				if (var3.field1111) { // L: 460
					var3.field1177 += var3.tileX; // L: 461
					var3.field1182 += var3.tileY; // L: 462
					var3.field1188 += var3.tileX; // L: 463
					var3.field1183 += var3.tileY; // L: 464
					var3.pathLength = 0; // L: 465
				} else {
					var3.field1177 += var3.pathX[0]; // L: 468
					var3.field1182 += var3.pathY[0]; // L: 469
					var3.field1188 += var3.pathX[0]; // L: 470
					var3.field1183 += var3.pathY[0]; // L: 471
					var3.pathLength = 1; // L: 472
				}

				var3.field1203 = 0; // L: 474
			}

			int var6;
			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) { // L: 476
				var6 = var0.method7776(); // L: 477
				PlayerType var7 = (PlayerType)class271.findEnumerated(Client.PlayerType_values(), var0.method7766()); // L: 478
				boolean var8 = var0.method7908() == 1; // L: 479
				var9 = var0.method7908(); // L: 480
				var10 = var0.offset; // L: 481
				if (var3.username != null && var3.appearance != null) { // L: 482
					boolean var11 = false; // L: 483
					if (var7.isUser && MusicPatchPcmStream.friendSystem.isIgnored(var3.username)) { // L: 484 485
						var11 = true;
					}

					if (!var11 && Client.field542 == 0 && !var3.isHidden) { // L: 487
						Players.field1300.offset = 0; // L: 488
						var0.method7739(Players.field1300.array, 0, var9); // L: 489
						Players.field1300.offset = 0; // L: 490
						String var12 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(Players.field1300))); // L: 491
						var3.overheadText = var12.trim(); // L: 492
						var3.overheadTextColor = var6 >> 8; // L: 493
						var3.overheadTextEffect = var6 & 255; // L: 494
						var3.overheadTextCyclesRemaining = 150; // L: 495
						var3.isAutoChatting = var8; // L: 496
						var3.field1151 = var3 != class28.localPlayer && var7.isUser && "" != Client.field719 && var12.toLowerCase().indexOf(Client.field719) == -1; // L: 497
						if (var7.isPrivileged) { // L: 499
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2; // L: 500
						}

						if (var7.modIcon != -1) { // L: 501
							FileSystem.addGameMessage(var13, UrlRequester.method2619(var7.modIcon) + var3.username.getName(), var12);
						} else {
							FileSystem.addGameMessage(var13, var3.username.getName(), var12); // L: 502
						}
					}
				}

				var0.offset = var10 + var9; // L: 505
			}

			if ((var4 & 64) != 0) { // L: 507
				var3.targetIndex = var0.method7774(); // L: 508
				if (var3.targetIndex == 65535) { // L: 509
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 2048) != 0) { // L: 511
				Players.field1294[var2] = (class192)class271.findEnumerated(class165.method3305(), var0.method7769()); // L: 512
			}

			int var14;
			if ((var4 & 2) != 0) { // L: 514
				var6 = var0.method7774(); // L: 515
				if (var6 == 65535) { // L: 516
					var6 = -1;
				}

				var14 = var0.method7908(); // L: 517
				Strings.performPlayerAnimation(var3, var6, var14); // L: 518
			}

			if ((var4 & 8192) != 0) { // L: 520
				var3.field1189 = Client.cycle + var0.method7741(); // L: 521
				var3.field1136 = Client.cycle + var0.method7776(); // L: 522
				var3.field1191 = var0.method7769(); // L: 523
				var3.field1168 = var0.method7769(); // L: 524
				var3.field1193 = var0.method7743(); // L: 525
				var3.field1184 = (byte)var0.method7767(); // L: 526
			}

			if ((var4 & 512) != 0) { // L: 528
				for (var6 = 0; var6 < 3; ++var6) { // L: 529
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 16384) != 0) { // L: 531
				var5 = var0.method7743(); // L: 532
			}

			if ((var4 & 4) != 0) { // L: 534
				var6 = var0.method7766(); // L: 535
				byte[] var18 = new byte[var6]; // L: 536
				Buffer var15 = new Buffer(var18); // L: 537
				var0.readBytes(var18, 0, var6); // L: 538
				Players.field1295[var2] = var15; // L: 539
				var3.read(var15); // L: 540
			}

			if ((var4 & 1024) != 0) { // L: 542
				var3.spotAnimation = var0.method7774(); // L: 543
				var6 = var0.method7787(); // L: 544
				var3.field1128 = var6 >> 16; // L: 545
				var3.field1178 = (var6 & 65535) + Client.cycle; // L: 546
				var3.spotAnimationFrame = 0; // L: 547
				var3.field1201 = 0; // L: 548
				if (var3.field1178 > Client.cycle) { // L: 549
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 550
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 8) != 0) { // L: 552
				var3.field1164 = var0.method7774(); // L: 553
				if (var3.pathLength == 0) { // L: 554
					var3.orientation = var3.field1164; // L: 555
					var3.field1164 = -1; // L: 556
				}
			}

			if ((var4 & 1) != 0) { // L: 559
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 560
				if (var3.overheadText.charAt(0) == '~') { // L: 561
					var3.overheadText = var3.overheadText.substring(1); // L: 562
					FileSystem.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 563
				} else if (var3 == class28.localPlayer) { // L: 565
					FileSystem.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 566
				}

				var3.isAutoChatting = false; // L: 568
				var3.overheadTextColor = 0; // L: 569
				var3.overheadTextEffect = 0; // L: 570
				var3.overheadTextCyclesRemaining = 150; // L: 571
			}

			if ((var4 & 128) != 0) { // L: 573
				var6 = var0.readUnsignedByte(); // L: 574
				int var17;
				int var19;
				int var20;
				if (var6 > 0) { // L: 575
					for (var14 = 0; var14 < var6; ++var14) { // L: 576
						var9 = -1; // L: 578
						var10 = -1; // L: 579
						var20 = -1; // L: 580
						var19 = var0.readUShortSmart(); // L: 581
						if (var19 == 32767) { // L: 582
							var19 = var0.readUShortSmart(); // L: 583
							var10 = var0.readUShortSmart(); // L: 584
							var9 = var0.readUShortSmart(); // L: 585
							var20 = var0.readUShortSmart(); // L: 586
						} else if (var19 != 32766) { // L: 588
							var10 = var0.readUShortSmart(); // L: 589
						} else {
							var19 = -1; // L: 591
						}

						var17 = var0.readUShortSmart(); // L: 592
						var3.addHitSplat(var19, var10, var9, var20, Client.cycle, var17); // L: 593
					}
				}

				var14 = var0.method7766(); // L: 596
				if (var14 > 0) { // L: 597
					for (var19 = 0; var19 < var14; ++var19) { // L: 598
						var9 = var0.readUShortSmart(); // L: 599
						var10 = var0.readUShortSmart(); // L: 600
						if (var10 != 32767) { // L: 601
							var20 = var0.readUShortSmart(); // L: 602
							var17 = var0.readUnsignedByte(); // L: 603
							var13 = var10 > 0 ? var0.method7908() : var17; // L: 604
							var3.addHealthBar(var9, Client.cycle, var10, var20, var17, var13); // L: 605
						} else {
							var3.removeHealthBar(var9); // L: 607
						}
					}
				}
			}

			if (var3.field1111) { // L: 611
				if (var5 == 127) { // L: 612
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class192 var16;
					if (var5 != class192.field2201.field2196) { // L: 615
						var16 = (class192)class271.findEnumerated(class165.method3305(), var5);
					} else {
						var16 = Players.field1294[var2]; // L: 616
					}

					var3.method2230(var3.tileX, var3.tileY, var16); // L: 617
				}
			}
		}

	} // L: 623

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "([Lku;IIIZB)V",
		garbageValue = "119"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10530
			Widget var6 = var0[var5]; // L: 10531
			if (var6 != null && var6.parentId == var1) { // L: 10532 10533
				class356.alignWidgetSize(var6, var2, var3, var4); // L: 10534
				VertexNormal.alignWidgetPosition(var6, var2, var3); // L: 10535
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10536
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10537
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 10538
				}

				if (var6.scrollY < 0) { // L: 10539
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10540
					class439.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10542
}
