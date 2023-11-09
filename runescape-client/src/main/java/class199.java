import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class199 implements class30 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	Widget field2305;
	@ObfuscatedName("e")
	boolean field2304;
	@ObfuscatedName("v")
	boolean field2306;

	public class199() {
		this.field2305 = null; // L: 14
		this.field2304 = false; // L: 15
		this.field2306 = false; // L: 16
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1119176744"
	)
	public boolean vmethod4138(int var1) {
		if (this.field2305 == null) { // L: 55
			return false;
		} else {
			class28 var2 = this.field2305.method6187(); // L: 56
			if (var2 == null) { // L: 57
				return false;
			} else {
				if (var2.method401(var1)) { // L: 58
					switch(var1) { // L: 59
					case 81:
						this.field2306 = true; // L: 64
						break; // L: 65
					case 82:
						this.field2304 = true; // L: 61
						break;
					default:
						if (this.method4073(var1)) { // L: 67
							class69.invalidateWidget(this.field2305); // L: 68
						}
					}
				}

				return var2.method422(var1); // L: 73
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-916991313"
	)
	public boolean vmethod4099(int var1) {
		switch(var1) { // L: 77
		case 81:
			this.field2306 = false; // L: 79
			return false; // L: 80
		case 82:
			this.field2304 = false; // L: 82
			return false; // L: 83
		default:
			return false; // L: 85
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-258182"
	)
	public boolean vmethod4097(char var1) {
		if (this.field2305 == null) { // L: 89
			return false;
		} else if (!ObjectSound.method1871(var1)) { // L: 90
			return false;
		} else {
			class303 var2 = this.field2305.method6167(); // L: 91
			if (var2 != null && var2.method6062()) { // L: 92
				class28 var3 = this.field2305.method6187(); // L: 93
				if (var3 == null) {
					return false; // L: 94
				} else {
					if (var3.method411(var1) && var2.method5897(var1)) { // L: 95 96
						class69.invalidateWidget(this.field2305); // L: 97
					}

					return var3.method398(var1); // L: 100
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "333814410"
	)
	public boolean vmethod4102(boolean var1) {
		return false; // L: 104
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)V",
		garbageValue = "-158178523"
	)
	public void method4066(Widget var1) {
		this.method4068(); // L: 19
		if (var1 != null) { // L: 20
			this.field2305 = var1; // L: 21
			class301 var2 = var1.method6185(); // L: 22
			if (var2 != null) { // L: 23
				var2.field3466.method5880(true); // L: 24
				if (var2.field3467 != null) { // L: 25
					ScriptEvent var3 = new ScriptEvent(); // L: 26
					var3.method2255(var1); // L: 27
					var3.setArgs(var2.field3467); // L: 28
					class216.method4611().addFirst(var3); // L: 29
				}
			}
		}

	} // L: 33

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lkd;",
		garbageValue = "11"
	)
	public Widget method4067() {
		return this.field2305; // L: 36
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	public void method4068() {
		if (this.field2305 != null) { // L: 40
			class301 var1 = this.field2305.method6185(); // L: 41
			Widget var2 = this.field2305; // L: 42
			this.field2305 = null; // L: 43
			if (var1 != null) { // L: 44
				var1.field3466.method5880(false); // L: 45
				if (var1.field3467 != null) { // L: 46
					ScriptEvent var3 = new ScriptEvent(); // L: 47
					var3.method2255(var2); // L: 48
					var3.setArgs(var1.field3467); // L: 49
					class216.method4611().addFirst(var3); // L: 50
				}

			}
		}
	} // L: 52

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "175543627"
	)
	boolean method4073(int var1) {
		if (this.field2305 == null) { // L: 108
			return false;
		} else {
			class303 var2 = this.field2305.method6167(); // L: 109
			if (var2 != null && var2.method6062()) { // L: 110
				Clipboard var5;
				switch(var1) { // L: 111
				case 13:
					this.method4068(); // L: 113
					return true; // L: 114
				case 48:
					if (this.field2304) { // L: 244
						var2.method6116(); // L: 245
					}

					return true; // L: 247
				case 65:
					if (this.field2304) { // L: 166
						var5 = BuddyRankComparator.client.method498(); // L: 170
						var2.method5922(var5); // L: 172
					}

					return true; // L: 174
				case 66:
					if (this.field2304) { // L: 234
						var5 = BuddyRankComparator.client.method498(); // L: 238
						var2.method6034(var5); // L: 240
					}

					return true; // L: 242
				case 67:
					if (this.field2304) { // L: 216
						var5 = BuddyRankComparator.client.method498(); // L: 220
						var2.method5923(var5); // L: 222
					}

					return true; // L: 224
				case 84:
					if (var2.method5942() == 0) { // L: 124
						var2.method5897(10); // L: 125
					} else if (this.field2306 && var2.method5946()) { // L: 128
						var2.method5897(10); // L: 129
					} else {
						class301 var3 = this.field2305.method6185(); // L: 132
						ScriptEvent var4 = new ScriptEvent(); // L: 133
						var4.method2255(this.field2305); // L: 134
						var4.setArgs(var3.field3465); // L: 135
						class216.method4611().addFirst(var4); // L: 136
						this.method4068(); // L: 137
					}

					return true; // L: 140
				case 85:
					if (this.field2304) { // L: 208
						var2.method5900(); // L: 209
					} else {
						var2.method5898(); // L: 212
					}

					return true; // L: 214
				case 96:
					if (this.field2304) { // L: 192
						var2.method5911(this.field2306); // L: 193
					} else {
						var2.method5909(this.field2306); // L: 196
					}

					return true; // L: 198
				case 97:
					if (this.field2304) { // L: 226
						var2.method5903(this.field2306); // L: 227
					} else {
						var2.method5910(this.field2306); // L: 230
					}

					return true; // L: 232
				case 98:
					if (this.field2304) { // L: 142
						var2.method5924(); // L: 143
					} else {
						var2.method6028(this.field2306); // L: 146
					}

					return true; // L: 148
				case 99:
					if (this.field2304) { // L: 158
						var2.method6001(); // L: 159
					} else {
						var2.method5935(this.field2306); // L: 162
					}

					return true; // L: 164
				case 101:
					if (this.field2304) { // L: 200
						var2.method5901(); // L: 201
					} else {
						var2.method5899(); // L: 204
					}

					return true; // L: 206
				case 102:
					if (this.field2304) { // L: 184
						var2.method5907(this.field2306); // L: 185
					} else {
						var2.method6143(this.field2306); // L: 188
					}

					return true; // L: 190
				case 103:
					if (this.field2304) { // L: 150
						var2.method5908(this.field2306); // L: 151
					} else {
						var2.method5906(this.field2306); // L: 154
					}

					return true; // L: 156
				case 104:
					if (this.field2304) { // L: 116
						var2.method5917(this.field2306); // L: 117
					} else {
						var2.method5915(this.field2306); // L: 120
					}

					return true; // L: 122
				case 105:
					if (this.field2304) { // L: 176
						var2.method5918(this.field2306); // L: 177
					} else {
						var2.method5916(this.field2306); // L: 180
					}

					return true; // L: 182
				default:
					return false; // L: 249
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;Lnv;I)V",
		garbageValue = "-672132656"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (CollisionMap.canvasWidth - 765) / 2; // L: 1655
		Login.loginBoxX = Login.xPadding + 202; // L: 1656
		UrlRequest.loginBoxCenter = Login.loginBoxX + 180; // L: 1657
		byte var3;
		int var4;
		int var8;
		int var10;
		int var25;
		int var31;
		int var38;
		if (Login.worldSelectOpen) { // L: 1658
			Archive var39;
			int var42;
			if (GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites == null) { // L: 1660
				var39 = ClientPreferences.archive8; // L: 1662
				var38 = var39.getGroupId("sl_back"); // L: 1664
				var42 = var39.getFileId(var38, ""); // L: 1665
				SpritePixels[] var43 = SequenceDefinition.method4064(var39, var38, var42); // L: 1666
				GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites = var43; // L: 1668
			}

			IndexedSprite[] var44;
			if (class87.worldSelectFlagSprites == null) { // L: 1670
				var39 = ClientPreferences.archive8; // L: 1672
				var38 = var39.getGroupId("sl_flags"); // L: 1674
				var42 = var39.getFileId(var38, ""); // L: 1675
				var44 = AbstractWorldMapData.method5238(var39, var38, var42); // L: 1676
				class87.worldSelectFlagSprites = var44; // L: 1678
			}

			if (GroundObject.worldSelectArrows == null) { // L: 1680
				var39 = ClientPreferences.archive8; // L: 1682
				var38 = var39.getGroupId("sl_arrows"); // L: 1684
				var42 = var39.getFileId(var38, ""); // L: 1685
				var44 = AbstractWorldMapData.method5238(var39, var38, var42); // L: 1686
				GroundObject.worldSelectArrows = var44; // L: 1688
			}

			if (class280.worldSelectStars == null) { // L: 1690
				var39 = ClientPreferences.archive8; // L: 1692
				var38 = var39.getGroupId("sl_stars"); // L: 1694
				var42 = var39.getFileId(var38, ""); // L: 1695
				var44 = AbstractWorldMapData.method5238(var39, var38, var42); // L: 1696
				class280.worldSelectStars = var44; // L: 1698
			}

			if (BufferedNetSocket.worldSelectLeftSprite == null) { // L: 1700
				BufferedNetSocket.worldSelectLeftSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "leftarrow", "");
			}

			if (class140.worldSelectRightSprite == null) { // L: 1701
				class140.worldSelectRightSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1702
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1703
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1704
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1705
			if (class280.worldSelectStars != null) { // L: 1706
				class280.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1707
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1708
				class280.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1709
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1710
			}

			if (GroundObject.worldSelectArrows != null) { // L: 1712
				var31 = Login.xPadding + 280; // L: 1713
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1714
					GroundObject.worldSelectArrows[2].drawAt(var31, 4);
				} else {
					GroundObject.worldSelectArrows[0].drawAt(var31, 4); // L: 1715
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1716
					GroundObject.worldSelectArrows[3].drawAt(var31 + 15, 4);
				} else {
					GroundObject.worldSelectArrows[1].drawAt(var31 + 15, 4); // L: 1717
				}

				var0.draw("World", var31 + 32, 17, 16777215, -1); // L: 1718
				var4 = Login.xPadding + 390; // L: 1719
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1720
					GroundObject.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					GroundObject.worldSelectArrows[0].drawAt(var4, 4); // L: 1721
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1722
					GroundObject.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					GroundObject.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1723
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1724
				var38 = Login.xPadding + 500; // L: 1725
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1726
					GroundObject.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					GroundObject.worldSelectArrows[0].drawAt(var38, 4); // L: 1727
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1728
					GroundObject.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					GroundObject.worldSelectArrows[1].drawAt(var38 + 15, 4); // L: 1729
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1); // L: 1730
				var42 = Login.xPadding + 610; // L: 1731
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1732
					GroundObject.worldSelectArrows[2].drawAt(var42, 4);
				} else {
					GroundObject.worldSelectArrows[0].drawAt(var42, 4); // L: 1733
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1734
					GroundObject.worldSelectArrows[3].drawAt(var42 + 15, 4);
				} else {
					GroundObject.worldSelectArrows[1].drawAt(var42 + 15, 4); // L: 1735
				}

				var0.draw("Type", var42 + 32, 17, 16777215, -1); // L: 1736
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1738
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1739
			Login.hoveredWorldIndex = -1; // L: 1740
			if (GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites != null) { // L: 1741
				var3 = 88; // L: 1742
				byte var36 = 19; // L: 1743
				var38 = 765 / (var3 + 1) - 1; // L: 1744
				var42 = 480 / (var36 + 1); // L: 1745

				do {
					var25 = var42; // L: 1747
					var8 = var38; // L: 1748
					if (var42 * (var38 - 1) >= World.World_count) { // L: 1749
						--var38;
					}

					if (var38 * (var42 - 1) >= World.World_count) { // L: 1750
						--var42;
					}

					if (var38 * (var42 - 1) >= World.World_count) { // L: 1751
						--var42;
					}
				} while(var42 != var25 || var38 != var8); // L: 1752

				var25 = (765 - var38 * var3) / (var38 + 1); // L: 1754
				if (var25 > 5) { // L: 1755
					var25 = 5;
				}

				var8 = (480 - var36 * var42) / (var42 + 1); // L: 1756
				if (var8 > 5) { // L: 1757
					var8 = 5;
				}

				int var28 = (765 - var38 * var3 - var25 * (var38 - 1)) / 2; // L: 1758
				var10 = (480 - var36 * var42 - var8 * (var42 - 1)) / 2; // L: 1759
				int var35 = (var42 + World.World_count - 1) / var42; // L: 1760
				Login.worldSelectPagesCount = var35 - var38; // L: 1761
				if (BufferedNetSocket.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1762
					BufferedNetSocket.worldSelectLeftSprite.drawAt(8, Language.canvasHeight / 2 - BufferedNetSocket.worldSelectLeftSprite.subHeight * 694949360 / 2); // L: 1763
				}

				if (class140.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1765
					class140.worldSelectRightSprite.drawAt(CollisionMap.canvasWidth - class140.worldSelectRightSprite.subWidth - 8, Language.canvasHeight / 2 - class140.worldSelectRightSprite.subHeight * 694949360 / 2); // L: 1766
				}

				int var12 = var10 + 23; // L: 1768
				int var13 = var28 + Login.xPadding; // L: 1769
				int var14 = 0; // L: 1770
				boolean var15 = false; // L: 1771
				int var16 = Login.worldSelectPage; // L: 1772

				int var17;
				for (var17 = var16 * var42; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) { // L: 1773 1774
					World var18 = World.World_worlds[var17]; // L: 1777
					boolean var19 = true; // L: 1778
					String var20 = Integer.toString(var18.population); // L: 1779
					if (var18.population == -1) { // L: 1780
						var20 = "OFF"; // L: 1781
						var19 = false; // L: 1782
					} else if (var18.population > 1980) { // L: 1784
						var20 = "FULL"; // L: 1785
						var19 = false; // L: 1786
					}

					int var21 = -1; // L: 1788
					int var22 = 0; // L: 1789
					if (var18.isBeta()) { // L: 1790
						if (var18.isMembersOnly()) { // L: 1791
							var21 = class104.field1390.field1397; // L: 1792
						} else {
							var21 = class104.field1389.field1397; // L: 1795
						}
					} else if (var18.isDeadman()) { // L: 1798
						var22 = 16711680; // L: 1799
						if (var18.isMembersOnly()) { // L: 1800
							var21 = class104.field1388.field1397; // L: 1801
						} else {
							var21 = class104.field1391.field1397; // L: 1804
						}
					} else if (var18.method1806()) { // L: 1807
						if (var18.isMembersOnly()) { // L: 1808
							var21 = class104.field1392.field1397; // L: 1809
						} else {
							var21 = class104.field1395.field1397; // L: 1812
						}
					} else if (var18.isPvp()) { // L: 1815
						if (var18.isMembersOnly()) { // L: 1816
							var21 = class104.field1386.field1397; // L: 1817
						} else {
							var21 = class104.field1385.field1397; // L: 1820
						}
					} else if (var18.method1804()) { // L: 1823
						if (var18.isMembersOnly()) { // L: 1824
							var21 = class104.field1387.field1397; // L: 1825
						} else {
							var21 = class104.field1394.field1397; // L: 1828
						}
					} else if (var18.method1753()) { // L: 1831
						if (var18.isMembersOnly()) { // L: 1832
							var21 = class104.field1396.field1397;
						} else {
							var21 = class104.field1393.field1397; // L: 1833
						}
					}

					if (var21 == -1 || var21 >= GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites.length) { // L: 1835
						if (var18.isMembersOnly()) { // L: 1836
							var21 = class104.field1383.field1397; // L: 1837
						} else {
							var21 = class104.field1400.field1397; // L: 1840
						}
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var36 + var12 && var19) { // L: 1843
						Login.hoveredWorldIndex = var17; // L: 1844
						GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var12, 128, 16777215); // L: 1845
						var15 = true; // L: 1846
					} else {
						GrandExchangeOfferOwnWorldComparator.worldSelectBackSprites[var21].drawAt(var13, var12); // L: 1848
					}

					if (class87.worldSelectFlagSprites != null) { // L: 1849
						class87.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1); // L: 1850
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1); // L: 1851
					var12 = var12 + var8 + var36; // L: 1852
					++var14; // L: 1853
					if (var14 >= var42) {
						var12 = var10 + 23; // L: 1854
						var13 = var13 + var25 + var3; // L: 1855
						var14 = 0; // L: 1856
						++var16; // L: 1857
					}
				}

				if (var15) { // L: 1860
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1861
					int var29 = var1.ascent + 8; // L: 1862
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 1863
					if (var29 + var37 > 480) { // L: 1864
						var37 = MouseHandler.MouseHandler_y - 25 - var29; // L: 1865
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 16777120); // L: 1867
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 0); // L: 1868
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 1869
				}
			}

			RouteStrategy.rasterProvider.drawFull(0, 0); // L: 1872
		} else {
			SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1876
			class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1877
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1878
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1879
				var3 = 20; // L: 1880
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1881
				var4 = 253 - var3; // L: 1882
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1883
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1884
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1885
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1886
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1887
			}

			String var5;
			String var6;
			String var7;
			short var30;
			short var32;
			if (Client.gameState == 20) { // L: 1889
				ModelData0.titleboxSprite.drawAt(Login.loginBoxX + 180 - ModelData0.titleboxSprite.subWidth / 2, 271 - ModelData0.titleboxSprite.subHeight * 694949360 / 2); // L: 1890
				var30 = 201; // L: 1891
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1892
				var31 = var30 + 15; // L: 1893
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1894
				var31 += 15; // L: 1895
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1896
				var31 += 15; // L: 1897
				var31 += 7; // L: 1898
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1899
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var31, 16777215, 0); // L: 1900
					var32 = 200; // L: 1901
					var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username; // L: 1904

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) { // L: 1906 1907 1908
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var31, 16777215, 0); // L: 1910
					var31 += 15; // L: 1911

					for (var7 = TaskHandler.method3447(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) { // L: 1912 1913 1914
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var31, 16777215, 0); // L: 1916
					var31 += 15; // L: 1917
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1920
				ModelData0.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1921
				short var23;
				if (Login.loginIndex == 0) { // L: 1922
					var30 = 251; // L: 1923
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1924
					var31 = var30 + 30; // L: 1925
					var4 = Login.loginBoxX + 180 - 80; // L: 1926
					var23 = 291; // L: 1927
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 1928
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1929
					var4 = Login.loginBoxX + 180 + 80; // L: 1930
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 1931
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1932
				} else if (Login.loginIndex == 1) { // L: 1934
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1935
					var30 = 236; // L: 1936
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1937
					var31 = var30 + 15; // L: 1938
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1939
					var31 += 15; // L: 1940
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1941
					var31 += 15; // L: 1942
					var4 = Login.loginBoxX + 180 - 80; // L: 1943
					var23 = 321; // L: 1944
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 1945
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1946
					var4 = Login.loginBoxX + 180 + 80; // L: 1947
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 1948
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1949
				} else if (Login.loginIndex == 2) { // L: 1951
					var30 = 201; // L: 1952
					var0.drawCentered(Login.Login_response1, UrlRequest.loginBoxCenter, var30, 16776960, 0); // L: 1953
					var31 = var30 + 15; // L: 1954
					var0.drawCentered(Login.Login_response2, UrlRequest.loginBoxCenter, var31, 16776960, 0); // L: 1955
					var31 += 15; // L: 1956
					var0.drawCentered(Login.Login_response3, UrlRequest.loginBoxCenter, var31, 16776960, 0); // L: 1957
					var31 += 15; // L: 1958
					var31 += 7; // L: 1959
					var0.draw("Login: ", UrlRequest.loginBoxCenter - 110, var31, 16777215, 0); // L: 1960
					var32 = 200; // L: 1961
					var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username; // L: 1964

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) { // L: 1966 1967 1968
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), UrlRequest.loginBoxCenter - 70, var31, 16777215, 0); // L: 1970
					var31 += 15; // L: 1971

					for (var7 = TaskHandler.method3447(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) { // L: 1972 1973 1974
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), UrlRequest.loginBoxCenter - 108, var31, 16777215, 0); // L: 1976
					var31 += 15; // L: 1977
					var30 = 277; // L: 1978
					var8 = UrlRequest.loginBoxCenter + -117; // L: 1979
					IndexedSprite var9 = class143.method3132(Client.Login_isUsernameRemembered, Login.field939); // L: 1980
					var9.drawAt(var8, var30); // L: 1981
					var8 = var8 + var9.subWidth + 5; // L: 1982
					var1.draw("Remember username", var8, var30 + 13, 16776960, 0); // L: 1983
					var8 = UrlRequest.loginBoxCenter + 24; // L: 1984
					var9 = class143.method3132(StructComposition.clientPreferences.method2413(), Login.field955); // L: 1985
					var9.drawAt(var8, var30); // L: 1986
					var8 = var8 + var9.subWidth + 5; // L: 1987
					var1.draw("Hide username", var8, var30 + 13, 16776960, 0); // L: 1988
					var31 = var30 + 15; // L: 1989
					var10 = UrlRequest.loginBoxCenter - 80; // L: 1990
					short var11 = 321; // L: 1991
					Frames.field2611.drawAt(var10 - 73, var11 - 20); // L: 1992
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0); // L: 1993
					var10 = UrlRequest.loginBoxCenter + 80; // L: 1994
					Frames.field2611.drawAt(var10 - 73, var11 - 20); // L: 1995
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0); // L: 1996
					var30 = 357; // L: 1997
					switch(Login.field928) { // L: 1998
					case 2:
						Login.field929 = "Having trouble logging in?"; // L: 2000
						break;
					default:
						Login.field929 = "Can't login? Click here."; // L: 2003
					}

					class379.field4467 = new Bounds(UrlRequest.loginBoxCenter, var30, var1.stringWidth(Login.field929), 11); // L: 2006
					class151.field1763 = new Bounds(UrlRequest.loginBoxCenter, var30, var1.stringWidth("Still having trouble logging in?"), 11); // L: 2007
					var1.drawCentered(Login.field929, UrlRequest.loginBoxCenter, var30, 16777215, 0); // L: 2008
				} else if (Login.loginIndex == 3) { // L: 2010
					var30 = 201; // L: 2011
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 2012
					var31 = var30 + 20; // L: 2013
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2014
					var31 += 15; // L: 2015
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2016
					var31 += 15; // L: 2017
					var4 = Login.loginBoxX + 180; // L: 2018
					var23 = 276; // L: 2019
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2020
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 2021
					var4 = Login.loginBoxX + 180; // L: 2022
					var23 = 326; // L: 2023
					Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2024
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 2025
				} else {
					short var34;
					if (Login.loginIndex == 4) { // L: 2027
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 2028
						var30 = 236; // L: 2029
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 2030
						var31 = var30 + 15; // L: 2031
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 2032
						var31 += 15; // L: 2033
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 2034
						var31 += 15; // L: 2035
						var0.draw("PIN: " + TaskHandler.method3447(class141.otp) + (Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var31, 16777215, 0); // L: 2036
						var31 -= 8; // L: 2037
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var31, 16776960, 0); // L: 2038
						var31 += 15; // L: 2039
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var31, 16776960, 0); // L: 2040
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 2041
						var38 = var31 - var0.ascent; // L: 2042
						IndexedSprite var33;
						if (Login.field930) { // L: 2044
							var33 = class89.field1154; // L: 2045
						} else {
							var33 = WorldMapLabel.field2975; // L: 2048
						}

						var33.drawAt(var4, var38); // L: 2050
						var31 += 15; // L: 2051
						var25 = Login.loginBoxX + 180 - 80; // L: 2052
						var34 = 321; // L: 2053
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2054
						var0.drawCentered("Continue", var25, var34 + 5, 16777215, 0); // L: 2055
						var25 = Login.loginBoxX + 180 + 80; // L: 2056
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2057
						var0.drawCentered("Cancel", var25, var34 + 5, 16777215, 0); // L: 2058
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var34 + 36, 255, 0); // L: 2059
					} else if (Login.loginIndex == 5) { // L: 2061
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 2062
						var30 = 221; // L: 2063
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 2064
						var31 = var30 + 15; // L: 2065
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2066
						var31 += 15; // L: 2067
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2068
						var31 += 15; // L: 2069
						var31 += 14; // L: 2070
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var31, 16777215, 0); // L: 2071
						var32 = 174; // L: 2072
						var5 = StructComposition.clientPreferences.method2413() ? TaskHandler.method3447(Login.Login_username) : Login.Login_username; // L: 2075

						for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) { // L: 2077 2078 2079
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var31, 16777215, 0); // L: 2081
						var31 += 15; // L: 2082
						var25 = Login.loginBoxX + 180 - 80; // L: 2083
						var34 = 321; // L: 2084
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2085
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0); // L: 2086
						var25 = Login.loginBoxX + 180 + 80; // L: 2087
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2088
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 2089
						var34 = 356; // L: 2090
						var1.drawCentered("Still having trouble logging in?", UrlRequest.loginBoxCenter, var34, 268435455, 0); // L: 2091
					} else if (Login.loginIndex == 6) { // L: 2093
						var30 = 201; // L: 2094
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 2095
						var31 = var30 + 15; // L: 2096
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2097
						var31 += 15; // L: 2098
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2099
						var31 += 15; // L: 2100
						var4 = Login.loginBoxX + 180; // L: 2101
						var23 = 321; // L: 2102
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2103
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2104
					} else if (Login.loginIndex == 7) { // L: 2106
						if (class155.field1785 && !Client.onMobile) { // L: 2107
							var30 = 201; // L: 2108
							var0.drawCentered(Login.Login_response1, UrlRequest.loginBoxCenter, var30, 16776960, 0); // L: 2109
							var31 = var30 + 15; // L: 2110
							var0.drawCentered(Login.Login_response2, UrlRequest.loginBoxCenter, var31, 16776960, 0); // L: 2111
							var31 += 15; // L: 2112
							var0.drawCentered(Login.Login_response3, UrlRequest.loginBoxCenter, var31, 16776960, 0); // L: 2113
							var4 = UrlRequest.loginBoxCenter - 150; // L: 2114
							var31 += 10; // L: 2115

							for (var38 = 0; var38 < 8; ++var38) { // L: 2116
								Frames.field2611.method8993(var4, var31, 30, 40); // L: 2117
								boolean var26 = var38 == Login.field938 & Client.cycle % 40 < 20; // L: 2118
								var0.draw((Login.field915[var38] == null ? "" : Login.field915[var38]) + (var26 ? MouseRecorder.colorStartTag(16776960) + "|" : ""), var4 + 10, var31 + 27, 16777215, 0); // L: 2119
								if (var38 != 1 && var38 != 3) { // L: 2120
									var4 += 35; // L: 2125
								} else {
									var4 += 50; // L: 2121
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var31 + 27, 16777215, 0); // L: 2122
								}
							}

							var38 = UrlRequest.loginBoxCenter - 80; // L: 2128
							short var40 = 321; // L: 2129
							Frames.field2611.drawAt(var38 - 73, var40 - 20); // L: 2130
							var0.drawCentered("Submit", var38, var40 + 5, 16777215, 0); // L: 2131
							var38 = UrlRequest.loginBoxCenter + 80; // L: 2132
							Frames.field2611.drawAt(var38 - 73, var40 - 20); // L: 2133
							var0.drawCentered("Cancel", var38, var40 + 5, 16777215, 0); // L: 2134
						} else {
							var30 = 216; // L: 2137
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 2138
							var31 = var30 + 15; // L: 2139
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2140
							var31 += 15; // L: 2141
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2142
							var31 += 15; // L: 2143
							var4 = Login.loginBoxX + 180 - 80; // L: 2144
							var23 = 321; // L: 2145
							Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2146
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 2147
							var4 = Login.loginBoxX + 180 + 80; // L: 2148
							Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2149
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2150
						}
					} else if (Login.loginIndex == 8) { // L: 2153
						var30 = 216; // L: 2154
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 2155
						var31 = var30 + 15; // L: 2156
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2157
						var31 += 15; // L: 2158
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2159
						var31 += 15; // L: 2160
						var4 = Login.loginBoxX + 180 - 80; // L: 2161
						var23 = 321; // L: 2162
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2163
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 2164
						var4 = Login.loginBoxX + 180 + 80; // L: 2165
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2166
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2167
					} else if (Login.loginIndex == 9) { // L: 2169
						var30 = 221; // L: 2170
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 2171
						var31 = var30 + 25; // L: 2172
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2173
						var31 += 25; // L: 2174
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2175
						var4 = Login.loginBoxX + 180; // L: 2176
						var23 = 311; // L: 2177
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2178
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 2179
					} else if (Login.loginIndex == 10) { // L: 2181
						var31 = Login.loginBoxX + 180; // L: 2182
						var32 = 209; // L: 2183
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 2184
						var4 = var32 + 20; // L: 2185
						class299.field3457.drawAt(var31 - 109, var4); // L: 2186
						class150.field1756.drawAt(var31 - 48, var4 + 18); // L: 2187
					} else if (Login.loginIndex == 12) { // L: 2189
						var31 = UrlRequest.loginBoxCenter; // L: 2190
						var32 = 216; // L: 2191
						var2.drawCentered("Before using this app, please read and accept our", var31, var32, 16777215, 0); // L: 2192
						var4 = var32 + 17; // L: 2193
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var31, var4, 16777215, 0); // L: 2194
						var4 += 17; // L: 2195
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var31, var4, 16777215, 0); // L: 2196
						var4 += 17; // L: 2197
						var2.drawCentered("By accepting, you agree to these documents.", var31, var4, 16777215, 0); // L: 2198
						var31 = UrlRequest.loginBoxCenter - 80; // L: 2199
						var32 = 311; // L: 2200
						Frames.field2611.drawAt(var31 - 73, var32 - 20); // L: 2201
						var0.drawCentered("Accept", var31, var32 + 5, 16777215, 0); // L: 2202
						var31 = UrlRequest.loginBoxCenter + 80; // L: 2203
						Frames.field2611.drawAt(var31 - 73, var32 - 20); // L: 2204
						var0.drawCentered("Decline", var31, var32 + 5, 16777215, 0); // L: 2205
					} else if (Login.loginIndex == 13) { // L: 2207
						var30 = 231; // L: 2208
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var30, 16777215, 0); // L: 2209
						var31 = var30 + 20; // L: 2210
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var31, 16777215, 0); // L: 2211
						var4 = Login.loginBoxX + 180; // L: 2212
						var30 = 311; // L: 2213
						Frames.field2611.drawAt(var4 - 73, var30 - 20); // L: 2214
						var0.drawCentered("Back", var4, var30 + 5, 16777215, 0); // L: 2215
					} else if (Login.loginIndex == 14) { // L: 2217
						var30 = 201; // L: 2218
						String var24 = ""; // L: 2219
						var5 = ""; // L: 2220
						var6 = ""; // L: 2221
						switch(Login.field924) { // L: 2222
						case 0:
							var24 = "Your account has been involved"; // L: 2225
							var5 = "in serious rule breaking."; // L: 2226
							var6 = ""; // L: 2227
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 2239
							var5 = Strings.field3910; // L: 2240
							var6 = ""; // L: 2241
							break; // L: 2242
						case 2:
							var24 = "The unpaid balance on your account needs"; // L: 2232
							var5 = "to be resolved before you can play."; // L: 2233
							var6 = Strings.field3947; // L: 2234
							break; // L: 2235
						default:
							class343.Login_promptCredentials(false); // L: 2246
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var30, 16776960, 0); // L: 2250
						var31 = var30 + 20; // L: 2251
						var0.drawCentered(var5, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2252
						var31 += 20; // L: 2253
						var0.drawCentered(var6, Login.loginBoxX + 180, var31, 16776960, 0); // L: 2254
						var25 = Login.loginBoxX + 180; // L: 2255
						var34 = 276; // L: 2256
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2257
						var0.drawCentered("Support Page", var25, var34 + 5, 16777215, 0); // L: 2258
						var25 = Login.loginBoxX + 180; // L: 2259
						var34 = 326; // L: 2260
						Frames.field2611.drawAt(var25 - 73, var34 - 20); // L: 2261
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 2262
					} else if (Login.loginIndex == 24) { // L: 2264
						var30 = 221; // L: 2265
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 2266
						var31 = var30 + 15; // L: 2267
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 2268
						var31 += 15; // L: 2269
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 2270
						var31 += 15; // L: 2271
						var4 = Login.loginBoxX + 180; // L: 2272
						var23 = 301; // L: 2273
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2274
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 2275
					} else if (Login.loginIndex == 26) { // L: 2277
						var30 = 216; // L: 2278
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 2279
						var31 = var30 + 15; // L: 2280
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2281
						var31 += 15; // L: 2282
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 2283
						var31 += 15; // L: 2284
						var4 = Login.loginBoxX + 180 - 80; // L: 2285
						var23 = 321; // L: 2286
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2287
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 2288
						var4 = Login.loginBoxX + 180 + 80; // L: 2289
						Frames.field2611.drawAt(var4 - 73, var23 - 20); // L: 2290
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 2291
					}
				}
			}

			if (Client.gameState >= 10) { // L: 2294
				int[] var27 = new int[4]; // L: 2295
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 2296
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Language.canvasHeight); // L: 2297
				class154.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 2298
				class154.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 2299
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 2300
			}

			class109.title_muteSprite[StructComposition.clientPreferences.method2428() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 2302
			if (Client.gameState > 5 && class173.clientLanguage == Language.Language_EN) { // L: 2303
				if (class98.field1340 != null) { // L: 2304
					var31 = Login.xPadding + 5; // L: 2305
					var32 = 463; // L: 2306
					byte var45 = 100; // L: 2307
					byte var41 = 35; // L: 2308
					class98.field1340.drawAt(var31, var32); // L: 2309
					var0.drawCentered("World" + " " + Client.worldId, var45 / 2 + var31, var41 / 2 + var32 - 2, 16777215, 0); // L: 2310
					if (class1.World_request != null) { // L: 2311
						var1.drawCentered("Loading...", var45 / 2 + var31, var41 / 2 + var32 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var45 / 2 + var31, var41 / 2 + var32 + 12, 16777215, 0); // L: 2312
					}
				} else {
					class98.field1340 = Projectile.SpriteBuffer_getIndexedSpriteByName(ClientPreferences.archive8, "sl_button", ""); // L: 2315
				}
			}

		}
	} // L: 1874 2318

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1920337009"
	)
	static int method4091(int var0, Script var1, boolean var2) {
		return 2; // L: 4914
	}
}
