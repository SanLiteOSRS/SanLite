import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1057177113
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("af")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1725051245
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1611368783
	)
	int field2992;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -59640323
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -662263473
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -133587621
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 996897801
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1365352597
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ag")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ai")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.field2992 = -16777216; // L: 13
		this.zoom = -1; // L: 14
		this.origin = null; // L: 15
		this.regionLowX = Integer.MAX_VALUE; // L: 16
		this.regionHighX = 0; // L: 17
		this.regionLowY = Integer.MAX_VALUE; // L: 18
		this.regionHighY = 0; // L: 19
		this.isMain = false; // L: 20
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-73404425"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 24
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 26
		this.origin = new Coord(var1.readInt()); // L: 27
		this.backGroundColor = var1.readInt(); // L: 28
		this.field2992 = var1.readInt(); // L: 29
		var1.readUnsignedByte(); // L: 30
		this.isMain = var1.readUnsignedByte() == 1; // L: 31
		this.zoom = var1.readUnsignedByte(); // L: 32
		int var3 = var1.readUnsignedByte(); // L: 33
		this.sections = new LinkedList(); // L: 34

		for (int var4 = 0; var4 < var3; ++var4) { // L: 35
			this.sections.add(this.readWorldMapSection(var1)); // L: 36
		}

		this.setBounds(); // L: 38
	} // L: 39

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)Llg;",
		garbageValue = "10"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 42
		WorldMapSectionType var3 = (WorldMapSectionType)KitDefinition.findEnumerated(WorldMapSectionType.method5645(), var2); // L: 43
		Object var4 = null; // L: 44
		switch(var3.type) { // L: 45
		case 0:
			var4 = new class276(); // L: 49
			break;
		case 1:
			var4 = new WorldMapSection1(); // L: 55
			break; // L: 56
		case 2:
			var4 = new WorldMapSection0(); // L: 52
			break; // L: 53
		case 3:
			var4 = new WorldMapSection2(); // L: 58
			break;
		default:
			throw new IllegalStateException(""); // L: 47
		}

		((WorldMapSection)var4).read(var1); // L: 61
		return (WorldMapSection)var4; // L: 62
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "65"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 66

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 74
			}

			var5 = (WorldMapSection)var4.next(); // L: 67
		} while(!var5.containsCoord(var1, var2, var3)); // L: 69

		return true; // L: 70
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "-13886"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 78
		int var4 = var2 / 64; // L: 79
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 80
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 81
				Iterator var5 = this.sections.iterator(); // L: 82

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 90
					}

					var6 = (WorldMapSection)var5.next(); // L: 83
				} while(!var6.containsPosition(var1, var2)); // L: 85

				return true; // L: 86
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-113"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 94

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 102
			}

			var5 = (WorldMapSection)var4.next(); // L: 95
		} while(!var5.containsCoord(var1, var2, var3)); // L: 97

		return var5.getBorderTileLengths(var1, var2, var3); // L: 98
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "-1391344468"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 106

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) { // L: 113
				return null; // L: 114
			}

			var4 = (WorldMapSection)var3.next(); // L: 107
		} while(!var4.containsPosition(var1, var2)); // L: 109

		return var4.coord(var1, var2); // L: 110
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "23363700"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 118

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 119
			var2.expandBounds(this); // L: 121
		}

	} // L: 124

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "836452097"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 127
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-398903554"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 131
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "550968046"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 135
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1142403848"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 139
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 143
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1302557600"
	)
	int method5332() {
		return this.field2992; // L: 147
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1970577740"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 151
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 155
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1750296729"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 159
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2145980313"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 163
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-83"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 167
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1234536362"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 171
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1626609722"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "905163595"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 179
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "2145767834"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 183
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "28"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 172
			class307.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175
}
