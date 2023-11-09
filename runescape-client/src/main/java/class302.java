import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class302 {
	@ObfuscatedName("ay")
	static int[] field3374;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = -1798124961
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	static {
		new Object();
		field3374 = new int[33]; // L: 10
		field3374[0] = 0; // L: 13
		int var0 = 2; // L: 14

		for (int var1 = 1; var1 < 33; ++var1) { // L: 15
			field3374[var1] = var0 - 1; // L: 16
			var0 += var0; // L: 17
		}

	} // L: 19

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1671462929"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 117

		try {
			var0 = WorldMapData_1.getPreferencesFile("", class332.field3772.name, true); // L: 119
			Buffer var1 = WorldMapManager.clientPreferences.toBuffer(); // L: 120
			var0.write(var1.array, 0, var1.offset); // L: 121
		} catch (Exception var3) { // L: 123
		}

		try {
			if (var0 != null) { // L: 125
				var0.closeSync(true); // L: 126
			}
		} catch (Exception var2) { // L: 129
		}

	} // L: 130

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lni;III)Ltt;",
		garbageValue = "-1584279611"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!WorldMapAreaData.method5599(var0, var1, var2)) { // L: 33
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 36
			var4.width = class515.SpriteBuffer_spriteWidth; // L: 37
			var4.height = class515.SpriteBuffer_spriteHeight; // L: 38
			var4.xOffset = class515.SpriteBuffer_xOffsets[0]; // L: 39
			var4.yOffset = class515.SpriteBuffer_yOffsets[0]; // L: 40
			var4.subWidth = SecureRandomCallable.SpriteBuffer_spriteWidths[0]; // L: 41
			var4.subHeight = SecureRandomCallable.SpriteBuffer_spriteHeights[0]; // L: 42
			int var5 = var4.subWidth * var4.subHeight; // L: 43
			byte[] var6 = WorldMapDecoration.SpriteBuffer_pixels[0]; // L: 44
			var4.pixels = new int[var5]; // L: 45

			for (int var7 = 0; var7 < var5; ++var7) { // L: 46
				var4.pixels[var7] = class515.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			FriendLoginUpdate.method7789(); // L: 47
			return var4; // L: 50
		}
	}
}
