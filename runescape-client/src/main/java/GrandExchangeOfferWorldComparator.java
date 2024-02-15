import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 45362085
	)
	static int field4449;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;B)I",
		garbageValue = "16"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1); // L: 28
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 32
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgc;",
		garbageValue = "1"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else if (KitDefinition.field1905 == null) { // L: 37
			return null;
		} else {
			byte[] var2 = KitDefinition.field1905.takeFile(3, var0); // L: 38
			var1 = new KitDefinition(); // L: 39
			if (var2 != null) {
				var1.decode(new Buffer(var2)); // L: 40
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-51"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11482
	}
}
