import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fw")
public class class174 {
	@ObfuscatedName("y")
	static byte[][][] field1852;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = 1243084179
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("c")
	public short[] field1858;
	@ObfuscatedName("x")
	public short[] field1855;

	public class174(int var1) {
		ItemComposition var2 = MidiPcmStream.ItemComposition_get(var1); // L: 12
		if (var2.method3785()) { // L: 13
			this.field1858 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1858, 0, this.field1858.length); // L: 15
		}

		if (var2.method3821()) { // L: 17
			this.field1855 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1855, 0, this.field1855.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "10"
	)
	static int method3400(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3948
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3949
			return 1; // L: 3950
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3952
			class379.Interpreter_intStackSize -= 3; // L: 3953
			Client.publicChatMode = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3954
			class300.privateChatMode = class359.method6838(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 3955
			if (class300.privateChatMode == null) { // L: 3956
				class300.privateChatMode = PrivateChatMode.field5000;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3957
			PacketBufferNode var13 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3099, Client.packetWriter.isaacCipher); // L: 3959
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3960
			var13.packetBuffer.writeByte(class300.privateChatMode.field4999); // L: 3961
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3962
			Client.packetWriter.addNode(var13); // L: 3963
			return 1; // L: 3964
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3966
				var8 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3967
				class379.Interpreter_intStackSize -= 2; // L: 3968
				var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3969
				var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3970
				var6 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher); // L: 3972
				var6.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3973
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3974
				var6.packetBuffer.writeByte(var7 - 1); // L: 3975
				var6.packetBuffer.writeByte(var9); // L: 3976
				Client.packetWriter.addNode(var6); // L: 3977
				return 1; // L: 3978
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3980
					class379.Interpreter_intStackSize -= 2; // L: 3981
					var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3982
					var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3983
					var5 = GrandExchangeEvents.Messages_getByChannelAndID(var3, var7); // L: 3984
					if (var5 != null) { // L: 3985
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.count; // L: 3986
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.cycle; // L: 3987
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3988
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3989
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3990
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3991
					} else {
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 3994
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3995
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 3996
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 3997
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 3998
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3999
					}

					return 1; // L: 4001
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4003
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4004
						var4 = class20.Messages_getMessage(var3); // L: 4005
						if (var4 != null) { // L: 4006
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.type; // L: 4007
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.cycle; // L: 4008
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4009
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4010
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4011
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4012
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4015
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4016
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4017
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4018
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4019
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4020
						}

						return 1; // L: 4022
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4024
						if (class300.privateChatMode == null) { // L: 4025
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class300.privateChatMode.field4999; // L: 4026
						}

						return 1; // L: 4027
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4029
							var8 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 4030
							var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4031
							var12 = class305.method6204(var7, var8, class103.clientLanguage, -1); // L: 4032
							Client.packetWriter.addNode(var12); // L: 4033
							return 1; // L: 4034
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4036
							class125.Interpreter_stringStackSize -= 2; // L: 4037
							var8 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 4038
							String var11 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 4039
							var12 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3077, Client.packetWriter.isaacCipher); // L: 4041
							var12.packetBuffer.writeShort(0); // L: 4042
							int var10 = var12.packetBuffer.offset; // L: 4043
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4044
							class281.method5418(var12.packetBuffer, var11); // L: 4045
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4046
							Client.packetWriter.addNode(var12); // L: 4047
							return 1; // L: 4048
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4050
							var8 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 4051
							class379.Interpreter_intStackSize -= 2; // L: 4052
							var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4053
							var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4054
							var6 = class305.method6204(var7, var8, class103.clientLanguage, var9); // L: 4055
							Client.packetWriter.addNode(var6); // L: 4056
							return 1; // L: 4057
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4059
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4066
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4067
								return 1; // L: 4068
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4070
								var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4071
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapSectionType.Messages_getHistorySize(var3); // L: 4072
								return 1; // L: 4073
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4075
								var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4076
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class133.Messages_getLastChatID(var3); // L: 4077
								return 1; // L: 4078
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4080
								var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4081
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class281.method5428(var3); // L: 4082
								return 1; // L: 4083
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4085
								var8 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 4086
								GameEngine.doCheat(var8); // L: 4087
								return 1; // L: 4088
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4090
								Client.field730 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4091
								return 1; // L: 4092
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4094
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = Client.field730; // L: 4095
								return 1; // L: 4096
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4098
								var8 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 4099
								System.out.println(var8); // L: 4100
								return 1; // L: 4101
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4103
								class379.Interpreter_intStackSize -= 2; // L: 4104
								var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4105
								var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 4106
								var5 = GrandExchangeEvents.Messages_getByChannelAndID(var3, var7); // L: 4107
								if (var5 != null) { // L: 4108
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.count; // L: 4109
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.cycle; // L: 4110
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4111
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4112
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4113
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4114
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4115
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4116
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4119
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4120
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4121
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4122
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4123
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4124
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4125
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4126
								}

								return 1; // L: 4128
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4130
								var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4131
								var4 = class20.Messages_getMessage(var3); // L: 4132
								if (var4 != null) { // L: 4133
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.type; // L: 4134
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.cycle; // L: 4135
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4136
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4137
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4138
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4139
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4140
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4141
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4144
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4145
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4146
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4147
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4148
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4149
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4150
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4151
								}

								return 1; // L: 4153
							} else {
								return 2; // L: 4155
							}
						} else {
							if (class296.localPlayer != null && class296.localPlayer.username != null) { // L: 4061
								var8 = class296.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4062
							}

							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var8; // L: 4063
							return 1; // L: 4064
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1855673975"
	)
	static boolean method3399() {
		return Client.tapToDrop || Client.field733.method3956(81); // L: 11304
	}
}
