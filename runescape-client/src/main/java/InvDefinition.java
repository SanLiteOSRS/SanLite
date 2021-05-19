import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("en")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1346199123
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "66775283"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "2113892179"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljava/lang/String;Ljava/lang/String;I)Lkc;",
		garbageValue = "-16711936"
	)
	public static Font method2609(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2);
		int var5 = var0.getFileId(var4, var3);
		Font var6;
		if (!Username.method5711(var0, var4, var5)) {
			var6 = null;
		} else {
			byte[] var8 = var1.takeFile(var4, var5);
			Font var7;
			if (var8 == null) {
				var7 = null;
			} else {
				Font var9 = new Font(var8, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels);
				class243.SpriteBuffer_xOffsets = null;
				class396.SpriteBuffer_yOffsets = null;
				ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
				class372.SpriteBuffer_spriteHeights = null;
				AccessFile.SpriteBuffer_spritePalette = null;
				class396.SpriteBuffer_pixels = null;
				var7 = var9;
			}

			var6 = var7;
		}

		return var6;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "1802356722"
	)
	static int method2616(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
			WorldMapScaleHandler.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			class69.performPlayerAnimation(class35.localPlayer, Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field951) {
				Interpreter.field950 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				var16 = 0;
				if (GrandExchangeOfferAgeComparator.isNumber(var7)) {
					var16 = FontName.method6162(var7);
				}

				PacketBufferNode var14 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2670, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
					var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2626, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
						Skeleton.method3899(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						WorldMapCacheName.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
						Widget var15 = DevicePcmPlayerProvider.getWidget(var9);
						class214.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget;
						class214.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class229.mouseCam = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class12.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						KeyHandler.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						Interpreter.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						var12 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2640, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						class13.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[class13.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2644, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + class4.stringCp1252NullTerminatedByteSize(var4) + class4.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByte(var10);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class24.setTapToDrop(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GameObject.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--WorldMapCacheName.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = HealthBarDefinition.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--WorldMapCacheName.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						WorldMapCacheName.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field778 = 3;
						Client.field779 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field778 = 2;
						Client.field779 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field778 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field778 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field778 = 3;
						Client.field779 = var2 ? class308.scriptDotWidget.id : class24.scriptActiveWidget.id;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							class12.clientPreferences.hideUsername = var11;
							KeyHandler.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								class12.clientPreferences.rememberedUsername = "";
								KeyHandler.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1;
							if (var11 == class12.clientPreferences.titleMusicDisabled) {
								class12.clientPreferences.titleMusicDisabled = !var11;
								KeyHandler.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class12.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Script.method2026();
							return 1;
						} else if (var0 == 3155) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--WorldMapCacheName.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--WorldMapCacheName.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--class13.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--WorldMapCacheName.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--WorldMapCacheName.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							WorldMapCacheName.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--WorldMapCacheName.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--class13.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100);
							class264.method4796((double)(0.5F + (float)var10 / 200.0F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)class12.clientPreferences.field1303 - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else if (var0 != 3183 && var0 != 3184) {
							return 2;
						} else {
							--WorldMapCacheName.Interpreter_intStackSize;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "882607989"
	)
	static final void method2615(int var0, int var1, int var2, int var3) {
		class125.method2506();
	}
}
