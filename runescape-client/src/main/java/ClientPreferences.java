import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1005751115
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("c")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("x")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("h")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("j")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1431338983
	)
	int field1246;
	@ObfuscatedName("d")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 358361133
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1349772247
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1070223507
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -264461083
	)
	int field1249;
	@ObfuscatedName("p")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1315476699
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("o")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10; // L: 11
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1249 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2376(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1249 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) { // L: 32
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 37
				if (var1.readUnsignedByte() == 1) { // L: 41
					this.roofsHidden = true; // L: 42
				}

				if (var2 > 1) { // L: 44
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 45
				}

				if (var2 > 3) { // L: 47
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) { // L: 50
					int var3 = var1.readUnsignedByte(); // L: 51

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt(); // L: 53
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6); // L: 55
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 59
				}

				if (var2 > 5) { // L: 61
					this.hideUsername = var1.readBoolean(); // L: 62
				}

				if (var2 > 6) { // L: 64
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 65
					this.musicVolume = var1.readUnsignedByte(); // L: 66
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 67
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 68
				}

				if (var2 > 7) { // L: 70
					this.field1249 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1246 = var1.readInt(); // L: 77
				}
			} else {
				this.method2376(true); // L: 38
			}
		} else {
			this.method2376(true); // L: 33
		}

	} // L: 81

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "127"
	)
	void method2376(boolean var1) {
	} // L: 83

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "-121"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 86
		var1.writeByte(ClientPreferences_optionCount); // L: 87
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 88
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 89
		var1.writeByte(this.windowMode); // L: 90
		var1.writeByte(this.parameters.size()); // L: 91
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 92

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 93
			var1.writeInt((Integer)var3.getKey()); // L: 95
			var1.writeInt((Integer)var3.getValue()); // L: 96
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 99
		var1.writeBoolean(this.hideUsername); // L: 100
		var1.writeByte((int)(100.0D * this.brightness)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1249); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1246); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-14"
	)
	void method2378(boolean var1) {
		this.roofsHidden = var1; // L: 128
		class149.savePreferences(); // L: 129
	} // L: 130

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2135615375"
	)
	boolean method2452() {
		return this.roofsHidden; // L: 133
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "846549147"
	)
	void method2430(boolean var1) {
		this.hideUsername = var1; // L: 137
		class149.savePreferences(); // L: 138
	} // L: 139

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1401725851"
	)
	boolean method2381() {
		return this.hideUsername; // L: 142
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1347587891"
	)
	void method2382(boolean var1) {
		this.titleMusicDisabled = var1; // L: 146
		class149.savePreferences(); // L: 147
	} // L: 148

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1832425119"
	)
	boolean method2383() {
		return this.titleMusicDisabled; // L: 151
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1070053753"
	)
	void method2384(boolean var1) {
		this.displayFps = var1; // L: 155
		class149.savePreferences(); // L: 156
	} // L: 157

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	void method2434() {
		this.method2384(!this.displayFps); // L: 160
	} // L: 161

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	boolean method2386() {
		return this.displayFps; // L: 164
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2066217756"
	)
	void method2387(int var1) {
		this.field1246 = var1; // L: 168
		class149.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	int method2441() {
		return this.field1246; // L: 173
	}

	@ObfuscatedName("o")
	void method2389(double var1) {
		this.brightness = var1; // L: 177
		class149.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "362060040"
	)
	double method2392() {
		return this.brightness; // L: 182
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1795867144"
	)
	void method2390(int var1) {
		this.musicVolume = var1; // L: 186
		class149.savePreferences(); // L: 187
	} // L: 188

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-66"
	)
	int method2391() {
		return this.musicVolume; // L: 191
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1159214815"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 195
		class149.savePreferences(); // L: 196
	} // L: 197

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-14621432"
	)
	int method2427() {
		return this.soundEffectsVolume; // L: 200
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1149761993"
	)
	void method2394(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 204
		class149.savePreferences(); // L: 205
	} // L: 206

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	int method2411() {
		return this.areaSoundEffectsVolume; // L: 209
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1394488385"
	)
	void method2385(String var1) {
		this.rememberedUsername = var1; // L: 213
		class149.savePreferences(); // L: 214
	} // L: 215

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "4134"
	)
	String method2397() {
		return this.rememberedUsername; // L: 218
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	void method2398(int var1) {
		this.field1249 = var1; // L: 222
		class149.savePreferences(); // L: 223
	} // L: 224

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	int method2472() {
		return this.field1249; // L: 227
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "568981163"
	)
	void method2453(int var1) {
		this.windowMode = var1; // L: 231
		class149.savePreferences(); // L: 232
	} // L: 233

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2131481267"
	)
	int method2401() {
		return this.windowMode; // L: 236
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1848789338"
	)
	static int method2471(int var0, Script var1, boolean var2) {
		Widget var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1640
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1641
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1645
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1649
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.text; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1653
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1654
			return 1; // L: 1655
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1657
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1658
			return 1; // L: 1659
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1661
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1662
			return 1; // L: 1663
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1665
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1666
			return 1; // L: 1667
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1669
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1670
			return 1; // L: 1671
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1673
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1674
			return 1; // L: 1675
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1677
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1678
			return 1; // L: 1679
		} else if (var0 == 2610) { // L: 1681
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1682
			return 1; // L: 1683
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1685
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color; // L: 1686
			return 1; // L: 1687
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1689
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.color2; // L: 1690
			return 1; // L: 1691
		} else if (var0 == 2613) { // L: 1693
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1694
			return 1; // L: 1695
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1697
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1698
			return 1; // L: 1699
		} else {
			class295 var4;
			if (var0 == 2617) { // L: 1701
				var4 = var3.method6153(); // L: 1702
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3399 : 0; // L: 1703
			}

			if (var0 == 2618) { // L: 1705
				var4 = var3.method6153(); // L: 1706
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3401 : 0; // L: 1707
				return 1; // L: 1708
			} else {
				class300 var7;
				if (var0 == 2619) { // L: 1710
					var7 = var3.method6076(); // L: 1711
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5816().method6880() : ""; // L: 1712
					return 1; // L: 1713
				} else if (var0 == 2620) { // L: 1715
					var4 = var3.method6153(); // L: 1716
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 != null ? var4.field3400 : 0; // L: 1717
					return 1; // L: 1718
				} else if (var0 == 2621) { // L: 1720
					var7 = var3.method6076(); // L: 1721
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5826() : 0; // L: 1722
					return 1; // L: 1723
				} else if (var0 == 2622) { // L: 1725
					var7 = var3.method6076(); // L: 1726
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5827() : 0; // L: 1727
					return 1; // L: 1728
				} else if (var0 == 2623) { // L: 1730
					var7 = var3.method6076(); // L: 1731
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5828() : 0; // L: 1732
					return 1; // L: 1733
				} else if (var0 == 2624) { // L: 1735
					var7 = var3.method6076(); // L: 1736
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5800() ? 1 : 0; // L: 1737
					return 1; // L: 1738
				} else if (var0 != 2625) { // L: 1740
					if (var0 == 2626) { // L: 1745
						var7 = var3.method6076(); // L: 1746
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5817().method7116() : ""; // L: 1747
						return 1; // L: 1748
					} else if (var0 == 2627) { // L: 1750
						var7 = var3.method6076(); // L: 1751
						int var5 = var7 != null ? var7.method5898() : 0; // L: 1752
						int var6 = var7 != null ? var7.method5821() : 0; // L: 1753
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.min(var5, var6); // L: 1754
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Math.max(var5, var6); // L: 1755
						return 1; // L: 1756
					} else if (var0 == 2628) { // L: 1758
						var7 = var3.method6076(); // L: 1759
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5821() : 0; // L: 1760
						return 1; // L: 1761
					} else if (var0 == 2629) { // L: 1763
						var7 = var3.method6076(); // L: 1764
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method6030() : 0; // L: 1765
						return 1; // L: 1766
					} else if (var0 == 2630) { // L: 1768
						var7 = var3.method6076(); // L: 1769
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5829() : 0; // L: 1770
						return 1; // L: 1771
					} else if (var0 == 2631) { // L: 1773
						var7 = var3.method6076(); // L: 1774
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5954() : 0; // L: 1775
						return 1; // L: 1776
					} else if (var0 == 2632) { // L: 1778
						var7 = var3.method6076(); // L: 1779
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null ? var7.method5832() : 0; // L: 1780
						return 1; // L: 1781
					} else {
						class28 var8;
						if (var0 == 2633) { // L: 1783
							var8 = var3.method6078(); // L: 1784
							Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method408(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0; // L: 1785
							return 1; // L: 1786
						} else if (var0 == 2634) { // L: 1788
							var8 = var3.method6078(); // L: 1789
							Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]) : 0; // L: 1790
							return 1; // L: 1791
						} else {
							return 2; // L: 1793
						}
					}
				} else {
					var7 = var3.method6076(); // L: 1741
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var7 != null && var7.method5819() ? 1 : 0; // L: 1742
					return 1; // L: 1743
				}
			}
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-480256974"
	)
	static final void method2470(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334; // L: 5555
		if (var8 < 0) { // L: 5556
			var8 = 0;
		} else if (var8 > 100) { // L: 5557
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 5558
		int var7 = var5 * var9 / 256; // L: 5559
		var8 = 2048 - var3 & 2047; // L: 5562
		var9 = 2048 - var4 & 2047; // L: 5563
		int var10 = 0; // L: 5564
		int var11 = 0; // L: 5565
		int var12 = var7; // L: 5566
		int var13;
		int var14;
		int var15;
		if (var8 != 0) { // L: 5567
			var13 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5568
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5569
			var15 = var14 * var11 - var13 * var7 >> 16; // L: 5570
			var12 = var13 * var11 + var7 * var14 >> 16; // L: 5571
			var11 = var15; // L: 5572
		}

		if (var9 != 0) { // L: 5574
			var13 = Rasterizer3D.Rasterizer3D_sine[var9]; // L: 5575
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9]; // L: 5576
			var15 = var14 * var10 + var13 * var12 >> 16; // L: 5577
			var12 = var12 * var14 - var13 * var10 >> 16; // L: 5578
			var10 = var15; // L: 5579
		}

		if (Client.isCameraLocked) { // L: 5581
			SceneTilePaint.field2696 = var0 - var10; // L: 5582
			class103.field1344 = var1 - var11; // L: 5583
			class295.field3402 = var2 - var12; // L: 5584
			Widget.field3636 = var3; // L: 5585
			class31.field171 = var4; // L: 5586
		} else {
			TextureProvider.cameraX = var0 - var10; // L: 5589
			class31.cameraY = var1 - var11; // L: 5590
			class313.cameraZ = var2 - var12; // L: 5591
			class408.cameraPitch = var3; // L: 5592
			WorldMapSection1.cameraYaw = var4; // L: 5593
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class31.oculusOrbFocalPointX >> 7 != class296.localPlayer.x >> 7 || PendingSpawn.oculusOrbFocalPointY >> 7 != class296.localPlayer.y >> 7)) { // L: 5595 5596
			var13 = class296.localPlayer.plane; // L: 5597
			var14 = class26.baseX * 64 + (class31.oculusOrbFocalPointX >> 7); // L: 5598
			var15 = class158.baseY * 64 + (PendingSpawn.oculusOrbFocalPointY >> 7); // L: 5599
			class143.method3054(var14, var15, var13, true); // L: 5600
		}

	} // L: 5603

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-968494208"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMap.scrollBarSprites[0].drawAt(var0, var1); // L: 10974
		WorldMap.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10975
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field714); // L: 10976
		int var5 = var3 * (var3 - 32) / var4; // L: 10977
		if (var5 < 8) { // L: 10978
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10979
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field568); // L: 10980
		Rasterizer2D.method8721(var0, var6 + var1 + 16, var5, Client.field570); // L: 10981
		Rasterizer2D.method8721(var0 + 1, var6 + var1 + 16, var5, Client.field570); // L: 10982
		Rasterizer2D.method8720(var0, var6 + var1 + 16, 16, Client.field570); // L: 10983
		Rasterizer2D.method8720(var0, var6 + var1 + 17, 16, Client.field570); // L: 10984
		Rasterizer2D.method8721(var0 + 15, var6 + var1 + 16, var5, Client.field569); // L: 10985
		Rasterizer2D.method8721(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field569); // L: 10986
		Rasterizer2D.method8720(var0, var5 + var6 + var1 + 15, 16, Client.field569); // L: 10987
		Rasterizer2D.method8720(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field569); // L: 10988
	} // L: 10989

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "([Lkn;II)V",
		garbageValue = "-583948704"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11842
			Widget var3 = var0[var2]; // L: 11843
			if (var3 != null) { // L: 11844
				if (var3.type == 0) { // L: 11845
					if (var3.children != null) { // L: 11846
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11847
					if (var4 != null) { // L: 11848
						DecorativeObject.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11850
					var5 = new ScriptEvent(); // L: 11851
					var5.widget = var3; // L: 11852
					var5.args = var3.onDialogAbort; // L: 11853
					ServerPacket.runScriptEvent(var5); // L: 11854
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11856
					if (var3.childIndex >= 0) { // L: 11857
						Widget var6 = class281.getWidget(var3.id); // L: 11858
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11859
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11863
					var5.widget = var3; // L: 11864
					var5.args = var3.onSubChange; // L: 11865
					ServerPacket.runScriptEvent(var5); // L: 11866
				}
			}
		}

	} // L: 11869
}
