import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jk")
public class class273 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3109;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3107;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3108;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3116;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3110;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3111;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3106;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3119;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3114;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3113;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3112;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3117;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3118;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final class273 field3121;
	@ObfuscatedName("fa")
	@Export("worldHost")
	static String worldHost;

	static {
		field3109 = new class273(5); // L: 5
		field3107 = new class273(4); // L: 6
		field3108 = new class273(5); // L: 7
		field3116 = new class273(7); // L: 8
		field3110 = new class273(5); // L: 9
		field3111 = new class273(15); // L: 10
		field3106 = new class273(14); // L: 11
		field3119 = new class273(4); // L: 12
		field3114 = new class273(6); // L: 13
		field3113 = new class273(2); // L: 14
		field3112 = new class273(16); // L: 15
		field3117 = new class273(4); // L: 16
		field3118 = new class273(5); // L: 17
		field3121 = new class273(8); // L: 18
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class273(int var1) {
	} // L: 24

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-201098025"
	)
	static int method5374(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1857
			var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1858
			MouseHandler.addGameMessage(0, "", var7); // L: 1859
			return 1; // L: 1860
		} else if (var0 == ScriptOpcodes.ANIM) {
			class379.Interpreter_intStackSize -= 2; // L: 1863
			FontName.performPlayerAnimation(class296.localPlayer, Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 1864
			return 1; // L: 1865
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field850) { // L: 1868
				Interpreter.field849 = true; // L: 1869
			}

			return 1; // L: 1871
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1874
				var16 = 0; // L: 1875
				if (WorldMapManager.isNumber(var7)) { // L: 1876
					var16 = class100.method2559(var7);
				}

				PacketBufferNode var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3032, Client.packetWriter.isaacCipher); // L: 1878
				var14.packetBuffer.writeInt(var16); // L: 1879
				Client.packetWriter.addNode(var14); // L: 1880
				return 1; // L: 1881
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1884
					var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3062, Client.packetWriter.isaacCipher); // L: 1886
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1887
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1888
					Client.packetWriter.addNode(var12); // L: 1889
					return 1; // L: 1890
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1893
					var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3094, Client.packetWriter.isaacCipher); // L: 1895
					var12.packetBuffer.writeByte(var7.length() + 1); // L: 1896
					var12.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1897
					Client.packetWriter.addNode(var12); // L: 1898
					return 1; // L: 1899
				} else {
					int var3;
					String var11;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1902
						var11 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1903
						class96.method2517(var3, var11); // L: 1904
						return 1; // L: 1905
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class379.Interpreter_intStackSize -= 3; // L: 1908
						var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 1909
						var16 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1910
						int var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 1911
						Widget var15 = class281.getWidget(var9); // L: 1912
						Huffman.clickWidget(var15, var3, var16); // L: 1913
						return 1; // L: 1914
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class379.Interpreter_intStackSize -= 2; // L: 1917
						var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 1918
						var16 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 1919
						Widget var13 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1920
						Huffman.clickWidget(var13, var3, var16); // L: 1921
						return 1; // L: 1922
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class82.mouseCam = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2452() ? 1 : 0; // L: 1929
						return 1; // L: 1930
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						BufferedSink.clientPreferences.method2378(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1); // L: 1933
						return 1; // L: 1934
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1937
						boolean var8 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1938
						UrlRequester.openURL(var7, var8, false); // L: 1939
						return 1; // L: 1940
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1943
						var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3081, Client.packetWriter.isaacCipher); // L: 1945
						var12.packetBuffer.writeShort(var3); // L: 1946
						Client.packetWriter.addNode(var12); // L: 1947
						return 1; // L: 1948
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1951
						class125.Interpreter_stringStackSize -= 2; // L: 1952
						var11 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 1953
						String var5 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 1954
						if (var11.length() > 500) { // L: 1955
							return 1;
						} else if (var5.length() > 500) { // L: 1956
							return 1;
						} else {
							PacketBufferNode var6 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3065, Client.packetWriter.isaacCipher); // L: 1957
							var6.packetBuffer.writeShort(1 + Actor.stringCp1252NullTerminatedByteSize(var11) + Actor.stringCp1252NullTerminatedByteSize(var5)); // L: 1958
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1959
							var6.packetBuffer.method8546(var3); // L: 1960
							var6.packetBuffer.writeStringCp1252NullTerminated(var11); // L: 1961
							Client.packetWriter.addNode(var6); // L: 1962
							return 1; // L: 1963
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1966
						return 1; // L: 1967
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1970
						return 1; // L: 1971
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 1974
						return 1; // L: 1975
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) { // L: 1978
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1979
						}

						return 1; // L: 1980
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) { // L: 1983
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1984
						}

						return 1; // L: 1985
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) { // L: 1988
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1989
						}

						return 1; // L: 1990
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) { // L: 1993
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1994
						}

						return 1; // L: 1995
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1998
						return 1; // L: 1999
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2002
						return 1; // L: 2003
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2006
						return 1; // L: 2007
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						IsaacCipher.setTapToDrop(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1); // L: 2010
						return 1; // L: 2011
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Tile.getTapToDrop() ? 1 : 0; // L: 2014
						return 1; // L: 2015
					} else if (var0 == 3129) {
						class379.Interpreter_intStackSize -= 2; // L: 2018
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 2019
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 2020
						return 1; // L: 2021
					} else if (var0 == 3130) {
						class379.Interpreter_intStackSize -= 2; // L: 2024
						return 1; // L: 2025
					} else if (var0 == 3131) {
						--class379.Interpreter_intStackSize; // L: 2028
						return 1; // L: 2029
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 2032
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.canvasHeight; // L: 2033
						return 1; // L: 2034
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class379.Interpreter_intStackSize; // L: 2037
						return 1; // L: 2038
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2041
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class379.Interpreter_intStackSize -= 2; // L: 2044
						return 1; // L: 2045
					} else if (var0 == 3136) {
						Client.field668 = 3; // L: 2048
						Client.field755 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2049
						return 1; // L: 2050
					} else if (var0 == 3137) {
						Client.field668 = 2; // L: 2053
						Client.field755 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2054
						return 1; // L: 2055
					} else if (var0 == 3138) {
						Client.field668 = 0; // L: 2058
						return 1; // L: 2059
					} else if (var0 == 3139) {
						Client.field668 = 1; // L: 2062
						return 1; // L: 2063
					} else if (var0 == 3140) {
						Client.field668 = 3; // L: 2066
						Client.field755 = var2 ? class140.scriptDotWidget.id : class136.field1589.id; // L: 2067
						return 1; // L: 2068
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2071
							BufferedSink.clientPreferences.method2430(var10); // L: 2072
							return 1; // L: 2073
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2381() ? 1 : 0; // L: 2076
							return 1; // L: 2077
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2080
							Client.Login_isUsernameRemembered = var10; // L: 2081
							if (!var10) { // L: 2082
								BufferedSink.clientPreferences.method2385(""); // L: 2083
							}

							return 1; // L: 2085
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2088
							return 1; // L: 2089
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2092
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 2095
							BufferedSink.clientPreferences.method2382(!var10); // L: 2096
							return 1; // L: 2097
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BufferedSink.clientPreferences.method2383() ? 0 : 1; // L: 2100
							return 1; // L: 2101
						} else if (var0 == 3148) {
							return 1; // L: 2104
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2107
							return 1; // L: 2108
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2115
							return 1; // L: 2116
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2119
							return 1; // L: 2120
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2123
							return 1; // L: 2124
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = PcmPlayer.method829(); // L: 2127
							return 1; // L: 2128
						} else if (var0 == 3155) {
							--class125.Interpreter_stringStackSize; // L: 2131
							return 1; // L: 2132
						} else if (var0 == 3156) {
							return 1; // L: 2135
						} else if (var0 == 3157) {
							class379.Interpreter_intStackSize -= 2; // L: 2138
							return 1; // L: 2139
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2146
							return 1; // L: 2147
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2150
							return 1; // L: 2151
						} else if (var0 == 3161) {
							--class379.Interpreter_intStackSize; // L: 2154
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2155
							return 1; // L: 2156
						} else if (var0 == 3162) {
							--class379.Interpreter_intStackSize; // L: 2159
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2160
							return 1; // L: 2161
						} else if (var0 == 3163) {
							--class125.Interpreter_stringStackSize; // L: 2164
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2165
							return 1; // L: 2166
						} else if (var0 == 3164) {
							--class379.Interpreter_intStackSize; // L: 2169
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2170
							return 1; // L: 2171
						} else if (var0 == 3165) {
							--class379.Interpreter_intStackSize; // L: 2174
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2175
							return 1; // L: 2176
						} else if (var0 == 3166) {
							class379.Interpreter_intStackSize -= 2; // L: 2179
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2180
							return 1; // L: 2181
						} else if (var0 == 3167) {
							class379.Interpreter_intStackSize -= 2; // L: 2184
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3168) {
							class379.Interpreter_intStackSize -= 2; // L: 2189
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2190
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2191
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2192
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2193
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2194
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2195
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2196
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2197
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 2198
							return 1; // L: 2199
						} else if (var0 == 3169) {
							return 1; // L: 2202
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2209
							return 1; // L: 2210
						} else if (var0 == 3172) {
							--class379.Interpreter_intStackSize; // L: 2213
							return 1; // L: 2214
						} else if (var0 == 3173) {
							--class379.Interpreter_intStackSize; // L: 2217
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3174) {
							--class379.Interpreter_intStackSize; // L: 2222
							return 1; // L: 2223
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3176) {
							return 1; // L: 2230
						} else if (var0 == 3177) {
							return 1; // L: 2233
						} else if (var0 == 3178) {
							--class125.Interpreter_stringStackSize; // L: 2236
							return 1; // L: 2237
						} else if (var0 == 3179) {
							return 1; // L: 2240
						} else if (var0 == 3180) {
							--class125.Interpreter_stringStackSize; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3181) {
							WorldMapData_0.method4676(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 2247
							return 1; // L: 2248
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class356.method6783(); // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2255
							SequenceDefinition var4 = WorldMapElement.SequenceDefinition_get(var3); // L: 2256
							if (var4.isCachedModelIdSet()) { // L: 2257
								ObjectComposition.method3734(var4.SequenceDefinition_cachedModelId); // L: 2258
							}

							return 1; // L: 2260
						} else {
							return 2; // L: 2262
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "469376671"
	)
	static int method5380(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4235
			class379.Interpreter_intStackSize -= 2; // L: 4236
			Client.field764 = (short)class298.method5728(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]); // L: 4237
			if (Client.field764 <= 0) { // L: 4238
				Client.field764 = 256;
			}

			Client.field649 = (short)class298.method5728(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 4239
			if (Client.field649 <= 0) { // L: 4240
				Client.field649 = 256;
			}

			return 1; // L: 4241
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4243
			class379.Interpreter_intStackSize -= 2; // L: 4244
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4245
			if (Client.zoomHeight <= 0) { // L: 4246
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4247
			if (Client.zoomWidth <= 0) { // L: 4248
				Client.zoomWidth = 320;
			}

			return 1; // L: 4249
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4251
			class379.Interpreter_intStackSize -= 4; // L: 4252
			Client.field601 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4253
			if (Client.field601 <= 0) { // L: 4254
				Client.field601 = 1;
			}

			Client.field769 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4255
			if (Client.field769 <= 0) { // L: 4256
				Client.field769 = 32767;
			} else if (Client.field769 < Client.field601) { // L: 4257
				Client.field769 = Client.field601;
			}

			Client.field562 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 4258
			if (Client.field562 <= 0) { // L: 4259
				Client.field562 = 1;
			}

			Client.field771 = (short)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 4260
			if (Client.field771 <= 0) { // L: 4261
				Client.field771 = 32767;
			} else if (Client.field771 < Client.field562) { // L: 4262
				Client.field771 = Client.field562;
			}

			return 1; // L: 4263
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4265
			if (Client.viewportWidget != null) { // L: 4266
				MouseHandler.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4267
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4268
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4269
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4272
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4273
			}

			return 1; // L: 4275
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4277
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4278
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4279
			return 1; // L: 4280
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4282
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class156.method3226(Client.field764); // L: 4283
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class156.method3226(Client.field649); // L: 4284
			return 1; // L: 4285
		} else if (var0 == 6220) { // L: 4287
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4288
			return 1; // L: 4289
		} else if (var0 == 6221) { // L: 4291
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4292
			return 1; // L: 4293
		} else if (var0 == 6222) { // L: 4295
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 4296
			return 1; // L: 4297
		} else if (var0 == 6223) { // L: 4299
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class10.canvasHeight; // L: 4300
			return 1; // L: 4301
		} else {
			return 2; // L: 4303
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-54"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (BufferedSink.clientPreferences.method2427() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3859
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3860
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3861
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3862
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3863
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3864
			++Client.soundEffectCount; // L: 3865
		}

	} // L: 3867
}
