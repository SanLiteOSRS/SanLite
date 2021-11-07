import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
public class class114 extends class116 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static Bounds field1359;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -3547917971433153133L
	)
	long field1364;
	@ObfuscatedName("w")
	String field1360;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class114(class119 var1) {
		this.this$0 = var1;
		this.field1364 = -1L;
		this.field1360 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1364 = var1.readLong();
		}

		this.field1360 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2655(this.field1364, this.field1360, 0);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "-216231156"
	)
	public static String method2545(byte[] var0) {
		return class135.method2795(var0, 0, var0.length);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "64"
	)
	static int method2542(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class14.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			ApproximateRouteStrategy.privateChatMode = FloorDecoration.method4189(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
			if (ApproximateRouteStrategy.privateChatMode == null) {
				ApproximateRouteStrategy.privateChatMode = PrivateChatMode.field4425;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2696, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(ApproximateRouteStrategy.privateChatMode.field4424);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
				class14.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
				var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(Client.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class14.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
					var5 = class54.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						var4 = class122.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (ApproximateRouteStrategy.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.privateChatMode.field4424;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
							var12 = class383.method6755(var7, var8, MouseHandler.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class295.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class295.Interpreter_stringStackSize + 1];
							var12 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2675, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class132.method2769(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
							class14.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
							var6 = class383.method6755(var7, var8, MouseHandler.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ObjectSound.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ClanChannelMember.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = WorldMapData_0.method3530(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
								class7.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field692 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = Client.field692;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class295.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--class14.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class14.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								class14.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
								var5 = class54.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
								var4 = class122.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (HealthBarDefinition.localPlayer != null && HealthBarDefinition.localPlayer.username != null) {
								var8 = HealthBarDefinition.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-929518083"
	)
	static final void method2538() {
		Client.field539 = 0;
		int var0 = class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7);
		int var1 = DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field539 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field539 = 1;
		}

		if (Client.field539 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field539 = 0;
		}

	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljf;III)V",
		garbageValue = "226743151"
	)
	@Export("Widget_addToMenu")
	static final void Widget_addToMenu(Widget var0, int var1, int var2) {
		if (var0.buttonType == 1) {
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 24, 0, 0, var0.id);
		}

		String var3;
		if (var0.buttonType == 2 && !Client.isSpellSelected) {
			var3 = class20.Widget_getSpellActionName(var0);
			if (var3 != null) {
				EnumComposition.insertMenuItemNoShift(var3, MouseHandler.colorStartTag(65280) + var0.spellName, 25, 0, -1, var0.id);
			}
		}

		if (var0.buttonType == 3) {
			EnumComposition.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
		}

		if (var0.buttonType == 4) {
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
		}

		if (var0.buttonType == 5) {
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
		}

		if (var0.buttonType == 6 && Client.meslayerContinueWidget == null) {
			EnumComposition.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
		}

		int var4;
		int var13;
		if (var0.type == 2) {
			var13 = 0;

			for (var4 = 0; var4 < var0.height; ++var4) {
				for (int var15 = 0; var15 < var0.width; ++var15) {
					int var6 = (var0.paddingX + 32) * var15;
					int var7 = (var0.paddingY + 32) * var4;
					if (var13 < 20) {
						var6 += var0.inventoryXOffsets[var13];
						var7 += var0.inventoryYOffsets[var13];
					}

					if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
						Client.dragItemSlotDestination = var13;
						class274.hoveredItemContainer = var0;
						if (var0.itemIds[var13] > 0) {
							ItemComposition var8 = TaskHandler.ItemDefinition_get(var0.itemIds[var13] - 1);
							if (Client.isItemSelected == 1 && Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) {
								if (var0.id != MouseHandler.selectedItemWidget || var13 != ReflectionCheck.selectedItemSlot) {
									EnumComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var8.name, 31, var8.id, var13, var0.id);
								}
							} else if (Client.isSpellSelected && Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) {
								if ((class116.selectedSpellFlags & 16) == 16) {
									EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MouseHandler.colorStartTag(16748608) + var8.name, 32, var8.id, var13, var0.id);
								}
							} else {
								String[] var9 = var8.inventoryActions;
								int var10 = -1;
								if (Client.shiftClickDrop && UserComparator7.method2466()) {
									var10 = var8.getShiftClickIndex();
								}

								int var11;
								if (Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) {
									for (var11 = 4; var11 >= 3; --var11) {
										if (var11 != var10) {
											ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}
								}

								if (class111.method2514(PendingSpawn.getWidgetFlags(var0))) {
									EnumComposition.insertMenuItemNoShift("Use", MouseHandler.colorStartTag(16748608) + var8.name, 38, var8.id, var13, var0.id);
								}

								if (Tiles.method2045(PendingSpawn.getWidgetFlags(var0))) {
									for (var11 = 2; var11 >= 0; --var11) {
										if (var10 != var11) {
											ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var11, false);
										}
									}

									if (var10 >= 0) {
										ObjectComposition.addWidgetItemMenuItem(var0, var8, var13, var10, true);
									}
								}

								var9 = var0.itemActions;
								if (var9 != null) {
									for (var11 = 4; var11 >= 0; --var11) {
										if (var9[var11] != null) {
											byte var12 = 0;
											if (var11 == 0) {
												var12 = 39;
											}

											if (var11 == 1) {
												var12 = 40;
											}

											if (var11 == 2) {
												var12 = 41;
											}

											if (var11 == 3) {
												var12 = 42;
											}

											if (var11 == 4) {
												var12 = 43;
											}

											EnumComposition.insertMenuItemNoShift(var9[var11], MouseHandler.colorStartTag(16748608) + var8.name, var12, var8.id, var13, var0.id);
										}
									}
								}

								EnumComposition.insertMenuItemNoShift("Examine", MouseHandler.colorStartTag(16748608) + var8.name, 1005, var8.id, var13, var0.id);
							}
						}
					}

					++var13;
				}
			}
		}

		if (var0.isIf3) {
			if (Client.isSpellSelected) {
				if (class19.method279(PendingSpawn.getWidgetFlags(var0)) && (class116.selectedSpellFlags & 32) == 32) {
					EnumComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id);
				}
			} else {
				for (var13 = 9; var13 >= 5; --var13) {
					String var14 = SoundSystem.method785(var0, var13);
					if (var14 != null) {
						EnumComposition.insertMenuItemNoShift(var14, var0.dataText, 1007, var13 + 1, var0.childIndex, var0.id);
					}
				}

				var3 = class20.Widget_getSpellActionName(var0);
				if (var3 != null) {
					EnumComposition.insertMenuItemNoShift(var3, var0.dataText, 25, 0, var0.childIndex, var0.id);
				}

				for (var4 = 4; var4 >= 0; --var4) {
					String var5 = SoundSystem.method785(var0, var4);
					if (var5 != null) {
						ModelData0.insertMenuItem(var5, var0.dataText, 57, var4 + 1, var0.childIndex, var0.id, var0.prioritizeMenuEntry);
					}
				}

				if (ClientPacket.method4710(PendingSpawn.getWidgetFlags(var0))) {
					EnumComposition.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
				}
			}
		}

	}
}
