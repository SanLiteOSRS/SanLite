import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public class class82 {
	@ObfuscatedName("f")
	static final BigInteger field1000;
	@ObfuscatedName("e")
	static final BigInteger field996;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1114873797
	)
	static int field999;

	static {
		field1000 = new BigInteger("10001", 16);
		field996 = new BigInteger("8dc6a1a83bbb640252f3f8edaa19da8f7ef11de714d12d808467f1e9d80d457a089db79c00e6a7fd1a413a29a10b5e31f3f81b773f9d3de5b509aa3b4c6aae73b449122c91af25cff56ecc0f2c688f36a0fea3a8856adec0b7e11b2ecacc1f766e1e89462aa2839db7c7d469e5816d2ef676ec87a7e70f3fdb76b0f86d9f34a7", 16);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "0"
	)
	static int method2031(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
			UserComparator10.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			ChatChannel.Interpreter_intStackSize -= 2;
			World.performPlayerAnimation(class262.localPlayer, Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize], Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field951) {
				Interpreter.field963 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				var16 = 0;
				if (Varps.isNumber(var7)) {
					var16 = FontName.method6335(var7);
				}

				PacketBufferNode var14 = InterfaceParent.getPacketBufferNode(ClientPacket.field2664, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2582, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2610, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
						FriendsList.method5711(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						ChatChannel.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
						Widget var15 = WorldMapData_1.getWidget(var9);
						ItemLayer.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						ChatChannel.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? UserComparator5.scriptDotWidget : Nameable.scriptActiveWidget;
						ItemLayer.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator3.mouseCam = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class4.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						Actor.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						AttackOption.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2622, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						UserComparator9.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2651, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class44.stringCp1252NullTerminatedByteSize(var4) + class44.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.method6640(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Fonts.setTapToDrop(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = PendingSpawn.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						ChatChannel.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						ChatChannel.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--ChatChannel.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AttackOption.canvasWidth;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class0.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--ChatChannel.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						ChatChannel.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field784 = 3;
						Client.field694 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field784 = 2;
						Client.field694 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field784 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field784 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field784 = 3;
						Client.field694 = var2 ? UserComparator5.scriptDotWidget.id : Nameable.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							class4.clientPreferences.hideUsername = var11;
							Actor.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								class4.clientPreferences.rememberedUsername = "";
								Actor.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1;
							if (var11 == class4.clientPreferences.titleMusicDisabled) {
								class4.clientPreferences.titleMusicDisabled = !var11;
								Actor.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = FontName.method6329();
							return 1;
						} else if (var0 == 3155) {
							--UserComparator9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							ChatChannel.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--ChatChannel.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--ChatChannel.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--UserComparator9.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--ChatChannel.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--ChatChannel.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							ChatChannel.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							ChatChannel.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							ChatChannel.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--ChatChannel.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--UserComparator9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--UserComparator9.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize], 0), 100);
							UserComparator10.method2568((double)(0.5F + (float)var10 / 200.0F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = 200.0F * ((float)class4.clientPreferences.field1312 - 0.5F);
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}
}
