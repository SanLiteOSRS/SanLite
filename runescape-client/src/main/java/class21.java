import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class21 {
	@ObfuscatedName("s")
	public static short[] field114;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1217651977
	)
	final int field112;
	@ObfuscatedName("f")
	final String field111;

	class21(String var1) {
		this.field112 = 400; // L: 32
		this.field111 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field112 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field112 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field111 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "95"
	)
	public int method295() {
		return this.field112; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1566330722"
	)
	public String method296() {
		return this.field111; // L: 41
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgr;I)V",
		garbageValue = "-1820513040"
	)
	static final void method298(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 94
			for (var7 = 0; var7 < 64; ++var7) { // L: 95
				for (var8 = 0; var8 < 64; ++var8) { // L: 96
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 97
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0); // L: 101

		for (var7 = 0; var7 < 4; ++var7) { // L: 102
			for (var8 = 0; var8 < 64; ++var8) { // L: 103
				for (int var9 = 0; var9 < 64; ++var9) { // L: 104
					WorldMapRegion.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0); // L: 105
				}
			}
		}

	} // L: 109

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)V",
		garbageValue = "-1870756909"
	)
	static final void method297(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 445
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 446
			Player var3 = Client.players[var2]; // L: 447
			int var4 = var0.readUnsignedByte(); // L: 448
			if ((var4 & 4) != 0) { // L: 449
				var4 += var0.readUnsignedByte() << 8;
			}

			byte var5 = class202.field2287.field2285; // L: 451
			int var6;
			if ((var4 & 16) != 0) { // L: 452
				var3.targetIndex = var0.method8446(); // L: 454
				if (Script.field972) { // L: 455
					var3.targetIndex += var0.method8623() << 16; // L: 456
					var6 = 16777215; // L: 457
				} else {
					var6 = 65535; // L: 460
				}

				if (var6 == var3.targetIndex) { // L: 462
					var3.targetIndex = -1; // L: 463
				}
			}

			if ((var4 & 2) != 0) { // L: 466
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 467
				if (var3.overheadText.charAt(0) == '~') { // L: 468
					var3.overheadText = var3.overheadText.substring(1); // L: 469
					MouseHandler.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 470
				} else if (var3 == class296.localPlayer) { // L: 472
					MouseHandler.addGameMessage(2, var3.username.getName(), var3.overheadText); // L: 473
				}

				var3.isAutoChatting = false; // L: 475
				var3.overheadTextColor = 0; // L: 476
				var3.overheadTextEffect = 0; // L: 477
				var3.overheadTextCyclesRemaining = 150; // L: 478
			}

			if ((var4 & 64) != 0) { // L: 480
				var6 = var0.method8436(); // L: 481
				byte[] var7 = new byte[var6]; // L: 482
				Buffer var8 = new Buffer(var7); // L: 483
				var0.readBytes(var7, 0, var6); // L: 484
				Players.field1315[var2] = var8; // L: 485
				var3.read(var8); // L: 486
			}

			if ((var4 & 4096) != 0) { // L: 488
				var5 = var0.readByte(); // L: 489
			}

			int var14;
			if ((var4 & 8) != 0) { // L: 491
				var6 = var0.method8484(); // L: 492
				if (var6 == 65535) { // L: 493
					var6 = -1;
				}

				var14 = var0.method8435(); // L: 494
				FontName.performPlayerAnimation(var3, var6, var14); // L: 495
			}

			if ((var4 & 2048) != 0) { // L: 497
				var3.field1197 = Client.cycle + var0.method8444(); // L: 498
				var3.field1198 = Client.cycle + var0.method8446(); // L: 499
				var3.field1199 = var0.readByte(); // L: 500
				var3.field1200 = var0.method8617(); // L: 501
				var3.field1185 = var0.readByte(); // L: 502
				var3.field1202 = (byte)var0.method8623(); // L: 503
			}

			if ((var4 & 1) != 0) { // L: 505
				var3.field1203 = var0.readUnsignedShort(); // L: 506
				if (var3.pathLength == 0) { // L: 507
					var3.orientation = var3.field1203; // L: 508
					var3.field1203 = -1; // L: 509
				}
			}

			if ((var4 & 16384) != 0) { // L: 512
				var3.field1150 = var0.method8469(); // L: 513
				var3.field1190 = var0.method8617(); // L: 514
				var3.field1189 = var0.method8617(); // L: 515
				var3.field1188 = var0.method8469(); // L: 516
				var3.field1192 = var0.method8446() + Client.cycle; // L: 517
				var3.field1193 = var0.method8444() + Client.cycle; // L: 518
				var3.field1194 = var0.readUnsignedShort(); // L: 519
				if (var3.field1116) { // L: 520
					var3.field1150 += var3.tileX; // L: 521
					var3.field1190 += var3.tileY; // L: 522
					var3.field1189 += var3.tileX; // L: 523
					var3.field1188 += var3.tileY; // L: 524
					var3.pathLength = 0; // L: 525
				} else {
					var3.field1150 += var3.pathX[0]; // L: 528
					var3.field1190 += var3.pathY[0]; // L: 529
					var3.field1189 += var3.pathX[0]; // L: 530
					var3.field1188 += var3.pathY[0]; // L: 531
					var3.pathLength = 1; // L: 532
				}

				var3.field1211 = 0; // L: 534
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 32) != 0) { // L: 536
				var6 = var0.method8623(); // L: 537
				int var11;
				int var15;
				int var17;
				if (var6 > 0) { // L: 538
					for (var14 = 0; var14 < var6; ++var14) { // L: 539
						var9 = -1; // L: 541
						var10 = -1; // L: 542
						var11 = -1; // L: 543
						var15 = var0.readUShortSmart(); // L: 544
						if (var15 == 32767) { // L: 545
							var15 = var0.readUShortSmart(); // L: 546
							var10 = var0.readUShortSmart(); // L: 547
							var9 = var0.readUShortSmart(); // L: 548
							var11 = var0.readUShortSmart(); // L: 549
						} else if (var15 != 32766) { // L: 551
							var10 = var0.readUShortSmart(); // L: 552
						} else {
							var15 = -1; // L: 554
						}

						var17 = var0.readUShortSmart(); // L: 555
						var3.addHitSplat(var15, var10, var9, var11, Client.cycle, var17); // L: 556
					}
				}

				var14 = var0.method8623(); // L: 559
				if (var14 > 0) { // L: 560
					for (var15 = 0; var15 < var14; ++var15) { // L: 561
						var9 = var0.readUShortSmart(); // L: 562
						var10 = var0.readUShortSmart(); // L: 563
						if (var10 != 32767) { // L: 564
							var11 = var0.readUShortSmart(); // L: 565
							var17 = var0.method8623(); // L: 566
							var13 = var10 > 0 ? var0.readUnsignedByte() : var17; // L: 567
							var3.addHealthBar(var9, Client.cycle, var10, var11, var17, var13); // L: 568
						} else {
							var3.removeHealthBar(var9); // L: 570
						}
					}
				}
			}

			if ((var4 & 8192) != 0) { // L: 574
				var3.spotAnimation = var0.method8446(); // L: 575
				var6 = var0.method8458(); // L: 576
				var3.field1159 = var6 >> 16; // L: 577
				var3.field1186 = (var6 & 65535) + Client.cycle; // L: 578
				var3.spotAnimationFrame = 0; // L: 579
				var3.field1142 = 0; // L: 580
				if (var3.field1186 > Client.cycle) { // L: 581
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 582
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 512) != 0) { // L: 584
				for (var6 = 0; var6 < 3; ++var6) { // L: 585
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 128) != 0) { // L: 587
				var6 = var0.method8484(); // L: 588
				PlayerType var18 = (PlayerType)DecorativeObject.findEnumerated(class303.PlayerType_values(), var0.method8435()); // L: 589
				boolean var20 = var0.method8623() == 1; // L: 590
				var9 = var0.method8436(); // L: 591
				var10 = var0.offset; // L: 592
				if (var3.username != null && var3.appearance != null) { // L: 593
					boolean var19 = false; // L: 594
					if (var18.isUser && DecorativeObject.friendSystem.isIgnored(var3.username)) { // L: 595 596
						var19 = true;
					}

					if (!var19 && Client.field687 == 0 && !var3.isHidden) { // L: 598
						Players.field1325.offset = 0; // L: 599
						var0.method8477(Players.field1325.array, 0, var9); // L: 600
						Players.field1325.offset = 0; // L: 601
						String var12 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(Players.field1325))); // L: 602
						var3.overheadText = var12.trim(); // L: 603
						var3.overheadTextColor = var6 >> 8; // L: 604
						var3.overheadTextEffect = var6 & 255; // L: 605
						var3.overheadTextCyclesRemaining = 150; // L: 606
						var3.isAutoChatting = var20; // L: 607
						var3.field1155 = var3 != class296.localPlayer && var18.isUser && "" != Client.field730 && var12.toLowerCase().indexOf(Client.field730) == -1; // L: 608
						if (var18.isPrivileged) { // L: 610
							var13 = var20 ? 91 : 1;
						} else {
							var13 = var20 ? 90 : 2; // L: 611
						}

						if (var18.modIcon != -1) { // L: 612
							MouseHandler.addGameMessage(var13, class268.method5367(var18.modIcon) + var3.username.getName(), var12);
						} else {
							MouseHandler.addGameMessage(var13, var3.username.getName(), var12); // L: 613
						}
					}
				}

				var0.offset = var10 + var9; // L: 616
			}

			if ((var4 & 1024) != 0) { // L: 618
				Players.field1314[var2] = (class202)DecorativeObject.findEnumerated(BufferedSink.method7548(), var0.method8440()); // L: 619
			}

			if (var3.field1116) { // L: 621
				if (var5 == 127) { // L: 622
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class202 var16;
					if (var5 != class202.field2287.field2285) { // L: 625
						var16 = (class202)DecorativeObject.findEnumerated(BufferedSink.method7548(), var5);
					} else {
						var16 = Players.field1314[var2]; // L: 626
					}

					var3.method2291(var3.tileX, var3.tileY, var16); // L: 627
				}
			}
		}

	} // L: 633

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2028812630"
	)
	static void method305(int var0) {
		if (var0 != Client.gameState) { // L: 1252
			if (Client.gameState == 30) { // L: 1253
				Client.field734.method3933(); // L: 1254
			}

			if (Client.gameState == 0) { // L: 1256
				ClanChannelMember.client.method536();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1257
				ReflectionCheck.method713(0); // L: 1258
				Client.field525 = 0; // L: 1259
				Client.field526 = 0; // L: 1260
				Client.timer.method7181(var0); // L: 1261
				if (var0 != 20) { // L: 1262
					SoundCache.method874(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Frames.field2528 != null) { // L: 1264 1265
				Frames.field2528.close(); // L: 1266
				Frames.field2528 = null; // L: 1267
			}

			if (Client.gameState == 25) { // L: 1270
				Client.field582 = 0; // L: 1271
				Client.field557 = 0; // L: 1272
				Client.field488 = 1; // L: 1273
				Client.field559 = 0; // L: 1274
				Client.field560 = 1; // L: 1275
			}

			if (var0 != 5 && var0 != 10) { // L: 1277
				if (var0 == 20) { // L: 1285
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1286
					NameableContainer.method7441(WorldMapRegion.archive10, class142.archive8, false, var3); // L: 1287
				} else if (var0 == 11) { // L: 1289
					NameableContainer.method7441(WorldMapRegion.archive10, class142.archive8, false, 4); // L: 1290
				} else if (var0 == 50) { // L: 1292
					MusicPatchNode2.setLoginResponseString("", "Updating date of birth...", ""); // L: 1293
					NameableContainer.method7441(WorldMapRegion.archive10, class142.archive8, false, 7); // L: 1294
				} else {
					PlayerType.method6274(); // L: 1296
				}
			} else {
				boolean var1 = BufferedSink.clientPreferences.method2472() >= Client.field494; // L: 1280
				int var2 = var1 ? 0 : 12; // L: 1282
				NameableContainer.method7441(WorldMapRegion.archive10, class142.archive8, true, var2); // L: 1283
			}

			Client.gameState = var0; // L: 1297
		}
	} // L: 1298

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1258940689"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4563
		if (class296.localPlayer.x >> 7 == Client.destinationX && class296.localPlayer.y >> 7 == Client.destinationY) { // L: 4565
			Client.destinationX = 0; // L: 4566
		}

		Language.method6581(); // L: 4569
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4571
			class20.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4572
		}

		class319.addNpcsToScene(true); // L: 4575
		int var4 = Players.Players_count; // L: 4577
		int[] var5 = Players.Players_indices; // L: 4578

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4579
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4580
				class20.addPlayerToScene(Client.players[var5[var6]], true); // L: 4581
			}
		}

		class319.addNpcsToScene(false); // L: 4584
		class11.method100(); // L: 4585
		NPCComposition.method3558(); // L: 4586
		MouseHandler.setViewportShape(var0, var1, var2, var3, true); // L: 4587
		var0 = Client.viewportOffsetX; // L: 4588
		var1 = Client.viewportOffsetY; // L: 4589
		var2 = Client.viewportWidth; // L: 4590
		var3 = Client.viewportHeight; // L: 4591
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4592
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 4593
		var4 = Client.camAngleX; // L: 4594
		if (Client.field590 / 256 > var4) { // L: 4595
			var4 = Client.field590 / 256;
		}

		if (Client.field556[4] && Client.field665[4] + 128 > var4) { // L: 4596
			var4 = Client.field665[4] + 128;
		}

		int var17 = Client.camAngleY & 2047; // L: 4597
		ClientPreferences.method2470(class31.oculusOrbFocalPointX, VarpDefinition.field1869, PendingSpawn.oculusOrbFocalPointY, var4, var17, StructComposition.method3661(var4), var3); // L: 4598
		if (!Client.isCameraLocked) { // L: 4600
			var6 = NetFileRequest.method6341();
		} else {
			var6 = ModelData0.method4641(); // L: 4601
		}

		int var7 = TextureProvider.cameraX; // L: 4602
		int var8 = class31.cameraY; // L: 4603
		int var9 = class313.cameraZ; // L: 4604
		int var10 = class408.cameraPitch; // L: 4605
		int var11 = WorldMapSection1.cameraYaw; // L: 4606

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 4607
			if (Client.field556[var12]) { // L: 4608
				var13 = (int)(Math.random() * (double)(Client.field760[var12] * 2 + 1) - (double)Client.field760[var12] + Math.sin((double)Client.field762[var12] / 100.0D * (double)Client.field763[var12]) * (double)Client.field665[var12]); // L: 4609
				if (var12 == 0) { // L: 4610
					TextureProvider.cameraX += var13;
				}

				if (var12 == 1) { // L: 4611
					class31.cameraY += var13;
				}

				if (var12 == 2) { // L: 4612
					class313.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4613
					WorldMapSection1.cameraYaw = var13 + WorldMapSection1.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4614
					class408.cameraPitch += var13; // L: 4615
					if (class408.cameraPitch < 128) { // L: 4616
						class408.cameraPitch = 128;
					}

					if (class408.cameraPitch > 383) { // L: 4617
						class408.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4621
		var13 = MouseHandler.MouseHandler_y; // L: 4622
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4623
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4624
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4625
		}

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4627
			var14 = var12 - var0; // L: 4628
			int var15 = var13 - var1; // L: 4629
			ViewportMouse.ViewportMouse_x = var14; // L: 4631
			ViewportMouse.ViewportMouse_y = var15; // L: 4632
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4633
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4634
			ViewportMouse.ViewportMouse_false0 = false; // L: 4635
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4640
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4641
		}

		class355.playPcmPlayers(); // L: 4644
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4645
		class355.playPcmPlayers(); // L: 4646
		var14 = Rasterizer3D.Rasterizer3D_zoom; // L: 4647
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 4648
		class139.scene.draw(TextureProvider.cameraX, class31.cameraY, class313.cameraZ, class408.cameraPitch, WorldMapSection1.cameraYaw, var6); // L: 4649
		Rasterizer3D.Rasterizer3D_zoom = var14; // L: 4650
		class355.playPcmPlayers(); // L: 4651
		class139.scene.clearTempGameObjects(); // L: 4652
		Varcs.method2612(var0, var1, var2, var3); // L: 4653
		if (Client.hintArrowType == 2) { // L: 4655
			Skeleton.worldToScreen((Client.hintArrowX - class26.baseX * 64 << 7) + Client.field723 * 4096, (Client.hintArrowY - class158.baseY * 64 << 7) + Client.field541 * 4096, Client.field770 * 2); // L: 4656
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4657
				class162.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field558); // L: 4659
		GameEngine.method662(); // L: 4661
		TextureProvider.cameraX = var7; // L: 4663
		class31.cameraY = var8; // L: 4664
		class313.cameraZ = var9; // L: 4665
		class408.cameraPitch = var10; // L: 4666
		WorldMapSection1.cameraYaw = var11; // L: 4667
		if (Client.isLoading) { // L: 4668
			byte var16 = 0; // L: 4671
			int var18 = var16 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 4672
			if (var18 == 0) { // L: 4676
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) { // L: 4678
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4679
			class145.drawLoadingMessage("Loading - please wait.", false); // L: 4680
		}

	} // L: 4682
}
