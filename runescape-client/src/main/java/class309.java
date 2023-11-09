import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class309 {
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 32378295
	)
	static int field3464;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -1834949039
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1508199261
	)
	int field3463;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	class53 field3462;

	@ObfuscatedSignature(
		descriptor = "(ILcg;)V"
	)
	class309(int var1, class53 var2) {
		this.field3463 = var1; // L: 10
		this.field3462 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)V",
		garbageValue = "-322106248"
	)
	public static void method6019(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 67
		class154.field1710 = var1; // L: 68
	} // L: 69

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "14"
	)
	static final void method6018(int var0, int var1, int var2, int var3) {
		Client.field727 = 0; // L: 5728
		int var4 = class166.baseX * 64 + (class27.localPlayer.x >> 7); // L: 5729
		int var5 = class9.baseY * 64 + (class27.localPlayer.y >> 7); // L: 5730
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5731
			Client.field727 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field727 = 1; // L: 5732
		}

		if (Client.field727 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5733
			Client.field727 = 0;
		}

	} // L: 5735
}
