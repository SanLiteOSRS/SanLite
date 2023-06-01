import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1618841573
	)
	static int field101;
	@ObfuscatedName("ay")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "172449687"
	)
	public static final synchronized long method310() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class135.field1574) { // L: 15
			class370.field4352 += class135.field1574 - var0; // L: 16
		}

		class135.field1574 = var0; // L: 18
		return class370.field4352 + var0; // L: 19
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1766927881"
	)
	public static int method311(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lih;[Lir;I)V",
		garbageValue = "1042131122"
	)
	static final void method307(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 597
			for (var3 = 0; var3 < 104; ++var3) { // L: 598
				for (var4 = 0; var4 < 104; ++var4) { // L: 599
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 600
						var5 = var2; // L: 601
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 602
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 603
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 608
		if (Tiles.rndHue < -8) { // L: 609
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 610
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 611
		if (Tiles.rndLightness < -16) { // L: 612
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 613
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 614
			byte[][] var45 = Tiles.field995[var2]; // L: 615
			boolean var53 = true; // L: 616
			boolean var54 = true; // L: 617
			boolean var6 = true; // L: 618
			boolean var7 = true; // L: 619
			boolean var8 = true; // L: 620
			var9 = (int)Math.sqrt(5100.0D); // L: 621
			var10 = var9 * 768 >> 8; // L: 622

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 623
				for (var12 = 1; var12 < 103; ++var12) { // L: 624
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 625
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 626
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 627
					var16 = (var13 << 8) / var15; // L: 628
					var17 = 65536 / var15; // L: 629
					var18 = (var14 << 8) / var15; // L: 630
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 631
					int var52 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1); // L: 632
					Tiles.field996[var12][var11] = var19 - var52; // L: 633
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 636
				class85.Tiles_hue[var11] = 0; // L: 637
				Tiles.Tiles_saturation[var11] = 0; // L: 638
				class209.Tiles_lightness[var11] = 0; // L: 639
				MusicPatch.Tiles_hueMultiplier[var11] = 0; // L: 640
				Tiles.field1004[var11] = 0; // L: 641
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 643
				for (var12 = 0; var12 < 104; ++var12) { // L: 644
					var13 = var11 + 5; // L: 645
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 646
						long var46 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 652
						var16 = (int)var46; // L: 654
						var17 = Tiles.field998[var2][var13][var12] & var16; // L: 655
						if (var17 > 0) { // L: 656
							FloorUnderlayDefinition var48 = class12.method162(var17 - 1); // L: 657
							var10000 = class85.Tiles_hue; // L: 658
							var10000[var12] += var48.hue;
							var10000 = Tiles.Tiles_saturation; // L: 659
							var10000[var12] += var48.saturation;
							var10000 = class209.Tiles_lightness; // L: 660
							var10000[var12] += var48.lightness;
							var10000 = MusicPatch.Tiles_hueMultiplier; // L: 661
							var10000[var12] += var48.hueMultiplier;
							var10002 = Tiles.field1004[var12]++; // L: 662
						}
					}

					var14 = var11 - 5; // L: 665
					if (var14 >= 0 && var14 < 104) { // L: 666
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 672
						var17 = (int)var49; // L: 674
						var18 = Tiles.field998[var2][var14][var12] & var17; // L: 675
						if (var18 > 0) { // L: 676
							FloorUnderlayDefinition var51 = class12.method162(var18 - 1); // L: 677
							var10000 = class85.Tiles_hue; // L: 678
							var10000[var12] -= var51.hue;
							var10000 = Tiles.Tiles_saturation; // L: 679
							var10000[var12] -= var51.saturation;
							var10000 = class209.Tiles_lightness; // L: 680
							var10000[var12] -= var51.lightness;
							var10000 = MusicPatch.Tiles_hueMultiplier; // L: 681
							var10000[var12] -= var51.hueMultiplier;
							var10002 = Tiles.field1004[var12]--; // L: 682
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 686
					var12 = 0; // L: 687
					var13 = 0; // L: 688
					var14 = 0; // L: 689
					var15 = 0; // L: 690
					var16 = 0; // L: 691

					for (var17 = -5; var17 < 109; ++var17) { // L: 692
						var18 = var17 + 5; // L: 693
						if (var18 >= 0 && var18 < 104) { // L: 694
							var12 += class85.Tiles_hue[var18]; // L: 695
							var13 += Tiles.Tiles_saturation[var18]; // L: 696
							var14 += class209.Tiles_lightness[var18]; // L: 697
							var15 += MusicPatch.Tiles_hueMultiplier[var18]; // L: 698
							var16 += Tiles.field1004[var18]; // L: 699
						}

						var19 = var17 - 5; // L: 701
						if (var19 >= 0 && var19 < 104) { // L: 702
							var12 -= class85.Tiles_hue[var19]; // L: 703
							var13 -= Tiles.Tiles_saturation[var19]; // L: 704
							var14 -= class209.Tiles_lightness[var19]; // L: 705
							var15 -= MusicPatch.Tiles_hueMultiplier[var19]; // L: 706
							var16 -= Tiles.field1004[var19]; // L: 707
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 709 710 711 712
							if (var2 < Tiles.Tiles_minPlane) { // L: 715
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 721
							int var22 = (int)var20; // L: 723
							int var23 = Tiles.field998[var2][var11][var17] & var22; // L: 724
							int var24 = Tiles.field993[var2][var11][var17] & var22; // L: 725
							if (var23 > 0 || var24 > 0) { // L: 726
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 727
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 728
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 729
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 730
								int var29 = Tiles.field996[var11][var17]; // L: 731
								int var30 = Tiles.field996[var11 + 1][var17]; // L: 732
								int var31 = Tiles.field996[var11 + 1][var17 + 1]; // L: 733
								int var32 = Tiles.field996[var11][var17 + 1]; // L: 734
								int var33 = -1; // L: 735
								int var34 = -1; // L: 736
								int var35;
								int var36;
								if (var23 > 0) { // L: 737
									var35 = var12 * 256 / var15; // L: 738
									var36 = var13 / var16; // L: 739
									int var37 = var14 / var16; // L: 740
									var33 = class496.method8900(var35, var36, var37); // L: 741
									var35 = var35 + Tiles.rndHue & 255; // L: 742
									var37 += Tiles.rndLightness; // L: 743
									if (var37 < 0) { // L: 744
										var37 = 0;
									} else if (var37 > 255) { // L: 745
										var37 = 255;
									}

									var34 = class496.method8900(var35, var36, var37); // L: 746
								}

								if (var2 > 0) { // L: 748
									boolean var59 = true; // L: 749
									if (var23 == 0 && Tiles.field994[var2][var11][var17] != 0) { // L: 750
										var59 = false;
									}

									if (var24 > 0 && !StructComposition.method3821(var24 - 1).hideUnderlay) { // L: 751
										var59 = false;
									}

									if (var59 && var26 == var25 && var27 == var25 && var25 == var28) { // L: 752 753
										var10000 = Tiles.field999[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 756
								if (var34 != -1) { // L: 757
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[FontName.method8641(var34, 96)];
								}

								if (var24 == 0) { // L: 758
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, FontName.method8641(var33, var29), FontName.method8641(var33, var30), FontName.method8641(var33, var31), FontName.method8641(var33, var32), 0, 0, 0, 0, var35, 0); // L: 759
								} else {
									var36 = Tiles.field994[var2][var11][var17] + 1; // L: 762
									byte var60 = WorldMapRectangle.field3005[var2][var11][var17]; // L: 763
									FloorOverlayDefinition var38 = StructComposition.method3821(var24 - 1); // L: 764
									int var39 = var38.texture; // L: 765
									int var40;
									int var41;
									int var42;
									int var43;
									if (var39 >= 0) { // L: 768
										var41 = Rasterizer3D.field2512.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 769
										var40 = -1; // L: 770
									} else if (var38.primaryRgb == 16711935) { // L: 773
										var40 = -2; // L: 774
										var39 = -1; // L: 775
										var41 = -2; // L: 776
									} else {
										var40 = class496.method8900(var38.hue, var38.saturation, var38.lightness); // L: 779
										var42 = var38.hue + Tiles.rndHue & 255; // L: 780
										var43 = var38.lightness + Tiles.rndLightness; // L: 781
										if (var43 < 0) { // L: 782
											var43 = 0;
										} else if (var43 > 255) { // L: 783
											var43 = 255;
										}

										var41 = class496.method8900(var42, var38.saturation, var43); // L: 784
									}

									var42 = 0; // L: 787
									if (var41 != -2) { // L: 788
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class217.method4208(var41, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 789
										var43 = var38.secondaryHue + Tiles.rndHue & 255; // L: 790
										int var44 = var38.secondaryLightness + Tiles.rndLightness; // L: 791
										if (var44 < 0) { // L: 792
											var44 = 0;
										} else if (var44 > 255) { // L: 793
											var44 = 255;
										}

										var41 = class496.method8900(var43, var38.secondarySaturation, var44); // L: 794
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class217.method4208(var41, 96)]; // L: 795
									}

									var0.addTile(var2, var11, var17, var36, var60, var39, var25, var26, var27, var28, FontName.method8641(var33, var29), FontName.method8641(var33, var30), FontName.method8641(var33, var31), FontName.method8641(var33, var32), class217.method4208(var40, var29), class217.method4208(var40, var30), class217.method4208(var40, var31), class217.method4208(var40, var32), var35, var42); // L: 797
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 804
				for (var12 = 1; var12 < 103; ++var12) { // L: 805
					var0.setTileMinPlane(var2, var12, var11, DefaultsGroup.method8055(var2, var12, var11)); // L: 806
				}
			}

			Tiles.field998[var2] = null; // L: 809
			Tiles.field993[var2] = null; // L: 810
			Tiles.field994[var2] = null; // L: 811
			WorldMapRectangle.field3005[var2] = null; // L: 812
			Tiles.field995[var2] = null; // L: 813
		}

		var0.method4512(-50, -10, -50); // L: 815

		for (var2 = 0; var2 < 104; ++var2) { // L: 816
			for (var3 = 0; var3 < 104; ++var3) { // L: 817
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 818
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 821
		var3 = 2; // L: 822
		var4 = 4; // L: 823

		for (var5 = 0; var5 < 4; ++var5) { // L: 824
			if (var5 > 0) { // L: 825
				var2 <<= 3; // L: 826
				var3 <<= 3; // L: 827
				var4 <<= 3; // L: 828
			}

			for (int var55 = 0; var55 <= var5; ++var55) { // L: 830
				for (int var56 = 0; var56 <= 104; ++var56) { // L: 831
					for (int var57 = 0; var57 <= 104; ++var57) { // L: 832
						short var58;
						if ((Tiles.field999[var55][var57][var56] & var2) != 0) { // L: 833
							var9 = var56; // L: 834
							var10 = var56; // L: 835
							var11 = var55; // L: 836

							for (var12 = var55; var9 > 0 && (Tiles.field999[var55][var57][var9 - 1] & var2) != 0; --var9) { // L: 837 838
							}

							while (var10 < 104 && (Tiles.field999[var55][var57][var10 + 1] & var2) != 0) { // L: 839
								++var10;
							}

							label427:
							while (var11 > 0) { // L: 840
								for (var13 = var9; var13 <= var10; ++var13) { // L: 841
									if ((Tiles.field999[var11 - 1][var57][var13] & var2) == 0) {
										break label427;
									}
								}

								--var11; // L: 842
							}

							label416:
							while (var12 < var5) { // L: 844
								for (var13 = var9; var13 <= var10; ++var13) { // L: 845
									if ((Tiles.field999[var12 + 1][var57][var13] & var2) == 0) {
										break label416;
									}
								}

								++var12; // L: 846
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 848
							if (var13 >= 8) { // L: 849
								var58 = 240; // L: 850
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58; // L: 851
								var16 = Tiles.Tiles_heights[var11][var57][var9]; // L: 852
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 853

								for (var17 = var11; var17 <= var12; ++var17) { // L: 854
									for (var18 = var9; var18 <= var10; ++var18) { // L: 855
										var10000 = Tiles.field999[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field999[var55][var57][var56] & var3) != 0) { // L: 859
							var9 = var57; // L: 860
							var10 = var57; // L: 861
							var11 = var55; // L: 862

							for (var12 = var55; var9 > 0 && (Tiles.field999[var55][var9 - 1][var56] & var3) != 0; --var9) { // L: 863 864
							}

							while (var10 < 104 && (Tiles.field999[var55][var10 + 1][var56] & var3) != 0) { // L: 865
								++var10;
							}

							label480:
							while (var11 > 0) { // L: 866
								for (var13 = var9; var13 <= var10; ++var13) { // L: 867
									if ((Tiles.field999[var11 - 1][var13][var56] & var3) == 0) {
										break label480;
									}
								}

								--var11; // L: 868
							}

							label469:
							while (var12 < var5) { // L: 870
								for (var13 = var9; var13 <= var10; ++var13) { // L: 871
									if ((Tiles.field999[var12 + 1][var13][var56] & var3) == 0) {
										break label469;
									}
								}

								++var12; // L: 872
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 874
							if (var13 >= 8) { // L: 875
								var58 = 240; // L: 876
								var15 = Tiles.Tiles_heights[var12][var9][var56] - var58; // L: 877
								var16 = Tiles.Tiles_heights[var11][var9][var56]; // L: 878
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var56 * 128, var56 * 128, var15, var16); // L: 879

								for (var17 = var11; var17 <= var12; ++var17) { // L: 880
									for (var18 = var9; var18 <= var10; ++var18) { // L: 881
										var10000 = Tiles.field999[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field999[var55][var57][var56] & var4) != 0) { // L: 885
							var9 = var57; // L: 886
							var10 = var57; // L: 887
							var11 = var56; // L: 888

							for (var12 = var56; var11 > 0 && (Tiles.field999[var55][var57][var11 - 1] & var4) != 0; --var11) { // L: 889 890
							}

							while (var12 < 104 && (Tiles.field999[var55][var57][var12 + 1] & var4) != 0) { // L: 891
								++var12;
							}

							label533:
							while (var9 > 0) { // L: 892
								for (var13 = var11; var13 <= var12; ++var13) { // L: 893
									if ((Tiles.field999[var55][var9 - 1][var13] & var4) == 0) {
										break label533;
									}
								}

								--var9; // L: 894
							}

							label522:
							while (var10 < 104) { // L: 896
								for (var13 = var11; var13 <= var12; ++var13) { // L: 897
									if ((Tiles.field999[var55][var10 + 1][var13] & var4) == 0) {
										break label522;
									}
								}

								++var10; // L: 898
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 900
								var13 = Tiles.Tiles_heights[var55][var9][var11]; // L: 901
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 902

								for (var14 = var9; var14 <= var10; ++var14) { // L: 903
									for (var15 = var11; var15 <= var12; ++var15) { // L: 904
										var10000 = Tiles.field999[var55][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 912
}
