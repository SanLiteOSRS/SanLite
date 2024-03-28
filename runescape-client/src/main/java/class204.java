import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class204 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2084;

	static {
		field2084 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ah")
	public static String method3849(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (0L != var0) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class408.base37Table[(int)(var6 - 37L * var0)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lun;ILdi;II)V",
		garbageValue = "-497859810"
	)
	static final void method3848(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class233.field2488.field2482; // L: 455
		if ((var3 & 2) != 0) { // L: 456
			var2.field1272 = var0.readUnsignedShort(); // L: 457
			if (var2.pathLength == 0) { // L: 458
				var2.orientation = var2.field1272; // L: 459
				var2.method2419(); // L: 460
			}
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) { // L: 463
			var5 = var0.method9318(); // L: 464
			PlayerType var6 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var0.method9298()); // L: 465
			boolean var7 = var0.method9300() == 1; // L: 466
			var8 = var0.method9300(); // L: 467
			var9 = var0.offset; // L: 468
			if (var2.username != null && var2.appearance != null) { // L: 469
				boolean var10 = false; // L: 470
				if (var6.isUser && class334.friendSystem.isIgnored(var2.username)) { // L: 471 472
					var10 = true;
				}

				if (!var10 && Client.field750 == 0 && !var2.isHidden) { // L: 474
					Players.field1384.offset = 0; // L: 475
					var0.readBytes(Players.field1384.array, 0, var8); // L: 476
					Players.field1384.offset = 0; // L: 477
					String var11 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(Players.field1384))); // L: 478
					var2.overheadText = var11.trim(); // L: 479
					var2.field1224 = var5 >> 8; // L: 480
					var2.field1225 = var5 & 255; // L: 481
					var2.overheadTextCyclesRemaining = 150; // L: 482
					var2.field1262 = null; // L: 483
					var2.field1252 = var7; // L: 484
					var2.field1222 = var2 != class133.localPlayer && var6.isUser && !Client.field745.isEmpty() && var11.toLowerCase().indexOf(Client.field745) == -1; // L: 485
					if (var6.isPrivileged) { // L: 487
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 488
					}

					if (var6.modIcon != -1) { // L: 489
						SecureRandomCallable.addGameMessage(var12, AbstractByteArrayCopier.method6833(var6.modIcon) + var2.username.getName(), var11);
					} else {
						SecureRandomCallable.addGameMessage(var12, var2.username.getName(), var11); // L: 490
					}
				}
			}

			var0.offset = var9 + var8; // L: 493
		}

		int var16;
		if ((var3 & 128) != 0) { // L: 495
			var5 = var0.method9318(); // L: 496
			if (var5 == 65535) { // L: 497
				var5 = -1;
			}

			var16 = var0.method9300(); // L: 498
			class182.performPlayerAnimation(var2, var5, var16); // L: 499
		}

		int var18;
		int var22;
		int var24;
		if ((var3 & 32) != 0) { // L: 501
			var5 = var0.method9300(); // L: 502
			if (var5 > 0) { // L: 503
				for (var16 = 0; var16 < var5; ++var16) { // L: 504
					var8 = -1; // L: 506
					var9 = -1; // L: 507
					var24 = -1; // L: 508
					var22 = var0.readUShortSmart(); // L: 509
					if (var22 == 32767) { // L: 510
						var22 = var0.readUShortSmart(); // L: 511
						var9 = var0.readUShortSmart(); // L: 512
						var8 = var0.readUShortSmart(); // L: 513
						var24 = var0.readUShortSmart(); // L: 514
					} else if (var22 != 32766) { // L: 516
						var9 = var0.readUShortSmart(); // L: 517
					} else {
						var22 = -1; // L: 519
					}

					var18 = var0.readUShortSmart(); // L: 520
					var2.addHitSplat(var22, var9, var8, var24, Client.cycle, var18); // L: 521
				}
			}

			var16 = var0.method9298(); // L: 524
			if (var16 > 0) { // L: 525
				for (var22 = 0; var22 < var16; ++var22) { // L: 526
					var8 = var0.readUShortSmart(); // L: 527
					var9 = var0.readUShortSmart(); // L: 528
					if (var9 != 32767) { // L: 529
						var24 = var0.readUShortSmart(); // L: 530
						var18 = var0.readUnsignedByte(); // L: 531
						var12 = var9 > 0 ? var0.method9298() : var18; // L: 532
						var2.addHealthBar(var8, Client.cycle, var9, var24, var18, var12); // L: 533
					} else {
						var2.removeHealthBar(var8); // L: 535
					}
				}
			}
		}

		if ((var3 & 16384) != 0) { // L: 539
			var2.field1251 = var0.method9302(); // L: 540
			var2.field1238 = var0.method9316(); // L: 541
			var2.field1258 = var0.method9316(); // L: 542
			var2.field1253 = var0.method9301(); // L: 543
			var2.spotAnimation = var0.readUnsignedShort() + Client.cycle; // L: 544
			var2.field1256 = var0.readUnsignedShort() + Client.cycle; // L: 545
			var2.field1203 = var0.method9380(); // L: 546
			if (var2.field1147) { // L: 547
				var2.field1251 += var2.tileX; // L: 548
				var2.field1238 += var2.tileY; // L: 549
				var2.field1258 += var2.tileX; // L: 550
				var2.field1253 += var2.tileY; // L: 551
				var2.pathLength = 0; // L: 552
			} else {
				var2.field1251 += var2.pathX[0]; // L: 555
				var2.field1238 += var2.pathY[0]; // L: 556
				var2.field1258 += var2.pathX[0]; // L: 557
				var2.field1253 += var2.pathY[0]; // L: 558
				var2.pathLength = 1; // L: 559
			}

			var2.field1274 = 0; // L: 561
		}

		if ((var3 & 1024) != 0) { // L: 563
			var5 = var0.method9380(); // L: 564
			var16 = var5 >> 8; // L: 565
			var22 = var16 >= 13 && var16 <= 20 ? var16 - 12 : 0; // L: 566
			PlayerType var17 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var0.method9462()); // L: 567
			boolean var23 = var0.readUnsignedByte() == 1; // L: 568
			var24 = var0.method9298(); // L: 569
			var18 = var0.offset; // L: 570
			if (var2.username != null && var2.appearance != null) { // L: 571
				boolean var25 = false; // L: 572
				if (var17.isUser && class334.friendSystem.isIgnored(var2.username)) { // L: 573 574
					var25 = true;
				}

				if (!var25 && Client.field750 == 0 && !var2.isHidden) { // L: 576
					Players.field1384.offset = 0; // L: 577
					var0.readBytes(Players.field1384.array, 0, var24); // L: 578
					Players.field1384.offset = 0; // L: 579
					String var13 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(Players.field1384))); // L: 580
					var2.overheadText = var13.trim(); // L: 581
					var2.field1224 = var5 >> 8; // L: 582
					var2.field1225 = var5 & 255; // L: 583
					var2.overheadTextCyclesRemaining = 150; // L: 584
					byte[] var14 = null; // L: 585
					int var15;
					if (var22 > 0 && var22 <= 8) { // L: 586
						var14 = new byte[var22]; // L: 587

						for (var15 = 0; var15 < var22; ++var15) { // L: 588
							var14[var15] = var0.readByte(); // L: 589
						}
					}

					var2.field1262 = GraphicsDefaults.method8340(var14); // L: 592
					var2.field1252 = var23; // L: 593
					var2.field1222 = var2 != class133.localPlayer && var17.isUser && !Client.field745.isEmpty() && var13.toLowerCase().indexOf(Client.field745) == -1; // L: 594
					if (var17.isPrivileged) { // L: 596
						var15 = var23 ? 91 : 1;
					} else {
						var15 = var23 ? 90 : 2; // L: 597
					}

					if (var17.modIcon != -1) { // L: 598
						SecureRandomCallable.addGameMessage(var15, AbstractByteArrayCopier.method6833(var17.modIcon) + var2.username.getName(), var13);
					} else {
						SecureRandomCallable.addGameMessage(var15, var2.username.getName(), var13); // L: 599
					}
				}
			}

			var0.offset = var24 + var18 + var22; // L: 602
		}

		if ((var3 & 4096) != 0) { // L: 604
			var4 = var0.method9316(); // L: 605
		}

		if ((var3 & 256) != 0) { // L: 607
			for (var5 = 0; var5 < 3; ++var5) { // L: 608
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) { // L: 610
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 611
			if (var2.overheadText.charAt(0) == '~') { // L: 612
				var2.overheadText = var2.overheadText.substring(1); // L: 613
				SecureRandomCallable.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 614
			} else if (var2 == class133.localPlayer) { // L: 616
				SecureRandomCallable.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 617
			}

			var2.field1252 = false; // L: 619
			var2.field1224 = 0; // L: 620
			var2.field1225 = 0; // L: 621
			var2.overheadTextCyclesRemaining = 150; // L: 622
		}

		if ((var3 & 8192) != 0) { // L: 624
			var2.field1260 = Client.cycle + var0.method9318(); // L: 625
			var2.field1236 = Client.cycle + var0.method9380(); // L: 626
			var2.field1261 = var0.method9302(); // L: 627
			var2.field1263 = var0.readByte(); // L: 628
			var2.field1235 = var0.readByte(); // L: 629
			var2.field1265 = (byte)var0.method9462(); // L: 630
		}

		if ((var3 & 512) != 0) { // L: 632
			Players.field1383[var1] = (class233)KitDefinition.findEnumerated(class147.method3172(), var0.readByte()); // L: 633
		}

		if ((var3 & 4) != 0) { // L: 635
			var5 = var0.method9462(); // L: 636
			byte[] var21 = new byte[var5]; // L: 637
			Buffer var19 = new Buffer(var21); // L: 638
			var0.method9320(var21, 0, var5); // L: 639
			Players.field1395[var1] = var19; // L: 640
			var2.read(var19); // L: 641
		}

		if ((var3 & 64) != 0) { // L: 643
			var2.targetIndex = var0.method9318(); // L: 645
			var2.targetIndex += var0.method9462() << 16; // L: 646
			var5 = 16777215; // L: 647
			if (var2.targetIndex == var5) { // L: 648
				var2.targetIndex = -1; // L: 649
			}
		}

		if ((var3 & 65536) != 0) { // L: 652
			var5 = var0.method9300(); // L: 653

			for (var16 = 0; var16 < var5; ++var16) { // L: 654
				var22 = var0.method9298(); // L: 655
				var8 = var0.readUnsignedShort(); // L: 656
				var9 = var0.method9514(); // L: 657
				var2.method2414(var22, var8, var9 >> 16, var9 & 65535); // L: 658
			}
		}

		if (var2.field1147) { // L: 661
			if (var4 == 127) { // L: 662
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class233 var20;
				if (var4 != class233.field2488.field2482) { // L: 665
					var20 = (class233)KitDefinition.findEnumerated(class147.method3172(), var4);
				} else {
					var20 = Players.field1383[var1]; // L: 666
				}

				var2.method2342(var2.tileX, var2.tileY, var20); // L: 667
			}
		}

	} // L: 671

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lja;",
		garbageValue = "-2126649800"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 406
		if (var1 != null) { // L: 407
			return var1;
		} else {
			var1 = class133.method3068(class343.SequenceDefinition_animationsArchive, UrlRequest.SequenceDefinition_skeletonsArchive, var0, false); // L: 408
			if (var1 != null) { // L: 409
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 410
		}
	}
}
