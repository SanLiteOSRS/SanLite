import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ko")
public class class266 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "36"
	)
	static int method5209(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1893
			var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1894
			class411.addGameMessage(0, "", var7); // L: 1895
			return 1; // L: 1896
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1899
			WorldMapEvent.performPlayerAnimation(TextureProvider.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1900
			return 1; // L: 1901
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field883) { // L: 1904
				Interpreter.field882 = true; // L: 1905
			}

			return 1; // L: 1907
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1910
				var15 = 0; // L: 1911
				if (AttackOption.isNumber(var7)) { // L: 1912
					var15 = class36.method686(var7);
				}

				PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 1914
				var13.packetBuffer.writeInt(var15); // L: 1915
				Client.packetWriter.addNode(var13); // L: 1916
				return 1; // L: 1917
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1920
					var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 1922
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1923
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1924
					Client.packetWriter.addNode(var11); // L: 1925
					return 1; // L: 1926
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1929
					var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 1931
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1932
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1933
					Client.packetWriter.addNode(var11); // L: 1934
					return 1; // L: 1935
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1938
						var4 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1939
						GrandExchangeOfferTotalQuantityComparator.method7051(var3, var4); // L: 1940
						return 1; // L: 1941
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1944
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1945
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1946
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1947
						Widget var14 = class33.field184.method6240(var9); // L: 1948
						TaskHandler.clickWidget(var14, var3, var15); // L: 1949
						return 1; // L: 1950
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1953
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1954
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1955
						Widget var12 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1956
						TaskHandler.clickWidget(var12, var3, var15); // L: 1957
						return 1; // L: 1958
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator8.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1961
						return 1; // L: 1962
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2502() ? 1 : 0; // L: 1965
						return 1; // L: 1966
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class91.clientPreferences.method2558(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1969
						return 1; // L: 1970
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 1973
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1974
						VertexNormal.openURL(var7, var8, false); // L: 1975
						return 1; // L: 1976
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1979
						var11 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 1981
						var11.packetBuffer.writeShort(var3); // L: 1982
						Client.packetWriter.addNode(var11); // L: 1983
						return 1; // L: 1984
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1987
						class180.Interpreter_stringStackSize -= 2; // L: 1988
						var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 1989
						String var5 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 1990
						if (var4.length() > 500) { // L: 1991
							return 1;
						} else if (var5.length() > 500) { // L: 1992
							return 1;
						} else {
							PacketBufferNode var6 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 1993
							var6.packetBuffer.writeShort(1 + class478.stringCp1252NullTerminatedByteSize(var4) + class478.stringCp1252NullTerminatedByteSize(var5)); // L: 1994
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1995
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1996
							var6.packetBuffer.method9234(var3); // L: 1997
							Client.packetWriter.addNode(var6); // L: 1998
							return 1; // L: 1999
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 2002
						return 1; // L: 2003
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2006
						return 1; // L: 2007
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field648 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2010
						return 1; // L: 2011
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2014
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2015
						}

						return 1; // L: 2016
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2019
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2020
						}

						return 1; // L: 2021
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2024
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2025
						}

						return 1; // L: 2026
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2029
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2030
						}

						return 1; // L: 2031
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2034
						return 1; // L: 2035
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2038
						return 1; // L: 2039
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2042
						return 1; // L: 2043
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class154.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2046
						return 1; // L: 2047
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class47.getTapToDrop() ? 1 : 0; // L: 2050
						return 1; // L: 2051
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2054
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2055
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2056
						return 1; // L: 2057
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2060
						return 1; // L: 2061
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2064
						return 1; // L: 2065
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class340.canvasWidth; // L: 2068
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class491.canvasHeight; // L: 2069
						return 1; // L: 2070
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2073
						return 1; // L: 2074
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2077
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3136) {
						Client.field691 = 3; // L: 2084
						Client.field692 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2085
						return 1; // L: 2086
					} else if (var0 == 3137) {
						Client.field691 = 2; // L: 2089
						Client.field692 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2090
						return 1; // L: 2091
					} else if (var0 == 3138) {
						Client.field691 = 0; // L: 2094
						return 1; // L: 2095
					} else if (var0 == 3139) {
						Client.field691 = 1; // L: 2098
						return 1; // L: 2099
					} else if (var0 == 3140) {
						Client.field691 = 3; // L: 2102
						Client.field692 = var2 ? class416.scriptDotWidget.id : class306.field3131.id; // L: 2103
						return 1; // L: 2104
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2107
							class91.clientPreferences.method2531(var10); // L: 2108
							return 1; // L: 2109
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2504() ? 1 : 0; // L: 2112
							return 1; // L: 2113
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2116
							Client.Login_isUsernameRemembered = var10; // L: 2117
							if (!var10) { // L: 2118
								class91.clientPreferences.method2520(""); // L: 2119
							}

							return 1; // L: 2121
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2124
							return 1; // L: 2125
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2128
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2131
							class91.clientPreferences.method2505(!var10); // L: 2132
							return 1; // L: 2133
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.clientPreferences.method2503() ? 0 : 1; // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3148) {
							return 1; // L: 2140
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2143
							return 1; // L: 2144
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2147
							return 1; // L: 2148
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2151
							return 1; // L: 2152
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2155
							return 1; // L: 2156
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class138.method3083(); // L: 2163
							return 1; // L: 2164
						} else if (var0 == 3155) {
							--class180.Interpreter_stringStackSize; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3156) {
							return 1; // L: 2171
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2174
							return 1; // L: 2175
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2178
							return 1; // L: 2179
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2182
							return 1; // L: 2183
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2186
							return 1; // L: 2187
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2190
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2191
							return 1; // L: 2192
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2195
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2196
							return 1; // L: 2197
						} else if (var0 == 3163) {
							--class180.Interpreter_stringStackSize; // L: 2200
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2205
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2206
							return 1; // L: 2207
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2210
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2211
							return 1; // L: 2212
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2215
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2216
							return 1; // L: 2217
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2220
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2221
							return 1; // L: 2222
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2225
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2226
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2227
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2228
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2229
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2230
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2231
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2232
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2233
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 2234
							return 1; // L: 2235
						} else if (var0 == 3169) {
							return 1; // L: 2238
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2241
							return 1; // L: 2242
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2245
							return 1; // L: 2246
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2249
							return 1; // L: 2250
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2253
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2254
							return 1; // L: 2255
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2258
							return 1; // L: 2259
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2262
							return 1; // L: 2263
						} else if (var0 == 3176) {
							return 1; // L: 2266
						} else if (var0 == 3177) {
							return 1; // L: 2269
						} else if (var0 == 3178) {
							--class180.Interpreter_stringStackSize; // L: 2272
							return 1; // L: 2273
						} else if (var0 == 3179) {
							return 1; // L: 2276
						} else if (var0 == 3180) {
							--class180.Interpreter_stringStackSize; // L: 2279
							return 1; // L: 2280
						} else if (var0 == 3181) {
							FontName.method8851(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2283
							return 1; // L: 2284
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FaceNormal.method4845(); // L: 2287
							return 1; // L: 2288
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2291
							class462.method8308(var3); // L: 2292
							return 1; // L: 2293
						} else {
							return 2; // L: 2295
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "-277761006"
	)
	static final boolean method5208(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8638

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8639 8640 8645
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8641
				var5 = var6; // L: 8642
				break;
			}
		}

		if (var5 != null) { // L: 8647
			var5.field1180 = var4; // L: 8648
			return true; // L: 8649
		} else {
			return false; // L: 8651
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1820839232"
	)
	@Export("VorbisSample_setData")
	static void VorbisSample_setData(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12809
			Client.randomDatData = new byte[24];
		}

		class424.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12810
	} // L: 12811
}
