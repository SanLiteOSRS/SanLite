import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1645630793
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 544938599
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 917498307
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1816433785
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1360942911
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1769987357
	)
	@Export("z")
	int z;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -511691401
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -338146921
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("au")
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
		int var8 = VarbitComposition.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = MilliClock.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1268630388"
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
				if (this.frame >= this.sequenceDefinition.method4065()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarbitComposition.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIILdz;I)V",
		garbageValue = "-527389665"
	)
	static void method2116(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3762
			if (var0.field2257 != null && var1 < var0.field2257.length && var0.field2257[var1] != null) { // L: 3763
				int var5 = var0.field2257[var1].field2109 & 31; // L: 3764
				if ((var5 <= 0 || class30.clientPreferences.method2572() != 0) && (var5 != 0 || class30.clientPreferences.method2622() != 0)) { // L: 3765
					class94.method2453(var0.field2257[var1], var2, var3, var4 == VarpDefinition.localPlayer); // L: 3766
				}
			}
		}
	} // L: 3767

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1215891921"
	)
	static void method2114(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2]; // L: 8420
		if (var6 != null) { // L: 8421
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) { // L: 8422 8423 8428
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) { // L: 8424
					var7.quantity = var5; // L: 8425
					break;
				}
			}

			class73.method2117(var0, var1, var2); // L: 8430
		}

	} // L: 8432

	public GraphicsObject() {
	}
}
