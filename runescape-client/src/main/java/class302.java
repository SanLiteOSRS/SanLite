import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
public class class302 {
	@ObfuscatedName("f")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lof;",
		garbageValue = "-5"
	)
	static IndexedSprite method5571() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class397.SpriteBuffer_spriteWidth;
		var0.height = class244.SpriteBuffer_spriteHeight;
		var0.xOffset = class397.SpriteBuffer_xOffsets[0];
		var0.yOffset = class26.SpriteBuffer_yOffsets[0];
		var0.subWidth = Canvas.SpriteBuffer_spriteWidths[0];
		var0.subHeight = Clock.SpriteBuffer_spriteHeights[0];
		var0.palette = class397.SpriteBuffer_spritePalette;
		var0.pixels = class126.SpriteBuffer_pixels[0];
		ArchiveDisk.method5993();
		return var0;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
