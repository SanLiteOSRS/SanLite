import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class93 {
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "0"
	)
	static boolean method2441(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 44
			boolean var3 = false; // L: 45
			boolean var4 = false; // L: 46
			int var5 = 0; // L: 47
			int var6 = var0.length(); // L: 48

			for (int var7 = 0; var7 < var6; ++var7) { // L: 49
				char var8 = var0.charAt(var7); // L: 50
				if (var7 == 0) { // L: 51
					if (var8 == '-') { // L: 52
						var3 = true; // L: 53
						continue;
					}

					if (var8 == '+') { // L: 56
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 58
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 59
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false; // L: 61
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 62
					return false;
				}

				if (var3) { // L: 63
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 64
				if (var9 / var1 != var5) { // L: 65
					return false;
				}

				var5 = var9; // L: 66
				var4 = true; // L: 67
			}

			return var4; // L: 69
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1995690305"
	)
	public static int method2439(int var0) {
		return class135.method3149(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 60
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "789556251"
	)
	static int method2440(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1923
			var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1924
			GrandExchangeEvents.addGameMessage(0, "", var7); // L: 1925
			return 1; // L: 1926
		} else if (var0 == ScriptOpcodes.ANIM) {
			UserComparator6.Interpreter_intStackSize -= 2; // L: 1929
			class358.performPlayerAnimation(class25.localPlayer, Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 1930
			return 1; // L: 1931
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field858) { // L: 1934
				Interpreter.field857 = true; // L: 1935
			}

			return 1; // L: 1937
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1940
				var15 = 0; // L: 1941
				if (Login.isNumber(var7)) { // L: 1942
					var15 = HealthBar.method2644(var7);
				}

				PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.field3239, Client.packetWriter.isaacCipher); // L: 1944
				var13.packetBuffer.method9373(var15); // L: 1945
				Client.packetWriter.addNode(var13); // L: 1946
				return 1; // L: 1947
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1950
					var11 = class482.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 1952
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1953
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1954
					Client.packetWriter.addNode(var11); // L: 1955
					return 1; // L: 1956
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1959
					var11 = class482.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher); // L: 1961
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1962
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1963
					Client.packetWriter.addNode(var11); // L: 1964
					return 1; // L: 1965
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 1968
						var4 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 1969
						class482.method8744(var3, var4); // L: 1970
						return 1; // L: 1971
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						UserComparator6.Interpreter_intStackSize -= 3; // L: 1974
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1975
						var15 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1976
						int var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 1977
						Widget var14 = class380.field4414.method6348(var9); // L: 1978
						class220.clickWidget(var14, var3, var15); // L: 1979
						return 1; // L: 1980
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 1983
						var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 1984
						var15 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 1985
						Widget var12 = var2 ? class31.scriptDotWidget : class185.field1932; // L: 1986
						class220.clickWidget(var12, var3, var15); // L: 1987
						return 1; // L: 1988
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						SoundCache.mouseCam = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 1991
						return 1; // L: 1992
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.method2535() ? 1 : 0; // L: 1995
						return 1; // L: 1996
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						clientPreferences.method2577(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1); // L: 1999
						return 1; // L: 2000
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 2003
						boolean var8 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2004
						class217.openURL(var7, var8, false); // L: 2005
						return 1; // L: 2006
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2009
						var11 = class482.getPacketBufferNode(ClientPacket.field3254, Client.packetWriter.isaacCipher); // L: 2011
						var11.packetBuffer.writeShort(var3); // L: 2012
						Client.packetWriter.addNode(var11); // L: 2013
						return 1; // L: 2014
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2017
						class211.Interpreter_stringStackSize -= 2; // L: 2018
						var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 2019
						String var5 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 2020
						if (var4.length() > 500) { // L: 2021
							return 1;
						} else if (var5.length() > 500) { // L: 2022
							return 1;
						} else {
							PacketBufferNode var6 = class482.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 2023
							var6.packetBuffer.writeShort(1 + CollisionMap.stringCp1252NullTerminatedByteSize(var4) + CollisionMap.stringCp1252NullTerminatedByteSize(var5)); // L: 2024
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 2025
							var6.packetBuffer.method9416(var3); // L: 2026
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 2027
							Client.packetWriter.addNode(var6); // L: 2028
							return 1; // L: 2029
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--UserComparator6.Interpreter_intStackSize; // L: 2032
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2036
						return 1; // L: 2037
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field628 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2040
						return 1; // L: 2041
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) { // L: 2044
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2045
						}

						return 1; // L: 2046
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) { // L: 2049
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2050
						}

						return 1; // L: 2051
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) { // L: 2054
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2055
						}

						return 1; // L: 2056
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) { // L: 2059
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2060
						}

						return 1; // L: 2061
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2064
						return 1; // L: 2065
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2068
						return 1; // L: 2069
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2072
						return 1; // L: 2073
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						WorldMapSectionType.setTapToDrop(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1); // L: 2076
						return 1; // L: 2077
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class126.getTapToDrop() ? 1 : 0; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3129) {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 2084
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2085
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2086
						return 1; // L: 2087
					} else if (var0 == 3130) {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 2090
						return 1; // L: 2091
					} else if (var0 == 3131) {
						--UserComparator6.Interpreter_intStackSize; // L: 2094
						return 1; // L: 2095
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class524.canvasWidth; // L: 2098
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GameEngine.canvasHeight; // L: 2099
						return 1; // L: 2100
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--UserComparator6.Interpreter_intStackSize; // L: 2103
						return 1; // L: 2104
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2107
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						UserComparator6.Interpreter_intStackSize -= 2; // L: 2110
						return 1; // L: 2111
					} else if (var0 == 3136) {
						Client.field798 = 3; // L: 2114
						Client.field673 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2115
						return 1; // L: 2116
					} else if (var0 == 3137) {
						Client.field798 = 2; // L: 2119
						Client.field673 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2120
						return 1; // L: 2121
					} else if (var0 == 3138) {
						Client.field798 = 0; // L: 2124
						return 1; // L: 2125
					} else if (var0 == 3139) {
						Client.field798 = 1; // L: 2128
						return 1; // L: 2129
					} else if (var0 == 3140) {
						Client.field798 = 3; // L: 2132
						Client.field673 = var2 ? class31.scriptDotWidget.id : class185.field1932.id; // L: 2133
						return 1; // L: 2134
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2137
							clientPreferences.method2536(var10); // L: 2138
							return 1; // L: 2139
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.method2619() ? 1 : 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2146
							Client.Login_isUsernameRemembered = var10; // L: 2147
							if (!var10) { // L: 2148
								clientPreferences.method2604(""); // L: 2149
							}

							return 1; // L: 2151
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2154
							return 1; // L: 2155
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2158
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 2161
							clientPreferences.method2589(!var10); // L: 2162
							return 1; // L: 2163
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = clientPreferences.method2546() ? 0 : 1; // L: 2166
							return 1; // L: 2167
						} else if (var0 == 3148) {
							return 1; // L: 2170
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2173
							return 1; // L: 2174
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2189
							return 1; // L: 2190
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Widget.method6823(); // L: 2193
							return 1; // L: 2194
						} else if (var0 == 3155) {
							--class211.Interpreter_stringStackSize; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3156) {
							return 1; // L: 2201
						} else if (var0 == 3157) {
							UserComparator6.Interpreter_intStackSize -= 2; // L: 2204
							return 1; // L: 2205
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2208
							return 1; // L: 2209
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2212
							return 1; // L: 2213
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2216
							return 1; // L: 2217
						} else if (var0 == 3161) {
							--UserComparator6.Interpreter_intStackSize; // L: 2220
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2221
							return 1; // L: 2222
						} else if (var0 == 3162) {
							--UserComparator6.Interpreter_intStackSize; // L: 2225
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3163) {
							--class211.Interpreter_stringStackSize; // L: 2230
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2231
							return 1; // L: 2232
						} else if (var0 == 3164) {
							--UserComparator6.Interpreter_intStackSize; // L: 2235
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2236
							return 1; // L: 2237
						} else if (var0 == 3165) {
							--UserComparator6.Interpreter_intStackSize; // L: 2240
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2241
							return 1; // L: 2242
						} else if (var0 == 3166) {
							UserComparator6.Interpreter_intStackSize -= 2; // L: 2245
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2246
							return 1; // L: 2247
						} else if (var0 == 3167) {
							UserComparator6.Interpreter_intStackSize -= 2; // L: 2250
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3168) {
							UserComparator6.Interpreter_intStackSize -= 2; // L: 2255
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2256
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2257
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2258
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2259
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2260
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2261
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2262
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2263
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 2264
							return 1; // L: 2265
						} else if (var0 == 3169) {
							return 1; // L: 2268
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2271
							return 1; // L: 2272
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2275
							return 1; // L: 2276
						} else if (var0 == 3172) {
							--UserComparator6.Interpreter_intStackSize; // L: 2279
							return 1; // L: 2280
						} else if (var0 == 3173) {
							--UserComparator6.Interpreter_intStackSize; // L: 2283
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2284
							return 1; // L: 2285
						} else if (var0 == 3174) {
							--UserComparator6.Interpreter_intStackSize; // L: 2288
							return 1; // L: 2289
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2292
							return 1; // L: 2293
						} else if (var0 == 3176) {
							return 1; // L: 2296
						} else if (var0 == 3177) {
							return 1; // L: 2299
						} else if (var0 == 3178) {
							--class211.Interpreter_stringStackSize; // L: 2302
							return 1; // L: 2303
						} else if (var0 == 3179) {
							return 1; // L: 2306
						} else if (var0 == 3180) {
							--class211.Interpreter_stringStackSize; // L: 2309
							return 1; // L: 2310
						} else if (var0 == 3181) {
							Huffman.method6901(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 2313
							return 1; // L: 2314
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class89.method2378(); // L: 2317
							return 1; // L: 2318
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2321
							AbstractWorldMapData.method4988(var3); // L: 2322
							return 1; // L: 2323
						} else {
							return 2; // L: 2325
						}
					}
				}
			}
		}
	}
}
