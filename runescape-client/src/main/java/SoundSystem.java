import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 1574144384
	)
	static int field314;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 10
				PcmPlayer var2 = this.players[var1]; // L: 11
				if (var2 != null) { // L: 12
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 15
			class368.RunException_sendStackTrace((String)null, var4); // L: 16
		}

	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1312935267"
	)
	static long method870(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgy;",
		garbageValue = "8247"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "0"
	)
	static final float method871(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 21
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 22
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V",
		garbageValue = "850217673"
	)
	static final void method877(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 474
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 475
			Player var3 = Client.players[var2]; // L: 476
			int var4 = var0.readUnsignedByte(); // L: 477
			if ((var4 & 128) != 0) { // L: 478
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) { // L: 479
				var4 += var0.readUnsignedByte() << 16;
			}

			byte var5 = class231.field2460.field2457; // L: 481
			if ((var4 & 1) != 0) { // L: 482
				var3.field1195 = var0.readStringCp1252NullTerminated(); // L: 483
				if (var3.field1195.charAt(0) == '~') { // L: 484
					var3.field1195 = var3.field1195.substring(1); // L: 485
					GrandExchangeEvents.addGameMessage(2, var3.username.getName(), var3.field1195); // L: 486
				} else if (var3 == class25.localPlayer) { // L: 488
					GrandExchangeEvents.addGameMessage(2, var3.username.getName(), var3.field1195); // L: 489
				}

				var3.field1202 = false; // L: 491
				var3.field1185 = 0; // L: 492
				var3.field1197 = 0; // L: 493
				var3.field1212 = 150; // L: 494
			}

			if ((var4 & 2) != 0) { // L: 496
				var3.field1208 = var0.method9538(); // L: 497
				if (var3.pathLength == 0) { // L: 498
					var3.orientation = var3.field1208; // L: 499
					var3.method2460(); // L: 500
				}
			}

			int var6;
			if ((var4 & 64) != 0) { // L: 503
				var3.targetIndex = var0.readUnsignedShort(); // L: 505
				var3.targetIndex += var0.readUnsignedByte() << 16; // L: 506
				var6 = 16777215; // L: 507
				if (var6 == var3.targetIndex) { // L: 508
					var3.targetIndex = -1; // L: 509
				}
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) { // L: 512
				var6 = var0.method9538(); // L: 513
				PlayerType var7 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var0.method9526()); // L: 514
				boolean var8 = var0.method9526() == 1; // L: 515
				var9 = var0.method9420(); // L: 516
				var10 = var0.offset; // L: 517
				if (var3.username != null && var3.appearance != null) { // L: 518
					boolean var11 = false; // L: 519
					if (var7.isUser && class332.friendSystem.isIgnored(var3.username)) { // L: 520 521
						var11 = true;
					}

					if (!var11 && Client.field621 == 0 && !var3.isHidden) { // L: 523
						Players.field1351.offset = 0; // L: 524
						var0.method9533(Players.field1351.array, 0, var9); // L: 525
						Players.field1351.offset = 0; // L: 526
						String var12 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(Players.field1351))); // L: 527
						var3.field1195 = var12.trim(); // L: 528
						var3.field1185 = var6 >> 8; // L: 529
						var3.field1197 = var6 & 255; // L: 530
						var3.field1212 = 150; // L: 531
						var3.field1198 = null; // L: 532
						var3.field1202 = var8; // L: 533
						var3.field1194 = var3 != class25.localPlayer && var7.isUser && !Client.field733.isEmpty() && var12.toLowerCase().indexOf(Client.field733) == -1; // L: 534
						if (var7.isPrivileged) { // L: 536
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2; // L: 537
						}

						if (var7.modIcon != -1) { // L: 538
							GrandExchangeEvents.addGameMessage(var13, class228.method4503(var7.modIcon) + var3.username.getName(), var12);
						} else {
							GrandExchangeEvents.addGameMessage(var13, var3.username.getName(), var12); // L: 539
						}
					}
				}

				var0.offset = var10 + var9; // L: 542
			}

			int var17;
			if ((var4 & 8) != 0) { // L: 544
				var6 = var0.method9430(); // L: 545
				if (var6 == 65535) { // L: 546
					var6 = -1;
				}

				var17 = var0.readUnsignedByte(); // L: 547
				class358.performPlayerAnimation(var3, var6, var17); // L: 548
			}

			int var19;
			int var24;
			int var26;
			if ((var4 & 32768) != 0) { // L: 550
				var6 = var0.method9538(); // L: 551
				var17 = var6 >> 8; // L: 552
				var24 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0; // L: 553
				PlayerType var18 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var0.method9420()); // L: 554
				boolean var25 = var0.method9526() == 1; // L: 555
				var26 = var0.method9420(); // L: 556
				var19 = var0.offset; // L: 557
				if (var3.username != null && var3.appearance != null) { // L: 558
					boolean var27 = false; // L: 559
					if (var18.isUser && class332.friendSystem.isIgnored(var3.username)) { // L: 560 561
						var27 = true;
					}

					if (!var27 && Client.field621 == 0 && !var3.isHidden) { // L: 563
						Players.field1351.offset = 0; // L: 564
						var0.method9533(Players.field1351.array, 0, var26); // L: 565
						Players.field1351.offset = 0; // L: 566
						String var14 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(Players.field1351))); // L: 567
						var3.field1195 = var14.trim(); // L: 568
						var3.field1185 = var6 >> 8; // L: 569
						var3.field1197 = var6 & 255; // L: 570
						var3.field1212 = 150; // L: 571
						byte[] var15 = null; // L: 572
						int var16;
						if (var24 > 0 && var24 <= 8) { // L: 573
							var15 = new byte[var24]; // L: 574

							for (var16 = 0; var16 < var24; ++var16) { // L: 575
								var15[var16] = var0.method9422(); // L: 576
							}
						}

						var3.field1198 = class431.method8065(var15); // L: 579
						var3.field1202 = var25; // L: 580
						var3.field1194 = var3 != class25.localPlayer && var18.isUser && !Client.field733.isEmpty() && var14.toLowerCase().indexOf(Client.field733) == -1; // L: 581
						if (var18.isPrivileged) { // L: 583
							var16 = var25 ? 91 : 1;
						} else {
							var16 = var25 ? 90 : 2; // L: 584
						}

						if (var18.modIcon != -1) { // L: 585
							GrandExchangeEvents.addGameMessage(var16, class228.method4503(var18.modIcon) + var3.username.getName(), var14);
						} else {
							GrandExchangeEvents.addGameMessage(var16, var3.username.getName(), var14); // L: 586
						}
					}
				}

				var0.offset = var19 + var26 + var24; // L: 589
			}

			if ((var4 & 32) != 0) { // L: 591
				var6 = var0.method9420(); // L: 592
				if (var6 > 0) { // L: 593
					for (var17 = 0; var17 < var6; ++var17) { // L: 594
						var9 = -1; // L: 596
						var10 = -1; // L: 597
						var26 = -1; // L: 598
						var24 = var0.readUShortSmart(); // L: 599
						if (var24 == 32767) { // L: 600
							var24 = var0.readUShortSmart(); // L: 601
							var10 = var0.readUShortSmart(); // L: 602
							var9 = var0.readUShortSmart(); // L: 603
							var26 = var0.readUShortSmart(); // L: 604
						} else if (var24 != 32766) { // L: 606
							var10 = var0.readUShortSmart(); // L: 607
						} else {
							var24 = -1; // L: 609
						}

						var19 = var0.readUShortSmart(); // L: 610
						var3.addHitSplat(var24, var10, var9, var26, Client.cycle, var19); // L: 611
					}
				}

				var17 = var0.method9526(); // L: 614
				if (var17 > 0) { // L: 615
					for (var24 = 0; var24 < var17; ++var24) { // L: 616
						var9 = var0.readUShortSmart(); // L: 617
						var10 = var0.readUShortSmart(); // L: 618
						if (var10 != 32767) { // L: 619
							var26 = var0.readUShortSmart(); // L: 620
							var19 = var0.method9526(); // L: 621
							var13 = var10 > 0 ? var0.method9420() : var19; // L: 622
							var3.addHealthBar(var9, Client.cycle, var10, var26, var19, var13); // L: 623
						} else {
							var3.removeHealthBar(var9); // L: 625
						}
					}
				}
			}

			if ((var4 & 4096) != 0) { // L: 629
				class231[] var20 = Players.field1348; // L: 630
				class231[] var21 = new class231[]{class231.field2459, class231.field2458, class231.field2460, class231.field2456}; // L: 634
				var20[var2] = (class231)GrandExchangeEvents.findEnumerated(var21, var0.method9423()); // L: 636
			}

			if ((var4 & 4) != 0) { // L: 638
				var6 = var0.method9420(); // L: 639
				byte[] var22 = new byte[var6]; // L: 640
				Buffer var29 = new Buffer(var22); // L: 641
				var0.method9533(var22, 0, var6); // L: 642
				Players.field1347[var2] = var29; // L: 643
				var3.read(var29); // L: 644
			}

			if ((var4 & 2048) != 0) { // L: 646
				for (var6 = 0; var6 < 3; ++var6) { // L: 647
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 1024) != 0) { // L: 649
				var3.field1223 = var0.method9446(); // L: 650
				var3.field1225 = var0.method9446(); // L: 651
				var3.field1224 = var0.method9423(); // L: 652
				var3.field1226 = var0.method9422(); // L: 653
				var3.spotAnimation = var0.method9430() + Client.cycle; // L: 654
				var3.field1228 = var0.readUnsignedShort() + Client.cycle; // L: 655
				var3.field1173 = var0.method9430(); // L: 656
				if (var3.field1124) { // L: 657
					var3.field1223 += var3.tileX; // L: 658
					var3.field1225 += var3.tileY; // L: 659
					var3.field1224 += var3.tileX; // L: 660
					var3.field1226 += var3.tileY; // L: 661
					var3.pathLength = 0; // L: 662
				} else {
					var3.field1223 += var3.pathX[0]; // L: 665
					var3.field1225 += var3.pathY[0]; // L: 666
					var3.field1224 += var3.pathX[0]; // L: 667
					var3.field1226 += var3.pathY[0]; // L: 668
					var3.pathLength = 1; // L: 669
				}

				var3.field1215 = 0; // L: 671
			}

			if ((var4 & 8192) != 0) { // L: 673
				var5 = var0.method9446(); // L: 674
			}

			if ((var4 & 65536) != 0) { // L: 676
				var6 = var0.method9419(); // L: 677

				for (var17 = 0; var17 < var6; ++var17) { // L: 678
					var24 = var0.readUnsignedByte(); // L: 679
					var9 = var0.readUnsignedShort(); // L: 680
					var10 = var0.method9441(); // L: 681
					var3.method2469(var24, var9, var10 >> 16, var10 & 65535); // L: 682
				}
			}

			if ((var4 & 512) != 0) { // L: 685
				var3.field1180 = Client.cycle + var0.method9538(); // L: 686
				var3.field1233 = Client.cycle + var0.method9538(); // L: 687
				var3.field1234 = var0.method9446(); // L: 688
				var3.field1193 = var0.readByte(); // L: 689
				var3.field1204 = var0.method9422(); // L: 690
				var3.field1237 = (byte)var0.method9420(); // L: 691
			}

			if (var3.field1124) { // L: 693
				if (var5 == 127) { // L: 694
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class231 var28;
					if (var5 != class231.field2460.field2457) { // L: 697
						class231[] var23 = new class231[]{class231.field2459, class231.field2458, class231.field2460, class231.field2456}; // L: 700
						var28 = (class231)GrandExchangeEvents.findEnumerated(var23, var5); // L: 702
					} else {
						var28 = Players.field1348[var2]; // L: 704
					}

					var3.method2429(var3.tileX, var3.tileY, var28); // L: 705
				}
			}
		}

	} // L: 711

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(S)Liz;",
		garbageValue = "-14960"
	)
	public static class226 method879() {
		return Client.field661; // L: 1111
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090704793"
	)
	static void method876(int var0) {
		class74.tempMenuAction = new MenuAction(); // L: 11981
		class74.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11982
		class74.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11983
		class74.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11984
		class74.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11985
		class74.tempMenuAction.field886 = Client.field687[var0]; // L: 11986
		class74.tempMenuAction.field890 = Client.menuActions[var0]; // L: 11987
		class74.tempMenuAction.field891 = Client.menuTargets[var0]; // L: 11988
	} // L: 11989
}
