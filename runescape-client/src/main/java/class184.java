import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
public class class184 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ab")
	public static String field1926;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1270171629
	)
	static int field1925;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "218055804"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4310, PlayerType.PlayerType_ironman, PlayerType.field4303, PlayerType.PlayerType_ultimateIronman, PlayerType.field4318, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4299, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_jagexModerator, PlayerType.field4319, PlayerType.field4311, PlayerType.field4312, PlayerType.field4304, PlayerType.PlayerType_normal, PlayerType.field4305, PlayerType.field4309, PlayerType.field4308}; // L: 30
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1951581624"
	)
	static int method3709(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4182
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4183
			return 1; // L: 4184
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4186
			UserComparator6.Interpreter_intStackSize -= 3; // L: 4187
			Client.publicChatMode = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4188
			class401.privateChatMode = GrandExchangeOfferAgeComparator.method7184(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 4189
			if (class401.privateChatMode == null) { // L: 4190
				class401.privateChatMode = PrivateChatMode.field5314;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 4191
			PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.field3196, Client.packetWriter.isaacCipher); // L: 4193
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4194
			var13.packetBuffer.writeByte(class401.privateChatMode.field5317); // L: 4195
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4196
			Client.packetWriter.addNode(var13); // L: 4197
			return 1; // L: 4198
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4200
				var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4201
				UserComparator6.Interpreter_intStackSize -= 2; // L: 4202
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4203
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4204
				var6 = class482.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 4206
				var6.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4207
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4208
				var6.packetBuffer.writeByte(var7 - 1); // L: 4209
				var6.packetBuffer.writeByte(var9); // L: 4210
				Client.packetWriter.addNode(var6); // L: 4211
				return 1; // L: 4212
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4214
					UserComparator6.Interpreter_intStackSize -= 2; // L: 4215
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4216
					var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4217
					var5 = GroundObject.Messages_getByChannelAndID(var3, var7); // L: 4218
					if (var5 != null) { // L: 4219
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.count; // L: 4220
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.cycle; // L: 4221
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4222
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4223
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4224
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4225
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4228
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4229
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4230
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4231
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4232
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4233
					}

					return 1; // L: 4235
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4237
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4238
						var4 = class18.Messages_getMessage(var3); // L: 4239
						if (var4 != null) { // L: 4240
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.type; // L: 4241
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.cycle; // L: 4242
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4243
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4244
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4245
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4246
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4249
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4250
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4251
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4252
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4253
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4254
						}

						return 1; // L: 4256
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4258
						if (class401.privateChatMode == null) { // L: 4259
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class401.privateChatMode.field5317; // L: 4260
						}

						return 1; // L: 4261
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4263
							var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4264
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4265
							var12 = GrandExchangeOfferOwnWorldComparator.method1249(var7, var8, class92.clientLanguage, -1); // L: 4266
							Client.packetWriter.addNode(var12); // L: 4267
							return 1; // L: 4268
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4270
							class211.Interpreter_stringStackSize -= 2; // L: 4271
							var8 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 4272
							String var11 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 4273
							var12 = class482.getPacketBufferNode(ClientPacket.field3240, Client.packetWriter.isaacCipher); // L: 4275
							var12.packetBuffer.writeShort(0); // L: 4276
							int var10 = var12.packetBuffer.offset; // L: 4277
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4278
							class228.method4502(var12.packetBuffer, var11); // L: 4279
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4280
							Client.packetWriter.addNode(var12); // L: 4281
							return 1; // L: 4282
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4284
							var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4285
							UserComparator6.Interpreter_intStackSize -= 2; // L: 4286
							var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4287
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4288
							var6 = GrandExchangeOfferOwnWorldComparator.method1249(var7, var8, class92.clientLanguage, var9); // L: 4289
							Client.packetWriter.addNode(var6); // L: 4290
							return 1; // L: 4291
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4293
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4300
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4301
								return 1; // L: 4302
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4304
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4305
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.Messages_getHistorySize(var3); // L: 4306
								return 1; // L: 4307
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4309
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4310
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class231.Messages_getLastChatID(var3); // L: 4311
								return 1; // L: 4312
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4314
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4315
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class211.method4229(var3); // L: 4316
								return 1; // L: 4317
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4319
								var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4320
								class230.doCheat(var8); // L: 4321
								return 1; // L: 4322
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4324
								Client.field733 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4325
								return 1; // L: 4326
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4328
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Client.field733; // L: 4329
								return 1; // L: 4330
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4332
								var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4333
								System.out.println(var8); // L: 4334
								return 1; // L: 4335
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4337
								UserComparator6.Interpreter_intStackSize -= 2; // L: 4338
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4339
								var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4340
								var5 = GroundObject.Messages_getByChannelAndID(var3, var7); // L: 4341
								if (var5 != null) { // L: 4342
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.count; // L: 4343
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.cycle; // L: 4344
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4345
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4346
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4347
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4348
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4349
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4350
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4353
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4354
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4355
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4356
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4357
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4358
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4359
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4360
								}

								return 1; // L: 4362
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4364
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4365
								var4 = class18.Messages_getMessage(var3); // L: 4366
								if (var4 != null) { // L: 4367
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.type; // L: 4368
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.cycle; // L: 4369
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4370
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4371
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4372
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4373
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4374
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4375
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4378
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4379
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4380
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4381
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4382
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4383
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4384
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4385
								}

								return 1; // L: 4387
							} else {
								return 2; // L: 4389
							}
						} else {
							if (class25.localPlayer != null && class25.localPlayer.username != null) { // L: 4295
								var8 = class25.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4296
							}

							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8; // L: 4297
							return 1; // L: 4298
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1255872498"
	)
	static int method3708(int var0, Script var1, boolean var2) {
		return 2; // L: 5157
	}
}
