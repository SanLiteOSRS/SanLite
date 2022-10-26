import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mh")
@Implements("ModeWhere")
public enum ModeWhere implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4262("", 0, new class341[]{class341.field4232}),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4254("", 1, new class341[]{class341.field4229, class341.field4232}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4255("", 2, new class341[]{class341.field4229, class341.field4231, class341.field4232}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4256("", 3, new class341[]{class341.field4229}),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4253("", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4258("", 5, new class341[]{class341.field4229, class341.field4232}),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4259("", 6, new class341[]{class341.field4232}),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4260("", 8, new class341[]{class341.field4229, class341.field4232}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4267("", 9, new class341[]{class341.field4229, class341.field4231}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4269("", 10, new class341[]{class341.field4229}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4264("", 11, new class341[]{class341.field4229}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4261("", 12, new class341[]{class341.field4229, class341.field4232}),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	field4265("", 13, new class341[]{class341.field4229});

	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 955062507
	)
	static int field4271;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1623689719
	)
	@Export("id")
	final int id;
	@ObfuscatedName("o")
	final Set field4257;

	static {
		method6593(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lmx;)V"
	)
	ModeWhere(String var3, int var4, class341[] var5) {
		this.field4257 = new HashSet();
		this.id = var4;
		class341[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class341 var8 = var6[var7]; // L: 47
			this.field4257.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field4257 = new HashSet(); // L: 32
		this.id = var4;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 55
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-1880541005"
	)
	public static HealthBarDefinition method6594(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 37
		if (var1 != null) { // L: 38
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 39
			var1 = new HealthBarDefinition(); // L: 40
			if (var2 != null) { // L: 41
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 42
			return var1; // L: 43
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmh;",
		garbageValue = "1602959533"
	)
	static ModeWhere[] method6593() {
		return new ModeWhere[]{field4256, field4258, field4261, field4267, field4262, field4269, field4253, field4264, field4254, field4255, field4260, field4259, field4265}; // L: 35
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "2113556951"
	)
	static int method6595(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4508
			var3 = ApproximateRouteStrategy.Client_plane; // L: 4509
			int var15 = class26.baseX * 64 + (class296.localPlayer.x >> 7); // L: 4510
			int var8 = class158.baseY * 64 + (class296.localPlayer.y >> 7); // L: 4511
			GrandExchangeOfferUnitPriceComparator.getWorldMap().method7888(var3, var15, var8, true); // L: 4512
			return 1; // L: 4513
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4515
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4516
				String var16 = ""; // L: 4517
				var9 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4518
				if (var9 != null) { // L: 4519
					var16 = var9.getExternalName(); // L: 4520
				}

				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var16; // L: 4522
				return 1; // L: 4523
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4525
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4526
				GrandExchangeOfferUnitPriceComparator.getWorldMap().setCurrentMapAreaId(var3); // L: 4527
				return 1; // L: 4528
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4530
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getZoomLevel(); // L: 4531
				return 1; // L: 4532
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4534
				var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4535
				GrandExchangeOfferUnitPriceComparator.getWorldMap().setZoomPercentage(var3); // L: 4536
				return 1; // L: 4537
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4539
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4540
				return 1; // L: 4541
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4543
					var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4544
					GrandExchangeOfferUnitPriceComparator.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4545
					return 1; // L: 4546
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4548
					var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4549
					GrandExchangeOfferUnitPriceComparator.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4550
					return 1; // L: 4551
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4553
					var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4554
					GrandExchangeOfferUnitPriceComparator.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4555
					return 1; // L: 4556
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4558
					var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4559
					GrandExchangeOfferUnitPriceComparator.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4560
					return 1; // L: 4561
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4563
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayX(); // L: 4564
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayY(); // L: 4565
					return 1; // L: 4566
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4568
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4569
						var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4570
						if (var11 == null) { // L: 4571
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4572
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4575
						}

						return 1; // L: 4577
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4579
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4580
						var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4581
						if (var11 == null) { // L: 4582
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4583
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4584
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4587
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4588
						}

						return 1; // L: 4590
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4592
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4593
						var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4594
						if (var11 == null) { // L: 4595
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4596
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4597
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4598
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4599
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4602
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4603
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4604
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4605
						}

						return 1; // L: 4607
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4609
						var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4610
						var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4611
						if (var11 == null) { // L: 4612
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4613
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4616
						}

						return 1; // L: 4618
					} else if (var0 == 6615) { // L: 4620
						var14 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayCoord(); // L: 4621
						if (var14 == null) { // L: 4622
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4623
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4624
						} else {
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var14.x; // L: 4627
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var14.y; // L: 4628
						}

						return 1; // L: 4630
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4632
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().currentMapAreaId(); // L: 4633
						return 1; // L: 4634
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4636
						var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4637
						var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getCurrentMapArea(); // L: 4638
						if (var11 == null) { // L: 4639
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4640
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4641
							return 1; // L: 4642
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4644
							if (var12 == null) { // L: 4645
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4646
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4647
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var12[0]; // L: 4650
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var12[1]; // L: 4651
							}

							return 1; // L: 4653
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4655
							var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4656
							var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getCurrentMapArea(); // L: 4657
							if (var11 == null) { // L: 4658
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4659
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4660
								return 1; // L: 4661
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4663
								if (var5 == null) { // L: 4664
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4665
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.packed(); // L: 4668
								}

								return 1; // L: 4670
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4672
								class379.Interpreter_intStackSize -= 2; // L: 4673
								var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4674
								var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 4675
								GrandExchangeOfferUnitPriceComparator.method6533(var3, var10, false); // L: 4676
								return 1; // L: 4677
							} else if (var0 == 6620) { // L: 4679
								class379.Interpreter_intStackSize -= 2; // L: 4680
								var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4681
								var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 4682
								GrandExchangeOfferUnitPriceComparator.method6533(var3, var10, true); // L: 4683
								return 1; // L: 4684
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4686
								class379.Interpreter_intStackSize -= 2; // L: 4687
								var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4688
								var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 4689
								var9 = GrandExchangeOfferUnitPriceComparator.getWorldMap().getMapArea(var3); // L: 4690
								if (var9 == null) { // L: 4691
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 4692
									return 1; // L: 4693
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4695
									return 1; // L: 4696
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4698
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayWith(); // L: 4699
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getDisplayHeight(); // L: 4700
								return 1; // L: 4701
							} else if (var0 == 6623) { // L: 4703
								var14 = new Coord(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4704
								var11 = GrandExchangeOfferUnitPriceComparator.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4705
								if (var11 == null) { // L: 4706
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4707
								} else {
									Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var11.getId(); // L: 4710
								}

								return 1; // L: 4712
							} else if (var0 == 6624) { // L: 4714
								GrandExchangeOfferUnitPriceComparator.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4715
								return 1; // L: 4716
							} else if (var0 == 6625) { // L: 4718
								GrandExchangeOfferUnitPriceComparator.getWorldMap().resetMaxFlashCount(); // L: 4719
								return 1; // L: 4720
							} else if (var0 == 6626) { // L: 4722
								GrandExchangeOfferUnitPriceComparator.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 4723
								return 1; // L: 4724
							} else if (var0 == 6627) { // L: 4726
								GrandExchangeOfferUnitPriceComparator.getWorldMap().resetCyclesPerFlash(); // L: 4727
								return 1; // L: 4728
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4730
									var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 4731
									GrandExchangeOfferUnitPriceComparator.getWorldMap().setPerpetualFlash(var13); // L: 4732
									return 1; // L: 4733
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4735
									var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4736
									GrandExchangeOfferUnitPriceComparator.getWorldMap().flashElement(var3); // L: 4737
									return 1; // L: 4738
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4740
									var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4741
									GrandExchangeOfferUnitPriceComparator.getWorldMap().flashCategory(var3); // L: 4742
									return 1; // L: 4743
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4745
									GrandExchangeOfferUnitPriceComparator.getWorldMap().stopCurrentFlashes(); // L: 4746
									return 1; // L: 4747
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4749
									var13 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1; // L: 4750
									GrandExchangeOfferUnitPriceComparator.getWorldMap().setElementsDisabled(var13); // L: 4751
									return 1; // L: 4752
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4754
										class379.Interpreter_intStackSize -= 2; // L: 4755
										var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4756
										var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1; // L: 4757
										GrandExchangeOfferUnitPriceComparator.getWorldMap().disableElement(var3, var7); // L: 4758
										return 1; // L: 4759
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4761
										class379.Interpreter_intStackSize -= 2; // L: 4762
										var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4763
										var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1] == 1; // L: 4764
										GrandExchangeOfferUnitPriceComparator.getWorldMap().setCategoryDisabled(var3, var7); // L: 4765
										return 1; // L: 4766
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4768
										Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4769
										return 1; // L: 4770
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4772
										var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4773
										Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4774
										return 1; // L: 4775
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4777
										var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4778
										Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOfferUnitPriceComparator.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4779
										return 1; // L: 4780
									} else if (var0 == 6638) { // L: 4782
										class379.Interpreter_intStackSize -= 2; // L: 4783
										var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 4784
										var10 = new Coord(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 4785
										var5 = GrandExchangeOfferUnitPriceComparator.getWorldMap().method7920(var3, var10); // L: 4786
										if (var5 == null) { // L: 4787
											Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4788
										} else {
											Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5.packed(); // L: 4791
										}

										return 1; // L: 4793
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4795
											var6 = GrandExchangeOfferUnitPriceComparator.getWorldMap().iconStart(); // L: 4796
											if (var6 == null) { // L: 4797
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4798
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4799
											} else {
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4802
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4803
											}

											return 1; // L: 4805
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4807
											var6 = GrandExchangeOfferUnitPriceComparator.getWorldMap().iconNext(); // L: 4808
											if (var6 == null) { // L: 4809
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4810
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4811
											} else {
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4814
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4815
											}

											return 1; // L: 4817
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4819
												var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4820
												var4 = Actor.WorldMapElement_get(var3); // L: 4821
												if (var4.name == null) { // L: 4822
													Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = ""; // L: 4823
												} else {
													Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4.name; // L: 4826
												}

												return 1; // L: 4828
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4830
												var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4831
												var4 = Actor.WorldMapElement_get(var3); // L: 4832
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.textSize; // L: 4833
												return 1; // L: 4834
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4836
												var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4837
												var4 = Actor.WorldMapElement_get(var3); // L: 4838
												if (var4 == null) { // L: 4839
													Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4840
												} else {
													Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.category; // L: 4843
												}

												return 1; // L: 4845
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4847
												var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 4848
												var4 = Actor.WorldMapElement_get(var3); // L: 4849
												if (var4 == null) { // L: 4850
													Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = -1; // L: 4851
												} else {
													Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4854
												}

												return 1; // L: 4856
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4858
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.mapElement; // L: 4859
												return 1; // L: 4860
											} else if (var0 == 6698) { // L: 4862
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.coord1.packed(); // L: 4863
												return 1; // L: 4864
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4866
												Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Decimator.worldMapEvent.coord2.packed(); // L: 4867
												return 1; // L: 4868
											} else {
												return 2; // L: 4870
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

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lgf;I)V",
		garbageValue = "-1009550654"
	)
	static void method6590(class198 var0) {
		if (var0 != null && var0.field2240 != null) { // L: 4906
			if (var0.field2240.childIndex >= 0) { // L: 4907
				Widget var1 = class281.getWidget(var0.field2240.parentId); // L: 4908
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2240.childIndex >= var1.children.length || var0.field2240 != var1.children[var0.field2240.childIndex]) { // L: 4909
					return; // L: 4910
				}
			}

			if (var0.field2240.type == 11 && var0.field2239 == 0) { // L: 4913
				switch(var0.field2240.method6069()) { // L: 4914
				case 0:
					UrlRequester.openURL(var0.field2240.method6071(), true, false); // L: 4931
					break;
				case 1:
					if (WorldMapCacheName.method5229(class197.getWidgetFlags(var0.field2240))) { // L: 4916
						int[] var4 = var0.field2240.method6132(); // L: 4917
						if (var4 != null) { // L: 4918
							PacketBufferNode var2 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 4919
							var2.packetBuffer.method8437(var4[2]); // L: 4920
							var2.packetBuffer.writeInt(var0.field2240.id); // L: 4921
							var2.packetBuffer.method8437(var0.field2240.method6070()); // L: 4922
							var2.packetBuffer.writeShort(var0.field2240.childIndex); // L: 4923
							var2.packetBuffer.method8453(var4[1]); // L: 4924
							var2.packetBuffer.method8453(var4[0]); // L: 4925
							Client.packetWriter.addNode(var2); // L: 4926
						}
					}
				}
			} else if (var0.field2240.type == 12) { // L: 4935
				class300 var3 = var0.field2240.method6076(); // L: 4936
				if (var3 != null && var3.method5819()) { // L: 4937
					switch(var0.field2239) { // L: 4938
					case 0:
						Client.field734.method3915(var0.field2240); // L: 4943
						var3.method5767(true); // L: 4944
						var3.method5806(var0.field2243, var0.field2236, Client.field733.method3956(82), Client.field733.method3956(81)); // L: 4945
						break;
					case 1:
						var3.method5807(var0.field2243, var0.field2236); // L: 4940
					}
				}
			}

		}
	} // L: 4950
}
