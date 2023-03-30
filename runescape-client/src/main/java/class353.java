import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class353 {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Lsp;",
		garbageValue = "73"
	)
	static IndexedSprite method6646() {
		IndexedSprite var0 = new IndexedSprite(); // L: 162
		var0.width = class492.SpriteBuffer_spriteWidth; // L: 163
		var0.height = class492.SpriteBuffer_spriteHeight; // L: 164
		var0.xOffset = class492.SpriteBuffer_xOffsets[0]; // L: 165
		var0.yOffset = Canvas.SpriteBuffer_yOffsets[0]; // L: 166
		var0.subWidth = InterfaceParent.SpriteBuffer_spriteWidths[0]; // L: 167
		var0.subHeight = class144.SpriteBuffer_spriteHeights[0]; // L: 168
		var0.palette = class181.SpriteBuffer_spritePalette; // L: 169
		var0.pixels = class144.SpriteBuffer_pixels[0]; // L: 170
		FriendsList.method7473(); // L: 171
		return var0; // L: 172
	}
}
