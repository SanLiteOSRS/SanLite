import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public final class class363 implements Comparable {
	@ObfuscatedName("o")
	Object field4291;
	@ObfuscatedName("q")
	Object field4290;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -9184291711572428283L
	)
	long field4292;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -7970784477502383407L
	)
	long field4289;

	class363(Object var1, Object var2) {
		this.field4291 = var1; // L: 10
		this.field4290 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmz;I)I",
		garbageValue = "329944953"
	)
	int method6611(class363 var1) {
		if (this.field4289 < var1.field4289) {
			return -1; // L: 15
		} else {
			return this.field4289 > var1.field4289 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class363) { // L: 22
			return this.field4290.equals(((class363)var1).field4290);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4290.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method6611((class363)var1); // L: 32
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2040795706"
	)
	static final void method6621() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3937
			var0 = class28.localPlayer.x; // L: 3938
			var1 = class28.localPlayer.y; // L: 3939
			if (ObjectSound.oculusOrbFocalPointX - var0 < -500 || ObjectSound.oculusOrbFocalPointX - var0 > 500 || class306.oculusOrbFocalPointY - var1 < -500 || class306.oculusOrbFocalPointY - var1 > 500) { // L: 3940
				ObjectSound.oculusOrbFocalPointX = var0; // L: 3941
				class306.oculusOrbFocalPointY = var1; // L: 3942
			}

			if (var0 != ObjectSound.oculusOrbFocalPointX) { // L: 3944
				ObjectSound.oculusOrbFocalPointX += (var0 - ObjectSound.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class306.oculusOrbFocalPointY) { // L: 3945
				class306.oculusOrbFocalPointY += (var1 - class306.oculusOrbFocalPointY) / 16;
			}

			var2 = ObjectSound.oculusOrbFocalPointX >> 7; // L: 3946
			var3 = class306.oculusOrbFocalPointY >> 7; // L: 3947
			var4 = SecureRandomFuture.getTileHeight(ObjectSound.oculusOrbFocalPointX, class306.oculusOrbFocalPointY, FriendSystem.Client_plane); // L: 3948
			var5 = 0; // L: 3949
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3950
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3951
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3952
						int var8 = FriendSystem.Client_plane; // L: 3953
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3954
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3955
						if (var9 > var5) { // L: 3956
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3960
			if (var6 > 98048) { // L: 3961
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3962
				var6 = 32768;
			}

			if (var6 > Client.field581) { // L: 3963
				Client.field581 += (var6 - Client.field581) / 24;
			} else if (var6 < Client.field581) { // L: 3964
				Client.field581 += (var6 - Client.field581) / 80;
			}

			FileSystem.field1753 = SecureRandomFuture.getTileHeight(class28.localPlayer.x, class28.localPlayer.y, FriendSystem.Client_plane) - Client.camFollowHeight; // L: 3965
		} else if (Client.oculusOrbState == 1) { // L: 3967
			BuddyRankComparator.method2698(); // L: 3968
			short var10 = -1; // L: 3969
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3970
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3971
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3972
				if (var10 == 0) { // L: 3973
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3974
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3975
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3977
				if (var10 == 0) { // L: 3978
					var10 = 256;
				} else if (var10 == 1024) { // L: 3979
					var10 = 768;
				} else {
					var10 = 512; // L: 3980
				}
			}

			byte var11 = 0; // L: 3982
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3983
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3984
				var11 = 1;
			}

			var2 = 0; // L: 3985
			if (var10 >= 0 || var11 != 0) { // L: 3986
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 3987
				var2 *= 16; // L: 3988
				Client.field573 = var10; // L: 3989
				Client.field574 = var11; // L: 3990
			}

			if (Client.field572 < var2) { // L: 3992
				Client.field572 += var2 / 8; // L: 3993
				if (Client.field572 > var2) { // L: 3994
					Client.field572 = var2;
				}
			} else if (Client.field572 > var2) { // L: 3996
				Client.field572 = Client.field572 * 9 / 10;
			}

			if (Client.field572 > 0) { // L: 3997
				var3 = Client.field572 / 16; // L: 3998
				if (Client.field573 >= 0) { // L: 3999
					var0 = Client.field573 - PendingSpawn.cameraYaw & 2047; // L: 4000
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4001
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4002
					ObjectSound.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 4003
					class306.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 4004
				}

				if (Client.field574 != 0) { // L: 4006
					FileSystem.field1753 += var3 * Client.field574; // L: 4007
					if (FileSystem.field1753 > 0) { // L: 4008
						FileSystem.field1753 = 0;
					}
				}
			} else {
				Client.field573 = -1; // L: 4012
				Client.field574 = -1; // L: 4013
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 4015
				Client.packetWriter.addNode(class433.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher)); // L: 4017
				Client.oculusOrbState = 0; // L: 4018
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && ObjectSound.mouseCam) { // L: 4022
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 4023
			Client.camAngleDX = var0 * 2; // L: 4024
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 4025
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 4026
			Client.camAngleDY = var1 * 2; // L: 4027
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x; // L: 4028
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 4031
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 4032
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 4033
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 4034
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 4035
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 4036
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 4037
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 4038
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 4040
		Client.camAngleX += Client.camAngleDX / 2; // L: 4041
		if (Client.camAngleX < 128) { // L: 4042
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4043
			Client.camAngleX = 383;
		}

	} // L: 4044
}
