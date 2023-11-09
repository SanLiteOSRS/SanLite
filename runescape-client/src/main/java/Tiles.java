import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("h")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("e")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1062908513
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("x")
	static short[][][] field1028;
	@ObfuscatedName("q")
	static byte[][][] field1033;
	@ObfuscatedName("u")
	static int[][] field1030;
	@ObfuscatedName("b")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("g")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("l")
	static final int[] field1032;
	@ObfuscatedName("t")
	static final int[] field1036;
	@ObfuscatedName("c")
	static final int[] field1035;
	@ObfuscatedName("p")
	static final int[] field1029;
	@ObfuscatedName("d")
	static final int[] field1037;
	@ObfuscatedName("y")
	static final int[] field1025;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 559364671
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -475114795
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105]; // L: 17
		Tiles_renderFlags = new byte[4][104][104]; // L: 18
		Tiles_minPlane = 99; // L: 19
		field1032 = new int[]{1, 2, 4, 8}; // L: 35
		field1036 = new int[]{16, 32, 64, 128}; // L: 36
		field1035 = new int[]{1, 0, -1, 0}; // L: 37
		field1029 = new int[]{0, -1, 0, 1}; // L: 38
		field1037 = new int[]{1, -1, -1, 1}; // L: 39
		field1025 = new int[]{-1, -1, 1, 1}; // L: 40
		rndHue = (int)(Math.random() * 17.0D) - 8; // L: 41
		rndLightness = (int)(Math.random() * 33.0D) - 16; // L: 42
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Z",
		garbageValue = "-120"
	)
	static final boolean method2214(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 241
		Buffer var4 = new Buffer(var0); // L: 242
		int var5 = -1; // L: 243

		label68:
		while (true) {
			int var6 = var4.method8732(); // L: 245
			if (var6 == 0) { // L: 246
				return var3; // L: 277
			}

			var5 += var6; // L: 247
			int var7 = 0; // L: 248
			boolean var8 = false; // L: 249

			while (true) {
				int var9;
				while (!var8) { // L: 251
					var9 = var4.readUShortSmart(); // L: 257
					if (var9 == 0) { // L: 258
						continue label68;
					}

					var7 += var9 - 1; // L: 259
					int var10 = var7 & 63; // L: 260
					int var11 = var7 >> 6 & 63; // L: 261
					int var12 = var4.readUnsignedByte() >> 2; // L: 262
					int var13 = var11 + var1; // L: 263
					int var14 = var10 + var2; // L: 264
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 265
						ObjectComposition var15 = VarpDefinition.getObjectDefinition(var5); // L: 266
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 267
							if (!var15.needsModelFiles()) { // L: 268
								++Client.field786; // L: 269
								var3 = false; // L: 270
							}

							var8 = true; // L: 272
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 252
				if (var9 == 0) { // L: 253
					break;
				}

				var4.readUnsignedByte(); // L: 254
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILhc;[Lgw;)V"
	)
	static final void method2154(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 313
		int var11 = -1; // L: 314

		while (true) {
			int var12 = var10.method8732(); // L: 316
			if (var12 == 0) { // L: 317
				return; // L: 372
			}

			var11 += var12; // L: 318
			int var13 = 0; // L: 319

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 321
				if (var14 == 0) { // L: 322
					break;
				}

				var13 += var14 - 1; // L: 323
				int var15 = var13 & 63; // L: 324
				int var16 = var13 >> 6 & 63; // L: 325
				int var17 = var13 >> 12; // L: 326
				int var18 = var10.readUnsignedByte(); // L: 327
				int var19 = var18 >> 2; // L: 328
				int var20 = var18 & 3; // L: 329
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 330
					ObjectComposition var21 = VarpDefinition.getObjectDefinition(var11); // L: 331
					int var22 = var2 + ItemComposition.method3994(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 332
					int var25 = var16 & 7; // L: 335
					int var26 = var15 & 7; // L: 336
					int var28 = var21.sizeX; // L: 338
					int var29 = var21.sizeY; // L: 339
					int var30;
					if ((var20 & 1) == 1) { // L: 341
						var30 = var28; // L: 342
						var28 = var29; // L: 343
						var29 = var30; // L: 344
					}

					int var27 = var7 & 3; // L: 346
					int var24;
					if (var27 == 0) { // L: 347
						var24 = var26; // L: 348
					} else if (var27 == 1) { // L: 351
						var24 = 7 - var25 - (var28 - 1); // L: 352
					} else if (var27 == 2) { // L: 355
						var24 = 7 - var26 - (var29 - 1); // L: 356
					} else {
						var24 = var25; // L: 359
					}

					var30 = var3 + var24; // L: 361
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) { // L: 362
						int var31 = var1; // L: 363
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) { // L: 364
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 365
						if (var31 >= 0) { // L: 366
							var32 = var9[var31];
						}

						UrlRequester.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 367
					}
				}
			}
		}
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "648133530"
	)
	@Export("load")
	static void load() {
		int var13;
		if (Client.titleLoadingStage == 0) { // L: 1452
			ReflectionCheck.scene = new Scene(4, 104, 104, Tiles_heights); // L: 1453

			for (var13 = 0; var13 < 4; ++var13) { // L: 1454
				Client.collisionMaps[var13] = new CollisionMap(104, 104);
			}

			GameObject.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1455
			Login.Login_loadingText = "Starting game engine..."; // L: 1456
			Login.Login_loadingPercent = 5; // L: 1457
			Client.titleLoadingStage = 20; // L: 1458
		} else if (Client.titleLoadingStage == 20) { // L: 1461
			Login.Login_loadingText = "Prepared visibility map"; // L: 1462
			Login.Login_loadingPercent = 10; // L: 1463
			Client.titleLoadingStage = 30; // L: 1464
		} else if (Client.titleLoadingStage == 30) { // L: 1467
			HealthBar.field1306 = MusicPatchNode.newArchive(0, false, true, true, false); // L: 1468
			class9.archive7 = MusicPatchNode.newArchive(1, false, true, true, false); // L: 1469
			HitSplatDefinition.archive2 = MusicPatchNode.newArchive(2, true, false, true, false); // L: 1470
			FloorUnderlayDefinition.archive4 = MusicPatchNode.newArchive(3, false, true, true, false); // L: 1471
			WorldMapSection0.archive9 = MusicPatchNode.newArchive(4, false, true, true, false); // L: 1472
			class4.field7 = MusicPatchNode.newArchive(5, true, true, true, false); // L: 1473
			class162.archive6 = MusicPatchNode.newArchive(6, true, true, true, false); // L: 1474
			class301.archive11 = MusicPatchNode.newArchive(7, false, true, true, false); // L: 1475
			ClientPreferences.archive8 = MusicPatchNode.newArchive(8, false, true, true, false); // L: 1476
			Frames.archive10 = MusicPatchNode.newArchive(9, false, true, true, false); // L: 1477
			ClanChannelMember.field1666 = MusicPatchNode.newArchive(10, false, true, true, false); // L: 1478
			class21.field123 = MusicPatchNode.newArchive(11, false, true, true, false); // L: 1479
			class71.archive12 = MusicPatchNode.newArchive(12, false, true, true, false); // L: 1480
			class358.archive13 = MusicPatchNode.newArchive(13, true, false, true, false); // L: 1481
			VarpDefinition.archive14 = MusicPatchNode.newArchive(14, false, true, true, false); // L: 1482
			class89.archive15 = MusicPatchNode.newArchive(15, false, true, true, false); // L: 1483
			VerticalAlignment.archive17 = MusicPatchNode.newArchive(17, true, true, true, false); // L: 1484
			class170.archive18 = MusicPatchNode.newArchive(18, false, true, true, false); // L: 1485
			FontName.archive19 = MusicPatchNode.newArchive(19, false, true, true, false); // L: 1486
			WorldMapArea.archive20 = MusicPatchNode.newArchive(20, false, true, true, false); // L: 1487
			Ignored.field4539 = MusicPatchNode.newArchive(21, false, true, true, true); // L: 1488
			Login.Login_loadingText = "Connecting to update server"; // L: 1489
			Login.Login_loadingPercent = 20; // L: 1490
			Client.titleLoadingStage = 40; // L: 1491
		} else if (Client.titleLoadingStage == 40) { // L: 1494
			byte var24 = 0; // L: 1495
			var13 = var24 + HealthBar.field1306.percentage() * 4 / 100; // L: 1496
			var13 += class9.archive7.percentage() * 4 / 100; // L: 1497
			var13 += HitSplatDefinition.archive2.percentage() * 2 / 100; // L: 1498
			var13 += FloorUnderlayDefinition.archive4.percentage() * 2 / 100; // L: 1499
			var13 += WorldMapSection0.archive9.percentage() * 6 / 100; // L: 1500
			var13 += class4.field7.percentage() * 4 / 100; // L: 1501
			var13 += class162.archive6.percentage() * 2 / 100; // L: 1502
			var13 += class301.archive11.percentage() * 55 / 100; // L: 1503
			var13 += ClientPreferences.archive8.percentage() * 2 / 100; // L: 1504
			var13 += Frames.archive10.percentage() * 2 / 100; // L: 1505
			var13 += ClanChannelMember.field1666.percentage() * 2 / 100; // L: 1506
			var13 += class21.field123.percentage() * 2 / 100; // L: 1507
			var13 += class71.archive12.percentage() * 2 / 100; // L: 1508
			var13 += class358.archive13.percentage() * 2 / 100; // L: 1509
			var13 += VarpDefinition.archive14.percentage() * 2 / 100; // L: 1510
			var13 += class89.archive15.percentage() * 2 / 100; // L: 1511
			var13 += FontName.archive19.percentage() / 100; // L: 1512
			var13 += class170.archive18.percentage() / 100; // L: 1513
			var13 += WorldMapArea.archive20.percentage() / 100; // L: 1514
			var13 += Ignored.field4539.percentage() / 100; // L: 1515
			var13 += VerticalAlignment.archive17.method6415() && VerticalAlignment.archive17.isFullyLoaded() ? 1 : 0; // L: 1516
			if (var13 != 100) { // L: 1517
				if (var13 != 0) { // L: 1518
					Login.Login_loadingText = "Checking for updates - " + var13 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1519
			} else {
				class18.method263(HealthBar.field1306, "Animations"); // L: 1522
				class18.method263(class9.archive7, "Skeletons"); // L: 1523
				class18.method263(WorldMapSection0.archive9, "Sound FX"); // L: 1524
				class18.method263(class4.field7, "Maps"); // L: 1525
				class18.method263(class162.archive6, "Music Tracks"); // L: 1526
				class18.method263(class301.archive11, "Models"); // L: 1527
				class18.method263(ClientPreferences.archive8, "Sprites"); // L: 1528
				class18.method263(class21.field123, "Music Jingles"); // L: 1529
				class18.method263(VarpDefinition.archive14, "Music Samples"); // L: 1530
				class18.method263(class89.archive15, "Music Patches"); // L: 1531
				class18.method263(FontName.archive19, "World Map"); // L: 1532
				class18.method263(class170.archive18, "World Map Geography"); // L: 1533
				class18.method263(WorldMapArea.archive20, "World Map Ground"); // L: 1534
				UserComparator5.spriteIds = new GraphicsDefaults(); // L: 1535
				UserComparator5.spriteIds.decode(VerticalAlignment.archive17); // L: 1536
				Login.Login_loadingText = "Loaded update list"; // L: 1537
				Login.Login_loadingPercent = 30; // L: 1538
				Client.titleLoadingStage = 45; // L: 1539
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1542
			boolean var23 = !Client.isLowDetail; // L: 1543
			PcmPlayer.field325 = 486202500; // L: 1546
			class286.PcmPlayer_stereo = var23; // L: 1547
			class34.field205 = 2; // L: 1548
			MidiPcmStream var21 = new MidiPcmStream(); // L: 1550
			var21.method5572(9, 128); // L: 1551
			TileItem.pcmPlayer0 = ScriptFrame.method1168(class242.taskHandler, 0, 22050); // L: 1552
			TileItem.pcmPlayer0.setStream(var21); // L: 1553
			WorldMapDecoration.method5269(class89.archive15, VarpDefinition.archive14, WorldMapSection0.archive9, var21); // L: 1554
			UserComparator8.pcmPlayer1 = ScriptFrame.method1168(class242.taskHandler, 1, 2048); // L: 1555
			ApproximateRouteStrategy.pcmStreamMixer = new PcmStreamMixer(); // L: 1556
			UserComparator8.pcmPlayer1.setStream(ApproximateRouteStrategy.pcmStreamMixer); // L: 1557
			DevicePcmPlayerProvider.decimator = new Decimator(22050, PcmPlayer.field325 * 22050); // L: 1558
			Login.Login_loadingText = "Prepared sound engine"; // L: 1559
			Login.Login_loadingPercent = 35; // L: 1560
			Client.titleLoadingStage = 50; // L: 1561
			MouseRecorder.WorldMapElement_fonts = new Fonts(ClientPreferences.archive8, class358.archive13); // L: 1562
		} else if (Client.titleLoadingStage == 50) { // L: 1565
			var13 = FontName.method8203().length; // L: 1566
			Client.fontsMap = MouseRecorder.WorldMapElement_fonts.createMap(FontName.method8203()); // L: 1567
			if (Client.fontsMap.size() < var13) { // L: 1568
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var13 + "%"; // L: 1569
				Login.Login_loadingPercent = 40; // L: 1570
			} else {
				class151.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1573
				AbstractWorldMapData.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1574
				class146.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1575
				class213.platformInfo = Client.platformInfoProvider.get(); // L: 1576
				Login.Login_loadingText = "Loaded fonts"; // L: 1577
				Login.Login_loadingPercent = 40; // L: 1578
				Client.titleLoadingStage = 60; // L: 1579
			}
		} else {
			int var3;
			Archive var15;
			if (Client.titleLoadingStage == 60) { // L: 1582
				var13 = class134.method3051(ClanChannelMember.field1666, ClientPreferences.archive8); // L: 1583
				var15 = ClientPreferences.archive8; // L: 1585
				var3 = Login.field932.length + Login.field934.length; // L: 1587
				String[] var22 = Login.field953; // L: 1589

				for (int var18 = 0; var18 < var22.length; ++var18) { // L: 1590
					String var20 = var22[var18]; // L: 1591
					if (var15.getGroupId(var20) != -1) { // L: 1593
						++var3; // L: 1594
					}
				}

				if (var13 < var3) { // L: 1602
					Login.Login_loadingText = "Loading title screen - " + var13 * 100 / var3 + "%"; // L: 1603
					Login.Login_loadingPercent = 50; // L: 1604
				} else {
					Login.Login_loadingText = "Loaded title screen"; // L: 1607
					Login.Login_loadingPercent = 50; // L: 1608
					class140.method3102(5); // L: 1609
					Client.titleLoadingStage = 70; // L: 1610
				}
			} else if (Client.titleLoadingStage == 70) { // L: 1613
				if (!HitSplatDefinition.archive2.isFullyLoaded()) { // L: 1614
					Login.Login_loadingText = "Loading config - " + HitSplatDefinition.archive2.loadPercent() + "%"; // L: 1615
					Login.Login_loadingPercent = 60; // L: 1616
				} else if (!Ignored.field4539.isFullyLoaded()) { // L: 1619
					Login.Login_loadingText = "Loading config - " + (80 + class71.archive12.loadPercent() / 6) + "%"; // L: 1620
					Login.Login_loadingPercent = 60; // L: 1621
				} else {
					Archive var19 = HitSplatDefinition.archive2; // L: 1624
					FloorOverlayDefinition.FloorOverlayDefinition_archive = var19; // L: 1626
					class140.method3098(HitSplatDefinition.archive2); // L: 1628
					Archive var14 = HitSplatDefinition.archive2; // L: 1629
					var15 = class301.archive11; // L: 1630
					KitDefinition.KitDefinition_archive = var14; // L: 1632
					KitDefinition.KitDefinition_modelsArchive = var15; // L: 1633
					class71.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1634
					UrlRequester.method2770(HitSplatDefinition.archive2, class301.archive11, Client.isLowDetail); // L: 1636
					PacketWriter.method2741(HitSplatDefinition.archive2, class301.archive11, Client.field515 <= 209, UserComparator5.spriteIds.field4585); // L: 1637
					Archive var16 = HitSplatDefinition.archive2; // L: 1638
					StructComposition.StructDefinition_archive = var16; // L: 1640
					class346.method6684(HitSplatDefinition.archive2, class301.archive11, Client.isMembersWorld, class151.fontPlain11); // L: 1642
					WorldMapIcon_1.method4881(HitSplatDefinition.archive2, HealthBar.field1306, class9.archive7); // L: 1643
					WorldMapSectionType.method5233(HitSplatDefinition.archive2, class301.archive11); // L: 1644
					class182.method3627(HitSplatDefinition.archive2); // L: 1645
					Archive var17 = HitSplatDefinition.archive2; // L: 1646
					VarpDefinition.VarpDefinition_archive = var17; // L: 1648
					VarpDefinition.field1922 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1649
					SequenceDefinition.method4063(FloorUnderlayDefinition.archive4, class301.archive11, ClientPreferences.archive8, class358.archive13); // L: 1651
					Messages.method2719(HitSplatDefinition.archive2); // L: 1652
					WorldMapIcon_1.method4880(HitSplatDefinition.archive2); // L: 1653
					Archive var5 = HitSplatDefinition.archive2; // L: 1654
					VarcInt.VarcInt_archive = var5; // L: 1656
					class151.method3273(HitSplatDefinition.archive2); // L: 1658
					HealthBar.method2528(HitSplatDefinition.archive2); // L: 1659
					Ignored.method7606(HitSplatDefinition.archive2); // L: 1660
					class458.method8425(HitSplatDefinition.archive2); // L: 1661
					class137.HitSplatDefinition_cachedSprites = new class451(LoginPacket.field3302, 54, class173.clientLanguage, HitSplatDefinition.archive2); // L: 1662
					class34.Ignored_cached = new class451(LoginPacket.field3302, 47, class173.clientLanguage, HitSplatDefinition.archive2); // L: 1663
					WorldMapArea.varcs = new Varcs(); // L: 1664
					Archive var6 = HitSplatDefinition.archive2; // L: 1665
					Archive var7 = ClientPreferences.archive8; // L: 1666
					Archive var8 = class358.archive13; // L: 1667
					class18.HitSplatDefinition_archive = var6; // L: 1669
					HitSplatDefinition.field2135 = var7; // L: 1670
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var8; // L: 1671
					class126.method2985(HitSplatDefinition.archive2, ClientPreferences.archive8); // L: 1673
					Archive var9 = HitSplatDefinition.archive2; // L: 1674
					Archive var10 = ClientPreferences.archive8; // L: 1675
					WorldMapElement.WorldMapElement_archive = var10; // L: 1677
					if (var9.isFullyLoaded()) { // L: 1678
						WorldMapElement.WorldMapElement_count = var9.getGroupFileCount(35); // L: 1681
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1682

						for (int var11 = 0; var11 < WorldMapElement.WorldMapElement_count; ++var11) { // L: 1683
							byte[] var12 = var9.takeFile(35, var11); // L: 1684
							WorldMapElement.WorldMapElement_cached[var11] = new WorldMapElement(var11); // L: 1685
							if (var12 != null) { // L: 1686
								WorldMapElement.WorldMapElement_cached[var11].decode(new Buffer(var12)); // L: 1687
								WorldMapElement.WorldMapElement_cached[var11].method3554(); // L: 1688
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 1692
					Login.Login_loadingPercent = 60; // L: 1693
					Client.titleLoadingStage = 80; // L: 1694
				}
			} else if (Client.titleLoadingStage == 80) { // L: 1697
				var13 = 0; // L: 1698
				if (class201.compass == null) { // L: 1699
					class201.compass = class125.SpriteBuffer_getSprite(ClientPreferences.archive8, UserComparator5.spriteIds.compass, 0);
				} else {
					++var13; // L: 1700
				}

				if (class139.redHintArrowSprite == null) { // L: 1701
					class139.redHintArrowSprite = class125.SpriteBuffer_getSprite(ClientPreferences.archive8, UserComparator5.spriteIds.field4588, 0);
				} else {
					++var13; // L: 1702
				}

				if (class32.mapSceneSprites == null) { // L: 1703
					class32.mapSceneSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.mapScenes, 0);
				} else {
					++var13; // L: 1704
				}

				if (World.headIconPkSprites == null) { // L: 1705
					World.headIconPkSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.headIconsPk, 0);
				} else {
					++var13; // L: 1706
				}

				if (class410.headIconPrayerSprites == null) { // L: 1707
					class410.headIconPrayerSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4585, 0);
				} else {
					++var13; // L: 1708
				}

				if (class358.headIconHintSprites == null) { // L: 1709
					class358.headIconHintSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4587, 0);
				} else {
					++var13; // L: 1710
				}

				if (class144.mapMarkerSprites == null) { // L: 1711
					class144.mapMarkerSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4591, 0);
				} else {
					++var13; // L: 1712
				}

				if (MouseHandler.crossSprites == null) { // L: 1713
					MouseHandler.crossSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4589, 0);
				} else {
					++var13; // L: 1714
				}

				if (class281.mapDotSprites == null) { // L: 1715
					class281.mapDotSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4590, 0);
				} else {
					++var13; // L: 1716
				}

				if (class89.scrollBarSprites == null) { // L: 1717
					class89.scrollBarSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.field4586, 0);
				} else {
					++var13; // L: 1718
				}

				if (Coord.modIconSprites == null) { // L: 1719
					Coord.modIconSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.field4592, 0);
				} else {
					++var13; // L: 1720
				}

				if (var13 < 11) { // L: 1721
					Login.Login_loadingText = "Loading sprites - " + var13 * 100 / 12 + "%"; // L: 1722
					Login.Login_loadingPercent = 70; // L: 1723
				} else {
					AbstractFont.AbstractFont_modIconSprites = Coord.modIconSprites; // L: 1726
					class139.redHintArrowSprite.normalize(); // L: 1727
					int var1 = (int)(Math.random() * 21.0D) - 10; // L: 1728
					int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1729
					var3 = (int)(Math.random() * 21.0D) - 10; // L: 1730
					int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1731
					class32.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3); // L: 1732
					Login.Login_loadingText = "Loaded sprites"; // L: 1733
					Login.Login_loadingPercent = 70; // L: 1734
					Client.titleLoadingStage = 90; // L: 1735
				}
			} else if (Client.titleLoadingStage == 90) { // L: 1738
				if (!Frames.archive10.isFullyLoaded()) { // L: 1739
					Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1740
					Login.Login_loadingPercent = 90; // L: 1741
				} else {
					Skeleton.textureProvider = new TextureProvider(Frames.archive10, ClientPreferences.archive8, 20, StructComposition.clientPreferences.method2422(), Client.isLowDetail ? 64 : 128); // L: 1744
					Rasterizer3D.Rasterizer3D_setTextureLoader(Skeleton.textureProvider); // L: 1745
					Rasterizer3D.Rasterizer3D_setBrightness(StructComposition.clientPreferences.method2422()); // L: 1746
					Client.titleLoadingStage = 100; // L: 1747
				}
			} else if (Client.titleLoadingStage == 100) { // L: 1750
				var13 = Skeleton.textureProvider.getLoadedPercentage(); // L: 1751
				if (var13 < 100) { // L: 1752
					Login.Login_loadingText = "Loading textures - " + var13 + "%"; // L: 1753
					Login.Login_loadingPercent = 90; // L: 1754
				} else {
					Login.Login_loadingText = "Loaded textures"; // L: 1757
					Login.Login_loadingPercent = 90; // L: 1758
					Client.titleLoadingStage = 110; // L: 1759
				}
			} else if (Client.titleLoadingStage == 110) { // L: 1762
				class271.mouseRecorder = new MouseRecorder(); // L: 1763
				class242.taskHandler.newThreadTask(class271.mouseRecorder, 10); // L: 1764
				Login.Login_loadingText = "Loaded input handler"; // L: 1765
				Login.Login_loadingPercent = 92; // L: 1766
				Client.titleLoadingStage = 120; // L: 1767
			} else if (Client.titleLoadingStage == 120) { // L: 1770
				if (!ClanChannelMember.field1666.tryLoadFileByNames("huffman", "")) { // L: 1771
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1772
					Login.Login_loadingPercent = 94; // L: 1773
				} else {
					Huffman var0 = new Huffman(ClanChannelMember.field1666.takeFileByNames("huffman", "")); // L: 1776
					Interpreter.method1960(var0); // L: 1777
					Login.Login_loadingText = "Loaded wordpack"; // L: 1778
					Login.Login_loadingPercent = 94; // L: 1779
					Client.titleLoadingStage = 130; // L: 1780
				}
			} else if (Client.titleLoadingStage == 130) { // L: 1783
				if (!FloorUnderlayDefinition.archive4.isFullyLoaded()) { // L: 1784
					Login.Login_loadingText = "Loading interfaces - " + FloorUnderlayDefinition.archive4.loadPercent() * 4 / 5 + "%"; // L: 1785
					Login.Login_loadingPercent = 96; // L: 1786
				} else if (!class71.archive12.isFullyLoaded()) { // L: 1789
					Login.Login_loadingText = "Loading interfaces - " + (80 + class71.archive12.loadPercent() / 6) + "%"; // L: 1790
					Login.Login_loadingPercent = 96; // L: 1791
				} else if (!class358.archive13.isFullyLoaded()) { // L: 1794
					Login.Login_loadingText = "Loading interfaces - " + (96 + class358.archive13.loadPercent() / 50) + "%"; // L: 1795
					Login.Login_loadingPercent = 96; // L: 1796
				} else {
					Login.Login_loadingText = "Loaded interfaces"; // L: 1799
					Login.Login_loadingPercent = 98; // L: 1800
					Client.titleLoadingStage = 140; // L: 1801
				}
			} else if (Client.titleLoadingStage == 140) { // L: 1804
				Login.Login_loadingPercent = 100; // L: 1805
				if (!FontName.archive19.tryLoadGroupByName(WorldMapCacheName.field3010.name)) { // L: 1806
					Login.Login_loadingText = "Loading world map - " + FontName.archive19.groupLoadPercentByName(WorldMapCacheName.field3010.name) / 10 + "%"; // L: 1807
				} else {
					if (KitDefinition.worldMap == null) { // L: 1810
						KitDefinition.worldMap = new WorldMap(); // L: 1811
						KitDefinition.worldMap.init(FontName.archive19, class170.archive18, WorldMapArea.archive20, class146.fontBold12, Client.fontsMap, class32.mapSceneSprites); // L: 1812
					}

					Login.Login_loadingText = "Loaded world map"; // L: 1814
					Client.titleLoadingStage = 150; // L: 1815
				}
			} else if (Client.titleLoadingStage == 150) { // L: 1818
				class140.method3102(10); // L: 1819
			}
		}
	} // L: 1459 1465 1492 1520 1540 1563 1571 1580 1605 1611 1617 1622 1695 1724 1736 1742 1748 1755 1760 1768 1774 1781 1787 1792 1797 1802 1808 1816 1820 1822
}
