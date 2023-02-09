import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gq")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("vc")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("v")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("s")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("z")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1053984563
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1265657645
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("n")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("l")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("k")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	EnumComposition() {
		this.defaultStr = "null"; // L: 15
		this.outputCount = 0; // L: 17
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2126248770"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 40
			if (var2 == 0) { // L: 41
				return; // L: 44
			}

			this.decodeNext(var1, var2); // L: 42
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-225365971"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 47
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) { // L: 48
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 49
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) { // L: 50
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) { // L: 51
				this.outputCount = var1.readUnsignedShort(); // L: 52
				this.keys = new int[this.outputCount]; // L: 53
				this.strVals = new String[this.outputCount]; // L: 54

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 55
					this.keys[var3] = var1.readInt(); // L: 56
					this.strVals[var3] = var1.readStringCp1252NullTerminated(); // L: 57
				}
			} else if (var2 == 6) { // L: 60
				this.outputCount = var1.readUnsignedShort(); // L: 61
				this.keys = new int[this.outputCount]; // L: 62
				this.intVals = new int[this.outputCount]; // L: 63

				for (var3 = 0; var3 < this.outputCount; ++var3) { // L: 64
					this.keys[var3] = var1.readInt(); // L: 65
					this.intVals[var3] = var1.readInt(); // L: 66
				}
			}
		}

	} // L: 70

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "59"
	)
	@Export("size")
	public int size() {
		return this.outputCount; // L: 73
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1103882701"
	)
	static int method3711(int var0, Script var1, boolean var2) {
		Widget var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1632
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1633
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1634
			return 1; // L: 1635
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1637
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1641
			Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var3.text; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1645
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1649
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1653
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1654
			return 1; // L: 1655
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1657
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1658
			return 1; // L: 1659
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1661
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1662
			return 1; // L: 1663
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1665
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1666
			return 1; // L: 1667
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1669
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1670
			return 1; // L: 1671
		} else if (var0 == 2610) { // L: 1673
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1674
			return 1; // L: 1675
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1677
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color; // L: 1678
			return 1; // L: 1679
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1681
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.color2; // L: 1682
			return 1; // L: 1683
		} else if (var0 == 2613) { // L: 1685
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1686
			return 1; // L: 1687
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1689
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1690
			return 1; // L: 1691
		} else {
			class302 var4;
			if (var0 == 2617) { // L: 1693
				var4 = var3.method6226(); // L: 1694
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3465 : 0; // L: 1695
			}

			if (var0 == 2618) { // L: 1697
				var4 = var3.method6226(); // L: 1698
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3470 : 0; // L: 1699
				return 1; // L: 1700
			} else {
				class307 var7;
				if (var0 == 2619) { // L: 1702
					var7 = var3.method6235(); // L: 1703
					Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6128().method7078() : ""; // L: 1704
					return 1; // L: 1705
				} else if (var0 == 2620) { // L: 1707
					var4 = var3.method6226(); // L: 1708
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4 != null ? var4.field3467 : 0; // L: 1709
					return 1; // L: 1710
				} else if (var0 == 2621) { // L: 1712
					var7 = var3.method6235(); // L: 1713
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5950() : 0; // L: 1714
					return 1; // L: 1715
				} else if (var0 == 2622) { // L: 1717
					var7 = var3.method6235(); // L: 1718
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5983() : 0; // L: 1719
					return 1; // L: 1720
				} else if (var0 == 2623) { // L: 1722
					var7 = var3.method6235(); // L: 1723
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5984() : 0; // L: 1724
					return 1; // L: 1725
				} else if (var0 == 2624) { // L: 1727
					var7 = var3.method6235(); // L: 1728
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5974() ? 1 : 0; // L: 1729
					return 1; // L: 1730
				} else if (var0 != 2625) { // L: 1732
					if (var0 == 2626) { // L: 1737
						var7 = var3.method6235(); // L: 1738
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5973().method7307() : ""; // L: 1739
						return 1; // L: 1740
					} else if (var0 == 2627) { // L: 1742
						var7 = var3.method6235(); // L: 1743
						int var5 = var7 != null ? var7.method5978() : 0; // L: 1744
						int var6 = var7 != null ? var7.method6145() : 0; // L: 1745
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1746
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1747
						return 1; // L: 1748
					} else if (var0 == 2628) { // L: 1750
						var7 = var3.method6235(); // L: 1751
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6145() : 0; // L: 1752
						return 1; // L: 1753
					} else if (var0 == 2629) { // L: 1755
						var7 = var3.method6235(); // L: 1756
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5985() : 0; // L: 1757
						return 1; // L: 1758
					} else if (var0 == 2630) { // L: 1760
						var7 = var3.method6235(); // L: 1761
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5948() : 0; // L: 1762
						return 1; // L: 1763
					} else if (var0 == 2631) { // L: 1765
						var7 = var3.method6235(); // L: 1766
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method6058() : 0; // L: 1767
						return 1; // L: 1768
					} else if (var0 == 2632) { // L: 1770
						var7 = var3.method6235(); // L: 1771
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null ? var7.method5987() : 0; // L: 1772
						return 1; // L: 1773
					} else {
						class27 var8;
						if (var0 == 2633) { // L: 1775
							var8 = var3.method6227(); // L: 1776
							Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0; // L: 1777
							return 1; // L: 1778
						} else if (var0 == 2634) { // L: 1780
							var8 = var3.method6227(); // L: 1781
							Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1] = var8 != null ? var8.method394((char)Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize - 1]) : 0; // L: 1782
							return 1; // L: 1783
						} else {
							return 2; // L: 1785
						}
					}
				} else {
					var7 = var3.method6235(); // L: 1733
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var7 != null && var7.method5954() ? 1 : 0; // L: 1734
					return 1; // L: 1735
				}
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1234070189"
	)
	static boolean method3710(int var0) {
		for (int var1 = 0; var1 < Client.field759; ++var1) { // L: 12415
			if (Client.field745[var1] == var0) { // L: 12416
				return true;
			}
		}

		return false; // L: 12418
	}
}
