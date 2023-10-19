import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oz")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("aq")
	static String field4377;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static Widget field4374;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;B)I",
		garbageValue = "59"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-1254192693"
	)
	static void method7053(ArrayList var0, boolean var1) {
		if (!var1) { // L: 205
			class319.field3440.clear(); // L: 206
		}

		Iterator var2 = var0.iterator(); // L: 208

		while (var2.hasNext()) {
			class331 var3 = (class331)var2.next(); // L: 209
			if (var3.field3539 != -1 && var3.field3540 != -1) { // L: 211
				if (!var1) { // L: 214
					class319.field3440.add(var3); // L: 215
				}

				class319.field3428.add(var3); // L: 217
			}
		}

	} // L: 220

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-33084570"
	)
	static int method7062(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4707
			var3 = class87.Client_plane; // L: 4708
			int var15 = class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7); // L: 4709
			int var8 = class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7); // L: 4710
			class153.getWorldMap().method8664(var3, var15, var8, true); // L: 4711
			return 1; // L: 4712
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4714
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4715
				String var16 = ""; // L: 4716
				var9 = class153.getWorldMap().getMapArea(var3); // L: 4717
				if (var9 != null) { // L: 4718
					var16 = var9.getExternalName(); // L: 4719
				}

				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var16; // L: 4721
				return 1; // L: 4722
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4724
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4725
				class153.getWorldMap().setCurrentMapAreaId(var3); // L: 4726
				return 1; // L: 4727
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4729
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getZoomLevel(); // L: 4730
				return 1; // L: 4731
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4733
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4734
				class153.getWorldMap().setZoomPercentage(var3); // L: 4735
				return 1; // L: 4736
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4738
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4739
				return 1; // L: 4740
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4742
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4743
					class153.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4744
					return 1; // L: 4745
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4747
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4748
					class153.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4749
					return 1; // L: 4750
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4752
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4753
					class153.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4754
					return 1; // L: 4755
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4757
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4758
					class153.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4759
					return 1; // L: 4760
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getDisplayX(); // L: 4763
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getDisplayY(); // L: 4764
					return 1; // L: 4765
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4767
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4768
						var11 = class153.getWorldMap().getMapArea(var3); // L: 4769
						if (var11 == null) { // L: 4770
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4771
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4774
						}

						return 1; // L: 4776
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4778
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4779
						var11 = class153.getWorldMap().getMapArea(var3); // L: 4780
						if (var11 == null) { // L: 4781
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4782
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4783
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4786
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4787
						}

						return 1; // L: 4789
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4791
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4792
						var11 = class153.getWorldMap().getMapArea(var3); // L: 4793
						if (var11 == null) { // L: 4794
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4795
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4796
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4797
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4798
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4801
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4802
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4803
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4804
						}

						return 1; // L: 4806
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4808
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4809
						var11 = class153.getWorldMap().getMapArea(var3); // L: 4810
						if (var11 == null) { // L: 4811
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4812
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4815
						}

						return 1; // L: 4817
					} else if (var0 == 6615) { // L: 4819
						var14 = class153.getWorldMap().getDisplayCoord(); // L: 4820
						if (var14 == null) { // L: 4821
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4822
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4823
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4826
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4827
						}

						return 1; // L: 4829
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4831
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().currentMapAreaId(); // L: 4832
						return 1; // L: 4833
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4835
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4836
						var11 = class153.getWorldMap().getCurrentMapArea(); // L: 4837
						if (var11 == null) { // L: 4838
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4839
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4840
							return 1; // L: 4841
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4843
							if (var12 == null) { // L: 4844
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4845
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4846
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4849
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4850
							}

							return 1; // L: 4852
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4854
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4855
							var11 = class153.getWorldMap().getCurrentMapArea(); // L: 4856
							if (var11 == null) { // L: 4857
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4858
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4859
								return 1; // L: 4860
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4862
								if (var5 == null) { // L: 4863
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4864
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4867
								}

								return 1; // L: 4869
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4871
								Interpreter.Interpreter_intStackSize -= 2; // L: 4872
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4873
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4874
								UrlRequest.method2876(var3, var10, false); // L: 4875
								return 1; // L: 4876
							} else if (var0 == 6620) { // L: 4878
								Interpreter.Interpreter_intStackSize -= 2; // L: 4879
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4880
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4881
								UrlRequest.method2876(var3, var10, true); // L: 4882
								return 1; // L: 4883
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4885
								Interpreter.Interpreter_intStackSize -= 2; // L: 4886
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4887
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4888
								var9 = class153.getWorldMap().getMapArea(var3); // L: 4889
								if (var9 == null) { // L: 4890
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4891
									return 1; // L: 4892
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4894
									return 1; // L: 4895
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4897
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getDisplayWith(); // L: 4898
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getDisplayHeight(); // L: 4899
								return 1; // L: 4900
							} else if (var0 == 6623) { // L: 4902
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4903
								var11 = class153.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4904
								if (var11 == null) { // L: 4905
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4906
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4909
								}

								return 1; // L: 4911
							} else if (var0 == 6624) { // L: 4913
								class153.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4914
								return 1; // L: 4915
							} else if (var0 == 6625) { // L: 4917
								class153.getWorldMap().resetMaxFlashCount(); // L: 4918
								return 1; // L: 4919
							} else if (var0 == 6626) { // L: 4921
								class153.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4922
								return 1; // L: 4923
							} else if (var0 == 6627) { // L: 4925
								class153.getWorldMap().resetCyclesPerFlash(); // L: 4926
								return 1; // L: 4927
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4929
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4930
									class153.getWorldMap().setPerpetualFlash(var13); // L: 4931
									return 1; // L: 4932
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4934
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4935
									class153.getWorldMap().flashElement(var3); // L: 4936
									return 1; // L: 4937
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4939
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4940
									class153.getWorldMap().flashCategory(var3); // L: 4941
									return 1; // L: 4942
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4944
									class153.getWorldMap().stopCurrentFlashes(); // L: 4945
									return 1; // L: 4946
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4948
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4949
									class153.getWorldMap().setElementsDisabled(var13); // L: 4950
									return 1; // L: 4951
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4953
										Interpreter.Interpreter_intStackSize -= 2; // L: 4954
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4955
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4956
										class153.getWorldMap().disableElement(var3, var7); // L: 4957
										return 1; // L: 4958
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4960
										Interpreter.Interpreter_intStackSize -= 2; // L: 4961
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4962
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4963
										class153.getWorldMap().setCategoryDisabled(var3, var7); // L: 4964
										return 1; // L: 4965
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4967
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4968
										return 1; // L: 4969
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4971
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4972
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4973
										return 1; // L: 4974
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4976
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4977
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class153.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4978
										return 1; // L: 4979
									} else if (var0 == 6638) { // L: 4981
										Interpreter.Interpreter_intStackSize -= 2; // L: 4982
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4983
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4984
										var5 = class153.getWorldMap().method8708(var3, var10); // L: 4985
										if (var5 == null) { // L: 4986
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4987
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4990
										}

										return 1; // L: 4992
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4994
											var6 = class153.getWorldMap().iconStart(); // L: 4995
											if (var6 == null) { // L: 4996
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4997
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4998
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5001
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5002
											}

											return 1; // L: 5004
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5006
											var6 = class153.getWorldMap().iconNext(); // L: 5007
											if (var6 == null) { // L: 5008
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5009
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5010
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5013
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5014
											}

											return 1; // L: 5016
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5018
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5019
												var4 = class148.WorldMapElement_get(var3); // L: 5020
												if (var4.name == null) { // L: 5021
													Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 5022
												} else {
													Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4.name; // L: 5025
												}

												return 1; // L: 5027
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5029
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5030
												var4 = class148.WorldMapElement_get(var3); // L: 5031
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 5032
												return 1; // L: 5033
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5035
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5036
												var4 = class148.WorldMapElement_get(var3); // L: 5037
												if (var4 == null) { // L: 5038
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5039
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 5042
												}

												return 1; // L: 5044
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5046
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5047
												var4 = class148.WorldMapElement_get(var3); // L: 5048
												if (var4 == null) { // L: 5049
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5050
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5053
												}

												return 1; // L: 5055
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5057
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.worldMapEvent.mapElement; // L: 5058
												return 1; // L: 5059
											} else if (var0 == 6698) { // L: 5061
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.worldMapEvent.coord1.packed(); // L: 5062
												return 1; // L: 5063
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5065
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.worldMapEvent.coord2.packed(); // L: 5066
												return 1; // L: 5067
											} else {
												return 2; // L: 5069
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
