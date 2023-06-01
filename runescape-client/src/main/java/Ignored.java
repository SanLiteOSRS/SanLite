import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1072664549
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)I",
		garbageValue = "93816907"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)I",
		garbageValue = "-12064581"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2079100743"
	)
	public static float method7936(int var0) {
		var0 &= 16383; // L: 24
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D); // L: 25
	}
}
