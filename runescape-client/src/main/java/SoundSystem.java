import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	static Widget field319;
	@ObfuscatedName("au")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class364.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "27"
	)
	static int method835(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4064
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4065
			return 1; // L: 4066
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4068
			Interpreter.Interpreter_intStackSize -= 3; // L: 4069
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4070
			class207.privateChatMode = class181.method3544(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4071
			if (class207.privateChatMode == null) { // L: 4072
				class207.privateChatMode = PrivateChatMode.field5040;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4073
			PacketBufferNode var13 = UserComparator9.getPacketBufferNode(ClientPacket.field3085, Client.packetWriter.isaacCipher); // L: 4075
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4076
			var13.packetBuffer.writeByte(class207.privateChatMode.field5038); // L: 4077
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4078
			Client.packetWriter.addNode(var13); // L: 4079
			return 1; // L: 4080
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4082
				var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4083
				Interpreter.Interpreter_intStackSize -= 2; // L: 4084
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4085
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4086
				var6 = UserComparator9.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 4088
				var6.packetBuffer.writeByte(WorldMapLabel.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4089
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4090
				var6.packetBuffer.writeByte(var7 - 1); // L: 4091
				var6.packetBuffer.writeByte(var9); // L: 4092
				Client.packetWriter.addNode(var6); // L: 4093
				return 1; // L: 4094
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4096
					Interpreter.Interpreter_intStackSize -= 2; // L: 4097
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4098
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4099
					var5 = TaskHandler.Messages_getByChannelAndID(var3, var7); // L: 4100
					if (var5 != null) { // L: 4101
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4102
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4103
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4104
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4105
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4106
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4107
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4110
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4111
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4112
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4113
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4114
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4115
					}

					return 1; // L: 4117
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4119
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4120
						var4 = class208.Messages_getMessage(var3); // L: 4121
						if (var4 != null) { // L: 4122
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4123
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4124
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4125
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4126
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4127
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4128
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4131
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4132
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4133
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4134
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4135
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4136
						}

						return 1; // L: 4138
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4140
						if (class207.privateChatMode == null) { // L: 4141
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class207.privateChatMode.field5038; // L: 4142
						}

						return 1; // L: 4143
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4145
							var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4146
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4147
							var12 = BuddyRankComparator.method2887(var7, var8, class69.clientLanguage, -1); // L: 4148
							Client.packetWriter.addNode(var12); // L: 4149
							return 1; // L: 4150
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4152
							HealthBar.Interpreter_stringStackSize -= 2; // L: 4153
							var8 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 4154
							String var11 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 4155
							var12 = UserComparator9.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 4157
							var12.packetBuffer.writeShort(0); // L: 4158
							int var10 = var12.packetBuffer.offset; // L: 4159
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4160
							ClanChannel.method3325(var12.packetBuffer, var11); // L: 4161
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4162
							Client.packetWriter.addNode(var12); // L: 4163
							return 1; // L: 4164
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4166
							var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4167
							Interpreter.Interpreter_intStackSize -= 2; // L: 4168
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4169
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4170
							var6 = BuddyRankComparator.method2887(var7, var8, class69.clientLanguage, var9); // L: 4171
							Client.packetWriter.addNode(var6); // L: 4172
							return 1; // L: 4173
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4175
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4182
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4183
								return 1; // L: 4184
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4186
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4187
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SecureRandomCallable.Messages_getHistorySize(var3); // L: 4188
								return 1; // L: 4189
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4191
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4192
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class1.Messages_getLastChatID(var3); // L: 4193
								return 1; // L: 4194
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4196
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4197
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class329.method6345(var3); // L: 4198
								return 1; // L: 4199
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4201
								var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4202
								class122.doCheat(var8); // L: 4203
								return 1; // L: 4204
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4206
								Client.field637 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4207
								return 1; // L: 4208
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4210
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Client.field637; // L: 4211
								return 1; // L: 4212
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4214
								var8 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 4215
								System.out.println(var8); // L: 4216
								return 1; // L: 4217
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4219
								Interpreter.Interpreter_intStackSize -= 2; // L: 4220
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4221
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4222
								var5 = TaskHandler.Messages_getByChannelAndID(var3, var7); // L: 4223
								if (var5 != null) { // L: 4224
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4225
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4226
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4227
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4228
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4229
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4230
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4231
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4232
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4235
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4236
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4237
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4238
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4239
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4240
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4241
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4242
								}

								return 1; // L: 4244
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4246
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4247
								var4 = class208.Messages_getMessage(var3); // L: 4248
								if (var4 != null) { // L: 4249
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4250
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4251
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4252
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4253
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4254
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4255
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4256
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4257
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4260
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4261
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4262
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4263
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4264
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4265
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4266
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4267
								}

								return 1; // L: 4269
							} else {
								return 2; // L: 4271
							}
						} else {
							if (BuddyRankComparator.localPlayer != null && BuddyRankComparator.localPlayer.username != null) { // L: 4177
								var8 = BuddyRankComparator.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4178
							}

							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var8; // L: 4179
							return 1; // L: 4180
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1153770034"
	)
	static final void method834() {
		WallObject.method4754(false); // L: 5757
		Client.field627 = 0; // L: 5758
		boolean var0 = true; // L: 5759

		int var1;
		for (var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) { // L: 5760
			if (PacketBuffer.regionMapArchiveIds[var1] != -1 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) { // L: 5761 5762
				GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] = ClientPreferences.field1265.takeFile(PacketBuffer.regionMapArchiveIds[var1], 0); // L: 5763
				if (GrandExchangeOfferOwnWorldComparator.regionLandArchives[var1] == null) { // L: 5764
					var0 = false; // L: 5765
					++Client.field627; // L: 5766
				}
			}

			if (class123.regionLandArchiveIds[var1] != -1 && class372.regionMapArchives[var1] == null) { // L: 5770 5771
				class372.regionMapArchives[var1] = ClientPreferences.field1265.takeFileEncrypted(class123.regionLandArchiveIds[var1], 0, ModelData0.xteaKeys[var1]); // L: 5772
				if (class372.regionMapArchives[var1] == null) { // L: 5773
					var0 = false; // L: 5774
					++Client.field627; // L: 5775
				}
			}
		}

		if (!var0) { // L: 5780
			Client.field501 = 1; // L: 5781
		} else {
			Client.field548 = 0; // L: 5784
			var0 = true; // L: 5785

			int var3;
			int var4;
			for (var1 = 0; var1 < GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; ++var1) { // L: 5786
				byte[] var17 = class372.regionMapArchives[var1]; // L: 5787
				if (var17 != null) { // L: 5788
					var3 = (class12.regions[var1] >> 8) * 64 - GameEngine.baseX * 64; // L: 5789
					var4 = (class12.regions[var1] & 255) * 64 - class178.baseY * 64; // L: 5790
					if (Client.isInInstance) { // L: 5791
						var3 = 10; // L: 5792
						var4 = 10; // L: 5793
					}

					var0 &= class150.method3188(var17, var3, var4); // L: 5795
				}
			}

			if (!var0) { // L: 5798
				Client.field501 = 2; // L: 5799
			} else {
				if (Client.field501 != 0) { // L: 5802
					class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				EnumComposition.playPcmPlayers(); // L: 5803
				class1.scene.clear(); // L: 5804

				for (var1 = 0; var1 < 4; ++var1) { // L: 5805
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5806
					for (var2 = 0; var2 < 104; ++var2) { // L: 5807
						for (var3 = 0; var3 < 104; ++var3) { // L: 5808
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5809
						}
					}
				}

				EnumComposition.playPcmPlayers(); // L: 5813
				class12.method109(); // L: 5814
				var1 = GrandExchangeOfferOwnWorldComparator.regionLandArchives.length; // L: 5815
				class389.method7353(); // L: 5816
				WallObject.method4754(true); // L: 5817
				int var5;
				if (!Client.isInInstance) { // L: 5818
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5819
						var3 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64; // L: 5820
						var4 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64; // L: 5821
						var16 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2]; // L: 5822
						if (var16 != null) { // L: 5823
							EnumComposition.playPcmPlayers(); // L: 5824
							Decimator.method1125(var16, var3, var4, class124.field1471 * 8 - 48, ArchiveDiskActionHandler.field4161 * 8 - 48, Client.collisionMaps); // L: 5825
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5828
						var3 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64; // L: 5829
						var4 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64; // L: 5830
						var16 = GrandExchangeOfferOwnWorldComparator.regionLandArchives[var2]; // L: 5831
						if (var16 == null && ArchiveDiskActionHandler.field4161 < 800) { // L: 5832
							EnumComposition.playPcmPlayers(); // L: 5833
							class350.method6634(var3, var4, 64, 64); // L: 5834
						}
					}

					WallObject.method4754(true); // L: 5837

					for (var2 = 0; var2 < var1; ++var2) { // L: 5838
						byte[] var15 = class372.regionMapArchives[var2]; // L: 5839
						if (var15 != null) { // L: 5840
							var4 = (class12.regions[var2] >> 8) * 64 - GameEngine.baseX * 64; // L: 5841
							var5 = (class12.regions[var2] & 255) * 64 - class178.baseY * 64; // L: 5842
							EnumComposition.playPcmPlayers(); // L: 5843
							WorldMapDecoration.method5220(var15, var4, var5, class1.scene, Client.collisionMaps); // L: 5844
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5848
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5849
						EnumComposition.playPcmPlayers(); // L: 5850

						for (var3 = 0; var3 < 13; ++var3) { // L: 5851
							for (var4 = 0; var4 < 13; ++var4) { // L: 5852
								boolean var18 = false; // L: 5853
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5854
								if (var6 != -1) { // L: 5855
									var7 = var6 >> 24 & 3; // L: 5856
									var8 = var6 >> 1 & 3; // L: 5857
									var9 = var6 >> 14 & 1023; // L: 5858
									var10 = var6 >> 3 & 2047; // L: 5859
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5860

									for (int var12 = 0; var12 < class12.regions.length; ++var12) { // L: 5861
										if (class12.regions[var12] == var11 && GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12] != null) { // L: 5862
											int var13 = (var9 - var3) * 8; // L: 5863
											int var14 = (var10 - var4) * 8; // L: 5864
											class220.method4359(GrandExchangeOfferOwnWorldComparator.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 5865
											var18 = true; // L: 5866
											break;
										}
									}
								}

								if (!var18) { // L: 5871
									MenuAction.method2052(var2, var3 * 8, var4 * 8); // L: 5872
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5877
						for (var3 = 0; var3 < 13; ++var3) { // L: 5878
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5879
							if (var4 == -1) { // L: 5880
								class350.method6634(var2 * 8, var3 * 8, 8, 8); // L: 5881
							}
						}
					}

					WallObject.method4754(true); // L: 5885

					for (var2 = 0; var2 < 4; ++var2) { // L: 5886
						EnumComposition.playPcmPlayers(); // L: 5887

						for (var3 = 0; var3 < 13; ++var3) { // L: 5888
							for (var4 = 0; var4 < 13; ++var4) { // L: 5889
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5890
								if (var5 != -1) { // L: 5891
									var6 = var5 >> 24 & 3; // L: 5892
									var7 = var5 >> 1 & 3; // L: 5893
									var8 = var5 >> 14 & 1023; // L: 5894
									var9 = var5 >> 3 & 2047; // L: 5895
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5896

									for (var11 = 0; var11 < class12.regions.length; ++var11) { // L: 5897
										if (class12.regions[var11] == var10 && class372.regionMapArchives[var11] != null) { // L: 5898
											Tiles.method2163(class372.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class1.scene, Client.collisionMaps); // L: 5899
											break; // L: 5900
										}
									}
								}
							}
						}
					}
				}

				WallObject.method4754(true); // L: 5908
				EnumComposition.playPcmPlayers(); // L: 5909
				UserComparator7.method2855(class1.scene, Client.collisionMaps); // L: 5910
				WallObject.method4754(true); // L: 5911
				var2 = Tiles.Tiles_minPlane; // L: 5912
				if (var2 > TaskHandler.Client_plane) { // L: 5913
					var2 = TaskHandler.Client_plane;
				}

				if (var2 < TaskHandler.Client_plane - 1) { // L: 5914
					var2 = TaskHandler.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5915
					class1.scene.init(Tiles.Tiles_minPlane);
				} else {
					class1.scene.init(0); // L: 5916
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5917
					for (var4 = 0; var4 < 104; ++var4) { // L: 5918
						class148.updateItemPile(var3, var4); // L: 5919
					}
				}

				EnumComposition.playPcmPlayers(); // L: 5922
				UserComparator8.method2847(); // L: 5923
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5924
				PacketBufferNode var19;
				if (class392.client.hasFrame()) { // L: 5925
					var19 = UserComparator9.getPacketBufferNode(ClientPacket.field3149, Client.packetWriter.isaacCipher); // L: 5927
					var19.packetBuffer.writeInt(1057001181); // L: 5928
					Client.packetWriter.addNode(var19); // L: 5929
				}

				if (!Client.isInInstance) { // L: 5931
					var3 = (class124.field1471 - 6) / 8; // L: 5932
					var4 = (class124.field1471 + 6) / 8; // L: 5933
					var5 = (ArchiveDiskActionHandler.field4161 - 6) / 8; // L: 5934
					var6 = (ArchiveDiskActionHandler.field4161 + 6) / 8; // L: 5935

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5936
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5937
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5938
								ClientPreferences.field1265.loadRegionFromName("m" + var7 + "_" + var8); // L: 5939
								ClientPreferences.field1265.loadRegionFromName("l" + var7 + "_" + var8); // L: 5940
							}
						}
					}
				}

				class19.method280(30); // L: 5944
				EnumComposition.playPcmPlayers(); // L: 5945
				class36.method675(); // L: 5946
				var19 = UserComparator9.getPacketBufferNode(ClientPacket.field3058, Client.packetWriter.isaacCipher); // L: 5947
				Client.packetWriter.addNode(var19); // L: 5948
				class332.method6352(); // L: 5949
			}
		}
	} // L: 5782 5800 5950
}
