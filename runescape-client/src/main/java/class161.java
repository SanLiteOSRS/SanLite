import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gb")
public class class161 extends class142 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1002671373
	)
	int field1756;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class161(class145 var1) {
		this.this$0 = var1;
		this.field1756 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1756 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3224(this.field1756); // L: 153
	} // L: 154

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "-1137232353"
	)
	public static long method3326(CharSequence var0) {
		long var1 = 0L; // L: 16
		int var3 = var0.length(); // L: 17

		for (int var4 = 0; var4 < var3; ++var4) { // L: 18
			var1 *= 37L; // L: 19
			char var5 = var0.charAt(var4); // L: 20
			if (var5 >= 'A' && var5 <= 'Z') { // L: 21
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') { // L: 22
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48); // L: 23
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILtz;I)Lhe;",
		garbageValue = "-1861148269"
	)
	public static class182 method3332(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class182 var5 = new class182(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1890 != null && var7.length == var5.field1890.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1890[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1888 != null && var7.length == var5.field1888.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1888[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	static void method3331() {
		FaceNormal.field2621 = null; // L: 61
		class74.field916 = null; // L: 62
		Player.field1127 = null; // L: 63
		Tiles.field1018 = null; // L: 64
		Tiles.field1020 = null; // L: 65
		class305.field3399 = null; // L: 66
		Canvas.field116 = null; // L: 67
		UserComparator5.Tiles_hue = null; // L: 68
		class210.Tiles_saturation = null; // L: 69
		Tiles.Tiles_lightness = null; // L: 70
		class149.Tiles_hueMultiplier = null; // L: 71
		Tiles.field1019 = null; // L: 72
	} // L: 73

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "60"
	)
	static int method3327(int var0, Script var1, boolean var2) {
		Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1661
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1662
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1663
			return 1; // L: 1664
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1666
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1667
			return 1; // L: 1668
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1670
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text; // L: 1671
			return 1; // L: 1672
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1674
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1675
			return 1; // L: 1676
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1678
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1682
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1686
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1690
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1694
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1695
			return 1; // L: 1696
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1698
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1699
			return 1; // L: 1700
		} else if (var0 == 2610) { // L: 1702
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1703
			return 1; // L: 1704
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1706
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1707
			return 1; // L: 1708
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1710
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1711
			return 1; // L: 1712
		} else if (var0 == 2613) { // L: 1714
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1715
			return 1; // L: 1716
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1718
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1719
			return 1; // L: 1720
		} else {
			class322 var4;
			if (var0 == 2617) { // L: 1722
				var4 = var3.method6381(); // L: 1723
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3522 : 0; // L: 1724
			}

			if (var0 == 2618) { // L: 1726
				var4 = var3.method6381(); // L: 1727
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0; // L: 1728
				return 1; // L: 1729
			} else {
				class327 var7;
				if (var0 == 2619) { // L: 1731
					var7 = var3.method6380(); // L: 1732
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6105().method7267() : ""; // L: 1733
					return 1; // L: 1734
				} else if (var0 == 2620) { // L: 1736
					var4 = var3.method6381(); // L: 1737
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0; // L: 1738
					return 1; // L: 1739
				} else if (var0 == 2621) { // L: 1741
					var7 = var3.method6380(); // L: 1742
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6115() : 0; // L: 1743
					return 1; // L: 1744
				} else if (var0 == 2622) { // L: 1746
					var7 = var3.method6380(); // L: 1747
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6170() : 0; // L: 1748
					return 1; // L: 1749
				} else if (var0 == 2623) { // L: 1751
					var7 = var3.method6380(); // L: 1752
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6117() : 0; // L: 1753
					return 1; // L: 1754
				} else if (var0 == 2624) { // L: 1756
					var7 = var3.method6380(); // L: 1757
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6107() ? 1 : 0; // L: 1758
					return 1; // L: 1759
				} else if (var0 != 2625) { // L: 1761
					if (var0 == 2626) { // L: 1766
						var7 = var3.method6380(); // L: 1767
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6106().method7529() : ""; // L: 1768
						return 1; // L: 1769
					} else if (var0 == 2627) { // L: 1771
						var7 = var3.method6380(); // L: 1772
						int var5 = var7 != null ? var7.method6232() : 0; // L: 1773
						int var6 = var7 != null ? var7.method6239() : 0; // L: 1774
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1775
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1776
						return 1; // L: 1777
					} else if (var0 == 2628) { // L: 1779
						var7 = var3.method6380(); // L: 1780
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6239() : 0; // L: 1781
						return 1; // L: 1782
					} else if (var0 == 2629) { // L: 1784
						var7 = var3.method6380(); // L: 1785
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6229() : 0; // L: 1786
						return 1; // L: 1787
					} else if (var0 == 2630) { // L: 1789
						var7 = var3.method6380(); // L: 1790
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6118() : 0; // L: 1791
						return 1; // L: 1792
					} else if (var0 == 2631) { // L: 1794
						var7 = var3.method6380(); // L: 1795
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6305() : 0; // L: 1796
						return 1; // L: 1797
					} else if (var0 == 2632) { // L: 1799
						var7 = var3.method6380(); // L: 1800
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6121() : 0; // L: 1801
						return 1; // L: 1802
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1804
							var8 = var3.method6382(); // L: 1805
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method420(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1806
							return 1; // L: 1807
						} else if (var0 == 2634) { // L: 1809
							var8 = var3.method6382(); // L: 1810
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method385((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1811
							return 1; // L: 1812
						} else {
							return 2; // L: 1814
						}
					}
				} else {
					var7 = var3.method6380(); // L: 1762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6156() ? 1 : 0; // L: 1763
					return 1; // L: 1764
				}
			}
		}
	}
}
