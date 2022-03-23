import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -291144419
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-264858177"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnc;S)I",
		garbageValue = "-8912"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
