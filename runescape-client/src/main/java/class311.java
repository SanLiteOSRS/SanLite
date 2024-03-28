import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class311 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3308;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3302;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3306;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3305;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3314;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3307;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3304;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3309;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3310;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3311;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	public static final class311 field3312;
	@ObfuscatedName("bs")
	protected static String field3313;

	static {
		field3308 = new class311(2); // L: 5
		field3302 = new class311(7); // L: 6
		field3306 = new class311(4); // L: 7
		field3305 = new class311(14); // L: 8
		field3314 = new class311(14); // L: 9
		field3307 = new class311(6); // L: 10
		field3304 = new class311(11); // L: 11
		field3309 = new class311(4); // L: 12
		field3310 = new class311(20); // L: 13
		field3311 = new class311(7); // L: 14
		field3312 = new class311(5);
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class311(int var1) {
	} // L: 21

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1749693616"
	)
	public static int method5914(int var0) {
		return (var0 & class528.field5182) - 1; // L: 26
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lim;IIZI)V",
		garbageValue = "-487508352"
	)
	static void method5913(class220 var0, int var1, int var2, boolean var3) {
		if (var0 != null) { // L: 3834
			if (var0.field2241 == 0) { // L: 3835
				if (!var3) { // L: 3836
					return; // L: 3837
				}

				Client.soundLocations[Client.soundEffectCount] = 0; // L: 3839
			} else {
				int var4 = (var1 - 64) / 128; // L: 3842
				int var5 = (var2 - 64) / 128; // L: 3843
				Client.soundLocations[Client.soundEffectCount] = (var5 << 8) + var0.field2241 + (var4 << 16); // L: 3844
			}

			Client.soundEffectIds[Client.soundEffectCount] = var0.field2244; // L: 3846
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var0.field2242; // L: 3847
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3848
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3849
			Client.field770[Client.soundEffectCount] = var0.field2243; // L: 3850
			++Client.soundEffectCount; // L: 3851
		}
	} // L: 3852
}
