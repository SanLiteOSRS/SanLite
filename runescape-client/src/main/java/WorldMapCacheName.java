import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3054;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3058;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3055;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final WorldMapCacheName field3056;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	public static final WorldMapCacheName field3053;
	@ObfuscatedName("ab")
	@Export("name")
	public final String name;

	static {
		field3054 = new WorldMapCacheName("details"); // L: 4
		field3058 = new WorldMapCacheName("compositemap"); // L: 5
		field3055 = new WorldMapCacheName("compositetexture"); // L: 6
		field3056 = new WorldMapCacheName("area"); // L: 7
		field3053 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
