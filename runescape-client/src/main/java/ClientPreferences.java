import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("au")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ab")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aq")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("al")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 971082243
	)
	int field1260;
	@ObfuscatedName("aa")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -461734757
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1738472395
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1655566467
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -934134045
	)
	int field1255;
	@ObfuscatedName("ag")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1016688579
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("av")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1255 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2445(true); // L: 33
	} // L: 34

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 19
		this.displayFps = false; // L: 21
		this.brightness = 0.8D; // L: 23
		this.musicVolume = 127; // L: 24
		this.soundEffectsVolume = 127; // L: 25
		this.areaSoundEffectsVolume = 127; // L: 26
		this.field1255 = -1; // L: 27
		this.rememberedUsername = null; // L: 28
		this.windowMode = 1; // L: 29
		this.parameters = new LinkedHashMap(); // L: 30
		if (var1 != null && var1.array != null) { // L: 37
			int var2 = var1.readUnsignedByte(); // L: 41
			if (var2 >= 0 && var2 <= 10) { // L: 42
				if (var1.readUnsignedByte() == 1) { // L: 46
					this.roofsHidden = true; // L: 47
				}

				if (var2 > 1) { // L: 49
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 50
				}

				if (var2 > 3) { // L: 52
					this.windowMode = var1.readUnsignedByte(); // L: 53
				}

				if (var2 > 2) { // L: 55
					int var3 = var1.readUnsignedByte(); // L: 56

					for (int var4 = 0; var4 < var3; ++var4) { // L: 57
						int var5 = var1.readInt(); // L: 58
						int var6 = var1.readInt(); // L: 59
						this.parameters.put(var5, var6); // L: 60
					}
				}

				if (var2 > 4) { // L: 63
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 64
				}

				if (var2 > 5) { // L: 66
					this.hideUsername = var1.readBoolean(); // L: 67
				}

				if (var2 > 6) { // L: 69
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 70
					this.musicVolume = var1.readUnsignedByte(); // L: 71
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 72
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 73
				}

				if (var2 > 7) { // L: 75
					this.field1255 = var1.readUnsignedByte(); // L: 76
				}

				if (var2 > 8) { // L: 78
					this.displayFps = var1.readUnsignedByte() == 1; // L: 79
				}

				if (var2 > 9) { // L: 81
					this.field1260 = var1.readInt(); // L: 82
				}
			} else {
				this.method2445(true); // L: 43
			}
		} else {
			this.method2445(true); // L: 38
		}

	} // L: 86

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-299950185"
	)
	void method2445(boolean var1) {
	} // L: 88

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lsg;",
		garbageValue = "43"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(417, true); // L: 91
		var1.writeByte(10); // L: 92
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 93
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 94
		var1.writeByte(this.windowMode); // L: 95
		var1.writeByte(this.parameters.size()); // L: 96
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 97

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 98
			var1.writeInt((Integer)var3.getKey()); // L: 100
			var1.writeInt((Integer)var3.getValue()); // L: 101
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 104
		var1.writeBoolean(this.hideUsername); // L: 105
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 106
		var1.writeByte(this.musicVolume); // L: 107
		var1.writeByte(this.soundEffectsVolume); // L: 108
		var1.writeByte(this.areaSoundEffectsVolume); // L: 109
		var1.writeByte(this.field1255); // L: 110
		var1.writeByte(this.displayFps ? 1 : 0); // L: 111
		var1.writeInt(this.field1260); // L: 112
		return var1; // L: 113
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1505559794"
	)
	void method2448(boolean var1) {
		this.roofsHidden = var1; // L: 157
		class100.savePreferences(); // L: 158
	} // L: 159

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1957276732"
	)
	boolean method2513() {
		return this.roofsHidden; // L: 162
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1926536328"
	)
	void method2449(boolean var1) {
		this.hideUsername = var1; // L: 166
		class100.savePreferences(); // L: 167
	} // L: 168

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2084960938"
	)
	boolean method2450() {
		return this.hideUsername; // L: 171
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-527699713"
	)
	void method2531(boolean var1) {
		this.titleMusicDisabled = var1; // L: 175
		class100.savePreferences(); // L: 176
	} // L: 177

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1197954221"
	)
	boolean method2534() {
		return this.titleMusicDisabled; // L: 180
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1980083738"
	)
	void method2483(boolean var1) {
		this.displayFps = var1; // L: 184
		class100.savePreferences(); // L: 185
	} // L: 186

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-837037786"
	)
	void method2443() {
		this.method2483(!this.displayFps); // L: 189
	} // L: 190

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-12734"
	)
	boolean method2455() {
		return this.displayFps; // L: 193
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	void method2540(int var1) {
		this.field1260 = var1; // L: 197
		class100.savePreferences(); // L: 198
	} // L: 199

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1671764667"
	)
	int method2467() {
		return this.field1260; // L: 202
	}

	@ObfuscatedName("ah")
	void method2458(double var1) {
		this.brightness = var1; // L: 206
		class100.savePreferences(); // L: 207
	} // L: 208

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1864449029"
	)
	double method2459() {
		return this.brightness; // L: 211
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-935900203"
	)
	void method2460(int var1) {
		this.musicVolume = var1; // L: 215
		class100.savePreferences(); // L: 216
	} // L: 217

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1131552164"
	)
	int method2461() {
		return this.musicVolume; // L: 220
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-957604712"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 224
		class100.savePreferences(); // L: 225
	} // L: 226

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1406684169"
	)
	int method2463() {
		return this.soundEffectsVolume; // L: 229
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "745434039"
	)
	void method2464(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 233
		class100.savePreferences(); // L: 234
	} // L: 235

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2076733437"
	)
	int method2465() {
		return this.areaSoundEffectsVolume; // L: 238
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-472730554"
	)
	void method2466(String var1) {
		this.rememberedUsername = var1; // L: 242
		class100.savePreferences(); // L: 243
	} // L: 244

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-598675425"
	)
	String method2473() {
		return this.rememberedUsername; // L: 247
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1008471336"
	)
	void method2468(int var1) {
		this.field1255 = var1; // L: 251
		class100.savePreferences(); // L: 252
	} // L: 253

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-964267539"
	)
	int method2469() {
		return this.field1255; // L: 256
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1521769017"
	)
	void method2470(int var1) {
		this.windowMode = var1; // L: 260
		class100.savePreferences(); // L: 261
	} // L: 262

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	int method2471() {
		return this.windowMode; // L: 265
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "66"
	)
	void method2488(String var1, int var2) {
		int var3 = this.method2487(var1); // L: 269
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) { // L: 270
			Iterator var4 = this.parameters.entrySet().iterator(); // L: 271
			var4.next(); // L: 272
			var4.remove(); // L: 273
		}

		this.parameters.put(var3, var2); // L: 275
		class100.savePreferences(); // L: 276
	} // L: 277

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-11"
	)
	boolean method2456(String var1) {
		int var2 = this.method2487(var1); // L: 280
		return this.parameters.containsKey(var2); // L: 281
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "4"
	)
	int method2474(String var1) {
		int var2 = this.method2487(var1); // L: 285
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2); // L: 286 287 289
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1030951960"
	)
	int method2487(String var1) {
		return Actor.method2400(var1.toLowerCase()); // L: 293
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsq;ILdv;IB)V",
		garbageValue = "-111"
	)
	static final void method2501(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class210.field2390.field2391; // L: 454
		int var5;
		if ((var3 & 2) != 0) { // L: 455
			var5 = var0.method9089(); // L: 456
			byte[] var6 = new byte[var5]; // L: 457
			Buffer var7 = new Buffer(var6); // L: 458
			var0.readBytes(var6, 0, var5); // L: 459
			Players.field1333[var1] = var7; // L: 460
			var2.read(var7); // L: 461
		}

		int var13;
		if ((var3 & 16) != 0) { // L: 463
			var5 = var0.method9098(); // L: 464
			if (var5 == 65535) { // L: 465
				var5 = -1;
			}

			var13 = var0.method9090(); // L: 466
			GroundObject.performPlayerAnimation(var2, var5, var13); // L: 467
		}

		if ((var3 & 4) != 0) { // L: 469
			var2.targetIndex = var0.method9099(); // L: 471
			var2.targetIndex += var0.method9089() << 16; // L: 472
			var5 = 16777215; // L: 473
			if (var2.targetIndex == var5) { // L: 474
				var2.targetIndex = -1; // L: 475
			}
		}

		if ((var3 & 128) != 0) { // L: 478
			var2.field1148 = var0.readStringCp1252NullTerminated(); // L: 479
			if (var2.field1148.charAt(0) == '~') { // L: 480
				var2.field1148 = var2.field1148.substring(1); // L: 481
				UserComparator5.addGameMessage(2, var2.username.getName(), var2.field1148); // L: 482
			} else if (var2 == MusicPatchNode.localPlayer) { // L: 484
				UserComparator5.addGameMessage(2, var2.username.getName(), var2.field1148); // L: 485
			}

			var2.field1176 = false; // L: 487
			var2.field1161 = 0; // L: 488
			var2.field1206 = 0; // L: 489
			var2.field1160 = 150; // L: 490
		}

		int var8;
		int var9;
		int var12;
		int var14;
		if ((var3 & 64) != 0) { // L: 492
			var5 = var0.readUnsignedByte(); // L: 493
			int var10;
			int var16;
			if (var5 > 0) { // L: 494
				for (var13 = 0; var13 < var5; ++var13) { // L: 495
					var8 = -1; // L: 497
					var9 = -1; // L: 498
					var10 = -1; // L: 499
					var14 = var0.readUShortSmart(); // L: 500
					if (var14 == 32767) { // L: 501
						var14 = var0.readUShortSmart(); // L: 502
						var9 = var0.readUShortSmart(); // L: 503
						var8 = var0.readUShortSmart(); // L: 504
						var10 = var0.readUShortSmart(); // L: 505
					} else if (var14 != 32766) { // L: 507
						var9 = var0.readUShortSmart(); // L: 508
					} else {
						var14 = -1; // L: 510
					}

					var16 = var0.readUShortSmart(); // L: 511
					var2.addHitSplat(var14, var9, var8, var10, Client.cycle, var16); // L: 512
				}
			}

			var13 = var0.method9089(); // L: 515
			if (var13 > 0) { // L: 516
				for (var14 = 0; var14 < var13; ++var14) { // L: 517
					var8 = var0.readUShortSmart(); // L: 518
					var9 = var0.readUShortSmart(); // L: 519
					if (var9 != 32767) { // L: 520
						var10 = var0.readUShortSmart(); // L: 521
						var16 = var0.method9039(); // L: 522
						var12 = var9 > 0 ? var0.method9090() : var16; // L: 523
						var2.addHealthBar(var8, Client.cycle, var9, var10, var16, var12); // L: 524
					} else {
						var2.removeHealthBar(var8); // L: 526
					}
				}
			}
		}

		if ((var3 & 1) != 0) { // L: 530
			var2.field1172 = var0.readUnsignedShort(); // L: 531
			if (var2.pathLength == 0) { // L: 532
				var2.orientation = var2.field1172; // L: 533
				var2.method2370(); // L: 534
			}
		}

		if ((var3 & 32) != 0) { // L: 537
			var5 = var0.method9098(); // L: 538
			PlayerType var17 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var0.readUnsignedByte()); // L: 539
			boolean var22 = var0.method9090() == 1; // L: 540
			var8 = var0.method9089(); // L: 541
			var9 = var0.offset; // L: 542
			if (var2.username != null && var2.appearance != null) { // L: 543
				boolean var20 = false; // L: 544
				if (var17.isUser && World.friendSystem.isIgnored(var2.username)) { // L: 545 546
					var20 = true;
				}

				if (!var20 && Client.field608 == 0 && !var2.isHidden) { // L: 548
					Players.field1343.offset = 0; // L: 549
					var0.readBytes(Players.field1343.array, 0, var8); // L: 550
					Players.field1343.offset = 0; // L: 551
					String var11 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(Players.field1343))); // L: 552
					var2.field1148 = var11.trim(); // L: 553
					var2.field1161 = var5 >> 8; // L: 554
					var2.field1206 = var5 & 255; // L: 555
					var2.field1160 = 150; // L: 556
					var2.field1176 = var22; // L: 557
					var2.field1144 = var2 != MusicPatchNode.localPlayer && var17.isUser && "" != Client.field718 && var11.toLowerCase().indexOf(Client.field718) == -1; // L: 558
					if (var17.isPrivileged) { // L: 560
						var12 = var22 ? 91 : 1;
					} else {
						var12 = var22 ? 90 : 2; // L: 561
					}

					if (var17.modIcon != -1) { // L: 562
						UserComparator5.addGameMessage(var12, ArchiveDiskActionHandler.method6619(var17.modIcon) + var2.username.getName(), var11);
					} else {
						UserComparator5.addGameMessage(var12, var2.username.getName(), var11); // L: 563
					}
				}
			}

			var0.offset = var9 + var8; // L: 566
		}

		if ((var3 & 4096) != 0) { // L: 568
			var5 = var0.readUnsignedShort(); // L: 569
			var13 = var0.method9111(); // L: 570
			var2.method2375(0, var5, var13 >> 16, var13 & 65535); // L: 571
		}

		if ((var3 & 1024) != 0) { // L: 573
			var2.field1187 = var0.readByte(); // L: 574
			var2.field1189 = var0.method9092(); // L: 575
			var2.field1188 = var0.method9232(); // L: 576
			var2.field1207 = var0.method9232(); // L: 577
			var2.spotAnimation = var0.method9099() + Client.cycle; // L: 578
			var2.field1192 = var0.readUnsignedShort() + Client.cycle; // L: 579
			var2.field1193 = var0.method9099(); // L: 580
			if (var2.field1110) { // L: 581
				var2.field1187 += var2.tileX; // L: 582
				var2.field1189 += var2.tileY; // L: 583
				var2.field1188 += var2.tileX; // L: 584
				var2.field1207 += var2.tileY; // L: 585
				var2.pathLength = 0; // L: 586
			} else {
				var2.field1187 += var2.pathX[0]; // L: 589
				var2.field1189 += var2.pathY[0]; // L: 590
				var2.field1188 += var2.pathX[0]; // L: 591
				var2.field1207 += var2.pathY[0]; // L: 592
				var2.pathLength = 1; // L: 593
			}

			var2.field1210 = 0; // L: 595
		}

		if ((var3 & 512) != 0) { // L: 597
			class210[] var15 = Players.field1332; // L: 598
			class210[] var19 = new class210[]{class210.field2389, class210.field2390, class210.field2388, class210.field2387}; // L: 602
			var15[var1] = (class210)StructComposition.findEnumerated(var19, var0.method9186()); // L: 604
		}

		if ((var3 & 2048) != 0) { // L: 606
			var4 = var0.readByte(); // L: 607
		}

		if ((var3 & 8192) != 0) { // L: 609
			for (var5 = 0; var5 < 3; ++var5) { // L: 610
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 32768) != 0) { // L: 612
			var2.field1168 = Client.cycle + var0.method9099(); // L: 613
			var2.field1156 = Client.cycle + var0.readUnsignedShort(); // L: 614
			var2.field1180 = var0.readByte(); // L: 615
			var2.field1199 = var0.readByte(); // L: 616
			var2.field1200 = var0.method9186(); // L: 617
			var2.field1208 = (byte)var0.method9090(); // L: 618
		}

		if ((var3 & 65536) != 0) { // L: 620
			var5 = var0.method9039(); // L: 621

			for (var13 = 0; var13 < var5; ++var13) { // L: 622
				var14 = var0.method9090(); // L: 623
				var8 = var0.method9099(); // L: 624
				var9 = var0.readInt(); // L: 625
				var2.method2375(var14, var8, var9 >> 16, var9 & 65535); // L: 626
			}
		}

		if (var2.field1110) { // L: 629
			if (var4 == 127) { // L: 630
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class210 var21;
				if (var4 != class210.field2390.field2391) { // L: 633
					class210[] var18 = new class210[]{class210.field2389, class210.field2390, class210.field2388, class210.field2387}; // L: 636
					var21 = (class210)StructComposition.findEnumerated(var18, var4); // L: 638
				} else {
					var21 = Players.field1332[var1]; // L: 640
				}

				var2.method2308(var2.tileX, var2.tileY, var21); // L: 641
			}
		}

	} // L: 645
}
