import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1545647129
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "-1963217868"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "-1931159207"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Lls;",
		garbageValue = "-1532284396"
	)
	public static IndexedSprite method4448() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class335.SpriteBuffer_spriteWidth;
		var0.height = class335.SpriteBuffer_spriteHeight;
		var0.xOffset = Username.SpriteBuffer_xOffsets[0];
		var0.yOffset = class335.SpriteBuffer_yOffsets[0];
		var0.subWidth = class335.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class335.SpriteBuffer_spriteHeights[0];
		var0.palette = TaskHandler.SpriteBuffer_spritePalette;
		var0.pixels = class92.SpriteBuffer_pixels[0];
		Username.SpriteBuffer_xOffsets = null;
		class335.SpriteBuffer_yOffsets = null;
		class335.SpriteBuffer_spriteWidths = null;
		class335.SpriteBuffer_spriteHeights = null;
		TaskHandler.SpriteBuffer_spritePalette = null;
		class92.SpriteBuffer_pixels = null;
		return var0;
	}
}
