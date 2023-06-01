import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 1816315523
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 189323421
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ar")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1746307439
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 130327669
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1402090919
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1853019501
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -365920779
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1517119393
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ad")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("aw")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0; // L: 16
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0; // L: 18
		this.isMain = false; // L: 19
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;IB)V",
		garbageValue = "96"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte(); // L: 28
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)Lkr;",
		garbageValue = "1548957566"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)class217.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection2(); // L: 49
			break;
		case 1:
			var5 = new WorldMapSection0(); // L: 57
			break; // L: 58
		case 2:
			var5 = new class259(); // L: 60
			break;
		case 3:
			var5 = new WorldMapSection1(); // L: 52
			break; // L: 53
		default:
			throw new IllegalStateException(""); // L: 55
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "1"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 68

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "62"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64;
		int var4 = var2 / 64;
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) {
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) {
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 92
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2)); // L: 87

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1072706715"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 96

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 104
			}

			var5 = (WorldMapSection)var4.next(); // L: 97
		} while(!var5.containsCoord(var1, var2, var3)); // L: 99

		return var5.getBorderTileLengths(var1, var2, var3); // L: 100
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lms;",
		garbageValue = "48"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 108

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 116
			}

			var4 = (WorldMapSection)var3.next(); // L: 109
		} while(!var4.containsPosition(var1, var2)); // L: 111

		return var4.coord(var1, var2); // L: 112
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "815391866"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1886247316"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-564926152"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "14"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "85"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1590121338"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-957173445"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "345335585"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "965190934"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1468077398"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-22"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1271317533"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "957874980"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "504893262"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CLor;I)C",
		garbageValue = "67541752"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 82
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-330184740"
	)
	public static int method5173(int var0) {
		return class452.field4736[var0 & 16383]; // L: 37
	}
}
