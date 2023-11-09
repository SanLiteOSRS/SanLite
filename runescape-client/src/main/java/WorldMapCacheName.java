import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final WorldMapCacheName field3053;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final WorldMapCacheName field3049;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final WorldMapCacheName field3050;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	static final WorldMapCacheName field3051;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	public static final WorldMapCacheName field3052;
	@ObfuscatedName("ax")
	@Export("name")
	public final String name;

	static {
		field3053 = new WorldMapCacheName("details"); // L: 4
		field3049 = new WorldMapCacheName("compositemap"); // L: 5
		field3050 = new WorldMapCacheName("compositetexture"); // L: 6
		field3051 = new WorldMapCacheName("area"); // L: 7
		field3052 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
