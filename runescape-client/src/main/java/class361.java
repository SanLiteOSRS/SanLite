import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ms")
class class361 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	final class362 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmq;)V"
	)
	class361(class362 var1) {
		this.this$0 = var1; // L: 7
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmz;Lmz;B)I",
		garbageValue = "30"
	)
	int method6581(class363 var1, class363 var2) {
		if (var1.field4292 > var2.field4292) {
			return 1; // L: 9
		} else {
			return var1.field4292 < var2.field4292 ? -1 : 0; // L: 10 11
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method6581((class363)var1, (class363)var2); // L: 15
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "971647238"
	)
	static int method6591(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 571
		Widget var4;
		if (var0 >= 2000) { // L: 573
			var0 -= 1000; // L: 574
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 575
			var4 = FloorUnderlayDefinition.getWidget(var3); // L: 576
		} else {
			var4 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 578
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 579
			TaskHandler.Interpreter_intStackSize -= 4; // L: 580
			var4.rawX = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 581
			var4.rawY = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 582
			var4.xAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 583
			var4.yAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 584
			class220.invalidateWidget(var4); // L: 585
			class329.client.alignWidget(var4); // L: 586
			if (var3 != -1 && var4.type == 0) { // L: 587
				class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 588
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 590
			TaskHandler.Interpreter_intStackSize -= 4; // L: 591
			var4.rawWidth = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 592
			var4.rawHeight = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 593
			var4.widthAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 594
			var4.heightAlignment = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 595
			class220.invalidateWidget(var4); // L: 596
			class329.client.alignWidget(var4); // L: 597
			if (var3 != -1 && var4.type == 0) { // L: 598
				class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 599
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 601
			boolean var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 602
			if (var5 != var4.isHidden) { // L: 603
				var4.isHidden = var5; // L: 604
				class220.invalidateWidget(var4); // L: 605
			}

			return 1; // L: 607
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 609
			var4.noClickThrough = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 610
			return 1; // L: 611
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 613
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 614
			return 1; // L: 615
		} else {
			return 2; // L: 617
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "-34"
	)
	static int method6588(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1892
			TaskHandler.Interpreter_intStackSize -= 3; // L: 1893
			class174.queueSoundEffect(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]); // L: 1894
			return 1; // L: 1895
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1897
			class1.playSong(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1898
			return 1; // L: 1899
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1901
			TaskHandler.Interpreter_intStackSize -= 2; // L: 1902
			MouseRecorder.method2170(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize], Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]); // L: 1903
			return 1; // L: 1904
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1906
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2018
					return var0 == 3211 ? 1 : 2; // L: 2127 2128 2130
				} else {
					var3 = class83.field1076; // L: 2019
					var4 = class82.field1072; // L: 2020
					boolean var8 = false; // L: 2021
					if (var0 == 3214) { // L: 2022
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2023
						var3 = (class83)class271.findEnumerated(class144.method3086(), var6); // L: 2024
						if (var3 == null) { // L: 2025
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2026
						}
					}

					if (var0 == 3215) { // L: 2029
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2030
						var4 = (class82)class271.findEnumerated(WallObject.method4494(), var6); // L: 2031
						if (var4 == null) { // L: 2032
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2033
						}
					}

					if (var0 == 3210) { // L: 2036
						var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2037
						var3 = (class83)class271.findEnumerated(class144.method3086(), var6); // L: 2038
						if (var3 == null) { // L: 2039
							var4 = (class82)class271.findEnumerated(WallObject.method4494(), var6); // L: 2040
							if (var4 == null) { // L: 2041
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2042
							}
						}
					} else if (var0 == 3182) { // L: 2046
						var3 = class83.field1078; // L: 2047
					} else if (var0 == 3204) { // L: 2049
						var4 = class82.field1069; // L: 2050
					} else if (var0 == 3206) { // L: 2052
						var4 = class82.field1065; // L: 2053
					} else if (var0 == 3208) { // L: 2055
						var4 = class82.field1064; // L: 2056
					}

					if (var4 == class82.field1072) { // L: 2058
						switch(var3.field1074) { // L: 2059
						case 1:
							var5 = class260.clientPreferences.method2326() ? 1 : 0; // L: 2067
							break; // L: 2068
						case 2:
							var5 = class260.clientPreferences.method2316() ? 1 : 0; // L: 2077
							break; // L: 2078
						case 3:
							var5 = class260.clientPreferences.method2339() ? 1 : 0; // L: 2062
							break;
						case 4:
							var5 = class260.clientPreferences.method2321(); // L: 2082
							break; // L: 2083
						case 5:
							var5 = class155.method3238(); // L: 2072
							break; // L: 2073
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2087
							throw new RuntimeException(var7); // L: 2088
						}
					} else {
						switch(var4.field1067) { // L: 2093
						case 1:
							var5 = class260.clientPreferences.method2312() ? 1 : 0; // L: 2119
							break;
						case 2:
							var6 = class260.clientPreferences.method2335(); // L: 2102
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2103
							break; // L: 2104
						case 3:
							var6 = class260.clientPreferences.method2348(); // L: 2108
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2109
							break; // L: 2110
						case 4:
							var6 = class260.clientPreferences.method2329(); // L: 2096
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2097
							break; // L: 2098
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2114
							throw new RuntimeException(var7); // L: 2115
						}
					}

					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5; // L: 2124
					return 1; // L: 2125
				}
			} else {
				var3 = class83.field1076; // L: 1907
				var4 = class82.field1072; // L: 1908
				var5 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1909
				if (var0 == 3212) { // L: 1910
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1911
					var3 = (class83)class271.findEnumerated(class144.method3086(), var6); // L: 1912
					if (var3 == null) { // L: 1913
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1914
					}
				}

				if (var0 == 3213) { // L: 1917
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1918
					var4 = (class82)class271.findEnumerated(WallObject.method4494(), var6); // L: 1919
					if (var4 == null) { // L: 1920
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1921
					}
				}

				if (var0 == 3209) { // L: 1924
					var6 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 1925
					var3 = (class83)class271.findEnumerated(class144.method3086(), var6); // L: 1926
					if (var3 == null) { // L: 1927
						var4 = (class82)class271.findEnumerated(WallObject.method4494(), var6); // L: 1928
						if (var4 == null) { // L: 1929
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1930
						}
					}
				} else if (var0 == 3181) { // L: 1934
					var3 = class83.field1078; // L: 1935
				} else if (var0 == 3203) { // L: 1937
					var4 = class82.field1069; // L: 1938
				} else if (var0 == 3205) { // L: 1940
					var4 = class82.field1065; // L: 1941
				} else if (var0 == 3207) { // L: 1943
					var4 = class82.field1064; // L: 1944
				}

				if (var4 == class82.field1072) { // L: 1946
					switch(var3.field1074) { // L: 1947
					case 1:
						class260.clientPreferences.method2389(var5 == 1); // L: 1976
						break; // L: 1977
					case 2:
						class260.clientPreferences.method2347(var5 == 1); // L: 1961
						break; // L: 1962
					case 3:
						class260.clientPreferences.method2338(var5 == 1); // L: 1971
						break; // L: 1972
					case 4:
						if (var5 < 0) { // L: 1955
							var5 = 0;
						}

						class260.clientPreferences.method2320(var5); // L: 1956
						break;
					case 5:
						DecorativeObject.method4516(var5); // L: 1966
						break; // L: 1967
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1950
						throw new RuntimeException(var7); // L: 1951
					}
				} else {
					switch(var4.field1067) { // L: 1982
					case 1:
						class260.clientPreferences.method2311(var5 == 1); // L: 1985
						break; // L: 1986
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2002
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2003
						class228.method4875(var6); // L: 2004
						break; // L: 2005
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1995
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1996
						Player.method2248(var6); // L: 1997
						break; // L: 1998
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2009
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2010
						class136.method2949(var6); // L: 2011
						break; // L: 2012
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 1990
						throw new RuntimeException(var7); // L: 1991
					}
				}

				return 1; // L: 2016
			}
		}
	}
}
