import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class315 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "50"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					Throwable var4 = var1; // L: 37
					String var5;
					if (var1 instanceof RunException) { // L: 40
						RunException var6 = (RunException)var1; // L: 41
						var5 = var6.message + " | "; // L: 42
						var4 = var6.throwable; // L: 43
					} else {
						var5 = ""; // L: 45
					}

					StringWriter var18 = new StringWriter(); // L: 46
					PrintWriter var7 = new PrintWriter(var18); // L: 47
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine(); // L: 52

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 54
							if (var11 == null) { // L: 55
								var5 = var5 + "| " + var10; // L: 73
								var2 = var5; // L: 76
								break label63;
							}

							int var12 = var11.indexOf(40); // L: 56
							int var13 = var11.indexOf(41, var12 + 1); // L: 57
							if (var12 >= 0 && var13 >= 0) { // L: 58
								String var14 = var11.substring(var12 + 1, var13); // L: 59
								int var15 = var14.indexOf(".java:"); // L: 60
								if (var15 >= 0) { // L: 61
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 62
									var5 = var5 + var14 + ' '; // L: 63
									continue; // L: 64
								}

								var11 = var11.substring(0, var12); // L: 66
							}

							var11 = var11.trim(); // L: 68
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 69
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 70
							var5 = var5 + var11 + ' '; // L: 71
						}
					}
				}

				if (var0 != null) { // L: 78
					if (var1 != null) { // L: 79
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 80
				}

				System.out.println("Error: " + var2); // L: 82
				var2 = var2.replace(':', '.'); // L: 83
				var2 = var2.replace('@', '_'); // L: 84
				var2 = var2.replace('&', '_'); // L: 85
				var2 = var2.replace('#', '_'); // L: 86
				if (RunException.RunException_applet == null) { // L: 87
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5366 + "&u=" + RunException.field5364 + "&v1=" + GrandExchangeOfferUnitPriceComparator.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5367 + "&e=" + var2); // L: 88
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 89
				var17.read(); // L: 90
				var17.close(); // L: 91
			} catch (Exception var16) { // L: 93
			}

		}
	} // L: 94

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-993663836"
	)
	public static int method6060(int var0) {
		return class319.field3463[var0]; // L: 51
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2132677932"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036586879"
	)
	@Export("load")
	static final void load() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 4072
			var0 = VarpDefinition.localPlayer.x; // L: 4073
			var1 = VarpDefinition.localPlayer.y; // L: 4074
			if (Friend.oculusOrbFocalPointX - var0 < -500 || Friend.oculusOrbFocalPointX - var0 > 500 || class59.oculusOrbFocalPointY - var1 < -500 || class59.oculusOrbFocalPointY - var1 > 500) { // L: 4075
				Friend.oculusOrbFocalPointX = var0; // L: 4076
				class59.oculusOrbFocalPointY = var1; // L: 4077
			}

			if (var0 != Friend.oculusOrbFocalPointX) { // L: 4079
				Friend.oculusOrbFocalPointX += (var0 - Friend.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class59.oculusOrbFocalPointY) { // L: 4080
				class59.oculusOrbFocalPointY += (var1 - class59.oculusOrbFocalPointY) / 16;
			}

			var2 = Friend.oculusOrbFocalPointX >> 7; // L: 4081
			var3 = class59.oculusOrbFocalPointY >> 7; // L: 4082
			var4 = class272.getTileHeight(Friend.oculusOrbFocalPointX, class59.oculusOrbFocalPointY, class473.Client_plane); // L: 4083
			var5 = 0; // L: 4084
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 4085
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 4086
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 4087
						int var8 = class473.Client_plane; // L: 4088
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 4089
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 4090
						if (var9 > var5) { // L: 4091
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 4095
			if (var6 > 98048) { // L: 4096
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 4097
				var6 = 32768;
			}

			if (var6 > Client.field795) { // L: 4098
				Client.field795 += (var6 - Client.field795) / 24;
			} else if (var6 < Client.field795) { // L: 4099
				Client.field795 += (var6 - Client.field795) / 80;
			}

			GrandExchangeOfferWorldComparator.field4449 = class272.getTileHeight(VarpDefinition.localPlayer.x, VarpDefinition.localPlayer.y, class473.Client_plane) - Client.camFollowHeight; // L: 4100
		} else if (Client.oculusOrbState == 1) { // L: 4102
			class518.method9298(); // L: 4103
			short var10 = -1; // L: 4104
			if (Client.field792.method4466(33)) { // L: 4105
				var10 = 0;
			} else if (Client.field792.method4466(49)) { // L: 4106
				var10 = 1024;
			}

			if (Client.field792.method4466(48)) { // L: 4107
				if (var10 == 0) { // L: 4108
					var10 = 1792;
				} else if (var10 == 1024) { // L: 4109
					var10 = 1280;
				} else {
					var10 = 1536; // L: 4110
				}
			} else if (Client.field792.method4466(50)) { // L: 4112
				if (var10 == 0) { // L: 4113
					var10 = 256;
				} else if (var10 == 1024) { // L: 4114
					var10 = 768;
				} else {
					var10 = 512; // L: 4115
				}
			}

			byte var11 = 0; // L: 4117
			if (Client.field792.method4466(35)) { // L: 4118
				var11 = -1;
			} else if (Client.field792.method4466(51)) { // L: 4119
				var11 = 1;
			}

			var2 = 0; // L: 4120
			if (var10 >= 0 || var11 != 0) { // L: 4121
				var2 = Client.field792.method4466(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 4122
				var2 *= 16; // L: 4123
				Client.field620 = var10; // L: 4124
				Client.field577 = var11; // L: 4125
			}

			if (Client.field619 < var2) { // L: 4127
				Client.field619 += var2 / 8; // L: 4128
				if (Client.field619 > var2) { // L: 4129
					Client.field619 = var2;
				}
			} else if (Client.field619 > var2) { // L: 4131
				Client.field619 = Client.field619 * 9 / 10;
			}

			if (Client.field619 > 0) { // L: 4132
				var3 = Client.field619 / 16; // L: 4133
				if (Client.field620 >= 0) { // L: 4134
					var0 = Client.field620 - Script.cameraYaw & 2047; // L: 4135
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4136
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4137
					Friend.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 4138
					class59.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 4139
				}

				if (Client.field577 != 0) { // L: 4141
					GrandExchangeOfferWorldComparator.field4449 += var3 * Client.field577; // L: 4142
					if (GrandExchangeOfferWorldComparator.field4449 > 0) { // L: 4143
						GrandExchangeOfferWorldComparator.field4449 = 0;
					}
				}
			} else {
				Client.field620 = -1; // L: 4147
				Client.field577 = -1; // L: 4148
			}

			if (Client.field792.method4466(13)) { // L: 4150
				Client.packetWriter.addNode(ViewportMouse.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher)); // L: 4152
				Client.oculusOrbState = 0; // L: 4153
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class524.mouseCam) { // L: 4157
			var0 = MouseHandler.MouseHandler_y - Client.field616; // L: 4158
			Client.field632 = var0 * 2; // L: 4159
			Client.field616 = var0 != -1 && var0 != 1 ? (Client.field616 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 4160
			var1 = Client.field615 - MouseHandler.MouseHandler_x; // L: 4161
			Client.field819 = var1 * 2; // L: 4162
			Client.field615 = var1 != -1 && var1 != 1 ? (Client.field615 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 4163
		} else {
			if (Client.field792.method4466(96)) { // L: 4166
				Client.field819 += (-24 - Client.field819) / 2;
			} else if (Client.field792.method4466(97)) { // L: 4167
				Client.field819 += (24 - Client.field819) / 2;
			} else {
				Client.field819 /= 2; // L: 4168
			}

			if (Client.field792.method4466(98)) { // L: 4169
				Client.field632 += (12 - Client.field632) / 2;
			} else if (Client.field792.method4466(99)) { // L: 4170
				Client.field632 += (-12 - Client.field632) / 2;
			} else {
				Client.field632 /= 2; // L: 4171
			}

			Client.field616 = MouseHandler.MouseHandler_y; // L: 4172
			Client.field615 = MouseHandler.MouseHandler_x; // L: 4173
		}

		Client.camAngleY = Client.field819 / 2 + Client.camAngleY & 2047; // L: 4175
		Client.camAngleX += Client.field632 / 2; // L: 4176
		if (Client.camAngleX < 128) { // L: 4177
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4178
			Client.camAngleX = 383;
		}

	} // L: 4179
}
