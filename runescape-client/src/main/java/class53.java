import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class53 extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	class47 field386;

	public class53() {
		this.field386 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lcm;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field386 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbu;)V"
	)
	public class53(RawSound var1) {
		this.field386 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	public boolean method1085() {
		return this.field386 == null; // L: 24
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "2082518533"
	)
	public RawSound method1096() {
		if (this.field386 != null && this.field386.field349.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1082(); // L: 31
			} finally {
				this.field386.field349.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "2121230840"
	)
	public RawSound method1087() {
		if (this.field386 != null) { // L: 42
			this.field386.field349.lock();

			RawSound var1;
			try {
				var1 = this.method1082();
			} finally {
				this.field386.field349.unlock();
			}

			return var1; // L: 51
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "-565305963"
	)
	RawSound method1082() {
		if (this.field386.field348 == null) {
			this.field386.field348 = this.field386.field354.toRawSound((int[])null); // L: 58
			this.field386.field354 = null; // L: 59
		}

		return this.field386.field348; // L: 61
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1757242477"
	)
	public static void method1097(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 33
			class305.field3411.clear(); // L: 36
			class305.field3406.clear(); // L: 37
			class200.method3784(var5); // L: 38
			class270.method5492(var0, var5); // L: 39
			if (!class305.field3411.isEmpty()) { // L: 40
				class270.method5491(var1, var2, var3, var4); // L: 43
				class305.field3406.add(new class399((class406)null)); // L: 44
				class305.field3406.add(new class408((class406)null, class305.field3399, class305.field3400, class305.field3403)); // L: 45
				ArrayList var6 = new ArrayList(); // L: 46
				var6.add(new class403(new class405((class406)null, 0, true, class305.field3401))); // L: 47
				if (!class305.field3404.isEmpty()) { // L: 48
					ArrayList var7 = new ArrayList(); // L: 49
					var7.add(new class402(new class407((class406)null, var6), class305.field3410)); // L: 50
					ArrayList var9 = new ArrayList(); // L: 53
					Iterator var10 = class305.field3404.iterator(); // L: 54

					while (var10.hasNext()) {
						class317 var11 = (class317)var10.next(); // L: 55
						var9.add(var11); // L: 57
					}

					var7.add(new class402(new class404(new class401((class406)null, var9), 0, false, class305.field3409), class305.field3408)); // L: 63
					class305.field3406.add(new class407((class406)null, var7)); // L: 64
				} else {
					class305.field3406.add(new class402((class406)null, class305.field3410)); // L: 67
					class305.field3406.add(new class407((class406)null, var6)); // L: 68
				}

			}
		}
	} // L: 34 41 70

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lto;ILdf;II)V",
		garbageValue = "-2132656914"
	)
	static final void method1086(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class217.field2405.field2408; // L: 455
		int var5;
		if ((var3 & 8) != 0) { // L: 456
			var5 = var0.readUnsignedByte(); // L: 457
			byte[] var6 = new byte[var5]; // L: 458
			Buffer var7 = new Buffer(var6); // L: 459
			var0.method9218(var6, 0, var5); // L: 460
			Players.field1388[var1] = var7; // L: 461
			var2.read(var7); // L: 462
		}

		int var9;
		int var16;
		int var17;
		int var18;
		if ((var3 & 65536) != 0) { // L: 464
			var5 = var0.readUnsignedByte(); // L: 465

			for (var16 = 0; var16 < var5; ++var16) { // L: 466
				var17 = var0.method9091(); // L: 467
				var18 = var0.method9102(); // L: 468
				var9 = var0.readInt(); // L: 469
				var2.method2376(var17, var18, var9 >> 16, var9 & 65535); // L: 470
			}
		}

		if ((var3 & 64) != 0) {
			var2.field1234 = var0.method9102();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1234; // L: 476
				var2.method2393();
			}
		}

		if ((var3 & 16) != 0) {
			var2.targetIndex = var0.method9102(); // L: 482
			var2.targetIndex += var0.method9091() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1; // L: 486
			}
		}

		int var10;
		int var11;
		if ((var3 & 4096) != 0) {
			var5 = var0.method9102();
			var16 = var5 >> 8; // L: 491
			var17 = var16 >= 13 && var16 <= 20 ? var16 - 12 : 0; // L: 492
			PlayerType var8 = (PlayerType)class25.findEnumerated(MidiPcmStream.PlayerType_values(), var0.method9091()); // L: 493
			boolean var24 = var0.readUnsignedByte() == 1; // L: 494
			var10 = var0.method9256(); // L: 495
			var11 = var0.offset; // L: 496
			if (var2.username != null && var2.appearance != null) { // L: 497
				boolean var12 = false; // L: 498
				if (var8.isUser && class299.friendSystem.isIgnored(var2.username)) { // L: 499 500
					var12 = true;
				}

				if (!var12 && Client.field651 == 0 && !var2.isHidden) { // L: 502
					Players.field1376.offset = 0; // L: 503
					var0.method9218(Players.field1376.array, 0, var10); // L: 504
					Players.field1376.offset = 0; // L: 505
					String var13 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(Players.field1376))); // L: 506
					var2.overheadText = var13.trim(); // L: 507
					var2.field1222 = var5 >> 8; // L: 508
					var2.field1223 = var5 & 255; // L: 509
					var2.overheadTextCyclesRemaining = 150; // L: 510
					byte[] var14 = null; // L: 511
					int var15;
					if (var17 > 0 && var17 <= 8) { // L: 512
						var14 = new byte[var17]; // L: 513

						for (var15 = 0; var15 < var17; ++var15) { // L: 514
							var14[var15] = var0.method9096(); // L: 515
						}
					}

					var2.field1264 = class164.method3322(var14); // L: 518
					var2.field1219 = var24; // L: 519
					var2.field1220 = var2 != VarbitComposition.localPlayer && var8.isUser && !Client.field554.isEmpty() && var13.toLowerCase().indexOf(Client.field554) == -1; // L: 520
					if (var8.isPrivileged) { // L: 522
						var15 = var24 ? 91 : 1;
					} else {
						var15 = var24 ? 90 : 2; // L: 523
					}

					if (var8.modIcon != -1) { // L: 524
						MouseHandler.addGameMessage(var15, Tile.method4373(var8.modIcon) + var2.username.getName(), var13);
					} else {
						MouseHandler.addGameMessage(var15, var2.username.getName(), var13); // L: 525
					}
				}
			}

			var0.offset = var17 + var10 + var11; // L: 528
		}

		int var26;
		if ((var3 & 32) != 0) { // L: 530
			var5 = var0.method9101(); // L: 531
			PlayerType var21 = (PlayerType)class25.findEnumerated(MidiPcmStream.PlayerType_values(), var0.method9256()); // L: 532
			boolean var27 = var0.method9256() == 1; // L: 533
			var18 = var0.readUnsignedByte(); // L: 534
			var9 = var0.offset; // L: 535
			if (var2.username != null && var2.appearance != null) { // L: 536
				boolean var25 = false; // L: 537
				if (var21.isUser && class299.friendSystem.isIgnored(var2.username)) { // L: 538 539
					var25 = true;
				}

				if (!var25 && Client.field651 == 0 && !var2.isHidden) { // L: 541
					Players.field1376.offset = 0; // L: 542
					var0.method9218(Players.field1376.array, 0, var18); // L: 543
					Players.field1376.offset = 0; // L: 544
					String var19 = AbstractFont.escapeBrackets(World.method1830(DirectByteArrayCopier.method6579(Players.field1376))); // L: 545
					var2.overheadText = var19.trim(); // L: 546
					var2.field1222 = var5 >> 8; // L: 547
					var2.field1223 = var5 & 255; // L: 548
					var2.overheadTextCyclesRemaining = 150; // L: 549
					var2.field1264 = null; // L: 550
					var2.field1219 = var27; // L: 551
					var2.field1220 = var2 != VarbitComposition.localPlayer && var21.isUser && !Client.field554.isEmpty() && var19.toLowerCase().indexOf(Client.field554) == -1; // L: 552
					if (var21.isPrivileged) { // L: 554
						var26 = var27 ? 91 : 1;
					} else {
						var26 = var27 ? 90 : 2; // L: 555
					}

					if (var21.modIcon != -1) { // L: 556
						MouseHandler.addGameMessage(var26, Tile.method4373(var21.modIcon) + var2.username.getName(), var19);
					} else {
						MouseHandler.addGameMessage(var26, var2.username.getName(), var19); // L: 557
					}
				}
			}

			var0.offset = var18 + var9; // L: 560
		}

		if ((var3 & 4) != 0) { // L: 562
			var5 = var0.readUnsignedByte(); // L: 563
			if (var5 > 0) { // L: 564
				for (var16 = 0; var16 < var5; ++var16) { // L: 565
					var18 = -1; // L: 567
					var9 = -1; // L: 568
					var10 = -1; // L: 569
					var17 = var0.readUShortSmart(); // L: 570
					if (var17 == 32767) { // L: 571
						var17 = var0.readUShortSmart(); // L: 572
						var9 = var0.readUShortSmart(); // L: 573
						var18 = var0.readUShortSmart(); // L: 574
						var10 = var0.readUShortSmart(); // L: 575
					} else if (var17 != 32766) { // L: 577
						var9 = var0.readUShortSmart(); // L: 578
					} else {
						var17 = -1; // L: 580
					}

					var11 = var0.readUShortSmart(); // L: 581
					var2.addHitSplat(var17, var9, var18, var10, Client.cycle, var11); // L: 582
				}
			}

			var16 = var0.readUnsignedByte(); // L: 585
			if (var16 > 0) { // L: 586
				for (var17 = 0; var17 < var16; ++var17) { // L: 587
					var18 = var0.readUShortSmart(); // L: 588
					var9 = var0.readUShortSmart(); // L: 589
					if (var9 != 32767) { // L: 590
						var10 = var0.readUShortSmart(); // L: 591
						var11 = var0.method9091(); // L: 592
						var26 = var9 > 0 ? var0.readUnsignedByte() : var11; // L: 593
						var2.addHealthBar(var18, Client.cycle, var9, var10, var11, var26); // L: 594
					} else {
						var2.removeHealthBar(var18); // L: 596
					}
				}
			}
		}

		if ((var3 & 512) != 0) { // L: 600
			var2.field1249 = var0.method9096(); // L: 601
			var2.field1251 = var0.method9078(); // L: 602
			var2.field1247 = var0.readByte(); // L: 603
			var2.field1217 = var0.readByte(); // L: 604
			var2.spotAnimation = var0.method9101() + Client.cycle; // L: 605
			var2.field1254 = var0.method9101() + Client.cycle; // L: 606
			var2.field1255 = var0.method9102(); // L: 607
			if (var2.field1154) { // L: 608
				var2.field1249 += var2.tileX; // L: 609
				var2.field1251 += var2.tileY; // L: 610
				var2.field1247 += var2.tileX; // L: 611
				var2.field1217 += var2.tileY; // L: 612
				var2.pathLength = 0; // L: 613
			} else {
				var2.field1249 += var2.pathX[0]; // L: 616
				var2.field1251 += var2.pathY[0]; // L: 617
				var2.field1247 += var2.pathX[0]; // L: 618
				var2.field1217 += var2.pathY[0]; // L: 619
				var2.pathLength = 1; // L: 620
			}

			var2.field1261 = 0; // L: 622
		}

		if ((var3 & 2048) != 0) { // L: 624
			class217[] var20 = Players.field1377; // L: 625
			class217[] var23 = new class217[]{class217.field2405, class217.field2406, class217.field2407, class217.field2410}; // L: 629
			var20[var1] = (class217)class25.findEnumerated(var23, var0.readByte()); // L: 631
		}

		if ((var3 & 128) != 0) { // L: 633
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 634
			if (var2.overheadText.charAt(0) == '~') { // L: 635
				var2.overheadText = var2.overheadText.substring(1); // L: 636
				MouseHandler.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 637
			} else if (var2 == VarbitComposition.localPlayer) { // L: 639
				MouseHandler.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 640
			}

			var2.field1219 = false; // L: 642
			var2.field1222 = 0; // L: 643
			var2.field1223 = 0; // L: 644
			var2.overheadTextCyclesRemaining = 150; // L: 645
		}

		if ((var3 & 16384) != 0) { // L: 647
			var2.field1258 = Client.cycle + var0.method9100(); // L: 648
			var2.field1200 = Client.cycle + var0.method9100(); // L: 649
			var2.field1260 = var0.method9096(); // L: 650
			var2.field1218 = var0.method9095(); // L: 651
			var2.field1212 = var0.method9078(); // L: 652
			var2.field1250 = (byte)var0.method9256(); // L: 653
		}

		if ((var3 & 8192) != 0) { // L: 655
			for (var5 = 0; var5 < 3; ++var5) { // L: 656
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 1024) != 0) { // L: 658
			var4 = var0.readByte(); // L: 659
		}

		if ((var3 & 2) != 0) { // L: 661
			var5 = var0.readUnsignedShort(); // L: 662
			if (var5 == 65535) { // L: 663
				var5 = -1;
			}

			var16 = var0.method9091(); // L: 664
			LoginType.performPlayerAnimation(var2, var5, var16); // L: 665
		}

		if (var2.field1154) { // L: 667
			if (var4 == 127) { // L: 668
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class217 var28;
				if (var4 != class217.field2405.field2408) { // L: 671
					class217[] var22 = new class217[]{class217.field2405, class217.field2406, class217.field2407, class217.field2410}; // L: 674
					var28 = (class217)class25.findEnumerated(var22, var4); // L: 676
				} else {
					var28 = Players.field1377[var1]; // L: 678
				}

				var2.method2345(var2.tileX, var2.tileY, var28); // L: 679
			}
		}

	} // L: 683

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	static void method1095() {
		if (class125.loadWorlds()) { // L: 1914
			Login.worldSelectOpen = true; // L: 1915
			Login.worldSelectPage = 0; // L: 1916
			Login.worldSelectPagesCount = 0; // L: 1917
		}

	} // L: 1919

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1225390547"
	)
	static int method1098(int var0, Script var1, boolean var2) {
		return 2; // L: 5095
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "959381861"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 471
		int var2 = var1.readUnsignedByte(); // L: 472
		int var3 = var1.readInt(); // L: 473
		if (var3 < 0 || AbstractArchive.field4296 != 0 && var3 > AbstractArchive.field4296) { // L: 474
			throw new RuntimeException(); // L: 475
		} else if (var2 == 0) { // L: 477
			byte[] var6 = new byte[var3]; // L: 478
			var1.readBytes(var6, 0, var3); // L: 479
			return var6; // L: 480
		} else {
			int var4 = var1.readInt(); // L: 483
			if (var4 >= 0 && (AbstractArchive.field4296 == 0 || var4 <= AbstractArchive.field4296)) { // L: 484
				byte[] var5 = new byte[var4]; // L: 487
				if (var2 == 1) { // L: 488
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 489
				}

				return var5; // L: 490
			} else {
				throw new RuntimeException(); // L: 485
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "709896940"
	)
	static final boolean method1093(int var0) {
		if (var0 < 0) { // L: 9375
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 9376
			if (var1 >= 2000) { // L: 9377
				var1 -= 2000;
			}

			return var1 == 1007; // L: 9378
		}
	}
}
