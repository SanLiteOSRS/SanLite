import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
public class class136 extends class144 {
	@ObfuscatedName("aj")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -868352589
	)
	int field1590;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1590 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1539485988"
	)
	void vmethod3074(Buffer var1) {
		this.field1590 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-1270425284"
	)
	void vmethod3073(ClanChannel var1) {
		var1.removeMember(this.field1590); // L: 96
	} // L: 97

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-857459553"
	)
	static int method2878(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1901
			Nameable.Interpreter_intStackSize -= 3; // L: 1902
			class147.queueSoundEffect(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]); // L: 1903
			return 1; // L: 1904
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1906
			InvDefinition.playSong(Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]); // L: 1907
			return 1; // L: 1908
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1910
			Nameable.Interpreter_intStackSize -= 2; // L: 1911
			JagexCache.method3206(Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]); // L: 1912
			return 1; // L: 1913
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 1915
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2027
					return var0 == 3211 ? 1 : 2; // L: 2136 2137 2139
				} else {
					var3 = class83.field1076; // L: 2028
					var4 = class82.field1065; // L: 2029
					boolean var8 = false; // L: 2030
					if (var0 == 3214) { // L: 2031
						var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2032
						var3 = (class83)GameEngine.findEnumerated(Players.method2388(), var6); // L: 2033
						if (var3 == null) { // L: 2034
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2035
						}
					}

					if (var0 == 3215) { // L: 2038
						var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2039
						var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6); // L: 2040
						if (var4 == null) { // L: 2041
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2042
						}
					}

					if (var0 == 3210) { // L: 2045
						var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 2046
						var3 = (class83)GameEngine.findEnumerated(Players.method2388(), var6); // L: 2047
						if (var3 == null) { // L: 2048
							var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6); // L: 2049
							if (var4 == null) { // L: 2050
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2051
							}
						}
					} else if (var0 == 3182) { // L: 2055
						var3 = class83.field1078; // L: 2056
					} else if (var0 == 3204) { // L: 2058
						var4 = class82.field1062; // L: 2059
					} else if (var0 == 3206) { // L: 2061
						var4 = class82.field1063; // L: 2062
					} else if (var0 == 3208) { // L: 2064
						var4 = class82.field1064; // L: 2065
					}

					if (var4 == class82.field1065) { // L: 2067
						switch(var3.field1075) { // L: 2068
						case 1:
							var5 = FriendsChatMember.clientPreferences.method2211() ? 1 : 0; // L: 2096
							break; // L: 2097
						case 2:
							var5 = FriendsChatMember.clientPreferences.method2213() ? 1 : 0; // L: 2081
							break; // L: 2082
						case 3:
							var5 = FriendsChatMember.clientPreferences.method2216() ? 1 : 0; // L: 2086
							break; // L: 2087
						case 4:
							var5 = FriendsChatMember.clientPreferences.method2218(); // L: 2076
							break; // L: 2077
						case 5:
							var5 = WorldMapSection2.method4502(); // L: 2071
							break;
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2091
							throw new RuntimeException(var7); // L: 2092
						}
					} else {
						switch(var4.field1061) { // L: 2102
						case 1:
							var5 = FriendsChatMember.clientPreferences.method2209() ? 1 : 0; // L: 2117
							break; // L: 2118
						case 2:
							var6 = FriendsChatMember.clientPreferences.method2222(); // L: 2127
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2128
							break; // L: 2129
						case 3:
							var6 = FriendsChatMember.clientPreferences.method2204(); // L: 2111
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2112
							break; // L: 2113
						case 4:
							var6 = FriendsChatMember.clientPreferences.method2226(); // L: 2105
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2106
							break; // L: 2107
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2122
							throw new RuntimeException(var7); // L: 2123
						}
					}

					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var5; // L: 2133
					return 1; // L: 2134
				}
			} else {
				var3 = class83.field1076; // L: 1916
				var4 = class82.field1065; // L: 1917
				var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1918
				if (var0 == 3212) { // L: 1919
					var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1920
					var3 = (class83)GameEngine.findEnumerated(Players.method2388(), var6); // L: 1921
					if (var3 == null) { // L: 1922
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 1923
					}
				}

				if (var0 == 3213) { // L: 1926
					var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1927
					var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6); // L: 1928
					if (var4 == null) { // L: 1929
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 1930
					}
				}

				if (var0 == 3209) { // L: 1933
					var6 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 1934
					var3 = (class83)GameEngine.findEnumerated(Players.method2388(), var6); // L: 1935
					if (var3 == null) { // L: 1936
						var4 = (class82)GameEngine.findEnumerated(GameEngine.method528(), var6); // L: 1937
						if (var4 == null) { // L: 1938
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 1939
						}
					}
				} else if (var0 == 3181) { // L: 1943
					var3 = class83.field1078; // L: 1944
				} else if (var0 == 3203) { // L: 1946
					var4 = class82.field1062; // L: 1947
				} else if (var0 == 3205) { // L: 1949
					var4 = class82.field1063; // L: 1950
				} else if (var0 == 3207) { // L: 1952
					var4 = class82.field1064; // L: 1953
				}

				if (var4 == class82.field1065) { // L: 1955
					switch(var3.field1075) { // L: 1956
					case 1:
						FriendsChatMember.clientPreferences.method2210(var5 == 1); // L: 1969
						break; // L: 1970
					case 2:
						FriendsChatMember.clientPreferences.method2212(var5 == 1); // L: 1985
						break; // L: 1986
					case 3:
						FriendsChatMember.clientPreferences.method2276(var5 == 1); // L: 1964
						break;
					case 4:
						if (var5 < 0) { // L: 1979
							var5 = 0;
						}

						FriendsChatMember.clientPreferences.method2217(var5); // L: 1980
						break; // L: 1981
					case 5:
						WorldMapLabel.method4918(var5); // L: 1974
						break; // L: 1975
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 1959
						throw new RuntimeException(var7); // L: 1960
					}
				} else {
					switch(var4.field1061) { // L: 1991
					case 1:
						FriendsChatMember.clientPreferences.method2241(var5 == 1); // L: 2001
						break; // L: 2002
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2018
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2019
						class10.method100(var6); // L: 2020
						break; // L: 2021
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 1994
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 1995
						class181.method3480(var6); // L: 1996
						break; // L: 1997
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2006
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2007
						class132.method2838(var6); // L: 2008
						break; // L: 2009
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2013
						throw new RuntimeException(var7); // L: 2014
					}
				}

				return 1; // L: 2025
			}
		}
	}
}
