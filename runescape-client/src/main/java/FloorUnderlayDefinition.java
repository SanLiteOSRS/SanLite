import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("FloorUnderlayDefinition_archive")
	static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1103380549
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 687488237
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1974159205
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 875466857
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -730639295
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081998157"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 36
	} // L: 37

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "2145025801"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 41
			if (var3 == 0) { // L: 42
				return; // L: 45
			}

			this.decodeNext(var1, var3, var2); // L: 43
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsy;III)V",
		garbageValue = "-1461889902"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 48
			this.rgb = var1.readMedium();
		}

	} // L: 50

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18090"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 53
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 54
		double var6 = (double)(var1 & 255) / 256.0D; // L: 55
		double var8 = var2; // L: 56
		if (var4 < var2) { // L: 57
			var8 = var4;
		}

		if (var6 < var8) { // L: 58
			var8 = var6;
		}

		double var10 = var2; // L: 59
		if (var4 > var2) { // L: 60
			var10 = var4;
		}

		if (var6 > var10) { // L: 61
			var10 = var6;
		}

		double var12 = 0.0D; // L: 62
		double var14 = 0.0D; // L: 63
		double var16 = (var10 + var8) / 2.0D; // L: 64
		if (var10 != var8) { // L: 65
			if (var16 < 0.5D) { // L: 66
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 67
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 68
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 69
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 70
			}
		}

		var12 /= 6.0D; // L: 72
		this.saturation = (int)(256.0D * var14); // L: 73
		this.lightness = (int)(var16 * 256.0D); // L: 74
		if (this.saturation < 0) { // L: 75
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 76
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 77
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 78
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 79
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var16 * var14 * 512.0D); // L: 80
		}

		if (this.hueMultiplier < 1) { // L: 81
			this.hueMultiplier = 1;
		}

		this.hue = (int)((double)this.hueMultiplier * var12); // L: 82
	} // L: 83

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "11"
	)
	static int method3751(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4624
			var3 = TaskHandler.Client_plane; // L: 4625
			int var15 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7); // L: 4626
			int var8 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7); // L: 4627
			class467.getWorldMap().method8078(var3, var15, var8, true); // L: 4628
			return 1; // L: 4629
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4631
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4632
				String var16 = ""; // L: 4633
				var9 = class467.getWorldMap().getMapArea(var3); // L: 4634
				if (var9 != null) { // L: 4635
					var16 = var9.getExternalName(); // L: 4636
				}

				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var16; // L: 4638
				return 1; // L: 4639
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4641
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4642
				class467.getWorldMap().setCurrentMapAreaId(var3); // L: 4643
				return 1; // L: 4644
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4646
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getZoomLevel(); // L: 4647
				return 1; // L: 4648
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4650
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4651
				class467.getWorldMap().setZoomPercentage(var3); // L: 4652
				return 1; // L: 4653
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4655
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4656
				return 1; // L: 4657
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4659
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4660
					class467.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4661
					return 1; // L: 4662
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4664
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4665
					class467.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4666
					return 1; // L: 4667
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4669
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4670
					class467.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4671
					return 1; // L: 4672
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4674
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4675
					class467.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4676
					return 1; // L: 4677
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4679
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getDisplayX(); // L: 4680
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getDisplayY(); // L: 4681
					return 1; // L: 4682
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4684
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4685
						var11 = class467.getWorldMap().getMapArea(var3); // L: 4686
						if (var11 == null) { // L: 4687
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4688
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4691
						}

						return 1; // L: 4693
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4695
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4696
						var11 = class467.getWorldMap().getMapArea(var3); // L: 4697
						if (var11 == null) { // L: 4698
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4699
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4700
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4703
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4704
						}

						return 1; // L: 4706
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4708
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4709
						var11 = class467.getWorldMap().getMapArea(var3); // L: 4710
						if (var11 == null) { // L: 4711
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4712
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4713
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4714
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4715
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4718
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4719
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4720
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4721
						}

						return 1; // L: 4723
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4725
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4726
						var11 = class467.getWorldMap().getMapArea(var3); // L: 4727
						if (var11 == null) { // L: 4728
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4729
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4732
						}

						return 1; // L: 4734
					} else if (var0 == 6615) { // L: 4736
						var14 = class467.getWorldMap().getDisplayCoord(); // L: 4737
						if (var14 == null) { // L: 4738
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4739
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4740
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4743
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4744
						}

						return 1; // L: 4746
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4748
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().currentMapAreaId(); // L: 4749
						return 1; // L: 4750
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4752
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4753
						var11 = class467.getWorldMap().getCurrentMapArea(); // L: 4754
						if (var11 == null) { // L: 4755
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4756
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4757
							return 1; // L: 4758
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4760
							if (var12 == null) { // L: 4761
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4762
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4763
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4766
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4767
							}

							return 1; // L: 4769
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4771
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4772
							var11 = class467.getWorldMap().getCurrentMapArea(); // L: 4773
							if (var11 == null) { // L: 4774
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4775
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4776
								return 1; // L: 4777
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4779
								if (var5 == null) { // L: 4780
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4781
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4784
								}

								return 1; // L: 4786
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4788
								Interpreter.Interpreter_intStackSize -= 2; // L: 4789
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4790
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4791
								class60.method1156(var3, var10, false); // L: 4792
								return 1; // L: 4793
							} else if (var0 == 6620) { // L: 4795
								Interpreter.Interpreter_intStackSize -= 2; // L: 4796
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4797
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4798
								class60.method1156(var3, var10, true); // L: 4799
								return 1; // L: 4800
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4802
								Interpreter.Interpreter_intStackSize -= 2; // L: 4803
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4804
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4805
								var9 = class467.getWorldMap().getMapArea(var3); // L: 4806
								if (var9 == null) { // L: 4807
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4808
									return 1; // L: 4809
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4811
									return 1; // L: 4812
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4814
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getDisplayWith(); // L: 4815
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getDisplayHeight(); // L: 4816
								return 1; // L: 4817
							} else if (var0 == 6623) { // L: 4819
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4820
								var11 = class467.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4821
								if (var11 == null) { // L: 4822
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4823
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4826
								}

								return 1; // L: 4828
							} else if (var0 == 6624) { // L: 4830
								class467.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4831
								return 1; // L: 4832
							} else if (var0 == 6625) { // L: 4834
								class467.getWorldMap().resetMaxFlashCount(); // L: 4835
								return 1; // L: 4836
							} else if (var0 == 6626) { // L: 4838
								class467.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4839
								return 1; // L: 4840
							} else if (var0 == 6627) { // L: 4842
								class467.getWorldMap().resetCyclesPerFlash(); // L: 4843
								return 1; // L: 4844
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4846
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4847
									class467.getWorldMap().setPerpetualFlash(var13); // L: 4848
									return 1; // L: 4849
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4851
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4852
									class467.getWorldMap().flashElement(var3); // L: 4853
									return 1; // L: 4854
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4856
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4857
									class467.getWorldMap().flashCategory(var3); // L: 4858
									return 1; // L: 4859
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4861
									class467.getWorldMap().stopCurrentFlashes(); // L: 4862
									return 1; // L: 4863
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4865
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4866
									class467.getWorldMap().setElementsDisabled(var13); // L: 4867
									return 1; // L: 4868
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4870
										Interpreter.Interpreter_intStackSize -= 2; // L: 4871
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4872
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4873
										class467.getWorldMap().disableElement(var3, var7); // L: 4874
										return 1; // L: 4875
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4877
										Interpreter.Interpreter_intStackSize -= 2; // L: 4878
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4879
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4880
										class467.getWorldMap().setCategoryDisabled(var3, var7); // L: 4881
										return 1; // L: 4882
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4884
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4885
										return 1; // L: 4886
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4888
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4889
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4890
										return 1; // L: 4891
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4893
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4894
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class467.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4895
										return 1; // L: 4896
									} else if (var0 == 6638) { // L: 4898
										Interpreter.Interpreter_intStackSize -= 2; // L: 4899
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4900
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4901
										var5 = class467.getWorldMap().method8121(var3, var10); // L: 4902
										if (var5 == null) { // L: 4903
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4904
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4907
										}

										return 1; // L: 4909
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4911
											var6 = class467.getWorldMap().iconStart(); // L: 4912
											if (var6 == null) { // L: 4913
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4914
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4915
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4918
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4919
											}

											return 1; // L: 4921
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4923
											var6 = class467.getWorldMap().iconNext(); // L: 4924
											if (var6 == null) { // L: 4925
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4926
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4927
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4930
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4931
											}

											return 1; // L: 4933
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4935
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4936
												var4 = class123.WorldMapElement_get(var3); // L: 4937
												if (var4.name == null) { // L: 4938
													Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ""; // L: 4939
												} else {
													Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4.name; // L: 4942
												}

												return 1; // L: 4944
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4946
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4947
												var4 = class123.WorldMapElement_get(var3); // L: 4948
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4949
												return 1; // L: 4950
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4952
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4953
												var4 = class123.WorldMapElement_get(var3); // L: 4954
												if (var4 == null) { // L: 4955
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4956
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4959
												}

												return 1; // L: 4961
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4963
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4964
												var4 = class123.WorldMapElement_get(var3); // L: 4965
												if (var4 == null) { // L: 4966
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4967
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4970
												}

												return 1; // L: 4972
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4974
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.worldMapEvent.mapElement; // L: 4975
												return 1; // L: 4976
											} else if (var0 == 6698) { // L: 4978
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.worldMapEvent.coord1.packed(); // L: 4979
												return 1; // L: 4980
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4982
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InvDefinition.worldMapEvent.coord2.packed(); // L: 4983
												return 1; // L: 4984
											} else {
												return 2; // L: 4986
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
