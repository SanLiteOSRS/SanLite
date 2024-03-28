import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class203 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1976190519
	)
	public static int field2080;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1180056437"
	)
	static final void method3843(int var0) {
		if (var0 >= 0) { // L: 9425
			int var1 = Client.menuArguments1[var0]; // L: 9426
			int var2 = Client.menuArguments2[var0]; // L: 9427
			int var3 = Client.menuOpcodes[var0]; // L: 9428
			int var4 = Client.menuIdentifiers[var0]; // L: 9429
			int var5 = Client.field602[var0]; // L: 9430
			String var6 = Client.menuActions[var0]; // L: 9431
			String var7 = Client.menuTargets[var0]; // L: 9432
			CollisionMap.method4359(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9433
		}
	} // L: 9434
}
