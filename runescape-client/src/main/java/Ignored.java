import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1713746187
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)I",
		garbageValue = "-315070761"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)I",
		garbageValue = "114"
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
		descriptor = "([BI)[I",
		garbageValue = "-957986123"
	)
	public static int[] method8066(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) { // L: 168
			int[] var1 = new int[var0.length]; // L: 171

			for (int var2 = 0; var2 < var0.length; ++var2) { // L: 172
				if (var0[var2] < 0 || var0[var2] > class538.field5229.length) { // L: 173
					return null; // L: 174
				}

				var1[var2] = class538.field5229[var0[var2]]; // L: 176
			}

			return var1; // L: 178
		} else {
			return null; // L: 169
		}
	}
}
