import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1269976827
	)
	static int field1049;

	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097515012"
	)
	static void method2285() {
		if (DecorativeObject.field2871 != null) { // L: 12860
			Client.field814 = Client.cycle; // L: 12861
			DecorativeObject.field2871.method7120(); // L: 12862

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12863
				if (Client.players[var0] != null) { // L: 12864
					DecorativeObject.field2871.method7119(class20.baseX * 64 + (Client.players[var0].x >> 7), class19.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12865
				}
			}
		}

	} // L: 12869
}
