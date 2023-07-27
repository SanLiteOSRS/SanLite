import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 13028

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILij;I)Z",
		garbageValue = "2142084611"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 13032
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "451306103"
	)
	static float method1245(class130 var0, float var1) {
		if (var0 != null && var0.method2999() != 0) { // L: 20
			if (var1 < (float)var0.field1536[0].field1483) { // L: 23
				return var0.field1534 == class128.field1524 ? var0.field1536[0].field1488 : Language.method7006(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1536[var0.method2999() - 1].field1483) { // L: 29
				return var0.field1547 == class128.field1524 ? var0.field1536[var0.method2999() - 1].field1488 : Language.method7006(var0, var1, false); // L: 30 31 33
			} else if (var0.field1533) { // L: 35
				return var0.field1536[0].field1488; // L: 36
			} else {
				class125 var2 = var0.method2998(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 170
				} else {
					if (0.0D == (double)var2.field1486 && (double)var2.field1487 == 0.0D) { // L: 42
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1486 && Float.MAX_VALUE == var2.field1487) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1485 != null) { // L: 48
						if (var0.field1548) { // L: 49
							float var5 = (float)var2.field1483; // L: 58
							float var9 = var2.field1488; // L: 59
							float var6 = 0.33333334F * var2.field1486 + var5; // L: 60
							float var10 = var9 + 0.33333334F * var2.field1487; // L: 61
							float var8 = (float)var2.field1485.field1483; // L: 62
							float var12 = var2.field1485.field1488; // L: 63
							float var7 = var8 - 0.33333334F * var2.field1485.field1484; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1485.field1482; // L: 65
							float var13;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1532) { // L: 66
								var15 = var10; // L: 69
								var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									var17 = var8 - var5; // L: 75
									if ((double)var17 != 0.0D) { // L: 76
										var18 = var6 - var5; // L: 79
										var19 = var7 - var5; // L: 80
										float[] var27 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1543 = 0.33333334F == var27[0] && var27[1] == 0.6666667F; // L: 84
										float var21 = var27[0]; // L: 85
										float var22 = var27[1]; // L: 86
										if ((double)var27[0] < 0.0D) { // L: 87
											var27[0] = 0.0F;
										}

										if ((double)var27[1] > 1.0D) { // L: 88
											var27[1] = 1.0F;
										}

										if ((double)var27[0] > 1.0D || var27[1] < -1.0F) { // L: 89
											UserComparator3.method2886(var27); // L: 90
										}

										if (var21 != var27[0]) { // L: 92
											var13 = var17 * var27[0] + var5; // L: 93
											if ((double)var21 != 0.0D) { // L: 94
												var15 = (var10 - var9) * var27[0] / var21 + var9; // L: 95
											}
										}

										if (var22 != var27[1]) { // L: 98
											var14 = var17 * var27[1] + var5; // L: 99
											if (1.0D != (double)var22) { // L: 100
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var27[1]) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1538 = var5; // L: 104
										var0.field1535 = var8; // L: 105
										ParamComposition.method3847(0.0F, var27[0], var27[1], 1.0F, var0); // L: 106
										float var23 = var15 - var9; // L: 108
										float var24 = var16 - var15; // L: 109
										float var25 = var12 - var16; // L: 110
										float var26 = var24 - var23; // L: 111
										var0.field1537 = var25 - var24 - var26; // L: 112
										var0.field1546 = var26 + var26 + var26; // L: 113
										var0.field1553 = var23 + var23 + var23; // L: 114
										var0.field1544 = var9; // L: 115
									}
								}
							} else if (var0 != null) { // L: 121
								var0.field1538 = var5; // L: 124
								var13 = var8 - var5; // L: 125
								var14 = var12 - var9; // L: 126
								var15 = var6 - var5; // L: 127
								var16 = 0.0F; // L: 128
								var17 = 0.0F; // L: 129
								if ((double)var15 != 0.0D) { // L: 130
									var16 = (var10 - var9) / var15; // L: 131
								}

								var15 = var8 - var7; // L: 133
								if (0.0D != (double)var15) { // L: 134
									var17 = (var12 - var11) / var15; // L: 135
								}

								var18 = 1.0F / (var13 * var13); // L: 137
								var19 = var13 * var16; // L: 138
								float var20 = var17 * var13; // L: 139
								var0.field1540 = var18 * (var20 + var19 - var14 - var14) / var13; // L: 140
								var0.field1541 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 141
								var0.field1542 = var16; // L: 142
								var0.field1550 = var9; // L: 143
							}

							var0.field1548 = false; // L: 146
						}
					} else {
						var3 = true; // L: 150
					}

					if (var3) { // L: 152
						return var2.field1488; // L: 153
					} else if (var4) { // L: 155
						return (float)var2.field1483 != var1 && var2.field1485 != null ? var2.field1485.field1488 : var2.field1488; // L: 156 157 160
					} else {
						return var0.field1532 ? class194.method3703(var0, var1) : class165.method3402(var0, var1); // L: 163 164 167
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1468252059"
	)
	public static void method1244(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 43
	} // L: 44

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZS)I",
		garbageValue = "-12497"
	)
	static int method1246(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2660
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2661
			return 1; // L: 2662
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2664
				Interpreter.Interpreter_intStackSize -= 2; // L: 2665
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2666
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2667
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.method5736(var3, var4); // L: 2668
				return 1; // L: 2669
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2671
				Interpreter.Interpreter_intStackSize -= 2; // L: 2672
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2673
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2674
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.ItemContainer_getCount(var3, var4); // L: 2675
				return 1; // L: 2676
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2678
				Interpreter.Interpreter_intStackSize -= 2; // L: 2679
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2680
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2681
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.method1947(var3, var4); // L: 2682
				return 1; // L: 2683
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2685
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2686
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.getInvDefinition(var3).size; // L: 2687
				return 1; // L: 2688
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2690
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2691
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2692
				return 1; // L: 2693
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2695
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2696
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2697
				return 1; // L: 2698
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2700
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2701
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2702
				return 1; // L: 2703
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2705
					var3 = class36.Client_plane; // L: 2706
					var4 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7); // L: 2707
					var5 = class148.baseY * 64 + (class136.localPlayer.y >> 7); // L: 2708
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2709
					return 1; // L: 2710
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2712
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2713
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2714
					return 1; // L: 2715
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2717
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2718
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2719
					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2722
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2723
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2724
					return 1; // L: 2725
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2727
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2728
					return 1; // L: 2729
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2731
					Interpreter.Interpreter_intStackSize -= 2; // L: 2732
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2733
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2734
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.method5736(var3, var4); // L: 2735
					return 1; // L: 2736
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2738
					Interpreter.Interpreter_intStackSize -= 2; // L: 2739
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2740
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2741
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.ItemContainer_getCount(var3, var4); // L: 2742
					return 1; // L: 2743
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2745
					Interpreter.Interpreter_intStackSize -= 2; // L: 2746
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2747
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.method1947(var3, var4); // L: 2749
					return 1; // L: 2750
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2752
					if (Client.staffModLevel >= 2) { // L: 2753
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2754
					}

					return 1; // L: 2755
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2757
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2758
					return 1; // L: 2759
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2761
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2762
					return 1; // L: 2763
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2765
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field690 / 100; // L: 2766
					return 1; // L: 2767
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2769
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2770
					return 1; // L: 2771
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2773
					if (Client.playerMod) { // L: 2774
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2775
					}

					return 1; // L: 2776
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2778
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2782
					Interpreter.Interpreter_intStackSize -= 4; // L: 2783
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2784
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2785
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2786
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2787
					var3 += var4 << 14; // L: 2788
					var3 += var5 << 28; // L: 2789
					var3 += var6; // L: 2790
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2791
					return 1; // L: 2792
				} else if (var0 == 3326) { // L: 2794
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field743; // L: 2795
					return 1; // L: 2796
				} else if (var0 == 3327) { // L: 2798
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field532; // L: 2799
					return 1; // L: 2800
				} else if (var0 == 3331) { // L: 2802
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field690; // L: 2803
					return 1; // L: 2804
				} else {
					return 2; // L: 2806
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2112043439"
	)
	static int method1247(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 4420
			Interpreter.Interpreter_intStackSize -= 2; // L: 4421
			Client.field787 = (short)GameObject.method5073(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4422
			if (Client.field787 <= 0) { // L: 4423
				Client.field787 = 256;
			}

			Client.field777 = (short)GameObject.method5073(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4424
			if (Client.field777 <= 0) { // L: 4425
				Client.field777 = 256;
			}

			return 1; // L: 4426
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 4428
			Interpreter.Interpreter_intStackSize -= 2; // L: 4429
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4430
			if (Client.zoomHeight <= 0) { // L: 4431
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4432
			if (Client.zoomWidth <= 0) { // L: 4433
				Client.zoomWidth = 320;
			}

			return 1; // L: 4434
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 4436
			Interpreter.Interpreter_intStackSize -= 4; // L: 4437
			Client.field791 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4438
			if (Client.field791 <= 0) { // L: 4439
				Client.field791 = 1;
			}

			Client.field592 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4440
			if (Client.field592 <= 0) { // L: 4441
				Client.field592 = 32767;
			} else if (Client.field592 < Client.field791) { // L: 4442
				Client.field592 = Client.field791;
			}

			Client.field759 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4443
			if (Client.field759 <= 0) { // L: 4444
				Client.field759 = 1;
			}

			Client.field794 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 4445
			if (Client.field794 <= 0) { // L: 4446
				Client.field794 = 32767;
			} else if (Client.field794 < Client.field759) { // L: 4447
				Client.field794 = Client.field759;
			}

			return 1; // L: 4448
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4450
			if (Client.viewportWidget != null) { // L: 4451
				class31.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4452
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4453
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4454
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4457
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4458
			}

			return 1; // L: 4460
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4462
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4463
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4464
			return 1; // L: 4465
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4467
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.method3337(Client.field787); // L: 4468
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.method3337(Client.field777); // L: 4469
			return 1; // L: 4470
		} else if (var0 == 6220) { // L: 4472
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4473
			return 1; // L: 4474
		} else if (var0 == 6221) { // L: 4476
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4477
			return 1; // L: 4478
		} else if (var0 == 6222) { // L: 4480
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 4481
			return 1; // L: 4482
		} else if (var0 == 6223) { // L: 4484
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.canvasHeight; // L: 4485
			return 1; // L: 4486
		} else {
			return 2; // L: 4488
		}
	}
}
