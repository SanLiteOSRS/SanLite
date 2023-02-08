import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgk;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;I)I",
		garbageValue = "1470653167"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2091853460"
	)
	static void method6672(boolean var0) {
		byte var1 = 0; // L: 1039
		if (!ClanSettings.method3293()) { // L: 1040
			var1 = 12; // L: 1041
		} else if (Decimator.client.method1723() || Decimator.client.isOtlTokenRequesterInitialized() || Decimator.client.method1217()) { // L: 1043
			var1 = 10; // L: 1044
		}

		ReflectionCheck.method696(var1); // L: 1046
		if (var0) { // L: 1047
			Login.Login_username = ""; // L: 1048
			Login.Login_password = ""; // L: 1049
			UserComparator4.field1429 = 0; // L: 1050
			InvDefinition.otp = ""; // L: 1051
		}

		FriendSystem.method1908(); // L: 1053
		class361.method6967(); // L: 1054
	} // L: 1055

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "984160518"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 5780
		int var4 = var1 >> 7; // L: 5781
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 5782
			int var5 = var2; // L: 5783
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 5784
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 5785
			int var7 = var1 & 127; // L: 5786
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7; // L: 5787
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7; // L: 5788
			return var9 * var7 + var8 * (128 - var7) >> 7; // L: 5789
		} else {
			return 0;
		}
	}
}
