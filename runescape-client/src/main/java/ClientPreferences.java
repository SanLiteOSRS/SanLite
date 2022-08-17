import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1549167537
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("u")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("w")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 967152513
	)
	int field1241;
	@ObfuscatedName("j")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 81680703
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1566580435
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1633780479
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 213477607
	)
	int field1244;
	@ObfuscatedName("x")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1209049139
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("p")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10; // L: 11
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1244 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2309(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1244 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 37
				if (var1.readUnsignedByte() == 1) { // L: 41
					this.roofsHidden = true; // L: 42
				}

				if (var2 > 1) { // L: 44
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 45
				}

				if (var2 > 3) { // L: 47
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) { // L: 50
					int var3 = var1.readUnsignedByte(); // L: 51

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt(); // L: 53
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6); // L: 55
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 59
				}

				if (var2 > 5) { // L: 61
					this.hideUsername = var1.readBoolean(); // L: 62
				}

				if (var2 > 6) { // L: 64
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 65
					this.musicVolume = var1.readUnsignedByte(); // L: 66
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 67
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 68
				}

				if (var2 > 7) { // L: 70
					this.field1244 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1241 = var1.readInt(); // L: 77
				}
			} else {
				this.method2309(true); // L: 38
			}
		} else {
			this.method2309(true);
		}

	} // L: 81

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-102"
	)
	void method2309(boolean var1) {
	} // L: 83

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lqw;",
		garbageValue = "276334442"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 86
		var1.writeByte(ClientPreferences_optionCount); // L: 87
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 88
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 89
		var1.writeByte(this.windowMode); // L: 90
		var1.writeByte(this.parameters.size()); // L: 91
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 92

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 93
			var1.writeInt((Integer)var3.getKey()); // L: 95
			var1.writeInt((Integer)var3.getValue()); // L: 96
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 99
		var1.writeBoolean(this.hideUsername); // L: 100
		var1.writeByte((int)(100.0D * this.brightness)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1244); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1241); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1020334135"
	)
	void method2311(boolean var1) {
		this.roofsHidden = var1; // L: 150
		class270.savePreferences(); // L: 151
	} // L: 152

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method2312() {
		return this.roofsHidden; // L: 155
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "119"
	)
	void method2389(boolean var1) {
		this.hideUsername = var1; // L: 159
		class270.savePreferences(); // L: 160
	} // L: 161

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "52"
	)
	boolean method2326() {
		return this.hideUsername; // L: 164
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "801738878"
	)
	void method2347(boolean var1) {
		this.titleMusicDisabled = var1; // L: 168
		class270.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-89"
	)
	boolean method2316() {
		return this.titleMusicDisabled; // L: 173
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-911249797"
	)
	void method2338(boolean var1) {
		this.displayFps = var1; // L: 177
		class270.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2369() {
		this.method2338(!this.displayFps); // L: 182
	} // L: 183

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1718849137"
	)
	boolean method2339() {
		return this.displayFps; // L: 186
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2008348376"
	)
	void method2320(int var1) {
		this.field1241 = var1; // L: 190
		class270.savePreferences(); // L: 191
	} // L: 192

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1365608555"
	)
	int method2321() {
		return this.field1241; // L: 195
	}

	@ObfuscatedName("b")
	void method2322(double var1) {
		this.brightness = var1; // L: 199
		class270.savePreferences(); // L: 200
	} // L: 201

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1375339710"
	)
	double method2323() {
		return this.brightness; // L: 204
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "463466171"
	)
	void method2357(int var1) {
		this.musicVolume = var1; // L: 208
		class270.savePreferences(); // L: 209
	} // L: 210

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1692388245"
	)
	int method2335() {
		return this.musicVolume; // L: 213
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 217
		class270.savePreferences(); // L: 218
	} // L: 219

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1988484023"
	)
	int method2348() {
		return this.soundEffectsVolume; // L: 222
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "121"
	)
	void method2332(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 226
		class270.savePreferences(); // L: 227
	} // L: 228

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2113963891"
	)
	int method2329() {
		return this.areaSoundEffectsVolume; // L: 231
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-25"
	)
	void method2330(String var1) {
		this.rememberedUsername = var1; // L: 235
		class270.savePreferences(); // L: 236
	} // L: 237

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1796864574"
	)
	String method2331() {
		return this.rememberedUsername; // L: 240
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method2319(int var1) {
		this.field1244 = var1; // L: 244
		class270.savePreferences(); // L: 245
	} // L: 246

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-321740181"
	)
	int method2333() {
		return this.field1244; // L: 249
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1018005741"
	)
	void method2334(int var1) {
		this.windowMode = var1; // L: 253
		class270.savePreferences(); // L: 254
	} // L: 255

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	int method2387() {
		return this.windowMode; // L: 258
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-1994537996"
	)
	public static void method2400(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lgo;[Lgr;I)V",
		garbageValue = "-1704019261"
	)
	static final void method2401(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 591
			for (var3 = 0; var3 < 104; ++var3) { // L: 592
				for (var4 = 0; var4 < 104; ++var4) { // L: 593
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 594
						var5 = var2; // L: 595
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 596
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 597
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 602
		if (Tiles.rndHue < -8) { // L: 603
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 604
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 605
		if (Tiles.rndLightness < -16) { // L: 606
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 607
			Tiles.rndLightness = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) { // L: 608
			byte[][] var44 = Tiles.field998[var2]; // L: 609
			boolean var50 = true; // L: 610
			boolean var51 = true; // L: 611
			boolean var6 = true; // L: 612
			boolean var7 = true; // L: 613
			boolean var8 = true; // L: 614
			var9 = (int)Math.sqrt(5100.0D); // L: 615
			var10 = var9 * 768 >> 8; // L: 616

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 617
				for (var12 = 1; var12 < 103; ++var12) { // L: 618
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 619
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 620
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 621
					var16 = (var13 << 8) / var15; // L: 622
					var17 = 65536 / var15; // L: 623
					var18 = (var14 << 8) / var15; // L: 624
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 625
					var20 = (var44[var12][var11 + 1] >> 3) + (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11] >> 1); // L: 626
					class295.field3524[var12][var11] = var19 - var20; // L: 627
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 630
				NetFileRequest.Tiles_hue[var11] = 0; // L: 631
				class430.Tiles_saturation[var11] = 0; // L: 632
				DecorativeObject.Tiles_lightness[var11] = 0; // L: 633
				class4.Tiles_hueMultiplier[var11] = 0; // L: 634
				Tiles.field999[var11] = 0; // L: 635
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 637
				for (var12 = 0; var12 < 104; ++var12) { // L: 638
					var13 = var11 + 5; // L: 639
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 640
						var14 = class356.Tiles_underlays[var2][var13][var12] & 255; // L: 641
						if (var14 > 0) { // L: 642
							FloorUnderlayDefinition var48 = class131.method2909(var14 - 1); // L: 643
							var10000 = NetFileRequest.Tiles_hue; // L: 644
							var10000[var12] += var48.hue;
							var10000 = class430.Tiles_saturation; // L: 645
							var10000[var12] += var48.saturation;
							var10000 = DecorativeObject.Tiles_lightness; // L: 646
							var10000[var12] += var48.lightness;
							var10000 = class4.Tiles_hueMultiplier; // L: 647
							var10000[var12] += var48.hueMultiplier;
							var10002 = Tiles.field999[var12]++; // L: 648
						}
					}

					var14 = var11 - 5; // L: 651
					if (var14 >= 0 && var14 < 104) { // L: 652
						var15 = class356.Tiles_underlays[var2][var14][var12] & 255; // L: 653
						if (var15 > 0) { // L: 654
							FloorUnderlayDefinition var49 = class131.method2909(var15 - 1); // L: 655
							var10000 = NetFileRequest.Tiles_hue; // L: 656
							var10000[var12] -= var49.hue;
							var10000 = class430.Tiles_saturation; // L: 657
							var10000[var12] -= var49.saturation;
							var10000 = DecorativeObject.Tiles_lightness; // L: 658
							var10000[var12] -= var49.lightness;
							var10000 = class4.Tiles_hueMultiplier; // L: 659
							var10000[var12] -= var49.hueMultiplier;
							var10002 = Tiles.field999[var12]--; // L: 660
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 664
					var12 = 0; // L: 665
					var13 = 0; // L: 666
					var14 = 0; // L: 667
					var15 = 0; // L: 668
					var16 = 0; // L: 669

					for (var17 = -5; var17 < 109; ++var17) { // L: 670
						var18 = var17 + 5; // L: 671
						if (var18 >= 0 && var18 < 104) { // L: 672
							var12 += NetFileRequest.Tiles_hue[var18]; // L: 673
							var13 += class430.Tiles_saturation[var18]; // L: 674
							var14 += DecorativeObject.Tiles_lightness[var18]; // L: 675
							var15 += class4.Tiles_hueMultiplier[var18]; // L: 676
							var16 += Tiles.field999[var18]; // L: 677
						}

						var19 = var17 - 5; // L: 679
						if (var19 >= 0 && var19 < 104) { // L: 680
							var12 -= NetFileRequest.Tiles_hue[var19]; // L: 681
							var13 -= class430.Tiles_saturation[var19]; // L: 682
							var14 -= DecorativeObject.Tiles_lightness[var19]; // L: 683
							var15 -= class4.Tiles_hueMultiplier[var19]; // L: 684
							var16 -= Tiles.field999[var19]; // L: 685
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 687 688 689 690
							if (var2 < Tiles.Tiles_minPlane) { // L: 693
								Tiles.Tiles_minPlane = var2;
							}

							var20 = class356.Tiles_underlays[var2][var11][var17] & 255; // L: 694
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 695
							if (var20 > 0 || var21 > 0) { // L: 696
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 697
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 698
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 699
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 700
								int var26 = class295.field3524[var11][var17]; // L: 701
								int var27 = class295.field3524[var11 + 1][var17]; // L: 702
								int var28 = class295.field3524[var11 + 1][var17 + 1]; // L: 703
								int var29 = class295.field3524[var11][var17 + 1]; // L: 704
								int var30 = -1; // L: 705
								int var31 = -1; // L: 706
								int var32;
								int var33;
								int var34;
								if (var20 > 0) { // L: 707
									var32 = var12 * 256 / var15; // L: 708
									var33 = var13 / var16; // L: 709
									var34 = var14 / var16; // L: 710
									var30 = Client.hslToRgb(var32, var33, var34); // L: 711
									var32 = var32 + Tiles.rndHue & 255; // L: 712
									var34 += Tiles.rndLightness; // L: 713
									if (var34 < 0) { // L: 714
										var34 = 0;
									} else if (var34 > 255) { // L: 715
										var34 = 255;
									}

									var31 = Client.hslToRgb(var32, var33, var34); // L: 716
								}

								FloorOverlayDefinition var35;
								if (var2 > 0) { // L: 718
									boolean var56 = true; // L: 719
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 720
										var56 = false;
									}

									if (var21 > 0) { // L: 721
										var34 = var21 - 1; // L: 723
										var35 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var34); // L: 725
										FloorOverlayDefinition var45;
										if (var35 != null) { // L: 726
											var45 = var35; // L: 727
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34); // L: 730
											var35 = new FloorOverlayDefinition(); // L: 731
											if (var36 != null) { // L: 732
												var35.decode(new Buffer(var36), var34);
											}

											var35.postDecode(); // L: 733
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, (long)var34); // L: 734
											var45 = var35; // L: 735
										}

										if (!var45.hideUnderlay) { // L: 737
											var56 = false;
										}
									}

									if (var56 && var23 == var22 && var24 == var22 && var25 == var22) { // L: 739 740
										var10000 = MouseRecorder.field1060[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 743
								if (var31 != -1) { // L: 744
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method3599(var31, 96)];
								}

								if (var21 == 0) { // L: 745
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, StructComposition.method3599(var30, var26), StructComposition.method3599(var30, var27), StructComposition.method3599(var30, var28), StructComposition.method3599(var30, var29), 0, 0, 0, 0, var32, 0); // L: 746
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 749
									byte var57 = Tiles.field997[var2][var11][var17]; // L: 750
									int var46 = var21 - 1; // L: 752
									FloorOverlayDefinition var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var46); // L: 754
									if (var37 != null) { // L: 755
										var35 = var37; // L: 756
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46); // L: 759
										var37 = new FloorOverlayDefinition(); // L: 760
										if (var38 != null) { // L: 761
											var37.decode(new Buffer(var38), var46);
										}

										var37.postDecode(); // L: 762
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var46); // L: 763
										var35 = var37; // L: 764
									}

									int var47 = var35.texture; // L: 767
									int var39;
									int var40;
									int var41;
									int var42;
									if (var47 >= 0) { // L: 770
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47); // L: 771
										var39 = -1; // L: 772
									} else if (var35.primaryRgb == 16711935) { // L: 775
										var39 = -2; // L: 776
										var47 = -1; // L: 777
										var40 = -2; // L: 778
									} else {
										var39 = Client.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 781
										var41 = var35.hue + Tiles.rndHue & 255; // L: 782
										var42 = var35.lightness + Tiles.rndLightness; // L: 783
										if (var42 < 0) { // L: 784
											var42 = 0;
										} else if (var42 > 255) { // L: 785
											var42 = 255;
										}

										var40 = Client.hslToRgb(var41, var35.saturation, var42); // L: 786
									}

									var41 = 0; // L: 789
									if (var40 != -2) { // L: 790
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[World.method1692(var40, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 791
										var42 = var35.secondaryHue + Tiles.rndHue & 255; // L: 792
										int var43 = var35.secondaryLightness + Tiles.rndLightness; // L: 793
										if (var43 < 0) { // L: 794
											var43 = 0;
										} else if (var43 > 255) { // L: 795
											var43 = 255;
										}

										var40 = Client.hslToRgb(var42, var35.secondarySaturation, var43); // L: 796
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[World.method1692(var40, 96)]; // L: 797
									}

									var0.addTile(var2, var11, var17, var33, var57, var47, var22, var23, var24, var25, StructComposition.method3599(var30, var26), StructComposition.method3599(var30, var27), StructComposition.method3599(var30, var28), StructComposition.method3599(var30, var29), World.method1692(var39, var26), World.method1692(var39, var27), World.method1692(var39, var28), World.method1692(var39, var29), var32, var41); // L: 799
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 806
				for (var12 = 1; var12 < 103; ++var12) { // L: 807
					var0.setTileMinPlane(var2, var12, var11, Actor.method2268(var2, var12, var11)); // L: 808
				}
			}

			class356.Tiles_underlays[var2] = null; // L: 811
			Tiles.Tiles_overlays[var2] = null; // L: 812
			Tiles.Tiles_shapes[var2] = null; // L: 813
			Tiles.field997[var2] = null; // L: 814
			Tiles.field998[var2] = null; // L: 815
		}

		var0.method4138(-50, -10, -50); // L: 817

		for (var2 = 0; var2 < 104; ++var2) { // L: 818
			for (var3 = 0; var3 < 104; ++var3) { // L: 819
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 820
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 823
		var3 = 2; // L: 824
		var4 = 4; // L: 825

		for (var5 = 0; var5 < 4; ++var5) { // L: 826
			if (var5 > 0) { // L: 827
				var2 <<= 3; // L: 828
				var3 <<= 3; // L: 829
				var4 <<= 3; // L: 830
			}

			for (int var52 = 0; var52 <= var5; ++var52) { // L: 832
				for (int var53 = 0; var53 <= 104; ++var53) { // L: 833
					for (int var54 = 0; var54 <= 104; ++var54) { // L: 834
						short var55;
						if ((MouseRecorder.field1060[var52][var54][var53] & var2) != 0) { // L: 835
							var9 = var53; // L: 836
							var10 = var53; // L: 837
							var11 = var52; // L: 838

							for (var12 = var52; var9 > 0 && (MouseRecorder.field1060[var52][var54][var9 - 1] & var2) != 0; --var9) { // L: 839 840
							}

							while (var10 < 104 && (MouseRecorder.field1060[var52][var54][var10 + 1] & var2) != 0) { // L: 841
								++var10;
							}

							label448:
							while (var11 > 0) { // L: 842
								for (var13 = var9; var13 <= var10; ++var13) { // L: 843
									if ((MouseRecorder.field1060[var11 - 1][var54][var13] & var2) == 0) {
										break label448;
									}
								}

								--var11; // L: 844
							}

							label437:
							while (var12 < var5) { // L: 846
								for (var13 = var9; var13 <= var10; ++var13) { // L: 847
									if ((MouseRecorder.field1060[var12 + 1][var54][var13] & var2) == 0) {
										break label437;
									}
								}

								++var12; // L: 848
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 850
							if (var13 >= 8) { // L: 851
								var55 = 240; // L: 852
								var15 = Tiles.Tiles_heights[var12][var54][var9] - var55; // L: 853
								var16 = Tiles.Tiles_heights[var11][var54][var9]; // L: 854
								Scene.Scene_addOccluder(var5, 1, var54 * 128, var54 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 855

								for (var17 = var11; var17 <= var12; ++var17) { // L: 856
									for (var18 = var9; var18 <= var10; ++var18) { // L: 857
										var10000 = MouseRecorder.field1060[var17][var54];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((MouseRecorder.field1060[var52][var54][var53] & var3) != 0) { // L: 861
							var9 = var54; // L: 862
							var10 = var54; // L: 863
							var11 = var52; // L: 864

							for (var12 = var52; var9 > 0 && (MouseRecorder.field1060[var52][var9 - 1][var53] & var3) != 0; --var9) { // L: 865 866
							}

							while (var10 < 104 && (MouseRecorder.field1060[var52][var10 + 1][var53] & var3) != 0) { // L: 867
								++var10;
							}

							label501:
							while (var11 > 0) { // L: 868
								for (var13 = var9; var13 <= var10; ++var13) { // L: 869
									if ((MouseRecorder.field1060[var11 - 1][var13][var53] & var3) == 0) {
										break label501;
									}
								}

								--var11; // L: 870
							}

							label490:
							while (var12 < var5) { // L: 872
								for (var13 = var9; var13 <= var10; ++var13) { // L: 873
									if ((MouseRecorder.field1060[var12 + 1][var13][var53] & var3) == 0) {
										break label490;
									}
								}

								++var12; // L: 874
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 876
							if (var13 >= 8) { // L: 877
								var55 = 240; // L: 878
								var15 = Tiles.Tiles_heights[var12][var9][var53] - var55; // L: 879
								var16 = Tiles.Tiles_heights[var11][var9][var53]; // L: 880
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var53 * 128, var53 * 128, var15, var16); // L: 881

								for (var17 = var11; var17 <= var12; ++var17) { // L: 882
									for (var18 = var9; var18 <= var10; ++var18) { // L: 883
										var10000 = MouseRecorder.field1060[var17][var18];
										var10000[var53] &= ~var3;
									}
								}
							}
						}

						if ((MouseRecorder.field1060[var52][var54][var53] & var4) != 0) { // L: 887
							var9 = var54; // L: 888
							var10 = var54; // L: 889
							var11 = var53; // L: 890

							for (var12 = var53; var11 > 0 && (MouseRecorder.field1060[var52][var54][var11 - 1] & var4) != 0; --var11) { // L: 891 892
							}

							while (var12 < 104 && (MouseRecorder.field1060[var52][var54][var12 + 1] & var4) != 0) { // L: 893
								++var12;
							}

							label554:
							while (var9 > 0) { // L: 894
								for (var13 = var11; var13 <= var12; ++var13) { // L: 895
									if ((MouseRecorder.field1060[var52][var9 - 1][var13] & var4) == 0) {
										break label554;
									}
								}

								--var9; // L: 896
							}

							label543:
							while (var10 < 104) { // L: 898
								for (var13 = var11; var13 <= var12; ++var13) { // L: 899
									if ((MouseRecorder.field1060[var52][var10 + 1][var13] & var4) == 0) {
										break label543;
									}
								}

								++var10; // L: 900
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 902
								var13 = Tiles.Tiles_heights[var52][var9][var11]; // L: 903
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 904

								for (var14 = var9; var14 <= var10; ++var14) { // L: 905
									for (var15 = var11; var15 <= var12; ++var15) { // L: 906
										var10000 = MouseRecorder.field1060[var52][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 914
}
