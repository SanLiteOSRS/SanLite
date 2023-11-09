import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
final class class100 implements class301 {
	@ObfuscatedName("n")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("k")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	static IndexedSprite field1335;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	class100(Widget var1) {
		this.val$cc = var1; // L: 508
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1666573426"
	)
	public void vmethod5862() {
		if (this.val$cc != null && this.val$cc.method6228().field3479 != null) { // L: 510
			ScriptEvent var1 = new ScriptEvent(); // L: 511
			var1.method2313(this.val$cc); // L: 512
			var1.setArgs(this.val$cc.method6228().field3479); // L: 513
			class12.method171().addFirst(var1); // L: 514
		}

	} // L: 516

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-121"
	)
	public static void method2724() {
		class488.SpriteBuffer_xOffsets = null; // L: 207
		ApproximateRouteStrategy.SpriteBuffer_yOffsets = null; // L: 208
		FriendsList.SpriteBuffer_spriteWidths = null; // L: 209
		class132.SpriteBuffer_spriteHeights = null; // L: 210
		SpriteBuffer_spritePalette = null; // L: 211
		class140.SpriteBuffer_pixels = null; // L: 212
	} // L: 213
}
