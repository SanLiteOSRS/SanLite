import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("vo")
	static List field890;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1239822321
	)
	static int field887;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 440525807
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1489507653
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1234157163
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 273873921
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1862516219
	)
	int field883;
	@ObfuscatedName("j")
	String field884;
	@ObfuscatedName("y")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12875

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	public static void method2021() {
		if (MouseHandler.KeyHandler_instance != null) { // L: 37
			synchronized(MouseHandler.KeyHandler_instance) { // L: 38
				MouseHandler.KeyHandler_instance = null; // L: 39
			} // L: 40
		}

	} // L: 42

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "([Lkn;II)V",
		garbageValue = "2081299014"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12095
			Widget var3 = var0[var2]; // L: 12096
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class6.isComponentHidden(var3))) { // L: 12097 12098 12099
				if (var3.type == 0) { // L: 12100
					if (!var3.isIf3 && class6.isComponentHidden(var3) && var3 != Occluder.mousedOverWidgetIf1) { // L: 12101
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12102
					if (var3.children != null) { // L: 12103
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12104
					if (var4 != null) { // L: 12105
						ByteArrayPool.method7164(var4.group);
					}
				}

				if (var3.type == 6) { // L: 12107
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12108
						boolean var8 = MouseHandler.runCs1(var3); // L: 12109
						if (var8) { // L: 12111
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12112
						}

						if (var5 != -1) { // L: 12113
							SequenceDefinition var6 = WorldMapElement.SequenceDefinition_get(var5); // L: 12114
							if (!var6.isCachedModelIdSet()) { // L: 12115
								for (var3.modelFrameCycle += Client.field558; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class143.invalidateWidget(var3)) { // L: 12116 12117 12124
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12118
									++var3.modelFrame; // L: 12119
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12120
										var3.modelFrame -= var6.frameCount; // L: 12121
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12122
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field558; // L: 12128
								int var7 = var6.method3876(); // L: 12129
								if (var3.modelFrame >= var7) { // L: 12130
									var3.modelFrame -= var6.frameCount; // L: 12131
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12132
										var3.modelFrame = 0;
									}
								}

								class143.invalidateWidget(var3); // L: 12134
							}
						}
					}

					if (var3.field3533 != 0 && !var3.isIf3) { // L: 12138
						int var9 = var3.field3533 >> 16; // L: 12139
						var5 = var3.field3533 << 16 >> 16; // L: 12140
						var9 *= Client.field558; // L: 12141
						var5 *= Client.field558; // L: 12142
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12143
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12144
						class143.invalidateWidget(var3); // L: 12145
					}
				}
			}
		}

	} // L: 12149

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIII)V",
		garbageValue = "-1782252068"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class355.playPcmPlayers(); // L: 12362
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12363
		if (var4 != null) { // L: 12364
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 12365
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 12366
				int var5 = Client.camAngleY & 2047; // L: 12367
				int var6 = class296.localPlayer.x / 32 + 48; // L: 12368
				int var7 = 464 - class296.localPlayer.y / 32; // L: 12369
				Calendar.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 12370

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 12371
					var16 = Client.field691[var8] * 4 + 2 - class296.localPlayer.x / 32; // L: 12372
					var10 = Client.field744[var8] * 4 + 2 - class296.localPlayer.y / 32; // L: 12373
					class277.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 12374
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 12376
					for (var16 = 0; var16 < 104; ++var16) { // L: 12377
						NodeDeque var14 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var8][var16]; // L: 12378
						if (var14 != null) { // L: 12379
							var11 = var8 * 4 + 2 - class296.localPlayer.x / 32; // L: 12380
							var12 = var16 * 4 + 2 - class296.localPlayer.y / 32; // L: 12381
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, Decimator.mapDotSprites[0], var4); // L: 12382
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 12386
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 12387
					if (var9 != null && var9.isVisible()) { // L: 12388
						NPCComposition var18 = var9.definition; // L: 12389
						if (var18 != null && var18.transforms != null) { // L: 12390
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 12391
							var11 = var9.x / 32 - class296.localPlayer.x / 32; // L: 12392
							var12 = var9.y / 32 - class296.localPlayer.y / 32; // L: 12393
							class277.drawSpriteOnMinimap(var1, var2, var11, var12, Decimator.mapDotSprites[1], var4); // L: 12394
						}
					}
				}

				var8 = Players.Players_count; // L: 12398
				int[] var17 = Players.Players_indices; // L: 12399

				for (var10 = 0; var10 < var8; ++var10) { // L: 12400
					Player var15 = Client.players[var17[var10]]; // L: 12401
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class296.localPlayer) { // L: 12402
						var12 = var15.x / 32 - class296.localPlayer.x / 32; // L: 12403
						int var13 = var15.y / 32 - class296.localPlayer.y / 32; // L: 12404
						if (var15.isFriend()) { // L: 12405
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[3], var4);
						} else if (class296.localPlayer.team != 0 && var15.team != 0 && var15.team == class296.localPlayer.team) { // L: 12406
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 12407
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 12408
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[6], var4);
						} else {
							class277.drawSpriteOnMinimap(var1, var2, var12, var13, Decimator.mapDotSprites[2], var4); // L: 12409
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 12412
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 12413
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 12414
						if (var19 != null) { // L: 12415
							var11 = var19.x / 32 - class296.localPlayer.x / 32; // L: 12416
							var12 = var19.y / 32 - class296.localPlayer.y / 32; // L: 12417
							KeyHandler.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12418
						}
					}

					if (Client.hintArrowType == 2) { // L: 12421
						var10 = Client.hintArrowX * 4 - class26.baseX * 256 + 2 - class296.localPlayer.x / 32; // L: 12422
						var11 = Client.hintArrowY * 4 - class158.baseY * 256 + 2 - class296.localPlayer.y / 32; // L: 12423
						KeyHandler.worldToMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12424
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 12426
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 12427
						if (var20 != null) { // L: 12428
							var11 = var20.x / 32 - class296.localPlayer.x / 32; // L: 12429
							var12 = var20.y / 32 - class296.localPlayer.y / 32; // L: 12430
							KeyHandler.worldToMinimap(var1, var2, var11, var12, WorldMapLabelSize.mapMarkerSprites[1], var4); // L: 12431
						}
					}
				}

				if (Client.destinationX != 0) { // L: 12435
					var10 = Client.destinationX * 4 + 2 - class296.localPlayer.x / 32; // L: 12436
					var11 = Client.destinationY * 4 + 2 - class296.localPlayer.y / 32; // L: 12437
					class277.drawSpriteOnMinimap(var1, var2, var10, var11, WorldMapLabelSize.mapMarkerSprites[0], var4); // L: 12438
				}

				if (!class296.localPlayer.isHidden) { // L: 12440
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12442
			}

			Client.field718[var3] = true; // L: 12443
		}
	} // L: 12444
}
