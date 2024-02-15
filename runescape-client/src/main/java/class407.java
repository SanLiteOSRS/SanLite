import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public final class class407 {
	@ObfuscatedName("aq")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("aw")
	static long[] field4545;
	@ObfuscatedName("ah")
	public static short[][] field4547;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4545 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4545.length; ++var0) { // L: 8
			field4545[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1415554526"
	)
	static final void method7643() {
		Client.field649 = 0; // L: 5756
		int var0 = Projectile.baseX * 64 + (VarpDefinition.localPlayer.x >> 7); // L: 5757
		int var1 = GameEngine.baseY * 8 + (VarpDefinition.localPlayer.y >> 7); // L: 5758
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5759
			Client.field649 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5760
			Client.field649 = 1;
		}

		if (Client.field649 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5761
			Client.field649 = 0;
		}

	} // L: 5762

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V",
		garbageValue = "582658753"
	)
	static void method7638(class67 var0) {
		if (Client.field558 != var0) { // L: 12972
			Client.field558 = var0; // L: 12973
		}
	} // L: 12974
}
