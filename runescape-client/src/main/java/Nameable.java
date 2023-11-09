import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -313022235
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "1550816169"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lqy;",
		garbageValue = "1102"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "187"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1901319216"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lqy;Lqy;B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1); // L: 36
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgy;[Lgl;B)V",
		garbageValue = "2"
	)
	static final void method6633(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 646
			for (var3 = 0; var3 < 104; ++var3) { // L: 647
				for (var4 = 0; var4 < 104; ++var4) { // L: 648
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 649
						var5 = var2; // L: 650
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 651
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 652
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 657
		if (Tiles.rndHue < -8) { // L: 658
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 659
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 660
		if (Tiles.rndLightness < -16) { // L: 661
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 662
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 663
			byte[][] var44 = Tiles.field975[var2]; // L: 664
			boolean var50 = true; // L: 665
			boolean var51 = true; // L: 666
			boolean var6 = true; // L: 667
			boolean var7 = true; // L: 668
			boolean var8 = true; // L: 669
			var9 = (int)Math.sqrt(5100.0D); // L: 670
			var10 = var9 * 768 >> 8; // L: 671

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 672
				for (var12 = 1; var12 < 103; ++var12) { // L: 673
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 674
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 675
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 676
					var16 = (var13 << 8) / var15; // L: 677
					var17 = 65536 / var15; // L: 678
					var18 = (var14 << 8) / var15; // L: 679
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 680
					var20 = (var44[var12][var11 + 1] >> 3) + (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11] >> 1); // L: 681
					class135.field1587[var12][var11] = var19 - var20; // L: 682
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 685
				class121.Tiles_hue[var11] = 0; // L: 686
				Login.Tiles_saturation[var11] = 0; // L: 687
				GrandExchangeEvents.Tiles_lightness[var11] = 0; // L: 688
				PcmPlayer.Tiles_hueMultiplier[var11] = 0; // L: 689
				FaceNormal.field2453[var11] = 0; // L: 690
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 692
				for (var12 = 0; var12 < 104; ++var12) { // L: 693
					var13 = var11 + 5; // L: 694
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 695
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255; // L: 696
						if (var14 > 0) { // L: 697
							FloorUnderlayDefinition var48 = KeyHandler.method328(var14 - 1); // L: 698
							var10000 = class121.Tiles_hue; // L: 699
							var10000[var12] += var48.hue;
							var10000 = Login.Tiles_saturation; // L: 700
							var10000[var12] += var48.saturation;
							var10000 = GrandExchangeEvents.Tiles_lightness; // L: 701
							var10000[var12] += var48.lightness;
							var10000 = PcmPlayer.Tiles_hueMultiplier; // L: 702
							var10000[var12] += var48.hueMultiplier;
							var10002 = FaceNormal.field2453[var12]++; // L: 703
						}
					}

					var14 = var11 - 5; // L: 706
					if (var14 >= 0 && var14 < 104) { // L: 707
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255; // L: 708
						if (var15 > 0) { // L: 709
							FloorUnderlayDefinition var49 = KeyHandler.method328(var15 - 1); // L: 710
							var10000 = class121.Tiles_hue; // L: 711
							var10000[var12] -= var49.hue;
							var10000 = Login.Tiles_saturation; // L: 712
							var10000[var12] -= var49.saturation;
							var10000 = GrandExchangeEvents.Tiles_lightness; // L: 713
							var10000[var12] -= var49.lightness;
							var10000 = PcmPlayer.Tiles_hueMultiplier; // L: 714
							var10000[var12] -= var49.hueMultiplier;
							var10002 = FaceNormal.field2453[var12]--; // L: 715
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 719
					var12 = 0; // L: 720
					var13 = 0; // L: 721
					var14 = 0; // L: 722
					var15 = 0; // L: 723
					var16 = 0; // L: 724

					for (var17 = -5; var17 < 109; ++var17) { // L: 725
						var18 = var17 + 5; // L: 726
						if (var18 >= 0 && var18 < 104) { // L: 727
							var12 += class121.Tiles_hue[var18]; // L: 728
							var13 += Login.Tiles_saturation[var18]; // L: 729
							var14 += GrandExchangeEvents.Tiles_lightness[var18]; // L: 730
							var15 += PcmPlayer.Tiles_hueMultiplier[var18]; // L: 731
							var16 += FaceNormal.field2453[var18]; // L: 732
						}

						var19 = var17 - 5; // L: 734
						if (var19 >= 0 && var19 < 104) { // L: 735
							var12 -= class121.Tiles_hue[var19]; // L: 736
							var13 -= Login.Tiles_saturation[var19]; // L: 737
							var14 -= GrandExchangeEvents.Tiles_lightness[var19]; // L: 738
							var15 -= PcmPlayer.Tiles_hueMultiplier[var19]; // L: 739
							var16 -= FaceNormal.field2453[var19]; // L: 740
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 742 743 744 745
							if (var2 < Tiles.Tiles_minPlane) { // L: 748
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255; // L: 749
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255; // L: 750
							if (var20 > 0 || var21 > 0) { // L: 751
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 752
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 753
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 754
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 755
								int var26 = class135.field1587[var11][var17]; // L: 756
								int var27 = class135.field1587[var11 + 1][var17]; // L: 757
								int var28 = class135.field1587[var11 + 1][var17 + 1]; // L: 758
								int var29 = class135.field1587[var11][var17 + 1]; // L: 759
								int var30 = -1; // L: 760
								int var31 = -1; // L: 761
								int var32;
								int var33;
								int var34;
								if (var20 > 0) { // L: 762
									var32 = var12 * 256 / var15; // L: 763
									var33 = var13 / var16; // L: 764
									var34 = var14 / var16; // L: 765
									var30 = class17.hslToRgb(var32, var33, var34); // L: 766
									var32 = var32 + Tiles.rndHue & 255; // L: 767
									var34 += Tiles.rndLightness; // L: 768
									if (var34 < 0) { // L: 769
										var34 = 0;
									} else if (var34 > 255) { // L: 770
										var34 = 255;
									}

									var31 = class17.hslToRgb(var32, var33, var34); // L: 771
								}

								FloorOverlayDefinition var35;
								if (var2 > 0) { // L: 773
									boolean var56 = true; // L: 774
									if (var20 == 0 && AbstractUserComparator.Tiles_shapes[var2][var11][var17] != 0) { // L: 775
										var56 = false;
									}

									if (var21 > 0) { // L: 776
										var34 = var21 - 1; // L: 778
										var35 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var34); // L: 780
										FloorOverlayDefinition var45;
										if (var35 != null) { // L: 781
											var45 = var35; // L: 782
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34); // L: 785
											var35 = new FloorOverlayDefinition(); // L: 786
											if (var36 != null) { // L: 787
												var35.decode(new Buffer(var36), var34);
											}

											var35.postDecode(); // L: 788
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, (long)var34); // L: 789
											var45 = var35; // L: 790
										}

										if (!var45.hideUnderlay) { // L: 792
											var56 = false;
										}
									}

									if (var56 && var23 == var22 && var22 == var24 && var25 == var22) { // L: 794 795
										var10000 = class17.field92[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 798
								if (var31 != -1) { // L: 799
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method3531(var31, 96)];
								}

								if (var21 == 0) { // L: 800
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, StructComposition.method3531(var30, var26), StructComposition.method3531(var30, var27), StructComposition.method3531(var30, var28), StructComposition.method3531(var30, var29), 0, 0, 0, 0, var32, 0); // L: 801
								} else {
									var33 = AbstractUserComparator.Tiles_shapes[var2][var11][var17] + 1; // L: 804
									byte var57 = GrandExchangeOfferOwnWorldComparator.field473[var2][var11][var17]; // L: 805
									int var46 = var21 - 1; // L: 807
									FloorOverlayDefinition var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var46); // L: 809
									if (var37 != null) { // L: 810
										var35 = var37; // L: 811
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46); // L: 814
										var37 = new FloorOverlayDefinition(); // L: 815
										if (var38 != null) { // L: 816
											var37.decode(new Buffer(var38), var46);
										}

										var37.postDecode(); // L: 817
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var46); // L: 818
										var35 = var37; // L: 819
									}

									int var47 = var35.texture; // L: 822
									int var39;
									int var40;
									int var41;
									int var42;
									if (var47 >= 0) { // L: 825
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47); // L: 826
										var39 = -1; // L: 827
									} else if (var35.primaryRgb == 16711935) { // L: 830
										var39 = -2; // L: 831
										var47 = -1; // L: 832
										var40 = -2; // L: 833
									} else {
										var39 = class17.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 836
										var41 = var35.hue + Tiles.rndHue & 255; // L: 837
										var42 = var35.lightness + Tiles.rndLightness; // L: 838
										if (var42 < 0) { // L: 839
											var42 = 0;
										} else if (var42 > 255) { // L: 840
											var42 = 255;
										}

										var40 = class17.hslToRgb(var41, var35.saturation, var42); // L: 841
									}

									var41 = 0; // L: 844
									if (var40 != -2) { // L: 845
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method430(var40, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 846
										var42 = var35.secondaryHue + Tiles.rndHue & 255; // L: 847
										int var43 = var35.secondaryLightness + Tiles.rndLightness; // L: 848
										if (var43 < 0) { // L: 849
											var43 = 0;
										} else if (var43 > 255) { // L: 850
											var43 = 255;
										}

										var40 = class17.hslToRgb(var42, var35.secondarySaturation, var43); // L: 851
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method430(var40, 96)]; // L: 852
									}

									var0.addTile(var2, var11, var17, var33, var57, var47, var22, var23, var24, var25, StructComposition.method3531(var30, var26), StructComposition.method3531(var30, var27), StructComposition.method3531(var30, var28), StructComposition.method3531(var30, var29), GameEngine.method430(var39, var26), GameEngine.method430(var39, var27), GameEngine.method430(var39, var28), GameEngine.method430(var39, var29), var32, var41); // L: 854
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 861
				for (var12 = 1; var12 < 103; ++var12) { // L: 862
					var0.setTileMinPlane(var2, var12, var11, WorldMapSection1.method4951(var2, var12, var11)); // L: 863
				}
			}

			Tiles.Tiles_underlays[var2] = null; // L: 866
			Tiles.Tiles_overlays[var2] = null; // L: 867
			AbstractUserComparator.Tiles_shapes[var2] = null; // L: 868
			GrandExchangeOfferOwnWorldComparator.field473[var2] = null; // L: 869
			Tiles.field975[var2] = null; // L: 870
		}

		var0.method4082(-50, -10, -50); // L: 872

		for (var2 = 0; var2 < 104; ++var2) { // L: 873
			for (var3 = 0; var3 < 104; ++var3) { // L: 874
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 875
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 878
		var3 = 2; // L: 879
		var4 = 4; // L: 880

		for (var5 = 0; var5 < 4; ++var5) { // L: 881
			if (var5 > 0) { // L: 882
				var2 <<= 3; // L: 883
				var3 <<= 3; // L: 884
				var4 <<= 3; // L: 885
			}

			for (int var52 = 0; var52 <= var5; ++var52) { // L: 887
				for (int var53 = 0; var53 <= 104; ++var53) { // L: 888
					for (int var54 = 0; var54 <= 104; ++var54) { // L: 889
						short var55;
						if ((class17.field92[var52][var54][var53] & var2) != 0) { // L: 890
							var9 = var53; // L: 891
							var10 = var53; // L: 892
							var11 = var52; // L: 893

							for (var12 = var52; var9 > 0 && (class17.field92[var52][var54][var9 - 1] & var2) != 0; --var9) { // L: 894 895
							}

							while (var10 < 104 && (class17.field92[var52][var54][var10 + 1] & var2) != 0) { // L: 896
								++var10;
							}

							label445:
							while (var11 > 0) { // L: 897
								for (var13 = var9; var13 <= var10; ++var13) { // L: 898
									if ((class17.field92[var11 - 1][var54][var13] & var2) == 0) {
										break label445;
									}
								}

								--var11; // L: 899
							}

							label434:
							while (var12 < var5) { // L: 901
								for (var13 = var9; var13 <= var10; ++var13) { // L: 902
									if ((class17.field92[var12 + 1][var54][var13] & var2) == 0) {
										break label434;
									}
								}

								++var12; // L: 903
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 905
							if (var13 >= 8) { // L: 906
								var55 = 240; // L: 907
								var15 = Tiles.Tiles_heights[var12][var54][var9] - var55; // L: 908
								var16 = Tiles.Tiles_heights[var11][var54][var9]; // L: 909
								Scene.Scene_addOccluder(var5, 1, var54 * 128, var54 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 910

								for (var17 = var11; var17 <= var12; ++var17) { // L: 911
									for (var18 = var9; var18 <= var10; ++var18) { // L: 912
										var10000 = class17.field92[var17][var54];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class17.field92[var52][var54][var53] & var3) != 0) { // L: 916
							var9 = var54; // L: 917
							var10 = var54; // L: 918
							var11 = var52; // L: 919

							for (var12 = var52; var9 > 0 && (class17.field92[var52][var9 - 1][var53] & var3) != 0; --var9) { // L: 920 921
							}

							while (var10 < 104 && (class17.field92[var52][var10 + 1][var53] & var3) != 0) { // L: 922
								++var10;
							}

							label498:
							while (var11 > 0) { // L: 923
								for (var13 = var9; var13 <= var10; ++var13) { // L: 924
									if ((class17.field92[var11 - 1][var13][var53] & var3) == 0) {
										break label498;
									}
								}

								--var11; // L: 925
							}

							label487:
							while (var12 < var5) { // L: 927
								for (var13 = var9; var13 <= var10; ++var13) { // L: 928
									if ((class17.field92[var12 + 1][var13][var53] & var3) == 0) {
										break label487;
									}
								}

								++var12; // L: 929
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 931
							if (var13 >= 8) { // L: 932
								var55 = 240; // L: 933
								var15 = Tiles.Tiles_heights[var12][var9][var53] - var55; // L: 934
								var16 = Tiles.Tiles_heights[var11][var9][var53]; // L: 935
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var53 * 128, var53 * 128, var15, var16); // L: 936

								for (var17 = var11; var17 <= var12; ++var17) { // L: 937
									for (var18 = var9; var18 <= var10; ++var18) { // L: 938
										var10000 = class17.field92[var17][var18];
										var10000[var53] &= ~var3;
									}
								}
							}
						}

						if ((class17.field92[var52][var54][var53] & var4) != 0) { // L: 942
							var9 = var54; // L: 943
							var10 = var54; // L: 944
							var11 = var53; // L: 945

							for (var12 = var53; var11 > 0 && (class17.field92[var52][var54][var11 - 1] & var4) != 0; --var11) { // L: 946 947
							}

							while (var12 < 104 && (class17.field92[var52][var54][var12 + 1] & var4) != 0) { // L: 948
								++var12;
							}

							label551:
							while (var9 > 0) { // L: 949
								for (var13 = var11; var13 <= var12; ++var13) { // L: 950
									if ((class17.field92[var52][var9 - 1][var13] & var4) == 0) {
										break label551;
									}
								}

								--var9; // L: 951
							}

							label540:
							while (var10 < 104) { // L: 953
								for (var13 = var11; var13 <= var12; ++var13) { // L: 954
									if ((class17.field92[var52][var10 + 1][var13] & var4) == 0) {
										break label540;
									}
								}

								++var10; // L: 955
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 957
								var13 = Tiles.Tiles_heights[var52][var9][var11]; // L: 958
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 959

								for (var14 = var9; var14 <= var10; ++var14) { // L: 960
									for (var15 = var11; var15 <= var12; ++var15) { // L: 961
										var10000 = class17.field92[var52][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 969
}
