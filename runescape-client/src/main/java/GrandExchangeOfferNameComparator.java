import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;I)I",
		garbageValue = "1204682683"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;I)V",
		garbageValue = "-1354945128"
	)
	static void method5896(Font var0, Font var1) {
		if (class388.worldSelectBackSprites == null) { // L: 1713
			class388.worldSelectBackSprites = class193.method3818(class299.archive8, "sl_back", "");
		}

		if (NetCache.worldSelectFlagSprites == null) { // L: 1714
			NetCache.worldSelectFlagSprites = Bounds.method6868(class299.archive8, "sl_flags", "");
		}

		if (PcmPlayer.worldSelectArrows == null) { // L: 1715
			PcmPlayer.worldSelectArrows = Bounds.method6868(class299.archive8, "sl_arrows", "");
		}

		if (VarbitComposition.worldSelectStars == null) { // L: 1716
			VarbitComposition.worldSelectStars = Bounds.method6868(class299.archive8, "sl_stars", "");
		}

		if (class17.worldSelectLeftSprite == null) { // L: 1717
			class17.worldSelectLeftSprite = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "leftarrow", "");
		}

		if (class14.worldSelectRightSprite == null) { // L: 1718
			class14.worldSelectRightSprite = class150.SpriteBuffer_getIndexedSpriteByName(class299.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1719
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1720
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1721
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1722
		if (VarbitComposition.worldSelectStars != null) { // L: 1723
			VarbitComposition.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1724
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1725
			VarbitComposition.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1726
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1727
		}

		int var4;
		int var5;
		if (PcmPlayer.worldSelectArrows != null) { // L: 1729
			int var2 = Login.xPadding + 280; // L: 1730
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1731
				PcmPlayer.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var2, 4); // L: 1732
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1733
				PcmPlayer.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var2 + 15, 4); // L: 1734
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1); // L: 1735
			int var3 = Login.xPadding + 390; // L: 1736
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1737
				PcmPlayer.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var3, 4); // L: 1738
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1739
				PcmPlayer.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var3 + 15, 4); // L: 1740
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1); // L: 1741
			var4 = Login.xPadding + 500; // L: 1742
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1743
				PcmPlayer.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var4, 4); // L: 1744
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1745
				PcmPlayer.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1746
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1); // L: 1747
			var5 = Login.xPadding + 610; // L: 1748
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1749
				PcmPlayer.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				PcmPlayer.worldSelectArrows[0].drawAt(var5, 4); // L: 1750
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1751
				PcmPlayer.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				PcmPlayer.worldSelectArrows[1].drawAt(var5 + 15, 4); // L: 1752
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1); // L: 1753
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1755
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1756
		Login.hoveredWorldIndex = -1; // L: 1757
		if (class388.worldSelectBackSprites != null) { // L: 1758
			byte var23 = 88; // L: 1759
			byte var24 = 19; // L: 1760
			var4 = 765 / (var23 + 1) - 1; // L: 1761
			var5 = 480 / (var24 + 1); // L: 1762

			int var6;
			int var7;
			do {
				var6 = var5; // L: 1764
				var7 = var4; // L: 1765
				if (var5 * (var4 - 1) >= World.World_count) { // L: 1766
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1767
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) { // L: 1768
					--var5;
				}
			} while(var6 != var5 || var4 != var7); // L: 1769

			var6 = (765 - var23 * var4) / (var4 + 1); // L: 1771
			if (var6 > 5) { // L: 1772
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1); // L: 1773
			if (var7 > 5) { // L: 1774
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2; // L: 1775
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2; // L: 1776
			int var10 = (var5 + World.World_count - 1) / var5; // L: 1777
			Login.worldSelectPagesCount = var10 - var4; // L: 1778
			if (class17.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1779
				class17.worldSelectLeftSprite.drawAt(8, DecorativeObject.canvasHeight / 2 - class17.worldSelectLeftSprite.subHeight / 2); // L: 1780
			}

			if (class14.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1782
				class14.worldSelectRightSprite.drawAt(class7.canvasWidth - class14.worldSelectRightSprite.subWidth - 8, DecorativeObject.canvasHeight / 2 - class14.worldSelectRightSprite.subHeight / 2); // L: 1783
			}

			int var11 = var9 + 23; // L: 1785
			int var12 = var8 + Login.xPadding; // L: 1786
			int var13 = 0; // L: 1787
			boolean var14 = false; // L: 1788
			int var15 = Login.worldSelectPage; // L: 1789

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) { // L: 1790 1791
				World var17 = World.World_worlds[var16]; // L: 1794
				boolean var18 = true; // L: 1795
				String var19 = Integer.toString(var17.population); // L: 1796
				if (var17.population == -1) { // L: 1797
					var19 = "OFF"; // L: 1798
					var18 = false; // L: 1799
				} else if (var17.population > 1980) { // L: 1801
					var19 = "FULL"; // L: 1802
					var18 = false; // L: 1803
				}

				int var21 = 0; // L: 1806
				byte var20;
				if (var17.isBeta()) { // L: 1807
					if (var17.isMembersOnly()) { // L: 1808
						var20 = 7;
					} else {
						var20 = 6; // L: 1809
					}
				} else if (var17.isDeadman()) { // L: 1811
					var21 = 16711680; // L: 1812
					if (var17.isMembersOnly()) { // L: 1813
						var20 = 5;
					} else {
						var20 = 4; // L: 1814
					}
				} else if (var17.method1586()) { // L: 1816
					if (var17.isMembersOnly()) { // L: 1817
						var20 = 9;
					} else {
						var20 = 8; // L: 1818
					}
				} else if (var17.isPvp()) { // L: 1820
					if (var17.isMembersOnly()) { // L: 1821
						var20 = 3;
					} else {
						var20 = 2; // L: 1822
					}
				} else if (var17.isMembersOnly()) { // L: 1825
					var20 = 1;
				} else {
					var20 = 0; // L: 1826
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var23 && MouseHandler.MouseHandler_y < var11 + var24 && var18) { // L: 1828
					Login.hoveredWorldIndex = var16; // L: 1829
					class388.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215); // L: 1830
					var14 = true; // L: 1831
				} else {
					class388.worldSelectBackSprites[var20].drawAt(var12, var11); // L: 1833
				}

				if (NetCache.worldSelectFlagSprites != null) { // L: 1834
					NetCache.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1); // L: 1835
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1); // L: 1836
				var11 = var11 + var24 + var7; // L: 1837
				++var13; // L: 1838
				if (var13 >= var5) {
					var11 = var9 + 23; // L: 1839
					var12 = var12 + var23 + var6; // L: 1840
					var13 = 0; // L: 1841
					++var15; // L: 1842
				}
			}

			if (var14) { // L: 1845
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1846
				int var22 = var1.ascent + 8; // L: 1847
				int var25 = MouseHandler.MouseHandler_y + 25; // L: 1848
				if (var25 + var22 > 480) { // L: 1849
					var25 = MouseHandler.MouseHandler_y - 25 - var22; // L: 1850
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120); // L: 1852
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0); // L: 1853
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1); // L: 1854
			}
		}

		class119.rasterProvider.drawFull(0, 0); // L: 1857
	} // L: 1858
}
