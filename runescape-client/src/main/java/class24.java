import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class24 {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -271696441
	)
	static int field189;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)Lcc;",
		garbageValue = "1048576"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = BuddyRankComparator.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = WorldMapIcon_1.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "1"
	)
	static int method349(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? FriendSystem.field905 : class4.field35;
		}

		class29.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = Varcs.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class16.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class23.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field2720 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field2720;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1638618599"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class283.method4987();
		if (Client.renderSelf) {
			FriendSystem.addPlayerToScene(Varcs.localPlayer, false);
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			FriendSystem.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		SoundSystem.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				FriendSystem.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		SoundSystem.addNpcsToScene(false);

		for (Projectile var15 = (Projectile)Client.projectiles.last(); var15 != null; var15 = (Projectile)Client.projectiles.previous()) {
			if (var15.plane == class26.Client_plane && Client.cycle <= var15.cycleEnd) {
				if (Client.cycle >= var15.cycleStart) {
					if (var15.targetIndex > 0) {
						NPC var17 = Client.npcs[var15.targetIndex - 1];
						if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) {
							var15.setDestination(var17.x, var17.y, UserComparator7.getTileHeight(var17.x, var17.y, var15.plane) - var15.endHeight, Client.cycle);
						}
					}

					if (var15.targetIndex < 0) {
						var6 = -var15.targetIndex - 1;
						Player var18;
						if (var6 == Client.localPlayerIndex) {
							var18 = Varcs.localPlayer;
						} else {
							var18 = Client.players[var6];
						}

						if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) {
							var15.setDestination(var18.x, var18.y, UserComparator7.getTileHeight(var18.x, var18.y, var15.plane) - var15.endHeight, Client.cycle);
						}
					}

					var15.advance(Client.field799);
					WorldMapArea.scene.drawEntity(class26.Client_plane, (int)var15.x, (int)var15.y, (int)var15.z, 60, var15, var15.yaw, -1L, false);
				}
			} else {
				var15.remove();
			}
		}

		AccessFile.method6382();
		Bounds.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var16;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field735 / 256 > var4) {
				var4 = Client.field735 / 256;
			}

			if (Client.field850[4] && Client.field698[4] + 128 > var4) {
				var4 = Client.field698[4] + 128;
			}

			var16 = Client.camAngleY & 2047;
			class22.method329(class6.oculusOrbFocalPointX, VarbitComposition.field3544, Players.oculusOrbFocalPointY, var4, var16, WorldMapID.method3116(var4), var3);
		}

		if (!Client.isCameraLocked) {
			var4 = class2.method36();
		} else {
			var4 = class34.method420();
		}

		var16 = ModeWhere.cameraX;
		var6 = WorldMapRectangle.cameraY;
		int var7 = ReflectionCheck.cameraZ;
		int var8 = WorldMapArea.cameraPitch;
		int var9 = class69.cameraYaw;

		int var10;
		int var11;
		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field850[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field601[var10] * 2 + 1) - (double)Client.field601[var10] + Math.sin((double)Client.field853[var10] / 100.0D * (double)Client.field854[var10]) * (double)Client.field698[var10]);
				if (var10 == 0) {
					ModeWhere.cameraX += var11;
				}

				if (var10 == 1) {
					WorldMapRectangle.cameraY += var11;
				}

				if (var10 == 2) {
					ReflectionCheck.cameraZ += var11;
				}

				if (var10 == 3) {
					class69.cameraYaw = var11 + class69.cameraYaw & 2047;
				}

				if (var10 == 4) {
					WorldMapArea.cameraPitch += var11;
					if (WorldMapArea.cameraPitch < 128) {
						WorldMapArea.cameraPitch = 128;
					}

					if (WorldMapArea.cameraPitch > 383) {
						WorldMapArea.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x;
		var11 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var10 = MouseHandler.MouseHandler_lastPressedX;
			var11 = MouseHandler.MouseHandler_lastPressedY;
		}

		int var12;
		int var13;
		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			var12 = var10 - var0;
			var13 = var11 - var1;
			ViewportMouse.ViewportMouse_x = var12;
			ViewportMouse.ViewportMouse_y = var13;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		BoundaryObject.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		BoundaryObject.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		WorldMapArea.scene.draw(ModeWhere.cameraX, WorldMapRectangle.cameraY, ReflectionCheck.cameraZ, WorldMapArea.cameraPitch, class69.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		BoundaryObject.playPcmPlayers();
		WorldMapArea.scene.clearTempGameObjects();
		ServerPacket.method3903(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			class14.worldToScreen((Client.hintArrowX - ItemLayer.baseX * 64 << 7) + Client.hintArrowSubX * 4096, (Client.hintArrowY - Tile.baseY * 64 << 7) + Client.hintArrowSubY * 4096, Client.field607 * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				Script.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field799);
		Client.field716 = 0;
		var13 = ItemLayer.baseX * 64 + (Varcs.localPlayer.x >> 7);
		int var14 = Tile.baseY * 64 + (Varcs.localPlayer.y >> 7);
		if (var13 >= 3053 && var13 <= 3156 && var14 >= 3056 && var14 <= 3136) {
			Client.field716 = 1;
		}

		if (var13 >= 3072 && var13 <= 3118 && var14 >= 9492 && var14 <= 9535) {
			Client.field716 = 1;
		}

		if (Client.field716 == 1 && var13 >= 3139 && var13 <= 3199 && var14 >= 3008 && var14 <= 3062) {
			Client.field716 = 0;
		}

		ModeWhere.cameraX = var16;
		WorldMapRectangle.cameraY = var6;
		ReflectionCheck.cameraZ = var7;
		WorldMapArea.cameraPitch = var8;
		class69.cameraYaw = var9;
		if (Client.isLoading && PacketBufferNode.method3896(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class2.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
