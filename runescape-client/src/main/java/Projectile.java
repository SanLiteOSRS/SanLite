import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1341664707
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1877059381
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 241015825
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1224861431
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -91313947
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1850280869
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -277767081
	)
	int field974;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 865913595
	)
	int field975;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1810255393
	)
	int field989;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1137484039
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1784603259
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1337603839
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1882373057
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1395531949
	)
	int field976;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1406134675
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aj")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("an")
	@Export("x")
	double x;
	@ObfuscatedName("au")
	@Export("y")
	double y;
	@ObfuscatedName("ai")
	@Export("z")
	double z;
	@ObfuscatedName("ae")
	double field987;
	@ObfuscatedName("aw")
	double field988;
	@ObfuscatedName("aq")
	double field973;
	@ObfuscatedName("az")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("at")
	double field991;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -603201469
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -951513477
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 811265973
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 2017125921
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0; // L: 37
		this.id = var1; // L: 40
		this.plane = var2; // L: 41
		this.sourceX = var3; // L: 42
		this.sourceY = var4; // L: 43
		this.sourceZ = var5; // L: 44
		this.cycleStart = var6; // L: 45
		this.cycleEnd = var7; // L: 46
		this.slope = var8; // L: 47
		this.startHeight = var9; // L: 48
		this.targetIndex = var10; // L: 49
		this.endHeight = var11; // L: 50
		this.isMoving = false; // L: 51
		int var12 = class406.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = class36.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field976 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "715135572"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field974 = var1; // L: 63
		this.field975 = var2; // L: 64
		this.field989 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field974 - this.sourceX); // L: 67
			double var7 = (double)(this.field975 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 69
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX; // L: 70
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field987 = ((double)this.field974 - this.x) / var5; // L: 75
		this.field988 = ((double)this.field975 - this.y) / var5; // L: 76
		this.field973 = Math.sqrt(this.field988 * this.field988 + this.field987 * this.field987); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field973 * Math.tan((double)this.slope * 0.02454369D);
		}

		this.field991 = ((double)this.field989 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class406.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-952040923"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += (double)var1 * this.field987; // L: 84
		this.y += (double)var1 * this.field988; // L: 85
		this.z += (double)var1 * this.field991 * 0.5D * (double)var1 + (double)var1 * this.speedZ; // L: 86
		this.speedZ += (double)var1 * this.field991; // L: 87
		this.yaw = (int)(Math.atan2(this.field987, this.field988) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field973) * 325.949D) & 2047; // L: 89
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return; // L: 110
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 96

						this.frame -= this.sequenceDefinition.frameCount; // L: 97
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 98

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 103
				int var2 = this.sequenceDefinition.method4177(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;ZLpu;I)V",
		garbageValue = "1662908547"
	)
	public static void method2185(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class317.ItemComposition_archive = var0; // L: 90
		class349.ItemComposition_modelArchive = var1; // L: 91
		HealthBarUpdate.ItemComposition_inMembersWorld = var2; // L: 92
		class284.ItemComposition_fileCount = class317.ItemComposition_archive.getGroupFileCount(10); // L: 93
		class142.ItemComposition_fontPlain11 = var3; // L: 94
	} // L: 95

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1524962913"
	)
	static int method2187(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) { // L: 4147
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode; // L: 4148
			return 1; // L: 4149
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) { // L: 4151
			Interpreter.Interpreter_intStackSize -= 3; // L: 4152
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4153
			Canvas.privateChatMode = UserComparator9.method2919(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4154
			if (Canvas.privateChatMode == null) { // L: 4155
				Canvas.privateChatMode = PrivateChatMode.field5274;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4156
			PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3205, Client.packetWriter.isaacCipher); // L: 4158
			var13.packetBuffer.writeByte(Client.publicChatMode); // L: 4159
			var13.packetBuffer.writeByte(Canvas.privateChatMode.field5271); // L: 4160
			var13.packetBuffer.writeByte(Client.tradeChatMode); // L: 4161
			Client.packetWriter.addNode(var13); // L: 4162
			return 1; // L: 4163
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) { // L: 4165
				var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4166
				Interpreter.Interpreter_intStackSize -= 2; // L: 4167
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4168
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4169
				var6 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3156, Client.packetWriter.isaacCipher); // L: 4171
				var6.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var8) + 2); // L: 4172
				var6.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4173
				var6.packetBuffer.writeByte(var7 - 1); // L: 4174
				var6.packetBuffer.writeByte(var9); // L: 4175
				Client.packetWriter.addNode(var6); // L: 4176
				return 1; // L: 4177
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) { // L: 4179
					Interpreter.Interpreter_intStackSize -= 2; // L: 4180
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4181
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4182
					var5 = SoundCache.Messages_getByChannelAndID(var3, var7); // L: 4183
					if (var5 != null) { // L: 4184
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4185
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4186
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4187
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4188
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4189
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4190
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4193
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4194
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4195
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4196
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4197
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4198
					}

					return 1; // L: 4200
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) { // L: 4202
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4203
						var4 = WorldMapRegion.Messages_getMessage(var3); // L: 4204
						if (var4 != null) { // L: 4205
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4206
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4207
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4208
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4209
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4210
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4211
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4214
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4215
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4216
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4217
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4218
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4219
						}

						return 1; // L: 4221
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) { // L: 4223
						if (Canvas.privateChatMode == null) { // L: 4224
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.privateChatMode.field5271; // L: 4225
						}

						return 1; // L: 4226
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) { // L: 4228
							var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4229
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4230
							var12 = class160.method3340(var7, var8, WorldMapLabelSize.clientLanguage, -1); // L: 4231
							Client.packetWriter.addNode(var12); // L: 4232
							return 1; // L: 4233
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) { // L: 4235
							class180.Interpreter_stringStackSize -= 2; // L: 4236
							var8 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 4237
							String var11 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 4238
							var12 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3152, Client.packetWriter.isaacCipher); // L: 4240
							var12.packetBuffer.writeShort(0); // L: 4241
							int var10 = var12.packetBuffer.offset; // L: 4242
							var12.packetBuffer.writeStringCp1252NullTerminated(var8); // L: 4243
							class150.method3192(var12.packetBuffer, var11); // L: 4244
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10); // L: 4245
							Client.packetWriter.addNode(var12); // L: 4246
							return 1; // L: 4247
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) { // L: 4249
							var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4250
							Interpreter.Interpreter_intStackSize -= 2; // L: 4251
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4252
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4253
							var6 = class160.method3340(var7, var8, WorldMapLabelSize.clientLanguage, var9); // L: 4254
							Client.packetWriter.addNode(var6); // L: 4255
							return 1; // L: 4256
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) { // L: 4258
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) { // L: 4265
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode; // L: 4266
								return 1; // L: 4267
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) { // L: 4269
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4270
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.Messages_getHistorySize(var3); // L: 4271
								return 1; // L: 4272
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) { // L: 4274
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4275
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UrlRequest.Messages_getLastChatID(var3); // L: 4276
								return 1; // L: 4277
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) { // L: 4279
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4280
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseRecorder.method2336(var3); // L: 4281
								return 1; // L: 4282
							} else if (var0 == ScriptOpcodes.DOCHEAT) { // L: 4284
								var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4285
								class163.doCheat(var8); // L: 4286
								return 1; // L: 4287
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) { // L: 4289
								Client.field752 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize].toLowerCase().trim(); // L: 4290
								return 1; // L: 4291
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) { // L: 4293
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = Client.field752; // L: 4294
								return 1; // L: 4295
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) { // L: 4297
								var8 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 4298
								System.out.println(var8); // L: 4299
								return 1; // L: 4300
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) { // L: 4302
								Interpreter.Interpreter_intStackSize -= 2; // L: 4303
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4304
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4305
								var5 = SoundCache.Messages_getByChannelAndID(var3, var7); // L: 4306
								if (var5 != null) { // L: 4307
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count; // L: 4308
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle; // L: 4309
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : ""; // L: 4310
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : ""; // L: 4311
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : ""; // L: 4312
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0); // L: 4313
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4314
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4315
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4318
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4319
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4320
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4321
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4322
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4323
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4324
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4325
								}

								return 1; // L: 4327
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) { // L: 4329
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4330
								var4 = WorldMapRegion.Messages_getMessage(var3); // L: 4331
								if (var4 != null) { // L: 4332
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type; // L: 4333
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle; // L: 4334
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : ""; // L: 4335
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : ""; // L: 4336
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : ""; // L: 4337
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0); // L: 4338
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4339
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4340
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4343
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4344
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4345
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4346
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4347
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4348
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4349
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4350
								}

								return 1; // L: 4352
							} else {
								return 2; // L: 4354
							}
						} else {
							if (TextureProvider.localPlayer != null && TextureProvider.localPlayer.username != null) { // L: 4260
								var8 = TextureProvider.localPlayer.username.getName();
							} else {
								var8 = ""; // L: 4261
							}

							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var8; // L: 4262
							return 1; // L: 4263
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1050765779"
	)
	static final void method2184(int var0, int var1) {
		if (var0 < 128) { // L: 4073
			var0 = 128; // L: 4074
		} else if (var0 > 383) { // L: 4076
			var0 = 383; // L: 4077
		}

		if (class365.cameraPitch < var0) { // L: 4079
			class365.cameraPitch = (var0 - class365.cameraPitch) * class465.field4788 / 1000 + class365.cameraPitch + class232.field2431; // L: 4080
			if (class365.cameraPitch > var0) { // L: 4081
				class365.cameraPitch = var0; // L: 4082
			}
		} else if (class365.cameraPitch > var0) { // L: 4085
			class365.cameraPitch -= (class365.cameraPitch - var0) * class465.field4788 / 1000 + class232.field2431; // L: 4086
			if (class365.cameraPitch < var0) { // L: 4087
				class365.cameraPitch = var0; // L: 4088
			}
		}

		var1 &= 2047; // L: 4091
		int var2 = var1 - DecorativeObject.cameraYaw; // L: 4092
		if (var2 > 1024) { // L: 4093
			var2 -= 2048; // L: 4094
		} else if (var2 < -1024) { // L: 4096
			var2 += 2048; // L: 4097
		}

		if (var2 > 0) { // L: 4099
			DecorativeObject.cameraYaw = DecorativeObject.cameraYaw + class232.field2431 + var2 * class465.field4788 / 1000; // L: 4100
			DecorativeObject.cameraYaw &= 2047; // L: 4101
		} else if (var2 < 0) { // L: 4103
			DecorativeObject.cameraYaw -= -var2 * class465.field4788 / 1000 + class232.field2431; // L: 4104
			DecorativeObject.cameraYaw &= 2047; // L: 4105
		}

		int var3 = var1 - DecorativeObject.cameraYaw; // L: 4107
		if (var3 > 1024) { // L: 4108
			var3 -= 2048; // L: 4109
		} else if (var3 < -1024) { // L: 4111
			var3 += 2048; // L: 4112
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4114
			DecorativeObject.cameraYaw = var1; // L: 4115
		}

	} // L: 4117
}
