import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public class class10 {
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 1355366367
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("az")
	final HttpsURLConnection field45;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final class439 field41;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	final class9 field43;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	class481 field44;
	@ObfuscatedName("an")
	boolean field42;
	@ObfuscatedName("ao")
	boolean field46;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1358021553
	)
	int field48;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lal;Lqy;Z)V"
	)
	public class10(URL var1, class9 var2, class439 var3, boolean var4) throws IOException {
		this.field42 = false;
		this.field46 = false; // L: 18
		this.field48 = 300000; // L: 19
		if (!var2.method68()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method69()); // L: 27
		} else {
			this.field45 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				HttpsURLConnection var5 = this.field45; // L: 31
				if (class15.field68 == null) { // L: 34
					class15.field68 = new class15(); // L: 35
				}

				class15 var6 = class15.field68; // L: 37
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field43 = var2; // L: 41
			this.field41 = var3 != null ? var3 : new class439(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lal;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class439(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-1117338649"
	)
	public class439 method84() {
		return this.field41; // L: 46
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "37"
	)
	public void method87(class481 var1) {
		if (!this.field42) { // L: 50
			if (var1 == null) { // L: 51
				this.field41.method7940("Content-Type"); // L: 52
				this.field44 = null; // L: 53
			} else {
				this.field44 = var1; // L: 56
				if (this.field44.vmethod8561() != null) { // L: 57
					this.field41.method7945(this.field44.vmethod8561()); // L: 58
				} else {
					this.field41.method7978(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	void method88() throws ProtocolException {
		if (!this.field42) { // L: 66
			this.field45.setRequestMethod(this.field43.method69()); // L: 67
			this.field41.method7937(this.field45); // L: 68
			if (this.field43.method70() && this.field44 != null) { // L: 69
				this.field45.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field44.vmethod8560()); // L: 73
					var1.writeTo(this.field45.getOutputStream()); // L: 74
				} catch (IOException var11) { // L: 76
					var11.printStackTrace(); // L: 77
				} finally {
					try {
						var1.close(); // L: 81
					} catch (IOException var10) { // L: 83
						var10.printStackTrace(); // L: 84
					}

				}
			}

			this.field45.setConnectTimeout(this.field48); // L: 88
			this.field45.setInstanceFollowRedirects(this.field46); // L: 89
			this.field42 = true; // L: 90
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2037038519"
	)
	boolean method89() throws IOException {
		if (!this.field42) {
			this.method88();
		}

		this.field45.connect();
		return this.field45.getResponseCode() == -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Laa;",
		garbageValue = "111"
	)
	class20 method90() {
		try {
			if (!this.field42 || this.field45.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field45.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage());
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field45); // L: 109
			return var1;
		} catch (IOException var8) {
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field45.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "308653318"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 91
		if (var1 != null) { // L: 92
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemComposition_archive.takeFile(10, var0); // L: 93
			var1 = new ItemComposition(); // L: 94
			var1.id = var0; // L: 95
			if (var2 != null) { // L: 96
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 97
			if (var1.noteTemplate != -1) { // L: 98
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 99
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 100
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!class168.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 101
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) { // L: 102
					var1.name = var1.name + " (Members)"; // L: 103
				}

				var1.field2334 = "Login to a members' server to use this object."; // L: 105
				var1.isTradable = false; // L: 106

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 107
					var1.groundActions[var3] = null; // L: 108
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 110
					if (var3 != 4) { // L: 111
						var1.inventoryActions[var3] = null; // L: 112
					}
				}

				var1.shiftClickIndex = -2; // L: 115
				var1.field2352 = 0; // L: 116
				if (var1.params != null) { // L: 117
					boolean var6 = false; // L: 118

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 119
						ParamComposition var5 = class127.getParamDefinition((int)var4.key); // L: 120
						if (var5.autoDisable) { // L: 121
							var4.remove();
						} else {
							var6 = true; // L: 122
						}
					}

					if (!var6) { // L: 124
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 127
			return var1; // L: 128
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1946544915"
	)
	static final int method99(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 17
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljp;[Lix;I)V",
		garbageValue = "1142637180"
	)
	static final void method100(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 615
			for (var3 = 0; var3 < 104; ++var3) { // L: 616
				for (var4 = 0; var4 < 104; ++var4) { // L: 617
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 618
						var5 = var2; // L: 619
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 620
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 621
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 626
		if (Tiles.rndHue < -8) { // L: 627
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 628
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 629
		if (Tiles.rndLightness < -16) { // L: 630
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 631
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 632
			byte[][] var47 = TextureProvider.field2750[var2]; // L: 633
			boolean var59 = true; // L: 634
			boolean var60 = true; // L: 635
			boolean var6 = true; // L: 636
			boolean var7 = true; // L: 637
			boolean var8 = true; // L: 638
			var9 = (int)Math.sqrt(5100.0D); // L: 639
			var10 = var9 * 768 >> 8; // L: 640

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 641
				for (var12 = 1; var12 < 103; ++var12) { // L: 642
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 643
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 644
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 645
					var16 = (var13 << 8) / var15; // L: 646
					var17 = 65536 / var15; // L: 647
					var18 = (var14 << 8) / var15; // L: 648
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 649
					int var58 = (var47[var12][var11 + 1] >> 3) + (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11] >> 1); // L: 650
					class306.field3195[var12][var11] = var19 - var58; // L: 651
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 654
				World.Tiles_hue[var11] = 0; // L: 655
				WorldMapLabelSize.Tiles_saturation[var11] = 0; // L: 656
				class539.Tiles_lightness[var11] = 0; // L: 657
				Tiles.Tiles_hueMultiplier[var11] = 0; // L: 658
				class384.field4473[var11] = 0; // L: 659
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 661
				for (var12 = 0; var12 < 104; ++var12) { // L: 662
					var13 = var11 + 5; // L: 663
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 664
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 670
						var16 = (int)var52; // L: 672
						var17 = Tiles.field1030[var2][var13][var12] & var16; // L: 673
						if (var17 > 0) { // L: 674
							FloorUnderlayDefinition var54 = class411.method7472(var17 - 1); // L: 675
							var10000 = World.Tiles_hue; // L: 676
							var10000[var12] += var54.hue;
							var10000 = WorldMapLabelSize.Tiles_saturation; // L: 677
							var10000[var12] += var54.saturation;
							var10000 = class539.Tiles_lightness; // L: 678
							var10000[var12] += var54.lightness;
							var10000 = Tiles.Tiles_hueMultiplier; // L: 679
							var10000[var12] += var54.hueMultiplier;
							var10002 = class384.field4473[var12]++; // L: 680
						}
					}

					var14 = var11 - 5; // L: 683
					if (var14 >= 0 && var14 < 104) { // L: 684
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 690
						var17 = (int)var55; // L: 692
						var18 = Tiles.field1030[var2][var14][var12] & var17; // L: 693
						if (var18 > 0) { // L: 694
							FloorUnderlayDefinition var57 = class411.method7472(var18 - 1); // L: 695
							var10000 = World.Tiles_hue; // L: 696
							var10000[var12] -= var57.hue;
							var10000 = WorldMapLabelSize.Tiles_saturation; // L: 697
							var10000[var12] -= var57.saturation;
							var10000 = class539.Tiles_lightness; // L: 698
							var10000[var12] -= var57.lightness;
							var10000 = Tiles.Tiles_hueMultiplier; // L: 699
							var10000[var12] -= var57.hueMultiplier;
							var10002 = class384.field4473[var12]--; // L: 700
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 704
					var12 = 0; // L: 705
					var13 = 0; // L: 706
					var14 = 0; // L: 707
					var15 = 0; // L: 708
					var16 = 0; // L: 709

					for (var17 = -5; var17 < 109; ++var17) { // L: 710
						var18 = var17 + 5; // L: 711
						if (var18 >= 0 && var18 < 104) { // L: 712
							var12 += World.Tiles_hue[var18]; // L: 713
							var13 += WorldMapLabelSize.Tiles_saturation[var18]; // L: 714
							var14 += class539.Tiles_lightness[var18]; // L: 715
							var15 += Tiles.Tiles_hueMultiplier[var18]; // L: 716
							var16 += class384.field4473[var18]; // L: 717
						}

						var19 = var17 - 5; // L: 719
						if (var19 >= 0 && var19 < 104) { // L: 720
							var12 -= World.Tiles_hue[var19]; // L: 721
							var13 -= WorldMapLabelSize.Tiles_saturation[var19]; // L: 722
							var14 -= class539.Tiles_lightness[var19]; // L: 723
							var15 -= Tiles.Tiles_hueMultiplier[var19]; // L: 724
							var16 -= class384.field4473[var19]; // L: 725
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 727 728 729 730
							if (var2 < Tiles.Tiles_minPlane) { // L: 733
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 739
							int var22 = (int)var20; // L: 741
							int var23 = Tiles.field1030[var2][var11][var17] & var22; // L: 742
							int var24 = AccessFile.field5129[var2][var11][var17] & var22; // L: 743
							if (var23 > 0 || var24 > 0) { // L: 744
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 745
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 746
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 747
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 748
								int var29 = class306.field3195[var11][var17]; // L: 749
								int var30 = class306.field3195[var11 + 1][var17]; // L: 750
								int var31 = class306.field3195[var11 + 1][var17 + 1]; // L: 751
								int var32 = class306.field3195[var11][var17 + 1]; // L: 752
								int var33 = -1; // L: 753
								int var34 = -1; // L: 754
								int var35;
								int var36;
								int var37;
								if (var23 > 0) { // L: 755
									var35 = var12 * 256 / var15; // L: 756
									var36 = var13 / var16; // L: 757
									var37 = var14 / var16; // L: 758
									var33 = class137.hslToRgb(var35, var36, var37); // L: 759
									var35 = var35 + Tiles.rndHue & 255; // L: 760
									var37 += Tiles.rndLightness; // L: 761
									if (var37 < 0) { // L: 762
										var37 = 0;
									} else if (var37 > 255) { // L: 763
										var37 = 255;
									}

									var34 = class137.hslToRgb(var35, var36, var37); // L: 764
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) { // L: 766
									boolean var65 = true; // L: 767
									if (var23 == 0 && Tiles.field1031[var2][var11][var17] != 0) { // L: 768
										var65 = false;
									}

									if (var24 > 0) { // L: 769
										var37 = var24 - 1; // L: 771
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37); // L: 773
										FloorOverlayDefinition var49;
										if (var38 != null) { // L: 774
											var49 = var38; // L: 775
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37); // L: 778
											var38 = new FloorOverlayDefinition(); // L: 779
											if (var39 != null) { // L: 780
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode(); // L: 781
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37); // L: 782
											var49 = var38; // L: 783
										}

										if (!var49.hideUnderlay) { // L: 785
											var65 = false;
										}
									}

									if (var65 && var26 == var25 && var27 == var25 && var25 == var28) { // L: 787 788
										var10000 = class168.field1833[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 791
								if (var34 != -1) { // L: 792
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapAreaData.method5783(var34, 96)];
								}

								if (var24 == 0) { // L: 793
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, WorldMapAreaData.method5783(var33, var29), WorldMapAreaData.method5783(var33, var30), WorldMapAreaData.method5783(var33, var31), WorldMapAreaData.method5783(var33, var32), 0, 0, 0, 0, var35, 0); // L: 794
								} else {
									var36 = Tiles.field1031[var2][var11][var17] + 1; // L: 797
									byte var66 = Tiles.field1028[var2][var11][var17]; // L: 798
									int var50 = var24 - 1; // L: 800
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var50); // L: 802
									if (var40 != null) { // L: 803
										var38 = var40; // L: 804
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var50); // L: 807
										var40 = new FloorOverlayDefinition(); // L: 808
										if (var41 != null) { // L: 809
											var40.decode(new Buffer(var41), var50);
										}

										var40.postDecode(); // L: 810
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var50); // L: 811
										var38 = var40; // L: 812
									}

									int var51 = var38.texture; // L: 815
									int var42;
									int var43;
									int var44;
									int var45;
									if (var51 >= 0) { // L: 818
										var43 = Rasterizer3D.field2611.Rasterizer3D_textureLoader.getAverageTextureRGB(var51); // L: 819
										var42 = -1; // L: 820
									} else if (var38.primaryRgb == 16711935) { // L: 823
										var42 = -2; // L: 824
										var51 = -1; // L: 825
										var43 = -2; // L: 826
									} else {
										var42 = class137.hslToRgb(var38.hue, var38.saturation, var38.lightness); // L: 829
										var44 = var38.hue + Tiles.rndHue & 255; // L: 830
										var45 = var38.lightness + Tiles.rndLightness; // L: 831
										if (var45 < 0) { // L: 832
											var45 = 0;
										} else if (var45 > 255) { // L: 833
											var45 = 255;
										}

										var43 = class137.hslToRgb(var44, var38.saturation, var45); // L: 834
									}

									var44 = 0; // L: 837
									if (var43 != -2) { // L: 838
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[SoundSystem.method817(var43, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 839
										var45 = var38.secondaryHue + Tiles.rndHue & 255; // L: 840
										int var46 = var38.secondaryLightness + Tiles.rndLightness; // L: 841
										if (var46 < 0) { // L: 842
											var46 = 0;
										} else if (var46 > 255) { // L: 843
											var46 = 255;
										}

										var43 = class137.hslToRgb(var45, var38.secondarySaturation, var46); // L: 844
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[SoundSystem.method817(var43, 96)]; // L: 845
									}

									var0.addTile(var2, var11, var17, var36, var66, var51, var25, var26, var27, var28, WorldMapAreaData.method5783(var33, var29), WorldMapAreaData.method5783(var33, var30), WorldMapAreaData.method5783(var33, var31), WorldMapAreaData.method5783(var33, var32), SoundSystem.method817(var42, var29), SoundSystem.method817(var42, var30), SoundSystem.method817(var42, var31), SoundSystem.method817(var42, var32), var35, var44); // L: 847
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 854
				for (var12 = 1; var12 < 103; ++var12) { // L: 855
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 862
						var17 = 0; // L: 863
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 866
						var17 = var2 - 1; // L: 867
					} else {
						var17 = var2; // L: 870
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 872
				}
			}

			Tiles.field1030[var2] = null; // L: 875
			AccessFile.field5129[var2] = null; // L: 876
			Tiles.field1031[var2] = null; // L: 877
			Tiles.field1028[var2] = null; // L: 878
			TextureProvider.field2750[var2] = null; // L: 879
		}

		var0.method4824(-50, -10, -50); // L: 881

		for (var2 = 0; var2 < 104; ++var2) { // L: 882
			for (var3 = 0; var3 < 104; ++var3) { // L: 883
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 884
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 887
		var3 = 2; // L: 888
		var4 = 4; // L: 889

		for (var5 = 0; var5 < 4; ++var5) { // L: 890
			if (var5 > 0) { // L: 891
				var2 <<= 3; // L: 892
				var3 <<= 3; // L: 893
				var4 <<= 3; // L: 894
			}

			for (int var61 = 0; var61 <= var5; ++var61) { // L: 896
				for (int var62 = 0; var62 <= 104; ++var62) { // L: 897
					for (int var63 = 0; var63 <= 104; ++var63) { // L: 898
						short var64;
						if ((class168.field1833[var61][var63][var62] & var2) != 0) { // L: 899
							var9 = var62; // L: 900
							var10 = var62; // L: 901
							var11 = var61; // L: 902

							for (var12 = var61; var9 > 0 && (class168.field1833[var61][var63][var9 - 1] & var2) != 0; --var9) { // L: 903 904
							}

							while (var10 < 104 && (class168.field1833[var61][var63][var10 + 1] & var2) != 0) { // L: 905
								++var10;
							}

							label457:
							while (var11 > 0) { // L: 906
								for (var13 = var9; var13 <= var10; ++var13) { // L: 907
									if ((class168.field1833[var11 - 1][var63][var13] & var2) == 0) {
										break label457;
									}
								}

								--var11; // L: 908
							}

							label446:
							while (var12 < var5) { // L: 910
								for (var13 = var9; var13 <= var10; ++var13) { // L: 911
									if ((class168.field1833[var12 + 1][var63][var13] & var2) == 0) {
										break label446;
									}
								}

								++var12; // L: 912
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 914
							if (var13 >= 8) { // L: 915
								var64 = 240; // L: 916
								var15 = Tiles.Tiles_heights[var12][var63][var9] - var64; // L: 917
								var16 = Tiles.Tiles_heights[var11][var63][var9]; // L: 918
								Scene.Scene_addOccluder(var5, 1, var63 * 128, var63 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 919

								for (var17 = var11; var17 <= var12; ++var17) { // L: 920
									for (var18 = var9; var18 <= var10; ++var18) { // L: 921
										var10000 = class168.field1833[var17][var63];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class168.field1833[var61][var63][var62] & var3) != 0) { // L: 925
							var9 = var63; // L: 926
							var10 = var63; // L: 927
							var11 = var61; // L: 928

							for (var12 = var61; var9 > 0 && (class168.field1833[var61][var9 - 1][var62] & var3) != 0; --var9) { // L: 929 930
							}

							while (var10 < 104 && (class168.field1833[var61][var10 + 1][var62] & var3) != 0) { // L: 931
								++var10;
							}

							label510:
							while (var11 > 0) { // L: 932
								for (var13 = var9; var13 <= var10; ++var13) { // L: 933
									if ((class168.field1833[var11 - 1][var13][var62] & var3) == 0) {
										break label510;
									}
								}

								--var11; // L: 934
							}

							label499:
							while (var12 < var5) { // L: 936
								for (var13 = var9; var13 <= var10; ++var13) { // L: 937
									if ((class168.field1833[var12 + 1][var13][var62] & var3) == 0) {
										break label499;
									}
								}

								++var12; // L: 938
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 940
							if (var13 >= 8) { // L: 941
								var64 = 240; // L: 942
								var15 = Tiles.Tiles_heights[var12][var9][var62] - var64; // L: 943
								var16 = Tiles.Tiles_heights[var11][var9][var62]; // L: 944
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var62 * 128, var62 * 128, var15, var16); // L: 945

								for (var17 = var11; var17 <= var12; ++var17) { // L: 946
									for (var18 = var9; var18 <= var10; ++var18) { // L: 947
										var10000 = class168.field1833[var17][var18];
										var10000[var62] &= ~var3;
									}
								}
							}
						}

						if ((class168.field1833[var61][var63][var62] & var4) != 0) { // L: 951
							var9 = var63; // L: 952
							var10 = var63; // L: 953
							var11 = var62; // L: 954

							for (var12 = var62; var11 > 0 && (class168.field1833[var61][var63][var11 - 1] & var4) != 0; --var11) { // L: 955 956
							}

							while (var12 < 104 && (class168.field1833[var61][var63][var12 + 1] & var4) != 0) { // L: 957
								++var12;
							}

							label563:
							while (var9 > 0) { // L: 958
								for (var13 = var11; var13 <= var12; ++var13) { // L: 959
									if ((class168.field1833[var61][var9 - 1][var13] & var4) == 0) {
										break label563;
									}
								}

								--var9; // L: 960
							}

							label552:
							while (var10 < 104) { // L: 962
								for (var13 = var11; var13 <= var12; ++var13) { // L: 963
									if ((class168.field1833[var61][var10 + 1][var13] & var4) == 0) {
										break label552;
									}
								}

								++var10; // L: 964
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 966
								var13 = Tiles.Tiles_heights[var61][var9][var11]; // L: 967
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 968

								for (var14 = var9; var14 <= var10; ++var14) { // L: 969
									for (var15 = var11; var15 <= var12; ++var15) { // L: 970
										var10000 = class168.field1833[var61][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 978

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "610118591"
	)
	static int method92(int var0, int var1) {
		int var2 = var1 - 334; // L: 5852
		if (var2 < 0) { // L: 5853
			var2 = 0;
		} else if (var2 > 100) { // L: 5854
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5855
		return var0 * var3 / 256; // L: 5856
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1344105936"
	)
	static boolean method101() {
		return NPC.clientPreferences.method2479() >= Client.field513; // L: 12974
	}
}
