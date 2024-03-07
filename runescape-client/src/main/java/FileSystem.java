import java.net.URL;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("aq")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("al")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 271657219
	)
	static int field2340;

	static {
		FileSystem_hasPermissions = false; // L: 7
		FileSystem_cacheFiles = new Hashtable(16);
	} // L: 9

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1269877722"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (PacketBufferNode.World_request == null) { // L: 32
				PacketBufferNode.World_request = InvDefinition.urlRequester.request(new URL(HealthBarDefinition.field1922));
			} else if (PacketBufferNode.World_request.isDone()) { // L: 34
				byte[] var0 = PacketBufferNode.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				WorldMapID.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = WorldMapID.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				class186.sortWorlds(WorldMapID.World_worlds, 0, WorldMapID.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				PacketBufferNode.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			PacketBufferNode.World_request = null; // L: 58
		}

		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)Lvd;",
		garbageValue = "-1525220578"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class130.method3074(var0, var1, var2) ? null : Projectile.method2214(); // L: 59 60
	}
}
