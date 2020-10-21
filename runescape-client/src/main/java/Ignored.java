import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -235599993
	)
	static int field3637;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 421043005
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkt;I)I",
		garbageValue = "1931682757"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Ljh;B)I",
		garbageValue = "69"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
