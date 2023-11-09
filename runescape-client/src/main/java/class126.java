import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
public class class126 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1565;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1563;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1567;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1564;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1566;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	static final class126 field1562;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lep;"
	)
	static ClanSettings field1573;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -835148647
	)
	static int field1569;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1612132921
	)
	final int field1568;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1023455411
	)
	final int field1570;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1522114827
	)
	final int field1571;

	static {
		field1565 = new class126(0, 0, (String)null, 0); // L: 14
		field1563 = new class126(1, 1, (String)null, 9); // L: 15
		field1567 = new class126(2, 2, (String)null, 3); // L: 16
		field1564 = new class126(3, 3, (String)null, 6); // L: 17
		field1566 = new class126(4, 4, (String)null, 1); // L: 18
		field1562 = new class126(5, 5, (String)null, 3); // L: 19
	}

	class126(int var1, int var2, String var3, int var4) {
		this.field1568 = var1; // L: 25
		this.field1570 = var2; // L: 26
		this.field1571 = var4; // L: 27
	} // L: 28

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1570; // L: 46
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1367110649"
	)
	int method2974() {
		return this.field1571; // L: 41
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;I)V",
		garbageValue = "-237323188"
	)
	public static void method2985(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0; // L: 30
		HealthBarDefinition.field1975 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1965818056"
	)
	static int method2986(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4504
			var3 = class383.Client_plane; // L: 4505
			int var15 = class154.baseX * 64 + (class155.localPlayer.x >> 7); // L: 4506
			int var8 = class365.baseY * 64 + (class155.localPlayer.y >> 7); // L: 4507
			Client.getWorldMap().method7999(var3, var15, var8, true); // L: 4508
			return 1; // L: 4509
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4511
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4512
				String var16 = ""; // L: 4513
				var9 = Client.getWorldMap().getMapArea(var3); // L: 4514
				if (var9 != null) { // L: 4515
					var16 = var9.getExternalName(); // L: 4516
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16; // L: 4518
				return 1; // L: 4519
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4521
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4522
				Client.getWorldMap().setCurrentMapAreaId(var3); // L: 4523
				return 1; // L: 4524
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4526
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getZoomLevel(); // L: 4527
				return 1; // L: 4528
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4530
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4531
				Client.getWorldMap().setZoomPercentage(var3); // L: 4532
				return 1; // L: 4533
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4535
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4536
				return 1; // L: 4537
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4539
					var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4540
					Client.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4541
					return 1; // L: 4542
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4544
					var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4545
					Client.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4546
					return 1; // L: 4547
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4549
					var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4550
					Client.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4551
					return 1; // L: 4552
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4554
					var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4555
					Client.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4556
					return 1; // L: 4557
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4559
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayX(); // L: 4560
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayY(); // L: 4561
					return 1; // L: 4562
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4564
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4565
						var11 = Client.getWorldMap().getMapArea(var3); // L: 4566
						if (var11 == null) { // L: 4567
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4568
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4571
						}

						return 1; // L: 4573
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4575
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4576
						var11 = Client.getWorldMap().getMapArea(var3); // L: 4577
						if (var11 == null) { // L: 4578
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4579
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4580
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4583
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4584
						}

						return 1; // L: 4586
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4588
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4589
						var11 = Client.getWorldMap().getMapArea(var3); // L: 4590
						if (var11 == null) { // L: 4591
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4592
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4593
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4594
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4595
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4598
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4599
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4600
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4601
						}

						return 1; // L: 4603
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4605
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4606
						var11 = Client.getWorldMap().getMapArea(var3); // L: 4607
						if (var11 == null) { // L: 4608
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4609
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4612
						}

						return 1; // L: 4614
					} else if (var0 == 6615) { // L: 4616
						var14 = Client.getWorldMap().getDisplayCoord(); // L: 4617
						if (var14 == null) { // L: 4618
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4619
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4620
						} else {
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var14.x; // L: 4623
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var14.y; // L: 4624
						}

						return 1; // L: 4626
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4628
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().currentMapAreaId(); // L: 4629
						return 1; // L: 4630
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4632
						var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4633
						var11 = Client.getWorldMap().getCurrentMapArea(); // L: 4634
						if (var11 == null) { // L: 4635
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4636
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4637
							return 1; // L: 4638
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4640
							if (var12 == null) { // L: 4641
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4642
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4643
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var12[0]; // L: 4646
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var12[1]; // L: 4647
							}

							return 1; // L: 4649
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4651
							var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4652
							var11 = Client.getWorldMap().getCurrentMapArea(); // L: 4653
							if (var11 == null) { // L: 4654
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4655
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4656
								return 1; // L: 4657
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4659
								if (var5 == null) { // L: 4660
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4661
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.packed(); // L: 4664
								}

								return 1; // L: 4666
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4668
								class87.Interpreter_intStackSize -= 2; // L: 4669
								var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4670
								var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 4671
								AttackOption.method2608(var3, var10, false); // L: 4672
								return 1; // L: 4673
							} else if (var0 == 6620) { // L: 4675
								class87.Interpreter_intStackSize -= 2; // L: 4676
								var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4677
								var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 4678
								AttackOption.method2608(var3, var10, true); // L: 4679
								return 1; // L: 4680
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4682
								class87.Interpreter_intStackSize -= 2; // L: 4683
								var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4684
								var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 4685
								var9 = Client.getWorldMap().getMapArea(var3); // L: 4686
								if (var9 == null) { // L: 4687
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 4688
									return 1; // L: 4689
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4691
									return 1; // L: 4692
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4694
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayWith(); // L: 4695
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getDisplayHeight(); // L: 4696
								return 1; // L: 4697
							} else if (var0 == 6623) { // L: 4699
								var14 = new Coord(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4700
								var11 = Client.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4701
								if (var11 == null) { // L: 4702
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4703
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var11.getId(); // L: 4706
								}

								return 1; // L: 4708
							} else if (var0 == 6624) { // L: 4710
								Client.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4711
								return 1; // L: 4712
							} else if (var0 == 6625) { // L: 4714
								Client.getWorldMap().resetMaxFlashCount(); // L: 4715
								return 1; // L: 4716
							} else if (var0 == 6626) { // L: 4718
								Client.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 4719
								return 1; // L: 4720
							} else if (var0 == 6627) { // L: 4722
								Client.getWorldMap().resetCyclesPerFlash(); // L: 4723
								return 1; // L: 4724
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4726
									var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 4727
									Client.getWorldMap().setPerpetualFlash(var13); // L: 4728
									return 1; // L: 4729
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4731
									var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4732
									Client.getWorldMap().flashElement(var3); // L: 4733
									return 1; // L: 4734
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4736
									var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4737
									Client.getWorldMap().flashCategory(var3); // L: 4738
									return 1; // L: 4739
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4741
									Client.getWorldMap().stopCurrentFlashes(); // L: 4742
									return 1; // L: 4743
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4745
									var13 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 4746
									Client.getWorldMap().setElementsDisabled(var13); // L: 4747
									return 1; // L: 4748
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4750
										class87.Interpreter_intStackSize -= 2; // L: 4751
										var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4752
										var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1; // L: 4753
										Client.getWorldMap().disableElement(var3, var7); // L: 4754
										return 1; // L: 4755
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4757
										class87.Interpreter_intStackSize -= 2; // L: 4758
										var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4759
										var7 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1] == 1; // L: 4760
										Client.getWorldMap().setCategoryDisabled(var3, var7); // L: 4761
										return 1; // L: 4762
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4764
										Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4765
										return 1; // L: 4766
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4768
										var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4769
										Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4770
										return 1; // L: 4771
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4773
										var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4774
										Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4775
										return 1; // L: 4776
									} else if (var0 == 6638) { // L: 4778
										class87.Interpreter_intStackSize -= 2; // L: 4779
										var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4780
										var10 = new Coord(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]); // L: 4781
										var5 = Client.getWorldMap().method8041(var3, var10); // L: 4782
										if (var5 == null) { // L: 4783
											Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4784
										} else {
											Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5.packed(); // L: 4787
										}

										return 1; // L: 4789
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4791
											var6 = Client.getWorldMap().iconStart(); // L: 4792
											if (var6 == null) { // L: 4793
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4794
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4795
											} else {
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4798
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4799
											}

											return 1; // L: 4801
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4803
											var6 = Client.getWorldMap().iconNext(); // L: 4804
											if (var6 == null) { // L: 4805
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4806
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4807
											} else {
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4810
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4811
											}

											return 1; // L: 4813
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4815
												var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4816
												var4 = JagexCache.WorldMapElement_get(var3); // L: 4817
												if (var4.name == null) { // L: 4818
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 4819
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name; // L: 4822
												}

												return 1; // L: 4824
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4826
												var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4827
												var4 = JagexCache.WorldMapElement_get(var3); // L: 4828
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.textSize; // L: 4829
												return 1; // L: 4830
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4832
												var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4833
												var4 = JagexCache.WorldMapElement_get(var3); // L: 4834
												if (var4 == null) { // L: 4835
													Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4836
												} else {
													Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.category; // L: 4839
												}

												return 1; // L: 4841
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4843
												var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4844
												var4 = JagexCache.WorldMapElement_get(var3); // L: 4845
												if (var4 == null) { // L: 4846
													Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4847
												} else {
													Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4850
												}

												return 1; // L: 4852
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4854
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.mapElement; // L: 4855
												return 1; // L: 4856
											} else if (var0 == 6698) { // L: 4858
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.coord1.packed(); // L: 4859
												return 1; // L: 4860
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4862
												Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.worldMapEvent.coord2.packed(); // L: 4863
												return 1; // L: 4864
											} else {
												return 2; // L: 4866
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
