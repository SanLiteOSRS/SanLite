import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("up")
	static Iterator field3547;
	@ObfuscatedName("h")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("w")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false}; // L: 5
		Skills_experienceTable = new int[99]; // L: 6
		int var0 = 0; // L: 9

		for (int var1 = 0; var1 < 99; ++var1) { // L: 10
			int var2 = var1 + 1; // L: 11
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D)); // L: 12
			var0 += var3; // L: 13
			Skills_experienceTable[var1] = var0 / 4; // L: 14
		}

	} // L: 16

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Ljq;B)V",
		garbageValue = "1"
	)
	static final void method5659(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7437
		int var2;
		int var3;
		int var4;
		int var5;
		int var9;
		int var37;
		int var38;
		int var39;
		if (class263.field3031 == var0) { // L: 7438
			var2 = var1.method7786(); // L: 7439
			var3 = var2 >> 2; // L: 7440
			var4 = var2 & 3; // L: 7441
			var5 = Client.field548[var3]; // L: 7442
			var37 = var1.method7654(); // L: 7443
			var38 = var1.readUnsignedByte(); // L: 7444
			var39 = (var38 >> 4 & 7) + CollisionMap.field2196; // L: 7445
			var9 = (var38 & 7) + class137.field1593; // L: 7446
			if (var39 >= 0 && var9 >= 0 && var39 < 104 && var9 < 104) { // L: 7447
				WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var39, var9, var5, var37, var3, var4, 0, -1); // L: 7448
			}

		} else {
			byte var7;
			int var10;
			int var11;
			int var12;
			int var13;
			if (class263.field3026 == var0) { // L: 7452
				var2 = var1.method7786(); // L: 7453
				var3 = (var2 >> 4 & 7) + CollisionMap.field2196; // L: 7454
				var4 = (var2 & 7) + class137.field1593; // L: 7455
				var5 = var1.method7654(); // L: 7456
				byte var6 = var1.method7658(); // L: 7457
				var7 = var1.readByte(); // L: 7458
				byte var8 = var1.method7671(); // L: 7459
				var9 = var1.method7640(); // L: 7460
				var10 = var1.method7708(); // L: 7461
				var11 = var10 >> 2; // L: 7462
				var12 = var10 & 3; // L: 7463
				var13 = Client.field548[var11]; // L: 7464
				byte var14 = var1.readByte(); // L: 7465
				int var15 = var1.method7640(); // L: 7466
				int var16 = var1.method7677(); // L: 7467
				Player var17;
				if (var16 == Client.localPlayerIndex) { // L: 7469
					var17 = ScriptFrame.localPlayer;
				} else {
					var17 = Client.players[var16]; // L: 7470
				}

				if (var17 != null) { // L: 7471
					ObjectComposition var18 = FileSystem.getObjectDefinition(var9); // L: 7472
					int var19;
					int var20;
					if (var12 != 1 && var12 != 3) { // L: 7475
						var19 = var18.sizeX; // L: 7480
						var20 = var18.sizeY; // L: 7481
					} else {
						var19 = var18.sizeY; // L: 7476
						var20 = var18.sizeX; // L: 7477
					}

					int var21 = var3 + (var19 >> 1); // L: 7483
					int var22 = var3 + (var19 + 1 >> 1); // L: 7484
					int var23 = var4 + (var20 >> 1); // L: 7485
					int var24 = var4 + (var20 + 1 >> 1); // L: 7486
					int[][] var25 = Tiles.Tiles_heights[class268.Client_plane]; // L: 7487
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 7488
					int var27 = (var3 << 7) + (var19 << 6); // L: 7489
					int var28 = (var4 << 7) + (var20 << 6); // L: 7490
					Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28); // L: 7491
					if (var29 != null) { // L: 7492
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var3, var4, var13, -1, 0, 0, var15 + 1, var5 + 1); // L: 7493
						var17.animationCycleStart = var15 + Client.cycle; // L: 7494
						var17.animationCycleEnd = var5 + Client.cycle; // L: 7495
						var17.model0 = var29; // L: 7496
						var17.field1093 = var3 * 128 + var19 * 64; // L: 7497
						var17.field1097 = var4 * 128 + var20 * 64; // L: 7498
						var17.tileHeight2 = var26; // L: 7499
						byte var30;
						if (var8 > var7) { // L: 7500
							var30 = var8; // L: 7501
							var8 = var7; // L: 7502
							var7 = var30; // L: 7503
						}

						if (var14 > var6) { // L: 7505
							var30 = var14; // L: 7506
							var14 = var6; // L: 7507
							var6 = var30; // L: 7508
						}

						var17.minX = var8 + var3; // L: 7510
						var17.maxX = var3 + var7; // L: 7511
						var17.minY = var14 + var4; // L: 7512
						var17.maxY = var6 + var4; // L: 7513
					}
				}
			}

			if (class263.field3032 == var0) { // L: 7517
				var2 = var1.method7670(); // L: 7518
				var3 = var1.method7677(); // L: 7519
				var4 = var1.method7670(); // L: 7520
				var5 = (var4 >> 4 & 7) + CollisionMap.field2196; // L: 7521
				var37 = (var4 & 7) + class137.field1593; // L: 7522
				var38 = var1.method7670(); // L: 7523
				var39 = var38 >> 4 & 15; // L: 7524
				var9 = var38 & 7; // L: 7525
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) { // L: 7526
					var10 = var39 + 1; // L: 7527
					if (ScriptFrame.localPlayer.pathX[0] >= var5 - var10 && ScriptFrame.localPlayer.pathX[0] <= var10 + var5 && ScriptFrame.localPlayer.pathY[0] >= var37 - var10 && ScriptFrame.localPlayer.pathY[0] <= var10 + var37 && FriendsChatMember.clientPreferences.method2226() != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 7528 7529
						Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 7530
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 7531
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7532
						Client.soundEffects[Client.soundEffectCount] = null; // L: 7533
						Client.soundLocations[Client.soundEffectCount] = var39 + (var37 << 8) + (var5 << 16); // L: 7534
						++Client.soundEffectCount; // L: 7535
					}
				}
			}

			if (class263.field3027 == var0) { // L: 7540
				var2 = var1.method7640(); // L: 7541
				var3 = var1.method7640(); // L: 7542
				var4 = var1.method7786(); // L: 7543
				var5 = (var4 >> 4 & 7) + CollisionMap.field2196; // L: 7544
				var37 = (var4 & 7) + class137.field1593; // L: 7545
				var38 = var1.method7786(); // L: 7546
				if (var5 >= 0 && var37 >= 0 && var5 < 104 && var37 < 104) { // L: 7547
					var5 = var5 * 128 + 64; // L: 7548
					var37 = var37 * 128 + 64; // L: 7549
					GraphicsObject var45 = new GraphicsObject(var2, class268.Client_plane, var5, var37, ObjectComposition.getTileHeight(var5, var37, class268.Client_plane) - var38, var3, Client.cycle); // L: 7550
					Client.graphicsObjects.addFirst(var45); // L: 7551
				}

			} else {
				TileItem var35;
				if (class263.field3028 == var0) { // L: 7555
					var2 = var1.readUnsignedShort(); // L: 7556
					var3 = var1.method7708(); // L: 7557
					var4 = (var3 >> 4 & 7) + CollisionMap.field2196; // L: 7558
					var5 = (var3 & 7) + class137.field1593; // L: 7559
					var37 = var1.method7640(); // L: 7560
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7561
						var35 = new TileItem(); // L: 7562
						var35.id = var37; // L: 7563
						var35.quantity = var2; // L: 7564
						if (Client.groundItems[class268.Client_plane][var4][var5] == null) { // L: 7565
							Client.groundItems[class268.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[class268.Client_plane][var4][var5].addFirst(var35); // L: 7566
						class360.updateItemPile(var4, var5); // L: 7567
					}

				} else if (class263.field3030 == var0) { // L: 7571
					var2 = var1.method7708(); // L: 7572
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196; // L: 7573
					var4 = (var2 & 7) + class137.field1593; // L: 7574
					var5 = var1.method7670(); // L: 7575
					var37 = var5 >> 2; // L: 7576
					var38 = var5 & 3; // L: 7577
					var39 = Client.field548[var37]; // L: 7578
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7579
						WorldMapIcon_0.updatePendingSpawn(class268.Client_plane, var3, var4, var39, -1, var37, var38, 0, -1); // L: 7580
					}

				} else if (class263.field3029 == var0) { // L: 7584
					var2 = var1.method7670(); // L: 7585
					var3 = var1.method7786(); // L: 7586
					var4 = (var3 >> 4 & 7) + CollisionMap.field2196; // L: 7587
					var5 = (var3 & 7) + class137.field1593; // L: 7588
					var37 = var1.method7786() * 4; // L: 7589
					var7 = var1.readByte(); // L: 7590
					var39 = var1.method7654(); // L: 7591
					byte var40 = var1.method7658(); // L: 7592
					var10 = var1.readUnsignedByte(); // L: 7593
					var11 = var1.method7708() * 4; // L: 7594
					var12 = var1.method7640(); // L: 7595
					var13 = var1.method7654(); // L: 7596
					int var41 = var1.method7793(); // L: 7597
					var9 = var40 + var4; // L: 7598
					var38 = var7 + var5; // L: 7599
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var9 >= 0 && var38 >= 0 && var9 < 104 && var38 < 104 && var12 != 65535) { // L: 7600
						var4 = var4 * 128 + 64; // L: 7601
						var5 = var5 * 128 + 64; // L: 7602
						var9 = var9 * 128 + 64; // L: 7603
						var38 = var38 * 128 + 64; // L: 7604
						Projectile var36 = new Projectile(var12, class268.Client_plane, var4, var5, ObjectComposition.getTileHeight(var4, var5, class268.Client_plane) - var11, var39 + Client.cycle, var13 + Client.cycle, var10, var2, var41, var37); // L: 7605
						var36.setDestination(var9, var38, ObjectComposition.getTileHeight(var9, var38, class268.Client_plane) - var37, var39 + Client.cycle); // L: 7606
						Client.projectiles.addFirst(var36); // L: 7607
					}

				} else if (class263.field3033 == var0) { // L: 7611
					var2 = var1.readUnsignedByte(); // L: 7612
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196; // L: 7613
					var4 = (var2 & 7) + class137.field1593; // L: 7614
					var5 = var1.method7640(); // L: 7615
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7616
						NodeDeque var34 = Client.groundItems[class268.Client_plane][var3][var4]; // L: 7617
						if (var34 != null) { // L: 7618
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7619 7620 7625
								if ((var5 & 32767) == var35.id) { // L: 7621
									var35.remove(); // L: 7622
									break;
								}
							}

							if (var34.last() == null) { // L: 7627
								Client.groundItems[class268.Client_plane][var3][var4] = null;
							}

							class360.updateItemPile(var3, var4); // L: 7628
						}
					}

				} else if (class263.field3036 == var0) { // L: 7633
					var2 = var1.method7708(); // L: 7634
					var3 = (var2 >> 4 & 7) + CollisionMap.field2196; // L: 7635
					var4 = (var2 & 7) + class137.field1593; // L: 7636
					var5 = var1.method7640(); // L: 7637
					var37 = var1.method7677(); // L: 7638
					var38 = var1.method7654(); // L: 7639
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7640
						NodeDeque var32 = Client.groundItems[class268.Client_plane][var3][var4]; // L: 7641
						if (var32 != null) { // L: 7642
							for (TileItem var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 7643 7644 7649
								if ((var37 & 32767) == var33.id && var5 == var33.quantity) { // L: 7645
									var33.quantity = var38; // L: 7646
									break;
								}
							}

							class360.updateItemPile(var3, var4); // L: 7651
						}
					}

				} else if (class263.field3034 == var0) { // L: 7656
					var2 = var1.method7708(); // L: 7657
					var3 = var2 >> 2; // L: 7658
					var4 = var2 & 3; // L: 7659
					var5 = Client.field548[var3]; // L: 7660
					var37 = var1.readUnsignedByte(); // L: 7661
					var38 = (var37 >> 4 & 7) + CollisionMap.field2196; // L: 7662
					var39 = (var37 & 7) + class137.field1593; // L: 7663
					var9 = var1.method7640(); // L: 7664
					if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) { // L: 7665
						if (var5 == 0) { // L: 7666
							WallObject var31 = class12.scene.method4073(class268.Client_plane, var38, var39); // L: 7667
							if (var31 != null) { // L: 7668
								var11 = WorldMapSection2.Entity_unpackID(var31.tag); // L: 7669
								if (var3 == 2) { // L: 7670
									var31.renderable1 = new DynamicObject(var11, 2, var4 + 4, class268.Client_plane, var38, var39, var9, false, var31.renderable1); // L: 7671
									var31.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, class268.Client_plane, var38, var39, var9, false, var31.renderable2); // L: 7672
								} else {
									var31.renderable1 = new DynamicObject(var11, var3, var4, class268.Client_plane, var38, var39, var9, false, var31.renderable1); // L: 7674
								}
							}
						}

						if (var5 == 1) { // L: 7677
							DecorativeObject var42 = class12.scene.method4113(class268.Client_plane, var38, var39); // L: 7678
							if (var42 != null) { // L: 7679
								var11 = WorldMapSection2.Entity_unpackID(var42.tag); // L: 7680
								if (var3 != 4 && var3 != 5) { // L: 7681
									if (var3 == 6) { // L: 7682
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane, var38, var39, var9, false, var42.renderable1);
									} else if (var3 == 7) { // L: 7683
										var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane, var38, var39, var9, false, var42.renderable1);
									} else if (var3 == 8) { // L: 7684
										var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, class268.Client_plane, var38, var39, var9, false, var42.renderable1); // L: 7685
										var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, class268.Client_plane, var38, var39, var9, false, var42.renderable2); // L: 7686
									}
								} else {
									var42.renderable1 = new DynamicObject(var11, 4, var4, class268.Client_plane, var38, var39, var9, false, var42.renderable1);
								}
							}
						}

						if (var5 == 2) { // L: 7690
							GameObject var43 = class12.scene.getGameObject(class268.Client_plane, var38, var39); // L: 7691
							if (var3 == 11) { // L: 7692
								var3 = 10;
							}

							if (var43 != null) { // L: 7693
								var43.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var43.tag), var3, var4, class268.Client_plane, var38, var39, var9, false, var43.renderable);
							}
						}

						if (var5 == 3) { // L: 7695
							GroundObject var44 = class12.scene.getGroundObject(class268.Client_plane, var38, var39); // L: 7696
							if (var44 != null) { // L: 7697
								var44.renderable = new DynamicObject(WorldMapSection2.Entity_unpackID(var44.tag), 22, var4, class268.Client_plane, var38, var39, var9, false, var44.renderable);
							}
						}
					}

				}
			}
		}
	} // L: 7450 7553 7569 7582 7609 7631 7654 7700 7702
}
