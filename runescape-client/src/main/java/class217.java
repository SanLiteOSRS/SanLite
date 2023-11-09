import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
public class class217 {
	@ObfuscatedName("ig")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	class122[] field2517;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 968840143
	)
	int field2516;

	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V"
	)
	class217(Buffer var1, int var2) {
		this.field2517 = new class122[var2]; // L: 13
		this.field2516 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2517.length; ++var3) { // L: 15
			class122 var4 = new class122(this.field2516, var1, false); // L: 16
			this.field2517[var3] = var4; // L: 17
		}

		this.method4430(); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1141045260"
	)
	void method4430() {
		class122[] var1 = this.field2517; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class122 var3 = var1[var2]; // L: 26
			if (var3.field1491 >= 0) { // L: 28
				var3.field1500 = this.field2517[var3.field1491]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method4428() {
		return this.field2517.length; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ldc;",
		garbageValue = "-1083474755"
	)
	class122 method4425(int var1) {
		return var1 >= this.method4428() ? null : this.field2517[var1]; // L: 41 42 44
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldc;",
		garbageValue = "-24"
	)
	class122[] method4431() {
		return this.field2517; // L: 48
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lei;II)V",
		garbageValue = "76193627"
	)
	void method4443(class133 var1, int var2) {
		this.method4423(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lei;I[ZZI)V",
		garbageValue = "-1598359679"
	)
	void method4423(class133 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3117(); // L: 56
		int var6 = 0; // L: 57
		class122[] var7 = this.method4431(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class122 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3097(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1299309656"
	)
	static int method4444(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1849
			var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1850
			class280.addGameMessage(0, "", var7); // L: 1851
			return 1; // L: 1852
		} else if (var0 == ScriptOpcodes.ANIM) {
			class302.Interpreter_intStackSize -= 2; // L: 1855
			PendingSpawn.performPlayerAnimation(class387.localPlayer, Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 1856
			return 1; // L: 1857
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field866) { // L: 1860
				Interpreter.field851 = true; // L: 1861
			}

			return 1; // L: 1863
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1866
				var15 = 0; // L: 1867
				if (class142.isNumber(var7)) { // L: 1868
					var15 = WorldMapScaleHandler.method5468(var7);
				}

				PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 1870
				var13.packetBuffer.writeInt(var15); // L: 1871
				Client.packetWriter.addNode(var13); // L: 1872
				return 1; // L: 1873
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1876
					var11 = Renderable.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 1878
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1879
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1880
					Client.packetWriter.addNode(var11); // L: 1881
					return 1; // L: 1882
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1885
					var11 = Renderable.getPacketBufferNode(ClientPacket.field3063, Client.packetWriter.isaacCipher); // L: 1887
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1888
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1889
					Client.packetWriter.addNode(var11); // L: 1890
					return 1; // L: 1891
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1894
						var4 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1895
						WorldMapIcon_0.method5263(var3, var4); // L: 1896
						return 1; // L: 1897
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class302.Interpreter_intStackSize -= 3; // L: 1900
						var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 1901
						var15 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1902
						int var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 1903
						Widget var14 = class133.getWidget(var9); // L: 1904
						UserComparator9.clickWidget(var14, var3, var15); // L: 1905
						return 1; // L: 1906
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class302.Interpreter_intStackSize -= 2; // L: 1909
						var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 1910
						var15 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1911
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1912
						UserComparator9.clickWidget(var12, var3, var15); // L: 1913
						return 1; // L: 1914
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						FriendsChatMember.mouseCam = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1917
						return 1; // L: 1918
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2572() ? 1 : 0; // L: 1921
						return 1; // L: 1922
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						PacketWriter.clientPreferences.method2551(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1); // L: 1925
						return 1; // L: 1926
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 1929
						boolean var8 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1930
						AttackOption.openURL(var7, var8, false); // L: 1931
						return 1; // L: 1932
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1935
						var11 = Renderable.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 1937
						var11.packetBuffer.writeShort(var3); // L: 1938
						Client.packetWriter.addNode(var11); // L: 1939
						return 1; // L: 1940
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1943
						class20.Interpreter_stringStackSize -= 2; // L: 1944
						var4 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 1945
						String var5 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 1946
						if (var4.length() > 500) { // L: 1947
							return 1;
						} else if (var5.length() > 500) { // L: 1948
							return 1;
						} else {
							PacketBufferNode var6 = Renderable.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 1949
							var6.packetBuffer.writeShort(1 + class96.stringCp1252NullTerminatedByteSize(var4) + class96.stringCp1252NullTerminatedByteSize(var5)); // L: 1950
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1951
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1952
							var6.packetBuffer.method8673(var3); // L: 1953
							Client.packetWriter.addNode(var6); // L: 1954
							return 1; // L: 1955
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1958
						return 1; // L: 1959
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1962
						return 1; // L: 1963
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1966
						return 1; // L: 1967
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) { // L: 1970
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 1971
						}

						return 1; // L: 1972
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) { // L: 1975
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 1976
						}

						return 1; // L: 1977
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) { // L: 1980
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 1981
						}

						return 1; // L: 1982
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1) { // L: 1985
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 1986
						}

						return 1; // L: 1987
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 1990
						return 1; // L: 1991
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1994
						return 1; // L: 1995
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 1998
						return 1; // L: 1999
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class237.setTapToDrop(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1); // L: 2002
						return 1; // L: 2003
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Language.getTapToDrop() ? 1 : 0; // L: 2006
						return 1; // L: 2007
					} else if (var0 == 3129) {
						class302.Interpreter_intStackSize -= 2; // L: 2010
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 2011
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 2012
						return 1; // L: 2013
					} else if (var0 == 3130) {
						class302.Interpreter_intStackSize -= 2; // L: 2016
						return 1; // L: 2017
					} else if (var0 == 3131) {
						--class302.Interpreter_intStackSize; // L: 2020
						return 1; // L: 2021
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 2024
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class127.canvasHeight; // L: 2025
						return 1; // L: 2026
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class302.Interpreter_intStackSize; // L: 2029
						return 1; // L: 2030
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class302.Interpreter_intStackSize -= 2; // L: 2036
						return 1; // L: 2037
					} else if (var0 == 3136) {
						Client.field798 = 3; // L: 2040
						Client.field677 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2041
						return 1; // L: 2042
					} else if (var0 == 3137) {
						Client.field798 = 2; // L: 2045
						Client.field677 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2046
						return 1; // L: 2047
					} else if (var0 == 3138) {
						Client.field798 = 0; // L: 2050
						return 1; // L: 2051
					} else if (var0 == 3139) {
						Client.field798 = 1; // L: 2054
						return 1; // L: 2055
					} else if (var0 == 3140) {
						Client.field798 = 3; // L: 2058
						Client.field677 = var2 ? Interpreter.scriptDotWidget.id : class85.field1091.id; // L: 2059
						return 1; // L: 2060
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2063
							PacketWriter.clientPreferences.method2483(var10); // L: 2064
							return 1; // L: 2065
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2484() ? 1 : 0; // L: 2068
							return 1; // L: 2069
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2072
							Client.Login_isUsernameRemembered = var10; // L: 2073
							if (!var10) { // L: 2074
								PacketWriter.clientPreferences.method2500(""); // L: 2075
							}

							return 1; // L: 2077
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2080
							return 1; // L: 2081
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2084
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 2087
							PacketWriter.clientPreferences.method2563(!var10); // L: 2088
							return 1; // L: 2089
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = PacketWriter.clientPreferences.method2570() ? 0 : 1; // L: 2092
							return 1; // L: 2093
						} else if (var0 == 3148) {
							return 1; // L: 2096
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2099
							return 1; // L: 2100
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2103
							return 1; // L: 2104
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2107
							return 1; // L: 2108
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2111
							return 1; // L: 2112
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2115
							return 1; // L: 2116
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class120.method2977(); // L: 2119
							return 1; // L: 2120
						} else if (var0 == 3155) {
							--class20.Interpreter_stringStackSize; // L: 2123
							return 1; // L: 2124
						} else if (var0 == 3156) {
							return 1; // L: 2127
						} else if (var0 == 3157) {
							class302.Interpreter_intStackSize -= 2; // L: 2130
							return 1; // L: 2131
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2134
							return 1; // L: 2135
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2138
							return 1; // L: 2139
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == 3161) {
							--class302.Interpreter_intStackSize; // L: 2146
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2147
							return 1; // L: 2148
						} else if (var0 == 3162) {
							--class302.Interpreter_intStackSize; // L: 2151
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2152
							return 1; // L: 2153
						} else if (var0 == 3163) {
							--class20.Interpreter_stringStackSize; // L: 2156
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2157
							return 1; // L: 2158
						} else if (var0 == 3164) {
							--class302.Interpreter_intStackSize; // L: 2161
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2162
							return 1; // L: 2163
						} else if (var0 == 3165) {
							--class302.Interpreter_intStackSize; // L: 2166
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3166) {
							class302.Interpreter_intStackSize -= 2; // L: 2171
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2172
							return 1; // L: 2173
						} else if (var0 == 3167) {
							class302.Interpreter_intStackSize -= 2; // L: 2176
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3168) {
							class302.Interpreter_intStackSize -= 2; // L: 2181
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2182
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2183
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2184
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2185
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2186
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2187
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2188
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2189
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 2190
							return 1; // L: 2191
						} else if (var0 == 3169) {
							return 1; // L: 2194
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2201
							return 1; // L: 2202
						} else if (var0 == 3172) {
							--class302.Interpreter_intStackSize; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3173) {
							--class302.Interpreter_intStackSize; // L: 2209
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3174) {
							--class302.Interpreter_intStackSize; // L: 2214
							return 1; // L: 2215
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3176) {
							return 1; // L: 2222
						} else if (var0 == 3177) {
							return 1; // L: 2225
						} else if (var0 == 3178) {
							--class20.Interpreter_stringStackSize; // L: 2228
							return 1; // L: 2229
						} else if (var0 == 3179) {
							return 1; // L: 2232
						} else if (var0 == 3180) {
							--class20.Interpreter_stringStackSize; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3181) {
							LoginScreenAnimation.method2463(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 2239
							return 1; // L: 2240
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class463.method8510(); // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 2247
							Archive.method6515(var3); // L: 2248
							return 1; // L: 2249
						} else {
							return 2; // L: 2251
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZS)I",
		garbageValue = "10769"
	)
	static int method4426(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4226
			Client.logoutTimer = 250; // L: 4227
			return 1; // L: 4228
		} else {
			return 2; // L: 4230
		}
	}
}
