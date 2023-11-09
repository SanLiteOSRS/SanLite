import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public enum class500 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5073(1, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5074(2, 2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -894516731
	)
	public final int field5072;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1089213109
	)
	final int field5075;

	class500(int var3, int var4) {
		this.field5072 = var3; // L: 19
		this.field5075 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5075; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-456739970"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78
}
