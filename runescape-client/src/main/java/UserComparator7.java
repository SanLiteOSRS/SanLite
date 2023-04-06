import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	public static ThreadPoolExecutor field1413;
	@ObfuscatedName("aj")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpt;B)I",
		garbageValue = "-38"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lir;[Liz;I)V",
		garbageValue = "1008245340"
	)
	static final void method2855(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 622
			for (var3 = 0; var3 < 104; ++var3) { // L: 623
				for (var4 = 0; var4 < 104; ++var4) { // L: 624
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 625
						var5 = var2; // L: 626
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 627
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 628
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 633
		if (Tiles.rndHue < -8) { // L: 634
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 635
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 636
		if (Tiles.rndLightness < -16) { // L: 637
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 638
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 639
			byte[][] var43 = Decimator.field405[var2]; // L: 640
			boolean var47 = true; // L: 641
			boolean var48 = true; // L: 642
			boolean var6 = true; // L: 643
			boolean var7 = true; // L: 644
			boolean var8 = true; // L: 645
			var9 = (int)Math.sqrt(5100.0D); // L: 646
			var10 = var9 * 768 >> 8; // L: 647

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 648
				for (var12 = 1; var12 < 103; ++var12) { // L: 649
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 650
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 651
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 652
					var16 = (var13 << 8) / var15; // L: 653
					var17 = 65536 / var15; // L: 654
					var18 = (var14 << 8) / var15; // L: 655
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 656
					var20 = (var43[var12][var11 + 1] >> 3) + (var43[var12 - 1][var11] >> 2) + (var43[var12][var11 - 1] >> 2) + (var43[var12 + 1][var11] >> 3) + (var43[var12][var11] >> 1); // L: 657
					class306.field3445[var12][var11] = var19 - var20; // L: 658
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 661
				Tiles.Tiles_hue[var11] = 0; // L: 662
				class134.Tiles_saturation[var11] = 0; // L: 663
				Language.Tiles_lightness[var11] = 0; // L: 664
				TileItem.Tiles_hueMultiplier[var11] = 0; // L: 665
				Interpreter.field840[var11] = 0; // L: 666
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 668
				for (var12 = 0; var12 < 104; ++var12) { // L: 669
					var13 = var11 + 5; // L: 670
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 671
						var14 = (int)AbstractWorldMapData.method5218(15); // L: 672
						var15 = Tiles.field995[var2][var13][var12] & var14; // L: 673
						if (var15 > 0) { // L: 674
							FloorUnderlayDefinition var45 = class134.method3068(var15 - 1); // L: 675
							var10000 = Tiles.Tiles_hue; // L: 676
							var10000[var12] += var45.hue;
							var10000 = class134.Tiles_saturation; // L: 677
							var10000[var12] += var45.saturation;
							var10000 = Language.Tiles_lightness; // L: 678
							var10000[var12] += var45.lightness;
							var10000 = TileItem.Tiles_hueMultiplier; // L: 679
							var10000[var12] += var45.hueMultiplier;
							var10002 = Interpreter.field840[var12]++; // L: 680
						}
					}

					var14 = var11 - 5; // L: 683
					if (var14 >= 0 && var14 < 104) { // L: 684
						var15 = (int)AbstractWorldMapData.method5218(15); // L: 685
						var16 = Tiles.field995[var2][var14][var12] & var15; // L: 686
						if (var16 > 0) { // L: 687
							FloorUnderlayDefinition var46 = class134.method3068(var16 - 1); // L: 688
							var10000 = Tiles.Tiles_hue; // L: 689
							var10000[var12] -= var46.hue;
							var10000 = class134.Tiles_saturation; // L: 690
							var10000[var12] -= var46.saturation;
							var10000 = Language.Tiles_lightness; // L: 691
							var10000[var12] -= var46.lightness;
							var10000 = TileItem.Tiles_hueMultiplier; // L: 692
							var10000[var12] -= var46.hueMultiplier;
							var10002 = Interpreter.field840[var12]--; // L: 693
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 697
					var12 = 0; // L: 698
					var13 = 0; // L: 699
					var14 = 0; // L: 700
					var15 = 0; // L: 701
					var16 = 0; // L: 702

					for (var17 = -5; var17 < 109; ++var17) { // L: 703
						var18 = var17 + 5; // L: 704
						if (var18 >= 0 && var18 < 104) { // L: 705
							var12 += Tiles.Tiles_hue[var18]; // L: 706
							var13 += class134.Tiles_saturation[var18]; // L: 707
							var14 += Language.Tiles_lightness[var18]; // L: 708
							var15 += TileItem.Tiles_hueMultiplier[var18]; // L: 709
							var16 += Interpreter.field840[var18]; // L: 710
						}

						var19 = var17 - 5; // L: 712
						if (var19 >= 0 && var19 < 104) { // L: 713
							var12 -= Tiles.Tiles_hue[var19]; // L: 714
							var13 -= class134.Tiles_saturation[var19]; // L: 715
							var14 -= Language.Tiles_lightness[var19]; // L: 716
							var15 -= TileItem.Tiles_hueMultiplier[var19]; // L: 717
							var16 -= Interpreter.field840[var19]; // L: 718
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 720 721 722 723
							if (var2 < Tiles.Tiles_minPlane) { // L: 726
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)AbstractWorldMapData.method5218(15); // L: 727
							int var21 = Tiles.field995[var2][var11][var17] & var20; // L: 728
							int var22 = Tiles.field996[var2][var11][var17] & var20; // L: 729
							if (var21 > 0 || var22 > 0) { // L: 730
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 731
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 732
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 733
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 734
								int var27 = class306.field3445[var11][var17]; // L: 735
								int var28 = class306.field3445[var11 + 1][var17]; // L: 736
								int var29 = class306.field3445[var11 + 1][var17 + 1]; // L: 737
								int var30 = class306.field3445[var11][var17 + 1]; // L: 738
								int var31 = -1; // L: 739
								int var32 = -1; // L: 740
								int var33;
								int var34;
								if (var21 > 0) { // L: 741
									var33 = var12 * 256 / var15; // L: 742
									var34 = var13 / var16; // L: 743
									int var35 = var14 / var16; // L: 744
									var31 = class122.hslToRgb(var33, var34, var35); // L: 745
									var33 = var33 + Tiles.rndHue & 255; // L: 746
									var35 += Tiles.rndLightness; // L: 747
									if (var35 < 0) { // L: 748
										var35 = 0;
									} else if (var35 > 255) { // L: 749
										var35 = 255;
									}

									var32 = class122.hslToRgb(var33, var34, var35); // L: 750
								}

								if (var2 > 0) { // L: 752
									boolean var53 = true; // L: 753
									if (var21 == 0 && class16.field81[var2][var11][var17] != 0) { // L: 754
										var53 = false;
									}

									if (var22 > 0 && !class13.method160(var22 - 1).hideUnderlay) { // L: 755
										var53 = false;
									}

									if (var53 && var23 == var24 && var25 == var23 && var26 == var23) { // L: 756 757
										var10000 = class17.field88[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 760
								if (var32 != -1) { // L: 761
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[Widget.method6151(var32, 96)];
								}

								if (var22 == 0) { // L: 762
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, Widget.method6151(var31, var27), Widget.method6151(var31, var28), Widget.method6151(var31, var29), Widget.method6151(var31, var30), 0, 0, 0, 0, var33, 0); // L: 763
								} else {
									var34 = class16.field81[var2][var11][var17] + 1; // L: 766
									byte var54 = Tiles.field997[var2][var11][var17]; // L: 767
									FloorOverlayDefinition var36 = class13.method160(var22 - 1); // L: 768
									int var37 = var36.texture; // L: 769
									int var38;
									int var39;
									int var40;
									int var41;
									if (var37 >= 0) { // L: 772
										var39 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var37); // L: 773
										var38 = -1; // L: 774
									} else if (var36.primaryRgb == 16711935) { // L: 777
										var38 = -2; // L: 778
										var37 = -1; // L: 779
										var39 = -2; // L: 780
									} else {
										var38 = class122.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 783
										var40 = var36.hue + Tiles.rndHue & 255; // L: 784
										var41 = var36.lightness + Tiles.rndLightness; // L: 785
										if (var41 < 0) { // L: 786
											var41 = 0;
										} else if (var41 > 255) { // L: 787
											var41 = 255;
										}

										var39 = class122.hslToRgb(var40, var36.saturation, var41); // L: 788
									}

									var40 = 0; // L: 791
									if (var39 != -2) { // L: 792
										var40 = Rasterizer3D.Rasterizer3D_colorPalette[class72.method2057(var39, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 793
										var41 = var36.secondaryHue + Tiles.rndHue & 255; // L: 794
										int var42 = var36.secondaryLightness + Tiles.rndLightness; // L: 795
										if (var42 < 0) { // L: 796
											var42 = 0;
										} else if (var42 > 255) { // L: 797
											var42 = 255;
										}

										var39 = class122.hslToRgb(var41, var36.secondarySaturation, var42); // L: 798
										var40 = Rasterizer3D.Rasterizer3D_colorPalette[class72.method2057(var39, 96)]; // L: 799
									}

									var0.addTile(var2, var11, var17, var34, var54, var37, var23, var24, var25, var26, Widget.method6151(var31, var27), Widget.method6151(var31, var28), Widget.method6151(var31, var29), Widget.method6151(var31, var30), class72.method2057(var38, var27), class72.method2057(var38, var28), class72.method2057(var38, var29), class72.method2057(var38, var30), var33, var40); // L: 801
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 808
				for (var12 = 1; var12 < 103; ++var12) { // L: 809
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 816
						var17 = 0; // L: 817
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 820
						var17 = var2 - 1; // L: 821
					} else {
						var17 = var2; // L: 824
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 826
				}
			}

			Tiles.field995[var2] = null; // L: 829
			Tiles.field996[var2] = null; // L: 830
			class16.field81[var2] = null; // L: 831
			Tiles.field997[var2] = null; // L: 832
			Decimator.field405[var2] = null; // L: 833
		}

		var0.method4434(-50, -10, -50); // L: 835

		for (var2 = 0; var2 < 104; ++var2) { // L: 836
			for (var3 = 0; var3 < 104; ++var3) { // L: 837
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 838
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 841
		var3 = 2; // L: 842
		var4 = 4; // L: 843

		for (var5 = 0; var5 < 4; ++var5) { // L: 844
			if (var5 > 0) { // L: 845
				var2 <<= 3; // L: 846
				var3 <<= 3; // L: 847
				var4 <<= 3; // L: 848
			}

			for (int var49 = 0; var49 <= var5; ++var49) { // L: 850
				for (int var50 = 0; var50 <= 104; ++var50) { // L: 851
					for (int var51 = 0; var51 <= 104; ++var51) { // L: 852
						short var52;
						if ((class17.field88[var49][var51][var50] & var2) != 0) { // L: 853
							var9 = var50; // L: 854
							var10 = var50; // L: 855
							var11 = var49; // L: 856

							for (var12 = var49; var9 > 0 && (class17.field88[var49][var51][var9 - 1] & var2) != 0; --var9) { // L: 857 858
							}

							while (var10 < 104 && (class17.field88[var49][var51][var10 + 1] & var2) != 0) { // L: 859
								++var10;
							}

							label428:
							while (var11 > 0) { // L: 860
								for (var13 = var9; var13 <= var10; ++var13) { // L: 861
									if ((class17.field88[var11 - 1][var51][var13] & var2) == 0) {
										break label428;
									}
								}

								--var11; // L: 862
							}

							label417:
							while (var12 < var5) { // L: 864
								for (var13 = var9; var13 <= var10; ++var13) { // L: 865
									if ((class17.field88[var12 + 1][var51][var13] & var2) == 0) {
										break label417;
									}
								}

								++var12; // L: 866
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 868
							if (var13 >= 8) { // L: 869
								var52 = 240; // L: 870
								var15 = Tiles.Tiles_heights[var12][var51][var9] - var52; // L: 871
								var16 = Tiles.Tiles_heights[var11][var51][var9]; // L: 872
								Scene.Scene_addOccluder(var5, 1, var51 * 128, var51 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 873

								for (var17 = var11; var17 <= var12; ++var17) { // L: 874
									for (var18 = var9; var18 <= var10; ++var18) { // L: 875
										var10000 = class17.field88[var17][var51];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class17.field88[var49][var51][var50] & var3) != 0) { // L: 879
							var9 = var51; // L: 880
							var10 = var51; // L: 881
							var11 = var49; // L: 882

							for (var12 = var49; var9 > 0 && (class17.field88[var49][var9 - 1][var50] & var3) != 0; --var9) { // L: 883 884
							}

							while (var10 < 104 && (class17.field88[var49][var10 + 1][var50] & var3) != 0) { // L: 885
								++var10;
							}

							label481:
							while (var11 > 0) { // L: 886
								for (var13 = var9; var13 <= var10; ++var13) { // L: 887
									if ((class17.field88[var11 - 1][var13][var50] & var3) == 0) {
										break label481;
									}
								}

								--var11; // L: 888
							}

							label470:
							while (var12 < var5) { // L: 890
								for (var13 = var9; var13 <= var10; ++var13) { // L: 891
									if ((class17.field88[var12 + 1][var13][var50] & var3) == 0) {
										break label470;
									}
								}

								++var12; // L: 892
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 894
							if (var13 >= 8) { // L: 895
								var52 = 240; // L: 896
								var15 = Tiles.Tiles_heights[var12][var9][var50] - var52; // L: 897
								var16 = Tiles.Tiles_heights[var11][var9][var50]; // L: 898
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var50 * 128, var50 * 128, var15, var16); // L: 899

								for (var17 = var11; var17 <= var12; ++var17) { // L: 900
									for (var18 = var9; var18 <= var10; ++var18) { // L: 901
										var10000 = class17.field88[var17][var18];
										var10000[var50] &= ~var3;
									}
								}
							}
						}

						if ((class17.field88[var49][var51][var50] & var4) != 0) { // L: 905
							var9 = var51; // L: 906
							var10 = var51; // L: 907
							var11 = var50; // L: 908

							for (var12 = var50; var11 > 0 && (class17.field88[var49][var51][var11 - 1] & var4) != 0; --var11) { // L: 909 910
							}

							while (var12 < 104 && (class17.field88[var49][var51][var12 + 1] & var4) != 0) { // L: 911
								++var12;
							}

							label534:
							while (var9 > 0) { // L: 912
								for (var13 = var11; var13 <= var12; ++var13) { // L: 913
									if ((class17.field88[var49][var9 - 1][var13] & var4) == 0) {
										break label534;
									}
								}

								--var9; // L: 914
							}

							label523:
							while (var10 < 104) { // L: 916
								for (var13 = var11; var13 <= var12; ++var13) { // L: 917
									if ((class17.field88[var49][var10 + 1][var13] & var4) == 0) {
										break label523;
									}
								}

								++var10; // L: 918
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 920
								var13 = Tiles.Tiles_heights[var49][var9][var11]; // L: 921
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 922

								for (var14 = var9; var14 <= var10; ++var14) { // L: 923
									for (var15 = var11; var15 <= var12; ++var15) { // L: 924
										var10000 = class17.field88[var49][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 932

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Lcm;III)V",
		garbageValue = "1284745661"
	)
	static final void method2851(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8860
			class287.method5475(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field875, var0.field871, var0.field877, var1, var2); // L: 8861
		}

	} // L: 8863
}
