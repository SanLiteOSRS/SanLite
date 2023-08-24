import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class30 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 183350311
	)
	static int field167;
	@ObfuscatedName("he")
	static String field166;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-75"
	)
	static boolean method453(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104; // L: 16
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-94"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 52
				} catch (Exception var4) { // L: 34
				}
			}

			if (class31.field169.startsWith("win")) { // L: 36
				WallObject.method5025(var0, 0); // L: 38
			} else if (class31.field169.startsWith("mac")) { // L: 42
				class299.method5716(var0, 1, "openjs"); // L: 43
			} else {
				WallObject.method5025(var0, 2); // L: 46
			}
		} else {
			WallObject.method5025(var0, 3); // L: 49
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Luk;",
		garbageValue = "694687164"
	)
	static IndexedSprite[] method454() {
		IndexedSprite[] var0 = new IndexedSprite[class529.SpriteBuffer_spriteCount]; // L: 72

		for (int var1 = 0; var1 < class529.SpriteBuffer_spriteCount; ++var1) { // L: 73
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 74
			var2.width = class529.SpriteBuffer_spriteWidth; // L: 75
			var2.height = class420.SpriteBuffer_spriteHeight; // L: 76
			var2.xOffset = class529.SpriteBuffer_xOffsets[var1]; // L: 77
			var2.yOffset = class152.SpriteBuffer_yOffsets[var1]; // L: 78
			var2.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[var1]; // L: 79
			var2.subHeight = SpriteMask.SpriteBuffer_spriteHeights[var1]; // L: 80
			var2.palette = class505.SpriteBuffer_spritePalette; // L: 81
			var2.pixels = Coord.SpriteBuffer_pixels[var1]; // L: 82
		}

		class529.SpriteBuffer_xOffsets = null; // L: 85
		class152.SpriteBuffer_yOffsets = null; // L: 86
		HealthBarUpdate.SpriteBuffer_spriteWidths = null; // L: 87
		SpriteMask.SpriteBuffer_spriteHeights = null; // L: 88
		class505.SpriteBuffer_spritePalette = null; // L: 89
		Coord.SpriteBuffer_pixels = null; // L: 90
		return var0; // L: 92
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1819650636"
	)
	public static NodeDeque method446() {
		return Client.scriptEvents; // L: 5144
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "26"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11418
	}
}
