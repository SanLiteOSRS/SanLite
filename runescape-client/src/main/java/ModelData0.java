import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZS)I",
		garbageValue = "-9190"
	)
	static int method5025(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4654
			var3 = Clock.Client_plane; // L: 4655
			int var15 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7); // L: 4656
			int var8 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7); // L: 4657
			class230.getWorldMap().method8401(var3, var15, var8, true); // L: 4658
			return 1; // L: 4659
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4661
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4662
				String var16 = ""; // L: 4663
				var9 = class230.getWorldMap().getMapArea(var3); // L: 4664
				if (var9 != null) { // L: 4665
					var16 = var9.getExternalName(); // L: 4666
				}

				Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var16; // L: 4668
				return 1; // L: 4669
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4671
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4672
				class230.getWorldMap().setCurrentMapAreaId(var3); // L: 4673
				return 1; // L: 4674
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4676
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getZoomLevel(); // L: 4677
				return 1; // L: 4678
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4680
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4681
				class230.getWorldMap().setZoomPercentage(var3); // L: 4682
				return 1; // L: 4683
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4685
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4686
				return 1; // L: 4687
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4689
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4690
					class230.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4691
					return 1; // L: 4692
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4694
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4695
					class230.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4696
					return 1; // L: 4697
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4699
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4700
					class230.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4701
					return 1; // L: 4702
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4704
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4705
					class230.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4706
					return 1; // L: 4707
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4709
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getDisplayX(); // L: 4710
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getDisplayY(); // L: 4711
					return 1; // L: 4712
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4714
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4715
						var11 = class230.getWorldMap().getMapArea(var3); // L: 4716
						if (var11 == null) { // L: 4717
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4718
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4721
						}

						return 1; // L: 4723
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4725
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4726
						var11 = class230.getWorldMap().getMapArea(var3); // L: 4727
						if (var11 == null) { // L: 4728
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4729
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4730
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4733
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4734
						}

						return 1; // L: 4736
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4738
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4739
						var11 = class230.getWorldMap().getMapArea(var3); // L: 4740
						if (var11 == null) { // L: 4741
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4742
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4743
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4744
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4745
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4748
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4749
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4750
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4751
						}

						return 1; // L: 4753
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4755
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4756
						var11 = class230.getWorldMap().getMapArea(var3); // L: 4757
						if (var11 == null) { // L: 4758
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4759
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4762
						}

						return 1; // L: 4764
					} else if (var0 == 6615) { // L: 4766
						var14 = class230.getWorldMap().getDisplayCoord(); // L: 4767
						if (var14 == null) { // L: 4768
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4769
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4770
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4773
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4774
						}

						return 1; // L: 4776
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4778
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().currentMapAreaId(); // L: 4779
						return 1; // L: 4780
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4782
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4783
						var11 = class230.getWorldMap().getCurrentMapArea(); // L: 4784
						if (var11 == null) { // L: 4785
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4786
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4787
							return 1; // L: 4788
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4790
							if (var12 == null) { // L: 4791
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4792
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4793
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4796
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4797
							}

							return 1; // L: 4799
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4801
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4802
							var11 = class230.getWorldMap().getCurrentMapArea(); // L: 4803
							if (var11 == null) { // L: 4804
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4805
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4806
								return 1; // L: 4807
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4809
								if (var5 == null) { // L: 4810
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4811
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4814
								}

								return 1; // L: 4816
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4818
								Interpreter.Interpreter_intStackSize -= 2; // L: 4819
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4820
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4821
								class304.method5715(var3, var10, false); // L: 4822
								return 1; // L: 4823
							} else if (var0 == 6620) { // L: 4825
								Interpreter.Interpreter_intStackSize -= 2; // L: 4826
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4827
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4828
								class304.method5715(var3, var10, true); // L: 4829
								return 1; // L: 4830
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4832
								Interpreter.Interpreter_intStackSize -= 2; // L: 4833
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4834
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4835
								var9 = class230.getWorldMap().getMapArea(var3); // L: 4836
								if (var9 == null) { // L: 4837
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4838
									return 1; // L: 4839
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4841
									return 1; // L: 4842
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4844
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getDisplayWith(); // L: 4845
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getDisplayHeight(); // L: 4846
								return 1; // L: 4847
							} else if (var0 == 6623) { // L: 4849
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4850
								var11 = class230.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4851
								if (var11 == null) { // L: 4852
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4853
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4856
								}

								return 1; // L: 4858
							} else if (var0 == 6624) { // L: 4860
								class230.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4861
								return 1; // L: 4862
							} else if (var0 == 6625) { // L: 4864
								class230.getWorldMap().resetMaxFlashCount(); // L: 4865
								return 1; // L: 4866
							} else if (var0 == 6626) { // L: 4868
								class230.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4869
								return 1; // L: 4870
							} else if (var0 == 6627) { // L: 4872
								class230.getWorldMap().resetCyclesPerFlash(); // L: 4873
								return 1; // L: 4874
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4876
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4877
									class230.getWorldMap().setPerpetualFlash(var13); // L: 4878
									return 1; // L: 4879
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4881
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4882
									class230.getWorldMap().flashElement(var3); // L: 4883
									return 1; // L: 4884
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4886
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4887
									class230.getWorldMap().flashCategory(var3); // L: 4888
									return 1; // L: 4889
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4891
									class230.getWorldMap().stopCurrentFlashes(); // L: 4892
									return 1; // L: 4893
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4895
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4896
									class230.getWorldMap().setElementsDisabled(var13); // L: 4897
									return 1; // L: 4898
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4900
										Interpreter.Interpreter_intStackSize -= 2; // L: 4901
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4902
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4903
										class230.getWorldMap().disableElement(var3, var7); // L: 4904
										return 1; // L: 4905
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4907
										Interpreter.Interpreter_intStackSize -= 2; // L: 4908
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4909
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4910
										class230.getWorldMap().setCategoryDisabled(var3, var7); // L: 4911
										return 1; // L: 4912
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4914
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4915
										return 1; // L: 4916
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4918
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4919
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4920
										return 1; // L: 4921
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4923
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4924
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4925
										return 1; // L: 4926
									} else if (var0 == 6638) { // L: 4928
										Interpreter.Interpreter_intStackSize -= 2; // L: 4929
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4930
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4931
										var5 = class230.getWorldMap().method8440(var3, var10); // L: 4932
										if (var5 == null) { // L: 4933
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4934
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4937
										}

										return 1; // L: 4939
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4941
											var6 = class230.getWorldMap().iconStart(); // L: 4942
											if (var6 == null) { // L: 4943
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4944
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4945
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4948
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4949
											}

											return 1; // L: 4951
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4953
											var6 = class230.getWorldMap().iconNext(); // L: 4954
											if (var6 == null) { // L: 4955
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4956
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4957
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4960
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4961
											}

											return 1; // L: 4963
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4965
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4966
												var4 = class147.WorldMapElement_get(var3); // L: 4967
												if (var4.name == null) { // L: 4968
													Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4969
												} else {
													Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var4.name; // L: 4972
												}

												return 1; // L: 4974
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4976
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4977
												var4 = class147.WorldMapElement_get(var3); // L: 4978
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4979
												return 1; // L: 4980
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4982
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4983
												var4 = class147.WorldMapElement_get(var3); // L: 4984
												if (var4 == null) { // L: 4985
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4986
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4989
												}

												return 1; // L: 4991
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4993
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4994
												var4 = class147.WorldMapElement_get(var3); // L: 4995
												if (var4 == null) { // L: 4996
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4997
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5000
												}

												return 1; // L: 5002
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5004
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.mapElement; // L: 5005
												return 1; // L: 5006
											} else if (var0 == 6698) { // L: 5008
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.coord1.packed(); // L: 5009
												return 1; // L: 5010
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5012
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class183.worldMapEvent.coord2.packed(); // L: 5013
												return 1; // L: 5014
											} else {
												return 2; // L: 5016
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
