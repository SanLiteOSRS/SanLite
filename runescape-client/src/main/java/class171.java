import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class171 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static EvictingDualNodeHashTable field1813;

	static {
		field1813 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Lui;",
		garbageValue = "58"
	)
	@Export("FillMode_values")
	public static class542[] FillMode_values() {
		return new class542[]{class542.SOLID, class542.field5263, class542.field5261}; // L: 15
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "250910255"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = World.World_worlds[var6]; // L: 181
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 182
			World.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				World var11 = World.World_worlds[var9]; // L: 186
				int var12 = World.compareWorlds(var11, var8, var2, var3); // L: 188
				int var10;
				if (var12 != 0) { // L: 189
					if (var3) { // L: 190
						var10 = -var12; // L: 191
					} else {
						var10 = var12; // L: 195
					}
				} else if (var4 == -1) { // L: 199
					var10 = 0; // L: 200
				} else {
					int var13 = World.compareWorlds(var11, var8, var4, var5); // L: 203
					if (var5) { // L: 204
						var10 = -var13;
					} else {
						var10 = var13; // L: 205
					}
				}

				if (var10 <= 0) { // L: 207
					World var14 = World.World_worlds[var9]; // L: 208
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 209
					World.World_worlds[var7++] = var14; // L: 210
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 214
			World.World_worlds[var7] = var8; // L: 215
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 216
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 217
		}

	} // L: 219

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "8624389"
	)
	protected static final int method3569() {
		return GameEngine.field191.method358(); // L: 170
	}
}
