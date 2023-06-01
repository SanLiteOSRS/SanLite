import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public enum class138 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1586(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1587(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1588(2, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1597(3, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1590(4, 4),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1591(5, 5),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1592(6, 6),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1594(7, 7),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1595(8, 8);

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	static Archive field1593;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 483419129
	)
	final int field1589;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1834357933
	)
	final int field1596;

	class138(int var3, int var4) {
		this.field1589 = var3; // L: 105
		this.field1596 = var4; // L: 106
	} // L: 107

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1596; // L: 110
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1887522875"
	)
	static int method3076(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4094
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4095
			return 1; // L: 4096
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4098
			class336.Interpreter_intStackSize -= 3; // L: 4099
			Client.publicChatMode = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4100
			WorldMapLabelSize.privateChatMode = class406.method7619(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 4101
			if (WorldMapLabelSize.privateChatMode == null) { // L: 4102
				WorldMapLabelSize.privateChatMode = PrivateChatMode.field5154;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 4103
			PacketBufferNode var13 = class251.getPacketBufferNode(ClientPacket.field3110, Client.packetWriter.isaacCipher); // L: 4105
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4106
			var13.packetBuffer.writeByte(WorldMapLabelSize.privateChatMode.field5156); // L: 4107
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4108
			Client.packetWriter.addNode(var13); // L: 4109
			return 1; // L: 4110
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4112
				var8 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4113
				class336.Interpreter_intStackSize -= 2; // L: 4114
				var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4115
				var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4116
				var6 = class251.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher); // L: 4118
				var6.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4119
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4120
				var6.packetBuffer.writeByte(var7 - 1); // L: 4121
				var6.packetBuffer.writeByte(var9); // L: 4122
				Client.packetWriter.addNode(var6); // L: 4123
				return 1; // L: 4124
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4126
					class336.Interpreter_intStackSize -= 2; // L: 4127
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4128
					var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4129
					var5 = World.Messages_getByChannelAndID(var3, var7); // L: 4130
					if (var5 != null) { // L: 4131
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.count; // L: 4132
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.cycle; // L: 4133
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4134
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4135
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4136
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4137
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4140
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4141
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4142
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4143
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4144
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4145
					}

					return 1; // L: 4147
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4149
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4150
						var4 = SecureRandomFuture.Messages_getMessage(var3); // L: 4151
						if (var4 != null) { // L: 4152
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.type; // L: 4153
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.cycle; // L: 4154
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4155
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4156
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4157
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4158
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4161
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4162
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4163
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4164
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4165
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4166
						}

						return 1; // L: 4168
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4170
						if (WorldMapLabelSize.privateChatMode == null) { // L: 4171
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = WorldMapLabelSize.privateChatMode.field5156; // L: 4172
						}

						return 1; // L: 4173
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4175
							var8 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4176
							var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4177
							var12 = Varcs.method2718(var7, var8, class124.clientLanguage, -1); // L: 4178
							Client.packetWriter.addNode(var12); // L: 4179
							return 1; // L: 4180
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4182
							class156.Interpreter_stringStackSize -= 2; // L: 4183
							var8 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 4184
							String var11 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 4185
							var12 = class251.getPacketBufferNode(ClientPacket.field3159, Client.packetWriter.isaacCipher); // L: 4187
							var12.packetBuffer.writeShort(0); // L: 4188
							int var10 = var12.packetBuffer.offset; // L: 4189
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4190
							class30.method433(var12.packetBuffer, var11); // L: 4191
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4192
							Client.packetWriter.addNode(var12); // L: 4193
							return 1; // L: 4194
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4196
							var8 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4197
							class336.Interpreter_intStackSize -= 2; // L: 4198
							var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4199
							var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4200
							var6 = Varcs.method2718(var7, var8, class124.clientLanguage, var9); // L: 4201
							Client.packetWriter.addNode(var6); // L: 4202
							return 1; // L: 4203
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4205
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4212
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4213
								return 1; // L: 4214
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4216
								var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4217
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Script.Messages_getHistorySize(var3); // L: 4218
								return 1; // L: 4219
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4221
								var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4222
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ClanChannelMember.Messages_getLastChatID(var3); // L: 4223
								return 1; // L: 4224
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4226
								var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4227
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = VarcInt.method3596(var3); // L: 4228
								return 1; // L: 4229
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4231
								var8 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4232
								class396.doCheat(var8); // L: 4233
								return 1; // L: 4234
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4236
								Client.field557 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4237
								return 1; // L: 4238
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4240
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = Client.field557; // L: 4241
								return 1; // L: 4242
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4244
								var8 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4245
								System.out.println(var8); // L: 4246
								return 1; // L: 4247
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4249
								class336.Interpreter_intStackSize -= 2; // L: 4250
								var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4251
								var7 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4252
								var5 = World.Messages_getByChannelAndID(var3, var7); // L: 4253
								if (var5 != null) { // L: 4254
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.count; // L: 4255
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.cycle; // L: 4256
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4257
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4258
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4259
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4260
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4261
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4262
								} else {
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4265
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4266
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4267
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4268
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4269
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4270
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4271
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4272
								}

								return 1; // L: 4274
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4276
								var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4277
								var4 = SecureRandomFuture.Messages_getMessage(var3); // L: 4278
								if (var4 != null) { // L: 4279
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.type; // L: 4280
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.cycle; // L: 4281
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4282
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4283
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4284
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4285
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4286
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4287
								} else {
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4290
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4291
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4292
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4293
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4294
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4295
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4296
									Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4297
								}

								return 1; // L: 4299
							} else {
								return 2; // L: 4301
							}
						} else {
							if (HitSplatDefinition.localPlayer != null && HitSplatDefinition.localPlayer.username != null) { // L: 4207
								var8 = HitSplatDefinition.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4208
							}

							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var8; // L: 4209
							return 1; // L: 4210
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	static void method3078() {
		for (class210 var0 = (class210)Client.field505.last(); var0 != null; var0 = (class210)Client.field505.previous()) { // L: 4992
			var0.remove(); // L: 4993
		}

	} // L: 4995

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1316445398"
	)
	static final void method3069(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8343
			if (Client.isLowDetail && var0 != NetFileRequest.Client_plane) { // L: 8344
				return;
			}

			long var8 = 0L; // L: 8345
			boolean var10 = true; // L: 8346
			boolean var11 = false; // L: 8347
			boolean var12 = false; // L: 8348
			if (var1 == 0) { // L: 8349
				var8 = UserComparator4.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8350
				var8 = UserComparator4.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8351
				var8 = UserComparator4.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8352
				var8 = UserComparator4.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			if (0L != var8) { // L: 8353
				var13 = UserComparator4.scene.getObjectFlags(var0, var2, var3, var8); // L: 8354
				int var15 = class299.Entity_unpackID(var8); // L: 8355
				int var16 = var13 & 31; // L: 8356
				int var17 = var13 >> 6 & 3; // L: 8357
				ObjectComposition var14;
				if (var1 == 0) { // L: 8358
					UserComparator4.scene.method4630(var0, var2, var3); // L: 8359
					var14 = class59.getObjectDefinition(var15); // L: 8360
					if (var14.interactType != 0) { // L: 8361
						Client.collisionMaps[var0].method4138(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8363
					UserComparator4.scene.method4492(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8364
					UserComparator4.scene.removeGameObject(var0, var2, var3); // L: 8365
					var14 = class59.getObjectDefinition(var15); // L: 8366
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8367
						return;
					}

					if (var14.interactType != 0) { // L: 8368
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8370
					UserComparator4.scene.method4529(var0, var2, var3); // L: 8371
					var14 = class59.getObjectDefinition(var15); // L: 8372
					if (var14.interactType == 1) { // L: 8373
						Client.collisionMaps[var0].method4119(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8376
				var13 = var0; // L: 8377
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8378
					var13 = var0 + 1;
				}

				Widget.method6571(var0, var13, var2, var3, var4, var5, var6, var7, UserComparator4.scene, Client.collisionMaps[var0]); // L: 8379
			}
		}

	} // L: 8382

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "118"
	)
	static void method3075(int var0) {
		Client.oculusOrbState = var0; // L: 12578
	} // L: 12579
}
