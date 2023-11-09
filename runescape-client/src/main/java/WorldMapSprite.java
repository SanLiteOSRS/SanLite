import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("aj")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "29"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 19
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "111"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 64
		int[] var3 = new int[4]; // L: 65
		var2[0] = var0; // L: 66
		var3[0] = var1; // L: 67
		int var4 = 1; // L: 68

		for (int var5 = 0; var5 < 4; ++var5) { // L: 69
			if (World.World_sortOption1[var5] != var0) { // L: 70
				var2[var4] = World.World_sortOption1[var5]; // L: 71
				var3[var4] = World.World_sortOption2[var5]; // L: 72
				++var4; // L: 73
			}
		}

		World.World_sortOption1 = var2; // L: 76
		World.World_sortOption2 = var3; // L: 77
		class106.sortWorlds(class16.World_worlds, 0, class16.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 78
	} // L: 79
}
