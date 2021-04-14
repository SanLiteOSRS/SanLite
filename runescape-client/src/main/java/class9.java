import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("n")
public class class9 {
	@ObfuscatedName("p")
	static byte[][][] field69;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Lbu;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 2080333627
	)
	static int field63;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		signature = "Ldw;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("f")
	public byte field66;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -580001667
	)
	public int field64;
	@ObfuscatedName("u")
	public String field65;

	class9() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-1"
	)
	public static int method125() {
		return KeyHandler.KeyHandler_idleCycles;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "-17407"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1816679495"
	)
	static int method120(int var0, Script var1, boolean var2) {
		String var3;
		int var4;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
			return 1;
		} else {
			String var9;
			if (var0 == ScriptOpcodes.APPEND) {
				Interpreter.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + WallDecoration.intToString(var4, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					long var11 = 86400000L * ((long)var10 + 11745L);
					Interpreter.Interpreter_calendar.setTime(new Date(var11));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var16 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var16] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Interpreter.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = NetSocket.method2587(DirectByteArrayCopier.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class35.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var13;
						Font var14;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class16.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var13 = MilliClock.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var14.lineCount(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class16.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var13 = MilliClock.archive13.takeFile(var5, 0);
							var14 = new Font(var13);
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var14.lineWidth(var3, var4);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var4;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = LoginScreenAnimation.isCharPrintable((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class238.isAlphaNumeric((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class69.isCharAlphabetic((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = UserComparator4.isDigit((char)var10) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class16.Interpreter_intStackSize -= 2;
							var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var4, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							StringBuilder var17 = new StringBuilder(var3.length());
							boolean var15 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var15 = true;
								} else if (var7 == '>') {
									var15 = false;
								} else if (!var15) {
									var17.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var17.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.indexOf(var4);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.indexOf(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.UPPERCASE) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
					var9 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
					if (Varcs.localPlayer.appearance != null && Varcs.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "2074876999"
	)
	static int method122(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = WorldMapAreaData.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var3;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var3 = NPCComposition.worldListStart();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var3 = ScriptFrame.getNextWorldListWorld();
				if (var3 != null) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.id;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.activity;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.location;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.host;
				} else {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				World var4;
				int var5;
				int var7;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					var4 = null;

					for (var5 = 0; var5 < World.World_count; ++var5) {
						if (var7 == World_worlds[var5].id) {
							var4 = World_worlds[var5];
							break;
						}
					}

					if (var4 != null) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class16.Interpreter_intStackSize -= 4;
					var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1] == 1;
					var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3] == 1;
					WorldMapSectionType.sortWorldList(var7, var10, var5, var6);
					return 1;
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var8;
						ParamDefinition var9;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class16.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var9 = UserComparator3.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = GraphicsObject.getNpcDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GraphicsObject.getNpcDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class16.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var9 = UserComparator3.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class19.getObjectDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class19.getObjectDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class16.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var9 = UserComparator3.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class23.ItemDefinition_get(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class23.ItemDefinition_get(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class16.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
							var8 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
							var9 = UserComparator3.getParamDefinition(var8);
							if (var9.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = LoginPacket.StructDefinition_getStructDefinition(var7).getStringParam(var8, var9.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = LoginPacket.StructDefinition_getStructDefinition(var7).getIntParam(var8, var9.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.clientType & 3;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--class16.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--class16.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field605;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					if (var7 >= 0 && var7 < World.World_count) {
						var4 = World_worlds[var7];
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.id;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.activity;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.location;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.host;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "616435049"
	)
	static int method121(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			++Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				++Interpreter.Interpreter_stringStackSize;
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				return 2;
			} else {
				++class16.Interpreter_intStackSize;
				return 1;
			}
		} else {
			++class16.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "785264167"
	)
	static void method118(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetClickMasks.first(); var1 != null; var1 = (IntegerNode)Client.widgetClickMasks.next()) {
			if ((var1.key >> 48 & 65535L) == (long)var0) {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		signature = "(IIIZI)V",
		garbageValue = "1685412004"
	)
	public static void method123(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ObjectComposition.getPacketBufferNode(ClientPacket.field2238, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method6658(var2);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.writeInt(var3 ? Client.field684 : 0);
		var4.packetBuffer.method6771(var0);
		Client.packetWriter.addNode(var4);
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-118"
	)
	static void method119() {
		if (Client.oculusOrbState == 1) {
			Client.field685 = true;
		}

	}
}
