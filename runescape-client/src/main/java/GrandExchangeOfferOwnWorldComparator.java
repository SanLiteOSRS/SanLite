import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("af")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12318

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;B)I",
		garbageValue = "24"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12321
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12322
				if (Client.worldId == var1.world) { // L: 12323
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12324
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12326
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12334
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12330
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "-1584507403"
	)
	static int method1229(AbstractArchive var0) {
		int var1 = Login.field925.length + Login.field924.length; // L: 167
		String[] var2 = Login.field926; // L: 169

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 170
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) { // L: 173
				++var1; // L: 174
			}
		}

		return var1; // L: 179
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "-1881594254"
	)
	static boolean method1228(String var0, int var1) {
		return RouteStrategy.method4288(var0, var1, "openjs"); // L: 54
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294656591"
	)
	static final void method1224() {
		VerticalAlignment.method3825("You can't add yourself to your own ignore list"); // L: 171
	} // L: 172

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2009858192"
	)
	static void method1227(boolean var0) {
		Client.field630 = var0; // L: 12245
	} // L: 12246
}
