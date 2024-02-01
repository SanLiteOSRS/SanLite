import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class102 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -663291201
	)
	int field1325;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1464924907
	)
	int field1320;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1085336523
	)
	int field1323;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 480284071
	)
	int field1326;

	class102(int var1, int var2, int var3, int var4) {
		this.field1325 = var1; // L: 10
		this.field1320 = var2; // L: 11
		this.field1323 = var3; // L: 12
		this.field1326 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "112345757"
	)
	int method2727() {
		return this.field1325; // L: 17
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-936199967"
	)
	int method2729() {
		return this.field1320; // L: 21
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1235918691"
	)
	int method2728() {
		return this.field1323; // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1179665689"
	)
	int method2730() {
		return this.field1326; // L: 29
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-409949693"
	)
	static void method2736() {
		int var0;
		if (class92.field1139 == Client.field528) { // L: 1493
			GrandExchangeOfferOwnWorldComparator.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1494

			for (var0 = 0; var0 < 4; ++var0) { // L: 1495
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			class482.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1496
			Login.Login_loadingText = "Starting game engine..."; // L: 1497
			Login.Login_loadingPercent = 5; // L: 1498
			Client.field528 = class92.field1129; // L: 1499
		} else if (class92.field1129 == Client.field528) { // L: 1502
			Login.Login_loadingText = "Prepared visibility map"; // L: 1503
			Login.Login_loadingPercent = 10; // L: 1504
			Client.field528 = class92.field1130; // L: 1505
		} else {
			Archive var22;
			if (class92.field1130 == Client.field528) { // L: 1508
				DirectByteArrayCopier.field3862 = ChatChannel.newArchive(0, false, true, true, false); // L: 1509
				class274.field2907 = ChatChannel.newArchive(1, false, true, true, false); // L: 1510
				class36.archive2 = ChatChannel.newArchive(2, true, false, true, false); // L: 1511
				class173.field1820 = ChatChannel.newArchive(3, false, true, true, false); // L: 1512
				class476.archive4 = ChatChannel.newArchive(4, false, true, true, false); // L: 1513
				class30.archive9 = ChatChannel.newArchive(5, true, true, true, false); // L: 1514
				WorldMapSection0.field2587 = ChatChannel.newArchive(6, true, true, true, false); // L: 1515
				MusicPatchNode.field3548 = ChatChannel.newArchive(7, false, true, true, false); // L: 1516
				class19.field94 = ChatChannel.newArchive(8, false, true, true, false); // L: 1517
				class127.field1489 = ChatChannel.newArchive(9, false, true, true, false); // L: 1518
				class189.field1995 = ChatChannel.newArchive(10, false, true, true, false); // L: 1519
				WorldMapDecoration.field2627 = ChatChannel.newArchive(11, false, true, true, false); // L: 1520
				WorldMapDecorationType.archive12 = ChatChannel.newArchive(12, false, true, true, false); // L: 1521
				HitSplatDefinition.archive13 = ChatChannel.newArchive(13, true, false, true, false); // L: 1522
				class314.field3428 = ChatChannel.newArchive(14, false, true, true, false); // L: 1523
				DynamicObject.field994 = ChatChannel.newArchive(15, false, true, true, false); // L: 1524
				class189.field1999 = ChatChannel.newArchive(17, true, true, true, false); // L: 1525
				class130.field1521 = ChatChannel.newArchive(18, false, true, true, false); // L: 1526
				PacketBufferNode.field3284 = ChatChannel.newArchive(19, false, true, true, false); // L: 1527
				class142.field1632 = ChatChannel.newArchive(20, false, true, true, false); // L: 1528
				class18.field80 = ChatChannel.newArchive(21, false, true, true, false); // L: 1529
				ArchiveDisk var32 = null; // L: 1532
				if (JagexCache.JagexCache_dat2File != null) { // L: 1533
					var32 = new ArchiveDisk(22, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[22], 1000000); // L: 1534
				}

				var22 = new Archive(var32, class357.field3922, UrlRequester.field1418, 22, false, true, true, true, true); // L: 1536
				class208.field2281 = var22; // L: 1538
				Login.Login_loadingText = "Connecting to update server"; // L: 1539
				Login.Login_loadingPercent = 20; // L: 1540
				Client.field528 = class92.field1144; // L: 1541
			} else if (Client.field528 == class92.field1144) { // L: 1544
				byte var43 = 0; // L: 1545
				var0 = var43 + DirectByteArrayCopier.field3862.percentage() * 4 / 100; // L: 1546
				var0 += class274.field2907.percentage() * 4 / 100; // L: 1547
				var0 += class36.archive2.percentage() * 2 / 100; // L: 1548
				var0 += class173.field1820.percentage() * 2 / 100; // L: 1549
				var0 += class476.archive4.percentage() * 6 / 100; // L: 1550
				var0 += class30.archive9.percentage() * 4 / 100; // L: 1551
				var0 += WorldMapSection0.field2587.percentage() * 2 / 100; // L: 1552
				var0 += MusicPatchNode.field3548.percentage() * 54 / 100; // L: 1553
				var0 += class19.field94.percentage() * 2 / 100; // L: 1554
				var0 += class127.field1489.percentage() * 2 / 100; // L: 1555
				var0 += class189.field1995.percentage() * 2 / 100; // L: 1556
				var0 += WorldMapDecoration.field2627.percentage() * 2 / 100; // L: 1557
				var0 += WorldMapDecorationType.archive12.percentage() * 2 / 100; // L: 1558
				var0 += HitSplatDefinition.archive13.percentage() * 2 / 100; // L: 1559
				var0 += class314.field3428.percentage() * 2 / 100; // L: 1560
				var0 += DynamicObject.field994.percentage() * 2 / 100; // L: 1561
				var0 += PacketBufferNode.field3284.percentage() / 100; // L: 1562
				var0 += class130.field1521.percentage() / 100; // L: 1563
				var0 += class142.field1632.percentage() / 100; // L: 1564
				var0 += class18.field80.percentage() / 100; // L: 1565
				var0 += class208.field2281.percentage() / 100; // L: 1566
				var0 += class189.field1999.method6983() && class189.field1999.isFullyLoaded() ? 1 : 0; // L: 1567
				if (var0 != 100) { // L: 1568
					if (var0 != 0) { // L: 1569
						Login.Login_loadingText = "Checking for updates - " + var0 + "%";
					}

					Login.Login_loadingPercent = 30; // L: 1570
				} else {
					HealthBarUpdate.method2491(DirectByteArrayCopier.field3862, "Animations"); // L: 1573
					HealthBarUpdate.method2491(class274.field2907, "Skeletons"); // L: 1574
					HealthBarUpdate.method2491(class476.archive4, "Sound FX"); // L: 1575
					HealthBarUpdate.method2491(class30.archive9, "Maps"); // L: 1576
					HealthBarUpdate.method2491(WorldMapSection0.field2587, "Music Tracks"); // L: 1577
					HealthBarUpdate.method2491(MusicPatchNode.field3548, "Models"); // L: 1578
					HealthBarUpdate.method2491(class19.field94, "Sprites"); // L: 1579
					HealthBarUpdate.method2491(WorldMapDecoration.field2627, "Music Jingles"); // L: 1580
					HealthBarUpdate.method2491(class314.field3428, "Music Samples"); // L: 1581
					HealthBarUpdate.method2491(DynamicObject.field994, "Music Patches"); // L: 1582
					HealthBarUpdate.method2491(PacketBufferNode.field3284, "World Map"); // L: 1583
					HealthBarUpdate.method2491(class130.field1521, "World Map Geography"); // L: 1584
					HealthBarUpdate.method2491(class142.field1632, "World Map Ground"); // L: 1585
					class322.field3517 = new GraphicsDefaults(); // L: 1586
					class322.field3517.decode(class189.field1999); // L: 1587
					Login.Login_loadingText = "Loaded update list"; // L: 1588
					Login.Login_loadingPercent = 30; // L: 1589
					Client.field528 = class92.field1132; // L: 1590
				}
			} else {
				Archive var7;
				Archive var23;
				if (class92.field1132 == Client.field528) { // L: 1593
					boolean var42 = !Client.isLowDetail; // L: 1594
					class189.field1993 = 486202500; // L: 1597
					class462.PcmPlayer_stereo = var42; // L: 1598
					class19.field99 = 2; // L: 1599
					ArrayList var31 = new ArrayList(3); // L: 1601
					TaskHandler var36 = GameEngine.taskHandler; // L: 1603
					short var38 = 2048; // L: 1604
					if (var38 < 256) { // L: 1608
						var38 = 256;
					}

					PcmPlayer var34;
					try {
						PcmPlayer var39 = WallObject.pcmPlayerProvider.player(); // L: 1610
						var39.samples = new int[256 * (class462.PcmPlayer_stereo ? 2 : 1)]; // L: 1611
						var39.field288 = var38; // L: 1612
						var39.init(); // L: 1613
						var39.capacity = (var38 & -1024) + 1024; // L: 1614
						if (var39.capacity > 16384) { // L: 1615
							var39.capacity = 16384;
						}

						var39.open(var39.capacity); // L: 1616
						if (class19.field99 > 0 && PcmPlayer.soundSystem == null) { // L: 1617
							PcmPlayer.soundSystem = new SoundSystem(); // L: 1618
							PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1619
							PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1620
						}

						if (PcmPlayer.soundSystem != null) { // L: 1622
							if (PcmPlayer.soundSystem.players[0] != null) { // L: 1623
								throw new IllegalArgumentException();
							}

							PcmPlayer.soundSystem.players[0] = var39; // L: 1624
						}

						var34 = var39; // L: 1626
					} catch (Throwable var30) { // L: 1629
						var34 = new PcmPlayer(); // L: 1630
					}

					WorldMap.pcmPlayer1 = var34; // L: 1632
					ClanSettings.pcmStreamMixer = new PcmStreamMixer(); // L: 1633
					PcmStreamMixer var40 = new PcmStreamMixer(); // L: 1634
					var40.addSubStream(ClanSettings.pcmStreamMixer); // L: 1635

					for (int var6 = 0; var6 < 3; ++var6) { // L: 1636
						MidiPcmStream var41 = new MidiPcmStream(); // L: 1637
						var41.method6080(9, 128); // L: 1638
						var40.addSubStream(var41); // L: 1639
						var31.add(var41); // L: 1640
					}

					WorldMap.pcmPlayer1.setStream(var40); // L: 1642
					var23 = DynamicObject.field994; // L: 1643
					var7 = class314.field3428; // L: 1644
					Archive var8 = class476.archive4; // L: 1645
					class319.field3458 = var23; // L: 1647
					class319.field3455 = var7; // L: 1648
					class319.field3456 = var8; // L: 1649
					class319.field3457 = var31; // L: 1650
					UrlRequest.decimator = new Decimator(22050, class189.field1993 * 22050); // L: 1652
					Login.Login_loadingText = "Prepared sound engine"; // L: 1653
					Login.Login_loadingPercent = 35; // L: 1654
					Client.field528 = class92.field1136; // L: 1655
					WorldMapData_1.field2557 = new Fonts(class19.field94, HitSplatDefinition.archive13); // L: 1656
				} else {
					int var24;
					if (Client.field528 == class92.field1136) { // L: 1659
						FontName[] var46 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12}; // L: 1662
						var24 = var46.length; // L: 1664
						Fonts var33 = WorldMapData_1.field2557; // L: 1665
						FontName[] var35 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12}; // L: 1668
						Client.field565 = var33.createMap(var35); // L: 1670
						if (Client.field565.size() < var24) { // L: 1671
							Login.Login_loadingText = "Loading fonts - " + Client.field565.size() * 100 / var24 + "%"; // L: 1672
							Login.Login_loadingPercent = 40; // L: 1673
						} else {
							UserComparator5.field1453 = (Font)Client.field565.get(FontName.FontName_plain11); // L: 1676
							class339.fontPlain12 = (Font)Client.field565.get(FontName.FontName_plain12); // L: 1677
							class90.fontBold12 = (Font)Client.field565.get(FontName.FontName_bold12); // L: 1678
							FriendSystem.field823 = Client.field529.get(); // L: 1679
							Login.Login_loadingText = "Loaded fonts"; // L: 1680
							Login.Login_loadingPercent = 40; // L: 1681
							Client.field528 = class92.field1133; // L: 1682
						}
					} else {
						Archive var1;
						Archive var2;
						int var25;
						int var37;
						if (class92.field1133 == Client.field528) { // L: 1685
							var1 = class189.field1995; // L: 1687
							var2 = class19.field94; // L: 1688
							var25 = 0; // L: 1690
							String[] var26 = Login.field941; // L: 1692

							int var27;
							String var47;
							for (var27 = 0; var27 < var26.length; ++var27) { // L: 1693
								var47 = var26[var27]; // L: 1694
								if (var1.tryLoadFileByNames(var47, "")) { // L: 1696
									++var25; // L: 1697
								}
							}

							var26 = Login.field942; // L: 1703

							for (var27 = 0; var27 < var26.length; ++var27) { // L: 1704
								var47 = var26[var27]; // L: 1705
								if (var2.tryLoadFileByNames(var47, "")) { // L: 1707
									++var25; // L: 1708
								}
							}

							var26 = Login.field943; // L: 1714

							for (var27 = 0; var27 < var26.length; ++var27) { // L: 1715
								var47 = var26[var27]; // L: 1716
								if (var2.getGroupId(var47) != -1 && var2.tryLoadFileByNames(var47, "")) { // L: 1718
									++var25; // L: 1719
								}
							}

							var37 = class373.method7026(class19.field94); // L: 1727
							if (var25 < var37) { // L: 1728
								Login.Login_loadingText = "Loading title screen - " + var25 * 100 / var37 + "%"; // L: 1729
								Login.Login_loadingPercent = 50; // L: 1730
							} else {
								Login.Login_loadingText = "Loaded title screen"; // L: 1733
								Login.Login_loadingPercent = 50; // L: 1734
								class131.method3087(5); // L: 1735
								Client.field528 = class92.field1135; // L: 1736
							}
						} else if (Client.field528 != class92.field1135) { // L: 1739
							if (Client.field528 == class92.field1140) { // L: 1844
								var0 = 0; // L: 1845
								if (DecorativeObject.field3121 == null) { // L: 1846
									DecorativeObject.field3121 = class135.SpriteBuffer_getSprite(class19.field94, class322.field3517.field4779, 0);
								} else {
									++var0; // L: 1847
								}

								if (class149.redHintArrowSprite == null) { // L: 1848
									class149.redHintArrowSprite = class135.SpriteBuffer_getSprite(class19.field94, class322.field3517.field4777, 0);
								} else {
									++var0; // L: 1849
								}

								if (WorldMapLabelSize.mapSceneSprites == null) { // L: 1850
									WorldMapLabelSize.mapSceneSprites = class197.method3853(class19.field94, class322.field3517.field4778, 0);
								} else {
									++var0; // L: 1851
								}

								if (Actor.field1248 == null) { // L: 1852
									Actor.field1248 = class217.method4289(class19.field94, class322.field3517.field4780, 0);
								} else {
									++var0; // L: 1853
								}

								if (class13.field52 == null) { // L: 1854
									class13.field52 = class217.method4289(class19.field94, class322.field3517.field4781, 0);
								} else {
									++var0; // L: 1855
								}

								if (GrandExchangeOfferOwnWorldComparator.field495 == null) { // L: 1856
									GrandExchangeOfferOwnWorldComparator.field495 = class217.method4289(class19.field94, class322.field3517.field4782, 0);
								} else {
									++var0; // L: 1857
								}

								if (class365.field3973 == null) { // L: 1858
									class365.field3973 = class217.method4289(class19.field94, class322.field3517.field4783, 0);
								} else {
									++var0; // L: 1859
								}

								if (Players.field1346 == null) { // L: 1860
									Players.field1346 = class217.method4289(class19.field94, class322.field3517.field4784, 0);
								} else {
									++var0; // L: 1861
								}

								if (class142.field1634 == null) { // L: 1862
									class142.field1634 = class217.method4289(class19.field94, class322.field3517.field4785, 0);
								} else {
									++var0; // L: 1863
								}

								if (class359.scrollBarSprites == null) { // L: 1864
									class359.scrollBarSprites = class197.method3853(class19.field94, class322.field3517.field4786, 0);
								} else {
									++var0; // L: 1865
								}

								if (class20.field104 == null) { // L: 1866
									class20.field104 = class197.method3853(class19.field94, class322.field3517.field4787, 0);
								} else {
									++var0; // L: 1867
								}

								if (var0 < 11) { // L: 1868
									Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%"; // L: 1869
									Login.Login_loadingPercent = 70; // L: 1870
								} else {
									AbstractFont.AbstractFont_modIconSprites = class20.field104; // L: 1873
									class149.redHintArrowSprite.normalize(); // L: 1874
									var24 = (int)(Math.random() * 21.0D) - 10; // L: 1875
									int var29 = (int)(Math.random() * 21.0D) - 10; // L: 1876
									var25 = (int)(Math.random() * 21.0D) - 10; // L: 1877
									var37 = (int)(Math.random() * 41.0D) - 20; // L: 1878
									WorldMapLabelSize.mapSceneSprites[0].shiftColors(var37 + var24, var29 + var37, var25 + var37); // L: 1879
									Login.Login_loadingText = "Loaded sprites"; // L: 1880
									Login.Login_loadingPercent = 70; // L: 1881
									Client.field528 = class92.field1131; // L: 1882
								}
							} else if (class92.field1131 == Client.field528) { // L: 1885
								if (!class127.field1489.isFullyLoaded()) { // L: 1886
									Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1887
									Login.Login_loadingPercent = 90; // L: 1888
								} else {
									ItemContainer.field1036 = new TextureProvider(class127.field1489, class19.field94, 20, class93.clientPreferences.method2548(), Client.isLowDetail ? 64 : 128); // L: 1891
									Rasterizer3D.method5248(ItemContainer.field1036); // L: 1892
									Rasterizer3D.method5296(class93.clientPreferences.method2548()); // L: 1893
									Client.field528 = class92.field1137; // L: 1894
								}
							} else if (Client.field528 == class92.field1137) { // L: 1897
								var0 = ItemContainer.field1036.getLoadedPercentage(); // L: 1898
								if (var0 < 100) { // L: 1899
									Login.Login_loadingText = "Loading textures - " + var0 + "%"; // L: 1900
									Login.Login_loadingPercent = 90; // L: 1901
								} else {
									Login.Login_loadingText = "Loaded textures"; // L: 1904
									Login.Login_loadingPercent = 90; // L: 1905
									Client.field528 = class92.field1141; // L: 1906
								}
							} else if (Client.field528 == class92.field1141) { // L: 1909
								Canvas.mouseRecorder = new MouseRecorder(); // L: 1910
								GameEngine.taskHandler.newThreadTask(Canvas.mouseRecorder, 10); // L: 1911
								Login.Login_loadingText = "Loaded input handler"; // L: 1912
								Login.Login_loadingPercent = 92; // L: 1913
								Client.field528 = class92.field1128; // L: 1914
							} else if (Client.field528 == class92.field1128) { // L: 1917
								if (!class189.field1995.tryLoadFileByNames("huffman", "")) { // L: 1918
									Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1919
									Login.Login_loadingPercent = 94; // L: 1920
								} else {
									Huffman var45 = new Huffman(class189.field1995.takeFileByNames("huffman", "")); // L: 1923
									class211.method4228(var45); // L: 1924
									Login.Login_loadingText = "Loaded wordpack"; // L: 1925
									Login.Login_loadingPercent = 94; // L: 1926
									Client.field528 = class92.field1138; // L: 1927
								}
							} else if (Client.field528 == class92.field1138) { // L: 1930
								if (!class173.field1820.isFullyLoaded()) { // L: 1931
									Login.Login_loadingText = "Loading interfaces - " + class173.field1820.loadPercent() * 4 / 5 + "%"; // L: 1932
									Login.Login_loadingPercent = 96; // L: 1933
								} else if (!class208.field2281.isFullyLoaded()) { // L: 1936
									Login.Login_loadingText = "Loading interfaces - " + class208.field2281.loadPercent() * 4 / 5 + "%"; // L: 1937
									Login.Login_loadingPercent = 96; // L: 1938
								} else if (!WorldMapDecorationType.archive12.isFullyLoaded()) { // L: 1941
									Login.Login_loadingText = "Loading interfaces - " + (80 + WorldMapDecorationType.archive12.loadPercent() / 6) + "%"; // L: 1942
									Login.Login_loadingPercent = 96; // L: 1943
								} else if (!HitSplatDefinition.archive13.isFullyLoaded()) { // L: 1946
									Login.Login_loadingText = "Loading interfaces - " + (96 + HitSplatDefinition.archive13.loadPercent() / 50) + "%"; // L: 1947
									Login.Login_loadingPercent = 96; // L: 1948
								} else {
									Login.Login_loadingText = "Loaded interfaces"; // L: 1951
									Login.Login_loadingPercent = 98; // L: 1952
									if (WorldMapDecorationType.archive12.isValidFileName("version.dat", "")) { // L: 1953
										Buffer var44 = new Buffer(WorldMapDecorationType.archive12.takeFileByNames("version.dat", "")); // L: 1954
										var44.readUnsignedShort(); // L: 1955
									}

									Client.field528 = class92.field1142; // L: 1957
								}
							} else if (class92.field1142 == Client.field528) { // L: 1960
								Login.Login_loadingPercent = 100; // L: 1961
								if (PacketBufferNode.field3284.getGroupCount() > 0 && !PacketBufferNode.field3284.tryLoadGroupByName(WorldMapCacheName.field2669.name)) { // L: 1962
									Login.Login_loadingText = "Loading world map - " + PacketBufferNode.field3284.groupLoadPercentByName(WorldMapCacheName.field2669.name) / 10 + "%"; // L: 1963
								} else {
									if (GrandExchangeOfferUnitPriceComparator.worldMap == null) { // L: 1966
										GrandExchangeOfferUnitPriceComparator.worldMap = new WorldMap(); // L: 1967
										GrandExchangeOfferUnitPriceComparator.worldMap.init(PacketBufferNode.field3284, class130.field1521, class142.field1632, class90.fontBold12, Client.field565, WorldMapLabelSize.mapSceneSprites); // L: 1968
									}

									Login.Login_loadingText = "Loaded world map"; // L: 1970
									Client.field528 = class92.field1143; // L: 1971
								}
							} else {
								if (Client.field528 == class92.field1143) { // L: 1974
									class131.method3087(10); // L: 1975
								}

							}
						} else if (!class36.archive2.isFullyLoaded()) { // L: 1740
							Login.Login_loadingText = "Loading config - " + class36.archive2.loadPercent() + "%"; // L: 1741
							Login.Login_loadingPercent = 60; // L: 1742
						} else if (!class18.field80.isFullyLoaded()) { // L: 1745
							Login.Login_loadingText = "Loading config - " + (80 + WorldMapDecorationType.archive12.loadPercent() / 6) + "%"; // L: 1746
							Login.Login_loadingPercent = 60; // L: 1747
						} else {
							ArchiveLoader.method2326(class36.archive2); // L: 1750
							HitSplatDefinition.method3901(class36.archive2); // L: 1751
							var22 = class36.archive2; // L: 1752
							var1 = MusicPatchNode.field3548; // L: 1753
							KitDefinition.KitDefinition_archive = var22; // L: 1755
							KitDefinition.KitDefinition_modelsArchive = var1; // L: 1756
							KitDefinition.field1871 = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1757
							var2 = class36.archive2; // L: 1759
							Archive var3 = MusicPatchNode.field3548; // L: 1760
							boolean var4 = Client.isLowDetail; // L: 1761
							ObjectComposition.ObjectDefinition_archive = var2; // L: 1763
							ObjectComposition.ObjectDefinition_modelsArchive = var3; // L: 1764
							ObjectComposition.ObjectDefinition_isLowDetail = var4; // L: 1765
							class13.method171(class36.archive2, MusicPatchNode.field3548); // L: 1767
							Archive var5 = class36.archive2; // L: 1768
							StructComposition.StructDefinition_archive = var5; // L: 1770
							var23 = class36.archive2; // L: 1772
							var7 = MusicPatchNode.field3548; // L: 1773
							boolean var28 = Client.isMembersWorld; // L: 1774
							Font var9 = UserComparator5.field1453; // L: 1775
							ItemComposition.ItemComposition_archive = var23; // L: 1777
							class166.ItemComposition_modelArchive = var7; // L: 1778
							class507.ItemComposition_inMembersWorld = var28; // L: 1779
							ViewportMouse.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 1780
							ItemComposition.field2158 = var9; // L: 1781
							class187.method3715(class36.archive2, DirectByteArrayCopier.field3862, class274.field2907); // L: 1783
							class127.method3027(class36.archive2, MusicPatchNode.field3548); // L: 1784
							GrandExchangeOfferOwnWorldComparator.method1248(class36.archive2); // L: 1785
							DynamicObject.method2255(class36.archive2); // L: 1786
							class380.field4414 = new class338(class173.field1820, MusicPatchNode.field3548, class19.field94, HitSplatDefinition.archive13, class208.field2281); // L: 1787
							AbstractSocket.method8404(class36.archive2); // L: 1788
							Archive var10 = class36.archive2; // L: 1789
							EnumComposition.EnumDefinition_archive = var10; // L: 1791
							Archive var11 = class36.archive2; // L: 1793
							VarcInt.VarcInt_archive = var11; // L: 1795
							MusicPatchNode2.method6040(class36.archive2); // L: 1797
							class309.method5984(class36.archive2); // L: 1798
							Archive var12 = class36.archive2; // L: 1799
							class521.field5118 = var12; // L: 1801
							class436.method8118(class36.archive2); // L: 1803
							Language.Widget_cachedModels = new class513(class1.field3, 54, class92.clientLanguage, class36.archive2); // L: 1804
							class176.Widget_cachedFonts = new class513(class1.field3, 47, class92.clientLanguage, class36.archive2); // L: 1805
							ClientPreferences.varcs = new Varcs(); // L: 1806
							Archive var13 = class36.archive2; // L: 1807
							Archive var14 = class19.field94; // L: 1808
							Archive var15 = HitSplatDefinition.archive13; // L: 1809
							HitSplatDefinition.HitSplatDefinition_archive = var13; // L: 1811
							GrandExchangeOfferWorldComparator.field4417 = var14; // L: 1812
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var15; // L: 1813
							Archive var16 = class36.archive2; // L: 1815
							Archive var17 = class19.field94; // L: 1816
							HealthBarDefinition.HealthBarDefinition_archive = var16; // L: 1818
							HealthBarDefinition.field1884 = var17; // L: 1819
							Archive var18 = class36.archive2; // L: 1821
							Archive var19 = class19.field94; // L: 1822
							WorldMapElement.WorldMapElement_archive = var19; // L: 1824
							if (var18.isFullyLoaded()) { // L: 1825
								class152.WorldMapElement_count = var18.getGroupFileCount(35); // L: 1828
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[class152.WorldMapElement_count]; // L: 1829

								for (int var20 = 0; var20 < class152.WorldMapElement_count; ++var20) { // L: 1830
									byte[] var21 = var18.takeFile(35, var20); // L: 1831
									WorldMapElement.WorldMapElement_cached[var20] = new WorldMapElement(var20); // L: 1832
									if (var21 != null) { // L: 1833
										WorldMapElement.WorldMapElement_cached[var20].decode(new Buffer(var21)); // L: 1834
										WorldMapElement.WorldMapElement_cached[var20].method3594(); // L: 1835
									}
								}
							}

							Login.Login_loadingText = "Loaded config"; // L: 1839
							Login.Login_loadingPercent = 60; // L: 1840
							Client.field528 = class92.field1140; // L: 1841
						}
					}
				}
			}
		}
	} // L: 1500 1506 1542 1571 1591 1657 1674 1683 1731 1737 1743 1748 1842 1871 1883 1889 1895 1902 1907 1915 1921 1928 1934 1939 1944 1949 1958 1964 1972 1977

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-832468918"
	)
	static final void method2732(int var0, int var1, int var2, int var3) {
		Client.field601 = 0; // L: 5609
		boolean var4 = false; // L: 5610
		int var5 = -1; // L: 5611
		int var6 = -1; // L: 5612
		int var7 = Players.Players_count; // L: 5613
		int[] var8 = Players.Players_indices; // L: 5614

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5615
			Object var22;
			if (var9 < var7) { // L: 5617
				var22 = Client.players[var8[var9]]; // L: 5618
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5619
					var4 = true; // L: 5620
					var5 = var9; // L: 5621
					continue;
				}

				if (var22 == class25.localPlayer) { // L: 5624
					var6 = var9; // L: 5625
					continue; // L: 5626
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5629
			}

			class386.drawActor2d((Actor)var22, var9, var0, var1, var2, var3); // L: 5630
		}

		if (Client.field628 && var6 != -1) { // L: 5632
			class386.drawActor2d(class25.localPlayer, var6, var0, var1, var2, var3); // L: 5633
		}

		if (var4) { // L: 5635
			class386.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5636
		}

		for (var9 = 0; var9 < Client.field601; ++var9) { // L: 5638
			int var10 = Client.field710[var9]; // L: 5639
			int var11 = Client.field604[var9]; // L: 5640
			int var12 = Client.field606[var9]; // L: 5641
			int var13 = Client.field605[var9]; // L: 5642
			boolean var14 = true; // L: 5643

			while (var14) {
				var14 = false; // L: 5645

				for (int var21 = 0; var21 < var9; ++var21) { // L: 5646
					if (var11 + 2 > Client.field604[var21] - Client.field605[var21] && var11 - var13 < Client.field604[var21] + 2 && var10 - var12 < Client.field606[var21] + Client.field710[var21] && var10 + var12 > Client.field710[var21] - Client.field606[var21] && Client.field604[var21] - Client.field605[var21] < var11) { // L: 5647 5648
						var11 = Client.field604[var21] - Client.field605[var21]; // L: 5649
						var14 = true; // L: 5650
					}
				}
			}

			Client.viewportTempX = Client.field710[var9]; // L: 5655
			Client.viewportTempY = Client.field604[var9] = var11; // L: 5656
			String var15 = Client.field611[var9]; // L: 5657
			if (Client.chatEffects == 0) { // L: 5658
				int var16 = 16776960; // L: 5659
				if (Client.field795[var9] < 6) { // L: 5660
					var16 = Client.field656[Client.field795[var9]];
				}

				if (Client.field795[var9] == 6) { // L: 5661
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field795[var9] == 7) { // L: 5662
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field795[var9] == 8) { // L: 5663
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field795[var9] == 9) { // L: 5664
					var17 = 150 - Client.field610[var9]; // L: 5665
					if (var17 < 50) { // L: 5666
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5667
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5668
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field795[var9] == 10) { // L: 5670
					var17 = 150 - Client.field610[var9]; // L: 5671
					if (var17 < 50) { // L: 5672
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5673
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5674
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field795[var9] == 11) { // L: 5676
					var17 = 150 - Client.field610[var9]; // L: 5677
					if (var17 < 50) { // L: 5678
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5679
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5680
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field795[var9] == 12 && Client.field609[var9] == null) { // L: 5682 5683
					var17 = var15.length(); // L: 5684
					Client.field609[var9] = new int[var17]; // L: 5685

					for (var18 = 0; var18 < var17; ++var18) { // L: 5686
						int var19 = (int)((float)var18 / (float)var17 * 64.0F); // L: 5687
						int var20 = var19 << 10 | 896 | 64; // L: 5688
						Client.field609[var9][var18] = class482.field4871[var20]; // L: 5689
					}
				}

				if (Client.field752[var9] == 0) { // L: 5693
					class90.fontBold12.method7854(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field609[var9]);
				}

				if (Client.field752[var9] == 1) { // L: 5694
					class90.fontBold12.method7769(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field609[var9]);
				}

				if (Client.field752[var9] == 2) { // L: 5695
					class90.fontBold12.method7770(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field609[var9]);
				}

				if (Client.field752[var9] == 3) { // L: 5696
					class90.fontBold12.method7771(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field610[var9], Client.field609[var9]);
				}

				if (Client.field752[var9] == 4) { // L: 5697
					var17 = (150 - Client.field610[var9]) * (class90.fontBold12.stringWidth(var15) + 100) / 150; // L: 5698
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5699
					class90.fontBold12.method7773(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field609[var9]); // L: 5700
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5701
				}

				if (Client.field752[var9] == 5) { // L: 5703
					var17 = 150 - Client.field610[var9]; // L: 5704
					var18 = 0; // L: 5705
					if (var17 < 25) { // L: 5706
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5707
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class90.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5708
					class90.fontBold12.method7854(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field609[var9]); // L: 5709
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5710
				}
			} else {
				class90.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5714
			}
		}

	} // L: 5717

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1846118605"
	)
	static final void method2738(int var0) {
		int[] var1 = class482.sceneMinimapSprite.pixels; // L: 6179
		int var2 = var1.length; // L: 6180

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6181
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6182
			var4 = (103 - var3) * 2048 + 24628; // L: 6183

			for (var5 = 1; var5 < 103; ++var5) { // L: 6184
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6185
					GrandExchangeOfferOwnWorldComparator.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6186
					GrandExchangeOfferOwnWorldComparator.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6187
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6190
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6191
		class482.sceneMinimapSprite.setRaster(); // L: 6192

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6193
			for (var6 = 1; var6 < 103; ++var6) { // L: 6194
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6195
					drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6196
					drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6199

		for (var5 = 0; var5 < 104; ++var5) { // L: 6200
			for (var6 = 0; var6 < 104; ++var6) { // L: 6201
				long var7 = GrandExchangeOfferOwnWorldComparator.scene.getGroundObjectTag(class113.Client_plane, var5, var6); // L: 6202
				if (var7 != 0L) { // L: 6203
					int var9 = class167.Entity_unpackID(var7); // L: 6204
					int var10 = class137.getObjectDefinition(var9).mapIconId; // L: 6205
					if (var10 >= 0 && class423.WorldMapElement_get(var10).field1849) { // L: 6206 6207
						Client.mapIcons[Client.mapIconCount] = class423.WorldMapElement_get(var10).getSpriteBool(false); // L: 6210
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 6211
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 6212
						++Client.mapIconCount; // L: 6213
					}
				}
			}
		}

		WorldMapData_1.rasterProvider.apply(); // L: 6219
	} // L: 6221

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1163234687"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = GrandExchangeOfferOwnWorldComparator.scene.getWallObjectTag(var0, var1, var2); // L: 6224
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 6225
			var7 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var1, var2, var5); // L: 6226
			var8 = var7 >> 6 & 3; // L: 6227
			var9 = var7 & 31; // L: 6228
			var10 = var3; // L: 6229
			if (ByteArrayPool.method8033(var5)) { // L: 6230
				var10 = var4;
			}

			int[] var11 = class482.sceneMinimapSprite.pixels; // L: 6231
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6232
			var13 = class167.Entity_unpackID(var5); // L: 6233
			ObjectComposition var14 = class137.getObjectDefinition(var13); // L: 6234
			if (var14.mapSceneId != -1) { // L: 6235
				IndexedSprite var15 = WorldMapLabelSize.mapSceneSprites[var14.mapSceneId]; // L: 6236
				if (var15 != null) { // L: 6237
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6238
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6239
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48); // L: 6240
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6244
					if (var8 == 0) { // L: 6245
						var11[var12] = var10; // L: 6246
						var11[var12 + 512] = var10; // L: 6247
						var11[var12 + 1024] = var10; // L: 6248
						var11[var12 + 1536] = var10; // L: 6249
					} else if (var8 == 1) { // L: 6251
						var11[var12] = var10; // L: 6252
						var11[var12 + 1] = var10; // L: 6253
						var11[var12 + 2] = var10; // L: 6254
						var11[var12 + 3] = var10; // L: 6255
					} else if (var8 == 2) { // L: 6257
						var11[var12 + 3] = var10; // L: 6258
						var11[var12 + 512 + 3] = var10; // L: 6259
						var11[var12 + 1024 + 3] = var10; // L: 6260
						var11[var12 + 1536 + 3] = var10; // L: 6261
					} else if (var8 == 3) { // L: 6263
						var11[var12 + 1536] = var10; // L: 6264
						var11[var12 + 1536 + 1] = var10; // L: 6265
						var11[var12 + 1536 + 2] = var10; // L: 6266
						var11[var12 + 1536 + 3] = var10; // L: 6267
					}
				}

				if (var9 == 3) { // L: 6270
					if (var8 == 0) { // L: 6271
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6272
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6273
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6274
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6276
					if (var8 == 3) { // L: 6277
						var11[var12] = var10; // L: 6278
						var11[var12 + 512] = var10; // L: 6279
						var11[var12 + 1024] = var10; // L: 6280
						var11[var12 + 1536] = var10; // L: 6281
					} else if (var8 == 0) { // L: 6283
						var11[var12] = var10; // L: 6284
						var11[var12 + 1] = var10; // L: 6285
						var11[var12 + 2] = var10; // L: 6286
						var11[var12 + 3] = var10; // L: 6287
					} else if (var8 == 1) { // L: 6289
						var11[var12 + 3] = var10; // L: 6290
						var11[var12 + 512 + 3] = var10; // L: 6291
						var11[var12 + 1024 + 3] = var10; // L: 6292
						var11[var12 + 1536 + 3] = var10; // L: 6293
					} else if (var8 == 2) { // L: 6295
						var11[var12 + 1536] = var10; // L: 6296
						var11[var12 + 1536 + 1] = var10; // L: 6297
						var11[var12 + 1536 + 2] = var10; // L: 6298
						var11[var12 + 1536 + 3] = var10; // L: 6299
					}
				}
			}
		}

		var5 = GrandExchangeOfferOwnWorldComparator.scene.getGameObjectTag(var0, var1, var2); // L: 6304
		if (var5 != 0L) { // L: 6305
			var7 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var1, var2, var5); // L: 6306
			var8 = var7 >> 6 & 3; // L: 6307
			var9 = var7 & 31; // L: 6308
			var10 = class167.Entity_unpackID(var5); // L: 6309
			ObjectComposition var24 = class137.getObjectDefinition(var10); // L: 6310
			int var19;
			if (var24.mapSceneId != -1) { // L: 6311
				IndexedSprite var20 = WorldMapLabelSize.mapSceneSprites[var24.mapSceneId]; // L: 6312
				if (var20 != null) { // L: 6313
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6314
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6315
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6316
				}
			} else if (var9 == 9) { // L: 6319
				var12 = 15658734; // L: 6320
				if (ByteArrayPool.method8033(var5)) { // L: 6321
					var12 = 15597568;
				}

				int[] var18 = class482.sceneMinimapSprite.pixels; // L: 6322
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6323
				if (var8 != 0 && var8 != 2) { // L: 6324
					var18[var19] = var12; // L: 6331
					var18[var19 + 1 + 512] = var12; // L: 6332
					var18[var19 + 1024 + 2] = var12; // L: 6333
					var18[var19 + 1536 + 3] = var12; // L: 6334
				} else {
					var18[var19 + 1536] = var12; // L: 6325
					var18[var19 + 1 + 1024] = var12; // L: 6326
					var18[var19 + 512 + 2] = var12; // L: 6327
					var18[var19 + 3] = var12; // L: 6328
				}
			}
		}

		var5 = GrandExchangeOfferOwnWorldComparator.scene.getGroundObjectTag(var0, var1, var2); // L: 6338
		if (0L != var5) { // L: 6339
			var7 = class167.Entity_unpackID(var5); // L: 6340
			ObjectComposition var21 = class137.getObjectDefinition(var7); // L: 6341
			if (var21.mapSceneId != -1) { // L: 6342
				IndexedSprite var22 = WorldMapLabelSize.mapSceneSprites[var21.mapSceneId]; // L: 6343
				if (var22 != null) { // L: 6344
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6345
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6346
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 6347
				}
			}
		}

	} // L: 6351

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "94"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12615
		short[] var2 = new short[16]; // L: 12616
		int var3 = 0; // L: 12617

		for (int var4 = 0; var4 < ViewportMouse.ItemComposition_fileCount; ++var4) { // L: 12618
			ItemComposition var9 = class341.ItemComposition_get(var4); // L: 12619
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12620 12621 12622
				if (var3 >= 250) { // L: 12623
					class31.foundItemIdCount = -1; // L: 12624
					class317.foundItemIds = null; // L: 12625
					return; // L: 12626
				}

				if (var3 >= var2.length) { // L: 12628
					short[] var6 = new short[var2.length * 2]; // L: 12629

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12630
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12631
				}

				var2[var3++] = (short)var4; // L: 12633
			}
		}

		class317.foundItemIds = var2; // L: 12635
		class18.foundItemIndex = 0; // L: 12636
		class31.foundItemIdCount = var3; // L: 12637
		String[] var8 = new String[class31.foundItemIdCount]; // L: 12638

		for (int var5 = 0; var5 < class31.foundItemIdCount; ++var5) { // L: 12639
			var8[var5] = class341.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class317.foundItemIds; // L: 12640
		class142.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12642
	} // L: 12644
}
