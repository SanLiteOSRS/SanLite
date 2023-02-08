import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	public static AbstractArchive field2136;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -190562641
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1122576807
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2128627617
	)
	public int field2142;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1456888261
	)
	int field2137;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 178659185
	)
	int field2128;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1540253033
	)
	int field2139;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 79970133
	)
	int field2130;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 734281613
	)
	public int field2141;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -551205167
	)
	public int field2148;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -652363921
	)
	public int field2143;
	@ObfuscatedName("q")
	String field2144;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1154293603
	)
	public int field2145;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -175467331
	)
	public int field2146;
	@ObfuscatedName("g")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1894453127
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 73075505
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2142 = 70; // L: 28
		this.field2137 = -1; // L: 29
		this.field2128 = -1; // L: 30
		this.field2139 = -1; // L: 31
		this.field2130 = -1; // L: 32
		this.field2141 = 0; // L: 33
		this.field2148 = 0; // L: 34
		this.field2143 = -1; // L: 35
		this.field2144 = ""; // L: 36
		this.field2145 = -1; // L: 37
		this.field2146 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)V",
		garbageValue = "-76"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "-1689532457"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method8709();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2137 = var1.method8709();
		} else if (var2 == 4) { // L: 67
			this.field2139 = var1.method8709();
		} else if (var2 == 5) { // L: 68
			this.field2128 = var1.method8709();
		} else if (var2 == 6) { // L: 69
			this.field2130 = var1.method8709();
		} else if (var2 == 7) { // L: 70
			this.field2141 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2144 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2142 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2148 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2143 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2145 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2146 = var1.readShort();
		} else if (var2 == 14) {
			this.field2143 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Lgb;",
		garbageValue = "-65"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = SecureRandomFuture.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? ChatChannel.method2224(var2) : null; // L: 106 107
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-690048949"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2144; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + ParamComposition.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "1965935121"
	)
	public SpritePixels method3877() {
		if (this.field2137 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2137); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2137, 0); // L: 124
				if (var1 != null) { // L: 125
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2137);
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "-28423300"
	)
	public SpritePixels method3879() {
		if (this.field2128 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2128); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2128, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2128); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)Lrs;",
		garbageValue = "-13683"
	)
	public SpritePixels method3884() {
		if (this.field2139 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2139); // L: 142
			if (var1 != null) { // L: 143
				return var1;
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2139, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2139);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "1628743674"
	)
	public SpritePixels method3875() {
		if (this.field2130 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2130); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field2136, this.field2130, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2130);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)Lnv;",
		garbageValue = "-3862"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = class33.method488(field2136, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lru;ILcl;IB)V",
		garbageValue = "-77"
	)
	static final void method3902(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class208.field2363.field2359; // L: 453
		if ((var3 & 1024) != 0) { // L: 454
			var2.field1176 = Client.cycle + var0.method8714(); // L: 455
			var2.field1221 = Client.cycle + var0.method8730(); // L: 456
			var2.field1180 = var0.method8786(); // L: 457
			var2.field1227 = var0.method8679(); // L: 458
			var2.field1224 = var0.method8875(); // L: 459
			var2.field1225 = (byte)var0.method8678(); // L: 460
		}

		int var5;
		if ((var3 & 4) != 0) { // L: 462
			var5 = var0.method8676(); // L: 463
			byte[] var6 = new byte[var5]; // L: 464
			Buffer var7 = new Buffer(var6); // L: 465
			var0.method8701(var6, 0, var5); // L: 466
			Players.field1341[var1] = var7; // L: 467
			var2.read(var7); // L: 468
		}

		int var8;
		int var9;
		int var12;
		if ((var3 & 8) != 0) { // L: 470
			var5 = var0.method8714(); // L: 471
			PlayerType var17 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var0.method8677()); // L: 472
			boolean var13 = var0.method8678() == 1; // L: 473
			var8 = var0.method8678(); // L: 474
			var9 = var0.offset; // L: 475
			if (var2.username != null && var2.appearance != null) { // L: 476
				boolean var10 = false; // L: 477
				if (var17.isUser && WorldMapElement.friendSystem.isIgnored(var2.username)) { // L: 478 479
					var10 = true;
				}

				if (!var10 && Client.field626 == 0 && !var2.isHidden) { // L: 481
					Players.field1351.offset = 0; // L: 482
					var0.readBytes(Players.field1351.array, 0, var8); // L: 483
					Players.field1351.offset = 0; // L: 484
					String var11 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(Players.field1351))); // L: 485
					var2.overheadText = var11.trim(); // L: 486
					var2.field1161 = var5 >> 8; // L: 487
					var2.field1185 = var5 & 255; // L: 488
					var2.overheadTextCyclesRemaining = 150; // L: 489
					var2.field1181 = var13; // L: 490
					var2.field1166 = var2 != class387.localPlayer && var17.isUser && "" != Client.field738 && var11.toLowerCase().indexOf(Client.field738) == -1; // L: 491
					if (var17.isPrivileged) { // L: 493
						var12 = var13 ? 91 : 1;
					} else {
						var12 = var13 ? 90 : 2; // L: 494
					}

					if (var17.modIcon != -1) { // L: 495
						class280.addGameMessage(var12, ObjectSound.method1919(var17.modIcon) + var2.username.getName(), var11);
					} else {
						class280.addGameMessage(var12, var2.username.getName(), var11); // L: 496
					}
				}
			}

			var0.offset = var8 + var9; // L: 499
		}

		if ((var3 & 16384) != 0) { // L: 501
			class208[] var14 = Players.field1340; // L: 502
			class208[] var19 = new class208[]{class208.field2360, class208.field2363, class208.field2362, class208.field2366}; // L: 506
			var14[var1] = (class208)class4.findEnumerated(var19, var0.method8679()); // L: 508
		}

		if ((var3 & 4096) != 0) { // L: 510
			for (var5 = 0; var5 < 3; ++var5) { // L: 511
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 128) != 0) { // L: 513
			var2.field1195 = var0.readUnsignedShort(); // L: 514
			if (var2.pathLength == 0) { // L: 515
				var2.orientation = var2.field1195; // L: 516
				var2.field1195 = -1; // L: 517
			}
		}

		if ((var3 & 2048) != 0) { // L: 520
			var2.spotAnimation = var0.method8719(); // L: 521
			var5 = var0.readInt(); // L: 522
			var2.field1210 = var5 >> 16; // L: 523
			var2.field1207 = (var5 & 65535) + Client.cycle; // L: 524
			var2.spotAnimationFrame = 0; // L: 525
			var2.field1208 = 0; // L: 526
			if (var2.field1207 > Client.cycle) { // L: 527
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 528
				var2.spotAnimation = -1;
			}
		}

		if ((var3 & 1) != 0) { // L: 530
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 531
			if (var2.overheadText.charAt(0) == '~') { // L: 532
				var2.overheadText = var2.overheadText.substring(1); // L: 533
				class280.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 534
			} else if (var2 == class387.localPlayer) { // L: 536
				class280.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 537
			}

			var2.field1181 = false; // L: 539
			var2.field1161 = 0; // L: 540
			var2.field1185 = 0; // L: 541
			var2.overheadTextCyclesRemaining = 150; // L: 542
		}

		int var15;
		if ((var3 & 2) != 0) { // L: 544
			var5 = var0.method8719(); // L: 545
			if (var5 == 65535) { // L: 546
				var5 = -1;
			}

			var15 = var0.method8678(); // L: 547
			PendingSpawn.performPlayerAnimation(var2, var5, var15); // L: 548
		}

		if ((var3 & 32) != 0) { // L: 550
			var5 = var0.method8676(); // L: 551
			int var16;
			int var20;
			int var21;
			if (var5 > 0) { // L: 552
				for (var15 = 0; var15 < var5; ++var15) { // L: 553
					var8 = -1; // L: 555
					var9 = -1; // L: 556
					var20 = -1; // L: 557
					var21 = var0.readUShortSmart(); // L: 558
					if (var21 == 32767) { // L: 559
						var21 = var0.readUShortSmart(); // L: 560
						var9 = var0.readUShortSmart(); // L: 561
						var8 = var0.readUShortSmart(); // L: 562
						var20 = var0.readUShortSmart(); // L: 563
					} else if (var21 != 32766) { // L: 565
						var9 = var0.readUShortSmart(); // L: 566
					} else {
						var21 = -1; // L: 568
					}

					var16 = var0.readUShortSmart(); // L: 569
					var2.addHitSplat(var21, var9, var8, var20, Client.cycle, var16); // L: 570
				}
			}

			var15 = var0.method8678(); // L: 573
			if (var15 > 0) { // L: 574
				for (var21 = 0; var21 < var15; ++var21) { // L: 575
					var8 = var0.readUShortSmart(); // L: 576
					var9 = var0.readUShortSmart(); // L: 577
					if (var9 != 32767) { // L: 578
						var20 = var0.readUShortSmart(); // L: 579
						var16 = var0.method8676(); // L: 580
						var12 = var9 > 0 ? var0.method8676() : var16; // L: 581
						var2.addHealthBar(var8, Client.cycle, var9, var20, var16, var12); // L: 582
					} else {
						var2.removeHealthBar(var8); // L: 584
					}
				}
			}
		}

		if ((var3 & 256) != 0) { // L: 588
			var2.field1211 = var0.readByte(); // L: 589
			var2.field1213 = var0.method8875(); // L: 590
			var2.field1212 = var0.method8786(); // L: 591
			var2.field1214 = var0.method8679(); // L: 592
			var2.field1215 = var0.method8714() + Client.cycle; // L: 593
			var2.field1189 = var0.method8719() + Client.cycle; // L: 594
			var2.field1217 = var0.method8719(); // L: 595
			if (var2.field1132) { // L: 596
				var2.field1211 += var2.tileX; // L: 597
				var2.field1213 += var2.tileY; // L: 598
				var2.field1212 += var2.tileX; // L: 599
				var2.field1214 += var2.tileY; // L: 600
				var2.pathLength = 0; // L: 601
			} else {
				var2.field1211 += var2.pathX[0]; // L: 604
				var2.field1213 += var2.pathY[0]; // L: 605
				var2.field1212 += var2.pathX[0]; // L: 606
				var2.field1214 += var2.pathY[0]; // L: 607
				var2.pathLength = 1; // L: 608
			}

			var2.field1230 = 0; // L: 610
		}

		if ((var3 & 512) != 0) { // L: 612
			var4 = var0.method8875(); // L: 613
		}

		if ((var3 & 16) != 0) { // L: 615
			var2.targetIndex = var0.method8714(); // L: 617
			if (class323.field3800) { // L: 618
				var2.targetIndex += var0.readUnsignedByte() << 16; // L: 619
				var5 = 16777215; // L: 620
			} else {
				var5 = 65535; // L: 623
			}

			if (var2.targetIndex == var5) { // L: 625
				var2.targetIndex = -1; // L: 626
			}
		}

		if (var2.field1132) { // L: 629
			if (var4 == 127) { // L: 630
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class208 var22;
				if (var4 != class208.field2363.field2359) { // L: 633
					class208[] var18 = new class208[]{class208.field2360, class208.field2363, class208.field2362, class208.field2366}; // L: 636
					var22 = (class208)class4.findEnumerated(var18, var4); // L: 638
				} else {
					var22 = Players.field1340[var1]; // L: 640
				}

				var2.method2361(var2.tileX, var2.tileY, var22); // L: 641
			}
		}

	} // L: 645
}
