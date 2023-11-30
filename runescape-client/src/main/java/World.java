import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("World")
public class World {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1768632755
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 108763597
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ac")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("al")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 30174039
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1397081557
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1175567269
	)
	@Export("population")
	int population;
	@ObfuscatedName("as")
	@Export("host")
	String host;
	@ObfuscatedName("ay")
	@Export("activity")
	String activity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -411506225
	)
	@Export("location")
	int location;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1981623765
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	String field808;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 28

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-98"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class522.field5096.rsOrdinal() & this.properties) != 0; // L: 258
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class522.field5109.rsOrdinal() & this.properties) != 0; // L: 262
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "25"
	)
	boolean method1853() {
		return (class522.field5114.rsOrdinal() & this.properties) != 0; // L: 266
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092493983"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class522.field5095.rsOrdinal() & this.properties) != 0; // L: 270
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1744253846"
	)
	boolean method1896() {
		return (class522.field5108.rsOrdinal() & this.properties) != 0; // L: 274
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "1917"
	)
	boolean method1856() {
		return (class522.field5122.rsOrdinal() & this.properties) != 0; // L: 278
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1429834032"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class522.field5111.rsOrdinal() & this.properties) != 0; // L: 282
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "893660966"
	)
	boolean method1858() {
		return (class522.field5123.rsOrdinal() & this.properties) != 0; // L: 286
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	boolean method1859() {
		return (class522.field5094.rsOrdinal() & this.properties) != 0; // L: 290
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	boolean method1869() {
		return (class522.field5120.rsOrdinal() & this.properties) != 0; // L: 294
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1248471414"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 165
		int var4 = 0; // L: 166

		for (int var5 = 0; var5 < var2; ++var5) { // L: 167
			int var6 = var0[var5 + var1] & 255; // L: 168
			if (var6 != 0) { // L: 169
				if (var6 >= 128 && var6 < 160) { // L: 170
					char var7 = class396.cp1252AsciiExtension[var6 - 128]; // L: 171
					if (var7 == 0) { // L: 172
						var7 = '?';
					}

					var6 = var7; // L: 173
				}

				var3[var4++] = (char)var6; // L: 175
			}
		}

		return new String(var3, 0, var4); // L: 177
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1960092148"
	)
	static int method1899(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1892
			var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1893
			GrandExchangeOfferUnitPriceComparator.addGameMessage(0, "", var7); // L: 1894
			return 1; // L: 1895
		} else if (var0 == ScriptOpcodes.ANIM) {
			class517.Interpreter_intStackSize -= 2; // L: 1898
			WorldMapLabelSize.performPlayerAnimation(class229.localPlayer, Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 1899
			return 1; // L: 1900
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field842) { // L: 1903
				Interpreter.field846 = true; // L: 1904
			}

			return 1; // L: 1906
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1909
				var15 = 0; // L: 1910
				if (ClientPacket.isNumber(var7)) { // L: 1911
					var15 = Huffman.method6840(var7);
				}

				PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher); // L: 1913
				var13.packetBuffer.writeInt(var15); // L: 1914
				Client.packetWriter.addNode(var13); // L: 1915
				return 1; // L: 1916
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1919
					var11 = class113.getPacketBufferNode(ClientPacket.field3221, Client.packetWriter.isaacCipher); // L: 1921
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1922
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1923
					Client.packetWriter.addNode(var11); // L: 1924
					return 1; // L: 1925
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1928
					var11 = class113.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 1930
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1931
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1932
					Client.packetWriter.addNode(var11); // L: 1933
					return 1; // L: 1934
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1937
						var4 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1938
						class402.method7472(var3, var4); // L: 1939
						return 1; // L: 1940
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class517.Interpreter_intStackSize -= 3; // L: 1943
						var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1944
						var15 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1945
						int var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 1946
						Widget var14 = HealthBarDefinition.field1877.method6285(var9); // L: 1947
						HorizontalAlignment.clickWidget(var14, var3, var15); // L: 1948
						return 1; // L: 1949
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class517.Interpreter_intStackSize -= 2; // L: 1952
						var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 1953
						var15 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 1954
						Widget var12 = var2 ? Interpreter.scriptDotWidget : HealthBar.field1302; // L: 1955
						HorizontalAlignment.clickWidget(var12, var3, var15); // L: 1956
						return 1; // L: 1957
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class19.mouseCam = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 1960
						return 1; // L: 1961
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.method2541() ? 1 : 0; // L: 1964
						return 1; // L: 1965
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapIcon_1.clientPreferences.method2540(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1); // L: 1968
						return 1; // L: 1969
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 1972
						boolean var8 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 1973
						HealthBar.openURL(var7, var8, false); // L: 1974
						return 1; // L: 1975
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1978
						var11 = class113.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 1980
						var11.packetBuffer.writeShort(var3); // L: 1981
						Client.packetWriter.addNode(var11); // L: 1982
						return 1; // L: 1983
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 1986
						class127.Interpreter_stringStackSize -= 2; // L: 1987
						var4 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 1988
						String var5 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 1989
						if (var4.length() > 500) { // L: 1990
							return 1;
						} else if (var5.length() > 500) { // L: 1991
							return 1;
						} else {
							PacketBufferNode var6 = class113.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 1992
							var6.packetBuffer.writeShort(1 + ClanChannel.stringCp1252NullTerminatedByteSize(var4) + ClanChannel.stringCp1252NullTerminatedByteSize(var5)); // L: 1993
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1994
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1995
							var6.packetBuffer.method9290(var3); // L: 1996
							Client.packetWriter.addNode(var6); // L: 1997
							return 1; // L: 1998
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class517.Interpreter_intStackSize; // L: 2001
						return 1; // L: 2002
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2005
						return 1; // L: 2006
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field615 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2009
						return 1; // L: 2010
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1) { // L: 2013
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2014
						}

						return 1; // L: 2015
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1) { // L: 2018
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2019
						}

						return 1; // L: 2020
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1) { // L: 2023
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2024
						}

						return 1; // L: 2025
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1) { // L: 2028
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2029
						}

						return 1; // L: 2030
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2033
						return 1; // L: 2034
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2037
						return 1; // L: 2038
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2041
						return 1; // L: 2042
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						IgnoreList.setTapToDrop(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1); // L: 2045
						return 1; // L: 2046
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Strings.getTapToDrop() ? 1 : 0; // L: 2049
						return 1; // L: 2050
					} else if (var0 == 3129) {
						class517.Interpreter_intStackSize -= 2; // L: 2053
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 2054
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 2055
						return 1; // L: 2056
					} else if (var0 == 3130) {
						class517.Interpreter_intStackSize -= 2; // L: 2059
						return 1; // L: 2060
					} else if (var0 == 3131) {
						--class517.Interpreter_intStackSize; // L: 2063
						return 1; // L: 2064
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Language.canvasWidth; // L: 2067
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class47.canvasHeight; // L: 2068
						return 1; // L: 2069
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class517.Interpreter_intStackSize; // L: 2072
						return 1; // L: 2073
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2076
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class517.Interpreter_intStackSize -= 2; // L: 2079
						return 1; // L: 2080
					} else if (var0 == 3136) {
						Client.field659 = 3; // L: 2083
						Client.field660 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2084
						return 1; // L: 2085
					} else if (var0 == 3137) {
						Client.field659 = 2; // L: 2088
						Client.field660 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2089
						return 1; // L: 2090
					} else if (var0 == 3138) {
						Client.field659 = 0; // L: 2093
						return 1; // L: 2094
					} else if (var0 == 3139) {
						Client.field659 = 1; // L: 2097
						return 1; // L: 2098
					} else if (var0 == 3140) {
						Client.field659 = 3; // L: 2101
						Client.field660 = var2 ? Interpreter.scriptDotWidget.id : HealthBar.field1302.id; // L: 2102
						return 1; // L: 2103
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2106
							WorldMapIcon_1.clientPreferences.method2583(var10); // L: 2107
							return 1; // L: 2108
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.method2543() ? 1 : 0; // L: 2111
							return 1; // L: 2112
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2115
							Client.Login_isUsernameRemembered = var10; // L: 2116
							if (!var10) { // L: 2117
								WorldMapIcon_1.clientPreferences.method2586(""); // L: 2118
							}

							return 1; // L: 2120
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2123
							return 1; // L: 2124
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2127
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 2130
							WorldMapIcon_1.clientPreferences.method2571(!var10); // L: 2131
							return 1; // L: 2132
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.method2631() ? 0 : 1; // L: 2135
							return 1; // L: 2136
						} else if (var0 == 3148) {
							return 1; // L: 2139
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2146
							return 1; // L: 2147
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2150
							return 1; // L: 2151
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2154
							return 1; // L: 2155
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2158
							return 1; // L: 2159
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapData_1.method4797(); // L: 2162
							return 1; // L: 2163
						} else if (var0 == 3155) {
							--class127.Interpreter_stringStackSize; // L: 2166
							return 1; // L: 2167
						} else if (var0 == 3156) {
							return 1; // L: 2170
						} else if (var0 == 3157) {
							class517.Interpreter_intStackSize -= 2; // L: 2173
							return 1; // L: 2174
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3161) {
							--class517.Interpreter_intStackSize; // L: 2189
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2190
							return 1; // L: 2191
						} else if (var0 == 3162) {
							--class517.Interpreter_intStackSize; // L: 2194
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2195
							return 1; // L: 2196
						} else if (var0 == 3163) {
							--class127.Interpreter_stringStackSize; // L: 2199
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2200
							return 1; // L: 2201
						} else if (var0 == 3164) {
							--class517.Interpreter_intStackSize; // L: 2204
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3165) {
							--class517.Interpreter_intStackSize; // L: 2209
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3166) {
							class517.Interpreter_intStackSize -= 2; // L: 2214
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2215
							return 1; // L: 2216
						} else if (var0 == 3167) {
							class517.Interpreter_intStackSize -= 2; // L: 2219
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2220
							return 1; // L: 2221
						} else if (var0 == 3168) {
							class517.Interpreter_intStackSize -= 2; // L: 2224
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2225
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2226
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2227
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2228
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2229
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2230
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2231
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2232
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 2233
							return 1; // L: 2234
						} else if (var0 == 3169) {
							return 1; // L: 2237
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2240
							return 1; // L: 2241
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2244
							return 1; // L: 2245
						} else if (var0 == 3172) {
							--class517.Interpreter_intStackSize; // L: 2248
							return 1; // L: 2249
						} else if (var0 == 3173) {
							--class517.Interpreter_intStackSize; // L: 2252
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2253
							return 1; // L: 2254
						} else if (var0 == 3174) {
							--class517.Interpreter_intStackSize; // L: 2257
							return 1; // L: 2258
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 2261
							return 1; // L: 2262
						} else if (var0 == 3176) {
							return 1; // L: 2265
						} else if (var0 == 3177) {
							return 1; // L: 2268
						} else if (var0 == 3178) {
							--class127.Interpreter_stringStackSize; // L: 2271
							return 1; // L: 2272
						} else if (var0 == 3179) {
							return 1; // L: 2275
						} else if (var0 == 3180) {
							--class127.Interpreter_stringStackSize; // L: 2278
							return 1; // L: 2279
						} else if (var0 == 3181) {
							class311.method5940(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 2282
							return 1; // L: 2283
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class216.method4235(); // L: 2286
							return 1; // L: 2287
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 2290
							class240.method4808(var3); // L: 2291
							return 1; // L: 2292
						} else {
							return 2; // L: 2294
						}
					}
				}
			}
		}
	}
}
