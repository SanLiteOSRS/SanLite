import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final WorldMapCacheName field2633;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final WorldMapCacheName field2626;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final WorldMapCacheName field2628;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static final WorldMapCacheName field2629;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	public static final WorldMapCacheName field2630;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 572938321
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("au")
	@Export("name")
	public final String name;

	static {
		field2633 = new WorldMapCacheName("details"); // L: 4
		field2626 = new WorldMapCacheName("compositemap"); // L: 5
		field2628 = new WorldMapCacheName("compositetexture"); // L: 6
		field2629 = new WorldMapCacheName("area"); // L: 7
		field2630 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Luz;",
		garbageValue = "-120"
	)
	static SpritePixels method5004() {
		SpritePixels var0 = new SpritePixels(); // L: 196
		var0.width = class541.SpriteBuffer_spriteWidth; // L: 197
		var0.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight; // L: 198
		var0.xOffset = class541.SpriteBuffer_xOffsets[0]; // L: 199
		var0.yOffset = class541.SpriteBuffer_yOffsets[0]; // L: 200
		var0.subWidth = class541.SpriteBuffer_spriteWidths[0]; // L: 201
		var0.subHeight = class520.SpriteBuffer_spriteHeights[0]; // L: 202
		int var1 = var0.subHeight * var0.subWidth; // L: 203
		byte[] var2 = class396.SpriteBuffer_pixels[0]; // L: 204
		var0.pixels = new int[var1]; // L: 205

		for (int var3 = 0; var3 < var1; ++var3) { // L: 206
			var0.pixels[var3] = class541.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class458.method8401(); // L: 207
		return var0; // L: 208
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1839929572"
	)
	static void method5005() {
		int var0;
		if (Client.field517 == class92.field1136) { // L: 1478
			class36.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1479

			for (var0 = 0; var0 < 4; ++var0) { // L: 1480
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			class102.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1481
			Login.Login_loadingText = "Starting game engine..."; // L: 1482
			Login.Login_loadingPercent = 5; // L: 1483
			Client.field517 = class92.field1133; // L: 1484
		} else if (Client.field517 == class92.field1133) { // L: 1487
			Login.Login_loadingText = "Prepared visibility map"; // L: 1488
			Login.Login_loadingPercent = 10; // L: 1489
			Client.field517 = class92.field1131; // L: 1490
		} else if (class92.field1131 == Client.field517) { // L: 1493
			UserComparator7.field1441 = Skeleton.newArchive(0, false, true, true, false); // L: 1494
			class145.field1643 = Skeleton.newArchive(1, false, true, true, false); // L: 1495
			class344.archive2 = Skeleton.newArchive(2, true, false, true, false); // L: 1496
			class313.field3398 = Skeleton.newArchive(3, false, true, true, false); // L: 1497
			Language.field4412 = Skeleton.newArchive(4, false, true, true, false); // L: 1498
			WorldMapSection0.field2532 = Skeleton.newArchive(5, true, true, true, false); // L: 1499
			class514.field5059 = Skeleton.newArchive(6, true, true, true, false); // L: 1500
			class19.field92 = Skeleton.newArchive(7, false, true, true, false); // L: 1501
			GrandExchangeOfferOwnWorldComparator.field481 = Skeleton.newArchive(8, false, true, true, false); // L: 1502
			Canvas.field114 = Skeleton.newArchive(9, false, true, true, false); // L: 1503
			WorldMapDecorationType.field3867 = Skeleton.newArchive(10, false, true, true, false); // L: 1504
			PcmPlayer.field281 = Skeleton.newArchive(11, false, true, true, false); // L: 1505
			class47.archive12 = Skeleton.newArchive(12, false, true, true, false); // L: 1506
			VarbitComposition.archive13 = Skeleton.newArchive(13, true, false, true, false); // L: 1507
			StructComposition.field2041 = Skeleton.newArchive(14, false, true, true, false); // L: 1508
			class7.field25 = Skeleton.newArchive(15, false, true, true, false); // L: 1509
			SoundSystem.field298 = Skeleton.newArchive(17, true, true, true, false); // L: 1510
			BuddyRankComparator.field1460 = Skeleton.newArchive(18, false, true, true, false); // L: 1511
			SpotAnimationDefinition.field2007 = Skeleton.newArchive(19, false, true, true, false); // L: 1512
			WorldMapData_0.field2426 = Skeleton.newArchive(20, false, true, true, false); // L: 1513
			class267.field2778 = Skeleton.newArchive(21, false, true, true, false); // L: 1514
			WorldMapAreaData.field2641 = SequenceDefinition.method4093(22, false, true, true, true, true); // L: 1515
			Login.Login_loadingText = "Connecting to update server"; // L: 1516
			Login.Login_loadingPercent = 20; // L: 1517
			Client.field517 = class92.field1130; // L: 1518
		} else if (class92.field1130 == Client.field517) { // L: 1521
			byte var42 = 0; // L: 1522
			var0 = var42 + UserComparator7.field1441.percentage() * 4 / 100; // L: 1523
			var0 += class145.field1643.percentage() * 4 / 100; // L: 1524
			var0 += class344.archive2.percentage() * 2 / 100; // L: 1525
			var0 += class313.field3398.percentage() * 2 / 100; // L: 1526
			var0 += Language.field4412.percentage() * 6 / 100; // L: 1527
			var0 += WorldMapSection0.field2532.percentage() * 4 / 100; // L: 1528
			var0 += class514.field5059.percentage() * 2 / 100; // L: 1529
			var0 += class19.field92.percentage() * 54 / 100; // L: 1530
			var0 += GrandExchangeOfferOwnWorldComparator.field481.percentage() * 2 / 100; // L: 1531
			var0 += Canvas.field114.percentage() * 2 / 100; // L: 1532
			var0 += WorldMapDecorationType.field3867.percentage() * 2 / 100; // L: 1533
			var0 += PcmPlayer.field281.percentage() * 2 / 100; // L: 1534
			var0 += class47.archive12.percentage() * 2 / 100; // L: 1535
			var0 += VarbitComposition.archive13.percentage() * 2 / 100; // L: 1536
			var0 += StructComposition.field2041.percentage() * 2 / 100; // L: 1537
			var0 += class7.field25.percentage() * 2 / 100; // L: 1538
			var0 += SpotAnimationDefinition.field2007.percentage() / 100; // L: 1539
			var0 += BuddyRankComparator.field1460.percentage() / 100; // L: 1540
			var0 += WorldMapData_0.field2426.percentage() / 100; // L: 1541
			var0 += class267.field2778.percentage() / 100; // L: 1542
			var0 += WorldMapAreaData.field2641.percentage() / 100; // L: 1543
			var0 += SoundSystem.field298.method6898() && SoundSystem.field298.isFullyLoaded() ? 1 : 0; // L: 1544
			if (var0 != 100) { // L: 1545
				if (var0 != 0) { // L: 1546
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1547
			} else {
				class357.method6862(UserComparator7.field1441, "Animations"); // L: 1550
				class357.method6862(class145.field1643, "Skeletons"); // L: 1551
				class357.method6862(Language.field4412, "Sound FX"); // L: 1552
				class357.method6862(WorldMapSection0.field2532, "Maps"); // L: 1553
				class357.method6862(class514.field5059, "Music Tracks"); // L: 1554
				class357.method6862(class19.field92, "Models"); // L: 1555
				class357.method6862(GrandExchangeOfferOwnWorldComparator.field481, "Sprites"); // L: 1556
				class357.method6862(PcmPlayer.field281, "Music Jingles"); // L: 1557
				class357.method6862(StructComposition.field2041, "Music Samples"); // L: 1558
				class357.method6862(class7.field25, "Music Patches"); // L: 1559
				class357.method6862(SpotAnimationDefinition.field2007, "World Map"); // L: 1560
				class357.method6862(BuddyRankComparator.field1460, "World Map Geography"); // L: 1561
				class357.method6862(WorldMapData_0.field2426, "World Map Ground"); // L: 1562
				class376.field4358 = new GraphicsDefaults(); // L: 1563
				class376.field4358.decode(SoundSystem.field298); // L: 1564
				Login.Login_loadingText = "Loaded update list"; // L: 1565
				Login.Login_loadingPercent = 30; // L: 1566
				Client.field517 = class92.field1137; // L: 1567
			}
		} else {
			Archive var7;
			Archive var8;
			Archive var25;
			if (class92.field1137 == Client.field517) { // L: 1570
				boolean var41 = !Client.isLowDetail; // L: 1571
				PcmPlayer.field275 = -771390350; // L: 1574
				WorldMapRectangle.PcmPlayer_stereo = var41; // L: 1575
				PcmPlayer.field266 = 2; // L: 1576
				ArrayList var34 = new ArrayList(3); // L: 1578
				TaskHandler var32 = GameEngine.taskHandler; // L: 1580
				short var40 = 2048; // L: 1581
				if (PcmPlayer.field275 * 1019137945 == 0) { // L: 1583
					throw new IllegalStateException();
				} else {
					if (var40 < 256) { // L: 1585
						var40 = 256;
					}

					PcmPlayer var33;
					try {
						PcmPlayer var36 = PcmPlayer.pcmPlayerProvider.player(); // L: 1587
						var36.samples = new int[256 * (WorldMapRectangle.PcmPlayer_stereo ? 2 : 1)]; // L: 1588
						var36.field272 = var40; // L: 1589
						var36.init(); // L: 1590
						var36.capacity = (var40 & -1024) + 1024; // L: 1591
						if (var36.capacity > 16384) { // L: 1592
							var36.capacity = 16384;
						}

						var36.open(var36.capacity); // L: 1593
						if (PcmPlayer.field266 > 0 && class414.soundSystem == null) { // L: 1594
							class414.soundSystem = new SoundSystem(); // L: 1595
							class342.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1596
							class342.soundSystemExecutor.scheduleAtFixedRate(class414.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1597
						}

						if (class414.soundSystem != null) { // L: 1599
							if (class414.soundSystem.players[0] != null) { // L: 1600
								throw new IllegalArgumentException();
							}

							class414.soundSystem.players[0] = var36; // L: 1601
						}

						var33 = var36; // L: 1603
					} catch (Throwable var30) { // L: 1606
						var33 = new PcmPlayer(); // L: 1607
					}

					MusicPatchPcmStream.pcmPlayer0 = var33; // L: 1609
					LoginScreenAnimation.pcmStreamMixer = new PcmStreamMixer(); // L: 1610
					PcmStreamMixer var37 = new PcmStreamMixer(); // L: 1611
					var37.addSubStream(LoginScreenAnimation.pcmStreamMixer); // L: 1612

					for (int var6 = 0; var6 < 3; ++var6) { // L: 1613
						MidiPcmStream var38 = new MidiPcmStream(); // L: 1614
						var38.method6016(9, 128); // L: 1615
						var37.addSubStream(var38); // L: 1616
						var34.add(var38); // L: 1617
					}

					MusicPatchPcmStream.pcmPlayer0.setStream(var37); // L: 1619
					var25 = class7.field25; // L: 1620
					var7 = StructComposition.field2041; // L: 1621
					var8 = Language.field4412; // L: 1622
					class316.field3423 = var25; // L: 1624
					class316.field3414 = var7; // L: 1625
					class168.field1789 = var8; // L: 1626
					class316.field3415 = var34; // L: 1627
					class521.decimator = new Decimator(22050, PcmPlayer.field275 * 1019137945); // L: 1629
					Login.Login_loadingText = "Prepared sound engine"; // L: 1630
					Login.Login_loadingPercent = 35; // L: 1631
					Client.field517 = class92.field1132; // L: 1632
					class140.field1609 = new Fonts(GrandExchangeOfferOwnWorldComparator.field481, VarbitComposition.archive13); // L: 1633
				}
			} else if (Client.field517 == class92.field1132) { // L: 1636
				var0 = FontName.method8927().length; // L: 1637
				Client.field633 = class140.field1609.createMap(FontName.method8927()); // L: 1638
				if (Client.field633.size() < var0) { // L: 1639
					Login.Login_loadingText = "Loading fonts - " + Client.field633.size() * 100 / var0 + "%"; // L: 1640
					Login.Login_loadingPercent = 40; // L: 1641
				} else {
					class369.field4300 = (Font)Client.field633.get(FontName.FontName_plain11); // L: 1644
					ItemLayer.fontPlain12 = (Font)Client.field633.get(FontName.FontName_plain12); // L: 1645
					GrandExchangeOfferTotalQuantityComparator.fontBold12 = (Font)Client.field633.get(FontName.FontName_bold12); // L: 1646
					class60.field419 = Client.field776.get(); // L: 1647
					Login.Login_loadingText = "Loaded fonts"; // L: 1648
					Login.Login_loadingPercent = 40; // L: 1649
					Client.field517 = class92.field1128; // L: 1650
				}
			} else {
				int var26;
				if (Client.field517 == class92.field1128) { // L: 1653
					var0 = Nameable.method8164(WorldMapDecorationType.field3867, GrandExchangeOfferOwnWorldComparator.field481); // L: 1654
					var26 = class189.method3749(GrandExchangeOfferOwnWorldComparator.field481); // L: 1655
					if (var0 < var26) { // L: 1656
						Login.Login_loadingText = "Loading title screen - " + var0 * 100 / var26 + "%"; // L: 1657
						Login.Login_loadingPercent = 50; // L: 1658
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1661
						Login.Login_loadingPercent = 50; // L: 1662
						WorldMapSection2.method4516(5); // L: 1663
						Client.field517 = class92.field1134; // L: 1664
					}
				} else {
					Archive var2;
					boolean var4;
					if (class92.field1134 != Client.field517) { // L: 1667
						if (class92.field1135 == Client.field517) { // L: 1779
							var0 = 0; // L: 1780
							if (ItemLayer.field2658 == null) { // L: 1781
								ItemLayer.field2658 = IgnoreList.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4750, 0);
							} else {
								++var0; // L: 1782
							}

							if (class11.redHintArrowSprite == null) { // L: 1783
								class11.redHintArrowSprite = IgnoreList.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4742, 0);
							} else {
								++var0; // L: 1784
							}

							int var28;
							IndexedSprite[] var31;
							byte[] var35;
							if (VarpDefinition.mapSceneSprites == null) { // L: 1785
								var2 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1787
								var28 = class376.field4358.field4743; // L: 1788
								var35 = var2.takeFile(var28, 0); // L: 1792
								if (var35 == null) { // L: 1793
									var4 = false; // L: 1794
								} else {
									class162.SpriteBuffer_decode(var35); // L: 1797
									var4 = true; // L: 1798
								}

								if (!var4) { // L: 1800
									var31 = null; // L: 1801
								} else {
									var31 = class518.method9159(); // L: 1804
								}

								VarpDefinition.mapSceneSprites = var31; // L: 1806
							} else {
								++var0; // L: 1808
							}

							if (UrlRequest.field1434 == null) { // L: 1809
								UrlRequest.field1434 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4746, 0);
							} else {
								++var0; // L: 1810
							}

							if (AbstractByteArrayCopier.field3816 == null) { // L: 1811
								AbstractByteArrayCopier.field3816 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4741, 0);
							} else {
								++var0; // L: 1812
							}

							if (class60.field420 == null) { // L: 1813
								class60.field420 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4745, 0);
							} else {
								++var0; // L: 1814
							}

							if (class12.field53 == null) { // L: 1815
								class12.field53 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4747, 0);
							} else {
								++var0; // L: 1816
							}

							if (VarpDefinition.field1816 == null) { // L: 1817
								VarpDefinition.field1816 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4748, 0);
							} else {
								++var0; // L: 1818
							}

							if (HorizontalAlignment.field1908 == null) { // L: 1819
								HorizontalAlignment.field1908 = VertexNormal.method5702(GrandExchangeOfferOwnWorldComparator.field481, class376.field4358.field4749, 0);
							} else {
								++var0; // L: 1820
							}

							if (class31.scrollBarSprites == null) { // L: 1821
								var2 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1823
								var28 = class376.field4358.field4744; // L: 1824
								var35 = var2.takeFile(var28, 0); // L: 1828
								if (var35 == null) { // L: 1829
									var4 = false; // L: 1830
								} else {
									class162.SpriteBuffer_decode(var35); // L: 1833
									var4 = true; // L: 1834
								}

								if (!var4) { // L: 1836
									var31 = null; // L: 1837
								} else {
									var31 = class518.method9159(); // L: 1840
								}

								class31.scrollBarSprites = var31; // L: 1842
							} else {
								++var0; // L: 1844
							}

							if (class134.field1582 == null) { // L: 1845
								var2 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1847
								var28 = class376.field4358.field4751; // L: 1848
								var35 = var2.takeFile(var28, 0); // L: 1852
								if (var35 == null) { // L: 1853
									var4 = false; // L: 1854
								} else {
									class162.SpriteBuffer_decode(var35); // L: 1857
									var4 = true; // L: 1858
								}

								if (!var4) { // L: 1860
									var31 = null; // L: 1861
								} else {
									var31 = class518.method9159(); // L: 1864
								}

								class134.field1582 = var31; // L: 1866
							} else {
								++var0; // L: 1868
							}

							if (var0 < 11) { // L: 1869
								Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%"; // L: 1870
								Login.Login_loadingPercent = 70; // L: 1871
							} else {
								AbstractFont.AbstractFont_modIconSprites = class134.field1582; // L: 1874
								class11.redHintArrowSprite.normalize(); // L: 1875
								var26 = (int)(Math.random() * 21.0D) - 10; // L: 1876
								int var29 = (int)(Math.random() * 21.0D) - 10; // L: 1877
								var28 = (int)(Math.random() * 21.0D) - 10; // L: 1878
								int var39 = (int)(Math.random() * 41.0D) - 20; // L: 1879
								VarpDefinition.mapSceneSprites[0].shiftColors(var26 + var39, var39 + var29, var39 + var28); // L: 1880
								Login.Login_loadingText = "Loaded sprites"; // L: 1881
								Login.Login_loadingPercent = 70; // L: 1882
								Client.field517 = class92.field1129; // L: 1883
							}
						} else if (class92.field1129 == Client.field517) { // L: 1886
							if (!Canvas.field114.isFullyLoaded()) { // L: 1887
								Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1888
								Login.Login_loadingPercent = 90; // L: 1889
							} else {
								class292.field3101 = new TextureProvider(Canvas.field114, GrandExchangeOfferOwnWorldComparator.field481, 20, WorldMapIcon_1.clientPreferences.method2548(), Client.isLowDetail ? 64 : 128); // L: 1892
								Rasterizer3D.method5204(class292.field3101); // L: 1893
								Rasterizer3D.Rasterizer3D_setBrightness(WorldMapIcon_1.clientPreferences.method2548()); // L: 1894
								Client.field517 = class92.field1143; // L: 1895
							}
						} else if (class92.field1143 == Client.field517) { // L: 1898
							var0 = class292.field3101.getLoadedPercentage(); // L: 1899
							if (var0 < 100) { // L: 1900
								Login.Login_loadingText = "Loading textures - " + var0 + "%"; // L: 1901
								Login.Login_loadingPercent = 90; // L: 1902
							} else {
								Login.Login_loadingText = "Loaded textures"; // L: 1905
								Login.Login_loadingPercent = 90; // L: 1906
								Client.field517 = class92.field1138; // L: 1907
							}
						} else if (Client.field517 == class92.field1138) { // L: 1910
							Message.mouseRecorder = new MouseRecorder(); // L: 1911
							GameEngine.taskHandler.newThreadTask(Message.mouseRecorder, 10); // L: 1912
							Login.Login_loadingText = "Loaded input handler"; // L: 1913
							Login.Login_loadingPercent = 92; // L: 1914
							Client.field517 = class92.field1139; // L: 1915
						} else if (class92.field1139 == Client.field517) { // L: 1918
							if (!WorldMapDecorationType.field3867.tryLoadFileByNames("huffman", "")) { // L: 1919
								Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1920
								Login.Login_loadingPercent = 94; // L: 1921
							} else {
								Huffman var44 = new Huffman(WorldMapDecorationType.field3867.takeFileByNames("huffman", "")); // L: 1924
								class27.method444(var44); // L: 1925
								Login.Login_loadingText = "Loaded wordpack"; // L: 1926
								Login.Login_loadingPercent = 94; // L: 1927
								Client.field517 = class92.field1140; // L: 1928
							}
						} else if (Client.field517 == class92.field1140) { // L: 1931
							if (!class313.field3398.isFullyLoaded()) { // L: 1932
								Login.Login_loadingText = "Loading interfaces - " + class313.field3398.loadPercent() * 4 / 5 + "%"; // L: 1933
								Login.Login_loadingPercent = 96; // L: 1934
							} else if (!WorldMapAreaData.field2641.isFullyLoaded()) { // L: 1937
								Login.Login_loadingText = "Loading interfaces - " + WorldMapAreaData.field2641.loadPercent() * 4 / 5 + "%"; // L: 1938
								Login.Login_loadingPercent = 96; // L: 1939
							} else if (!class47.archive12.isFullyLoaded()) { // L: 1942
								Login.Login_loadingText = "Loading interfaces - " + (80 + class47.archive12.loadPercent() / 6) + "%"; // L: 1943
								Login.Login_loadingPercent = 96; // L: 1944
							} else if (!VarbitComposition.archive13.isFullyLoaded()) { // L: 1947
								Login.Login_loadingText = "Loading interfaces - " + (96 + VarbitComposition.archive13.loadPercent() / 50) + "%"; // L: 1948
								Login.Login_loadingPercent = 96; // L: 1949
							} else {
								Login.Login_loadingText = "Loaded interfaces"; // L: 1952
								Login.Login_loadingPercent = 98; // L: 1953
								if (class47.archive12.isValidFileName("version.dat", "")) { // L: 1954
									Buffer var43 = new Buffer(class47.archive12.takeFileByNames("version.dat", "")); // L: 1955
									var43.readUnsignedShort(); // L: 1956
								}

								Client.field517 = class92.field1141; // L: 1958
							}
						} else if (Client.field517 == class92.field1141) { // L: 1961
							Login.Login_loadingPercent = 100; // L: 1962
							if (SpotAnimationDefinition.field2007.getGroupCount() > 0 && !SpotAnimationDefinition.field2007.tryLoadGroupByName(field2633.name)) { // L: 1963
								Login.Login_loadingText = "Loading world map - " + SpotAnimationDefinition.field2007.groupLoadPercentByName(field2633.name) / 10 + "%"; // L: 1964
							} else {
								if (class187.worldMap == null) { // L: 1967
									class187.worldMap = new WorldMap(); // L: 1968
									class187.worldMap.init(SpotAnimationDefinition.field2007, BuddyRankComparator.field1460, WorldMapData_0.field2426, GrandExchangeOfferTotalQuantityComparator.fontBold12, Client.field633, VarpDefinition.mapSceneSprites); // L: 1969
								}

								Login.Login_loadingText = "Loaded world map"; // L: 1971
								Client.field517 = class92.field1142; // L: 1972
							}
						} else {
							if (Client.field517 == class92.field1142) { // L: 1975
								WorldMapSection2.method4516(10); // L: 1976
							}

						}
					} else if (!class344.archive2.isFullyLoaded()) { // L: 1668
						Login.Login_loadingText = "Loading config - " + class344.archive2.loadPercent() + "%"; // L: 1669
						Login.Login_loadingPercent = 60; // L: 1670
					} else if (!class267.field2778.isFullyLoaded()) { // L: 1673
						Login.Login_loadingText = "Loading config - " + (80 + class47.archive12.loadPercent() / 6) + "%"; // L: 1674
						Login.Login_loadingPercent = 60; // L: 1675
					} else {
						Archive var27 = class344.archive2; // L: 1678
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var27; // L: 1680
						Archive var1 = class344.archive2; // L: 1682
						FloorUnderlayDefinition.field2015 = var1; // L: 1684
						InvDefinition.method3531(class344.archive2, class19.field92); // L: 1686
						class406.method7652(class344.archive2, class19.field92, Client.isLowDetail); // L: 1687
						LoginScreenAnimation.method2510(class344.archive2, class19.field92); // L: 1688
						class18.method288(class344.archive2); // L: 1689
						var2 = class344.archive2; // L: 1690
						Archive var3 = class19.field92; // L: 1691
						var4 = Client.isMembersWorld; // L: 1692
						Font var5 = class369.field4300; // L: 1693
						class519.ItemComposition_archive = var2; // L: 1695
						ItemComposition.ItemComposition_modelArchive = var3; // L: 1696
						class129.ItemComposition_inMembersWorld = var4; // L: 1697
						ItemComposition.ItemComposition_fileCount = class519.ItemComposition_archive.getGroupFileCount(10); // L: 1698
						TaskHandler.field2277 = var5; // L: 1699
						var25 = class344.archive2; // L: 1701
						var7 = UserComparator7.field1441; // L: 1702
						var8 = class145.field1643; // L: 1703
						class369.SequenceDefinition_archive = var25; // L: 1705
						SequenceDefinition.SequenceDefinition_animationsArchive = var7; // L: 1706
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var8; // L: 1707
						UserComparator8.method2948(class344.archive2, class19.field92); // L: 1709
						Archive var9 = class344.archive2; // L: 1710
						VarbitComposition.VarbitDefinition_archive = var9; // L: 1712
						ViewportMouse.method5697(class344.archive2); // L: 1714
						HealthBarDefinition.field1877 = new class335(class313.field3398, class19.field92, GrandExchangeOfferOwnWorldComparator.field481, VarbitComposition.archive13, WorldMapAreaData.field2641); // L: 1715
						Archive var10 = class344.archive2; // L: 1716
						InvDefinition.InvDefinition_archive = var10; // L: 1718
						Archive var11 = class344.archive2; // L: 1720
						EnumComposition.EnumDefinition_archive = var11; // L: 1722
						Archive var12 = class344.archive2; // L: 1724
						class30.VarcInt_archive = var12; // L: 1726
						Archive var13 = class344.archive2; // L: 1728
						VertexNormal.method5701(class344.archive2); // L: 1730
						Archive var14 = class344.archive2; // L: 1731
						class517.field5074 = var14; // L: 1733
						Archive var15 = class344.archive2; // L: 1735
						class519.field5085 = var15; // L: 1737
						class399.Widget_cachedModels = new class509(Messages.field1401, 54, class85.clientLanguage, class344.archive2); // L: 1739
						Players.Widget_cachedFonts = new class509(Messages.field1401, 47, class85.clientLanguage, class344.archive2); // L: 1740
						class176.varcs = new Varcs(); // L: 1741
						Archive var16 = class344.archive2; // L: 1742
						Archive var17 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1743
						Archive var18 = VarbitComposition.archive13; // L: 1744
						HitSplatDefinition.HitSplatDefinition_archive = var16; // L: 1746
						HitSplatDefinition.field2050 = var17; // L: 1747
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var18; // L: 1748
						Archive var19 = class344.archive2; // L: 1750
						Archive var20 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1751
						HealthBarDefinition.HealthBarDefinition_archive = var19; // L: 1753
						SecureRandomCallable.field1014 = var20; // L: 1754
						Archive var21 = class344.archive2; // L: 1756
						Archive var22 = GrandExchangeOfferOwnWorldComparator.field481; // L: 1757
						class432.WorldMapElement_archive = var22; // L: 1759
						if (var21.isFullyLoaded()) { // L: 1760
							class137.WorldMapElement_count = var21.getGroupFileCount(35); // L: 1763
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[class137.WorldMapElement_count]; // L: 1764

							for (int var23 = 0; var23 < class137.WorldMapElement_count; ++var23) { // L: 1765
								byte[] var24 = var21.takeFile(35, var23); // L: 1766
								WorldMapElement.WorldMapElement_cached[var23] = new WorldMapElement(var23); // L: 1767
								if (var24 != null) { // L: 1768
									WorldMapElement.WorldMapElement_cached[var23].decode(new Buffer(var24)); // L: 1769
									WorldMapElement.WorldMapElement_cached[var23].method3580(); // L: 1770
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1774
						Login.Login_loadingPercent = 60; // L: 1775
						Client.field517 = class92.field1135; // L: 1776
					}
				}
			}
		}
	} // L: 1485 1491 1519 1548 1568 1634 1642 1651 1659 1665 1671 1676 1777 1872 1884 1890 1896 1903 1908 1916 1922 1929 1935 1940 1945 1950 1959 1965 1973 1978

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Lds;IILiz;I)V",
		garbageValue = "398904459"
	)
	static final void method5006(Player var0, int var1, int var2, class228 var3) {
		int var4 = var0.pathX[0]; // L: 9237
		int var5 = var0.pathY[0]; // L: 9238
		int var6 = var0.transformedSize(); // L: 9239
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 9240
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 9241
				class229 var7 = Client.field673; // L: 9242
				int var10 = var0.transformedSize(); // L: 9245
				Client.field750.approxDestinationX = var1; // L: 9248
				Client.field750.approxDestinationY = var2; // L: 9249
				Client.field750.approxDestinationSizeX = 1; // L: 9250
				Client.field750.approxDestinationSizeY = 1; // L: 9251
				ApproximateRouteStrategy var11 = Client.field750; // L: 9252
				int var12 = var7.method4441(var4, var5, var10, var11, Client.collisionMaps[var0.plane], true, Client.field790, Client.field718); // L: 9254
				if (var12 >= 1) { // L: 9255
					for (int var13 = 0; var13 < var12 - 1; ++var13) { // L: 9256
						var0.method2400(Client.field790[var13], Client.field718[var13], var3);
					}

				}
			}
		}
	} // L: 9257

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1657545960"
	)
	static void method5007() {
		if (Client.field585 && class229.localPlayer != null) { // L: 12893
			int var0 = class229.localPlayer.pathX[0]; // L: 12894
			int var1 = class229.localPlayer.pathY[0]; // L: 12895
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12896
				return;
			}

			LoginScreenAnimation.oculusOrbFocalPointX = class229.localPlayer.x; // L: 12897
			int var2 = WorldMapDecorationType.getTileHeight(class229.localPlayer.x, class229.localPlayer.y, ItemLayer.Client_plane) - Client.camFollowHeight; // L: 12898
			if (var2 < class12.field56) { // L: 12899
				class12.field56 = var2;
			}

			ScriptFrame.oculusOrbFocalPointY = class229.localPlayer.y; // L: 12900
			Client.field585 = false; // L: 12901
		}

	} // L: 12903
}
