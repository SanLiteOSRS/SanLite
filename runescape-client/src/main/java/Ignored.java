import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("gj")
	static String field4610;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -724417875
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)I",
		garbageValue = "-516310647"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)I",
		garbageValue = "615597391"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
