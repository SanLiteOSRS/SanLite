import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class290 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1163473009
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -423935109
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Bounds field3364;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "138356035"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (ClanChannel.World_request == null) { // L: 31
				ClanChannel.World_request = class245.urlRequester.request(new URL(VerticalAlignment.field2070));
			} else if (ClanChannel.World_request.isDone()) { // L: 33
				byte[] var0 = ClanChannel.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class88.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class88.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				class156.sortWorlds(class88.World_worlds, 0, class88.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				ClanChannel.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			ClanChannel.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V",
		garbageValue = "35"
	)
	static final void method5598(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 10448
			if (Client.menuOptionsCount < 500) { // L: 10449
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 10450
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 10451
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 10452
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 10453
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 10454
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 10455
				Client.field655[Client.menuOptionsCount] = var6; // L: 10456
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 10457
				++Client.menuOptionsCount; // L: 10458
			}

		}
	} // L: 10460
}
