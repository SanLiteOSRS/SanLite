import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 494289481
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -770993721
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2046486035
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 467633941
	)
	@Export("x")
	int x;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1569589891
	)
	@Export("height")
	int height;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1673763885
	)
	@Export("y")
	int y;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ljg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -300375293
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 687860479
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("t")
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
		int var8 = HealthBarUpdate.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class105.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-825901935"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = HealthBarUpdate.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("eb")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1882927898"
	)
	static int method2122() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field953;
		} else {
			return 10000;
		}
	}
}
