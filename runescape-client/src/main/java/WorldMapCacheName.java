import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final WorldMapCacheName field2867;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final WorldMapCacheName field2861;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final WorldMapCacheName field2863;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	static final WorldMapCacheName field2866;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	public static final WorldMapCacheName field2864;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 350469975
	)
	static int field2862;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = -1050242269
	)
	static int field2868;
	@ObfuscatedName("w")
	@Export("name")
	public final String name;

	static {
		field2867 = new WorldMapCacheName("details"); // L: 4
		field2861 = new WorldMapCacheName("compositemap"); // L: 5
		field2863 = new WorldMapCacheName("compositetexture"); // L: 6
		field2866 = new WorldMapCacheName("area"); // L: 7
		field2864 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-849774060"
	)
	static int method5048(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field843 - 7.0D) * 256.0D); // L: 3850
	}
}
