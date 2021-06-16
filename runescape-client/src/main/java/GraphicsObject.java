import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("p")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1904705757
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -117960567
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1714081181
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -868861481
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1366179757
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 774867755
	)
	@Export("height")
	int height;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1955367267
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1076483913
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("d")
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
		int var8 = Tiles.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = WorldMapScaleHandler.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1850791831"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Tiles.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-651642471"
	)
	static final void method2014() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				FriendSystem.method1875(var0);
			} else {
				var0.remove();
			}
		}

	}
}
