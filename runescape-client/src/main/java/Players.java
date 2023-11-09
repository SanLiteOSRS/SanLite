import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
@Implements("Players")
public class Players {
	@ObfuscatedName("av")
	static byte[] field1330;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	static class216[] field1328;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Ltz;"
	)
	static Buffer[] field1332;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 377514575
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ab")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1650114917
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ae")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("af")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ao")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("aa")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 262229345
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ad")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	static Buffer field1342;

	static {
		field1330 = new byte[2048]; // L: 19
		field1328 = new class216[2048]; // L: 20
		field1332 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0; // L: 29
		Players_pendingUpdateIndices = new int[2048]; // L: 30
		field1342 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "2142252006"
	)
	static int method2699(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4094
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4095
			return 1; // L: 4096
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4098
			Interpreter.Interpreter_intStackSize -= 3; // L: 4099
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4100
			SpotAnimationDefinition.privateChatMode = class404.method7633(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4101
			if (SpotAnimationDefinition.privateChatMode == null) { // L: 4102
				SpotAnimationDefinition.privateChatMode = PrivateChatMode.field5154;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4103
			PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3125, Client.packetWriter.isaacCipher); // L: 4105
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4106
			var13.packetBuffer.writeByte(SpotAnimationDefinition.privateChatMode.field5156); // L: 4107
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4108
			Client.packetWriter.addNode(var13); // L: 4109
			return 1; // L: 4110
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4112
				var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4113
				Interpreter.Interpreter_intStackSize -= 2; // L: 4114
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4115
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4116
				var6 = ObjectComposition.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 4118
				var6.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4119
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4120
				var6.packetBuffer.writeByte(var7 - 1); // L: 4121
				var6.packetBuffer.writeByte(var9); // L: 4122
				Client.packetWriter.addNode(var6); // L: 4123
				return 1; // L: 4124
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4126
					Interpreter.Interpreter_intStackSize -= 2; // L: 4127
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4128
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4129
					var5 = UserComparator5.Messages_getByChannelAndID(var3, var7); // L: 4130
					if (var5 != null) { // L: 4131
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4132
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4133
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4134
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4135
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4136
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4137
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4140
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4141
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4142
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4143
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4144
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4145
					}

					return 1; // L: 4147
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4149
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4150
						var4 = class166.Messages_getMessage(var3); // L: 4151
						if (var4 != null) { // L: 4152
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4153
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4154
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4155
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4156
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4157
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4158
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4161
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4162
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4163
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4164
							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4165
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4166
						}

						return 1; // L: 4168
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4170
						if (SpotAnimationDefinition.privateChatMode == null) { // L: 4171
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.privateChatMode.field5156; // L: 4172
						}

						return 1; // L: 4173
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4175
							var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4176
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4177
							var12 = SpotAnimationDefinition.method3778(var7, var8, TriBool.clientLanguage, -1); // L: 4178
							Client.packetWriter.addNode(var12); // L: 4179
							return 1; // L: 4180
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4182
							class149.Interpreter_stringStackSize -= 2; // L: 4183
							var8 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize]; // L: 4184
							String var11 = Interpreter.Interpreter_stringStack[class149.Interpreter_stringStackSize + 1]; // L: 4185
							var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 4187
							var12.packetBuffer.writeShort(0); // L: 4188
							int var10 = var12.packetBuffer.offset; // L: 4189
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4190
							class324.method6006(var12.packetBuffer, var11); // L: 4191
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4192
							Client.packetWriter.addNode(var12); // L: 4193
							return 1; // L: 4194
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4196
							var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4197
							Interpreter.Interpreter_intStackSize -= 2; // L: 4198
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4199
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4200
							var6 = SpotAnimationDefinition.method3778(var7, var8, TriBool.clientLanguage, var9); // L: 4201
							Client.packetWriter.addNode(var6); // L: 4202
							return 1; // L: 4203
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4205
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4212
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4213
								return 1; // L: 4214
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4216
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4217
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.Messages_getHistorySize(var3); // L: 4218
								return 1; // L: 4219
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4221
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4222
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class104.Messages_getLastChatID(var3); // L: 4223
								return 1; // L: 4224
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4226
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4227
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginPacket.method5680(var3); // L: 4228
								return 1; // L: 4229
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4231
								var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4232
								class324.doCheat(var8); // L: 4233
								return 1; // L: 4234
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4236
								Client.field736 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4237
								return 1; // L: 4238
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4240
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Client.field736; // L: 4241
								return 1; // L: 4242
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4244
								var8 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4245
								System.out.println(var8); // L: 4246
								return 1; // L: 4247
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4249
								Interpreter.Interpreter_intStackSize -= 2; // L: 4250
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4251
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4252
								var5 = UserComparator5.Messages_getByChannelAndID(var3, var7); // L: 4253
								if (var5 != null) { // L: 4254
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4255
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4256
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4257
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4258
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4259
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4260
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4261
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4262
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4265
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4266
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4267
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4268
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4269
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4270
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4271
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4272
								}

								return 1; // L: 4274
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4276
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4277
								var4 = class166.Messages_getMessage(var3); // L: 4278
								if (var4 != null) { // L: 4279
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4280
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4281
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4282
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4283
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4284
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4285
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4286
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4287
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4290
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4291
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4292
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4293
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4294
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4295
									Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4296
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4297
								}

								return 1; // L: 4299
							} else {
								return 2; // L: 4301
							}
						} else {
							if (Projectile.localPlayer != null && Projectile.localPlayer.username != null) { // L: 4207
								var8 = Projectile.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4208
							}

							Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var8; // L: 4209
							return 1; // L: 4210
						}
					}
				}
			}
		}
	}
}
