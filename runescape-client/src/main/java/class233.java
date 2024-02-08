import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class233 implements Comparator {
	@ObfuscatedName("am")
	@Export("javaVendor")
	public static String javaVendor;

	class233() {
	} // L: 39

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Liv;Liv;I)I",
		garbageValue = "381751439"
	)
	int method4578(class228 var1, class228 var2) {
		return var1.method4498() - var2.method4498(); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method4578((class228)var1, (class228)var2); // L: 46
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1139421000"
	)
	static final int method4588() {
		if (class93.clientPreferences.method2535()) { // L: 5124
			return class113.Client_plane;
		} else {
			int var0 = class19.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, class113.Client_plane); // L: 5125
			return var0 - KeyHandler.cameraY < 800 && (Tiles.Tiles_renderFlags[class113.Client_plane][GameEngine.cameraX >> 7][GrandExchangeOfferTotalQuantityComparator.cameraZ >> 7] & 4) != 0 ? class113.Client_plane : 3; // L: 5126 5127
		}
	}
}
