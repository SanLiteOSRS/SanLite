import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class374 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 377720323
	)
	int field4427;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -502601723
	)
	int field4426;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 771706783
	)
	int field4428;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2056477773
	)
	int field4429;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4427).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4428).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4426).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4427 + var5 + "Created: " + this.field4426 + var7 + "Total used: " + this.field4428 + var6 + "Max-In-Use: " + this.field4429; // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lrx;",
		garbageValue = "1796695547"
	)
	static SpritePixels[] method7318() {
		SpritePixels[] var0 = new SpritePixels[class481.SpriteBuffer_spriteCount]; // L: 170

		for (int var1 = 0; var1 < class481.SpriteBuffer_spriteCount; ++var1) { // L: 171
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 172
			var2.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth; // L: 173
			var2.height = class481.SpriteBuffer_spriteHeight; // L: 174
			var2.xOffset = class481.SpriteBuffer_xOffsets[var1]; // L: 175
			var2.yOffset = class414.SpriteBuffer_yOffsets[var1]; // L: 176
			var2.subWidth = class11.SpriteBuffer_spriteWidths[var1]; // L: 177
			var2.subHeight = StructComposition.SpriteBuffer_spriteHeights[var1]; // L: 178
			int var3 = var2.subHeight * var2.subWidth; // L: 179
			byte[] var4 = GroundObject.SpriteBuffer_pixels[var1]; // L: 180
			var2.pixels = new int[var3]; // L: 181

			for (int var5 = 0; var5 < var3; ++var5) { // L: 182
				var2.pixels[var5] = WorldMapEvent.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class481.SpriteBuffer_xOffsets = null; // L: 185
		class414.SpriteBuffer_yOffsets = null; // L: 186
		class11.SpriteBuffer_spriteWidths = null; // L: 187
		StructComposition.SpriteBuffer_spriteHeights = null; // L: 188
		WorldMapEvent.SpriteBuffer_spritePalette = null; // L: 189
		GroundObject.SpriteBuffer_pixels = null; // L: 190
		return var0; // L: 192
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1173906398"
	)
	public static long method7315(int var0) {
		if (var0 > 63) { // L: 102
			throw new class363("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 103
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 105
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1210470674"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1037
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1038
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1039
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1040
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1041
		return var3; // L: 1042
	}
}
