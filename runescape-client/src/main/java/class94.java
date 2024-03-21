import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class94 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2451() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 303

			for (int var0 = 0; var0 < class33.idxCount; ++var0) { // L: 304
				class173.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 305
			JagexCache.JagexCache_randomDat.close(); // L: 306
		} catch (Exception var2) { // L: 308
		}

	} // L: 309

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "877422910"
	)
	public static int method2452(int var0, int var1, int var2) {
		int var3 = class315.method6060(var2 - var1 + 1); // L: 70
		var3 <<= var1; // L: 71
		var0 |= var3; // L: 72
		return var0; // L: 73
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-15452"
	)
	static void method2450() {
		Players.Players_count = 0; // L: 686

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 687
			Players.field1389[var0] = null; // L: 688
			Players.field1378[var0] = class233.field2470; // L: 689
		}

	} // L: 691

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIZS)V",
		garbageValue = "12148"
	)
	static void method2453(class202 var0, int var1, int var2, boolean var3) {
		if (var0 != null) { // L: 3780
			if (var0.field2109 == 0) { // L: 3781
				if (!var3) { // L: 3782
					return; // L: 3783
				}

				Client.soundLocations[Client.soundEffectCount] = 0; // L: 3785
			} else {
				int var4 = (var1 - 64) / 128; // L: 3788
				int var5 = (var2 - 64) / 128; // L: 3789
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2109 + (var4 << 16); // L: 3790
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2107; // L: 3792
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2108; // L: 3793
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3794
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3795
			Client.field554[Client.soundEffectCount] = var0.field2113; // L: 3796
			++Client.soundEffectCount; // L: 3797
		}
	} // L: 3798
}
