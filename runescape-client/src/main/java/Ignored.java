import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1976990997
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llt;I)I",
		garbageValue = "-338055787"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)I",
		garbageValue = "2074675333"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
