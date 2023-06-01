import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class19 implements Callable {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = 599953479
	)
	static int field78;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 914294261
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class10 field85;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lap;Lad;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field85 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field85.method96()) { // L: 53
				VarpDefinition.method3559(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field85.method88(); // L: 60
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltn;ILdr;II)V",
		garbageValue = "-1275713090"
	)
	static final void method272(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class216.field2382.field2383; // L: 485
		int var5;
		int var6;
		if ((var3 & 32) != 0) { // L: 486
			var5 = var0.method9007(); // L: 487
			if (var5 == 65535) { // L: 488
				var5 = -1;
			}

			var6 = var0.method9050(); // L: 489
			NameableContainer.performPlayerAnimation(var2, var5, var6); // L: 490
		}

		int var7;
		int var10;
		int var11;
		if ((var3 & 256) != 0) { // L: 492
			var5 = var0.method9005(); // L: 493
			var6 = var5 >> 8; // L: 494
			var7 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0; // L: 495
			PlayerType var8 = (PlayerType)class217.findEnumerated(class31.PlayerType_values(), var0.method9050()); // L: 496
			boolean var9 = var0.readUnsignedByte() == 1; // L: 497
			var10 = var0.method9050(); // L: 498
			var11 = var0.offset; // L: 499
			if (var2.username != null && var2.appearance != null) { // L: 500
				boolean var12 = false; // L: 501
				if (var8.isUser && ReflectionCheck.friendSystem.isIgnored(var2.username)) { // L: 502 503
					var12 = true;
				}

				if (!var12 && Client.field516 == 0 && !var2.isHidden) { // L: 505
					Players.field1336.offset = 0; // L: 506
					var0.method8986(Players.field1336.array, 0, var10); // L: 507
					Players.field1336.offset = 0; // L: 508
					String var13 = AbstractFont.escapeBrackets(class251.method5039(SecureRandomFuture.method2113(Players.field1336))); // L: 509
					var2.field1160 = var13.trim(); // L: 510
					var2.field1164 = var5 >> 8; // L: 511
					var2.field1165 = var5 & 255; // L: 512
					var2.field1163 = 150; // L: 513
					byte[] var14 = null; // L: 514
					if (var7 > 0 && var7 <= 8) { // L: 515
						var14 = new byte[var7]; // L: 516

						for (int var15 = 0; var15 < var7; ++var15) { // L: 517
							var14[var15] = var0.method9000(); // L: 518
						}
					}

					byte[] var17 = var14; // L: 523
					int[] var16;
					if (var14 != null && var14.length != 0 && var14.length <= 8) { // L: 525
						int[] var18 = new int[var14.length]; // L: 529
						int var19 = 0;

						while (true) {
							if (var19 >= var17.length) {
								var16 = var18; // L: 537
								break;
							}

							if (var17[var19] < 0 || var17[var19] > class525.field5175.length) { // L: 531
								var16 = null; // L: 532
								break; // L: 533
							}

							var18[var19] = class525.field5175[var17[var19]]; // L: 535
							++var19; // L: 530
						}
					} else {
						var16 = null; // L: 526
					}

					var2.field1191 = var16; // L: 539
					var2.field1161 = var9; // L: 540
					var2.field1162 = var2 != HitSplatDefinition.localPlayer && var8.isUser && "" != Client.field557 && var13.toLowerCase().indexOf(Client.field557) == -1; // L: 541
					int var21;
					if (var8.isPrivileged) { // L: 543
						var21 = var9 ? 91 : 1;
					} else {
						var21 = var9 ? 90 : 2; // L: 544
					}

					if (var8.modIcon != -1) { // L: 545
						HealthBarUpdate.addGameMessage(var21, ViewportMouse.method4904(var8.modIcon) + var2.username.getName(), var13);
					} else {
						HealthBarUpdate.addGameMessage(var21, var2.username.getName(), var13); // L: 546
					}
				}
			}

			var0.offset = var7 + var10 + var11; // L: 549
		}

		if ((var3 & 16384) != 0) { // L: 551
			var4 = var0.method8965(); // L: 552
		}

		int var25;
		int var28;
		if ((var3 & 65536) != 0) { // L: 554
			var5 = var0.method8998(); // L: 555

			for (var6 = 0; var6 < var5; ++var6) { // L: 556
				var7 = var0.readUnsignedByte(); // L: 557
				var25 = var0.method9005(); // L: 558
				var28 = var0.method9020(); // L: 559
				var2.method2358(var7, var25, var28 >> 16, var28 & 65535); // L: 560
			}
		}

		if ((var3 & 4096) != 0) { // L: 563
			for (var5 = 0; var5 < 3; ++var5) { // L: 564
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 2048) != 0) { // L: 566
			class216[] var22 = Players.field1342; // L: 567
			class216[] var23 = new class216[]{class216.field2382, class216.field2384, class216.field2380, class216.field2381}; // L: 571
			var22[var1] = (class216)class217.findEnumerated(var23, var0.method9000()); // L: 573
		}

		int var30;
		if ((var3 & 64) != 0) { // L: 575
			var5 = var0.readUnsignedShort(); // L: 576
			PlayerType var24 = (PlayerType)class217.findEnumerated(class31.PlayerType_values(), var0.method9050()); // L: 577
			boolean var27 = var0.method9026() == 1; // L: 578
			var25 = var0.readUnsignedByte(); // L: 579
			var28 = var0.offset; // L: 580
			if (var2.username != null && var2.appearance != null) { // L: 581
				boolean var29 = false; // L: 582
				if (var24.isUser && ReflectionCheck.friendSystem.isIgnored(var2.username)) { // L: 583 584
					var29 = true;
				}

				if (!var29 && Client.field516 == 0 && !var2.isHidden) { // L: 586
					Players.field1336.offset = 0; // L: 587
					var0.method8986(Players.field1336.array, 0, var25); // L: 588
					Players.field1336.offset = 0; // L: 589
					String var26 = AbstractFont.escapeBrackets(class251.method5039(SecureRandomFuture.method2113(Players.field1336))); // L: 590
					var2.field1160 = var26.trim(); // L: 591
					var2.field1164 = var5 >> 8; // L: 592
					var2.field1165 = var5 & 255; // L: 593
					var2.field1163 = 150; // L: 594
					var2.field1191 = null; // L: 595
					var2.field1161 = var27; // L: 596
					var2.field1162 = var2 != HitSplatDefinition.localPlayer && var24.isUser && "" != Client.field557 && var26.toLowerCase().indexOf(Client.field557) == -1; // L: 597
					if (var24.isPrivileged) { // L: 599
						var30 = var27 ? 91 : 1;
					} else {
						var30 = var27 ? 90 : 2; // L: 600
					}

					if (var24.modIcon != -1) { // L: 601
						HealthBarUpdate.addGameMessage(var30, ViewportMouse.method4904(var24.modIcon) + var2.username.getName(), var26);
					} else {
						HealthBarUpdate.addGameMessage(var30, var2.username.getName(), var26); // L: 602
					}
				}
			}

			var0.offset = var25 + var28; // L: 605
		}

		if ((var3 & 1) != 0) { // L: 607
			var5 = var0.method9050(); // L: 608
			if (var5 > 0) { // L: 609
				for (var6 = 0; var6 < var5; ++var6) { // L: 610
					var25 = -1; // L: 612
					var28 = -1; // L: 613
					var10 = -1; // L: 614
					var7 = var0.readUShortSmart(); // L: 615
					if (var7 == 32767) { // L: 616
						var7 = var0.readUShortSmart(); // L: 617
						var28 = var0.readUShortSmart(); // L: 618
						var25 = var0.readUShortSmart(); // L: 619
						var10 = var0.readUShortSmart(); // L: 620
					} else if (var7 != 32766) { // L: 622
						var28 = var0.readUShortSmart(); // L: 623
					} else {
						var7 = -1; // L: 625
					}

					var11 = var0.readUShortSmart(); // L: 626
					var2.addHitSplat(var7, var28, var25, var10, Client.cycle, var11); // L: 627
				}
			}

			var6 = var0.method9026(); // L: 630
			if (var6 > 0) { // L: 631
				for (var7 = 0; var7 < var6; ++var7) { // L: 632
					var25 = var0.readUShortSmart(); // L: 633
					var28 = var0.readUShortSmart(); // L: 634
					if (var28 != 32767) { // L: 635
						var10 = var0.readUShortSmart(); // L: 636
						var11 = var0.method8998(); // L: 637
						var30 = var28 > 0 ? var0.method8998() : var11; // L: 638
						var2.addHealthBar(var25, Client.cycle, var28, var10, var11, var30); // L: 639
					} else {
						var2.removeHealthBar(var25); // L: 641
					}
				}
			}
		}

		if ((var3 & 16) != 0) { // L: 645
			var2.targetIndex = var0.method9005(); // L: 647
			var2.targetIndex += var0.method9050() << 16; // L: 648
			var5 = 16777215; // L: 649
			if (var2.targetIndex == var5) { // L: 650
				var2.targetIndex = -1; // L: 651
			}
		}

		if ((var3 & 1024) != 0) { // L: 654
			var2.field1158 = var0.method9000(); // L: 655
			var2.field1193 = var0.method8965(); // L: 656
			var2.field1192 = var0.method9000(); // L: 657
			var2.field1189 = var0.readByte(); // L: 658
			var2.spotAnimation = var0.method9006() + Client.cycle; // L: 659
			var2.field1196 = var0.readUnsignedShort() + Client.cycle; // L: 660
			var2.field1139 = var0.method9005(); // L: 661
			if (var2.field1107) { // L: 662
				var2.field1158 += var2.tileX; // L: 663
				var2.field1193 += var2.tileY; // L: 664
				var2.field1192 += var2.tileX; // L: 665
				var2.field1189 += var2.tileY; // L: 666
				var2.pathLength = 0; // L: 667
			} else {
				var2.field1158 += var2.pathX[0]; // L: 670
				var2.field1193 += var2.pathY[0]; // L: 671
				var2.field1192 += var2.pathX[0]; // L: 672
				var2.field1189 += var2.pathY[0]; // L: 673
				var2.pathLength = 1; // L: 674
			}

			var2.field1214 = 0; // L: 676
		}

		if ((var3 & 128) != 0) { // L: 678
			var2.field1160 = var0.readStringCp1252NullTerminated(); // L: 679
			if (var2.field1160.charAt(0) == '~') { // L: 680
				var2.field1160 = var2.field1160.substring(1); // L: 681
				HealthBarUpdate.addGameMessage(2, var2.username.getName(), var2.field1160); // L: 682
			} else if (var2 == HitSplatDefinition.localPlayer) { // L: 684
				HealthBarUpdate.addGameMessage(2, var2.username.getName(), var2.field1160); // L: 685
			}

			var2.field1161 = false; // L: 687
			var2.field1164 = 0; // L: 688
			var2.field1165 = 0; // L: 689
			var2.field1163 = 150; // L: 690
		}

		if ((var3 & 4) != 0) { // L: 692
			var5 = var0.method8998(); // L: 693
			byte[] var33 = new byte[var5]; // L: 694
			Buffer var32 = new Buffer(var33); // L: 695
			var0.method9116(var33, 0, var5); // L: 696
			Players.field1329[var1] = var32; // L: 697
			var2.read(var32); // L: 698
		}

		if ((var3 & 2) != 0) { // L: 700
			var2.field1211 = var0.method9007(); // L: 701
			if (var2.pathLength == 0) { // L: 702
				var2.orientation = var2.field1211; // L: 703
				var2.method2380(); // L: 704
			}
		}

		if ((var3 & 32768) != 0) { // L: 707
			var2.field1200 = Client.cycle + var0.readUnsignedShort(); // L: 708
			var2.field1201 = Client.cycle + var0.readUnsignedShort(); // L: 709
			var2.field1175 = var0.readByte(); // L: 710
			var2.field1203 = var0.method8965(); // L: 711
			var2.field1153 = var0.readByte(); // L: 712
			var2.field1205 = (byte)var0.readUnsignedByte(); // L: 713
		}

		if (var2.field1107) { // L: 715
			if (var4 == 127) { // L: 716
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class216 var31;
				if (var4 != class216.field2382.field2383) { // L: 719
					class216[] var34 = new class216[]{class216.field2382, class216.field2384, class216.field2380, class216.field2381}; // L: 722
					var31 = (class216)class217.findEnumerated(var34, var4); // L: 724
				} else {
					var31 = Players.field1342[var1]; // L: 726
				}

				var2.method2287(var2.tileX, var2.tileY, var31); // L: 727
			}
		}

	} // L: 731
}
