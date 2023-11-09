import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
public class class7 {
	@ObfuscatedName("ai")
	ExecutorService field25;
	@ObfuscatedName("aj")
	Future field22;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	final Buffer field26;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class3 field24;

	@ObfuscatedSignature(
		descriptor = "(Ltl;Law;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor(); // L: 10
		this.field26 = var1; // L: 16
		this.field24 = var2; // L: 17
		this.method50(); // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "782312521"
	)
	public boolean method59() {
		return this.field22.isDone(); // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "533045396"
	)
	public void method44() {
		this.field25.shutdown(); // L: 26
		this.field25 = null; // L: 27
	} // L: 28

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "2086997878"
	)
	public Buffer method45() {
		try {
			return (Buffer)this.field22.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "371966452"
	)
	void method50() {
		this.field22 = this.field25.submit(new class1(this, this.field26, this.field24)); // L: 40
	} // L: 41

	@ObfuscatedName("aw")
	public static int method58(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 60
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-88"
	)
	static void method46(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-96"
	)
	static int method42(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4133
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4134
			return 1; // L: 4135
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4137
			Interpreter.Interpreter_intStackSize -= 3; // L: 4138
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4139
			WorldMapRectangle.privateChatMode = class33.method500(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4140
			if (WorldMapRectangle.privateChatMode == null) { // L: 4141
				WorldMapRectangle.privateChatMode = PrivateChatMode.field5204;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4142
			PacketBufferNode var13 = class217.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher); // L: 4144
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4145
			var13.packetBuffer.writeByte(WorldMapRectangle.privateChatMode.field5203); // L: 4146
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4147
			Client.packetWriter.addNode(var13); // L: 4148
			return 1; // L: 4149
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4151
				var8 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4152
				Interpreter.Interpreter_intStackSize -= 2; // L: 4153
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4154
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4155
				var6 = class217.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 4157
				var6.packetBuffer.writeByte(Player.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4158
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4159
				var6.packetBuffer.writeByte(var7 - 1); // L: 4160
				var6.packetBuffer.writeByte(var9); // L: 4161
				Client.packetWriter.addNode(var6); // L: 4162
				return 1; // L: 4163
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4165
					Interpreter.Interpreter_intStackSize -= 2; // L: 4166
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4167
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4168
					var5 = WorldMapSection1.Messages_getByChannelAndID(var3, var7); // L: 4169
					if (var5 != null) { // L: 4170
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4171
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4172
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4173
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4174
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4175
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4176
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4179
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4180
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4181
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4182
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4183
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4184
					}

					return 1; // L: 4186
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4188
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4189
						var4 = class424.Messages_getMessage(var3); // L: 4190
						if (var4 != null) { // L: 4191
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4192
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4193
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4194
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4195
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4196
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4197
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4200
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4201
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4202
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4203
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4204
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4205
						}

						return 1; // L: 4207
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4209
						if (WorldMapRectangle.privateChatMode == null) { // L: 4210
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRectangle.privateChatMode.field5203; // L: 4211
						}

						return 1; // L: 4212
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4214
							var8 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4215
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4216
							var12 = class317.method6082(var7, var8, WorldMapElement.clientLanguage, -1); // L: 4217
							Client.packetWriter.addNode(var12); // L: 4218
							return 1; // L: 4219
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4221
							class179.Interpreter_stringStackSize -= 2; // L: 4222
							var8 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 4223
							String var11 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 4224
							var12 = class217.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher); // L: 4226
							var12.packetBuffer.writeShort(0); // L: 4227
							int var10 = var12.packetBuffer.offset; // L: 4228
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4229
							MusicPatch.method6021(var12.packetBuffer, var11); // L: 4230
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4231
							Client.packetWriter.addNode(var12); // L: 4232
							return 1; // L: 4233
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4235
							var8 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4236
							Interpreter.Interpreter_intStackSize -= 2; // L: 4237
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4238
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4239
							var6 = class317.method6082(var7, var8, WorldMapElement.clientLanguage, var9); // L: 4240
							Client.packetWriter.addNode(var6); // L: 4241
							return 1; // L: 4242
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4244
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4251
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4252
								return 1; // L: 4253
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4255
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4256
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class17.Messages_getHistorySize(var3); // L: 4257
								return 1; // L: 4258
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4260
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4261
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractWorldMapData.Messages_getLastChatID(var3); // L: 4262
								return 1; // L: 4263
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4265
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4266
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomFuture.method2173(var3); // L: 4267
								return 1; // L: 4268
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4270
								var8 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4271
								IgnoreList.doCheat(var8); // L: 4272
								return 1; // L: 4273
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4275
								Client.field730 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4276
								return 1; // L: 4277
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4279
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = Client.field730; // L: 4280
								return 1; // L: 4281
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4283
								var8 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 4284
								System.out.println(var8); // L: 4285
								return 1; // L: 4286
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4288
								Interpreter.Interpreter_intStackSize -= 2; // L: 4289
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4290
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4291
								var5 = WorldMapSection1.Messages_getByChannelAndID(var3, var7); // L: 4292
								if (var5 != null) { // L: 4293
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4294
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4295
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4296
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4297
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4298
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4299
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4300
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4301
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4304
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4305
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4306
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4307
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4308
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4309
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4310
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4311
								}

								return 1; // L: 4313
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4315
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4316
								var4 = class424.Messages_getMessage(var3); // L: 4317
								if (var4 != null) { // L: 4318
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4319
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4320
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4321
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4322
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4323
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4324
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4325
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4326
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4329
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4330
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4331
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4332
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4333
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4334
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4335
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4336
								}

								return 1; // L: 4338
							} else {
								return 2; // L: 4340
							}
						} else {
							if (class27.localPlayer != null && class27.localPlayer.username != null) { // L: 4246
								var8 = class27.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4247
							}

							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var8; // L: 4248
							return 1; // L: 4249
						}
					}
				}
			}
		}
	}
}
