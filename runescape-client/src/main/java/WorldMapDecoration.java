import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 621533651
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -31802257
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1589480589
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "90246290"
	)
	static void method5034() {
		if (Login.clearLoginScreen) { // L: 310
			class155.titleboxSprite = null; // L: 311
			Login.field964 = null; // L: 312
			Login.field942 = null; // L: 313
			Login.leftTitleSprite = null; // L: 314
			WorldMapLabelSize.rightTitleSprite = null; // L: 315
			Login.logoSprite = null; // L: 316
			class169.title_muteSprite = null; // L: 317
			class128.field1508 = null; // L: 318
			class472.field4868 = null; // L: 319
			Timer.worldSelectBackSprites = null; // L: 320
			class162.worldSelectFlagSprites = null; // L: 321
			World.worldSelectArrows = null; // L: 322
			Frames.worldSelectStars = null; // L: 323
			ModeWhere.field4514 = null; // L: 324
			class325.loginScreenRunesAnimation.method2514(); // L: 325
			class169.method3521(0, 100); // L: 326
			Fonts.method9109().method7212(true); // L: 327
			Login.clearLoginScreen = false; // L: 328
		}
	} // L: 329

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-848566446"
	)
	public static int method5032(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 69
		int var1 = (int)(var2 >>> 14 & 3L); // L: 71
		return var1; // L: 73
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "-69"
	)
	static void method5033(class93 var0) {
		if (Client.field553 != var0) { // L: 2023
			Client.field553 = var0; // L: 2024
		}
	} // L: 2025
}
