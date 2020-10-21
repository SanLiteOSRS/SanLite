import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("gd")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1368883061
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1255836875
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1394186747
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1069815711
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1005575771
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 287109355
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -872509349
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lej;"
	)
	@Export("entity1")
	public Renderable entity1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lej;"
	)
	@Export("entity2")
	public Renderable entity2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -3894207238426267157L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -237175035
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "28"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class248.World_request == null) {
				class248.World_request = class52.urlRequester.request(new URL(PcmPlayer.field1436));
			} else if (class248.World_request.isDone()) {
				byte[] var0 = class248.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				DefaultsGroup.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = DefaultsGroup.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				ModeWhere.sortWorlds(DefaultsGroup.World_worlds, 0, DefaultsGroup.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class248.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class248.World_request = null;
		}

		return false;
	}
}
