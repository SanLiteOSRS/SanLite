import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ry")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("o")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -142420601
	)
	@Export("world")
	public int world;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	} // L: 10

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1714284754"
	)
	static int method2907(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2332
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2333
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class192.method3904(var3) ? 1 : 0; // L: 2334
			return 1; // L: 2335
		} else if (var0 == 3501) { // L: 2337
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2338
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class193.method3908(var3) ? 1 : 0; // L: 2339
			return 1; // L: 2340
		} else if (var0 == 3502) { // L: 2342
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 2343
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class134.method2939(var3) ? 1 : 0; // L: 2344
			return 1; // L: 2345
		} else {
			return 2; // L: 2347
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ljz;B)V",
		garbageValue = "93"
	)
	static final void method2908(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 7594
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class263.field3024 == var0) { // L: 7595
			var2 = var1.method7766(); // L: 7596
			var3 = (var2 >> 4 & 7) + class326.field4097; // L: 7597
			var4 = (var2 & 7) + class10.field58; // L: 7598
			var5 = var1.method7767(); // L: 7599
			var6 = var5 >> 2; // L: 7600
			var7 = var5 & 3; // L: 7601
			var8 = Client.field556[var6]; // L: 7602
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7603
				class65.updatePendingSpawn(FriendSystem.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1); // L: 7604
			}

		} else if (class263.field3025 == var0) { // L: 7608
			var2 = var1.method7741(); // L: 7609
			var3 = var1.method7741(); // L: 7610
			var4 = var1.method7908(); // L: 7611
			var5 = (var4 >> 4 & 7) + class326.field4097; // L: 7612
			var6 = (var4 & 7) + class10.field58; // L: 7613
			var7 = var1.method7908(); // L: 7614
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7615
				var5 = var5 * 128 + 64; // L: 7616
				var6 = var6 * 128 + 64; // L: 7617
				GraphicsObject var42 = new GraphicsObject(var2, FriendSystem.Client_plane, var5, var6, SecureRandomFuture.getTileHeight(var5, var6, FriendSystem.Client_plane) - var7, var3, Client.cycle); // L: 7618
				Client.graphicsObjects.addFirst(var42); // L: 7619
			}

		} else {
			int var9;
			if (class263.field3028 == var0) { // L: 7623
				var2 = var1.method7908(); // L: 7624
				var3 = var2 >> 2; // L: 7625
				var4 = var2 & 3; // L: 7626
				var5 = Client.field556[var3]; // L: 7627
				var6 = var1.method7776(); // L: 7628
				var7 = var1.readUnsignedByte(); // L: 7629
				var8 = (var7 >> 4 & 7) + class326.field4097; // L: 7630
				var9 = (var7 & 7) + class10.field58; // L: 7631
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) { // L: 7632
					class65.updatePendingSpawn(FriendSystem.Client_plane, var8, var9, var5, var6, var3, var4, 0, -1); // L: 7633
				}

			} else {
				int var10;
				if (class263.field3022 == var0) { // L: 7637
					var2 = var1.method7767(); // L: 7638
					var3 = var1.method7774(); // L: 7639
					var4 = var1.method7767(); // L: 7640
					var5 = (var4 >> 4 & 7) + class326.field4097; // L: 7641
					var6 = (var4 & 7) + class10.field58; // L: 7642
					var7 = var1.method7767(); // L: 7643
					var8 = var7 >> 4 & 15; // L: 7644
					var9 = var7 & 7; // L: 7645
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) { // L: 7646
						var10 = var8 + 1; // L: 7647
						if (class28.localPlayer.pathX[0] >= var5 - var10 && class28.localPlayer.pathX[0] <= var5 + var10 && class28.localPlayer.pathY[0] >= var6 - var10 && class28.localPlayer.pathY[0] <= var6 + var10 && class260.clientPreferences.method2329() != 0 && var9 > 0 && Client.soundEffectCount < 50) { // L: 7648 7649
							Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 7650
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9; // L: 7651
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 7652
							Client.soundEffects[Client.soundEffectCount] = null; // L: 7653
							Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16); // L: 7654
							++Client.soundEffectCount; // L: 7655
						}
					}
				}

				TileItem var33;
				if (class263.field3021 == var0) { // L: 7660
					var2 = var1.readUnsignedShort(); // L: 7661
					var3 = var1.method7766(); // L: 7662
					var4 = (var3 >> 4 & 7) + class326.field4097; // L: 7663
					var5 = (var3 & 7) + class10.field58; // L: 7664
					var6 = var1.method7741(); // L: 7665
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 7666
						var33 = new TileItem(); // L: 7667
						var33.id = var6; // L: 7668
						var33.quantity = var2; // L: 7669
						if (Client.groundItems[FriendSystem.Client_plane][var4][var5] == null) { // L: 7670
							Client.groundItems[FriendSystem.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[FriendSystem.Client_plane][var4][var5].addFirst(var33); // L: 7671
						WorldMapManager.updateItemPile(var4, var5); // L: 7672
					}

				} else {
					int var11;
					if (class263.field3027 == var0) { // L: 7676
						var2 = var1.method7766(); // L: 7677
						var3 = var2 >> 2; // L: 7678
						var4 = var2 & 3; // L: 7679
						var5 = Client.field556[var3]; // L: 7680
						var6 = var1.readUnsignedByte(); // L: 7681
						var7 = (var6 >> 4 & 7) + class326.field4097; // L: 7682
						var8 = (var6 & 7) + class10.field58; // L: 7683
						var9 = var1.method7741(); // L: 7684
						if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7685
							if (var5 == 0) { // L: 7686
								WallObject var36 = Decimator.scene.method4129(FriendSystem.Client_plane, var7, var8); // L: 7687
								if (var36 != null) { // L: 7688
									var11 = class141.Entity_unpackID(var36.tag); // L: 7689
									if (var3 == 2) { // L: 7690
										var36.renderable1 = new DynamicObject(var11, 2, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable1); // L: 7691
										var36.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable2); // L: 7692
									} else {
										var36.renderable1 = new DynamicObject(var11, var3, var4, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable1); // L: 7694
									}
								}
							}

							if (var5 == 1) { // L: 7697
								DecorativeObject var43 = Decimator.scene.method4130(FriendSystem.Client_plane, var7, var8); // L: 7698
								if (var43 != null) { // L: 7699
									var11 = class141.Entity_unpackID(var43.tag); // L: 7700
									if (var3 != 4 && var3 != 5) { // L: 7701
										if (var3 == 6) { // L: 7702
											var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable1);
										} else if (var3 == 7) { // L: 7703
											var43.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable1);
										} else if (var3 == 8) { // L: 7704
											var43.renderable1 = new DynamicObject(var11, 4, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable1); // L: 7705
											var43.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable2); // L: 7706
										}
									} else {
										var43.renderable1 = new DynamicObject(var11, 4, var4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable1);
									}
								}
							}

							if (var5 == 2) { // L: 7710
								GameObject var44 = Decimator.scene.getGameObject(FriendSystem.Client_plane, var7, var8); // L: 7711
								if (var3 == 11) { // L: 7712
									var3 = 10;
								}

								if (var44 != null) { // L: 7713
									var44.renderable = new DynamicObject(class141.Entity_unpackID(var44.tag), var3, var4, FriendSystem.Client_plane, var7, var8, var9, false, var44.renderable);
								}
							}

							if (var5 == 3) { // L: 7715
								GroundObject var45 = Decimator.scene.getGroundObject(FriendSystem.Client_plane, var7, var8); // L: 7716
								if (var45 != null) { // L: 7717
									var45.renderable = new DynamicObject(class141.Entity_unpackID(var45.tag), 22, var4, FriendSystem.Client_plane, var7, var8, var9, false, var45.renderable);
								}
							}
						}

					} else {
						int var12;
						int var13;
						byte var38;
						if (class263.field3020 == var0) { // L: 7722
							var2 = var1.method7908(); // L: 7723
							var3 = (var2 >> 4 & 7) + class326.field4097; // L: 7724
							var4 = (var2 & 7) + class10.field58; // L: 7725
							var5 = var1.method7776(); // L: 7726
							byte var37 = var1.method7743(); // L: 7727
							var38 = var1.readByte(); // L: 7728
							byte var39 = var1.method7768(); // L: 7729
							var9 = var1.method7741(); // L: 7730
							var10 = var1.method7766(); // L: 7731
							var11 = var10 >> 2; // L: 7732
							var12 = var10 & 3; // L: 7733
							var13 = Client.field556[var11]; // L: 7734
							byte var14 = var1.readByte(); // L: 7735
							int var15 = var1.method7741(); // L: 7736
							int var16 = var1.method7774(); // L: 7737
							Player var17;
							if (var16 == Client.localPlayerIndex) { // L: 7739
								var17 = class28.localPlayer;
							} else {
								var17 = Client.players[var16]; // L: 7740
							}

							if (var17 != null) { // L: 7741
								ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var9); // L: 7742
								int var19;
								int var20;
								if (var12 != 1 && var12 != 3) { // L: 7745
									var19 = var18.sizeX; // L: 7750
									var20 = var18.sizeY; // L: 7751
								} else {
									var19 = var18.sizeY; // L: 7746
									var20 = var18.sizeX; // L: 7747
								}

								int var21 = var3 + (var19 >> 1); // L: 7753
								int var22 = var3 + (var19 + 1 >> 1); // L: 7754
								int var23 = var4 + (var20 >> 1); // L: 7755
								int var24 = var4 + (var20 + 1 >> 1); // L: 7756
								int[][] var25 = Tiles.Tiles_heights[FriendSystem.Client_plane]; // L: 7757
								int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2; // L: 7758
								int var27 = (var3 << 7) + (var19 << 6); // L: 7759
								int var28 = (var4 << 7) + (var20 << 6); // L: 7760
								Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28); // L: 7761
								if (var29 != null) { // L: 7762
									class65.updatePendingSpawn(FriendSystem.Client_plane, var3, var4, var13, -1, 0, 0, var15 + 1, var5 + 1); // L: 7763
									var17.animationCycleStart = var15 + Client.cycle; // L: 7764
									var17.animationCycleEnd = var5 + Client.cycle; // L: 7765
									var17.model0 = var29; // L: 7766
									var17.field1095 = var3 * 128 + var19 * 64; // L: 7767
									var17.field1097 = var4 * 128 + var20 * 64; // L: 7768
									var17.tileHeight2 = var26; // L: 7769
									byte var30;
									if (var39 > var38) { // L: 7770
										var30 = var39; // L: 7771
										var39 = var38; // L: 7772
										var38 = var30; // L: 7773
									}

									if (var14 > var37) { // L: 7775
										var30 = var14; // L: 7776
										var14 = var37; // L: 7777
										var37 = var30; // L: 7778
									}

									var17.minX = var39 + var3; // L: 7780
									var17.maxX = var38 + var3; // L: 7781
									var17.minY = var14 + var4; // L: 7782
									var17.maxY = var4 + var37; // L: 7783
								}
							}
						}

						if (class263.field3019 == var0) { // L: 7787
							var2 = var1.method7766(); // L: 7788
							var3 = (var2 >> 4 & 7) + class326.field4097; // L: 7789
							var4 = (var2 & 7) + class10.field58; // L: 7790
							var5 = var1.method7741(); // L: 7791
							var6 = var1.method7774(); // L: 7792
							var7 = var1.method7776(); // L: 7793
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7794
								NodeDeque var34 = Client.groundItems[FriendSystem.Client_plane][var3][var4]; // L: 7795
								if (var34 != null) { // L: 7796
									for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) { // L: 7797 7798 7803
										if ((var6 & 32767) == var35.id && var5 == var35.quantity) { // L: 7799
											var35.quantity = var7; // L: 7800
											break;
										}
									}

									WorldMapManager.updateItemPile(var3, var4); // L: 7805
								}
							}

						} else if (class263.field3026 != var0) { // L: 7810
							if (class263.field3023 == var0) { // L: 7832
								var2 = var1.method7767(); // L: 7833
								var3 = var1.method7908(); // L: 7834
								var4 = (var3 >> 4 & 7) + class326.field4097; // L: 7835
								var5 = (var3 & 7) + class10.field58; // L: 7836
								var6 = var1.method7908() * 4; // L: 7837
								var38 = var1.readByte(); // L: 7838
								var8 = var1.method7776(); // L: 7839
								byte var40 = var1.method7743(); // L: 7840
								var10 = var1.readUnsignedByte(); // L: 7841
								var11 = var1.method7766() * 4; // L: 7842
								var12 = var1.method7741(); // L: 7843
								var13 = var1.method7776(); // L: 7844
								int var41 = var1.method7742(); // L: 7845
								var9 = var40 + var4; // L: 7846
								var7 = var38 + var5; // L: 7847
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var9 >= 0 && var7 >= 0 && var9 < 104 && var7 < 104 && var12 != 65535) { // L: 7848
									var4 = var4 * 128 + 64; // L: 7849
									var5 = var5 * 128 + 64; // L: 7850
									var9 = var9 * 128 + 64; // L: 7851
									var7 = var7 * 128 + 64; // L: 7852
									Projectile var31 = new Projectile(var12, FriendSystem.Client_plane, var4, var5, SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - var11, var8 + Client.cycle, var13 + Client.cycle, var10, var2, var41, var6); // L: 7853
									var31.setDestination(var9, var7, SecureRandomFuture.getTileHeight(var9, var7, FriendSystem.Client_plane) - var6, var8 + Client.cycle); // L: 7854
									Client.projectiles.addFirst(var31); // L: 7855
								}

							}
						} else {
							var2 = var1.readUnsignedByte(); // L: 7811
							var3 = (var2 >> 4 & 7) + class326.field4097; // L: 7812
							var4 = (var2 & 7) + class10.field58; // L: 7813
							var5 = var1.method7741(); // L: 7814
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 7815
								NodeDeque var32 = Client.groundItems[FriendSystem.Client_plane][var3][var4]; // L: 7816
								if (var32 != null) { // L: 7817
									for (var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) { // L: 7818 7819 7824
										if ((var5 & 32767) == var33.id) { // L: 7820
											var33.remove(); // L: 7821
											break;
										}
									}

									if (var32.last() == null) { // L: 7826
										Client.groundItems[FriendSystem.Client_plane][var3][var4] = null;
									}

									WorldMapManager.updateItemPile(var3, var4); // L: 7827
								}
							}

						}
					}
				}
			}
		}
	} // L: 7606 7621 7635 7674 7720 7808 7830 7857 7859

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "102639413"
	)
	static String method2906(int var0) {
		if (var0 < 0) { // L: 9590
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9591 9592
		}
	}
}
