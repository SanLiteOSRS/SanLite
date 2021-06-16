import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("f")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("e")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("v")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1691710161"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label83: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label83;
					}

					if (var7 == '+') {
						break label83;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613057014"
	)
	static final void method4783() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class262.localPlayer.x;
			var1 = class262.localPlayer.y;
			if (FriendSystem.oculusOrbFocalPointX - var0 < -500 || FriendSystem.oculusOrbFocalPointX - var0 > 500 || VarbitComposition.oculusOrbFocalPointY - var1 < -500 || VarbitComposition.oculusOrbFocalPointY - var1 > 500) {
				FriendSystem.oculusOrbFocalPointX = var0;
				VarbitComposition.oculusOrbFocalPointY = var1;
			}

			if (var0 != FriendSystem.oculusOrbFocalPointX) {
				FriendSystem.oculusOrbFocalPointX += (var0 - FriendSystem.oculusOrbFocalPointX) / 16;
			}

			if (var1 != VarbitComposition.oculusOrbFocalPointY) {
				VarbitComposition.oculusOrbFocalPointY += (var1 - VarbitComposition.oculusOrbFocalPointY) / 16;
			}

			var2 = FriendSystem.oculusOrbFocalPointX >> 7;
			var3 = VarbitComposition.oculusOrbFocalPointY >> 7;
			var4 = ItemContainer.getTileHeight(FriendSystem.oculusOrbFocalPointX, VarbitComposition.oculusOrbFocalPointY, SoundSystem.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = SoundSystem.Client_plane;
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

			if (var6 > Client.field708) {
				Client.field708 += (var6 - Client.field708) / 24;
			} else if (var6 < Client.field708) {
				Client.field708 += (var6 - Client.field708) / 80;
			}

			class14.field124 = ItemContainer.getTileHeight(class262.localPlayer.x, class262.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field705 && class262.localPlayer != null) {
				var0 = class262.localPlayer.pathX[0];
				var1 = class262.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					FriendSystem.oculusOrbFocalPointX = class262.localPlayer.x;
					var2 = ItemContainer.getTileHeight(class262.localPlayer.x, class262.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight;
					if (var2 < class14.field124) {
						class14.field124 = var2;
					}

					VarbitComposition.oculusOrbFocalPointY = class262.localPlayer.y;
					Client.field705 = false;
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
				Client.field676 = var10;
				Client.field857 = var11;
			}

			if (Client.field699 < var2) {
				Client.field699 += var2 / 8;
				if (Client.field699 > var2) {
					Client.field699 = var2;
				}
			} else if (Client.field699 > var2) {
				Client.field699 = Client.field699 * 9 / 10;
			}

			if (Client.field699 > 0) {
				var3 = Client.field699 / 16;
				if (Client.field676 >= 0) {
					var0 = Client.field676 - class32.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					FriendSystem.oculusOrbFocalPointX += var3 * var4 / 65536;
					VarbitComposition.oculusOrbFocalPointY += var5 * var3 / 65536;
				}

				if (Client.field857 != 0) {
					class14.field124 += var3 * Client.field857;
					if (class14.field124 > 0) {
						class14.field124 = 0;
					}
				}
			} else {
				Client.field676 = -1;
				Client.field857 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				class35.method421();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator3.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
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
}
