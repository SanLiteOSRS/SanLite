import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 963420465
	)
	static int field4294;
	@ObfuscatedName("ax")
	static boolean field4300;
	@ObfuscatedName("ao")
	static Object field4292;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4294 = 0; // L: 11
		field4300 = false; // L: 12
		field4292 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 72
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 73
				} // L: 74

				if (var1 != null) { // L: 75
					if (var1.type == 0) { // L: 76
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 77
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 78
							var1.remove(); // L: 79
						} // L: 80
					} else if (var1.type == 1) { // L: 82
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 83
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 84
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 85
						} // L: 86
					}

					synchronized(field4292) { // L: 88
						if ((field4300 || field4294 <= 1) && ArchiveDiskActionHandler_requestQueue.method7225()) { // L: 89
							field4294 = 0; // L: 90
							field4292.notifyAll(); // L: 91
							return; // L: 92
						}

						field4294 = 600; // L: 94
					}
				} else {
					Players.method2741(100L); // L: 98
					synchronized(field4292) { // L: 99
						if ((field4300 || field4294 <= 1) && ArchiveDiskActionHandler_requestQueue.method7225()) { // L: 100
							field4294 = 0; // L: 101
							field4292.notifyAll(); // L: 102
							return; // L: 103
						}

						--field4294; // L: 105
					}
				}
			}
		} catch (Exception var13) { // L: 110
			class190.RunException_sendStackTrace((String)null, var13); // L: 111
		}
	} // L: 113

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpu;Lpu;I)V",
		garbageValue = "2109842428"
	)
	static void method6854(Font var0, Font var1) {
		if (SecureRandomCallable.worldSelectBackSprites == null) { // L: 1839
			SecureRandomCallable.worldSelectBackSprites = PacketWriter.method2826(class199.field2010, "sl_back", "");
		}

		if (PendingSpawn.worldSelectFlagSprites == null) { // L: 1840
			PendingSpawn.worldSelectFlagSprites = InvDefinition.method3618(class199.field2010, "sl_flags", "");
		}

		if (ModelData0.worldSelectArrows == null) { // L: 1841
			ModelData0.worldSelectArrows = InvDefinition.method3618(class199.field2010, "sl_arrows", "");
		}

		if (TaskHandler.worldSelectStars == null) { // L: 1842
			TaskHandler.worldSelectStars = InvDefinition.method3618(class199.field2010, "sl_stars", "");
		}

		if (class372.worldSelectLeftSprite == null) { // L: 1843
			class372.worldSelectLeftSprite = class167.SpriteBuffer_getIndexedSpriteByName(class199.field2010, "leftarrow", "");
		}

		if (class230.worldSelectRightSprite == null) { // L: 1844
			class230.worldSelectRightSprite = class167.SpriteBuffer_getIndexedSpriteByName(class199.field2010, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1845
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1846
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1847
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1848
		if (TaskHandler.worldSelectStars != null) { // L: 1849
			TaskHandler.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1850
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1851
			TaskHandler.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1852
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1853
		}

		int var4;
		int var5;
		if (ModelData0.worldSelectArrows != null) { // L: 1855
			int var2 = Login.xPadding + 280; // L: 1856
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1857
				ModelData0.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var2, 4); // L: 1858
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1859
				ModelData0.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var2 + 15, 4); // L: 1860
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1); // L: 1861
			int var3 = Login.xPadding + 390; // L: 1862
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1863
				ModelData0.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var3, 4); // L: 1864
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1865
				ModelData0.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var3 + 15, 4); // L: 1866
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1); // L: 1867
			var4 = Login.xPadding + 500; // L: 1868
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1869
				ModelData0.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var4, 4); // L: 1870
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1871
				ModelData0.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1872
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1873
			var5 = Login.xPadding + 610; // L: 1874
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1875
				ModelData0.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var5, 4); // L: 1876
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1877
				ModelData0.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1878
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1879
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1881
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1882
		Login.hoveredWorldIndex = -1; // L: 1883
		if (SecureRandomCallable.worldSelectBackSprites != null) { // L: 1884
			byte var23 = 88; // L: 1885
			byte var24 = 19; // L: 1886
			var4 = 765 / (var23 + 1) - 1; // L: 1887
			var5 = 480 / (var24 + 1); // L: 1888

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1890
				var7 = var4; // L: 1891
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1892
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1893
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1894
					--var5;
				}
			} while(var6 != var5 || var7 != var4); // L: 1895

			var6 = (765 - var23 * var4) / (var4 + 1); // L: 1897
			if (var6 > 5) { // L: 1898
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1); // L: 1899
			if (var7 > 5) { // L: 1900
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2; // L: 1901
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2; // L: 1902
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1903
			Login.worldSelectPagesCount = var10 - var4; // L: 1904
			if (class372.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1905
				class372.worldSelectLeftSprite.drawAt(8, class491.canvasHeight / 2 - class372.worldSelectLeftSprite.subHeight / 2); // L: 1906
			}

			if (class230.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1908
				class230.worldSelectRightSprite.drawAt(class340.canvasWidth - class230.worldSelectRightSprite.subWidth - 8, class491.canvasHeight / 2 - class230.worldSelectRightSprite.subHeight / 2); // L: 1909
			}

			int var11 = var9 + 23; // L: 1911
			int var12 = var8 + Login.xPadding; // L: 1912
			int var13 = 0; // L: 1913
			boolean var14 = false; // L: 1914
			int var15 = Login.worldSelectPage; // L: 1915

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1916 1917
				World var17 = UserComparator3.World_worlds[var16]; // L: 1920
				boolean var18 = true; // L: 1921
				String var19 = Integer.toString(var17.population); // L: 1922
				if (var17.population == -1) { // L: 1923
					var19 = "OFF"; // L: 1924
					var18 = false; // L: 1925
				} else if (var17.population > 1980) { // L: 1927
					var19 = "FULL"; // L: 1928
					var18 = false; // L: 1929
				}

				class110 var20 = null; // L: 1931
				int var21 = 0; // L: 1932
				if (var17.isBeta()) { // L: 1933
					var20 = var17.isMembersOnly() ? class110.field1393 : class110.field1392; // L: 1934
				} else if (var17.isDeadman()) { // L: 1936
					var20 = var17.isMembersOnly() ? class110.field1389 : class110.field1404; // L: 1937
				} else if (var17.method1835()) { // L: 1939
					var21 = 16711680; // L: 1940
					var20 = var17.isMembersOnly() ? class110.field1386 : class110.field1387; // L: 1941
				} else if (var17.method1837()) { // L: 1943
					var20 = var17.isMembersOnly() ? class110.field1390 : class110.field1394; // L: 1944
				} else if (var17.isPvp()) { // L: 1946
					var20 = var17.isMembersOnly() ? class110.field1402 : class110.field1388; // L: 1947
				} else if (var17.method1838()) { // L: 1949
					var20 = var17.isMembersOnly() ? class110.field1397 : class110.field1396; // L: 1950
				} else if (var17.method1839()) { // L: 1952
					var20 = var17.isMembersOnly() ? class110.field1399 : class110.field1398; // L: 1953
				}

				if (var20 == null || var20.field1391 >= SecureRandomCallable.worldSelectBackSprites.length) { // L: 1955
					var20 = var17.isMembersOnly() ? class110.field1401 : class110.field1400; // L: 1956
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var23 && MouseHandler.MouseHandler_y < var11 + var24 && var18) { // L: 1958
					Login.hoveredWorldIndex = var16; // L: 1959
					SecureRandomCallable.worldSelectBackSprites[var20.field1391].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1960
					var14 = true; // L: 1961
				} else {
					SecureRandomCallable.worldSelectBackSprites[var20.field1391].drawAt(var12, var11); // L: 1963
				}

				if (PendingSpawn.worldSelectFlagSprites != null) { // L: 1964
					PendingSpawn.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1); // L: 1965
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1); // L: 1966
				var11 = var11 + var24 + var7; // L: 1967
				++var13; // L: 1968
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1969
					var12 = var12 + var23 + var6; // L: 1970
					var13 = 0; // L: 1971
					++var15; // L: 1972
				}
			}

			if (var14) { // L: 1975
				var16 = var1.stringWidth(UserComparator3.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1976
				int var22 = var1.ascent + 8; // L: 1977
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1978
				if (var25 + var22 > 480) { // L: 1979
					var25 = MouseHandler.MouseHandler_y - 25 - var22; // L: 1980
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120); // L: 1982
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0); // L: 1983
				var1.drawCentered(UserComparator3.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1984
			}
		}

	} // L: 1987
}
