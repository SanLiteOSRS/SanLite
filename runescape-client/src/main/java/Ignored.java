import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1512486797
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrb;I)I",
		garbageValue = "2077017602"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)I",
		garbageValue = "-67"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}
}
