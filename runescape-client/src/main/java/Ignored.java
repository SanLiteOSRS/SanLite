import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1108684561
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lks;I)I",
		garbageValue = "-204847170"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Lju;I)I",
		garbageValue = "-1545516578"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
