import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("ItemComposition_modelArchive")
	public static AbstractArchive ItemComposition_modelArchive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -267710423
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ar")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("ab")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-49590754"
	)
	public static int method1163(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)V",
		garbageValue = "-16719"
	)
	static final void method1162(String var0, int var1) {
		PacketBufferNode var2 = class251.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 238
		var2.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 239
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 240
		var2.packetBuffer.method8993(var1); // L: 241
		Client.packetWriter.addNode(var2); // L: 242
	} // L: 243

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-18713628"
	)
	static final void method1164() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3955
			var0 = HitSplatDefinition.localPlayer.x; // L: 3956
			var1 = HitSplatDefinition.localPlayer.y; // L: 3957
			if (WorldMapSection0.oculusOrbFocalPointX - var0 < -500 || WorldMapSection0.oculusOrbFocalPointX - var0 > 500 || TextureProvider.oculusOrbFocalPointY - var1 < -500 || TextureProvider.oculusOrbFocalPointY - var1 > 500) { // L: 3958
				WorldMapSection0.oculusOrbFocalPointX = var0; // L: 3959
				TextureProvider.oculusOrbFocalPointY = var1; // L: 3960
			}

			if (var0 != WorldMapSection0.oculusOrbFocalPointX) { // L: 3962
				WorldMapSection0.oculusOrbFocalPointX += (var0 - WorldMapSection0.oculusOrbFocalPointX) / 16;
			}

			if (var1 != TextureProvider.oculusOrbFocalPointY) { // L: 3963
				TextureProvider.oculusOrbFocalPointY += (var1 - TextureProvider.oculusOrbFocalPointY) / 16;
			}

			var2 = WorldMapSection0.oculusOrbFocalPointX >> 7; // L: 3964
			var3 = TextureProvider.oculusOrbFocalPointY >> 7; // L: 3965
			var4 = class208.getTileHeight(WorldMapSection0.oculusOrbFocalPointX, TextureProvider.oculusOrbFocalPointY, NetFileRequest.Client_plane); // L: 3966
			var5 = 0; // L: 3967
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3968
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3969
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3970
						int var8 = NetFileRequest.Client_plane; // L: 3971
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3972
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3973
						if (var9 > var5) { // L: 3974
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3978
			if (var6 > 98048) { // L: 3979
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3980
				var6 = 32768;
			}

			if (var6 > Client.field582) { // L: 3981
				Client.field582 += (var6 - Client.field582) / 24;
			} else if (var6 < Client.field582) { // L: 3982
				Client.field582 += (var6 - Client.field582) / 80;
			}

			Decimator.field400 = class208.getTileHeight(HitSplatDefinition.localPlayer.x, HitSplatDefinition.localPlayer.y, NetFileRequest.Client_plane) - Client.camFollowHeight; // L: 3983
		} else if (Client.oculusOrbState == 1) { // L: 3985
			class10.method100(); // L: 3986
			short var10 = -1; // L: 3987
			if (Client.field759.method4087(33)) { // L: 3988
				var10 = 0;
			} else if (Client.field759.method4087(49)) { // L: 3989
				var10 = 1024;
			}

			if (Client.field759.method4087(48)) { // L: 3990
				if (var10 == 0) { // L: 3991
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3992
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3993
				}
			} else if (Client.field759.method4087(50)) { // L: 3995
				if (var10 == 0) { // L: 3996
					var10 = 256;
				} else if (var10 == 1024) { // L: 3997
					var10 = 768;
				} else {
					var10 = 512; // L: 3998
				}
			}

			byte var11 = 0; // L: 4000
			if (Client.field759.method4087(35)) { // L: 4001
				var11 = -1;
			} else if (Client.field759.method4087(51)) { // L: 4002
				var11 = 1;
			}

			var2 = 0; // L: 4003
			if (var10 >= 0 || var11 != 0) { // L: 4004
				var2 = Client.field759.method4087(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 4005
				var2 *= 16; // L: 4006
				Client.field709 = var10; // L: 4007
				Client.field575 = var11; // L: 4008
			}

			if (Client.field573 < var2) { // L: 4010
				Client.field573 += var2 / 8; // L: 4011
				if (Client.field573 > var2) { // L: 4012
					Client.field573 = var2;
				}
			} else if (Client.field573 > var2) { // L: 4014
				Client.field573 = Client.field573 * 9 / 10;
			}

			if (Client.field573 > 0) { // L: 4015
				var3 = Client.field573 / 16; // L: 4016
				if (Client.field709 >= 0) { // L: 4017
					var0 = Client.field709 - Coord.cameraYaw & 2047; // L: 4018
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4019
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4020
					WorldMapSection0.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 4021
					TextureProvider.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 4022
				}

				if (Client.field575 != 0) { // L: 4024
					Decimator.field400 += var3 * Client.field575; // L: 4025
					if (Decimator.field400 > 0) { // L: 4026
						Decimator.field400 = 0;
					}
				}
			} else {
				Client.field709 = -1; // L: 4030
				Client.field575 = -1; // L: 4031
			}

			if (Client.field759.method4087(13)) { // L: 4033
				Client.packetWriter.addNode(class251.getPacketBufferNode(ClientPacket.field3196, Client.packetWriter.isaacCipher)); // L: 4035
				Client.oculusOrbState = 0; // L: 4036
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Client.mouseCam) { // L: 4040
			var0 = MouseHandler.MouseHandler_y - Client.field606; // L: 4041
			Client.field483 = var0 * 2; // L: 4042
			Client.field606 = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.field606) / 2 : MouseHandler.MouseHandler_y; // L: 4043
			var1 = Client.field569 - MouseHandler.MouseHandler_x; // L: 4044
			Client.field567 = var1 * 2; // L: 4045
			Client.field569 = var1 != -1 && var1 != 1 ? (Client.field569 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 4046
		} else {
			if (Client.field759.method4087(96)) { // L: 4049
				Client.field567 += (-24 - Client.field567) / 2;
			} else if (Client.field759.method4087(97)) { // L: 4050
				Client.field567 += (24 - Client.field567) / 2;
			} else {
				Client.field567 /= 2; // L: 4051
			}

			if (Client.field759.method4087(98)) { // L: 4052
				Client.field483 += (12 - Client.field483) / 2;
			} else if (Client.field759.method4087(99)) { // L: 4053
				Client.field483 += (-12 - Client.field483) / 2;
			} else {
				Client.field483 /= 2; // L: 4054
			}

			Client.field606 = MouseHandler.MouseHandler_y; // L: 4055
			Client.field569 = MouseHandler.MouseHandler_x; // L: 4056
		}

		Client.camAngleY = Client.field567 / 2 + Client.camAngleY & 2047; // L: 4058
		Client.camAngleX += Client.field483 / 2; // L: 4059
		if (Client.camAngleX < 128) { // L: 4060
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4061
			Client.camAngleX = 383;
		}

	} // L: 4062
}
