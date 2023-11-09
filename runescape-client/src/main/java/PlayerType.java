import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("PlayerType")
public enum PlayerType implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4109(6, 22, false, false, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4101(7, 41, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4102(8, 42, false, false, true),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4103(9, 43, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4104(10, 44, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4105(11, 45, false, false, true),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4106(12, 46, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4107(13, 47, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4094(14, 48, false, false, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4108(15, 49, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	field4110(16, 52, false, false, true);

	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 618402991
	)
	@Export("id")
	final int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1398686511
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("m")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("q")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 34
		this.modIcon = var4; // L: 35
		this.isPrivileged = var6; // L: 36
		this.isUser = var7; // L: 37
	} // L: 38

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 42
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1845544647"
	)
	static void method6274() {
		if (Login.clearLoginScreen) { // L: 247
			class356.titleboxSprite = null; // L: 248
			class143.field1647 = null; // L: 249
			class239.field2845 = null; // L: 250
			class313.leftTitleSprite = null; // L: 251
			HealthBar.rightTitleSprite = null; // L: 252
			MouseRecorder.logoSprite = null; // L: 253
			class16.title_muteSprite = null; // L: 254
			Login.field908 = null; // L: 255
			class181.field1931 = null; // L: 256
			DirectByteArrayCopier.worldSelectBackSprites = null; // L: 257
			CollisionMap.worldSelectFlagSprites = null; // L: 258
			MouseRecorder.worldSelectArrows = null; // L: 259
			SpotAnimationDefinition.worldSelectStars = null; // L: 260
			WorldMapManager.field2822 = null; // L: 261
			GraphicsObject.loginScreenRunesAnimation.method2344(); // L: 262
			class283.musicPlayerStatus = 1; // L: 264
			DevicePcmPlayerProvider.musicTrackArchive = null; // L: 265
			class283.musicTrackGroupId = -1; // L: 266
			class283.musicTrackFileId = -1; // L: 267
			Messages.musicTrackVolume = 0; // L: 268
			GrandExchangeEvents.musicTrackBoolean = false; // L: 269
			class19.pcmSampleLength = 2; // L: 270
			MouseHandler.method697(true); // L: 272
			Login.clearLoginScreen = false; // L: 273
		}
	} // L: 274
}
