import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public enum class116 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1431(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1423(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1424(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1425(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	field1422(4, 4);

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -773544317
	)
	final int field1427;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2104046389
	)
	final int field1428;

	class116(int var3, int var4) {
		this.field1427 = var3; // L: 137
		this.field1428 = var4; // L: 138
	} // L: 139

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1428; // L: 142
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1056521271"
	)
	static void method2767() {
		Tiles.Tiles_minPlane = 99; // L: 48
		class356.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		Tiles.Tiles_shapes = new byte[4][104][104]; // L: 51
		Tiles.field997 = new byte[4][104][104]; // L: 52
		MouseRecorder.field1060 = new int[4][105][105]; // L: 53
		Tiles.field998 = new byte[4][105][105]; // L: 54
		class295.field3524 = new int[105][105]; // L: 55
		NetFileRequest.Tiles_hue = new int[104]; // L: 56
		class430.Tiles_saturation = new int[104]; // L: 57
		DecorativeObject.Tiles_lightness = new int[104]; // L: 58
		class4.Tiles_hueMultiplier = new int[104]; // L: 59
		Tiles.field999 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "205788425"
	)
	static final void method2763() {
		FriendSystem.method1764(Tiles.field993, ScriptFrame.field461, class122.field1500); // L: 3862
		WorldMapSectionType.method4927(Canvas.field164, class263.field3029); // L: 3863
		if (WorldMapLabelSize.cameraX == Tiles.field993 && ScriptFrame.field461 == class123.cameraY && Widget.cameraZ == class122.field1500 && Canvas.field164 == UserComparator9.cameraPitch && class263.field3029 == PendingSpawn.cameraYaw) { // L: 3864
			Client.field745 = false; // L: 3865
			Client.isCameraLocked = false; // L: 3866
			WorldMapLabelSize.field2673 = 0; // L: 3867
			LoginScreenAnimation.field1233 = 0; // L: 3868
			UrlRequest.field1350 = 0; // L: 3869
			class83.field1082 = 0; // L: 3870
			ScriptFrame.field459 = 0; // L: 3871
			SoundCache.field325 = 0; // L: 3872
			class115.field1419 = 0; // L: 3873
			class457.field4811 = 0; // L: 3874
			NPC.field1261 = 0; // L: 3875
			ScriptEvent.field1052 = 0; // L: 3876
		}

	} // L: 3879

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1547558951"
	)
	static final void method2766(int var0, int var1, int var2, int var3) {
		WorldMapID.method4982(); // L: 5576
	} // L: 5577
}
