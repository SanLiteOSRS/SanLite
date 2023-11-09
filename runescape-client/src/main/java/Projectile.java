import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 277417161
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -566865235
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1787551513
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -521738641
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2069334495
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -7489463
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -358970517
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1951177371
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1842085681
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 491947861
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 547944181
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ax")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("as")
	@Export("x")
	double x;
	@ObfuscatedName("ay")
	@Export("y")
	double y;
	@ObfuscatedName("am")
	@Export("z")
	double z;
	@ObfuscatedName("az")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ae")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("au")
	@Export("speed")
	double speed;
	@ObfuscatedName("ag")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("at")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1024834981
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -930970723
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2008042787
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -575798995
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = Coord.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-734315858"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18055"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 79
				this.frameCycle += var1; // L: 80

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 81
								return; // L: 98
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 84

						this.frame -= this.sequenceDefinition.frameCount; // L: 85
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 86

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method4015(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1450357664"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4503
		if (BuddyRankComparator.localPlayer.x >> 7 == Client.destinationX && BuddyRankComparator.localPlayer.y >> 7 == Client.destinationY) { // L: 4505
			Client.destinationX = 0; // L: 4506
		}

		if (Client.renderSelf) { // L: 4510
			class220.addPlayerToScene(BuddyRankComparator.localPlayer, false); // L: 4511
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4515
			class220.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4516
		}

		AbstractWorldMapIcon.addNpcsToScene(true); // L: 4519
		InterfaceParent.method2257(); // L: 4520
		AbstractWorldMapIcon.addNpcsToScene(false); // L: 4521
		class11.method99(); // L: 4522

		for (GraphicsObject var4 = (GraphicsObject)Client.graphicsObjects.last(); var4 != null; var4 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4524 4525 4532
			if (var4.plane == TaskHandler.Client_plane && !var4.isFinished) { // L: 4526
				if (Client.cycle >= var4.cycleStart) { // L: 4527
					var4.advance(Client.field631); // L: 4528
					if (var4.isFinished) { // L: 4529
						var4.remove();
					} else {
						class1.scene.drawEntity(var4.plane, var4.x, var4.y, var4.z, 60, var4, 0, -1L, false); // L: 4530
					}
				}
			} else {
				var4.remove();
			}
		}

		Language.setViewportShape(var0, var1, var2, var3, true); // L: 4535
		var0 = Client.viewportOffsetX; // L: 4536
		var1 = Client.viewportOffsetY; // L: 4537
		var2 = Client.viewportWidth; // L: 4538
		var3 = Client.viewportHeight; // L: 4539
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4540
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4541
		int var36 = Client.camAngleX; // L: 4542
		if (Client.field500 / 256 > var36) { // L: 4543
			var36 = Client.field500 / 256;
		}

		if (Client.field738[4] && Client.field680[4] + 128 > var36) { // L: 4544
			var36 = Client.field680[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4545
		int var6 = GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX; // L: 4546
		int var7 = class128.field1533; // L: 4547
		int var8 = ReflectionCheck.oculusOrbFocalPointY; // L: 4548
		int var11 = var36 * 3 + 600; // L: 4553
		BufferedSink.method7747(var6, var7, var8, var36, var5, var11, var3); // L: 4555
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) { // L: 4557
			var12 = class143.method3131();
		} else {
			if (WorldMapSectionType.clientPreferences.method2458()) { // L: 4561
				var13 = TaskHandler.Client_plane; // L: 4562
			} else {
				var14 = WorldMapDecorationType.getTileHeight(class381.cameraX, class471.cameraZ, TaskHandler.Client_plane); // L: 4565
				if (var14 - class351.cameraY < 800 && (Tiles.Tiles_renderFlags[TaskHandler.Client_plane][class381.cameraX >> 7][class471.cameraZ >> 7] & 4) != 0) { // L: 4566
					var13 = TaskHandler.Client_plane; // L: 4567
				} else {
					var13 = 3; // L: 4570
				}
			}

			var12 = var13; // L: 4572
		}

		var13 = class381.cameraX; // L: 4574
		var14 = class351.cameraY; // L: 4575
		int var15 = class471.cameraZ; // L: 4576
		int var16 = class311.cameraPitch; // L: 4577
		int var17 = class110.cameraYaw; // L: 4578

		int var18;
		int var19;
		for (var18 = 0; var18 < 5; ++var18) { // L: 4579
			if (Client.field738[var18]) { // L: 4580
				var19 = (int)(Math.random() * (double)(Client.field739[var18] * 2 + 1) - (double)Client.field739[var18] + Math.sin((double)Client.field741[var18] / 100.0D * (double)Client.field566[var18]) * (double)Client.field680[var18]); // L: 4581
				if (var18 == 0) { // L: 4582
					class381.cameraX += var19;
				}

				if (var18 == 1) { // L: 4583
					class351.cameraY += var19;
				}

				if (var18 == 2) { // L: 4584
					class471.cameraZ += var19;
				}

				if (var18 == 3) { // L: 4585
					class110.cameraYaw = var19 + class110.cameraYaw & 2047;
				}

				if (var18 == 4) { // L: 4586
					class311.cameraPitch += var19; // L: 4587
					if (class311.cameraPitch < 128) { // L: 4588
						class311.cameraPitch = 128;
					}

					if (class311.cameraPitch > 383) { // L: 4589
						class311.cameraPitch = 383;
					}
				}
			}
		}

		var18 = MouseHandler.MouseHandler_x; // L: 4593
		var19 = MouseHandler.MouseHandler_y; // L: 4594
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4595
			var18 = MouseHandler.MouseHandler_lastPressedX; // L: 4596
			var19 = MouseHandler.MouseHandler_lastPressedY; // L: 4597
		}

		if (var18 >= var0 && var18 < var0 + var2 && var19 >= var1 && var19 < var3 + var1) { // L: 4599
			Client.method1276(var18 - var0, var19 - var1); // L: 4600
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4604
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4605
		}

		EnumComposition.playPcmPlayers(); // L: 4608
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4609
		EnumComposition.playPcmPlayers(); // L: 4610
		int var20 = Rasterizer3D.Rasterizer3D_zoom; // L: 4611
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4612
		class1.scene.draw(class381.cameraX, class351.cameraY, class471.cameraZ, class311.cameraPitch, class110.cameraYaw, var12); // L: 4613
		Rasterizer3D.Rasterizer3D_zoom = var20; // L: 4614
		EnumComposition.playPcmPlayers(); // L: 4615
		class1.scene.clearTempGameObjects(); // L: 4616
		Client.overheadTextCount = 0; // L: 4618
		boolean var21 = false; // L: 4619
		int var22 = -1; // L: 4620
		int var23 = -1; // L: 4621
		int var24 = Players.Players_count; // L: 4622
		int[] var25 = Players.Players_indices; // L: 4623

		int var26;
		for (var26 = 0; var26 < var24 + Client.npcCount; ++var26) { // L: 4624
			Object var38;
			if (var26 < var24) { // L: 4626
				var38 = Client.players[var25[var26]]; // L: 4627
				if (var25[var26] == Client.combatTargetPlayerIndex) { // L: 4628
					var21 = true; // L: 4629
					var22 = var26; // L: 4630
					continue;
				}

				if (var38 == BuddyRankComparator.localPlayer) { // L: 4633
					var23 = var26; // L: 4634
					continue; // L: 4635
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var26 - var24]]; // L: 4638
			}

			ArchiveLoader.drawActor2d((Actor)var38, var26, var0, var1, var2, var3); // L: 4639
		}

		if (Client.renderSelf && var23 != -1) { // L: 4641
			ArchiveLoader.drawActor2d(BuddyRankComparator.localPlayer, var23, var0, var1, var2, var3); // L: 4642
		}

		if (var21) { // L: 4644
			ArchiveLoader.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var22, var0, var1, var2, var3); // L: 4645
		}

		for (var26 = 0; var26 < Client.overheadTextCount; ++var26) { // L: 4647
			int var27 = Client.overheadTextXs[var26]; // L: 4648
			int var28 = Client.overheadTextYs[var26]; // L: 4649
			int var29 = Client.overheadTextXOffsets[var26]; // L: 4650
			int var30 = Client.overheadTextAscents[var26]; // L: 4651
			boolean var31 = true; // L: 4652

			while (var31) {
				var31 = false; // L: 4654

				for (int var37 = 0; var37 < var26; ++var37) { // L: 4655
					if (var28 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var28 - var30 < Client.overheadTextYs[var37] + 2 && var27 - var29 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var29 + var27 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var28) { // L: 4656 4657
						var28 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37]; // L: 4658
						var31 = true; // L: 4659
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var26]; // L: 4664
			Client.viewportTempY = Client.overheadTextYs[var26] = var28; // L: 4665
			String var32 = Client.overheadText[var26]; // L: 4666
			if (Client.chatEffects == 0) { // L: 4667
				int var33 = 16776960; // L: 4668
				if (Client.overheadTextColors[var26] < 6) { // L: 4669
					var33 = Client.field706[Client.overheadTextColors[var26]];
				}

				if (Client.overheadTextColors[var26] == 6) { // L: 4670
					var33 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var26] == 7) { // L: 4671
					var33 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var26] == 8) { // L: 4672
					var33 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var34;
				if (Client.overheadTextColors[var26] == 9) { // L: 4673
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4674
					if (var34 < 50) { // L: 4675
						var33 = var34 * 1280 + 16711680;
					} else if (var34 < 100) { // L: 4676
						var33 = 16776960 - (var34 - 50) * 327680;
					} else if (var34 < 150) { // L: 4677
						var33 = (var34 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var26] == 10) { // L: 4679
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4680
					if (var34 < 50) { // L: 4681
						var33 = var34 * 5 + 16711680;
					} else if (var34 < 100) { // L: 4682
						var33 = 16711935 - (var34 - 50) * 327680;
					} else if (var34 < 150) { // L: 4683
						var33 = (var34 - 100) * 327680 + 255 - (var34 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var26] == 11) { // L: 4685
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4686
					if (var34 < 50) { // L: 4687
						var33 = 16777215 - var34 * 327685;
					} else if (var34 < 100) { // L: 4688
						var33 = (var34 - 50) * 327685 + 65280;
					} else if (var34 < 150) { // L: 4689
						var33 = 16777215 - (var34 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var26] == 0) { // L: 4691
					class7.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0);
				}

				if (Client.overheadTextEffects[var26] == 1) { // L: 4692
					class7.fontBold12.drawCenteredWave(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var26] == 2) { // L: 4693
					class7.fontBold12.drawCenteredWave2(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var26] == 3) { // L: 4694
					class7.fontBold12.drawCenteredShake(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, var33, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var26]);
				}

				if (Client.overheadTextEffects[var26] == 4) { // L: 4695
					var34 = (150 - Client.overheadTextCyclesRemaining[var26]) * (class7.fontBold12.stringWidth(var32) + 100) / 150; // L: 4696
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4697
					class7.fontBold12.draw(var32, var0 + Client.viewportTempX + 50 - var34, Client.viewportTempY + var1, var33, 0); // L: 4698
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4699
				}

				if (Client.overheadTextEffects[var26] == 5) { // L: 4701
					var34 = 150 - Client.overheadTextCyclesRemaining[var26]; // L: 4702
					int var35 = 0; // L: 4703
					if (var34 < 25) { // L: 4704
						var35 = var34 - 25;
					} else if (var34 > 125) { // L: 4705
						var35 = var34 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class7.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4706
					class7.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, var35 + Client.viewportTempY + var1, var33, 0); // L: 4707
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4708
				}
			} else {
				class7.fontBold12.drawCentered(var32, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4712
			}
		}

		Coord.method5753(var0, var1); // L: 4716
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field631); // L: 4717
		Client.field667 = 0; // L: 4720
		int var39 = GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7); // L: 4721
		var22 = class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7); // L: 4722
		if (var39 >= 3053 && var39 <= 3156 && var22 >= 3056 && var22 <= 3136) { // L: 4723
			Client.field667 = 1;
		}

		if (var39 >= 3072 && var39 <= 3118 && var22 >= 9492 && var22 <= 9535) { // L: 4724
			Client.field667 = 1;
		}

		if (Client.field667 == 1 && var39 >= 3139 && var39 <= 3199 && var22 >= 3008 && var22 <= 3062) { // L: 4725
			Client.field667 = 0;
		}

		class381.cameraX = var13; // L: 4728
		class351.cameraY = var14; // L: 4729
		class471.cameraZ = var15; // L: 4730
		class311.cameraPitch = var16; // L: 4731
		class110.cameraYaw = var17; // L: 4732
		if (Client.isLoading) { // L: 4733
			byte var40 = 0; // L: 4736
			var22 = var40 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4737
			if (var22 == 0) { // L: 4741
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4743
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4744
			class16.drawLoadingMessage("Loading - please wait.", false); // L: 4745
		}

	} // L: 4747
}
