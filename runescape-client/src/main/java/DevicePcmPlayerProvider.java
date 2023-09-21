import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("az")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -188330611
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("az")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)Lbu;",
		garbageValue = "25906"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2139426983"
	)
	static final boolean method313(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 36
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FB)F",
		garbageValue = "-61"
	)
	static float method311(class132 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1543; // L: 204
			return var2 * (var2 * (var0.field1546 + var2 * var0.field1545) + var0.field1538) + var0.field1542;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lcv;Lcv;IZIZI)I",
		garbageValue = "-1939338222"
	)
	static int method312(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class64.compareWorlds(var0, var1, var2, var3); // L: 200
		if (var6 != 0) { // L: 201
			return var3 ? -var6 : var6; // L: 202
		} else if (var4 == -1) { // L: 205
			return 0;
		} else {
			int var7 = class64.compareWorlds(var0, var1, var4, var5); // L: 206
			return var5 ? -var7 : var7; // L: 207
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lcv;",
		garbageValue = "-784805347"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? UserComparator3.World_worlds[++World.World_listCount - 1] : null; // L: 243 244
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "124"
	)
	static int method307(int var0, Script var1, boolean var2) {
		Widget var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1676
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1677
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1678
			return 1; // L: 1679
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1681
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1682
			return 1; // L: 1683
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1685
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.text; // L: 1686
			return 1; // L: 1687
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1689
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1690
			return 1; // L: 1691
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1693
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1694
			return 1; // L: 1695
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1697
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1698
			return 1; // L: 1699
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1701
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1702
			return 1; // L: 1703
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1705
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1706
			return 1; // L: 1707
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1709
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1710
			return 1; // L: 1711
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1713
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1714
			return 1; // L: 1715
		} else if (var0 == 2610) { // L: 1717
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1718
			return 1; // L: 1719
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1721
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1722
			return 1; // L: 1723
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1725
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1726
			return 1; // L: 1727
		} else if (var0 == 2613) { // L: 1729
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1730
			return 1; // L: 1731
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1733
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1734
			return 1; // L: 1735
		} else {
			class339 var4;
			if (var0 == 2617) { // L: 1737
				var4 = var3.method6615(); // L: 1738
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3591 : 0; // L: 1739
			}

			if (var0 == 2618) { // L: 1741
				var4 = var3.method6615(); // L: 1742
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3592 : 0; // L: 1743
				return 1; // L: 1744
			} else {
				class344 var7;
				if (var0 == 2619) { // L: 1746
					var7 = var3.method6614(); // L: 1747
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6353().method7468() : ""; // L: 1748
					return 1; // L: 1749
				} else if (var0 == 2620) { // L: 1751
					var4 = var3.method6615(); // L: 1752
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3593 : 0; // L: 1753
					return 1; // L: 1754
				} else if (var0 == 2621) { // L: 1756
					var7 = var3.method6614(); // L: 1757
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6523() : 0; // L: 1758
					return 1; // L: 1759
				} else if (var0 == 2622) { // L: 1761
					var7 = var3.method6614(); // L: 1762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6364() : 0; // L: 1763
					return 1; // L: 1764
				} else if (var0 == 2623) { // L: 1766
					var7 = var3.method6614(); // L: 1767
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6365() : 0; // L: 1768
					return 1; // L: 1769
				} else if (var0 == 2624) { // L: 1771
					var7 = var3.method6614(); // L: 1772
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6355() ? 1 : 0; // L: 1773
					return 1; // L: 1774
				} else if (var0 != 2625) { // L: 1776
					if (var0 == 2626) { // L: 1781
						var7 = var3.method6614(); // L: 1782
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6354().method7720() : ""; // L: 1783
						return 1; // L: 1784
					} else if (var0 == 2627) { // L: 1786
						var7 = var3.method6614(); // L: 1787
						int var5 = var7 != null ? var7.method6359() : 0; // L: 1788
						int var6 = var7 != null ? var7.method6358() : 0; // L: 1789
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1790
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1791
						return 1; // L: 1792
					} else if (var0 == 2628) { // L: 1794
						var7 = var3.method6614(); // L: 1795
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6358() : 0; // L: 1796
						return 1; // L: 1797
					} else if (var0 == 2629) { // L: 1799
						var7 = var3.method6614(); // L: 1800
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6367() : 0; // L: 1801
						return 1; // L: 1802
					} else if (var0 == 2630) { // L: 1804
						var7 = var3.method6614(); // L: 1805
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6302() : 0; // L: 1806
						return 1; // L: 1807
					} else if (var0 == 2631) { // L: 1809
						var7 = var3.method6614(); // L: 1810
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6368() : 0; // L: 1811
						return 1; // L: 1812
					} else if (var0 == 2632) { // L: 1814
						var7 = var3.method6614(); // L: 1815
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6372() : 0; // L: 1816
						return 1; // L: 1817
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1819
							var8 = var3.method6591(); // L: 1820
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method374(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1821
							return 1; // L: 1822
						} else if (var0 == 2634) { // L: 1824
							var8 = var3.method6591(); // L: 1825
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method411((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1826
							return 1; // L: 1827
						} else {
							return 2; // L: 1829
						}
					}
				} else {
					var7 = var3.method6614(); // L: 1777
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6356() ? 1 : 0; // L: 1778
					return 1; // L: 1779
				}
			}
		}
	}
}
