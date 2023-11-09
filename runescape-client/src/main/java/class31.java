import java.io.File;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class31 {
	@ObfuscatedName("tc")
	@ObfuscatedGetter(
		intValue = -1712117609
	)
	static int field171;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = -1913824329
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -1710875137
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "1209207588"
	)
	public static boolean method464(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 168
			int var3 = var2.read(); // L: 169
			var2.seek(0L); // L: 170
			var2.write(var3); // L: 171
			var2.seek(0L); // L: 172
			var2.close(); // L: 173
			if (var1) { // L: 174
				var0.delete();
			}

			return true; // L: 175
		} catch (Exception var4) { // L: 177
			return false; // L: 178
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lri;",
		garbageValue = "1608391408"
	)
	static SpritePixels method466() {
		SpritePixels var0 = new SpritePixels(); // L: 234
		var0.width = class477.SpriteBuffer_spriteWidth; // L: 235
		var0.height = class477.SpriteBuffer_spriteHeight; // L: 236
		var0.xOffset = class451.SpriteBuffer_xOffsets[0]; // L: 237
		var0.yOffset = class319.SpriteBuffer_yOffsets[0]; // L: 238
		var0.subWidth = class450.SpriteBuffer_spriteWidths[0]; // L: 239
		var0.subHeight = class477.SpriteBuffer_spriteHeights[0]; // L: 240
		int var1 = var0.subWidth * var0.subHeight; // L: 241
		byte[] var2 = class453.SpriteBuffer_pixels[0]; // L: 242
		var0.pixels = new int[var1]; // L: 243

		for (int var3 = 0; var3 < var1; ++var3) { // L: 244
			var0.pixels[var3] = class477.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class451.SpriteBuffer_xOffsets = null; // L: 246
		class319.SpriteBuffer_yOffsets = null; // L: 247
		class450.SpriteBuffer_spriteWidths = null; // L: 248
		class477.SpriteBuffer_spriteHeights = null; // L: 249
		class477.SpriteBuffer_spritePalette = null; // L: 250
		class453.SpriteBuffer_pixels = null; // L: 251
		return var0; // L: 253
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	static final void method465() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12499
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12500
			var1.method2264(); // L: 12501
		}

	} // L: 12503
}
