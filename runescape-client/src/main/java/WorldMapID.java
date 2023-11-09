import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final WorldMapID field3038;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final WorldMapID field3037;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1792000537
	)
	@Export("value")
	final int value;

	static {
		field3038 = new WorldMapID(0); // L: 4
		field3037 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
