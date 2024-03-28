import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
class class440 implements Comparator {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 1293834423
	)
	static int field4745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	final class439 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	class440(class439 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I",
		garbageValue = "29"
	)
	int method7988(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method7988((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}
}
