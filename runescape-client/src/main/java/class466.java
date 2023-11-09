import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rn")
public class class466 {
	@ObfuscatedName("ai")
	static int[] field4800;
	@ObfuscatedName("az")
	public static int[] field4795;
	@ObfuscatedName("ad")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static ClanSettings field4802;

	static {
		field4800 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4800[var0] = method8363(var0);
		}

		method8369(); // L: 16
	} // L: 17

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnv;",
		garbageValue = "3"
	)
	static class345[] method8362() {
		return new class345[]{class345.field3878, class345.field3879};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2141889570"
	)
	static final int method8363(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 24
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 25
		double var5 = (double)(var0 & 31) / 31.0D; // L: 26
		double var7 = var1; // L: 27
		if (var3 < var1) { // L: 28
			var7 = var3;
		}

		if (var5 < var7) { // L: 29
			var7 = var5;
		}

		double var9 = var1; // L: 30
		if (var3 > var1) { // L: 31
			var9 = var3;
		}

		if (var5 > var9) { // L: 32
			var9 = var5;
		}

		double var11 = 0.0D; // L: 33
		double var13 = 0.0D; // L: 34
		double var15 = (var9 + var7) / 2.0D; // L: 35
		if (var7 != var9) { // L: 36
			if (var15 < 0.5D) { // L: 37
				var13 = (var9 - var7) / (var7 + var9);
			}

			if (var15 >= 0.5D) { // L: 38
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) { // L: 39
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) { // L: 40
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) { // L: 41
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 43
		var17 &= 255; // L: 44
		double var18 = 256.0D * var13; // L: 45
		if (var18 < 0.0D) { // L: 46
			var18 = 0.0D;
		} else if (var18 > 255.0D) { // L: 47
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 48
			var18 /= 2.0D; // L: 49
			var18 = Math.floor(var18); // L: 50
		}

		if (var15 > 0.75D) { // L: 52
			var18 /= 2.0D; // L: 53
			var18 = Math.floor(var18); // L: 54
		}

		if (var15 > 0.85D) { // L: 56
			var18 /= 2.0D; // L: 57
			var18 = Math.floor(var18); // L: 58
		}

		if (var15 > 0.95D) { // L: 60
			var18 /= 2.0D; // L: 61
			var18 = Math.floor(var18); // L: 62
		}

		if (var15 > 0.995D) { // L: 64
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D); // L: 65
		return (var20 << 7) + (int)(var15 * 128.0D); // L: 66
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "861588431"
	)
	static void method8369() {
		if (field4795 == null) { // L: 70
			field4795 = new int[65536]; // L: 71
			double var0 = 0.949999988079071D; // L: 72

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 73
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 74
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D; // L: 75
				double var7 = (double)(var2 & 127) / 128.0D; // L: 76
				double var9 = var7; // L: 77
				double var11 = var7; // L: 78
				double var13 = var7; // L: 79
				if (0.0D != var5) { // L: 80
					double var15;
					if (var7 < 0.5D) { // L: 82
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var5 + var7 - var5 * var7; // L: 83
					}

					double var17 = 2.0D * var7 - var15; // L: 84
					double var19 = var3 + 0.3333333333333333D; // L: 85
					if (var19 > 1.0D) { // L: 86
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 88
					if (var23 < 0.0D) { // L: 89
						++var23;
					}

					if (var19 * 6.0D < 1.0D) { // L: 90
						var9 = var19 * 6.0D * (var15 - var17) + var17;
					} else if (2.0D * var19 < 1.0D) { // L: 91
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) { // L: 92
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17; // L: 93
					}

					if (6.0D * var3 < 1.0D) { // L: 94
						var11 = var17 + (var15 - var17) * 6.0D * var3;
					} else if (2.0D * var3 < 1.0D) { // L: 95
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 96
						var11 = 6.0D * (var15 - var17) * (0.6666666666666666D - var3) + var17;
					} else {
						var11 = var17; // L: 97
					}

					if (6.0D * var23 < 1.0D) { // L: 98
						var13 = 6.0D * (var15 - var17) * var23 + var17;
					} else if (var23 * 2.0D < 1.0D) { // L: 99
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 100
						var13 = var17 + (0.6666666666666666D - var23) * (var15 - var17) * 6.0D;
					} else {
						var13 = var17; // L: 101
					}
				}

				var9 = Math.pow(var9, var0); // L: 103
				var11 = Math.pow(var11, var0); // L: 104
				var13 = Math.pow(var13, var0); // L: 105
				int var25 = (int)(256.0D * var9); // L: 106
				int var16 = (int)(256.0D * var11); // L: 107
				int var26 = (int)(256.0D * var13); // L: 108
				int var18 = var26 + (var16 << 8) + (var25 << 16); // L: 109
				field4795[var2] = var18 & 16777215; // L: 110
			}

		}
	} // L: 112

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "294804302"
	)
	public static int method8365(int var0) {
		return 255 - (var0 & 255); // L: 115
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	static int method8377() {
		return Login.loginIndex;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-734620102"
	)
	static int method8373(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1882
			var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1883
			MouseHandler.addGameMessage(0, "", var7); // L: 1884
			return 1; // L: 1885
		} else if (var0 == ScriptOpcodes.ANIM) {
			SoundCache.Interpreter_intStackSize -= 2; // L: 1888
			LoginType.performPlayerAnimation(VarbitComposition.localPlayer, Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize], Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 1889
			return 1; // L: 1890
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field887) { // L: 1893
				Interpreter.field893 = true; // L: 1894
			}

			return 1; // L: 1896
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1899
				var15 = 0; // L: 1900
				if (class218.isNumber(var7)) { // L: 1901
					var15 = HealthBarUpdate.method2412(var7);
				}

				PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 1903
				var13.packetBuffer.writeInt(var15); // L: 1904
				Client.packetWriter.addNode(var13); // L: 1905
				return 1; // L: 1906
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1909
					var11 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 1911
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1912
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1913
					Client.packetWriter.addNode(var11); // L: 1914
					return 1; // L: 1915
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1918
					var11 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3205, Client.packetWriter.isaacCipher); // L: 1920
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1921
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1922
					Client.packetWriter.addNode(var11); // L: 1923
					return 1; // L: 1924
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1927
						var4 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1928
						class14.method175(var3, var4); // L: 1929
						return 1; // L: 1930
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						SoundCache.Interpreter_intStackSize -= 3; // L: 1933
						var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1934
						var15 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1935
						int var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 1936
						Widget var14 = class92.getWidget(var9); // L: 1937
						class227.clickWidget(var14, var3, var15); // L: 1938
						return 1; // L: 1939
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						SoundCache.Interpreter_intStackSize -= 2; // L: 1942
						var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 1943
						var15 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 1944
						Widget var12 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1945
						class227.clickWidget(var12, var3, var15); // L: 1946
						return 1; // L: 1947
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class183.mouseCam = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1950
						return 1; // L: 1951
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class449.clientPreferences.method2448() ? 1 : 0; // L: 1954
						return 1; // L: 1955
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class449.clientPreferences.method2447(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1); // L: 1958
						return 1; // L: 1959
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 1962
						boolean var8 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1963
						class30.openURL(var7, var8, false); // L: 1964
						return 1; // L: 1965
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1968
						var11 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher); // L: 1970
						var11.packetBuffer.writeShort(var3); // L: 1971
						Client.packetWriter.addNode(var11); // L: 1972
						return 1; // L: 1973
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 1976
						class137.Interpreter_stringStackSize -= 2; // L: 1977
						var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 1978
						String var5 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 1979
						if (var4.length() > 500) { // L: 1980
							return 1;
						} else if (var5.length() > 500) { // L: 1981
							return 1;
						} else {
							PacketBufferNode var6 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 1982
							var6.packetBuffer.writeShort(1 + AbstractSocket.stringCp1252NullTerminatedByteSize(var4) + AbstractSocket.stringCp1252NullTerminatedByteSize(var5)); // L: 1983
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1984
							var6.packetBuffer.writeByte(var3); // L: 1985
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1986
							Client.packetWriter.addNode(var6); // L: 1987
							return 1; // L: 1988
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--SoundCache.Interpreter_intStackSize; // L: 1991
						return 1; // L: 1992
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1995
						return 1; // L: 1996
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field764 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 1999
						return 1; // L: 2000
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) { // L: 2003
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2004
						}

						return 1; // L: 2005
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) { // L: 2008
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2009
						}

						return 1; // L: 2010
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) { // L: 2013
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2014
						}

						return 1; // L: 2015
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) { // L: 2018
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2019
						}

						return 1; // L: 2020
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2023
						return 1; // L: 2024
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 2027
						return 1; // L: 2028
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 2031
						return 1; // L: 2032
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class14.setTapToDrop(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1); // L: 2035
						return 1; // L: 2036
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class30.getTapToDrop() ? 1 : 0; // L: 2039
						return 1; // L: 2040
					} else if (var0 == 3129) {
						SoundCache.Interpreter_intStackSize -= 2; // L: 2043
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 2044
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 2045
						return 1; // L: 2046
					} else if (var0 == 3130) {
						SoundCache.Interpreter_intStackSize -= 2; // L: 2049
						return 1; // L: 2050
					} else if (var0 == 3131) {
						--SoundCache.Interpreter_intStackSize; // L: 2053
						return 1; // L: 2054
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class113.canvasWidth; // L: 2057
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class177.canvasHeight; // L: 2058
						return 1; // L: 2059
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--SoundCache.Interpreter_intStackSize; // L: 2062
						return 1; // L: 2063
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2066
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						SoundCache.Interpreter_intStackSize -= 2; // L: 2069
						return 1; // L: 2070
					} else if (var0 == 3136) {
						Client.field540 = 3; // L: 2073
						Client.field701 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2074
						return 1; // L: 2075
					} else if (var0 == 3137) {
						Client.field540 = 2; // L: 2078
						Client.field701 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2079
						return 1; // L: 2080
					} else if (var0 == 3138) {
						Client.field540 = 0; // L: 2083
						return 1; // L: 2084
					} else if (var0 == 3139) {
						Client.field540 = 1; // L: 2087
						return 1; // L: 2088
					} else if (var0 == 3140) {
						Client.field540 = 3; // L: 2091
						Client.field701 = var2 ? GameObject.scriptDotWidget.id : SceneTilePaint.field2808.id; // L: 2092
						return 1; // L: 2093
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 2096
							class449.clientPreferences.method2494(var10); // L: 2097
							return 1; // L: 2098
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class449.clientPreferences.method2454() ? 1 : 0; // L: 2101
							return 1; // L: 2102
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 2105
							Client.Login_isUsernameRemembered = var10; // L: 2106
							if (!var10) { // L: 2107
								class449.clientPreferences.method2465(""); // L: 2108
							}

							return 1; // L: 2110
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2113
							return 1; // L: 2114
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2117
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 2120
							class449.clientPreferences.method2474(!var10); // L: 2121
							return 1; // L: 2122
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class449.clientPreferences.method2484() ? 0 : 1; // L: 2125
							return 1; // L: 2126
						} else if (var0 == 3148) {
							return 1; // L: 2129
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2132
							return 1; // L: 2133
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2136
							return 1; // L: 2137
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2140
							return 1; // L: 2141
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2144
							return 1; // L: 2145
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2148
							return 1; // L: 2149
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = FriendSystem.method1917(); // L: 2152
							return 1; // L: 2153
						} else if (var0 == 3155) {
							--class137.Interpreter_stringStackSize; // L: 2156
							return 1; // L: 2157
						} else if (var0 == 3156) {
							return 1; // L: 2160
						} else if (var0 == 3157) {
							SoundCache.Interpreter_intStackSize -= 2; // L: 2163
							return 1; // L: 2164
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2167
							return 1; // L: 2168
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2171
							return 1; // L: 2172
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2175
							return 1; // L: 2176
						} else if (var0 == 3161) {
							--SoundCache.Interpreter_intStackSize; // L: 2179
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2180
							return 1; // L: 2181
						} else if (var0 == 3162) {
							--SoundCache.Interpreter_intStackSize; // L: 2184
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3163) {
							--class137.Interpreter_stringStackSize; // L: 2189
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2190
							return 1; // L: 2191
						} else if (var0 == 3164) {
							--SoundCache.Interpreter_intStackSize; // L: 2194
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2195
							return 1; // L: 2196
						} else if (var0 == 3165) {
							--SoundCache.Interpreter_intStackSize; // L: 2199
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2200
							return 1; // L: 2201
						} else if (var0 == 3166) {
							SoundCache.Interpreter_intStackSize -= 2; // L: 2204
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2205
							return 1; // L: 2206
						} else if (var0 == 3167) {
							SoundCache.Interpreter_intStackSize -= 2; // L: 2209
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3168) {
							SoundCache.Interpreter_intStackSize -= 2; // L: 2214
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2215
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2216
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2217
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2218
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2219
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2220
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2221
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2222
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 2223
							return 1; // L: 2224
						} else if (var0 == 3169) {
							return 1; // L: 2227
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2230
							return 1; // L: 2231
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2234
							return 1; // L: 2235
						} else if (var0 == 3172) {
							--SoundCache.Interpreter_intStackSize; // L: 2238
							return 1; // L: 2239
						} else if (var0 == 3173) {
							--SoundCache.Interpreter_intStackSize; // L: 2242
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3174) {
							--SoundCache.Interpreter_intStackSize; // L: 2247
							return 1; // L: 2248
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3176) {
							return 1; // L: 2255
						} else if (var0 == 3177) {
							return 1; // L: 2258
						} else if (var0 == 3178) {
							--class137.Interpreter_stringStackSize; // L: 2261
							return 1; // L: 2262
						} else if (var0 == 3179) {
							return 1; // L: 2265
						} else if (var0 == 3180) {
							--class137.Interpreter_stringStackSize; // L: 2268
							return 1; // L: 2269
						} else if (var0 == 3181) {
							class20.method304(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 2272
							return 1; // L: 2273
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = PlayerType.method6627(); // L: 2276
							return 1; // L: 2277
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 2280
							FontName.method8701(var3); // L: 2281
							return 1; // L: 2282
						} else {
							return 2; // L: 2284
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1811966721"
	)
	static int method8376(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4375
			SoundCache.Interpreter_intStackSize -= 2; // L: 4376
			var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4377
			int var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4378
			if (!Client.isCameraLocked) { // L: 4379
				Client.camAngleX = var3; // L: 4380
				Client.camAngleY = var4; // L: 4381
			}

			return 1; // L: 4383
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4385
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4386
			return 1; // L: 4387
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4389
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4390
			return 1; // L: 4391
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4393
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4394
			if (var3 < 0) { // L: 4395
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4396
			return 1; // L: 4397
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4399
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4400
			return 1; // L: 4401
		} else {
			return 2; // L: 4403
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Ljava/lang/String;I)V",
		garbageValue = "88867976"
	)
	static void method8374(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1484
		Client.archiveLoaders.add(var2); // L: 1485
		Client.field827 += var2.groupCount; // L: 1486
	} // L: 1487

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-2084"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 10111
		var2.packetBuffer.writeIntME(var0); // L: 10112
		var2.packetBuffer.method9239(var1); // L: 10113
		Client.packetWriter.addNode(var2); // L: 10114
	} // L: 10115
}
