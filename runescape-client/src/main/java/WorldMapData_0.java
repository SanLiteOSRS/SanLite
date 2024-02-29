import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ji")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "-97"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2659.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort() * 4096; // L: 15
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method9693(); // L: 19
			super.fileId = var1.method9693(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2145241583"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 25
		super.floorUnderlayIds = new short[1][64][64]; // L: 26
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 27
		super.field2623 = new byte[super.planes][64][64]; // L: 28
		super.field2626 = new byte[super.planes][64][64]; // L: 29
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 != class255.field2655.value) { // L: 32
			throw new IllegalStateException(""); // L: 33
		} else {
			int var3 = var1.readUnsignedByte(); // L: 35
			int var4 = var1.readUnsignedByte(); // L: 36
			if (var3 == super.regionX && var4 == super.regionY) { // L: 37
				for (int var5 = 0; var5 < 64; ++var5) { // L: 40
					for (int var6 = 0; var6 < 64; ++var6) { // L: 41
						this.readTile(var5, var6, var1); // L: 42
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 38
			}
		}
	} // L: 45

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 49
			return false; // L: 50
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 52
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 53
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 58
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "0"
	)
	static int method4613(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4742
			var3 = class473.Client_plane; // L: 4743
			int var15 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7); // L: 4744
			int var8 = GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7); // L: 4745
			class485.getWorldMap().method8911(var3, var15, var8, true); // L: 4746
			return 1; // L: 4747
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4749
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4750
				String var16 = ""; // L: 4751
				var9 = class485.getWorldMap().getMapArea(var3); // L: 4752
				if (var9 != null) { // L: 4753
					var16 = var9.getExternalName(); // L: 4754
				}

				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var16; // L: 4756
				return 1; // L: 4757
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4759
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4760
				class485.getWorldMap().setCurrentMapAreaId(var3); // L: 4761
				return 1; // L: 4762
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4764
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getZoomLevel(); // L: 4765
				return 1; // L: 4766
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4768
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4769
				class485.getWorldMap().setZoomPercentage(var3); // L: 4770
				return 1; // L: 4771
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4773
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4774
				return 1; // L: 4775
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4777
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4778
					class485.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4779
					return 1; // L: 4780
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4782
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4783
					class485.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4784
					return 1; // L: 4785
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4787
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4788
					class485.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4789
					return 1; // L: 4790
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4792
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4793
					class485.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4794
					return 1; // L: 4795
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4797
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getDisplayX(); // L: 4798
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getDisplayY(); // L: 4799
					return 1; // L: 4800
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4802
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4803
						var11 = class485.getWorldMap().getMapArea(var3); // L: 4804
						if (var11 == null) { // L: 4805
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4806
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4809
						}

						return 1; // L: 4811
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4813
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4814
						var11 = class485.getWorldMap().getMapArea(var3); // L: 4815
						if (var11 == null) { // L: 4816
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4817
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4818
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4821
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4822
						}

						return 1; // L: 4824
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4826
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4827
						var11 = class485.getWorldMap().getMapArea(var3); // L: 4828
						if (var11 == null) { // L: 4829
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4830
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4831
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4832
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4833
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4836
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4837
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4838
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4839
						}

						return 1; // L: 4841
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4843
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4844
						var11 = class485.getWorldMap().getMapArea(var3); // L: 4845
						if (var11 == null) { // L: 4846
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4847
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4850
						}

						return 1; // L: 4852
					} else if (var0 == 6615) { // L: 4854
						var14 = class485.getWorldMap().getDisplayCoord(); // L: 4855
						if (var14 == null) { // L: 4856
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4857
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4858
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4861
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4862
						}

						return 1; // L: 4864
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4866
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().currentMapAreaId(); // L: 4867
						return 1; // L: 4868
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4870
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4871
						var11 = class485.getWorldMap().getCurrentMapArea(); // L: 4872
						if (var11 == null) { // L: 4873
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4874
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4875
							return 1; // L: 4876
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4878
							if (var12 == null) { // L: 4879
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4880
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4881
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4884
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4885
							}

							return 1; // L: 4887
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4889
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4890
							var11 = class485.getWorldMap().getCurrentMapArea(); // L: 4891
							if (var11 == null) { // L: 4892
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4893
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4894
								return 1; // L: 4895
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4897
								if (var5 == null) { // L: 4898
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4899
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4902
								}

								return 1; // L: 4904
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4906
								Interpreter.Interpreter_intStackSize -= 2; // L: 4907
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4908
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4909
								class202.method3918(var3, var10, false); // L: 4910
								return 1; // L: 4911
							} else if (var0 == 6620) { // L: 4913
								Interpreter.Interpreter_intStackSize -= 2; // L: 4914
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4915
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4916
								class202.method3918(var3, var10, true); // L: 4917
								return 1; // L: 4918
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4920
								Interpreter.Interpreter_intStackSize -= 2; // L: 4921
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4922
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4923
								var9 = class485.getWorldMap().getMapArea(var3); // L: 4924
								if (var9 == null) { // L: 4925
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4926
									return 1; // L: 4927
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4929
									return 1; // L: 4930
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4932
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getDisplayWith(); // L: 4933
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getDisplayHeight(); // L: 4934
								return 1; // L: 4935
							} else if (var0 == 6623) { // L: 4937
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4938
								var11 = class485.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4939
								if (var11 == null) { // L: 4940
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4941
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4944
								}

								return 1; // L: 4946
							} else if (var0 == 6624) { // L: 4948
								class485.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4949
								return 1; // L: 4950
							} else if (var0 == 6625) { // L: 4952
								class485.getWorldMap().resetMaxFlashCount(); // L: 4953
								return 1; // L: 4954
							} else if (var0 == 6626) { // L: 4956
								class485.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4957
								return 1; // L: 4958
							} else if (var0 == 6627) { // L: 4960
								class485.getWorldMap().resetCyclesPerFlash(); // L: 4961
								return 1; // L: 4962
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4964
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4965
									class485.getWorldMap().setPerpetualFlash(var13); // L: 4966
									return 1; // L: 4967
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4969
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4970
									class485.getWorldMap().flashElement(var3); // L: 4971
									return 1; // L: 4972
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4974
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4975
									class485.getWorldMap().flashCategory(var3); // L: 4976
									return 1; // L: 4977
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4979
									class485.getWorldMap().stopCurrentFlashes(); // L: 4980
									return 1; // L: 4981
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4983
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4984
									class485.getWorldMap().setElementsDisabled(var13); // L: 4985
									return 1; // L: 4986
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4988
										Interpreter.Interpreter_intStackSize -= 2; // L: 4989
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4990
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4991
										class485.getWorldMap().disableElement(var3, var7); // L: 4992
										return 1; // L: 4993
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4995
										Interpreter.Interpreter_intStackSize -= 2; // L: 4996
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4997
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4998
										class485.getWorldMap().setCategoryDisabled(var3, var7); // L: 4999
										return 1; // L: 5000
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 5002
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 5003
										return 1; // L: 5004
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 5006
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5007
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 5008
										return 1; // L: 5009
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 5011
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5012
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class485.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 5013
										return 1; // L: 5014
									} else if (var0 == 6638) { // L: 5016
										Interpreter.Interpreter_intStackSize -= 2; // L: 5017
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5018
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 5019
										var5 = class485.getWorldMap().method8956(var3, var10); // L: 5020
										if (var5 == null) { // L: 5021
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5022
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 5025
										}

										return 1; // L: 5027
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 5029
											var6 = class485.getWorldMap().iconStart(); // L: 5030
											if (var6 == null) { // L: 5031
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5032
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5033
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5036
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5037
											}

											return 1; // L: 5039
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5041
											var6 = class485.getWorldMap().iconNext(); // L: 5042
											if (var6 == null) { // L: 5043
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5044
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5045
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5048
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5049
											}

											return 1; // L: 5051
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5053
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5054
												var4 = class139.WorldMapElement_get(var3); // L: 5055
												if (var4.name == null) { // L: 5056
													Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 5057
												} else {
													Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4.name; // L: 5060
												}

												return 1; // L: 5062
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5064
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5065
												var4 = class139.WorldMapElement_get(var3); // L: 5066
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 5067
												return 1; // L: 5068
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5070
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5071
												var4 = class139.WorldMapElement_get(var3); // L: 5072
												if (var4 == null) { // L: 5073
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5074
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 5077
												}

												return 1; // L: 5079
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5081
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5082
												var4 = class139.WorldMapElement_get(var3); // L: 5083
												if (var4 == null) { // L: 5084
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5085
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5088
												}

												return 1; // L: 5090
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5092
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class429.worldMapEvent.mapElement; // L: 5093
												return 1; // L: 5094
											} else if (var0 == 6698) { // L: 5096
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class429.worldMapEvent.coord1.packed(); // L: 5097
												return 1; // L: 5098
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5100
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class429.worldMapEvent.coord2.packed(); // L: 5101
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
