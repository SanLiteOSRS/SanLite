import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1999558433
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2110951989
	)
	@Export("element")
	int element;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 342751675
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1976189839
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;ILiy;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2); // L: 17
		this.objectDefId = var3; // L: 18
		this.region = var4; // L: 19
		this.init(); // L: 20
	} // L: 21

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	@Export("init")
	void init() {
		this.element = VarpDefinition.getObjectDefinition(this.objectDefId).transform().mapIconId; // L: 24
		this.label = this.region.createMapLabel(JagexCache.WorldMapElement_get(this.element));
		WorldMapElement var1 = JagexCache.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false); // L: 27
		if (var2 != null) { // L: 28
			this.subWidth = var2.subWidth; // L: 29
			this.subHeight = var2.subHeight; // L: 30
		} else {
			this.subWidth = 0; // L: 33
			this.subHeight = 0; // L: 34
		}

	} // L: 36

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2098413555"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 40
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lii;",
		garbageValue = "849546905"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 45
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-520723785"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1290081241"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 55
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;Lly;I)V",
		garbageValue = "-804046837"
	)
	public static void method4881(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 48
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 49
		BuddyRankComparator.SequenceDefinition_skeletonsArchive = var2; // L: 50
	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "-1454718201"
	)
	public static void method4880(AbstractArchive var0) {
		GrandExchangeOfferWorldComparator.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1397784753"
	)
	static char method4872(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhc;[Lgw;I)V",
		garbageValue = "1985890925"
	)
	static final void method4878(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 648
			for (var3 = 0; var3 < 104; ++var3) { // L: 649
				for (var4 = 0; var4 < 104; ++var4) { // L: 650
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 651
						var5 = var2; // L: 652
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 653
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 654
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 659
		if (Tiles.rndHue < -8) { // L: 660
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 661
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 662
		if (Tiles.rndLightness < -16) { // L: 663
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 664
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 665
			byte[][] var45 = Canvas.field136[var2]; // L: 666
			boolean var51 = true; // L: 667
			boolean var52 = true; // L: 668
			boolean var6 = true; // L: 669
			boolean var7 = true; // L: 670
			boolean var8 = true; // L: 671
			var9 = (int)Math.sqrt(5100.0D); // L: 672
			var10 = var9 * 768 >> 8; // L: 673

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 674
				for (var12 = 1; var12 < 103; ++var12) { // L: 675
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 676
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 677
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 678
					var16 = (var13 << 8) / var15; // L: 679
					var17 = 65536 / var15; // L: 680
					var18 = (var14 << 8) / var15; // L: 681
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 682
					var20 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1); // L: 683
					Tiles.field1030[var12][var11] = var19 - var20; // L: 684
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 687
				Tiles.Tiles_hue[var11] = 0; // L: 688
				PcmPlayer.Tiles_saturation[var11] = 0; // L: 689
				Tiles.Tiles_lightness[var11] = 0; // L: 690
				NPC.Tiles_hueMultiplier[var11] = 0; // L: 691
				MenuAction.field905[var11] = 0; // L: 692
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 694
				for (var12 = 0; var12 < 104; ++var12) { // L: 695
					var13 = var11 + 5; // L: 696
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 697
						var14 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15); // L: 698
						var15 = Tiles.field1028[var2][var13][var12] & var14; // L: 699
						if (var15 > 0) { // L: 700
							FloorUnderlayDefinition var49 = class21.method304(var15 - 1); // L: 701
							var10000 = Tiles.Tiles_hue; // L: 702
							var10000[var12] += var49.hue;
							var10000 = PcmPlayer.Tiles_saturation; // L: 703
							var10000[var12] += var49.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 704
							var10000[var12] += var49.lightness;
							var10000 = NPC.Tiles_hueMultiplier; // L: 705
							var10000[var12] += var49.hueMultiplier;
							var10002 = MenuAction.field905[var12]++; // L: 706
						}
					}

					var14 = var11 - 5; // L: 709
					if (var14 >= 0 && var14 < 104) { // L: 710
						var15 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15); // L: 711
						var16 = Tiles.field1028[var2][var14][var12] & var15; // L: 712
						if (var16 > 0) { // L: 713
							FloorUnderlayDefinition var50 = class21.method304(var16 - 1); // L: 714
							var10000 = Tiles.Tiles_hue; // L: 715
							var10000[var12] -= var50.hue;
							var10000 = PcmPlayer.Tiles_saturation; // L: 716
							var10000[var12] -= var50.saturation;
							var10000 = Tiles.Tiles_lightness; // L: 717
							var10000[var12] -= var50.lightness;
							var10000 = NPC.Tiles_hueMultiplier; // L: 718
							var10000[var12] -= var50.hueMultiplier;
							var10002 = MenuAction.field905[var12]--; // L: 719
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 723
					var12 = 0; // L: 724
					var13 = 0; // L: 725
					var14 = 0; // L: 726
					var15 = 0; // L: 727
					var16 = 0; // L: 728

					for (var17 = -5; var17 < 109; ++var17) { // L: 729
						var18 = var17 + 5; // L: 730
						if (var18 >= 0 && var18 < 104) { // L: 731
							var12 += Tiles.Tiles_hue[var18]; // L: 732
							var13 += PcmPlayer.Tiles_saturation[var18]; // L: 733
							var14 += Tiles.Tiles_lightness[var18]; // L: 734
							var15 += NPC.Tiles_hueMultiplier[var18]; // L: 735
							var16 += MenuAction.field905[var18]; // L: 736
						}

						var19 = var17 - 5; // L: 738
						if (var19 >= 0 && var19 < 104) { // L: 739
							var12 -= Tiles.Tiles_hue[var19]; // L: 740
							var13 -= PcmPlayer.Tiles_saturation[var19]; // L: 741
							var14 -= Tiles.Tiles_lightness[var19]; // L: 742
							var15 -= NPC.Tiles_hueMultiplier[var19]; // L: 743
							var16 -= MenuAction.field905[var19]; // L: 744
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 746 747 748 749
							if (var2 < Tiles.Tiles_minPlane) { // L: 752
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Client.field515 < 209 ? (int)class374.method7315(8) : (int)class374.method7315(15); // L: 753
							int var21 = Tiles.field1028[var2][var11][var17] & var20; // L: 754
							int var22 = class490.field5062[var2][var11][var17] & var20; // L: 755
							if (var21 > 0 || var22 > 0) { // L: 756
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 757
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 758
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 759
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 760
								int var27 = Tiles.field1030[var11][var17]; // L: 761
								int var28 = Tiles.field1030[var11 + 1][var17]; // L: 762
								int var29 = Tiles.field1030[var11 + 1][var17 + 1]; // L: 763
								int var30 = Tiles.field1030[var11][var17 + 1]; // L: 764
								int var31 = -1; // L: 765
								int var32 = -1; // L: 766
								int var33;
								int var34;
								int var35;
								if (var21 > 0) { // L: 767
									var33 = var12 * 256 / var15; // L: 768
									var34 = var13 / var16; // L: 769
									var35 = var14 / var16; // L: 770
									var31 = class374.hslToRgb(var33, var34, var35); // L: 771
									var33 = var33 + Tiles.rndHue & 255; // L: 772
									var35 += Tiles.rndLightness; // L: 773
									if (var35 < 0) { // L: 774
										var35 = 0;
									} else if (var35 > 255) { // L: 775
										var35 = 255;
									}

									var32 = class374.hslToRgb(var33, var34, var35); // L: 776
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) { // L: 778
									boolean var57 = true; // L: 779
									if (var21 == 0 && Tiles.field1033[var2][var11][var17] != 0) { // L: 780
										var57 = false;
									}

									if (var22 > 0) { // L: 781
										var35 = var22 - 1; // L: 783
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35); // L: 785
										FloorOverlayDefinition var46;
										if (var36 != null) { // L: 786
											var46 = var36; // L: 787
										} else {
											byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35); // L: 790
											var36 = new FloorOverlayDefinition(); // L: 791
											if (var37 != null) { // L: 792
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode(); // L: 793
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35); // L: 794
											var46 = var36; // L: 795
										}

										if (!var46.hideUnderlay) { // L: 797
											var57 = false;
										}
									}

									if (var57 && var24 == var23 && var23 == var25 && var26 == var23) { // L: 799 800
										var10000 = class159.field1816[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 803
								if (var32 != -1) { // L: 804
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[class182.method3635(var32, 96)];
								}

								if (var22 == 0) { // L: 805
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, class182.method3635(var31, var27), class182.method3635(var31, var28), class182.method3635(var31, var29), class182.method3635(var31, var30), 0, 0, 0, 0, var33, 0); // L: 806
								} else {
									var34 = Tiles.field1033[var2][var11][var17] + 1; // L: 809
									byte var58 = class358.field4344[var2][var11][var17]; // L: 810
									int var47 = var22 - 1; // L: 812
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var47); // L: 814
									if (var38 != null) { // L: 815
										var36 = var38; // L: 816
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var47); // L: 819
										var38 = new FloorOverlayDefinition(); // L: 820
										if (var39 != null) { // L: 821
											var38.decode(new Buffer(var39), var47);
										}

										var38.postDecode(); // L: 822
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var47); // L: 823
										var36 = var38; // L: 824
									}

									int var48 = var36.texture; // L: 827
									int var40;
									int var41;
									int var42;
									int var43;
									if (var48 >= 0) { // L: 830
										var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var48); // L: 831
										var40 = -1; // L: 832
									} else if (var36.primaryRgb == 16711935) { // L: 835
										var40 = -2; // L: 836
										var48 = -1; // L: 837
										var41 = -2; // L: 838
									} else {
										var40 = class374.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 841
										var42 = var36.hue + Tiles.rndHue & 255; // L: 842
										var43 = var36.lightness + Tiles.rndLightness; // L: 843
										if (var43 < 0) { // L: 844
											var43 = 0;
										} else if (var43 > 255) { // L: 845
											var43 = 255;
										}

										var41 = class374.hslToRgb(var42, var36.saturation, var43); // L: 846
									}

									var42 = 0; // L: 849
									if (var41 != -2) { // L: 850
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapSectionType.method5234(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 851
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 852
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 853
										if (var44 < 0) { // L: 854
											var44 = 0;
										} else if (var44 > 255) { // L: 855
											var44 = 255;
										}

										var41 = class374.hslToRgb(var43, var36.secondarySaturation, var44); // L: 856
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapSectionType.method5234(var41, 96)]; // L: 857
									}

									var0.addTile(var2, var11, var17, var34, var58, var48, var23, var24, var25, var26, class182.method3635(var31, var27), class182.method3635(var31, var28), class182.method3635(var31, var29), class182.method3635(var31, var30), WorldMapSectionType.method5234(var40, var27), WorldMapSectionType.method5234(var40, var28), WorldMapSectionType.method5234(var40, var29), WorldMapSectionType.method5234(var40, var30), var33, var42); // L: 859
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 866
				for (var12 = 1; var12 < 103; ++var12) { // L: 867
					var0.setTileMinPlane(var2, var12, var11, class262.method5406(var2, var12, var11)); // L: 868
				}
			}

			Tiles.field1028[var2] = null; // L: 871
			class490.field5062[var2] = null; // L: 872
			Tiles.field1033[var2] = null; // L: 873
			class358.field4344[var2] = null; // L: 874
			Canvas.field136[var2] = null; // L: 875
		}

		var0.method4461(-50, -10, -50); // L: 877

		for (var2 = 0; var2 < 104; ++var2) { // L: 878
			for (var3 = 0; var3 < 104; ++var3) { // L: 879
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 880
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 883
		var3 = 2; // L: 884
		var4 = 4; // L: 885

		for (var5 = 0; var5 < 4; ++var5) { // L: 886
			if (var5 > 0) { // L: 887
				var2 <<= 3; // L: 888
				var3 <<= 3; // L: 889
				var4 <<= 3; // L: 890
			}

			for (int var53 = 0; var53 <= var5; ++var53) { // L: 892
				for (int var54 = 0; var54 <= 104; ++var54) { // L: 893
					for (int var55 = 0; var55 <= 104; ++var55) { // L: 894
						short var56;
						if ((class159.field1816[var53][var55][var54] & var2) != 0) { // L: 895
							var9 = var54; // L: 896
							var10 = var54; // L: 897
							var11 = var53; // L: 898

							for (var12 = var53; var9 > 0 && (class159.field1816[var53][var55][var9 - 1] & var2) != 0; --var9) { // L: 899 900
							}

							while (var10 < 104 && (class159.field1816[var53][var55][var10 + 1] & var2) != 0) { // L: 901
								++var10;
							}

							label459:
							while (var11 > 0) { // L: 902
								for (var13 = var9; var13 <= var10; ++var13) { // L: 903
									if ((class159.field1816[var11 - 1][var55][var13] & var2) == 0) {
										break label459;
									}
								}

								--var11; // L: 904
							}

							label448:
							while (var12 < var5) { // L: 906
								for (var13 = var9; var13 <= var10; ++var13) { // L: 907
									if ((class159.field1816[var12 + 1][var55][var13] & var2) == 0) {
										break label448;
									}
								}

								++var12; // L: 908
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 910
							if (var13 >= 8) { // L: 911
								var56 = 240; // L: 912
								var15 = Tiles.Tiles_heights[var12][var55][var9] - var56; // L: 913
								var16 = Tiles.Tiles_heights[var11][var55][var9]; // L: 914
								Scene.Scene_addOccluder(var5, 1, var55 * 128, var55 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 915

								for (var17 = var11; var17 <= var12; ++var17) { // L: 916
									for (var18 = var9; var18 <= var10; ++var18) { // L: 917
										var10000 = class159.field1816[var17][var55];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class159.field1816[var53][var55][var54] & var3) != 0) { // L: 921
							var9 = var55; // L: 922
							var10 = var55; // L: 923
							var11 = var53; // L: 924

							for (var12 = var53; var9 > 0 && (class159.field1816[var53][var9 - 1][var54] & var3) != 0; --var9) { // L: 925 926
							}

							while (var10 < 104 && (class159.field1816[var53][var10 + 1][var54] & var3) != 0) { // L: 927
								++var10;
							}

							label512:
							while (var11 > 0) { // L: 928
								for (var13 = var9; var13 <= var10; ++var13) { // L: 929
									if ((class159.field1816[var11 - 1][var13][var54] & var3) == 0) {
										break label512;
									}
								}

								--var11; // L: 930
							}

							label501:
							while (var12 < var5) { // L: 932
								for (var13 = var9; var13 <= var10; ++var13) { // L: 933
									if ((class159.field1816[var12 + 1][var13][var54] & var3) == 0) {
										break label501;
									}
								}

								++var12; // L: 934
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1); // L: 936
							if (var13 >= 8) { // L: 937
								var56 = 240; // L: 938
								var15 = Tiles.Tiles_heights[var12][var9][var54] - var56; // L: 939
								var16 = Tiles.Tiles_heights[var11][var9][var54]; // L: 940
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var54 * 128, var54 * 128, var15, var16); // L: 941

								for (var17 = var11; var17 <= var12; ++var17) { // L: 942
									for (var18 = var9; var18 <= var10; ++var18) { // L: 943
										var10000 = class159.field1816[var17][var18];
										var10000[var54] &= ~var3;
									}
								}
							}
						}

						if ((class159.field1816[var53][var55][var54] & var4) != 0) { // L: 947
							var9 = var55; // L: 948
							var10 = var55; // L: 949
							var11 = var54; // L: 950

							for (var12 = var54; var11 > 0 && (class159.field1816[var53][var55][var11 - 1] & var4) != 0; --var11) { // L: 951 952
							}

							while (var12 < 104 && (class159.field1816[var53][var55][var12 + 1] & var4) != 0) { // L: 953
								++var12;
							}

							label565:
							while (var9 > 0) { // L: 954
								for (var13 = var11; var13 <= var12; ++var13) { // L: 955
									if ((class159.field1816[var53][var9 - 1][var13] & var4) == 0) {
										break label565;
									}
								}

								--var9; // L: 956
							}

							label554:
							while (var10 < 104) { // L: 958
								for (var13 = var11; var13 <= var12; ++var13) { // L: 959
									if ((class159.field1816[var53][var10 + 1][var13] & var4) == 0) {
										break label554;
									}
								}

								++var10; // L: 960
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) { // L: 962
								var13 = Tiles.Tiles_heights[var53][var9][var11]; // L: 963
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 964

								for (var14 = var9; var14 <= var10; ++var14) { // L: 965
									for (var15 = var11; var15 <= var12; ++var15) { // L: 966
										var10000 = class159.field1816[var53][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 974
}
