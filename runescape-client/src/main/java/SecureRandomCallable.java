import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dx")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public static AbstractArchive field1014;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		return HealthBarDefinition.method3639(); // L: 52
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lun;",
		garbageValue = "0"
	)
	static PrivateChatMode[] method2319() {
		return new PrivateChatMode[]{PrivateChatMode.field5277, PrivateChatMode.field5278, PrivateChatMode.field5280}; // L: 11
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131515534"
	)
	static void method2326() {
		Iterator var0 = class316.field3422.iterator(); // L: 226

		while (true) {
			class328 var1;
			do {
				if (!var0.hasNext()) {
					class316.field3422.clear(); // L: 248
					return; // L: 249
				}

				var1 = (class328)var0.next(); // L: 227
			} while(var1 == null); // L: 229

			var1.field3522.clear(); // L: 232
			var1.field3522.method6011(); // L: 233
			var1.field3522.setPcmStreamVolume(0); // L: 234
			var1.field3522.field3455 = 0; // L: 235
			int var2 = var1.field3523; // L: 236
			int var3 = var1.field3531; // L: 237
			Iterator var4 = class316.field3420.iterator(); // L: 239

			while (var4.hasNext()) { // L: 244
				class322 var5 = (class322)var4.next(); // L: 240
				var5.vmethod6202(var2, var3); // L: 242
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-732445486"
	)
	static int method2324(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4711
			var3 = ItemLayer.Client_plane; // L: 4712
			int var15 = class187.baseX * 64 + (class229.localPlayer.x >> 7); // L: 4713
			int var8 = class101.baseY * 64 + (class229.localPlayer.y >> 7); // L: 4714
			WorldMapArchiveLoader.getWorldMap().method8723(var3, var15, var8, true); // L: 4715
			return 1; // L: 4716
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4718
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4719
				String var16 = ""; // L: 4720
				var9 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4721
				if (var9 != null) { // L: 4722
					var16 = var9.getExternalName(); // L: 4723
				}

				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var16; // L: 4725
				return 1; // L: 4726
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4728
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4729
				WorldMapArchiveLoader.getWorldMap().setCurrentMapAreaId(var3); // L: 4730
				return 1; // L: 4731
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4733
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getZoomLevel(); // L: 4734
				return 1; // L: 4735
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4737
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4738
				WorldMapArchiveLoader.getWorldMap().setZoomPercentage(var3); // L: 4739
				return 1; // L: 4740
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4742
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4743
				return 1; // L: 4744
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4746
					var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4747
					WorldMapArchiveLoader.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4748
					return 1; // L: 4749
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4751
					var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4752
					WorldMapArchiveLoader.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4753
					return 1; // L: 4754
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4756
					var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4757
					WorldMapArchiveLoader.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4758
					return 1; // L: 4759
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4761
					var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4762
					WorldMapArchiveLoader.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4763
					return 1; // L: 4764
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4766
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getDisplayX(); // L: 4767
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getDisplayY(); // L: 4768
					return 1; // L: 4769
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4771
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4772
						var11 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4773
						if (var11 == null) { // L: 4774
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4775
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4778
						}

						return 1; // L: 4780
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4782
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4783
						var11 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4784
						if (var11 == null) { // L: 4785
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4786
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4787
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4790
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4791
						}

						return 1; // L: 4793
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4795
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4796
						var11 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4797
						if (var11 == null) { // L: 4798
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4799
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4800
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4801
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4802
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4805
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4806
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4807
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4808
						}

						return 1; // L: 4810
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4812
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4813
						var11 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4814
						if (var11 == null) { // L: 4815
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4816
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4819
						}

						return 1; // L: 4821
					} else if (var0 == 6615) { // L: 4823
						var14 = WorldMapArchiveLoader.getWorldMap().getDisplayCoord(); // L: 4824
						if (var14 == null) { // L: 4825
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4826
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4827
						} else {
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var14.x; // L: 4830
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var14.y; // L: 4831
						}

						return 1; // L: 4833
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4835
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().currentMapAreaId(); // L: 4836
						return 1; // L: 4837
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4839
						var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4840
						var11 = WorldMapArchiveLoader.getWorldMap().getCurrentMapArea(); // L: 4841
						if (var11 == null) { // L: 4842
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4843
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4844
							return 1; // L: 4845
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4847
							if (var12 == null) { // L: 4848
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4849
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4850
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var12[0]; // L: 4853
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var12[1]; // L: 4854
							}

							return 1; // L: 4856
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4858
							var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4859
							var11 = WorldMapArchiveLoader.getWorldMap().getCurrentMapArea(); // L: 4860
							if (var11 == null) { // L: 4861
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4862
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4863
								return 1; // L: 4864
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4866
								if (var5 == null) { // L: 4867
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4868
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.packed(); // L: 4871
								}

								return 1; // L: 4873
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4875
								class517.Interpreter_intStackSize -= 2; // L: 4876
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4877
								var10 = new Coord(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4878
								FriendsChatManager.method8114(var3, var10, false); // L: 4879
								return 1; // L: 4880
							} else if (var0 == 6620) { // L: 4882
								class517.Interpreter_intStackSize -= 2; // L: 4883
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4884
								var10 = new Coord(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4885
								FriendsChatManager.method8114(var3, var10, true); // L: 4886
								return 1; // L: 4887
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4889
								class517.Interpreter_intStackSize -= 2; // L: 4890
								var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4891
								var10 = new Coord(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4892
								var9 = WorldMapArchiveLoader.getWorldMap().getMapArea(var3); // L: 4893
								if (var9 == null) { // L: 4894
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0; // L: 4895
									return 1; // L: 4896
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4898
									return 1; // L: 4899
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4901
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getDisplayWith(); // L: 4902
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getDisplayHeight(); // L: 4903
								return 1; // L: 4904
							} else if (var0 == 6623) { // L: 4906
								var14 = new Coord(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4907
								var11 = WorldMapArchiveLoader.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4908
								if (var11 == null) { // L: 4909
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4910
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var11.getId(); // L: 4913
								}

								return 1; // L: 4915
							} else if (var0 == 6624) { // L: 4917
								WorldMapArchiveLoader.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4918
								return 1; // L: 4919
							} else if (var0 == 6625) { // L: 4921
								WorldMapArchiveLoader.getWorldMap().resetMaxFlashCount(); // L: 4922
								return 1; // L: 4923
							} else if (var0 == 6626) { // L: 4925
								WorldMapArchiveLoader.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]); // L: 4926
								return 1; // L: 4927
							} else if (var0 == 6627) { // L: 4929
								WorldMapArchiveLoader.getWorldMap().resetCyclesPerFlash(); // L: 4930
								return 1; // L: 4931
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4933
									var13 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 4934
									WorldMapArchiveLoader.getWorldMap().setPerpetualFlash(var13); // L: 4935
									return 1; // L: 4936
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4938
									var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4939
									WorldMapArchiveLoader.getWorldMap().flashElement(var3); // L: 4940
									return 1; // L: 4941
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4943
									var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4944
									WorldMapArchiveLoader.getWorldMap().flashCategory(var3); // L: 4945
									return 1; // L: 4946
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4948
									WorldMapArchiveLoader.getWorldMap().stopCurrentFlashes(); // L: 4949
									return 1; // L: 4950
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4952
									var13 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 4953
									WorldMapArchiveLoader.getWorldMap().setElementsDisabled(var13); // L: 4954
									return 1; // L: 4955
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4957
										class517.Interpreter_intStackSize -= 2; // L: 4958
										var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4959
										var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1] == 1; // L: 4960
										WorldMapArchiveLoader.getWorldMap().disableElement(var3, var7); // L: 4961
										return 1; // L: 4962
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4964
										class517.Interpreter_intStackSize -= 2; // L: 4965
										var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4966
										var7 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1] == 1; // L: 4967
										WorldMapArchiveLoader.getWorldMap().setCategoryDisabled(var3, var7); // L: 4968
										return 1; // L: 4969
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4971
										Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4972
										return 1; // L: 4973
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4975
										var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4976
										Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4977
										return 1; // L: 4978
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4980
										var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 4981
										Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4982
										return 1; // L: 4983
									} else if (var0 == 6638) { // L: 4985
										class517.Interpreter_intStackSize -= 2; // L: 4986
										var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 4987
										var10 = new Coord(Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]); // L: 4988
										var5 = WorldMapArchiveLoader.getWorldMap().method8766(var3, var10); // L: 4989
										if (var5 == null) { // L: 4990
											Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 4991
										} else {
											Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5.packed(); // L: 4994
										}

										return 1; // L: 4996
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4998
											var6 = WorldMapArchiveLoader.getWorldMap().iconStart(); // L: 4999
											if (var6 == null) { // L: 5000
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5001
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5002
											} else {
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5005
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5006
											}

											return 1; // L: 5008
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 5010
											var6 = WorldMapArchiveLoader.getWorldMap().iconNext(); // L: 5011
											if (var6 == null) { // L: 5012
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5013
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5014
											} else {
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5017
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5018
											}

											return 1; // L: 5020
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5022
												var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5023
												var4 = class141.WorldMapElement_get(var3); // L: 5024
												if (var4.name == null) { // L: 5025
													Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = ""; // L: 5026
												} else {
													Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.name; // L: 5029
												}

												return 1; // L: 5031
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5033
												var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5034
												var4 = class141.WorldMapElement_get(var3); // L: 5035
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.textSize; // L: 5036
												return 1; // L: 5037
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5039
												var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5040
												var4 = class141.WorldMapElement_get(var3); // L: 5041
												if (var4 == null) { // L: 5042
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5043
												} else {
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.category; // L: 5046
												}

												return 1; // L: 5048
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5050
												var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5051
												var4 = class141.WorldMapElement_get(var3); // L: 5052
												if (var4 == null) { // L: 5053
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5054
												} else {
													Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5057
												}

												return 1; // L: 5059
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5061
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class133.worldMapEvent.mapElement; // L: 5062
												return 1; // L: 5063
											} else if (var0 == 6698) { // L: 5065
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class133.worldMapEvent.coord1.packed(); // L: 5066
												return 1; // L: 5067
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5069
												Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class133.worldMapEvent.coord2.packed(); // L: 5070
												return 1; // L: 5071
											} else {
												return 2; // L: 5073
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
