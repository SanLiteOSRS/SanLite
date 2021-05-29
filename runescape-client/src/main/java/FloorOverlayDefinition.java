import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -313850043
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1167855135
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("p")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1447154143
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1593028731
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1490944887
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1914058459
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1757390819
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1776147055
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1239811963
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-593078672"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1052896488"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;III)V",
		garbageValue = "666748128"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "273923551"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(256.0D * var12);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(256.0D * var16);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)[Len;",
		garbageValue = "-10573"
	)
	static HorizontalAlignment[] method3103() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1628, HorizontalAlignment.field1624};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbm;S)V",
		garbageValue = "10038"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "672313899"
	)
	static final void method3104() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = class93.localPlayer.x;
			var1 = class93.localPlayer.y;
			if (RouteStrategy.oculusOrbFocalPointX - var0 < -500 || RouteStrategy.oculusOrbFocalPointX - var0 > 500 || ModelData0.oculusOrbFocalPointY - var1 < -500 || ModelData0.oculusOrbFocalPointY - var1 > 500) {
				RouteStrategy.oculusOrbFocalPointX = var0;
				ModelData0.oculusOrbFocalPointY = var1;
			}

			if (var0 != RouteStrategy.oculusOrbFocalPointX) {
				RouteStrategy.oculusOrbFocalPointX += (var0 - RouteStrategy.oculusOrbFocalPointX) / 16;
			}

			if (var1 != ModelData0.oculusOrbFocalPointY) {
				ModelData0.oculusOrbFocalPointY += (var1 - ModelData0.oculusOrbFocalPointY) / 16;
			}

			var2 = RouteStrategy.oculusOrbFocalPointX >> 7;
			var3 = ModelData0.oculusOrbFocalPointY >> 7;
			var4 = class105.getTileHeight(RouteStrategy.oculusOrbFocalPointX, ModelData0.oculusOrbFocalPointY, class22.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = class22.Client_plane;
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

			if (var6 > Client.field727) {
				Client.field727 += (var6 - Client.field727) / 24;
			} else if (var6 < Client.field727) {
				Client.field727 += (var6 - Client.field727) / 80;
			}

			class17.field148 = class105.getTileHeight(class93.localPlayer.x, class93.localPlayer.y, class22.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			NPCComposition.method2791();
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
				Client.field732 = var10;
				Client.field720 = var11;
			}

			if (Client.field718 < var2) {
				Client.field718 += var2 / 8;
				if (Client.field718 > var2) {
					Client.field718 = var2;
				}
			} else if (Client.field718 > var2) {
				Client.field718 = Client.field718 * 9 / 10;
			}

			if (Client.field718 > 0) {
				var3 = Client.field718 / 16;
				if (Client.field732 >= 0) {
					var0 = Client.field732 - class376.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					RouteStrategy.oculusOrbFocalPointX += var4 * var3 / 65536;
					ModelData0.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field720 != 0) {
					class17.field148 += var3 * Client.field720;
					if (class17.field148 > 0) {
						class17.field148 = 0;
					}
				}
			} else {
				Client.field732 = -1;
				Client.field720 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				MouseHandler.method634();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Client.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
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
}
