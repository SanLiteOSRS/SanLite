import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -330515405
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnx;B)I",
		garbageValue = "-55"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)I",
		garbageValue = "1115853399"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
