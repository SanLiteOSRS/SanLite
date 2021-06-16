import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1770922261
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)I",
		garbageValue = "163760748"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)I",
		garbageValue = "-1545273649"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
