import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("aq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1523052687
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1947725359
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 879345441
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 140840657
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -519343155
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1010896295
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1612153409
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1384648045
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1239204449
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1545090087
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1220656091
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("g")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("i")
	@Export("x")
	double x;
	@ObfuscatedName("o")
	@Export("y")
	double y;
	@ObfuscatedName("n")
	@Export("z")
	double z;
	@ObfuscatedName("k")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("a")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("s")
	@Export("speed")
	double speed;
	@ObfuscatedName("l")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("t")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1617416595
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1125057587
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1598140117
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1307859615
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
		int var12 = ClanSettings.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class216.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1027863856"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lhh;",
		garbageValue = "-1279733976"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ClanSettings.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2050320762"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
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
				int var2 = this.sequenceDefinition.method4024(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lly;Ljava/lang/String;Ljava/lang/String;I)Lra;",
		garbageValue = "-1993204368"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 101
		int var4 = var0.getFileId(var3, var2); // L: 102
		byte[] var7 = var0.takeFile(var3, var4); // L: 107
		boolean var6;
		if (var7 == null) { // L: 108
			var6 = false; // L: 109
		} else {
			VarpDefinition.SpriteBuffer_decode(var7); // L: 112
			var6 = true; // L: 113
		}

		IndexedSprite var5;
		if (!var6) { // L: 115
			var5 = null; // L: 116
		} else {
			IndexedSprite var8 = new IndexedSprite(); // L: 121
			var8.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth; // L: 122
			var8.height = class481.SpriteBuffer_spriteHeight; // L: 123
			var8.xOffset = class481.SpriteBuffer_xOffsets[0]; // L: 124
			var8.yOffset = class414.SpriteBuffer_yOffsets[0]; // L: 125
			var8.subWidth = class11.SpriteBuffer_spriteWidths[0]; // L: 126
			var8.subHeight = StructComposition.SpriteBuffer_spriteHeights[0] * -1903818609; // L: 127
			var8.palette = WorldMapEvent.SpriteBuffer_spritePalette; // L: 128
			var8.pixels = GroundObject.SpriteBuffer_pixels[0]; // L: 129
			class481.SpriteBuffer_xOffsets = null; // L: 131
			class414.SpriteBuffer_yOffsets = null; // L: 132
			class11.SpriteBuffer_spriteWidths = null; // L: 133
			StructComposition.SpriteBuffer_spriteHeights = null; // L: 134
			WorldMapEvent.SpriteBuffer_spritePalette = null; // L: 135
			GroundObject.SpriteBuffer_pixels = null; // L: 136
			var5 = var8; // L: 140
		}

		return var5; // L: 142
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-2"
	)
	public static int method2105(int var0) {
		return Occluder.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 64
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2029958408"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4476
		GrandExchangeOfferUnitPriceComparator.method6640(); // L: 4477
		UserComparator3.method2848(); // L: 4478
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4480
			WorldMapAreaData.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4481
		}

		DevicePcmPlayerProvider.addNpcsToScene(true); // L: 4484
		class281.method5504(); // L: 4485
		DevicePcmPlayerProvider.addNpcsToScene(false); // L: 4486
		class31.method454(); // L: 4487

		for (GraphicsObject var4 = (GraphicsObject)Client.graphicsObjects.last(); var4 != null; var4 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4489 4490 4497
			if (var4.plane == class383.Client_plane && !var4.isFinished) { // L: 4491
				if (Client.cycle >= var4.cycleStart) { // L: 4492
					var4.advance(Client.field563); // L: 4493
					if (var4.isFinished) { // L: 4494
						var4.remove();
					} else {
						ReflectionCheck.scene.drawEntity(var4.plane, var4.x, var4.y, var4.z, 60, var4, 0, -1L, false); // L: 4495
					}
				}
			} else {
				var4.remove();
			}
		}

		class143.setViewportShape(var0, var1, var2, var3, true); // L: 4500
		var0 = Client.viewportOffsetX; // L: 4501
		var1 = Client.viewportOffsetY; // L: 4502
		var2 = Client.viewportWidth; // L: 4503
		var3 = Client.viewportHeight; // L: 4504
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4505
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4506
		int var35 = Client.camAngleX; // L: 4507
		if (Client.field604 / 256 > var35) { // L: 4508
			var35 = Client.field604 / 256;
		}

		if (Client.field773[4] && Client.field775[4] + 128 > var35) { // L: 4509
			var35 = Client.field775[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4510
		int var6 = KeyHandler.oculusOrbFocalPointX; // L: 4511
		int var7 = ApproximateRouteStrategy.field498; // L: 4512
		int var8 = class14.oculusOrbFocalPointY; // L: 4513
		int var9 = var35 * 3 + 600; // L: 4516
		int var12 = var3 - 334; // L: 4522
		if (var12 < 0) { // L: 4523
			var12 = 0;
		} else if (var12 > 100) { // L: 4524
			var12 = 100;
		}

		int var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight; // L: 4525
		int var11 = var13 * var9 / 256; // L: 4526
		var12 = 2048 - var35 & 2047; // L: 4529
		var13 = 2048 - var5 & 2047; // L: 4530
		int var14 = 0; // L: 4531
		int var15 = 0; // L: 4532
		int var16 = var11; // L: 4533
		int var17;
		int var18;
		int var19;
		if (var12 != 0) { // L: 4534
			var17 = Rasterizer3D.Rasterizer3D_sine[var12]; // L: 4535
			var18 = Rasterizer3D.Rasterizer3D_cosine[var12]; // L: 4536
			var19 = var18 * var15 - var11 * var17 >> 16; // L: 4537
			var16 = var17 * var15 + var18 * var11 >> 16; // L: 4538
			var15 = var19; // L: 4539
		}

		if (var13 != 0) { // L: 4541
			var17 = Rasterizer3D.Rasterizer3D_sine[var13]; // L: 4542
			var18 = Rasterizer3D.Rasterizer3D_cosine[var13]; // L: 4543
			var19 = var16 * var17 + var14 * var18 >> 16; // L: 4544
			var16 = var18 * var16 - var17 * var14 >> 16; // L: 4545
			var14 = var19; // L: 4546
		}

		if (Client.isCameraLocked) { // L: 4548
			class102.field1367 = var6 - var14; // L: 4549
			Frames.field2616 = var7 - var15; // L: 4550
			MusicPatchNode2.field3342 = var8 - var16; // L: 4551
			NPCComposition.field2067 = var35; // L: 4552
			class101.field1365 = var5; // L: 4553
		} else {
			class145.cameraX = var6 - var14; // L: 4556
			class414.cameraY = var7 - var15; // L: 4557
			ClanChannel.cameraZ = var8 - var16; // L: 4558
			class97.cameraPitch = var35; // L: 4559
			class128.cameraYaw = var5; // L: 4560
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (KeyHandler.oculusOrbFocalPointX >> 7 != class155.localPlayer.x >> 7 || class14.oculusOrbFocalPointY >> 7 != class155.localPlayer.y >> 7)) { // L: 4562 4563
			var17 = class155.localPlayer.plane; // L: 4564
			var18 = class154.baseX * 64 + (KeyHandler.oculusOrbFocalPointX >> 7); // L: 4565
			var19 = class365.baseY * 64 + (class14.oculusOrbFocalPointY >> 7); // L: 4566
			PacketBufferNode var20 = class136.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher); // L: 4569
			var20.packetBuffer.method8607(var19); // L: 4570
			var20.packetBuffer.method8578(var17); // L: 4571
			var20.packetBuffer.writeIntME(var18); // L: 4572
			var20.packetBuffer.method8601(Client.field789); // L: 4573
			Client.packetWriter.addNode(var20); // L: 4574
		}

		if (!Client.isCameraLocked) { // L: 4580
			var11 = class163.method3424();
		} else {
			var11 = SecureRandomFuture.method2118(); // L: 4581
		}

		var12 = class145.cameraX; // L: 4582
		var13 = class414.cameraY; // L: 4583
		var14 = ClanChannel.cameraZ; // L: 4584
		var15 = class97.cameraPitch; // L: 4585
		var16 = class128.cameraYaw; // L: 4586

		for (var17 = 0; var17 < 5; ++var17) { // L: 4587
			if (Client.field773[var17]) { // L: 4588
				var18 = (int)(Math.random() * (double)(Client.field803[var17] * 2 + 1) - (double)Client.field803[var17] + Math.sin((double)Client.field617[var17] * ((double)Client.field776[var17] / 100.0D)) * (double)Client.field775[var17]); // L: 4589
				if (var17 == 0) { // L: 4590
					class145.cameraX += var18;
				}

				if (var17 == 1) { // L: 4591
					class414.cameraY += var18;
				}

				if (var17 == 2) { // L: 4592
					ClanChannel.cameraZ += var18;
				}

				if (var17 == 3) { // L: 4593
					class128.cameraYaw = var18 + class128.cameraYaw & 2047;
				}

				if (var17 == 4) { // L: 4594
					class97.cameraPitch += var18; // L: 4595
					if (class97.cameraPitch < 128) { // L: 4596
						class97.cameraPitch = 128;
					}

					if (class97.cameraPitch > 383) { // L: 4597
						class97.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x; // L: 4601
		var18 = MouseHandler.MouseHandler_y; // L: 4602
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4603
			var17 = MouseHandler.MouseHandler_lastPressedX; // L: 4604
			var18 = MouseHandler.MouseHandler_lastPressedY; // L: 4605
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) { // L: 4607
			var19 = var17 - var0; // L: 4608
			int var36 = var18 - var1; // L: 4609
			ViewportMouse.ViewportMouse_x = var19; // L: 4611
			ViewportMouse.ViewportMouse_y = var36; // L: 4612
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4613
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4614
			ViewportMouse.ViewportMouse_false0 = false; // L: 4615
		} else {
			class17.method252(); // L: 4619
		}

		Client.playPcmPlayers(); // L: 4621
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4622
		Client.playPcmPlayers(); // L: 4623
		var19 = Rasterizer3D.Rasterizer3D_zoom; // L: 4624
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4625
		ReflectionCheck.scene.draw(class145.cameraX, class414.cameraY, ClanChannel.cameraZ, class97.cameraPitch, class128.cameraYaw, var11); // L: 4626
		Rasterizer3D.Rasterizer3D_zoom = var19; // L: 4627
		Client.playPcmPlayers(); // L: 4628
		ReflectionCheck.scene.clearTempGameObjects(); // L: 4629
		Client.overheadTextCount = 0; // L: 4631
		boolean var40 = false; // L: 4632
		int var21 = -1; // L: 4633
		int var22 = -1; // L: 4634
		int var23 = Players.Players_count; // L: 4635
		int[] var24 = Players.Players_indices; // L: 4636

		int var25;
		for (var25 = 0; var25 < var23 + Client.npcCount; ++var25) { // L: 4637
			Object var38;
			if (var25 < var23) { // L: 4639
				var38 = Client.players[var24[var25]]; // L: 4640
				if (var24[var25] == Client.combatTargetPlayerIndex) { // L: 4641
					var40 = true; // L: 4642
					var21 = var25; // L: 4643
					continue;
				}

				if (var38 == class155.localPlayer) { // L: 4646
					var22 = var25; // L: 4647
					continue; // L: 4648
				}
			} else {
				var38 = Client.npcs[Client.npcIndices[var25 - var23]]; // L: 4651
			}

			class128.drawActor2d((Actor)var38, var25, var0, var1, var2, var3); // L: 4652
		}

		if (Client.renderSelf && var22 != -1) { // L: 4654
			class128.drawActor2d(class155.localPlayer, var22, var0, var1, var2, var3); // L: 4655
		}

		if (var40) { // L: 4657
			class128.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3); // L: 4658
		}

		for (var25 = 0; var25 < Client.overheadTextCount; ++var25) { // L: 4660
			int var26 = Client.overheadTextXs[var25]; // L: 4661
			int var27 = Client.overheadTextYs[var25]; // L: 4662
			int var28 = Client.overheadTextXOffsets[var25]; // L: 4663
			int var29 = Client.overheadTextAscents[var25]; // L: 4664
			boolean var30 = true; // L: 4665

			while (var30) {
				var30 = false; // L: 4667

				for (int var37 = 0; var37 < var25; ++var37) { // L: 4668
					if (var27 + 2 > Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] && var27 - var29 < Client.overheadTextYs[var37] + 2 && var26 - var28 < Client.overheadTextXOffsets[var37] + Client.overheadTextXs[var37] && var28 + var26 > Client.overheadTextXs[var37] - Client.overheadTextXOffsets[var37] && Client.overheadTextYs[var37] - Client.overheadTextAscents[var37] < var27) { // L: 4669 4670
						var27 = Client.overheadTextYs[var37] - Client.overheadTextAscents[var37]; // L: 4671
						var30 = true; // L: 4672
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var25]; // L: 4677
			Client.viewportTempY = Client.overheadTextYs[var25] = var27; // L: 4678
			String var31 = Client.overheadText[var25]; // L: 4679
			if (Client.chatEffects == 0) { // L: 4680
				int var32 = 16776960; // L: 4681
				if (Client.overheadTextColors[var25] < 6) { // L: 4682
					var32 = Client.field741[Client.overheadTextColors[var25]];
				}

				if (Client.overheadTextColors[var25] == 6) { // L: 4683
					var32 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var25] == 7) { // L: 4684
					var32 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var25] == 8) { // L: 4685
					var32 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var33;
				if (Client.overheadTextColors[var25] == 9) { // L: 4686
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4687
					if (var33 < 50) { // L: 4688
						var32 = var33 * 1280 + 16711680;
					} else if (var33 < 100) { // L: 4689
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 4690
						var32 = (var33 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var25] == 10) { // L: 4692
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4693
					if (var33 < 50) { // L: 4694
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) { // L: 4695
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) { // L: 4696
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var25] == 11) { // L: 4698
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4699
					if (var33 < 50) { // L: 4700
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) { // L: 4701
						var32 = (var33 - 50) * 327685 + 65280;
					} else if (var33 < 150) { // L: 4702
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var25] == 0) { // L: 4704
					class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0);
				}

				if (Client.overheadTextEffects[var25] == 1) { // L: 4705
					class146.fontBold12.drawCenteredWave(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var25] == 2) { // L: 4706
					class146.fontBold12.drawCenteredWave2(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var25] == 3) { // L: 4707
					class146.fontBold12.drawCenteredShake(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var25]);
				}

				if (Client.overheadTextEffects[var25] == 4) { // L: 4708
					var33 = (150 - Client.overheadTextCyclesRemaining[var25]) * (class146.fontBold12.stringWidth(var31) + 100) / 150; // L: 4709
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4710
					class146.fontBold12.draw(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0); // L: 4711
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4712
				}

				if (Client.overheadTextEffects[var25] == 5) { // L: 4714
					var33 = 150 - Client.overheadTextCyclesRemaining[var25]; // L: 4715
					int var34 = 0; // L: 4716
					if (var33 < 25) { // L: 4717
						var34 = var33 - 25;
					} else if (var33 > 125) { // L: 4718
						var34 = var33 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class146.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4719
					class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0); // L: 4720
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4721
				}
			} else {
				class146.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4725
			}
		}

		RouteStrategy.method4180(var0, var1); // L: 4729
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field563); // L: 4730
		CollisionMap.method4176(); // L: 4732
		class145.cameraX = var12; // L: 4734
		class414.cameraY = var13; // L: 4735
		ClanChannel.cameraZ = var14; // L: 4736
		class97.cameraPitch = var15; // L: 4737
		class128.cameraYaw = var16; // L: 4738
		if (Client.isLoading) { // L: 4739
			byte var39 = 0; // L: 4742
			var21 = var39 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount; // L: 4743
			if (var21 == 0) { // L: 4747
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4749
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4750
			SoundSystem.drawLoadingMessage("Loading - please wait.", false); // L: 4751
		}

	} // L: 4753
}
