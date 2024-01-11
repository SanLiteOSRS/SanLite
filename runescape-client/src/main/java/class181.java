import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class181 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)Luc;",
		garbageValue = "-318838913"
	)
	public static final SpritePixels method3691(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "101709592"
	)
	static final void method3687() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 110
			int var0 = Scene.Scene_cameraPitchSine; // L: 111
			int var1 = Scene.Scene_cameraPitchCosine; // L: 112
			int var2 = Scene.Scene_cameraYawSine; // L: 113
			int var3 = Scene.Scene_cameraYawCosine; // L: 114
			byte var4 = 50; // L: 115
			short var5 = 3500; // L: 116
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5269()) * var4 / Rasterizer3D.method5320(); // L: 117
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5253()) * var4 / Rasterizer3D.method5320(); // L: 118
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method5269()) * var5 / Rasterizer3D.method5320(); // L: 119
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method5253()) * var5 / Rasterizer3D.method5320(); // L: 120
			int var11 = var7 * var1 + var0 * var4 >> 16; // L: 124
			int var15 = Occluder.method5588(var7, var4, var1, var0); // L: 127
			int var12 = var5 * var0 + var1 * var9 >> 16; // L: 131
			int var16 = Occluder.method5588(var9, var5, var1, var0); // L: 134
			int var10 = class221.method4355(var6, var15, var3, var2); // L: 136
			int var13 = var6 * var2 + var15 * var3 >> 16; // L: 139
			var6 = var10; // L: 142
			var10 = class221.method4355(var8, var16, var3, var2); // L: 143
			int var14 = var3 * var16 + var2 * var8 >> 16; // L: 146
			class403.field4501 = (var10 + var6) / 2; // L: 150
			ViewportMouse.field3063 = (var12 + var11) / 2; // L: 151
			ViewportMouse.field3054 = (var13 + var14) / 2; // L: 152
			ViewportMouse.field3055 = (var10 - var6) / 2; // L: 153
			class151.field1681 = (var12 - var11) / 2; // L: 154
			class140.field1625 = (var14 - var13) / 2; // L: 155
			class148.field1662 = Math.abs(ViewportMouse.field3055); // L: 156
			UserComparator7.field1450 = Math.abs(class151.field1681); // L: 157
			DynamicObject.field998 = Math.abs(class140.field1625); // L: 158
		}
	} // L: 159
}
