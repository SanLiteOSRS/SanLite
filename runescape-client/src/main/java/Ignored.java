import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1657208759
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lru;I)I",
		garbageValue = "497005894"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "111"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
