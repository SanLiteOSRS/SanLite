import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eu")
public class class107 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1359;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1347;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1349;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1350;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1351;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1357;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1353;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1348;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1355;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1356;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1352;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1358;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1354;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1360;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1361;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class107 field1362;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1697772055
	)
	int field1363;

	static {
		field1359 = new class107(0);
		field1347 = new class107(1);
		field1349 = new class107(2); // L: 2077
		field1350 = new class107(3); // L: 2078
		field1351 = new class107(4);
		field1357 = new class107(5);
		field1353 = new class107(6); // L: 2081
		field1348 = new class107(7); // L: 2082
		field1355 = new class107(8);
		field1356 = new class107(9);
		field1352 = new class107(10); // L: 2085
		field1358 = new class107(11); // L: 2086
		field1354 = new class107(12);
		field1360 = new class107(13);
		field1361 = new class107(14);
		field1362 = new class107(15); // L: 2090
	}

	class107(int var1) {
		this.field1363 = var1;
	} // L: 2095

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnq;III)Ltm;",
		garbageValue = "-2013610782"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			UserComparator2.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		if (!var3) { // L: 48
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 51
			var5.width = class330.SpriteBuffer_spriteWidth; // L: 52
			var5.height = class489.SpriteBuffer_spriteHeight; // L: 53
			var5.xOffset = class515.SpriteBuffer_xOffsets[0]; // L: 54
			var5.yOffset = class402.SpriteBuffer_yOffsets[0]; // L: 55
			var5.subWidth = class515.SpriteBuffer_spriteWidths[0]; // L: 56
			var5.subHeight = class515.SpriteBuffer_spriteHeights[0]; // L: 57
			int var6 = var5.subWidth * var5.subHeight; // L: 58
			byte[] var7 = class515.SpriteBuffer_pixels[0]; // L: 59
			var5.pixels = new int[var6]; // L: 60

			for (int var8 = 0; var8 < var6; ++var8) { // L: 61
				var5.pixels[var8] = class515.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			TextureProvider.method4758(); // L: 62
			return var5; // L: 65
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-100"
	)
	static final int method2701(int var0, int var1) {
		int var2 = GrandExchangeEvents.method6803(var0 + 45365, 91923 + var1, 4) - 128 + (GrandExchangeEvents.method6803(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (GrandExchangeEvents.method6803(var0, var1, 1) - 128 >> 2); // L: 918
		var2 = (int)(0.3D * (double)var2) + 35; // L: 919
		if (var2 < 10) { // L: 920
			var2 = 10;
		} else if (var2 > 60) { // L: 921
			var2 = 60;
		}

		return var2; // L: 922
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-195406746"
	)
	static int method2700(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1878
			var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1879
			class59.addGameMessage(0, "", var7); // L: 1880
			return 1; // L: 1881
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1884
			ServerPacket.performPlayerAnimation(Projectile.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1885
			return 1; // L: 1886
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field875) { // L: 1889
				Interpreter.field852 = true; // L: 1890
			}

			return 1; // L: 1892
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1895
				var15 = 0; // L: 1896
				if (class146.isNumber(var7)) { // L: 1897
					var15 = TextureProvider.method4744(var7);
				}

				PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 1899
				var13.packetBuffer.writeInt(var15); // L: 1900
				Client.packetWriter.addNode(var13); // L: 1901
				return 1; // L: 1902
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1905
					var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 1907
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1908
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1909
					Client.packetWriter.addNode(var11); // L: 1910
					return 1; // L: 1911
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1914
					var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 1916
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1917
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1918
					Client.packetWriter.addNode(var11); // L: 1919
					return 1; // L: 1920
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1923
						var4 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1924
						class47.method845(var3, var4); // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1929
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1930
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1931
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1932
						Widget var14 = FriendSystem.getWidget(var9); // L: 1933
						UserComparator10.clickWidget(var14, var3, var15); // L: 1934
						return 1; // L: 1935
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1938
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1939
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1940
						Widget var12 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1941
						UserComparator10.clickWidget(var12, var3, var15); // L: 1942
						return 1; // L: 1943
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class305.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1946
						return 1; // L: 1947
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2434() ? 1 : 0; // L: 1950
						return 1; // L: 1951
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class10.clientPreferences.method2489(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1954
						return 1; // L: 1955
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1958
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1959
						class27.openURL(var7, var8, false); // L: 1960
						return 1; // L: 1961
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1964
						var11 = ObjectComposition.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 1966
						var11.packetBuffer.writeShort(var3); // L: 1967
						Client.packetWriter.addNode(var11); // L: 1968
						return 1; // L: 1969
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1972
						class149.Interpreter_stringStackSize -= 2; // L: 1973
						var4 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize]; // L: 1974
						String var5 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1]; // L: 1975
						if (var4.length() > 500) { // L: 1976
							return 1;
						} else if (var5.length() > 500) { // L: 1977
							return 1;
						} else {
							PacketBufferNode var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 1978
							var6.packetBuffer.writeShort(1 + Widget.stringCp1252NullTerminatedByteSize(var4) + Widget.stringCp1252NullTerminatedByteSize(var5)); // L: 1979
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1980
							var6.packetBuffer.writeByte(var3); // L: 1981
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1982
							Client.packetWriter.addNode(var6); // L: 1983
							return 1; // L: 1984
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 1987
						return 1; // L: 1988
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1991
						return 1; // L: 1992
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field751 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1995
						return 1; // L: 1996
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 1999
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2000
						}

						return 1; // L: 2001
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2004
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2005
						}

						return 1; // L: 2006
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2009
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2010
						}

						return 1; // L: 2011
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2014
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2015
						}

						return 1; // L: 2016
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2019
						return 1; // L: 2020
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2023
						return 1; // L: 2024
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2027
						return 1; // L: 2028
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class105.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2031
						return 1; // L: 2032
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.getTapToDrop() ? 1 : 0; // L: 2035
						return 1; // L: 2036
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2039
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2040
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2041
						return 1; // L: 2042
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2045
						return 1; // L: 2046
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2049
						return 1; // L: 2050
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class448.canvasWidth; // L: 2053
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.canvasHeight; // L: 2054
						return 1; // L: 2055
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2058
						return 1; // L: 2059
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2062
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2065
						return 1; // L: 2066
					} else if (var0 == 3136) {
						Client.field517 = 3; // L: 2069
						Client.field613 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2070
						return 1; // L: 2071
					} else if (var0 == 3137) {
						Client.field517 = 2; // L: 2074
						Client.field613 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2075
						return 1; // L: 2076
					} else if (var0 == 3138) {
						Client.field517 = 0; // L: 2079
						return 1; // L: 2080
					} else if (var0 == 3139) {
						Client.field517 = 1; // L: 2083
						return 1; // L: 2084
					} else if (var0 == 3140) {
						Client.field517 = 3; // L: 2087
						Client.field613 = var2 ? class53.scriptDotWidget.id : Interpreter.field864.id; // L: 2088
						return 1; // L: 2089
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2092
							class10.clientPreferences.method2524(var10); // L: 2093
							return 1; // L: 2094
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2472() ? 1 : 0; // L: 2097
							return 1; // L: 2098
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2101
							Client.Login_isUsernameRemembered = var10; // L: 2102
							if (!var10) { // L: 2103
								class10.clientPreferences.method2432(""); // L: 2104
							}

							return 1; // L: 2106
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2109
							return 1; // L: 2110
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2113
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2116
							class10.clientPreferences.method2436(!var10); // L: 2117
							return 1; // L: 2118
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class10.clientPreferences.method2437() ? 0 : 1; // L: 2121
							return 1; // L: 2122
						} else if (var0 == 3148) {
							return 1; // L: 2125
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2128
							return 1; // L: 2129
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2132
							return 1; // L: 2133
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2140
							return 1; // L: 2141
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2144
							return 1; // L: 2145
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendLoginUpdate.method7786(); // L: 2148
							return 1; // L: 2149
						} else if (var0 == 3155) {
							--class149.Interpreter_stringStackSize; // L: 2152
							return 1; // L: 2153
						} else if (var0 == 3156) {
							return 1; // L: 2156
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2159
							return 1; // L: 2160
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2163
							return 1; // L: 2164
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2171
							return 1; // L: 2172
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2175
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2176
							return 1; // L: 2177
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2180
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3163) {
							--class149.Interpreter_stringStackSize; // L: 2185
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2186
							return 1; // L: 2187
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2190
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2191
							return 1; // L: 2192
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2195
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2196
							return 1; // L: 2197
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2200
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2205
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2206
							return 1; // L: 2207
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2210
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2211
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2212
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2213
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2214
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2215
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2216
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2217
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2218
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 2219
							return 1; // L: 2220
						} else if (var0 == 3169) {
							return 1; // L: 2223
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2230
							return 1; // L: 2231
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2234
							return 1; // L: 2235
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2238
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2247
							return 1; // L: 2248
						} else if (var0 == 3176) {
							return 1; // L: 2251
						} else if (var0 == 3177) {
							return 1; // L: 2254
						} else if (var0 == 3178) {
							--class149.Interpreter_stringStackSize; // L: 2257
							return 1; // L: 2258
						} else if (var0 == 3179) {
							return 1; // L: 2261
						} else if (var0 == 3180) {
							--class149.Interpreter_stringStackSize; // L: 2264
							return 1; // L: 2265
						} else if (var0 == 3181) {
							class164.method3366(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2268
							return 1; // L: 2269
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class60.method1119(); // L: 2272
							return 1; // L: 2273
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2276
							WorldMapIcon_1.method5068(var3); // L: 2277
							return 1; // L: 2278
						} else {
							return 2; // L: 2280
						}
					}
				}
			}
		}
	}
}
