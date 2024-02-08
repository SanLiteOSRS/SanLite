import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
public class class30 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive9")
	static Archive archive9;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2073332753"
	)
	public static void method453() {
		class197.field2057.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lii;I)V",
		garbageValue = "717762756"
	)
	static final void method456(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					class136.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1390389151"
	)
	static int method455(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4742
			var3 = class113.Client_plane; // L: 4743
			int var15 = HealthBarDefinition.baseX * 64 + (class25.localPlayer.x >> 7); // L: 4744
			int var8 = WorldMapScaleHandler.baseY * 64 + (class25.localPlayer.y >> 7); // L: 4745
			class132.getWorldMap().method9017(var3, var15, var8, true); // L: 4746
			return 1; // L: 4747
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4749
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4750
				String var16 = ""; // L: 4751
				var9 = class132.getWorldMap().getMapArea(var3); // L: 4752
				if (var9 != null) { // L: 4753
					var16 = var9.getExternalName(); // L: 4754
				}

				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var16; // L: 4756
				return 1; // L: 4757
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4759
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4760
				class132.getWorldMap().setCurrentMapAreaId(var3); // L: 4761
				return 1; // L: 4762
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4764
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getZoomLevel(); // L: 4765
				return 1; // L: 4766
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4768
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4769
				class132.getWorldMap().setZoomPercentage(var3); // L: 4770
				return 1; // L: 4771
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4773
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4774
				return 1; // L: 4775
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4777
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4778
					class132.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4779
					return 1; // L: 4780
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4782
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4783
					class132.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4784
					return 1; // L: 4785
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4787
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4788
					class132.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4789
					return 1; // L: 4790
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4792
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4793
					class132.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4794
					return 1; // L: 4795
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4797
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayX(); // L: 4798
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayY(); // L: 4799
					return 1; // L: 4800
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4802
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4803
						var11 = class132.getWorldMap().getMapArea(var3); // L: 4804
						if (var11 == null) { // L: 4805
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4806
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4809
						}

						return 1; // L: 4811
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4813
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4814
						var11 = class132.getWorldMap().getMapArea(var3); // L: 4815
						if (var11 == null) { // L: 4816
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4817
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4818
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4821
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4822
						}

						return 1; // L: 4824
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4826
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4827
						var11 = class132.getWorldMap().getMapArea(var3); // L: 4828
						if (var11 == null) { // L: 4829
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4830
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4831
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4832
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4833
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4836
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4837
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4838
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4839
						}

						return 1; // L: 4841
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4843
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4844
						var11 = class132.getWorldMap().getMapArea(var3); // L: 4845
						if (var11 == null) { // L: 4846
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4847
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4850
						}

						return 1; // L: 4852
					} else if (var0 == 6615) { // L: 4854
						var14 = class132.getWorldMap().getDisplayCoord(); // L: 4855
						if (var14 == null) { // L: 4856
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4857
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4858
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var14.x; // L: 4861
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var14.y; // L: 4862
						}

						return 1; // L: 4864
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4866
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().currentMapAreaId(); // L: 4867
						return 1; // L: 4868
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4870
						var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4871
						var11 = class132.getWorldMap().getCurrentMapArea(); // L: 4872
						if (var11 == null) { // L: 4873
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4874
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4875
							return 1; // L: 4876
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4878
							if (var12 == null) { // L: 4879
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4880
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4881
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var12[0]; // L: 4884
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var12[1]; // L: 4885
							}

							return 1; // L: 4887
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4889
							var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4890
							var11 = class132.getWorldMap().getCurrentMapArea(); // L: 4891
							if (var11 == null) { // L: 4892
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4893
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4894
								return 1; // L: 4895
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4897
								if (var5 == null) { // L: 4898
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4899
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.packed(); // L: 4902
								}

								return 1; // L: 4904
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4906
								UserComparator6.Interpreter_intStackSize -= 2; // L: 4907
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4908
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 4909
								class36.method731(var3, var10, false); // L: 4910
								return 1; // L: 4911
							} else if (var0 == 6620) { // L: 4913
								UserComparator6.Interpreter_intStackSize -= 2; // L: 4914
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4915
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 4916
								class36.method731(var3, var10, true); // L: 4917
								return 1; // L: 4918
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4920
								UserComparator6.Interpreter_intStackSize -= 2; // L: 4921
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4922
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 4923
								var9 = class132.getWorldMap().getMapArea(var3); // L: 4924
								if (var9 == null) { // L: 4925
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4926
									return 1; // L: 4927
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4929
									return 1; // L: 4930
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4932
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayWith(); // L: 4933
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayHeight(); // L: 4934
								return 1; // L: 4935
							} else if (var0 == 6623) { // L: 4937
								var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4938
								var11 = class132.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4939
								if (var11 == null) { // L: 4940
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4941
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getId(); // L: 4944
								}

								return 1; // L: 4946
							} else if (var0 == 6624) { // L: 4948
								class132.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4949
								return 1; // L: 4950
							} else if (var0 == 6625) { // L: 4952
								class132.getWorldMap().resetMaxFlashCount(); // L: 4953
								return 1; // L: 4954
							} else if (var0 == 6626) { // L: 4956
								class132.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]); // L: 4957
								return 1; // L: 4958
							} else if (var0 == 6627) { // L: 4960
								class132.getWorldMap().resetCyclesPerFlash(); // L: 4961
								return 1; // L: 4962
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4964
									var13 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 4965
									class132.getWorldMap().setPerpetualFlash(var13); // L: 4966
									return 1; // L: 4967
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4969
									var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4970
									class132.getWorldMap().flashElement(var3); // L: 4971
									return 1; // L: 4972
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4974
									var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4975
									class132.getWorldMap().flashCategory(var3); // L: 4976
									return 1; // L: 4977
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4979
									class132.getWorldMap().stopCurrentFlashes(); // L: 4980
									return 1; // L: 4981
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4983
									var13 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 4984
									class132.getWorldMap().setElementsDisabled(var13); // L: 4985
									return 1; // L: 4986
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4988
										UserComparator6.Interpreter_intStackSize -= 2; // L: 4989
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4990
										var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1; // L: 4991
										class132.getWorldMap().disableElement(var3, var7); // L: 4992
										return 1; // L: 4993
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4995
										UserComparator6.Interpreter_intStackSize -= 2; // L: 4996
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4997
										var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1; // L: 4998
										class132.getWorldMap().setCategoryDisabled(var3, var7); // L: 4999
										return 1; // L: 5000
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 5002
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 5003
										return 1; // L: 5004
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 5006
										var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5007
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 5008
										return 1; // L: 5009
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 5011
										var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5012
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 5013
										return 1; // L: 5014
									} else if (var0 == 6638) { // L: 5016
										UserComparator6.Interpreter_intStackSize -= 2; // L: 5017
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 5018
										var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]); // L: 5019
										var5 = class132.getWorldMap().method9025(var3, var10); // L: 5020
										if (var5 == null) { // L: 5021
											Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5022
										} else {
											Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.packed(); // L: 5025
										}

										return 1; // L: 5027
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 5029
											var6 = class132.getWorldMap().iconStart(); // L: 5030
											if (var6 == null) { // L: 5031
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5032
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5033
											} else {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5036
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5037
											}

											return 1; // L: 5039
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5041
											var6 = class132.getWorldMap().iconNext(); // L: 5042
											if (var6 == null) { // L: 5043
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5044
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5045
											} else {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5048
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5049
											}

											return 1; // L: 5051
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5053
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5054
												var4 = class423.WorldMapElement_get(var3); // L: 5055
												if (var4.name == null) { // L: 5056
													Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 5057
												} else {
													Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.name; // L: 5060
												}

												return 1; // L: 5062
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5064
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5065
												var4 = class423.WorldMapElement_get(var3); // L: 5066
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.textSize; // L: 5067
												return 1; // L: 5068
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5070
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5071
												var4 = class423.WorldMapElement_get(var3); // L: 5072
												if (var4 == null) { // L: 5073
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5074
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.category; // L: 5077
												}

												return 1; // L: 5079
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5081
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5082
												var4 = class423.WorldMapElement_get(var3); // L: 5083
												if (var4 == null) { // L: 5084
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 5085
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5088
												}

												return 1; // L: 5090
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5092
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement; // L: 5093
												return 1; // L: 5094
											} else if (var0 == 6698) { // L: 5096
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed(); // L: 5097
												return 1; // L: 5098
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5100
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed(); // L: 5101
												return 1; // L: 5102
											} else {
												return 2; // L: 5104
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
