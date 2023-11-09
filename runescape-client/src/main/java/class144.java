import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class144 extends class152 {
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -604673245
	)
	int field1703;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class144(class153 var1) {
		this.this$0 = var1;
		this.field1703 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "468341515"
	)
	void vmethod3336(Buffer var1) {
		this.field1703 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1227548281"
	)
	void vmethod3337(ClanChannel var1) {
		var1.removeMember(this.field1703); // L: 96
	} // L: 97

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-714698284"
	)
	static int method3145(String var0) {
		if (var0.equals("centre")) { // L: 307
			return 1; // L: 308
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 310 311 313
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "127"
	)
	static int method3143(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3944
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3945
			return 1; // L: 3946
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3948
			class87.Interpreter_intStackSize -= 3; // L: 3949
			Client.publicChatMode = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3950
			LoginScreenAnimation.privateChatMode = SceneTilePaint.method4808(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 3951
			if (LoginScreenAnimation.privateChatMode == null) { // L: 3952
				LoginScreenAnimation.privateChatMode = PrivateChatMode.field5047;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 3953
			PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.field3085, Client.packetWriter.isaacCipher); // L: 3955
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3956
			var13.packetBuffer.writeByte(LoginScreenAnimation.privateChatMode.field5050); // L: 3957
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3958
			Client.packetWriter.addNode(var13); // L: 3959
			return 1; // L: 3960
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3962
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 3963
				class87.Interpreter_intStackSize -= 2; // L: 3964
				var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3965
				var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3966
				var6 = class136.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher); // L: 3968
				var6.packetBuffer.writeByte(class13.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3969
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3970
				var6.packetBuffer.writeByte(var7 - 1); // L: 3971
				var6.packetBuffer.writeByte(var9); // L: 3972
				Client.packetWriter.addNode(var6); // L: 3973
				return 1; // L: 3974
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3976
					class87.Interpreter_intStackSize -= 2; // L: 3977
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 3978
					var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 3979
					var5 = class130.Messages_getByChannelAndID(var3, var7); // L: 3980
					if (var5 != null) { // L: 3981
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.count; // L: 3982
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.cycle; // L: 3983
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3984
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3985
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3986
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3987
					} else {
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 3990
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3991
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3992
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3993
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3994
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 3995
					}

					return 1; // L: 3997
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 3999
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4000
						var4 = Script.Messages_getMessage(var3); // L: 4001
						if (var4 != null) { // L: 4002
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.type; // L: 4003
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.cycle; // L: 4004
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4005
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4006
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4007
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4008
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4011
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4012
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4013
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4014
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4015
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4016
						}

						return 1; // L: 4018
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4020
						if (LoginScreenAnimation.privateChatMode == null) { // L: 4021
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = LoginScreenAnimation.privateChatMode.field5050; // L: 4022
						}

						return 1; // L: 4023
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4025
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 4026
							var7 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4027
							var12 = class467.method8803(var7, var8, class173.clientLanguage, -1); // L: 4028
							Client.packetWriter.addNode(var12); // L: 4029
							return 1; // L: 4030
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4032
							Interpreter.Interpreter_stringStackSize -= 2; // L: 4033
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize]; // L: 4034
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1]; // L: 4035
							var12 = class136.getPacketBufferNode(ClientPacket.field3118, Client.packetWriter.isaacCipher); // L: 4037
							var12.packetBuffer.writeShort(0); // L: 4038
							int var10 = var12.packetBuffer.offset; // L: 4039
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4040
							BufferedSource.method7683(var12.packetBuffer, var11); // L: 4041
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4042
							Client.packetWriter.addNode(var12); // L: 4043
							return 1; // L: 4044
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4046
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 4047
							class87.Interpreter_intStackSize -= 2; // L: 4048
							var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4049
							var9 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4050
							var6 = class467.method8803(var7, var8, class173.clientLanguage, var9); // L: 4051
							Client.packetWriter.addNode(var6); // L: 4052
							return 1; // L: 4053
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4055
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4062
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4063
								return 1; // L: 4064
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4066
								var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4067
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class137.Messages_getHistorySize(var3); // L: 4068
								return 1; // L: 4069
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4071
								var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4072
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class313.Messages_getLastChatID(var3); // L: 4073
								return 1; // L: 4074
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4076
								var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4077
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = DynamicObject.method2141(var3); // L: 4078
								return 1; // L: 4079
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4081
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 4082
								class152.doCheat(var8); // L: 4083
								return 1; // L: 4084
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4086
								Client.field744 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4087
								return 1; // L: 4088
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4090
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field744; // L: 4091
								return 1; // L: 4092
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4094
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 4095
								System.out.println(var8); // L: 4096
								return 1; // L: 4097
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4099
								class87.Interpreter_intStackSize -= 2; // L: 4100
								var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4101
								var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4102
								var5 = class130.Messages_getByChannelAndID(var3, var7); // L: 4103
								if (var5 != null) { // L: 4104
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.count; // L: 4105
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.cycle; // L: 4106
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4107
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4108
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4109
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4110
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4111
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4112
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4115
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4116
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4117
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4118
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4119
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4120
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4121
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4122
								}

								return 1; // L: 4124
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4126
								var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4127
								var4 = Script.Messages_getMessage(var3); // L: 4128
								if (var4 != null) { // L: 4129
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.type; // L: 4130
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.cycle; // L: 4131
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4132
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4133
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4134
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4135
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4136
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4137
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4140
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4141
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4142
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4143
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4144
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4145
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4146
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4147
								}

								return 1; // L: 4149
							} else {
								return 2; // L: 4151
							}
						} else {
							if (class155.localPlayer != null && class155.localPlayer.username != null) { // L: 4057
								var8 = class155.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4058
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8; // L: 4059
							return 1; // L: 4060
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "([Lkd;IIIIIIII)V",
		garbageValue = "-1314248659"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) { // L: 11337
			Widget var9 = var0[var8]; // L: 11338
			if (var9 != null && var9.parentId == var1 && (var9.method6298() || Clock.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) { // L: 11339 11340 11341
				if (var9.isIf3) { // L: 11342
					if (FriendSystem.isComponentHidden(var9)) { // L: 11343
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapScaleHandler.mousedOverWidgetIf1 && FriendSystem.isComponentHidden(var9)) { // L: 11346
					continue;
				}

				if (var9.type == 11) { // L: 11348
					if (var9.method6281(TaskHandler.urlRequester)) { // L: 11349
						if (var9.method6172()) { // L: 11350
							class69.invalidateWidget(var9); // L: 11351
							class169.revalidateWidgetScroll(var9.children, var9, true); // L: 11352
						}

						if (var9.field3670 != null) { // L: 11354
							ScriptEvent var10 = new ScriptEvent(); // L: 11355
							var10.widget = var9; // L: 11356
							var10.args = var9.field3670; // L: 11357
							Client.scriptEvents.addFirst(var10); // L: 11358
						}
					}
				} else if (var9.type == 12 && var9.method6242()) { // L: 11362 11363
					class69.invalidateWidget(var9); // L: 11364
				}

				int var26 = var9.x + var6; // L: 11367
				int var11 = var7 + var9.y; // L: 11368
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) { // L: 11373
					var12 = var2; // L: 11374
					var13 = var3; // L: 11375
					var14 = var4; // L: 11376
					var15 = var5; // L: 11377
				} else {
					int var16;
					if (var9.type == 9) { // L: 11379
						var16 = var26; // L: 11380
						var17 = var11; // L: 11381
						var18 = var26 + var9.width; // L: 11382
						int var19 = var11 + var9.height; // L: 11383
						if (var18 < var26) { // L: 11384
							var16 = var18; // L: 11386
							var18 = var26; // L: 11387
						}

						if (var19 < var11) { // L: 11389
							var17 = var19; // L: 11391
							var19 = var11; // L: 11392
						}

						++var18; // L: 11394
						++var19; // L: 11395
						var12 = var16 > var2 ? var16 : var2; // L: 11396
						var13 = var17 > var3 ? var17 : var3; // L: 11397
						var14 = var18 < var4 ? var18 : var4; // L: 11398
						var15 = var19 < var5 ? var19 : var5; // L: 11399
					} else {
						var16 = var26 + var9.width; // L: 11402
						var17 = var11 + var9.height; // L: 11403
						var12 = var26 > var2 ? var26 : var2; // L: 11404
						var13 = var11 > var3 ? var11 : var3; // L: 11405
						var14 = var16 < var4 ? var16 : var4; // L: 11406
						var15 = var17 < var5 ? var17 : var5; // L: 11407
					}
				}

				if (var9 == Client.clickedWidget) { // L: 11409
					Client.field701 = true; // L: 11410
					Client.field519 = var26; // L: 11411
					Client.field703 = var11; // L: 11412
				}

				boolean var34 = false; // L: 11414
				if (var9.field3621) { // L: 11415
					switch(Client.field791) { // L: 11416
					case 0:
						var34 = true; // L: 11418
					case 1:
					default:
						break;
					case 2:
						if (Client.field683 == var9.id >>> 16) { // L: 11426
							var34 = true; // L: 11427
						}
						break;
					case 3:
						if (var9.id == Client.field683) { // L: 11421
							var34 = true; // L: 11422
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) { // L: 11432
					if (var9.isIf3) { // L: 11433
						ScriptEvent var27;
						if (var9.noClickThrough) { // L: 11434
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11435
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11436
									if (var27.isMouseInputEvent) { // L: 11437
										var27.remove(); // L: 11438
										var27.widget.containsMouse = false; // L: 11439
									}
								}

								ClientPacket.method5481(); // L: 11442
								if (class87.widgetDragDuration == 0) { // L: 11443
									Client.clickedWidget = null; // L: 11444
									Client.clickedWidgetParent = null; // L: 11445
								}

								if (!Client.isMenuOpen) { // L: 11447
									FriendsChatManager.addCancelMenuEntry(); // L: 11448
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11452 11453
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11454
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) { // L: 11455
									var27.remove(); // L: 11456
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x; // L: 11462
					var18 = MouseHandler.MouseHandler_y; // L: 11463
					if (MouseHandler.MouseHandler_lastButton != 0) { // L: 11464
						var17 = MouseHandler.MouseHandler_lastPressedX; // L: 11465
						var18 = MouseHandler.MouseHandler_lastPressedY; // L: 11466
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15; // L: 11468
					if (var9.contentType == 1337) { // L: 11469
						if (!Client.isLoading && !Client.isMenuOpen && var35) { // L: 11470
							class17.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) { // L: 11473
						DevicePcmPlayerProvider.checkIfMinimapClicked(var9, var26, var11); // L: 11474
					} else {
						if (var9.contentType == 1400) { // L: 11477
							KitDefinition.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height); // L: 11478
						}

						if (!Client.isMenuOpen && var35) { // L: 11480
							if (var9.contentType == 1400) { // L: 11481
								KitDefinition.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18); // L: 11482
							} else {
								class273.Widget_addToMenu(var9, var17 - var26, var18 - var11); // L: 11485
							}
						}

						boolean var21;
						int var23;
						if (var34) { // L: 11488
							for (int var20 = 0; var20 < var9.field3622.length; ++var20) { // L: 11489
								var21 = false; // L: 11490
								boolean var28 = false; // L: 11491
								if (!var21 && var9.field3622[var20] != null) { // L: 11492
									for (var23 = 0; var23 < var9.field3622[var20].length; ++var23) { // L: 11493
										boolean var24 = false; // L: 11494
										if (var9.field3692 != null) { // L: 11495
											var24 = Client.field747.method4106(var9.field3622[var20][var23]); // L: 11496
										}

										if (class281.method5501(var9.field3622[var20][var23]) || var24) { // L: 11498
											var21 = true; // L: 11499
											if (var9.field3692 != null && var9.field3692[var20] > Client.cycle) { // L: 11500
												break;
											}

											byte var33 = var9.field3623[var20][var23]; // L: 11501
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field747.method4106(86) && !Client.field747.method4106(82) && !Client.field747.method4106(81)) && ((var33 & 2) == 0 || Client.field747.method4106(86)) && ((var33 & 1) == 0 || Client.field747.method4106(82)) && ((var33 & 4) == 0 || Client.field747.method4106(81))) { // L: 11502 11503 11504 11505 11506
												var28 = true; // L: 11508
												break;
											}
										}
									}
								}

								if (var28) { // L: 11514
									if (var20 < 10) { // L: 11515
										ModelData0.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) { // L: 11516
										Widget.Widget_runOnTargetLeave(); // L: 11517
										class32.selectSpell(var9.id, var9.childIndex, PacketWriter.Widget_unpackTargetMask(Clock.getWidgetFlags(var9)), var9.itemId); // L: 11518
										Client.selectedSpellActionName = ArchiveLoader.Widget_getSpellActionName(var9); // L: 11519
										if (Client.selectedSpellActionName == null) { // L: 11520
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + MouseRecorder.colorStartTag(16777215); // L: 11521
									}

									var23 = var9.field3630[var20]; // L: 11523
									if (var9.field3692 == null) { // L: 11524
										var9.field3692 = new int[var9.field3622.length];
									}

									if (var9.field3625 == null) { // L: 11525
										var9.field3625 = new int[var9.field3622.length];
									}

									if (var23 != 0) { // L: 11526
										if (var9.field3692[var20] == 0) { // L: 11527
											var9.field3692[var20] = var23 + Client.cycle + var9.field3625[var20];
										} else {
											var9.field3692[var20] = var23 + Client.cycle; // L: 11528
										}
									} else {
										var9.field3692[var20] = Integer.MAX_VALUE; // L: 11530
									}
								}

								if (!var21 && var9.field3692 != null) { // L: 11532 11533
									var9.field3692[var20] = 0;
								}
							}
						}

						if (var9.isIf3) { // L: 11537
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11538
								var35 = true;
							} else {
								var35 = false; // L: 11539
							}

							boolean var36 = false; // L: 11540
							if ((MouseHandler.MouseHandler_currentButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) { // L: 11541
								var36 = true;
							}

							var21 = false; // L: 11542
							if ((MouseHandler.MouseHandler_lastButton == 1 || !SceneTilePaint.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) { // L: 11543
								var21 = true;
							}

							if (var21) { // L: 11544
								class18.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11); // L: 11545
							}

							if (var9.method6225()) { // L: 11547
								if (var21) { // L: 11548
									Client.field727.addFirst(new class200(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11549
								}

								if (var36) { // L: 11551
									Client.field727.addFirst(new class200(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9)); // L: 11552
								}
							}

							if (var9.contentType == 1400) { // L: 11555
								KitDefinition.worldMap.method7991(var17, var18, var35 & var36, var35 & var21); // L: 11556
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class136.method3075(Clock.getWidgetFlags(var9))) { // L: 11558
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) { // L: 11559
								Client.field745 = true; // L: 11560
								Client.field699 = var26; // L: 11561
								Client.field613 = var11; // L: 11562
							}

							if (var9.hasListener) { // L: 11564
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) { // L: 11565
									var22 = new ScriptEvent(); // L: 11566
									var22.isMouseInputEvent = true; // L: 11567
									var22.widget = var9; // L: 11568
									var22.mouseY = Client.mouseWheelRotation; // L: 11569
									var22.args = var9.onScroll; // L: 11570
									Client.scriptEvents.addFirst(var22); // L: 11571
								}

								if (Client.clickedWidget != null || class368.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11573
									var21 = false; // L: 11574
									var36 = false; // L: 11575
									var35 = false; // L: 11576
								}

								if (!var9.field3610 && var21) { // L: 11578
									var9.field3610 = true; // L: 11579
									if (var9.onClick != null) { // L: 11580
										var22 = new ScriptEvent(); // L: 11581
										var22.isMouseInputEvent = true; // L: 11582
										var22.widget = var9; // L: 11583
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26; // L: 11584
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11; // L: 11585
										var22.args = var9.onClick; // L: 11586
										Client.scriptEvents.addFirst(var22); // L: 11587
									}
								}

								if (var9.field3610 && var36 && var9.onClickRepeat != null) { // L: 11590 11591
									var22 = new ScriptEvent(); // L: 11592
									var22.isMouseInputEvent = true; // L: 11593
									var22.widget = var9; // L: 11594
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11595
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11596
									var22.args = var9.onClickRepeat; // L: 11597
									Client.scriptEvents.addFirst(var22); // L: 11598
								}

								if (var9.field3610 && !var36) { // L: 11601
									var9.field3610 = false; // L: 11602
									if (var9.onRelease != null) { // L: 11603
										var22 = new ScriptEvent(); // L: 11604
										var22.isMouseInputEvent = true; // L: 11605
										var22.widget = var9; // L: 11606
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11607
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11608
										var22.args = var9.onRelease; // L: 11609
										Client.field726.addFirst(var22); // L: 11610
									}
								}

								if (var36 && var9.onHold != null) { // L: 11613 11614
									var22 = new ScriptEvent(); // L: 11615
									var22.isMouseInputEvent = true; // L: 11616
									var22.widget = var9; // L: 11617
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11618
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11619
									var22.args = var9.onHold; // L: 11620
									Client.scriptEvents.addFirst(var22); // L: 11621
								}

								if (!var9.containsMouse && var35) { // L: 11624
									var9.containsMouse = true; // L: 11625
									if (var9.onMouseOver != null) { // L: 11626
										var22 = new ScriptEvent(); // L: 11627
										var22.isMouseInputEvent = true; // L: 11628
										var22.widget = var9; // L: 11629
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11630
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11631
										var22.args = var9.onMouseOver; // L: 11632
										Client.scriptEvents.addFirst(var22); // L: 11633
									}
								}

								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) { // L: 11636 11637
									var22 = new ScriptEvent(); // L: 11638
									var22.isMouseInputEvent = true; // L: 11639
									var22.widget = var9; // L: 11640
									var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11641
									var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11642
									var22.args = var9.onMouseRepeat; // L: 11643
									Client.scriptEvents.addFirst(var22); // L: 11644
								}

								if (var9.containsMouse && !var35) { // L: 11647
									var9.containsMouse = false; // L: 11648
									if (var9.onMouseLeave != null) { // L: 11649
										var22 = new ScriptEvent(); // L: 11650
										var22.isMouseInputEvent = true; // L: 11651
										var22.widget = var9; // L: 11652
										var22.mouseX = MouseHandler.MouseHandler_x - var26; // L: 11653
										var22.mouseY = MouseHandler.MouseHandler_y - var11; // L: 11654
										var22.args = var9.onMouseLeave; // L: 11655
										Client.field726.addFirst(var22); // L: 11656
									}
								}

								if (var9.onTimer != null) { // L: 11659
									var22 = new ScriptEvent(); // L: 11660
									var22.widget = var9; // L: 11661
									var22.args = var9.onTimer; // L: 11662
									Client.field725.addFirst(var22); // L: 11663
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.field707 > var9.field3645) { // L: 11665
									if (var9.varTransmitTriggers != null && Client.field707 - var9.field3645 <= 32) { // L: 11666
										label833:
										for (var39 = var9.field3645; var39 < Client.field707; ++var39) { // L: 11673
											var23 = Client.field706[var39 & 31]; // L: 11674

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) { // L: 11675
												if (var23 == var9.varTransmitTriggers[var37]) { // L: 11676
													var25 = new ScriptEvent(); // L: 11677
													var25.widget = var9; // L: 11678
													var25.args = var9.onVarTransmit; // L: 11679
													Client.scriptEvents.addFirst(var25); // L: 11680
													break label833; // L: 11681
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11667
										var22.widget = var9; // L: 11668
										var22.args = var9.onVarTransmit; // L: 11669
										Client.scriptEvents.addFirst(var22); // L: 11670
									}

									var9.field3645 = Client.field707; // L: 11686
								}

								if (var9.onInvTransmit != null && Client.field709 > var9.field3668) { // L: 11688
									if (var9.invTransmitTriggers != null && Client.field709 - var9.field3668 <= 32) { // L: 11689
										label809:
										for (var39 = var9.field3668; var39 < Client.field709; ++var39) { // L: 11696
											var23 = Client.field708[var39 & 31]; // L: 11697

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) { // L: 11698
												if (var23 == var9.invTransmitTriggers[var37]) { // L: 11699
													var25 = new ScriptEvent(); // L: 11700
													var25.widget = var9; // L: 11701
													var25.args = var9.onInvTransmit; // L: 11702
													Client.scriptEvents.addFirst(var25); // L: 11703
													break label809; // L: 11704
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11690
										var22.widget = var9; // L: 11691
										var22.args = var9.onInvTransmit; // L: 11692
										Client.scriptEvents.addFirst(var22); // L: 11693
									}

									var9.field3668 = Client.field709; // L: 11709
								}

								if (var9.onStatTransmit != null && Client.field711 > var9.field3637) { // L: 11711
									if (var9.statTransmitTriggers != null && Client.field711 - var9.field3637 <= 32) { // L: 11712
										label785:
										for (var39 = var9.field3637; var39 < Client.field711; ++var39) { // L: 11719
											var23 = Client.field636[var39 & 31]; // L: 11720

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) { // L: 11721
												if (var23 == var9.statTransmitTriggers[var37]) { // L: 11722
													var25 = new ScriptEvent(); // L: 11723
													var25.widget = var9; // L: 11724
													var25.args = var9.onStatTransmit; // L: 11725
													Client.scriptEvents.addFirst(var25); // L: 11726
													break label785; // L: 11727
												}
											}
										}
									} else {
										var22 = new ScriptEvent(); // L: 11713
										var22.widget = var9; // L: 11714
										var22.args = var9.onStatTransmit; // L: 11715
										Client.scriptEvents.addFirst(var22); // L: 11716
									}

									var9.field3637 = Client.field711; // L: 11732
								}

								if (Client.chatCycle > var9.field3572 && var9.onChatTransmit != null) { // L: 11734
									var22 = new ScriptEvent(); // L: 11735
									var22.widget = var9; // L: 11736
									var22.args = var9.onChatTransmit; // L: 11737
									Client.scriptEvents.addFirst(var22); // L: 11738
								}

								if (Client.field715 > var9.field3572 && var9.onFriendTransmit != null) { // L: 11740
									var22 = new ScriptEvent(); // L: 11741
									var22.widget = var9; // L: 11742
									var22.args = var9.onFriendTransmit; // L: 11743
									Client.scriptEvents.addFirst(var22); // L: 11744
								}

								if (Client.field610 > var9.field3572 && var9.onClanTransmit != null) { // L: 11746
									var22 = new ScriptEvent(); // L: 11747
									var22.widget = var9; // L: 11748
									var22.args = var9.onClanTransmit; // L: 11749
									Client.scriptEvents.addFirst(var22); // L: 11750
								}

								if (Client.field717 > var9.field3572 && var9.field3553 != null) { // L: 11752
									var22 = new ScriptEvent(); // L: 11753
									var22.widget = var9; // L: 11754
									var22.args = var9.field3553; // L: 11755
									Client.scriptEvents.addFirst(var22); // L: 11756
								}

								if (Client.field513 > var9.field3572 && var9.field3663 != null) { // L: 11758
									var22 = new ScriptEvent(); // L: 11759
									var22.widget = var9; // L: 11760
									var22.args = var9.field3663; // L: 11761
									Client.scriptEvents.addFirst(var22); // L: 11762
								}

								if (Client.field777 > var9.field3572 && var9.onStockTransmit != null) { // L: 11764
									var22 = new ScriptEvent(); // L: 11765
									var22.widget = var9; // L: 11766
									var22.args = var9.onStockTransmit; // L: 11767
									Client.scriptEvents.addFirst(var22); // L: 11768
								}

								if (Client.field720 > var9.field3572 && var9.field3567 != null) { // L: 11770
									var22 = new ScriptEvent(); // L: 11771
									var22.widget = var9; // L: 11772
									var22.args = var9.field3567; // L: 11773
									Client.scriptEvents.addFirst(var22); // L: 11774
								}

								if (Client.field721 > var9.field3572 && var9.onMiscTransmit != null) { // L: 11776
									var22 = new ScriptEvent(); // L: 11777
									var22.widget = var9; // L: 11778
									var22.args = var9.onMiscTransmit; // L: 11779
									Client.scriptEvents.addFirst(var22); // L: 11780
								}

								var9.field3572 = Client.cycleCntr; // L: 11782
								if (var9.onKey != null) { // L: 11783
									for (var39 = 0; var39 < Client.field710; ++var39) { // L: 11784
										ScriptEvent var32 = new ScriptEvent(); // L: 11785
										var32.widget = var9; // L: 11786
										var32.keyTyped = Client.field751[var39]; // L: 11787
										var32.keyPressed = Client.field774[var39]; // L: 11788
										var32.args = var9.onKey; // L: 11789
										Client.scriptEvents.addFirst(var32); // L: 11790
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3658 != null) { // L: 11793
									var38 = Client.field747.method4108(); // L: 11794

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11795
										var31 = new ScriptEvent(); // L: 11796
										var31.widget = var9; // L: 11797
										var31.keyTyped = var38[var23]; // L: 11798
										var31.args = var9.field3658; // L: 11799
										Client.scriptEvents.addFirst(var31); // L: 11800
									}
								}

								if (var9.field3653 != null) { // L: 11803
									var38 = Client.field747.method4109(); // L: 11804

									for (var23 = 0; var23 < var38.length; ++var23) { // L: 11805
										var31 = new ScriptEvent(); // L: 11806
										var31.widget = var9; // L: 11807
										var31.keyTyped = var38[var23]; // L: 11808
										var31.args = var9.field3653; // L: 11809
										Client.scriptEvents.addFirst(var31); // L: 11810
									}
								}
							}
						}

						if (!var9.isIf3) { // L: 11815
							if (Client.clickedWidget != null || class368.dragInventoryWidget != null || Client.isMenuOpen) { // L: 11816
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11817
								if (var9.mouseOverRedirect >= 0) { // L: 11818
									WorldMapScaleHandler.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapScaleHandler.mousedOverWidgetIf1 = var9; // L: 11819
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) { // L: 11821
								class380.field4470 = var9; // L: 11822
							}

							if (var9.scrollHeight > var9.height) { // L: 11824
								SoundSystem.method867(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) { // L: 11826
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY); // L: 11827
							if (var9.children != null) { // L: 11828
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id); // L: 11829
							if (var29 != null) { // L: 11830
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) { // L: 11831
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) { // L: 11832
										if (var30.isMouseInputEvent) { // L: 11833
											var30.remove(); // L: 11834
											var30.widget.containsMouse = false; // L: 11835
										}
									}

									if (class87.widgetDragDuration == 0) { // L: 11838
										Client.clickedWidget = null; // L: 11839
										Client.clickedWidgetParent = null; // L: 11840
									}

									if (!Client.isMenuOpen) { // L: 11842
										FriendsChatManager.addCancelMenuEntry(); // L: 11843
									}
								}

								class378.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11); // L: 11846
							}
						}
					}
				}
			}
		}

	} // L: 11850
}
