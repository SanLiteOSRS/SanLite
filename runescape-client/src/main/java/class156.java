import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class156 extends class160 {
	@ObfuscatedName("at")
	String field1726;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 162234009
	)
	int field1724;
	@ObfuscatedName("ar")
	byte field1725;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class156(class161 var1) {
		this.this$0 = var1;
		this.field1726 = null; // L: 57
	} // L: 61

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	void vmethod3497(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 64
			--var1.offset; // L: 65
			var1.readLong(); // L: 66
		}

		this.field1726 = var1.readStringCp1252NullTerminatedOrNull(); // L: 68
		this.field1724 = var1.readUnsignedShort(); // L: 69
		this.field1725 = var1.readByte(); // L: 70
		var1.readLong(); // L: 71
	} // L: 72

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	void vmethod3501(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 75
		var2.username = new Username(this.field1726); // L: 76
		var2.world = this.field1724; // L: 77
		var2.rank = this.field1725; // L: 78
		var1.addMember(var2); // L: 79
	} // L: 80

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkf;[Liw;I)V",
		garbageValue = "277248330"
	)
	static final void method3394(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 625
			for (var3 = 0; var3 < 104; ++var3) { // L: 626
				for (var4 = 0; var4 < 104; ++var4) { // L: 627
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 628
						var5 = var2; // L: 629
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 630
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 631
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 636
		if (Tiles.rndHue < -8) { // L: 637
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 638
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 639
		if (Tiles.rndLightness < -16) { // L: 640
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 641
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 642
			byte[][] var45 = class93.field1150[var2]; // L: 643
			boolean var53 = true; // L: 644
			boolean var54 = true; // L: 645
			boolean var6 = true; // L: 646
			boolean var7 = true; // L: 647
			boolean var8 = true; // L: 648
			var9 = (int)Math.sqrt(5100.0D); // L: 649
			var10 = var9 * 768 >> 8; // L: 650

			int var19;
			for (var11 = 1; var11 < 103; ++var11) { // L: 651
				for (var12 = 1; var12 < 103; ++var12) { // L: 652
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 653
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 654
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536)); // L: 655
					var16 = (var13 << 8) / var15; // L: 656
					var17 = 65536 / var15; // L: 657
					var18 = (var14 << 8) / var15; // L: 658
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 659
					int var52 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1); // L: 660
					Tiles.field999[var12][var11] = var19 - var52; // L: 661
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 664
				class337.Tiles_hue[var11] = 0; // L: 665
				Tiles.Tiles_saturation[var11] = 0; // L: 666
				class185.Tiles_lightness[var11] = 0; // L: 667
				MenuAction.Tiles_hueMultiplier[var11] = 0; // L: 668
				WorldMapLabelSize.field2441[var11] = 0; // L: 669
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 671
				for (var12 = 0; var12 < 104; ++var12) { // L: 672
					var13 = var11 + 5; // L: 673
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 674
						long var46 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 680
						var16 = (int)var46; // L: 682
						var17 = class74.field891[var2][var13][var12] & var16; // L: 683
						if (var17 > 0) { // L: 684
							FloorUnderlayDefinition var48 = class101.method2723(var17 - 1); // L: 685
							var10000 = class337.Tiles_hue; // L: 686
							var10000[var12] += var48.hue;
							var10000 = Tiles.Tiles_saturation; // L: 687
							var10000[var12] += var48.saturation;
							var10000 = class185.Tiles_lightness; // L: 688
							var10000[var12] += var48.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier; // L: 689
							var10000[var12] += var48.hueMultiplier;
							var10002 = WorldMapLabelSize.field2441[var12]++; // L: 690
						}
					}

					var14 = var11 - 5; // L: 693
					if (var14 >= 0 && var14 < 104) { // L: 694
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 700
						var17 = (int)var49; // L: 702
						var18 = class74.field891[var2][var14][var12] & var17; // L: 703
						if (var18 > 0) { // L: 704
							FloorUnderlayDefinition var51 = class101.method2723(var18 - 1); // L: 705
							var10000 = class337.Tiles_hue; // L: 706
							var10000[var12] -= var51.hue;
							var10000 = Tiles.Tiles_saturation; // L: 707
							var10000[var12] -= var51.saturation;
							var10000 = class185.Tiles_lightness; // L: 708
							var10000[var12] -= var51.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier; // L: 709
							var10000[var12] -= var51.hueMultiplier;
							var10002 = WorldMapLabelSize.field2441[var12]--; // L: 710
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 714
					var12 = 0; // L: 715
					var13 = 0; // L: 716
					var14 = 0; // L: 717
					var15 = 0; // L: 718
					var16 = 0; // L: 719

					for (var17 = -5; var17 < 109; ++var17) { // L: 720
						var18 = var17 + 5; // L: 721
						if (var18 >= 0 && var18 < 104) { // L: 722
							var12 += class337.Tiles_hue[var18]; // L: 723
							var13 += Tiles.Tiles_saturation[var18]; // L: 724
							var14 += class185.Tiles_lightness[var18]; // L: 725
							var15 += MenuAction.Tiles_hueMultiplier[var18]; // L: 726
							var16 += WorldMapLabelSize.field2441[var18]; // L: 727
						}

						var19 = var17 - 5; // L: 729
						if (var19 >= 0 && var19 < 104) { // L: 730
							var12 -= class337.Tiles_hue[var19]; // L: 731
							var13 -= Tiles.Tiles_saturation[var19]; // L: 732
							var14 -= class185.Tiles_lightness[var19]; // L: 733
							var15 -= MenuAction.Tiles_hueMultiplier[var19]; // L: 734
							var16 -= WorldMapLabelSize.field2441[var19]; // L: 735
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 737 738 739 740
							if (var2 < Tiles.Tiles_minPlane) { // L: 743
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L; // L: 749
							int var22 = (int)var20; // L: 751
							int var23 = class74.field891[var2][var11][var17] & var22; // L: 752
							int var24 = Interpreter.field833[var2][var11][var17] & var22; // L: 753
							if (var23 > 0 || var24 > 0) { // L: 754
								int var25 = Tiles.Tiles_heights[var2][var11][var17]; // L: 755
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 756
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 757
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 758
								int var29 = Tiles.field999[var11][var17]; // L: 759
								int var30 = Tiles.field999[var11 + 1][var17]; // L: 760
								int var31 = Tiles.field999[var11 + 1][var17 + 1]; // L: 761
								int var32 = Tiles.field999[var11][var17 + 1]; // L: 762
								int var33 = -1; // L: 763
								int var34 = -1; // L: 764
								int var35;
								int var36;
								if (var23 > 0) { // L: 765
									var35 = var12 * 256 / var15; // L: 766
									var36 = var13 / var16; // L: 767
									int var37 = var14 / var16; // L: 768
									var33 = Messages.hslToRgb(var35, var36, var37); // L: 769
									var35 = var35 + Tiles.rndHue & 255; // L: 770
									var37 += Tiles.rndLightness; // L: 771
									if (var37 < 0) { // L: 772
										var37 = 0;
									} else if (var37 > 255) { // L: 773
										var37 = 255;
									}

									var34 = Messages.hslToRgb(var35, var36, var37); // L: 774
								}

								if (var2 > 0) { // L: 776
									boolean var59 = true; // L: 777
									if (var23 == 0 && ViewportMouse.field3018[var2][var11][var17] != 0) { // L: 778
										var59 = false;
									}

									if (var24 > 0 && !Canvas.method333(var24 - 1).hideUnderlay) { // L: 779
										var59 = false;
									}

									if (var59 && var26 == var25 && var25 == var27 && var25 == var28) { // L: 780 781
										var10000 = class344.field3814[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0; // L: 784
								if (var34 != -1) { // L: 785
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[ClanChannel.method3482(var34, 96)];
								}

								if (var24 == 0) { // L: 786
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ClanChannel.method3482(var33, var29), ClanChannel.method3482(var33, var30), ClanChannel.method3482(var33, var31), ClanChannel.method3482(var33, var32), 0, 0, 0, 0, var35, 0); // L: 787
								} else {
									var36 = ViewportMouse.field3018[var2][var11][var17] + 1; // L: 790
									byte var60 = class369.field4297[var2][var11][var17]; // L: 791
									FloorOverlayDefinition var38 = Canvas.method333(var24 - 1); // L: 792
									int var39 = var38.texture; // L: 793
									int var40;
									int var41;
									int var42;
									int var43;
									if (var39 >= 0) { // L: 796
										var41 = Rasterizer3D.field2772.Rasterizer3D_textureLoader.getAverageTextureRGB(var39); // L: 797
										var40 = -1; // L: 798
									} else if (var38.primaryRgb == 16711935) { // L: 801
										var40 = -2; // L: 802
										var39 = -1; // L: 803
										var41 = -2; // L: 804
									} else {
										var40 = Messages.hslToRgb(var38.hue, var38.saturation, var38.lightness); // L: 807
										var42 = var38.hue + Tiles.rndHue & 255; // L: 808
										var43 = var38.lightness + Tiles.rndLightness; // L: 809
										if (var43 < 0) { // L: 810
											var43 = 0;
										} else if (var43 > 255) { // L: 811
											var43 = 255;
										}

										var41 = Messages.hslToRgb(var42, var38.saturation, var43); // L: 812
									}

									var42 = 0; // L: 815
									if (var41 != -2) { // L: 816
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class403.method7480(var41, 96)];
									}

									if (var38.secondaryRgb != -1) { // L: 817
										var43 = var38.secondaryHue + Tiles.rndHue & 255; // L: 818
										int var44 = var38.secondaryLightness + Tiles.rndLightness; // L: 819
										if (var44 < 0) { // L: 820
											var44 = 0;
										} else if (var44 > 255) { // L: 821
											var44 = 255;
										}

										var41 = Messages.hslToRgb(var43, var38.secondarySaturation, var44); // L: 822
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class403.method7480(var41, 96)]; // L: 823
									}

									var0.addTile(var2, var11, var17, var36, var60, var39, var25, var26, var27, var28, ClanChannel.method3482(var33, var29), ClanChannel.method3482(var33, var30), ClanChannel.method3482(var33, var31), ClanChannel.method3482(var33, var32), class403.method7480(var40, var29), class403.method7480(var40, var30), class403.method7480(var40, var31), class403.method7480(var40, var32), var35, var42); // L: 825
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 832
				for (var12 = 1; var12 < 103; ++var12) { // L: 833
					var0.setTileMinPlane(var2, var12, var11, class185.method3681(var2, var12, var11)); // L: 834
				}
			}

			class74.field891[var2] = null; // L: 837
			Interpreter.field833[var2] = null; // L: 838
			ViewportMouse.field3018[var2] = null; // L: 839
			class369.field4297[var2] = null; // L: 840
			class93.field1150[var2] = null; // L: 841
		}

		var0.method5329(-50, -10, -50); // L: 843

		for (var2 = 0; var2 < 104; ++var2) { // L: 844
			for (var3 = 0; var3 < 104; ++var3) { // L: 845
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 846
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 849
		var3 = 2; // L: 850
		var4 = 4; // L: 851

		for (var5 = 0; var5 < 4; ++var5) { // L: 852
			if (var5 > 0) { // L: 853
				var2 <<= 3; // L: 854
				var3 <<= 3; // L: 855
				var4 <<= 3; // L: 856
			}

			for (int var55 = 0; var55 <= var5; ++var55) { // L: 858
				for (int var56 = 0; var56 <= 104; ++var56) { // L: 859
					for (int var57 = 0; var57 <= 104; ++var57) { // L: 860
						short var58;
						if ((class344.field3814[var55][var57][var56] & var2) != 0) { // L: 861
							var9 = var56; // L: 862
							var10 = var56; // L: 863
							var11 = var55; // L: 864

							for (var12 = var55; var9 > 0 && (class344.field3814[var55][var57][var9 - 1] & var2) != 0; --var9) { // L: 865 866
							}

							while (var10 < 104 && (class344.field3814[var55][var57][var10 + 1] & var2) != 0) { // L: 867
								++var10;
							}

							label418:
							while (var11 > 0) { // L: 868
								for (var13 = var9; var13 <= var10; ++var13) { // L: 869
									if ((class344.field3814[var11 - 1][var57][var13] & var2) == 0) {
										break label418;
									}
								}

								--var11; // L: 870
							}

							label407:
							while (var12 < var5) { // L: 872
								for (var13 = var9; var13 <= var10; ++var13) { // L: 873
									if ((class344.field3814[var12 + 1][var57][var13] & var2) == 0) {
										break label407;
									}
								}

								++var12; // L: 874
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 876
							if (var13 >= 8) { // L: 877
								var58 = 240; // L: 878
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58; // L: 879
								var16 = Tiles.Tiles_heights[var11][var57][var9]; // L: 880
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 881

								for (var17 = var11; var17 <= var12; ++var17) { // L: 882
									for (var18 = var9; var18 <= var10; ++var18) { // L: 883
										var10000 = class344.field3814[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class344.field3814[var55][var57][var56] & var3) != 0) { // L: 887
							var9 = var57; // L: 888
							var10 = var57; // L: 889
							var11 = var55; // L: 890

							for (var12 = var55; var9 > 0 && (class344.field3814[var55][var9 - 1][var56] & var3) != 0; --var9) { // L: 891 892
							}

							while (var10 < 104 && (class344.field3814[var55][var10 + 1][var56] & var3) != 0) { // L: 893
								++var10;
							}

							label471:
							while (var11 > 0) { // L: 894
								for (var13 = var9; var13 <= var10; ++var13) { // L: 895
									if ((class344.field3814[var11 - 1][var13][var56] & var3) == 0) {
										break label471;
									}
								}

								--var11; // L: 896
							}

							label460:
							while (var12 < var5) { // L: 898
								for (var13 = var9; var13 <= var10; ++var13) { // L: 899
									if ((class344.field3814[var12 + 1][var13][var56] & var3) == 0) {
										break label460;
									}
								}

								++var12; // L: 900
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 902
							if (var13 >= 8) { // L: 903
								var58 = 240; // L: 904
								var15 = Tiles.Tiles_heights[var12][var9][var56] - var58; // L: 905
								var16 = Tiles.Tiles_heights[var11][var9][var56]; // L: 906
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var56 * 128, var56 * 128, var15, var16); // L: 907

								for (var17 = var11; var17 <= var12; ++var17) { // L: 908
									for (var18 = var9; var18 <= var10; ++var18) { // L: 909
										var10000 = class344.field3814[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((class344.field3814[var55][var57][var56] & var4) != 0) { // L: 913
							var9 = var57; // L: 914
							var10 = var57; // L: 915
							var11 = var56; // L: 916

							for (var12 = var56; var11 > 0 && (class344.field3814[var55][var57][var11 - 1] & var4) != 0; --var11) { // L: 917 918
							}

							while (var12 < 104 && (class344.field3814[var55][var57][var12 + 1] & var4) != 0) { // L: 919
								++var12;
							}

							label524:
							while (var9 > 0) { // L: 920
								for (var13 = var11; var13 <= var12; ++var13) { // L: 921
									if ((class344.field3814[var55][var9 - 1][var13] & var4) == 0) {
										break label524;
									}
								}

								--var9; // L: 922
							}

							label513:
							while (var10 < 104) { // L: 924
								for (var13 = var11; var13 <= var12; ++var13) { // L: 925
									if ((class344.field3814[var55][var10 + 1][var13] & var4) == 0) {
										break label513;
									}
								}

								++var10; // L: 926
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 928
								var13 = Tiles.Tiles_heights[var55][var9][var11]; // L: 929
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 930

								for (var14 = var9; var14 <= var10; ++var14) { // L: 931
									for (var15 = var11; var15 <= var12; ++var15) { // L: 932
										var10000 = class344.field3814[var55][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 940
}
