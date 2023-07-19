import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("ModeWhere")
public enum ModeWhere implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4373("", 0, new class370[]{class370.field4345, class370.field4348}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4371("", 1, new class370[]{class370.field4346, class370.field4345, class370.field4348}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4385("", 2, new class370[]{class370.field4346, class370.field4344, class370.field4345}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4386("", 3, new class370[]{class370.field4346}),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4370("", 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4375("", 5, new class370[]{class370.field4346, class370.field4345}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4374("", 6, new class370[]{class370.field4345}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4377("", 8, new class370[]{class370.field4346, class370.field4345}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4378("", 9, new class370[]{class370.field4346, class370.field4344}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4376("", 10, new class370[]{class370.field4346}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4380("", 11, new class370[]{class370.field4346}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4372("", 12, new class370[]{class370.field4346, class370.field4345}),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4389("", 13, new class370[]{class370.field4346});

	@ObfuscatedName("gu")
	static String field4381;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = -815020805
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1051769649
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	final Set field4384;

	static {
		method7024(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lou;)V"
	)
	ModeWhere(String var3, int var4, class370[] var5) {
		this.field4384 = new HashSet();
		this.id = var4; // L: 41
		class370[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class370 var8 = var6[var7]; // L: 45
			this.field4384.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4384 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Low;",
		garbageValue = "1806846147"
	)
	static ModeWhere[] method7024() {
		return new ModeWhere[]{field4375, field4373, field4389, field4386, field4377, field4380, field4374, field4385, field4370, field4376, field4371, field4372, field4378}; // L: 33
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "24007"
	)
	static void method7029() {
		int var15;
		if (class92.field1153 == Client.field530) { // L: 1560
			class173.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1561

			for (var15 = 0; var15 < 4; ++var15) { // L: 1562
				Client.collisionMaps[var15] = new CollisionMap(104, 104);
			}

			InterfaceParent.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1563
			Login.Login_loadingText = "Starting game engine..."; // L: 1564
			Login.Login_loadingPercent = 5; // L: 1565
			Client.field530 = class92.field1140; // L: 1566
		} else if (class92.field1140 == Client.field530) { // L: 1569
			Login.Login_loadingText = "Prepared visibility map"; // L: 1570
			Login.Login_loadingPercent = 10; // L: 1571
			Client.field530 = class92.field1141; // L: 1572
		} else if (class92.field1141 == Client.field530) { // L: 1575
			class19.field90 = class502.newArchive(0, false, true, true, false); // L: 1576
			FontName.archive7 = class502.newArchive(1, false, true, true, false); // L: 1577
			class342.archive2 = class502.newArchive(2, true, false, true, false); // L: 1578
			FontName.archive4 = class502.newArchive(3, false, true, true, false); // L: 1579
			GraphicsObject.archive9 = class502.newArchive(4, false, true, true, false); // L: 1580
			Renderable.archive6 = class502.newArchive(5, true, true, true, false); // L: 1581
			class329.archive11 = class502.newArchive(6, true, true, true, false); // L: 1582
			GrandExchangeOfferOwnWorldComparator.archive8 = class502.newArchive(7, false, true, true, false); // L: 1583
			Nameable.field4637 = class502.newArchive(8, false, true, true, false); // L: 1584
			class148.archive10 = class502.newArchive(9, false, true, true, false); // L: 1585
			class9.field38 = class502.newArchive(10, false, true, true, false); // L: 1586
			class6.field20 = class502.newArchive(11, false, true, true, false); // L: 1587
			class359.archive12 = class502.newArchive(12, false, true, true, false); // L: 1588
			Canvas.archive13 = class502.newArchive(13, true, false, true, false); // L: 1589
			class30.field158 = class502.newArchive(14, false, true, true, false); // L: 1590
			class260.field2961 = class502.newArchive(15, false, true, true, false); // L: 1591
			Messages.field1409 = class502.newArchive(17, true, true, true, false); // L: 1592
			WorldMapArchiveLoader.field4877 = class502.newArchive(18, false, true, true, false); // L: 1593
			class12.field59 = class502.newArchive(19, false, true, true, false); // L: 1594
			World.field813 = class502.newArchive(20, false, true, true, false); // L: 1595
			class170.field1811 = class502.newArchive(21, false, true, true, true); // L: 1596
			Login.Login_loadingText = "Connecting to update server"; // L: 1597
			Login.Login_loadingPercent = 20; // L: 1598
			Client.field530 = class92.field1142; // L: 1599
		} else if (Client.field530 == class92.field1142) { // L: 1602
			byte var34 = 0; // L: 1603
			var15 = var34 + class19.field90.percentage() * 4 / 100; // L: 1604
			var15 += FontName.archive7.percentage() * 4 / 100; // L: 1605
			var15 += class342.archive2.percentage() * 2 / 100; // L: 1606
			var15 += FontName.archive4.percentage() * 2 / 100; // L: 1607
			var15 += GraphicsObject.archive9.percentage() * 6 / 100; // L: 1608
			var15 += Renderable.archive6.percentage() * 4 / 100; // L: 1609
			var15 += class329.archive11.percentage() * 2 / 100; // L: 1610
			var15 += GrandExchangeOfferOwnWorldComparator.archive8.percentage() * 55 / 100; // L: 1611
			var15 += Nameable.field4637.percentage() * 2 / 100; // L: 1612
			var15 += class148.archive10.percentage() * 2 / 100; // L: 1613
			var15 += class9.field38.percentage() * 2 / 100; // L: 1614
			var15 += class6.field20.percentage() * 2 / 100; // L: 1615
			var15 += class359.archive12.percentage() * 2 / 100; // L: 1616
			var15 += Canvas.archive13.percentage() * 2 / 100; // L: 1617
			var15 += class30.field158.percentage() * 2 / 100; // L: 1618
			var15 += class260.field2961.percentage() * 2 / 100; // L: 1619
			var15 += class12.field59.percentage() / 100; // L: 1620
			var15 += WorldMapArchiveLoader.field4877.percentage() / 100; // L: 1621
			var15 += World.field813.percentage() / 100; // L: 1622
			var15 += class170.field1811.percentage() / 100; // L: 1623
			var15 += Messages.field1409.method6741() && Messages.field1409.isFullyLoaded() ? 1 : 0; // L: 1624
			if (var15 != 100) { // L: 1625
				if (var15 != 0) { // L: 1626
					Login.Login_loadingText = "Checking for updates - " + var15 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1627
			} else {
				class143.method3208(class19.field90, "Animations"); // L: 1630
				class143.method3208(FontName.archive7, "Skeletons"); // L: 1631
				class143.method3208(GraphicsObject.archive9, "Sound FX"); // L: 1632
				class143.method3208(Renderable.archive6, "Maps"); // L: 1633
				class143.method3208(class329.archive11, "Music Tracks"); // L: 1634
				class143.method3208(GrandExchangeOfferOwnWorldComparator.archive8, "Models"); // L: 1635
				class143.method3208(Nameable.field4637, "Sprites"); // L: 1636
				class143.method3208(class6.field20, "Music Jingles"); // L: 1637
				class143.method3208(class30.field158, "Music Samples"); // L: 1638
				class143.method3208(class260.field2961, "Music Patches"); // L: 1639
				class143.method3208(class12.field59, "World Map"); // L: 1640
				class143.method3208(WorldMapArchiveLoader.field4877, "World Map Geography"); // L: 1641
				class143.method3208(World.field813, "World Map Ground"); // L: 1642
				class108.field1392 = new GraphicsDefaults(); // L: 1643
				class108.field1392.decode(Messages.field1409); // L: 1644
				Login.Login_loadingText = "Loaded update list"; // L: 1645
				Login.Login_loadingPercent = 30; // L: 1646
				Client.field530 = class92.field1151; // L: 1647
			}
		} else {
			int var17;
			if (class92.field1151 != Client.field530) { // L: 1650
				int var16;
				if (Client.field530 == class92.field1143) { // L: 1672
					FontName[] var24 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana13}; // L: 1675
					var16 = var24.length; // L: 1677
					Fonts var26 = class132.field1580; // L: 1678
					FontName[] var31 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana13}; // L: 1681
					Client.field565 = var26.createMap(var31); // L: 1683
					if (Client.field565.size() < var16) { // L: 1684
						Login.Login_loadingText = "Loading fonts - " + Client.field565.size() * 100 / var16 + "%"; // L: 1685
						Login.Login_loadingPercent = 40; // L: 1686
					} else {
						class149.field1683 = (Font)Client.field565.get(FontName.FontName_plain11); // L: 1689
						StudioGame.fontPlain12 = (Font)Client.field565.get(FontName.FontName_plain12); // L: 1690
						class290.fontBold12 = (Font)Client.field565.get(FontName.FontName_bold12); // L: 1691
						FriendSystem.field831 = Client.field780.get(); // L: 1692
						Login.Login_loadingText = "Loaded fonts"; // L: 1693
						Login.Login_loadingPercent = 40; // L: 1694
						Client.field530 = class92.field1145; // L: 1695
					}
				} else {
					Archive var2;
					int var3;
					if (class92.field1145 == Client.field530) { // L: 1698
						var15 = class349.method6675(class9.field38, Nameable.field4637); // L: 1699
						var2 = Nameable.field4637; // L: 1701
						var3 = Login.field950.length + Login.field951.length; // L: 1703
						String[] var32 = Login.field925; // L: 1705

						for (int var33 = 0; var33 < var32.length; ++var33) { // L: 1706
							String var28 = var32[var33]; // L: 1707
							if (var2.getGroupId(var28) != -1) { // L: 1709
								++var3; // L: 1710
							}
						}

						if (var15 < var3) { // L: 1718
							Login.Login_loadingText = "Loading title screen - " + var15 * 100 / var3 + "%"; // L: 1719
							Login.Login_loadingPercent = 50; // L: 1720
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1723
							Login.Login_loadingPercent = 50; // L: 1724
							AttackOption.method2723(5); // L: 1725
							Client.field530 = class92.field1146; // L: 1726
						}
					} else if (class92.field1146 == Client.field530) { // L: 1729
						if (!class342.archive2.isFullyLoaded()) { // L: 1730
							Login.Login_loadingText = "Loading config - " + class342.archive2.loadPercent() + "%"; // L: 1731
							Login.Login_loadingPercent = 60; // L: 1732
						} else if (!class170.field1811.isFullyLoaded()) { // L: 1735
							Login.Login_loadingText = "Loading config - " + (80 + class359.archive12.loadPercent() / 6) + "%"; // L: 1736
							Login.Login_loadingPercent = 60; // L: 1737
						} else {
							class157.method3368(class342.archive2); // L: 1740
							Archive var23 = class342.archive2; // L: 1741
							FloorUnderlayDefinition.field2089 = var23; // L: 1743
							Archive var27 = class342.archive2; // L: 1745
							var2 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 1746
							KitDefinition.KitDefinition_archive = var27; // L: 1748
							KitDefinition.KitDefinition_modelsArchive = var2; // L: 1749
							KitDefinition.field1951 = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1750
							TaskHandler.method3573(class342.archive2, GrandExchangeOfferOwnWorldComparator.archive8, Client.isLowDetail); // L: 1752
							class309.method6019(class342.archive2, GrandExchangeOfferOwnWorldComparator.archive8); // L: 1753
							class141.method3188(class342.archive2); // L: 1754
							Archive var30 = class342.archive2; // L: 1755
							Archive var19 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 1756
							boolean var20 = Client.isMembersWorld; // L: 1757
							Font var6 = class149.field1683; // L: 1758
							class497.ItemComposition_archive = var30; // L: 1760
							ItemComposition.ItemComposition_modelArchive = var19; // L: 1761
							HealthBarUpdate.ItemComposition_inMembersWorld = var20; // L: 1762
							class141.ItemComposition_fileCount = class497.ItemComposition_archive.getGroupFileCount(10); // L: 1763
							class290.field3096 = var6; // L: 1764
							class166.method3445(class342.archive2, class19.field90, FontName.archive7); // L: 1766
							ClientPreferences.method2552(class342.archive2, GrandExchangeOfferOwnWorldComparator.archive8); // L: 1767
							Archive var7 = class342.archive2; // L: 1768
							VarbitComposition.VarbitDefinition_archive = var7; // L: 1770
							NPC.method2658(class342.archive2); // L: 1772
							class131.method3109(FontName.archive4, GrandExchangeOfferOwnWorldComparator.archive8, Nameable.field4637, Canvas.archive13); // L: 1773
							Archive var8 = class342.archive2; // L: 1774
							InvDefinition.InvDefinition_archive = var8; // L: 1776
							PacketWriter.method2867(class342.archive2); // L: 1778
							Archive var9 = class342.archive2; // L: 1779
							VarcInt.VarcInt_archive = var9; // L: 1781
							LoginScreenAnimation.method2497(class342.archive2); // L: 1783
							SecureRandomFuture.method2170(class342.archive2); // L: 1784
							VarpDefinition.method3690(class342.archive2); // L: 1785
							ArchiveLoader.method2282(class342.archive2); // L: 1786
							MusicPatchPcmStream.HitSplatDefinition_cachedSprites = new class497(class6.field15, 54, WorldMapElement.clientLanguage, class342.archive2); // L: 1787
							class163.Ignored_cached = new class497(class6.field15, 47, WorldMapElement.clientLanguage, class342.archive2); // L: 1788
							class144.varcs = new Varcs(); // L: 1789
							Archive var10 = class342.archive2; // L: 1790
							Archive var11 = Nameable.field4637; // L: 1791
							Archive var12 = Canvas.archive13; // L: 1792
							HitSplatDefinition.HitSplatDefinition_archive = var10; // L: 1794
							HitSplatDefinition.field2135 = var11; // L: 1795
							DevicePcmPlayerProvider.HitSplatDefinition_fontsArchive = var12; // L: 1796
							Archive var13 = class342.archive2; // L: 1798
							Archive var14 = Nameable.field4637; // L: 1799
							FriendSystem.HealthBarDefinition_archive = var13; // L: 1801
							HealthBarDefinition.field1975 = var14; // L: 1802
							class272.method5551(class342.archive2, Nameable.field4637); // L: 1804
							Login.Login_loadingText = "Loaded config"; // L: 1805
							Login.Login_loadingPercent = 60; // L: 1806
							Client.field530 = class92.field1147; // L: 1807
						}
					} else if (Client.field530 == class92.field1147) { // L: 1810
						var15 = 0; // L: 1811
						if (class178.compass == null) { // L: 1812
							class178.compass = LoginType.SpriteBuffer_getSprite(Nameable.field4637, class108.field1392.field4696, 0);
						} else {
							++var15; // L: 1813
						}

						if (class1.redHintArrowSprite == null) { // L: 1814
							class1.redHintArrowSprite = LoginType.SpriteBuffer_getSprite(Nameable.field4637, class108.field1392.field4694, 0);
						} else {
							++var15; // L: 1815
						}

						boolean var4;
						byte[] var5;
						IndexedSprite[] var25;
						if (class47.mapSceneSprites == null) { // L: 1816
							var2 = Nameable.field4637; // L: 1818
							var3 = class108.field1392.field4699; // L: 1819
							var5 = var2.takeFile(var3, 0); // L: 1823
							if (var5 == null) { // L: 1824
								var4 = false; // L: 1825
							} else {
								GrandExchangeEvent.SpriteBuffer_decode(var5); // L: 1828
								var4 = true; // L: 1829
							}

							if (!var4) { // L: 1831
								var25 = null; // L: 1832
							} else {
								var25 = class231.method4797(); // L: 1835
							}

							class47.mapSceneSprites = var25; // L: 1837
						} else {
							++var15; // L: 1839
						}

						if (class85.field1056 == null) { // L: 1840
							class85.field1056 = class143.method3200(Nameable.field4637, class108.field1392.field4701, 0);
						} else {
							++var15; // L: 1841
						}

						if (class156.field1746 == null) { // L: 1842
							class156.field1746 = class143.method3200(Nameable.field4637, class108.field1392.field4697, 0);
						} else {
							++var15; // L: 1843
						}

						if (class191.field1979 == null) { // L: 1844
							class191.field1979 = class143.method3200(Nameable.field4637, class108.field1392.field4698, 0);
						} else {
							++var15; // L: 1845
						}

						if (WorldMapCacheName.field3065 == null) { // L: 1846
							WorldMapCacheName.field3065 = class143.method3200(Nameable.field4637, class108.field1392.field4705, 0);
						} else {
							++var15; // L: 1847
						}

						if (class521.field5130 == null) { // L: 1848
							class521.field5130 = class143.method3200(Nameable.field4637, class108.field1392.field4700, 0);
						} else {
							++var15; // L: 1849
						}

						if (class47.field331 == null) { // L: 1850
							class47.field331 = class143.method3200(Nameable.field4637, class108.field1392.field4702, 0);
						} else {
							++var15; // L: 1851
						}

						if (HealthBar.scrollBarSprites == null) { // L: 1852
							var2 = Nameable.field4637; // L: 1854
							var3 = class108.field1392.field4704; // L: 1855
							var5 = var2.takeFile(var3, 0); // L: 1859
							if (var5 == null) { // L: 1860
								var4 = false; // L: 1861
							} else {
								GrandExchangeEvent.SpriteBuffer_decode(var5); // L: 1864
								var4 = true; // L: 1865
							}

							if (!var4) { // L: 1867
								var25 = null; // L: 1868
							} else {
								var25 = class231.method4797(); // L: 1871
							}

							HealthBar.scrollBarSprites = var25; // L: 1873
						} else {
							++var15; // L: 1875
						}

						if (GameEngine.field190 == null) { // L: 1876
							var2 = Nameable.field4637; // L: 1878
							var3 = class108.field1392.field4703; // L: 1879
							var5 = var2.takeFile(var3, 0); // L: 1883
							if (var5 == null) { // L: 1884
								var4 = false; // L: 1885
							} else {
								GrandExchangeEvent.SpriteBuffer_decode(var5); // L: 1888
								var4 = true; // L: 1889
							}

							if (!var4) { // L: 1891
								var25 = null; // L: 1892
							} else {
								var25 = class231.method4797(); // L: 1895
							}

							GameEngine.field190 = var25; // L: 1897
						} else {
							++var15; // L: 1899
						}

						if (var15 < 11) { // L: 1900
							Login.Login_loadingText = "Loading sprites - " + var15 * 100 / 12 + "%"; // L: 1901
							Login.Login_loadingPercent = 70; // L: 1902
						} else {
							AbstractFont.AbstractFont_modIconSprites = GameEngine.field190; // L: 1905
							class1.redHintArrowSprite.normalize(); // L: 1906
							var16 = (int)(Math.random() * 21.0D) - 10; // L: 1907
							var17 = (int)(Math.random() * 21.0D) - 10; // L: 1908
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1909
							int var29 = (int)(Math.random() * 41.0D) - 20; // L: 1910
							class47.mapSceneSprites[0].shiftColors(var29 + var16, var17 + var29, var29 + var3); // L: 1911
							Login.Login_loadingText = "Loaded sprites"; // L: 1912
							Login.Login_loadingPercent = 70; // L: 1913
							Client.field530 = class92.field1139; // L: 1914
						}
					} else if (class92.field1139 == Client.field530) { // L: 1917
						if (!class148.archive10.isFullyLoaded()) { // L: 1918
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1919
							Login.Login_loadingPercent = 90; // L: 1920
						} else {
							FileSystem.field1853 = new TextureProvider(class148.archive10, Nameable.field4637, 20, ScriptFrame.clientPreferences.method2514(), Client.isLowDetail ? 64 : 128); // L: 1923
							Rasterizer3D.method4496(FileSystem.field1853); // L: 1924
							Rasterizer3D.Rasterizer3D_setBrightness(ScriptFrame.clientPreferences.method2514()); // L: 1925
							Client.field530 = class92.field1149; // L: 1926
						}
					} else if (Client.field530 == class92.field1149) { // L: 1929
						var15 = FileSystem.field1853.getLoadedPercentage(); // L: 1930
						if (var15 < 100) { // L: 1931
							Login.Login_loadingText = "Loading textures - " + var15 + "%"; // L: 1932
							Login.Login_loadingPercent = 90; // L: 1933
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1936
							Login.Login_loadingPercent = 90; // L: 1937
							Client.field530 = class92.field1150; // L: 1938
						}
					} else if (Client.field530 == class92.field1150) { // L: 1941
						class197.mouseRecorder = new MouseRecorder(); // L: 1942
						GameEngine.taskHandler.newThreadTask(class197.mouseRecorder, 10); // L: 1943
						Login.Login_loadingText = "Loaded input handler"; // L: 1944
						Login.Login_loadingPercent = 92; // L: 1945
						Client.field530 = class92.field1144; // L: 1946
					} else if (class92.field1144 == Client.field530) { // L: 1949
						if (!class9.field38.tryLoadFileByNames("huffman", "")) { // L: 1950
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1951
							Login.Login_loadingPercent = 94; // L: 1952
						} else {
							Huffman var22 = new Huffman(class9.field38.takeFileByNames("huffman", "")); // L: 1955
							class194.method3809(var22); // L: 1956
							Login.Login_loadingText = "Loaded wordpack"; // L: 1957
							Login.Login_loadingPercent = 94; // L: 1958
							Client.field530 = class92.field1152; // L: 1959
						}
					} else if (class92.field1152 == Client.field530) { // L: 1962
						if (!FontName.archive4.isFullyLoaded()) { // L: 1963
							Login.Login_loadingText = "Loading interfaces - " + FontName.archive4.loadPercent() * 4 / 5 + "%"; // L: 1964
							Login.Login_loadingPercent = 96; // L: 1965
						} else if (!class359.archive12.isFullyLoaded()) { // L: 1968
							Login.Login_loadingText = "Loading interfaces - " + (80 + class359.archive12.loadPercent() / 6) + "%"; // L: 1969
							Login.Login_loadingPercent = 96; // L: 1970
						} else if (!Canvas.archive13.isFullyLoaded()) { // L: 1973
							Login.Login_loadingText = "Loading interfaces - " + (96 + Canvas.archive13.loadPercent() / 50) + "%"; // L: 1974
							Login.Login_loadingPercent = 96; // L: 1975
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1978
							Login.Login_loadingPercent = 98; // L: 1979
							if (class359.archive12.isValidFileName("version.dat", "")) { // L: 1980
								Buffer var21 = new Buffer(class359.archive12.takeFileByNames("version.dat", "")); // L: 1981
								var21.readUnsignedShort(); // L: 1982
							}

							Client.field530 = class92.field1155; // L: 1984
						}
					} else if (class92.field1155 == Client.field530) { // L: 1987
						Login.Login_loadingPercent = 100; // L: 1988
						if (class12.field59.getGroupCount() > 0 && !class12.field59.tryLoadGroupByName(WorldMapCacheName.field3064.name)) { // L: 1989
							Login.Login_loadingText = "Loading world map - " + class12.field59.groupLoadPercentByName(WorldMapCacheName.field3064.name) / 10 + "%"; // L: 1990
						} else {
							if (ScriptFrame.worldMap == null) { // L: 1993
								ScriptFrame.worldMap = new WorldMap(); // L: 1994
								ScriptFrame.worldMap.init(class12.field59, WorldMapArchiveLoader.field4877, World.field813, class290.fontBold12, Client.field565, class47.mapSceneSprites); // L: 1995
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1997
							Client.field530 = class92.field1154; // L: 1998
						}
					} else {
						if (class92.field1154 == Client.field530) { // L: 2001
							AttackOption.method2723(10); // L: 2002
						}

					}
				}
			} else {
				MenuAction.method2091(22050, !Client.isLowDetail, 2); // L: 1651
				ArrayList var0 = new ArrayList(3); // L: 1652
				Timer.pcmPlayer1 = class10.method114(GameEngine.taskHandler, 0, 2048); // L: 1653
				ApproximateRouteStrategy.pcmStreamMixer = new PcmStreamMixer(); // L: 1654
				PcmStreamMixer var1 = new PcmStreamMixer(); // L: 1655
				var1.addSubStream(ApproximateRouteStrategy.pcmStreamMixer); // L: 1656

				for (var17 = 0; var17 < 3; ++var17) { // L: 1657
					MidiPcmStream var18 = new MidiPcmStream(); // L: 1658
					var18.method5837(9, 128); // L: 1659
					var1.addSubStream(var18); // L: 1660
					var0.add(var18); // L: 1661
				}

				Timer.pcmPlayer1.setStream(var1); // L: 1663
				class101.method2690(class260.field2961, class30.field158, GraphicsObject.archive9, var0); // L: 1664
				JagexCache.decimator = new Decimator(22050, PcmPlayer.field271); // L: 1665
				Login.Login_loadingText = "Prepared sound engine"; // L: 1666
				Login.Login_loadingPercent = 35; // L: 1667
				Client.field530 = class92.field1143; // L: 1668
				class132.field1580 = new Fonts(Nameable.field4637, Canvas.archive13); // L: 1669
			}
		}
	} // L: 1567 1573 1600 1628 1648 1670 1687 1696 1721 1727 1733 1738 1808 1903 1915 1921 1927 1934 1939 1947 1953 1960 1966 1971 1976 1985 1991 1999 2004

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1749031717"
	)
	static final void method7028(int var0, int var1, int var2, boolean var3) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 11061
			SecureRandomFuture.resizeInterface(class179.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 11062
		}
	} // L: 11063
}
