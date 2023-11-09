import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class125 {
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		longValue = -1653606137358564459L
	)
	static long field1501;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 788509083
	)
	static int field1499;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -644441085
	)
	static int field1494;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1852442399
	)
	int field1492;
	@ObfuscatedName("ae")
	float field1495;
	@ObfuscatedName("ao")
	float field1503;
	@ObfuscatedName("at")
	float field1493;
	@ObfuscatedName("ac")
	float field1496;
	@ObfuscatedName("ai")
	float field1497;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	class125 field1498;

	class125() {
		this.field1503 = Float.MAX_VALUE; // L: 8
		this.field1493 = Float.MAX_VALUE; // L: 9
		this.field1496 = Float.MAX_VALUE; // L: 10
		this.field1497 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IS)V",
		garbageValue = "249"
	)
	void method2924(Buffer var1, int var2) {
		this.field1492 = var1.readShort(); // L: 17
		this.field1495 = var1.method9066(); // L: 18
		this.field1503 = var1.method9066(); // L: 19
		this.field1493 = var1.method9066(); // L: 20
		this.field1496 = var1.method9066(); // L: 21
		this.field1497 = var1.method9066(); // L: 22
	} // L: 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1201510681"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (WorldMapLabelSize.World_request == null) { // L: 32
				WorldMapLabelSize.World_request = FriendsChatManager.urlRequester.request(new URL(class200.field2121));
			} else if (WorldMapLabelSize.World_request.isDone()) { // L: 34
				byte[] var0 = WorldMapLabelSize.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				class176.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = class176.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				GameEngine.sortWorlds(class176.World_worlds, 0, class176.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				WorldMapLabelSize.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			WorldMapLabelSize.World_request = null; // L: 58
		}

		return false; // L: 60
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-47"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 112
	}
}
