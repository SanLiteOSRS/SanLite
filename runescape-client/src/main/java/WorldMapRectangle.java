import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("is")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -136664415
	)
	static int field2963;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1539762259
	)
	@Export("width")
	int width;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1201232349
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1721050557
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 437187605
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "1397546589"
	)
	static int method5329(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4515
			var3 = class103.Client_plane; // L: 4516
			int var15 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7); // L: 4517
			int var8 = Client.baseY * 64 + (class387.localPlayer.y >> 7); // L: 4518
			WorldMapDecorationType.getWorldMap().method8306(var3, var15, var8, true); // L: 4519
			return 1; // L: 4520
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4522
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4523
				String var16 = ""; // L: 4524
				var9 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4525
				if (var9 != null) { // L: 4526
					var16 = var9.getExternalName(); // L: 4527
				}

				Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var16; // L: 4529
				return 1; // L: 4530
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4532
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4533
				WorldMapDecorationType.getWorldMap().setCurrentMapAreaId(var3); // L: 4534
				return 1; // L: 4535
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4537
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getZoomLevel(); // L: 4538
				return 1; // L: 4539
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4541
				var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4542
				WorldMapDecorationType.getWorldMap().setZoomPercentage(var3); // L: 4543
				return 1; // L: 4544
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4546
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4547
				return 1; // L: 4548
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4550
					var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4551
					WorldMapDecorationType.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4552
					return 1; // L: 4553
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4555
					var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4556
					WorldMapDecorationType.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4557
					return 1; // L: 4558
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4560
					var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4561
					WorldMapDecorationType.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4562
					return 1; // L: 4563
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4565
					var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4566
					WorldMapDecorationType.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4567
					return 1; // L: 4568
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4570
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayX(); // L: 4571
					Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayY(); // L: 4572
					return 1; // L: 4573
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4575
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4576
						var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4577
						if (var11 == null) { // L: 4578
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4579
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4582
						}

						return 1; // L: 4584
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4586
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4587
						var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4588
						if (var11 == null) { // L: 4589
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4590
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4591
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4594
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4595
						}

						return 1; // L: 4597
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4599
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4600
						var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4601
						if (var11 == null) { // L: 4602
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4603
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4604
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4605
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4606
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4609
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4610
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4611
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4612
						}

						return 1; // L: 4614
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4616
						var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4617
						var11 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4618
						if (var11 == null) { // L: 4619
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4620
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4623
						}

						return 1; // L: 4625
					} else if (var0 == 6615) { // L: 4627
						var14 = WorldMapDecorationType.getWorldMap().getDisplayCoord(); // L: 4628
						if (var14 == null) { // L: 4629
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4630
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4631
						} else {
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var14.x; // L: 4634
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var14.y; // L: 4635
						}

						return 1; // L: 4637
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4639
						Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().currentMapAreaId(); // L: 4640
						return 1; // L: 4641
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4643
						var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4644
						var11 = WorldMapDecorationType.getWorldMap().getCurrentMapArea(); // L: 4645
						if (var11 == null) { // L: 4646
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4647
							Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4648
							return 1; // L: 4649
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4651
							if (var12 == null) { // L: 4652
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4653
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4654
							} else {
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var12[0]; // L: 4657
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var12[1]; // L: 4658
							}

							return 1; // L: 4660
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4662
							var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4663
							var11 = WorldMapDecorationType.getWorldMap().getCurrentMapArea(); // L: 4664
							if (var11 == null) { // L: 4665
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4666
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4667
								return 1; // L: 4668
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4670
								if (var5 == null) { // L: 4671
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4672
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.packed(); // L: 4675
								}

								return 1; // L: 4677
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4679
								class302.Interpreter_intStackSize -= 2; // L: 4680
								var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4681
								var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 4682
								class124.method3040(var3, var10, false); // L: 4683
								return 1; // L: 4684
							} else if (var0 == 6620) { // L: 4686
								class302.Interpreter_intStackSize -= 2; // L: 4687
								var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4688
								var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 4689
								class124.method3040(var3, var10, true); // L: 4690
								return 1; // L: 4691
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4693
								class302.Interpreter_intStackSize -= 2; // L: 4694
								var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4695
								var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 4696
								var9 = WorldMapDecorationType.getWorldMap().getMapArea(var3); // L: 4697
								if (var9 == null) { // L: 4698
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 4699
									return 1; // L: 4700
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4702
									return 1; // L: 4703
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4705
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayWith(); // L: 4706
								Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getDisplayHeight(); // L: 4707
								return 1; // L: 4708
							} else if (var0 == 6623) { // L: 4710
								var14 = new Coord(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4711
								var11 = WorldMapDecorationType.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4712
								if (var11 == null) { // L: 4713
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4714
								} else {
									Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var11.getId(); // L: 4717
								}

								return 1; // L: 4719
							} else if (var0 == 6624) { // L: 4721
								WorldMapDecorationType.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4722
								return 1; // L: 4723
							} else if (var0 == 6625) { // L: 4725
								WorldMapDecorationType.getWorldMap().resetMaxFlashCount(); // L: 4726
								return 1; // L: 4727
							} else if (var0 == 6626) { // L: 4729
								WorldMapDecorationType.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 4730
								return 1; // L: 4731
							} else if (var0 == 6627) { // L: 4733
								WorldMapDecorationType.getWorldMap().resetCyclesPerFlash(); // L: 4734
								return 1; // L: 4735
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4737
									var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 4738
									WorldMapDecorationType.getWorldMap().setPerpetualFlash(var13); // L: 4739
									return 1; // L: 4740
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4742
									var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4743
									WorldMapDecorationType.getWorldMap().flashElement(var3); // L: 4744
									return 1; // L: 4745
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4747
									var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4748
									WorldMapDecorationType.getWorldMap().flashCategory(var3); // L: 4749
									return 1; // L: 4750
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4752
									WorldMapDecorationType.getWorldMap().stopCurrentFlashes(); // L: 4753
									return 1; // L: 4754
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4756
									var13 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize] == 1; // L: 4757
									WorldMapDecorationType.getWorldMap().setElementsDisabled(var13); // L: 4758
									return 1; // L: 4759
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4761
										class302.Interpreter_intStackSize -= 2; // L: 4762
										var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4763
										var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1; // L: 4764
										WorldMapDecorationType.getWorldMap().disableElement(var3, var7); // L: 4765
										return 1; // L: 4766
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4768
										class302.Interpreter_intStackSize -= 2; // L: 4769
										var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4770
										var7 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1] == 1; // L: 4771
										WorldMapDecorationType.getWorldMap().setCategoryDisabled(var3, var7); // L: 4772
										return 1; // L: 4773
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4775
										Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4776
										return 1; // L: 4777
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4779
										var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4780
										Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4781
										return 1; // L: 4782
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4784
										var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4785
										Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = WorldMapDecorationType.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4786
										return 1; // L: 4787
									} else if (var0 == 6638) { // L: 4789
										class302.Interpreter_intStackSize -= 2; // L: 4790
										var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 4791
										var10 = new Coord(Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]); // L: 4792
										var5 = WorldMapDecorationType.getWorldMap().method8114(var3, var10); // L: 4793
										if (var5 == null) { // L: 4794
											Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4795
										} else {
											Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var5.packed(); // L: 4798
										}

										return 1; // L: 4800
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4802
											var6 = WorldMapDecorationType.getWorldMap().iconStart(); // L: 4803
											if (var6 == null) { // L: 4804
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4805
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4806
											} else {
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4809
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4810
											}

											return 1; // L: 4812
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4814
											var6 = WorldMapDecorationType.getWorldMap().iconNext(); // L: 4815
											if (var6 == null) { // L: 4816
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4817
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4818
											} else {
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4821
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4822
											}

											return 1; // L: 4824
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4826
												var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4827
												var4 = class4.WorldMapElement_get(var3); // L: 4828
												if (var4.name == null) { // L: 4829
													Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = ""; // L: 4830
												} else {
													Interpreter.Interpreter_stringStack[++class20.Interpreter_stringStackSize - 1] = var4.name; // L: 4833
												}

												return 1; // L: 4835
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4837
												var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4838
												var4 = class4.WorldMapElement_get(var3); // L: 4839
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.textSize; // L: 4840
												return 1; // L: 4841
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4843
												var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4844
												var4 = class4.WorldMapElement_get(var3); // L: 4845
												if (var4 == null) { // L: 4846
													Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4847
												} else {
													Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.category; // L: 4850
												}

												return 1; // L: 4852
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4854
												var3 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 4855
												var4 = class4.WorldMapElement_get(var3); // L: 4856
												if (var4 == null) { // L: 4857
													Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = -1; // L: 4858
												} else {
													Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4861
												}

												return 1; // L: 4863
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4865
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.mapElement; // L: 4866
												return 1; // L: 4867
											} else if (var0 == 6698) { // L: 4869
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.coord1.packed(); // L: 4870
												return 1; // L: 4871
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4873
												Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class20.worldMapEvent.coord2.packed(); // L: 4874
												return 1; // L: 4875
											} else {
												return 2; // L: 4877
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
