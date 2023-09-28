import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ay")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1834317307
	)
	static int field68;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-21"
	)
	static int method171(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1583
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1584
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var3)); // L: 1585
			return 1; // L: 1586
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1588
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1595
				if (var3.dataText == null) { // L: 1596
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1597
				}

				return 1; // L: 1598
			} else {
				return 2; // L: 1600
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1589
			--var4; // L: 1590
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1591
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1592
			} else {
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1593
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "751094160"
	)
	static int method163(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3256
			if (VerticalAlignment.guestClanSettings != null) { // L: 3257
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3258
				class295.field3108 = VerticalAlignment.guestClanSettings; // L: 3259
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3261
			}

			return 1; // L: 3262
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3264
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3265
				if (Client.currentClanSettings[var3] != null) { // L: 3266
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3267
					class295.field3108 = Client.currentClanSettings[var3]; // L: 3268
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3270
				}

				return 1; // L: 3271
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3273
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class295.field3108.name; // L: 3274
				return 1; // L: 3275
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3277
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.allowGuests ? 1 : 0; // L: 3278
				return 1; // L: 3279
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3281
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1709; // L: 3282
				return 1; // L: 3283
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3285
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1723; // L: 3286
				return 1; // L: 3287
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3289
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1710; // L: 3290
				return 1; // L: 3291
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3293
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1700; // L: 3294
				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3297
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.memberCount; // L: 3298
				return 1; // L: 3299
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3301
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3302
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class295.field3108.memberNames[var3]; // L: 3303
				return 1; // L: 3304
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3306
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3307
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.memberRanks[var3]; // L: 3308
				return 1; // L: 3309
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3311
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.bannedMemberCount; // L: 3312
				return 1; // L: 3313
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3315
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3316
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class295.field3108.bannedMemberNames[var3]; // L: 3317
				return 1; // L: 3318
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3320
					Interpreter.Interpreter_intStackSize -= 3; // L: 3321
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3322
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3323
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3324
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.method3239(var3, var6, var5); // L: 3325
					return 1; // L: 3326
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3328
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.currentOwner; // L: 3329
					return 1; // L: 3330
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3332
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1720; // L: 3333
					return 1; // L: 3334
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3336
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.method3235(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]); // L: 3337
					return 1; // L: 3338
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3340
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class295.field3108.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3341
					return 1; // L: 3342
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3344
					Interpreter.Interpreter_intStackSize -= 2; // L: 3345
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3346
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3347
					class36.method697(var6, var3); // L: 3348
					return 1; // L: 3349
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3351
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3352
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1717[var3]; // L: 3353
					return 1; // L: 3354
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3356
						Interpreter.Interpreter_intStackSize -= 3; // L: 3357
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3358
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3359
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3360
						HealthBarUpdate.method2460(var5, var3, var4); // L: 3361
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3363
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3364
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class295.field3108.field1718[var3] ? 1 : 0; // L: 3365
						return 1; // L: 3366
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3368
						if (ClanChannelMember.guestClanChannel != null) { // L: 3369
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3370
							Interpreter.field876 = ClanChannelMember.guestClanChannel; // L: 3371
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3373
						}

						return 1; // L: 3374
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3376
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3377
						if (Client.currentClanChannels[var3] != null) { // L: 3378
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3379
							Interpreter.field876 = Client.currentClanChannels[var3]; // L: 3380
							VarcInt.field1959 = var3; // L: 3381
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3383
						}

						return 1; // L: 3384
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3386
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = Interpreter.field876.name; // L: 3387
						return 1; // L: 3388
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3390
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field876.field1778; // L: 3391
						return 1; // L: 3392
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3394
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field876.field1777; // L: 3395
						return 1; // L: 3396
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3398
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field876.method3382(); // L: 3399
						return 1; // L: 3400
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3402
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3403
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ((ClanChannelMember)Interpreter.field876.members.get(var3)).username.getName(); // L: 3404
						return 1; // L: 3405
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3407
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3408
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field876.members.get(var3)).rank; // L: 3409
						return 1; // L: 3410
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3412
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3413
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)Interpreter.field876.members.get(var3)).world; // L: 3414
						return 1; // L: 3415
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3417
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3418
						ArchiveDisk.method8260(VarcInt.field1959, var3); // L: 3419
						return 1; // L: 3420
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3422
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field876.method3383(Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]); // L: 3423
						return 1; // L: 3424
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3426
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Interpreter.field876.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3427
						return 1; // L: 3428
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3430
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SequenceDefinition.field2316 != null ? 1 : 0; // L: 3431
						return 1; // L: 3432
					} else {
						return 2; // L: 3434
					}
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(ZLuy;B)V",
		garbageValue = "15"
	)
	static final void method169(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 9187
			int var3 = 1 << var2; // L: 9188
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 9189
				int var4 = var1.readBits(var2); // L: 9190
				if (var4 != var3 - 1) { // L: 9191
					boolean var5 = false; // L: 9192
					if (Client.npcs[var4] == null) { // L: 9193
						Client.npcs[var4] = new NPC(); // L: 9194
						var5 = true; // L: 9195
					}

					NPC var6 = Client.npcs[var4]; // L: 9197
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 9198
					var6.npcCycle = Client.cycle; // L: 9199
					int var10 = var1.readBits(1); // L: 9203
					if (var10 == 1) { // L: 9204
						Client.field533[++Client.field581 - 1] = var4;
					}

					int var7 = var1.readBits(1); // L: 9205
					var6.definition = class190.getNpcDefinition(var1.readBits(14)); // L: 9206
					int var11 = Client.field655[var1.readBits(3)]; // L: 9207
					if (var5) { // L: 9208
						var6.orientation = var6.rotation = var11;
					}

					int var8;
					if (var0) { // L: 9209
						var8 = var1.readBits(8); // L: 9210
						if (var8 > 127) { // L: 9211
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 9214
						if (var8 > 15) { // L: 9215
							var8 -= 32;
						}
					}

					int var9;
					if (var0) { // L: 9217
						var9 = var1.readBits(8); // L: 9218
						if (var9 > 127) { // L: 9219
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 9222
						if (var9 > 15) { // L: 9223
							var9 -= 32;
						}
					}

					boolean var12 = var1.readBits(1) == 1; // L: 9225
					if (var12) { // L: 9226
						var1.readBits(32); // L: 9227
					}

					WorldMapLabel.method5655(var6); // L: 9229
					if (var6.field1216 == 0) { // L: 9230
						var6.rotation = 0;
					}

					var6.method2681(TextureProvider.localPlayer.pathX[0] + var8, TextureProvider.localPlayer.pathY[0] + var9, var7 == 1); // L: 9231
					continue; // L: 9232
				}
			}

			var1.exportIndex(); // L: 9233
			return; // L: 9234
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)Loo;",
		garbageValue = "-81"
	)
	static class374 method167() {
		return class59.field452; // L: 12969
	}
}
