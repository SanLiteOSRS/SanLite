import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class10 {
	@ObfuscatedName("af")
	final HttpsURLConnection field50;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	final class394 field47;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class9 field53;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	class436 field52;
	@ObfuscatedName("au")
	boolean field51;
	@ObfuscatedName("ab")
	boolean field49;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -283025399
	)
	int field48;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Lpc;Z)V"
	)
	public class10(URL var1, class9 var2, class394 var3, boolean var4) throws IOException {
		this.field51 = false; // L: 17
		this.field49 = false; // L: 18
		this.field48 = 300000; // L: 19
		if (!var2.method77()) { // L: 26
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method71()); // L: 27
		} else {
			this.field50 = (HttpsURLConnection)var1.openConnection(); // L: 29
			if (!var4) { // L: 30
				HttpsURLConnection var5 = this.field50; // L: 31
				if (class15.field83 == null) { // L: 34
					class15.field83 = new class15(); // L: 35
				}

				class15 var6 = class15.field83; // L: 37
				var5.setSSLSocketFactory(var6); // L: 39
			}

			this.field53 = var2; // L: 41
			this.field47 = var3 != null ? var3 : new class394(); // L: 42
		}
	} // L: 43

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laa;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class394(), var3); // L: 22
	} // L: 23

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lpc;",
		garbageValue = "1901364413"
	)
	public class394 method84() {
		return this.field47; // L: 46
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "1"
	)
	public void method97(class436 var1) {
		if (!this.field51) { // L: 50
			if (var1 == null) { // L: 51
				this.field47.method7657("Content-Type"); // L: 52
				this.field52 = null; // L: 53
			} else {
				this.field52 = var1; // L: 56
				if (this.field52.vmethod8346() != null) { // L: 57
					this.field47.method7632(this.field52.vmethod8346()); // L: 58
				} else {
					this.field47.method7633(); // L: 61
				}

			}
		}
	} // L: 54 63

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method90() throws ProtocolException {
		if (!this.field51) { // L: 66
			this.field50.setRequestMethod(this.field53.method71()); // L: 67
			this.field47.method7625(this.field50); // L: 68
			if (this.field53.method72() && this.field52 != null) { // L: 69
				this.field50.setDoOutput(true); // L: 70
				ByteArrayOutputStream var1 = new ByteArrayOutputStream(); // L: 71

				try {
					var1.write(this.field52.vmethod8347()); // L: 73
					var1.writeTo(this.field50.getOutputStream()); // L: 74
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

			this.field50.setConnectTimeout(this.field48); // L: 88
			this.field50.setInstanceFollowRedirects(this.field49); // L: 89
			this.field51 = true; // L: 90
		}
	} // L: 91

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	boolean method91() throws IOException {
		if (!this.field51) { // L: 94
			this.method90();
		}

		this.field50.connect(); // L: 95
		return this.field50.getResponseCode() == -1; // L: 96
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Laj;",
		garbageValue = "-27"
	)
	class20 method87() {
		try {
			if (!this.field51 || this.field50.getResponseCode() == -1) { // L: 101
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 103
			this.field50.disconnect(); // L: 104
			return new class20("Error decoding REST response code: " + var10.getMessage()); // L: 105
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field50); // L: 109
			return var1; // L: 117
		} catch (IOException var8) { // L: 111
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field50.disconnect(); // L: 115
		}

		return var3; // L: 112
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lie;[Lif;I)V",
		garbageValue = "1670427112"
	)
	static final void method98(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 643
			for (var3 = 0; var3 < 104; ++var3) { // L: 644
				for (var4 = 0; var4 < 104; ++var4) { // L: 645
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 646
						var5 = var2; // L: 647
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 648
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 649
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 654
		if (Tiles.rndHue < -8) { // L: 655
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 656
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 657
		if (Tiles.rndLightness < -16) { // L: 658
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 659
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 660
			byte[][] var45 = Tiles.field994[var2]; // L: 661
			boolean var54 = true; // L: 662
			boolean var55 = true; // L: 663
			boolean var6 = true; // L: 664
			boolean var7 = true; // L: 665
			boolean var8 = true; // L: 666
			var9 = (int)Math.sqrt(5100.0D); // L: 667
			var10 = var9 * 768 >> 8; // L: 668

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 669
				for (var12 = 1; var12 < 103; ++var12) { // L: 670
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 671
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 672
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 673
					var16 = (var13 << 8) / var15; // L: 674
					var17 = 65536 / var15; // L: 675
					var18 = (var14 << 8) / var15; // L: 676
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 677
					var20 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1); // L: 678
					Tiles.field996[var12][var11] = var19 - var20; // L: 679
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 682
				FileSystem.Tiles_hue[var11] = 0; // L: 683
				Tiles.Tiles_saturation[var11] = 0; // L: 684
				class283.Tiles_lightness[var11] = 0; // L: 685
				UserComparator4.Tiles_hueMultiplier[var11] = 0; // L: 686
				class31.field176[var11] = 0; // L: 687
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 689
				for (var12 = 0; var12 < 104; ++var12) { // L: 690
					var13 = var11 + 5; // L: 691
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 692
						var14 = (int)DynamicObject.method2151(15); // L: 693
						var15 = class186.field1976[var2][var13][var12] & var14; // L: 694
						if (var15 > 0) { // L: 695
							var17 = var15 - 1; // L: 697
							FloorUnderlayDefinition var49 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 699
							FloorUnderlayDefinition var51;
							if (var49 != null) { // L: 700
								var51 = var49; // L: 701
							} else {
								byte[] var50 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 704
								var49 = new FloorUnderlayDefinition(); // L: 705
								if (var50 != null) { // L: 706
									var49.decode(new Buffer(var50), var17);
								}

								var49.postDecode(); // L: 707
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var49, (long)var17); // L: 708
								var51 = var49; // L: 709
							}

							var10000 = FileSystem.Tiles_hue; // L: 712
							var10000[var12] += var51.hue;
							var10000 = Tiles.Tiles_saturation; // L: 713
							var10000[var12] += var51.saturation;
							var10000 = class283.Tiles_lightness; // L: 714
							var10000[var12] += var51.lightness;
							var10000 = UserComparator4.Tiles_hueMultiplier; // L: 715
							var10000[var12] += var51.hueMultiplier;
							var10002 = class31.field176[var12]++; // L: 716
						}
					}

					var14 = var11 - 5; // L: 719
					if (var14 >= 0 && var14 < 104) { // L: 720
						var15 = (int)DynamicObject.method2151(15); // L: 721
						var16 = class186.field1976[var2][var14][var12] & var15; // L: 722
						if (var16 > 0) { // L: 723
							var18 = var16 - 1; // L: 725
							FloorUnderlayDefinition var62 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18); // L: 727
							FloorUnderlayDefinition var53;
							if (var62 != null) { // L: 728
								var53 = var62; // L: 729
							} else {
								byte[] var52 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var18); // L: 732
								var62 = new FloorUnderlayDefinition(); // L: 733
								if (var52 != null) { // L: 734
									var62.decode(new Buffer(var52), var18);
								}

								var62.postDecode(); // L: 735
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var62, (long)var18); // L: 736
								var53 = var62; // L: 737
							}

							var10000 = FileSystem.Tiles_hue; // L: 740
							var10000[var12] -= var53.hue;
							var10000 = Tiles.Tiles_saturation; // L: 741
							var10000[var12] -= var53.saturation;
							var10000 = class283.Tiles_lightness; // L: 742
							var10000[var12] -= var53.lightness;
							var10000 = UserComparator4.Tiles_hueMultiplier; // L: 743
							var10000[var12] -= var53.hueMultiplier;
							var10002 = class31.field176[var12]--; // L: 744
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 748
					var12 = 0; // L: 749
					var13 = 0; // L: 750
					var14 = 0; // L: 751
					var15 = 0; // L: 752
					var16 = 0; // L: 753

					for (var17 = -5; var17 < 109; ++var17) { // L: 754
						var18 = var17 + 5; // L: 755
						if (var18 >= 0 && var18 < 104) { // L: 756
							var12 += FileSystem.Tiles_hue[var18]; // L: 757
							var13 += Tiles.Tiles_saturation[var18]; // L: 758
							var14 += class283.Tiles_lightness[var18]; // L: 759
							var15 += UserComparator4.Tiles_hueMultiplier[var18]; // L: 760
							var16 += class31.field176[var18]; // L: 761
						}

						var19 = var17 - 5; // L: 763
						if (var19 >= 0 && var19 < 104) { // L: 764
							var12 -= FileSystem.Tiles_hue[var19]; // L: 765
							var13 -= Tiles.Tiles_saturation[var19]; // L: 766
							var14 -= class283.Tiles_lightness[var19]; // L: 767
							var15 -= UserComparator4.Tiles_hueMultiplier[var19]; // L: 768
							var16 -= class31.field176[var19]; // L: 769
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 771 772 773 774
							if (var2 < Tiles.Tiles_minPlane) { // L: 777
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)DynamicObject.method2151(15); // L: 778
							int var21 = class186.field1976[var2][var11][var17] & var20; // L: 779
							int var22 = Tiles.field997[var2][var11][var17] & var20; // L: 780
							if (var21 > 0 || var22 > 0) { // L: 781
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 782
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 783
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 784
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 785
								int var27 = Tiles.field996[var11][var17]; // L: 786
								int var28 = Tiles.field996[var11 + 1][var17]; // L: 787
								int var29 = Tiles.field996[var11 + 1][var17 + 1]; // L: 788
								int var30 = Tiles.field996[var11][var17 + 1]; // L: 789
								int var31 = -1; // L: 790
								int var32 = -1; // L: 791
								int var33;
								int var34;
								int var35;
								if (var21 > 0) { // L: 792
									var33 = var12 * 256 / var15; // L: 793
									var34 = var13 / var16; // L: 794
									var35 = var14 / var16; // L: 795
									var31 = GameBuild.hslToRgb(var33, var34, var35); // L: 796
									var33 = var33 + Tiles.rndHue & 255; // L: 797
									var35 += Tiles.rndLightness; // L: 798
									if (var35 < 0) { // L: 799
										var35 = 0;
									} else if (var35 > 255) { // L: 800
										var35 = 255;
									}

									var32 = GameBuild.hslToRgb(var33, var34, var35); // L: 801
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) { // L: 803
									boolean var60 = true; // L: 804
									if (var21 == 0 && Tiles.field1008[var2][var11][var17] != 0) { // L: 805
										var60 = false;
									}

									if (var22 > 0) { // L: 806
										var35 = var22 - 1; // L: 808
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35); // L: 810
										FloorOverlayDefinition var46;
										if (var36 != null) { // L: 811
											var46 = var36; // L: 812
										} else {
											byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35); // L: 815
											var36 = new FloorOverlayDefinition(); // L: 816
											if (var37 != null) { // L: 817
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode(); // L: 818
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35); // L: 819
											var46 = var36; // L: 820
										}

										if (!var46.hideUnderlay) { // L: 822
											var60 = false;
										}
									}

									if (var60 && var23 == var24 && var23 == var25 && var26 == var23) { // L: 824 825
										var10000 = class161.field1782[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 828
								if (var32 != -1) { // L: 829
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[method100(var32, 96)];
								}

								if (var22 == 0) { // L: 830
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, method100(var31, var27), method100(var31, var28), method100(var31, var29), method100(var31, var30), 0, 0, 0, 0, var33, 0); // L: 831
								} else {
									var34 = Tiles.field1008[var2][var11][var17] + 1; // L: 834
									byte var61 = Tiles.field999[var2][var11][var17]; // L: 835
									int var47 = var22 - 1; // L: 837
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var47); // L: 839
									if (var38 != null) { // L: 840
										var36 = var38; // L: 841
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var47); // L: 844
										var38 = new FloorOverlayDefinition(); // L: 845
										if (var39 != null) { // L: 846
											var38.decode(new Buffer(var39), var47);
										}

										var38.postDecode(); // L: 847
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var47); // L: 848
										var36 = var38; // L: 849
									}

									int var48 = var36.texture; // L: 852
									int var40;
									int var41;
									int var42;
									int var43;
									if (var48 >= 0) { // L: 855
										var41 = Rasterizer3D.field2514.Rasterizer3D_textureLoader.getAverageTextureRGB(var48); // L: 856
										var40 = -1; // L: 857
									} else if (var36.primaryRgb == 16711935) { // L: 860
										var40 = -2; // L: 861
										var48 = -1; // L: 862
										var41 = -2; // L: 863
									} else {
										var40 = GameBuild.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 866
										var42 = var36.hue + Tiles.rndHue & 255; // L: 867
										var43 = var36.lightness + Tiles.rndLightness; // L: 868
										if (var43 < 0) { // L: 869
											var43 = 0;
										} else if (var43 > 255) { // L: 870
											var43 = 255;
										}

										var41 = GameBuild.hslToRgb(var42, var36.saturation, var43); // L: 871
									}

									var42 = 0; // L: 874
									if (var41 != -2) { // L: 875
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method8903(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 876
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 877
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 878
										if (var44 < 0) { // L: 879
											var44 = 0;
										} else if (var44 > 255) { // L: 880
											var44 = 255;
										}

										var41 = GameBuild.hslToRgb(var43, var36.secondarySaturation, var44); // L: 881
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class478.method8903(var41, 96)]; // L: 882
									}

									var0.addTile(var2, var11, var17, var34, var61, var48, var23, var24, var25, var26, method100(var31, var27), method100(var31, var28), method100(var31, var29), method100(var31, var30), class478.method8903(var40, var27), class478.method8903(var40, var28), class478.method8903(var40, var29), class478.method8903(var40, var30), var33, var42); // L: 884
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 891
				for (var12 = 1; var12 < 103; ++var12) { // L: 892
					var0.setTileMinPlane(var2, var12, var11, PcmPlayer.method845(var2, var12, var11)); // L: 893
				}
			}

			class186.field1976[var2] = null; // L: 896
			Tiles.field997[var2] = null; // L: 897
			Tiles.field1008[var2] = null; // L: 898
			Tiles.field999[var2] = null; // L: 899
			Tiles.field994[var2] = null; // L: 900
		}

		var0.method4590(-50, -10, -50); // L: 902

		for (var2 = 0; var2 < 104; ++var2) { // L: 903
			for (var3 = 0; var3 < 104; ++var3) { // L: 904
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 905
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 908
		var3 = 2; // L: 909
		var4 = 4; // L: 910

		for (var5 = 0; var5 < 4; ++var5) { // L: 911
			if (var5 > 0) { // L: 912
				var2 <<= 3; // L: 913
				var3 <<= 3; // L: 914
				var4 <<= 3; // L: 915
			}

			for (int var56 = 0; var56 <= var5; ++var56) { // L: 917
				for (int var57 = 0; var57 <= 104; ++var57) { // L: 918
					for (int var58 = 0; var58 <= 104; ++var58) { // L: 919
						short var59;
						if ((class161.field1782[var56][var58][var57] & var2) != 0) { // L: 920
							var9 = var57; // L: 921
							var10 = var57; // L: 922
							var11 = var56; // L: 923

							for (var12 = var56; var9 > 0 && (class161.field1782[var56][var58][var9 - 1] & var2) != 0; --var9) { // L: 924 925
							}

							while (var10 < 104 && (class161.field1782[var56][var58][var10 + 1] & var2) != 0) { // L: 926
								++var10;
							}

							label463:
							while (var11 > 0) { // L: 927
								for (var13 = var9; var13 <= var10; ++var13) { // L: 928
									if ((class161.field1782[var11 - 1][var58][var13] & var2) == 0) {
										break label463;
									}
								}

								--var11; // L: 929
							}

							label452:
							while (var12 < var5) { // L: 931
								for (var13 = var9; var13 <= var10; ++var13) { // L: 932
									if ((class161.field1782[var12 + 1][var58][var13] & var2) == 0) {
										break label452;
									}
								}

								++var12; // L: 933
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 935
							if (var13 >= 8) { // L: 936
								var59 = 240; // L: 937
								var15 = Tiles.Tiles_heights[var12][var58][var9] - var59; // L: 938
								var16 = Tiles.Tiles_heights[var11][var58][var9]; // L: 939
								Scene.Scene_addOccluder(var5, 1, var58 * 128, var58 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 940

								for (var17 = var11; var17 <= var12; ++var17) { // L: 941
									for (var18 = var9; var18 <= var10; ++var18) { // L: 942
										var10000 = class161.field1782[var17][var58];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class161.field1782[var56][var58][var57] & var3) != 0) { // L: 946
							var9 = var58; // L: 947
							var10 = var58; // L: 948
							var11 = var56; // L: 949

							for (var12 = var56; var9 > 0 && (class161.field1782[var56][var9 - 1][var57] & var3) != 0; --var9) { // L: 950 951
							}

							while (var10 < 104 && (class161.field1782[var56][var10 + 1][var57] & var3) != 0) { // L: 952
								++var10;
							}

							label516:
							while (var11 > 0) { // L: 953
								for (var13 = var9; var13 <= var10; ++var13) { // L: 954
									if ((class161.field1782[var11 - 1][var13][var57] & var3) == 0) {
										break label516;
									}
								}

								--var11; // L: 955
							}

							label505:
							while (var12 < var5) { // L: 957
								for (var13 = var9; var13 <= var10; ++var13) { // L: 958
									if ((class161.field1782[var12 + 1][var13][var57] & var3) == 0) {
										break label505;
									}
								}

								++var12; // L: 959
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 961
							if (var13 >= 8) { // L: 962
								var59 = 240; // L: 963
								var15 = Tiles.Tiles_heights[var12][var9][var57] - var59; // L: 964
								var16 = Tiles.Tiles_heights[var11][var9][var57]; // L: 965
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var57 * 128, var57 * 128, var15, var16); // L: 966

								for (var17 = var11; var17 <= var12; ++var17) { // L: 967
									for (var18 = var9; var18 <= var10; ++var18) { // L: 968
										var10000 = class161.field1782[var17][var18];
										var10000[var57] &= ~var3;
									}
								}
							}
						}

						if ((class161.field1782[var56][var58][var57] & var4) != 0) { // L: 972
							var9 = var58; // L: 973
							var10 = var58; // L: 974
							var11 = var57; // L: 975

							for (var12 = var57; var11 > 0 && (class161.field1782[var56][var58][var11 - 1] & var4) != 0; --var11) { // L: 976 977
							}

							while (var12 < 104 && (class161.field1782[var56][var58][var12 + 1] & var4) != 0) { // L: 978
								++var12;
							}

							label569:
							while (var9 > 0) { // L: 979
								for (var13 = var11; var13 <= var12; ++var13) { // L: 980
									if ((class161.field1782[var56][var9 - 1][var13] & var4) == 0) {
										break label569;
									}
								}

								--var9; // L: 981
							}

							label558:
							while (var10 < 104) { // L: 983
								for (var13 = var11; var13 <= var12; ++var13) { // L: 984
									if ((class161.field1782[var56][var10 + 1][var13] & var4) == 0) {
										break label558;
									}
								}

								++var10; // L: 985
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 987
								var13 = Tiles.Tiles_heights[var56][var9][var11]; // L: 988
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 989

								for (var14 = var9; var14 <= var10; ++var14) { // L: 990
									for (var15 = var11; var15 <= var12; ++var15) { // L: 991
										var10000 = class161.field1782[var56][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 999

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-42895178"
	)
	static final int method100(int var0, int var1) {
		if (var0 == -1) { // L: 1041
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 1042
			if (var1 < 2) { // L: 1043
				var1 = 2;
			} else if (var1 > 126) { // L: 1044
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 1045
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(II)Lsk;",
		garbageValue = "1355800159"
	)
	static class482 method99(int var0) {
		class482 var1 = (class482)Client.Widget_cachedFonts.get((long)var0); // L: 12258
		if (var1 == null) { // L: 12259
			var1 = new class482(PcmPlayer.field316, var0); // L: 12260
		}

		return var1; // L: 12262
	}
}
