import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public class class481 {
	@ObfuscatedName("wb")
	static Iterator field4836;
	@ObfuscatedName("ah")
	static int[] field4846;
	@ObfuscatedName("ar")
	public static int[] field4838;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static Bounds field4845;

	static {
		field4846 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4846[var0] = method8531(var0);
		}

		if (field4838 == null) { // L: 17
			field4838 = new int[65536]; // L: 18
			double var25 = 0.949999988079071D; // L: 19

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 20
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 21
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D; // L: 22
				double var7 = (double)(var2 & 127) / 128.0D; // L: 23
				double var9 = var7; // L: 24
				double var11 = var7; // L: 25
				double var13 = var7; // L: 26
				if (var5 != 0.0D) { // L: 27
					double var15;
					if (var7 < 0.5D) { // L: 29
						var15 = (1.0D + var5) * var7;
					} else {
						var15 = var5 + var7 - var7 * var5; // L: 30
					}

					double var17 = var7 * 2.0D - var15; // L: 31
					double var19 = var3 + 0.3333333333333333D; // L: 32
					if (var19 > 1.0D) { // L: 33
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D; // L: 35
					if (var23 < 0.0D) { // L: 36
						++var23;
					}

					if (6.0D * var19 < 1.0D) { // L: 37
						var9 = var17 + (var15 - var17) * 6.0D * var19;
					} else if (var19 * 2.0D < 1.0D) { // L: 38
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) { // L: 39
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17; // L: 40
					}

					if (var3 * 6.0D < 1.0D) { // L: 41
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) { // L: 42
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 43
						var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
					} else {
						var11 = var17; // L: 44
					}

					if (6.0D * var23 < 1.0D) { // L: 45
						var13 = var17 + 6.0D * (var15 - var17) * var23;
					} else if (2.0D * var23 < 1.0D) { // L: 46
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) { // L: 47
						var13 = var17 + 6.0D * (0.6666666666666666D - var23) * (var15 - var17);
					} else {
						var13 = var17; // L: 48
					}
				}

				var9 = Math.pow(var9, var25); // L: 50
				var11 = Math.pow(var11, var25); // L: 51
				var13 = Math.pow(var13, var25); // L: 52
				int var27 = (int)(var9 * 256.0D); // L: 53
				int var16 = (int)(var11 * 256.0D); // L: 54
				int var28 = (int)(256.0D * var13); // L: 55
				int var18 = var28 + (var16 << 8) + (var27 << 16); // L: 56
				field4838[var2] = var18 & 16777215; // L: 57
			}
		}

	} // L: 60

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	static final int method8531(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 67
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 68
		double var5 = (double)(var0 & 31) / 31.0D; // L: 69
		double var7 = var1; // L: 70
		if (var3 < var1) { // L: 71
			var7 = var3;
		}

		if (var5 < var7) { // L: 72
			var7 = var5;
		}

		double var9 = var1; // L: 73
		if (var3 > var1) { // L: 74
			var9 = var3;
		}

		if (var5 > var9) { // L: 75
			var9 = var5;
		}

		double var11 = 0.0D; // L: 76
		double var13 = 0.0D; // L: 77
		double var15 = (var9 + var7) / 2.0D; // L: 78
		if (var9 != var7) { // L: 79
			if (var15 < 0.5D) { // L: 80
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) { // L: 81
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) { // L: 82
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) { // L: 83
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var9 == var5) { // L: 84
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 86
		var17 &= 255; // L: 87
		double var18 = var13 * 256.0D; // L: 88
		if (var18 < 0.0D) { // L: 89
			var18 = 0.0D;
		} else if (var18 > 255.0D) { // L: 90
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 91
			var18 /= 2.0D; // L: 92
			var18 = Math.floor(var18); // L: 93
		}

		if (var15 > 0.75D) { // L: 95
			var18 /= 2.0D; // L: 96
			var18 = Math.floor(var18); // L: 97
		}

		if (var15 > 0.85D) { // L: 99
			var18 /= 2.0D; // L: 100
			var18 = Math.floor(var18); // L: 101
		}

		if (var15 > 0.95D) { // L: 103
			var18 /= 2.0D; // L: 104
			var18 = Math.floor(var18); // L: 105
		}

		if (var15 > 0.995D) { // L: 107
			var15 = 0.995D;
		}

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8)); // L: 108
		return (var20 << 7) + (int)(var15 * 128.0D); // L: 109
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method8532(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljt;[Lih;B)V",
		garbageValue = "-54"
	)
	static final void method8542(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 601
			for (var3 = 0; var3 < 104; ++var3) { // L: 602
				for (var4 = 0; var4 < 104; ++var4) { // L: 603
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 604
						var5 = var2; // L: 605
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 606
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 607
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 612
		if (Tiles.rndHue < -8) { // L: 613
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 614
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 615
		if (Tiles.rndLightness < -16) { // L: 616
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 617
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 618
			byte[][] var45 = Tiles.field1045[var2]; // L: 619
			boolean var53 = true; // L: 620
			boolean var54 = true; // L: 621
			boolean var6 = true; // L: 622
			boolean var7 = true; // L: 623
			boolean var8 = true; // L: 624
			var9 = (int)Math.sqrt(5100.0D); // L: 625
			var10 = var9 * 768 >> 8; // L: 626

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 627
				for (var12 = 1; var12 < 103; ++var12) { // L: 628
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 629
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 630
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 631
					var16 = (var13 << 8) / var15; // L: 632
					var17 = 65536 / var15; // L: 633
					var18 = (var14 << 8) / var15; // L: 634
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 635
					int var52 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1); // L: 636
					class158.field1739[var12][var11] = var19 - var52; // L: 637
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 640
				SecureRandomFuture.Tiles_hue[var11] = 0; // L: 641
				class135.Tiles_saturation[var11] = 0; // L: 642
				Tiles.Tiles_lightness[var11] = 0; // L: 643
				WorldMapSection2.Tiles_hueMultiplier[var11] = 0; // L: 644
				Script.field1008[var11] = 0; // L: 645
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 647
				for (var12 = 0; var12 < 104; ++var12) { // L: 648
					var13 = var11 + 5; // L: 649
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 650
						long var46 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 656
						var16 = (int)var46; // L: 658
						var17 = World.field841[var2][var13][var12] & var16; // L: 659
						if (var17 > 0) { // L: 660
							FloorUnderlayDefinition var48 = KitDefinition.method3706(var17 - 1); // L: 661
							var10000 = SecureRandomFuture.Tiles_hue; // L: 662
							var10000[var12] += var48.hue;
							var10000 = class135.Tiles_saturation; // L: 663
							var10000[var12] += var48.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 664
							var10000[var12] += var48.lightness;
							var10000 = WorldMapSection2.Tiles_hueMultiplier; // L: 665
							var10000[var12] += var48.hueMultiplier;
							var10002 = Script.field1008[var12]++; // L: 666
						}
					}

					var14 = var11 - 5; // L: 669
					if (var14 >= 0 && var14 < 104) { // L: 670
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 676
						var17 = (int)var49; // L: 678
						var18 = World.field841[var2][var14][var12] & var17; // L: 679
						if (var18 > 0) { // L: 680
							FloorUnderlayDefinition var51 = KitDefinition.method3706(var18 - 1); // L: 681
							var10000 = SecureRandomFuture.Tiles_hue; // L: 682
							var10000[var12] -= var51.hue;
							var10000 = class135.Tiles_saturation; // L: 683
							var10000[var12] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 684
							var10000[var12] -= var51.lightness;
							var10000 = WorldMapSection2.Tiles_hueMultiplier; // L: 685
							var10000[var12] -= var51.hueMultiplier;
							var10002 = Script.field1008[var12]--; // L: 686
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 690
					var12 = 0; // L: 691
					var13 = 0; // L: 692
					var14 = 0; // L: 693
					var15 = 0; // L: 694
					var16 = 0; // L: 695

					for (var17 = -5; var17 < 109; ++var17) { // L: 696
						var18 = var17 + 5; // L: 697
						if (var18 >= 0 && var18 < 104) { // L: 698
							var12 += SecureRandomFuture.Tiles_hue[var18]; // L: 699
							var13 += class135.Tiles_saturation[var18]; // L: 700
							var14 += Tiles.Tiles_lightness[var18]; // L: 701
							var15 += WorldMapSection2.Tiles_hueMultiplier[var18]; // L: 702
							var16 += Script.field1008[var18]; // L: 703
						}

						var19 = var17 - 5; // L: 705
						if (var19 >= 0 && var19 < 104) { // L: 706
							var12 -= SecureRandomFuture.Tiles_hue[var19]; // L: 707
							var13 -= class135.Tiles_saturation[var19]; // L: 708
							var14 -= Tiles.Tiles_lightness[var19]; // L: 709
							var15 -= WorldMapSection2.Tiles_hueMultiplier[var19]; // L: 710
							var16 -= Script.field1008[var19]; // L: 711
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 713 714 715 716
							if (var2 < Tiles.Tiles_minPlane) { // L: 719
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 725
							int var22 = (int)var20; // L: 727
							int var23 = World.field841[var2][var11][var17] & var22; // L: 728
							int var24 = VertexNormal.field2820[var2][var11][var17] & var22; // L: 729
							if (var23 > 0 || var24 > 0) { // L: 730
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 731
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 732
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 733
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 734
								int var29 = class158.field1739[var11][var17]; // L: 735
								int var30 = class158.field1739[var11 + 1][var17]; // L: 736
								int var31 = class158.field1739[var11 + 1][var17 + 1]; // L: 737
								int var32 = class158.field1739[var11][var17 + 1]; // L: 738
								int var33 = -1; // L: 739
								int var34 = -1; // L: 740
								int var35;
								int var36;
								if (var23 > 0) { // L: 741
									var35 = var12 * 256 / var15; // L: 742
									var36 = var13 / var16; // L: 743
									int var37 = var14 / var16; // L: 744
									var33 = EnumComposition.method3750(var35, var36, var37); // L: 745
									var35 = var35 + Tiles.rndHue & 255; // L: 746
									var37 += Tiles.rndLightness; // L: 747
									if (var37 < 0) { // L: 748
										var37 = 0;
									} else if (var37 > 255) { // L: 749
										var37 = 255;
									}

									var34 = EnumComposition.method3750(var35, var36, var37); // L: 750
								}

								if (var2 > 0) { // L: 752
									boolean var59 = true; // L: 753
									if (var23 == 0 && SecureRandomFuture.field997[var2][var11][var17] != 0) { // L: 754
										var59 = false;
									}

									if (var24 > 0 && !class4.method15(var24 - 1).hideUnderlay) { // L: 755
										var59 = false;
									}

									if (var59 && var25 == var26 && var25 == var27 && var25 == var28) { // L: 756 757
										var10000 = UserComparator6.field1486[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 760
								if (var34 != -1) { // L: 761
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[ScriptEvent.method2330(var34, 96)];
								}

								if (var24 == 0) { // L: 762
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ScriptEvent.method2330(var33, var29), ScriptEvent.method2330(var33, var30), ScriptEvent.method2330(var33, var31), ScriptEvent.method2330(var33, var32), 0, 0, 0, 0, var35, 0); // L: 763
								} else {
									var36 = SecureRandomFuture.field997[var2][var11][var17] + 1; // L: 766
									byte var60 = class199.field2004[var2][var11][var17]; // L: 767
									FloorOverlayDefinition var38 = class4.method15(var24 - 1); // L: 768
									int var39 = var38.texture; // L: 769
									int var40;
									int var41;
									int var42;
									int var43;
									if (var39 >= 0) { // L: 772
										var41 = Rasterizer3D.field2550.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 773
										var40 = -1; // L: 774
									} else if (var38.primaryRgb == 16711935) { // L: 777
										var40 = -2; // L: 778
										var39 = -1; // L: 779
										var41 = -2; // L: 780
									} else {
										var40 = EnumComposition.method3750(var38.hue, var38.saturation, var38.lightness); // L: 783
										var42 = var38.hue + Tiles.rndHue & 255; // L: 784
										var43 = var38.lightness + Tiles.rndLightness; // L: 785
										if (var43 < 0) { // L: 786
											var43 = 0;
										} else if (var43 > 255) { // L: 787
											var43 = 255;
										}

										var41 = EnumComposition.method3750(var42, var38.saturation, var43); // L: 788
									}

									var42 = 0; // L: 791
									if (var41 != -2) { // L: 792
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3881(var41, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 793
										var43 = var38.secondaryHue + Tiles.rndHue & 255; // L: 794
										int var44 = var38.secondaryLightness + Tiles.rndLightness; // L: 795
										if (var44 < 0) { // L: 796
											var44 = 0;
										} else if (var44 > 255) { // L: 797
											var44 = 255;
										}

										var41 = EnumComposition.method3750(var43, var38.secondarySaturation, var44); // L: 798
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3881(var41, 96)]; // L: 799
									}

									var0.addTile(var2, var11, var17, var36, var60, var39, var25, var26, var27, var28, ScriptEvent.method2330(var33, var29), ScriptEvent.method2330(var33, var30), ScriptEvent.method2330(var33, var31), ScriptEvent.method2330(var33, var32), FloorUnderlayDefinition.method3881(var40, var29), FloorUnderlayDefinition.method3881(var40, var30), FloorUnderlayDefinition.method3881(var40, var31), FloorUnderlayDefinition.method3881(var40, var32), var35, var42); // L: 801
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 808
				for (var12 = 1; var12 < 103; ++var12) { // L: 809
					var0.setTileMinPlane(var2, var12, var11, WorldMapLabel.method5654(var2, var12, var11)); // L: 810
				}
			}

			World.field841[var2] = null; // L: 813
			VertexNormal.field2820[var2] = null; // L: 814
			SecureRandomFuture.field997[var2] = null; // L: 815
			class199.field2004[var2] = null; // L: 816
			Tiles.field1045[var2] = null; // L: 817
		}

		var0.method4690(-50, -10, -50); // L: 819

		for (var2 = 0; var2 < 104; ++var2) { // L: 820
			for (var3 = 0; var3 < 104; ++var3) { // L: 821
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 822
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 825
		var3 = 2; // L: 826
		var4 = 4; // L: 827

		for (var5 = 0; var5 < 4; ++var5) { // L: 828
			if (var5 > 0) { // L: 829
				var2 <<= 3; // L: 830
				var3 <<= 3; // L: 831
				var4 <<= 3; // L: 832
			}

			for (int var55 = 0; var55 <= var5; ++var55) { // L: 834
				for (int var56 = 0; var56 <= 104; ++var56) { // L: 835
					for (int var57 = 0; var57 <= 104; ++var57) { // L: 836
						short var58;
						if ((UserComparator6.field1486[var55][var57][var56] & var2) != 0) { // L: 837
							var9 = var56; // L: 838
							var10 = var56; // L: 839
							var11 = var55; // L: 840

							for (var12 = var55; var9 > 0 && (UserComparator6.field1486[var55][var57][var9 - 1] & var2) != 0; --var9) { // L: 841 842
							}

							while (var10 < 104 && (UserComparator6.field1486[var55][var57][var10 + 1] & var2) != 0) { // L: 843
								++var10;
							}

							label415:
							while (var11 > 0) { // L: 844
								for (var13 = var9; var13 <= var10; ++var13) { // L: 845
									if ((UserComparator6.field1486[var11 - 1][var57][var13] & var2) == 0) {
										break label415;
									}
								}

								--var11; // L: 846
							}

							label404:
							while (var12 < var5) { // L: 848
								for (var13 = var9; var13 <= var10; ++var13) { // L: 849
									if ((UserComparator6.field1486[var12 + 1][var57][var13] & var2) == 0) {
										break label404;
									}
								}

								++var12; // L: 850
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 852
							if (var13 >= 8) { // L: 853
								var58 = 240; // L: 854
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58; // L: 855
								var16 = Tiles.Tiles_heights[var11][var57][var9]; // L: 856
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 857

								for (var17 = var11; var17 <= var12; ++var17) { // L: 858
									for (var18 = var9; var18 <= var10; ++var18) { // L: 859
										var10000 = UserComparator6.field1486[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((UserComparator6.field1486[var55][var57][var56] & var3) != 0) { // L: 863
							var9 = var57; // L: 864
							var10 = var57; // L: 865
							var11 = var55; // L: 866

							for (var12 = var55; var9 > 0 && (UserComparator6.field1486[var55][var9 - 1][var56] & var3) != 0; --var9) { // L: 867 868
							}

							while (var10 < 104 && (UserComparator6.field1486[var55][var10 + 1][var56] & var3) != 0) { // L: 869
								++var10;
							}

							label468:
							while (var11 > 0) { // L: 870
								for (var13 = var9; var13 <= var10; ++var13) { // L: 871
									if ((UserComparator6.field1486[var11 - 1][var13][var56] & var3) == 0) {
										break label468;
									}
								}

								--var11; // L: 872
							}

							label457:
							while (var12 < var5) { // L: 874
								for (var13 = var9; var13 <= var10; ++var13) { // L: 875
									if ((UserComparator6.field1486[var12 + 1][var13][var56] & var3) == 0) {
										break label457;
									}
								}

								++var12; // L: 876
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 878
							if (var13 >= 8) { // L: 879
								var58 = 240; // L: 880
								var15 = Tiles.Tiles_heights[var12][var9][var56] - var58; // L: 881
								var16 = Tiles.Tiles_heights[var11][var9][var56]; // L: 882
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var56 * 128, var56 * 128, var15, var16); // L: 883

								for (var17 = var11; var17 <= var12; ++var17) { // L: 884
									for (var18 = var9; var18 <= var10; ++var18) { // L: 885
										var10000 = UserComparator6.field1486[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((UserComparator6.field1486[var55][var57][var56] & var4) != 0) { // L: 889
							var9 = var57; // L: 890
							var10 = var57; // L: 891
							var11 = var56; // L: 892

							for (var12 = var56; var11 > 0 && (UserComparator6.field1486[var55][var57][var11 - 1] & var4) != 0; --var11) { // L: 893 894
							}

							while (var12 < 104 && (UserComparator6.field1486[var55][var57][var12 + 1] & var4) != 0) { // L: 895
								++var12;
							}

							label521:
							while (var9 > 0) { // L: 896
								for (var13 = var11; var13 <= var12; ++var13) { // L: 897
									if ((UserComparator6.field1486[var55][var9 - 1][var13] & var4) == 0) {
										break label521;
									}
								}

								--var9; // L: 898
							}

							label510:
							while (var10 < 104) { // L: 900
								for (var13 = var11; var13 <= var12; ++var13) { // L: 901
									if ((UserComparator6.field1486[var55][var10 + 1][var13] & var4) == 0) {
										break label510;
									}
								}

								++var10; // L: 902
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 904
								var13 = Tiles.Tiles_heights[var55][var9][var11]; // L: 905
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 906

								for (var14 = var9; var14 <= var10; ++var14) { // L: 907
									for (var15 = var11; var15 <= var12; ++var15) { // L: 908
										var10000 = UserComparator6.field1486[var55][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 916

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1686145446"
	)
	static final String method8541(int var0) {
		if (var0 < 100000) { // L: 454
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 455 456
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1569421925"
	)
	static void method8540(int var0, int var1) {
		int var2 = SoundCache.fontBold12.stringWidth("Choose Option"); // L: 9406

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9407
			var4 = SoundCache.fontBold12.stringWidth(class169.method3418(var3)); // L: 9408
			if (var4 > var2) { // L: 9409
				var2 = var4;
			}
		}

		var2 += 8; // L: 9411
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9412
		var4 = var0 - var2 / 2; // L: 9413
		if (var2 + var4 > class340.canvasWidth) { // L: 9414
			var4 = class340.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9415
			var4 = 0;
		}

		int var5 = var1; // L: 9416
		if (var3 + var1 > class491.canvasHeight) { // L: 9417
			var5 = class491.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9418
			var5 = 0;
		}

		KeyHandler.menuX = var4; // L: 9419
		class463.menuY = var5; // L: 9420
		class341.menuWidth = var2; // L: 9421
		Language.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9422
	} // L: 9423
}
