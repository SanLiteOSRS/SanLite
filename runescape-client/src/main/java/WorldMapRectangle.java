import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ke")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 579585657
	)
	@Export("width")
	int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -226651423
	)
	@Export("height")
	int height;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -758750633
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1675209229
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljb;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 305
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "112919376"
	)
	static int method5542(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4693
			var3 = BuddyRankComparator.Client_plane; // L: 4694
			int var15 = class166.baseX * 64 + (class27.localPlayer.x >> 7); // L: 4695
			int var8 = class9.baseY * 64 + (class27.localPlayer.y >> 7); // L: 4696
			AbstractUserComparator.getWorldMap().method8516(var3, var15, var8, true); // L: 4697
			return 1; // L: 4698
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4700
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4701
				String var16 = ""; // L: 4702
				var9 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4703
				if (var9 != null) { // L: 4704
					var16 = var9.getExternalName(); // L: 4705
				}

				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var16; // L: 4707
				return 1; // L: 4708
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4710
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4711
				AbstractUserComparator.getWorldMap().setCurrentMapAreaId(var3); // L: 4712
				return 1; // L: 4713
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4715
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getZoomLevel(); // L: 4716
				return 1; // L: 4717
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4719
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4720
				AbstractUserComparator.getWorldMap().setZoomPercentage(var3); // L: 4721
				return 1; // L: 4722
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4724
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4725
				return 1; // L: 4726
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4728
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4729
					AbstractUserComparator.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4730
					return 1; // L: 4731
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4733
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4734
					AbstractUserComparator.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4735
					return 1; // L: 4736
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4738
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4739
					AbstractUserComparator.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4740
					return 1; // L: 4741
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4743
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4744
					AbstractUserComparator.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4745
					return 1; // L: 4746
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getDisplayX(); // L: 4749
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getDisplayY(); // L: 4750
					return 1; // L: 4751
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4753
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4754
						var11 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4755
						if (var11 == null) { // L: 4756
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4757
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4760
						}

						return 1; // L: 4762
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4764
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4765
						var11 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4766
						if (var11 == null) { // L: 4767
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4768
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4769
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4772
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4773
						}

						return 1; // L: 4775
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4777
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4778
						var11 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4779
						if (var11 == null) { // L: 4780
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4781
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4782
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4783
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4784
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4787
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4788
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4789
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4790
						}

						return 1; // L: 4792
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4794
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4795
						var11 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4796
						if (var11 == null) { // L: 4797
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4798
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4801
						}

						return 1; // L: 4803
					} else if (var0 == 6615) { // L: 4805
						var14 = AbstractUserComparator.getWorldMap().getDisplayCoord(); // L: 4806
						if (var14 == null) { // L: 4807
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4808
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4809
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4812
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4813
						}

						return 1; // L: 4815
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4817
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().currentMapAreaId(); // L: 4818
						return 1; // L: 4819
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4821
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4822
						var11 = AbstractUserComparator.getWorldMap().getCurrentMapArea(); // L: 4823
						if (var11 == null) { // L: 4824
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4825
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4826
							return 1; // L: 4827
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4829
							if (var12 == null) { // L: 4830
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4831
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4832
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4835
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4836
							}

							return 1; // L: 4838
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4840
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4841
							var11 = AbstractUserComparator.getWorldMap().getCurrentMapArea(); // L: 4842
							if (var11 == null) { // L: 4843
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4844
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4845
								return 1; // L: 4846
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4848
								if (var5 == null) { // L: 4849
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4850
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4853
								}

								return 1; // L: 4855
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4857
								Interpreter.Interpreter_intStackSize -= 2; // L: 4858
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4859
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4860
								World.method1863(var3, var10, false); // L: 4861
								return 1; // L: 4862
							} else if (var0 == 6620) { // L: 4864
								Interpreter.Interpreter_intStackSize -= 2; // L: 4865
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4866
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4867
								World.method1863(var3, var10, true); // L: 4868
								return 1; // L: 4869
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4871
								Interpreter.Interpreter_intStackSize -= 2; // L: 4872
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4873
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4874
								var9 = AbstractUserComparator.getWorldMap().getMapArea(var3); // L: 4875
								if (var9 == null) { // L: 4876
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4877
									return 1; // L: 4878
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4880
									return 1; // L: 4881
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4883
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getDisplayWith(); // L: 4884
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getDisplayHeight(); // L: 4885
								return 1; // L: 4886
							} else if (var0 == 6623) { // L: 4888
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4889
								var11 = AbstractUserComparator.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4890
								if (var11 == null) { // L: 4891
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4892
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4895
								}

								return 1; // L: 4897
							} else if (var0 == 6624) { // L: 4899
								AbstractUserComparator.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4900
								return 1; // L: 4901
							} else if (var0 == 6625) { // L: 4903
								AbstractUserComparator.getWorldMap().resetMaxFlashCount(); // L: 4904
								return 1; // L: 4905
							} else if (var0 == 6626) { // L: 4907
								AbstractUserComparator.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4908
								return 1; // L: 4909
							} else if (var0 == 6627) { // L: 4911
								AbstractUserComparator.getWorldMap().resetCyclesPerFlash(); // L: 4912
								return 1; // L: 4913
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4915
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4916
									AbstractUserComparator.getWorldMap().setPerpetualFlash(var13); // L: 4917
									return 1; // L: 4918
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4920
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4921
									AbstractUserComparator.getWorldMap().flashElement(var3); // L: 4922
									return 1; // L: 4923
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4925
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4926
									AbstractUserComparator.getWorldMap().flashCategory(var3); // L: 4927
									return 1; // L: 4928
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4930
									AbstractUserComparator.getWorldMap().stopCurrentFlashes(); // L: 4931
									return 1; // L: 4932
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4934
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4935
									AbstractUserComparator.getWorldMap().setElementsDisabled(var13); // L: 4936
									return 1; // L: 4937
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4939
										Interpreter.Interpreter_intStackSize -= 2; // L: 4940
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4941
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4942
										AbstractUserComparator.getWorldMap().disableElement(var3, var7); // L: 4943
										return 1; // L: 4944
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4946
										Interpreter.Interpreter_intStackSize -= 2; // L: 4947
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4948
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4949
										AbstractUserComparator.getWorldMap().setCategoryDisabled(var3, var7); // L: 4950
										return 1; // L: 4951
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4953
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4954
										return 1; // L: 4955
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4957
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4958
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4959
										return 1; // L: 4960
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4962
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4963
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AbstractUserComparator.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4964
										return 1; // L: 4965
									} else if (var0 == 6638) { // L: 4967
										Interpreter.Interpreter_intStackSize -= 2; // L: 4968
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4969
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4970
										var5 = AbstractUserComparator.getWorldMap().method8691(var3, var10); // L: 4971
										if (var5 == null) { // L: 4972
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4973
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4976
										}

										return 1; // L: 4978
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4980
											var6 = AbstractUserComparator.getWorldMap().iconStart(); // L: 4981
											if (var6 == null) { // L: 4982
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4983
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4984
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4987
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4988
											}

											return 1; // L: 4990
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4992
											var6 = AbstractUserComparator.getWorldMap().iconNext(); // L: 4993
											if (var6 == null) { // L: 4994
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4995
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4996
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4999
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5000
											}

											return 1; // L: 5002
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5004
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5005
												var4 = class127.WorldMapElement_get(var3); // L: 5006
												if (var4.name == null) { // L: 5007
													Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 5008
												} else {
													Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4.name; // L: 5011
												}

												return 1; // L: 5013
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5015
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5016
												var4 = class127.WorldMapElement_get(var3); // L: 5017
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 5018
												return 1; // L: 5019
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5021
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5022
												var4 = class127.WorldMapElement_get(var3); // L: 5023
												if (var4 == null) { // L: 5024
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5025
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 5028
												}

												return 1; // L: 5030
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5032
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5033
												var4 = class127.WorldMapElement_get(var3); // L: 5034
												if (var4 == null) { // L: 5035
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5036
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5039
												}

												return 1; // L: 5041
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5043
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement; // L: 5044
												return 1; // L: 5045
											} else if (var0 == 6698) { // L: 5047
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed(); // L: 5048
												return 1; // L: 5049
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5051
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed(); // L: 5052
												return 1; // L: 5053
											} else {
												return 2; // L: 5055
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

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715762221"
	)
	static void method5543() {
		if (ScriptFrame.worldMap != null) { // L: 4548
			ScriptFrame.worldMap.method8516(BuddyRankComparator.Client_plane, class166.baseX * 64 + (class27.localPlayer.x >> 7), class9.baseY * 64 + (class27.localPlayer.y >> 7), false); // L: 4549
			ScriptFrame.worldMap.loadCache(); // L: 4550
		}

	} // L: 4552
}
