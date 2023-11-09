import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ny")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -721787149
	)
	static int field4257;
	@ObfuscatedName("at")
	static boolean field4261;
	@ObfuscatedName("ac")
	static Object field4259;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field4257 = 0; // L: 11
		field4261 = false; // L: 12
		field4259 = new Object(); // L: 13
	}

	ArchiveDiskActionHandler() {
	} // L: 18

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 49
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 50
				} // L: 51

				if (var1 != null) { // L: 52
					if (var1.type == 0) { // L: 53
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 54
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 55
							var1.remove(); // L: 56
						} // L: 57
					} else if (var1.type == 1) { // L: 59
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 60
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 61
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 62
						} // L: 63
					}

					synchronized(field4259) { // L: 65
						if ((field4261 || field4257 <= 1) && ArchiveDiskActionHandler_requestQueue.method6983()) { // L: 66
							field4257 = 0; // L: 67
							field4259.notifyAll(); // L: 68
							return; // L: 69
						}

						field4257 = 600; // L: 71
					}
				} else {
					PendingSpawn.method2365(100L); // L: 75
					synchronized(field4259) { // L: 76
						if ((field4261 || field4257 <= 1) && ArchiveDiskActionHandler_requestQueue.method6983()) { // L: 77
							field4257 = 0; // L: 78
							field4259.notifyAll(); // L: 79
							return; // L: 80
						}

						--field4257; // L: 82
					}
				}
			}
		} catch (Exception var13) { // L: 87
			Messages.RunException_sendStackTrace((String)null, var13); // L: 88
		}
	} // L: 90

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-224365630"
	)
	static void method6647() {
		ItemComposition.field2285 = new int[2000]; // L: 25
		int var0 = 0; // L: 26
		int var1 = 240; // L: 27

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) { // L: 28
			var3 = ArchiveLoader.method2248((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F)); // L: 30
			ItemComposition.field2285[var0] = var3; // L: 31
			++var0; // L: 29
		}

		var1 = 48; // L: 33

		for (int var5 = var1 / 6; var0 < ItemComposition.field2285.length; var1 -= var5) { // L: 34 35 41
			var3 = var0 * 2;

			for (int var4 = ArchiveLoader.method2248((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < ItemComposition.field2285.length; ++var0) { // L: 37 38
				ItemComposition.field2285[var0] = var4; // L: 39
			}
		}

	} // L: 43

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "63"
	)
	public static final boolean method6640(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 36
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "5"
	)
	static int method6645(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4136
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4137
			return 1; // L: 4138
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4140
			SoundCache.Interpreter_intStackSize -= 3; // L: 4141
			Client.publicChatMode = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4142
			class128.privateChatMode = DevicePcmPlayerProvider.method317(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4143
			if (class128.privateChatMode == null) { // L: 4144
				class128.privateChatMode = PrivateChatMode.field5247;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 4145
			PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3187, Client.packetWriter.isaacCipher); // L: 4147
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4148
			var13.packetBuffer.writeByte(class128.privateChatMode.field5246); // L: 4149
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4150
			Client.packetWriter.addNode(var13); // L: 4151
			return 1; // L: 4152
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4154
				var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4155
				SoundCache.Interpreter_intStackSize -= 2; // L: 4156
				var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4157
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4158
				var6 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3191, Client.packetWriter.isaacCipher); // L: 4160
				var6.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4161
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4162
				var6.packetBuffer.writeByte(var7 - 1); // L: 4163
				var6.packetBuffer.writeByte(var9); // L: 4164
				Client.packetWriter.addNode(var6); // L: 4165
				return 1; // L: 4166
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4168
					SoundCache.Interpreter_intStackSize -= 2; // L: 4169
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4170
					var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4171
					var5 = AbstractByteArrayCopier.Messages_getByChannelAndID(var3, var7); // L: 4172
					if (var5 != null) { // L: 4173
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.count; // L: 4174
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.cycle; // L: 4175
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4176
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4177
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4178
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4179
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4182
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4183
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4184
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4185
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4186
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4187
					}

					return 1; // L: 4189
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4191
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4192
						var4 = class33.Messages_getMessage(var3); // L: 4193
						if (var4 != null) { // L: 4194
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.type; // L: 4195
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.cycle; // L: 4196
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4197
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4198
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4199
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4200
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4203
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4204
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4205
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4206
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4207
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4208
						}

						return 1; // L: 4210
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4212
						if (class128.privateChatMode == null) { // L: 4213
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class128.privateChatMode.field5246; // L: 4214
						}

						return 1; // L: 4215
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4217
							var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4218
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4219
							var12 = Actor.method2407(var7, var8, ClanChannelMember.clientLanguage, -1); // L: 4220
							Client.packetWriter.addNode(var12); // L: 4221
							return 1; // L: 4222
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4224
							class137.Interpreter_stringStackSize -= 2; // L: 4225
							var8 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 4226
							String var11 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 4227
							var12 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher); // L: 4229
							var12.packetBuffer.writeShort(0); // L: 4230
							int var10 = var12.packetBuffer.offset; // L: 4231
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4232
							class216.method4235(var12.packetBuffer, var11); // L: 4233
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4234
							Client.packetWriter.addNode(var12); // L: 4235
							return 1; // L: 4236
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4238
							var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4239
							SoundCache.Interpreter_intStackSize -= 2; // L: 4240
							var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4241
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4242
							var6 = Actor.method2407(var7, var8, ClanChannelMember.clientLanguage, var9); // L: 4243
							Client.packetWriter.addNode(var6); // L: 4244
							return 1; // L: 4245
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4247
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4254
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4255
								return 1; // L: 4256
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4258
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4259
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = HorizontalAlignment.Messages_getHistorySize(var3); // L: 4260
								return 1; // L: 4261
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4263
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4264
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClientPacket.Messages_getLastChatID(var3); // L: 4265
								return 1; // L: 4266
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4268
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4269
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClanChannelMember.method3119(var3); // L: 4270
								return 1; // L: 4271
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4273
								var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4274
								class85.doCheat(var8); // L: 4275
								return 1; // L: 4276
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4278
								Client.field554 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4279
								return 1; // L: 4280
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4282
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Client.field554; // L: 4283
								return 1; // L: 4284
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4286
								var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 4287
								System.out.println(var8); // L: 4288
								return 1; // L: 4289
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4291
								SoundCache.Interpreter_intStackSize -= 2; // L: 4292
								var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4293
								var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4294
								var5 = AbstractByteArrayCopier.Messages_getByChannelAndID(var3, var7); // L: 4295
								if (var5 != null) { // L: 4296
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.count; // L: 4297
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.cycle; // L: 4298
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4299
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4300
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4301
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4302
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4303
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4304
								} else {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4307
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4308
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4309
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4310
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4311
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4312
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4313
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4314
								}

								return 1; // L: 4316
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4318
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4319
								var4 = class33.Messages_getMessage(var3); // L: 4320
								if (var4 != null) { // L: 4321
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.type; // L: 4322
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.cycle; // L: 4323
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4324
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4325
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4326
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4327
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4328
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4329
								} else {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4332
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4333
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4334
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4335
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4336
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4337
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4338
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4339
								}

								return 1; // L: 4341
							} else {
								return 2; // L: 4343
							}
						} else {
							if (VarbitComposition.localPlayer != null && VarbitComposition.localPlayer.username != null) { // L: 4249
								var8 = VarbitComposition.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4250
							}

							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var8; // L: 4251
							return 1; // L: 4252
						}
					}
				}
			}
		}
	}
}
