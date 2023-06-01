import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	static final DefaultsGroup field4656;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1669406075
	)
	@Export("group")
	final int group;

	static {
		field4656 = new DefaultsGroup(3); // L: 4
	}

	DefaultsGroup(int var1) {
		this.group = var1; // L: 8
	} // L: 9

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "494858742"
	)
	static int method8055(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 915
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 916
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "64"
	)
	static final int method8056(int var0) {
		return Math.min(Math.max(var0, 128), 383); // L: 3870
	}
}
