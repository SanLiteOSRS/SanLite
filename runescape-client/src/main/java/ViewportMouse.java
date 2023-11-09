import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("o")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1258022703
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -864705353
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("u")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -969610827
	)
	static int field2587;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1888655975
	)
	static int field2580;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 919199359
	)
	static int field2586;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 109490241
	)
	static int field2583;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1680997135
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("p")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-165029587"
	)
	static final void method4487(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9571
			if (Client.menuOptionsCount < 500) { // L: 9572
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9573
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9574
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9575
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9576
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9577
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9578
				Client.field638[Client.menuOptionsCount] = var6; // L: 9579
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9580
				++Client.menuOptionsCount; // L: 9581
			}

		}
	} // L: 9583

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "18"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9596
			StructComposition.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9597
		}

		long var4 = -1L; // L: 9600
		long var6 = -1L; // L: 9601

		int var8;
		for (var8 = 0; var8 < InterfaceParent.method2160(); ++var8) { // L: 9602
			long var22 = Tiles.method2115(var8); // L: 9603
			if (var22 != var6) { // L: 9604
				var6 = var22; // L: 9605
				int var24 = ItemComposition.method3764(var8); // L: 9606
				int var12 = class17.method263(ViewportMouse_entityTags[var8]); // L: 9609
				int var13 = var12; // L: 9611
				int var14 = class128.method2897(var8); // L: 9612
				int var15 = class82.method2179(var8); // L: 9613
				if (var14 == 2 && Decimator.scene.getObjectFlags(FriendSystem.Client_plane, var24, var12, var22) >= 0) { // L: 9614 9615
					ObjectComposition var16 = WorldMapDecoration.getObjectDefinition(var15); // L: 9616
					if (var16.transforms != null) { // L: 9617
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 9618
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9619
						StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(65535) + var16.name, 1, var15, var24, var12); // L: 9620
					} else if (Client.isSpellSelected) { // L: 9623
						if ((Coord.selectedSpellFlags & 4) == 4) { // L: 9624
							StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(65535) + var16.name, 2, var15, var24, var12); // L: 9625
						}
					} else {
						String[] var17 = var16.actions; // L: 9630
						if (var17 != null) { // L: 9631
							for (int var18 = 4; var18 >= 0; --var18) { // L: 9632
								if (var17[var18] != null) { // L: 9633
									short var19 = 0; // L: 9634
									if (var18 == 0) { // L: 9635
										var19 = 3;
									}

									if (var18 == 1) { // L: 9636
										var19 = 4;
									}

									if (var18 == 2) { // L: 9637
										var19 = 5;
									}

									if (var18 == 3) { // L: 9638
										var19 = 6;
									}

									if (var18 == 4) { // L: 9639
										var19 = 1001;
									}

									StructComposition.insertMenuItemNoShift(var17[var18], class82.colorStartTag(65535) + var16.name, var19, var15, var24, var13); // L: 9640
								}
							}
						}

						StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(65535) + var16.name, 1002, var16.id, var24, var13); // L: 9645
					}
				}

				Player var20;
				int var25;
				NPC var26;
				int var33;
				int[] var34;
				if (var14 == 1) { // L: 9650
					NPC var29 = Client.npcs[var15]; // L: 9651
					if (var29 == null) { // L: 9652
						continue;
					}

					if (var29.definition.size == 1 && (var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 9653
						for (var25 = 0; var25 < Client.npcCount; ++var25) { // L: 9654
							var26 = Client.npcs[Client.npcIndices[var25]]; // L: 9655
							if (var26 != null && var29 != var26 && var26.definition.size == 1 && var29.x == var26.x && var29.y == var26.y) { // L: 9656
								WorldMapIcon_0.addNpcToMenu(var26, Client.npcIndices[var25], var24, var13);
							}
						}

						var25 = Players.Players_count; // L: 9658
						var34 = Players.Players_indices; // L: 9659

						for (var33 = 0; var33 < var25; ++var33) { // L: 9660
							var20 = Client.players[var34[var33]]; // L: 9661
							if (var20 != null && var29.x == var20.x && var20.y == var29.y) { // L: 9662
								Script.addPlayerToMenu(var20, var34[var33], var24, var13);
							}
						}
					}

					WorldMapIcon_0.addNpcToMenu(var29, var15, var24, var13); // L: 9665
				}

				if (var14 == 0) { // L: 9667
					Player var30 = Client.players[var15]; // L: 9668
					if (var30 == null) { // L: 9669
						continue;
					}

					if ((var30.x & 127) == 64 && (var30.y & 127) == 64) { // L: 9670
						for (var25 = 0; var25 < Client.npcCount; ++var25) { // L: 9671
							var26 = Client.npcs[Client.npcIndices[var25]]; // L: 9672
							if (var26 != null && var26.definition.size == 1 && var30.x == var26.x && var26.y == var30.y) { // L: 9673
								WorldMapIcon_0.addNpcToMenu(var26, Client.npcIndices[var25], var24, var13);
							}
						}

						var25 = Players.Players_count; // L: 9675
						var34 = Players.Players_indices; // L: 9676

						for (var33 = 0; var33 < var25; ++var33) { // L: 9677
							var20 = Client.players[var34[var33]]; // L: 9678
							if (var20 != null && var20 != var30 && var20.x == var30.x && var30.y == var20.y) {
								Script.addPlayerToMenu(var20, var34[var33], var24, var13); // L: 9679
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) { // L: 9682
						Script.addPlayerToMenu(var30, var15, var24, var13);
					} else {
						var4 = var22; // L: 9683
					}
				}

				if (var14 == 3) { // L: 9685
					NodeDeque var32 = Client.groundItems[FriendSystem.Client_plane][var24][var13]; // L: 9686
					if (var32 != null) { // L: 9687
						for (TileItem var31 = (TileItem)var32.first(); var31 != null; var31 = (TileItem)var32.next()) { // L: 9688 9689 9722
							ItemComposition var35 = class258.ItemComposition_get(var31.id); // L: 9690
							if (Client.isItemSelected == 1) { // L: 9691
								StructComposition.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class82.colorStartTag(16748608) + var35.name, 16, var31.id, var24, var13); // L: 9692
							} else if (Client.isSpellSelected) { // L: 9695
								if ((Coord.selectedSpellFlags & 1) == 1) { // L: 9696
									StructComposition.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class82.colorStartTag(16748608) + var35.name, 17, var31.id, var24, var13); // L: 9697
								}
							} else {
								String[] var27 = var35.groundActions; // L: 9702

								for (int var28 = 4; var28 >= 0; --var28) { // L: 9703
									if (var27 != null && var27[var28] != null) { // L: 9704
										byte var21 = 0; // L: 9705
										if (var28 == 0) { // L: 9706
											var21 = 18;
										}

										if (var28 == 1) { // L: 9707
											var21 = 19;
										}

										if (var28 == 2) { // L: 9708
											var21 = 20;
										}

										if (var28 == 3) { // L: 9709
											var21 = 21;
										}

										if (var28 == 4) { // L: 9710
											var21 = 22;
										}

										StructComposition.insertMenuItemNoShift(var27[var28], class82.colorStartTag(16748608) + var35.name, var21, var31.id, var24, var13); // L: 9711
									} else if (var28 == 2) { // L: 9714
										StructComposition.insertMenuItemNoShift("Take", class82.colorStartTag(16748608) + var35.name, 20, var31.id, var24, var13); // L: 9715
									}
								}

								StructComposition.insertMenuItemNoShift("Examine", class82.colorStartTag(16748608) + var35.name, 1004, var31.id, var24, var13); // L: 9719
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9727
			var8 = (int)(var4 >>> 0 & 127L); // L: 9730
			int var10 = class17.method263(var4); // L: 9733
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 9734
			Script.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 9735
		}

	} // L: 9737

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIII)V",
		garbageValue = "-2140670217"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class12.playPcmPlayers(); // L: 12038
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12039
		if (var4 != null) { // L: 12040
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12041
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12042
				int var5 = Client.camAngleY & 2047; // L: 12043
				int var6 = class28.localPlayer.x / 32 + 48; // L: 12044
				int var7 = 464 - class28.localPlayer.y / 32; // L: 12045
				SceneTilePaint.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12046

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12047
					var16 = Client.mapIconXs[var8] * 4 + 2 - class28.localPlayer.x / 32; // L: 12048
					var10 = Client.mapIconYs[var8] * 4 + 2 - class28.localPlayer.y / 32; // L: 12049
					Canvas.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12050
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12052
					for (var16 = 0; var16 < 104; ++var16) { // L: 12053
						NodeDeque var14 = Client.groundItems[FriendSystem.Client_plane][var8][var16]; // L: 12054
						if (var14 != null) { // L: 12055
							var11 = var8 * 4 + 2 - class28.localPlayer.x / 32; // L: 12056
							var12 = var16 * 4 + 2 - class28.localPlayer.y / 32; // L: 12057
							Canvas.drawSpriteOnMinimap(var1, var2, var11, var12, class65.mapDotSprites[0], var4); // L: 12058
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12062
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12063
					if (var9 != null && var9.isVisible()) { // L: 12064
						NPCComposition var18 = var9.definition; // L: 12065
						if (var18 != null && var18.transforms != null) { // L: 12066
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12067
							var11 = var9.x / 32 - class28.localPlayer.x / 32; // L: 12068
							var12 = var9.y / 32 - class28.localPlayer.y / 32; // L: 12069
							Canvas.drawSpriteOnMinimap(var1, var2, var11, var12, class65.mapDotSprites[1], var4); // L: 12070
						}
					}
				}

				var8 = Players.Players_count; // L: 12074
				int[] var17 = Players.Players_indices; // L: 12075

				for (var10 = 0; var10 < var8; ++var10) { // L: 12076
					Player var15 = Client.players[var17[var10]]; // L: 12077
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class28.localPlayer) { // L: 12078
						var12 = var15.x / 32 - class28.localPlayer.x / 32; // L: 12079
						int var13 = var15.y / 32 - class28.localPlayer.y / 32; // L: 12080
						if (var15.isFriend()) { // L: 12081
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[3], var4);
						} else if (class28.localPlayer.team != 0 && var15.team != 0 && var15.team == class28.localPlayer.team) { // L: 12082
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12083
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12084
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[6], var4);
						} else {
							Canvas.drawSpriteOnMinimap(var1, var2, var12, var13, class65.mapDotSprites[2], var4); // L: 12085
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12088
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12089
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12090
						if (var19 != null) { // L: 12091
							var11 = var19.x / 32 - class28.localPlayer.x / 32; // L: 12092
							var12 = var19.y / 32 - class28.localPlayer.y / 32; // L: 12093
							WorldMapSection2.worldToMinimap(var1, var2, var11, var12, WorldMapSection2.mapMarkerSprites[1], var4); // L: 12094
						}
					}

					if (Client.hintArrowType == 2) { // L: 12097
						var10 = Client.hintArrowX * 4 - class300.baseX * 256 + 2 - class28.localPlayer.x / 32; // L: 12098
						var11 = Client.hintArrowY * 4 - Message.baseY * 256 + 2 - class28.localPlayer.y / 32; // L: 12099
						WorldMapSection2.worldToMinimap(var1, var2, var10, var11, WorldMapSection2.mapMarkerSprites[1], var4); // L: 12100
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12102
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12103
						if (var20 != null) { // L: 12104
							var11 = var20.x / 32 - class28.localPlayer.x / 32; // L: 12105
							var12 = var20.y / 32 - class28.localPlayer.y / 32; // L: 12106
							WorldMapSection2.worldToMinimap(var1, var2, var11, var12, WorldMapSection2.mapMarkerSprites[1], var4); // L: 12107
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12111
					var10 = Client.destinationX * 4 + 2 - class28.localPlayer.x / 32; // L: 12112
					var11 = Client.destinationY * 4 + 2 - class28.localPlayer.y / 32; // L: 12113
					Canvas.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapSection2.mapMarkerSprites[0], var4); // L: 12114
				}

				if (!class28.localPlayer.isHidden) { // L: 12116
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12118
			}

			Client.field691[var3] = true; // L: 12119
		}
	} // L: 12120
}
