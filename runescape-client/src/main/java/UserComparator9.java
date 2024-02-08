import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "-28"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1648505061"
	)
	public static final synchronized long method2973() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class169.field1801) { // L: 15
			class315.field3434 += class169.field1801 - var0; // L: 16
		}

		class169.field1801 = var0; // L: 18
		return var0 + class315.field3434; // L: 19
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lii;B)V",
		garbageValue = "28"
	)
	static final void method2979(Scene var0, CollisionMap[] var1) {
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
			byte[][] var45 = AbstractRasterProvider.field5260[var2]; // L: 661
			boolean var52 = true; // L: 662
			boolean var53 = true; // L: 663
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
					class420.field4590[var12][var11] = var19 - var20; // L: 679
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 682
				GrandExchangeOfferWorldComparator.Tiles_hue[var11] = 0; // L: 683
				class341.Tiles_saturation[var11] = 0; // L: 684
				class515.Tiles_lightness[var11] = 0; // L: 685
				class309.Tiles_hueMultiplier[var11] = 0; // L: 686
				class228.field2427[var11] = 0; // L: 687
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 689
				for (var12 = 0; var12 < 104; ++var12) { // L: 690
					var13 = var11 + 5; // L: 691
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 692
						var14 = (int)NPC.method2718(15); // L: 693
						var15 = Tiles.field1021[var2][var13][var12] & var14; // L: 694
						if (var15 > 0) { // L: 695
							FloorUnderlayDefinition var50 = class141.method3213(var15 - 1); // L: 696
							var10000 = GrandExchangeOfferWorldComparator.Tiles_hue; // L: 697
							var10000[var12] += var50.hue;
							var10000 = class341.Tiles_saturation; // L: 698
							var10000[var12] += var50.saturation;
							var10000 = class515.Tiles_lightness; // L: 699
							var10000[var12] += var50.lightness;
							var10000 = class309.Tiles_hueMultiplier; // L: 700
							var10000[var12] += var50.hueMultiplier;
							var10002 = class228.field2427[var12]++; // L: 701
						}
					}

					var14 = var11 - 5; // L: 704
					if (var14 >= 0 && var14 < 104) { // L: 705
						var15 = (int)NPC.method2718(15); // L: 706
						var16 = Tiles.field1021[var2][var14][var12] & var15; // L: 707
						if (var16 > 0) { // L: 708
							FloorUnderlayDefinition var51 = class141.method3213(var16 - 1); // L: 709
							var10000 = GrandExchangeOfferWorldComparator.Tiles_hue; // L: 710
							var10000[var12] -= var51.hue;
							var10000 = class341.Tiles_saturation; // L: 711
							var10000[var12] -= var51.saturation;
							var10000 = class515.Tiles_lightness; // L: 712
							var10000[var12] -= var51.lightness;
							var10000 = class309.Tiles_hueMultiplier; // L: 713
							var10000[var12] -= var51.hueMultiplier;
							var10002 = class228.field2427[var12]--; // L: 714
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 718
					var12 = 0; // L: 719
					var13 = 0; // L: 720
					var14 = 0; // L: 721
					var15 = 0; // L: 722
					var16 = 0; // L: 723

					for (var17 = -5; var17 < 109; ++var17) { // L: 724
						var18 = var17 + 5; // L: 725
						if (var18 >= 0 && var18 < 104) { // L: 726
							var12 += GrandExchangeOfferWorldComparator.Tiles_hue[var18]; // L: 727
							var13 += class341.Tiles_saturation[var18]; // L: 728
							var14 += class515.Tiles_lightness[var18]; // L: 729
							var15 += class309.Tiles_hueMultiplier[var18]; // L: 730
							var16 += class228.field2427[var18]; // L: 731
						}

						var19 = var17 - 5; // L: 733
						if (var19 >= 0 && var19 < 104) { // L: 734
							var12 -= GrandExchangeOfferWorldComparator.Tiles_hue[var19]; // L: 735
							var13 -= class341.Tiles_saturation[var19]; // L: 736
							var14 -= class515.Tiles_lightness[var19]; // L: 737
							var15 -= class309.Tiles_hueMultiplier[var19]; // L: 738
							var16 -= class228.field2427[var19]; // L: 739
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 741 742 743 744
							if (var2 < Tiles.Tiles_minPlane) { // L: 747
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)NPC.method2718(15); // L: 748
							int var21 = Tiles.field1021[var2][var11][var17] & var20; // L: 749
							int var22 = Tiles.field1011[var2][var11][var17] & var20; // L: 750
							if (var21 > 0 || var22 > 0) { // L: 751
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 752
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 753
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 754
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 755
								int var27 = class420.field4590[var11][var17]; // L: 756
								int var28 = class420.field4590[var11 + 1][var17]; // L: 757
								int var29 = class420.field4590[var11 + 1][var17 + 1]; // L: 758
								int var30 = class420.field4590[var11][var17 + 1]; // L: 759
								int var31 = -1; // L: 760
								int var32 = -1; // L: 761
								int var33;
								int var34;
								int var35;
								if (var21 > 0) { // L: 762
									var33 = var12 * 256 / var15; // L: 763
									var34 = var13 / var16; // L: 764
									var35 = var14 / var16; // L: 765
									var31 = KeyHandler.hslToRgb(var33, var34, var35); // L: 766
									var33 = var33 + Tiles.rndHue & 255; // L: 767
									var35 += Tiles.rndLightness; // L: 768
									if (var35 < 0) { // L: 769
										var35 = 0;
									} else if (var35 > 255) { // L: 770
										var35 = 255;
									}

									var32 = KeyHandler.hslToRgb(var33, var34, var35); // L: 771
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) { // L: 773
									boolean var58 = true; // L: 774
									if (var21 == 0 && class141.field1628[var2][var11][var17] != 0) { // L: 775
										var58 = false;
									}

									if (var22 > 0) { // L: 776
										var35 = var22 - 1; // L: 778
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35); // L: 780
										FloorOverlayDefinition var47;
										if (var36 != null) { // L: 781
											var47 = var36; // L: 782
										} else {
											byte[] var37 = class419.FloorOverlayDefinition_archive.takeFile(4, var35); // L: 785
											var36 = new FloorOverlayDefinition(); // L: 786
											if (var37 != null) { // L: 787
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode(); // L: 788
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35); // L: 789
											var47 = var36; // L: 790
										}

										if (!var47.hideUnderlay) { // L: 792
											var58 = false;
										}
									}

									if (var58 && var23 == var24 && var25 == var23 && var23 == var26) { // L: 794 795
										var10000 = Tiles.field1012[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 798
								if (var32 != -1) { // L: 799
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[MouseHandler.method719(var32, 96)];
								}

								if (var22 == 0) { // L: 800
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, MouseHandler.method719(var31, var27), MouseHandler.method719(var31, var28), MouseHandler.method719(var31, var29), MouseHandler.method719(var31, var30), 0, 0, 0, 0, var33, 0); // L: 801
								} else {
									var34 = class141.field1628[var2][var11][var17] + 1; // L: 804
									byte var59 = class208.field2278[var2][var11][var17]; // L: 805
									int var48 = var22 - 1; // L: 807
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var48); // L: 809
									if (var38 != null) { // L: 810
										var36 = var38; // L: 811
									} else {
										byte[] var39 = class419.FloorOverlayDefinition_archive.takeFile(4, var48); // L: 814
										var38 = new FloorOverlayDefinition(); // L: 815
										if (var39 != null) { // L: 816
											var38.decode(new Buffer(var39), var48);
										}

										var38.postDecode(); // L: 817
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var48); // L: 818
										var36 = var38; // L: 819
									}

									int var49 = var36.texture; // L: 822
									int var40;
									int var41;
									int var42;
									int var43;
									if (var49 >= 0) { // L: 825
										var41 = Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var49); // L: 826
										var40 = -1; // L: 827
									} else if (var36.primaryRgb == 16711935) { // L: 830
										var40 = -2; // L: 831
										var49 = -1; // L: 832
										var41 = -2; // L: 833
									} else {
										var40 = KeyHandler.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 836
										var42 = var36.hue + Tiles.rndHue & 255; // L: 837
										var43 = var36.lightness + Tiles.rndLightness; // L: 838
										if (var43 < 0) { // L: 839
											var43 = 0;
										} else if (var43 > 255) { // L: 840
											var43 = 255;
										}

										var41 = KeyHandler.hslToRgb(var42, var36.saturation, var43); // L: 841
									}

									var42 = 0; // L: 844
									if (var41 != -2) { // L: 845
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method678(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 846
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 847
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 848
										if (var44 < 0) { // L: 849
											var44 = 0;
										} else if (var44 > 255) { // L: 850
											var44 = 255;
										}

										var41 = KeyHandler.hslToRgb(var43, var36.secondarySaturation, var44); // L: 851
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method678(var41, 96)]; // L: 852
									}

									var0.addTile(var2, var11, var17, var34, var59, var49, var23, var24, var25, var26, MouseHandler.method719(var31, var27), MouseHandler.method719(var31, var28), MouseHandler.method719(var31, var29), MouseHandler.method719(var31, var30), GameEngine.method678(var40, var27), GameEngine.method678(var40, var28), GameEngine.method678(var40, var29), GameEngine.method678(var40, var30), var33, var42); // L: 854
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 861
				for (var12 = 1; var12 < 103; ++var12) { // L: 862
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 869
						var17 = 0; // L: 870
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 873
						var17 = var2 - 1; // L: 874
					} else {
						var17 = var2; // L: 877
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 879
				}
			}

			Tiles.field1021[var2] = null; // L: 882
			Tiles.field1011[var2] = null; // L: 883
			class141.field1628[var2] = null; // L: 884
			class208.field2278[var2] = null; // L: 885
			AbstractRasterProvider.field5260[var2] = null; // L: 886
		}

		var0.method5413(-50, -10, -50); // L: 888

		for (var2 = 0; var2 < 104; ++var2) { // L: 889
			for (var3 = 0; var3 < 104; ++var3) { // L: 890
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 891
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 894
		var3 = 2; // L: 895
		var4 = 4; // L: 896

		for (var5 = 0; var5 < 4; ++var5) { // L: 897
			if (var5 > 0) { // L: 898
				var2 <<= 3; // L: 899
				var3 <<= 3; // L: 900
				var4 <<= 3; // L: 901
			}

			for (int var54 = 0; var54 <= var5; ++var54) { // L: 903
				for (int var55 = 0; var55 <= 104; ++var55) { // L: 904
					for (int var56 = 0; var56 <= 104; ++var56) { // L: 905
						short var57;
						if ((Tiles.field1012[var54][var56][var55] & var2) != 0) { // L: 906
							var9 = var55; // L: 907
							var10 = var55; // L: 908
							var11 = var54; // L: 909

							for (var12 = var54; var9 > 0 && (Tiles.field1012[var54][var56][var9 - 1] & var2) != 0; --var9) { // L: 910 911
							}

							while (var10 < 104 && (Tiles.field1012[var54][var56][var10 + 1] & var2) != 0) { // L: 912
								++var10;
							}

							label455:
							while (var11 > 0) { // L: 913
								for (var13 = var9; var13 <= var10; ++var13) { // L: 914
									if ((Tiles.field1012[var11 - 1][var56][var13] & var2) == 0) {
										break label455;
									}
								}

								--var11; // L: 915
							}

							label444:
							while (var12 < var5) { // L: 917
								for (var13 = var9; var13 <= var10; ++var13) { // L: 918
									if ((Tiles.field1012[var12 + 1][var56][var13] & var2) == 0) {
										break label444;
									}
								}

								++var12; // L: 919
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 921
							if (var13 >= 8) { // L: 922
								var57 = 240; // L: 923
								var15 = Tiles.Tiles_heights[var12][var56][var9] - var57; // L: 924
								var16 = Tiles.Tiles_heights[var11][var56][var9]; // L: 925
								Scene.Scene_addOccluder(var5, 1, var56 * 128, var56 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 926

								for (var17 = var11; var17 <= var12; ++var17) { // L: 927
									for (var18 = var9; var18 <= var10; ++var18) { // L: 928
										var10000 = Tiles.field1012[var17][var56];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1012[var54][var56][var55] & var3) != 0) { // L: 932
							var9 = var56; // L: 933
							var10 = var56; // L: 934
							var11 = var54; // L: 935

							for (var12 = var54; var9 > 0 && (Tiles.field1012[var54][var9 - 1][var55] & var3) != 0; --var9) { // L: 936 937
							}

							while (var10 < 104 && (Tiles.field1012[var54][var10 + 1][var55] & var3) != 0) { // L: 938
								++var10;
							}

							label508:
							while (var11 > 0) { // L: 939
								for (var13 = var9; var13 <= var10; ++var13) { // L: 940
									if ((Tiles.field1012[var11 - 1][var13][var55] & var3) == 0) {
										break label508;
									}
								}

								--var11; // L: 941
							}

							label497:
							while (var12 < var5) { // L: 943
								for (var13 = var9; var13 <= var10; ++var13) { // L: 944
									if ((Tiles.field1012[var12 + 1][var13][var55] & var3) == 0) {
										break label497;
									}
								}

								++var12; // L: 945
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 947
							if (var13 >= 8) { // L: 948
								var57 = 240; // L: 949
								var15 = Tiles.Tiles_heights[var12][var9][var55] - var57; // L: 950
								var16 = Tiles.Tiles_heights[var11][var9][var55]; // L: 951
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var55 * 128, var55 * 128, var15, var16); // L: 952

								for (var17 = var11; var17 <= var12; ++var17) { // L: 953
									for (var18 = var9; var18 <= var10; ++var18) { // L: 954
										var10000 = Tiles.field1012[var17][var18];
										var10000[var55] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1012[var54][var56][var55] & var4) != 0) { // L: 958
							var9 = var56; // L: 959
							var10 = var56; // L: 960
							var11 = var55; // L: 961

							for (var12 = var55; var11 > 0 && (Tiles.field1012[var54][var56][var11 - 1] & var4) != 0; --var11) { // L: 962 963
							}

							while (var12 < 104 && (Tiles.field1012[var54][var56][var12 + 1] & var4) != 0) { // L: 964
								++var12;
							}

							label561:
							while (var9 > 0) { // L: 965
								for (var13 = var11; var13 <= var12; ++var13) { // L: 966
									if ((Tiles.field1012[var54][var9 - 1][var13] & var4) == 0) {
										break label561;
									}
								}

								--var9; // L: 967
							}

							label550:
							while (var10 < 104) { // L: 969
								for (var13 = var11; var13 <= var12; ++var13) { // L: 970
									if ((Tiles.field1012[var54][var10 + 1][var13] & var4) == 0) {
										break label550;
									}
								}

								++var10; // L: 971
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 973
								var13 = Tiles.Tiles_heights[var54][var9][var11]; // L: 974
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 975

								for (var14 = var9; var14 <= var10; ++var14) { // L: 976
									for (var15 = var11; var15 <= var12; ++var15) { // L: 977
										var10000 = Tiles.field1012[var54][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 985

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1850902540"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class359.scrollBarSprites[0].drawAt(var0, var1); // L: 11102
		class359.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11103
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field577); // L: 11104
		int var5 = var3 * (var3 - 32) / var4; // L: 11105
		if (var5 < 8) { // L: 11106
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11107
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field578); // L: 11108
		Rasterizer2D.method9736(var0, var6 + var1 + 16, var5, Client.field580); // L: 11109
		Rasterizer2D.method9736(var0 + 1, var6 + var1 + 16, var5, Client.field580); // L: 11110
		Rasterizer2D.method9749(var0, var6 + var1 + 16, 16, Client.field580); // L: 11111
		Rasterizer2D.method9749(var0, var6 + var1 + 17, 16, Client.field580); // L: 11112
		Rasterizer2D.method9736(var0 + 15, var6 + var1 + 16, var5, Client.field541); // L: 11113
		Rasterizer2D.method9736(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field541); // L: 11114
		Rasterizer2D.method9749(var0, var5 + var6 + var1 + 15, 16, Client.field541); // L: 11115
		Rasterizer2D.method9749(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field541); // L: 11116
	} // L: 11117
}
