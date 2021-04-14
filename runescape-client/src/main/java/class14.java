import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public abstract class class14 extends Node {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "Lkq;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	class14() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	abstract void vmethod371(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	abstract void vmethod376(class11 var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "([BI)V",
		garbageValue = "1423124086"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else {
			if (ScriptFrame.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == UserComparator3.ByteArrayPool_alternativeSizes[var1] && class221.ByteArrayPool_altSizeArrayCounts[var1] < ScriptFrame.ByteArrayPool_arrays[var1].length) {
						ScriptFrame.ByteArrayPool_arrays[var1][class221.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		signature = "(Lhu;III)V",
		garbageValue = "-326398113"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var4 * var8 + var7 * var5 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + Varcs.localPlayer.x >> 7;
					int var12 = Varcs.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field2220, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method6771(Tile.baseY * 64 + var12);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method6716(ItemLayer.baseX * 64 + var11);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(Varcs.localPlayer.x);
					var13.packetBuffer.writeShort(Varcs.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "8"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = UserComparator7.getTileHeight(var0, var1, class26.Client_plane) - var2;
			var0 -= ModeWhere.cameraX;
			var3 -= WorldMapRectangle.cameraY;
			var1 -= ReflectionCheck.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[WorldMapArea.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[WorldMapArea.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class69.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class69.cameraYaw];
			int var8 = var0 * var7 + var6 * var1 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "62"
	)
	static final void method237(int var0) {
		int[] var1 = class19.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
					WorldMapArea.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
					WorldMapArea.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class19.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
					AbstractRasterProvider.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
					AbstractRasterProvider.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = WorldMapArea.scene.getFloorDecorationTag(class26.Client_plane, var5, var6);
				if (var7 != 0L) {
					int var9 = WorldMapSection1.Entity_unpackID(var7);
					int var10 = class19.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && ByteArrayPool.WorldMapElement_get(var10).field3412) {
						Client.mapIcons[Client.mapIconCount] = ByteArrayPool.WorldMapElement_get(var10).getSpriteBool(false);
						Client.field835[Client.mapIconCount] = var5;
						Client.field836[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		GameEngine.rasterProvider.apply();
	}
}
