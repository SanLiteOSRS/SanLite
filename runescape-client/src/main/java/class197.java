import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class197 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	static EvictingDualNodeHashTable field2057;

	static {
		field2057 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IIB)[Lut;",
		garbageValue = "80"
	)
	public static IndexedSprite[] method3853(AbstractArchive var0, int var1, int var2) {
		if (!Varcs.method2829(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class545.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class545.SpriteBuffer_spriteCount; ++var5) { // L: 27
				IndexedSprite var6 = var4[var5] = new IndexedSprite(); // L: 28
				var6.width = class545.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class545.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class545.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class388.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = FriendsList.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var5]; // L: 34
				var6.palette = class113.SpriteBuffer_spritePalette; // L: 35
				var6.pixels = class230.SpriteBuffer_pixels[var5]; // L: 36
			}

			class545.SpriteBuffer_xOffsets = null; // L: 39
			class388.SpriteBuffer_yOffsets = null; // L: 40
			FriendsList.SpriteBuffer_spriteWidths = null; // L: 41
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null; // L: 42
			class113.SpriteBuffer_spritePalette = null; // L: 43
			class230.SpriteBuffer_pixels = null; // L: 44
			return var4; // L: 48
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "99"
	)
	static boolean method3854() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5147
	}
}
