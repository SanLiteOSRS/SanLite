import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("le")
@Implements("StudioGame")
public enum StudioGame implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("i")
	@Export("name")
	public final String name;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 167550277
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3; // L: 21
		this.id = var5; // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "1538018106"
	)
	static Date method6442() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 979
		var0.set(2, 0); // L: 980
		var0.set(5, 1); // L: 981
		var0.set(1, 1900); // L: 982
		return var0.getTime(); // L: 983
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "62754255"
	)
	static int method6441(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 3955
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 3956
			return 1; // L: 3957
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 3959
			class302.Interpreter_intStackSize -= 3; // L: 3960
			Client.publicChatMode = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3961
			class288.privateChatMode = class189.method3719(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 3962
			if (class288.privateChatMode == null) { // L: 3963
				class288.privateChatMode = PrivateChatMode.field5072;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2]; // L: 3964
			PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 3966
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 3967
			var13.packetBuffer.writeByte(class288.privateChatMode.field5071); // L: 3968
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 3969
			Client.packetWriter.addNode(var13); // L: 3970
			return 1; // L: 3971
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 3973
				var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 3974
				class302.Interpreter_intStackSize -= 2; // L: 3975
				var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3976
				var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3977
				var6 = Renderable.getPacketBufferNode(ClientPacket.field3104, Client.packetWriter.isaacCipher); // L: 3979
				var6.packetBuffer.writeByte(class96.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 3980
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 3981
				var6.packetBuffer.writeByte(var7 - 1); // L: 3982
				var6.packetBuffer.writeByte(var9); // L: 3983
				Client.packetWriter.addNode(var6); // L: 3984
				return 1; // L: 3985
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 3987
					class302.Interpreter_intStackSize -= 2; // L: 3988
					var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 3989
					var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 3990
					var5 = Message.Messages_getByChannelAndID(var3, var7); // L: 3991
					if (var5 != null) { // L: 3992
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.count; // L: 3993
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.cycle; // L: 3994
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 3995
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 3996
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 3997
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 3998
					} else {
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4003
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4004
						Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4005
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4006
					}

					return 1; // L: 4008
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4010
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4011
						var4 = class17.Messages_getMessage(var3); // L: 4012
						if (var4 != null) { // L: 4013
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.type; // L: 4014
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.cycle; // L: 4015
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4016
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4017
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4018
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4019
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4022
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4023
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4024
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4025
							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4026
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4027
						}

						return 1; // L: 4029
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4031
						if (class288.privateChatMode == null) { // L: 4032
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class288.privateChatMode.field5071; // L: 4033
						}

						return 1; // L: 4034
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4036
							var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 4037
							var7 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4038
							var12 = class96.method2686(var7, var8, class36.clientLanguage, -1); // L: 4039
							Client.packetWriter.addNode(var12); // L: 4040
							return 1; // L: 4041
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4043
							class20.Interpreter_stringStackSize -= 2; // L: 4044
							var8 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize]; // L: 4045
							String var11 = Interpreter.Interpreter_stringStack[class20.Interpreter_stringStackSize + 1]; // L: 4046
							var12 = Renderable.getPacketBufferNode(ClientPacket.field3075, Client.packetWriter.isaacCipher); // L: 4048
							var12.packetBuffer.writeShort(0); // L: 4049
							int var10 = var12.packetBuffer.offset; // L: 4050
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4051
							ServerPacket.method5563(var12.packetBuffer, var11); // L: 4052
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4053
							Client.packetWriter.addNode(var12); // L: 4054
							return 1; // L: 4055
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4057
							var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 4058
							class302.Interpreter_intStackSize -= 2; // L: 4059
							var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4060
							var9 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4061
							var6 = class96.method2686(var7, var8, class36.clientLanguage, var9); // L: 4062
							Client.packetWriter.addNode(var6); // L: 4063
							return 1; // L: 4064
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4066
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4073
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4074
								return 1; // L: 4075
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4077
								var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4078
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = Projectile.Messages_getHistorySize(var3); // L: 4079
								return 1; // L: 4080
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4082
								var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4083
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class7.Messages_getLastChatID(var3); // L: 4084
								return 1; // L: 4085
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4087
								var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4088
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapSection1.method5370(var3); // L: 4089
								return 1; // L: 4090
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4092
								var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 4093
								ScriptFrame.doCheat(var8); // L: 4094
								return 1; // L: 4095
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4097
								Client.field738 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4098
								return 1; // L: 4099
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4101
								Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = Client.field738; // L: 4102
								return 1; // L: 4103
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4105
								var8 = Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize]; // L: 4106
								System.out.println(var8); // L: 4107
								return 1; // L: 4108
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4110
								class302.Interpreter_intStackSize -= 2; // L: 4111
								var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4112
								var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 4113
								var5 = Message.Messages_getByChannelAndID(var3, var7); // L: 4114
								if (var5 != null) { // L: 4115
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.count; // L: 4116
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.cycle; // L: 4117
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4118
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4119
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4120
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4121
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4122
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4123
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4126
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4127
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4128
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4129
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4130
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4131
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4132
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4133
								}

								return 1; // L: 4135
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4137
								var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4138
								var4 = class17.Messages_getMessage(var3); // L: 4139
								if (var4 != null) { // L: 4140
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.type; // L: 4141
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.cycle; // L: 4142
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4143
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4144
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4145
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4146
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4147
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4148
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4151
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4152
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4153
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4154
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4155
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4156
									Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4157
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4158
								}

								return 1; // L: 4160
							} else {
								return 2; // L: 4162
							}
						} else {
							if (class387.localPlayer != null && class387.localPlayer.username != null) { // L: 4068
								var8 = class387.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4069
							}

							Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var8; // L: 4070
							return 1; // L: 4071
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(Lge;IIII)V",
		garbageValue = "1802078195"
	)
	static void method6440(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && PacketWriter.clientPreferences.method2499() != 0) { // L: 3999
			if (var0.field2290 != null && var0.field2290.containsKey(var1)) { // L: 4000
				class461.method8491((Integer)var0.field2290.get(var1), var2, var3); // L: 4001
			}
		}
	} // L: 4002
}
