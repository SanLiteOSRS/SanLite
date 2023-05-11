import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class146 extends class139 {
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("af")
	boolean field1689;
	@ObfuscatedName("an")
	byte field1686;
	@ObfuscatedName("aw")
	byte field1687;
	@ObfuscatedName("ac")
	byte field1688;
	@ObfuscatedName("au")
	byte field1685;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfa;)V"
	)
	class146(class142 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "168736686"
	)
	void vmethod3461(Buffer var1) {
		this.field1689 = var1.readUnsignedByte() == 1; // L: 251
		this.field1686 = var1.readByte(); // L: 252
		this.field1687 = var1.readByte(); // L: 253
		this.field1688 = var1.readByte(); // L: 254
		this.field1685 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfj;I)V",
		garbageValue = "1712319228"
	)
	void vmethod3458(ClanSettings var1) {
		var1.allowGuests = this.field1689; // L: 259
		var1.field1728 = this.field1686; // L: 260
		var1.field1717 = this.field1687; // L: 261
		var1.field1718 = this.field1688; // L: 262
		var1.field1709 = this.field1685; // L: 263
	} // L: 264

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lmd;",
		garbageValue = "1082139872"
	)
	public static GameBuild method3269(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP}; // L: 21
		GameBuild[] var2 = var1; // L: 23

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 24
			GameBuild var4 = var2[var3]; // L: 25
			if (var0 == var4.buildId) { // L: 27
				return var4;
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "615247476"
	)
	public static int method3272(int var0) {
		return (var0 & class484.field4973) - 1; // L: 26
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "520752062"
	)
	public static final void method3265() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 99
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 100
	} // L: 101

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;I)V",
		garbageValue = "-1232221421"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field616 = 0; // L: 8135
		Client.field548 = 0; // L: 8136
		class30.method467(var1); // L: 8137
		ItemLayer.method4306(var0, var1); // L: 8138

		int var2;
		int var3;
		for (var2 = 0; var2 < Client.field548; ++var2) { // L: 8140
			var3 = Client.field549[var2]; // L: 8141
			NPC var4 = Client.npcs[var3]; // L: 8142
			int var5 = var1.readUnsignedByte(); // L: 8143
			int var6;
			if ((var5 & 128) != 0) { // L: 8144
				var6 = var1.readUnsignedByte(); // L: 8145
				var5 += var6 << 8; // L: 8146
			}

			if ((var5 & 256) != 0) { // L: 8148
				var6 = var1.readUnsignedByte(); // L: 8149
				var5 += var6 << 16; // L: 8150
			}

			int var7;
			int var8;
			if ((var5 & 64) != 0) { // L: 8152
				var6 = var1.readUnsignedShort(); // L: 8153
				if (var6 == 65535) { // L: 8154
					var6 = -1; // L: 8155
				}

				var7 = var1.method9089(); // L: 8157
				if (var6 == var4.sequence && var6 != -1) { // L: 8158
					var8 = ItemContainer.SequenceDefinition_get(var6).field2314; // L: 8159
					if (var8 == 1) { // L: 8160
						var4.sequenceFrame = 0; // L: 8161
						var4.sequenceFrameCycle = 0; // L: 8162
						var4.sequenceDelay = var7; // L: 8163
						var4.field1184 = 0; // L: 8164
					}

					if (var8 == 2) { // L: 8166
						var4.field1184 = 0; // L: 8167
					}
				} else if (var6 == -1 || var4.sequence == -1 || ItemContainer.SequenceDefinition_get(var6).field2293 >= ItemContainer.SequenceDefinition_get(var4.sequence).field2293) { // L: 8170
					var4.sequence = var6; // L: 8171
					var4.sequenceFrame = 0; // L: 8172
					var4.sequenceFrameCycle = 0; // L: 8173
					var4.sequenceDelay = var7; // L: 8174
					var4.field1184 = 0; // L: 8175
					var4.field1210 = var4.pathLength; // L: 8176
				}
			}

			if ((var5 & 32) != 0) { // L: 8180
				var4.targetIndex = var1.readUnsignedShort(); // L: 8182
				var4.targetIndex += var1.method9089() << 16; // L: 8183
				var6 = 16777215; // L: 8184
				if (var6 == var4.targetIndex) { // L: 8185
					var4.targetIndex = -1; // L: 8186
				}
			}

			if ((var5 & 2) != 0) { // L: 8189
				var4.field1148 = var1.readStringCp1252NullTerminated(); // L: 8190
				var4.field1160 = 100; // L: 8191
			}

			int var9;
			int var11;
			int var16;
			if ((var5 & 4) != 0) { // L: 8193
				var6 = var1.readUnsignedByte(); // L: 8194
				int var12;
				if (var6 > 0) { // L: 8195
					for (var7 = 0; var7 < var6; ++var7) { // L: 8196
						var9 = -1; // L: 8198
						var16 = -1; // L: 8199
						var11 = -1; // L: 8200
						var8 = var1.readUShortSmart(); // L: 8201
						if (var8 == 32767) { // L: 8202
							var8 = var1.readUShortSmart(); // L: 8203
							var16 = var1.readUShortSmart(); // L: 8204
							var9 = var1.readUShortSmart(); // L: 8205
							var11 = var1.readUShortSmart(); // L: 8206
						} else if (var8 != 32766) { // L: 8208
							var16 = var1.readUShortSmart(); // L: 8209
						} else {
							var8 = -1; // L: 8211
						}

						var12 = var1.readUShortSmart(); // L: 8212
						var4.addHitSplat(var8, var16, var9, var11, Client.cycle, var12); // L: 8213
					}
				}

				var7 = var1.method9090(); // L: 8216
				if (var7 > 0) { // L: 8217
					for (var8 = 0; var8 < var7; ++var8) { // L: 8218
						var9 = var1.readUShortSmart(); // L: 8219
						var16 = var1.readUShortSmart(); // L: 8220
						if (var16 != 32767) { // L: 8221
							var11 = var1.readUShortSmart(); // L: 8222
							var12 = var1.readUnsignedByte(); // L: 8223
							int var13 = var16 > 0 ? var1.method9090() : var12; // L: 8224
							var4.addHealthBar(var9, Client.cycle, var16, var11, var12, var13); // L: 8225
						} else {
							var4.removeHealthBar(var9); // L: 8227
						}
					}
				}
			}

			if ((var5 & 8) != 0) { // L: 8231
				var4.definition = AbstractArchive.getNpcDefinition(var1.method9099()); // L: 8232
				class142.method3236(var4); // L: 8233
				var4.method2609(); // L: 8234
			}

			if ((var5 & 1) != 0) { // L: 8236
				var6 = var1.readUnsignedShort(); // L: 8237
				var7 = var1.method9110(); // L: 8238
				var4.method2375(0, var6, var7 >> 16, var7 & 65535); // L: 8239
			}

			if ((var5 & 16) != 0) { // L: 8241
				var6 = var1.method9098(); // L: 8242
				var7 = var1.method9098(); // L: 8243
				var4.field1142 = var1.method9089() == 1; // L: 8244
				if (Client.field497 >= 212) { // L: 8245
					var4.field1197 = var6; // L: 8246
					var4.field1174 = var7; // L: 8247
				} else {
					var8 = var4.x - (var6 - WorldMapData_0.baseX * 64 - WorldMapData_0.baseX * 64) * 64; // L: 8250
					var9 = var4.y - (var7 - GameObject.baseY * 64 - GameObject.baseY * 64) * 64; // L: 8251
					if (var8 != 0 || var9 != 0) { // L: 8252
						var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047; // L: 8256
						var4.field1172 = var11; // L: 8258
					}
				}
			}

			if ((var5 & 16384) != 0) { // L: 8262
				var4.field1187 = var1.readByte(); // L: 8263
				var4.field1189 = var1.method9232(); // L: 8264
				var4.field1188 = var1.method9232(); // L: 8265
				var4.field1207 = var1.method9232(); // L: 8266
				var4.spotAnimation = var1.method9098() + Client.cycle; // L: 8267
				var4.field1192 = var1.method9135() + Client.cycle; // L: 8268
				var4.field1193 = var1.method9099(); // L: 8269
				var4.pathLength = 1; // L: 8270
				var4.field1210 = 0; // L: 8271
				var4.field1187 += var4.pathX[0]; // L: 8272
				var4.field1189 += var4.pathY[0]; // L: 8273
				var4.field1188 += var4.pathX[0]; // L: 8274
				var4.field1207 += var4.pathY[0]; // L: 8275
			}

			if ((var5 & 32768) != 0) { // L: 8277
				var4.field1211 = var1.readInt(); // L: 8278
			}

			if ((var5 & 2048) != 0) { // L: 8280
				var4.field1168 = Client.cycle + var1.method9135(); // L: 8281
				var4.field1156 = Client.cycle + var1.readUnsignedShort(); // L: 8282
				var4.field1180 = var1.method9186(); // L: 8283
				var4.field1199 = var1.method9232(); // L: 8284
				var4.field1200 = var1.method9092(); // L: 8285
				var4.field1208 = (byte)var1.method9039(); // L: 8286
			}

			if ((var5 & 512) != 0) { // L: 8288
				var4.method2558(var1.readStringCp1252NullTerminated()); // L: 8289
			}

			if ((var5 & 8192) != 0) { // L: 8291
				var4.method2613(var1.readUnsignedByte()); // L: 8292
			}

			int[] var14;
			short[] var15;
			short[] var17;
			long var18;
			boolean var20;
			if ((var5 & 4096) != 0) { // L: 8294
				var6 = var1.method9039(); // L: 8295
				if ((var6 & 1) == 1) { // L: 8296
					var4.method2618(); // L: 8297
				} else {
					var14 = null; // L: 8300
					if ((var6 & 2) == 2) { // L: 8301
						var8 = var1.method9039(); // L: 8302
						var14 = new int[var8]; // L: 8303

						for (var9 = 0; var9 < var8; ++var9) { // L: 8304
							var16 = var1.readUnsignedShort(); // L: 8305
							var16 = var16 == 65535 ? -1 : var16; // L: 8306
							var14[var9] = var16; // L: 8307
						}
					}

					var15 = null; // L: 8310
					if ((var6 & 4) == 4) { // L: 8311
						var9 = 0; // L: 8312
						if (var4.definition.recolorTo != null) { // L: 8313
							var9 = var4.definition.recolorTo.length; // L: 8314
						}

						var15 = new short[var9]; // L: 8316

						for (var16 = 0; var16 < var9; ++var16) { // L: 8317
							var15[var16] = (short)var1.method9135(); // L: 8318
						}
					}

					var17 = null; // L: 8321
					if ((var6 & 8) == 8) { // L: 8322
						var16 = 0; // L: 8323
						if (var4.definition.retextureTo != null) { // L: 8324
							var16 = var4.definition.retextureTo.length; // L: 8325
						}

						var17 = new short[var16]; // L: 8327

						for (var11 = 0; var11 < var16; ++var11) { // L: 8328
							var17[var11] = (short)var1.method9098(); // L: 8329
						}
					}

					var20 = false; // L: 8332
					if ((var6 & 16) != 0) { // L: 8333
						var20 = var1.readUnsignedByte() == 1; // L: 8334
					}

					var18 = (long)(++NPC.field1274 - 1); // L: 8336
					var4.method2571(new class189(var18, var14, var15, var17, var20)); // L: 8337
				}
			}

			if ((var5 & 1024) != 0) { // L: 8340
				var6 = var1.method9089(); // L: 8341
				if ((var6 & 1) == 1) { // L: 8342
					var4.method2575(); // L: 8343
				} else {
					var14 = null; // L: 8346
					if ((var6 & 2) == 2) { // L: 8347
						var8 = var1.method9089(); // L: 8348
						var14 = new int[var8]; // L: 8349

						for (var9 = 0; var9 < var8; ++var9) { // L: 8350
							var16 = var1.method9099(); // L: 8351
							var16 = var16 == 65535 ? -1 : var16; // L: 8352
							var14[var9] = var16; // L: 8353
						}
					}

					var15 = null; // L: 8356
					if ((var6 & 4) == 4) { // L: 8357
						var9 = 0; // L: 8358
						if (var4.definition.recolorTo != null) { // L: 8359
							var9 = var4.definition.recolorTo.length; // L: 8360
						}

						var15 = new short[var9]; // L: 8362

						for (var16 = 0; var16 < var9; ++var16) { // L: 8363
							var15[var16] = (short)var1.method9135(); // L: 8364
						}
					}

					var17 = null; // L: 8367
					if ((var6 & 8) == 8) { // L: 8368
						var16 = 0; // L: 8369
						if (var4.definition.retextureTo != null) { // L: 8370
							var16 = var4.definition.retextureTo.length; // L: 8371
						}

						var17 = new short[var16]; // L: 8373

						for (var11 = 0; var11 < var16; ++var11) { // L: 8374
							var17[var11] = (short)var1.method9099(); // L: 8375
						}
					}

					var20 = false; // L: 8378
					if ((var6 & 16) != 0) { // L: 8379
						var20 = var1.readUnsignedByte() == 1; // L: 8380
					}

					var18 = (long)(++NPC.field1277 - 1); // L: 8382
					var4.method2573(new class189(var18, var14, var15, var17, var20)); // L: 8383
				}
			}

			if ((var5 & 131072) != 0) { // L: 8386
				var6 = var1.method9039(); // L: 8387
				var14 = new int[8]; // L: 8388
				var15 = new short[8]; // L: 8389

				for (var9 = 0; var9 < 8; ++var9) { // L: 8390
					if ((var6 & 1 << var9) != 0) { // L: 8391
						var14[var9] = var1.method9108(); // L: 8392
						var15[var9] = (short)var1.method9073(); // L: 8393
					} else {
						var14[var9] = -1; // L: 8396
						var15[var9] = -1; // L: 8397
					}
				}

				var4.method2593(var14, var15); // L: 8400
			}

			if ((var5 & 262144) != 0) { // L: 8402
				var6 = var1.readInt(); // L: 8403
				var4.field1136 = (var6 & 1) != 0 ? var1.readUnsignedShort() : var4.definition.turnLeftSequence; // L: 8404
				var4.field1166 = (var6 & 2) != 0 ? var1.readUnsignedShort() : var4.definition.turnRightSequence; // L: 8405
				var4.walkSequence = (var6 & 4) != 0 ? var1.method9099() : var4.definition.walkSequence; // L: 8406
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShort() : var4.definition.walkBackSequence; // L: 8407
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence; // L: 8408
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShort() : var4.definition.walkRightSequence; // L: 8409
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShort() : var4.definition.field2048; // L: 8410
				var4.field1150 = (var6 & 128) != 0 ? var1.method9135() : var4.definition.field2008; // L: 8411
				var4.field1151 = (var6 & 256) != 0 ? var1.method9135() : var4.definition.field2025; // L: 8412
				var4.field1152 = (var6 & 512) != 0 ? var1.method9135() : var4.definition.field2037; // L: 8413
				var4.field1153 = (var6 & 1024) != 0 ? var1.readUnsignedShort() : var4.definition.field2023; // L: 8414
				var4.field1196 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var4.definition.field2028; // L: 8415
				var4.field1155 = (var6 & 4096) != 0 ? var1.method9098() : var4.definition.field2029; // L: 8416
				var4.field1157 = (var6 & 8192) != 0 ? var1.method9099() : var4.definition.field2030; // L: 8417
				var4.idleSequence = (var6 & 16384) != 0 ? var1.method9098() : var4.definition.idleSequence; // L: 8418
			}

			if ((var5 & 65536) != 0) { // L: 8420
				var6 = var1.method9089(); // L: 8421

				for (var7 = 0; var7 < var6; ++var7) { // L: 8422
					var8 = var1.method9039(); // L: 8423
					var9 = var1.method9099(); // L: 8424
					var16 = var1.method9110(); // L: 8425
					var4.method2375(var8, var9, var16 >> 16, var16 & 65535); // L: 8426
				}
			}
		}

		for (var2 = 0; var2 < Client.field616; ++var2) { // L: 8431
			var3 = Client.field617[var2]; // L: 8432
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8433
				Client.npcs[var3].definition = null; // L: 8434
				Client.npcs[var3] = null; // L: 8435
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8438
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength); // L: 8439
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 8441
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 8442
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 8443
				}
			}

		}
	} // L: 8446
}
