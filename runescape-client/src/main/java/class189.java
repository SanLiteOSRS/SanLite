import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class189 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1954197098
	)
	public static int field1993;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1843088055
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1995;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1999;

	static {
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1866297780"
	)
	public static int method3782(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047; // L: 11
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-63"
	)
	static int method3781(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 33
			var1 /= 2;
		}

		if (var2 > 192) { // L: 34
			var1 /= 2;
		}

		if (var2 > 217) { // L: 35
			var1 /= 2;
		}

		if (var2 > 243) { // L: 36
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 37
		return var3; // L: 38
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1281145259"
	)
	static final void method3780() {
		Client.packetWriter.close(); // L: 2900
		LoginPacket.method5997(); // L: 2901
		GrandExchangeOfferOwnWorldComparator.scene.clear(); // L: 2902

		for (int var0 = 0; var0 < 4; ++var0) { // L: 2903
			Client.collisionMaps[var0].clear();
		}

		Client.field608.method4407(); // L: 2904
		System.gc(); // L: 2905
		Actor.method2488(0, 0); // L: 2906
		FontName.method9049(); // L: 2907
		Client.playingJingle = false; // L: 2908
		WorldMapSection1.method5058(); // L: 2909
		class131.method3087(10); // L: 2910
		KitDefinition.method3664().method4283(); // L: 2911
		KitDefinition.method3664().method4284(); // L: 2912
	} // L: 2913
}
