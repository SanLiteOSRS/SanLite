import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2054928513
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Llz;S)I",
		garbageValue = "-7783"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Llt;I)I",
		garbageValue = "1200801892"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
