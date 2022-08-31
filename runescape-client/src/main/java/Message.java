import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 416329001
	)
	@Export("count")
	int count;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1438497145
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1486723785
	)
	@Export("type")
	int type;
	@ObfuscatedName("v")
	@Export("sender")
	String sender;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("k")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("o")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 13
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 14
		this.set(var1, var2, var3, var4); // L: 19
	} // L: 20

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-865547233"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = Tiles.method1973(); // L: 23
		this.cycle = Client.cycle; // L: 24
		this.type = var1; // L: 25
		this.sender = var2; // L: 26
		this.fillSenderUsername(); // L: 27
		this.prefix = var3; // L: 28
		this.text = var4; // L: 29
		this.clearIsFromFriend(); // L: 30
		this.clearIsFromIgnored(); // L: 31
	} // L: 32

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown; // L: 35
	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) { // L: 39
			this.fillIsFromFriend(); // L: 40
		}

		return this.isFromFriend0 == TriBool.TriBool_true; // L: 42
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class321.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 46
	} // L: 47

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-28"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown; // L: 50
	} // L: 51

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "324"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) { // L: 54
			this.fillIsFromIgnored(); // L: 55
		}

		return this.isFromIgnored0 == TriBool.TriBool_true; // L: 57
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-631698220"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class321.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 61
	} // L: 62

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796016513"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(WorldMapSection0.method4870(this.sender), StructComposition.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "896718913"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "791659901"
	)
	static IndexedSprite method1044() {
		IndexedSprite var0 = new IndexedSprite(); // L: 192
		var0.width = class457.SpriteBuffer_spriteWidth; // L: 193
		var0.height = class457.SpriteBuffer_spriteHeight; // L: 194
		var0.xOffset = class457.SpriteBuffer_xOffsets[0]; // L: 195
		var0.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0]; // L: 196
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0]; // L: 197
		var0.subHeight = SoundCache.SpriteBuffer_spriteHeights[0]; // L: 198
		var0.palette = class457.SpriteBuffer_spritePalette; // L: 199
		var0.pixels = class181.SpriteBuffer_pixels[0]; // L: 200
		class457.SpriteBuffer_xOffsets = null; // L: 202
		InterfaceParent.SpriteBuffer_yOffsets = null; // L: 203
		class457.SpriteBuffer_spriteWidths = null; // L: 204
		SoundCache.SpriteBuffer_spriteHeights = null; // L: 205
		class457.SpriteBuffer_spritePalette = null; // L: 206
		class181.SpriteBuffer_pixels = null; // L: 207
		return var0; // L: 209
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1955729170"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4475
		class352.method6437(); // L: 4476
		if (Client.renderSelf) { // L: 4478
			class9.addPlayerToScene(ScriptFrame.localPlayer, false); // L: 4479
		}

		class347.method6250(); // L: 4482
		class132.addNpcsToScene(true); // L: 4483
		PcmPlayer.method689(); // L: 4484
		class132.addNpcsToScene(false); // L: 4485

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4487 4488 4505
			if (var4.plane == class268.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4489
				if (Client.cycle >= var4.cycleStart) { // L: 4490
					if (var4.targetIndex > 0) { // L: 4491
						NPC var37 = Client.npcs[var4.targetIndex - 1]; // L: 4492
						if (var37 != null && var37.x >= 0 && var37.x < 13312 && var37.y >= 0 && var37.y < 13312) { // L: 4493
							var4.setDestination(var37.x, var37.y, ObjectComposition.getTileHeight(var37.x, var37.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4495
						var6 = -var4.targetIndex - 1; // L: 4497
						Player var40;
						if (var6 == Client.localPlayerIndex) { // L: 4498
							var40 = ScriptFrame.localPlayer;
						} else {
							var40 = Client.players[var6]; // L: 4499
						}

						if (var40 != null && var40.x >= 0 && var40.x < 13312 && var40.y >= 0 && var40.y < 13312) { // L: 4500
							var4.setDestination(var40.x, var40.y, ObjectComposition.getTileHeight(var40.x, var40.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field599); // L: 4502
					class12.scene.drawEntity(class268.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4503
				}
			} else {
				var4.remove();
			}
		}

		for (GraphicsObject var38 = (GraphicsObject)Client.graphicsObjects.last(); var38 != null; var38 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4509 4510 4517
			if (var38.plane == class268.Client_plane && !var38.isFinished) { // L: 4511
				if (Client.cycle >= var38.cycleStart) { // L: 4512
					var38.advance(Client.field599); // L: 4513
					if (var38.isFinished) { // L: 4514
						var38.remove();
					} else {
						class12.scene.drawEntity(var38.plane, var38.x, var38.y, var38.z, 60, var38, 0, -1L, false); // L: 4515
					}
				}
			} else {
				var38.remove();
			}
		}

		class134.setViewportShape(var0, var1, var2, var3, true); // L: 4520
		var0 = Client.viewportOffsetX; // L: 4521
		var1 = Client.viewportOffsetY; // L: 4522
		var2 = Client.viewportWidth; // L: 4523
		var3 = Client.viewportHeight; // L: 4524
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4525
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4526
		int var34 = Client.camAngleX; // L: 4527
		if (Client.field658 / 256 > var34) { // L: 4528
			var34 = Client.field658 / 256;
		}

		if (Client.field738[4] && Client.field740[4] + 128 > var34) { // L: 4529
			var34 = Client.field740[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4530
		var6 = FloorOverlayDefinition.oculusOrbFocalPointX; // L: 4531
		int var7 = EnumComposition.field1891; // L: 4532
		int var8 = AbstractUserComparator.oculusOrbFocalPointY; // L: 4533
		int var9 = HealthBarUpdate.method2170(var34); // L: 4534
		var9 = World.method1624(var9, var3); // L: 4536
		int var10 = 2048 - var34 & 2047; // L: 4537
		int var11 = 2048 - var5 & 2047; // L: 4538
		int var12 = 0; // L: 4539
		int var13 = 0; // L: 4540
		int var14 = var9; // L: 4541
		int var15;
		int var16;
		int var17;
		if (var10 != 0) { // L: 4542
			var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4543
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4544
			var17 = var16 * var13 - var9 * var15 >> 16; // L: 4545
			var14 = var16 * var9 + var15 * var13 >> 16; // L: 4546
			var13 = var17; // L: 4547
		}

		if (var11 != 0) { // L: 4549
			var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4550
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4551
			var17 = var15 * var14 + var16 * var12 >> 16; // L: 4552
			var14 = var16 * var14 - var15 * var12 >> 16; // L: 4553
			var12 = var17; // L: 4554
		}

		if (Client.isCameraLocked) { // L: 4556
			SoundCache.field323 = var6 - var12; // L: 4557
			class402.field4448 = var7 - var13; // L: 4558
			NetCache.field4039 = var8 - var14; // L: 4559
			ItemContainer.field1003 = var34; // L: 4560
			class291.field3324 = var5; // L: 4561
		} else {
			class16.cameraX = var6 - var12; // L: 4564
			WorldMapLabel.cameraY = var7 - var13; // L: 4565
			class269.cameraZ = var8 - var14; // L: 4566
			class82.cameraPitch = var34; // L: 4567
			ClientPreferences.cameraYaw = var5; // L: 4568
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (FloorOverlayDefinition.oculusOrbFocalPointX >> 7 != ScriptFrame.localPlayer.x >> 7 || AbstractUserComparator.oculusOrbFocalPointY >> 7 != ScriptFrame.localPlayer.y >> 7)) { // L: 4570 4571
			var15 = ScriptFrame.localPlayer.plane; // L: 4572
			var16 = Decimator.baseX * 64 + (FloorOverlayDefinition.oculusOrbFocalPointX >> 7); // L: 4573
			var17 = class7.baseY * 64 + (AbstractUserComparator.oculusOrbFocalPointY >> 7); // L: 4574
			class9.method79(var16, var17, var15, true); // L: 4575
		}

		if (!Client.isCameraLocked) { // L: 4580
			var10 = class116.method2682();
		} else {
			var10 = class133.method2846(); // L: 4581
		}

		var11 = class16.cameraX; // L: 4582
		var12 = WorldMapLabel.cameraY; // L: 4583
		var13 = class269.cameraZ; // L: 4584
		var14 = class82.cameraPitch; // L: 4585
		var15 = ClientPreferences.cameraYaw; // L: 4586

		for (var16 = 0; var16 < 5; ++var16) { // L: 4587
			if (Client.field738[var16]) { // L: 4588
				var17 = (int)(Math.random() * (double)(Client.field739[var16] * 2 + 1) - (double)Client.field739[var16] + Math.sin((double)Client.field615[var16] * ((double)Client.field758[var16] / 100.0D)) * (double)Client.field740[var16]); // L: 4589
				if (var16 == 0) { // L: 4590
					class16.cameraX += var17;
				}

				if (var16 == 1) { // L: 4591
					WorldMapLabel.cameraY += var17;
				}

				if (var16 == 2) { // L: 4592
					class269.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4593
					ClientPreferences.cameraYaw = var17 + ClientPreferences.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4594
					class82.cameraPitch += var17; // L: 4595
					if (class82.cameraPitch < 128) { // L: 4596
						class82.cameraPitch = 128;
					}

					if (class82.cameraPitch > 383) { // L: 4597
						class82.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4601
		var17 = MouseHandler.MouseHandler_y; // L: 4602
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4603
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4604
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4605
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4607
			class342.method6200(var16 - var0, var17 - var1); // L: 4608
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4612
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4613
		}

		class83.playPcmPlayers(); // L: 4616
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4617
		class83.playPcmPlayers(); // L: 4618
		int var18 = Rasterizer3D.Rasterizer3D_zoom; // L: 4619
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4620
		class12.scene.draw(class16.cameraX, WorldMapLabel.cameraY, class269.cameraZ, class82.cameraPitch, ClientPreferences.cameraYaw, var10); // L: 4621
		Rasterizer3D.Rasterizer3D_zoom = var18; // L: 4622
		class83.playPcmPlayers(); // L: 4623
		class12.scene.clearTempGameObjects(); // L: 4624
		Client.overheadTextCount = 0; // L: 4626
		boolean var19 = false; // L: 4627
		int var20 = -1; // L: 4628
		int var21 = -1; // L: 4629
		int var22 = Players.Players_count; // L: 4630
		int[] var23 = Players.Players_indices; // L: 4631

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) { // L: 4632
			Object var36;
			if (var24 < var22) { // L: 4634
				var36 = Client.players[var23[var24]]; // L: 4635
				if (var23[var24] == Client.combatTargetPlayerIndex) { // L: 4636
					var19 = true; // L: 4637
					var20 = var24; // L: 4638
					continue;
				}

				if (var36 == ScriptFrame.localPlayer) { // L: 4641
					var21 = var24; // L: 4642
					continue; // L: 4643
				}
			} else {
				var36 = Client.npcs[Client.npcIndices[var24 - var22]]; // L: 4646
			}

			TileItem.drawActor2d((Actor)var36, var24, var0, var1, var2, var3); // L: 4647
		}

		if (Client.renderSelf && var21 != -1) { // L: 4649
			TileItem.drawActor2d(ScriptFrame.localPlayer, var21, var0, var1, var2, var3); // L: 4650
		}

		if (var19) { // L: 4652
			TileItem.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3); // L: 4653
		}

		for (var24 = 0; var24 < Client.overheadTextCount; ++var24) { // L: 4655
			int var25 = Client.overheadTextXs[var24]; // L: 4656
			int var26 = Client.overheadTextYs[var24]; // L: 4657
			int var27 = Client.overheadTextXOffsets[var24]; // L: 4658
			int var28 = Client.overheadTextAscents[var24]; // L: 4659
			boolean var29 = true; // L: 4660

			while (var29) {
				var29 = false; // L: 4662

				for (int var35 = 0; var35 < var24; ++var35) { // L: 4663
					if (var26 + 2 > Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] && var26 - var28 < Client.overheadTextYs[var35] + 2 && var25 - var27 < Client.overheadTextXs[var35] + Client.overheadTextXOffsets[var35] && var25 + var27 > Client.overheadTextXs[var35] - Client.overheadTextXOffsets[var35] && Client.overheadTextYs[var35] - Client.overheadTextAscents[var35] < var26) { // L: 4664 4665
						var26 = Client.overheadTextYs[var35] - Client.overheadTextAscents[var35]; // L: 4666
						var29 = true; // L: 4667
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var24]; // L: 4672
			Client.viewportTempY = Client.overheadTextYs[var24] = var26; // L: 4673
			String var30 = Client.overheadText[var24]; // L: 4674
			if (Client.chatEffects == 0) { // L: 4675
				int var31 = 16776960; // L: 4676
				if (Client.overheadTextColors[var24] < 6) { // L: 4677
					var31 = Client.field768[Client.overheadTextColors[var24]];
				}

				if (Client.overheadTextColors[var24] == 6) { // L: 4678
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var24] == 7) { // L: 4679
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var24] == 8) { // L: 4680
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.overheadTextColors[var24] == 9) { // L: 4681
					var32 = 150 - Client.overheadTextCyclesRemaining[var24]; // L: 4682
					if (var32 < 50) { // L: 4683
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) { // L: 4684
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4685
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var24] == 10) { // L: 4687
					var32 = 150 - Client.overheadTextCyclesRemaining[var24]; // L: 4688
					if (var32 < 50) { // L: 4689
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) { // L: 4690
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4691
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var24] == 11) { // L: 4693
					var32 = 150 - Client.overheadTextCyclesRemaining[var24]; // L: 4694
					if (var32 < 50) { // L: 4695
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) { // L: 4696
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) { // L: 4697
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var24] == 0) { // L: 4699
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0);
				}

				if (Client.overheadTextEffects[var24] == 1) { // L: 4700
					WorldMapSection2.fontBold12.drawCenteredWave(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var24] == 2) { // L: 4701
					WorldMapSection2.fontBold12.drawCenteredWave2(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var24] == 3) { // L: 4702
					WorldMapSection2.fontBold12.drawCenteredShake(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var24]);
				}

				if (Client.overheadTextEffects[var24] == 4) { // L: 4703
					var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (WorldMapSection2.fontBold12.stringWidth(var30) + 100) / 150; // L: 4704
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4705
					WorldMapSection2.fontBold12.draw(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0); // L: 4706
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4707
				}

				if (Client.overheadTextEffects[var24] == 5) { // L: 4709
					var32 = 150 - Client.overheadTextCyclesRemaining[var24]; // L: 4710
					int var33 = 0; // L: 4711
					if (var32 < 25) { // L: 4712
						var33 = var32 - 25;
					} else if (var32 > 125) { // L: 4713
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - WorldMapSection2.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4714
					WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0); // L: 4715
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4716
				}
			} else {
				WorldMapSection2.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4720
			}
		}

		UserComparator6.method2611(var0, var1); // L: 4724
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field599); // L: 4725
		class301.method5663(var0, var1, var2, var3); // L: 4726
		class16.cameraX = var11; // L: 4727
		WorldMapLabel.cameraY = var12; // L: 4728
		class269.cameraZ = var13; // L: 4729
		class82.cameraPitch = var14; // L: 4730
		ClientPreferences.cameraYaw = var15; // L: 4731
		if (Client.isLoading) { // L: 4732
			byte var39 = 0; // L: 4735
			var20 = var39 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 4736
			if (var20 == 0) { // L: 4740
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4742
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4743
			class20.drawLoadingMessage("Loading - please wait.", false); // L: 4744
		}

	} // L: 4746

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "2050182663"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ParamComposition.loadInterface(var0)) { // L: 9780
			GraphicsObject.field840 = null; // L: 9787
			FileSystem.drawInterface(class358.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9788
			if (GraphicsObject.field840 != null) { // L: 9789
				FileSystem.drawInterface(GraphicsObject.field840, -1412584499, var1, var2, var3, var4, HealthBar.field1249, UserComparator7.field1374, var7); // L: 9790
				GraphicsObject.field840 = null; // L: 9791
			}

		} else {
			if (var7 != -1) { // L: 9781
				Client.field643[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9783
					Client.field643[var8] = true;
				}
			}

		}
	} // L: 9785 9793

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lkn;IIZI)V",
		garbageValue = "-251504851"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10386
		int var5 = var0.height; // L: 10387
		if (var0.widthAlignment == 0) { // L: 10388
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10389
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10390
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10391
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10392
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 10393
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 10394
			var0.width = var0.field3350 * var0.height / var0.field3375;
		}

		if (var0.heightAlignment == 4) { // L: 10395
			var0.height = var0.field3375 * var0.width / var0.field3350;
		}

		if (var0.contentType == 1337) { // L: 10396
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10397
			ScriptEvent var6 = new ScriptEvent(); // L: 10398
			var6.widget = var0; // L: 10399
			var6.args = var0.onResize; // L: 10400
			Client.scriptEvents.addFirst(var6); // L: 10401
		}

	} // L: 10403

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "1435072995"
	)
	static class437 method1060(int var0) {
		class437 var1 = (class437)Client.Widget_cachedModels.get((long)var0); // L: 12278
		if (var1 == null) { // L: 12279
			var1 = new class437(Timer.field4232, class145.method3023(var0), ClanSettings.method2909(var0)); // L: 12280
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12281
		}

		return var1; // L: 12283
	}
}
