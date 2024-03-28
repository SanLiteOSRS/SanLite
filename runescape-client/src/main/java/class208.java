import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class208 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	public static EvictingDualNodeHashTable field2148;

	static {
		field2148 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lvl;",
		garbageValue = "-1806441543"
	)
	public static IndexedSprite method3917() {
		IndexedSprite var0 = new IndexedSprite(); // L: 130
		var0.width = class549.SpriteBuffer_spriteWidth; // L: 131
		var0.height = class549.SpriteBuffer_spriteHeight; // L: 132
		var0.xOffset = class549.SpriteBuffer_xOffsets[0]; // L: 133
		var0.yOffset = class549.SpriteBuffer_yOffsets[0]; // L: 134
		var0.subWidth = class549.SpriteBuffer_spriteWidths[0]; // L: 135
		var0.subHeight = Ignored.SpriteBuffer_spriteHeights[0] * 398261776; // L: 136
		var0.palette = class126.SpriteBuffer_spritePalette; // L: 137
		var0.pixels = class549.SpriteBuffer_pixels[0]; // L: 138
		class549.SpriteBuffer_xOffsets = null; // L: 140
		class549.SpriteBuffer_yOffsets = null; // L: 141
		class549.SpriteBuffer_spriteWidths = null; // L: 142
		Ignored.SpriteBuffer_spriteHeights = null; // L: 143
		class126.SpriteBuffer_spritePalette = null; // L: 144
		class549.SpriteBuffer_pixels = null; // L: 145
		return var0; // L: 147
	}
}
