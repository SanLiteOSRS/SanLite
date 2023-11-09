import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public final class class366 {
	@ObfuscatedName("f")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("w")
	static long[] field4373;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -689139107
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1745792545
	)
	static int field4370;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4373 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4373.length; ++var0) { // L: 8
			field4373[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-77"
	)
	public static int method7028(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 30
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 31
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 32
		var0 += var0 >>> 8; // L: 33
		var0 += var0 >>> 16; // L: 34
		return var0 & 255; // L: 35
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("load")
	static void load() {
		int var22;
		if (Client.titleLoadingStage == 0) { // L: 1765
			WorldMapAreaData.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1766

			for (var22 = 0; var22 < 4; ++var22) { // L: 1767
				Client.collisionMaps[var22] = new CollisionMap(104, 104);
			}

			class31.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1768
			Login.Login_loadingText = "Starting game engine..."; // L: 1769
			Login.Login_loadingPercent = 5; // L: 1770
			Client.titleLoadingStage = 20; // L: 1771
		} else if (Client.titleLoadingStage == 20) { // L: 1774
			Login.Login_loadingText = "Prepared visibility map"; // L: 1775
			Login.Login_loadingPercent = 10; // L: 1776
			Client.titleLoadingStage = 30; // L: 1777
		} else if (Client.titleLoadingStage == 30) { // L: 1780
			class13.field70 = ReflectionCheck.newArchive(0, false, true, true, false); // L: 1781
			FriendsChatManager.archive7 = ReflectionCheck.newArchive(1, false, true, true, false); // L: 1782
			class372.archive2 = ReflectionCheck.newArchive(2, true, false, true, false); // L: 1783
			class144.archive4 = ReflectionCheck.newArchive(3, false, true, true, false); // L: 1784
			DynamicObject.archive9 = ReflectionCheck.newArchive(4, false, true, true, false); // L: 1785
			NetCache.field4260 = ReflectionCheck.newArchive(5, true, true, true, false); // L: 1786
			class153.archive6 = ReflectionCheck.newArchive(6, true, true, true, false); // L: 1787
			class151.archive11 = ReflectionCheck.newArchive(7, false, true, true, false); // L: 1788
			WorldMapEvent.archive8 = ReflectionCheck.newArchive(8, false, true, true, false); // L: 1789
			class148.archive10 = ReflectionCheck.newArchive(9, false, true, true, false); // L: 1790
			ApproximateRouteStrategy.field490 = ReflectionCheck.newArchive(10, false, true, true, false); // L: 1791
			MusicPatchNode.field3448 = ReflectionCheck.newArchive(11, false, true, true, false); // L: 1792
			class12.archive12 = ReflectionCheck.newArchive(12, false, true, true, false); // L: 1793
			PendingSpawn.archive13 = ReflectionCheck.newArchive(13, true, false, true, false); // L: 1794
			class174.archive14 = ReflectionCheck.newArchive(14, false, true, true, false); // L: 1795
			class286.archive15 = ReflectionCheck.newArchive(15, false, true, true, false); // L: 1796
			CollisionMap.archive17 = ReflectionCheck.newArchive(17, true, true, true, false); // L: 1797
			class419.archive18 = ReflectionCheck.newArchive(18, false, true, true, false); // L: 1798
			GameEngine.archive19 = ReflectionCheck.newArchive(19, false, true, true, false); // L: 1799
			class27.archive20 = ReflectionCheck.newArchive(20, false, true, true, false); // L: 1800
			Canvas.field132 = ReflectionCheck.newArchive(21, false, true, true, true); // L: 1801
			Login.Login_loadingText = "Connecting to update server"; // L: 1802
			Login.Login_loadingPercent = 20; // L: 1803
			Client.titleLoadingStage = 40; // L: 1804
		} else if (Client.titleLoadingStage == 40) { // L: 1807
			byte var36 = 0; // L: 1808
			var22 = var36 + class13.field70.percentage() * 4 / 100; // L: 1809
			var22 += FriendsChatManager.archive7.percentage() * 4 / 100; // L: 1810
			var22 += class372.archive2.percentage() * 2 / 100; // L: 1811
			var22 += class144.archive4.percentage() * 2 / 100; // L: 1812
			var22 += DynamicObject.archive9.percentage() * 6 / 100; // L: 1813
			var22 += NetCache.field4260.percentage() * 4 / 100; // L: 1814
			var22 += class153.archive6.percentage() * 2 / 100; // L: 1815
			var22 += class151.archive11.percentage() * 55 / 100; // L: 1816
			var22 += WorldMapEvent.archive8.percentage() * 2 / 100; // L: 1817
			var22 += class148.archive10.percentage() * 2 / 100; // L: 1818
			var22 += ApproximateRouteStrategy.field490.percentage() * 2 / 100; // L: 1819
			var22 += MusicPatchNode.field3448.percentage() * 2 / 100; // L: 1820
			var22 += class12.archive12.percentage() * 2 / 100; // L: 1821
			var22 += PendingSpawn.archive13.percentage() * 2 / 100; // L: 1822
			var22 += class174.archive14.percentage() * 2 / 100; // L: 1823
			var22 += class286.archive15.percentage() * 2 / 100; // L: 1824
			var22 += GameEngine.archive19.percentage() / 100; // L: 1825
			var22 += class419.archive18.percentage() / 100; // L: 1826
			var22 += class27.archive20.percentage() / 100; // L: 1827
			var22 += Canvas.field132.percentage() / 100; // L: 1828
			var22 += CollisionMap.archive17.method6473() && CollisionMap.archive17.isFullyLoaded() ? 1 : 0; // L: 1829
			if (var22 != 100) { // L: 1830
				if (var22 != 0) { // L: 1831
					Login.Login_loadingText = "Checking for updates - " + var22 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1832
			} else {
				WorldMapSprite.method5337(class13.field70, "Animations"); // L: 1835
				WorldMapSprite.method5337(FriendsChatManager.archive7, "Skeletons"); // L: 1836
				WorldMapSprite.method5337(DynamicObject.archive9, "Sound FX"); // L: 1837
				WorldMapSprite.method5337(NetCache.field4260, "Maps"); // L: 1838
				WorldMapSprite.method5337(class153.archive6, "Music Tracks"); // L: 1839
				WorldMapSprite.method5337(class151.archive11, "Models"); // L: 1840
				WorldMapSprite.method5337(WorldMapEvent.archive8, "Sprites"); // L: 1841
				WorldMapSprite.method5337(MusicPatchNode.field3448, "Music Jingles"); // L: 1842
				WorldMapSprite.method5337(class174.archive14, "Music Samples"); // L: 1843
				WorldMapSprite.method5337(class286.archive15, "Music Patches"); // L: 1844
				WorldMapSprite.method5337(GameEngine.archive19, "World Map"); // L: 1845
				WorldMapSprite.method5337(class419.archive18, "World Map Geography"); // L: 1846
				WorldMapSprite.method5337(class27.archive20, "World Map Ground"); // L: 1847
				ScriptFrame.spriteIds = new GraphicsDefaults(); // L: 1848
				ScriptFrame.spriteIds.decode(CollisionMap.archive17); // L: 1849
				Login.Login_loadingText = "Loaded update list"; // L: 1850
				Login.Login_loadingPercent = 30; // L: 1851
				Client.titleLoadingStage = 45; // L: 1852
			}
		} else {
			Archive var2;
			Archive var26;
			Archive var31;
			if (Client.titleLoadingStage == 45) { // L: 1855
				class348.method6767(22050, !Client.isLowDetail, 2); // L: 1856
				MidiPcmStream var30 = new MidiPcmStream(); // L: 1857
				var30.method5622(9, 128); // L: 1858
				SoundSystem.pcmPlayer0 = ObjectSound.method1911(GameEngine.taskHandler, 0, 22050); // L: 1859
				SoundSystem.pcmPlayer0.setStream(var30); // L: 1860
				var31 = class286.archive15; // L: 1861
				var2 = class174.archive14; // L: 1862
				var26 = DynamicObject.archive9; // L: 1863
				class290.musicPatchesArchive = var31; // L: 1865
				class290.musicSamplesArchive = var2; // L: 1866
				class290.soundEffectsArchive = var26; // L: 1867
				class290.midiPcmStream = var30; // L: 1868
				WorldMapSectionType.pcmPlayer1 = ObjectSound.method1911(GameEngine.taskHandler, 1, 2048); // L: 1870
				class209.pcmStreamMixer = new PcmStreamMixer(); // L: 1871
				WorldMapSectionType.pcmPlayer1.setStream(class209.pcmStreamMixer); // L: 1872
				class257.decimator = new Decimator(22050, class284.field3321); // L: 1873
				Login.Login_loadingText = "Prepared sound engine"; // L: 1874
				Login.Login_loadingPercent = 35; // L: 1875
				Client.titleLoadingStage = 50; // L: 1876
				class165.WorldMapElement_fonts = new Fonts(WorldMapEvent.archive8, PendingSpawn.archive13); // L: 1877
			} else if (Client.titleLoadingStage == 50) { // L: 1880
				var22 = FontName.method8319().length; // L: 1881
				Client.fontsMap = class165.WorldMapElement_fonts.createMap(FontName.method8319()); // L: 1882
				if (Client.fontsMap.size() < var22) { // L: 1883
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var22 + "%"; // L: 1884
					Login.Login_loadingPercent = 40; // L: 1885
				} else {
					class276.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1888
					MenuAction.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1889
					class19.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1890
					UserComparator9.platformInfo = Client.platformInfoProvider.get(); // L: 1891
					Login.Login_loadingText = "Loaded fonts"; // L: 1892
					Login.Login_loadingPercent = 40; // L: 1893
					Client.titleLoadingStage = 60; // L: 1894
				}
			} else {
				int var3;
				if (Client.titleLoadingStage == 60) { // L: 1897
					var22 = WorldMapSectionType.method5295(ApproximateRouteStrategy.field490, WorldMapEvent.archive8); // L: 1898
					var2 = WorldMapEvent.archive8; // L: 1900
					var3 = Login.field941.length + Login.field942.length; // L: 1902
					String[] var32 = Login.field902; // L: 1904

					for (int var34 = 0; var34 < var32.length; ++var34) { // L: 1905
						String var35 = var32[var34]; // L: 1906
						if (var2.getGroupId(var35) != -1) { // L: 1908
							++var3; // L: 1909
						}
					}

					if (var22 < var3) { // L: 1917
						Login.Login_loadingText = "Loading title screen - " + var22 * 100 / var3 + "%"; // L: 1918
						Login.Login_loadingPercent = 50; // L: 1919
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1922
						Login.Login_loadingPercent = 50; // L: 1923
						class246.method5251(5); // L: 1924
						Client.titleLoadingStage = 70; // L: 1925
					}
				} else if (Client.titleLoadingStage == 70) { // L: 1928
					if (!class372.archive2.isFullyLoaded()) { // L: 1929
						Login.Login_loadingText = "Loading config - " + class372.archive2.loadPercent() + "%"; // L: 1930
						Login.Login_loadingPercent = 60; // L: 1931
					} else if (!Canvas.field132.isFullyLoaded()) { // L: 1934
						Login.Login_loadingText = "Loading config - " + (80 + class12.archive12.loadPercent() / 6) + "%"; // L: 1935
						Login.Login_loadingPercent = 60; // L: 1936
					} else {
						class88.method2412(class372.archive2); // L: 1939
						Archive var29 = class372.archive2; // L: 1940
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var29; // L: 1942
						var31 = class372.archive2; // L: 1944
						var2 = class151.archive11; // L: 1945
						KitDefinition.KitDefinition_archive = var31; // L: 1947
						KitDefinition.KitDefinition_modelsArchive = var2; // L: 1948
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1949
						var26 = class372.archive2; // L: 1951
						Archive var4 = class151.archive11; // L: 1952
						boolean var27 = Client.isLowDetail; // L: 1953
						ObjectComposition.ObjectDefinition_archive = var26; // L: 1955
						ObjectComposition.ObjectDefinition_modelsArchive = var4; // L: 1956
						ObjectComposition.ObjectDefinition_isLowDetail = var27; // L: 1957
						WorldMapSprite.method5338(class372.archive2, class151.archive11); // L: 1959
						Archive var28 = class372.archive2; // L: 1960
						StructComposition.StructDefinition_archive = var28; // L: 1962
						Archive var33 = class372.archive2; // L: 1964
						Archive var8 = class151.archive11; // L: 1965
						boolean var9 = Client.isMembersWorld; // L: 1966
						Font var10 = class276.fontPlain11; // L: 1967
						class4.ItemComposition_archive = var33; // L: 1969
						ItemComposition.ItemComposition_modelArchive = var8; // L: 1970
						ItemComposition.ItemComposition_inMembersWorld = var9; // L: 1971
						ItemComposition.ItemComposition_fileCount = class4.ItemComposition_archive.getGroupFileCount(10); // L: 1972
						class138.ItemComposition_fontPlain11 = var10; // L: 1973
						class6.method50(class372.archive2, class13.field70, FriendsChatManager.archive7); // L: 1975
						Archive var11 = class372.archive2; // L: 1976
						Archive var12 = class151.archive11; // L: 1977
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var11; // L: 1979
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var12; // L: 1980
						class9.method81(class372.archive2); // L: 1982
						WorldMapIcon_0.method5264(class372.archive2); // L: 1983
						Archive var13 = class144.archive4; // L: 1984
						Archive var14 = class151.archive11; // L: 1985
						Archive var15 = WorldMapEvent.archive8; // L: 1986
						Archive var16 = PendingSpawn.archive13; // L: 1987
						UserComparator8.Widget_archive = var13; // L: 1989
						class145.Widget_modelsArchive = var14; // L: 1990
						World.Widget_spritesArchive = var15; // L: 1991
						Script.Widget_fontsArchive = var16; // L: 1992
						WorldMapLabel.Widget_interfaceComponents = new Widget[UserComparator8.Widget_archive.getGroupCount()][]; // L: 1993
						class431.Widget_loadedInterfaces = new boolean[UserComparator8.Widget_archive.getGroupCount()]; // L: 1994
						Archive var17 = class372.archive2; // L: 1996
						InvDefinition.InvDefinition_archive = var17; // L: 1998
						class81.method2307(class372.archive2); // L: 2000
						class68.method2074(class372.archive2); // L: 2001
						class153.method3315(class372.archive2); // L: 2002
						Archive var18 = class372.archive2; // L: 2003
						ParamComposition.ParamDefinition_archive = var18; // L: 2005
						DevicePcmPlayerProvider.method324(class372.archive2); // L: 2007
						ObjectComposition.method3949(class372.archive2); // L: 2008
						class491.HitSplatDefinition_cachedSprites = new class458(class134.field1606, 54, class36.clientLanguage, class372.archive2); // L: 2009
						class208.Ignored_cached = new class458(class134.field1606, 47, class36.clientLanguage, class372.archive2); // L: 2010
						class9.varcs = new Varcs(); // L: 2011
						Archive var19 = class372.archive2; // L: 2012
						Archive var20 = WorldMapEvent.archive8; // L: 2013
						Archive var21 = PendingSpawn.archive13; // L: 2014
						class498.HitSplatDefinition_archive = var19; // L: 2016
						HitSplatDefinition.field2136 = var20; // L: 2017
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var21; // L: 2018
						Login.method2166(class372.archive2, WorldMapEvent.archive8); // L: 2020
						class85.method2337(class372.archive2, WorldMapEvent.archive8); // L: 2021
						Login.Login_loadingText = "Loaded config"; // L: 2022
						Login.Login_loadingPercent = 60; // L: 2023
						Client.titleLoadingStage = 80; // L: 2024
					}
				} else if (Client.titleLoadingStage == 80) { // L: 2027
					var22 = 0; // L: 2028
					if (SoundSystem.compass == null) { // L: 2029
						SoundSystem.compass = BZip2State.SpriteBuffer_getSprite(WorldMapEvent.archive8, ScriptFrame.spriteIds.compass, 0);
					} else {
						++var22; // L: 2030
					}

					if (PacketBufferNode.redHintArrowSprite == null) { // L: 2031
						PacketBufferNode.redHintArrowSprite = BZip2State.SpriteBuffer_getSprite(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4621, 0);
					} else {
						++var22; // L: 2032
					}

					IndexedSprite[] var1;
					IndexedSprite[] var5;
					int var6;
					IndexedSprite var7;
					if (VarpDefinition.mapSceneSprites == null) { // L: 2033
						var2 = WorldMapEvent.archive8; // L: 2035
						var3 = ScriptFrame.spriteIds.mapScenes; // L: 2036
						if (!Buffer.method8892(var2, var3, 0)) { // L: 2038
							var1 = null; // L: 2039
						} else {
							var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount]; // L: 2044

							for (var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) { // L: 2045
								var7 = var5[var6] = new IndexedSprite(); // L: 2046
								var7.width = class488.SpriteBuffer_spriteWidth; // L: 2047
								var7.height = class488.SpriteBuffer_spriteHeight; // L: 2048
								var7.xOffset = class488.SpriteBuffer_xOffsets[var6]; // L: 2049
								var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2050
								var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6]; // L: 2051
								var7.subHeight = class132.SpriteBuffer_spriteHeights[var6]; // L: 2052
								var7.palette = class100.SpriteBuffer_spritePalette; // L: 2053
								var7.pixels = class140.SpriteBuffer_pixels[var6]; // L: 2054
							}

							class100.method2724(); // L: 2056
							var1 = var5; // L: 2059
						}

						VarpDefinition.mapSceneSprites = var1; // L: 2061
					} else {
						++var22; // L: 2063
					}

					if (ClanChannel.headIconPkSprites == null) { // L: 2064
						ClanChannel.headIconPkSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.headIconsPk, 0);
					} else {
						++var22; // L: 2065
					}

					if (class367.headIconPrayerSprites == null) { // L: 2066
						class367.headIconPrayerSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4616, 0);
					} else {
						++var22; // L: 2067
					}

					if (WorldMapSectionType.headIconHintSprites == null) { // L: 2068
						WorldMapSectionType.headIconHintSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4617, 0);
					} else {
						++var22; // L: 2069
					}

					if (UserComparator6.mapMarkerSprites == null) { // L: 2070
						UserComparator6.mapMarkerSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4620, 0);
					} else {
						++var22; // L: 2071
					}

					if (Calendar.crossSprites == null) { // L: 2072
						Calendar.crossSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4619, 0);
					} else {
						++var22; // L: 2073
					}

					if (UrlRequest.mapDotSprites == null) { // L: 2074
						UrlRequest.mapDotSprites = class220.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4622, 0);
					} else {
						++var22; // L: 2075
					}

					if (InvDefinition.scrollBarSprites == null) { // L: 2076
						var2 = WorldMapEvent.archive8; // L: 2078
						var3 = ScriptFrame.spriteIds.field4613; // L: 2079
						if (!Buffer.method8892(var2, var3, 0)) { // L: 2081
							var1 = null; // L: 2082
						} else {
							var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount]; // L: 2087

							for (var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) { // L: 2088
								var7 = var5[var6] = new IndexedSprite(); // L: 2089
								var7.width = class488.SpriteBuffer_spriteWidth; // L: 2090
								var7.height = class488.SpriteBuffer_spriteHeight; // L: 2091
								var7.xOffset = class488.SpriteBuffer_xOffsets[var6]; // L: 2092
								var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2093
								var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6]; // L: 2094
								var7.subHeight = class132.SpriteBuffer_spriteHeights[var6]; // L: 2095
								var7.palette = class100.SpriteBuffer_spritePalette; // L: 2096
								var7.pixels = class140.SpriteBuffer_pixels[var6]; // L: 2097
							}

							class100.method2724(); // L: 2099
							var1 = var5; // L: 2102
						}

						InvDefinition.scrollBarSprites = var1; // L: 2104
					} else {
						++var22; // L: 2106
					}

					if (PlayerType.modIconSprites == null) { // L: 2107
						var2 = WorldMapEvent.archive8; // L: 2109
						var3 = ScriptFrame.spriteIds.field4624; // L: 2110
						if (!Buffer.method8892(var2, var3, 0)) { // L: 2112
							var1 = null; // L: 2113
						} else {
							var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount]; // L: 2118

							for (var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) { // L: 2119
								var7 = var5[var6] = new IndexedSprite(); // L: 2120
								var7.width = class488.SpriteBuffer_spriteWidth; // L: 2121
								var7.height = class488.SpriteBuffer_spriteHeight; // L: 2122
								var7.xOffset = class488.SpriteBuffer_xOffsets[var6]; // L: 2123
								var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6]; // L: 2124
								var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6]; // L: 2125
								var7.subHeight = class132.SpriteBuffer_spriteHeights[var6]; // L: 2126
								var7.palette = class100.SpriteBuffer_spritePalette; // L: 2127
								var7.pixels = class140.SpriteBuffer_pixels[var6]; // L: 2128
							}

							class100.method2724(); // L: 2130
							var1 = var5; // L: 2133
						}

						PlayerType.modIconSprites = var1; // L: 2135
					} else {
						++var22; // L: 2137
					}

					if (var22 < 11) { // L: 2138
						Login.Login_loadingText = "Loading sprites - " + var22 * 100 / 12 + "%"; // L: 2139
						Login.Login_loadingPercent = 70; // L: 2140
					} else {
						AbstractFont.AbstractFont_modIconSprites = PlayerType.modIconSprites; // L: 2143
						PacketBufferNode.redHintArrowSprite.normalize(); // L: 2144
						int var23 = (int)(Math.random() * 21.0D) - 10; // L: 2145
						int var24 = (int)(Math.random() * 21.0D) - 10; // L: 2146
						var3 = (int)(Math.random() * 21.0D) - 10; // L: 2147
						int var25 = (int)(Math.random() * 41.0D) - 20; // L: 2148
						VarpDefinition.mapSceneSprites[0].shiftColors(var25 + var23, var25 + var24, var3 + var25); // L: 2149
						Login.Login_loadingText = "Loaded sprites"; // L: 2150
						Login.Login_loadingPercent = 70; // L: 2151
						Client.titleLoadingStage = 90; // L: 2152
					}
				} else if (Client.titleLoadingStage == 90) { // L: 2155
					if (!class148.archive10.isFullyLoaded()) { // L: 2156
						Login.Login_loadingText = "Loading textures - " + "0%"; // L: 2157
						Login.Login_loadingPercent = 90; // L: 2158
					} else {
						GameBuild.textureProvider = new TextureProvider(class148.archive10, WorldMapEvent.archive8, 20, PacketWriter.clientPreferences.method2557(), Client.isLowDetail ? 64 : 128); // L: 2161
						Rasterizer3D.Rasterizer3D_setTextureLoader(GameBuild.textureProvider); // L: 2162
						Rasterizer3D.Rasterizer3D_setBrightness(PacketWriter.clientPreferences.method2557()); // L: 2163
						Client.titleLoadingStage = 100; // L: 2164
					}
				} else if (Client.titleLoadingStage == 100) { // L: 2167
					var22 = GameBuild.textureProvider.getLoadedPercentage(); // L: 2168
					if (var22 < 100) { // L: 2169
						Login.Login_loadingText = "Loading textures - " + var22 + "%"; // L: 2170
						Login.Login_loadingPercent = 90; // L: 2171
					} else {
						Login.Login_loadingText = "Loaded textures"; // L: 2174
						Login.Login_loadingPercent = 90; // L: 2175
						Client.titleLoadingStage = 110; // L: 2176
					}
				} else if (Client.titleLoadingStage == 110) { // L: 2179
					class36.mouseRecorder = new MouseRecorder(); // L: 2180
					GameEngine.taskHandler.newThreadTask(class36.mouseRecorder, 10); // L: 2181
					Login.Login_loadingText = "Loaded input handler"; // L: 2182
					Login.Login_loadingPercent = 92; // L: 2183
					Client.titleLoadingStage = 120; // L: 2184
				} else if (Client.titleLoadingStage == 120) { // L: 2187
					if (!ApproximateRouteStrategy.field490.tryLoadFileByNames("huffman", "")) { // L: 2188
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2189
						Login.Login_loadingPercent = 94; // L: 2190
					} else {
						Huffman var0 = new Huffman(ApproximateRouteStrategy.field490.takeFileByNames("huffman", "")); // L: 2193
						class312.huffman = var0; // L: 2195
						Login.Login_loadingText = "Loaded wordpack"; // L: 2197
						Login.Login_loadingPercent = 94; // L: 2198
						Client.titleLoadingStage = 130; // L: 2199
					}
				} else if (Client.titleLoadingStage == 130) { // L: 2202
					if (!class144.archive4.isFullyLoaded()) { // L: 2203
						Login.Login_loadingText = "Loading interfaces - " + class144.archive4.loadPercent() * 4 / 5 + "%"; // L: 2204
						Login.Login_loadingPercent = 96; // L: 2205
					} else if (!class12.archive12.isFullyLoaded()) { // L: 2208
						Login.Login_loadingText = "Loading interfaces - " + (80 + class12.archive12.loadPercent() / 6) + "%"; // L: 2209
						Login.Login_loadingPercent = 96; // L: 2210
					} else if (!PendingSpawn.archive13.isFullyLoaded()) { // L: 2213
						Login.Login_loadingText = "Loading interfaces - " + (96 + PendingSpawn.archive13.loadPercent() / 50) + "%"; // L: 2214
						Login.Login_loadingPercent = 96; // L: 2215
					} else {
						Login.Login_loadingText = "Loaded interfaces"; // L: 2218
						Login.Login_loadingPercent = 98; // L: 2219
						Client.titleLoadingStage = 140; // L: 2220
					}
				} else if (Client.titleLoadingStage == 140) { // L: 2223
					Login.Login_loadingPercent = 100; // L: 2224
					if (!GameEngine.archive19.tryLoadGroupByName(WorldMapCacheName.field3013.name)) { // L: 2225
						Login.Login_loadingText = "Loading world map - " + GameEngine.archive19.groupLoadPercentByName(WorldMapCacheName.field3013.name) / 10 + "%"; // L: 2226
					} else {
						if (GrandExchangeOfferUnitPriceComparator.worldMap == null) { // L: 2229
							GrandExchangeOfferUnitPriceComparator.worldMap = new WorldMap(); // L: 2230
							GrandExchangeOfferUnitPriceComparator.worldMap.init(GameEngine.archive19, class419.archive18, class27.archive20, class19.fontBold12, Client.fontsMap, VarpDefinition.mapSceneSprites); // L: 2231
						}

						Login.Login_loadingText = "Loaded world map"; // L: 2233
						Client.titleLoadingStage = 150; // L: 2234
					}
				} else if (Client.titleLoadingStage == 150) { // L: 2237
					class246.method5251(10); // L: 2238
				}
			}
		}
	} // L: 1772 1778 1805 1833 1853 1878 1886 1895 1920 1926 1932 1937 2025 2141 2153 2159 2165 2172 2177 2185 2191 2200 2206 2211 2216 2221 2227 2235 2239 2241
}
