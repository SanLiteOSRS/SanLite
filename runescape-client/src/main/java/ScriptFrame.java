import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -17818799
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("s")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("a")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lfw;",
		garbageValue = "-39610559"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "77"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1571821946"
	)
	public static void method1117() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1762076085"
	)
	static int method1118(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
			class397.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class14.Interpreter_intStackSize -= 2;
			FaceNormal.performPlayerAnimation(HealthBarDefinition.localPlayer, Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field791) {
				Interpreter.field795 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
				var16 = 0;
				if (class129.isNumber(var7)) {
					var16 = TaskHandler.method2881(var7);
				}

				PacketBufferNode var14 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2754, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2764, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
					var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2707, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
						AbstractByteArrayCopier.method5169(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class14.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
						Widget var15 = UserComparator9.getWidget(var9);
						UserComparator6.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class14.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
						UserComparator6.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ApproximateRouteStrategy.mouseCam = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class408.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						Login.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						class91.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2685, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						class295.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2724, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + Client.stringCp1252NullTerminatedByteSize(var4) + Client.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByte(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Messages.setTapToDrop(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Decimator.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == 3129) {
						class14.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						class14.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--class14.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KeyHandler.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class14.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class14.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field479 = 3;
						Client.field633 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field479 = 2;
						Client.field633 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field479 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field479 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field479 = 3;
						Client.field633 = var2 ? class120.scriptDotWidget.id : Frames.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							class408.clientPreferences.hideUsername = var11;
							Login.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								class408.clientPreferences.rememberedUsername = "";
								Login.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == 3146) {
							var11 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
							if (var11 == class408.clientPreferences.titleMusicDisabled) {
								class408.clientPreferences.titleMusicDisabled = !var11;
								Login.savePreferences();
							}

							return 1;
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class408.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class87.method2224();
							return 1;
						} else if (var0 == 3155) {
							--class295.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							class14.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--class14.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--class14.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class295.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--class14.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--class14.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							class14.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							class14.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							class14.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--class14.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--class14.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--class14.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class295.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class295.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize], 0), 100);
							class354.method6396((double)((float)var10 / 200.0F + 0.5F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)class408.clientPreferences.brightness - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--class14.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}
}
