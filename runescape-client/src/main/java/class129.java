import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class129 implements Callable {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1026582299
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1065394883
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static TextureProvider field1544;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class130 field1543;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class131 field1540;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class132 field1541;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1155375763
	)
	final int field1542;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class137 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;Lfh;Lft;Lfs;I)V"
	)
	class129(class137 var1, class130 var2, class131 var3, class132 var4, int var5) {
		this.this$0 = var1; // L: 277
		this.field1543 = var2; // L: 278
		this.field1540 = var3; // L: 279
		this.field1541 = var4; // L: 280
		this.field1542 = var5; // L: 281
	} // L: 282

	public Object call() {
		this.field1543.method2993(); // L: 286
		class130[][] var1;
		if (this.field1540 == class131.field1581) { // L: 288
			var1 = this.this$0.field1621; // L: 289
		} else {
			var1 = this.this$0.field1627; // L: 292
		}

		var1[this.field1542][this.field1541.method3036()] = this.field1543; // L: 294
		return null; // L: 295
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liv;[Lis;I)V",
		garbageValue = "2010483961"
	)
	static final void method2989(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 590
			for (var3 = 0; var3 < 104; ++var3) { // L: 591
				for (var4 = 0; var4 < 104; ++var4) { // L: 592
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 593
						var5 = var2; // L: 594
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 595
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 596
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 601
		if (Tiles.rndHue < -8) { // L: 602
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 603
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 604
		if (Tiles.rndLightness < -16) { // L: 605
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 606
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 607
			byte[][] var47 = class217.field2409[var2]; // L: 608
			boolean var60 = true; // L: 609
			boolean var61 = true; // L: 610
			boolean var6 = true; // L: 611
			boolean var7 = true; // L: 612
			boolean var8 = true; // L: 613
			var9 = (int)Math.sqrt(5100.0D); // L: 614
			var10 = var9 * 768 >> 8; // L: 615

			int var19;
			int var57;
			for (var11 = 1; var11 < 103; ++var11) { // L: 616
				for (var12 = 1; var12 < 103; ++var12) { // L: 617
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 618
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 619
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 620
					var16 = (var13 << 8) / var15; // L: 621
					var17 = 65536 / var15; // L: 622
					var18 = (var14 << 8) / var15; // L: 623
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 624
					var57 = (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11 + 1] >> 3) + (var47[var12][var11] >> 1); // L: 625
					class162.field1794[var12][var11] = var19 - var57; // L: 626
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 629
				Fonts.Tiles_hue[var11] = 0; // L: 630
				class466.Tiles_saturation[var11] = 0; // L: 631
				Tiles.Tiles_lightness[var11] = 0; // L: 632
				class128.Tiles_hueMultiplier[var11] = 0; // L: 633
				Interpreter.field888[var11] = 0; // L: 634
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 636
				for (var12 = 0; var12 < 104; ++var12) { // L: 637
					var13 = var11 + 5; // L: 638
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 639
						long var51 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 645
						var16 = (int)var51; // L: 647
						var17 = Tiles.field1040[var2][var13][var12] & var16; // L: 648
						if (var17 > 0) { // L: 649
							var19 = var17 - 1; // L: 651
							FloorUnderlayDefinition var53 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19); // L: 653
							FloorUnderlayDefinition var54;
							if (var53 != null) { // L: 654
								var54 = var53; // L: 655
							} else {
								byte[] var21 = FloorUnderlayDefinition.field2112.takeFile(1, var19); // L: 658
								var53 = new FloorUnderlayDefinition(); // L: 659
								if (var21 != null) { // L: 660
									var53.decode(new Buffer(var21), var19);
								}

								var53.postDecode(); // L: 661
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var53, (long)var19); // L: 662
								var54 = var53; // L: 663
							}

							var10000 = Fonts.Tiles_hue; // L: 666
							var10000[var12] += var54.hue;
							var10000 = class466.Tiles_saturation; // L: 667
							var10000[var12] += var54.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 668
							var10000[var12] += var54.lightness;
							var10000 = class128.Tiles_hueMultiplier; // L: 669
							var10000[var12] += var54.hueMultiplier;
							var10002 = Interpreter.field888[var12]++; // L: 670
						}
					}

					var14 = var11 - 5; // L: 673
					if (var14 >= 0 && var14 < 104) { // L: 674
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 680
						var17 = (int)var55; // L: 682
						var18 = Tiles.field1040[var2][var14][var12] & var17; // L: 683
						if (var18 > 0) { // L: 684
							var57 = var18 - 1; // L: 686
							FloorUnderlayDefinition var66 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var57); // L: 688
							FloorUnderlayDefinition var59;
							if (var66 != null) { // L: 689
								var59 = var66; // L: 690
							} else {
								byte[] var58 = FloorUnderlayDefinition.field2112.takeFile(1, var57); // L: 693
								var66 = new FloorUnderlayDefinition(); // L: 694
								if (var58 != null) { // L: 695
									var66.decode(new Buffer(var58), var57);
								}

								var66.postDecode(); // L: 696
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var66, (long)var57); // L: 697
								var59 = var66; // L: 698
							}

							var10000 = Fonts.Tiles_hue; // L: 701
							var10000[var12] -= var59.hue;
							var10000 = class466.Tiles_saturation; // L: 702
							var10000[var12] -= var59.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 703
							var10000[var12] -= var59.lightness;
							var10000 = class128.Tiles_hueMultiplier; // L: 704
							var10000[var12] -= var59.hueMultiplier;
							var10002 = Interpreter.field888[var12]--; // L: 705
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 709
					var12 = 0; // L: 710
					var13 = 0; // L: 711
					var14 = 0; // L: 712
					var15 = 0; // L: 713
					var16 = 0; // L: 714

					for (var17 = -5; var17 < 109; ++var17) { // L: 715
						var18 = var17 + 5; // L: 716
						if (var18 >= 0 && var18 < 104) { // L: 717
							var12 += Fonts.Tiles_hue[var18]; // L: 718
							var13 += class466.Tiles_saturation[var18]; // L: 719
							var14 += Tiles.Tiles_lightness[var18]; // L: 720
							var15 += class128.Tiles_hueMultiplier[var18]; // L: 721
							var16 += Interpreter.field888[var18]; // L: 722
						}

						var19 = var17 - 5; // L: 724
						if (var19 >= 0 && var19 < 104) { // L: 725
							var12 -= Fonts.Tiles_hue[var19]; // L: 726
							var13 -= class466.Tiles_saturation[var19]; // L: 727
							var14 -= Tiles.Tiles_lightness[var19]; // L: 728
							var15 -= class128.Tiles_hueMultiplier[var19]; // L: 729
							var16 -= Interpreter.field888[var19]; // L: 730
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 732 733 734 735
							if (var2 < Tiles.Tiles_minPlane) { // L: 738
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 744
							int var22 = (int)var20; // L: 746
							int var23 = Tiles.field1040[var2][var11][var17] & var22; // L: 747
							int var24 = class227.field2543[var2][var11][var17] & var22; // L: 748
							if (var23 > 0 || var24 > 0) { // L: 749
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 750
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 751
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 752
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 753
								int var29 = class162.field1794[var11][var17]; // L: 754
								int var30 = class162.field1794[var11 + 1][var17]; // L: 755
								int var31 = class162.field1794[var11 + 1][var17 + 1]; // L: 756
								int var32 = class162.field1794[var11][var17 + 1]; // L: 757
								int var33 = -1; // L: 758
								int var34 = -1; // L: 759
								int var35;
								int var36;
								int var37;
								if (var23 > 0) { // L: 760
									var35 = var12 * 256 / var15; // L: 761
									var36 = var13 / var16; // L: 762
									var37 = var14 / var16; // L: 763
									var33 = class106.method2692(var35, var36, var37); // L: 764
									var35 = var35 + Tiles.rndHue & 255; // L: 765
									var37 += Tiles.rndLightness; // L: 766
									if (var37 < 0) { // L: 767
										var37 = 0;
									} else if (var37 > 255) { // L: 768
										var37 = 255;
									}

									var34 = class106.method2692(var35, var36, var37); // L: 769
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) { // L: 771
									boolean var67 = true; // L: 772
									if (var23 == 0 && class172.field1855[var2][var11][var17] != 0) { // L: 773
										var67 = false;
									}

									if (var24 > 0) { // L: 774
										var37 = var24 - 1; // L: 776
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37); // L: 778
										FloorOverlayDefinition var48;
										if (var38 != null) { // L: 779
											var48 = var38; // L: 780
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37); // L: 783
											var38 = new FloorOverlayDefinition(); // L: 784
											if (var39 != null) { // L: 785
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode(); // L: 786
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37); // L: 787
											var48 = var38; // L: 788
										}

										if (!var48.hideUnderlay) { // L: 790
											var67 = false;
										}
									}

									if (var67 && var26 == var25 && var27 == var25 && var25 == var28) { // L: 792 793
										var10000 = BufferedNetSocket.field4679[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 796
								if (var34 != -1) { // L: 797
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[UserComparator7.method2878(var34, 96)];
								}

								if (var24 == 0) { // L: 798
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, UserComparator7.method2878(var33, var29), UserComparator7.method2878(var33, var30), UserComparator7.method2878(var33, var31), UserComparator7.method2878(var33, var32), 0, 0, 0, 0, var35, 0); // L: 799
								} else {
									var36 = class172.field1855[var2][var11][var17] + 1; // L: 802
									byte var68 = ModelData0.field2833[var2][var11][var17]; // L: 803
									int var49 = var24 - 1; // L: 805
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var49); // L: 807
									if (var40 != null) { // L: 808
										var38 = var40; // L: 809
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var49); // L: 812
										var40 = new FloorOverlayDefinition(); // L: 813
										if (var41 != null) { // L: 814
											var40.decode(new Buffer(var41), var49);
										}

										var40.postDecode(); // L: 815
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var49); // L: 816
										var38 = var40; // L: 817
									}

									int var50 = var38.texture; // L: 820
									int var42;
									int var43;
									int var44;
									int var45;
									if (var50 >= 0) { // L: 823
										var43 = Rasterizer3D.field2536.Rasterizer3D_textureLoader.getAverageTextureRGB(var50); // L: 824
										var42 = -1; // L: 825
									} else if (var38.primaryRgb == 16711935) { // L: 828
										var42 = -2; // L: 829
										var50 = -1; // L: 830
										var43 = -2; // L: 831
									} else {
										var42 = class106.method2692(var38.hue, var38.saturation, var38.lightness); // L: 834
										var44 = var38.hue + Tiles.rndHue & 255; // L: 835
										var45 = var38.lightness + Tiles.rndLightness; // L: 836
										if (var45 < 0) { // L: 837
											var45 = 0;
										} else if (var45 > 255) { // L: 838
											var45 = 255;
										}

										var43 = class106.method2692(var44, var38.saturation, var45); // L: 839
									}

									var44 = 0; // L: 842
									if (var43 != -2) { // L: 843
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[Client.method1800(var43, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 844
										var45 = var38.secondaryHue + Tiles.rndHue & 255; // L: 845
										int var46 = var38.secondaryLightness + Tiles.rndLightness; // L: 846
										if (var46 < 0) { // L: 847
											var46 = 0;
										} else if (var46 > 255) { // L: 848
											var46 = 255;
										}

										var43 = class106.method2692(var45, var38.secondarySaturation, var46); // L: 849
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[Client.method1800(var43, 96)]; // L: 850
									}

									var0.addTile(var2, var11, var17, var36, var68, var50, var25, var26, var27, var28, UserComparator7.method2878(var33, var29), UserComparator7.method2878(var33, var30), UserComparator7.method2878(var33, var31), UserComparator7.method2878(var33, var32), Client.method1800(var42, var29), Client.method1800(var42, var30), Client.method1800(var42, var31), Client.method1800(var42, var32), var35, var44); // L: 852
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 859
				for (var12 = 1; var12 < 103; ++var12) { // L: 860
					var0.setTileMinPlane(var2, var12, var11, ViewportMouse.method4919(var2, var12, var11)); // L: 861
				}
			}

			Tiles.field1040[var2] = null; // L: 864
			class227.field2543[var2] = null; // L: 865
			class172.field1855[var2] = null; // L: 866
			ModelData0.field2833[var2] = null; // L: 867
			class217.field2409[var2] = null; // L: 868
		}

		var0.method4556(-50, -10, -50); // L: 870

		for (var2 = 0; var2 < 104; ++var2) { // L: 871
			for (var3 = 0; var3 < 104; ++var3) { // L: 872
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 873
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 876
		var3 = 2; // L: 877
		var4 = 4; // L: 878

		for (var5 = 0; var5 < 4; ++var5) { // L: 879
			if (var5 > 0) { // L: 880
				var2 <<= 3; // L: 881
				var3 <<= 3; // L: 882
				var4 <<= 3; // L: 883
			}

			for (int var62 = 0; var62 <= var5; ++var62) { // L: 885
				for (int var63 = 0; var63 <= 104; ++var63) { // L: 886
					for (int var64 = 0; var64 <= 104; ++var64) { // L: 887
						short var65;
						if ((BufferedNetSocket.field4679[var62][var64][var63] & var2) != 0) { // L: 888
							var9 = var63; // L: 889
							var10 = var63; // L: 890
							var11 = var62; // L: 891

							for (var12 = var62; var9 > 0 && (BufferedNetSocket.field4679[var62][var64][var9 - 1] & var2) != 0; --var9) { // L: 892 893
							}

							while (var10 < 104 && (BufferedNetSocket.field4679[var62][var64][var10 + 1] & var2) != 0) { // L: 894
								++var10;
							}

							label464:
							while (var11 > 0) { // L: 895
								for (var13 = var9; var13 <= var10; ++var13) { // L: 896
									if ((BufferedNetSocket.field4679[var11 - 1][var64][var13] & var2) == 0) {
										break label464;
									}
								}

								--var11; // L: 897
							}

							label453:
							while (var12 < var5) { // L: 899
								for (var13 = var9; var13 <= var10; ++var13) { // L: 900
									if ((BufferedNetSocket.field4679[var12 + 1][var64][var13] & var2) == 0) {
										break label453;
									}
								}

								++var12; // L: 901
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 903
							if (var13 >= 8) { // L: 904
								var65 = 240; // L: 905
								var15 = Tiles.Tiles_heights[var12][var64][var9] - var65; // L: 906
								var16 = Tiles.Tiles_heights[var11][var64][var9]; // L: 907
								Scene.Scene_addOccluder(var5, 1, var64 * 128, var64 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 908

								for (var17 = var11; var17 <= var12; ++var17) { // L: 909
									for (var18 = var9; var18 <= var10; ++var18) { // L: 910
										var10000 = BufferedNetSocket.field4679[var17][var64];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4679[var62][var64][var63] & var3) != 0) { // L: 914
							var9 = var64; // L: 915
							var10 = var64; // L: 916
							var11 = var62; // L: 917

							for (var12 = var62; var9 > 0 && (BufferedNetSocket.field4679[var62][var9 - 1][var63] & var3) != 0; --var9) { // L: 918 919
							}

							while (var10 < 104 && (BufferedNetSocket.field4679[var62][var10 + 1][var63] & var3) != 0) { // L: 920
								++var10;
							}

							label517:
							while (var11 > 0) { // L: 921
								for (var13 = var9; var13 <= var10; ++var13) { // L: 922
									if ((BufferedNetSocket.field4679[var11 - 1][var13][var63] & var3) == 0) {
										break label517;
									}
								}

								--var11; // L: 923
							}

							label506:
							while (var12 < var5) { // L: 925
								for (var13 = var9; var13 <= var10; ++var13) { // L: 926
									if ((BufferedNetSocket.field4679[var12 + 1][var13][var63] & var3) == 0) {
										break label506;
									}
								}

								++var12; // L: 927
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 929
							if (var13 >= 8) { // L: 930
								var65 = 240; // L: 931
								var15 = Tiles.Tiles_heights[var12][var9][var63] - var65; // L: 932
								var16 = Tiles.Tiles_heights[var11][var9][var63]; // L: 933
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var63 * 128, var63 * 128, var15, var16); // L: 934

								for (var17 = var11; var17 <= var12; ++var17) { // L: 935
									for (var18 = var9; var18 <= var10; ++var18) { // L: 936
										var10000 = BufferedNetSocket.field4679[var17][var18];
										var10000[var63] &= ~var3;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4679[var62][var64][var63] & var4) != 0) { // L: 940
							var9 = var64; // L: 941
							var10 = var64; // L: 942
							var11 = var63; // L: 943

							for (var12 = var63; var11 > 0 && (BufferedNetSocket.field4679[var62][var64][var11 - 1] & var4) != 0; --var11) { // L: 944 945
							}

							while (var12 < 104 && (BufferedNetSocket.field4679[var62][var64][var12 + 1] & var4) != 0) { // L: 946
								++var12;
							}

							label570:
							while (var9 > 0) { // L: 947
								for (var13 = var11; var13 <= var12; ++var13) { // L: 948
									if ((BufferedNetSocket.field4679[var62][var9 - 1][var13] & var4) == 0) {
										break label570;
									}
								}

								--var9; // L: 949
							}

							label559:
							while (var10 < 104) { // L: 951
								for (var13 = var11; var13 <= var12; ++var13) { // L: 952
									if ((BufferedNetSocket.field4679[var62][var10 + 1][var13] & var4) == 0) {
										break label559;
									}
								}

								++var10; // L: 953
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 955
								var13 = Tiles.Tiles_heights[var62][var9][var11]; // L: 956
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 957

								for (var14 = var9; var14 <= var10; ++var14) { // L: 958
									for (var15 = var11; var15 <= var12; ++var15) { // L: 959
										var10000 = BufferedNetSocket.field4679[var62][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 967
}
