import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jh")
public class class249 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "46525836"
	)
	static int method5137(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-157750544"
	)
	static int method5143(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1636
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1637
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1641
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1645
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.text; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1649
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1653
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1654
			return 1; // L: 1655
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1657
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1658
			return 1; // L: 1659
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1661
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1662
			return 1; // L: 1663
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1665
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1666
			return 1; // L: 1667
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1669
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1670
			return 1; // L: 1671
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1673
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1674
			return 1; // L: 1675
		} else if (var0 == 2610) { // L: 1677
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1678
			return 1; // L: 1679
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1681
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1682
			return 1; // L: 1683
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1685
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1686
			return 1; // L: 1687
		} else if (var0 == 2613) { // L: 1689
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1690
			return 1; // L: 1691
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1693
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1694
			return 1; // L: 1695
		} else {
			class305 var4;
			if (var0 == 2617) { // L: 1697
				var4 = var3.method6119(); // L: 1698
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3436 : 0; // L: 1699
			}

			if (var0 == 2618) { // L: 1701
				var4 = var3.method6119(); // L: 1702
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3437 : 0; // L: 1703
				return 1; // L: 1704
			} else {
				class310 var7;
				if (var0 == 2619) { // L: 1706
					var7 = var3.method6118(); // L: 1707
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5866().method6999() : ""; // L: 1708
					return 1; // L: 1709
				} else if (var0 == 2620) { // L: 1711
					var4 = var3.method6119(); // L: 1712
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3440 : 0; // L: 1713
					return 1; // L: 1714
				} else if (var0 == 2621) { // L: 1716
					var7 = var3.method6118(); // L: 1717
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5876() : 0; // L: 1718
					return 1; // L: 1719
				} else if (var0 == 2622) { // L: 1721
					var7 = var3.method6118(); // L: 1722
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5818() : 0; // L: 1723
					return 1; // L: 1724
				} else if (var0 == 2623) { // L: 1726
					var7 = var3.method6118(); // L: 1727
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5880() : 0; // L: 1728
					return 1; // L: 1729
				} else if (var0 == 2624) { // L: 1731
					var7 = var3.method6118(); // L: 1732
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5955() ? 1 : 0; // L: 1733
					return 1; // L: 1734
				} else if (var0 != 2625) { // L: 1736
					if (var0 == 2626) { // L: 1741
						var7 = var3.method6118(); // L: 1742
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5867().method7244() : ""; // L: 1743
						return 1; // L: 1744
					} else if (var0 == 2627) { // L: 1746
						var7 = var3.method6118(); // L: 1747
						int var5 = var7 != null ? var7.method6029() : 0; // L: 1748
						int var6 = var7 != null ? var7.method5871() : 0; // L: 1749
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1750
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1751
						return 1; // L: 1752
					} else if (var0 == 2628) { // L: 1754
						var7 = var3.method6118(); // L: 1755
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5871() : 0; // L: 1756
						return 1; // L: 1757
					} else if (var0 == 2629) { // L: 1759
						var7 = var3.method6118(); // L: 1760
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5913() : 0; // L: 1761
						return 1; // L: 1762
					} else if (var0 == 2630) { // L: 1764
						var7 = var3.method6118(); // L: 1765
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5879() : 0; // L: 1766
						return 1; // L: 1767
					} else if (var0 == 2631) { // L: 1769
						var7 = var3.method6118(); // L: 1770
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5881() : 0; // L: 1771
						return 1; // L: 1772
					} else if (var0 == 2632) { // L: 1774
						var7 = var3.method6118(); // L: 1775
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method5943() : 0; // L: 1776
						return 1; // L: 1777
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1779
							var8 = var3.method6120(); // L: 1780
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method386(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1781
							return 1; // L: 1782
						} else if (var0 == 2634) { // L: 1784
							var8 = var3.method6120(); // L: 1785
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method387((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1786
							return 1; // L: 1787
						} else {
							return 2; // L: 1789
						}
					}
				} else {
					var7 = var3.method6118(); // L: 1737
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method5933() ? 1 : 0; // L: 1738
					return 1; // L: 1739
				}
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "2103100149"
	)
	static int method5142(int var0, Script var1, boolean var2) {
		return 2; // L: 5211
	}
}
