import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1138996141
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1047624505
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1499775571
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1264391023
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -336804817
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1743079855
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1982831053
	)
	@Export("z")
	int z;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1475288121
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1798816539
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("a")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = class13.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class14.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-453540716"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3812()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-842208187"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class13.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	public GraphicsObject() {
	}
}
