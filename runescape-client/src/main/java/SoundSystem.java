import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 654329935
	)
	static int field311;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			MusicPatchNode.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1352771764"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 32
				World.World_request = class327.urlRequester.request(new URL(class134.field1589));
			} else if (World.World_request.isDone()) { // L: 34
				byte[] var0 = World.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				class16.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = class16.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				class106.sortWorlds(class16.World_worlds, 0, class16.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				World.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			World.World_request = null; // L: 58
		}

		return false; // L: 60
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-342450183"
	)
	public static int method858(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}
}
