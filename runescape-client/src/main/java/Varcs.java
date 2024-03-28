import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ed")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("af")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("at")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("an")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ao")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 6020857548756990525L
	)
	long field1422;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = UserComparator9.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = class235.method4468(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (UserComparator9.archive2.method6938(15)) { // L: 37
			var2 = UserComparator9.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-845777994"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 46
		}

	} // L: 47

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-23686"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-68"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-15701"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-83"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "73"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-469648831"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 80
			if (!this.intsPersistence[var1]) { // L: 81
				this.map.remove(var1); // L: 82
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 85
			this.strings[var1] = null; // L: 86
		}

	} // L: 88

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Ltz;",
		garbageValue = "-1187836801"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return ClanChannel.getPreferencesFile("2", HorizontalAlignment.field2089.name, var1); // L: 91
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2038734589"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 95

		try {
			int var2 = 3; // L: 97
			int var3 = 0; // L: 98
			Iterator var4 = this.map.entrySet().iterator(); // L: 99

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 100
				int var6 = (Integer)var5.getKey(); // L: 102
				if (this.intsPersistence[var6]) { // L: 103
					Object var7 = var5.getValue(); // L: 104
					var2 += 3; // L: 105
					if (var7 instanceof Integer) { // L: 106
						var2 += 4;
					} else if (var7 instanceof String) { // L: 107
						var2 += SequenceDefinition.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 108
				}
			}

			Buffer var27 = new Buffer(var2); // L: 112
			var27.writeByte(2); // L: 113
			var27.writeShort(var3); // L: 114
			Iterator var28 = this.map.entrySet().iterator(); // L: 115

			label145:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 145
						break label145;
					}

					var16 = (Entry)var28.next(); // L: 116
					var17 = (Integer)var16.getKey(); // L: 118
				} while(!this.intsPersistence[var17]); // L: 119

				var27.writeShort(var17); // L: 120
				Object var8 = var16.getValue(); // L: 121
				Class var10 = var8.getClass(); // L: 123
				class522[] var11 = class522.method9125(); // L: 126
				int var12 = 0;

				class522 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 137
						break;
					}

					class522 var13 = var11[var12]; // L: 128
					if (var10 == var13.field5153) { // L: 130
						var9 = var13; // L: 131
						break; // L: 132
					}

					++var12; // L: 127
				}

				var27.writeByte(var9.field5157); // L: 140
				class522.method9109(var8, var27); // L: 141
			}
		} catch (Exception var25) { // L: 147
		} finally {
			try {
				var1.close(); // L: 150
			} catch (Exception var24) { // L: 152
			}

		}

		this.unwrittenChanges = false; // L: 154
		this.field1422 = VerticalAlignment.method3924(); // L: 155
	} // L: 156

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13246"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 159

		try {
			byte[] var2 = new byte[(int)var1.length()]; // L: 161

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 162 163 166
				var4 = var1.read(var2, var3, var2.length - var3); // L: 164
				if (var4 == -1) { // L: 165
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2); // L: 168
			if (var14.array.length - var14.offset < 1) {
				return; // L: 169
			}

			int var15 = var14.readUnsignedByte(); // L: 170
			if (var15 < 0 || var15 > 2) {
				return; // L: 171
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) { // L: 172
				var16 = var14.readUnsignedShort(); // L: 173

				for (var7 = 0; var7 < var16; ++var7) { // L: 174
					var8 = var14.readUnsignedShort(); // L: 175
					var9 = var14.readUnsignedByte(); // L: 176
					class522 var10 = (class522)KitDefinition.findEnumerated(class522.method9125(), var9); // L: 177
					Object var11 = var10.method9112(var14); // L: 178
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 179
						this.map.put(var8, var11); // L: 180
					}
				}
			} else {
				var16 = var14.readUnsignedShort(); // L: 185

				for (var7 = 0; var7 < var16; ++var7) { // L: 186
					var8 = var14.readUnsignedShort(); // L: 187
					var9 = var14.readInt(); // L: 188
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 189
						this.map.put(var8, var9); // L: 190
					}
				}

				var7 = var14.readUnsignedShort(); // L: 193

				for (var8 = 0; var8 < var7; ++var8) { // L: 194
					var14.readUnsignedShort(); // L: 195
					var14.readStringCp1252NullTerminated(); // L: 196
				}
			}
		} catch (Exception var25) { // L: 200
		} finally {
			try {
				var1.close(); // L: 203
			} catch (Exception var24) { // L: 205
			}

		}

		this.unwrittenChanges = false; // L: 207
	} // L: 208

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-110"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1422 < VerticalAlignment.method3924() - 60000L) { // L: 211
			this.write(); // L: 212
		}

	} // L: 214

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-798367725"
	)
	boolean method2723() {
		return this.unwrittenChanges; // L: 217
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1293792669"
	)
	static int method2747(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1925
			var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1926
			SecureRandomCallable.addGameMessage(0, "", var7); // L: 1927
			return 1; // L: 1928
		} else if (var0 == ScriptOpcodes.ANIM) {
			class19.Interpreter_intStackSize -= 2; // L: 1931
			class182.performPlayerAnimation(class133.localPlayer, Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 1932
			return 1; // L: 1933
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field873) { // L: 1936
				Interpreter.field872 = true; // L: 1937
			}

			return 1; // L: 1939
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1942
				var15 = 0; // L: 1943
				if (CollisionMap.isNumber(var7)) { // L: 1944
					var15 = KitDefinition.method3778(var7);
				}

				PacketBufferNode var13 = class425.getPacketBufferNode(ClientPacket.field3286, Client.packetWriter.isaacCipher); // L: 1946
				var13.packetBuffer.writeIntME(var15); // L: 1947
				Client.packetWriter.addNode(var13); // L: 1948
				return 1; // L: 1949
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1952
					var11 = class425.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 1954
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1955
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1956
					Client.packetWriter.addNode(var11); // L: 1957
					return 1; // L: 1958
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1961
					var11 = class425.getPacketBufferNode(ClientPacket.field3220, Client.packetWriter.isaacCipher); // L: 1963
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1964
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1965
					Client.packetWriter.addNode(var11); // L: 1966
					return 1; // L: 1967
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1970
						var4 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1971
						AbstractSocket.method8256(var3, var4); // L: 1972
						return 1; // L: 1973
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class19.Interpreter_intStackSize -= 3; // L: 1976
						var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1977
						var15 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1978
						int var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 1979
						Widget var14 = class243.field2620.method6281(var9); // L: 1980
						class31.clickWidget(var14, var3, var15); // L: 1981
						return 1; // L: 1982
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class19.Interpreter_intStackSize -= 2; // L: 1985
						var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 1986
						var15 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 1987
						Widget var12 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1988
						class31.clickWidget(var12, var3, var15); // L: 1989
						return 1; // L: 1990
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class412.mouseCam = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 1993
						return 1; // L: 1994
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = NPC.clientPreferences.method2459() ? 1 : 0; // L: 1997
						return 1; // L: 1998
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						NPC.clientPreferences.method2458(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1); // L: 2001
						return 1; // L: 2002
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 2005
						boolean var8 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2006
						class129.openURL(var7, var8, false); // L: 2007
						return 1; // L: 2008
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2011
						var11 = class425.getPacketBufferNode(ClientPacket.field3232, Client.packetWriter.isaacCipher); // L: 2013
						var11.packetBuffer.writeShort(var3); // L: 2014
						Client.packetWriter.addNode(var11); // L: 2015
						return 1; // L: 2016
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2019
						AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 2020
						var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 2021
						String var5 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 2022
						if (var4.length() > 500) { // L: 2023
							return 1;
						} else if (var5.length() > 500) { // L: 2024
							return 1;
						} else {
							PacketBufferNode var6 = class425.getPacketBufferNode(ClientPacket.field3224, Client.packetWriter.isaacCipher); // L: 2025
							var6.packetBuffer.writeShort(1 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var4) + SequenceDefinition.stringCp1252NullTerminatedByteSize(var5)); // L: 2026
							var6.packetBuffer.writeByte(var3); // L: 2027
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 2028
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 2029
							Client.packetWriter.addNode(var6); // L: 2030
							return 1; // L: 2031
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--class19.Interpreter_intStackSize; // L: 2034
						return 1; // L: 2035
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2038
						return 1; // L: 2039
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field598 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2042
						return 1; // L: 2043
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1) { // L: 2046
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2047
						}

						return 1; // L: 2048
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1) { // L: 2051
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2052
						}

						return 1; // L: 2053
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1) { // L: 2056
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2057
						}

						return 1; // L: 2058
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1) { // L: 2061
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2062
						}

						return 1; // L: 2063
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2066
						return 1; // L: 2067
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2070
						return 1; // L: 2071
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2074
						return 1; // L: 2075
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class370.setTapToDrop(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1); // L: 2078
						return 1; // L: 2079
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = ItemContainer.getTapToDrop() ? 1 : 0; // L: 2082
						return 1; // L: 2083
					} else if (var0 == 3129) {
						class19.Interpreter_intStackSize -= 2; // L: 2086
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 2087
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 2088
						return 1; // L: 2089
					} else if (var0 == 3130) {
						class19.Interpreter_intStackSize -= 2; // L: 2092
						return 1; // L: 2093
					} else if (var0 == 3131) {
						--class19.Interpreter_intStackSize; // L: 2096
						return 1; // L: 2097
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class148.canvasWidth; // L: 2100
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class342.canvasHeight; // L: 2101
						return 1; // L: 2102
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class19.Interpreter_intStackSize; // L: 2105
						return 1; // L: 2106
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2109
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class19.Interpreter_intStackSize -= 2; // L: 2112
						return 1; // L: 2113
					} else if (var0 == 3136) {
						Client.field684 = 3; // L: 2116
						Client.field685 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2117
						return 1; // L: 2118
					} else if (var0 == 3137) {
						Client.field684 = 2; // L: 2121
						Client.field685 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2122
						return 1; // L: 2123
					} else if (var0 == 3138) {
						Client.field684 = 0; // L: 2126
						return 1; // L: 2127
					} else if (var0 == 3139) {
						Client.field684 = 1; // L: 2130
						return 1; // L: 2131
					} else if (var0 == 3140) {
						Client.field684 = 3; // L: 2134
						Client.field685 = var2 ? class475.scriptDotWidget.id : class535.field5236.id; // L: 2135
						return 1; // L: 2136
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2139
							NPC.clientPreferences.method2538(var10); // L: 2140
							return 1; // L: 2141
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = NPC.clientPreferences.method2461() ? 1 : 0; // L: 2144
							return 1; // L: 2145
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2148
							Client.Login_isUsernameRemembered = var10; // L: 2149
							if (!var10) { // L: 2150
								NPC.clientPreferences.method2476(""); // L: 2151
							}

							return 1; // L: 2153
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2156
							return 1; // L: 2157
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2160
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1; // L: 2163
							NPC.clientPreferences.method2520(!var10); // L: 2164
							return 1; // L: 2165
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = NPC.clientPreferences.method2463() ? 0 : 1; // L: 2168
							return 1; // L: 2169
						} else if (var0 == 3148) {
							return 1; // L: 2172
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2175
							return 1; // L: 2176
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2179
							return 1; // L: 2180
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2183
							return 1; // L: 2184
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2187
							return 1; // L: 2188
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2191
							return 1; // L: 2192
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Language.method7200(); // L: 2195
							return 1; // L: 2196
						} else if (var0 == 3155) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 2199
							return 1; // L: 2200
						} else if (var0 == 3156) {
							return 1; // L: 2203
						} else if (var0 == 3157) {
							class19.Interpreter_intStackSize -= 2; // L: 2206
							return 1; // L: 2207
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2210
							return 1; // L: 2211
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2214
							return 1; // L: 2215
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2218
							return 1; // L: 2219
						} else if (var0 == 3161) {
							--class19.Interpreter_intStackSize; // L: 2222
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2223
							return 1; // L: 2224
						} else if (var0 == 3162) {
							--class19.Interpreter_intStackSize; // L: 2227
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2228
							return 1; // L: 2229
						} else if (var0 == 3163) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 2232
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2233
							return 1; // L: 2234
						} else if (var0 == 3164) {
							--class19.Interpreter_intStackSize; // L: 2237
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2238
							return 1; // L: 2239
						} else if (var0 == 3165) {
							--class19.Interpreter_intStackSize; // L: 2242
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2243
							return 1; // L: 2244
						} else if (var0 == 3166) {
							class19.Interpreter_intStackSize -= 2; // L: 2247
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2248
							return 1; // L: 2249
						} else if (var0 == 3167) {
							class19.Interpreter_intStackSize -= 2; // L: 2252
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2253
							return 1; // L: 2254
						} else if (var0 == 3168) {
							class19.Interpreter_intStackSize -= 2; // L: 2257
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2258
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2259
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2260
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2261
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2262
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2263
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2264
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2265
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 2266
							return 1; // L: 2267
						} else if (var0 == 3169) {
							return 1; // L: 2270
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2273
							return 1; // L: 2274
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2277
							return 1; // L: 2278
						} else if (var0 == 3172) {
							--class19.Interpreter_intStackSize; // L: 2281
							return 1; // L: 2282
						} else if (var0 == 3173) {
							--class19.Interpreter_intStackSize; // L: 2285
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2286
							return 1; // L: 2287
						} else if (var0 == 3174) {
							--class19.Interpreter_intStackSize; // L: 2290
							return 1; // L: 2291
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 2294
							return 1; // L: 2295
						} else if (var0 == 3176) {
							return 1; // L: 2298
						} else if (var0 == 3177) {
							return 1; // L: 2301
						} else if (var0 == 3178) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 2304
							return 1; // L: 2305
						} else if (var0 == 3179) {
							return 1; // L: 2308
						} else if (var0 == 3180) {
							--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 2311
							return 1; // L: 2312
						} else if (var0 == 3181) {
							class185.method3681(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 2315
							return 1; // L: 2316
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class171.method3467(); // L: 2319
							return 1; // L: 2320
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 2323
							class33.method453(var3); // L: 2324
							return 1; // L: 2325
						} else {
							return 2; // L: 2327
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "69"
	)
	static long method2752() {
		return Client.field638; // L: 2974
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lde;IB)V",
		garbageValue = "49"
	)
	static final void method2753(Actor var0, int var1) {
		class129.worldToScreen(var0.x, var0.y, var1); // L: 5805
	} // L: 5806
}
