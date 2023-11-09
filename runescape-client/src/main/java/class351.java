import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public enum class351 implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	field3838(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	field3842(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	field3837(2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	field3835(3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	field3836(4);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 653675519
	)
	final int field3840;

	class351(int var3) {
		this.field3840 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3840; // L: 19
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lhs;B)Z",
		garbageValue = "113"
	)
	static boolean method6852(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 591
			int[] var1 = var0.transforms; // L: 593

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 594
				int var3 = var1[var2]; // L: 595
				ObjectComposition var4 = WorldMapSection2.getObjectDefinition(var3); // L: 597
				if (var4.mapIconId != -1) { // L: 598
					return true; // L: 599
				}
			}
		} else if (var0.mapIconId != -1) { // L: 605
			return true; // L: 606
		}

		return false; // L: 608
	}
}
