import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -234751033
	)
	static int field1065;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1736175813
	)
	@Export("group")
	int group;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -10433685
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	boolean field1060;

	InterfaceParent() {
		this.field1060 = false; // L: 8
	} // L: 10

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "107"
	)
	static final int method2305(int var0, int var1, int var2, int var3) {
		return var2 * var1 - var3 * var0 >> 16; // L: 17
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19582"
	)
	static final void method2304() {
		class339.method6635("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 114
	} // L: 115

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Liw;[Lig;I)V",
		garbageValue = "-1757702341"
	)
	static final void method2302(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 552
			for (var3 = 0; var3 < 104; ++var3) { // L: 553
				for (var4 = 0; var4 < 104; ++var4) { // L: 554
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 555
						var5 = var2; // L: 556
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 557
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 558
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 563
		if (Tiles.rndHue < -8) { // L: 564
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 565
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 566
		if (Tiles.rndLightness < -16) { // L: 567
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 568
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 569
			byte[][] var47 = class350.field3891[var2]; // L: 570
			boolean var56 = true; // L: 571
			boolean var57 = true; // L: 572
			boolean var6 = true; // L: 573
			boolean var7 = true; // L: 574
			boolean var8 = true; // L: 575
			var9 = (int)Math.sqrt(5100.0D); // L: 576
			var10 = var9 * 768 >> 8; // L: 577

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 578
				for (var12 = 1; var12 < 103; ++var12) { // L: 579
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 580
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 581
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 582
					var16 = (var13 << 8) / var15; // L: 583
					var17 = 65536 / var15; // L: 584
					var18 = (var14 << 8) / var15; // L: 585
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 586
					int var55 = (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11 + 1] >> 3) + (var47[var12][var11] >> 1); // L: 587
					Tiles.field1021[var12][var11] = var19 - var55; // L: 588
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 591
				class509.Tiles_hue[var11] = 0; // L: 592
				GrandExchangeOfferNameComparator.Tiles_saturation[var11] = 0; // L: 593
				class350.Tiles_lightness[var11] = 0; // L: 594
				class27.Tiles_hueMultiplier[var11] = 0; // L: 595
				class59.field430[var11] = 0; // L: 596
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 598
				for (var12 = 0; var12 < 104; ++var12) { // L: 599
					var13 = var11 + 5; // L: 600
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 601
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 607
						var16 = (int)var49; // L: 609
						var17 = Tiles.field1018[var2][var13][var12] & var16; // L: 610
						if (var17 > 0) { // L: 611
							FloorUnderlayDefinition var51 = class462.method8367(var17 - 1); // L: 612
							var10000 = class509.Tiles_hue; // L: 613
							var10000[var12] += var51.hue;
							var10000 = GrandExchangeOfferNameComparator.Tiles_saturation; // L: 614
							var10000[var12] += var51.saturation;
							var10000 = class350.Tiles_lightness; // L: 615
							var10000[var12] += var51.lightness;
							var10000 = class27.Tiles_hueMultiplier; // L: 616
							var10000[var12] += var51.hueMultiplier;
							var10002 = class59.field430[var12]++; // L: 617
						}
					}

					var14 = var11 - 5; // L: 620
					if (var14 >= 0 && var14 < 104) { // L: 621
						long var52 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 627
						var17 = (int)var52; // L: 629
						var18 = Tiles.field1018[var2][var14][var12] & var17; // L: 630
						if (var18 > 0) { // L: 631
							FloorUnderlayDefinition var54 = class462.method8367(var18 - 1); // L: 632
							var10000 = class509.Tiles_hue; // L: 633
							var10000[var12] -= var54.hue;
							var10000 = GrandExchangeOfferNameComparator.Tiles_saturation; // L: 634
							var10000[var12] -= var54.saturation;
							var10000 = class350.Tiles_lightness; // L: 635
							var10000[var12] -= var54.lightness;
							var10000 = class27.Tiles_hueMultiplier; // L: 636
							var10000[var12] -= var54.hueMultiplier;
							var10002 = class59.field430[var12]--; // L: 637
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 641
					var12 = 0; // L: 642
					var13 = 0; // L: 643
					var14 = 0; // L: 644
					var15 = 0; // L: 645
					var16 = 0; // L: 646

					for (var17 = -5; var17 < 109; ++var17) { // L: 647
						var18 = var17 + 5; // L: 648
						if (var18 >= 0 && var18 < 104) { // L: 649
							var12 += class509.Tiles_hue[var18]; // L: 650
							var13 += GrandExchangeOfferNameComparator.Tiles_saturation[var18]; // L: 651
							var14 += class350.Tiles_lightness[var18]; // L: 652
							var15 += class27.Tiles_hueMultiplier[var18]; // L: 653
							var16 += class59.field430[var18]; // L: 654
						}

						var19 = var17 - 5; // L: 656
						if (var19 >= 0 && var19 < 104) { // L: 657
							var12 -= class509.Tiles_hue[var19]; // L: 658
							var13 -= GrandExchangeOfferNameComparator.Tiles_saturation[var19]; // L: 659
							var14 -= class350.Tiles_lightness[var19]; // L: 660
							var15 -= class27.Tiles_hueMultiplier[var19]; // L: 661
							var16 -= class59.field430[var19]; // L: 662
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 664 665 666 667
							if (var2 < Tiles.Tiles_minPlane) { // L: 670
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 676
							int var22 = (int)var20; // L: 678
							int var23 = Tiles.field1018[var2][var11][var17] & var22; // L: 679
							int var24 = Tiles.field1033[var2][var11][var17] & var22; // L: 680
							if (var23 > 0 || var24 > 0) { // L: 681
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 682
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 683
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 684
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 685
								int var29 = Tiles.field1021[var11][var17]; // L: 686
								int var30 = Tiles.field1021[var11 + 1][var17]; // L: 687
								int var31 = Tiles.field1021[var11 + 1][var17 + 1]; // L: 688
								int var32 = Tiles.field1021[var11][var17 + 1]; // L: 689
								int var33 = -1; // L: 690
								int var34 = -1; // L: 691
								int var35;
								int var36;
								if (var23 > 0) { // L: 692
									var35 = var12 * 256 / var15; // L: 693
									var36 = var13 / var16; // L: 694
									int var37 = var14 / var16; // L: 695
									var33 = DynamicObject.method2192(var35, var36, var37); // L: 696
									var35 = var35 + Tiles.rndHue & 255; // L: 697
									var37 += Tiles.rndLightness; // L: 698
									if (var37 < 0) { // L: 699
										var37 = 0;
									} else if (var37 > 255) { // L: 700
										var37 = 255;
									}

									var34 = DynamicObject.method2192(var35, var36, var37); // L: 701
								}

								if (var2 > 0) { // L: 703
									boolean var62 = true; // L: 704
									if (var23 == 0 && class53.field367[var2][var11][var17] != 0) { // L: 705
										var62 = false;
									}

									if (var24 > 0 && !class154.method3284(var24 - 1).hideUnderlay) { // L: 706
										var62 = false;
									}

									if (var62 && var25 == var26 && var27 == var25 && var28 == var25) { // L: 707 708
										var10000 = WorldMapCacheName.field3059[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 711
								if (var34 != -1) { // L: 712
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[SecureRandomCallable.method2270(var34, 96)];
								}

								if (var24 == 0) { // L: 713
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, SecureRandomCallable.method2270(var33, var29), SecureRandomCallable.method2270(var33, var30), SecureRandomCallable.method2270(var33, var31), SecureRandomCallable.method2270(var33, var32), 0, 0, 0, 0, var35, 0); // L: 714
								} else {
									var36 = class53.field367[var2][var11][var17] + 1; // L: 717
									byte var63 = Tiles.field1019[var2][var11][var17]; // L: 718
									int var39 = var24 - 1; // L: 720
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var39); // L: 722
									FloorOverlayDefinition var38;
									if (var40 != null) { // L: 723
										var38 = var40; // L: 724
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var39); // L: 727
										var40 = new FloorOverlayDefinition(); // L: 728
										if (var41 != null) { // L: 729
											var40.decode(new Buffer(var41), var39);
										}

										var40.postDecode(); // L: 730
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var39); // L: 731
										var38 = var40; // L: 732
									}

									int var48 = var38.texture; // L: 735
									int var42;
									int var43;
									int var44;
									int var45;
									if (var48 >= 0) { // L: 738
										var43 = Rasterizer3D.field2528.Rasterizer3D_textureLoader.getAverageTextureRGB(var48); // L: 739
										var42 = -1; // L: 740
									} else if (var38.primaryRgb == 16711935) { // L: 743
										var42 = -2; // L: 744
										var48 = -1; // L: 745
										var43 = -2; // L: 746
									} else {
										var42 = DynamicObject.method2192(var38.hue, var38.saturation, var38.lightness); // L: 749
										var44 = var38.hue + Tiles.rndHue & 255; // L: 750
										var45 = var38.lightness + Tiles.rndLightness; // L: 751
										if (var45 < 0) { // L: 752
											var45 = 0;
										} else if (var45 > 255) { // L: 753
											var45 = 255;
										}

										var43 = DynamicObject.method2192(var44, var38.saturation, var45); // L: 754
									}

									var44 = 0; // L: 757
									if (var43 != -2) { // L: 758
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class89.method2330(var43, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 759
										var45 = var38.secondaryHue + Tiles.rndHue & 255; // L: 760
										int var46 = var38.secondaryLightness + Tiles.rndLightness; // L: 761
										if (var46 < 0) { // L: 762
											var46 = 0;
										} else if (var46 > 255) { // L: 763
											var46 = 255;
										}

										var43 = DynamicObject.method2192(var45, var38.secondarySaturation, var46); // L: 764
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class89.method2330(var43, 96)]; // L: 765
									}

									var0.addTile(var2, var11, var17, var36, var63, var48, var25, var26, var27, var28, SecureRandomCallable.method2270(var33, var29), SecureRandomCallable.method2270(var33, var30), SecureRandomCallable.method2270(var33, var31), SecureRandomCallable.method2270(var33, var32), class89.method2330(var42, var29), class89.method2330(var42, var30), class89.method2330(var42, var31), class89.method2330(var42, var32), var35, var44); // L: 767
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 774
				for (var12 = 1; var12 < 103; ++var12) { // L: 775
					var0.setTileMinPlane(var2, var12, var11, class10.method116(var2, var12, var11)); // L: 776
				}
			}

			Tiles.field1018[var2] = null; // L: 779
			Tiles.field1033[var2] = null; // L: 780
			class53.field367[var2] = null; // L: 781
			Tiles.field1019[var2] = null; // L: 782
			class350.field3891[var2] = null; // L: 783
		}

		var0.method4691(-50, -10, -50); // L: 785

		for (var2 = 0; var2 < 104; ++var2) { // L: 786
			for (var3 = 0; var3 < 104; ++var3) { // L: 787
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 788
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 791
		var3 = 2; // L: 792
		var4 = 4; // L: 793

		for (var5 = 0; var5 < 4; ++var5) { // L: 794
			if (var5 > 0) { // L: 795
				var2 <<= 3; // L: 796
				var3 <<= 3; // L: 797
				var4 <<= 3; // L: 798
			}

			for (int var58 = 0; var58 <= var5; ++var58) { // L: 800
				for (int var59 = 0; var59 <= 104; ++var59) { // L: 801
					for (int var60 = 0; var60 <= 104; ++var60) { // L: 802
						short var61;
						if ((WorldMapCacheName.field3059[var58][var60][var59] & var2) != 0) { // L: 803
							var9 = var59; // L: 804
							var10 = var59; // L: 805
							var11 = var58; // L: 806

							for (var12 = var58; var9 > 0 && (WorldMapCacheName.field3059[var58][var60][var9 - 1] & var2) != 0; --var9) { // L: 807 808
							}

							while (var10 < 104 && (WorldMapCacheName.field3059[var58][var60][var10 + 1] & var2) != 0) { // L: 809
								++var10;
							}

							label436:
							while (var11 > 0) { // L: 810
								for (var13 = var9; var13 <= var10; ++var13) { // L: 811
									if ((WorldMapCacheName.field3059[var11 - 1][var60][var13] & var2) == 0) {
										break label436;
									}
								}

								--var11; // L: 812
							}

							label425:
							while (var12 < var5) { // L: 814
								for (var13 = var9; var13 <= var10; ++var13) { // L: 815
									if ((WorldMapCacheName.field3059[var12 + 1][var60][var13] & var2) == 0) {
										break label425;
									}
								}

								++var12; // L: 816
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 818
							if (var13 >= 8) { // L: 819
								var61 = 240; // L: 820
								var15 = Tiles.Tiles_heights[var12][var60][var9] - var61; // L: 821
								var16 = Tiles.Tiles_heights[var11][var60][var9]; // L: 822
								Scene.Scene_addOccluder(var5, 1, var60 * 128, var60 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 823

								for (var17 = var11; var17 <= var12; ++var17) { // L: 824
									for (var18 = var9; var18 <= var10; ++var18) { // L: 825
										var10000 = WorldMapCacheName.field3059[var17][var60];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((WorldMapCacheName.field3059[var58][var60][var59] & var3) != 0) { // L: 829
							var9 = var60; // L: 830
							var10 = var60; // L: 831
							var11 = var58; // L: 832

							for (var12 = var58; var9 > 0 && (WorldMapCacheName.field3059[var58][var9 - 1][var59] & var3) != 0; --var9) { // L: 833 834
							}

							while (var10 < 104 && (WorldMapCacheName.field3059[var58][var10 + 1][var59] & var3) != 0) { // L: 835
								++var10;
							}

							label489:
							while (var11 > 0) { // L: 836
								for (var13 = var9; var13 <= var10; ++var13) { // L: 837
									if ((WorldMapCacheName.field3059[var11 - 1][var13][var59] & var3) == 0) {
										break label489;
									}
								}

								--var11; // L: 838
							}

							label478:
							while (var12 < var5) { // L: 840
								for (var13 = var9; var13 <= var10; ++var13) { // L: 841
									if ((WorldMapCacheName.field3059[var12 + 1][var13][var59] & var3) == 0) {
										break label478;
									}
								}

								++var12; // L: 842
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 844
							if (var13 >= 8) { // L: 845
								var61 = 240; // L: 846
								var15 = Tiles.Tiles_heights[var12][var9][var59] - var61; // L: 847
								var16 = Tiles.Tiles_heights[var11][var9][var59]; // L: 848
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var59 * 128, var59 * 128, var15, var16); // L: 849

								for (var17 = var11; var17 <= var12; ++var17) { // L: 850
									for (var18 = var9; var18 <= var10; ++var18) { // L: 851
										var10000 = WorldMapCacheName.field3059[var17][var18];
										var10000[var59] &= ~var3;
									}
								}
							}
						}

						if ((WorldMapCacheName.field3059[var58][var60][var59] & var4) != 0) { // L: 855
							var9 = var60; // L: 856
							var10 = var60; // L: 857
							var11 = var59; // L: 858

							for (var12 = var59; var11 > 0 && (WorldMapCacheName.field3059[var58][var60][var11 - 1] & var4) != 0; --var11) { // L: 859 860
							}

							while (var12 < 104 && (WorldMapCacheName.field3059[var58][var60][var12 + 1] & var4) != 0) { // L: 861
								++var12;
							}

							label542:
							while (var9 > 0) { // L: 862
								for (var13 = var11; var13 <= var12; ++var13) { // L: 863
									if ((WorldMapCacheName.field3059[var58][var9 - 1][var13] & var4) == 0) {
										break label542;
									}
								}

								--var9; // L: 864
							}

							label531:
							while (var10 < 104) { // L: 866
								for (var13 = var11; var13 <= var12; ++var13) { // L: 867
									if ((WorldMapCacheName.field3059[var58][var10 + 1][var13] & var4) == 0) {
										break label531;
									}
								}

								++var10; // L: 868
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 870
								var13 = Tiles.Tiles_heights[var58][var9][var11]; // L: 871
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 872

								for (var14 = var9; var14 <= var10; ++var14) { // L: 873
									for (var15 = var11; var15 <= var12; ++var15) { // L: 874
										var10000 = WorldMapCacheName.field3059[var58][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 882

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method2303() {
		if (BuddyRankComparator.Client_plane != Client.field625) { // L: 3867
			Client.field625 = BuddyRankComparator.Client_plane; // L: 3868
			int var0 = BuddyRankComparator.Client_plane; // L: 3869
			int[] var1 = sceneMinimapSprite.pixels; // L: 3871
			int var2 = var1.length; // L: 3872

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3873
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3874
				var4 = (103 - var3) * 2048 + 24628; // L: 3875

				for (var5 = 1; var5 < 103; ++var5) { // L: 3876
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3877
						class173.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						class173.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3); // L: 3878
					}

					var4 += 4; // L: 3879
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3882
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3883
			sceneMinimapSprite.setRaster(); // L: 3884

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3885
				for (var6 = 1; var6 < 103; ++var6) { // L: 3886
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3887
						MusicPatchNode.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3888
						MusicPatchNode.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3891

			for (var5 = 0; var5 < 104; ++var5) { // L: 3892
				for (var6 = 0; var6 < 104; ++var6) { // L: 3893
					long var7 = class173.scene.getGroundObjectTag(BuddyRankComparator.Client_plane, var5, var6); // L: 3894
					if (0L != var7) { // L: 3895
						int var9 = class318.Entity_unpackID(var7); // L: 3896
						int var10 = Language.getObjectDefinition(var9).mapIconId; // L: 3897
						if (var10 >= 0 && class127.WorldMapElement_get(var10).field1925) { // L: 3898 3899
							Client.mapIcons[Client.mapIconCount] = class127.WorldMapElement_get(var10).getSpriteBool(false); // L: 3902
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3903
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3904
							++Client.mapIconCount; // L: 3905
						}
					}
				}
			}

			KitDefinition.rasterProvider.apply(); // L: 3910
		}

	} // L: 3913
}
