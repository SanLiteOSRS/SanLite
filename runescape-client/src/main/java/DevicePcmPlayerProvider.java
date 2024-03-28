import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("am")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Font field96;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -181082999
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static class517 field99;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lby;",
		garbageValue = "1"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lig;",
		garbageValue = "99"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 51
		if (var1 != null) { // L: 52
			return var1; // L: 53
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 55
			var1 = new SequenceDefinition(); // L: 56
			if (var2 != null) { // L: 57
				var1.decode(new Buffer(var2)); // L: 58
			}

			var1.postDecode(); // L: 60
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 61
			return var1; // L: 62
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-571645870"
	)
	public static void method290() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 47
	} // L: 48

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-327851457"
	)
	static int method291(int var0, Script var1, boolean var2) {
		Widget var3 = class243.field2620.method6281(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 1708
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1709
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1710
			return 1; // L: 1711
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1713
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1714
			return 1; // L: 1715
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1717
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.text; // L: 1718
			return 1; // L: 1719
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1721
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1722
			return 1; // L: 1723
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1725
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1726
			return 1; // L: 1727
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1729
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1730
			return 1; // L: 1731
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1733
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1734
			return 1; // L: 1735
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1737
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1738
			return 1; // L: 1739
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1741
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1742
			return 1; // L: 1743
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1745
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1746
			return 1; // L: 1747
		} else if (var0 == 2610) { // L: 1749
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1750
			return 1; // L: 1751
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1753
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.color; // L: 1754
			return 1; // L: 1755
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1757
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.color2; // L: 1758
			return 1; // L: 1759
		} else if (var0 == 2613) { // L: 1761
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1762
			return 1; // L: 1763
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1765
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1766
			return 1; // L: 1767
		} else {
			class341 var4;
			if (var0 == 2617) { // L: 1769
				var4 = var3.method6699(); // L: 1770
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3655 : 0; // L: 1771
			}

			if (var0 == 2618) { // L: 1773
				var4 = var3.method6699(); // L: 1774
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3656 : 0; // L: 1775
				return 1; // L: 1776
			} else {
				class347 var7;
				if (var0 == 2619) { // L: 1778
					var7 = var3.method6667(); // L: 1779
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6413().method7539() : ""; // L: 1780
					return 1; // L: 1781
				} else if (var0 == 2620) { // L: 1783
					var4 = var3.method6699(); // L: 1784
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4 != null ? var4.field3657 : 0; // L: 1785
					return 1; // L: 1786
				} else if (var0 == 2621) { // L: 1788
					var7 = var3.method6667(); // L: 1789
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0; // L: 1790
					return 1; // L: 1791
				} else if (var0 == 2622) { // L: 1793
					var7 = var3.method6667(); // L: 1794
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0; // L: 1795
					return 1; // L: 1796
				} else if (var0 == 2623) { // L: 1798
					var7 = var3.method6667(); // L: 1799
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0; // L: 1800
					return 1; // L: 1801
				} else if (var0 == 2624) { // L: 1803
					var7 = var3.method6667(); // L: 1804
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null && var7.method6459() ? 1 : 0; // L: 1805
					return 1; // L: 1806
				} else if (var0 != 2625) { // L: 1808
					if (var0 == 2626) { // L: 1813
						var7 = var3.method6667(); // L: 1814
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6431().method7763() : ""; // L: 1815
						return 1; // L: 1816
					} else if (var0 == 2627) { // L: 1818
						var7 = var3.method6667(); // L: 1819
						int var5 = var7 != null ? var7.method6559() : 0; // L: 1820
						int var6 = var7 != null ? var7.method6510() : 0; // L: 1821
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1822
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1823
						return 1; // L: 1824
					} else if (var0 == 2628) { // L: 1826
						var7 = var3.method6667(); // L: 1827
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6510() : 0; // L: 1828
						return 1; // L: 1829
					} else if (var0 == 2629) { // L: 1831
						var7 = var3.method6667(); // L: 1832
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6427() : 0; // L: 1833
						return 1; // L: 1834
					} else if (var0 == 2630) { // L: 1836
						var7 = var3.method6667(); // L: 1837
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6574() : 0; // L: 1838
						return 1; // L: 1839
					} else if (var0 == 2631) { // L: 1841
						var7 = var3.method6667(); // L: 1842
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6428() : 0; // L: 1843
						return 1; // L: 1844
					} else if (var0 == 2632) { // L: 1846
						var7 = var3.method6667(); // L: 1847
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null ? var7.method6429() : 0; // L: 1848
						return 1; // L: 1849
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1851
							var8 = var3.method6682(); // L: 1852
							Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]) : 0; // L: 1853
							return 1; // L: 1854
						} else if (var0 == 2634) { // L: 1856
							var8 = var3.method6682(); // L: 1857
							Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1] = var8 != null ? var8.method379((char)Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize - 1]) : 0; // L: 1858
							return 1; // L: 1859
						} else {
							return 2; // L: 1861
						}
					}
				} else {
					var7 = var3.method6667(); // L: 1809
					Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var7 != null && var7.method6416() ? 1 : 0; // L: 1810
					return 1; // L: 1811
				}
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1047926071"
	)
	static int method293(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4464
			Client.logoutTimer = 250; // L: 4465
			return 1; // L: 4466
		} else {
			return 2; // L: 4468
		}
	}
}
