import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
public class class132 implements class371 {
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		longValue = 7705364222102297647L
	)
	static long field1605;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1588;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1584;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1585;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1586;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1592;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1604;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1589;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1590;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1601;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1594;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1593;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1591;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1595;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1587;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1597;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1598;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	static final class132 field1599;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 803648421
	)
	final int field1600;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1043805279
	)
	final int field1583;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1848773117
	)
	final int field1602;

	static {
		field1588 = new class132(0, 0, (String)null, -1, -1); // L: 46
		field1584 = new class132(1, 1, (String)null, 0, 2); // L: 47
		field1585 = new class132(2, 2, (String)null, 1, 2); // L: 48
		field1586 = new class132(3, 3, (String)null, 2, 2); // L: 49
		field1592 = new class132(4, 4, (String)null, 3, 1); // L: 50
		field1604 = new class132(5, 5, (String)null, 4, 1); // L: 51
		field1589 = new class132(6, 6, (String)null, 5, 1); // L: 52
		field1590 = new class132(7, 7, (String)null, 6, 3); // L: 53
		field1601 = new class132(8, 8, (String)null, 7, 3); // L: 54
		field1594 = new class132(9, 9, (String)null, 8, 3); // L: 55
		field1593 = new class132(10, 10, (String)null, 0, 7); // L: 56
		field1591 = new class132(11, 11, (String)null, 1, 7); // L: 57
		field1595 = new class132(12, 12, (String)null, 2, 7); // L: 58
		field1587 = new class132(13, 13, (String)null, 3, 7); // L: 59
		field1597 = new class132(14, 14, (String)null, 4, 7); // L: 60
		field1598 = new class132(15, 15, (String)null, 5, 7); // L: 61
		field1599 = new class132(16, 16, (String)null, 0, 5); // L: 62
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class132(int var1, int var2, String var3, int var4, int var5) {
		this.field1600 = var1; // L: 68
		this.field1583 = var2; // L: 69
		this.field1602 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1552695494"
	)
	int method3036() {
		return this.field1602; // L: 78
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1583; // L: 74
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lis;I)V",
		garbageValue = "388906105"
	)
	static final void method3038(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var19 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + class85.method2273(var13 & 7, var14 & 7, var7); // L: 120
						int var16 = var3 + class144.method3118(var13 & 7, var14 & 7, var7); // L: 121
						int var17 = (var13 & 7) + var8 + var2; // L: 122
						int var18 = var3 + (var14 & 7) + var9; // L: 123
						SecureRandomFuture.loadTerrain(var19, var1, var15, var16, var17, var18, var7); // L: 124
					} else {
						SecureRandomFuture.loadTerrain(var19, 0, -1, -1, 0, 0, 0); // L: 126
					}
				}
			}
		}

	} // L: 130

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1398962204"
	)
	static int method3045(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.field2808; // L: 1330
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1331
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.x; // L: 1332
			return 1; // L: 1333
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1335
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.y; // L: 1336
			return 1; // L: 1337
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1339
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.width; // L: 1340
			return 1; // L: 1341
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1343
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.height; // L: 1344
			return 1; // L: 1345
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1347
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1348
			return 1; // L: 1349
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1351
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.parentId; // L: 1352
			return 1; // L: 1353
		} else {
			return 2; // L: 1355
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-124816622"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4606
		if (VarbitComposition.localPlayer.x >> 7 == Client.destinationX && VarbitComposition.localPlayer.y >> 7 == Client.destinationY) { // L: 4608
			Client.destinationX = 0; // L: 4609
		}

		RouteStrategy.method4187(); // L: 4612
		InterfaceParent.method2278(); // L: 4613
		WorldMapData_0.addNpcsToScene(true); // L: 4614
		class147.method3137(); // L: 4615
		WorldMapData_0.addNpcsToScene(false); // L: 4616

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4618 4619 4657
			if (var4.plane == HealthBar.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4620
				if (Client.cycle >= var4.cycleStart) { // L: 4621
					NPC var39;
					Player var41;
					if (!var4.isMoving && var4.field988 != 0) { // L: 4622
						if (var4.field988 > 0) { // L: 4623
							var39 = Client.npcs[var4.field988 - 1]; // L: 4624
							if (var39 != null && var39.x >= 0 && var39.x < 13312 && var39.y >= 0 && var39.y < 13312) { // L: 4625
								var4.sourceX = var39.x; // L: 4626
								var4.sourceY = var39.y; // L: 4627
								var4.setDestination(var4.field978, var4.field979, var4.field980, Client.cycle); // L: 4628
							}
						} else {
							var6 = -var4.field988 - 1; // L: 4633
							if (var6 == Client.localPlayerIndex) { // L: 4634
								var41 = VarbitComposition.localPlayer;
							} else {
								var41 = Client.players[var6]; // L: 4635
							}

							if (var41 != null && var41.x >= 0 && var41.x < 13312 && var41.y >= 0 && var41.y < 13312) { // L: 4636
								var4.sourceX = var41.x; // L: 4637
								var4.sourceY = var41.y; // L: 4638
								var4.setDestination(var4.field978, var4.field979, var4.field980, Client.cycle); // L: 4639
							}
						}
					}

					if (var4.targetIndex > 0) { // L: 4643
						var39 = Client.npcs[var4.targetIndex - 1]; // L: 4644
						if (var39 != null && var39.x >= 0 && var39.x < 13312 && var39.y >= 0 && var39.y < 13312) { // L: 4645
							var4.setDestination(var39.x, var39.y, class18.getTileHeight(var39.x, var39.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4647
						var6 = -var4.targetIndex - 1; // L: 4649
						if (var6 == Client.localPlayerIndex) { // L: 4650
							var41 = VarbitComposition.localPlayer;
						} else {
							var41 = Client.players[var6]; // L: 4651
						}

						if (var41 != null && var41.x >= 0 && var41.x < 13312 && var41.y >= 0 && var41.y < 13312) { // L: 4652
							var4.setDestination(var41.x, var41.y, class18.getTileHeight(var41.x, var41.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field605); // L: 4654
					class130.scene.drawEntity(HealthBar.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4655
				}
			} else {
				var4.remove();
			}
		}

		class167.method3342(); // L: 4660
		GrandExchangeOfferOwnWorldComparator.setViewportShape(var0, var1, var2, var3, true); // L: 4661
		var0 = Client.viewportOffsetX; // L: 4662
		var1 = Client.viewportOffsetY; // L: 4663
		var2 = Client.viewportWidth; // L: 4664
		var3 = Client.viewportHeight; // L: 4665
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4666
		Rasterizer3D.method4389(); // L: 4667
		Rasterizer2D.method9389(); // L: 4668
		int var36 = Client.camAngleX; // L: 4669
		if (Client.field668 / 256 > var36) { // L: 4670
			var36 = Client.field668 / 256;
		}

		if (Client.field795[4] && Client.field748[4] + 128 > var36) { // L: 4671
			var36 = Client.field748[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4672
		var6 = FriendLoginUpdate.oculusOrbFocalPointX; // L: 4673
		int var7 = class125.field1494; // L: 4674
		int var8 = HealthBar.oculusOrbFocalPointY; // L: 4675
		int var9 = class172.method3459(var36); // L: 4676
		int var11 = var3 - 334; // L: 4680
		if (var11 < 0) { // L: 4681
			var11 = 0;
		} else if (var11 > 100) { // L: 4682
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight; // L: 4683
		int var10 = var12 * var9 / 256; // L: 4684
		var11 = 2048 - var36 & 2047; // L: 4687
		var12 = 2048 - var5 & 2047; // L: 4688
		int var13 = 0; // L: 4689
		int var14 = 0; // L: 4690
		int var15 = var10; // L: 4691
		int var16;
		int var17;
		int var18;
		if (var11 != 0) { // L: 4692
			var16 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4693
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4694
			var18 = var17 * var14 - var16 * var10 >> 16; // L: 4695
			var15 = var17 * var10 + var16 * var14 >> 16; // L: 4696
			var14 = var18; // L: 4697
		}

		if (var12 != 0) { // L: 4699
			var16 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4700
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4701
			var18 = var16 * var15 + var13 * var17 >> 16; // L: 4702
			var15 = var17 * var15 - var13 * var16 >> 16; // L: 4703
			var13 = var18; // L: 4704
		}

		if (Client.isCameraLocked) { // L: 4706
			FontName.field4962 = var6 - var13; // L: 4707
			class25.field124 = var7 - var14; // L: 4708
			class31.field173 = var8 - var15; // L: 4709
			UserComparator4.field1459 = var36; // L: 4710
			VertexNormal.field2800 = var5; // L: 4711
		} else {
			NPCComposition.cameraX = var6 - var13; // L: 4714
			class133.cameraY = var7 - var14; // L: 4715
			class139.cameraZ = var8 - var15; // L: 4716
			class129.cameraPitch = var36; // L: 4717
			UserComparator10.cameraYaw = var5; // L: 4718
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (FriendLoginUpdate.oculusOrbFocalPointX >> 7 != VarbitComposition.localPlayer.x >> 7 || HealthBar.oculusOrbFocalPointY >> 7 != VarbitComposition.localPlayer.y >> 7)) { // L: 4720 4721
			var16 = VarbitComposition.localPlayer.plane; // L: 4722
			var17 = UrlRequester.baseX * 64 + (FriendLoginUpdate.oculusOrbFocalPointX >> 7); // L: 4723
			var18 = class47.baseY * 64 + (HealthBar.oculusOrbFocalPointY >> 7); // L: 4724
			NPC.method2637(var17, var18, var16, true); // L: 4725
		}

		int var20;
		if (!Client.isCameraLocked) { // L: 4730
			if (class449.clientPreferences.method2448()) { // L: 4733
				var11 = HealthBar.Client_plane; // L: 4734
			} else {
				label670: {
					var12 = 3; // L: 4737
					if (class129.cameraPitch < 310) { // L: 4738
						label662: {
							if (Client.oculusOrbState == 1) { // L: 4741
								var13 = FriendLoginUpdate.oculusOrbFocalPointX >> 7; // L: 4742
								var14 = HealthBar.oculusOrbFocalPointY >> 7; // L: 4743
							} else {
								var13 = VarbitComposition.localPlayer.x >> 7; // L: 4746
								var14 = VarbitComposition.localPlayer.y >> 7; // L: 4747
							}

							var15 = NPCComposition.cameraX >> 7; // L: 4749
							var16 = class139.cameraZ >> 7; // L: 4750
							if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 4751
								if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) { // L: 4755
									if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) { // L: 4759
										var12 = HealthBar.Client_plane;
									}

									if (var13 > var15) { // L: 4761
										var17 = var13 - var15;
									} else {
										var17 = var15 - var13; // L: 4762
									}

									if (var14 > var16) { // L: 4764
										var18 = var14 - var16;
									} else {
										var18 = var16 - var14; // L: 4765
									}

									int var19;
									if (var17 > var18) { // L: 4766
										var19 = var18 * 65536 / var17; // L: 4767
										var20 = 32768; // L: 4768

										while (true) {
											if (var15 == var13) { // L: 4769
												break label662;
											}

											if (var15 < var13) { // L: 4770
												++var15;
											} else if (var15 > var13) { // L: 4771
												--var15;
											}

											if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) { // L: 4772
												var12 = HealthBar.Client_plane;
											}

											var20 += var19; // L: 4773
											if (var20 >= 65536) { // L: 4774
												var20 -= 65536; // L: 4775
												if (var16 < var14) { // L: 4776
													++var16;
												} else if (var16 > var14) { // L: 4777
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) { // L: 4778
													var12 = HealthBar.Client_plane;
												}
											}
										}
									} else {
										if (var18 > 0) { // L: 4782
											var19 = var17 * 65536 / var18; // L: 4783
											var20 = 32768; // L: 4784

											while (var14 != var16) { // L: 4785
												if (var16 < var14) { // L: 4786
													++var16;
												} else if (var16 > var14) { // L: 4787
													--var16;
												}

												if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) { // L: 4788
													var12 = HealthBar.Client_plane;
												}

												var20 += var19; // L: 4789
												if (var20 >= 65536) { // L: 4790
													var20 -= 65536; // L: 4791
													if (var15 < var13) { // L: 4792
														++var15;
													} else if (var15 > var13) { // L: 4793
														--var15;
													}

													if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][var15][var16] & 4) != 0) { // L: 4794
														var12 = HealthBar.Client_plane;
													}
												}
											}
										}
										break label662;
									}
								}

								var11 = HealthBar.Client_plane; // L: 4756
								break label670; // L: 4757
							}

							var11 = HealthBar.Client_plane; // L: 4752
							break label670; // L: 4753
						}
					}

					if (VarbitComposition.localPlayer.x >= 0 && VarbitComposition.localPlayer.y >= 0 && VarbitComposition.localPlayer.x < 13312 && VarbitComposition.localPlayer.y < 13312) { // L: 4799
						if ((Tiles.Tiles_renderFlags[HealthBar.Client_plane][VarbitComposition.localPlayer.x >> 7][VarbitComposition.localPlayer.y >> 7] & 4) != 0) { // L: 4803
							var12 = HealthBar.Client_plane;
						}

						var11 = var12; // L: 4804
					} else {
						var11 = HealthBar.Client_plane; // L: 4800
					}
				}
			}

			var10 = var11; // L: 4806
		} else {
			var10 = StructComposition.method3845(); // L: 4808
		}

		var11 = NPCComposition.cameraX; // L: 4809
		var12 = class133.cameraY; // L: 4810
		var13 = class139.cameraZ; // L: 4811
		var14 = class129.cameraPitch; // L: 4812
		var15 = UserComparator10.cameraYaw; // L: 4813

		for (var16 = 0; var16 < 5; ++var16) { // L: 4814
			if (Client.field795[var16]) { // L: 4815
				var17 = (int)(Math.random() * (double)(Client.field588[var16] * 2 + 1) - (double)Client.field588[var16] + Math.sin((double)Client.field658[var16] / 100.0D * (double)Client.field744[var16]) * (double)Client.field748[var16]); // L: 4816
				if (var16 == 0) { // L: 4817
					NPCComposition.cameraX += var17;
				}

				if (var16 == 1) { // L: 4818
					class133.cameraY += var17;
				}

				if (var16 == 2) { // L: 4819
					class139.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4820
					UserComparator10.cameraYaw = var17 + UserComparator10.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4821
					class129.cameraPitch += var17; // L: 4822
					if (class129.cameraPitch < 128) { // L: 4823
						class129.cameraPitch = 128;
					}

					if (class129.cameraPitch > 383) { // L: 4824
						class129.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4828
		var17 = MouseHandler.MouseHandler_y; // L: 4829
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4830
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4831
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4832
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4834
			MenuAction.method2083(var16 - var0, var17 - var1); // L: 4835
		} else {
			Players.method2706(); // L: 4838
		}

		class301.method5721(); // L: 4840
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4841
		class301.method5721(); // L: 4842
		var18 = Rasterizer3D.method4386(); // L: 4843
		Rasterizer3D.method4390(class219.client.field215); // L: 4844
		Rasterizer3D.field2536.field2815 = Client.viewportZoom; // L: 4845
		class130.scene.draw(NPCComposition.cameraX, class133.cameraY, class139.cameraZ, class129.cameraPitch, UserComparator10.cameraYaw, var10); // L: 4846
		Rasterizer3D.method4390(false); // L: 4847
		if (Client.renderSelf) { // L: 4848
			Rasterizer2D.method9390(); // L: 4849
		}

		Rasterizer3D.field2536.field2815 = var18; // L: 4851
		class301.method5721(); // L: 4852
		class130.scene.clearTempGameObjects(); // L: 4853
		Client.field631 = 0; // L: 4855
		boolean var40 = false; // L: 4856
		var20 = -1; // L: 4857
		int var21 = -1; // L: 4858
		int var22 = Players.Players_count; // L: 4859
		int[] var23 = Players.Players_indices; // L: 4860

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) { // L: 4861
			Object var38;
			if (var24 < var22) { // L: 4863
				var38 = Client.players[var23[var24]]; // L: 4864
				if (var23[var24] == Client.combatTargetPlayerIndex) { // L: 4865
					var40 = true; // L: 4866
					var20 = var24; // L: 4867
					continue;
				}

				if (var38 == VarbitComposition.localPlayer) { // L: 4870
					var21 = var24; // L: 4871
					continue; // L: 4872
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var24 - var22]]; // L: 4875
			}

			PcmPlayer.drawActor2d((Actor)var38, var24, var0, var1, var2, var3); // L: 4876
		}

		if (Client.field764 && var21 != -1) { // L: 4878
			PcmPlayer.drawActor2d(VarbitComposition.localPlayer, var21, var0, var1, var2, var3); // L: 4879
		}

		if (var40) { // L: 4881
			PcmPlayer.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3); // L: 4882
		}

		for (var24 = 0; var24 < Client.field631; ++var24) { // L: 4884
			int var25 = Client.field633[var24]; // L: 4885
			int var26 = Client.field634[var24]; // L: 4886
			int var27 = Client.field811[var24]; // L: 4887
			int var28 = Client.field585[var24]; // L: 4888
			boolean var29 = true; // L: 4889

			while (var29) {
				var29 = false; // L: 4891

				for (int var37 = 0; var37 < var24; ++var37) { // L: 4892
					if (var26 + 2 > Client.field634[var37] - Client.field585[var37] && var26 - var28 < Client.field634[var37] + 2 && var25 - var27 < Client.field811[var37] + Client.field633[var37] && var25 + var27 > Client.field633[var37] - Client.field811[var37] && Client.field634[var37] - Client.field585[var37] < var26) { // L: 4893 4894
						var26 = Client.field634[var37] - Client.field585[var37]; // L: 4895
						var29 = true; // L: 4896
					}
				}
			}

			Client.viewportTempX = Client.field633[var24]; // L: 4901
			Client.viewportTempY = Client.field634[var24] = var26; // L: 4902
			String var30 = Client.field641[var24]; // L: 4903
			if (Client.chatEffects == 0) { // L: 4904
				int var31 = 16776960; // L: 4905
				if (Client.field637[var24] < 6) { // L: 4906
					var31 = Client.field758[Client.field637[var24]];
				}

				if (Client.field637[var24] == 6) { // L: 4907
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field637[var24] == 7) { // L: 4908
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field637[var24] == 8) { // L: 4909
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.field637[var24] == 9) { // L: 4910
					var32 = 150 - Client.field786[var24]; // L: 4911
					if (var32 < 50) { // L: 4912
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) { // L: 4913
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4914
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.field637[var24] == 10) { // L: 4916
					var32 = 150 - Client.field786[var24]; // L: 4917
					if (var32 < 50) { // L: 4918
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) { // L: 4919
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4920
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.field637[var24] == 11) { // L: 4922
					var32 = 150 - Client.field786[var24]; // L: 4923
					if (var32 < 50) { // L: 4924
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) { // L: 4925
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) { // L: 4926
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				int var33;
				if (Client.field637[var24] == 12 && Client.field535[var24] == null) { // L: 4928 4929
					var32 = var30.length(); // L: 4930
					Client.field535[var24] = new int[var32]; // L: 4931

					for (var33 = 0; var33 < var32; ++var33) { // L: 4932
						int var34 = (int)(64.0F * ((float)var33 / (float)var32)); // L: 4933
						int var35 = var34 << 10 | 896 | 64; // L: 4934
						Client.field535[var24][var33] = class466.field4795[var35]; // L: 4935
					}
				}

				if (Client.field638[var24] == 0) { // L: 4939
					class59.fontBold12.method7441(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.field535[var24]);
				}

				if (Client.field638[var24] == 1) { // L: 4940
					class59.fontBold12.method7459(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field535[var24]);
				}

				if (Client.field638[var24] == 2) { // L: 4941
					class59.fontBold12.method7439(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field535[var24]);
				}

				if (Client.field638[var24] == 3) { // L: 4942
					class59.fontBold12.method7481(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.field786[var24], Client.field535[var24]);
				}

				if (Client.field638[var24] == 4) { // L: 4943
					var32 = (150 - Client.field786[var24]) * (class59.fontBold12.stringWidth(var30) + 100) / 150; // L: 4944
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4945
					class59.fontBold12.method7489(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0, Client.field535[var24]); // L: 4946
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4947
				}

				if (Client.field638[var24] == 5) { // L: 4949
					var32 = 150 - Client.field786[var24]; // L: 4950
					var33 = 0; // L: 4951
					if (var32 < 25) { // L: 4952
						var33 = var32 - 25;
					} else if (var32 > 125) { // L: 4953
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class59.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4954
					class59.fontBold12.method7441(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0, Client.field535[var24]); // L: 4955
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4956
				}
			} else {
				class59.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4960
			}
		}

		ItemContainer.method2271(var0, var1); // L: 4964
		((TextureProvider)Rasterizer3D.field2536.Rasterizer3D_textureLoader).animate(Client.field605); // L: 4965
		class153.method3173(var0, var1, var2, var3); // L: 4966
		NPCComposition.cameraX = var11; // L: 4967
		class133.cameraY = var12; // L: 4968
		class139.cameraZ = var13; // L: 4969
		class129.cameraPitch = var14; // L: 4970
		UserComparator10.cameraYaw = var15; // L: 4971
		if (Client.field539 && class308.field3462.method6810(true, false) == 0) { // L: 4972
			Client.field539 = false;
		}

		if (Client.field539) { // L: 4973
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4974
			class405.drawLoadingMessage("Loading - please wait.", false); // L: 4975
		}

	} // L: 4977
}
