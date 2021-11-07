import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2210;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2211;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2215;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	static final WorldMapCacheName field2213;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	public static final WorldMapCacheName field2214;
	@ObfuscatedName("g")
	@Export("name")
	public final String name;

	static {
		field2210 = new WorldMapCacheName("details");
		field2211 = new WorldMapCacheName("compositemap");
		field2215 = new WorldMapCacheName("compositetexture");
		field2213 = new WorldMapCacheName("area");
		field2214 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "605723533"
	)
	public static void method4027() {
		class247.midiPcmStream.clear();
		class247.musicPlayerStatus = 1;
		class128.musicTrackArchive = null;
	}
}
