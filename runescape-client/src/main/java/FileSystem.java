import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("s")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("h")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("w")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = -384818637
	)
	@Export("js5Port")
	static int js5Port;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lgc;",
		garbageValue = "1207745008"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 73
		if (var1 != null) { // L: 74
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 75
			var1 = new ObjectComposition(); // L: 76
			var1.id = var0; // L: 77
			if (var2 != null) { // L: 78
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 79
			if (var1.isSolid) { // L: 80
				var1.interactType = 0; // L: 81
				var1.boolean1 = false; // L: 82
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 84
			return var1; // L: 85
		}
	}

	@ObfuscatedName("v")
	public static int method3214(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 60
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1495675616"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) { // L: 1466
			class12.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1467

			for (var23 = 0; var23 < 4; ++var23) { // L: 1468
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			class1.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1469
			Login.Login_loadingText = "Starting game engine..."; // L: 1470
			Login.Login_loadingPercent = 5; // L: 1471
			Client.titleLoadingStage = 20; // L: 1472
		} else if (Client.titleLoadingStage == 20) { // L: 1475
			Login.Login_loadingText = "Prepared visibility map"; // L: 1476
			Login.Login_loadingPercent = 10; // L: 1477
			Client.titleLoadingStage = 30; // L: 1478
		} else if (Client.titleLoadingStage == 30) { // L: 1481
			ClanChannelMember.archive5 = UserComparator4.newArchive(0, false, true, true, false); // L: 1482
			Decimator.field403 = UserComparator4.newArchive(1, false, true, true, false); // L: 1483
			Renderable.archive2 = UserComparator4.newArchive(2, true, false, true, false); // L: 1484
			class306.archive7 = UserComparator4.newArchive(3, false, true, true, false); // L: 1485
			class271.archive4 = UserComparator4.newArchive(4, false, true, true, false); // L: 1486
			class120.archive9 = UserComparator4.newArchive(5, true, true, true, false); // L: 1487
			PacketBuffer.archive6 = UserComparator4.newArchive(6, true, true, true, false); // L: 1488
			FloorUnderlayDefinition.archive11 = UserComparator4.newArchive(7, false, true, true, false); // L: 1489
			class299.archive8 = UserComparator4.newArchive(8, false, true, true, false); // L: 1490
			class201.field2366 = UserComparator4.newArchive(9, false, true, true, false); // L: 1491
			KitDefinition.archive10 = UserComparator4.newArchive(10, false, true, true, false); // L: 1492
			class17.field89 = UserComparator4.newArchive(11, false, true, true, false); // L: 1493
			SequenceDefinition.archive12 = UserComparator4.newArchive(12, false, true, true, false); // L: 1494
			MouseRecorder.archive13 = UserComparator4.newArchive(13, true, false, true, false); // L: 1495
			Varcs.archive14 = UserComparator4.newArchive(14, false, true, true, false); // L: 1496
			class268.archive15 = UserComparator4.newArchive(15, false, true, true, false); // L: 1497
			MouseHandler.archive17 = UserComparator4.newArchive(17, true, true, true, false); // L: 1498
			class340.archive18 = UserComparator4.newArchive(18, false, true, true, false); // L: 1499
			Tile.archive19 = UserComparator4.newArchive(19, false, true, true, false); // L: 1500
			Friend.archive20 = UserComparator4.newArchive(20, false, true, true, false); // L: 1501
			Timer.field4232 = UserComparator4.newArchive(21, false, true, true, true); // L: 1502
			Login.Login_loadingText = "Connecting to update server"; // L: 1503
			Login.Login_loadingPercent = 20; // L: 1504
			Client.titleLoadingStage = 40; // L: 1505
		} else if (Client.titleLoadingStage == 40) { // L: 1508
			byte var38 = 0; // L: 1509
			var23 = var38 + ClanChannelMember.archive5.percentage() * 4 / 100; // L: 1510
			var23 += Decimator.field403.percentage() * 4 / 100; // L: 1511
			var23 += Renderable.archive2.percentage() * 2 / 100; // L: 1512
			var23 += class306.archive7.percentage() * 2 / 100; // L: 1513
			var23 += class271.archive4.percentage() * 6 / 100; // L: 1514
			var23 += class120.archive9.percentage() * 4 / 100; // L: 1515
			var23 += PacketBuffer.archive6.percentage() * 2 / 100; // L: 1516
			var23 += FloorUnderlayDefinition.archive11.percentage() * 55 / 100; // L: 1517
			var23 += class299.archive8.percentage() * 2 / 100; // L: 1518
			var23 += class201.field2366.percentage() * 2 / 100; // L: 1519
			var23 += KitDefinition.archive10.percentage() * 2 / 100; // L: 1520
			var23 += class17.field89.percentage() * 2 / 100; // L: 1521
			var23 += SequenceDefinition.archive12.percentage() * 2 / 100; // L: 1522
			var23 += MouseRecorder.archive13.percentage() * 2 / 100; // L: 1523
			var23 += Varcs.archive14.percentage() * 2 / 100; // L: 1524
			var23 += class268.archive15.percentage() * 2 / 100; // L: 1525
			var23 += Tile.archive19.percentage() / 100; // L: 1526
			var23 += class340.archive18.percentage() / 100; // L: 1527
			var23 += Friend.archive20.percentage() / 100; // L: 1528
			var23 += Timer.field4232.percentage() / 100; // L: 1529
			var23 += MouseHandler.archive17.method5710() && MouseHandler.archive17.isFullyLoaded() ? 1 : 0; // L: 1530
			if (var23 != 100) { // L: 1531
				if (var23 != 0) { // L: 1532
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1533
			} else {
				ApproximateRouteStrategy.method1070(ClanChannelMember.archive5, "Animations"); // L: 1536
				ApproximateRouteStrategy.method1070(Decimator.field403, "Skeletons"); // L: 1537
				ApproximateRouteStrategy.method1070(class271.archive4, "Sound FX"); // L: 1538
				ApproximateRouteStrategy.method1070(class120.archive9, "Maps"); // L: 1539
				ApproximateRouteStrategy.method1070(PacketBuffer.archive6, "Music Tracks"); // L: 1540
				ApproximateRouteStrategy.method1070(FloorUnderlayDefinition.archive11, "Models"); // L: 1541
				ApproximateRouteStrategy.method1070(class299.archive8, "Sprites"); // L: 1542
				ApproximateRouteStrategy.method1070(class17.field89, "Music Jingles"); // L: 1543
				ApproximateRouteStrategy.method1070(Varcs.archive14, "Music Samples"); // L: 1544
				ApproximateRouteStrategy.method1070(class268.archive15, "Music Patches"); // L: 1545
				ApproximateRouteStrategy.method1070(Tile.archive19, "World Map"); // L: 1546
				ApproximateRouteStrategy.method1070(class340.archive18, "World Map Geography"); // L: 1547
				ApproximateRouteStrategy.method1070(Friend.archive20, "World Map Ground"); // L: 1548
				class181.spriteIds = new GraphicsDefaults(); // L: 1549
				class181.spriteIds.decode(MouseHandler.archive17); // L: 1550
				Login.Login_loadingText = "Loaded update list"; // L: 1551
				Login.Login_loadingPercent = 30; // L: 1552
				Client.titleLoadingStage = 45; // L: 1553
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1556
			boolean var37 = !Client.isLowDetail; // L: 1557
			class344.field4152 = -1447841134; // L: 1560
			PcmPlayer.PcmPlayer_stereo = var37; // L: 1561
			PcmPlayer.field279 = 2; // L: 1562
			MidiPcmStream var33 = new MidiPcmStream(); // L: 1564
			var33.method5198(9, 128); // L: 1565
			class78.pcmPlayer0 = class162.method3227(GameEngine.taskHandler, 0, 22050); // L: 1566
			class78.pcmPlayer0.setStream(var33); // L: 1567
			UrlRequest.method2520(class268.archive15, Varcs.archive14, class271.archive4, var33); // L: 1568
			MouseRecorder.pcmPlayer1 = class162.method3227(GameEngine.taskHandler, 1, 2048); // L: 1569
			ModeWhere.pcmStreamMixer = new PcmStreamMixer(); // L: 1570
			MouseRecorder.pcmPlayer1.setStream(ModeWhere.pcmStreamMixer); // L: 1571
			ScriptEvent.decimator = new Decimator(22050, class344.field4152 * -449918071); // L: 1572
			Login.Login_loadingText = "Prepared sound engine"; // L: 1573
			Login.Login_loadingPercent = 35; // L: 1574
			Client.titleLoadingStage = 50; // L: 1575
			class129.WorldMapElement_fonts = new Fonts(class299.archive8, MouseRecorder.archive13); // L: 1576
		} else {
			int var1;
			if (Client.titleLoadingStage == 50) { // L: 1579
				FontName[] var30 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain12, FontName.FontName_plain11}; // L: 1582
				var1 = var30.length; // L: 1584
				Fonts var36 = class129.WorldMapElement_fonts; // L: 1585
				FontName[] var34 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain12, FontName.FontName_plain11}; // L: 1588
				Client.fontsMap = var36.createMap(var34); // L: 1590
				if (Client.fontsMap.size() < var1) { // L: 1591
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1592
					Login.Login_loadingPercent = 40; // L: 1593
				} else {
					class306.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1596
					ReflectionCheck.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1597
					WorldMapSection2.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1598
					class393.platformInfo = Client.platformInfoProvider.get(); // L: 1599
					Login.Login_loadingText = "Loaded fonts"; // L: 1600
					Login.Login_loadingPercent = 40; // L: 1601
					Client.titleLoadingStage = 60; // L: 1602
				}
			} else {
				int var3;
				int var4;
				Archive var24;
				if (Client.titleLoadingStage == 60) { // L: 1605
					var24 = KitDefinition.archive10; // L: 1607
					Archive var27 = class299.archive8; // L: 1608
					var3 = 0; // L: 1610
					String[] var35 = Login.field901; // L: 1612

					int var28;
					String var32;
					for (var28 = 0; var28 < var35.length; ++var28) { // L: 1613
						var32 = var35[var28]; // L: 1614
						if (var24.tryLoadFileByNames(var32, "")) { // L: 1616
							++var3;
						}
					}

					var35 = Login.field906; // L: 1621

					for (var28 = 0; var28 < var35.length; ++var28) { // L: 1622
						var32 = var35[var28]; // L: 1623
						if (var27.tryLoadFileByNames(var32, "")) { // L: 1625
							++var3;
						}
					}

					var4 = Login.field901.length + Login.field906.length; // L: 1634
					if (var3 < var4) { // L: 1637
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%"; // L: 1638
						Login.Login_loadingPercent = 50; // L: 1639
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1642
						Login.Login_loadingPercent = 50; // L: 1643
						class4.updateGameState(5); // L: 1644
						Client.titleLoadingStage = 70; // L: 1645
					}
				} else if (Client.titleLoadingStage != 70) { // L: 1648
					if (Client.titleLoadingStage == 80) { // L: 1756
						var23 = 0; // L: 1757
						if (class16.compass == null) { // L: 1758
							class16.compass = WorldMapScaleHandler.SpriteBuffer_getSprite(class299.archive8, class181.spriteIds.compass, 0);
						} else {
							++var23; // L: 1759
						}

						if (MouseRecorder.redHintArrowSprite == null) { // L: 1760
							MouseRecorder.redHintArrowSprite = WorldMapScaleHandler.SpriteBuffer_getSprite(class299.archive8, class181.spriteIds.field4366, 0);
						} else {
							++var23; // L: 1761
						}

						if (class120.mapSceneSprites == null) { // L: 1762
							class120.mapSceneSprites = DefaultsGroup.method6840(class299.archive8, class181.spriteIds.mapScenes, 0);
						} else {
							++var23; // L: 1763
						}

						if (BufferedSource.headIconPkSprites == null) { // L: 1764
							BufferedSource.headIconPkSprites = Tiles.method2024(class299.archive8, class181.spriteIds.headIconsPk, 0);
						} else {
							++var23; // L: 1765
						}

						if (MusicPatchNode.headIconPrayerSprites == null) { // L: 1766
							MusicPatchNode.headIconPrayerSprites = Tiles.method2024(class299.archive8, class181.spriteIds.field4370, 0);
						} else {
							++var23; // L: 1767
						}

						if (class229.headIconHintSprites == null) { // L: 1768
							class229.headIconHintSprites = Tiles.method2024(class299.archive8, class181.spriteIds.field4369, 0);
						} else {
							++var23; // L: 1769
						}

						if (class7.mapMarkerSprites == null) { // L: 1770
							class7.mapMarkerSprites = Tiles.method2024(class299.archive8, class181.spriteIds.field4371, 0);
						} else {
							++var23; // L: 1771
						}

						if (Canvas.crossSprites == null) { // L: 1772
							Canvas.crossSprites = Tiles.method2024(class299.archive8, class181.spriteIds.field4373, 0);
						} else {
							++var23; // L: 1773
						}

						if (MusicPatchNode.mapDotSprites == null) { // L: 1774
							MusicPatchNode.mapDotSprites = Tiles.method2024(class299.archive8, class181.spriteIds.field4374, 0);
						} else {
							++var23; // L: 1775
						}

						if (InterfaceParent.scrollBarSprites == null) { // L: 1776
							InterfaceParent.scrollBarSprites = DefaultsGroup.method6840(class299.archive8, class181.spriteIds.field4375, 0);
						} else {
							++var23; // L: 1777
						}

						if (VarpDefinition.modIconSprites == null) { // L: 1778
							VarpDefinition.modIconSprites = DefaultsGroup.method6840(class299.archive8, class181.spriteIds.field4376, 0);
						} else {
							++var23; // L: 1779
						}

						if (var23 < 11) { // L: 1780
							Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%"; // L: 1781
							Login.Login_loadingPercent = 70; // L: 1782
						} else {
							AbstractFont.AbstractFont_modIconSprites = VarpDefinition.modIconSprites; // L: 1785
							MouseRecorder.redHintArrowSprite.normalize(); // L: 1786
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 1787
							int var31 = (int)(Math.random() * 21.0D) - 10; // L: 1788
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1789
							var4 = (int)(Math.random() * 41.0D) - 20; // L: 1790
							class120.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var31, var3 + var4); // L: 1791
							Login.Login_loadingText = "Loaded sprites"; // L: 1792
							Login.Login_loadingPercent = 70; // L: 1793
							Client.titleLoadingStage = 90; // L: 1794
						}
					} else if (Client.titleLoadingStage == 90) { // L: 1797
						if (!class201.field2366.isFullyLoaded()) { // L: 1798
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1799
							Login.Login_loadingPercent = 90; // L: 1800
						} else {
							GameBuild.textureProvider = new TextureProvider(class201.field2366, class299.archive8, 20, FriendsChatMember.clientPreferences.method2220(), Client.isLowDetail ? 64 : 128); // L: 1803
							Rasterizer3D.Rasterizer3D_setTextureLoader(GameBuild.textureProvider); // L: 1804
							Rasterizer3D.Rasterizer3D_setBrightness(FriendsChatMember.clientPreferences.method2220()); // L: 1805
							Client.titleLoadingStage = 100; // L: 1806
						}
					} else if (Client.titleLoadingStage == 100) { // L: 1809
						var23 = GameBuild.textureProvider.getLoadedPercentage(); // L: 1810
						if (var23 < 100) { // L: 1811
							Login.Login_loadingText = "Loading textures - " + var23 + "%"; // L: 1812
							Login.Login_loadingPercent = 90; // L: 1813
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1816
							Login.Login_loadingPercent = 90; // L: 1817
							Client.titleLoadingStage = 110; // L: 1818
						}
					} else if (Client.titleLoadingStage == 110) { // L: 1821
						GrandExchangeEvents.mouseRecorder = new MouseRecorder(); // L: 1822
						GameEngine.taskHandler.newThreadTask(GrandExchangeEvents.mouseRecorder, 10); // L: 1823
						Login.Login_loadingText = "Loaded input handler"; // L: 1824
						Login.Login_loadingPercent = 92; // L: 1825
						Client.titleLoadingStage = 120; // L: 1826
					} else if (Client.titleLoadingStage == 120) { // L: 1829
						if (!KitDefinition.archive10.tryLoadFileByNames("huffman", "")) { // L: 1830
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1831
							Login.Login_loadingPercent = 94; // L: 1832
						} else {
							Huffman var29 = new Huffman(KitDefinition.archive10.takeFileByNames("huffman", "")); // L: 1835
							WorldMapIcon_0.method4843(var29); // L: 1836
							Login.Login_loadingText = "Loaded wordpack"; // L: 1837
							Login.Login_loadingPercent = 94; // L: 1838
							Client.titleLoadingStage = 130; // L: 1839
						}
					} else if (Client.titleLoadingStage == 130) { // L: 1842
						if (!class306.archive7.isFullyLoaded()) { // L: 1843
							Login.Login_loadingText = "Loading interfaces - " + class306.archive7.loadPercent() * 4 / 5 + "%"; // L: 1844
							Login.Login_loadingPercent = 96; // L: 1845
						} else if (!SequenceDefinition.archive12.isFullyLoaded()) { // L: 1848
							Login.Login_loadingText = "Loading interfaces - " + (80 + SequenceDefinition.archive12.loadPercent() / 6) + "%"; // L: 1849
							Login.Login_loadingPercent = 96; // L: 1850
						} else if (!MouseRecorder.archive13.isFullyLoaded()) { // L: 1853
							Login.Login_loadingText = "Loading interfaces - " + (96 + MouseRecorder.archive13.loadPercent() / 50) + "%"; // L: 1854
							Login.Login_loadingPercent = 96; // L: 1855
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1858
							Login.Login_loadingPercent = 98; // L: 1859
							Client.titleLoadingStage = 140; // L: 1860
						}
					} else if (Client.titleLoadingStage == 140) { // L: 1863
						Login.Login_loadingPercent = 100; // L: 1864
						if (!Tile.archive19.tryLoadGroupByName(WorldMapCacheName.field2872.name)) { // L: 1865
							Login.Login_loadingText = "Loading world map - " + Tile.archive19.groupLoadPercentByName(WorldMapCacheName.field2872.name) / 10 + "%"; // L: 1866
						} else {
							if (ClientPacket.worldMap == null) { // L: 1869
								ClientPacket.worldMap = new WorldMap(); // L: 1870
								ClientPacket.worldMap.init(Tile.archive19, class340.archive18, Friend.archive20, WorldMapSection2.fontBold12, Client.fontsMap, class120.mapSceneSprites); // L: 1871
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1873
							Client.titleLoadingStage = 150; // L: 1874
						}
					} else if (Client.titleLoadingStage == 150) { // L: 1877
						class4.updateGameState(10); // L: 1878
					}
				} else if (!Renderable.archive2.isFullyLoaded()) { // L: 1649
					Login.Login_loadingText = "Loading config - " + Renderable.archive2.loadPercent() + "%"; // L: 1650
					Login.Login_loadingPercent = 60; // L: 1651
				} else if (!Timer.field4232.isFullyLoaded()) { // L: 1654
					Login.Login_loadingText = "Loading config - " + (80 + SequenceDefinition.archive12.loadPercent() / 6) + "%"; // L: 1655
					Login.Login_loadingPercent = 60; // L: 1656
				} else {
					class127.method2798(Renderable.archive2); // L: 1659
					LoginPacket.method5144(Renderable.archive2); // L: 1660
					class152.method3079(Renderable.archive2, FloorUnderlayDefinition.archive11); // L: 1661
					Archive var0 = Renderable.archive2; // L: 1662
					var24 = FloorUnderlayDefinition.archive11; // L: 1663
					boolean var2 = Client.isLowDetail; // L: 1664
					ObjectComposition.ObjectDefinition_archive = var0; // L: 1666
					ObjectComposition.ObjectDefinition_modelsArchive = var24; // L: 1667
					ObjectComposition.ObjectDefinition_isLowDetail = var2; // L: 1668
					GroundObject.method3921(Renderable.archive2, FloorUnderlayDefinition.archive11); // L: 1670
					Archive var25 = Renderable.archive2; // L: 1671
					StructComposition.StructDefinition_archive = var25; // L: 1673
					MidiPcmStream.method5316(Renderable.archive2, FloorUnderlayDefinition.archive11, Client.isMembersWorld, class306.fontPlain11); // L: 1675
					class134.method2851(Renderable.archive2, ClanChannelMember.archive5, Decimator.field403); // L: 1676
					Archive var26 = Renderable.archive2; // L: 1677
					Archive var5 = FloorUnderlayDefinition.archive11; // L: 1678
					SpotAnimationDefinition.SpotAnimationDefinition_archive = var26; // L: 1680
					SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var5; // L: 1681
					Decimator.method994(Renderable.archive2); // L: 1683
					class134.method2857(Renderable.archive2); // L: 1684
					Archive var6 = class306.archive7; // L: 1685
					Archive var7 = FloorUnderlayDefinition.archive11; // L: 1686
					Archive var8 = class299.archive8; // L: 1687
					Archive var9 = MouseRecorder.archive13; // L: 1688
					class438.Widget_archive = var6; // L: 1690
					class193.Widget_modelsArchive = var7; // L: 1691
					WorldMapData_1.Widget_spritesArchive = var8; // L: 1692
					SceneTilePaint.Widget_fontsArchive = var9; // L: 1693
					class358.Widget_interfaceComponents = new Widget[class438.Widget_archive.getGroupCount()][]; // L: 1694
					Widget.Widget_loadedInterfaces = new boolean[class438.Widget_archive.getGroupCount()]; // L: 1695
					Archive var10 = Renderable.archive2; // L: 1697
					InvDefinition.InvDefinition_archive = var10; // L: 1699
					Archive var11 = Renderable.archive2; // L: 1701
					EnumComposition.EnumDefinition_archive = var11; // L: 1703
					Clock.method3265(Renderable.archive2); // L: 1705
					class131.method2827(Renderable.archive2); // L: 1706
					Archive var12 = Renderable.archive2; // L: 1707
					ParamComposition.ParamDefinition_archive = var12; // L: 1709
					Archive var13 = Renderable.archive2; // L: 1711
					class436.field4669 = var13; // L: 1713
					class10.method89(Renderable.archive2); // L: 1715
					class290.HitSplatDefinition_cachedSprites = new class428(class20.field111, 54, MilliClock.clientLanguage, Renderable.archive2); // L: 1716
					Bounds.Ignored_cached = new class428(class20.field111, 47, MilliClock.clientLanguage, Renderable.archive2); // L: 1717
					class341.varcs = new Varcs(); // L: 1718
					Archive var14 = Renderable.archive2; // L: 1719
					Archive var15 = class299.archive8; // L: 1720
					Archive var16 = MouseRecorder.archive13; // L: 1721
					class430.HitSplatDefinition_archive = var14; // L: 1723
					HitSplatDefinition.field2024 = var15; // L: 1724
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var16; // L: 1725
					Archive var17 = Renderable.archive2; // L: 1727
					Archive var18 = class299.archive8; // L: 1728
					HealthBarDefinition.HealthBarDefinition_archive = var17; // L: 1730
					HealthBarDefinition.field1859 = var18; // L: 1731
					Archive var19 = Renderable.archive2; // L: 1733
					Archive var20 = class299.archive8; // L: 1734
					class28.WorldMapElement_archive = var20; // L: 1736
					if (var19.isFullyLoaded()) { // L: 1737
						WorldMapElement.WorldMapElement_count = var19.getGroupFileCount(35); // L: 1740
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1741

						for (int var21 = 0; var21 < WorldMapElement.WorldMapElement_count; ++var21) { // L: 1742
							byte[] var22 = var19.takeFile(35, var21); // L: 1743
							WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21); // L: 1744
							if (var22 != null) { // L: 1745
								WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22)); // L: 1746
								WorldMapElement.WorldMapElement_cached[var21].method3291(); // L: 1747
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 1751
					Login.Login_loadingPercent = 60; // L: 1752
					Client.titleLoadingStage = 80; // L: 1753
				}
			}
		}
	} // L: 1473 1479 1506 1534 1554 1577 1594 1603 1640 1646 1652 1657 1754 1783 1795 1801 1807 1814 1819 1827 1833 1840 1846 1851 1856 1861 1867 1875 1879 1881

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIIIIIIS)V",
		garbageValue = "8626"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9797
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9798

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9799
			Widget var10 = var0[var9]; // L: 9800
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9801 9802
				int var11;
				if (var8 == -1) { // L: 9804
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9805
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9806
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9807
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9808
					var11 = ++Client.rootWidgetCount - 1; // L: 9809
				} else {
					var11 = var8; // L: 9811
				}

				var10.rootIndex = var11; // L: 9812
				var10.cycle = Client.cycle; // L: 9813
				if (!var10.isIf3 || !Tiles.isComponentHidden(var10)) { // L: 9814
					if (var10.contentType > 0) { // L: 9815
						class359.method6482(var10);
					}

					int var12 = var10.x + var6; // L: 9816
					int var13 = var7 + var10.y; // L: 9817
					int var14 = var10.transparencyTop; // L: 9818
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9819
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9820
							GraphicsObject.field840 = var0; // L: 9821
							HealthBar.field1249 = var6; // L: 9822
							UserComparator7.field1374 = var7; // L: 9823
							continue; // L: 9824
						}

						if (Client.isDraggingWidget && Client.field569) { // L: 9826
							var15 = MouseHandler.MouseHandler_x; // L: 9827
							var16 = MouseHandler.MouseHandler_y; // L: 9828
							var15 -= Client.widgetClickX; // L: 9829
							var16 -= Client.widgetClickY; // L: 9830
							if (var15 < Client.field760) { // L: 9831
								var15 = Client.field760;
							}

							if (var15 + var10.width > Client.field760 + Client.clickedWidgetParent.width) { // L: 9832
								var15 = Client.field760 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field669) { // L: 9833
								var16 = Client.field669;
							}

							if (var16 + var10.height > Client.field669 + Client.clickedWidgetParent.height) { // L: 9834
								var16 = Client.field669 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9835
							var13 = var16; // L: 9836
						}

						if (!var10.isScrollBar) { // L: 9838
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9844
						var15 = var2; // L: 9845
						var16 = var3; // L: 9846
						var17 = var4; // L: 9847
						var18 = var5; // L: 9848
					} else if (var10.type == 9) { // L: 9850
						var19 = var12; // L: 9851
						var20 = var13; // L: 9852
						var21 = var12 + var10.width; // L: 9853
						var22 = var13 + var10.height; // L: 9854
						if (var21 < var12) { // L: 9855
							var19 = var21; // L: 9857
							var21 = var12; // L: 9858
						}

						if (var22 < var13) { // L: 9860
							var20 = var22; // L: 9862
							var22 = var13; // L: 9863
						}

						++var21; // L: 9865
						++var22; // L: 9866
						var15 = var19 > var2 ? var19 : var2; // L: 9867
						var16 = var20 > var3 ? var20 : var3; // L: 9868
						var17 = var21 < var4 ? var21 : var4; // L: 9869
						var18 = var22 < var5 ? var22 : var5; // L: 9870
					} else {
						var19 = var12 + var10.width; // L: 9873
						var20 = var13 + var10.height; // L: 9874
						var15 = var12 > var2 ? var12 : var2; // L: 9875
						var16 = var13 > var3 ? var13 : var3; // L: 9876
						var17 = var19 < var4 ? var19 : var4; // L: 9877
						var18 = var20 < var5 ? var20 : var5; // L: 9878
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9880
						if (var10.contentType != 0) { // L: 9881
							if (var10.contentType == 1336) { // L: 9882
								if (FriendsChatMember.clientPreferences.method2216()) { // L: 9883
									var13 += 15; // L: 9884
									ReflectionCheck.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9885
									var13 += 15; // L: 9886
									Runtime var42 = Runtime.getRuntime(); // L: 9887
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9888
									var21 = 16776960; // L: 9889
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9890
										var21 = 16711680;
									}

									ReflectionCheck.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9891
									var13 += 15; // L: 9892
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9896
								Client.viewportX = var12; // L: 9897
								Client.viewportY = var13; // L: 9898
								Message.drawEntities(var12, var13, var10.width, var10.height); // L: 9899
								Client.field643[var10.rootIndex] = true; // L: 9900
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9901
								continue; // L: 9902
							}

							if (var10.contentType == 1338) { // L: 9904
								class143.drawMinimap(var10, var12, var13, var11); // L: 9905
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9906
								continue; // L: 9907
							}

							if (var10.contentType == 1339) { // L: 9909
								class122.drawCompass(var10, var12, var13, var11); // L: 9910
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9911
								continue; // L: 9912
							}

							if (var10.contentType == 1400) { // L: 9914
								ClientPacket.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9915
							}

							if (var10.contentType == 1401) { // L: 9917
								ClientPacket.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9918
							}

							if (var10.contentType == 1402) { // L: 9920
								class259.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9921
							}
						}

						if (var10.type == 0) { // L: 9924
							if (!var10.isIf3 && Tiles.isComponentHidden(var10) && var10 != class113.mousedOverWidgetIf1) { // L: 9925
								continue;
							}

							if (!var10.isIf3) { // L: 9926
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9927
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9928
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9930
							if (var10.children != null) { // L: 9931
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9932
							if (var30 != null) { // L: 9933
								Message.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9934
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9936
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9937
						} else if (var10.type == 11) { // L: 9939
							if (Tiles.isComponentHidden(var10) && var10 != class113.mousedOverWidgetIf1) { // L: 9940
								continue;
							}

							if (var10.children != null) { // L: 9941
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9942
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9943
						}

						if (Client.isResizable || Client.field700[var11] || Client.gameDrawingMode > 1) { // L: 9945
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9946 9947
								class433.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9949
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9952
									var19 = 0; // L: 9953

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9954
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9955
											var22 = var12 + var21 * (var10.paddingX + 32); // L: 9956
											var23 = var13 + var20 * (var10.paddingY + 32); // L: 9957
											if (var19 < 20) { // L: 9958
												var22 += var10.inventoryXOffsets[var19]; // L: 9959
												var23 += var10.inventoryYOffsets[var19]; // L: 9960
											}

											if (var10.itemIds[var19] <= 0) { // L: 9962
												if (var10.inventorySprites != null && var19 < 20) { // L: 10007
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 10008
													if (var46 != null) { // L: 10009
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3355) { // L: 10010
														class125.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9963
												boolean var38 = false; // L: 9964
												var26 = var10.itemIds[var19] - 1; // L: 9965
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class16.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9966
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == class67.selectedItemSlot && var10.id == class150.selectedItemWidget) { // L: 9968
														var35 = class83.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class83.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9969
													}

													if (var35 != null) { // L: 9970
														if (var10 == class16.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9971
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9972
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9973
															if (var24 < 5 && var24 > -5) { // L: 9974
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9975
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9976
																var24 = 0; // L: 9977
																var25 = 0; // L: 9978
															}

															var35.drawTransAt(var22 + var24, var25 + var23, 128); // L: 9980
															if (var1 != -1) { // L: 9981
																Widget var28 = var0[var1 & 65535]; // L: 9982
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9983
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field599 / 3; // L: 9984
																	if (var29 > Client.field599 * 10) { // L: 9985
																		var29 = Client.field599 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9986
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9987
																	Client.draggedWidgetY += var29; // L: 9988
																	class125.invalidateWidget(var28); // L: 9989
																}

																if (var23 + var25 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9991
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field599 / 3; // L: 9992
																	if (var29 > Client.field599 * 10) { // L: 9993
																		var29 = Client.field599 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9994
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9995
																	Client.draggedWidgetY -= var29; // L: 9996
																	class125.invalidateWidget(var28); // L: 9997
																}
															}
														} else if (var10 == WallObject.field2634 && var19 == Client.field594) { // L: 10001
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 10002
														}
													} else {
														class125.invalidateWidget(var10); // L: 10004
													}
												}
											}

											++var19; // L: 10012
										}
									}
								} else if (var10.type == 3) { // L: 10017
									if (WorldMapRegion.runCs1(var10)) { // L: 10019
										var19 = var10.color2; // L: 10020
										if (var10 == class113.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10021
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10024
										if (var10 == class113.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10025
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10027
										switch(var10.fillMode.field4783) { // L: 10028
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10037
											break; // L: 10038
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10030
											break; // L: 10031
										default:
											if (var14 == 0) { // L: 10033
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10034
											}
										}
									} else if (var14 == 0) { // L: 10042
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10043
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10047
										var39 = var10.getFont(); // L: 10048
										if (var39 == null) { // L: 10049
											if (Widget.field3355) { // L: 10050
												class125.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10054
											if (WorldMapRegion.runCs1(var10)) { // L: 10055
												var20 = var10.color2; // L: 10056
												if (var10 == class113.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10057
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10058
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10061
												if (var10 == class113.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10062
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10064
												ItemComposition var45 = AttackOption.ItemComposition_get(var10.itemId); // L: 10065
												var44 = var45.name; // L: 10066
												if (var44 == null) { // L: 10067
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10068
													var44 = Clock.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + ArchiveLoader.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10070
												var44 = "Please wait..."; // L: 10071
												var20 = var10.color; // L: 10072
											}

											if (!var10.isIf3) { // L: 10074
												var44 = Decimator.method1006(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10075
										}
									} else if (var10.type == 5) { // L: 10078
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10079
											var40 = var10.getSprite(WorldMapRegion.runCs1(var10), MilliClock.urlRequester); // L: 10080
											if (var40 != null) { // L: 10081
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3355) { // L: 10082
												class125.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10086
												var40 = class83.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, MilliClock.urlRequester); // L: 10087
											}

											if (var40 == null) { // L: 10088
												if (Widget.field3355) { // L: 10112
													class125.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10089
												var21 = var40.height; // L: 10090
												if (!var10.spriteTiling) { // L: 10091
													var22 = var10.width * 4096 / var20; // L: 10105
													if (var10.spriteAngle != 0) { // L: 10106
														var40.method8094(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10107
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10108
														var40.drawTransBgAt(var12, var13); // L: 10109
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10092
													var22 = (var20 - 1 + var10.width) / var20; // L: 10093
													var23 = (var21 - 1 + var10.height) / var21; // L: 10094

													for (var24 = 0; var24 < var22; ++var24) { // L: 10095
														for (var25 = 0; var25 < var23; ++var25) { // L: 10096
															if (var10.spriteAngle != 0) { // L: 10097
																var40.method8094(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10098
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10099
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10102
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10116
											boolean var36 = WorldMapRegion.runCs1(var10); // L: 10117
											if (var36) { // L: 10119
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10120
											}

											Model var41 = null; // L: 10121
											var22 = 0; // L: 10122
											if (var10.itemId != -1) { // L: 10123
												var33 = AttackOption.ItemComposition_get(var10.itemId); // L: 10124
												if (var33 != null) { // L: 10125
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10126
													var41 = var33.getModel(1); // L: 10127
													if (var41 != null) { // L: 10128
														var41.calculateBoundsCylinder(); // L: 10129
														var22 = var41.height / 2; // L: 10130
													} else {
														class125.invalidateWidget(var10); // L: 10132
													}
												}
											} else if (var10.modelType == 5) { // L: 10135
												if (var10.modelId == 0) { // L: 10136
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = ScriptFrame.localPlayer.getModel(); // L: 10137
												}
											} else if (var20 == -1) { // L: 10139
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, ScriptFrame.localPlayer.appearance); // L: 10140
												if (var41 == null && Widget.field3355) { // L: 10141
													class125.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ByteArrayPool.SequenceDefinition_get(var20); // L: 10144
												var41 = var10.getModel(var47, var10.modelFrame, var36, ScriptFrame.localPlayer.appearance); // L: 10145
												if (var41 == null && Widget.field3355) { // L: 10146
													class125.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4009(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10148
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10149
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10150
											if (var41 != null) { // L: 10151
												if (!var10.isIf3) { // L: 10152
													var41.method4367(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10154
													if (var10.modelOrthog) { // L: 10155
														var41.method4295(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4367(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10156
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10159
										} else {
											if (var10.type == 7) { // L: 10162
												var39 = var10.getFont(); // L: 10163
												if (var39 == null) { // L: 10164
													if (Widget.field3355) { // L: 10165
														class125.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10168

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10169
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10170
														if (var10.itemIds[var20] > 0) { // L: 10171
															var33 = AttackOption.ItemComposition_get(var10.itemIds[var20] - 1); // L: 10172
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10174
																var34 = Clock.colorStartTag(16748608) + var33.name + "</col>"; // L: 10175
															} else {
																var34 = Clock.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + ArchiveLoader.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var22 * (var10.paddingX + 115) + var12; // L: 10176
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 10177
															if (var10.textXAlignment == 0) { // L: 10178
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10179
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10180
															}
														}

														++var20; // L: 10182
													}
												}
											}

											if (var10.type == 8 && var10 == EnumComposition.field1890 && Client.field640 == Client.field686) { // L: 10186 10187
												var19 = 0; // L: 10188
												var20 = 0; // L: 10189
												Font var31 = ReflectionCheck.fontPlain12; // L: 10190
												String var32 = var10.text; // L: 10191

												String var43;
												for (var32 = Decimator.method1006(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10193 10194 10206
													var24 = var32.indexOf("<br>"); // L: 10195
													if (var24 != -1) { // L: 10196
														var43 = var32.substring(0, var24); // L: 10197
														var32 = var32.substring(var24 + 4); // L: 10198
													} else {
														var43 = var32; // L: 10201
														var32 = ""; // L: 10202
													}

													var25 = var31.stringWidth(var43); // L: 10204
													if (var25 > var19) { // L: 10205
														var19 = var25;
													}
												}

												var19 += 6; // L: 10208
												var20 += 7; // L: 10209
												var24 = var12 + var10.width - 5 - var19; // L: 10210
												var25 = var13 + var10.height + 5; // L: 10211
												if (var24 < var12 + 5) { // L: 10212
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) { // L: 10213
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10214
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10215
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10216
												var32 = var10.text; // L: 10217
												var26 = var25 + var31.ascent + 2; // L: 10218

												for (var32 = Decimator.method1006(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10219 10220 10231
													int var27 = var32.indexOf("<br>"); // L: 10221
													if (var27 != -1) { // L: 10222
														var43 = var32.substring(0, var27); // L: 10223
														var32 = var32.substring(var27 + 4); // L: 10224
													} else {
														var43 = var32; // L: 10227
														var32 = ""; // L: 10228
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10230
												}
											}

											if (var10.type == 9) { // L: 10235
												if (var10.field3450) { // L: 10240
													var19 = var12; // L: 10241
													var20 = var13 + var10.height; // L: 10242
													var21 = var12 + var10.width; // L: 10243
													var22 = var13; // L: 10244
												} else {
													var19 = var12; // L: 10247
													var20 = var13; // L: 10248
													var21 = var12 + var10.width; // L: 10249
													var22 = var13 + var10.height; // L: 10250
												}

												if (var10.lineWid == 1) { // L: 10252
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10253
												} else {
													MouseRecorder.method2071(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10256
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 10261
}
