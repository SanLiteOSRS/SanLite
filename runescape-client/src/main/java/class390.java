import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
public class class390 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	static ClanChannel field4425;
	@ObfuscatedName("o")
	float[] field4424;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -631319871
	)
	int field4426;

	class390(float[] var1, int var2) {
		this.field4424 = var1; // L: 10
		this.field4426 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "87"
	)
	public static void method7091(String[] var0, int[] var1) {
		PlayerComposition.method5610(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "86652899"
	)
	static boolean method7092(int var0) {
		for (int var1 = 0; var1 < Client.field722; ++var1) { // L: 11469
			if (Client.field724[var1] == var0) { // L: 11470
				return true;
			}
		}

		return false; // L: 11472
	}
}
