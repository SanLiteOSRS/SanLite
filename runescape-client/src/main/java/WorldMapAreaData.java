import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field2641;
	@ObfuscatedName("as")
	HashSet field2635;
	@ObfuscatedName("ay")
	HashSet field2636;
	@ObfuscatedName("ak")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Luj;Luj;IZZI)V",
		garbageValue = "-605935351"
	)
	void method5036(Buffer var1, Buffer var2, int var3, boolean var4, boolean var5) {
		this.method4547(var1, var3, var5); // L: 17
		int var6 = var2.readUnsignedShort(); // L: 18
		this.field2635 = new HashSet(var6); // L: 19

		int var7;
		for (var7 = 0; var7 < var6; ++var7) { // L: 20
			WorldMapData_0 var8 = new WorldMapData_0();

			try {
				var8.init(var2); // L: 23
			} catch (IllegalStateException var13) { // L: 25
				continue; // L: 26
			}

			this.field2635.add(var8); // L: 28
		}

		var7 = var2.readUnsignedShort(); // L: 30
		this.field2636 = new HashSet(var7); // L: 31

		for (int var11 = 0; var11 < var7; ++var11) { // L: 32
			WorldMapData_1 var9 = new WorldMapData_1(); // L: 33

			try {
				var9.init(var2); // L: 35
			} catch (IllegalStateException var12) { // L: 37
				continue; // L: 38
			}

			this.field2636.add(var9); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Luj;ZI)V",
		garbageValue = "950262169"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9280(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1883889398"
	)
	static final float method5039(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 21
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 22
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIII)V",
		garbageValue = "-1973089018"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3672 == null) { // L: 1239
			throw new RuntimeException(); // L: 1240
		} else {
			var0.field3672[var1] = var2; // L: 1242
			var0.field3756[var1] = var3; // L: 1243
		}
	} // L: 1244

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-113"
	)
	static final void method5045(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8516
			if (Client.isLowDetail && var0 != ItemLayer.Client_plane) { // L: 8517
				return;
			}

			long var8 = 0L; // L: 8518
			boolean var10 = true; // L: 8519
			boolean var11 = false; // L: 8520
			boolean var12 = false; // L: 8521
			if (var1 == 0) { // L: 8522
				var8 = class36.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8523
				var8 = class36.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8524
				var8 = class36.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8525
				var8 = class36.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			if (0L != var8) { // L: 8526
				var13 = class36.scene.getObjectFlags(var0, var2, var3, var8); // L: 8527
				int var43 = class232.Entity_unpackID(var8); // L: 8528
				int var44 = var13 & 31; // L: 8529
				int var45 = var13 >> 6 & 3; // L: 8530
				ObjectComposition var14 = WorldMapSection2.getObjectDefinition(var43); // L: 8531
				if (var14 != null && var14.hasSound()) { // L: 8535
					var17 = var14.sizeX; // L: 8536
					var18 = var14.sizeY; // L: 8537
					if (var45 == 1 || var45 == 3) { // L: 8538
						var17 = var14.sizeY; // L: 8539
						var18 = var14.sizeX; // L: 8540
					}

					var19 = (var17 + var2) * 128; // L: 8542
					var20 = (var3 + var18) * 128; // L: 8543
					int var15 = var2 * 128; // L: 8544
					int var16 = var3 * 128; // L: 8545
					var21 = var14.ambientSoundId; // L: 8546
					var22 = var14.int7 * 128; // L: 8547
					if (var14.transforms != null) { // L: 8548
						ObjectComposition var23 = var14.transform(); // L: 8549
						if (var23 != null) { // L: 8550
							var21 = var23.ambientSoundId; // L: 8551
							var22 = var23.int7 * 128; // L: 8552
						}
					}

					Object var10000 = null;

					for (ObjectSound var47 = (ObjectSound)ObjectSound.objectSounds.last(); var47 != null; var47 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var0 == var47.plane && var15 == var47.x * 16384 && var16 == var47.y * 16384 && var19 == var47.maxX * 16384 && var20 == var47.maxY * 16384 && var21 == var47.soundEffectId && var22 == var47.field824) { // L: 8556
							if (var47.stream1 != null) { // L: 8557
								LoginScreenAnimation.pcmStreamMixer.removeSubStream(var47.stream1); // L: 8558
								var47.stream1 = null; // L: 8559
							}

							if (var47.stream2 != null) { // L: 8561
								LoginScreenAnimation.pcmStreamMixer.removeSubStream(var47.stream2); // L: 8562
								var47.stream2 = null; // L: 8563
							}

							var47.remove(); // L: 8565
							break; // L: 8566
						}

						var10000 = null; // L: 8555
					}
				}

				if (var1 == 0) { // L: 8571
					class36.scene.method5341(var0, var2, var3); // L: 8572
					if (var14.interactType != 0) { // L: 8573
						Client.collisionMaps[var0].method4382(var2, var3, var44, var45, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8575
					class36.scene.method5419(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8576
					class36.scene.removeGameObject(var0, var2, var3); // L: 8577
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8578
						return;
					}

					if (var14.interactType != 0) { // L: 8579
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var45, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8581
					class36.scene.method5388(var0, var2, var3); // L: 8582
					if (var14.interactType == 1) { // L: 8583
						Client.collisionMaps[var0].method4362(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8586
				var13 = var0; // L: 8587
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8588
					var13 = var0 + 1;
				}

				Scene var46 = class36.scene; // L: 8589
				CollisionMap var37 = Client.collisionMaps[var0]; // L: 8590
				ObjectComposition var38 = WorldMapSection2.getObjectDefinition(var4); // L: 8592
				var17 = var7 >= 0 ? var7 : var38.animationId; // L: 8593
				if (var5 != 1 && var5 != 3) { // L: 8596
					var18 = var38.sizeX; // L: 8601
					var19 = var38.sizeY; // L: 8602
				} else {
					var18 = var38.sizeY; // L: 8597
					var19 = var38.sizeX; // L: 8598
				}

				if (var18 + var2 <= 104) { // L: 8608
					var20 = (var18 >> 1) + var2; // L: 8609
					var21 = var2 + (var18 + 1 >> 1); // L: 8610
				} else {
					var20 = var2; // L: 8613
					var21 = var2 + 1; // L: 8614
				}

				int var39;
				if (var3 + var19 <= 104) { // L: 8616
					var22 = var3 + (var19 >> 1); // L: 8617
					var39 = var3 + (var19 + 1 >> 1); // L: 8618
				} else {
					var22 = var3; // L: 8621
					var39 = var3 + 1; // L: 8622
				}

				int[][] var24 = Tiles.Tiles_heights[var13]; // L: 8624
				int var25 = var24[var20][var22] + var24[var21][var22] + var24[var20][var39] + var24[var21][var39] >> 2; // L: 8625
				int var26 = (var2 << 7) + (var18 << 6); // L: 8626
				int var27 = (var3 << 7) + (var19 << 6); // L: 8627
				long var28 = Player.calculateTag(var2, var3, 2, var38.int1 == 0, var4); // L: 8628
				int var30 = (var5 << 6) + var6; // L: 8629
				if (var38.int3 == 1) { // L: 8630
					var30 += 256;
				}

				Object var41;
				if (var6 == 22) { // L: 8631
					if (var17 == -1 && var38.transforms == null) { // L: 8633
						var41 = var38.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var41 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8634
					}

					var46.newGroundObject(var0, var2, var3, var25, (Renderable)var41, var28, var30); // L: 8635
					if (var38.interactType == 1) { // L: 8636
						var37.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 8639
					if (var6 >= 12) { // L: 8647
						if (var17 == -1 && var38.transforms == null) { // L: 8649
							var41 = var38.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8650
						}

						var46.method5334(var0, var2, var3, var25, 1, 1, (Renderable)var41, 0, var28, var30); // L: 8651
						if (var38.interactType != 0) { // L: 8652
							var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
						}
					} else if (var6 == 0) { // L: 8655
						if (var17 == -1 && var38.transforms == null) { // L: 8657
							var41 = var38.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8658
						}

						var46.newWallObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1006[var5], 0, var28, var30); // L: 8659
						if (var38.interactType != 0) { // L: 8660
							var37.method4349(var2, var3, var6, var5, var38.boolean1);
						}
					} else if (var6 == 1) { // L: 8663
						if (var17 == -1 && var38.transforms == null) { // L: 8665
							var41 = var38.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var41 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8666
						}

						var46.newWallObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1005[var5], 0, var28, var30); // L: 8667
						if (var38.interactType != 0) { // L: 8668
							var37.method4349(var2, var3, var6, var5, var38.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) { // L: 8671
							var31 = var5 + 1 & 3; // L: 8672
							Object var33;
							Object var42;
							if (var17 == -1 && var38.transforms == null) { // L: 8675
								var42 = var38.getModel(2, var5 + 4, var24, var26, var25, var27); // L: 8676
								var33 = var38.getModel(2, var31, var24, var26, var25, var27); // L: 8677
							} else {
								var42 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8680
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8681
							}

							var46.newWallObject(var0, var2, var3, var25, (Renderable)var42, (Renderable)var33, Tiles.field1006[var5], Tiles.field1006[var31], var28, var30); // L: 8683
							if (var38.interactType != 0) { // L: 8684
								var37.method4349(var2, var3, var6, var5, var38.boolean1);
							}
						} else if (var6 == 3) { // L: 8687
							if (var17 == -1 && var38.transforms == null) { // L: 8689
								var41 = var38.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8690
							}

							var46.newWallObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1005[var5], 0, var28, var30); // L: 8691
							if (var38.interactType != 0) { // L: 8692
								var37.method4349(var2, var3, var6, var5, var38.boolean1);
							}
						} else if (var6 == 9) { // L: 8695
							if (var17 == -1 && var38.transforms == null) { // L: 8697
								var41 = var38.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8698
							}

							var46.method5334(var0, var2, var3, var25, 1, 1, (Renderable)var41, 0, var28, var30); // L: 8699
							if (var38.interactType != 0) { // L: 8700
								var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
							}
						} else if (var6 == 4) { // L: 8703
							if (var17 == -1 && var38.transforms == null) { // L: 8705
								var41 = var38.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var41 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8706
							}

							var46.newDecorativeObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, Tiles.field1006[var5], 0, 0, 0, var28, var30); // L: 8707
						} else {
							long var32;
							Object var34;
							if (var6 == 5) { // L: 8710
								var31 = 16; // L: 8711
								var32 = var46.getWallObjectTag(var0, var2, var3); // L: 8712
								if (var32 != 0L) { // L: 8713
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var38.transforms == null) { // L: 8715
									var34 = var38.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8716
								}

								var46.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1006[var5], 0, var31 * Tiles.field1010[var5], var31 * Tiles.field1007[var5], var28, var30); // L: 8717
							} else if (var6 == 6) { // L: 8720
								var31 = 8; // L: 8721
								var32 = var46.getWallObjectTag(var0, var2, var3); // L: 8722
								if (0L != var32) { // L: 8723
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var38.transforms == null) { // L: 8725
									var34 = var38.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8726
								}

								var46.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1008[var5], var31 * Tiles.field1009[var5], var28, var30); // L: 8727
							} else if (var6 == 7) { // L: 8730
								int var40 = var5 + 2 & 3; // L: 8732
								if (var17 == -1 && var38.transforms == null) { // L: 8733
									var41 = var38.getModel(4, var40 + 4, var24, var26, var25, var27);
								} else {
									var41 = new DynamicObject(var4, 4, var40 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8734
								}

								var46.newDecorativeObject(var0, var2, var3, var25, (Renderable)var41, (Renderable)null, 256, var40, 0, 0, var28, var30); // L: 8735
							} else if (var6 == 8) { // L: 8738
								var31 = 8; // L: 8739
								var32 = var46.getWallObjectTag(var0, var2, var3); // L: 8740
								if (var32 != 0L) { // L: 8741
									var31 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3; // L: 8744
								Object var35;
								if (var17 == -1 && var38.transforms == null) { // L: 8745
									var34 = var38.getModel(4, var5 + 4, var24, var26, var25, var27); // L: 8746
									var35 = var38.getModel(4, var36 + 4, var24, var26, var25, var27); // L: 8747
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8750
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8751
								}

								var46.newDecorativeObject(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1008[var5], var31 * Tiles.field1009[var5], var28, var30); // L: 8753
							}
						}
					}
				} else {
					if (var17 == -1 && var38.transforms == null) { // L: 8641
						var41 = var38.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var41 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var38.boolean3, (Renderable)null); // L: 8642
					}

					if (var41 != null) { // L: 8643
						var46.method5334(var0, var2, var3, var25, var18, var19, (Renderable)var41, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var38.interactType != 0) { // L: 8644
						var37.addGameObject(var2, var3, var18, var19, var38.boolean1);
					}
				}

				var38 = WorldMapSection2.getObjectDefinition(var4); // L: 8756
				if (var38 != null && var38.hasSound()) { // L: 8757
					UrlRequester.method2900(var13, var2, var3, var38, var5); // L: 8758
				}
			}
		}

	} // L: 8762
}
