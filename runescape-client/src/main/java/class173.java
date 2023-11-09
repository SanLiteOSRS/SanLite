import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class173 {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ac")
	public String field1855;
	@ObfuscatedName("au")
	public float[] field1856;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2118017977
	)
	public int field1858;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1691846909
	)
	public int field1859;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1845750621
	)
	public int field1853;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgy;)V"
	)
	class173(class166 var1) {
		this.this$0 = var1;
		this.field1856 = new float[4]; // L: 358
		this.field1858 = 1; // L: 359
		this.field1859 = 1; // L: 360
		this.field1853 = 0; // L: 361
	} // L: 363

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-955607746"
	)
	public static int method3587(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("aw")
	public static boolean method3588(long var0) {
		boolean var2 = 0L != var0; // L: 52
		if (var2) { // L: 53
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 56
			var2 = !var3; // L: 58
		}

		return var2; // L: 60
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	public static void method3589() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 345
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 346
	} // L: 347

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	static void method3586() {
		if (Client.oculusOrbState == 1) { // L: 12183
			Client.field585 = true; // L: 12184
		}

	} // L: 12186
}
