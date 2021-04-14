import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("d")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("c")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("j")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		signature = "(Lnu;Lnu;IZI)V",
		garbageValue = "-1186228166"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		signature = "(Lnu;ZI)V",
		garbageValue = "-770265064"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method6597();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "1"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) {
				World.World_request = class32.urlRequester.request(new URL(class244.field2909));
			} else if (World.World_request.isDone()) {
				byte[] var0 = World.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class9.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class9.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class208.sortWorlds(class9.World_worlds, 0, class9.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				World.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			World.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1371665339"
	)
	public static void method3212() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)V",
		garbageValue = "1280452567"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < UserComparator8.ItemDefinition_fileCount; ++var4) {
			ItemComposition var5 = class23.ItemDefinition_get(var4);
			if ((!var1 || var5.isTradable) && var5.noteTemplate == -1 && var5.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					ItemLayer.foundItemIdCount = -1;
					class19.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class19.foundItemIds = var2;
		class203.foundItemIndex = 0;
		ItemLayer.foundItemIdCount = var3;
		String[] var8 = new String[ItemLayer.foundItemIdCount];

		for (int var9 = 0; var9 < ItemLayer.foundItemIdCount; ++var9) {
			var8[var9] = class23.ItemDefinition_get(var2[var9]).name;
		}

		short[] var10 = class19.foundItemIds;
		class283.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
