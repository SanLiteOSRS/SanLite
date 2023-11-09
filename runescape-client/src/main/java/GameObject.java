import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1864133043
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1769154667
	)
	@Export("z")
	int z;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -472121489
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1527155529
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -835257591
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1451034711
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1873413133
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1389612741
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 675535951
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1098759017
	)
	int field2806;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 187670921
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -7754761910240207891L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -799893141
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "395481445"
	)
	static void method4831() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 318
			if (StructComposition.clientPreferences.method2430() != null) { // L: 319
				Login.Login_username = StructComposition.clientPreferences.method2430(); // L: 320
				Client.Login_isUsernameRemembered = true; // L: 321
			} else {
				Client.Login_isUsernameRemembered = false; // L: 323
			}

		}
	} // L: 324

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Lcg;B)V",
		garbageValue = "4"
	)
	static void method4832(NPC var0) {
		var0.field1181 = var0.definition.size; // L: 8704
		var0.field1249 = var0.definition.rotation; // L: 8705
		if (var0.field1249 == 0) { // L: 8706
			var0.rotation = 0;
		}

		var0.walkSequence = var0.definition.walkSequence; // L: 8707
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 8708
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 8709
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 8710
		var0.idleSequence = var0.definition.idleSequence; // L: 8711
		var0.turnLeftSequence = var0.definition.turnLeftSequence; // L: 8712
		var0.turnRightSequence = var0.definition.turnRightSequence; // L: 8713
		var0.runSequence = var0.definition.field2035; // L: 8714
		var0.field1191 = var0.definition.field2038; // L: 8715
		var0.field1201 = var0.definition.field2039; // L: 8716
		var0.field1193 = var0.definition.field2040; // L: 8717
		var0.field1194 = var0.definition.field2041; // L: 8718
		var0.field1195 = var0.definition.field2042; // L: 8719
		var0.field1226 = var0.definition.field2043; // L: 8720
		var0.field1197 = var0.definition.field2044; // L: 8721
	} // L: 8722
}
