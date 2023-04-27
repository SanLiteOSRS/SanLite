import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Players")
public class Players {
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1852915743
	)
	static int field1344;
	@ObfuscatedName("aw")
	static byte[] field1329;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	static class210[] field1332;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lsg;"
	)
	static Buffer[] field1333;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2010934433
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("aq")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 228405989
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("at")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("aa")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ay")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ao")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1474255643
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ai")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static Buffer field1343;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Ltq;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	static class429 field1339;

	static {
		field1329 = new byte[2048]; // L: 18
		field1332 = new class210[2048]; // L: 19
		field1333 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1343 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1943998514"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class11.World_request == null) { // L: 31
				class11.World_request = class14.urlRequester.request(new URL(GrandExchangeOffer.field4294));
			} else if (class11.World_request.isDone()) { // L: 33
				byte[] var0 = class11.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class31.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class31.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				class123.sortWorlds(class31.World_worlds, 0, class31.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class11.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class11.World_request = null; // L: 57
		}

		return false; // L: 59
	}
}
