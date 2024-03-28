import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eo")
final class class107 implements class339 {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1377;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	class107(Widget var1) {
		this.val$cc = var1; // L: 518
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847242304"
	)
	public void vmethod6279() {
		if (this.val$cc != null && this.val$cc.method6683().field3671 != null) { // L: 520
			ScriptEvent var1 = new ScriptEvent(); // L: 521
			var1.method2305(this.val$cc); // L: 522
			var1.setArgs(this.val$cc.method6683().field3671); // L: 523
			class131.method3048().addFirst(var1); // L: 524
		}

	} // L: 526

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-15"
	)
	static int method2700(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4193
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4194
			return 1; // L: 4195
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4197
			class19.Interpreter_intStackSize -= 3; // L: 4198
			Client.publicChatMode = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4199
			class418.privateChatMode = class550.method9855(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]); // L: 4200
			if (class418.privateChatMode == null) { // L: 4201
				class418.privateChatMode = PrivateChatMode.field5372;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 2]; // L: 4202
			PacketBufferNode var13 = class425.getPacketBufferNode(ClientPacket.field3212, Client.packetWriter.isaacCipher); // L: 4204
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4205
			var13.packetBuffer.writeByte(class418.privateChatMode.field5374); // L: 4206
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4207
			Client.packetWriter.addNode(var13); // L: 4208
			return 1; // L: 4209
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4211
				var8 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4212
				class19.Interpreter_intStackSize -= 2; // L: 4213
				var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4214
				var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4215
				var6 = class425.getPacketBufferNode(ClientPacket.field3281, Client.packetWriter.isaacCipher); // L: 4217
				var6.packetBuffer.writeByte(SequenceDefinition.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4218
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4219
				var6.packetBuffer.writeByte(var7 - 1); // L: 4220
				var6.packetBuffer.writeByte(var9); // L: 4221
				Client.packetWriter.addNode(var6); // L: 4222
				return 1; // L: 4223
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4225
					class19.Interpreter_intStackSize -= 2; // L: 4226
					var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4227
					var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4228
					var5 = class1.Messages_getByChannelAndID(var3, var7); // L: 4229
					if (var5 != null) { // L: 4230
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.count; // L: 4231
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.cycle; // L: 4232
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4233
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4234
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4235
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4236
					} else {
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4239
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4240
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4241
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4242
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4243
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4244
					}

					return 1; // L: 4246
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4248
						var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4249
						var4 = Coord.Messages_getMessage(var3); // L: 4250
						if (var4 != null) { // L: 4251
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.type; // L: 4252
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.cycle; // L: 4253
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4254
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4255
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4256
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4257
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4260
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4261
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4262
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4263
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4264
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4265
						}

						return 1; // L: 4267
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4269
						if (class418.privateChatMode == null) { // L: 4270
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class418.privateChatMode.field5374; // L: 4271
						}

						return 1; // L: 4272
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4274
							var8 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4275
							var7 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4276
							var12 = FaceNormal.method4884(var7, var8, GraphicsObject.clientLanguage, -1); // L: 4277
							Client.packetWriter.addNode(var12); // L: 4278
							return 1; // L: 4279
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4281
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 4282
							var8 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4283
							String var11 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 4284
							var12 = class425.getPacketBufferNode(ClientPacket.field3267, Client.packetWriter.isaacCipher); // L: 4286
							var12.packetBuffer.writeShort(0); // L: 4287
							int var10 = var12.packetBuffer.offset; // L: 4288
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4289
							MenuAction.method2088(var12.packetBuffer, var11); // L: 4290
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4291
							Client.packetWriter.addNode(var12); // L: 4292
							return 1; // L: 4293
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4295
							var8 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4296
							class19.Interpreter_intStackSize -= 2; // L: 4297
							var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4298
							var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4299
							var6 = FaceNormal.method4884(var7, var8, GraphicsObject.clientLanguage, var9); // L: 4300
							Client.packetWriter.addNode(var6); // L: 4301
							return 1; // L: 4302
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4304
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4311
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4312
								return 1; // L: 4313
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4315
								var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4316
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class377.Messages_getHistorySize(var3); // L: 4317
								return 1; // L: 4318
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4320
								var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4321
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class333.Messages_getLastChatID(var3); // L: 4322
								return 1; // L: 4323
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4325
								var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4326
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = IgnoreList.method8043(var3); // L: 4327
								return 1; // L: 4328
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4330
								var8 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4331
								IntHashTable.doCheat(var8); // L: 4332
								return 1; // L: 4333
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4335
								Client.field745 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4336
								return 1; // L: 4337
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4339
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = Client.field745; // L: 4340
								return 1; // L: 4341
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4343
								var8 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4344
								System.out.println(var8); // L: 4345
								return 1; // L: 4346
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4348
								class19.Interpreter_intStackSize -= 2; // L: 4349
								var3 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4350
								var7 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4351
								var5 = class1.Messages_getByChannelAndID(var3, var7); // L: 4352
								if (var5 != null) { // L: 4353
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.count; // L: 4354
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.cycle; // L: 4355
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4356
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4357
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4358
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4359
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4360
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4361
								} else {
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4364
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4365
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4366
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4367
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4368
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4369
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4370
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4371
								}

								return 1; // L: 4373
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4375
								var3 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4376
								var4 = Coord.Messages_getMessage(var3); // L: 4377
								if (var4 != null) { // L: 4378
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.type; // L: 4379
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.cycle; // L: 4380
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4381
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4382
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4383
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4384
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4385
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4386
								} else {
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 4389
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4390
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4391
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4392
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4393
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4394
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 4395
									Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 4396
								}

								return 1; // L: 4398
							} else {
								return 2; // L: 4400
							}
						} else {
							if (class133.localPlayer != null && class133.localPlayer.username != null) { // L: 4306
								var8 = class133.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4307
							}

							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var8; // L: 4308
							return 1; // L: 4309
						}
					}
				}
			}
		}
	}
}
