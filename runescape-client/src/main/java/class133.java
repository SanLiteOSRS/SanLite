import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fq")
public class class133 implements class123 {
	@ObfuscatedName("ak")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltt;",
		garbageValue = "-294955313"
	)
	static SpritePixels[] method3025() {
		SpritePixels[] var0 = new SpritePixels[class515.SpriteBuffer_spriteCount]; // L: 169

		for (int var1 = 0; var1 < class515.SpriteBuffer_spriteCount; ++var1) { // L: 170
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 171
			var2.width = class515.SpriteBuffer_spriteWidth; // L: 172
			var2.height = class515.SpriteBuffer_spriteHeight; // L: 173
			var2.xOffset = class515.SpriteBuffer_xOffsets[var1]; // L: 174
			var2.yOffset = class515.SpriteBuffer_yOffsets[var1]; // L: 175
			var2.subWidth = SecureRandomCallable.SpriteBuffer_spriteWidths[var1]; // L: 176
			var2.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[var1]; // L: 177
			int var3 = var2.subHeight * var2.subWidth; // L: 178
			byte[] var4 = WorldMapDecoration.SpriteBuffer_pixels[var1]; // L: 179
			var2.pixels = new int[var3]; // L: 180

			for (int var5 = 0; var5 < var3; ++var5) { // L: 181
				var2.pixels[var5] = class515.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		FriendLoginUpdate.method7789(); // L: 183
		return var0; // L: 184
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "-33"
	)
	static int method3026(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1661
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1662
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1663
			return 1; // L: 1664
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1666
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1667
			return 1; // L: 1668
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1670
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.text; // L: 1671
			return 1; // L: 1672
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1674
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1675
			return 1; // L: 1676
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1678
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1682
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1686
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1690
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1694
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1695
			return 1; // L: 1696
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1698
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1699
			return 1; // L: 1700
		} else if (var0 == 2610) { // L: 1702
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1703
			return 1; // L: 1704
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1706
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.color; // L: 1707
			return 1; // L: 1708
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1710
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.color2; // L: 1711
			return 1; // L: 1712
		} else if (var0 == 2613) { // L: 1714
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1715
			return 1; // L: 1716
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1718
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1719
			return 1; // L: 1720
		} else {
			class322 var4;
			if (var0 == 2617) { // L: 1722
				var4 = var3.method6456(); // L: 1723
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0; // L: 1724
			}

			if (var0 == 2618) { // L: 1726
				var4 = var3.method6456(); // L: 1727
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0; // L: 1728
				return 1; // L: 1729
			} else {
				class327 var7;
				if (var0 == 2619) { // L: 1731
					var7 = var3.method6544(); // L: 1732
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6191().method7257() : ""; // L: 1733
					return 1; // L: 1734
				} else if (var0 == 2620) { // L: 1736
					var4 = var3.method6456(); // L: 1737
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4 != null ? var4.field3518 : 0; // L: 1738
					return 1; // L: 1739
				} else if (var0 == 2621) { // L: 1741
					var7 = var3.method6544(); // L: 1742
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6212() : 0; // L: 1743
					return 1; // L: 1744
				} else if (var0 == 2622) { // L: 1746
					var7 = var3.method6544(); // L: 1747
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6213() : 0; // L: 1748
					return 1; // L: 1749
				} else if (var0 == 2623) { // L: 1751
					var7 = var3.method6544(); // L: 1752
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6157() : 0; // L: 1753
					return 1; // L: 1754
				} else if (var0 == 2624) { // L: 1756
					var7 = var3.method6544(); // L: 1757
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null && var7.method6380() ? 1 : 0; // L: 1758
					return 1; // L: 1759
				} else if (var0 != 2625) { // L: 1761
					if (var0 == 2626) { // L: 1766
						var7 = var3.method6544(); // L: 1767
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6203().method7529() : ""; // L: 1768
						return 1; // L: 1769
					} else if (var0 == 2627) { // L: 1771
						var7 = var3.method6544(); // L: 1772
						int var5 = var7 != null ? var7.method6208() : 0; // L: 1773
						int var6 = var7 != null ? var7.method6207() : 0; // L: 1774
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1775
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1776
						return 1; // L: 1777
					} else if (var0 == 2628) { // L: 1779
						var7 = var3.method6544(); // L: 1780
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6207() : 0; // L: 1781
						return 1; // L: 1782
					} else if (var0 == 2629) { // L: 1784
						var7 = var3.method6544(); // L: 1785
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6216() : 0; // L: 1786
						return 1; // L: 1787
					} else if (var0 == 2630) { // L: 1789
						var7 = var3.method6544(); // L: 1790
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6215() : 0; // L: 1791
						return 1; // L: 1792
					} else if (var0 == 2631) { // L: 1794
						var7 = var3.method6544(); // L: 1795
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0; // L: 1796
						return 1; // L: 1797
					} else if (var0 == 2632) { // L: 1799
						var7 = var3.method6544(); // L: 1800
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null ? var7.method6218() : 0; // L: 1801
						return 1; // L: 1802
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1804
							var8 = var3.method6457(); // L: 1805
							Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = var8 != null ? var8.method377(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]) : 0; // L: 1806
							return 1; // L: 1807
						} else if (var0 == 2634) { // L: 1809
							var8 = var3.method6457(); // L: 1810
							Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1] = var8 != null ? var8.method373((char)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize - 1]) : 0; // L: 1811
							return 1; // L: 1812
						} else {
							return 2; // L: 1814
						}
					}
				} else {
					var7 = var3.method6544(); // L: 1762
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7 != null && var7.method6205() ? 1 : 0; // L: 1763
					return 1; // L: 1764
				}
			}
		}
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "214588051"
	)
	static final void method3024(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12028
		WorldMapManager.clientPreferences.updateSoundEffectVolume(var0); // L: 12029
	} // L: 12030
}
