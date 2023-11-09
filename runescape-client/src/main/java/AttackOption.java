import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("AttackOption")
public enum AttackOption implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1341(2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	field1343(4);

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1240232435
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12908
	} // L: 12909

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12913
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "14"
	)
	public static final synchronized long method2714() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class301.field3374) { // L: 15
			SecureRandomCallable.field1034 += class301.field3374 - var0; // L: 16
		}

		class301.field3374 = var0; // L: 18
		return var0 + SecureRandomCallable.field1034; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;IZI)Lfw;",
		garbageValue = "-586850942"
	)
	public static class138 method2720(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 32
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535); // L: 33
		if (var5 == null) { // L: 34
			var4 = false; // L: 35
			return null; // L: 36
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255; // L: 38
			byte[] var7;
			if (var3) { // L: 40
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0); // L: 41
			}

			if (var7 == null) { // L: 42
				var4 = false;
			}

			if (!var4) { // L: 43
				return null;
			} else {
				if (class421.field4590 == null) { // L: 44
					class499.field5027 = Runtime.getRuntime().availableProcessors(); // L: 45
					class421.field4590 = new ThreadPoolExecutor(0, class499.field5027, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class499.field5027 * 100 + 100), new class135()); // L: 46
				}

				try {
					return new class138(var0, var1, var2, var3); // L: 54
				} catch (Exception var9) { // L: 56
					return null; // L: 57
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltf;ILdh;II)V",
		garbageValue = "53248931"
	)
	static final void method2721(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class217.field2393.field2394; // L: 455
		if ((var3 & 512) != 0) { // L: 456
			Players.field1363[var1] = (class217)class93.findEnumerated(class138.method3165(), var0.method9121()); // L: 457
		}

		int var5;
		if ((var3 & 32) != 0) { // L: 459
			var2.targetIndex = var0.method9101(); // L: 461
			var2.targetIndex += var0.readUnsignedByte() << 16; // L: 462
			var5 = 16777215; // L: 463
			if (var2.targetIndex == var5) { // L: 464
				var2.targetIndex = -1; // L: 465
			}
		}

		int var6;
		if ((var3 & 2) != 0) { // L: 468
			var5 = var0.method9099(); // L: 469
			if (var5 == 65535) { // L: 470
				var5 = -1;
			}

			var6 = var0.method9226(); // L: 471
			SoundCache.performPlayerAnimation(var2, var5, var6); // L: 472
		}

		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) { // L: 474
			var5 = var0.readUnsignedShort(); // L: 475
			PlayerType var16 = (PlayerType)class93.findEnumerated(class218.PlayerType_values(), var0.method9130()); // L: 476
			boolean var7 = var0.readUnsignedByte() == 1; // L: 477
			var8 = var0.method9258(); // L: 478
			var9 = var0.offset; // L: 479
			if (var2.username != null && var2.appearance != null) { // L: 480
				boolean var10 = false; // L: 481
				if (var16.isUser && class162.friendSystem.isIgnored(var2.username)) { // L: 482 483
					var10 = true;
				}

				if (!var10 && Client.field727 == 0 && !var2.isHidden) { // L: 485
					Players.field1370.offset = 0; // L: 486
					var0.method9245(Players.field1370.array, 0, var8); // L: 487
					Players.field1370.offset = 0; // L: 488
					String var11 = AbstractFont.escapeBrackets(class350.method6677(Friend.method7887(Players.field1370))); // L: 489
					var2.overheadText = var11.trim(); // L: 490
					var2.field1198 = var5 >> 8; // L: 491
					var2.field1203 = var5 & 255; // L: 492
					var2.overheadTextCyclesRemaining = 150; // L: 493
					var2.field1204 = null; // L: 494
					var2.field1199 = var7; // L: 495
					var2.field1200 = var2 != class27.localPlayer && var16.isUser && !Client.field730.isEmpty() && var11.toLowerCase().indexOf(Client.field730) == -1; // L: 496
					if (var16.isPrivileged) { // L: 498
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2; // L: 499
					}

					if (var16.modIcon != -1) { // L: 500
						ReflectionCheck.addGameMessage(var12, class59.method1170(var16.modIcon) + var2.username.getName(), var11);
					} else {
						ReflectionCheck.addGameMessage(var12, var2.username.getName(), var11); // L: 501
					}
				}
			}

			var0.offset = var8 + var9; // L: 504
		}

		if ((var3 & 8192) != 0) { // L: 506
			for (var5 = 0; var5 < 3; ++var5) { // L: 507
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 4096) != 0) { // L: 509
			var2.field1229 = var0.method9059(); // L: 510
			var2.field1231 = var0.method9121(); // L: 511
			var2.field1230 = var0.method9121(); // L: 512
			var2.field1232 = var0.method9059(); // L: 513
			var2.spotAnimation = var0.method9100() + Client.cycle; // L: 514
			var2.field1234 = var0.method9101() + Client.cycle; // L: 515
			var2.field1235 = var0.method9101(); // L: 516
			if (var2.field1138) { // L: 517
				var2.field1229 += var2.tileX; // L: 518
				var2.field1231 += var2.tileY; // L: 519
				var2.field1230 += var2.tileX; // L: 520
				var2.field1232 += var2.tileY; // L: 521
				var2.pathLength = 0; // L: 522
			} else {
				var2.field1229 += var2.pathX[0]; // L: 525
				var2.field1231 += var2.pathY[0]; // L: 526
				var2.field1230 += var2.pathX[0]; // L: 527
				var2.field1232 += var2.pathY[0]; // L: 528
				var2.pathLength = 1; // L: 529
			}

			var2.field1252 = 0; // L: 531
		}

		if ((var3 & 64) != 0) { // L: 533
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 534
			if (var2.overheadText.charAt(0) == '~') { // L: 535
				var2.overheadText = var2.overheadText.substring(1); // L: 536
				ReflectionCheck.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 537
			} else if (var2 == class27.localPlayer) { // L: 539
				ReflectionCheck.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 540
			}

			var2.field1199 = false; // L: 542
			var2.field1198 = 0; // L: 543
			var2.field1203 = 0; // L: 544
			var2.overheadTextCyclesRemaining = 150; // L: 545
		}

		if ((var3 & 32768) != 0) { // L: 547
			var4 = var0.method9059(); // L: 548
		}

		int var18;
		int var21;
		int var23;
		if ((var3 & 2048) != 0) { // L: 550
			var5 = var0.method9101(); // L: 551
			var6 = var5 >> 8; // L: 552
			var21 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0; // L: 553
			PlayerType var17 = (PlayerType)class93.findEnumerated(class218.PlayerType_values(), var0.method9226()); // L: 554
			boolean var22 = var0.method9226() == 1; // L: 555
			var23 = var0.method9226(); // L: 556
			var18 = var0.offset; // L: 557
			if (var2.username != null && var2.appearance != null) { // L: 558
				boolean var24 = false; // L: 559
				if (var17.isUser && class162.friendSystem.isIgnored(var2.username)) { // L: 560 561
					var24 = true;
				}

				if (!var24 && Client.field727 == 0 && !var2.isHidden) { // L: 563
					Players.field1370.offset = 0; // L: 564
					var0.method9090(Players.field1370.array, 0, var23); // L: 565
					Players.field1370.offset = 0; // L: 566
					String var13 = AbstractFont.escapeBrackets(class350.method6677(Friend.method7887(Players.field1370))); // L: 567
					var2.overheadText = var13.trim(); // L: 568
					var2.field1198 = var5 >> 8; // L: 569
					var2.field1203 = var5 & 255; // L: 570
					var2.overheadTextCyclesRemaining = 150; // L: 571
					byte[] var14 = null; // L: 572
					int var15;
					if (var21 > 0 && var21 <= 8) { // L: 573
						var14 = new byte[var21]; // L: 574

						for (var15 = 0; var15 < var21; ++var15) { // L: 575
							var14[var15] = var0.method9094(); // L: 576
						}
					}

					var2.field1204 = ObjectComposition.method4039(var14); // L: 579
					var2.field1199 = var22; // L: 580
					var2.field1200 = var2 != class27.localPlayer && var17.isUser && !Client.field730.isEmpty() && var13.toLowerCase().indexOf(Client.field730) == -1; // L: 581
					if (var17.isPrivileged) { // L: 583
						var15 = var22 ? 91 : 1;
					} else {
						var15 = var22 ? 90 : 2; // L: 584
					}

					if (var17.modIcon != -1) { // L: 585
						ReflectionCheck.addGameMessage(var15, class59.method1170(var17.modIcon) + var2.username.getName(), var13);
					} else {
						ReflectionCheck.addGameMessage(var15, var2.username.getName(), var13); // L: 586
					}
				}
			}

			var0.offset = var23 + var18 + var21; // L: 589
		}

		if ((var3 & 65536) != 0) { // L: 591
			var5 = var0.method9226(); // L: 592

			for (var6 = 0; var6 < var5; ++var6) { // L: 593
				var21 = var0.method9258(); // L: 594
				var8 = var0.readUnsignedShort(); // L: 595
				var9 = var0.method9113(); // L: 596
				var2.method2428(var21, var8, var9 >> 16, var9 & 65535); // L: 597
			}
		}

		if ((var3 & 8) != 0) { // L: 600
			var5 = var0.method9226(); // L: 601
			if (var5 > 0) { // L: 602
				for (var6 = 0; var6 < var5; ++var6) { // L: 603
					var8 = -1; // L: 605
					var9 = -1; // L: 606
					var23 = -1; // L: 607
					var21 = var0.readUShortSmart(); // L: 608
					if (var21 == 32767) { // L: 609
						var21 = var0.readUShortSmart(); // L: 610
						var9 = var0.readUShortSmart(); // L: 611
						var8 = var0.readUShortSmart(); // L: 612
						var23 = var0.readUShortSmart(); // L: 613
					} else if (var21 != 32766) { // L: 615
						var9 = var0.readUShortSmart(); // L: 616
					} else {
						var21 = -1; // L: 618
					}

					var18 = var0.readUShortSmart(); // L: 619
					var2.addHitSplat(var21, var9, var8, var23, Client.cycle, var18); // L: 620
				}
			}

			var6 = var0.method9130(); // L: 623
			if (var6 > 0) { // L: 624
				for (var21 = 0; var21 < var6; ++var21) { // L: 625
					var8 = var0.readUShortSmart(); // L: 626
					var9 = var0.readUShortSmart(); // L: 627
					if (var9 != 32767) { // L: 628
						var23 = var0.readUShortSmart(); // L: 629
						var18 = var0.readUnsignedByte(); // L: 630
						var12 = var9 > 0 ? var0.method9130() : var18; // L: 631
						var2.addHealthBar(var8, Client.cycle, var9, var23, var18, var12); // L: 632
					} else {
						var2.removeHealthBar(var8); // L: 634
					}
				}
			}
		}

		if ((var3 & 128) != 0) { // L: 638
			var2.field1218 = var0.method9100(); // L: 639
			if (var2.pathLength == 0) { // L: 640
				var2.orientation = var2.field1218; // L: 641
				var2.method2424(); // L: 642
			}
		}

		if ((var3 & 256) != 0) { // L: 645
			var2.field1183 = Client.cycle + var0.readUnsignedShort(); // L: 646
			var2.field1189 = Client.cycle + var0.method9101(); // L: 647
			var2.field1240 = var0.method9059(); // L: 648
			var2.field1247 = var0.method9094(); // L: 649
			var2.field1190 = var0.readByte(); // L: 650
			var2.field1243 = (byte)var0.readUnsignedByte(); // L: 651
		}

		if ((var3 & 1) != 0) { // L: 653
			var5 = var0.readUnsignedByte(); // L: 654
			byte[] var25 = new byte[var5]; // L: 655
			Buffer var19 = new Buffer(var25); // L: 656
			var0.method9090(var25, 0, var5); // L: 657
			Players.field1364[var1] = var19; // L: 658
			var2.read(var19); // L: 659
		}

		if (var2.field1138) { // L: 661
			if (var4 == 127) { // L: 662
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class217 var20;
				if (var4 != class217.field2393.field2394) { // L: 665
					var20 = (class217)class93.findEnumerated(class138.method3165(), var4);
				} else {
					var20 = Players.field1363[var1]; // L: 666
				}

				var2.method2358(var2.tileX, var2.tileY, var20); // L: 667
			}
		}

	} // L: 671

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "880542346"
	)
	static void method2723(int var0) {
		if (var0 != Client.gameState) { // L: 1356
			if (Client.gameState == 30) { // L: 1357
				Client.field734.method4226(); // L: 1358
			}

			if (Client.gameState == 0) { // L: 1360
				class415.client.method537();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1361
				class126.method3006(0); // L: 1362
				Client.field535 = 0; // L: 1363
				Client.field531 = 0; // L: 1364
				Client.timer.method7707(var0); // L: 1365
				if (var0 != 20) { // L: 1366
					class159.method3385(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Interpreter.field863 != null) { // L: 1368 1369
				Interpreter.field863.close(); // L: 1370
				Interpreter.field863 = null; // L: 1371
			}

			if (Client.gameState == 25) { // L: 1374
				Client.field570 = 0; // L: 1375
				Client.field566 = 0; // L: 1376
				Client.field511 = 1; // L: 1377
				Client.field568 = 0; // L: 1378
				Client.field569 = 1; // L: 1379
			}

			int var2;
			if (var0 != 5 && var0 != 10) { // L: 1381
				if (var0 == 20) { // L: 1385
					var2 = Client.gameState == 11 ? 4 : 0; // L: 1386
					class292.method5740(class9.field38, Nameable.field4637, false, var2); // L: 1387
				} else if (var0 == 11) { // L: 1389
					class292.method5740(class9.field38, Nameable.field4637, false, 4); // L: 1390
				} else if (var0 == 50) { // L: 1392
					class156.setLoginResponseString("", "Updating date of birth...", ""); // L: 1393
					class292.method5740(class9.field38, Nameable.field4637, false, 7); // L: 1394
				} else if (Login.clearLoginScreen) { // L: 1397
					Login.titleboxSprite = null; // L: 1398
					class308.field3453 = null; // L: 1399
					Login.field915 = null; // L: 1400
					class372.leftTitleSprite = null; // L: 1401
					class391.rightTitleSprite = null; // L: 1402
					Login.logoSprite = null; // L: 1403
					Message.title_muteSprite = null; // L: 1404
					FloorUnderlayDefinition.field2095 = null; // L: 1405
					MenuAction.field907 = null; // L: 1406
					SpotAnimationDefinition.worldSelectBackSprites = null; // L: 1407
					class170.worldSelectFlagSprites = null; // L: 1408
					worldSelectArrows = null; // L: 1409
					class295.worldSelectStars = null; // L: 1410
					class485.field4965 = null; // L: 1411
					ModelData0.loginScreenRunesAnimation.method2487(); // L: 1412
					class90.method2339(0, 100); // L: 1413
					class359 var1 = class101.field1332; // L: 1416
					var1.method6861(true); // L: 1418
					Login.clearLoginScreen = false; // L: 1419
				}
			} else {
				var2 = class338.method6631() ? 0 : 12; // L: 1382
				class292.method5740(class9.field38, Nameable.field4637, true, var2); // L: 1383
			}

			Client.gameState = var0; // L: 1421
		}
	} // L: 1422
}
