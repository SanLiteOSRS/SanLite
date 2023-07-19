import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1953722191
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)I",
		garbageValue = "2137597398"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqh;S)I",
		garbageValue = "-24941"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
