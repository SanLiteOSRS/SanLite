import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("no")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -75260527
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("aw")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-19"
	)
	static int method6685(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1874
			var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1875
			UserComparator5.addGameMessage(0, "", var7); // L: 1876
			return 1; // L: 1877
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1880
			GroundObject.performPlayerAnimation(MusicPatchNode.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1881
			return 1; // L: 1882
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field853) { // L: 1885
				Interpreter.field849 = true; // L: 1886
			}

			return 1; // L: 1888
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1891
				var15 = 0; // L: 1892
				if (WorldMapSectionType.isNumber(var7)) { // L: 1893
					var15 = PacketBufferNode.method5709(var7);
				}

				PacketBufferNode var13 = class330.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 1895
				var13.packetBuffer.writeInt(var15); // L: 1896
				Client.packetWriter.addNode(var13); // L: 1897
				return 1; // L: 1898
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1901
					var11 = class330.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 1903
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1904
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1905
					Client.packetWriter.addNode(var11); // L: 1906
					return 1; // L: 1907
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1910
					var11 = class330.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 1912
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1913
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1914
					Client.packetWriter.addNode(var11); // L: 1915
					return 1; // L: 1916
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1919
						var4 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1920
						UserComparator7.method2909(var3, var4); // L: 1921
						return 1; // L: 1922
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1925
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1926
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1927
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1928
						Widget var14 = class165.getWidget(var9); // L: 1929
						class370.clickWidget(var14, var3, var15); // L: 1930
						return 1; // L: 1931
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1934
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1935
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1936
						Widget var12 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1937
						class370.clickWidget(var12, var3, var15); // L: 1938
						return 1; // L: 1939
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class473.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1942
						return 1; // L: 1943
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2513() ? 1 : 0; // L: 1946
						return 1; // L: 1947
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class20.clientPreferences.method2448(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1950
						return 1; // L: 1951
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 1954
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1955
						Ignored.openURL(var7, var8, false); // L: 1956
						return 1; // L: 1957
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1960
						var11 = class330.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 1962
						var11.packetBuffer.writeShort(var3); // L: 1963
						Client.packetWriter.addNode(var11); // L: 1964
						return 1; // L: 1965
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1968
						SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 1969
						var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 1970
						String var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 1971
						if (var4.length() > 500) { // L: 1972
							return 1;
						} else if (var5.length() > 500) { // L: 1973
							return 1;
						} else {
							PacketBufferNode var6 = class330.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 1974
							var6.packetBuffer.writeShort(1 + DynamicObject.stringCp1252NullTerminatedByteSize(var4) + DynamicObject.stringCp1252NullTerminatedByteSize(var5)); // L: 1975
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1976
							var6.packetBuffer.method9203(var3); // L: 1977
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1978
							Client.packetWriter.addNode(var6); // L: 1979
							return 1; // L: 1980
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 1983
						return 1; // L: 1984
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1987
						return 1; // L: 1988
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field614 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1991
						return 1; // L: 1992
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1995
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1996
						}

						return 1; // L: 1997
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2000
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2001
						}

						return 1; // L: 2002
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2005
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2006
						}

						return 1; // L: 2007
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2010
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2011
						}

						return 1; // L: 2012
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2015
						return 1; // L: 2016
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2019
						return 1; // L: 2020
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2023
						return 1; // L: 2024
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class120.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2027
						return 1; // L: 2028
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.getTapToDrop() ? 1 : 0; // L: 2031
						return 1; // L: 2032
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2035
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2036
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2037
						return 1; // L: 2038
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2041
						return 1; // L: 2042
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2045
						return 1; // L: 2046
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 2049
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class262.canvasHeight; // L: 2050
						return 1; // L: 2051
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2054
						return 1; // L: 2055
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2058
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2061
						return 1; // L: 2062
					} else if (var0 == 3136) {
						Client.field595 = 3; // L: 2065
						Client.field658 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2066
						return 1; // L: 2067
					} else if (var0 == 3137) {
						Client.field595 = 2; // L: 2070
						Client.field658 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2071
						return 1; // L: 2072
					} else if (var0 == 3138) {
						Client.field595 = 0; // L: 2075
						return 1; // L: 2076
					} else if (var0 == 3139) {
						Client.field595 = 1; // L: 2079
						return 1; // L: 2080
					} else if (var0 == 3140) {
						Client.field595 = 3; // L: 2083
						Client.field658 = var2 ? SoundSystem.scriptDotWidget.id : class1.field5.id; // L: 2084
						return 1; // L: 2085
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2088
							class20.clientPreferences.method2449(var10); // L: 2089
							return 1; // L: 2090
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2450() ? 1 : 0; // L: 2093
							return 1; // L: 2094
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2097
							Client.Login_isUsernameRemembered = var10; // L: 2098
							if (!var10) { // L: 2099
								class20.clientPreferences.method2466(""); // L: 2100
							}

							return 1; // L: 2102
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2105
							return 1; // L: 2106
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2109
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2112
							class20.clientPreferences.method2531(!var10); // L: 2113
							return 1; // L: 2114
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class20.clientPreferences.method2534() ? 0 : 1; // L: 2117
							return 1; // L: 2118
						} else if (var0 == 3148) {
							return 1; // L: 2121
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2124
							return 1; // L: 2125
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2128
							return 1; // L: 2129
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2132
							return 1; // L: 2133
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2140
							return 1; // L: 2141
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method710(); // L: 2144
							return 1; // L: 2145
						} else if (var0 == 3155) {
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 2148
							return 1; // L: 2149
						} else if (var0 == 3156) {
							return 1; // L: 2152
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2155
							return 1; // L: 2156
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2163
							return 1; // L: 2164
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2171
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2172
							return 1; // L: 2173
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2176
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3163) {
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 2181
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2182
							return 1; // L: 2183
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2186
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2187
							return 1; // L: 2188
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2191
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2192
							return 1; // L: 2193
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2196
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2201
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2202
							return 1; // L: 2203
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2206
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2207
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2208
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2209
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2210
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2211
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2212
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2213
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2214
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 2215
							return 1; // L: 2216
						} else if (var0 == 3169) {
							return 1; // L: 2219
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2222
							return 1; // L: 2223
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2230
							return 1; // L: 2231
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2234
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3176) {
							return 1; // L: 2247
						} else if (var0 == 3177) {
							return 1; // L: 2250
						} else if (var0 == 3178) {
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 2253
							return 1; // L: 2254
						} else if (var0 == 3179) {
							return 1; // L: 2257
						} else if (var0 == 3180) {
							--SecureRandomCallable.Interpreter_stringStackSize; // L: 2260
							return 1; // L: 2261
						} else if (var0 == 3181) {
							ApproximateRouteStrategy.method1205(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2264
							return 1; // L: 2265
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class103.method2714(); // L: 2268
							return 1; // L: 2269
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2272
							DevicePcmPlayerProvider.method323(var3); // L: 2273
							return 1; // L: 2274
						} else {
							return 2; // L: 2276
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZS)I",
		garbageValue = "-23771"
	)
	static int method6686(int var0, Script var1, boolean var2) {
		if (var0 == 6809) { // L: 5034
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5035
			ObjectComposition var4 = class144.getObjectDefinition(var3); // L: 5036
			Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 5037
			return 1; // L: 5038
		} else {
			return 2; // L: 5040
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "-25"
	)
	static final void method6684(Actor var0) {
		var0.isWalking = false; // L: 4066
		if (var0.movementSequence != -1) { // L: 4067
			SequenceDefinition var1 = ItemContainer.SequenceDefinition_get(var0.movementSequence); // L: 4068
			if (var1 != null) { // L: 4069
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4070
					++var0.field1178; // L: 4071
					if (var0.movementFrame < var1.frameIds.length && var0.field1178 > var1.frameLengths[var0.movementFrame]) { // L: 4072
						var0.field1178 = 1; // L: 4073
						++var0.movementFrame; // L: 4074
						class287.method5696(var1, var0.movementFrame, var0.x, var0.y); // L: 4075
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4077
						if (var1.frameCount > 0) { // L: 4078
							var0.movementFrame -= var1.frameCount; // L: 4079
							if (var1.field2307) { // L: 4080
								++var0.field1179;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2307 && var0.field1179 >= var1.field2287) { // L: 4081
								var0.field1178 = 0; // L: 4082
								var0.movementFrame = 0; // L: 4083
								var0.field1179 = 0; // L: 4084
							}
						} else {
							var0.field1178 = 0; // L: 4088
							var0.movementFrame = 0; // L: 4089
						}

						class287.method5696(var1, var0.movementFrame, var0.x, var0.y); // L: 4091
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4094
					++var0.movementFrame; // L: 4095
					int var2 = var1.method4135(); // L: 4096
					if (var0.movementFrame < var2) { // L: 4097
						class25.method386(var1, var0.movementFrame, var0.x, var0.y); // L: 4098
					} else {
						if (var1.frameCount > 0) { // L: 4101
							var0.movementFrame -= var1.frameCount; // L: 4102
							if (var1.field2307) { // L: 4103
								++var0.field1179;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2307 && var0.field1179 >= var1.field2287) { // L: 4104
								var0.movementFrame = 0; // L: 4105
								var0.field1178 = 0; // L: 4106
								var0.field1179 = 0; // L: 4107
							}
						} else {
							var0.field1178 = 0; // L: 4111
							var0.movementFrame = 0; // L: 4112
						}

						class25.method386(var1, var0.movementFrame, var0.x, var0.y); // L: 4114
					}
				} else {
					var0.movementSequence = -1; // L: 4117
				}
			} else {
				var0.movementSequence = -1; // L: 4119
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2376()); // L: 4121

		int var3;
		for (class511 var6 = (class511)var7.method8686(); var6 != null; var6 = (class511)var7.next()) { // L: 4122
			if (var6.field5143 != -1 && Client.cycle >= var6.field5144) { // L: 4123
				var3 = ItemContainer.SpotAnimationDefinition_get(var6.field5143).sequence; // L: 4126
				if (var3 == -1) { // L: 4127
					var6.remove(); // L: 4128
					--var0.field1202; // L: 4129
				} else {
					var6.field5142 = Math.max(var6.field5142, 0); // L: 4132
					SequenceDefinition var4 = ItemContainer.SequenceDefinition_get(var3); // L: 4133
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4134
						++var6.field5141; // L: 4135
						if (var6.field5142 < var4.frameIds.length && var6.field5141 > var4.frameLengths[var6.field5142]) { // L: 4136
							var6.field5141 = 1; // L: 4137
							++var6.field5142; // L: 4138
							class287.method5696(var4, var6.field5142, var0.x, var0.y); // L: 4139
						}

						if (var6.field5142 >= var4.frameIds.length) { // L: 4141
							var6.remove(); // L: 4142
							--var0.field1202; // L: 4143
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4146
						++var6.field5142; // L: 4147
						int var5 = var4.method4135(); // L: 4148
						if (var6.field5142 < var5) { // L: 4149
							class25.method386(var4, var6.field5142, var0.x, var0.y); // L: 4150
						} else {
							var6.remove(); // L: 4153
							--var0.field1202; // L: 4154
						}
					} else {
						var6.remove(); // L: 4158
						--var0.field1202; // L: 4159
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4162
			var8 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 4163
			if (var8.field2312 == 1 && var0.field1210 > 0 && var0.spotAnimation <= Client.cycle && var0.field1192 < Client.cycle) { // L: 4164 4165
				var0.sequenceDelay = 1; // L: 4166
				return; // L: 4167
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4171
			var8 = ItemContainer.SequenceDefinition_get(var0.sequence); // L: 4172
			if (var8 != null) { // L: 4173
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4174
					++var0.sequenceFrameCycle; // L: 4175
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4176
						var0.sequenceFrameCycle = 1; // L: 4177
						++var0.sequenceFrame; // L: 4178
						class287.method5696(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4179
					}

					if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4181
						var0.sequenceFrame -= var8.frameCount; // L: 4182
						++var0.field1184; // L: 4183
						if (var0.field1184 >= var8.field2287) { // L: 4184
							var0.sequence = -1; // L: 4185
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4187
							class287.method5696(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4191
						} else {
							var0.sequence = -1; // L: 4188
						}
					}

					var0.isWalking = var8.field2306; // L: 4194
				} else if (var8.isCachedModelIdSet()) { // L: 4196
					++var0.sequenceFrame; // L: 4197
					var3 = var8.method4135(); // L: 4198
					if (var0.sequenceFrame < var3) { // L: 4199
						class25.method386(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4200
					} else {
						var0.sequenceFrame -= var8.frameCount; // L: 4203
						++var0.field1184; // L: 4204
						if (var0.field1184 >= var8.field2287) { // L: 4205
							var0.sequence = -1; // L: 4206
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4208
							class25.method386(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4212
						} else {
							var0.sequence = -1; // L: 4209
						}
					}
				} else {
					var0.sequence = -1; // L: 4216
				}
			} else {
				var0.sequence = -1; // L: 4218
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay; // L: 4220
		}

	} // L: 4221
}
