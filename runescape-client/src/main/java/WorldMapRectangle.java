import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kn")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1496946149
	)
	@Export("width")
	int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -172758445
	)
	@Export("height")
	int height;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 268133713
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1946768487
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljf;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1583950964"
	)
	public static boolean method5509(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZS)I",
		garbageValue = "7389"
	)
	static int method5512(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4372
			Interpreter.Interpreter_intStackSize -= 2; // L: 4373
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4374
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4375
			if (!Client.isCameraLocked) { // L: 4376
				Client.camAngleX = var3; // L: 4377
				Client.camAngleY = var4; // L: 4378
			}

			return 1; // L: 4380
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4382
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4383
			return 1; // L: 4384
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4386
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4387
			return 1; // L: 4388
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4390
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4391
			if (var3 < 0) { // L: 4392
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4393
			return 1; // L: 4394
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4396
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4397
			return 1; // L: 4398
		} else {
			return 2; // L: 4400
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "49"
	)
	static int method5511(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4693
			var3 = class36.Client_plane; // L: 4694
			int var15 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7); // L: 4695
			int var8 = class148.baseY * 64 + (class136.localPlayer.y >> 7); // L: 4696
			class102.getWorldMap().method8541(var3, var15, var8, true); // L: 4697
			return 1; // L: 4698
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4700
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4701
				String var16 = ""; // L: 4702
				var9 = class102.getWorldMap().getMapArea(var3); // L: 4703
				if (var9 != null) { // L: 4704
					var16 = var9.getExternalName(); // L: 4705
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 4707
				return 1; // L: 4708
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4710
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4711
				class102.getWorldMap().setCurrentMapAreaId(var3); // L: 4712
				return 1; // L: 4713
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4715
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getZoomLevel(); // L: 4716
				return 1; // L: 4717
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4719
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4720
				class102.getWorldMap().setZoomPercentage(var3); // L: 4721
				return 1; // L: 4722
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4724
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4725
				return 1; // L: 4726
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4728
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4729
					class102.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4730
					return 1; // L: 4731
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4733
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4734
					class102.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4735
					return 1; // L: 4736
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4738
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4739
					class102.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4740
					return 1; // L: 4741
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4743
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4744
					class102.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4745
					return 1; // L: 4746
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4748
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getDisplayX(); // L: 4749
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getDisplayY(); // L: 4750
					return 1; // L: 4751
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4753
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4754
						var11 = class102.getWorldMap().getMapArea(var3); // L: 4755
						if (var11 == null) { // L: 4756
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4757
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4760
						}

						return 1; // L: 4762
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4764
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4765
						var11 = class102.getWorldMap().getMapArea(var3); // L: 4766
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
						var11 = class102.getWorldMap().getMapArea(var3); // L: 4779
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
						var11 = class102.getWorldMap().getMapArea(var3); // L: 4796
						if (var11 == null) { // L: 4797
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4798
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4801
						}

						return 1; // L: 4803
					} else if (var0 == 6615) { // L: 4805
						var14 = class102.getWorldMap().getDisplayCoord(); // L: 4806
						if (var14 == null) { // L: 4807
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4808
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4809
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4812
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4813
						}

						return 1; // L: 4815
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4817
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().currentMapAreaId(); // L: 4818
						return 1; // L: 4819
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4821
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4822
						var11 = class102.getWorldMap().getCurrentMapArea(); // L: 4823
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
							var11 = class102.getWorldMap().getCurrentMapArea(); // L: 4842
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
								GrandExchangeOffer.method6952(var3, var10, false); // L: 4861
								return 1; // L: 4862
							} else if (var0 == 6620) { // L: 4864
								Interpreter.Interpreter_intStackSize -= 2; // L: 4865
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4866
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4867
								GrandExchangeOffer.method6952(var3, var10, true); // L: 4868
								return 1; // L: 4869
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4871
								Interpreter.Interpreter_intStackSize -= 2; // L: 4872
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4873
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4874
								var9 = class102.getWorldMap().getMapArea(var3); // L: 4875
								if (var9 == null) { // L: 4876
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4877
									return 1; // L: 4878
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4880
									return 1; // L: 4881
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4883
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getDisplayWith(); // L: 4884
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getDisplayHeight(); // L: 4885
								return 1; // L: 4886
							} else if (var0 == 6623) { // L: 4888
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4889
								var11 = class102.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4890
								if (var11 == null) { // L: 4891
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4892
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4895
								}

								return 1; // L: 4897
							} else if (var0 == 6624) { // L: 4899
								class102.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4900
								return 1; // L: 4901
							} else if (var0 == 6625) { // L: 4903
								class102.getWorldMap().resetMaxFlashCount(); // L: 4904
								return 1; // L: 4905
							} else if (var0 == 6626) { // L: 4907
								class102.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4908
								return 1; // L: 4909
							} else if (var0 == 6627) { // L: 4911
								class102.getWorldMap().resetCyclesPerFlash(); // L: 4912
								return 1; // L: 4913
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4915
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4916
									class102.getWorldMap().setPerpetualFlash(var13); // L: 4917
									return 1; // L: 4918
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4920
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4921
									class102.getWorldMap().flashElement(var3); // L: 4922
									return 1; // L: 4923
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4925
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4926
									class102.getWorldMap().flashCategory(var3); // L: 4927
									return 1; // L: 4928
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4930
									class102.getWorldMap().stopCurrentFlashes(); // L: 4931
									return 1; // L: 4932
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4934
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4935
									class102.getWorldMap().setElementsDisabled(var13); // L: 4936
									return 1; // L: 4937
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4939
										Interpreter.Interpreter_intStackSize -= 2; // L: 4940
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4941
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4942
										class102.getWorldMap().disableElement(var3, var7); // L: 4943
										return 1; // L: 4944
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4946
										Interpreter.Interpreter_intStackSize -= 2; // L: 4947
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4948
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4949
										class102.getWorldMap().setCategoryDisabled(var3, var7); // L: 4950
										return 1; // L: 4951
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4953
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4954
										return 1; // L: 4955
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4957
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4958
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4959
										return 1; // L: 4960
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4962
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4963
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class102.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4964
										return 1; // L: 4965
									} else if (var0 == 6638) { // L: 4967
										Interpreter.Interpreter_intStackSize -= 2; // L: 4968
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4969
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4970
										var5 = class102.getWorldMap().method8585(var3, var10); // L: 4971
										if (var5 == null) { // L: 4972
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4973
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4976
										}

										return 1; // L: 4978
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4980
											var6 = class102.getWorldMap().iconStart(); // L: 4981
											if (var6 == null) { // L: 4982
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4983
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4984
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4987
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4988
											}

											return 1; // L: 4990
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4992
											var6 = class102.getWorldMap().iconNext(); // L: 4993
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
												var4 = SequenceDefinition.WorldMapElement_get(var3); // L: 5006
												if (var4.name == null) { // L: 5007
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 5008
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 5011
												}

												return 1; // L: 5013
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5015
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5016
												var4 = SequenceDefinition.WorldMapElement_get(var3); // L: 5017
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 5018
												return 1; // L: 5019
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5021
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5022
												var4 = SequenceDefinition.WorldMapElement_get(var3); // L: 5023
												if (var4 == null) { // L: 5024
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5025
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 5028
												}

												return 1; // L: 5030
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5032
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5033
												var4 = SequenceDefinition.WorldMapElement_get(var3); // L: 5034
												if (var4 == null) { // L: 5035
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5036
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5039
												}

												return 1; // L: 5041
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5043
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.worldMapEvent.mapElement; // L: 5044
												return 1; // L: 5045
											} else if (var0 == 6698) { // L: 5047
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.worldMapEvent.coord1.packed(); // L: 5048
												return 1; // L: 5049
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5051
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ScriptFrame.worldMapEvent.coord2.packed(); // L: 5052
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

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmt;I)Ljava/lang/String;",
		garbageValue = "-1061464699"
	)
	static String method5510(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11079
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11080
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11082
					if (var3 == -1) { // L: 11083
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11084
					int var6 = Clock.method3568(var1, var2 - 1); // L: 11086
					String var5;
					if (var6 < 999999999) { // L: 11088
						var5 = Integer.toString(var6); // L: 11089
					} else {
						var5 = "*"; // L: 11092
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11094
				}
			}
		}

		return var0; // L: 11098
	}
}
