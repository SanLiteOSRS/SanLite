import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 567189365
	)
	@Export("id")
	int id;
	@ObfuscatedName("h")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("w")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 25779945
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -265908139
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2010353697
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1119275097
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1280794219
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1477951297
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("d")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("a")
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "9983538"
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
	} // L: 37

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)Lim;",
		garbageValue = "700625358"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)GameEngine.findEnumerated(WorldMapSectionType.method4874(), var2); // L: 41
		Object var4 = null; // L: 42
		switch(var3.type) { // L: 43
		case 0:
			var4 = new WorldMapSection1(); // L: 56
			break;
		case 1:
			var4 = new WorldMapSection2(); // L: 53
			break; // L: 54
		case 2:
			var4 = new WorldMapSection0(); // L: 47
			break;
		case 3:
			var4 = new class228(); // L: 50
			break; // L: 51
		default:
			throw new IllegalStateException(""); // L: 45
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "428800392"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 71
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2102592598"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 76
		int var4 = var2 / 64; // L: 77
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 78
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 79
				Iterator var5 = this.sections.iterator(); // L: 80

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 88
					}

					var6 = (WorldMapSection)var5.next(); // L: 81
				} while(!var6.containsPosition(var1, var2)); // L: 83

				return true; // L: 84
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "72"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 99
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;",
		garbageValue = "988180686"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 104

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) { // L: 111
				return null; // L: 112
			}

			var4 = (WorldMapSection)var3.next(); // L: 105
		} while(!var4.containsPosition(var1, var2)); // L: 107

		return var4.coord(var1, var2); // L: 108
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1801027745"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "25933"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1367820704"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1306086529"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-21816"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-833261903"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-898923248"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16034"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "851913129"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "90"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 165
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2146368821"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1795139080"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lku;",
		garbageValue = "206318306"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}
}
