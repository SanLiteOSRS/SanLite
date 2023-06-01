import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3028;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3030;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 197044211
	)
	static int field3031;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -891588787
	)
	@Export("value")
	final int value;

	static {
		field3028 = new WorldMapID(0); // L: 4
		field3030 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10
}
