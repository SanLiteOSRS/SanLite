import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("a")
public class class25 extends class16 {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1686215047
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1048031623
	)
	int field198;
	@ObfuscatedName("e")
	byte field200;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1621140089
	)
	int field199;
	@ObfuscatedName("y")
	String field197;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ls;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field198 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "851460888"
	)
	void vmethod331(Buffer var1) {
		var1.readUnsignedByte();
		this.field198 = var1.readUnsignedShort();
		this.field200 = var1.readByte();
		this.field199 = var1.readUnsignedShort();
		var1.readLong();
		this.field197 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1362614343"
	)
	void vmethod332(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field198);
		var2.rank = this.field200;
		var2.world = this.field199;
		var2.name = this.field197;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILgp;[Lfl;B)V",
		garbageValue = "32"
	)
	static final void method337(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method6628();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = Tiles.getObjectDefinition(var11);
					int var22 = var2 + AbstractWorldMapIcon.method3787(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + FaceNormal.method4253(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = var1;
						if ((Tiles.Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}

						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}

						Player.method2258(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
					}
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-20"
	)
	public static final void method339(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liv;II)V",
		garbageValue = "-709211391"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3035 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3104 == null) {
				var0.field3104 = new int[var0.field3035.length];
			}

			var0.field3104[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1350653396"
	)
	static int method336(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			ChatChannel.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
			ClanChannel.privateChatMode = class244.method4812(Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]);
			if (ClanChannel.privateChatMode == null) {
				ClanChannel.privateChatMode = PrivateChatMode.field3886;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = InterfaceParent.getPacketBufferNode(ClientPacket.field2679, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(ClanChannel.privateChatMode.field3884);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
				ChatChannel.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var6 = InterfaceParent.getPacketBufferNode(ClientPacket.field2636, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					ChatChannel.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					var5 = Client.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var4 = Client.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (ClanChannel.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannel.privateChatMode.field3884;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
							var12 = class342.method6068(var7, var8, AbstractArchive.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							UserComparator9.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1];
							var12 = InterfaceParent.getPacketBufferNode(ClientPacket.field2668, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							ModeWhere.method5292(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == 5010) {
							var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
							ChatChannel.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
							var6 = class342.method6068(var7, var8, AbstractArchive.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = AbstractArchive.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class80.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class22.method306(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
								Canvas.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field642 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Client.field642;
								return 1;
							} else if (var0 == ScriptOpcodes.DEBUGMES) {
								var8 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--ChatChannel.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++ChatChannel.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								ChatChannel.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
								var5 = Client.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
								var4 = Client.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class262.localPlayer != null && class262.localPlayer.username != null) {
								var8 = class262.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1366473716"
	)
	static final void method330(int var0) {
		if (class20.loadInterface(var0)) {
			class246.drawModelComponents(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1);
		}
	}
}
