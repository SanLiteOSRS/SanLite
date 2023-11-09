import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("du")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("ao")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1312515035
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("ai")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lct;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1551852755
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 108
	} // L: 111

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lct;",
		garbageValue = "-597460193"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 114

		for (int var6 = this.count; var6 > 0; --var6) { // L: 115
			if (var6 != 100) { // L: 116
				this.messages[var6] = this.messages[var6 - 1]; // L: 117
			}
		}

		if (var5 == null) { // L: 119
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 121
			var5.removeDual(); // L: 122
			var5.set(var1, var2, var4, var3); // L: 123
		}

		this.messages[0] = var5; // L: 125
		if (this.count < 100) { // L: 126
			++this.count;
		}

		return var5; // L: 127
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lct;",
		garbageValue = "-25"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 131 132
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1376119256"
	)
	@Export("size")
	int size() {
		return this.count; // L: 136
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	static void method2153() {
		try {
			File var0 = new File(class16.userHomeDirectory, "random.dat"); // L: 281
			int var2;
			if (var0.exists()) { // L: 282
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 283
			} else {
				label38:
				for (int var1 = 0; var1 < StudioGame.cacheSubPaths.length; ++var1) { // L: 286
					for (var2 = 0; var2 < class164.cacheParentPaths.length; ++var2) { // L: 287
						File var3 = new File(class164.cacheParentPaths[var2] + StudioGame.cacheSubPaths[var1] + File.separatorChar + "random.dat"); // L: 288
						if (var3.exists()) { // L: 289
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 290
							break label38; // L: 291
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 296
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 297
				var2 = var4.read(); // L: 298
				var4.seek(0L); // L: 299
				var4.write(var2); // L: 300
				var4.seek(0L); // L: 301
				var4.close(); // L: 302
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 303
			}
		} catch (IOException var5) { // L: 306
		}

	} // L: 307

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "52"
	)
	static int method2160(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1853
			var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1854
			MusicPatchNode.addGameMessage(0, "", var7); // L: 1855
			return 1; // L: 1856
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1859
			Language.performPlayerAnimation(BuddyRankComparator.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1860
			return 1; // L: 1861
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field836) { // L: 1864
				Interpreter.field835 = true; // L: 1865
			}

			return 1; // L: 1867
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1870
				var15 = 0; // L: 1871
				if (class162.isNumber(var7)) { // L: 1872
					var15 = GrandExchangeEvent.method6573(var7);
				}

				PacketBufferNode var13 = UserComparator9.getPacketBufferNode(ClientPacket.field3065, Client.packetWriter.isaacCipher); // L: 1874
				var13.packetBuffer.writeInt(var15); // L: 1875
				Client.packetWriter.addNode(var13); // L: 1876
				return 1; // L: 1877
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1880
					var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 1882
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1883
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1884
					Client.packetWriter.addNode(var11); // L: 1885
					return 1; // L: 1886
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1889
					var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3137, Client.packetWriter.isaacCipher); // L: 1891
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1892
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1893
					Client.packetWriter.addNode(var11); // L: 1894
					return 1; // L: 1895
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1898
						var4 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1899
						FontName.method8257(var3, var4); // L: 1900
						return 1; // L: 1901
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1904
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1905
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1906
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1907
						Widget var14 = WorldMapSection1.getWidget(var9); // L: 1908
						AbstractWorldMapData.clickWidget(var14, var3, var15); // L: 1909
						return 1; // L: 1910
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1913
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1914
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1915
						Widget var12 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1916
						AbstractWorldMapData.clickWidget(var12, var3, var15); // L: 1917
						return 1; // L: 1918
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class319.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1921
						return 1; // L: 1922
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.method2458() ? 1 : 0; // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						WorldMapSectionType.clientPreferences.method2432(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1929
						return 1; // L: 1930
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1933
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1934
						class25.openURL(var7, var8, false); // L: 1935
						return 1; // L: 1936
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1939
						var11 = UserComparator9.getPacketBufferNode(ClientPacket.field3146, Client.packetWriter.isaacCipher); // L: 1941
						var11.packetBuffer.writeShort(var3); // L: 1942
						Client.packetWriter.addNode(var11); // L: 1943
						return 1; // L: 1944
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1947
						HealthBar.Interpreter_stringStackSize -= 2; // L: 1948
						var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 1949
						String var5 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 1950
						if (var4.length() > 500) { // L: 1951
							return 1;
						} else if (var5.length() > 500) { // L: 1952
							return 1;
						} else {
							PacketBufferNode var6 = UserComparator9.getPacketBufferNode(ClientPacket.field3141, Client.packetWriter.isaacCipher); // L: 1953
							var6.packetBuffer.writeShort(1 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var4) + WorldMapLabel.stringCp1252NullTerminatedByteSize(var5)); // L: 1954
							var6.packetBuffer.writeIntME(var3); // L: 1955
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1956
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1957
							Client.packetWriter.addNode(var6); // L: 1958
							return 1; // L: 1959
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 1962
						return 1; // L: 1963
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1966
						return 1; // L: 1967
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1970
						return 1; // L: 1971
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1974
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1975
						}

						return 1; // L: 1976
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1979
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1980
						}

						return 1; // L: 1981
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1984
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1985
						}

						return 1; // L: 1986
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1989
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1990
						}

						return 1; // L: 1991
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1994
						return 1; // L: 1995
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1998
						return 1; // L: 1999
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2002
						return 1; // L: 2003
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						ClanSettings.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2006
						return 1; // L: 2007
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Coord.getTapToDrop() ? 1 : 0; // L: 2010
						return 1; // L: 2011
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2014
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2015
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2016
						return 1; // L: 2017
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2020
						return 1; // L: 2021
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2024
						return 1; // L: 2025
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 2028
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class143.canvasHeight; // L: 2029
						return 1; // L: 2030
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2033
						return 1; // L: 2034
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2037
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2040
						return 1; // L: 2041
					} else if (var0 == 3136) {
						Client.field648 = 3; // L: 2044
						Client.field763 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2045
						return 1; // L: 2046
					} else if (var0 == 3137) {
						Client.field648 = 2; // L: 2049
						Client.field763 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2050
						return 1; // L: 2051
					} else if (var0 == 3138) {
						Client.field648 = 0; // L: 2054
						return 1; // L: 2055
					} else if (var0 == 3139) {
						Client.field648 = 1; // L: 2058
						return 1; // L: 2059
					} else if (var0 == 3140) {
						Client.field648 = 3; // L: 2062
						Client.field763 = var2 ? GameObject.scriptDotWidget.id : SoundSystem.field319.id; // L: 2063
						return 1; // L: 2064
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2067
							WorldMapSectionType.clientPreferences.method2459(var10); // L: 2068
							return 1; // L: 2069
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.method2429() ? 1 : 0; // L: 2072
							return 1; // L: 2073
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2076
							Client.Login_isUsernameRemembered = var10; // L: 2077
							if (!var10) { // L: 2078
								WorldMapSectionType.clientPreferences.method2439(""); // L: 2079
							}

							return 1; // L: 2081
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2084
							return 1; // L: 2085
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2088
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2091
							WorldMapSectionType.clientPreferences.method2500(!var10); // L: 2092
							return 1; // L: 2093
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSectionType.clientPreferences.method2445() ? 0 : 1; // L: 2096
							return 1; // L: 2097
						} else if (var0 == 3148) {
							return 1; // L: 2100
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2103
							return 1; // L: 2104
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2107
							return 1; // L: 2108
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2115
							return 1; // L: 2116
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2119
							return 1; // L: 2120
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class13.method161(); // L: 2123
							return 1; // L: 2124
						} else if (var0 == 3155) {
							--HealthBar.Interpreter_stringStackSize; // L: 2127
							return 1; // L: 2128
						} else if (var0 == 3156) {
							return 1; // L: 2131
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2134
							return 1; // L: 2135
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2138
							return 1; // L: 2139
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2146
							return 1; // L: 2147
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2150
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2151
							return 1; // L: 2152
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2155
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2156
							return 1; // L: 2157
						} else if (var0 == 3163) {
							--HealthBar.Interpreter_stringStackSize; // L: 2160
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2161
							return 1; // L: 2162
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2165
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2166
							return 1; // L: 2167
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2170
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2171
							return 1; // L: 2172
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2175
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2176
							return 1; // L: 2177
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2180
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2185
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2186
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2187
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2188
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2189
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2190
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2191
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2192
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2193
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 2194
							return 1; // L: 2195
						} else if (var0 == 3169) {
							return 1; // L: 2198
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2209
							return 1; // L: 2210
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2213
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2214
							return 1; // L: 2215
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2222
							return 1; // L: 2223
						} else if (var0 == 3176) {
							return 1; // L: 2226
						} else if (var0 == 3177) {
							return 1; // L: 2229
						} else if (var0 == 3178) {
							--HealthBar.Interpreter_stringStackSize; // L: 2232
							return 1; // L: 2233
						} else if (var0 == 3179) {
							return 1; // L: 2236
						} else if (var0 == 3180) {
							--HealthBar.Interpreter_stringStackSize; // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3181) {
							Skeleton.method4384(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NetCache.method6534(); // L: 2247
							return 1; // L: 2248
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2251
							PacketWriter.method2787(var3); // L: 2252
							return 1; // L: 2253
						} else {
							return 2; // L: 2255
						}
					}
				}
			}
		}
	}
}
