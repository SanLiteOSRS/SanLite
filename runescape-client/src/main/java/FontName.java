import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("i")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lla;",
		garbageValue = "-54875648"
	)
	static class323[] method8320() {
		return new class323[]{class323.field3796, class323.field3795}; // L: 35
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqy;",
		garbageValue = "-843260831"
	)
	public static FontName[] method8319() {
		return new FontName[]{FontName_plain12, FontName_verdana15, FontName_verdana11, FontName_bold12, FontName_verdana13, FontName_plain11}; // L: 16
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhn;[Lgv;I)V",
		garbageValue = "1868472447"
	)
	static final void method8315(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 623
			for (var3 = 0; var3 < 104; ++var3) { // L: 624
				for (var4 = 0; var4 < 104; ++var4) { // L: 625
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 626
						var5 = var2; // L: 627
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 628
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 629
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 634
		if (Tiles.rndHue < -8) { // L: 635
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 636
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 637
		if (Tiles.rndLightness < -16) { // L: 638
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 639
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 640
			byte[][] var45 = Tiles.field1013[var2]; // L: 641
			boolean var52 = true; // L: 642
			boolean var53 = true; // L: 643
			boolean var6 = true; // L: 644
			boolean var7 = true; // L: 645
			boolean var8 = true; // L: 646
			var9 = (int)Math.sqrt(5100.0D); // L: 647
			var10 = var9 * 768 >> 8; // L: 648

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 649
				for (var12 = 1; var12 < 103; ++var12) { // L: 650
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 651
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 652
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 653
					var16 = (var13 << 8) / var15; // L: 654
					var17 = 65536 / var15; // L: 655
					var18 = (var14 << 8) / var15; // L: 656
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 657
					var20 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1); // L: 658
					class323.field3794[var12][var11] = var19 - var20; // L: 659
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 662
				class100.Tiles_hue[var11] = 0; // L: 663
				class161.Tiles_saturation[var11] = 0; // L: 664
				Tiles.Tiles_lightness[var11] = 0; // L: 665
				class463.Tiles_hueMultiplier[var11] = 0; // L: 666
				SceneTilePaint.field2764[var11] = 0; // L: 667
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 669
				for (var12 = 0; var12 < 104; ++var12) { // L: 670
					var13 = var11 + 5; // L: 671
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 672
						var14 = Client.field505 < 209 ? (int)StructComposition.method3871(8) : (int)StructComposition.method3871(15); // L: 673
						var15 = Tiles.field1010[var2][var13][var12] & var14; // L: 674
						if (var15 > 0) { // L: 675
							FloorUnderlayDefinition var50 = DefaultsGroup.method7840(var15 - 1); // L: 676
							var10000 = class100.Tiles_hue; // L: 677
							var10000[var12] += var50.hue;
							var10000 = class161.Tiles_saturation; // L: 678
							var10000[var12] += var50.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 679
							var10000[var12] += var50.lightness;
							var10000 = class463.Tiles_hueMultiplier; // L: 680
							var10000[var12] += var50.hueMultiplier;
							var10002 = SceneTilePaint.field2764[var12]++; // L: 681
						}
					}

					var14 = var11 - 5; // L: 684
					if (var14 >= 0 && var14 < 104) { // L: 685
						var15 = Client.field505 < 209 ? (int)StructComposition.method3871(8) : (int)StructComposition.method3871(15); // L: 686
						var16 = Tiles.field1010[var2][var14][var12] & var15; // L: 687
						if (var16 > 0) { // L: 688
							FloorUnderlayDefinition var51 = DefaultsGroup.method7840(var16 - 1); // L: 689
							var10000 = class100.Tiles_hue; // L: 690
							var10000[var12] -= var51.hue;
							var10000 = class161.Tiles_saturation; // L: 691
							var10000[var12] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 692
							var10000[var12] -= var51.lightness;
							var10000 = class463.Tiles_hueMultiplier; // L: 693
							var10000[var12] -= var51.hueMultiplier;
							var10002 = SceneTilePaint.field2764[var12]--; // L: 694
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 698
					var12 = 0; // L: 699
					var13 = 0; // L: 700
					var14 = 0; // L: 701
					var15 = 0; // L: 702
					var16 = 0; // L: 703

					for (var17 = -5; var17 < 109; ++var17) { // L: 704
						var18 = var17 + 5; // L: 705
						if (var18 >= 0 && var18 < 104) { // L: 706
							var12 += class100.Tiles_hue[var18]; // L: 707
							var13 += class161.Tiles_saturation[var18]; // L: 708
							var14 += Tiles.Tiles_lightness[var18]; // L: 709
							var15 += class463.Tiles_hueMultiplier[var18]; // L: 710
							var16 += SceneTilePaint.field2764[var18]; // L: 711
						}

						var19 = var17 - 5; // L: 713
						if (var19 >= 0 && var19 < 104) { // L: 714
							var12 -= class100.Tiles_hue[var19]; // L: 715
							var13 -= class161.Tiles_saturation[var19]; // L: 716
							var14 -= Tiles.Tiles_lightness[var19]; // L: 717
							var15 -= class463.Tiles_hueMultiplier[var19]; // L: 718
							var16 -= SceneTilePaint.field2764[var19]; // L: 719
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 721 722 723 724
							if (var2 < Tiles.Tiles_minPlane) { // L: 727
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Client.field505 < 209 ? (int)StructComposition.method3871(8) : (int)StructComposition.method3871(15); // L: 728
							int var21 = Tiles.field1010[var2][var11][var17] & var20; // L: 729
							int var22 = class172.field1865[var2][var11][var17] & var20; // L: 730
							if (var21 > 0 || var22 > 0) { // L: 731
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 732
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 733
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 734
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 735
								int var27 = class323.field3794[var11][var17]; // L: 736
								int var28 = class323.field3794[var11 + 1][var17]; // L: 737
								int var29 = class323.field3794[var11 + 1][var17 + 1]; // L: 738
								int var30 = class323.field3794[var11][var17 + 1]; // L: 739
								int var31 = -1; // L: 740
								int var32 = -1; // L: 741
								int var33;
								int var34;
								int var35;
								if (var21 > 0) { // L: 742
									var33 = var12 * 256 / var15; // L: 743
									var34 = var13 / var16; // L: 744
									var35 = var14 / var16; // L: 745
									var31 = class139.hslToRgb(var33, var34, var35); // L: 746
									var33 = var33 + Tiles.rndHue & 255; // L: 747
									var35 += Tiles.rndLightness; // L: 748
									if (var35 < 0) { // L: 749
										var35 = 0;
									} else if (var35 > 255) { // L: 750
										var35 = 255;
									}

									var32 = class139.hslToRgb(var33, var34, var35); // L: 751
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) { // L: 753
									boolean var58 = true; // L: 754
									if (var21 == 0 && Tiles.field1011[var2][var11][var17] != 0) { // L: 755
										var58 = false;
									}

									if (var22 > 0) { // L: 756
										var35 = var22 - 1; // L: 758
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35); // L: 760
										FloorOverlayDefinition var47;
										if (var36 != null) { // L: 761
											var47 = var36; // L: 762
										} else {
											byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35); // L: 765
											var36 = new FloorOverlayDefinition(); // L: 766
											if (var37 != null) { // L: 767
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode(); // L: 768
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35); // L: 769
											var47 = var36; // L: 770
										}

										if (!var47.hideUnderlay) { // L: 772
											var58 = false;
										}
									}

									if (var58 && var23 == var24 && var25 == var23 && var23 == var26) { // L: 774 775
										var10000 = class312.field3717[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 778
								if (var32 != -1) { // L: 779
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[Players.method2742(var32, 96)];
								}

								if (var22 == 0) { // L: 780
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, Players.method2742(var31, var27), Players.method2742(var31, var28), Players.method2742(var31, var29), Players.method2742(var31, var30), 0, 0, 0, 0, var33, 0); // L: 781
								} else {
									var34 = Tiles.field1011[var2][var11][var17] + 1; // L: 784
									byte var59 = Tiles.field1012[var2][var11][var17]; // L: 785
									int var48 = var22 - 1; // L: 787
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var48); // L: 789
									if (var38 != null) { // L: 790
										var36 = var38; // L: 791
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var48); // L: 794
										var38 = new FloorOverlayDefinition(); // L: 795
										if (var39 != null) { // L: 796
											var38.decode(new Buffer(var39), var48);
										}

										var38.postDecode(); // L: 797
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var48); // L: 798
										var36 = var38; // L: 799
									}

									int var49 = var36.texture; // L: 802
									int var40;
									int var41;
									int var42;
									int var43;
									if (var49 >= 0) { // L: 805
										var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var49); // L: 806
										var40 = -1; // L: 807
									} else if (var36.primaryRgb == 16711935) { // L: 810
										var40 = -2; // L: 811
										var49 = -1; // L: 812
										var41 = -2; // L: 813
									} else {
										var40 = class139.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 816
										var42 = var36.hue + Tiles.rndHue & 255; // L: 817
										var43 = var36.lightness + Tiles.rndLightness; // L: 818
										if (var43 < 0) { // L: 819
											var43 = 0;
										} else if (var43 > 255) { // L: 820
											var43 = 255;
										}

										var41 = class139.hslToRgb(var42, var36.saturation, var43); // L: 821
									}

									var42 = 0; // L: 824
									if (var41 != -2) { // L: 825
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3806(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 826
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 827
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 828
										if (var44 < 0) { // L: 829
											var44 = 0;
										} else if (var44 > 255) { // L: 830
											var44 = 255;
										}

										var41 = class139.hslToRgb(var43, var36.secondarySaturation, var44); // L: 831
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3806(var41, 96)]; // L: 832
									}

									var0.addTile(var2, var11, var17, var34, var59, var49, var23, var24, var25, var26, Players.method2742(var31, var27), Players.method2742(var31, var28), Players.method2742(var31, var29), Players.method2742(var31, var30), FloorUnderlayDefinition.method3806(var40, var27), FloorUnderlayDefinition.method3806(var40, var28), FloorUnderlayDefinition.method3806(var40, var29), FloorUnderlayDefinition.method3806(var40, var30), var33, var42); // L: 834
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 841
				for (var12 = 1; var12 < 103; ++var12) { // L: 842
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 849
						var17 = 0; // L: 850
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 853
						var17 = var2 - 1; // L: 854
					} else {
						var17 = var2; // L: 857
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 859
				}
			}

			Tiles.field1010[var2] = null; // L: 862
			class172.field1865[var2] = null; // L: 863
			Tiles.field1011[var2] = null; // L: 864
			Tiles.field1012[var2] = null; // L: 865
			Tiles.field1013[var2] = null; // L: 866
		}

		var0.method4487(-50, -10, -50); // L: 868

		for (var2 = 0; var2 < 104; ++var2) { // L: 869
			for (var3 = 0; var3 < 104; ++var3) { // L: 870
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 871
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 874
		var3 = 2; // L: 875
		var4 = 4; // L: 876

		for (var5 = 0; var5 < 4; ++var5) { // L: 877
			if (var5 > 0) { // L: 878
				var2 <<= 3; // L: 879
				var3 <<= 3; // L: 880
				var4 <<= 3; // L: 881
			}

			for (int var54 = 0; var54 <= var5; ++var54) { // L: 883
				for (int var55 = 0; var55 <= 104; ++var55) { // L: 884
					for (int var56 = 0; var56 <= 104; ++var56) { // L: 885
						short var57;
						if ((class312.field3717[var54][var56][var55] & var2) != 0) { // L: 886
							var9 = var55; // L: 887
							var10 = var55; // L: 888
							var11 = var54; // L: 889

							for (var12 = var54; var9 > 0 && (class312.field3717[var54][var56][var9 - 1] & var2) != 0; --var9) { // L: 890 891
							}

							while (var10 < 104 && (class312.field3717[var54][var56][var10 + 1] & var2) != 0) { // L: 892
								++var10;
							}

							label472:
							while (var11 > 0) { // L: 893
								for (var13 = var9; var13 <= var10; ++var13) { // L: 894
									if ((class312.field3717[var11 - 1][var56][var13] & var2) == 0) {
										break label472;
									}
								}

								--var11; // L: 895
							}

							label461:
							while (var12 < var5) { // L: 897
								for (var13 = var9; var13 <= var10; ++var13) { // L: 898
									if ((class312.field3717[var12 + 1][var56][var13] & var2) == 0) {
										break label461;
									}
								}

								++var12; // L: 899
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 901
							if (var13 >= 8) { // L: 902
								var57 = 240; // L: 903
								var15 = Tiles.Tiles_heights[var12][var56][var9] - var57; // L: 904
								var16 = Tiles.Tiles_heights[var11][var56][var9]; // L: 905
								Scene.Scene_addOccluder(var5, 1, var56 * 128, var56 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 906

								for (var17 = var11; var17 <= var12; ++var17) { // L: 907
									for (var18 = var9; var18 <= var10; ++var18) { // L: 908
										var10000 = class312.field3717[var17][var56];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class312.field3717[var54][var56][var55] & var3) != 0) { // L: 912
							var9 = var56; // L: 913
							var10 = var56; // L: 914
							var11 = var54; // L: 915

							for (var12 = var54; var9 > 0 && (class312.field3717[var54][var9 - 1][var55] & var3) != 0; --var9) { // L: 916 917
							}

							while (var10 < 104 && (class312.field3717[var54][var10 + 1][var55] & var3) != 0) { // L: 918
								++var10;
							}

							label525:
							while (var11 > 0) { // L: 919
								for (var13 = var9; var13 <= var10; ++var13) { // L: 920
									if ((class312.field3717[var11 - 1][var13][var55] & var3) == 0) {
										break label525;
									}
								}

								--var11; // L: 921
							}

							label514:
							while (var12 < var5) { // L: 923
								for (var13 = var9; var13 <= var10; ++var13) { // L: 924
									if ((class312.field3717[var12 + 1][var13][var55] & var3) == 0) {
										break label514;
									}
								}

								++var12; // L: 925
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 927
							if (var13 >= 8) { // L: 928
								var57 = 240; // L: 929
								var15 = Tiles.Tiles_heights[var12][var9][var55] - var57; // L: 930
								var16 = Tiles.Tiles_heights[var11][var9][var55]; // L: 931
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var55 * 128, var55 * 128, var15, var16); // L: 932

								for (var17 = var11; var17 <= var12; ++var17) { // L: 933
									for (var18 = var9; var18 <= var10; ++var18) { // L: 934
										var10000 = class312.field3717[var17][var18];
										var10000[var55] &= ~var3;
									}
								}
							}
						}

						if ((class312.field3717[var54][var56][var55] & var4) != 0) { // L: 938
							var9 = var56; // L: 939
							var10 = var56; // L: 940
							var11 = var55; // L: 941

							for (var12 = var55; var11 > 0 && (class312.field3717[var54][var56][var11 - 1] & var4) != 0; --var11) { // L: 942 943
							}

							while (var12 < 104 && (class312.field3717[var54][var56][var12 + 1] & var4) != 0) { // L: 944
								++var12;
							}

							label578:
							while (var9 > 0) { // L: 945
								for (var13 = var11; var13 <= var12; ++var13) { // L: 946
									if ((class312.field3717[var54][var9 - 1][var13] & var4) == 0) {
										break label578;
									}
								}

								--var9; // L: 947
							}

							label567:
							while (var10 < 104) { // L: 949
								for (var13 = var11; var13 <= var12; ++var13) { // L: 950
									if ((class312.field3717[var54][var10 + 1][var13] & var4) == 0) {
										break label567;
									}
								}

								++var10; // L: 951
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 953
								var13 = Tiles.Tiles_heights[var54][var9][var11]; // L: 954
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 955

								for (var14 = var9; var14 <= var10; ++var14) { // L: 956
									for (var15 = var11; var15 <= var12; ++var15) { // L: 957
										var10000 = class312.field3717[var54][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 965

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-282660899"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 13092

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 13093
			var1.clearIsFromIgnored(); // L: 13095
		}

		if (class463.friendsChatManager != null) { // L: 13099
			class463.friendsChatManager.invalidateIgnoreds(); // L: 13100
		}

	} // L: 13102
}
