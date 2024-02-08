import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2669;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2671;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2670;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	static final WorldMapCacheName field2673;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	public static final WorldMapCacheName field2672;
	@ObfuscatedName("hm")
	static String field2676;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = -532013549
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ar")
	@Export("name")
	public final String name;

	static {
		field2669 = new WorldMapCacheName("details"); // L: 4
		field2671 = new WorldMapCacheName("compositemap"); // L: 5
		field2670 = new WorldMapCacheName("compositetexture"); // L: 6
		field2673 = new WorldMapCacheName("area"); // L: 7
		field2672 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13
}
