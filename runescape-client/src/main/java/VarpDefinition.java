import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hn")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 183701023
	)
	public static int field1903;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 984856865
	)
	static int field1905;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 437669515
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "-36"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 29
			if (var2 == 0) { // L: 30
				return; // L: 33
			}

			this.decodeNext(var1, var2); // L: 31
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IB)V",
		garbageValue = "-47"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 36
			this.type = var1.readUnsignedShort();
		}

	} // L: 38

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-612390217"
	)
	public static void method3584() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 77
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 78
	} // L: 79

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Liz;[Lic;I)V",
		garbageValue = "2146886129"
	)
	static final void method3573(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 569
			for (var3 = 0; var3 < 104; ++var3) { // L: 570
				for (var4 = 0; var4 < 104; ++var4) { // L: 571
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 572
						var5 = var2; // L: 573
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 574
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 575
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 580
		if (Tiles.rndHue < -8) { // L: 581
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 582
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 583
		if (Tiles.rndLightness < -16) { // L: 584
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 585
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 586
			byte[][] var47 = class305.field3399[var2]; // L: 587
			boolean var56 = true; // L: 588
			boolean var57 = true; // L: 589
			boolean var6 = true; // L: 590
			boolean var7 = true; // L: 591
			boolean var8 = true; // L: 592
			var9 = (int)Math.sqrt(5100.0D); // L: 593
			var10 = var9 * 768 >> 8; // L: 594

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 595
				for (var12 = 1; var12 < 103; ++var12) { // L: 596
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 597
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 598
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 599
					var16 = (var13 << 8) / var15; // L: 600
					var17 = 65536 / var15; // L: 601
					var18 = (var14 << 8) / var15; // L: 602
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 603
					int var55 = (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11 + 1] >> 3) + (var47[var12][var11] >> 1); // L: 604
					Canvas.field116[var12][var11] = var19 - var55; // L: 605
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 608
				UserComparator5.Tiles_hue[var11] = 0; // L: 609
				class210.Tiles_saturation[var11] = 0; // L: 610
				Tiles.Tiles_lightness[var11] = 0; // L: 611
				class149.Tiles_hueMultiplier[var11] = 0; // L: 612
				Tiles.field1019[var11] = 0; // L: 613
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 615
				for (var12 = 0; var12 < 104; ++var12) { // L: 616
					var13 = var11 + 5; // L: 617
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 618
						long var51 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 624
						var16 = (int)var51; // L: 626
						var17 = FaceNormal.field2621[var2][var13][var12] & var16; // L: 627
						if (var17 > 0) { // L: 628
							FloorUnderlayDefinition var53 = class183.method3553(var17 - 1); // L: 629
							var10000 = UserComparator5.Tiles_hue; // L: 630
							var10000[var12] += var53.hue;
							var10000 = class210.Tiles_saturation; // L: 631
							var10000[var12] += var53.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 632
							var10000[var12] += var53.lightness;
							var10000 = class149.Tiles_hueMultiplier; // L: 633
							var10000[var12] += var53.hueMultiplier;
							var10002 = Tiles.field1019[var12]++; // L: 634
						}
					}

					var14 = var11 - 5; // L: 637
					if (var14 >= 0 && var14 < 104) { // L: 638
						var15 = (int)class215.method4252(15); // L: 639
						var16 = FaceNormal.field2621[var2][var14][var12] & var15; // L: 640
						if (var16 > 0) { // L: 641
							FloorUnderlayDefinition var54 = class183.method3553(var16 - 1); // L: 642
							var10000 = UserComparator5.Tiles_hue; // L: 643
							var10000[var12] -= var54.hue;
							var10000 = class210.Tiles_saturation; // L: 644
							var10000[var12] -= var54.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 645
							var10000[var12] -= var54.lightness;
							var10000 = class149.Tiles_hueMultiplier; // L: 646
							var10000[var12] -= var54.hueMultiplier;
							var10002 = Tiles.field1019[var12]--; // L: 647
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 651
					var12 = 0; // L: 652
					var13 = 0; // L: 653
					var14 = 0; // L: 654
					var15 = 0; // L: 655
					var16 = 0; // L: 656

					for (var17 = -5; var17 < 109; ++var17) { // L: 657
						var18 = var17 + 5; // L: 658
						if (var18 >= 0 && var18 < 104) { // L: 659
							var12 += UserComparator5.Tiles_hue[var18]; // L: 660
							var13 += class210.Tiles_saturation[var18]; // L: 661
							var14 += Tiles.Tiles_lightness[var18]; // L: 662
							var15 += class149.Tiles_hueMultiplier[var18]; // L: 663
							var16 += Tiles.field1019[var18]; // L: 664
						}

						var19 = var17 - 5; // L: 666
						if (var19 >= 0 && var19 < 104) { // L: 667
							var12 -= UserComparator5.Tiles_hue[var19]; // L: 668
							var13 -= class210.Tiles_saturation[var19]; // L: 669
							var14 -= Tiles.Tiles_lightness[var19]; // L: 670
							var15 -= class149.Tiles_hueMultiplier[var19]; // L: 671
							var16 -= Tiles.field1019[var19]; // L: 672
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 674 675 676 677
							if (var2 < Tiles.Tiles_minPlane) { // L: 680
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 686
							int var22 = (int)var20; // L: 688
							int var23 = FaceNormal.field2621[var2][var11][var17] & var22; // L: 689
							int var24 = class74.field916[var2][var11][var17] & var22; // L: 690
							if (var23 > 0 || var24 > 0) { // L: 691
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 692
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 693
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 694
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 695
								int var29 = Canvas.field116[var11][var17]; // L: 696
								int var30 = Canvas.field116[var11 + 1][var17]; // L: 697
								int var31 = Canvas.field116[var11 + 1][var17 + 1]; // L: 698
								int var32 = Canvas.field116[var11][var17 + 1]; // L: 699
								int var33 = -1; // L: 700
								int var34 = -1; // L: 701
								int var35;
								int var36;
								int var37;
								if (var23 > 0) { // L: 702
									var35 = var12 * 256 / var15; // L: 703
									var36 = var13 / var16; // L: 704
									var37 = var14 / var16; // L: 705
									var33 = GameEngine.hslToRgb(var35, var36, var37); // L: 706
									var35 = var35 + Tiles.rndHue & 255; // L: 707
									var37 += Tiles.rndLightness; // L: 708
									if (var37 < 0) { // L: 709
										var37 = 0;
									} else if (var37 > 255) { // L: 710
										var37 = 255;
									}

									var34 = GameEngine.hslToRgb(var35, var36, var37); // L: 711
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) { // L: 713
									boolean var62 = true; // L: 714
									if (var23 == 0 && Player.field1127[var2][var11][var17] != 0) { // L: 715
										var62 = false;
									}

									if (var24 > 0) { // L: 716
										var37 = var24 - 1; // L: 718
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37); // L: 720
										FloorOverlayDefinition var48;
										if (var38 != null) { // L: 721
											var48 = var38; // L: 722
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37); // L: 725
											var38 = new FloorOverlayDefinition(); // L: 726
											if (var39 != null) { // L: 727
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode(); // L: 728
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37); // L: 729
											var48 = var38; // L: 730
										}

										if (!var48.hideUnderlay) { // L: 732
											var62 = false;
										}
									}

									if (var62 && var25 == var26 && var25 == var27 && var25 == var28) { // L: 734 735
										var10000 = Tiles.field1020[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 738
								if (var34 != -1) { // L: 739
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[ItemContainer.method2230(var34, 96)];
								}

								if (var24 == 0) { // L: 740
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ItemContainer.method2230(var33, var29), ItemContainer.method2230(var33, var30), ItemContainer.method2230(var33, var31), ItemContainer.method2230(var33, var32), 0, 0, 0, 0, var35, 0); // L: 741
								} else {
									var36 = Player.field1127[var2][var11][var17] + 1; // L: 744
									byte var63 = Tiles.field1018[var2][var11][var17]; // L: 745
									int var49 = var24 - 1; // L: 747
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var49); // L: 749
									if (var40 != null) { // L: 750
										var38 = var40; // L: 751
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var49); // L: 754
										var40 = new FloorOverlayDefinition(); // L: 755
										if (var41 != null) { // L: 756
											var40.decode(new Buffer(var41), var49);
										}

										var40.postDecode(); // L: 757
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var49); // L: 758
										var38 = var40; // L: 759
									}

									int var50 = var38.texture; // L: 762
									int var42;
									int var43;
									int var44;
									int var45;
									if (var50 >= 0) { // L: 765
										var43 = Rasterizer3D.field2520.Rasterizer3D_textureLoader.getAverageTextureRGB(var50); // L: 766
										var42 = -1; // L: 767
									} else if (var38.primaryRgb == 16711935) { // L: 770
										var42 = -2; // L: 771
										var50 = -1; // L: 772
										var43 = -2; // L: 773
									} else {
										var42 = GameEngine.hslToRgb(var38.hue, var38.saturation, var38.lightness); // L: 776
										var44 = var38.hue + Tiles.rndHue & 255; // L: 777
										var45 = var38.lightness + Tiles.rndLightness; // L: 778
										if (var45 < 0) { // L: 779
											var45 = 0;
										} else if (var45 > 255) { // L: 780
											var45 = 255;
										}

										var43 = GameEngine.hslToRgb(var44, var38.saturation, var45); // L: 781
									}

									var44 = 0; // L: 784
									if (var43 != -2) { // L: 785
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[AbstractSocket.method7958(var43, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 786
										var45 = var38.secondaryHue + Tiles.rndHue & 255; // L: 787
										int var46 = var38.secondaryLightness + Tiles.rndLightness; // L: 788
										if (var46 < 0) { // L: 789
											var46 = 0;
										} else if (var46 > 255) { // L: 790
											var46 = 255;
										}

										var43 = GameEngine.hslToRgb(var45, var38.secondarySaturation, var46); // L: 791
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[AbstractSocket.method7958(var43, 96)]; // L: 792
									}

									var0.addTile(var2, var11, var17, var36, var63, var50, var25, var26, var27, var28, ItemContainer.method2230(var33, var29), ItemContainer.method2230(var33, var30), ItemContainer.method2230(var33, var31), ItemContainer.method2230(var33, var32), AbstractSocket.method7958(var42, var29), AbstractSocket.method7958(var42, var30), AbstractSocket.method7958(var42, var31), AbstractSocket.method7958(var42, var32), var35, var44); // L: 794
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 801
				for (var12 = 1; var12 < 103; ++var12) { // L: 802
					var0.setTileMinPlane(var2, var12, var11, class135.method3045(var2, var12, var11)); // L: 803
				}
			}

			FaceNormal.field2621[var2] = null; // L: 806
			class74.field916[var2] = null; // L: 807
			Player.field1127[var2] = null; // L: 808
			Tiles.field1018[var2] = null; // L: 809
			class305.field3399[var2] = null; // L: 810
		}

		var0.method4543(-50, -10, -50); // L: 812

		for (var2 = 0; var2 < 104; ++var2) { // L: 813
			for (var3 = 0; var3 < 104; ++var3) { // L: 814
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 815
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 818
		var3 = 2; // L: 819
		var4 = 4; // L: 820

		for (var5 = 0; var5 < 4; ++var5) { // L: 821
			if (var5 > 0) { // L: 822
				var2 <<= 3; // L: 823
				var3 <<= 3; // L: 824
				var4 <<= 3; // L: 825
			}

			for (int var58 = 0; var58 <= var5; ++var58) { // L: 827
				for (int var59 = 0; var59 <= 104; ++var59) { // L: 828
					for (int var60 = 0; var60 <= 104; ++var60) { // L: 829
						short var61;
						if ((Tiles.field1020[var58][var60][var59] & var2) != 0) { // L: 830
							var9 = var59; // L: 831
							var10 = var59; // L: 832
							var11 = var58; // L: 833

							for (var12 = var58; var9 > 0 && (Tiles.field1020[var58][var60][var9 - 1] & var2) != 0; --var9) { // L: 834 835
							}

							while (var10 < 104 && (Tiles.field1020[var58][var60][var10 + 1] & var2) != 0) { // L: 836
								++var10;
							}

							label448:
							while (var11 > 0) { // L: 837
								for (var13 = var9; var13 <= var10; ++var13) { // L: 838
									if ((Tiles.field1020[var11 - 1][var60][var13] & var2) == 0) {
										break label448;
									}
								}

								--var11; // L: 839
							}

							label437:
							while (var12 < var5) { // L: 841
								for (var13 = var9; var13 <= var10; ++var13) { // L: 842
									if ((Tiles.field1020[var12 + 1][var60][var13] & var2) == 0) {
										break label437;
									}
								}

								++var12; // L: 843
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 845
							if (var13 >= 8) { // L: 846
								var61 = 240; // L: 847
								var15 = Tiles.Tiles_heights[var12][var60][var9] - var61; // L: 848
								var16 = Tiles.Tiles_heights[var11][var60][var9]; // L: 849
								Scene.Scene_addOccluder(var5, 1, var60 * 128, var60 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 850

								for (var17 = var11; var17 <= var12; ++var17) { // L: 851
									for (var18 = var9; var18 <= var10; ++var18) { // L: 852
										var10000 = Tiles.field1020[var17][var60];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1020[var58][var60][var59] & var3) != 0) { // L: 856
							var9 = var60; // L: 857
							var10 = var60; // L: 858
							var11 = var58; // L: 859

							for (var12 = var58; var9 > 0 && (Tiles.field1020[var58][var9 - 1][var59] & var3) != 0; --var9) { // L: 860 861
							}

							while (var10 < 104 && (Tiles.field1020[var58][var10 + 1][var59] & var3) != 0) { // L: 862
								++var10;
							}

							label501:
							while (var11 > 0) { // L: 863
								for (var13 = var9; var13 <= var10; ++var13) { // L: 864
									if ((Tiles.field1020[var11 - 1][var13][var59] & var3) == 0) {
										break label501;
									}
								}

								--var11; // L: 865
							}

							label490:
							while (var12 < var5) { // L: 867
								for (var13 = var9; var13 <= var10; ++var13) { // L: 868
									if ((Tiles.field1020[var12 + 1][var13][var59] & var3) == 0) {
										break label490;
									}
								}

								++var12; // L: 869
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 871
							if (var13 >= 8) { // L: 872
								var61 = 240; // L: 873
								var15 = Tiles.Tiles_heights[var12][var9][var59] - var61; // L: 874
								var16 = Tiles.Tiles_heights[var11][var9][var59]; // L: 875
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var59 * 128, var59 * 128, var15, var16); // L: 876

								for (var17 = var11; var17 <= var12; ++var17) { // L: 877
									for (var18 = var9; var18 <= var10; ++var18) { // L: 878
										var10000 = Tiles.field1020[var17][var18];
										var10000[var59] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1020[var58][var60][var59] & var4) != 0) { // L: 882
							var9 = var60; // L: 883
							var10 = var60; // L: 884
							var11 = var59; // L: 885

							for (var12 = var59; var11 > 0 && (Tiles.field1020[var58][var60][var11 - 1] & var4) != 0; --var11) { // L: 886 887
							}

							while (var12 < 104 && (Tiles.field1020[var58][var60][var12 + 1] & var4) != 0) { // L: 888
								++var12;
							}

							label554:
							while (var9 > 0) { // L: 889
								for (var13 = var11; var13 <= var12; ++var13) { // L: 890
									if ((Tiles.field1020[var58][var9 - 1][var13] & var4) == 0) {
										break label554;
									}
								}

								--var9; // L: 891
							}

							label543:
							while (var10 < 104) { // L: 893
								for (var13 = var11; var13 <= var12; ++var13) { // L: 894
									if ((Tiles.field1020[var58][var10 + 1][var13] & var4) == 0) {
										break label543;
									}
								}

								++var10; // L: 895
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 897
								var13 = Tiles.Tiles_heights[var58][var9][var11]; // L: 898
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 899

								for (var14 = var9; var14 <= var10; ++var14) { // L: 900
									for (var15 = var11; var15 <= var12; ++var15) { // L: 901
										var10000 = Tiles.field1020[var58][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 909

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-264833117"
	)
	static int method3586(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1568
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1569
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var3)); // L: 1570
			return 1; // L: 1571
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1573
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1580
				if (var3.dataText == null) { // L: 1581
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1582
				}

				return 1; // L: 1583
			} else {
				return 2; // L: 1585
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1574
			--var4; // L: 1575
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1576
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1577
			} else {
				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1578
		}
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldx;",
		garbageValue = "-2122334075"
	)
	static final InterfaceParent method3580(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12354
		var3.group = var1; // L: 12355
		var3.type = var2; // L: 12356
		Client.interfaceParents.put(var3, (long)var0); // L: 12357
		class136.Widget_resetModelFrames(var1); // L: 12358
		Widget var4 = FriendSystem.getWidget(var0); // L: 12359
		Messages.invalidateWidget(var4); // L: 12360
		if (Client.meslayerContinueWidget != null) { // L: 12361
			Messages.invalidateWidget(Client.meslayerContinueWidget); // L: 12362
			Client.meslayerContinueWidget = null; // L: 12363
		}

		Projectile.revalidateWidgetScroll(class16.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12365
		class149.runWidgetOnLoadListener(var1); // L: 12366
		if (Client.rootInterface != -1) { // L: 12367
			class453.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12368
	}
}
