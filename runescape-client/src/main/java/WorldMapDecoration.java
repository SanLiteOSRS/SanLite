import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		intValue = -117135279
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -193579243
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2117060031
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -26030581
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIB)[Lof;",
		garbageValue = "43"
	)
	public static IndexedSprite[] method3571(AbstractArchive var0, int var1, int var2) {
		if (!Username.method5711(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class396.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class396.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class396.SpriteBuffer_spriteWidth;
				var6.height = class396.SpriteBuffer_spriteHeight;
				var6.xOffset = class243.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class396.SpriteBuffer_yOffsets[var5];
				var6.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class372.SpriteBuffer_spriteHeights[var5];
				var6.palette = AccessFile.SpriteBuffer_spritePalette;
				var6.pixels = class396.SpriteBuffer_pixels[var5];
			}

			class243.SpriteBuffer_xOffsets = null;
			class396.SpriteBuffer_yOffsets = null;
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			AccessFile.SpriteBuffer_spritePalette = null;
			class396.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
