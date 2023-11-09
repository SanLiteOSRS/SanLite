import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
public class class9 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	public static final class9 field43;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	public static final class9 field37;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	static final class9 field40;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	static final class9 field39;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	static final class9 field36;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 591829005
	)
	int field41;
	@ObfuscatedName("ag")
	String field42;
	@ObfuscatedName("az")
	boolean field44;
	@ObfuscatedName("av")
	boolean field38;

	static {
		field43 = new class9(0, "POST", true, true); // L: 6
		field37 = new class9(1, "GET", true, false); // L: 7
		field40 = new class9(2, "PUT", false, true); // L: 8
		field39 = new class9(3, "PATCH", false, true); // L: 9
		field36 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field41 = var1; // L: 17
		this.field42 = var2; // L: 18
		this.field44 = var3; // L: 19
		this.field38 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method69() {
		return this.field44; // L: 24
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field41; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "9"
	)
	public String method73() {
		return this.field42; // L: 28
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-336603283"
	)
	boolean method71() {
		return this.field38; // L: 32
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-544781798"
	)
	static int method83(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1072
		Widget var4;
		if (var0 >= 2000) { // L: 1074
			var0 -= 1000; // L: 1075
			var4 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1076
			var3 = false; // L: 1077
		} else {
			var4 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1079
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1080
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1081
			if (var11 >= 0 && var11 <= 9) { // L: 1082
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]); // L: 1086
				return 1; // L: 1087
			} else {
				--Interpreter.Interpreter_stringStackSize; // L: 1083
				return 1; // L: 1084
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1089
				Interpreter.Interpreter_intStackSize -= 2; // L: 1090
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1091
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1092
				var4.parent = MouseRecorder.getWidgetChild(var11, var6); // L: 1093
				return 1; // L: 1094
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1096
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1097
				return 1; // L: 1098
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1100
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1101
				return 1; // L: 1102
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1104
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1105
				return 1; // L: 1106
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1108
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1109
				return 1; // L: 1110
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1112
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1113
				return 1; // L: 1114
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1116
				var4.actions = null; // L: 1117
				return 1; // L: 1118
			} else if (var0 == 1308) { // L: 1120
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1121
				return 1; // L: 1122
			} else if (var0 == 1309) { // L: 1124
				--Interpreter.Interpreter_intStackSize; // L: 1125
				return 1; // L: 1126
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1128
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1158
						Interpreter.Interpreter_intStackSize -= 2; // L: 1159
						var5 = 10; // L: 1160
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1161
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1162
						class400.Widget_setKey(var4, var5, var8, var9); // L: 1163
						return 1; // L: 1164
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1166
						Interpreter.Interpreter_intStackSize -= 3; // L: 1167
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1168
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1169
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1170
						if (var11 >= 0 && var11 <= 9) { // L: 1171
							Clock.Widget_setKeyRate(var4, var11, var6, var7); // L: 1174
							return 1; // L: 1175
						} else {
							throw new RuntimeException(); // L: 1172
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1177
						var5 = 10; // L: 1178
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1179
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1180
						Clock.Widget_setKeyRate(var4, var5, var6, var7); // L: 1181
						return 1; // L: 1182
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1184
						--Interpreter.Interpreter_intStackSize; // L: 1185
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1186
						if (var11 >= 0 && var11 <= 9) { // L: 1187
							GraphicsObject.Widget_setKeyIgnoreHeld(var4, var11); // L: 1190
							return 1; // L: 1191
						} else {
							throw new RuntimeException(); // L: 1188
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1193
						var5 = 10; // L: 1194
						GraphicsObject.Widget_setKeyIgnoreHeld(var4, var5); // L: 1195
						return 1; // L: 1196
					} else {
						return 2; // L: 1198
					}
				} else {
					byte[] var10 = null; // L: 1129
					var8 = null; // L: 1130
					if (var3) { // L: 1131
						Interpreter.Interpreter_intStackSize -= 10; // L: 1132

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1134 1135
						}

						if (var7 > 0) { // L: 1137
							var10 = new byte[var7 / 2]; // L: 1138
							var8 = new byte[var7 / 2]; // L: 1139

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1140
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1141
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1142
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1147
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1148
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1149
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1151
					if (var7 >= 0 && var7 <= 9) { // L: 1152
						class400.Widget_setKey(var4, var7, var10, var8); // L: 1155
						return 1; // L: 1156
					} else {
						throw new RuntimeException(); // L: 1153
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "193514493"
	)
	static int method77(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1879
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1880
			class415.addGameMessage(0, "", var7); // L: 1881
			return 1; // L: 1882
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1885
			WorldMapSectionType.performPlayerAnimation(class136.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1886
			return 1; // L: 1887
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field864) { // L: 1890
				Interpreter.field878 = true; // L: 1891
			}

			return 1; // L: 1893
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1896
				var15 = 0; // L: 1897
				if (Skeleton.isNumber(var7)) { // L: 1898
					var15 = class306.method5811(var7);
				}

				PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 1900
				var13.packetBuffer.writeInt(var15); // L: 1901
				Client.packetWriter.addNode(var13); // L: 1902
				return 1; // L: 1903
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1906
					var11 = class503.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 1908
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1909
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1910
					Client.packetWriter.addNode(var11); // L: 1911
					return 1; // L: 1912
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1915
					var11 = class503.getPacketBufferNode(ClientPacket.field3147, Client.packetWriter.isaacCipher); // L: 1917
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1918
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1919
					Client.packetWriter.addNode(var11); // L: 1920
					return 1; // L: 1921
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1924
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1925
						KeyHandler.method428(var3, var4); // L: 1926
						return 1; // L: 1927
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1930
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1931
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1932
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1933
						Widget var14 = VarbitComposition.getWidget(var9); // L: 1934
						class353.clickWidget(var14, var3, var15); // L: 1935
						return 1; // L: 1936
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1939
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1940
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1941
						Widget var12 = var2 ? class36.scriptDotWidget : class351.field3896; // L: 1942
						class353.clickWidget(var12, var3, var15); // L: 1943
						return 1; // L: 1944
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						KeyHandler.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1947
						return 1; // L: 1948
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.clientPreferences.method2465() ? 1 : 0; // L: 1951
						return 1; // L: 1952
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class150.clientPreferences.method2464(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1955
						return 1; // L: 1956
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 1959
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1960
						NPC.openURL(var7, var8, false); // L: 1961
						return 1; // L: 1962
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1965
						var11 = class503.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 1967
						var11.packetBuffer.writeShort(var3); // L: 1968
						Client.packetWriter.addNode(var11); // L: 1969
						return 1; // L: 1970
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1973
						Interpreter.Interpreter_stringStackSize -= 2; // L: 1974
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 1975
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 1976
						if (var4.length() > 500) { // L: 1977
							return 1;
						} else if (var5.length() > 500) { // L: 1978
							return 1;
						} else {
							PacketBufferNode var6 = class503.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 1979
							var6.packetBuffer.writeShort(1 + class501.stringCp1252NullTerminatedByteSize(var4) + class501.stringCp1252NullTerminatedByteSize(var5)); // L: 1980
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 1981
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 1982
							var6.packetBuffer.method9244(var3); // L: 1983
							Client.packetWriter.addNode(var6); // L: 1984
							return 1; // L: 1985
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 1988
						return 1; // L: 1989
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1992
						return 1; // L: 1993
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field766 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1996
						return 1; // L: 1997
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2000
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2001
						}

						return 1; // L: 2002
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2005
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2006
						}

						return 1; // L: 2007
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2010
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2011
						}

						return 1; // L: 2012
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2015
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2016
						}

						return 1; // L: 2017
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2020
						return 1; // L: 2021
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2024
						return 1; // L: 2025
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2028
						return 1; // L: 2029
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class335.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2032
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.getTapToDrop() ? 1 : 0; // L: 2036
						return 1; // L: 2037
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2040
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2041
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2042
						return 1; // L: 2043
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2046
						return 1; // L: 2047
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2050
						return 1; // L: 2051
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 2054
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.canvasHeight; // L: 2055
						return 1; // L: 2056
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2059
						return 1; // L: 2060
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2063
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2066
						return 1; // L: 2067
					} else if (var0 == 3136) {
						Client.field617 = 3; // L: 2070
						Client.field687 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2071
						return 1; // L: 2072
					} else if (var0 == 3137) {
						Client.field617 = 2; // L: 2075
						Client.field687 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2076
						return 1; // L: 2077
					} else if (var0 == 3138) {
						Client.field617 = 0; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3139) {
						Client.field617 = 1; // L: 2084
						return 1; // L: 2085
					} else if (var0 == 3140) {
						Client.field617 = 3; // L: 2088
						Client.field687 = var2 ? class36.scriptDotWidget.id : class351.field3896.id; // L: 2089
						return 1; // L: 2090
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2093
							class150.clientPreferences.method2529(var10); // L: 2094
							return 1; // L: 2095
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.clientPreferences.method2467() ? 1 : 0; // L: 2098
							return 1; // L: 2099
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2102
							Client.Login_isUsernameRemembered = var10; // L: 2103
							if (!var10) { // L: 2104
								class150.clientPreferences.method2482(""); // L: 2105
							}

							return 1; // L: 2107
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2110
							return 1; // L: 2111
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2114
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2117
							class150.clientPreferences.method2468(!var10); // L: 2118
							return 1; // L: 2119
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.clientPreferences.method2469() ? 0 : 1; // L: 2122
							return 1; // L: 2123
						} else if (var0 == 3148) {
							return 1; // L: 2126
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2129
							return 1; // L: 2130
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2133
							return 1; // L: 2134
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2137
							return 1; // L: 2138
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2141
							return 1; // L: 2142
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2145
							return 1; // L: 2146
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ClanChannel.method3388(); // L: 2149
							return 1; // L: 2150
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize; // L: 2153
							return 1; // L: 2154
						} else if (var0 == 3156) {
							return 1; // L: 2157
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2160
							return 1; // L: 2161
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2168
							return 1; // L: 2169
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2172
							return 1; // L: 2173
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2176
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2181
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2182
							return 1; // L: 2183
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize; // L: 2186
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2187
							return 1; // L: 2188
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2191
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2192
							return 1; // L: 2193
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2196
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2201
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2202
							return 1; // L: 2203
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2206
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2207
							return 1; // L: 2208
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2211
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2212
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2213
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2214
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2215
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2216
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2217
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2218
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2219
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 2220
							return 1; // L: 2221
						} else if (var0 == 3169) {
							return 1; // L: 2224
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2227
							return 1; // L: 2228
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2231
							return 1; // L: 2232
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2235
							return 1; // L: 2236
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2239
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2240
							return 1; // L: 2241
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2244
							return 1; // L: 2245
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2248
							return 1; // L: 2249
						} else if (var0 == 3176) {
							return 1; // L: 2252
						} else if (var0 == 3177) {
							return 1; // L: 2255
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize; // L: 2258
							return 1; // L: 2259
						} else if (var0 == 3179) {
							return 1; // L: 2262
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize; // L: 2265
							return 1; // L: 2266
						} else if (var0 == 3181) {
							UrlRequester.method2823(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2269
							return 1; // L: 2270
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagexCache.method3521(); // L: 2273
							return 1; // L: 2274
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2277
							class11.method113(var3); // L: 2278
							return 1; // L: 2279
						} else {
							return 2; // L: 2281
						}
					}
				}
			}
		}
	}
}
