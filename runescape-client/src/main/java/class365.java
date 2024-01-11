import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class365 {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field3973;

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1803457629"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class93.clientPreferences.method2549() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3839
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3840
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3841
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3842
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3843
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3844
			++Client.soundEffectCount; // L: 3845
		}

	} // L: 3847

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class16.method219(); // L: 9109
		Client.menuActions[0] = "Cancel"; // L: 9110
		Client.menuTargets[0] = ""; // L: 9111
		Client.menuOpcodes[0] = 1006; // L: 9112
		Client.menuShiftClick[0] = false; // L: 9113
		Client.menuOptionsCount = 1; // L: 9114
	} // L: 9115
}
