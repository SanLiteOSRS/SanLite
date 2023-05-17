import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dl")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1485716275
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("af")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("an")
	@Export("lock")
	Object lock;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 535437747
	)
	@Export("index")
	int index;
	@ObfuscatedName("ac")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("au")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ab")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; PlayerComposition.method6084(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1929251930"
	)
	static final boolean method2266(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 28
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcq;",
		garbageValue = "32"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-471758785"
	)
	static int method2268(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4645
			var3 = GameEngine.Client_plane; // L: 4646
			int var15 = WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7); // L: 4647
			int var8 = GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7); // L: 4648
			class88.getWorldMap().method8628(var3, var15, var8, true); // L: 4649
			return 1; // L: 4650
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4652
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4653
				String var16 = ""; // L: 4654
				var9 = class88.getWorldMap().getMapArea(var3); // L: 4655
				if (var9 != null) { // L: 4656
					var16 = var9.getExternalName(); // L: 4657
				}

				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var16; // L: 4659
				return 1; // L: 4660
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4662
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4663
				class88.getWorldMap().setCurrentMapAreaId(var3); // L: 4664
				return 1; // L: 4665
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4667
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getZoomLevel(); // L: 4668
				return 1; // L: 4669
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4671
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4672
				class88.getWorldMap().setZoomPercentage(var3); // L: 4673
				return 1; // L: 4674
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4676
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4677
				return 1; // L: 4678
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4680
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4681
					class88.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4682
					return 1; // L: 4683
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4685
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4686
					class88.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4687
					return 1; // L: 4688
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4690
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4691
					class88.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4692
					return 1; // L: 4693
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4695
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4696
					class88.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4697
					return 1; // L: 4698
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4700
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getDisplayX(); // L: 4701
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getDisplayY(); // L: 4702
					return 1; // L: 4703
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4705
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4706
						var11 = class88.getWorldMap().getMapArea(var3); // L: 4707
						if (var11 == null) { // L: 4708
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4709
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4712
						}

						return 1; // L: 4714
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4716
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4717
						var11 = class88.getWorldMap().getMapArea(var3); // L: 4718
						if (var11 == null) { // L: 4719
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4720
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4721
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4724
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4725
						}

						return 1; // L: 4727
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4729
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4730
						var11 = class88.getWorldMap().getMapArea(var3); // L: 4731
						if (var11 == null) { // L: 4732
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4733
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4734
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4735
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4736
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4739
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4740
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4741
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4742
						}

						return 1; // L: 4744
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4746
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4747
						var11 = class88.getWorldMap().getMapArea(var3); // L: 4748
						if (var11 == null) { // L: 4749
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4750
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4753
						}

						return 1; // L: 4755
					} else if (var0 == 6615) { // L: 4757
						var14 = class88.getWorldMap().getDisplayCoord(); // L: 4758
						if (var14 == null) { // L: 4759
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4760
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4761
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4764
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4765
						}

						return 1; // L: 4767
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4769
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().currentMapAreaId(); // L: 4770
						return 1; // L: 4771
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4773
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4774
						var11 = class88.getWorldMap().getCurrentMapArea(); // L: 4775
						if (var11 == null) { // L: 4776
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4777
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4778
							return 1; // L: 4779
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4781
							if (var12 == null) { // L: 4782
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4783
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4784
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4787
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4788
							}

							return 1; // L: 4790
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4792
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4793
							var11 = class88.getWorldMap().getCurrentMapArea(); // L: 4794
							if (var11 == null) { // L: 4795
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4796
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4797
								return 1; // L: 4798
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4800
								if (var5 == null) { // L: 4801
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4802
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4805
								}

								return 1; // L: 4807
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4809
								Interpreter.Interpreter_intStackSize -= 2; // L: 4810
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4811
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4812
								class220.method4493(var3, var10, false); // L: 4813
								return 1; // L: 4814
							} else if (var0 == 6620) { // L: 4816
								Interpreter.Interpreter_intStackSize -= 2; // L: 4817
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4818
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4819
								class220.method4493(var3, var10, true); // L: 4820
								return 1; // L: 4821
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4823
								Interpreter.Interpreter_intStackSize -= 2; // L: 4824
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4825
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4826
								var9 = class88.getWorldMap().getMapArea(var3); // L: 4827
								if (var9 == null) { // L: 4828
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4829
									return 1; // L: 4830
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4832
									return 1; // L: 4833
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4835
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getDisplayWith(); // L: 4836
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getDisplayHeight(); // L: 4837
								return 1; // L: 4838
							} else if (var0 == 6623) { // L: 4840
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4841
								var11 = class88.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4842
								if (var11 == null) { // L: 4843
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4844
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4847
								}

								return 1; // L: 4849
							} else if (var0 == 6624) { // L: 4851
								class88.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4852
								return 1; // L: 4853
							} else if (var0 == 6625) { // L: 4855
								class88.getWorldMap().resetMaxFlashCount(); // L: 4856
								return 1; // L: 4857
							} else if (var0 == 6626) { // L: 4859
								class88.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4860
								return 1; // L: 4861
							} else if (var0 == 6627) { // L: 4863
								class88.getWorldMap().resetCyclesPerFlash(); // L: 4864
								return 1; // L: 4865
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4867
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4868
									class88.getWorldMap().setPerpetualFlash(var13); // L: 4869
									return 1; // L: 4870
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4872
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4873
									class88.getWorldMap().flashElement(var3); // L: 4874
									return 1; // L: 4875
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4877
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4878
									class88.getWorldMap().flashCategory(var3); // L: 4879
									return 1; // L: 4880
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4882
									class88.getWorldMap().stopCurrentFlashes(); // L: 4883
									return 1; // L: 4884
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4886
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4887
									class88.getWorldMap().setElementsDisabled(var13); // L: 4888
									return 1; // L: 4889
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4891
										Interpreter.Interpreter_intStackSize -= 2; // L: 4892
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4893
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4894
										class88.getWorldMap().disableElement(var3, var7); // L: 4895
										return 1; // L: 4896
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4898
										Interpreter.Interpreter_intStackSize -= 2; // L: 4899
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4900
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4901
										class88.getWorldMap().setCategoryDisabled(var3, var7); // L: 4902
										return 1; // L: 4903
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4905
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4906
										return 1; // L: 4907
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4909
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4910
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4911
										return 1; // L: 4912
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4914
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4915
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class88.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4916
										return 1; // L: 4917
									} else if (var0 == 6638) { // L: 4919
										Interpreter.Interpreter_intStackSize -= 2; // L: 4920
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4921
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4922
										var5 = class88.getWorldMap().method8660(var3, var10); // L: 4923
										if (var5 == null) { // L: 4924
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4925
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4928
										}

										return 1; // L: 4930
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4932
											var6 = class88.getWorldMap().iconStart(); // L: 4933
											if (var6 == null) { // L: 4934
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4935
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4936
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4939
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4940
											}

											return 1; // L: 4942
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4944
											var6 = class88.getWorldMap().iconNext(); // L: 4945
											if (var6 == null) { // L: 4946
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4947
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4948
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4951
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4952
											}

											return 1; // L: 4954
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4956
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4957
												var4 = class354.WorldMapElement_get(var3); // L: 4958
												if (var4.name == null) { // L: 4959
													Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 4960
												} else {
													Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4.name; // L: 4963
												}

												return 1; // L: 4965
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4967
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4968
												var4 = class354.WorldMapElement_get(var3); // L: 4969
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4970
												return 1; // L: 4971
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4973
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4974
												var4 = class354.WorldMapElement_get(var3); // L: 4975
												if (var4 == null) { // L: 4976
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4977
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4980
												}

												return 1; // L: 4982
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4984
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4985
												var4 = class354.WorldMapElement_get(var3); // L: 4986
												if (var4 == null) { // L: 4987
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4988
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4991
												}

												return 1; // L: 4993
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4995
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ByteArrayPool.worldMapEvent.mapElement; // L: 4996
												return 1; // L: 4997
											} else if (var0 == 6698) { // L: 4999
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ByteArrayPool.worldMapEvent.coord1.packed(); // L: 5000
												return 1; // L: 5001
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5003
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ByteArrayPool.worldMapEvent.coord2.packed(); // L: 5004
												return 1; // L: 5005
											} else {
												return 2; // L: 5007
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
