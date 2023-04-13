import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	public static final WorldMapCacheName field3019;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	public static final WorldMapCacheName field3014;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	public static final WorldMapCacheName field3016;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static final WorldMapCacheName field3013;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	public static final WorldMapCacheName field3017;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;

	static {
		field3019 = new WorldMapCacheName("details"); // L: 4
		field3014 = new WorldMapCacheName("compositemap"); // L: 5
		field3016 = new WorldMapCacheName("compositetexture"); // L: 6
		field3013 = new WorldMapCacheName("area"); // L: 7
		field3017 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "295942057"
	)
	public static boolean method5296() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 24
		return var0 != null; // L: 25
	}
}
