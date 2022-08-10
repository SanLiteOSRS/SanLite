import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class93 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 35694819
	)
	int field1274;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -408613469
	)
	int field1278;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2021987133
	)
	int field1275;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -731606081
	)
	int field1273;

	class93(int var1, int var2, int var3, int var4) {
		this.field1274 = var1; // L: 10
		this.field1278 = var2; // L: 11
		this.field1275 = var3; // L: 12
		this.field1273 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "394317880"
	)
	int method2444() {
		return this.field1274; // L: 17
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	int method2449() {
		return this.field1278; // L: 21
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	int method2445() {
		return this.field1275; // L: 25
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-39"
	)
	int method2446() {
		return this.field1273; // L: 29
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;B)V",
		garbageValue = "54"
	)
	public static void method2463(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1811 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "644386651"
	)
	public static final void method2461() {
		ViewportMouse.ViewportMouse_isInViewport = false; // L: 103
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 104
	} // L: 105

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIII)V",
		garbageValue = "406698264"
	)
	static void method2443(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class260.clientPreferences.method2329() != 0) { // L: 3697
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3698
				int var4 = var0.soundEffects[var1]; // L: 3699
				if (var4 != 0) { // L: 3703
					int var7 = var4 >> 8; // L: 3704
					int var8 = var4 >> 4 & 7; // L: 3705
					int var9 = var4 & 15; // L: 3706
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3707
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3708
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3709
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3710
					int var10 = (var2 - 64) / 128; // L: 3711
					int var11 = (var3 - 64) / 128; // L: 3712
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3713
					++Client.soundEffectCount; // L: 3714
				}

			}
		}
	} // L: 3716
}
