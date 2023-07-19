import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ai")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;I)I",
		garbageValue = "-2012267227"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnj;",
		garbageValue = "-1313729435"
	)
	public static StudioGame[] method2951() {
		return new StudioGame[]{StudioGame.oldscape, StudioGame.game5, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.stellardawn}; // L: 17
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "897744606"
	)
	static int method2950(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1879
			var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1880
			ReflectionCheck.addGameMessage(0, "", var7); // L: 1881
			return 1; // L: 1882
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1885
			SoundCache.performPlayerAnimation(class27.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1886
			return 1; // L: 1887
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field865) { // L: 1890
				Interpreter.field871 = true; // L: 1891
			}

			return 1; // L: 1893
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1896
				var15 = 0; // L: 1897
				if (class194.isNumber(var7)) { // L: 1898
					var15 = class317.method6078(var7);
				}

				PacketBufferNode var13 = class217.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 1900
				var13.packetBuffer.writeInt(var15); // L: 1901
				Client.packetWriter.addNode(var13); // L: 1902
				return 1; // L: 1903
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1906
					var11 = class217.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 1908
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1909
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1910
					Client.packetWriter.addNode(var11); // L: 1911
					return 1; // L: 1912
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1915
					var11 = class217.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 1917
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1918
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1919
					Client.packetWriter.addNode(var11); // L: 1920
					return 1; // L: 1921
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1924
						var4 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1925
						class408.method7647(var3, var4); // L: 1926
						return 1; // L: 1927
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1930
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1931
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1932
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1933
						Widget var14 = Interpreter.getWidget(var9); // L: 1934
						class305.clickWidget(var14, var3, var15); // L: 1935
						return 1; // L: 1936
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1939
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1940
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1941
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1942
						class305.clickWidget(var12, var3, var15); // L: 1943
						return 1; // L: 1944
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class412.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1947
						return 1; // L: 1948
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.clientPreferences.method2543() ? 1 : 0; // L: 1951
						return 1; // L: 1952
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						ScriptFrame.clientPreferences.method2502(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1955
						return 1; // L: 1956
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1959
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1960
						class339.openURL(var7, var8, false); // L: 1961
						return 1; // L: 1962
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1965
						var11 = class217.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 1967
						var11.packetBuffer.writeShort(var3); // L: 1968
						Client.packetWriter.addNode(var11); // L: 1969
						return 1; // L: 1970
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1973
						class179.Interpreter_stringStackSize -= 2; // L: 1974
						var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 1975
						String var5 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 1976
						if (var4.length() > 500) { // L: 1977
							return 1;
						} else if (var5.length() > 500) { // L: 1978
							return 1;
						} else {
							PacketBufferNode var6 = class217.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher); // L: 1979
							var6.packetBuffer.writeShort(1 + Player.stringCp1252NullTerminatedByteSize(var4) + Player.stringCp1252NullTerminatedByteSize(var5)); // L: 1980
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1981
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1982
							var6.packetBuffer.method9088(var3); // L: 1983
							Client.packetWriter.addNode(var6); // L: 1984
							return 1; // L: 1985
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 1988
						return 1; // L: 1989
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1992
						return 1; // L: 1993
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field626 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1996
						return 1; // L: 1997
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2000
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2001
						}

						return 1; // L: 2002
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2005
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2006
						}

						return 1; // L: 2007
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2010
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2011
						}

						return 1; // L: 2012
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2015
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2016
						}

						return 1; // L: 2017
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2020
						return 1; // L: 2021
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2024
						return 1; // L: 2025
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2028
						return 1; // L: 2029
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						BuddyRankComparator.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2032
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class53.getTapToDrop() ? 1 : 0; // L: 2036
						return 1; // L: 2037
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2040
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2041
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2042
						return 1; // L: 2043
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2046
						return 1; // L: 2047
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2050
						return 1; // L: 2051
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarbitComposition.canvasWidth; // L: 2054
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class370.canvasHeight; // L: 2055
						return 1; // L: 2056
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2059
						return 1; // L: 2060
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2063
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2066
						return 1; // L: 2067
					} else if (var0 == 3136) {
						Client.field669 = 3; // L: 2070
						Client.field557 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2071
						return 1; // L: 2072
					} else if (var0 == 3137) {
						Client.field669 = 2; // L: 2075
						Client.field557 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2076
						return 1; // L: 2077
					} else if (var0 == 3138) {
						Client.field669 = 0; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3139) {
						Client.field669 = 1; // L: 2084
						return 1; // L: 2085
					} else if (var0 == 3140) {
						Client.field669 = 3; // L: 2088
						Client.field557 = var2 ? Interpreter.scriptDotWidget.id : class184.field1907.id; // L: 2089
						return 1; // L: 2090
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2093
							ScriptFrame.clientPreferences.method2589(var10); // L: 2094
							return 1; // L: 2095
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.clientPreferences.method2505() ? 1 : 0; // L: 2098
							return 1; // L: 2099
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2102
							Client.Login_isUsernameRemembered = var10; // L: 2103
							if (!var10) { // L: 2104
								ScriptFrame.clientPreferences.method2521(""); // L: 2105
							}

							return 1; // L: 2107
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2110
							return 1; // L: 2111
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2114
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2117
							ScriptFrame.clientPreferences.method2566(!var10); // L: 2118
							return 1; // L: 2119
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.clientPreferences.method2507() ? 0 : 1; // L: 2122
							return 1; // L: 2123
						} else if (var0 == 3148) {
							return 1; // L: 2126
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2129
							return 1; // L: 2130
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2133
							return 1; // L: 2134
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2137
							return 1; // L: 2138
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2141
							return 1; // L: 2142
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2145
							return 1; // L: 2146
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlatformInfo.method8423(); // L: 2149
							return 1; // L: 2150
						} else if (var0 == 3155) {
							--class179.Interpreter_stringStackSize; // L: 2153
							return 1; // L: 2154
						} else if (var0 == 3156) {
							return 1; // L: 2157
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2160
							return 1; // L: 2161
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2168
							return 1; // L: 2169
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2172
							return 1; // L: 2173
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2176
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2181
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2182
							return 1; // L: 2183
						} else if (var0 == 3163) {
							--class179.Interpreter_stringStackSize; // L: 2186
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2187
							return 1; // L: 2188
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2191
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2192
							return 1; // L: 2193
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2196
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2201
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2202
							return 1; // L: 2203
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2206
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2207
							return 1; // L: 2208
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2211
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2212
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2213
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2214
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2215
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2216
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2217
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2218
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2219
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 2220
							return 1; // L: 2221
						} else if (var0 == 3169) {
							return 1; // L: 2224
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2227
							return 1; // L: 2228
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2231
							return 1; // L: 2232
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2239
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2240
							return 1; // L: 2241
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2244
							return 1; // L: 2245
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2248
							return 1; // L: 2249
						} else if (var0 == 3176) {
							return 1; // L: 2252
						} else if (var0 == 3177) {
							return 1; // L: 2255
						} else if (var0 == 3178) {
							--class179.Interpreter_stringStackSize; // L: 2258
							return 1; // L: 2259
						} else if (var0 == 3179) {
							return 1; // L: 2262
						} else if (var0 == 3180) {
							--class179.Interpreter_stringStackSize; // L: 2265
							return 1; // L: 2266
						} else if (var0 == 3181) {
							SecureRandomCallable.method2272(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2269
							return 1; // L: 2270
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class252.method5135(); // L: 2273
							return 1; // L: 2274
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2277
							FloorUnderlayDefinition.method3910(var3); // L: 2278
							return 1; // L: 2279
						} else {
							return 2; // L: 2281
						}
					}
				}
			}
		}
	}
}
