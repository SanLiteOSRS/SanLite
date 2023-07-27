import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1860912073
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1969948055
	)
	@Export("count")
	int count;
	@ObfuscatedName("az")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("av")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	class228 field2533;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1; // L: 19
		Buffer var3 = new Buffer(var2); // L: 20
		this.count = var3.readUnsignedByte(); // L: 21
		this.transformTypes = new int[this.count]; // L: 22
		this.labels = new int[this.count][]; // L: 23

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) { // L: 24
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 25
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) { // L: 26
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) { // L: 27
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) { // L: 29
			var4 = var3.readUnsignedShort(); // L: 30
			if (var4 > 0) { // L: 31
				this.field2533 = new class228(var3, var4); // L: 32
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2119821577"
	)
	public int method4554() {
		return this.count; // L: 38
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "632962128"
	)
	public class228 method4549() {
		return this.field2533; // L: 42
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-442215173"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return UserComparator10.method2902(var0, 10, true); // L: 35
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	static void method4557() {
		int var0;
		if (class92.field1144 == Client.field547) { // L: 1488
			UserComparator5.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1489

			for (var0 = 0; var0 < 4; ++var0) { // L: 1490
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			Frames.field2621 = new SpritePixels(512, 512); // L: 1491
			Login.Login_loadingText = "Starting game engine..."; // L: 1492
			Login.Login_loadingPercent = 5; // L: 1493
			Client.field547 = class92.field1146; // L: 1494
		} else if (class92.field1146 == Client.field547) { // L: 1497
			Login.Login_loadingText = "Prepared visibility map"; // L: 1498
			Login.Login_loadingPercent = 10; // L: 1499
			Client.field547 = class92.field1143; // L: 1500
		} else if (class92.field1143 == Client.field547) { // L: 1503
			class151.field1694 = PendingSpawn.newArchive(0, false, true, true, false); // L: 1504
			TileItem.archive7 = PendingSpawn.newArchive(1, false, true, true, false); // L: 1505
			class197.archive2 = PendingSpawn.newArchive(2, true, false, true, false); // L: 1506
			class253.archive4 = PendingSpawn.newArchive(3, false, true, true, false); // L: 1507
			class149.archive9 = PendingSpawn.newArchive(4, false, true, true, false); // L: 1508
			Canvas.archive6 = PendingSpawn.newArchive(5, true, true, true, false); // L: 1509
			class13.archive11 = PendingSpawn.newArchive(6, true, true, true, false); // L: 1510
			class7.archive8 = PendingSpawn.newArchive(7, false, true, true, false); // L: 1511
			class386.field4436 = PendingSpawn.newArchive(8, false, true, true, false); // L: 1512
			class148.archive10 = PendingSpawn.newArchive(9, false, true, true, false); // L: 1513
			class131.field1565 = PendingSpawn.newArchive(10, false, true, true, false); // L: 1514
			GrandExchangeOfferOwnWorldComparator.field511 = PendingSpawn.newArchive(11, false, true, true, false); // L: 1515
			class126.archive12 = PendingSpawn.newArchive(12, false, true, true, false); // L: 1516
			FontName.archive13 = PendingSpawn.newArchive(13, true, false, true, false); // L: 1517
			ReflectionCheck.field273 = PendingSpawn.newArchive(14, false, true, true, false); // L: 1518
			class191.field1970 = PendingSpawn.newArchive(15, false, true, true, false); // L: 1519
			World.field829 = PendingSpawn.newArchive(17, true, true, true, false); // L: 1520
			class106.field1358 = PendingSpawn.newArchive(18, false, true, true, false); // L: 1521
			Varcs.field1402 = PendingSpawn.newArchive(19, false, true, true, false); // L: 1522
			Interpreter.field885 = PendingSpawn.newArchive(20, false, true, true, false); // L: 1523
			class176.field1852 = PendingSpawn.newArchive(21, false, true, true, true); // L: 1524
			Login.Login_loadingText = "Connecting to update server"; // L: 1525
			Login.Login_loadingPercent = 20; // L: 1526
			Client.field547 = class92.field1155; // L: 1527
		} else if (Client.field547 == class92.field1155) { // L: 1530
			byte var47 = 0; // L: 1531
			var0 = var47 + class151.field1694.percentage() * 4 / 100; // L: 1532
			var0 += TileItem.archive7.percentage() * 4 / 100; // L: 1533
			var0 += class197.archive2.percentage() * 2 / 100; // L: 1534
			var0 += class253.archive4.percentage() * 2 / 100; // L: 1535
			var0 += class149.archive9.percentage() * 6 / 100; // L: 1536
			var0 += Canvas.archive6.percentage() * 4 / 100; // L: 1537
			var0 += class13.archive11.percentage() * 2 / 100; // L: 1538
			var0 += class7.archive8.percentage() * 55 / 100; // L: 1539
			var0 += class386.field4436.percentage() * 2 / 100; // L: 1540
			var0 += class148.archive10.percentage() * 2 / 100; // L: 1541
			var0 += class131.field1565.percentage() * 2 / 100; // L: 1542
			var0 += GrandExchangeOfferOwnWorldComparator.field511.percentage() * 2 / 100; // L: 1543
			var0 += class126.archive12.percentage() * 2 / 100; // L: 1544
			var0 += FontName.archive13.percentage() * 2 / 100; // L: 1545
			var0 += ReflectionCheck.field273.percentage() * 2 / 100; // L: 1546
			var0 += class191.field1970.percentage() * 2 / 100; // L: 1547
			var0 += Varcs.field1402.percentage() / 100; // L: 1548
			var0 += class106.field1358.percentage() / 100; // L: 1549
			var0 += Interpreter.field885.percentage() / 100; // L: 1550
			var0 += class176.field1852.percentage() / 100; // L: 1551
			var0 += World.field829.method6723() && World.field829.isFullyLoaded() ? 1 : 0; // L: 1552
			if (var0 != 100) { // L: 1553
				if (var0 != 0) { // L: 1554
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1555
			} else {
				class197.method3771(class151.field1694, "Animations"); // L: 1558
				class197.method3771(TileItem.archive7, "Skeletons"); // L: 1559
				class197.method3771(class149.archive9, "Sound FX"); // L: 1560
				class197.method3771(Canvas.archive6, "Maps"); // L: 1561
				class197.method3771(class13.archive11, "Music Tracks"); // L: 1562
				class197.method3771(class7.archive8, "Models"); // L: 1563
				class197.method3771(class386.field4436, "Sprites"); // L: 1564
				class197.method3771(GrandExchangeOfferOwnWorldComparator.field511, "Music Jingles"); // L: 1565
				class197.method3771(ReflectionCheck.field273, "Music Samples"); // L: 1566
				class197.method3771(class191.field1970, "Music Patches"); // L: 1567
				class197.method3771(Varcs.field1402, "World Map"); // L: 1568
				class197.method3771(class106.field1358, "World Map Geography"); // L: 1569
				class197.method3771(Interpreter.field885, "World Map Ground"); // L: 1570
				class350.field3888 = new GraphicsDefaults(); // L: 1571
				class350.field3888.decode(World.field829); // L: 1572
				Login.Login_loadingText = "Loaded update list"; // L: 1573
				Login.Login_loadingPercent = 30; // L: 1574
				Client.field547 = class92.field1145; // L: 1575
			}
		} else {
			int var5;
			if (Client.field547 == class92.field1145) { // L: 1578
				WorldMapManager.method5356(22050, !Client.isLowDetail, 2); // L: 1579
				ArrayList var52 = new ArrayList(3); // L: 1580
				TaskHandler var36 = GameEngine.taskHandler; // L: 1582
				short var44 = 2048; // L: 1583
				if (var44 < 256) { // L: 1587
					var44 = 256;
				}

				PcmPlayer var41;
				try {
					PcmPlayer var42 = class309.pcmPlayerProvider.player(); // L: 1589
					var42.samples = new int[(class373.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 1590
					var42.field304 = var44; // L: 1591
					var42.init(); // L: 1592
					var42.capacity = (var44 & -1024) + 1024; // L: 1593
					if (var42.capacity > 16384) { // L: 1594
						var42.capacity = 16384;
					}

					var42.open(var42.capacity); // L: 1595
					if (class183.field1886 > 0 && WorldMapSectionType.soundSystem == null) { // L: 1596
						WorldMapSectionType.soundSystem = new SoundSystem(); // L: 1597
						class273.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1598
						class273.soundSystemExecutor.scheduleAtFixedRate(WorldMapSectionType.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1599
					}

					if (WorldMapSectionType.soundSystem != null) { // L: 1601
						if (WorldMapSectionType.soundSystem.players[0] != null) { // L: 1602
							throw new IllegalArgumentException();
						}

						WorldMapSectionType.soundSystem.players[0] = var42; // L: 1603
					}

					var41 = var42; // L: 1605
				} catch (Throwable var34) { // L: 1608
					var41 = new PcmPlayer(); // L: 1609
				}

				VerticalAlignment.pcmPlayer1 = var41; // L: 1611
				SecureRandomCallable.pcmStreamMixer = new PcmStreamMixer(); // L: 1612
				PcmStreamMixer var43 = new PcmStreamMixer(); // L: 1613
				var43.addSubStream(SecureRandomCallable.pcmStreamMixer); // L: 1614

				for (var5 = 0; var5 < 3; ++var5) { // L: 1615
					MidiPcmStream var48 = new MidiPcmStream(); // L: 1616
					var48.method5825(9, 128); // L: 1617
					var43.addSubStream(var48); // L: 1618
					var52.add(var48); // L: 1619
				}

				VerticalAlignment.pcmPlayer1.setStream(var43); // L: 1621
				WorldMapCacheName.method5575(class191.field1970, ReflectionCheck.field273, class149.archive9, var52); // L: 1622
				SoundCache.decimator = new Decimator(22050, PcmPlayer.field314); // L: 1623
				Login.Login_loadingText = "Prepared sound engine"; // L: 1624
				Login.Login_loadingPercent = 35; // L: 1625
				Client.field547 = class92.field1141; // L: 1626
				Tile.field2504 = new Fonts(class386.field4436, FontName.archive13); // L: 1627
			} else if (Client.field547 == class92.field1141) { // L: 1630
				var0 = FontName.method8739().length; // L: 1631
				Fonts var40 = Tile.field2504; // L: 1632
				FontName[] var35 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana11}; // L: 1635
				Client.field582 = var40.createMap(var35); // L: 1637
				if (Client.field582.size() < var0) { // L: 1638
					Login.Login_loadingText = "Loading fonts - " + Client.field582.size() * 100 / var0 + "%"; // L: 1639
					Login.Login_loadingPercent = 40; // L: 1640
				} else {
					ItemComposition.field2225 = (Font)Client.field582.get(FontName.FontName_plain11); // L: 1643
					class113.fontPlain12 = (Font)Client.field582.get(FontName.FontName_plain12); // L: 1644
					Calendar.fontBold12 = (Font)Client.field582.get(FontName.FontName_bold12); // L: 1645
					NPCComposition.field2042 = Client.field803.get(); // L: 1646
					Login.Login_loadingText = "Loaded fonts"; // L: 1647
					Login.Login_loadingPercent = 40; // L: 1648
					Client.field547 = class92.field1147; // L: 1649
				}
			} else {
				Archive var2;
				int var3;
				Archive var37;
				int var54;
				if (class92.field1147 == Client.field547) { // L: 1652
					var37 = class131.field1565; // L: 1654
					var2 = class386.field4436; // L: 1655
					var3 = 0; // L: 1657
					String[] var38 = Login.field919; // L: 1659

					String var46;
					for (var5 = 0; var5 < var38.length; ++var5) { // L: 1660
						var46 = var38[var5]; // L: 1661
						if (var37.tryLoadFileByNames(var46, "")) { // L: 1663
							++var3; // L: 1664
						}
					}

					var38 = Login.field954; // L: 1670

					for (var5 = 0; var5 < var38.length; ++var5) { // L: 1671
						var46 = var38[var5]; // L: 1672
						if (var2.tryLoadFileByNames(var46, "")) { // L: 1674
							++var3; // L: 1675
						}
					}

					var38 = Login.field934; // L: 1681

					for (var5 = 0; var5 < var38.length; ++var5) { // L: 1682
						var46 = var38[var5]; // L: 1683
						if (var2.getGroupId(var46) != -1 && var2.tryLoadFileByNames(var46, "")) { // L: 1685
							++var3; // L: 1686
						}
					}

					var54 = GameBuild.method6651(class386.field4436); // L: 1694
					if (var3 < var54) { // L: 1695
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var54 + "%"; // L: 1696
						Login.Login_loadingPercent = 50; // L: 1697
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1700
						Login.Login_loadingPercent = 50; // L: 1701
						class129.method2989(5); // L: 1702
						Client.field547 = class92.field1148; // L: 1703
					}
				} else if (Client.field547 == class92.field1148) { // L: 1706
					if (!class197.archive2.isFullyLoaded()) { // L: 1707
						Login.Login_loadingText = "Loading config - " + class197.archive2.loadPercent() + "%"; // L: 1708
						Login.Login_loadingPercent = 60; // L: 1709
					} else if (!class176.field1852.isFullyLoaded()) { // L: 1712
						Login.Login_loadingText = "Loading config - " + (80 + class126.archive12.loadPercent() / 6) + "%"; // L: 1713
						Login.Login_loadingPercent = 60; // L: 1714
					} else {
						class149.method3186(class197.archive2); // L: 1717
						Archive var51 = class197.archive2; // L: 1718
						FloorUnderlayDefinition.field2079 = var51; // L: 1720
						UserComparator7.method2873(class197.archive2, class7.archive8); // L: 1722
						var37 = class197.archive2; // L: 1723
						var2 = class7.archive8; // L: 1724
						boolean var39 = Client.isLowDetail; // L: 1725
						ObjectComposition.ObjectDefinition_archive = var37; // L: 1727
						ObjectComposition.ObjectDefinition_modelsArchive = var2; // L: 1728
						ObjectComposition.ObjectDefinition_isLowDetail = var39; // L: 1729
						Archive var4 = class197.archive2; // L: 1731
						Archive var53 = class7.archive8; // L: 1732
						IntHashTable.NpcDefinition_archive = var4; // L: 1734
						NPCComposition.field1997 = var53; // L: 1735
						class20.method292(class197.archive2); // L: 1737
						Interpreter.method2070(class197.archive2, class7.archive8, Client.isMembersWorld, ItemComposition.field2225); // L: 1738
						class407.method7667(class197.archive2, class151.field1694, TileItem.archive7); // L: 1739
						Archive var45 = class197.archive2; // L: 1740
						Archive var7 = class7.archive8; // L: 1741
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var45; // L: 1743
						class53.field393 = var7; // L: 1744
						ReflectionCheck.method697(class197.archive2); // L: 1746
						Archive var49 = class197.archive2; // L: 1747
						VarpDefinition.VarpDefinition_archive = var49; // L: 1749
						VarpDefinition.field1904 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1750
						Archive var9 = class253.archive4; // L: 1752
						Archive var10 = class7.archive8; // L: 1753
						Archive var11 = class386.field4436; // L: 1754
						Archive var12 = FontName.archive13; // L: 1755
						int var13 = 0; // L: 1757
						if (var9 != null) { // L: 1758
							ArchiveLoader.Widget_archive = var9; // L: 1759
							WallObject.field2818 = var10; // L: 1760
							UserComparator10.Widget_spritesArchive = var11; // L: 1761
							DecorativeObject.Widget_fontsArchive = var12; // L: 1762
							var13 = ArchiveLoader.Widget_archive.getGroupCount(); // L: 1763
						}

						ArchiveLoader.Widget_interfaceComponents = new Widget[var13][]; // L: 1765
						Widget.Widget_loadedInterfaces = new boolean[var13]; // L: 1766
						Archive var30 = class197.archive2; // L: 1768
						InvDefinition.InvDefinition_archive = var30; // L: 1770
						Archive var14 = class197.archive2; // L: 1772
						EnumComposition.EnumDefinition_archive = var14; // L: 1774
						Archive var15 = class197.archive2; // L: 1776
						VarcInt.VarcInt_archive = var15; // L: 1778
						Archive var16 = class197.archive2; // L: 1780
						Archive var17 = class197.archive2; // L: 1782
						ParamComposition.ParamDefinition_archive = var17; // L: 1784
						class404.method7637(class197.archive2); // L: 1786
						Language.method6993(class197.archive2); // L: 1787
						class293.HitSplatDefinition_cachedSprites = new class498(class25.field138, 54, Interpreter.clientLanguage, class197.archive2); // L: 1788
						class344.Ignored_cached = new class498(class25.field138, 47, Interpreter.clientLanguage, class197.archive2); // L: 1789
						PendingSpawn.varcs = new Varcs(); // L: 1790
						Archive var18 = class197.archive2; // L: 1791
						Archive var19 = class386.field4436; // L: 1792
						Archive var20 = FontName.archive13; // L: 1793
						HitSplatDefinition.HitSplatDefinition_archive = var18; // L: 1795
						class387.field4438 = var19; // L: 1796
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var20; // L: 1797
						Archive var21 = class197.archive2; // L: 1799
						Archive var22 = class386.field4436; // L: 1800
						HealthBarDefinition.HealthBarDefinition_archive = var21; // L: 1802
						HealthBarDefinition.field1954 = var22; // L: 1803
						Archive var23 = class197.archive2; // L: 1805
						Archive var24 = class386.field4436; // L: 1806
						WorldMapElement.WorldMapElement_archive = var24; // L: 1808
						if (var23.isFullyLoaded()) { // L: 1809
							Decimator.WorldMapElement_count = var23.getGroupFileCount(35); // L: 1812
							class335.WorldMapElement_cached = new WorldMapElement[Decimator.WorldMapElement_count]; // L: 1813

							for (int var25 = 0; var25 < Decimator.WorldMapElement_count; ++var25) { // L: 1814
								byte[] var26 = var23.takeFile(35, var25); // L: 1815
								class335.WorldMapElement_cached[var25] = new WorldMapElement(var25); // L: 1816
								if (var26 != null) { // L: 1817
									class335.WorldMapElement_cached[var25].decode(new Buffer(var26)); // L: 1818
									class335.WorldMapElement_cached[var25].method3612(); // L: 1819
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1823
						Login.Login_loadingPercent = 60; // L: 1824
						Client.field547 = class92.field1151; // L: 1825
					}
				} else if (Client.field547 == class92.field1151) { // L: 1828
					var0 = 0; // L: 1829
					if (class10.compass == null) { // L: 1830
						class10.compass = WorldMap.SpriteBuffer_getSprite(class386.field4436, class350.field3888.field4715, 0);
					} else {
						++var0; // L: 1831
					}

					if (SoundCache.redHintArrowSprite == null) { // L: 1832
						SoundCache.redHintArrowSprite = WorldMap.SpriteBuffer_getSprite(class386.field4436, class350.field3888.field4708, 0);
					} else {
						++var0; // L: 1833
					}

					IndexedSprite[] var1;
					IndexedSprite[] var6;
					IndexedSprite var8;
					boolean var28;
					byte[] var29;
					int var31;
					if (class282.mapSceneSprites == null) { // L: 1834
						var2 = class386.field4436; // L: 1836
						var3 = class350.field3888.field4709; // L: 1837
						var29 = var2.takeFile(var3, 0); // L: 1841
						if (var29 == null) { // L: 1842
							var28 = false; // L: 1843
						} else {
							VarbitComposition.SpriteBuffer_decode(var29); // L: 1846
							var28 = true; // L: 1847
						}

						if (!var28) { // L: 1849
							var1 = null; // L: 1850
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount]; // L: 1855

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) { // L: 1856
								var8 = var6[var31] = new IndexedSprite(); // L: 1857
								var8.width = class528.SpriteBuffer_spriteWidth; // L: 1858
								var8.height = class528.SpriteBuffer_spriteHeight; // L: 1859
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31]; // L: 1860
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31]; // L: 1861
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31]; // L: 1862
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31]; // L: 1863
								var8.palette = class528.SpriteBuffer_spritePalette; // L: 1864
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31]; // L: 1865
							}

							class506.method8985(); // L: 1867
							var1 = var6; // L: 1870
						}

						class282.mapSceneSprites = var1; // L: 1872
					} else {
						++var0; // L: 1874
					}

					if (class506.field5041 == null) { // L: 1875
						class506.field5041 = class453.method8339(class386.field4436, class350.field3888.field4710, 0);
					} else {
						++var0; // L: 1876
					}

					if (class17.field92 == null) { // L: 1877
						class17.field92 = class453.method8339(class386.field4436, class350.field3888.field4712, 0);
					} else {
						++var0; // L: 1878
					}

					if (class345.field3858 == null) { // L: 1879
						class345.field3858 = class453.method8339(class386.field4436, class350.field3888.field4707, 0);
					} else {
						++var0; // L: 1880
					}

					if (DynamicObject.field1014 == null) { // L: 1881
						DynamicObject.field1014 = class453.method8339(class386.field4436, class350.field3888.field4713, 0);
					} else {
						++var0; // L: 1882
					}

					if (class211.field2304 == null) { // L: 1883
						class211.field2304 = class453.method8339(class386.field4436, class350.field3888.field4714, 0);
					} else {
						++var0; // L: 1884
					}

					if (MusicPatchNode2.field3389 == null) { // L: 1885
						MusicPatchNode2.field3389 = class453.method8339(class386.field4436, class350.field3888.field4711, 0);
					} else {
						++var0; // L: 1886
					}

					if (class302.scrollBarSprites == null) { // L: 1887
						var2 = class386.field4436; // L: 1889
						var3 = class350.field3888.field4716; // L: 1890
						var29 = var2.takeFile(var3, 0); // L: 1894
						if (var29 == null) { // L: 1895
							var28 = false; // L: 1896
						} else {
							VarbitComposition.SpriteBuffer_decode(var29); // L: 1899
							var28 = true; // L: 1900
						}

						if (!var28) { // L: 1902
							var1 = null; // L: 1903
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount]; // L: 1908

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) { // L: 1909
								var8 = var6[var31] = new IndexedSprite(); // L: 1910
								var8.width = class528.SpriteBuffer_spriteWidth; // L: 1911
								var8.height = class528.SpriteBuffer_spriteHeight; // L: 1912
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31]; // L: 1913
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31]; // L: 1914
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31]; // L: 1915
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31]; // L: 1916
								var8.palette = class528.SpriteBuffer_spritePalette; // L: 1917
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31]; // L: 1918
							}

							class506.method8985(); // L: 1920
							var1 = var6; // L: 1923
						}

						class302.scrollBarSprites = var1; // L: 1925
					} else {
						++var0; // L: 1927
					}

					if (AbstractWorldMapIcon.field3044 == null) { // L: 1928
						var2 = class386.field4436; // L: 1930
						var3 = class350.field3888.field4717; // L: 1931
						var29 = var2.takeFile(var3, 0); // L: 1935
						if (var29 == null) { // L: 1936
							var28 = false; // L: 1937
						} else {
							VarbitComposition.SpriteBuffer_decode(var29); // L: 1940
							var28 = true; // L: 1941
						}

						if (!var28) { // L: 1943
							var1 = null; // L: 1944
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount]; // L: 1949

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) { // L: 1950
								var8 = var6[var31] = new IndexedSprite(); // L: 1951
								var8.width = class528.SpriteBuffer_spriteWidth; // L: 1952
								var8.height = class528.SpriteBuffer_spriteHeight; // L: 1953
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31]; // L: 1954
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31]; // L: 1955
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31]; // L: 1956
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31]; // L: 1957
								var8.palette = class528.SpriteBuffer_spritePalette; // L: 1958
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31]; // L: 1959
							}

							class506.method8985(); // L: 1961
							var1 = var6; // L: 1964
						}

						AbstractWorldMapIcon.field3044 = var1; // L: 1966
					} else {
						++var0; // L: 1968
					}

					if (var0 < 11) { // L: 1969
						Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%"; // L: 1970
						Login.Login_loadingPercent = 70; // L: 1971
					} else {
						AbstractFont.AbstractFont_modIconSprites = AbstractWorldMapIcon.field3044; // L: 1974
						SoundCache.redHintArrowSprite.normalize(); // L: 1975
						int var32 = (int)(Math.random() * 21.0D) - 10; // L: 1976
						int var33 = (int)(Math.random() * 21.0D) - 10; // L: 1977
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 1978
						var54 = (int)(Math.random() * 41.0D) - 20; // L: 1979
						class282.mapSceneSprites[0].shiftColors(var54 + var32, var33 + var54, var3 + var54); // L: 1980
						Login.Login_loadingText = "Loaded sprites"; // L: 1981
						Login.Login_loadingPercent = 70; // L: 1982
						Client.field547 = class92.field1150; // L: 1983
					}
				} else if (Client.field547 == class92.field1150) { // L: 1986
					if (!class148.archive10.isFullyLoaded()) { // L: 1987
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1988
						Login.Login_loadingPercent = 90; // L: 1989
					} else {
						class113.field1431 = new TextureProvider(class148.archive10, class386.field4436, 20, class150.clientPreferences.method2476(), Client.isLowDetail ? 64 : 128); // L: 1992
						Rasterizer3D.method4404(class113.field1431); // L: 1993
						Rasterizer3D.Rasterizer3D_setBrightness(class150.clientPreferences.method2476()); // L: 1994
						Client.field547 = class92.field1149; // L: 1995
					}
				} else if (Client.field547 == class92.field1149) { // L: 1998
					var0 = class113.field1431.getLoadedPercentage(); // L: 1999
					if (var0 < 100) { // L: 2000
						Login.Login_loadingText = "Loading textures - " + var0 + "%"; // L: 2001
						Login.Login_loadingPercent = 90; // L: 2002
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2005
						Login.Login_loadingPercent = 90; // L: 2006
						Client.field547 = class92.field1152; // L: 2007
					}
				} else if (Client.field547 == class92.field1152) { // L: 2010
					class497.mouseRecorder = new MouseRecorder(); // L: 2011
					GameEngine.taskHandler.newThreadTask(class497.mouseRecorder, 10); // L: 2012
					Login.Login_loadingText = "Loaded input handler"; // L: 2013
					Login.Login_loadingPercent = 92; // L: 2014
					Client.field547 = class92.field1153; // L: 2015
				} else if (Client.field547 == class92.field1153) { // L: 2018
					if (!class131.field1565.tryLoadFileByNames("huffman", "")) { // L: 2019
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2020
						Login.Login_loadingPercent = 94; // L: 2021
					} else {
						Huffman var50 = new Huffman(class131.field1565.takeFileByNames("huffman", "")); // L: 2024
						class335.huffman = var50; // L: 2026
						Login.Login_loadingText = "Loaded wordpack"; // L: 2028
						Login.Login_loadingPercent = 94; // L: 2029
						Client.field547 = class92.field1154; // L: 2030
					}
				} else if (class92.field1154 == Client.field547) { // L: 2033
					if (!class253.archive4.isFullyLoaded()) { // L: 2034
						Login.Login_loadingText = "Loading interfaces - " + class253.archive4.loadPercent() * 4 / 5 + "%"; // L: 2035
						Login.Login_loadingPercent = 96; // L: 2036
					} else if (!class126.archive12.isFullyLoaded()) { // L: 2039
						Login.Login_loadingText = "Loading interfaces - " + (80 + class126.archive12.loadPercent() / 6) + "%"; // L: 2040
						Login.Login_loadingPercent = 96; // L: 2041
					} else if (!FontName.archive13.isFullyLoaded()) { // L: 2044
						Login.Login_loadingText = "Loading interfaces - " + (96 + FontName.archive13.loadPercent() / 50) + "%"; // L: 2045
						Login.Login_loadingPercent = 96; // L: 2046
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2049
						Login.Login_loadingPercent = 98; // L: 2050
						if (class126.archive12.isValidFileName("version.dat", "")) { // L: 2051
							Buffer var27 = new Buffer(class126.archive12.takeFileByNames("version.dat", "")); // L: 2052
							var27.readUnsignedShort(); // L: 2053
						}

						Client.field547 = class92.field1142; // L: 2055
					}
				} else if (Client.field547 == class92.field1142) { // L: 2058
					Login.Login_loadingPercent = 100; // L: 2059
					if (Varcs.field1402.getGroupCount() > 0 && !Varcs.field1402.tryLoadGroupByName(WorldMapCacheName.field3050.name)) { // L: 2060
						Login.Login_loadingText = "Loading world map - " + Varcs.field1402.groupLoadPercentByName(WorldMapCacheName.field3050.name) / 10 + "%"; // L: 2061
					} else {
						if (class127.worldMap == null) { // L: 2064
							class127.worldMap = new WorldMap(); // L: 2065
							class127.worldMap.init(Varcs.field1402, class106.field1358, Interpreter.field885, Calendar.fontBold12, Client.field582, class282.mapSceneSprites); // L: 2066
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2068
						Client.field547 = class92.field1156; // L: 2069
					}
				} else {
					if (class92.field1156 == Client.field547) { // L: 2072
						class129.method2989(10); // L: 2073
					}

				}
			}
		}
	} // L: 1495 1501 1528 1556 1576 1628 1641 1650 1698 1704 1710 1715 1826 1972 1984 1990 1996 2003 2008 2016 2022 2031 2037 2042 2047 2056 2062 2070 2075

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2127910071"
	)
	static final void method4553(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9241
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9242
				Client.field718[var4] = true;
			}
		}

	} // L: 9244

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 12661
		var0.packetBuffer.writeByte(0); // L: 12662
		Client.packetWriter.addNode(var0); // L: 12663
	} // L: 12664
}
