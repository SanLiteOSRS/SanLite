import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class211 extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1989373155
	)
	public int field2326;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1801761393
	)
	public int field2328;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 545315863
	)
	public int field2329;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	public Widget field2330;

	@ObfuscatedSignature(
		descriptor = "(IIILme;)V"
	)
	public class211(int var1, int var2, int var3, Widget var4) {
		this.field2329 = var1; // L: 15
		this.field2326 = var2; // L: 16
		this.field2328 = var3; // L: 17
		this.field2330 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "2"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (ScriptFrame.clientPreferences.method2518() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3740
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3741
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3742
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3743
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3744
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3745
			++Client.soundEffectCount; // L: 3746
		}

	} // L: 3748

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lme;III)V",
		garbageValue = "1038624782"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11104
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11105
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11106
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11107
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11108
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11109
		}

		if (var0.yAlignment == 0) { // L: 11110
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11111
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11112
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11113
		} else if (var0.yAlignment == 4) { // L: 11114
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11115
		}

	} // L: 11116
}
