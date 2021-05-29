import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final WorldMapCacheName field2137;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final WorldMapCacheName field2132;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final WorldMapCacheName field2134;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static final WorldMapCacheName field2131;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	public static final WorldMapCacheName field2135;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;

	static {
		field2137 = new WorldMapCacheName("details");
		field2132 = new WorldMapCacheName("compositemap");
		field2134 = new WorldMapCacheName("compositetexture");
		field2131 = new WorldMapCacheName("area");
		field2135 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Lio;B)V",
		garbageValue = "90"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field849) {
			Client.field719[var0.rootIndex] = true;
		}

	}
}
