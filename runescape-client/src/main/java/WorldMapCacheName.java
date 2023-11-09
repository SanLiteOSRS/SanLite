import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final WorldMapCacheName field3064;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final WorldMapCacheName field3058;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final WorldMapCacheName field3062;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final WorldMapCacheName field3061;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final WorldMapCacheName field3060;
	@ObfuscatedName("ag")
	static int[][][] field3059;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static SpritePixels[] field3065;
	@ObfuscatedName("ap")
	@Export("name")
	public final String name;

	static {
		field3064 = new WorldMapCacheName("details"); // L: 4
		field3058 = new WorldMapCacheName("compositemap"); // L: 5
		field3062 = new WorldMapCacheName("compositetexture"); // L: 6
		field3061 = new WorldMapCacheName("area"); // L: 7
		field3060 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
