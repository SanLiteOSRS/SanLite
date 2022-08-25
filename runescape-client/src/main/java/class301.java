import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class301 {
	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1080968526"
	)
	public static boolean method5664(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field128[var0] : false; // L: 236 237
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-981838319"
	)
	static final void method5663(int var0, int var1, int var2, int var3) {
		Client.field601 = 0; // L: 5392
		int var4 = Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7); // L: 5393
		int var5 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7); // L: 5394
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5395
			Client.field601 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 5396
			Client.field601 = 1;
		}

		if (Client.field601 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5397
			Client.field601 = 0;
		}

	} // L: 5399
}
