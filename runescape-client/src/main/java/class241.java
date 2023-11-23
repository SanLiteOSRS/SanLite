import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class241 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "87176655"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class542.World_request == null) { // L: 32
				class542.World_request = class60.urlRequester.request(new URL(class228.field2415));
			} else if (class542.World_request.isDone()) { // L: 34
				byte[] var0 = class542.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				class361.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = class361.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				class181.sortWorlds(class361.World_worlds, 0, class361.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				class542.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			class542.World_request = null; // L: 58
		}

		return false; // L: 60
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-209283109"
	)
	static boolean method4832(Date var0) {
		java.util.Calendar var2 = java.util.Calendar.getInstance(); // L: 1482
		var2.set(2, 0); // L: 1483
		var2.set(5, 1); // L: 1484
		var2.set(1, 1900); // L: 1485
		Date var1 = var2.getTime(); // L: 1486
		return var0.after(var1); // L: 1489
	}
}
