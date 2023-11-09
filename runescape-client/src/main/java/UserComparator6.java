import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;I)I",
		garbageValue = "2114105554"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("an")
	static boolean method2971(long var0) {
		return TextureProvider.method4736(var0) == 2; // L: 48
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "-45"
	)
	static int method2963(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4085
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4086
			return 1; // L: 4087
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4089
			Interpreter.Interpreter_intStackSize -= 3; // L: 4090
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4091
			FloorUnderlayDefinition.privateChatMode = class399.method7732(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4092
			if (FloorUnderlayDefinition.privateChatMode == null) { // L: 4093
				FloorUnderlayDefinition.privateChatMode = PrivateChatMode.field5128;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4094
			PacketBufferNode var13 = class330.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 4096
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4097
			var13.packetBuffer.writeByte(FloorUnderlayDefinition.privateChatMode.field5131); // L: 4098
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4099
			Client.packetWriter.addNode(var13); // L: 4100
			return 1; // L: 4101
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4103
				var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4104
				Interpreter.Interpreter_intStackSize -= 2; // L: 4105
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4106
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4107
				var6 = class330.getPacketBufferNode(ClientPacket.field3171, Client.packetWriter.isaacCipher); // L: 4109
				var6.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4110
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4111
				var6.packetBuffer.writeByte(var7 - 1); // L: 4112
				var6.packetBuffer.writeByte(var9); // L: 4113
				Client.packetWriter.addNode(var6); // L: 4114
				return 1; // L: 4115
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4117
					Interpreter.Interpreter_intStackSize -= 2; // L: 4118
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4119
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4120
					var5 = Actor.Messages_getByChannelAndID(var3, var7); // L: 4121
					if (var5 != null) { // L: 4122
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4123
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4124
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4125
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4126
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4127
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4128
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4131
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4132
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4133
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4134
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4135
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4136
					}

					return 1; // L: 4138
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4140
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4141
						var4 = MouseRecorder.Messages_getMessage(var3); // L: 4142
						if (var4 != null) { // L: 4143
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4144
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4145
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4146
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4147
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4148
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4149
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4152
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4153
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4154
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4155
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4156
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4157
						}

						return 1; // L: 4159
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4161
						if (FloorUnderlayDefinition.privateChatMode == null) { // L: 4162
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.privateChatMode.field5131; // L: 4163
						}

						return 1; // L: 4164
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4166
							var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4167
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4168
							var12 = class314.method6225(var7, var8, ClanSettings.clientLanguage, -1); // L: 4169
							Client.packetWriter.addNode(var12); // L: 4170
							return 1; // L: 4171
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4173
							SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 4174
							var8 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 4175
							String var11 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 4176
							var12 = class330.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 4178
							var12.packetBuffer.writeShort(0); // L: 4179
							int var10 = var12.packetBuffer.offset; // L: 4180
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4181
							WorldMapArea.method5162(var12.packetBuffer, var11); // L: 4182
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4183
							Client.packetWriter.addNode(var12); // L: 4184
							return 1; // L: 4185
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4187
							var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4188
							Interpreter.Interpreter_intStackSize -= 2; // L: 4189
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4190
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4191
							var6 = class314.method6225(var7, var8, ClanSettings.clientLanguage, var9); // L: 4192
							Client.packetWriter.addNode(var6); // L: 4193
							return 1; // L: 4194
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4196
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4203
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4204
								return 1; // L: 4205
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4207
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4208
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = World.Messages_getHistorySize(var3); // L: 4209
								return 1; // L: 4210
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4212
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4213
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FaceNormal.Messages_getLastChatID(var3); // L: 4214
								return 1; // L: 4215
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4217
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4218
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BuddyRankComparator.method2949(var3); // L: 4219
								return 1; // L: 4220
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4222
								var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4223
								DynamicObject.doCheat(var8); // L: 4224
								return 1; // L: 4225
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4227
								Client.field718 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4228
								return 1; // L: 4229
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4231
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Client.field718; // L: 4232
								return 1; // L: 4233
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4235
								var8 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4236
								System.out.println(var8); // L: 4237
								return 1; // L: 4238
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4240
								Interpreter.Interpreter_intStackSize -= 2; // L: 4241
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4242
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4243
								var5 = Actor.Messages_getByChannelAndID(var3, var7); // L: 4244
								if (var5 != null) { // L: 4245
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4246
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4247
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4248
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4249
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4250
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4251
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4252
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4253
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4256
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4257
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4258
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4259
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4260
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4261
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4262
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4263
								}

								return 1; // L: 4265
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4267
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4268
								var4 = MouseRecorder.Messages_getMessage(var3); // L: 4269
								if (var4 != null) { // L: 4270
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4271
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4272
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4273
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4274
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4275
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4276
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4277
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4278
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4281
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4282
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4283
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4284
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4285
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4286
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4287
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4288
								}

								return 1; // L: 4290
							} else {
								return 2; // L: 4292
							}
						} else {
							if (MusicPatchNode.localPlayer != null && MusicPatchNode.localPlayer.username != null) { // L: 4198
								var8 = MusicPatchNode.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4199
							}

							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var8; // L: 4200
							return 1; // L: 4201
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lde;II)V",
		garbageValue = "1654924432"
	)
	static final void method2972(Actor var0, int var1) {
		class374.worldToScreen(var0.x, var0.y, var1); // L: 5455
	} // L: 5456
}
