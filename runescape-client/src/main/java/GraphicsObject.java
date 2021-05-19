import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 652996061
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 791668409
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -188159569
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1936566135
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1356555865
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2049551863
	)
	@Export("height")
	int height;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 938422053
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1003613529
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("q")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = Friend.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = Player.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1887073818"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Friend.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmo;III)I",
		garbageValue = "-1747152974"
	)
	static int method1937(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Lof;",
		garbageValue = "104"
	)
	static IndexedSprite method1938() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class396.SpriteBuffer_spriteWidth;
		var0.height = class396.SpriteBuffer_spriteHeight;
		var0.xOffset = class243.SpriteBuffer_xOffsets[0];
		var0.yOffset = class396.SpriteBuffer_yOffsets[0];
		var0.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class372.SpriteBuffer_spriteHeights[0];
		var0.palette = AccessFile.SpriteBuffer_spritePalette;
		var0.pixels = class396.SpriteBuffer_pixels[0];
		class243.SpriteBuffer_xOffsets = null;
		class396.SpriteBuffer_yOffsets = null;
		ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
		class372.SpriteBuffer_spriteHeights = null;
		AccessFile.SpriteBuffer_spritePalette = null;
		class396.SpriteBuffer_pixels = null;
		return var0;
	}
}
