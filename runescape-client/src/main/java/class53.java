import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class53 extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	static ClanSettings field363;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	class47 field364;

	public class53() {
		this.field364 = null; // L: 9
	} // L: 10

	@ObfuscatedSignature(
		descriptor = "(Lco;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) { // L: 13
			this.field364 = new class47(var1, (RawSound)null); // L: 16
		}
	} // L: 14 17

	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	public class53(RawSound var1) {
		this.field364 = new class47((VorbisSample)null, var1); // L: 20
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1084806884"
	)
	public boolean method1066() {
		return this.field364 == null; // L: 24
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "64"
	)
	public RawSound method1060() {
		if (this.field364 != null && this.field364.field330.tryLock()) { // L: 28
			RawSound var1;
			try {
				var1 = this.method1057(); // L: 31
			} finally {
				this.field364.field330.unlock(); // L: 34
			}

			return var1; // L: 36
		} else {
			return null; // L: 38
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "-2117300742"
	)
	public RawSound method1067() {
		if (this.field364 != null) { // L: 42
			this.field364.field330.lock(); // L: 43

			RawSound var1;
			try {
				var1 = this.method1057();
			} finally {
				this.field364.field330.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "15"
	)
	RawSound method1057() {
		if (this.field364.field329 == null) { // L: 57
			this.field364.field329 = this.field364.field328.toRawSound((int[])null);
			this.field364.field328 = null;
		}

		return this.field364.field329;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "7"
	)
	static boolean method1068(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 44
			boolean var3 = false; // L: 45
			boolean var4 = false; // L: 46
			int var5 = 0; // L: 47
			int var6 = var0.length(); // L: 48

			for (int var7 = 0; var7 < var6; ++var7) { // L: 49
				char var8 = var0.charAt(var7); // L: 50
				if (var7 == 0) { // L: 51
					if (var8 == '-') { // L: 52
						var3 = true; // L: 53
						continue;
					}

					if (var8 == '+') { // L: 56
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 58
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 59
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 60
						return false; // L: 61
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 62
					return false;
				}

				if (var3) { // L: 63
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 64
				if (var9 / var1 != var5) { // L: 65
					return false;
				}

				var5 = var9; // L: 66
				var4 = true; // L: 67
			}

			return var4; // L: 69
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[Liz;I)V",
		garbageValue = "-248181376"
	)
	static final void method1069(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 611
			for (var3 = 0; var3 < 104; ++var3) { // L: 612
				for (var4 = 0; var4 < 104; ++var4) { // L: 613
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 614
						var5 = var2; // L: 615
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 616
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 617
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 622
		if (Tiles.rndHue < -8) { // L: 623
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 624
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 625
		if (Tiles.rndLightness < -16) { // L: 626
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 627
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 628
			byte[][] var47 = class151.field1708[var2]; // L: 629
			boolean var58 = true; // L: 630
			boolean var59 = true; // L: 631
			boolean var6 = true; // L: 632
			boolean var7 = true; // L: 633
			boolean var8 = true; // L: 634
			var9 = (int)Math.sqrt(5100.0D); // L: 635
			var10 = var9 * 768 >> 8; // L: 636

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 637
				for (var12 = 1; var12 < 103; ++var12) { // L: 638
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 639
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 640
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 641
					var16 = (var13 << 8) / var15; // L: 642
					var17 = 65536 / var15; // L: 643
					var18 = (var14 << 8) / var15; // L: 644
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 645
					int var57 = (var47[var12][var11 + 1] >> 3) + (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11] >> 1); // L: 646
					Tiles.field1049[var12][var11] = var19 - var57; // L: 647
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 650
				Huffman.Tiles_hue[var11] = 0; // L: 651
				MilliClock.Tiles_saturation[var11] = 0; // L: 652
				ApproximateRouteStrategy.Tiles_lightness[var11] = 0; // L: 653
				class182.Tiles_hueMultiplier[var11] = 0; // L: 654
				class324.field3538[var11] = 0; // L: 655
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 657
				for (var12 = 0; var12 < 104; ++var12) { // L: 658
					var13 = var11 + 5; // L: 659
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 660
						long var51 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 666
						var16 = (int)var51; // L: 668
						var17 = GrandExchangeOfferAgeComparator.field4442[var2][var13][var12] & var16; // L: 669
						if (var17 > 0) { // L: 670
							FloorUnderlayDefinition var53 = GrandExchangeOfferOwnWorldComparator.method1203(var17 - 1); // L: 671
							var10000 = Huffman.Tiles_hue; // L: 672
							var10000[var12] += var53.hue;
							var10000 = MilliClock.Tiles_saturation; // L: 673
							var10000[var12] += var53.saturation;
							var10000 = ApproximateRouteStrategy.Tiles_lightness; // L: 674
							var10000[var12] += var53.lightness;
							var10000 = class182.Tiles_hueMultiplier; // L: 675
							var10000[var12] += var53.hueMultiplier;
							var10002 = class324.field3538[var12]++; // L: 676
						}
					}

					var14 = var11 - 5; // L: 679
					if (var14 >= 0 && var14 < 104) { // L: 680
						long var54 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 686
						var17 = (int)var54; // L: 688
						var18 = GrandExchangeOfferAgeComparator.field4442[var2][var14][var12] & var17; // L: 689
						if (var18 > 0) { // L: 690
							FloorUnderlayDefinition var56 = GrandExchangeOfferOwnWorldComparator.method1203(var18 - 1); // L: 691
							var10000 = Huffman.Tiles_hue; // L: 692
							var10000[var12] -= var56.hue;
							var10000 = MilliClock.Tiles_saturation; // L: 693
							var10000[var12] -= var56.saturation;
							var10000 = ApproximateRouteStrategy.Tiles_lightness; // L: 694
							var10000[var12] -= var56.lightness;
							var10000 = class182.Tiles_hueMultiplier; // L: 695
							var10000[var12] -= var56.hueMultiplier;
							var10002 = class324.field3538[var12]--; // L: 696
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 700
					var12 = 0; // L: 701
					var13 = 0; // L: 702
					var14 = 0; // L: 703
					var15 = 0; // L: 704
					var16 = 0; // L: 705

					for (var17 = -5; var17 < 109; ++var17) { // L: 706
						var18 = var17 + 5; // L: 707
						if (var18 >= 0 && var18 < 104) { // L: 708
							var12 += Huffman.Tiles_hue[var18]; // L: 709
							var13 += MilliClock.Tiles_saturation[var18]; // L: 710
							var14 += ApproximateRouteStrategy.Tiles_lightness[var18]; // L: 711
							var15 += class182.Tiles_hueMultiplier[var18]; // L: 712
							var16 += class324.field3538[var18]; // L: 713
						}

						var19 = var17 - 5; // L: 715
						if (var19 >= 0 && var19 < 104) { // L: 716
							var12 -= Huffman.Tiles_hue[var19]; // L: 717
							var13 -= MilliClock.Tiles_saturation[var19]; // L: 718
							var14 -= ApproximateRouteStrategy.Tiles_lightness[var19]; // L: 719
							var15 -= class182.Tiles_hueMultiplier[var19]; // L: 720
							var16 -= class324.field3538[var19]; // L: 721
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 723 724 725 726
							if (var2 < Tiles.Tiles_minPlane) { // L: 729
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 735
							int var22 = (int)var20; // L: 737
							int var23 = GrandExchangeOfferAgeComparator.field4442[var2][var11][var17] & var22; // L: 738
							int var24 = TriBool.field4773[var2][var11][var17] & var22; // L: 739
							if (var23 > 0 || var24 > 0) { // L: 740
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 741
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 742
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 743
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 744
								int var29 = Tiles.field1049[var11][var17]; // L: 745
								int var30 = Tiles.field1049[var11 + 1][var17]; // L: 746
								int var31 = Tiles.field1049[var11 + 1][var17 + 1]; // L: 747
								int var32 = Tiles.field1049[var11][var17 + 1]; // L: 748
								int var33 = -1; // L: 749
								int var34 = -1; // L: 750
								int var35;
								int var36;
								int var37;
								if (var23 > 0) { // L: 751
									var35 = var12 * 256 / var15; // L: 752
									var36 = var13 / var16; // L: 753
									var37 = var14 / var16; // L: 754
									var33 = class31.method425(var35, var36, var37); // L: 755
									var35 = var35 + Tiles.rndHue & 255; // L: 756
									var37 += Tiles.rndLightness; // L: 757
									if (var37 < 0) { // L: 758
										var37 = 0;
									} else if (var37 > 255) { // L: 759
										var37 = 255;
									}

									var34 = class31.method425(var35, var36, var37); // L: 760
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) { // L: 762
									boolean var64 = true; // L: 763
									if (var23 == 0 && class173.field1845[var2][var11][var17] != 0) { // L: 764
										var64 = false;
									}

									if (var24 > 0) { // L: 765
										var37 = var24 - 1; // L: 767
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37); // L: 769
										FloorOverlayDefinition var48;
										if (var38 != null) { // L: 770
											var48 = var38; // L: 771
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37); // L: 774
											var38 = new FloorOverlayDefinition(); // L: 775
											if (var39 != null) { // L: 776
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode(); // L: 777
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37); // L: 778
											var48 = var38; // L: 779
										}

										if (!var48.hideUnderlay) { // L: 781
											var64 = false;
										}
									}

									if (var64 && var26 == var25 && var25 == var27 && var25 == var28) { // L: 783 784
										var10000 = Tiles.field1050[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 787
								if (var34 != -1) { // L: 788
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[Canvas.method295(var34, 96)];
								}

								if (var24 == 0) { // L: 789
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, Canvas.method295(var33, var29), Canvas.method295(var33, var30), Canvas.method295(var33, var31), Canvas.method295(var33, var32), 0, 0, 0, 0, var35, 0); // L: 790
								} else {
									var36 = class173.field1845[var2][var11][var17] + 1; // L: 793
									byte var65 = class350.field3876[var2][var11][var17]; // L: 794
									int var49 = var24 - 1; // L: 796
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var49); // L: 798
									if (var40 != null) { // L: 799
										var38 = var40; // L: 800
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var49); // L: 803
										var40 = new FloorOverlayDefinition(); // L: 804
										if (var41 != null) { // L: 805
											var40.decode(new Buffer(var41), var49);
										}

										var40.postDecode(); // L: 806
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var49); // L: 807
										var38 = var40; // L: 808
									}

									int var50 = var38.texture; // L: 811
									int var42;
									int var43;
									int var44;
									int var45;
									if (var50 >= 0) { // L: 814
										var43 = Rasterizer3D.field2820.Rasterizer3D_textureLoader.getAverageTextureRGB(var50); // L: 815
										var42 = -1; // L: 816
									} else if (var38.primaryRgb == 16711935) { // L: 819
										var42 = -2; // L: 820
										var50 = -1; // L: 821
										var43 = -2; // L: 822
									} else {
										var42 = class31.method425(var38.hue, var38.saturation, var38.lightness); // L: 825
										var44 = var38.hue + Tiles.rndHue & 255; // L: 826
										var45 = var38.lightness + Tiles.rndLightness; // L: 827
										if (var45 < 0) { // L: 828
											var45 = 0;
										} else if (var45 > 255) { // L: 829
											var45 = 255;
										}

										var43 = class31.method425(var44, var38.saturation, var45); // L: 830
									}

									var44 = 0; // L: 833
									if (var43 != -2) { // L: 834
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class485.method8808(var43, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 835
										var45 = var38.secondaryHue + Tiles.rndHue & 255; // L: 836
										int var46 = var38.secondaryLightness + Tiles.rndLightness; // L: 837
										if (var46 < 0) { // L: 838
											var46 = 0;
										} else if (var46 > 255) { // L: 839
											var46 = 255;
										}

										var43 = class31.method425(var45, var38.secondarySaturation, var46); // L: 840
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class485.method8808(var43, 96)]; // L: 841
									}

									var0.addTile(var2, var11, var17, var36, var65, var50, var25, var26, var27, var28, Canvas.method295(var33, var29), Canvas.method295(var33, var30), Canvas.method295(var33, var31), Canvas.method295(var33, var32), class485.method8808(var42, var29), class485.method8808(var42, var30), class485.method8808(var42, var31), class485.method8808(var42, var32), var35, var44); // L: 843
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 850
				for (var12 = 1; var12 < 103; ++var12) { // L: 851
					var0.setTileMinPlane(var2, var12, var11, RouteStrategy.method4510(var2, var12, var11)); // L: 852
				}
			}

			GrandExchangeOfferAgeComparator.field4442[var2] = null; // L: 855
			TriBool.field4773[var2] = null; // L: 856
			class173.field1845[var2] = null; // L: 857
			class350.field3876[var2] = null; // L: 858
			class151.field1708[var2] = null; // L: 859
		}

		var0.method5451(-50, -10, -50); // L: 861

		for (var2 = 0; var2 < 104; ++var2) { // L: 862
			for (var3 = 0; var3 < 104; ++var3) { // L: 863
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 864
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 867
		var3 = 2; // L: 868
		var4 = 4; // L: 869

		for (var5 = 0; var5 < 4; ++var5) { // L: 870
			if (var5 > 0) { // L: 871
				var2 <<= 3; // L: 872
				var3 <<= 3; // L: 873
				var4 <<= 3; // L: 874
			}

			for (int var60 = 0; var60 <= var5; ++var60) { // L: 876
				for (int var61 = 0; var61 <= 104; ++var61) { // L: 877
					for (int var62 = 0; var62 <= 104; ++var62) { // L: 878
						short var63;
						if ((Tiles.field1050[var60][var62][var61] & var2) != 0) { // L: 879
							var9 = var61; // L: 880
							var10 = var61; // L: 881
							var11 = var60; // L: 882

							for (var12 = var60; var9 > 0 && (Tiles.field1050[var60][var62][var9 - 1] & var2) != 0; --var9) { // L: 883 884
							}

							while (var10 < 104 && (Tiles.field1050[var60][var62][var10 + 1] & var2) != 0) { // L: 885
								++var10;
							}

							label443:
							while (var11 > 0) { // L: 886
								for (var13 = var9; var13 <= var10; ++var13) { // L: 887
									if ((Tiles.field1050[var11 - 1][var62][var13] & var2) == 0) {
										break label443;
									}
								}

								--var11; // L: 888
							}

							label432:
							while (var12 < var5) { // L: 890
								for (var13 = var9; var13 <= var10; ++var13) { // L: 891
									if ((Tiles.field1050[var12 + 1][var62][var13] & var2) == 0) {
										break label432;
									}
								}

								++var12; // L: 892
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 894
							if (var13 >= 8) { // L: 895
								var63 = 240; // L: 896
								var15 = Tiles.Tiles_heights[var12][var62][var9] - var63; // L: 897
								var16 = Tiles.Tiles_heights[var11][var62][var9]; // L: 898
								Scene.Scene_addOccluder(var5, 1, var62 * 128, var62 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 899

								for (var17 = var11; var17 <= var12; ++var17) { // L: 900
									for (var18 = var9; var18 <= var10; ++var18) { // L: 901
										var10000 = Tiles.field1050[var17][var62];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1050[var60][var62][var61] & var3) != 0) { // L: 905
							var9 = var62; // L: 906
							var10 = var62; // L: 907
							var11 = var60; // L: 908

							for (var12 = var60; var9 > 0 && (Tiles.field1050[var60][var9 - 1][var61] & var3) != 0; --var9) { // L: 909 910
							}

							while (var10 < 104 && (Tiles.field1050[var60][var10 + 1][var61] & var3) != 0) { // L: 911
								++var10;
							}

							label496:
							while (var11 > 0) { // L: 912
								for (var13 = var9; var13 <= var10; ++var13) { // L: 913
									if ((Tiles.field1050[var11 - 1][var13][var61] & var3) == 0) {
										break label496;
									}
								}

								--var11; // L: 914
							}

							label485:
							while (var12 < var5) { // L: 916
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1050[var12 + 1][var13][var61] & var3) == 0) {
										break label485;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var63 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var61] - var63; // L: 923
								var16 = Tiles.Tiles_heights[var11][var9][var61]; // L: 924
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var61 * 128, var61 * 128, var15, var16); // L: 925

								for (var17 = var11; var17 <= var12; ++var17) { // L: 926
									for (var18 = var9; var18 <= var10; ++var18) { // L: 927
										var10000 = Tiles.field1050[var17][var18];
										var10000[var61] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1050[var60][var62][var61] & var4) != 0) { // L: 931
							var9 = var62; // L: 932
							var10 = var62; // L: 933
							var11 = var61; // L: 934

							for (var12 = var61; var11 > 0 && (Tiles.field1050[var60][var62][var11 - 1] & var4) != 0; --var11) { // L: 935 936
							}

							while (var12 < 104 && (Tiles.field1050[var60][var62][var12 + 1] & var4) != 0) { // L: 937
								++var12;
							}

							label549:
							while (var9 > 0) { // L: 938
								for (var13 = var11; var13 <= var12; ++var13) { // L: 939
									if ((Tiles.field1050[var60][var9 - 1][var13] & var4) == 0) {
										break label549;
									}
								}

								--var9; // L: 940
							}

							label538:
							while (var10 < 104) { // L: 942
								for (var13 = var11; var13 <= var12; ++var13) { // L: 943
									if ((Tiles.field1050[var60][var10 + 1][var13] & var4) == 0) {
										break label538;
									}
								}

								++var10; // L: 944
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 946
								var13 = Tiles.Tiles_heights[var60][var9][var11]; // L: 947
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 948

								for (var14 = var9; var14 <= var10; ++var14) { // L: 949
									for (var15 = var11; var15 <= var12; ++var15) { // L: 950
										var10000 = Tiles.field1050[var60][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 958

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-846967718"
	)
	static final void method1064(String var0) {
		SecureRandomCallable.method2319("Please remove " + var0 + " from your friend list first"); // L: 169
	} // L: 170

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	static void method1054() {
		class25.field119 = System.getenv("JX_ACCESS_TOKEN"); // L: 917
		class521.field5131 = System.getenv("JX_REFRESH_TOKEN"); // L: 918
		class357.field3901 = System.getenv("JX_SESSION_ID"); // L: 919
		Renderable.field2922 = System.getenv("JX_CHARACTER_ID"); // L: 920
		WorldMapDecorationType.method6986(System.getenv("JX_DISPLAY_NAME")); // L: 921
	} // L: 922
}
