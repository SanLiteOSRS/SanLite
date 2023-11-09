import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class179 {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 957080960
	)
	static int field1902;
	@ObfuscatedName("aw")
	public short[] field1899;
	@ObfuscatedName("ac")
	public short[] field1898;

	class179(int var1) {
		ItemComposition var2 = HealthBarUpdate.ItemComposition_get(var1); // L: 12
		if (var2.method4030()) { // L: 13
			this.field1899 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1899, 0, this.field1899.length); // L: 15
		}

		if (var2.method4046()) { // L: 17
			this.field1898 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1898, 0, this.field1898.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;II)V",
		garbageValue = "-1564700734"
	)
	public static void method3631(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) { // L: 241
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 243
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 244
			} catch (Exception var3) { // L: 246
			}
		}

	} // L: 248

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ltq;",
		garbageValue = "-1490841904"
	)
	static SpritePixels method3633() {
		SpritePixels var0 = new SpritePixels(); // L: 201
		var0.width = class503.SpriteBuffer_spriteWidth; // L: 202
		var0.height = class503.SpriteBuffer_spriteHeight; // L: 203
		var0.xOffset = class503.SpriteBuffer_xOffsets[0]; // L: 204
		var0.yOffset = class17.SpriteBuffer_yOffsets[0]; // L: 205
		var0.subWidth = class97.SpriteBuffer_spriteWidths[0]; // L: 206
		var0.subHeight = class138.SpriteBuffer_spriteHeights[0]; // L: 207
		int var1 = var0.subHeight * var0.subWidth; // L: 208
		byte[] var2 = VarbitComposition.SpriteBuffer_pixels[0]; // L: 209
		var0.pixels = new int[var1]; // L: 210

		for (int var3 = 0; var3 < var1; ++var3) { // L: 211
			var0.pixels[var3] = class394.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class398.method7709(); // L: 212
		return var0; // L: 213
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "5"
	)
	public static int method3628(String var0) {
		return var0.length() + 2; // L: 136
	}
}
