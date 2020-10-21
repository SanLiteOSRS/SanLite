import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhj;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1986621351
	)
	@Export("group")
	int group;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -41526563
	)
	@Export("type")
	int type;
	@ObfuscatedName("l")
	boolean field596;

	InterfaceParent() {
		this.field596 = false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIIIII)I",
		garbageValue = "-2067928817"
	)
	public static int method1272(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1980231219"
	)
	public static void method1270() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class297.idxCount; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-425142787"
	)
	static int method1271(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field1129 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-271325074"
	)
	static final void method1269() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = PlayerType.localPlayer.x;
			var1 = PlayerType.localPlayer.y;
			if (TileItem.oculusOrbFocalPointX - var0 < -500 || TileItem.oculusOrbFocalPointX - var0 > 500 || Interpreter.oculusOrbFocalPointY - var1 < -500 || Interpreter.oculusOrbFocalPointY - var1 > 500) {
				TileItem.oculusOrbFocalPointX = var0;
				Interpreter.oculusOrbFocalPointY = var1;
			}

			if (var0 != TileItem.oculusOrbFocalPointX) {
				TileItem.oculusOrbFocalPointX += (var0 - TileItem.oculusOrbFocalPointX) / 16;
			}

			if (var1 != Interpreter.oculusOrbFocalPointY) {
				Interpreter.oculusOrbFocalPointY += (var1 - Interpreter.oculusOrbFocalPointY) / 16;
			}

			var2 = TileItem.oculusOrbFocalPointX >> 7;
			var3 = Interpreter.oculusOrbFocalPointY >> 7;
			var4 = GrandExchangeOfferWorldComparator.getTileHeight(TileItem.oculusOrbFocalPointX, Interpreter.oculusOrbFocalPointY, GrandExchangeOfferUnitPriceComparator.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = GrandExchangeOfferUnitPriceComparator.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field810) {
				Client.field810 += (var6 - Client.field810) / 24;
			} else if (var6 < Client.field810) {
				Client.field810 += (var6 - Client.field810) / 80;
			}

			Tiles.field542 = GrandExchangeOfferWorldComparator.getTileHeight(PlayerType.localPlayer.x, PlayerType.localPlayer.y, GrandExchangeOfferUnitPriceComparator.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field725 && PlayerType.localPlayer != null) {
				var0 = PlayerType.localPlayer.pathX[0];
				var1 = PlayerType.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					TileItem.oculusOrbFocalPointX = PlayerType.localPlayer.x;
					var2 = GrandExchangeOfferWorldComparator.getTileHeight(PlayerType.localPlayer.x, PlayerType.localPlayer.y, GrandExchangeOfferUnitPriceComparator.Client_plane) - Client.camFollowHeight;
					if (var2 < Tiles.field542) {
						Tiles.field542 = var2;
					}

					Interpreter.oculusOrbFocalPointY = PlayerType.localPlayer.y;
					Client.field725 = false;
				}
			}

			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field759 = var10;
				Client.field760 = var11;
			}

			if (Client.field692 < var2) {
				Client.field692 += var2 / 8;
				if (Client.field692 > var2) {
					Client.field692 = var2;
				}
			} else if (Client.field692 > var2) {
				Client.field692 = Client.field692 * 9 / 10;
			}

			if (Client.field692 > 0) {
				var3 = Client.field692 / 16;
				if (Client.field759 >= 0) {
					var0 = Client.field759 - ViewportMouse.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					TileItem.oculusOrbFocalPointX += var4 * var3 / 65536;
					Interpreter.oculusOrbFocalPointY += var5 * var3 / 65536;
				}

				if (Client.field760 != 0) {
					Tiles.field542 += var3 * Client.field760;
					if (Tiles.field542 > 0) {
						Tiles.field542 = 0;
					}
				}
			} else {
				Client.field759 = -1;
				Client.field760 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				LoginScreenAnimation.method1945();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && MusicPatchNode.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "218474433"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + Client.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + Client.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + Client.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
