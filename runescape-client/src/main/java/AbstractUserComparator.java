import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ay")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	} // L: 8

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "2023236765"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) { // L: 11
			this.nextComparator = var1; // L: 12
		} else if (this.nextComparator instanceof AbstractUserComparator) { // L: 14
			((AbstractUserComparator)this.nextComparator).addComparator(var1); // L: 15
		}

	} // L: 17

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;I)I",
		garbageValue = "1411068838"
	)
	@Export("compareUser")
	protected final int compareUser(Nameable var1, Nameable var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2); // L: 20 21
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Liz;[Lij;I)V",
		garbageValue = "875823996"
	)
	static final void method7982(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 594
			for (var3 = 0; var3 < 104; ++var3) { // L: 595
				for (var4 = 0; var4 < 104; ++var4) { // L: 596
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 597
						var5 = var2; // L: 598
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 599
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 600
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 605
		if (Tiles.rndHue < -8) { // L: 606
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 607
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 608
		if (Tiles.rndLightness < -16) { // L: 609
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 610
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 611
			byte[][] var45 = InvDefinition.field1899[var2]; // L: 612
			boolean var52 = true; // L: 613
			boolean var53 = true; // L: 614
			boolean var6 = true; // L: 615
			boolean var7 = true; // L: 616
			boolean var8 = true; // L: 617
			var9 = (int)Math.sqrt(5100.0D); // L: 618
			var10 = var9 * 768 >> 8; // L: 619

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 620
				for (var12 = 1; var12 < 103; ++var12) { // L: 621
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 622
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 623
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 624
					var16 = (var13 << 8) / var15; // L: 625
					var17 = 65536 / var15; // L: 626
					var18 = (var14 << 8) / var15; // L: 627
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 628
					var20 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1); // L: 629
					class135.field1601[var12][var11] = var19 - var20; // L: 630
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 633
				class172.Tiles_hue[var11] = 0; // L: 634
				GameBuild.Tiles_saturation[var11] = 0; // L: 635
				Tiles.Tiles_lightness[var11] = 0; // L: 636
				Language.Tiles_hueMultiplier[var11] = 0; // L: 637
				class159.field1755[var11] = 0; // L: 638
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 640
				for (var12 = 0; var12 < 104; ++var12) { // L: 641
					var13 = var11 + 5; // L: 642
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 643
						var14 = (int)Client.method1805(15); // L: 644
						var15 = Tiles.field1024[var2][var13][var12] & var14; // L: 645
						if (var15 > 0) { // L: 646
							var17 = var15 - 1; // L: 648
							FloorUnderlayDefinition var47 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 650
							FloorUnderlayDefinition var49;
							if (var47 != null) { // L: 651
								var49 = var47; // L: 652
							} else {
								byte[] var48 = FloorUnderlayDefinition.field2079.takeFile(1, var17); // L: 655
								var47 = new FloorUnderlayDefinition(); // L: 656
								if (var48 != null) { // L: 657
									var47.decode(new Buffer(var48), var17);
								}

								var47.postDecode(); // L: 658
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var47, (long)var17); // L: 659
								var49 = var47; // L: 660
							}

							var10000 = class172.Tiles_hue; // L: 663
							var10000[var12] += var49.hue;
							var10000 = GameBuild.Tiles_saturation; // L: 664
							var10000[var12] += var49.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 665
							var10000[var12] += var49.lightness;
							var10000 = Language.Tiles_hueMultiplier; // L: 666
							var10000[var12] += var49.hueMultiplier;
							var10002 = class159.field1755[var12]++; // L: 667
						}
					}

					var14 = var11 - 5; // L: 670
					if (var14 >= 0 && var14 < 104) { // L: 671
						var15 = (int)Client.method1805(15); // L: 672
						var16 = Tiles.field1024[var2][var14][var12] & var15; // L: 673
						if (var16 > 0) { // L: 674
							var18 = var16 - 1; // L: 676
							FloorUnderlayDefinition var60 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18); // L: 678
							FloorUnderlayDefinition var51;
							if (var60 != null) { // L: 679
								var51 = var60; // L: 680
							} else {
								byte[] var50 = FloorUnderlayDefinition.field2079.takeFile(1, var18); // L: 683
								var60 = new FloorUnderlayDefinition(); // L: 684
								if (var50 != null) { // L: 685
									var60.decode(new Buffer(var50), var18);
								}

								var60.postDecode(); // L: 686
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var60, (long)var18); // L: 687
								var51 = var60; // L: 688
							}

							var10000 = class172.Tiles_hue; // L: 691
							var10000[var12] -= var51.hue;
							var10000 = GameBuild.Tiles_saturation; // L: 692
							var10000[var12] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 693
							var10000[var12] -= var51.lightness;
							var10000 = Language.Tiles_hueMultiplier; // L: 694
							var10000[var12] -= var51.hueMultiplier;
							var10002 = class159.field1755[var12]--; // L: 695
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 699
					var12 = 0; // L: 700
					var13 = 0; // L: 701
					var14 = 0; // L: 702
					var15 = 0; // L: 703
					var16 = 0; // L: 704

					for (var17 = -5; var17 < 109; ++var17) { // L: 705
						var18 = var17 + 5; // L: 706
						if (var18 >= 0 && var18 < 104) { // L: 707
							var12 += class172.Tiles_hue[var18]; // L: 708
							var13 += GameBuild.Tiles_saturation[var18]; // L: 709
							var14 += Tiles.Tiles_lightness[var18]; // L: 710
							var15 += Language.Tiles_hueMultiplier[var18]; // L: 711
							var16 += class159.field1755[var18]; // L: 712
						}

						var19 = var17 - 5; // L: 714
						if (var19 >= 0 && var19 < 104) { // L: 715
							var12 -= class172.Tiles_hue[var19]; // L: 716
							var13 -= GameBuild.Tiles_saturation[var19]; // L: 717
							var14 -= Tiles.Tiles_lightness[var19]; // L: 718
							var15 -= Language.Tiles_hueMultiplier[var19]; // L: 719
							var16 -= class159.field1755[var19]; // L: 720
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 722 723 724 725
							if (var2 < Tiles.Tiles_minPlane) { // L: 728
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)Client.method1805(15); // L: 729
							int var21 = Tiles.field1024[var2][var11][var17] & var20; // L: 730
							int var22 = Tiles.field1025[var2][var11][var17] & var20; // L: 731
							if (var21 > 0 || var22 > 0) { // L: 732
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 733
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 734
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 735
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 736
								int var27 = class135.field1601[var11][var17]; // L: 737
								int var28 = class135.field1601[var11 + 1][var17]; // L: 738
								int var29 = class135.field1601[var11 + 1][var17 + 1]; // L: 739
								int var30 = class135.field1601[var11][var17 + 1]; // L: 740
								int var31 = -1; // L: 741
								int var32 = -1; // L: 742
								int var33;
								int var34;
								if (var21 > 0) { // L: 743
									var33 = var12 * 256 / var15; // L: 744
									var34 = var13 / var16; // L: 745
									int var35 = var14 / var16; // L: 746
									var31 = class36.hslToRgb(var33, var34, var35); // L: 747
									var33 = var33 + Tiles.rndHue & 255; // L: 748
									var35 += Tiles.rndLightness; // L: 749
									if (var35 < 0) { // L: 750
										var35 = 0;
									} else if (var35 > 255) { // L: 751
										var35 = 255;
									}

									var32 = class36.hslToRgb(var33, var34, var35); // L: 752
								}

								if (var2 > 0) { // L: 754
									boolean var58 = true; // L: 755
									if (var21 == 0 && class19.field104[var2][var11][var17] != 0) { // L: 756
										var58 = false;
									}

									if (var22 > 0 && !class131.method3024(var22 - 1).hideUnderlay) { // L: 757
										var58 = false;
									}

									if (var58 && var23 == var24 && var23 == var25 && var23 == var26) { // L: 758 759
										var10000 = BufferedNetSocket.field4681[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 762
								if (var32 != -1) { // L: 763
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[class421.method7817(var32, 96)];
								}

								if (var22 == 0) { // L: 764
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, class421.method7817(var31, var27), class421.method7817(var31, var28), class421.method7817(var31, var29), class421.method7817(var31, var30), 0, 0, 0, 0, var33, 0); // L: 765
								} else {
									var34 = class19.field104[var2][var11][var17] + 1; // L: 768
									byte var59 = UserComparator10.field1474[var2][var11][var17]; // L: 769
									int var37 = var22 - 1; // L: 771
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37); // L: 773
									FloorOverlayDefinition var36;
									if (var38 != null) { // L: 774
										var36 = var38; // L: 775
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37); // L: 778
										var38 = new FloorOverlayDefinition(); // L: 779
										if (var39 != null) { // L: 780
											var38.decode(new Buffer(var39), var37);
										}

										var38.postDecode(); // L: 781
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37); // L: 782
										var36 = var38; // L: 783
									}

									int var46 = var36.texture; // L: 786
									int var40;
									int var41;
									int var42;
									int var43;
									if (var46 >= 0) { // L: 789
										var41 = Rasterizer3D.field2510.Rasterizer3D_textureLoader.getAverageTextureRGB(var46); // L: 790
										var40 = -1; // L: 791
									} else if (var36.primaryRgb == 16711935) { // L: 794
										var40 = -2; // L: 795
										var46 = -1; // L: 796
										var41 = -2; // L: 797
									} else {
										var40 = class36.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 800
										var42 = var36.hue + Tiles.rndHue & 255; // L: 801
										var43 = var36.lightness + Tiles.rndLightness; // L: 802
										if (var43 < 0) { // L: 803
											var43 = 0;
										} else if (var43 > 255) { // L: 804
											var43 = 255;
										}

										var41 = class36.hslToRgb(var42, var36.saturation, var43); // L: 805
									}

									var42 = 0; // L: 808
									if (var41 != -2) { // L: 809
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class271.method5517(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 810
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 811
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 812
										if (var44 < 0) { // L: 813
											var44 = 0;
										} else if (var44 > 255) { // L: 814
											var44 = 255;
										}

										var41 = class36.hslToRgb(var43, var36.secondarySaturation, var44); // L: 815
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class271.method5517(var41, 96)]; // L: 816
									}

									var0.addTile(var2, var11, var17, var34, var59, var46, var23, var24, var25, var26, class421.method7817(var31, var27), class421.method7817(var31, var28), class421.method7817(var31, var29), class421.method7817(var31, var30), class271.method5517(var40, var27), class271.method5517(var40, var28), class271.method5517(var40, var29), class271.method5517(var40, var30), var33, var42); // L: 818
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 825
				for (var12 = 1; var12 < 103; ++var12) { // L: 826
					var0.setTileMinPlane(var2, var12, var11, class399.method7610(var2, var12, var11)); // L: 827
				}
			}

			Tiles.field1024[var2] = null; // L: 830
			Tiles.field1025[var2] = null; // L: 831
			class19.field104[var2] = null; // L: 832
			UserComparator10.field1474[var2] = null; // L: 833
			InvDefinition.field1899[var2] = null; // L: 834
		}

		var0.method4590(-50, -10, -50); // L: 836

		for (var2 = 0; var2 < 104; ++var2) { // L: 837
			for (var3 = 0; var3 < 104; ++var3) { // L: 838
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 839
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 842
		var3 = 2; // L: 843
		var4 = 4; // L: 844

		for (var5 = 0; var5 < 4; ++var5) { // L: 845
			if (var5 > 0) { // L: 846
				var2 <<= 3; // L: 847
				var3 <<= 3; // L: 848
				var4 <<= 3; // L: 849
			}

			for (int var54 = 0; var54 <= var5; ++var54) { // L: 851
				for (int var55 = 0; var55 <= 104; ++var55) { // L: 852
					for (int var56 = 0; var56 <= 104; ++var56) { // L: 853
						short var57;
						if ((BufferedNetSocket.field4681[var54][var56][var55] & var2) != 0) { // L: 854
							var9 = var55; // L: 855
							var10 = var55; // L: 856
							var11 = var54; // L: 857

							for (var12 = var54; var9 > 0 && (BufferedNetSocket.field4681[var54][var56][var9 - 1] & var2) != 0; --var9) { // L: 858 859
							}

							while (var10 < 104 && (BufferedNetSocket.field4681[var54][var56][var10 + 1] & var2) != 0) { // L: 860
								++var10;
							}

							label455:
							while (var11 > 0) { // L: 861
								for (var13 = var9; var13 <= var10; ++var13) { // L: 862
									if ((BufferedNetSocket.field4681[var11 - 1][var56][var13] & var2) == 0) {
										break label455;
									}
								}

								--var11; // L: 863
							}

							label444:
							while (var12 < var5) { // L: 865
								for (var13 = var9; var13 <= var10; ++var13) { // L: 866
									if ((BufferedNetSocket.field4681[var12 + 1][var56][var13] & var2) == 0) {
										break label444;
									}
								}

								++var12; // L: 867
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 869
							if (var13 >= 8) { // L: 870
								var57 = 240; // L: 871
								var15 = Tiles.Tiles_heights[var12][var56][var9] - var57; // L: 872
								var16 = Tiles.Tiles_heights[var11][var56][var9]; // L: 873
								Scene.Scene_addOccluder(var5, 1, var56 * 128, var56 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 874

								for (var17 = var11; var17 <= var12; ++var17) { // L: 875
									for (var18 = var9; var18 <= var10; ++var18) { // L: 876
										var10000 = BufferedNetSocket.field4681[var17][var56];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4681[var54][var56][var55] & var3) != 0) { // L: 880
							var9 = var56; // L: 881
							var10 = var56; // L: 882
							var11 = var54; // L: 883

							for (var12 = var54; var9 > 0 && (BufferedNetSocket.field4681[var54][var9 - 1][var55] & var3) != 0; --var9) { // L: 884 885
							}

							while (var10 < 104 && (BufferedNetSocket.field4681[var54][var10 + 1][var55] & var3) != 0) { // L: 886
								++var10;
							}

							label508:
							while (var11 > 0) { // L: 887
								for (var13 = var9; var13 <= var10; ++var13) { // L: 888
									if ((BufferedNetSocket.field4681[var11 - 1][var13][var55] & var3) == 0) {
										break label508;
									}
								}

								--var11; // L: 889
							}

							label497:
							while (var12 < var5) { // L: 891
								for (var13 = var9; var13 <= var10; ++var13) { // L: 892
									if ((BufferedNetSocket.field4681[var12 + 1][var13][var55] & var3) == 0) {
										break label497;
									}
								}

								++var12; // L: 893
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 895
							if (var13 >= 8) { // L: 896
								var57 = 240; // L: 897
								var15 = Tiles.Tiles_heights[var12][var9][var55] - var57; // L: 898
								var16 = Tiles.Tiles_heights[var11][var9][var55]; // L: 899
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var55 * 128, var55 * 128, var15, var16); // L: 900

								for (var17 = var11; var17 <= var12; ++var17) { // L: 901
									for (var18 = var9; var18 <= var10; ++var18) { // L: 902
										var10000 = BufferedNetSocket.field4681[var17][var18];
										var10000[var55] &= ~var3;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4681[var54][var56][var55] & var4) != 0) { // L: 906
							var9 = var56; // L: 907
							var10 = var56; // L: 908
							var11 = var55; // L: 909

							for (var12 = var55; var11 > 0 && (BufferedNetSocket.field4681[var54][var56][var11 - 1] & var4) != 0; --var11) { // L: 910 911
							}

							while (var12 < 104 && (BufferedNetSocket.field4681[var54][var56][var12 + 1] & var4) != 0) { // L: 912
								++var12;
							}

							label561:
							while (var9 > 0) { // L: 913
								for (var13 = var11; var13 <= var12; ++var13) { // L: 914
									if ((BufferedNetSocket.field4681[var54][var9 - 1][var13] & var4) == 0) {
										break label561;
									}
								}

								--var9; // L: 915
							}

							label550:
							while (var10 < 104) { // L: 917
								for (var13 = var11; var13 <= var12; ++var13) { // L: 918
									if ((BufferedNetSocket.field4681[var54][var10 + 1][var13] & var4) == 0) {
										break label550;
									}
								}

								++var10; // L: 919
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 921
								var13 = Tiles.Tiles_heights[var54][var9][var11]; // L: 922
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 923

								for (var14 = var9; var14 <= var10; ++var14) { // L: 924
									for (var15 = var11; var15 <= var12; ++var15) { // L: 925
										var10000 = BufferedNetSocket.field4681[var54][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 933
}
