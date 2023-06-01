import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
class class408 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpn;)V"
	)
	class408(class407 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "102"
	)
	int method7665(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method7665((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}
}
