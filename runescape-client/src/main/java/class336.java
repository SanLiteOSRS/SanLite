import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class336 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1307671165
	)
	public int field3580;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1246608637
	)
	public int field3578;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1028807547
	)
	public int field3579;

	class336() {
	} // L: 8

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1748948438"
	)
	@Export("load")
	static final void load() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.titleLoadingStage == 0) { // L: 4000
			var0 = class229.localPlayer.x; // L: 4001
			var1 = class229.localPlayer.y; // L: 4002
			if (LoginScreenAnimation.oculusOrbFocalPointX - var0 < -500 || LoginScreenAnimation.oculusOrbFocalPointX - var0 > 500 || ScriptFrame.oculusOrbFocalPointY - var1 < -500 || ScriptFrame.oculusOrbFocalPointY - var1 > 500) { // L: 4003
				LoginScreenAnimation.oculusOrbFocalPointX = var0; // L: 4004
				ScriptFrame.oculusOrbFocalPointY = var1; // L: 4005
			}

			if (var0 != LoginScreenAnimation.oculusOrbFocalPointX) { // L: 4007
				LoginScreenAnimation.oculusOrbFocalPointX += (var0 - LoginScreenAnimation.oculusOrbFocalPointX) / 16;
			}

			if (var1 != ScriptFrame.oculusOrbFocalPointY) { // L: 4008
				ScriptFrame.oculusOrbFocalPointY += (var1 - ScriptFrame.oculusOrbFocalPointY) / 16;
			}

			var2 = LoginScreenAnimation.oculusOrbFocalPointX >> 7; // L: 4009
			var3 = ScriptFrame.oculusOrbFocalPointY >> 7; // L: 4010
			var4 = WorldMapDecorationType.getTileHeight(LoginScreenAnimation.oculusOrbFocalPointX, ScriptFrame.oculusOrbFocalPointY, ItemLayer.Client_plane); // L: 4011
			var5 = 0; // L: 4012
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 4013
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 4014
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 4015
						int var8 = ItemLayer.Client_plane; // L: 4016
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 4017
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 4018
						if (var9 > var5) { // L: 4019
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 4023
			if (var6 > 98048) { // L: 4024
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 4025
				var6 = 32768;
			}

			if (var6 > Client.field759) { // L: 4026
				Client.field759 += (var6 - Client.field759) / 24;
			} else if (var6 < Client.field759) { // L: 4027
				Client.field759 += (var6 - Client.field759) / 80;
			}

			class12.field56 = WorldMapDecorationType.getTileHeight(class229.localPlayer.x, class229.localPlayer.y, ItemLayer.Client_plane) - Client.camFollowHeight; // L: 4028
		} else if (Client.titleLoadingStage == 1) { // L: 4030
			WorldMapCacheName.method5007(); // L: 4031
			short var10 = -1; // L: 4032
			if (Client.field724.method4316(33)) { // L: 4033
				var10 = 0;
			} else if (Client.field724.method4316(49)) { // L: 4034
				var10 = 1024;
			}

			if (Client.field724.method4316(48)) { // L: 4035
				if (var10 == 0) { // L: 4036
					var10 = 1792;
				} else if (var10 == 1024) { // L: 4037
					var10 = 1280;
				} else {
					var10 = 1536; // L: 4038
				}
			} else if (Client.field724.method4316(50)) { // L: 4040
				if (var10 == 0) { // L: 4041
					var10 = 256;
				} else if (var10 == 1024) { // L: 4042
					var10 = 768;
				} else {
					var10 = 512; // L: 4043
				}
			}

			byte var11 = 0; // L: 4045
			if (Client.field724.method4316(35)) { // L: 4046
				var11 = -1;
			} else if (Client.field724.method4316(51)) { // L: 4047
				var11 = 1;
			}

			var2 = 0; // L: 4048
			if (var10 >= 0 || var11 != 0) { // L: 4049
				var2 = Client.field724.method4316(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 4050
				var2 *= 16; // L: 4051
				Client.field529 = var10; // L: 4052
				Client.field763 = var11; // L: 4053
			}

			if (Client.field579 < var2) { // L: 4055
				Client.field579 += var2 / 8; // L: 4056
				if (Client.field579 > var2) { // L: 4057
					Client.field579 = var2;
				}
			} else if (Client.field579 > var2) { // L: 4059
				Client.field579 = Client.field579 * 9 / 10;
			}

			if (Client.field579 > 0) { // L: 4060
				var3 = Client.field579 / 16; // L: 4061
				if (Client.field529 >= 0) { // L: 4062
					var0 = Client.field529 - class192.cameraYaw & 2047; // L: 4063
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4064
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4065
					LoginScreenAnimation.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 4066
					ScriptFrame.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 4067
				}

				if (Client.field763 != 0) { // L: 4069
					class12.field56 += var3 * Client.field763; // L: 4070
					if (class12.field56 > 0) { // L: 4071
						class12.field56 = 0;
					}
				}
			} else {
				Client.field529 = -1; // L: 4075
				Client.field763 = -1; // L: 4076
			}

			if (Client.field724.method4316(13)) { // L: 4078
				Client.packetWriter.addNode(class113.getPacketBufferNode(ClientPacket.field3208, Client.packetWriter.isaacCipher)); // L: 4080
				Client.titleLoadingStage = 0; // L: 4081
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class19.mouseCam) { // L: 4085
			var0 = MouseHandler.MouseHandler_y - Client.field576; // L: 4086
			Client.field574 = var0 * 2; // L: 4087
			Client.field576 = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.field576) / 2 : MouseHandler.MouseHandler_y; // L: 4088
			var1 = Client.field548 - MouseHandler.MouseHandler_x; // L: 4089
			Client.field653 = var1 * 2; // L: 4090
			Client.field548 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field548) / 2 : MouseHandler.MouseHandler_x; // L: 4091
		} else {
			if (Client.field724.method4316(96)) { // L: 4094
				Client.field653 += (-24 - Client.field653) / 2;
			} else if (Client.field724.method4316(97)) { // L: 4095
				Client.field653 += (24 - Client.field653) / 2;
			} else {
				Client.field653 /= 2; // L: 4096
			}

			if (Client.field724.method4316(98)) { // L: 4097
				Client.field574 += (12 - Client.field574) / 2;
			} else if (Client.field724.method4316(99)) { // L: 4098
				Client.field574 += (-12 - Client.field574) / 2;
			} else {
				Client.field574 /= 2; // L: 4099
			}

			Client.field576 = MouseHandler.MouseHandler_y; // L: 4100
			Client.field548 = MouseHandler.MouseHandler_x; // L: 4101
		}

		Client.camAngleY = Client.field653 / 2 + Client.camAngleY & 2047; // L: 4103
		Client.camAngleX += Client.field574 / 2; // L: 4104
		if (Client.camAngleX < 128) { // L: 4105
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4106
			Client.camAngleX = 383;
		}

	} // L: 4107

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Luj;IS)V",
		garbageValue = "241"
	)
	static void method6303(Buffer var0, int var1) {
		class187.VorbisSample_setData(var0.array, var1); // L: 12857
		if (JagexCache.JagexCache_randomDat != null) { // L: 12859
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12861
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12862
			} catch (Exception var3) { // L: 12864
			}
		}

	} // L: 12867
}
