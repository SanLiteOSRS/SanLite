import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
class class432 implements Comparator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class431 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	class432(class431 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-2140651191"
	)
	int method7999(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method7999((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}
}
