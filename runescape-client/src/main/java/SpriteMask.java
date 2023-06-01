import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -442270899
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 233923751
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ar")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ab")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1067
		this.height = var2; // L: 1068
		this.xWidths = var3; // L: 1069
		this.xStarts = var4; // L: 1070
	} // L: 1071

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2119533265"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1074
			int var3 = this.xStarts[var2]; // L: 1075
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1076
				return true;
			}
		}

		return false; // L: 1078
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	static void method6055() {
		if (Login.clearLoginScreen) { // L: 280
			class330.titleboxSprite = null; // L: 281
			class157.field1731 = null; // L: 282
			Login.field885 = null; // L: 283
			class305.leftTitleSprite = null; // L: 284
			class362.rightTitleSprite = null; // L: 285
			Login.logoSprite = null; // L: 286
			class33.title_muteSprite = null; // L: 287
			Login.field887 = null; // L: 288
			UserComparator10.field1443 = null; // L: 289
			class12.worldSelectBackSprites = null; // L: 290
			class294.worldSelectFlagSprites = null; // L: 291
			class148.worldSelectArrows = null; // L: 292
			FontName.worldSelectStars = null; // L: 293
			FloorUnderlayDefinition.field2088 = null; // L: 294
			SecureRandomCallable.loginScreenRunesAnimation.method2416(); // L: 295
			ItemContainer.method2222(2); // L: 296
			class299.method5759(true); // L: 297
			Login.clearLoginScreen = false; // L: 298
		}
	} // L: 299
}
