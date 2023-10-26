import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3095;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3091;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3090;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	static final WorldMapCacheName field3093;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	public static final WorldMapCacheName field3094;
	@ObfuscatedName("ah")
	@Export("name")
	public final String name;

	static {
		field3095 = new WorldMapCacheName("details"); // L: 4
		field3091 = new WorldMapCacheName("compositemap"); // L: 5
		field3090 = new WorldMapCacheName("compositetexture"); // L: 6
		field3093 = new WorldMapCacheName("area"); // L: 7
		field3094 = new WorldMapCacheName("labels"); // L: 8
	}

	WorldMapCacheName(String var1) {
		this.name = var1; // L: 12
	} // L: 13

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[BLrw;B)V",
		garbageValue = "21"
	)
	static void method5717(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 21
		var3.type = 0; // L: 22
		var3.key = (long)var0; // L: 23
		var3.data = var1; // L: 24
		var3.archiveDisk = var2; // L: 25
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 26
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 27
		} // L: 28

		class87.method2311(); // L: 29
	} // L: 30
}
