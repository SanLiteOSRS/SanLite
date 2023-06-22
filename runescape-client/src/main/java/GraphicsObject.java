import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class485 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1137608953
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 726894091
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1476422717
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 181165771
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 873930555
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1091336731
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -901968763
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1772951091
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("af")
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
		int var8 = class53.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
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
				if (this.frame >= this.sequenceDefinition.method4084()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class53.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lmb;Lmk;ZI)V",
		garbageValue = "1991291892"
	)
	public static void method2043(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1093
		var0.field3631 = new PlayerComposition(var1); // L: 1094
		if (!var2) { // L: 1095
			var0.field3631.equipment = Arrays.copyOf(var0.field3631.field3544, var0.field3631.field3544.length); // L: 1096
			var0.field3631.method6021(); // L: 1097
		}

	} // L: 1099

	public GraphicsObject() {
	}
}
