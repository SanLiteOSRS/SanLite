import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oh")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -1761752697
	)
	static int field4355;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2024960841
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("data")
	byte[] data;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	} // L: 12

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Luy;",
		garbageValue = "-1626069325"
	)
	@Export("FillMode_values")
	public static class545[] FillMode_values() {
		return new class545[]{class545.SOLID, class545.field5284, class545.field5283}; // L: 15
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "0"
	)
	static int method7035(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1706
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1707
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1708
			return 1; // L: 1709
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1711
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1712
			return 1; // L: 1713
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1715
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.text; // L: 1716
			return 1; // L: 1717
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1719
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1720
			return 1; // L: 1721
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1723
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1724
			return 1; // L: 1725
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1727
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1728
			return 1; // L: 1729
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1731
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1732
			return 1; // L: 1733
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1735
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1736
			return 1; // L: 1737
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1739
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1740
			return 1; // L: 1741
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1743
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1744
			return 1; // L: 1745
		} else if (var0 == 2610) { // L: 1747
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1748
			return 1; // L: 1749
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1751
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1752
			return 1; // L: 1753
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1755
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1756
			return 1; // L: 1757
		} else if (var0 == 2613) { // L: 1759
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1760
			return 1; // L: 1761
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1763
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1764
			return 1; // L: 1765
		} else {
			class341 var4;
			if (var0 == 2617) { // L: 1767
				var4 = var3.method6823(); // L: 1768
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3643 : 0; // L: 1769
			}

			if (var0 == 2618) { // L: 1771
				var4 = var3.method6823(); // L: 1772
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3639 : 0; // L: 1773
				return 1; // L: 1774
			} else {
				class347 var7;
				if (var0 == 2619) { // L: 1776
					var7 = var3.method6806(); // L: 1777
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6711().method7754() : ""; // L: 1778
					return 1; // L: 1779
				} else if (var0 == 2620) { // L: 1781
					var4 = var3.method6823(); // L: 1782
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3640 : 0; // L: 1783
					return 1; // L: 1784
				} else if (var0 == 2621) { // L: 1786
					var7 = var3.method6806(); // L: 1787
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6565() : 0; // L: 1788
					return 1; // L: 1789
				} else if (var0 == 2622) { // L: 1791
					var7 = var3.method6806(); // L: 1792
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0; // L: 1793
					return 1; // L: 1794
				} else if (var0 == 2623) { // L: 1796
					var7 = var3.method6806(); // L: 1797
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6623() : 0; // L: 1798
					return 1; // L: 1799
				} else if (var0 == 2624) { // L: 1801
					var7 = var3.method6806(); // L: 1802
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6557() ? 1 : 0; // L: 1803
					return 1; // L: 1804
				} else if (var0 != 2625) { // L: 1806
					if (var0 == 2626) { // L: 1811
						var7 = var3.method6806(); // L: 1812
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6556().method7960() : ""; // L: 1813
						return 1; // L: 1814
					} else if (var0 == 2627) { // L: 1816
						var7 = var3.method6806(); // L: 1817
						int var5 = var7 != null ? var7.method6561() : 0; // L: 1818
						int var6 = var7 != null ? var7.method6560() : 0; // L: 1819
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1820
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1821
						return 1; // L: 1822
					} else if (var0 == 2628) { // L: 1824
						var7 = var3.method6806(); // L: 1825
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6560() : 0; // L: 1826
						return 1; // L: 1827
					} else if (var0 == 2629) { // L: 1829
						var7 = var3.method6806(); // L: 1830
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6569() : 0; // L: 1831
						return 1; // L: 1832
					} else if (var0 == 2630) { // L: 1834
						var7 = var3.method6806(); // L: 1835
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6568() : 0; // L: 1836
						return 1; // L: 1837
					} else if (var0 == 2631) { // L: 1839
						var7 = var3.method6806(); // L: 1840
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6570() : 0; // L: 1841
						return 1; // L: 1842
					} else if (var0 == 2632) { // L: 1844
						var7 = var3.method6806(); // L: 1845
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6636() : 0; // L: 1846
						return 1; // L: 1847
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1849
							var8 = var3.method6825(); // L: 1850
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method361(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1851
							return 1; // L: 1852
						} else if (var0 == 2634) { // L: 1854
							var8 = var3.method6825(); // L: 1855
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method362((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0; // L: 1856
							return 1; // L: 1857
						} else {
							return 2; // L: 1859
						}
					}
				} else {
					var7 = var3.method6806(); // L: 1807
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6558() ? 1 : 0; // L: 1808
					return 1; // L: 1809
				}
			}
		}
	}
}
