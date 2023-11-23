import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
public class class60 {
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static PlatformInfo field419;
	@ObfuscatedName("ab")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static SpritePixels[] field420;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1679036351
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 648627473
	)
	static int field421;
	@ObfuscatedName("at")
	byte[] field415;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 443246467
	)
	int field416;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 99305115
	)
	int field417;

	class60() {
		this.field415 = null; // L: 4
		this.field416 = 0; // L: 5
		this.field417 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1826933410"
	)
	int method1187(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field417; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field417; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field415[this.field416] >> this.field417 & var5) << var3; // L: 16
			this.field417 = 0; // L: 17
			++this.field416; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field415[this.field416] >> this.field417 & var4) << var3; // L: 24
			this.field417 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	int method1188() {
		int var1 = this.field415[this.field416] >> this.field417 & 1; // L: 31
		++this.field417; // L: 32
		this.field416 += this.field417 >> 3; // L: 33
		this.field417 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-31"
	)
	void method1189(byte[] var1, int var2) {
		this.field415 = var1; // L: 39
		this.field416 = var2; // L: 40
		this.field417 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "3"
	)
	static int method1190(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarDefinition.field1877.method6285(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 1675
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1676
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1677
			return 1; // L: 1678
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1680
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1681
			return 1; // L: 1682
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1684
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.text; // L: 1685
			return 1; // L: 1686
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1688
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1689
			return 1; // L: 1690
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1692
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1693
			return 1; // L: 1694
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1696
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1697
			return 1; // L: 1698
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1700
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1701
			return 1; // L: 1702
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1704
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1705
			return 1; // L: 1706
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1708
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1709
			return 1; // L: 1710
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1712
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1713
			return 1; // L: 1714
		} else if (var0 == 2610) { // L: 1716
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1717
			return 1; // L: 1718
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1720
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.color; // L: 1721
			return 1; // L: 1722
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1724
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.color2; // L: 1725
			return 1; // L: 1726
		} else if (var0 == 2613) { // L: 1728
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1729
			return 1; // L: 1730
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1732
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1733
			return 1; // L: 1734
		} else {
			class336 var4;
			if (var0 == 2617) { // L: 1736
				var4 = var3.method6724(); // L: 1737
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3580 : 0; // L: 1738
			}

			if (var0 == 2618) { // L: 1740
				var4 = var3.method6724(); // L: 1741
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3578 : 0; // L: 1742
				return 1; // L: 1743
			} else {
				class341 var7;
				if (var0 == 2619) { // L: 1745
					var7 = var3.method6688(); // L: 1746
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6644().method7523() : ""; // L: 1747
					return 1; // L: 1748
				} else if (var0 == 2620) { // L: 1750
					var4 = var3.method6724(); // L: 1751
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4 != null ? var4.field3579 : 0; // L: 1752
					return 1; // L: 1753
				} else if (var0 == 2621) { // L: 1755
					var7 = var3.method6688(); // L: 1756
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6420() : 0; // L: 1757
					return 1; // L: 1758
				} else if (var0 == 2622) { // L: 1760
					var7 = var3.method6688(); // L: 1761
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6628() : 0; // L: 1762
					return 1; // L: 1763
				} else if (var0 == 2623) { // L: 1765
					var7 = var3.method6688(); // L: 1766
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6630() : 0; // L: 1767
					return 1; // L: 1768
				} else if (var0 == 2624) { // L: 1770
					var7 = var3.method6688(); // L: 1771
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null && var7.method6640() ? 1 : 0; // L: 1772
					return 1; // L: 1773
				} else if (var0 != 2625) { // L: 1775
					if (var0 == 2626) { // L: 1780
						var7 = var3.method6688(); // L: 1781
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6609().method7775() : ""; // L: 1782
						return 1; // L: 1783
					} else if (var0 == 2627) { // L: 1785
						var7 = var3.method6688(); // L: 1786
						int var5 = var7 != null ? var7.method6416() : 0; // L: 1787
						int var6 = var7 != null ? var7.method6415() : 0; // L: 1788
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1789
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1790
						return 1; // L: 1791
					} else if (var0 == 2628) { // L: 1793
						var7 = var3.method6688(); // L: 1794
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6415() : 0; // L: 1795
						return 1; // L: 1796
					} else if (var0 == 2629) { // L: 1798
						var7 = var3.method6688(); // L: 1799
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0; // L: 1800
						return 1; // L: 1801
					} else if (var0 == 2630) { // L: 1803
						var7 = var3.method6688(); // L: 1804
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0; // L: 1805
						return 1; // L: 1806
					} else if (var0 == 2631) { // L: 1808
						var7 = var3.method6688(); // L: 1809
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0; // L: 1810
						return 1; // L: 1811
					} else if (var0 == 2632) { // L: 1813
						var7 = var3.method6688(); // L: 1814
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null ? var7.method6550() : 0; // L: 1815
						return 1; // L: 1816
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1818
							var8 = var3.method6690(); // L: 1819
							Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = var8 != null ? var8.method407(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]) : 0; // L: 1820
							return 1; // L: 1821
						} else if (var0 == 2634) { // L: 1823
							var8 = var3.method6690(); // L: 1824
							Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1] = var8 != null ? var8.method414((char)Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize - 1]) : 0; // L: 1825
							return 1; // L: 1826
						} else {
							return 2; // L: 1828
						}
					}
				} else {
					var7 = var3.method6688(); // L: 1776
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var7 != null && var7.method6409() ? 1 : 0; // L: 1777
					return 1; // L: 1778
				}
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-128"
	)
	static final boolean method1186() {
		return Client.isMenuOpen; // L: 9321
	}
}
