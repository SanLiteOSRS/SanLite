import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("om")
public enum class413 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4639(2, 1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4635(0, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4636(1, 3),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4637(3, 10);

	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2098058349
	)
	final int field4638;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -654043531
	)
	final int field4640;

	class413(int var3, int var4) {
		this.field4638 = var3; // L: 20
		this.field4640 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4640; // L: 26
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "16"
	)
	static int method7863(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1849
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1850
			KitDefinition.addGameMessage(0, "", var7); // L: 1851
			return 1; // L: 1852
		} else if (var0 == ScriptOpcodes.ANIM) {
			class87.Interpreter_intStackSize -= 2; // L: 1855
			class262.performPlayerAnimation(class155.localPlayer, Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 1856
			return 1; // L: 1857
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field868) { // L: 1860
				Interpreter.field865 = true; // L: 1861
			}

			return 1; // L: 1863
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1866
				var16 = 0; // L: 1867
				if (class346.isNumber(var7)) { // L: 1868
					var16 = class412.method7858(var7);
				}

				PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.field3077, Client.packetWriter.isaacCipher); // L: 1870
				var14.packetBuffer.method8536(var16); // L: 1871
				Client.packetWriter.addNode(var14); // L: 1872
				return 1; // L: 1873
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1876
					var12 = class136.getPacketBufferNode(ClientPacket.field3092, Client.packetWriter.isaacCipher); // L: 1878
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1879
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1880
					Client.packetWriter.addNode(var12); // L: 1881
					return 1; // L: 1882
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1885
					var12 = class136.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 1887
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1888
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1889
					Client.packetWriter.addNode(var12); // L: 1890
					return 1; // L: 1891
				} else {
					int var3;
					String var11;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1894
						var11 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1895
						PcmPlayer.method856(var3, var11); // L: 1896
						return 1; // L: 1897
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class87.Interpreter_intStackSize -= 3; // L: 1900
						var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 1901
						var16 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1902
						int var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 1903
						Widget var15 = class175.getWidget(var9); // L: 1904
						class18.clickWidget(var15, var3, var16); // L: 1905
						return 1; // L: 1906
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class87.Interpreter_intStackSize -= 2; // L: 1909
						var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 1910
						var16 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1911
						Widget var13 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1912
						class18.clickWidget(var13, var3, var16); // L: 1913
						return 1; // L: 1914
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						SceneTilePaint.mouseCam = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1917
						return 1; // L: 1918
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2412() ? 1 : 0; // L: 1921
						return 1; // L: 1922
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						StructComposition.clientPreferences.method2486(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1); // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1929
						boolean var8 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1930
						ModeWhere.openURL(var7, var8, false); // L: 1931
						return 1; // L: 1932
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1935
						var12 = class136.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 1937
						var12.packetBuffer.writeShort(var3); // L: 1938
						Client.packetWriter.addNode(var12); // L: 1939
						return 1; // L: 1940
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1943
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1944
						var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1945
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1946
						if (var11.length() > 500) { // L: 1947
							return 1;
						} else if (var5.length() > 500) { // L: 1948
							return 1;
						} else {
							PacketBufferNode var6 = class136.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 1949
							var6.packetBuffer.writeShort(1 + class13.stringCp1252NullTerminatedByteSize(var11) + class13.stringCp1252NullTerminatedByteSize(var5)); // L: 1950
							var6.packetBuffer.method8580(var3); // L: 1951
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1952
							var6.packetBuffer.writeStringCp1252NullTerminated(var11); // L: 1953
							Client.packetWriter.addNode(var6); // L: 1954
							return 1; // L: 1955
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1958
						return 1; // L: 1959
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1962
						return 1; // L: 1963
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1966
						return 1; // L: 1967
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) { // L: 1970
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1971
						}

						return 1; // L: 1972
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) { // L: 1975
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1976
						}

						return 1; // L: 1977
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) { // L: 1980
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1981
						}

						return 1; // L: 1982
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1) { // L: 1985
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1986
						}

						return 1; // L: 1987
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1990
						return 1; // L: 1991
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1994
						return 1; // L: 1995
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 1998
						return 1; // L: 1999
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class358.setTapToDrop(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1); // L: 2002
						return 1; // L: 2003
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = TextureProvider.getTapToDrop() ? 1 : 0; // L: 2006
						return 1; // L: 2007
					} else if (var0 == 3129) {
						class87.Interpreter_intStackSize -= 2; // L: 2010
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 2011
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 2012
						return 1; // L: 2013
					} else if (var0 == 3130) {
						class87.Interpreter_intStackSize -= 2; // L: 2016
						return 1; // L: 2017
					} else if (var0 == 3131) {
						--class87.Interpreter_intStackSize; // L: 2020
						return 1; // L: 2021
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = CollisionMap.canvasWidth; // L: 2024
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Language.canvasHeight; // L: 2025
						return 1; // L: 2026
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class87.Interpreter_intStackSize; // L: 2029
						return 1; // L: 2030
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class87.Interpreter_intStackSize -= 2; // L: 2036
						return 1; // L: 2037
					} else if (var0 == 3136) {
						Client.field791 = 3; // L: 2040
						Client.field683 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2041
						return 1; // L: 2042
					} else if (var0 == 3137) {
						Client.field791 = 2; // L: 2045
						Client.field683 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2046
						return 1; // L: 2047
					} else if (var0 == 3138) {
						Client.field791 = 0; // L: 2050
						return 1; // L: 2051
					} else if (var0 == 3139) {
						Client.field791 = 1; // L: 2054
						return 1; // L: 2055
					} else if (var0 == 3140) {
						Client.field791 = 3; // L: 2058
						Client.field683 = var2 ? class190.scriptDotWidget.id : class360.field4354.id; // L: 2059
						return 1; // L: 2060
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2063
							StructComposition.clientPreferences.method2461(var10); // L: 2064
							return 1; // L: 2065
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2413() ? 1 : 0; // L: 2068
							return 1; // L: 2069
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2072
							Client.Login_isUsernameRemembered = var10; // L: 2073
							if (!var10) { // L: 2074
								StructComposition.clientPreferences.method2429(""); // L: 2075
							}

							return 1; // L: 2077
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2080
							return 1; // L: 2081
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2084
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 2087
							StructComposition.clientPreferences.method2448(!var10); // L: 2088
							return 1; // L: 2089
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2428() ? 0 : 1; // L: 2092
							return 1; // L: 2093
						} else if (var0 == 3148) {
							return 1; // L: 2096
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2099
							return 1; // L: 2100
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2103
							return 1; // L: 2104
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2107
							return 1; // L: 2108
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2115
							return 1; // L: 2116
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GraphicsObject.method2021(); // L: 2119
							return 1; // L: 2120
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 2123
							return 1; // L: 2124
						} else if (var0 == 3156) {
							return 1; // L: 2127
						} else if (var0 == 3157) {
							class87.Interpreter_intStackSize -= 2; // L: 2130
							return 1; // L: 2131
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2134
							return 1; // L: 2135
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2138
							return 1; // L: 2139
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == 3161) {
							--class87.Interpreter_intStackSize; // L: 2146
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2147
							return 1; // L: 2148
						} else if (var0 == 3162) {
							--class87.Interpreter_intStackSize; // L: 2151
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2152
							return 1; // L: 2153
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 2156
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2157
							return 1; // L: 2158
						} else if (var0 == 3164) {
							--class87.Interpreter_intStackSize; // L: 2161
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2162
							return 1; // L: 2163
						} else if (var0 == 3165) {
							--class87.Interpreter_intStackSize; // L: 2166
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3166) {
							class87.Interpreter_intStackSize -= 2; // L: 2171
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2172
							return 1; // L: 2173
						} else if (var0 == 3167) {
							class87.Interpreter_intStackSize -= 2; // L: 2176
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3168) {
							class87.Interpreter_intStackSize -= 2; // L: 2181
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2182
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2183
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2184
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2185
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2186
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2187
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2188
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2189
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2190
							return 1; // L: 2191
						} else if (var0 == 3169) {
							return 1; // L: 2194
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3172) {
							--class87.Interpreter_intStackSize; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3173) {
							--class87.Interpreter_intStackSize; // L: 2209
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3174) {
							--class87.Interpreter_intStackSize; // L: 2214
							return 1; // L: 2215
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3176) {
							return 1; // L: 2222
						} else if (var0 == 3177) {
							return 1; // L: 2225
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 2228
							return 1; // L: 2229
						} else if (var0 == 3179) {
							return 1; // L: 2232
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3181) {
							class14.method170(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class273.method5478(); // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 2247
							SequenceDefinition var4 = class216.SequenceDefinition_get(var3); // L: 2248
							if (var4.isCachedModelIdSet()) { // L: 2249
								Login.method2096(var4.SequenceDefinition_cachedModelId); // L: 2250
							}

							return 1; // L: 2252
						} else {
							return 2; // L: 2254
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lkd;I)V",
		garbageValue = "-458709619"
	)
	static final void method7860(Widget var0) {
		int var1 = var0.contentType; // L: 12262
		if (var1 == 324) { // L: 12263
			if (Client.field792 == -1) { // L: 12264
				Client.field792 = var0.spriteId2; // L: 12265
				Client.field793 = var0.spriteId; // L: 12266
			}

			if (Client.playerAppearance.field3474 == 1) { // L: 12268
				var0.spriteId2 = Client.field792;
			} else {
				var0.spriteId2 = Client.field793; // L: 12269
			}

		} else if (var1 == 325) { // L: 12272
			if (Client.field792 == -1) { // L: 12273
				Client.field792 = var0.spriteId2; // L: 12274
				Client.field793 = var0.spriteId; // L: 12275
			}

			if (Client.playerAppearance.field3474 == 1) { // L: 12277
				var0.spriteId2 = Client.field793;
			} else {
				var0.spriteId2 = Client.field792; // L: 12278
			}

		} else if (var1 == 327) { // L: 12281
			var0.modelAngleX = 150; // L: 12282
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12283
			var0.modelType = 5; // L: 12284
			var0.modelId = 0; // L: 12285
		} else if (var1 == 328) { // L: 12288
			var0.modelAngleX = 150; // L: 12289
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12290
			var0.modelType = 5; // L: 12291
			var0.modelId = 1; // L: 12292
		}
	} // L: 12270 12279 12286 12293 12295
}
