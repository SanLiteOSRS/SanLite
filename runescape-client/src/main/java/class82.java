import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public enum class82 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field1065(0, -1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field1072(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field1062(2, 7),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field1063(3, 8),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field1064(4, 9);

	@ObfuscatedName("cv")
	static boolean field1066;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 363781995
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1358235955
	)
	final int field1061;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 199557243
	)
	final int field1069;

	class82(int var3, int var4) {
		this.field1061 = var3; // L: 20
		this.field1069 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1069; // L: 26
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	protected static final void method2078() {
		class433.clock.mark(); // L: 432

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 433
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 434
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 435
	} // L: 436
}
