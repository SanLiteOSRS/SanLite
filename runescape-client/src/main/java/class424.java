import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public final class class424 implements Comparable {
	@ObfuscatedName("ai")
	Object field4602;
	@ObfuscatedName("aj")
	Object field4604;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 6701481019085942225L
	)
	long field4603;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -2091064314036313917L
	)
	long field4605;

	class424(Object var1, Object var2) {
		this.field4602 = var1; // L: 10
		this.field4604 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)I",
		garbageValue = "-133025551"
	)
	int method7821(class424 var1) {
		if (this.field4605 < var1.field4605) {
			return -1; // L: 15
		} else {
			return this.field4605 > var1.field4605 ? 1 : 0; // L: 16 17
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class424) { // L: 22
			return this.field4604.equals(((class424)var1).field4604);
		} else {
			throw new IllegalArgumentException(); // L: 23
		}
	}

	public int hashCode() {
		return this.field4604.hashCode(); // L: 28
	}

	public int compareTo(Object var1) {
		return this.method7821((class424)var1); // L: 32
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lcp;",
		garbageValue = "-1657434890"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}
}
