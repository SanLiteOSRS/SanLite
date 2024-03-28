import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1965058737
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ao")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkp;",
		garbageValue = "12"
	)
	static WorldMapSectionType[] method5645() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1}; // L: 17
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1568358623"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4768
			byte var2 = 4; // L: 4769
			int var3 = var2 + 6; // L: 4770
			int var4 = var2 + 6; // L: 4771
			int var5 = class316.fontPlain12.lineWidth(var0, 250); // L: 4772
			int var6 = class316.fontPlain12.lineCount(var0, 250) * 13; // L: 4773
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 4774
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215); // L: 4775
			class316.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4776
			GrandExchangeOfferWorldComparator.method7116(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2); // L: 4777
			if (var1) { // L: 4778
				UserComparator9.rasterProvider.drawFull(0, 0); // L: 4779
			} else {
				int var7 = var3; // L: 4782
				int var8 = var4; // L: 4783
				int var9 = var5; // L: 4784
				int var10 = var6; // L: 4785

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4787
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4788
						Client.field816[var11] = true;
					}
				}
			}

		}
	} // L: 4792

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2112871261"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4795
		if (class133.localPlayer.x >> 7 == Client.destinationX && class133.localPlayer.y >> 7 == Client.destinationY) { // L: 4797
			Client.destinationX = 0; // L: 4798
		}

		NPC.method2650(); // L: 4801
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4803
			class167.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4804
		}

		ServerPacket.addNpcsToScene(true); // L: 4807
		NPCComposition.method3903(); // L: 4808
		ServerPacket.addNpcsToScene(false); // L: 4809

		int var6;
		for (Projectile var4 = (Projectile)Client.projectiles.last(); var4 != null; var4 = (Projectile)Client.projectiles.previous()) { // L: 4811 4812 4850
			if (var4.plane == class172.Client_plane && Client.cycle <= var4.cycleEnd) { // L: 4813
				if (Client.cycle >= var4.cycleStart) { // L: 4814
					NPC var17;
					Player var18;
					if (!var4.isMoving && var4.field979 != 0) { // L: 4815
						if (var4.field979 > 0) { // L: 4816
							var17 = Client.npcs[var4.field979 - 1]; // L: 4817
							if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) { // L: 4818
								var4.sourceX = var17.x; // L: 4819
								var4.sourceY = var17.y; // L: 4820
								var4.setDestination(var4.field972, var4.field973, var4.field974, Client.cycle); // L: 4821
							}
						} else {
							var6 = -var4.field979 - 1; // L: 4826
							if (var6 == Client.localPlayerIndex) { // L: 4827
								var18 = class133.localPlayer;
							} else {
								var18 = Client.players[var6]; // L: 4828
							}

							if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) { // L: 4829
								var4.sourceX = var18.x; // L: 4830
								var4.sourceY = var18.y; // L: 4831
								var4.setDestination(var4.field972, var4.field973, var4.field974, Client.cycle); // L: 4832
							}
						}
					}

					if (var4.targetIndex > 0) { // L: 4836
						var17 = Client.npcs[var4.targetIndex - 1]; // L: 4837
						if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) { // L: 4838
							var4.setDestination(var17.x, var17.y, Canvas.getTileHeight(var17.x, var17.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					if (var4.targetIndex < 0) { // L: 4840
						var6 = -var4.targetIndex - 1; // L: 4842
						if (var6 == Client.localPlayerIndex) { // L: 4843
							var18 = class133.localPlayer;
						} else {
							var18 = Client.players[var6]; // L: 4844
						}

						if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) { // L: 4845
							var4.setDestination(var18.x, var18.y, Canvas.getTileHeight(var18.x, var18.y, var4.plane) - var4.endHeight, Client.cycle);
						}
					}

					var4.advance(Client.field545); // L: 4847
					LoginType.scene.drawEntity(class172.Client_plane, (int)var4.x, (int)var4.y, (int)var4.z, 60, var4, var4.yaw, -1L, false); // L: 4848
				}
			} else {
				var4.remove();
			}
		}

		class421.method7808(); // L: 4853
		SecureRandomFuture.setViewportShape(var0, var1, var2, var3, true); // L: 4854
		var0 = Client.viewportOffsetX; // L: 4855
		var1 = Client.viewportOffsetY; // L: 4856
		var2 = Client.viewportWidth; // L: 4857
		var3 = Client.viewportHeight; // L: 4858
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4859
		Rasterizer3D.method4576(); // L: 4860
		Rasterizer2D.method9619(); // L: 4861
		int var16 = Client.camAngleX; // L: 4862
		if (Client.field612 / 256 > var16) { // L: 4863
			var16 = Client.field612 / 256;
		}

		if (Client.field780[4] && Client.field782[4] + 128 > var16) { // L: 4864
			var16 = Client.field782[4] + 128;
		}

		int var5 = Client.camAngleY & 2047; // L: 4865
		class128.method2989(class185.oculusOrbFocalPointX, FloorUnderlayDefinition.field2198, Skeleton.oculusOrbFocalPointY, var16, var5, UserComparator5.method2898(var16), var3); // L: 4866
		int var7;
		int var8;
		if (!Client.isCameraLocked) { // L: 4868
			var6 = ObjectComposition.method4130();
		} else {
			if (NPC.clientPreferences.method2459()) { // L: 4872
				var7 = class172.Client_plane; // L: 4873
			} else {
				var8 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane); // L: 4876
				if (var8 - MouseHandler.cameraY < 800 && (Tiles.Tiles_renderFlags[class172.Client_plane][WorldMapLabelSize.cameraX >> 7][class193.cameraZ >> 7] & 4) != 0) { // L: 4877
					var7 = class172.Client_plane; // L: 4878
				} else {
					var7 = 3; // L: 4881
				}
			}

			var6 = var7; // L: 4883
		}

		var7 = WorldMapLabelSize.cameraX; // L: 4885
		var8 = MouseHandler.cameraY; // L: 4886
		int var9 = class193.cameraZ; // L: 4887
		int var10 = UserComparator10.cameraPitch; // L: 4888
		int var11 = class17.cameraYaw; // L: 4889

		int var12;
		int var13;
		for (var12 = 0; var12 < 5; ++var12) { // L: 4890
			if (Client.field780[var12]) { // L: 4891
				var13 = (int)(Math.random() * (double)(Client.field744[var12] * 2 + 1) - (double)Client.field744[var12] + Math.sin((double)Client.field784[var12] * ((double)Client.field548[var12] / 100.0D)) * (double)Client.field782[var12]); // L: 4892
				if (var12 == 0) { // L: 4893
					WorldMapLabelSize.cameraX += var13;
				}

				if (var12 == 1) { // L: 4894
					MouseHandler.cameraY += var13;
				}

				if (var12 == 2) { // L: 4895
					class193.cameraZ += var13;
				}

				if (var12 == 3) { // L: 4896
					class17.cameraYaw = var13 + class17.cameraYaw & 2047;
				}

				if (var12 == 4) { // L: 4897
					UserComparator10.cameraPitch += var13; // L: 4898
					if (UserComparator10.cameraPitch < 128) { // L: 4899
						UserComparator10.cameraPitch = 128;
					}

					if (UserComparator10.cameraPitch > 383) { // L: 4900
						UserComparator10.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x; // L: 4904
		var13 = MouseHandler.MouseHandler_y; // L: 4905
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4906
			var12 = MouseHandler.MouseHandler_lastPressedX; // L: 4907
			var13 = MouseHandler.MouseHandler_lastPressedY; // L: 4908
		}

		int var14;
		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) { // L: 4910
			var14 = var12 - var0; // L: 4911
			int var15 = var13 - var1; // L: 4912
			ViewportMouse.ViewportMouse_x = var14; // L: 4914
			ViewportMouse.ViewportMouse_y = var15; // L: 4915
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 4916
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4917
			ViewportMouse.ViewportMouse_false0 = false; // L: 4918
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4923
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4924
		}

		class167.method3417(); // L: 4927
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4928
		class167.method3417(); // L: 4929
		var14 = Rasterizer3D.method4620(); // L: 4930
		Rasterizer3D.method4562(UrlRequest.client.field172); // L: 4931
		Rasterizer3D.field2611.field2889 = Client.viewportZoom; // L: 4932
		LoginType.scene.draw(WorldMapLabelSize.cameraX, MouseHandler.cameraY, class193.cameraZ, UserComparator10.cameraPitch, class17.cameraYaw, var6); // L: 4933
		Rasterizer3D.method4562(false); // L: 4934
		if (Client.renderSelf) { // L: 4935
			Rasterizer2D.method9605(); // L: 4936
		}

		Rasterizer3D.field2611.field2889 = var14; // L: 4938
		class167.method3417(); // L: 4939
		LoginType.scene.clearTempGameObjects(); // L: 4940
		HealthBar.method2578(var0, var1, var2, var3); // L: 4941
		class53.method1052(var0, var1); // L: 4942
		((TextureProvider)Rasterizer3D.field2611.Rasterizer3D_textureLoader).animate(Client.field545); // L: 4943
		class36.method664(var0, var1, var2, var3); // L: 4944
		WorldMapLabelSize.cameraX = var7; // L: 4945
		MouseHandler.cameraY = var8; // L: 4946
		class193.cameraZ = var9; // L: 4947
		UserComparator10.cameraPitch = var10; // L: 4948
		class17.cameraYaw = var11; // L: 4949
		if (Client.field521 && ChatChannel.field1023.method7059(true, false) == 0) { // L: 4950
			Client.field521 = false;
		}

		if (Client.field521) { // L: 4951
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4952
			drawLoadingMessage("Loading - please wait.", false); // L: 4953
		}

	} // L: 4955
}
