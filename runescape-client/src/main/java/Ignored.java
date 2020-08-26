import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1266323763
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkk;I)I",
		garbageValue = "1464728446"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
