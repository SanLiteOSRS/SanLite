import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("af")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ax")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("an")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Luq;Luq;IZB)V",
		garbageValue = "43"
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Luq;ZI)V",
		garbageValue = "-1880896362"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9693(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Ldc;",
		garbageValue = "-2047893868"
	)
	static Script method5141(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 65
		if (var2 != null) { // L: 66
			return var2; // L: 67
		} else {
			String var3 = String.valueOf(var0); // L: 69
			int var4 = WorldMapSectionType.archive12.getGroupId(var3); // L: 70
			if (var4 == -1) { // L: 71
				return null; // L: 72
			} else {
				byte[] var5 = WorldMapSectionType.archive12.takeFileFlat(var4); // L: 74
				if (var5 != null) { // L: 75
					if (var5.length <= 1) { // L: 76
						return null; // L: 77
					}

					var2 = class257.newScript(var5); // L: 79
					if (var2 != null) { // L: 80
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 81
						return var2; // L: 82
					}
				}

				return null; // L: 85
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1563955362"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 87
		if (var0 < 0 || var0 >= 65536) { // L: 88
			var0 >>>= 16; // L: 89
			var1 += 16; // L: 90
		}

		if (var0 >= 256) { // L: 92
			var0 >>>= 8; // L: 93
			var1 += 8; // L: 94
		}

		if (var0 >= 16) { // L: 96
			var0 >>>= 4; // L: 97
			var1 += 4; // L: 98
		}

		if (var0 >= 4) { // L: 100
			var0 >>>= 2; // L: 101
			var1 += 2; // L: 102
		}

		if (var0 >= 1) { // L: 104
			var0 >>>= 1; // L: 105
			++var1; // L: 106
		}

		return var0 + var1; // L: 108
	}
}
