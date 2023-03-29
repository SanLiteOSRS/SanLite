import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class332 {
	@ObfuscatedName("fs")
	public static String field3882;
	@ObfuscatedName("lm")
	public static String field3852;
	@ObfuscatedName("lb")
	public static String field4081;
	@ObfuscatedName("ld")
	public static String field4082;

	static {
		field3882 = "Please visit the support page for assistance."; // L: 137
		field3852 = ""; // L: 300
		field4081 = "Page has opened in the browser."; // L: 301
		field4082 = ""; // L: 302
	} // L: 343

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1715180489"
	)
	protected static final void method6352() {
		GameEngine.clock.mark(); // L: 437

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 438
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 439
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 440
	} // L: 441
}
