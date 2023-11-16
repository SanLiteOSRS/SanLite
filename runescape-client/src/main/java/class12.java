import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ax")
class class12 extends SSLSocket {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static SpritePixels[] field53;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 933165657
	)
	static int field56;
	@ObfuscatedName("at")
	Certificate[] field52;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lak;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Loj;II)Loj;",
		garbageValue = "-948387119"
	)
	@Export("findEnumerated")
	public static class383 findEnumerated(class383[] var0, int var1) {
		class383[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class383 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Llu;",
		garbageValue = "915557708"
	)
	public static ServerPacket[] method168() {
		return new ServerPacket[]{ServerPacket.field3354, ServerPacket.field3249, ServerPacket.field3331, ServerPacket.field3255, ServerPacket.field3252, ServerPacket.field3370, ServerPacket.field3253, ServerPacket.field3358, ServerPacket.field3256, ServerPacket.field3273, ServerPacket.field3258, ServerPacket.field3259, ServerPacket.field3260, ServerPacket.field3315, ServerPacket.field3262, ServerPacket.field3337, ServerPacket.field3289, ServerPacket.field3265, ServerPacket.field3266, ServerPacket.field3267, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3270, ServerPacket.field3357, ServerPacket.field3272, ServerPacket.field3349, ServerPacket.field3274, ServerPacket.field3275, ServerPacket.field3308, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3298, ServerPacket.field3282, ServerPacket.field3283, ServerPacket.field3284, ServerPacket.field3285, ServerPacket.field3286, ServerPacket.field3373, ServerPacket.field3288, ServerPacket.field3368, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3309, ServerPacket.field3261, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.field3264, ServerPacket.field3333, ServerPacket.field3316, ServerPacket.field3369, ServerPacket.field3300, ServerPacket.field3301, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.field3348, ServerPacket.field3307, ServerPacket.field3281, ServerPacket.field3263, ServerPacket.field3310, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3313, ServerPacket.field3361, ServerPacket.field3321, ServerPacket.field3287, ServerPacket.field3317, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3314, ServerPacket.field3293, ServerPacket.field3323, ServerPacket.field3324, ServerPacket.field3325, ServerPacket.field3326, ServerPacket.field3327, ServerPacket.field3251, ServerPacket.field3254, ServerPacket.field3330, ServerPacket.field3328, ServerPacket.field3332, ServerPacket.field3351, ServerPacket.field3334, ServerPacket.field3335, ServerPacket.field3336, ServerPacket.field3322, ServerPacket.field3345, ServerPacket.field3339, ServerPacket.field3340, ServerPacket.field3341, ServerPacket.field3342, ServerPacket.field3343, ServerPacket.field3344, ServerPacket.field3271, ServerPacket.field3346, ServerPacket.field3347, ServerPacket.field3296, ServerPacket.field3350, ServerPacket.field3362, ServerPacket.field3257, ServerPacket.field3352, ServerPacket.field3299, ServerPacket.field3250, ServerPacket.field3355, ServerPacket.field3356, ServerPacket.field3363, ServerPacket.field3353, ServerPacket.field3359, ServerPacket.field3360, ServerPacket.field3297, ServerPacket.field3292, ServerPacket.field3248, ServerPacket.field3364, ServerPacket.field3365, ServerPacket.field3366, ServerPacket.field3367, ServerPacket.field3306, ServerPacket.field3329, ServerPacket.field3338, ServerPacket.field3371, ServerPacket.field3372, ServerPacket.field3276, ServerPacket.field3374}; // L: 136
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method169(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1907529408"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "12"
	)
	static final void method167(String var0, int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher); // L: 244
		var2.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 245
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 246
		var2.packetBuffer.method9291(var1); // L: 247
		Client.packetWriter.addNode(var2); // L: 248
	} // L: 249

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1724856740"
	)
	static int method131(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4151
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4152
			return 1; // L: 4153
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4155
			class517.Interpreter_intStackSize -= 3; // L: 4156
			Client.publicChatMode = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4157
			class169.privateChatMode = WorldMapArea.method4580(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4158
			if (class169.privateChatMode == null) { // L: 4159
				class169.privateChatMode = PrivateChatMode.field5280;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 4160
			PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.field3143, Client.packetWriter.isaacCipher); // L: 4162
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4163
			var13.packetBuffer.writeByte(class169.privateChatMode.field5279); // L: 4164
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4165
			Client.packetWriter.addNode(var13); // L: 4166
			return 1; // L: 4167
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4169
				var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4170
				class517.Interpreter_intStackSize -= 2; // L: 4171
				var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4172
				var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4173
				var6 = class113.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher); // L: 4175
				var6.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4176
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4177
				var6.packetBuffer.writeByte(var7 - 1); // L: 4178
				var6.packetBuffer.writeByte(var9); // L: 4179
				Client.packetWriter.addNode(var6); // L: 4180
				return 1; // L: 4181
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4183
					class517.Interpreter_intStackSize -= 2; // L: 4184
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4185
					var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4186
					var5 = class14.Messages_getByChannelAndID(var3, var7); // L: 4187
					if (var5 != null) { // L: 4188
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.count; // L: 4189
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.cycle; // L: 4190
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4191
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4192
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4193
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4194
					} else {
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4197
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4198
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4199
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4200
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4201
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4202
					}

					return 1; // L: 4204
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4206
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4207
						var4 = class31.Messages_getMessage(var3); // L: 4208
						if (var4 != null) { // L: 4209
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.type; // L: 4210
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.cycle; // L: 4211
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4212
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4213
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4214
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4215
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4218
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4219
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4220
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4221
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4222
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4223
						}

						return 1; // L: 4225
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4227
						if (class169.privateChatMode == null) { // L: 4228
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class169.privateChatMode.field5279; // L: 4229
						}

						return 1; // L: 4230
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4232
							var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4233
							var7 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4234
							var12 = class544.method9914(var7, var8, class85.clientLanguage, -1); // L: 4235
							Client.packetWriter.addNode(var12); // L: 4236
							return 1; // L: 4237
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4239
							class127.Interpreter_stringStackSize -= 2; // L: 4240
							var8 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize]; // L: 4241
							String var11 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1]; // L: 4242
							var12 = class113.getPacketBufferNode(ClientPacket.field3202, Client.packetWriter.isaacCipher); // L: 4244
							var12.packetBuffer.writeShort(0); // L: 4245
							int var10 = var12.packetBuffer.offset; // L: 4246
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4247
							PcmPlayer.method847(var12.packetBuffer, var11); // L: 4248
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4249
							Client.packetWriter.addNode(var12); // L: 4250
							return 1; // L: 4251
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4253
							var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4254
							class517.Interpreter_intStackSize -= 2; // L: 4255
							var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4256
							var9 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4257
							var6 = class544.method9914(var7, var8, class85.clientLanguage, var9); // L: 4258
							Client.packetWriter.addNode(var6); // L: 4259
							return 1; // L: 4260
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4262
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4269
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4270
								return 1; // L: 4271
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4273
								var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4274
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Message.Messages_getHistorySize(var3); // L: 4275
								return 1; // L: 4276
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4278
								var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4279
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Messages_getLastChatID(var3); // L: 4280
								return 1; // L: 4281
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4283
								var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4284
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class92.method2446(var3); // L: 4285
								return 1; // L: 4286
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4288
								var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4289
								class9.doCheat(var8); // L: 4290
								return 1; // L: 4291
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4293
								Client.field694 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4294
								return 1; // L: 4295
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4297
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Client.field694; // L: 4298
								return 1; // L: 4299
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4301
								var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize]; // L: 4302
								System.out.println(var8); // L: 4303
								return 1; // L: 4304
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4306
								class517.Interpreter_intStackSize -= 2; // L: 4307
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4308
								var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 4309
								var5 = class14.Messages_getByChannelAndID(var3, var7); // L: 4310
								if (var5 != null) { // L: 4311
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.count; // L: 4312
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.cycle; // L: 4313
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4314
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4315
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4316
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4317
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4318
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4319
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4322
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4323
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4324
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4325
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4326
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4327
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4328
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4329
								}

								return 1; // L: 4331
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4333
								var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4334
								var4 = class31.Messages_getMessage(var3); // L: 4335
								if (var4 != null) { // L: 4336
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.type; // L: 4337
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.cycle; // L: 4338
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4339
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4340
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4341
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4342
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4343
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4344
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4347
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4348
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4349
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4350
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4351
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4352
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 4353
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4354
								}

								return 1; // L: 4356
							} else {
								return 2; // L: 4358
							}
						} else {
							if (class229.localPlayer != null && class229.localPlayer.username != null) { // L: 4264
								var8 = class229.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4265
							}

							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8; // L: 4266
							return 1; // L: 4267
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "11"
	)
	static int method142(int var0, Script var1, boolean var2) {
		return 2; // L: 5298
	}
}
