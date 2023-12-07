import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -760217247
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1322973095
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1889541897
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1464920783
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1449357735
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -609987307
	)
	@Export("z")
	int z;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -202407843
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1223932003
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("az")
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
		int var8 = Canvas.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = DynamicObject.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
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
				if (this.frame >= this.sequenceDefinition.method4064()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Canvas.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-39"
	)
	public static boolean method2128(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 9
	}

	public GraphicsObject() {
	}
}
