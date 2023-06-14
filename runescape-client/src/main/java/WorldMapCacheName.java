import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public static final WorldMapCacheName field3049;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public static final WorldMapCacheName field3044;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public static final WorldMapCacheName field3045;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final WorldMapCacheName field3046;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public static final WorldMapCacheName field3047;
	@ObfuscatedName("jy")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ap")
	@Export("name")
	public final String name;

	static {
		field3049 = new WorldMapCacheName("details"); // L: 4
		field3044 = new WorldMapCacheName("compositemap"); // L: 5
		field3045 = new WorldMapCacheName("compositetexture"); // L: 6
		field3046 = new WorldMapCacheName("area"); // L: 7
		field3047 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1038180461"
	)
	public static byte[] method5532() {
		byte[] var0 = new byte[24]; // L: 282

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 284
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 285

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 286 287 288
			}

			if (var1 >= 24) { // L: 290
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 293
				var0[var2] = -1;
			}
		}

		return var0; // L: 295
	}
}
