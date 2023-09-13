import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pb")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1270229297
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 261560463
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 928925253
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1819715831
	)
	static int field4547;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -128382617
	)
	static int field4542;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1836471235
	)
	static int field4549;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1802976855
	)
	static int field4543;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1478646587
	)
	static int field4551;
	@ObfuscatedName("al")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("ab")
	static byte[][] field4555;
	@ObfuscatedName("ah")
	static ArrayList field4550;

	static {
		ByteArrayPool_smallCount = 0; // L: 13
		ByteArrayPool_mediumCount = 0; // L: 14
		ByteArrayPool_largeCount = 0; // L: 15
		field4547 = 0; // L: 16
		field4542 = 1000; // L: 17
		field4549 = 250; // L: 18
		field4543 = 100; // L: 19
		field4551 = 50; // L: 20
		ByteArrayPool_small = new byte[1000][]; // L: 21
		ByteArrayPool_medium = new byte[250][]; // L: 22
		ByteArrayPool_large = new byte[100][]; // L: 23
		field4555 = new byte[50][]; // L: 24
		field4550 = new ArrayList(); // L: 28
		class101.method2641(); // L: 31
		new HashMap();
	} // L: 36

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1767173651"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) { // L: 70
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount]; // L: 71
			ByteArrayPool_small[ByteArrayPool_smallCount] = null; // L: 72
			return var4; // L: 73
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) { // L: 75
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount]; // L: 76
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null; // L: 77
			return var4; // L: 78
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) { // L: 80
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount]; // L: 81
			ByteArrayPool_large[ByteArrayPool_largeCount] = null; // L: 82
			return var4; // L: 83
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4547 > 0) { // L: 85
			var4 = field4555[--field4547]; // L: 86
			field4555[field4547] = null; // L: 87
			return var4; // L: 88
		} else {
			int var2;
			if (class410.ByteArrayPool_arrays != null) { // L: 90
				for (var2 = 0; var2 < class416.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 91
					if ((class416.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class416.ByteArrayPool_alternativeSizes[var2] && var1) && StructComposition.ByteArrayPool_altSizeArrayCounts[var2] > 0) { // L: 92
						byte[] var3 = class410.ByteArrayPool_arrays[var2][--StructComposition.ByteArrayPool_altSizeArrayCounts[var2]]; // L: 93
						class410.ByteArrayPool_arrays[var2][StructComposition.ByteArrayPool_altSizeArrayCounts[var2]] = null; // L: 94
						return var3; // L: 95
					}
				}
			}

			if (var1 && class416.ByteArrayPool_alternativeSizes != null) { // L: 99 100
				for (var2 = 0; var2 < class416.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 101
					if (var0 <= class416.ByteArrayPool_alternativeSizes[var2] && StructComposition.ByteArrayPool_altSizeArrayCounts[var2] < class410.ByteArrayPool_arrays[var2].length) { // L: 102
						return new byte[class416.ByteArrayPool_alternativeSizes[var2]]; // L: 103
					}
				}
			}

			return new byte[var0]; // L: 108
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-8"
	)
	static void method7671() {
		Iterator var0 = class305.field3404.iterator(); // L: 203

		while (true) {
			class317 var1;
			do {
				if (!var0.hasNext()) {
					class305.field3404.clear(); // L: 225
					return; // L: 226
				}

				var1 = (class317)var0.next(); // L: 204
			} while(var1 == null); // L: 206

			var1.field3517.clear(); // L: 209
			var1.field3517.removeAll(); // L: 210
			var1.field3517.setPcmStreamVolume(0); // L: 211
			var1.field3517.field3443 = 0; // L: 212
			int var2 = var1.field3511; // L: 213
			int var3 = var1.field3512; // L: 214
			Iterator var4 = class305.field3407.iterator(); // L: 216

			while (var4.hasNext()) {
				class311 var5 = (class311)var4.next(); // L: 217
				var5.vmethod5967(var2, var3); // L: 219
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-2055623953"
	)
	static int method7681(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 1665
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1666
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1667
			return 1; // L: 1668
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1670
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1671
			return 1; // L: 1672
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1674
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.text; // L: 1675
			return 1; // L: 1676
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1678
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1679
			return 1; // L: 1680
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1682
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1683
			return 1; // L: 1684
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1686
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1687
			return 1; // L: 1688
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1690
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1691
			return 1; // L: 1692
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1694
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1695
			return 1; // L: 1696
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1698
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1699
			return 1; // L: 1700
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1702
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1703
			return 1; // L: 1704
		} else if (var0 == 2610) { // L: 1706
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1707
			return 1; // L: 1708
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1710
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color; // L: 1711
			return 1; // L: 1712
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1714
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.color2; // L: 1715
			return 1; // L: 1716
		} else if (var0 == 2613) { // L: 1718
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1719
			return 1; // L: 1720
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1722
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1723
			return 1; // L: 1724
		} else {
			class324 var4;
			if (var0 == 2617) { // L: 1726
				var4 = var3.method6416(); // L: 1727
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3547 : 0; // L: 1728
			}

			if (var0 == 2618) { // L: 1730
				var4 = var3.method6416(); // L: 1731
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3548 : 0; // L: 1732
				return 1; // L: 1733
			} else {
				class329 var7;
				if (var0 == 2619) { // L: 1735
					var7 = var3.method6532(); // L: 1736
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6155().method7282() : ""; // L: 1737
					return 1; // L: 1738
				} else if (var0 == 2620) { // L: 1740
					var4 = var3.method6416(); // L: 1741
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4 != null ? var4.field3549 : 0; // L: 1742
					return 1; // L: 1743
				} else if (var0 == 2621) { // L: 1745
					var7 = var3.method6532(); // L: 1746
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6326() : 0; // L: 1747
					return 1; // L: 1748
				} else if (var0 == 2622) { // L: 1750
					var7 = var3.method6532(); // L: 1751
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6298() : 0; // L: 1752
					return 1; // L: 1753
				} else if (var0 == 2623) { // L: 1755
					var7 = var3.method6532(); // L: 1756
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6362() : 0; // L: 1757
					return 1; // L: 1758
				} else if (var0 == 2624) { // L: 1760
					var7 = var3.method6532(); // L: 1761
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6157() ? 1 : 0; // L: 1762
					return 1; // L: 1763
				} else if (var0 != 2625) { // L: 1765
					if (var0 == 2626) { // L: 1770
						var7 = var3.method6532(); // L: 1771
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6120().method7542() : ""; // L: 1772
						return 1; // L: 1773
					} else if (var0 == 2627) { // L: 1775
						var7 = var3.method6532(); // L: 1776
						int var5 = var7 != null ? var7.method6161() : 0; // L: 1777
						int var6 = var7 != null ? var7.method6160() : 0; // L: 1778
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1779
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1780
						return 1; // L: 1781
					} else if (var0 == 2628) { // L: 1783
						var7 = var3.method6532(); // L: 1784
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6160() : 0; // L: 1785
						return 1; // L: 1786
					} else if (var0 == 2629) { // L: 1788
						var7 = var3.method6532(); // L: 1789
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6123() : 0; // L: 1790
						return 1; // L: 1791
					} else if (var0 == 2630) { // L: 1793
						var7 = var3.method6532(); // L: 1794
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6168() : 0; // L: 1795
						return 1; // L: 1796
					} else if (var0 == 2631) { // L: 1798
						var7 = var3.method6532(); // L: 1799
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6261() : 0; // L: 1800
						return 1; // L: 1801
					} else if (var0 == 2632) { // L: 1803
						var7 = var3.method6532(); // L: 1804
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null ? var7.method6114() : 0; // L: 1805
						return 1; // L: 1806
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1808
							var8 = var3.method6401(); // L: 1809
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method389(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0; // L: 1810
							return 1; // L: 1811
						} else if (var0 == 2634) { // L: 1813
							var8 = var3.method6401(); // L: 1814
							Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]) : 0; // L: 1815
							return 1; // L: 1816
						} else {
							return 2; // L: 1818
						}
					}
				} else {
					var7 = var3.method6532(); // L: 1766
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7 != null && var7.method6158() ? 1 : 0; // L: 1767
					return 1; // L: 1768
				}
			}
		}
	}
}
