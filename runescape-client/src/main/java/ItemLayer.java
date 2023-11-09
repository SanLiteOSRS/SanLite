import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		longValue = -987035906212619595L
	)
	static long field2406;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1510490599
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1821157617
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1159962163
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 6520122249337713437L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1651223891
	)
	@Export("height")
	int height;

	ItemLayer() {
	} // L: 13

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1152730143"
	)
	@Export("load")
	static void load() {
		int var22;
		if (Client.titleLoadingStage == 0) { // L: 1700
			UserComparator4.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1701

			for (var22 = 0; var22 < 4; ++var22) { // L: 1702
				Client.collisionMaps[var22] = new CollisionMap(104, 104);
			}

			class178.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1703
			Login.Login_loadingText = "Starting game engine..."; // L: 1704
			Login.Login_loadingPercent = 5; // L: 1705
			Client.titleLoadingStage = 20; // L: 1706
		} else if (Client.titleLoadingStage == 20) { // L: 1709
			Login.Login_loadingText = "Prepared visibility map"; // L: 1710
			Login.Login_loadingPercent = 10; // L: 1711
			Client.titleLoadingStage = 30; // L: 1712
		} else if (Client.titleLoadingStage == 30) { // L: 1715
			PcmPlayer.archive5 = class158.newArchive(0, false, true, true, false); // L: 1716
			ClientPacket.field3202 = class158.newArchive(1, false, true, true, false); // L: 1717
			class53.archive2 = class158.newArchive(2, true, false, true, false); // L: 1718
			PlatformInfo.archive7 = class158.newArchive(3, false, true, true, false); // L: 1719
			PacketWriter.archive4 = class158.newArchive(4, false, true, true, false); // L: 1720
			ModelData0.archive9 = class158.newArchive(5, true, true, true, false); // L: 1721
			class33.archive6 = class158.newArchive(6, true, true, true, false); // L: 1722
			class89.archive11 = class158.newArchive(7, false, true, true, false); // L: 1723
			GameBuild.archive8 = class158.newArchive(8, false, true, true, false); // L: 1724
			class138.field1593 = class158.newArchive(9, false, true, true, false); // L: 1725
			WorldMapDecoration.archive10 = class158.newArchive(10, false, true, true, false); // L: 1726
			class10.field45 = class158.newArchive(11, false, true, true, false); // L: 1727
			FriendsList.archive12 = class158.newArchive(12, false, true, true, false); // L: 1728
			class127.archive13 = class158.newArchive(13, true, false, true, false); // L: 1729
			Client.archive14 = class158.newArchive(14, false, true, true, false); // L: 1730
			class336.archive15 = class158.newArchive(15, false, true, true, false); // L: 1731
			class177.archive17 = class158.newArchive(17, true, true, true, false); // L: 1732
			Varps.archive18 = class158.newArchive(18, false, true, true, false); // L: 1733
			UserComparator8.archive19 = class158.newArchive(19, false, true, true, false); // L: 1734
			GroundObject.archive20 = class158.newArchive(20, false, true, true, false); // L: 1735
			class328.field3591 = class158.newArchive(21, false, true, true, true); // L: 1736
			Login.Login_loadingText = "Connecting to update server"; // L: 1737
			Login.Login_loadingPercent = 20; // L: 1738
			Client.titleLoadingStage = 40; // L: 1739
		} else if (Client.titleLoadingStage == 40) { // L: 1742
			byte var37 = 0; // L: 1743
			var22 = var37 + PcmPlayer.archive5.percentage() * 4 / 100; // L: 1744
			var22 += ClientPacket.field3202.percentage() * 4 / 100; // L: 1745
			var22 += class53.archive2.percentage() * 2 / 100; // L: 1746
			var22 += PlatformInfo.archive7.percentage() * 2 / 100; // L: 1747
			var22 += PacketWriter.archive4.percentage() * 6 / 100; // L: 1748
			var22 += ModelData0.archive9.percentage() * 4 / 100; // L: 1749
			var22 += class33.archive6.percentage() * 2 / 100; // L: 1750
			var22 += class89.archive11.percentage() * 55 / 100; // L: 1751
			var22 += GameBuild.archive8.percentage() * 2 / 100; // L: 1752
			var22 += class138.field1593.percentage() * 2 / 100; // L: 1753
			var22 += WorldMapDecoration.archive10.percentage() * 2 / 100; // L: 1754
			var22 += class10.field45.percentage() * 2 / 100; // L: 1755
			var22 += FriendsList.archive12.percentage() * 2 / 100; // L: 1756
			var22 += class127.archive13.percentage() * 2 / 100; // L: 1757
			var22 += Client.archive14.percentage() * 2 / 100; // L: 1758
			var22 += class336.archive15.percentage() * 2 / 100; // L: 1759
			var22 += UserComparator8.archive19.percentage() / 100; // L: 1760
			var22 += Varps.archive18.percentage() / 100; // L: 1761
			var22 += GroundObject.archive20.percentage() / 100; // L: 1762
			var22 += class328.field3591.percentage() / 100; // L: 1763
			var22 += class177.archive17.method6711() && class177.archive17.isFullyLoaded() ? 1 : 0; // L: 1764
			if (var22 != 100) { // L: 1765
				if (var22 != 0) { // L: 1766
					Login.Login_loadingText = "Checking for updates - " + var22 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1767
			} else {
				class20.method284(PcmPlayer.archive5, "Animations"); // L: 1770
				class20.method284(ClientPacket.field3202, "Skeletons"); // L: 1771
				class20.method284(PacketWriter.archive4, "Sound FX"); // L: 1772
				class20.method284(ModelData0.archive9, "Maps"); // L: 1773
				class20.method284(class33.archive6, "Music Tracks"); // L: 1774
				class20.method284(class89.archive11, "Models"); // L: 1775
				class20.method284(GameBuild.archive8, "Sprites"); // L: 1776
				class20.method284(class10.field45, "Music Jingles"); // L: 1777
				class20.method284(Client.archive14, "Music Samples"); // L: 1778
				class20.method284(class336.archive15, "Music Patches"); // L: 1779
				class20.method284(UserComparator8.archive19, "World Map"); // L: 1780
				class20.method284(Varps.archive18, "World Map Geography"); // L: 1781
				class20.method284(GroundObject.archive20, "World Map Ground"); // L: 1782
				class324.spriteIds = new GraphicsDefaults(); // L: 1783
				class324.spriteIds.decode(class177.archive17); // L: 1784
				Login.Login_loadingText = "Loaded update list"; // L: 1785
				Login.Login_loadingPercent = 30; // L: 1786
				Client.titleLoadingStage = 45; // L: 1787
			}
		} else if (Client.titleLoadingStage == 45) { // L: 1790
			class1.method7(22050, !Client.isLowDetail, 2); // L: 1791
			MidiPcmStream var33 = new MidiPcmStream(); // L: 1792
			var33.method5836(9, 128); // L: 1793
			class139.pcmPlayer0 = class144.method3119(GameEngine.taskHandler, 0, 22050); // L: 1794
			class139.pcmPlayer0.setStream(var33); // L: 1795
			MouseHandler.method678(class336.archive15, Client.archive14, PacketWriter.archive4, var33); // L: 1796
			Language.pcmPlayer1 = class144.method3119(GameEngine.taskHandler, 1, 2048); // L: 1797
			ClanChannelMember.pcmStreamMixer = new PcmStreamMixer(); // L: 1798
			Language.pcmPlayer1.setStream(ClanChannelMember.pcmStreamMixer); // L: 1799
			class19.decimator = new Decimator(22050, PcmPlayer.field279); // L: 1800
			Login.Login_loadingText = "Prepared sound engine"; // L: 1801
			Login.Login_loadingPercent = 35; // L: 1802
			Client.titleLoadingStage = 50; // L: 1803
			class230.WorldMapElement_fonts = new Fonts(GameBuild.archive8, class127.archive13); // L: 1804
		} else {
			int var1;
			if (Client.titleLoadingStage == 50) { // L: 1807
				FontName[] var32 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana13}; // L: 1810
				var1 = var32.length; // L: 1812
				Fonts var35 = class230.WorldMapElement_fonts; // L: 1813
				FontName[] var29 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana13}; // L: 1816
				Client.fontsMap = var35.createMap(var29); // L: 1818
				if (Client.fontsMap.size() < var1) { // L: 1819
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1820
					Login.Login_loadingPercent = 40; // L: 1821
				} else {
					GrandExchangeOfferOwnWorldComparator.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1824
					class302.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1825
					class126.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1826
					KitDefinition.platformInfo = Client.platformInfoProvider.get(); // L: 1827
					Login.Login_loadingText = "Loaded fonts"; // L: 1828
					Login.Login_loadingPercent = 40; // L: 1829
					Client.titleLoadingStage = 60; // L: 1830
				}
			} else {
				int var3;
				Archive var24;
				if (Client.titleLoadingStage == 60) { // L: 1833
					var22 = class135.method3031(WorldMapDecoration.archive10, GameBuild.archive8); // L: 1834
					var24 = GameBuild.archive8; // L: 1836
					var3 = Login.field904.length + Login.field920.length; // L: 1838
					String[] var36 = Login.field907; // L: 1840

					for (int var27 = 0; var27 < var36.length; ++var27) { // L: 1841
						String var28 = var36[var27]; // L: 1842
						if (var24.getGroupId(var28) != -1) { // L: 1844
							++var3; // L: 1845
						}
					}

					if (var22 < var3) { // L: 1853
						Login.Login_loadingText = "Loading title screen - " + var22 * 100 / var3 + "%"; // L: 1854
						Login.Login_loadingPercent = 50; // L: 1855
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1858
						Login.Login_loadingPercent = 50; // L: 1859
						class47.method867(5); // L: 1860
						Client.titleLoadingStage = 70; // L: 1861
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1864
					if (!class53.archive2.isFullyLoaded()) { // L: 1865
						Login.Login_loadingText = "Loading config - " + class53.archive2.loadPercent() + "%"; // L: 1866
						Login.Login_loadingPercent = 60; // L: 1867
					} else if (!class328.field3591.isFullyLoaded()) { // L: 1870
						Login.Login_loadingText = "Loading config - " + (80 + FriendsList.archive12.loadPercent() / 6) + "%"; // L: 1871
						Login.Login_loadingPercent = 60; // L: 1872
					} else {
						Archive var31 = class53.archive2; // L: 1875
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var31; // L: 1877
						class59.method1137(class53.archive2); // L: 1879
						class162.method3309(class53.archive2, class89.archive11); // L: 1880
						Archive var23 = class53.archive2; // L: 1881
						var24 = class89.archive11; // L: 1882
						boolean var34 = Client.isLowDetail; // L: 1883
						ObjectComposition.ObjectDefinition_archive = var23; // L: 1885
						ObjectComposition.ObjectDefinition_modelsArchive = var24; // L: 1886
						ObjectComposition.ObjectDefinition_isLowDetail = var34; // L: 1887
						IgnoreList.method7724(class53.archive2, class89.archive11); // L: 1889
						class147.method3136(class53.archive2); // L: 1890
						Archive var25 = class53.archive2; // L: 1891
						Archive var5 = class89.archive11; // L: 1892
						boolean var6 = Client.isMembersWorld; // L: 1893
						Font var7 = GrandExchangeOfferOwnWorldComparator.fontPlain11; // L: 1894
						Calendar.ItemComposition_archive = var25; // L: 1896
						ScriptFrame.ItemComposition_modelArchive = var5; // L: 1897
						class148.ItemComposition_inMembersWorld = var6; // L: 1898
						class112.ItemComposition_fileCount = Calendar.ItemComposition_archive.getGroupFileCount(10); // L: 1899
						class167.ItemComposition_fontPlain11 = var7; // L: 1900
						class107.method2679(class53.archive2, PcmPlayer.archive5, ClientPacket.field3202); // L: 1902
						GraphicsObject.method2044(class53.archive2, class89.archive11); // L: 1903
						NetFileRequest.method6721(class53.archive2); // L: 1904
						Archive var8 = class53.archive2; // L: 1905
						VarpDefinition.VarpDefinition_archive = var8; // L: 1907
						class516.field5128 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1908
						Archive var9 = PlatformInfo.archive7; // L: 1910
						Archive var10 = class89.archive11; // L: 1911
						Archive var11 = GameBuild.archive8; // L: 1912
						Archive var12 = class127.archive13; // L: 1913
						int var13 = 0; // L: 1915
						if (var9 != null) { // L: 1916
							ArchiveLoader.Widget_archive = var9; // L: 1917
							Widget.field3599 = var10; // L: 1918
							class149.Widget_spritesArchive = var11; // L: 1919
							WorldMapData_0.Widget_fontsArchive = var12; // L: 1920
							var13 = ArchiveLoader.Widget_archive.getGroupCount(); // L: 1921
						}

						UserComparator6.Widget_interfaceComponents = new Widget[var13][]; // L: 1923
						WorldMapDecoration.Widget_loadedInterfaces = new boolean[var13]; // L: 1924
						Archive var26 = class53.archive2; // L: 1926
						InvDefinition.InvDefinition_archive = var26; // L: 1928
						class336.method6623(class53.archive2); // L: 1930
						class107.method2680(class53.archive2); // L: 1931
						Archive var14 = class53.archive2; // L: 1932
						ParamComposition.method3796(class53.archive2); // L: 1934
						MidiPcmStream.method5830(class53.archive2); // L: 1935
						Archive var15 = class53.archive2; // L: 1936
						class495.field4996 = var15; // L: 1938
						class13.HitSplatDefinition_cachedSprites = new class485(class332.field3772, 54, class124.clientLanguage, class53.archive2); // L: 1940
						ViewportMouse.Ignored_cached = new class485(class332.field3772, 47, class124.clientLanguage, class53.archive2); // L: 1941
						Players.varcs = new Varcs(); // L: 1942
						class178.method3501(class53.archive2, GameBuild.archive8, class127.archive13); // L: 1943
						Archive var16 = class53.archive2; // L: 1944
						Archive var17 = GameBuild.archive8; // L: 1945
						GrandExchangeOfferNameComparator.HealthBarDefinition_archive = var16; // L: 1947
						HealthBarDefinition.field1962 = var17; // L: 1948
						Archive var18 = class53.archive2; // L: 1950
						Archive var19 = GameBuild.archive8; // L: 1951
						WorldMapElement.WorldMapElement_archive = var19; // L: 1953
						if (var18.isFullyLoaded()) { // L: 1954
							class161.WorldMapElement_count = var18.getGroupFileCount(35); // L: 1957
							GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached = new WorldMapElement[class161.WorldMapElement_count]; // L: 1958

							for (int var20 = 0; var20 < class161.WorldMapElement_count; ++var20) { // L: 1959
								byte[] var21 = var18.takeFile(35, var20); // L: 1960
								GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached[var20] = new WorldMapElement(var20); // L: 1961
								if (var21 != null) { // L: 1962
									GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached[var20].decode(new Buffer(var21)); // L: 1963
									GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached[var20].method3568(); // L: 1964
								}
							}
						}

						Login.Login_loadingText = "Loaded config"; // L: 1968
						Login.Login_loadingPercent = 60; // L: 1969
						Client.titleLoadingStage = 80; // L: 1970
					}
				} else if (Client.titleLoadingStage == 80) { // L: 1973
					var22 = 0; // L: 1974
					if (UserComparator5.compass == null) { // L: 1975
						UserComparator5.compass = class302.SpriteBuffer_getSprite(GameBuild.archive8, class324.spriteIds.compass, 0);
					} else {
						++var22; // L: 1976
					}

					if (class183.redHintArrowSprite == null) { // L: 1977
						class183.redHintArrowSprite = class302.SpriteBuffer_getSprite(GameBuild.archive8, class324.spriteIds.field4667, 0);
					} else {
						++var22; // L: 1978
					}

					if (GrandExchangeOfferTotalQuantityComparator.mapSceneSprites == null) { // L: 1979
						GrandExchangeOfferTotalQuantityComparator.mapSceneSprites = MouseRecorder.method2253(GameBuild.archive8, class324.spriteIds.mapScenes, 0);
					} else {
						++var22; // L: 1980
					}

					if (UrlRequest.headIconPkSprites == null) { // L: 1981
						UrlRequest.headIconPkSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.headIconsPk, 0);
					} else {
						++var22; // L: 1982
					}

					if (NetCache.headIconPrayerSprites == null) { // L: 1983
						NetCache.headIconPrayerSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.field4662, 0);
					} else {
						++var22; // L: 1984
					}

					if (ItemComposition.headIconHintSprites == null) { // L: 1985
						ItemComposition.headIconHintSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.field4663, 0);
					} else {
						++var22; // L: 1986
					}

					if (class20.mapMarkerSprites == null) { // L: 1987
						class20.mapMarkerSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.field4659, 0);
					} else {
						++var22; // L: 1988
					}

					if (Friend.crossSprites == null) { // L: 1989
						Friend.crossSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.field4665, 0);
					} else {
						++var22; // L: 1990
					}

					if (DirectByteArrayCopier.mapDotSprites == null) { // L: 1991
						DirectByteArrayCopier.mapDotSprites = ArchiveLoader.method2219(GameBuild.archive8, class324.spriteIds.field4666, 0);
					} else {
						++var22; // L: 1992
					}

					if (Decimator.scrollBarSprites == null) { // L: 1993
						Decimator.scrollBarSprites = MouseRecorder.method2253(GameBuild.archive8, class324.spriteIds.field4668, 0);
					} else {
						++var22; // L: 1994
					}

					if (GrandExchangeOfferAgeComparator.modIconSprites == null) { // L: 1995
						GrandExchangeOfferAgeComparator.modIconSprites = MouseRecorder.method2253(GameBuild.archive8, class324.spriteIds.field4658, 0);
					} else {
						++var22; // L: 1996
					}

					if (var22 < 11) { // L: 1997
						Login.Login_loadingText = "Loading sprites - " + var22 * 100 / 12 + "%"; // L: 1998
						Login.Login_loadingPercent = 70; // L: 1999
					} else {
						AbstractFont.AbstractFont_modIconSprites = GrandExchangeOfferAgeComparator.modIconSprites; // L: 2002
						class183.redHintArrowSprite.normalize(); // L: 2003
						var1 = (int)(Math.random() * 21.0D) - 10; // L: 2004
						int var2 = (int)(Math.random() * 21.0D) - 10; // L: 2005
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 2006
						int var4 = (int)(Math.random() * 41.0D) - 20; // L: 2007
						GrandExchangeOfferTotalQuantityComparator.mapSceneSprites[0].shiftColors(var4 + var1, var2 + var4, var3 + var4); // L: 2008
						Login.Login_loadingText = "Loaded sprites"; // L: 2009
						Login.Login_loadingPercent = 70; // L: 2010
						Client.titleLoadingStage = 90; // L: 2011
					}
				} else if (Client.titleLoadingStage == 90) { // L: 2014
					if (!class138.field1593.isFullyLoaded()) { // L: 2015
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2016
						Login.Login_loadingPercent = 90; // L: 2017
					} else {
						class149.textureProvider = new TextureProvider(class138.field1593, GameBuild.archive8, 20, WorldMapManager.clientPreferences.method2427(), Client.isLowDetail ? 64 : 128); // L: 2020
						Rasterizer3D.method4346(class149.textureProvider); // L: 2021
						Rasterizer3D.Rasterizer3D_setBrightness(WorldMapManager.clientPreferences.method2427()); // L: 2022
						Client.titleLoadingStage = 100; // L: 2023
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2026
					var22 = class149.textureProvider.getLoadedPercentage(); // L: 2027
					if (var22 < 100) { // L: 2028
						Login.Login_loadingText = "Loading textures - " + var22 + "%"; // L: 2029
						Login.Login_loadingPercent = 90; // L: 2030
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2033
						Login.Login_loadingPercent = 90; // L: 2034
						Client.titleLoadingStage = 110; // L: 2035
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2038
					AttackOption.mouseRecorder = new MouseRecorder(); // L: 2039
					GameEngine.taskHandler.newThreadTask(AttackOption.mouseRecorder, 10); // L: 2040
					Login.Login_loadingText = "Loaded input handler"; // L: 2041
					Login.Login_loadingPercent = 92; // L: 2042
					Client.titleLoadingStage = 120; // L: 2043
				} else if (Client.titleLoadingStage == 120) { // L: 2046
					if (!WorldMapDecoration.archive10.tryLoadFileByNames("huffman", "")) { // L: 2047
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2048
						Login.Login_loadingPercent = 94; // L: 2049
					} else {
						Huffman var30 = new Huffman(WorldMapDecoration.archive10.takeFileByNames("huffman", "")); // L: 2052
						MusicPatchNode.method6042(var30); // L: 2053
						Login.Login_loadingText = "Loaded wordpack"; // L: 2054
						Login.Login_loadingPercent = 94; // L: 2055
						Client.titleLoadingStage = 130; // L: 2056
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2059
					if (!PlatformInfo.archive7.isFullyLoaded()) { // L: 2060
						Login.Login_loadingText = "Loading interfaces - " + PlatformInfo.archive7.loadPercent() * 4 / 5 + "%"; // L: 2061
						Login.Login_loadingPercent = 96; // L: 2062
					} else if (!FriendsList.archive12.isFullyLoaded()) { // L: 2065
						Login.Login_loadingText = "Loading interfaces - " + (80 + FriendsList.archive12.loadPercent() / 6) + "%"; // L: 2066
						Login.Login_loadingPercent = 96; // L: 2067
					} else if (!class127.archive13.isFullyLoaded()) { // L: 2070
						Login.Login_loadingText = "Loading interfaces - " + (96 + class127.archive13.loadPercent() / 50) + "%"; // L: 2071
						Login.Login_loadingPercent = 96; // L: 2072
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2075
						Login.Login_loadingPercent = 98; // L: 2076
						if (FriendsList.archive12.isValidFileName("version.dat", "")) { // L: 2077
							Buffer var0 = new Buffer(FriendsList.archive12.takeFileByNames("version.dat", "")); // L: 2078
							var0.readUnsignedShort(); // L: 2079
						}

						Client.titleLoadingStage = 140; // L: 2081
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2084
					Login.Login_loadingPercent = 100; // L: 2085
					if (UserComparator8.archive19.getGroupCount() > 0 && !UserComparator8.archive19.tryLoadGroupByName(WorldMapCacheName.field3053.name)) { // L: 2086
						Login.Login_loadingText = "Loading world map - " + UserComparator8.archive19.groupLoadPercentByName(WorldMapCacheName.field3053.name) / 10 + "%"; // L: 2087
					} else {
						if (ScriptEvent.worldMap == null) { // L: 2090
							ScriptEvent.worldMap = new WorldMap(); // L: 2091
							ScriptEvent.worldMap.init(UserComparator8.archive19, Varps.archive18, GroundObject.archive20, class126.fontBold12, Client.fontsMap, GrandExchangeOfferTotalQuantityComparator.mapSceneSprites); // L: 2092
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2094
						Client.titleLoadingStage = 150; // L: 2095
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2098
					class47.method867(10); // L: 2099
				}
			}
		}
	} // L: 1707 1713 1740 1768 1788 1805 1822 1831 1856 1862 1868 1873 1971 2000 2012 2018 2024 2031 2036 2044 2050 2057 2063 2068 2073 2082 2088 2096 2100 2102

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1402085095"
	)
	static int method4224(int var0, int var1) {
		int var2 = var1 - 334; // L: 5702
		if (var2 < 0) { // L: 5703
			var2 = 0;
		} else if (var2 > 100) { // L: 5704
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5705
		return var0 * var3 / 256; // L: 5706
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "335333349"
	)
	static void method4225() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11886
			int var1 = var0.group; // L: 11887
			if (WorldMapAreaData.loadInterface(var1)) { // L: 11888
				boolean var2 = true; // L: 11889
				Widget[] var3 = UserComparator6.Widget_interfaceComponents[var1]; // L: 11890

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11891
					if (var3[var4] != null) { // L: 11892
						var2 = var3[var4].isIf3; // L: 11893
						break;
					}
				}

				if (!var2) { // L: 11897
					var4 = (int)var0.key; // L: 11898
					Widget var5 = ArchiveDiskActionHandler.getWidget(var4); // L: 11899
					if (var5 != null) { // L: 11900
						HorizontalAlignment.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11904
}
