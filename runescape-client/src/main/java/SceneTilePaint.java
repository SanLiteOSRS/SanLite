import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("jk")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2013504147
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1549439477
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1522386339
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 965064125
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1669670065
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ap")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 499123279
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmb;II)V",
		garbageValue = "-1277532143"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3678 == null) { // L: 1233
			throw new RuntimeException(); // L: 1234
		} else {
			if (var0.field3669 == null) { // L: 1236
				var0.field3669 = new int[var0.field3678.length]; // L: 1237
			}

			var0.field3669[var1] = Integer.MAX_VALUE; // L: 1239
		}
	} // L: 1240

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11358
	}
}
