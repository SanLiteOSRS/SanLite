import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("cb")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ac")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ai")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("az")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ap")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("af")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -808541663
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("an")
	static int[] field888;
	@ObfuscatedName("ax")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ah")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ay")
	static boolean field893;
	@ObfuscatedName("aj")
	static boolean field887;
	@ObfuscatedName("av")
	static ArrayList field889;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -567436227
	)
	static int field890;
	@ObfuscatedName("bk")
	static final double field891;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 73
		Interpreter_arrays = new int[5][5000]; // L: 74
		Interpreter_intStack = new int[1000]; // L: 75
		Interpreter_stringStack = new String[1000]; // L: 77
		Interpreter_frameDepth = 0; // L: 79
		Interpreter_frames = new ScriptFrame[50]; // L: 80
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 86
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 89
		field893 = false; // L: 92
		field887 = false; // L: 93
		field889 = new ArrayList(); // L: 94
		field890 = 0; // L: 95
		field891 = Math.log(2.0D); // L: 99
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-4"
	)
	public static int method2069(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 49
		int var1 = (int)(var2 >>> 0 & 127L); // L: 51
		return var1; // L: 53
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "-1581379999"
	)
	static byte[] method2049(String var0) {
		boolean var1 = true; // L: 127
		boolean var2 = true; // L: 128
		int var3 = "pattern".length(); // L: 129
		int var4 = 0; // L: 130
		byte[] var5 = new byte[8]; // L: 131

		while (true) {
			int var6 = var4 + var3; // L: 133
			if (var6 >= var0.length()) { // L: 134
				return null; // L: 135
			}

			char var7 = var0.charAt(var6); // L: 137
			if (var7 == ':') { // L: 138
				if (var4 == 0) { // L: 155
					return null; // L: 156
				}

				byte[] var8 = new byte[var4]; // L: 158
				System.arraycopy(var5, 0, var8, 0, var4); // L: 159
				return var8; // L: 160
			}

			if (var5.length == var4) { // L: 141
				return null; // L: 142
			}

			if (var7 >= '0' && var7 <= '9') { // L: 144
				var7 = (char)(var7 - '0'); // L: 145
			} else {
				if (var7 < 'a' || var7 > 'z') { // L: 147
					return null; // L: 151
				}

				var7 = (char)(var7 - 'W'); // L: 148
			}

			var5[var4++] = (byte)var7; // L: 153
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-86107696"
	)
	static int method2067(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4407
			Client.logoutTimer = 250; // L: 4408
			return 1; // L: 4409
		} else {
			return 2; // L: 4411
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-752327040"
	)
	static int method2068(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4696
			var3 = HealthBar.Client_plane; // L: 4697
			int var15 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7); // L: 4698
			int var8 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7); // L: 4699
			class227.getWorldMap().method8505(var3, var15, var8, true); // L: 4700
			return 1; // L: 4701
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4703
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4704
				String var16 = ""; // L: 4705
				var9 = class227.getWorldMap().getMapArea(var3); // L: 4706
				if (var9 != null) { // L: 4707
					var16 = var9.getExternalName(); // L: 4708
				}

				Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var16; // L: 4710
				return 1; // L: 4711
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4713
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4714
				class227.getWorldMap().setCurrentMapAreaId(var3); // L: 4715
				return 1; // L: 4716
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4718
				Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getZoomLevel(); // L: 4719
				return 1; // L: 4720
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4722
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4723
				class227.getWorldMap().setZoomPercentage(var3); // L: 4724
				return 1; // L: 4725
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4727
				Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4728
				return 1; // L: 4729
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4731
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4732
					class227.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4733
					return 1; // L: 4734
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4736
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4737
					class227.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4738
					return 1; // L: 4739
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4741
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4742
					class227.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4743
					return 1; // L: 4744
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4746
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4747
					class227.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4748
					return 1; // L: 4749
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4751
					Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayX(); // L: 4752
					Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayY(); // L: 4753
					return 1; // L: 4754
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4756
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4757
						var11 = class227.getWorldMap().getMapArea(var3); // L: 4758
						if (var11 == null) { // L: 4759
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4760
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4763
						}

						return 1; // L: 4765
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4767
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4768
						var11 = class227.getWorldMap().getMapArea(var3); // L: 4769
						if (var11 == null) { // L: 4770
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4771
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4772
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4775
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4776
						}

						return 1; // L: 4778
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4780
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4781
						var11 = class227.getWorldMap().getMapArea(var3); // L: 4782
						if (var11 == null) { // L: 4783
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4784
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4785
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4786
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4787
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4790
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4791
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4792
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4793
						}

						return 1; // L: 4795
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4797
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4798
						var11 = class227.getWorldMap().getMapArea(var3); // L: 4799
						if (var11 == null) { // L: 4800
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4801
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4804
						}

						return 1; // L: 4806
					} else if (var0 == 6615) { // L: 4808
						var14 = class227.getWorldMap().getDisplayCoord(); // L: 4809
						if (var14 == null) { // L: 4810
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4811
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4812
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var14.x; // L: 4815
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var14.y; // L: 4816
						}

						return 1; // L: 4818
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4820
						Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().currentMapAreaId(); // L: 4821
						return 1; // L: 4822
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4824
						var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4825
						var11 = class227.getWorldMap().getCurrentMapArea(); // L: 4826
						if (var11 == null) { // L: 4827
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4828
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4829
							return 1; // L: 4830
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4832
							if (var12 == null) { // L: 4833
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4834
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4835
							} else {
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var12[0]; // L: 4838
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var12[1]; // L: 4839
							}

							return 1; // L: 4841
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4843
							var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4844
							var11 = class227.getWorldMap().getCurrentMapArea(); // L: 4845
							if (var11 == null) { // L: 4846
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4847
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4848
								return 1; // L: 4849
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4851
								if (var5 == null) { // L: 4852
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4853
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.packed(); // L: 4856
								}

								return 1; // L: 4858
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4860
								SoundCache.Interpreter_intStackSize -= 2; // L: 4861
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4862
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4863
								class162.method3296(var3, var10, false); // L: 4864
								return 1; // L: 4865
							} else if (var0 == 6620) { // L: 4867
								SoundCache.Interpreter_intStackSize -= 2; // L: 4868
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4869
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4870
								class162.method3296(var3, var10, true); // L: 4871
								return 1; // L: 4872
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4874
								SoundCache.Interpreter_intStackSize -= 2; // L: 4875
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4876
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4877
								var9 = class227.getWorldMap().getMapArea(var3); // L: 4878
								if (var9 == null) { // L: 4879
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4880
									return 1; // L: 4881
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4883
									return 1; // L: 4884
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4886
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayWith(); // L: 4887
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayHeight(); // L: 4888
								return 1; // L: 4889
							} else if (var0 == 6623) { // L: 4891
								var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4892
								var11 = class227.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4893
								if (var11 == null) { // L: 4894
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4895
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getId(); // L: 4898
								}

								return 1; // L: 4900
							} else if (var0 == 6624) { // L: 4902
								class227.getWorldMap().setMaxFlashCount(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4903
								return 1; // L: 4904
							} else if (var0 == 6625) { // L: 4906
								class227.getWorldMap().resetMaxFlashCount(); // L: 4907
								return 1; // L: 4908
							} else if (var0 == 6626) { // L: 4910
								class227.getWorldMap().setCyclesPerFlash(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]); // L: 4911
								return 1; // L: 4912
							} else if (var0 == 6627) { // L: 4914
								class227.getWorldMap().resetCyclesPerFlash(); // L: 4915
								return 1; // L: 4916
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4918
									var13 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 4919
									class227.getWorldMap().setPerpetualFlash(var13); // L: 4920
									return 1; // L: 4921
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4923
									var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4924
									class227.getWorldMap().flashElement(var3); // L: 4925
									return 1; // L: 4926
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4928
									var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4929
									class227.getWorldMap().flashCategory(var3); // L: 4930
									return 1; // L: 4931
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4933
									class227.getWorldMap().stopCurrentFlashes(); // L: 4934
									return 1; // L: 4935
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4937
									var13 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 4938
									class227.getWorldMap().setElementsDisabled(var13); // L: 4939
									return 1; // L: 4940
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4942
										SoundCache.Interpreter_intStackSize -= 2; // L: 4943
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4944
										var7 = Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1; // L: 4945
										class227.getWorldMap().disableElement(var3, var7); // L: 4946
										return 1; // L: 4947
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4949
										SoundCache.Interpreter_intStackSize -= 2; // L: 4950
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4951
										var7 = Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1; // L: 4952
										class227.getWorldMap().setCategoryDisabled(var3, var7); // L: 4953
										return 1; // L: 4954
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4956
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4957
										return 1; // L: 4958
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4960
										var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4961
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4962
										return 1; // L: 4963
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4965
										var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4966
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4967
										return 1; // L: 4968
									} else if (var0 == 6638) { // L: 4970
										SoundCache.Interpreter_intStackSize -= 2; // L: 4971
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4972
										var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]); // L: 4973
										var5 = class227.getWorldMap().method8552(var3, var10); // L: 4974
										if (var5 == null) { // L: 4975
											Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4976
										} else {
											Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.packed(); // L: 4979
										}

										return 1; // L: 4981
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4983
											var6 = class227.getWorldMap().iconStart(); // L: 4984
											if (var6 == null) { // L: 4985
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4986
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4987
											} else {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4990
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4991
											}

											return 1; // L: 4993
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4995
											var6 = class227.getWorldMap().iconNext(); // L: 4996
											if (var6 == null) { // L: 4997
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4998
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4999
											} else {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.getElement(); // L: 5002
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 5003
											}

											return 1; // L: 5005
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 5007
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5008
												var4 = class138.WorldMapElement_get(var3); // L: 5009
												if (var4.name == null) { // L: 5010
													Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 5011
												} else {
													Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.name; // L: 5014
												}

												return 1; // L: 5016
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 5018
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5019
												var4 = class138.WorldMapElement_get(var3); // L: 5020
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.textSize; // L: 5021
												return 1; // L: 5022
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 5024
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5025
												var4 = class138.WorldMapElement_get(var3); // L: 5026
												if (var4 == null) { // L: 5027
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 5028
												} else {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.category; // L: 5031
												}

												return 1; // L: 5033
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 5035
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 5036
												var4 = class138.WorldMapElement_get(var3); // L: 5037
												if (var4 == null) { // L: 5038
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 5039
												} else {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.sprite1; // L: 5042
												}

												return 1; // L: 5044
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 5046
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.mapElement; // L: 5047
												return 1; // L: 5048
											} else if (var0 == 6698) { // L: 5050
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.coord1.packed(); // L: 5051
												return 1; // L: 5052
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 5054
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.coord2.packed(); // L: 5055
												return 1; // L: 5056
											} else {
												return 2; // L: 5058
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

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1076140788"
	)
	static void method2070(String var0) {
		MusicPatchPcmStream.field3478 = var0; // L: 12719

		try {
			String var1 = class219.client.getParameter(Integer.toString(18)); // L: 12721
			String var2 = class219.client.getParameter(Integer.toString(13)); // L: 12722
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12723
			String var5;
			if (var0.length() == 0) { // L: 12724
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires="; // L: 12726
				long var6 = GameEngine.method661() + 94608000000L; // L: 12728
				Calendar.Calendar_calendar.setTime(new Date(var6)); // L: 12730
				int var8 = Calendar.Calendar_calendar.get(7); // L: 12731
				int var9 = Calendar.Calendar_calendar.get(5); // L: 12732
				int var10 = Calendar.Calendar_calendar.get(2); // L: 12733
				int var11 = Calendar.Calendar_calendar.get(1); // L: 12734
				int var12 = Calendar.Calendar_calendar.get(11); // L: 12735
				int var13 = Calendar.Calendar_calendar.get(12); // L: 12736
				int var14 = Calendar.Calendar_calendar.get(13); // L: 12737
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT"; // L: 12738
				var3 = var4 + var5 + "; Max-Age=" + 94608000L; // L: 12740
			}

			Client var16 = class219.client; // L: 12742
			var5 = "document.cookie=\"" + var3 + "\""; // L: 12743
			JSObject.getWindow(var16).eval(var5); // L: 12746
		} catch (Throwable var15) { // L: 12749
		}

	} // L: 12750
}
