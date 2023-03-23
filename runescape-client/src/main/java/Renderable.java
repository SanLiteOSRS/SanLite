import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1104252123
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("dh")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ao")
	static int method4554(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 69
	}
}
