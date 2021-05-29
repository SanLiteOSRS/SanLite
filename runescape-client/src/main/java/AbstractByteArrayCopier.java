import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -941868037
	)
	static int field3119;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "74"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "43"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljv;III)Lop;",
		garbageValue = "1690865732"
	)
	static IndexedSprite method4802(AbstractArchive var0, int var1, int var2) {
		if (!class339.method6015(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class396.SpriteBuffer_spriteWidth;
			var4.height = UserComparator2.SpriteBuffer_spriteHeight;
			var4.xOffset = WorldMapDecoration.SpriteBuffer_xOffsets[0];
			var4.yOffset = Calendar.SpriteBuffer_yOffsets[0];
			var4.subWidth = class396.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class302.SpriteBuffer_spriteHeights[0];
			var4.palette = MilliClock.SpriteBuffer_spritePalette;
			var4.pixels = class396.SpriteBuffer_pixels[0];
			MilliClock.method2587();
			return var4;
		}
	}
}
