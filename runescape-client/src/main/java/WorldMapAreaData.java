import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ae")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ah")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("ap")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ltc;Ltc;IZI)V",
		garbageValue = "-595979658"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ltc;ZI)V",
		garbageValue = "1315072927"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9095(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1826262053"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (WorldMapDecoration.Widget_loadedInterfaces[var0]) { // L: 242
			return true;
		} else if (!ArchiveLoader.Widget_archive.tryLoadGroup(var0)) { // L: 243
			return false;
		} else {
			int var1 = ArchiveLoader.Widget_archive.getGroupFileCount(var0); // L: 244
			if (var1 == 0) { // L: 245
				WorldMapDecoration.Widget_loadedInterfaces[var0] = true; // L: 246
				return true; // L: 247
			} else {
				if (UserComparator6.Widget_interfaceComponents[var0] == null) { // L: 249
					UserComparator6.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 250
					if (UserComparator6.Widget_interfaceComponents[var0][var2] == null) { // L: 251
						byte[] var3 = ArchiveLoader.Widget_archive.takeFile(var0, var2); // L: 252
						if (var3 != null) { // L: 253
							UserComparator6.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 254
							UserComparator6.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 255
							if (var3[0] == -1) { // L: 256
								UserComparator6.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								UserComparator6.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 257
							}
						}
					}
				}

				WorldMapDecoration.Widget_loadedInterfaces[var0] = true; // L: 261
				return true; // L: 262
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lni;III)Z",
		garbageValue = "704838309"
	)
	public static boolean method5599(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 188
		if (var3 == null) {
			return false; // L: 189
		} else {
			ViewportMouse.SpriteBuffer_decode(var3); // L: 190
			return true; // L: 191
		}
	}
}
