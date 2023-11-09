import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class497 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1647907932"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 31
				World.World_request = class47.urlRequester.request(new URL(class512.field5098));
			} else if (World.World_request.isDone()) { // L: 33
				byte[] var0 = World.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				ClanChannel.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				World.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			World.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	static boolean method8848() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5194
	}
}
