import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class460 {
	@ObfuscatedName("at")
	float field4758;
	@ObfuscatedName("ah")
	float field4759;
	@ObfuscatedName("ar")
	float field4760;

	static {
		new class460(0.0F, 0.0F, 0.0F); // L: 5
		new class460(1.0F, 1.0F, 1.0F); // L: 9
		new class460(1.0F, 0.0F, 0.0F); // L: 13
		new class460(0.0F, 1.0F, 0.0F); // L: 17
		new class460(0.0F, 0.0F, 1.0F); // L: 21
	} // L: 26

	class460(float var1, float var2, float var3) {
		this.field4758 = var1; // L: 33
		this.field4759 = var2; // L: 34
		this.field4760 = var3; // L: 35
	} // L: 36

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "56"
	)
	final float method8402() {
		return (float)Math.sqrt((double)(this.field4760 * this.field4760 + this.field4759 * this.field4759 + this.field4758 * this.field4758)); // L: 39
	}

	public String toString() {
		return this.field4758 + ", " + this.field4759 + ", " + this.field4760; // L: 44
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-986184126"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapIcon_1.clientPreferences.method2556() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3701
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3702
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3703
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3704
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3705
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3706
			++Client.soundEffectCount; // L: 3707
		}

	} // L: 3709
}
