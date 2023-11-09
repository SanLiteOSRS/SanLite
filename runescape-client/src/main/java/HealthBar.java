import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("Ignored_cached")
	static class485 Ignored_cached;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhp;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2113368810"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ldj;",
		garbageValue = "16777215"
	)
	@Export("getInventorySprite")
	HealthBarUpdate getInventorySprite(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1407768452"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7007(); // L: 55
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfz;",
		garbageValue = "-111"
	)
	public static class136 method2553(int var0) {
		class136 var1 = (class136)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 407
		if (var1 != null) { // L: 408
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 410
			AbstractArchive var4 = class305.SequenceDefinition_skeletonsArchive; // L: 411
			boolean var5 = true; // L: 413
			byte[] var6 = var3.getFile(var0 >> 16 & 65535, var0 & 65535); // L: 414
			class136 var2;
			if (var6 == null) { // L: 415
				var5 = false; // L: 416
				var2 = null; // L: 417
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 420
				byte[] var8 = var4.getFile(var7, 0); // L: 423
				if (var8 == null) { // L: 424
					var5 = false;
				}

				if (!var5) { // L: 425
					var2 = null; // L: 426
				} else {
					if (class125.field1468 == null) { // L: 429
						AccessFile.field4940 = Runtime.getRuntime().availableProcessors(); // L: 430
						class125.field1468 = new ThreadPoolExecutor(0, AccessFile.field4940, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(AccessFile.field4940 * 100 + 100), new class183()); // L: 431
					}

					try {
						var2 = new class136(var3, var4, var0, false); // L: 439
					} catch (Exception var10) { // L: 441
						var2 = null; // L: 442
					}
				}
			}

			if (var2 != null) { // L: 446
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 447
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	static final void method2549() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 4025
			var0 = Projectile.localPlayer.x; // L: 4026
			var1 = Projectile.localPlayer.y; // L: 4027
			if (ModeWhere.oculusOrbFocalPointX - var0 < -500 || ModeWhere.oculusOrbFocalPointX - var0 > 500 || GrandExchangeEvents.oculusOrbFocalPointY - var1 < -500 || GrandExchangeEvents.oculusOrbFocalPointY - var1 > 500) { // L: 4028
				ModeWhere.oculusOrbFocalPointX = var0; // L: 4029
				GrandExchangeEvents.oculusOrbFocalPointY = var1; // L: 4030
			}

			if (var0 != ModeWhere.oculusOrbFocalPointX) { // L: 4032
				ModeWhere.oculusOrbFocalPointX += (var0 - ModeWhere.oculusOrbFocalPointX) / 16;
			}

			if (var1 != GrandExchangeEvents.oculusOrbFocalPointY) { // L: 4033
				GrandExchangeEvents.oculusOrbFocalPointY += (var1 - GrandExchangeEvents.oculusOrbFocalPointY) / 16;
			}

			var2 = ModeWhere.oculusOrbFocalPointX >> 7; // L: 4034
			var3 = GrandExchangeEvents.oculusOrbFocalPointY >> 7; // L: 4035
			var4 = Renderable.getTileHeight(ModeWhere.oculusOrbFocalPointX, GrandExchangeEvents.oculusOrbFocalPointY, Clock.Client_plane); // L: 4036
			var5 = 0; // L: 4037
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 4038
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 4039
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 4040
						int var8 = Clock.Client_plane; // L: 4041
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 4042
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 4043
						if (var9 > var5) { // L: 4044
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 4048
			if (var6 > 98048) { // L: 4049
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 4050
				var6 = 32768;
			}

			if (var6 > Client.field605) { // L: 4051
				Client.field605 += (var6 - Client.field605) / 24;
			} else if (var6 < Client.field605) { // L: 4052
				Client.field605 += (var6 - Client.field605) / 80;
			}

			Login.field917 = Renderable.getTileHeight(Projectile.localPlayer.x, Projectile.localPlayer.y, Clock.Client_plane) - Client.camFollowHeight; // L: 4053
		} else if (Client.oculusOrbState == 1) { // L: 4055
			if (Client.field602 && Projectile.localPlayer != null) { // L: 4057
				var0 = Projectile.localPlayer.pathX[0]; // L: 4058
				var1 = Projectile.localPlayer.pathY[0]; // L: 4059
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 4060
					ModeWhere.oculusOrbFocalPointX = Projectile.localPlayer.x; // L: 4061
					var2 = Renderable.getTileHeight(Projectile.localPlayer.x, Projectile.localPlayer.y, Clock.Client_plane) - Client.camFollowHeight; // L: 4062
					if (var2 < Login.field917) { // L: 4063
						Login.field917 = var2;
					}

					GrandExchangeEvents.oculusOrbFocalPointY = Projectile.localPlayer.y; // L: 4064
					Client.field602 = false; // L: 4065
				}
			}

			short var10 = -1; // L: 4068
			if (Client.field739.method4134(33)) { // L: 4069
				var10 = 0;
			} else if (Client.field739.method4134(49)) { // L: 4070
				var10 = 1024;
			}

			if (Client.field739.method4134(48)) { // L: 4071
				if (var10 == 0) { // L: 4072
					var10 = 1792;
				} else if (var10 == 1024) { // L: 4073
					var10 = 1280;
				} else {
					var10 = 1536; // L: 4074
				}
			} else if (Client.field739.method4134(50)) { // L: 4076
				if (var10 == 0) { // L: 4077
					var10 = 256;
				} else if (var10 == 1024) { // L: 4078
					var10 = 768;
				} else {
					var10 = 512; // L: 4079
				}
			}

			byte var11 = 0; // L: 4081
			if (Client.field739.method4134(35)) { // L: 4082
				var11 = -1;
			} else if (Client.field739.method4134(51)) { // L: 4083
				var11 = 1;
			}

			var2 = 0; // L: 4084
			if (var10 >= 0 || var11 != 0) { // L: 4085
				var2 = Client.field739.method4134(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 4086
				var2 *= 16; // L: 4087
				Client.field597 = var10; // L: 4088
				Client.field598 = var11; // L: 4089
			}

			if (Client.field596 < var2) { // L: 4091
				Client.field596 += var2 / 8; // L: 4092
				if (Client.field596 > var2) { // L: 4093
					Client.field596 = var2;
				}
			} else if (Client.field596 > var2) { // L: 4095
				Client.field596 = Client.field596 * 9 / 10;
			}

			if (Client.field596 > 0) { // L: 4096
				var3 = Client.field596 / 16; // L: 4097
				if (Client.field597 >= 0) { // L: 4098
					var0 = Client.field597 - class291.cameraYaw & 2047; // L: 4099
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 4100
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 4101
					ModeWhere.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 4102
					GrandExchangeEvents.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 4103
				}

				if (Client.field598 != 0) { // L: 4105
					Login.field917 += var3 * Client.field598; // L: 4106
					if (Login.field917 > 0) { // L: 4107
						Login.field917 = 0;
					}
				}
			} else {
				Client.field597 = -1; // L: 4111
				Client.field598 = -1; // L: 4112
			}

			if (Client.field739.method4134(13)) { // L: 4114
				Client.packetWriter.addNode(ObjectComposition.getPacketBufferNode(ClientPacket.field3192, Client.packetWriter.isaacCipher)); // L: 4116
				Client.oculusOrbState = 0; // L: 4117
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class305.mouseCam) { // L: 4121
			var0 = MouseHandler.MouseHandler_y - Client.field593; // L: 4122
			Client.field559 = var0 * 2; // L: 4123
			Client.field593 = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.field593) / 2 : MouseHandler.MouseHandler_y; // L: 4124
			var1 = Client.field727 - MouseHandler.MouseHandler_x; // L: 4125
			Client.field590 = var1 * 2; // L: 4126
			Client.field727 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field727) / 2 : MouseHandler.MouseHandler_x; // L: 4127
		} else {
			if (Client.field739.method4134(96)) { // L: 4130
				Client.field590 += (-24 - Client.field590) / 2;
			} else if (Client.field739.method4134(97)) { // L: 4131
				Client.field590 += (24 - Client.field590) / 2;
			} else {
				Client.field590 /= 2; // L: 4132
			}

			if (Client.field739.method4134(98)) { // L: 4133
				Client.field559 += (12 - Client.field559) / 2;
			} else if (Client.field739.method4134(99)) { // L: 4134
				Client.field559 += (-12 - Client.field559) / 2;
			} else {
				Client.field559 /= 2; // L: 4135
			}

			Client.field593 = MouseHandler.MouseHandler_y; // L: 4136
			Client.field727 = MouseHandler.MouseHandler_x; // L: 4137
		}

		Client.camAngleY = Client.field590 / 2 + Client.camAngleY & 2047; // L: 4139
		Client.camAngleX += Client.field559 / 2; // L: 4140
		if (Client.camAngleX < 128) { // L: 4141
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 4142
			Client.camAngleX = 383;
		}

	} // L: 4143

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "69"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field731 = 0L; // L: 4584
		if (var0 >= 2) { // L: 4585
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4586
		}

		if (class237.getWindowedMode() == 1) { // L: 4587
			class347.client.setMaxCanvasSize(765, 503); // L: 4588
		} else {
			class347.client.setMaxCanvasSize(7680, 2160); // L: 4591
		}

		if (Client.gameState >= 25) { // L: 4593
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field3195, Client.packetWriter.isaacCipher); // L: 4595
			var1.packetBuffer.writeByte(class237.getWindowedMode()); // L: 4596
			var1.packetBuffer.writeShort(class448.canvasWidth); // L: 4597
			var1.packetBuffer.writeShort(WorldMapID.canvasHeight); // L: 4598
			Client.packetWriter.addNode(var1); // L: 4599
		}

	} // L: 4601
}
