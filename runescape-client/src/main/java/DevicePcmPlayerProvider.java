import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class50 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Archive field117;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 1874484435
	)
	static int field118;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lbu;",
		garbageValue = "1183188913"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIFFFIIIIIIIIIIIIIS)V",
		garbageValue = "16635"
	)
	static void method322(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		Rasterizer3D.field2519.vmethod5007(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21); // L: 180
	} // L: 181

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1827465123"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) { // L: 1464
			class31.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1465

			for (var23 = 0; var23 < 4; ++var23) { // L: 1466
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			UrlRequester.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1467
			Login.Login_loadingText = "Starting game engine..."; // L: 1468
			Login.Login_loadingPercent = 5; // L: 1469
			Client.titleLoadingStage = 20; // L: 1470
		} else if (Client.titleLoadingStage == 20) { // L: 1473
			Login.Login_loadingText = "Prepared visibility map"; // L: 1474
			Login.Login_loadingPercent = 10; // L: 1475
			Client.titleLoadingStage = 30; // L: 1476
		} else if (Client.titleLoadingStage == 30) { // L: 1479
			field117 = WorldMapLabelSize.newArchive(0, false, true, true, false); // L: 1480
			GameBuild.field3803 = WorldMapLabelSize.newArchive(1, false, true, true, false); // L: 1481
			class85.archive2 = WorldMapLabelSize.newArchive(2, true, false, true, false); // L: 1482
			class85.archive7 = WorldMapLabelSize.newArchive(3, false, true, true, false); // L: 1483
			class426.archive4 = WorldMapLabelSize.newArchive(4, false, true, true, false); // L: 1484
			GrandExchangeOfferTotalQuantityComparator.archive9 = WorldMapLabelSize.newArchive(5, true, true, true, false); // L: 1485
			class399.archive6 = WorldMapLabelSize.newArchive(6, true, true, true, false); // L: 1486
			FloorUnderlayDefinition.archive11 = WorldMapLabelSize.newArchive(7, false, true, true, false); // L: 1487
			class452.archive8 = WorldMapLabelSize.newArchive(8, false, true, true, false); // L: 1488
			WorldMapLabelSize.field2868 = WorldMapLabelSize.newArchive(9, false, true, true, false); // L: 1489
			NetFileRequest.archive10 = WorldMapLabelSize.newArchive(10, false, true, true, false); // L: 1490
			class195.field2101 = WorldMapLabelSize.newArchive(11, false, true, true, false); // L: 1491
			class126.archive12 = WorldMapLabelSize.newArchive(12, false, true, true, false); // L: 1492
			class128.archive13 = WorldMapLabelSize.newArchive(13, true, false, true, false); // L: 1493
			class230.archive14 = WorldMapLabelSize.newArchive(14, false, true, true, false); // L: 1494
			class126.archive15 = WorldMapLabelSize.newArchive(15, false, true, true, false); // L: 1495
			class168.archive17 = WorldMapLabelSize.newArchive(17, true, true, true, false); // L: 1496
			GrandExchangeOfferUnitPriceComparator.archive18 = WorldMapLabelSize.newArchive(18, false, true, true, false); // L: 1497
			KeyHandler.archive19 = WorldMapLabelSize.newArchive(19, false, true, true, false); // L: 1498
			class205.archive20 = WorldMapLabelSize.newArchive(20, false, true, true, false); // L: 1499
			PcmPlayer.field316 = WorldMapLabelSize.newArchive(21, false, true, true, true); // L: 1500
			Login.Login_loadingText = "Connecting to update server"; // L: 1501
			Login.Login_loadingPercent = 20; // L: 1502
			Client.titleLoadingStage = 40; // L: 1503
		} else if (Client.titleLoadingStage != 40) { // L: 1506
			if (Client.titleLoadingStage == 45) { // L: 1554
				boolean var26 = !Client.isLowDetail; // L: 1555
				PcmPlayer.field306 = 2205000; // L: 1558
				PcmPlayer.PcmPlayer_stereo = var26; // L: 1559
				UrlRequest.field1410 = 2; // L: 1560
				MidiPcmStream var24 = new MidiPcmStream(); // L: 1562
				var24.method5772(9, 128); // L: 1563
				KeyHandler.pcmPlayer0 = class148.method3290(GameEngine.taskHandler, 0, 22050); // L: 1564
				KeyHandler.pcmPlayer0.setStream(var24); // L: 1565
				ParamComposition.method3900(class126.archive15, class230.archive14, class426.archive4, var24); // L: 1566
				HorizontalAlignment.pcmPlayer1 = class148.method3290(GameEngine.taskHandler, 1, 2048); // L: 1567
				class130.pcmStreamMixer = new PcmStreamMixer(); // L: 1568
				HorizontalAlignment.pcmPlayer1.setStream(class130.pcmStreamMixer); // L: 1569
				WorldMapSectionType.decimator = new Decimator(22050, PcmPlayer.field306 * -1110828124); // L: 1570
				Login.Login_loadingText = "Prepared sound engine"; // L: 1571
				Login.Login_loadingPercent = 35; // L: 1572
				Client.titleLoadingStage = 50; // L: 1573
				class357.WorldMapElement_fonts = new Fonts(class452.archive8, class128.archive13); // L: 1574
			} else if (Client.titleLoadingStage == 50) { // L: 1577
				var23 = FontName.method8671().length; // L: 1578
				Client.fontsMap = class357.WorldMapElement_fonts.createMap(FontName.method8671()); // L: 1579
				if (Client.fontsMap.size() < var23) { // L: 1580
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var23 + "%"; // L: 1581
					Login.Login_loadingPercent = 40; // L: 1582
				} else {
					Language.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1585
					DecorativeObject.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1586
					class137.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1587
					UserComparator10.platformInfo = Client.platformInfoProvider.get(); // L: 1588
					Login.Login_loadingText = "Loaded fonts"; // L: 1589
					Login.Login_loadingPercent = 40; // L: 1590
					Client.titleLoadingStage = 60; // L: 1591
				}
			} else {
				int var3;
				int var4;
				Archive var13;
				if (Client.titleLoadingStage == 60) { // L: 1594
					var13 = NetFileRequest.archive10; // L: 1596
					Archive var16 = class452.archive8; // L: 1597
					var3 = 0; // L: 1599
					String[] var25 = Login.field924; // L: 1601

					int var17;
					String var22;
					for (var17 = 0; var17 < var25.length; ++var17) { // L: 1602
						var22 = var25[var17]; // L: 1603
						if (var13.tryLoadFileByNames(var22, "")) { // L: 1605
							++var3; // L: 1606
						}
					}

					var25 = Login.field925; // L: 1612

					for (var17 = 0; var17 < var25.length; ++var17) { // L: 1613
						var22 = var25[var17]; // L: 1614
						if (var16.tryLoadFileByNames(var22, "")) { // L: 1616
							++var3; // L: 1617
						}
					}

					var25 = Login.field926; // L: 1623

					for (var17 = 0; var17 < var25.length; ++var17) { // L: 1624
						var22 = var25[var17]; // L: 1625
						if (var16.getGroupId(var22) != -1 && var16.tryLoadFileByNames(var22, "")) { // L: 1627
							++var3; // L: 1628
						}
					}

					var4 = GrandExchangeOfferOwnWorldComparator.method1229(class452.archive8); // L: 1636
					if (var3 < var4) { // L: 1637
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 1638
						Login.Login_loadingPercent = 50; // L: 1639
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1642
						Login.Login_loadingPercent = 50; // L: 1643
						class138.method3208(5); // L: 1644
						Client.titleLoadingStage = 70; // L: 1645
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1648
					if (!class85.archive2.isFullyLoaded()) { // L: 1649
						Login.Login_loadingText = "Loading config - " + class85.archive2.loadPercent() + "%"; // L: 1650
						Login.Login_loadingPercent = 60; // L: 1651
					} else if (!PcmPlayer.field316.isFullyLoaded()) { // L: 1654
						Login.Login_loadingText = "Loading config - " + (80 + class126.archive12.loadPercent() / 6) + "%"; // L: 1655
						Login.Login_loadingPercent = 60; // L: 1656
					} else {
						EnumComposition.method3738(class85.archive2); // L: 1659
						World.method1828(class85.archive2); // L: 1660
						Client.method1770(class85.archive2, FloorUnderlayDefinition.archive11); // L: 1661
						Interpreter.method1987(class85.archive2, FloorUnderlayDefinition.archive11, Client.isLowDetail); // L: 1662
						MenuAction.method2040(class85.archive2, FloorUnderlayDefinition.archive11); // L: 1663
						class85.method2277(class85.archive2); // L: 1664
						Archive var20 = class85.archive2; // L: 1665
						var13 = FloorUnderlayDefinition.archive11; // L: 1666
						boolean var21 = Client.isMembersWorld; // L: 1667
						Font var14 = Language.fontPlain11; // L: 1668
						class355.ItemComposition_archive = var20; // L: 1670
						ItemComposition.ItemComposition_modelArchive = var13; // L: 1671
						FileSystem.ItemComposition_inMembersWorld = var21; // L: 1672
						MouseRecorder.ItemComposition_fileCount = class355.ItemComposition_archive.getGroupFileCount(10); // L: 1673
						class124.ItemComposition_fontPlain11 = var14; // L: 1674
						class152.method3374(class85.archive2, field117, GameBuild.field3803); // L: 1676
						BuddyRankComparator.method2958(class85.archive2, FloorUnderlayDefinition.archive11); // L: 1677
						MenuAction.method2043(class85.archive2); // L: 1678
						Archive var15 = class85.archive2; // L: 1679
						VarpDefinition.VarpDefinition_archive = var15; // L: 1681
						VarpDefinition.field1908 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1682
						class4.method21(class85.archive7, FloorUnderlayDefinition.archive11, class452.archive8, class128.archive13); // L: 1684
						NPC.method2627(class85.archive2); // L: 1685
						MidiPcmStream.method5891(class85.archive2); // L: 1686
						Archive var5 = class85.archive2; // L: 1687
						class294.VarcInt_archive = var5; // L: 1689
						Archive var6 = class85.archive2; // L: 1691
						class195.method3873(class85.archive2); // L: 1693
						ReflectionCheck.method724(class85.archive2); // L: 1694
						class327.method6574(class85.archive2); // L: 1695
						class160.HitSplatDefinition_cachedSprites = new class473(Client.field490, 54, ClanSettings.clientLanguage, class85.archive2); // L: 1696
						MenuAction.Ignored_cached = new class473(Client.field490, 47, ClanSettings.clientLanguage, class85.archive2); // L: 1697
						class373.varcs = new Varcs(); // L: 1698
						Archive var7 = class85.archive2; // L: 1699
						Archive var8 = class452.archive8; // L: 1700
						Archive var9 = class128.archive13; // L: 1701
						HitSplatDefinition.HitSplatDefinition_archive = var7; // L: 1703
						HitSplatDefinition.field2131 = var8; // L: 1704
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var9; // L: 1705
						Archive var10 = class85.archive2; // L: 1707
						Archive var11 = class452.archive8; // L: 1708
						HealthBarDefinition.HealthBarDefinition_archive = var10; // L: 1710
						HealthBarDefinition.field1960 = var11; // L: 1711
						class33.method509(class85.archive2, class452.archive8); // L: 1713
						Login.Login_loadingText = "Loaded config"; // L: 1714
						Login.Login_loadingPercent = 60; // L: 1715
						Client.titleLoadingStage = 80; // L: 1716
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1719
					var23 = 0; // L: 1720
					if (ChatChannel.compass == null) { // L: 1721
						ChatChannel.compass = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.compass, 0);
					} else {
						++var23; // L: 1722
					}

					if (LoginScreenAnimation.redHintArrowSprite == null) { // L: 1723
						LoginScreenAnimation.redHintArrowSprite = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.field4636, 0);
					} else {
						++var23; // L: 1724
					}

					if (class333.mapSceneSprites == null) { // L: 1725
						class333.mapSceneSprites = class68.method2030(class452.archive8, Varcs.spriteIds.mapScenes, 0);
					} else {
						++var23; // L: 1726
					}

					if (class36.headIconPkSprites == null) { // L: 1727
						class36.headIconPkSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.headIconsPk, 0);
					} else {
						++var23; // L: 1728
					}

					if (class425.headIconPrayerSprites == null) { // L: 1729
						class425.headIconPrayerSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4644, 0);
					} else {
						++var23; // L: 1730
					}

					if (KitDefinition.headIconHintSprites == null) { // L: 1731
						KitDefinition.headIconHintSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4641, 0);
					} else {
						++var23; // L: 1732
					}

					if (Players.mapMarkerSprites == null) { // L: 1733
						Players.mapMarkerSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4642, 0);
					} else {
						++var23; // L: 1734
					}

					if (class173.crossSprites == null) { // L: 1735
						class173.crossSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4640, 0);
					} else {
						++var23; // L: 1736
					}

					if (class477.mapDotSprites == null) { // L: 1737
						class477.mapDotSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4643, 0);
					} else {
						++var23; // L: 1738
					}

					if (HealthBar.scrollBarSprites == null) { // L: 1739
						HealthBar.scrollBarSprites = class68.method2030(class452.archive8, Varcs.spriteIds.field4645, 0);
					} else {
						++var23; // L: 1740
					}

					if (class31.modIconSprites == null) { // L: 1741
						class31.modIconSprites = class68.method2030(class452.archive8, Varcs.spriteIds.field4637, 0);
					} else {
						++var23; // L: 1742
					}

					if (var23 < 11) { // L: 1743
						Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%"; // L: 1744
						Login.Login_loadingPercent = 70; // L: 1745
					} else {
						AbstractFont.AbstractFont_modIconSprites = class31.modIconSprites; // L: 1748
						LoginScreenAnimation.redHintArrowSprite.normalize(); // L: 1749
						int var1 = (int)(Math.random() * 21.0D) - 10; // L: 1750
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1751
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1752
						var4 = (int)(Math.random() * 41.0D) - 20; // L: 1753
						class333.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4); // L: 1754
						Login.Login_loadingText = "Loaded sprites"; // L: 1755
						Login.Login_loadingPercent = 70; // L: 1756
						Client.titleLoadingStage = 90; // L: 1757
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1760
					if (!WorldMapLabelSize.field2868.isFullyLoaded()) { // L: 1761
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1762
						Login.Login_loadingPercent = 90; // L: 1763
					} else {
						class7.textureProvider = new TextureProvider(WorldMapLabelSize.field2868, class452.archive8, 20, class20.clientPreferences.method2459(), Client.isLowDetail ? 64 : 128); // L: 1766
						TextureProvider var19 = class7.textureProvider; // L: 1767
						Rasterizer3D.field2514.Rasterizer3D_textureLoader = var19; // L: 1769
						class18.method285(class20.clientPreferences.method2459()); // L: 1771
						Client.titleLoadingStage = 100; // L: 1772
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1775
					var23 = class7.textureProvider.getLoadedPercentage(); // L: 1776
					if (var23 < 100) { // L: 1777
						Login.Login_loadingText = "Loading textures - " + var23 + "%"; // L: 1778
						Login.Login_loadingPercent = 90; // L: 1779
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1782
						Login.Login_loadingPercent = 90; // L: 1783
						Client.titleLoadingStage = 110; // L: 1784
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1787
					UserComparator6.mouseRecorder = new MouseRecorder(); // L: 1788
					GameEngine.taskHandler.newThreadTask(UserComparator6.mouseRecorder, 10); // L: 1789
					Login.Login_loadingText = "Loaded input handler"; // L: 1790
					Login.Login_loadingPercent = 92; // L: 1791
					Client.titleLoadingStage = 120; // L: 1792
				} else if (Client.titleLoadingStage == 120) { // L: 1795
					if (!NetFileRequest.archive10.tryLoadFileByNames("huffman", "")) { // L: 1796
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1797
						Login.Login_loadingPercent = 94; // L: 1798
					} else {
						Huffman var18 = new Huffman(NetFileRequest.archive10.takeFileByNames("huffman", "")); // L: 1801
						class154.method3385(var18); // L: 1802
						Login.Login_loadingText = "Loaded wordpack"; // L: 1803
						Login.Login_loadingPercent = 94; // L: 1804
						Client.titleLoadingStage = 130; // L: 1805
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1808
					if (!class85.archive7.isFullyLoaded()) { // L: 1809
						Login.Login_loadingText = "Loading interfaces - " + class85.archive7.loadPercent() * 4 / 5 + "%"; // L: 1810
						Login.Login_loadingPercent = 96; // L: 1811
					} else if (!class126.archive12.isFullyLoaded()) { // L: 1814
						Login.Login_loadingText = "Loading interfaces - " + (80 + class126.archive12.loadPercent() / 6) + "%"; // L: 1815
						Login.Login_loadingPercent = 96; // L: 1816
					} else if (!class128.archive13.isFullyLoaded()) { // L: 1819
						Login.Login_loadingText = "Loading interfaces - " + (96 + class128.archive13.loadPercent() / 50) + "%"; // L: 1820
						Login.Login_loadingPercent = 96; // L: 1821
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1824
						Login.Login_loadingPercent = 98; // L: 1825
						if (class126.archive12.isValidFileName("version.dat", "")) { // L: 1826
							Buffer var0 = new Buffer(class126.archive12.takeFileByNames("version.dat", "")); // L: 1827
							var0.readUnsignedShort(); // L: 1828
						}

						Client.titleLoadingStage = 140; // L: 1830
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1833
					Login.Login_loadingPercent = 100; // L: 1834
					if (KeyHandler.archive19.getGroupCount() > 0 && !KeyHandler.archive19.tryLoadGroupByName(WorldMapCacheName.field3054.name)) { // L: 1835
						Login.Login_loadingText = "Loading world map - " + KeyHandler.archive19.groupLoadPercentByName(WorldMapCacheName.field3054.name) / 10 + "%"; // L: 1836
					} else {
						if (class126.worldMap == null) { // L: 1839
							class126.worldMap = new WorldMap(); // L: 1840
							class126.worldMap.init(KeyHandler.archive19, GrandExchangeOfferUnitPriceComparator.archive18, class205.archive20, class137.fontBold12, Client.fontsMap, class333.mapSceneSprites); // L: 1841
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1843
						Client.titleLoadingStage = 150; // L: 1844
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1847
					class138.method3208(10); // L: 1848
				}
			}
		} else {
			byte var12 = 0; // L: 1507
			var23 = var12 + field117.percentage() * 4 / 100; // L: 1508
			var23 += GameBuild.field3803.percentage() * 4 / 100; // L: 1509
			var23 += class85.archive2.percentage() * 2 / 100; // L: 1510
			var23 += class85.archive7.percentage() * 2 / 100; // L: 1511
			var23 += class426.archive4.percentage() * 6 / 100; // L: 1512
			var23 += GrandExchangeOfferTotalQuantityComparator.archive9.percentage() * 4 / 100; // L: 1513
			var23 += class399.archive6.percentage() * 2 / 100; // L: 1514
			var23 += FloorUnderlayDefinition.archive11.percentage() * 55 / 100; // L: 1515
			var23 += class452.archive8.percentage() * 2 / 100; // L: 1516
			var23 += WorldMapLabelSize.field2868.percentage() * 2 / 100; // L: 1517
			var23 += NetFileRequest.archive10.percentage() * 2 / 100; // L: 1518
			var23 += class195.field2101.percentage() * 2 / 100; // L: 1519
			var23 += class126.archive12.percentage() * 2 / 100; // L: 1520
			var23 += class128.archive13.percentage() * 2 / 100; // L: 1521
			var23 += class230.archive14.percentage() * 2 / 100; // L: 1522
			var23 += class126.archive15.percentage() * 2 / 100; // L: 1523
			var23 += KeyHandler.archive19.percentage() / 100; // L: 1524
			var23 += GrandExchangeOfferUnitPriceComparator.archive18.percentage() / 100; // L: 1525
			var23 += class205.archive20.percentage() / 100; // L: 1526
			var23 += PcmPlayer.field316.percentage() / 100; // L: 1527
			var23 += class168.archive17.method6635() && class168.archive17.isFullyLoaded() ? 1 : 0; // L: 1528
			if (var23 != 100) { // L: 1529
				if (var23 != 0) { // L: 1530
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1531
			} else {
				UserComparator5.method2920(field117, "Animations"); // L: 1534
				UserComparator5.method2920(GameBuild.field3803, "Skeletons"); // L: 1535
				UserComparator5.method2920(class426.archive4, "Sound FX"); // L: 1536
				UserComparator5.method2920(GrandExchangeOfferTotalQuantityComparator.archive9, "Maps"); // L: 1537
				UserComparator5.method2920(class399.archive6, "Music Tracks"); // L: 1538
				UserComparator5.method2920(FloorUnderlayDefinition.archive11, "Models"); // L: 1539
				UserComparator5.method2920(class452.archive8, "Sprites"); // L: 1540
				UserComparator5.method2920(class195.field2101, "Music Jingles"); // L: 1541
				UserComparator5.method2920(class230.archive14, "Music Samples"); // L: 1542
				UserComparator5.method2920(class126.archive15, "Music Patches"); // L: 1543
				UserComparator5.method2920(KeyHandler.archive19, "World Map"); // L: 1544
				UserComparator5.method2920(GrandExchangeOfferUnitPriceComparator.archive18, "World Map Geography"); // L: 1545
				UserComparator5.method2920(class205.archive20, "World Map Ground"); // L: 1546
				Varcs.spriteIds = new GraphicsDefaults(); // L: 1547
				Varcs.spriteIds.decode(class168.archive17); // L: 1548
				Login.Login_loadingText = "Loaded update list"; // L: 1549
				Login.Login_loadingPercent = 30; // L: 1550
				Client.titleLoadingStage = 45; // L: 1551
			}
		}
	} // L: 1471 1477 1504 1532 1552 1575 1583 1592 1640 1646 1652 1657 1717 1746 1758 1764 1773 1780 1785 1793 1799 1806 1812 1817 1822 1831 1837 1845 1849 1851

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "329326313"
	)
	static void method323(int var0) {
		SequenceDefinition var1 = ItemContainer.SequenceDefinition_get(var0); // L: 12270
		if (var1.isCachedModelIdSet()) { // L: 12271
			if (class20.method304(var1.SequenceDefinition_cachedModelId) == 2) { // L: 12274
				Client.field782.add(var1.SequenceDefinition_cachedModelId); // L: 12275
			}

		}
	} // L: 12272 12277
}
