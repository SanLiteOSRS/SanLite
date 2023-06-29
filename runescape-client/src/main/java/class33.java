import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class33 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1939122387
	)
	int field167;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1897713439
	)
	int field171;

	class33(int var1, int var2) {
		this.field167 = var1; // L: 14
		this.field171 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbo;I)Z",
		garbageValue = "671391142"
	)
	boolean method457(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field167) { // L: 20
			case 1:
				return var1.vmethod4127(this.field171); // L: 26
			case 2:
				return var1.vmethod4128(this.field171); // L: 28
			case 3:
				return var1.vmethod4145((char)this.field171); // L: 30
			case 4:
				return var1.vmethod4131(this.field171 == 1); // L: 24
			default:
				return false; // L: 22
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4095"
	)
	public static void method460() {
		Widget.Widget_cachedSprites.clear(); // L: 693
		Widget.Widget_cachedModels.clear(); // L: 694
		Widget.Widget_cachedFonts.clear(); // L: 695
		Widget.Widget_cachedSpriteMasks.clear(); // L: 696
	} // L: 697
}
