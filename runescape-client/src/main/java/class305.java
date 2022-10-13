import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
public class class305 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lmo;IB)Ljc;",
		garbageValue = "-37"
	)
	public static PacketBufferNode method6204(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3072, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		class281.method5418(var4.packetBuffer, var1); // L: 167
		if (var0 == class310.field3664.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method8433(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lhf;[Lgr;S)V",
		garbageValue = "8272"
	)
	static final void method6206(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 598
			for (var3 = 0; var3 < 104; ++var3) { // L: 599
				for (var4 = 0; var4 < 104; ++var4) { // L: 600
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 601
						var5 = var2; // L: 602
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 603
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 604
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 609
		if (Tiles.rndHue < -8) { // L: 610
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 611
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 612
		if (Tiles.rndLightness < -16) { // L: 613
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 614
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
		for (var2 = 0; var2 < 4; ++var2) { // L: 615
			byte[][] var45 = class32.field179[var2]; // L: 616
			boolean var55 = true; // L: 617
			boolean var56 = true; // L: 618
			boolean var6 = true; // L: 619
			boolean var7 = true; // L: 620
			boolean var8 = true; // L: 621
			var9 = (int)Math.sqrt(5100.0D); // L: 622
			var10 = var9 * 768 >> 8; // L: 623

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 624
				for (var12 = 1; var12 < 103; ++var12) { // L: 625
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 626
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 627
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 628
					var16 = (var13 << 8) / var15; // L: 629
					var17 = 65536 / var15; // L: 630
					var18 = (var14 << 8) / var15; // L: 631
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96; // L: 632
					var20 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1); // L: 633
					Tiles.field995[var12][var11] = var19 - var20; // L: 634
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 637
				class32.Tiles_hue[var11] = 0; // L: 638
				FriendSystem.Tiles_saturation[var11] = 0; // L: 639
				DefaultsGroup.Tiles_lightness[var11] = 0; // L: 640
				ClanChannelMember.Tiles_hueMultiplier[var11] = 0; // L: 641
				class410.field4590[var11] = 0; // L: 642
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 644
				for (var12 = 0; var12 < 104; ++var12) { // L: 645
					var13 = var11 + 5; // L: 646
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 647
						var14 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15); // L: 648
						var15 = Tiles.field994[var2][var13][var12] & var14; // L: 649
						if (var15 > 0) { // L: 650
							var17 = var15 - 1; // L: 652
							FloorUnderlayDefinition var50 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17); // L: 654
							FloorUnderlayDefinition var52;
							if (var50 != null) { // L: 655
								var52 = var50; // L: 656
							} else {
								byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17); // L: 659
								var50 = new FloorUnderlayDefinition(); // L: 660
								if (var51 != null) { // L: 661
									var50.decode(new Buffer(var51), var17);
								}

								var50.postDecode(); // L: 662
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var50, (long)var17); // L: 663
								var52 = var50; // L: 664
							}

							var10000 = class32.Tiles_hue; // L: 667
							var10000[var12] += var52.hue;
							var10000 = FriendSystem.Tiles_saturation; // L: 668
							var10000[var12] += var52.saturation;
							var10000 = DefaultsGroup.Tiles_lightness; // L: 669
							var10000[var12] += var52.lightness;
							var10000 = ClanChannelMember.Tiles_hueMultiplier; // L: 670
							var10000[var12] += var52.hueMultiplier;
							var10002 = class410.field4590[var12]++; // L: 671
						}
					}

					var14 = var11 - 5; // L: 674
					if (var14 >= 0 && var14 < 104) { // L: 675
						var15 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15); // L: 676
						var16 = Tiles.field994[var2][var14][var12] & var15; // L: 677
						if (var16 > 0) { // L: 678
							var18 = var16 - 1; // L: 680
							FloorUnderlayDefinition var63 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18); // L: 682
							FloorUnderlayDefinition var54;
							if (var63 != null) { // L: 683
								var54 = var63; // L: 684
							} else {
								byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var18); // L: 687
								var63 = new FloorUnderlayDefinition(); // L: 688
								if (var53 != null) { // L: 689
									var63.decode(new Buffer(var53), var18);
								}

								var63.postDecode(); // L: 690
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var63, (long)var18); // L: 691
								var54 = var63; // L: 692
							}

							var10000 = class32.Tiles_hue; // L: 695
							var10000[var12] -= var54.hue;
							var10000 = FriendSystem.Tiles_saturation; // L: 696
							var10000[var12] -= var54.saturation;
							var10000 = DefaultsGroup.Tiles_lightness; // L: 697
							var10000[var12] -= var54.lightness;
							var10000 = ClanChannelMember.Tiles_hueMultiplier; // L: 698
							var10000[var12] -= var54.hueMultiplier;
							var10002 = class410.field4590[var12]--; // L: 699
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 703
					var12 = 0; // L: 704
					var13 = 0; // L: 705
					var14 = 0; // L: 706
					var15 = 0; // L: 707
					var16 = 0; // L: 708

					for (var17 = -5; var17 < 109; ++var17) { // L: 709
						var18 = var17 + 5; // L: 710
						if (var18 >= 0 && var18 < 104) { // L: 711
							var12 += class32.Tiles_hue[var18]; // L: 712
							var13 += FriendSystem.Tiles_saturation[var18]; // L: 713
							var14 += DefaultsGroup.Tiles_lightness[var18]; // L: 714
							var15 += ClanChannelMember.Tiles_hueMultiplier[var18]; // L: 715
							var16 += class410.field4590[var18]; // L: 716
						}

						var19 = var17 - 5; // L: 718
						if (var19 >= 0 && var19 < 104) { // L: 719
							var12 -= class32.Tiles_hue[var19]; // L: 720
							var13 -= FriendSystem.Tiles_saturation[var19]; // L: 721
							var14 -= DefaultsGroup.Tiles_lightness[var19]; // L: 722
							var15 -= ClanChannelMember.Tiles_hueMultiplier[var19]; // L: 723
							var16 -= class410.field4590[var19]; // L: 724
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 726 727 728 729
							if (var2 < Tiles.Tiles_minPlane) { // L: 732
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Client.field789 < 209 ? (int)class141.method3037(8) : (int)class141.method3037(15); // L: 733
							int var21 = Tiles.field994[var2][var11][var17] & var20; // L: 734
							int var22 = Tiles.field1001[var2][var11][var17] & var20; // L: 735
							if (var21 > 0 || var22 > 0) { // L: 736
								int var23 = Tiles.Tiles_heights[var2][var11][var17]; // L: 737
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 738
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 739
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 740
								int var27 = Tiles.field995[var11][var17]; // L: 741
								int var28 = Tiles.field995[var11 + 1][var17]; // L: 742
								int var29 = Tiles.field995[var11 + 1][var17 + 1]; // L: 743
								int var30 = Tiles.field995[var11][var17 + 1]; // L: 744
								int var31 = -1; // L: 745
								int var32 = -1; // L: 746
								int var33;
								int var34;
								int var35;
								if (var21 > 0) { // L: 747
									var33 = var12 * 256 / var15; // L: 748
									var34 = var13 / var16; // L: 749
									var35 = var14 / var16; // L: 750
									var31 = UserComparator10.hslToRgb(var33, var34, var35); // L: 751
									var33 = var33 + Tiles.rndHue & 255; // L: 752
									var35 += Tiles.rndLightness; // L: 753
									if (var35 < 0) { // L: 754
										var35 = 0;
									} else if (var35 > 255) { // L: 755
										var35 = 255;
									}

									var32 = UserComparator10.hslToRgb(var33, var34, var35); // L: 756
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) { // L: 758
									boolean var61 = true; // L: 759
									if (var21 == 0 && Tiles.field996[var2][var11][var17] != 0) { // L: 760
										var61 = false;
									}

									if (var22 > 0) { // L: 761
										var35 = var22 - 1; // L: 763
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35); // L: 765
										FloorOverlayDefinition var47;
										if (var36 != null) { // L: 766
											var47 = var36; // L: 767
										} else {
											byte[] var37 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var35); // L: 770
											var36 = new FloorOverlayDefinition(); // L: 771
											if (var37 != null) { // L: 772
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode(); // L: 773
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35); // L: 774
											var47 = var36; // L: 775
										}

										if (!var47.hideUnderlay) { // L: 777
											var61 = false;
										}
									}

									if (var61 && var23 == var24 && var25 == var23 && var26 == var23) { // L: 779 780
										var10000 = UserComparator7.field1410[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0; // L: 783
								if (var32 != -1) { // L: 784
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[Varps.method5679(var32, 96)];
								}

								if (var22 == 0) { // L: 785
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, Varps.method5679(var31, var27), Varps.method5679(var31, var28), Varps.method5679(var31, var29), Varps.method5679(var31, var30), 0, 0, 0, 0, var33, 0); // L: 786
								} else {
									var34 = Tiles.field996[var2][var11][var17] + 1; // L: 789
									byte var62 = class174.field1852[var2][var11][var17]; // L: 790
									int var48 = var22 - 1; // L: 792
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var48); // L: 794
									if (var38 != null) { // L: 795
										var36 = var38; // L: 796
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var48); // L: 799
										var38 = new FloorOverlayDefinition(); // L: 800
										if (var39 != null) { // L: 801
											var38.decode(new Buffer(var39), var48);
										}

										var38.postDecode(); // L: 802
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var48); // L: 803
										var36 = var38; // L: 804
									}

									int var49 = var36.texture; // L: 807
									int var40;
									int var41;
									int var42;
									int var43;
									if (var49 >= 0) { // L: 810
										var41 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var49); // L: 811
										var40 = -1; // L: 812
									} else if (var36.primaryRgb == 16711935) { // L: 815
										var40 = -2; // L: 816
										var49 = -1; // L: 817
										var41 = -2; // L: 818
									} else {
										var40 = UserComparator10.hslToRgb(var36.hue, var36.saturation, var36.lightness); // L: 821
										var42 = var36.hue + Tiles.rndHue & 255; // L: 822
										var43 = var36.lightness + Tiles.rndLightness; // L: 823
										if (var43 < 0) { // L: 824
											var43 = 0;
										} else if (var43 > 255) { // L: 825
											var43 = 255;
										}

										var41 = UserComparator10.hslToRgb(var42, var36.saturation, var43); // L: 826
									}

									var42 = 0; // L: 829
									if (var41 != -2) { // L: 830
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method3516(var41, 96)];
									}

									if (var36.secondaryRgb != -1) { // L: 831
										var43 = var36.secondaryHue + Tiles.rndHue & 255; // L: 832
										int var44 = var36.secondaryLightness + Tiles.rndLightness; // L: 833
										if (var44 < 0) { // L: 834
											var44 = 0;
										} else if (var44 > 255) { // L: 835
											var44 = 255;
										}

										var41 = UserComparator10.hslToRgb(var43, var36.secondarySaturation, var44); // L: 836
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method3516(var41, 96)]; // L: 837
									}

									var0.addTile(var2, var11, var17, var34, var62, var49, var23, var24, var25, var26, Varps.method5679(var31, var27), Varps.method5679(var31, var28), Varps.method5679(var31, var29), Varps.method5679(var31, var30), HealthBarDefinition.method3516(var40, var27), HealthBarDefinition.method3516(var40, var28), HealthBarDefinition.method3516(var40, var29), HealthBarDefinition.method3516(var40, var30), var33, var42); // L: 839
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 846
				for (var12 = 1; var12 < 103; ++var12) { // L: 847
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 854
						var17 = 0; // L: 855
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 858
						var17 = var2 - 1; // L: 859
					} else {
						var17 = var2; // L: 862
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 864
				}
			}

			Tiles.field994[var2] = null; // L: 867
			Tiles.field1001[var2] = null; // L: 868
			Tiles.field996[var2] = null; // L: 869
			class174.field1852[var2] = null; // L: 870
			class32.field179[var2] = null; // L: 871
		}

		var0.method4302(-50, -10, -50); // L: 873

		for (var2 = 0; var2 < 104; ++var2) { // L: 874
			for (var3 = 0; var3 < 104; ++var3) { // L: 875
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 876
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 879
		var3 = 2; // L: 880
		var4 = 4; // L: 881

		for (var5 = 0; var5 < 4; ++var5) { // L: 882
			if (var5 > 0) { // L: 883
				var2 <<= 3; // L: 884
				var3 <<= 3; // L: 885
				var4 <<= 3; // L: 886
			}

			for (int var57 = 0; var57 <= var5; ++var57) { // L: 888
				for (int var58 = 0; var58 <= 104; ++var58) { // L: 889
					for (int var59 = 0; var59 <= 104; ++var59) { // L: 890
						short var60;
						if ((UserComparator7.field1410[var57][var59][var58] & var2) != 0) { // L: 891
							var9 = var58; // L: 892
							var10 = var58; // L: 893
							var11 = var57; // L: 894

							for (var12 = var57; var9 > 0 && (UserComparator7.field1410[var57][var59][var9 - 1] & var2) != 0; --var9) { // L: 895 896
							}

							while (var10 < 104 && (UserComparator7.field1410[var57][var59][var10 + 1] & var2) != 0) { // L: 897
								++var10;
							}

							label490:
							while (var11 > 0) { // L: 898
								for (var13 = var9; var13 <= var10; ++var13) { // L: 899
									if ((UserComparator7.field1410[var11 - 1][var59][var13] & var2) == 0) {
										break label490;
									}
								}

								--var11; // L: 900
							}

							label479:
							while (var12 < var5) { // L: 902
								for (var13 = var9; var13 <= var10; ++var13) { // L: 903
									if ((UserComparator7.field1410[var12 + 1][var59][var13] & var2) == 0) {
										break label479;
									}
								}

								++var12; // L: 904
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 906
							if (var13 >= 8) { // L: 907
								var60 = 240; // L: 908
								var15 = Tiles.Tiles_heights[var12][var59][var9] - var60; // L: 909
								var16 = Tiles.Tiles_heights[var11][var59][var9]; // L: 910
								Scene.Scene_addOccluder(var5, 1, var59 * 128, var59 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 911

								for (var17 = var11; var17 <= var12; ++var17) { // L: 912
									for (var18 = var9; var18 <= var10; ++var18) { // L: 913
										var10000 = UserComparator7.field1410[var17][var59];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((UserComparator7.field1410[var57][var59][var58] & var3) != 0) { // L: 917
							var9 = var59; // L: 918
							var10 = var59; // L: 919
							var11 = var57; // L: 920

							for (var12 = var57; var9 > 0 && (UserComparator7.field1410[var57][var9 - 1][var58] & var3) != 0; --var9) { // L: 921 922
							}

							while (var10 < 104 && (UserComparator7.field1410[var57][var10 + 1][var58] & var3) != 0) { // L: 923
								++var10;
							}

							label543:
							while (var11 > 0) { // L: 924
								for (var13 = var9; var13 <= var10; ++var13) { // L: 925
									if ((UserComparator7.field1410[var11 - 1][var13][var58] & var3) == 0) {
										break label543;
									}
								}

								--var11; // L: 926
							}

							label532:
							while (var12 < var5) { // L: 928
								for (var13 = var9; var13 <= var10; ++var13) { // L: 929
									if ((UserComparator7.field1410[var12 + 1][var13][var58] & var3) == 0) {
										break label532;
									}
								}

								++var12; // L: 930
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 932
							if (var13 >= 8) { // L: 933
								var60 = 240; // L: 934
								var15 = Tiles.Tiles_heights[var12][var9][var58] - var60; // L: 935
								var16 = Tiles.Tiles_heights[var11][var9][var58]; // L: 936
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var58 * 128, var58 * 128, var15, var16); // L: 937

								for (var17 = var11; var17 <= var12; ++var17) { // L: 938
									for (var18 = var9; var18 <= var10; ++var18) { // L: 939
										var10000 = UserComparator7.field1410[var17][var18];
										var10000[var58] &= ~var3;
									}
								}
							}
						}

						if ((UserComparator7.field1410[var57][var59][var58] & var4) != 0) { // L: 943
							var9 = var59; // L: 944
							var10 = var59; // L: 945
							var11 = var58; // L: 946

							for (var12 = var58; var11 > 0 && (UserComparator7.field1410[var57][var59][var11 - 1] & var4) != 0; --var11) { // L: 947 948
							}

							while (var12 < 104 && (UserComparator7.field1410[var57][var59][var12 + 1] & var4) != 0) { // L: 949
								++var12;
							}

							label596:
							while (var9 > 0) { // L: 950
								for (var13 = var11; var13 <= var12; ++var13) { // L: 951
									if ((UserComparator7.field1410[var57][var9 - 1][var13] & var4) == 0) {
										break label596;
									}
								}

								--var9; // L: 952
							}

							label585:
							while (var10 < 104) { // L: 954
								for (var13 = var11; var13 <= var12; ++var13) { // L: 955
									if ((UserComparator7.field1410[var57][var10 + 1][var13] & var4) == 0) {
										break label585;
									}
								}

								++var10; // L: 956
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 958
								var13 = Tiles.Tiles_heights[var57][var9][var11]; // L: 959
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 960

								for (var14 = var9; var14 <= var10; ++var14) { // L: 961
									for (var15 = var11; var15 <= var12; ++var15) { // L: 962
										var10000 = UserComparator7.field1410[var57][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 970

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-1480605607"
	)
	static int method6209(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1223
			var0 -= 1000; // L: 1224
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1225
		} else {
			var3 = var2 ? class140.scriptDotWidget : class136.field1589; // L: 1227
		}

		String var4 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 1228
		int[] var5 = null; // L: 1229
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1230
			int var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1231
			if (var6 > 0) { // L: 1232
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]) { // L: 1233 1234
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1236
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1238

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1239
			if (var4.charAt(var7 - 1) == 's') { // L: 1240
				var9[var7] = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1241
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1243
		if (var7 != -1) { // L: 1244
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1245
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1246
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1247
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1248
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1249
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1250
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1251
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1252
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1253
			var3.onVarTransmit = var9; // L: 1254
			var3.varTransmitTriggers = var5; // L: 1255
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1257
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1258
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1259
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1260
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1261
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1262
			var3.onInvTransmit = var9; // L: 1263
			var3.invTransmitTriggers = var5; // L: 1264
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1266
			var3.onStatTransmit = var9; // L: 1267
			var3.statTransmitTriggers = var5; // L: 1268
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1270
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1271
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1272
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1273
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1274
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1275
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1276
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1277
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1278
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1279
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1280
			var3.field3582 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1281
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1282
			var3.field3602 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1283
			var3.field3473 = var9;
		} else if (var0 == 1430) { // L: 1284
			var3.field3598 = var9;
		} else if (var0 == 1431) { // L: 1285
			var3.field3599 = var9;
		} else if (var0 == 1434) { // L: 1286
			var3.field3610 = var9;
		} else if (var0 == 1435) { // L: 1287
			var3.field3594 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1288
				return 2; // L: 1298
			}

			class298 var8 = var3.method6079(); // L: 1289
			if (var8 != null) { // L: 1290
				if (var0 == 1436) { // L: 1291
					var8.field3413 = var9;
				} else if (var0 == 1437) { // L: 1292
					var8.field3414 = var9;
				} else if (var0 == 1438) { // L: 1293
					var8.field3416 = var9;
				} else if (var0 == 1439) { // L: 1294
					var8.field3415 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1300
		return 1; // L: 1301
	}
}
