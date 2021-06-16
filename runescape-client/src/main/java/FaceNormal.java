import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1056687123
	)
	@Export("pcmSampleLength")
	static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1204882397
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 126335521
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -301502337
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "-1897650462"
	)
	public static void method4252(AbstractArchive var0) {
		GrandExchangeOfferUnitPriceComparator.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "67"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) {
				World.World_request = ArchiveDiskActionHandler.urlRequester.request(new URL(class162.field1936));
			} else if (World.World_request.isDone()) {
				byte[] var0 = World.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				FileSystem.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				World.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			World.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1748496485"
	)
	public static int method4253(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}
}
