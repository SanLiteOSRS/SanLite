import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("z")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lf;Lf;I)I",
		garbageValue = "960814637"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1772140785"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "27"
	)
	static final int method1334(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "(IIIIS)V",
		garbageValue = "18134"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (WorldMapLabelSize.localPlayer.x >> 7 == Client.destinationX && WorldMapLabelSize.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		GrandExchangeOffer.method206();
		Tiles.method1177();
		CollisionMap.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				VarpDefinition.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		CollisionMap.addNpcsToScene(false);
		Login.method2160();

		for (GraphicsObject var21 = (GraphicsObject)Client.graphicsObjects.last(); var21 != null; var21 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var21.plane == Huffman.Client_plane && !var21.isFinished) {
				if (Client.cycle >= var21.cycleStart) {
					var21.advance(Client.field737);
					if (var21.isFinished) {
						var21.remove();
					} else {
						ScriptEvent.scene.drawEntity(var21.plane, var21.x, var21.y, var21.height, 60, var21, 0, -1L, false);
					}
				}
			} else {
				var21.remove();
			}
		}

		class231.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		int var13;
		int var14;
		int var22;
		if (!Client.isCameraLocked) {
			var4 = Client.camAngleX;
			if (Client.field762 / 256 > var4) {
				var4 = Client.field762 / 256;
			}

			if (Client.field922[4] && Client.field740[4] + 128 > var4) {
				var4 = Client.field740[4] + 128;
			}

			var22 = Client.camAngleY & 2047;
			var6 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX;
			var7 = class7.field40;
			var8 = MouseHandler.oculusOrbFocalPointY;
			var9 = var4 * 3 + 600;
			var12 = var3 - 334;
			if (var12 < 0) {
				var12 = 0;
			} else if (var12 > 100) {
				var12 = 100;
			}

			var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight;
			var11 = var9 * var13 / 256;
			var12 = 2048 - var4 & 2047;
			var13 = 2048 - var22 & 2047;
			var14 = 0;
			int var15 = 0;
			int var16 = var11;
			int var17;
			int var18;
			int var19;
			if (var12 != 0) {
				var17 = Rasterizer3D.Rasterizer3D_sine[var12];
				var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
				var19 = var18 * var15 - var11 * var17 >> 16;
				var16 = var11 * var18 + var15 * var17 >> 16;
				var15 = var19;
			}

			if (var13 != 0) {
				var17 = Rasterizer3D.Rasterizer3D_sine[var13];
				var18 = Rasterizer3D.Rasterizer3D_cosine[var13];
				var19 = var14 * var18 + var17 * var16 >> 16;
				var16 = var16 * var18 - var17 * var14 >> 16;
				var14 = var19;
			}

			VertexNormal.cameraX = var6 - var14;
			FaceNormal.cameraY = var7 - var15;
			AbstractWorldMapData.cameraZ = var8 - var16;
			PacketBuffer.cameraPitch = var4;
			ServerPacket.cameraYaw = var22;
			if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7 != WorldMapLabelSize.localPlayer.x >> 7 || MouseHandler.oculusOrbFocalPointY >> 7 != WorldMapLabelSize.localPlayer.y >> 7)) {
				var17 = WorldMapLabelSize.localPlayer.plane;
				var18 = WorldMapManager.baseX * 64 + (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7);
				var19 = WorldMapLabel.baseY * 64 + (MouseHandler.oculusOrbFocalPointY >> 7);
				PacketBufferNode var20 = Client.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher);
				var20.packetBuffer.writeShort(var19);
				var20.packetBuffer.method5662(Client.field758);
				var20.packetBuffer.writeShort(var18);
				var20.packetBuffer.method5644(var17);
				Client.packetWriter.addNode(var20);
			}
		}

		if (!Client.isCameraLocked) {
			var4 = class9.method111();
		} else {
			var4 = class22.method244();
		}

		var22 = VertexNormal.cameraX;
		var6 = FaceNormal.cameraY;
		var7 = AbstractWorldMapData.cameraZ;
		var8 = PacketBuffer.cameraPitch;
		var9 = ServerPacket.cameraYaw;

		int var10;
		for (var10 = 0; var10 < 5; ++var10) {
			if (Client.field922[var10]) {
				var11 = (int)(Math.random() * (double)(Client.field678[var10] * 2 + 1) - (double)Client.field678[var10] + Math.sin((double)Client.field926[var10] * ((double)Client.field925[var10] / 100.0D)) * (double)Client.field740[var10]);
				if (var10 == 0) {
					VertexNormal.cameraX += var11;
				}

				if (var10 == 1) {
					FaceNormal.cameraY += var11;
				}

				if (var10 == 2) {
					AbstractWorldMapData.cameraZ += var11;
				}

				if (var10 == 3) {
					ServerPacket.cameraYaw = var11 + ServerPacket.cameraYaw & 2047;
				}

				if (var10 == 4) {
					PacketBuffer.cameraPitch += var11;
					if (PacketBuffer.cameraPitch < 128) {
						PacketBuffer.cameraPitch = 128;
					}

					if (PacketBuffer.cameraPitch > 383) {
						PacketBuffer.cameraPitch = 383;
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

		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
			class299.method5393(var10 - var0, var11 - var1);
		} else {
			class92.method2142();
		}

		RouteStrategy.playPcmPlayers();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		RouteStrategy.playPcmPlayers();
		var12 = Rasterizer3D.Rasterizer3D_zoom;
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom;
		ScriptEvent.scene.draw(VertexNormal.cameraX, FaceNormal.cameraY, AbstractWorldMapData.cameraZ, PacketBuffer.cameraPitch, ServerPacket.cameraYaw, var4);
		Rasterizer3D.Rasterizer3D_zoom = var12;
		RouteStrategy.playPcmPlayers();
		ScriptEvent.scene.clearTempGameObjects();
		WorldMapID.method616(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			class89.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - WorldMapManager.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - WorldMapLabel.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				Varcs.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field737);
		Client.field790 = 0;
		var13 = WorldMapManager.baseX * 64 + (WorldMapLabelSize.localPlayer.x >> 7);
		var14 = WorldMapLabel.baseY * 64 + (WorldMapLabelSize.localPlayer.y >> 7);
		if (var13 >= 3053 && var13 <= 3156 && var14 >= 3056 && var14 <= 3136) {
			Client.field790 = 1;
		}

		if (var13 >= 3072 && var13 <= 3118 && var14 >= 9492 && var14 <= 9535) {
			Client.field790 = 1;
		}

		if (Client.field790 == 1 && var13 >= 3139 && var13 <= 3199 && var14 >= 3008 && var14 <= 3062) {
			Client.field790 = 0;
		}

		VertexNormal.cameraX = var22;
		FaceNormal.cameraY = var6;
		AbstractWorldMapData.cameraZ = var7;
		PacketBuffer.cameraPitch = var8;
		ServerPacket.cameraYaw = var9;
		if (Client.isLoading) {
			byte var23 = 0;
			var14 = var23 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
			if (var14 == 0) {
				Client.isLoading = false;
			}
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			Actor.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
