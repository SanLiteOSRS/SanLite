import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2008(2, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2010(0, 2);

	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1932312333
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 200031989
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-3876"
	)
	public static int method3659(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 97
		return (var0 + var2) / var1 - var2; // L: 98
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lqx;ILcj;II)V",
		garbageValue = "1288077313"
	)
	static final void method3660(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class204.field2354.field2358; // L: 455
		if ((var3 & 8192) != 0) { // L: 456
			var2.field1196 = var0.method8701(); // L: 457
			var2.field1185 = var0.readByte(); // L: 458
			var2.field1230 = var0.method8701(); // L: 459
			var2.field1213 = var0.method8584(); // L: 460
			var2.field1233 = var0.method8530() + Client.cycle; // L: 461
			var2.field1234 = var0.method8591() + Client.cycle; // L: 462
			var2.field1235 = var0.readUnsignedShort(); // L: 463
			if (var2.field1133) { // L: 464
				var2.field1196 += var2.tileX; // L: 465
				var2.field1185 += var2.tileY; // L: 466
				var2.field1230 += var2.tileX; // L: 467
				var2.field1213 += var2.tileY; // L: 468
				var2.pathLength = 0; // L: 469
			} else {
				var2.field1196 += var2.pathX[0]; // L: 472
				var2.field1185 += var2.pathY[0]; // L: 473
				var2.field1230 += var2.pathX[0]; // L: 474
				var2.field1213 += var2.pathY[0]; // L: 475
				var2.pathLength = 1; // L: 476
			}

			var2.field1252 = 0; // L: 478
		}

		if ((var3 & 32) != 0) { // L: 480
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 481
			if (var2.overheadText.charAt(0) == '~') { // L: 482
				var2.overheadText = var2.overheadText.substring(1); // L: 483
				KitDefinition.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 484
			} else if (var2 == class155.localPlayer) { // L: 486
				KitDefinition.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 487
			}

			var2.isAutoChatting = false; // L: 489
			var2.field1202 = 0; // L: 490
			var2.field1229 = 0; // L: 491
			var2.field1248 = 150; // L: 492
		}

		int var5;
		if ((var3 & 4096) != 0) { // L: 494
			var2.spotAnimation = var0.readUnsignedShort(); // L: 495
			var5 = var0.method8604(); // L: 496
			var2.spotAnimationHeight = var5 >> 16; // L: 497
			var2.field1227 = (var5 & 65535) + Client.cycle; // L: 498
			var2.spotAnimationFrame = 0; // L: 499
			var2.spotAnimationFrameCycle = 0; // L: 500
			if (var2.field1227 > Client.cycle) { // L: 501
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 502
				var2.spotAnimation = -1;
			}
		}

		int var6;
		if ((var3 & 8) != 0) { // L: 504
			var5 = var0.method8591(); // L: 505
			if (var5 == 65535) { // L: 506
				var5 = -1;
			}

			var6 = var0.readUnsignedByte(); // L: 507
			class262.performPlayerAnimation(var2, var5, var6); // L: 508
		}

		if ((var3 & 256) != 0) { // L: 510
			for (var5 = 0; var5 < 3; ++var5) { // L: 511
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 16) != 0) { // L: 513
			var2.targetIndex = var0.method8592(); // L: 515
			if (class200.field2314) { // L: 516
				var2.targetIndex += var0.readUnsignedByte() << 16; // L: 517
				var5 = 16777215; // L: 518
			} else {
				var5 = 65535; // L: 521
			}

			if (var2.targetIndex == var5) { // L: 523
				var2.targetIndex = -1; // L: 524
			}
		}

		if ((var3 & 16384) != 0) { // L: 527
			var2.field1238 = Client.cycle + var0.method8591(); // L: 528
			var2.field1200 = Client.cycle + var0.method8530(); // L: 529
			var2.field1240 = var0.method8718(); // L: 530
			var2.field1220 = var0.method8718(); // L: 531
			var2.field1232 = var0.readByte(); // L: 532
			var2.field1243 = (byte)var0.method8581(); // L: 533
		}

		if ((var3 & 128) != 0) { // L: 535
			var2.field1190 = var0.method8592(); // L: 536
			if (var2.pathLength == 0) { // L: 537
				var2.orientation = var2.field1190; // L: 538
				var2.field1190 = -1; // L: 539
			}
		}

		if ((var3 & 4) != 0) { // L: 542
			var5 = var0.method8699(); // L: 543
			byte[] var13 = new byte[var5]; // L: 544
			Buffer var7 = new Buffer(var13); // L: 545
			var0.method8605(var13, 0, var5); // L: 546
			Players.field1372[var1] = var7; // L: 547
			var2.read(var7); // L: 548
		}

		if ((var3 & 1024) != 0) { // L: 550
			var4 = var0.readByte(); // L: 551
		}

		int var8;
		int var9;
		int var12;
		if ((var3 & 2) != 0) { // L: 553
			var5 = var0.method8592(); // L: 554
			PlayerType var19 = (PlayerType)World.findEnumerated(class149.PlayerType_values(), var0.method8699()); // L: 555
			boolean var14 = var0.method8699() == 1; // L: 556
			var8 = var0.method8581(); // L: 557
			var9 = var0.offset; // L: 558
			if (var2.username != null && var2.appearance != null) { // L: 559
				boolean var10 = false; // L: 560
				if (var19.isUser && DefaultsGroup.friendSystem.isIgnored(var2.username)) { // L: 561 562
					var10 = true;
				}

				if (!var10 && Client.field691 == 0 && !var2.isHidden) { // L: 564
					Players.field1382.offset = 0; // L: 565
					var0.method8605(Players.field1382.array, 0, var8); // L: 566
					Players.field1382.offset = 0; // L: 567
					String var11 = AbstractFont.escapeBrackets(VarbitComposition.method3779(class153.method3285(Players.field1382))); // L: 568
					var2.overheadText = var11.trim(); // L: 569
					var2.field1202 = var5 >> 8; // L: 570
					var2.field1229 = var5 & 255; // L: 571
					var2.field1248 = 150; // L: 572
					var2.isAutoChatting = var14; // L: 573
					var2.field1187 = var2 != class155.localPlayer && var19.isUser && "" != Client.field744 && var11.toLowerCase().indexOf(Client.field744) == -1; // L: 574
					if (var19.isPrivileged) { // L: 576
						var12 = var14 ? 91 : 1;
					} else {
						var12 = var14 ? 90 : 2; // L: 577
					}

					if (var19.modIcon != -1) { // L: 578
						KitDefinition.addGameMessage(var12, class456.method8410(var19.modIcon) + var2.username.getName(), var11);
					} else {
						KitDefinition.addGameMessage(var12, var2.username.getName(), var11); // L: 579
					}
				}
			}

			var0.offset = var9 + var8; // L: 582
		}

		if ((var3 & 1) != 0) { // L: 584
			var5 = var0.readUnsignedByte(); // L: 585
			int var16;
			int var18;
			int var21;
			if (var5 > 0) { // L: 586
				for (var6 = 0; var6 < var5; ++var6) { // L: 587
					var8 = -1; // L: 589
					var9 = -1; // L: 590
					var18 = -1; // L: 591
					var21 = var0.readUShortSmart(); // L: 592
					if (var21 == 32767) { // L: 593
						var21 = var0.readUShortSmart(); // L: 594
						var9 = var0.readUShortSmart(); // L: 595
						var8 = var0.readUShortSmart(); // L: 596
						var18 = var0.readUShortSmart(); // L: 597
					} else if (var21 != 32766) { // L: 599
						var9 = var0.readUShortSmart(); // L: 600
					} else {
						var21 = -1; // L: 602
					}

					var16 = var0.readUShortSmart(); // L: 603
					var2.addHitSplat(var21, var9, var8, var18, Client.cycle, var16); // L: 604
				}
			}

			var6 = var0.method8699(); // L: 607
			if (var6 > 0) { // L: 608
				for (var21 = 0; var21 < var6; ++var21) { // L: 609
					var8 = var0.readUShortSmart(); // L: 610
					var9 = var0.readUShortSmart(); // L: 611
					if (var9 != 32767) { // L: 612
						var18 = var0.readUShortSmart(); // L: 613
						var16 = var0.method8581(); // L: 614
						var12 = var9 > 0 ? var0.readUnsignedByte() : var16; // L: 615
						var2.addHealthBar(var8, Client.cycle, var9, var18, var16, var12); // L: 616
					} else {
						var2.removeHealthBar(var8); // L: 618
					}
				}
			}
		}

		if ((var3 & 2048) != 0) { // L: 622
			class204[] var15 = Players.field1379; // L: 623
			class204[] var17 = new class204[]{class204.field2356, class204.field2354, class204.field2357, class204.field2355}; // L: 627
			var15[var1] = (class204)World.findEnumerated(var17, var0.readByte()); // L: 629
		}

		if (var2.field1133) { // L: 631
			if (var4 == 127) { // L: 632
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class204 var22;
				if (var4 != class204.field2354.field2358) { // L: 635
					class204[] var20 = new class204[]{class204.field2356, class204.field2354, class204.field2357, class204.field2355}; // L: 638
					var22 = (class204)World.findEnumerated(var20, var4); // L: 640
				} else {
					var22 = Players.field1379[var1]; // L: 642
				}

				var2.method2298(var2.tileX, var2.tileY, var22); // L: 643
			}
		}

	} // L: 647

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-784516572"
	)
	public static void method3658() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 171
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 172
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 173
	} // L: 174

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1959220052"
	)
	public static void method3653() {
		Widget.Widget_cachedSprites.clear(); // L: 786
		Widget.Widget_cachedModels.clear(); // L: 787
		Widget.Widget_cachedFonts.clear(); // L: 788
		Widget.Widget_cachedSpriteMasks.clear(); // L: 789
	} // L: 790
}
