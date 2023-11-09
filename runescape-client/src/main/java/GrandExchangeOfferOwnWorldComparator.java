import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static IndexedSprite field478;
	@ObfuscatedName("jw")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 1542416247
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("aj")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12438

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;B)I",
		garbageValue = "-66"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12441
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12442
				if (Client.worldId == var1.world) { // L: 12443
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12444
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12446
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12454
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12450
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lho;",
		garbageValue = "-870490677"
	)
	static HorizontalAlignment[] method1210() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1977, HorizontalAlignment.field1975, HorizontalAlignment.HorizontalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "11"
	)
	static int method1208(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5013
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5014
			ObjectComposition var4 = DecorativeObject.getObjectDefinition(var3); // L: 5015
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5016
			return 1; // L: 5017
		} else {
			return 2; // L: 5019
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "780329650"
	)
	@Export("load")
	static void load() {
		int var33;
		if (Client.titleLoadingStage == 0) { // L: 1594
			class1.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1595

			for (var33 = 0; var33 < 4; ++var33) { // L: 1596
				Client.collisionMaps[var33] = new CollisionMap(104, 104);
			}

			class188.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1597
			Login.Login_loadingText = "Starting game engine..."; // L: 1598
			Login.Login_loadingPercent = 5; // L: 1599
			Client.titleLoadingStage = 20; // L: 1600
		} else if (Client.titleLoadingStage == 20) { // L: 1603
			Login.Login_loadingText = "Prepared visibility map"; // L: 1604
			Login.Login_loadingPercent = 10; // L: 1605
			Client.titleLoadingStage = 30; // L: 1606
		} else if (Client.titleLoadingStage == 30) { // L: 1609
			UserComparator5.field1419 = class72.newArchive(0, false, true, true, false); // L: 1610
			class290.archive7 = class72.newArchive(1, false, true, true, false); // L: 1611
			class258.archive2 = class72.newArchive(2, true, false, true, false); // L: 1612
			class135.archive4 = class72.newArchive(3, false, true, true, false); // L: 1613
			class175.archive9 = class72.newArchive(4, false, true, true, false); // L: 1614
			ClientPreferences.field1265 = class72.newArchive(5, true, true, true, false); // L: 1615
			class308.archive6 = class72.newArchive(6, true, true, true, false); // L: 1616
			Clock.archive11 = class72.newArchive(7, false, true, true, false); // L: 1617
			class143.archive8 = class72.newArchive(8, false, true, true, false); // L: 1618
			class20.archive10 = class72.newArchive(9, false, true, true, false); // L: 1619
			class223.field2581 = class72.newArchive(10, false, true, true, false); // L: 1620
			class36.field239 = class72.newArchive(11, false, true, true, false); // L: 1621
			class167.archive12 = class72.newArchive(12, false, true, true, false); // L: 1622
			TextureProvider.archive13 = class72.newArchive(13, true, false, true, false); // L: 1623
			class90.archive14 = class72.newArchive(14, false, true, true, false); // L: 1624
			MusicPatchPcmStream.archive15 = class72.newArchive(15, false, true, true, false); // L: 1625
			class127.archive17 = class72.newArchive(17, true, true, true, false); // L: 1626
			class376.archive18 = class72.newArchive(18, false, true, true, false); // L: 1627
			MusicPatchNode.archive19 = class72.newArchive(19, false, true, true, false); // L: 1628
			class475.archive20 = class72.newArchive(20, false, true, true, false); // L: 1629
			class320.field3708 = class72.newArchive(21, false, true, true, true); // L: 1630
			Login.Login_loadingText = "Connecting to update server"; // L: 1631
			Login.Login_loadingPercent = 20; // L: 1632
			Client.titleLoadingStage = 40; // L: 1633
		} else if (Client.titleLoadingStage != 40) { // L: 1636
			if (Client.titleLoadingStage == 45) { // L: 1684
				class98.method2629(22050, !Client.isLowDetail, 2); // L: 1685
				MidiPcmStream var31 = new MidiPcmStream(); // L: 1686
				var31.method5530(9, 128); // L: 1687
				Interpreter.pcmPlayer0 = class128.method3014(GameEngine.taskHandler, 0, 22050); // L: 1688
				Interpreter.pcmPlayer0.setStream(var31); // L: 1689
				class288.method5482(MusicPatchPcmStream.archive15, class90.archive14, class175.archive9, var31); // L: 1690
				ViewportMouse.pcmPlayer1 = class128.method3014(GameEngine.taskHandler, 1, 2048); // L: 1691
				class323.pcmStreamMixer = new PcmStreamMixer(); // L: 1692
				ViewportMouse.pcmPlayer1.setStream(class323.pcmStreamMixer); // L: 1693
				TaskHandler.decimator = new Decimator(22050, PcmPlayer.field292); // L: 1694
				Login.Login_loadingText = "Prepared sound engine"; // L: 1695
				Login.Login_loadingPercent = 35; // L: 1696
				Client.titleLoadingStage = 50; // L: 1697
				AbstractSocket.WorldMapElement_fonts = new Fonts(class143.archive8, TextureProvider.archive13); // L: 1698
			} else if (Client.titleLoadingStage == 50) { // L: 1701
				var33 = FontName.method8254().length; // L: 1702
				Client.fontsMap = AbstractSocket.WorldMapElement_fonts.createMap(FontName.method8254()); // L: 1703
				if (Client.fontsMap.size() < var33) { // L: 1704
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var33 + "%"; // L: 1705
					Login.Login_loadingPercent = 40; // L: 1706
				} else {
					Calendar.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1709
					class420.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1710
					class7.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1711
					HealthBarUpdate.platformInfo = Client.platformInfoProvider.get(); // L: 1712
					Login.Login_loadingText = "Loaded fonts"; // L: 1713
					Login.Login_loadingPercent = 40; // L: 1714
					Client.titleLoadingStage = 60; // L: 1715
				}
			} else {
				int var1;
				if (Client.titleLoadingStage == 60) { // L: 1718
					var33 = class419.method7811(class223.field2581, class143.archive8); // L: 1719
					var1 = class174.method3492(class143.archive8); // L: 1720
					if (var33 < var1) { // L: 1721
						Login.Login_loadingText = "Loading title screen - " + var33 * 100 / var1 + "%"; // L: 1722
						Login.Login_loadingPercent = 50; // L: 1723
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1726
						Login.Login_loadingPercent = 50; // L: 1727
						class19.method280(5); // L: 1728
						Client.titleLoadingStage = 70; // L: 1729
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1732
					if (!class258.archive2.isFullyLoaded()) { // L: 1733
						Login.Login_loadingText = "Loading config - " + class258.archive2.loadPercent() + "%"; // L: 1734
						Login.Login_loadingPercent = 60; // L: 1735
					} else if (!class320.field3708.isFullyLoaded()) { // L: 1738
						Login.Login_loadingText = "Loading config - " + (80 + class167.archive12.loadPercent() / 6) + "%"; // L: 1739
						Login.Login_loadingPercent = 60; // L: 1740
					} else {
						class145.method3141(class258.archive2); // L: 1743
						class16.method208(class258.archive2); // L: 1744
						Archive var30 = class258.archive2; // L: 1745
						Archive var27 = Clock.archive11; // L: 1746
						GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive = var30; // L: 1748
						KitDefinition.KitDefinition_modelsArchive = var27; // L: 1749
						KitDefinition.KitDefinition_fileCount = GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive.getGroupFileCount(3); // L: 1750
						Archive var28 = class258.archive2; // L: 1752
						Archive var29 = Clock.archive11; // L: 1753
						boolean var32 = Client.isLowDetail; // L: 1754
						ObjectComposition.ObjectDefinition_archive = var28; // L: 1756
						ObjectComposition.ObjectDefinition_modelsArchive = var29; // L: 1757
						ObjectComposition.ObjectDefinition_isLowDetail = var32; // L: 1758
						Archive var5 = class258.archive2; // L: 1760
						Archive var6 = Clock.archive11; // L: 1761
						NPCComposition.NpcDefinition_archive = var5; // L: 1763
						NPCComposition.NpcDefinition_modelArchive = var6; // L: 1764
						class137.method3086(class258.archive2); // L: 1766
						Archive var7 = class258.archive2; // L: 1767
						Archive var8 = Clock.archive11; // L: 1768
						boolean var9 = Client.isMembersWorld; // L: 1769
						Font var10 = Calendar.fontPlain11; // L: 1770
						class290.ItemComposition_archive = var7; // L: 1772
						ItemComposition.ItemComposition_modelArchive = var8; // L: 1773
						VarcInt.ItemComposition_inMembersWorld = var9; // L: 1774
						ChatChannel.ItemComposition_fileCount = class290.ItemComposition_archive.getGroupFileCount(10); // L: 1775
						ItemComposition.ItemComposition_fontPlain11 = var10; // L: 1776
						Archive var11 = class258.archive2; // L: 1778
						Archive var12 = UserComparator5.field1419; // L: 1779
						Archive var13 = class290.archive7; // L: 1780
						HealthBar.SequenceDefinition_archive = var11; // L: 1782
						SequenceDefinition.SequenceDefinition_animationsArchive = var12; // L: 1783
						SequenceDefinition.SequenceDefinition_skeletonsArchive = var13; // L: 1784
						Archive var14 = class258.archive2; // L: 1786
						Archive var15 = Clock.archive11; // L: 1787
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var14; // L: 1789
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var15; // L: 1790
						class248.method5135(class258.archive2); // L: 1792
						WorldMapData_1.method5111(class258.archive2); // L: 1793
						class123.method2911(class135.archive4, Clock.archive11, class143.archive8, TextureProvider.archive13); // L: 1794
						UserComparator4.method2842(class258.archive2); // L: 1795
						class180.method3538(class258.archive2); // L: 1796
						Archive var16 = class258.archive2; // L: 1797
						VarcInt.VarcInt_archive = var16; // L: 1799
						Archive var17 = class258.archive2; // L: 1801
						Archive var18 = class258.archive2; // L: 1803
						class368.ParamDefinition_archive = var18; // L: 1805
						Archive var19 = class258.archive2; // L: 1807
						class470.field4874 = var19; // L: 1809
						Archive var20 = class258.archive2; // L: 1811
						class472.field4881 = var20; // L: 1813
						KitDefinition.HitSplatDefinition_cachedSprites = new class462(class470.field4870, 54, class69.clientLanguage, class258.archive2); // L: 1815
						Messages.Ignored_cached = new class462(class470.field4870, 47, class69.clientLanguage, class258.archive2); // L: 1816
						class248.varcs = new Varcs(); // L: 1817
						Archive var21 = class258.archive2; // L: 1818
						Archive var22 = class143.archive8; // L: 1819
						Archive var23 = TextureProvider.archive13; // L: 1820
						class102.HitSplatDefinition_archive = var21; // L: 1822
						HitSplatDefinition.field2101 = var22; // L: 1823
						SecureRandomFuture.HitSplatDefinition_fontsArchive = var23; // L: 1824
						Archive var24 = class258.archive2; // L: 1826
						Archive var25 = class143.archive8; // L: 1827
						HealthBarDefinition.HealthBarDefinition_archive = var24; // L: 1829
						HealthBarDefinition.field1947 = var25; // L: 1830
						MouseRecorder.method2272(class258.archive2, class143.archive8); // L: 1832
						Login.Login_loadingText = "Loaded config"; // L: 1833
						Login.Login_loadingPercent = 60; // L: 1834
						Client.titleLoadingStage = 80; // L: 1835
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1838
					var33 = 0; // L: 1839
					if (class149.compass == null) { // L: 1840
						class149.compass = WorldMapScaleHandler.SpriteBuffer_getSprite(class143.archive8, PcmPlayer.spriteIds.compass, 0);
					} else {
						++var33; // L: 1841
					}

					if (class136.redHintArrowSprite == null) { // L: 1842
						class136.redHintArrowSprite = WorldMapScaleHandler.SpriteBuffer_getSprite(class143.archive8, PcmPlayer.spriteIds.field4575, 0);
					} else {
						++var33; // L: 1843
					}

					if (LoginScreenAnimation.mapSceneSprites == null) { // L: 1844
						LoginScreenAnimation.mapSceneSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.mapScenes, 0);
					} else {
						++var33; // L: 1845
					}

					if (class315.headIconPkSprites == null) { // L: 1846
						class315.headIconPkSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.headIconsPk, 0);
					} else {
						++var33; // L: 1847
					}

					if (class287.headIconPrayerSprites == null) { // L: 1848
						class287.headIconPrayerSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4572, 0);
					} else {
						++var33; // L: 1849
					}

					if (EnumComposition.headIconHintSprites == null) { // L: 1850
						EnumComposition.headIconHintSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4576, 0);
					} else {
						++var33; // L: 1851
					}

					if (AbstractWorldMapData.mapMarkerSprites == null) { // L: 1852
						AbstractWorldMapData.mapMarkerSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4577, 0);
					} else {
						++var33; // L: 1853
					}

					if (Friend.crossSprites == null) { // L: 1854
						Friend.crossSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4578, 0);
					} else {
						++var33; // L: 1855
					}

					if (class157.mapDotSprites == null) { // L: 1856
						class157.mapDotSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4573, 0);
					} else {
						++var33; // L: 1857
					}

					if (AbstractWorldMapData.scrollBarSprites == null) { // L: 1858
						AbstractWorldMapData.scrollBarSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.field4580, 0);
					} else {
						++var33; // L: 1859
					}

					if (class36.modIconSprites == null) { // L: 1860
						class36.modIconSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.field4581, 0);
					} else {
						++var33; // L: 1861
					}

					if (var33 < 11) { // L: 1862
						Login.Login_loadingText = "Loading sprites - " + var33 * 100 / 12 + "%"; // L: 1863
						Login.Login_loadingPercent = 70; // L: 1864
					} else {
						AbstractFont.AbstractFont_modIconSprites = class36.modIconSprites; // L: 1867
						class136.redHintArrowSprite.normalize(); // L: 1868
						var1 = (int)(Math.random() * 21.0D) - 10; // L: 1869
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1870
						int var3 = (int)(Math.random() * 21.0D) - 10; // L: 1871
						int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1872
						LoginScreenAnimation.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var3 + var4); // L: 1873
						Login.Login_loadingText = "Loaded sprites"; // L: 1874
						Login.Login_loadingPercent = 70; // L: 1875
						Client.titleLoadingStage = 90; // L: 1876
					}
				} else if (Client.titleLoadingStage == 90) { // L: 1879
					if (!class20.archive10.isFullyLoaded()) { // L: 1880
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1881
						Login.Login_loadingPercent = 90; // L: 1882
					} else {
						FriendSystem.textureProvider = new TextureProvider(class20.archive10, class143.archive8, 20, WorldMapSectionType.clientPreferences.method2438(), Client.isLowDetail ? 64 : 128); // L: 1885
						Rasterizer3D.Rasterizer3D_setTextureLoader(FriendSystem.textureProvider); // L: 1886
						Rasterizer3D.Rasterizer3D_setBrightness(WorldMapSectionType.clientPreferences.method2438()); // L: 1887
						Client.titleLoadingStage = 100; // L: 1888
					}
				} else if (Client.titleLoadingStage == 100) { // L: 1891
					var33 = FriendSystem.textureProvider.getLoadedPercentage(); // L: 1892
					if (var33 < 100) { // L: 1893
						Login.Login_loadingText = "Loading textures - " + var33 + "%"; // L: 1894
						Login.Login_loadingPercent = 90; // L: 1895
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 1898
						Login.Login_loadingPercent = 90; // L: 1899
						Client.titleLoadingStage = 110; // L: 1900
					}
				} else if (Client.titleLoadingStage == 110) { // L: 1903
					class212.mouseRecorder = new MouseRecorder(); // L: 1904
					GameEngine.taskHandler.newThreadTask(class212.mouseRecorder, 10); // L: 1905
					Login.Login_loadingText = "Loaded input handler"; // L: 1906
					Login.Login_loadingPercent = 92; // L: 1907
					Client.titleLoadingStage = 120; // L: 1908
				} else if (Client.titleLoadingStage == 120) { // L: 1911
					if (!class223.field2581.tryLoadFileByNames("huffman", "")) { // L: 1912
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1913
						Login.Login_loadingPercent = 94; // L: 1914
					} else {
						Huffman var0 = new Huffman(class223.field2581.takeFileByNames("huffman", "")); // L: 1917
						WorldMapScaleHandler.method5372(var0); // L: 1918
						Login.Login_loadingText = "Loaded wordpack"; // L: 1919
						Login.Login_loadingPercent = 94; // L: 1920
						Client.titleLoadingStage = 130; // L: 1921
					}
				} else if (Client.titleLoadingStage == 130) { // L: 1924
					if (!class135.archive4.isFullyLoaded()) { // L: 1925
						Login.Login_loadingText = "Loading interfaces - " + class135.archive4.loadPercent() * 4 / 5 + "%"; // L: 1926
						Login.Login_loadingPercent = 96; // L: 1927
					} else if (!class167.archive12.isFullyLoaded()) { // L: 1930
						Login.Login_loadingText = "Loading interfaces - " + (80 + class167.archive12.loadPercent() / 6) + "%"; // L: 1931
						Login.Login_loadingPercent = 96; // L: 1932
					} else if (!TextureProvider.archive13.isFullyLoaded()) { // L: 1935
						Login.Login_loadingText = "Loading interfaces - " + (96 + TextureProvider.archive13.loadPercent() / 50) + "%"; // L: 1936
						Login.Login_loadingPercent = 96; // L: 1937
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 1940
						Login.Login_loadingPercent = 98; // L: 1941
						Client.titleLoadingStage = 140; // L: 1942
					}
				} else if (Client.titleLoadingStage == 140) { // L: 1945
					Login.Login_loadingPercent = 100; // L: 1946
					if (!MusicPatchNode.archive19.tryLoadGroupByName(WorldMapCacheName.field3019.name)) { // L: 1947
						Login.Login_loadingText = "Loading world map - " + MusicPatchNode.archive19.groupLoadPercentByName(WorldMapCacheName.field3019.name) / 10 + "%"; // L: 1948
					} else {
						if (WorldMapData_1.worldMap == null) { // L: 1951
							WorldMapData_1.worldMap = new WorldMap(); // L: 1952
							WorldMapData_1.worldMap.init(MusicPatchNode.archive19, class376.archive18, class475.archive20, class7.fontBold12, Client.fontsMap, LoginScreenAnimation.mapSceneSprites); // L: 1953
						}

						Login.Login_loadingText = "Loaded world map"; // L: 1955
						Client.titleLoadingStage = 150; // L: 1956
					}
				} else if (Client.titleLoadingStage == 150) { // L: 1959
					class19.method280(10); // L: 1960
				}
			}
		} else {
			byte var26 = 0; // L: 1637
			var33 = var26 + UserComparator5.field1419.percentage() * 4 / 100; // L: 1638
			var33 += class290.archive7.percentage() * 4 / 100; // L: 1639
			var33 += class258.archive2.percentage() * 2 / 100; // L: 1640
			var33 += class135.archive4.percentage() * 2 / 100; // L: 1641
			var33 += class175.archive9.percentage() * 6 / 100; // L: 1642
			var33 += ClientPreferences.field1265.percentage() * 4 / 100; // L: 1643
			var33 += class308.archive6.percentage() * 2 / 100; // L: 1644
			var33 += Clock.archive11.percentage() * 55 / 100; // L: 1645
			var33 += class143.archive8.percentage() * 2 / 100; // L: 1646
			var33 += class20.archive10.percentage() * 2 / 100; // L: 1647
			var33 += class223.field2581.percentage() * 2 / 100; // L: 1648
			var33 += class36.field239.percentage() * 2 / 100; // L: 1649
			var33 += class167.archive12.percentage() * 2 / 100; // L: 1650
			var33 += TextureProvider.archive13.percentage() * 2 / 100; // L: 1651
			var33 += class90.archive14.percentage() * 2 / 100; // L: 1652
			var33 += MusicPatchPcmStream.archive15.percentage() * 2 / 100; // L: 1653
			var33 += MusicPatchNode.archive19.percentage() / 100; // L: 1654
			var33 += class376.archive18.percentage() / 100; // L: 1655
			var33 += class475.archive20.percentage() / 100; // L: 1656
			var33 += class320.field3708.percentage() / 100; // L: 1657
			var33 += class127.archive17.method6424() && class127.archive17.isFullyLoaded() ? 1 : 0; // L: 1658
			if (var33 != 100) { // L: 1659
				if (var33 != 0) { // L: 1660
					Login.Login_loadingText = "Checking for updates - " + var33 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1661
			} else {
				Players.method2676(UserComparator5.field1419, "Animations"); // L: 1664
				Players.method2676(class290.archive7, "Skeletons"); // L: 1665
				Players.method2676(class175.archive9, "Sound FX"); // L: 1666
				Players.method2676(ClientPreferences.field1265, "Maps"); // L: 1667
				Players.method2676(class308.archive6, "Music Tracks"); // L: 1668
				Players.method2676(Clock.archive11, "Models"); // L: 1669
				Players.method2676(class143.archive8, "Sprites"); // L: 1670
				Players.method2676(class36.field239, "Music Jingles"); // L: 1671
				Players.method2676(class90.archive14, "Music Samples"); // L: 1672
				Players.method2676(MusicPatchPcmStream.archive15, "Music Patches"); // L: 1673
				Players.method2676(MusicPatchNode.archive19, "World Map"); // L: 1674
				Players.method2676(class376.archive18, "World Map Geography"); // L: 1675
				Players.method2676(class475.archive20, "World Map Ground"); // L: 1676
				PcmPlayer.spriteIds = new GraphicsDefaults(); // L: 1677
				PcmPlayer.spriteIds.decode(class127.archive17); // L: 1678
				Login.Login_loadingText = "Loaded update list"; // L: 1679
				Login.Login_loadingPercent = 30; // L: 1680
				Client.titleLoadingStage = 45; // L: 1681
			}
		}
	} // L: 1601 1607 1634 1662 1682 1699 1707 1716 1724 1730 1736 1741 1836 1865 1877 1883 1889 1896 1901 1909 1915 1922 1928 1933 1938 1943 1949 1957 1961 1963

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIIB)V",
		garbageValue = "1"
	)
	static void method1216(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.method2463() != 0) { // L: 3659
			if (var0.field2273 != null && var0.field2273.containsKey(var1)) { // L: 3660
				int var4 = (Integer)var0.field2273.get(var1); // L: 3661
				if (var4 != 0) { // L: 3665
					int var7 = var4 >> 8; // L: 3666
					int var8 = var4 >> 4 & 7; // L: 3667
					int var9 = var4 & 15; // L: 3668
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3669
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3670
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3671
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3672
					int var10 = (var2 - 64) / 128; // L: 3673
					int var11 = (var3 - 64) / 128; // L: 3674
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3675
					++Client.soundEffectCount; // L: 3676
				}

			}
		}
	} // L: 3678

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1311164641"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 10028
			class146.field1660 = null; // L: 10035
			Widget.drawInterface(class155.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10036
			if (class146.field1660 != null) { // L: 10037
				Widget.drawInterface(class146.field1660, -1412584499, var1, var2, var3, var4, ItemLayer.field2360, WorldMapAreaData.field3024, var7); // L: 10038
				class146.field1660 = null; // L: 10039
			}

		} else {
			if (var7 != -1) { // L: 10029
				Client.field722[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10031
					Client.field722[var8] = true;
				}
			}

		}
	} // L: 10033 10041
}
