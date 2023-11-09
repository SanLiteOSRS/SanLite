import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2872;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2869;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2874;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static final WorldMapCacheName field2871;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	public static final WorldMapCacheName field2868;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -113453181
	)
	static int field2870;
	@ObfuscatedName("q")
	@Export("name")
	public final String name;

	static {
		field2872 = new WorldMapCacheName("details"); // L: 4
		field2869 = new WorldMapCacheName("compositemap"); // L: 5
		field2874 = new WorldMapCacheName("compositetexture"); // L: 6
		field2871 = new WorldMapCacheName("area"); // L: 7
		field2868 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-116"
	)
	static final void method4984(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 157
		VarcInt.addGameMessage(30, "", var1); // L: 159
	} // L: 161
}
