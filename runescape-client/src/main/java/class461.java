import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class461 {
	@ObfuscatedName("w")
	static final int[] field4893;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1068091111
	)
	static int field4894;

	static {
		field4893 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, -1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 5
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-933528912"
	)
	static void method8491(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 4005
			int var3 = var0 >> 8; // L: 4006
			int var4 = var0 >> 4 & 7; // L: 4007
			int var5 = var0 & 15; // L: 4008
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 4009
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 4010
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 4011
			Client.soundEffects[Client.soundEffectCount] = null; // L: 4012
			int var6 = (var1 - 64) / 128; // L: 4013
			int var7 = (var2 - 64) / 128; // L: 4014
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 4015
			++Client.soundEffectCount; // L: 4016
		}
	} // L: 4017
}
