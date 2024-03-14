import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -742669757
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -2031042560
	)
	static int field2529;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1126254039
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("al")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1068589839
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 931249201
	)
	int field2519;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 861571211
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -383105749
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1166465137
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1938615999
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -232622987
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ah")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("aj")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.field2519 = -16777216; // L: 13
		this.zoom = -1; // L: 14
		this.origin = null; // L: 15
		this.regionLowX = Integer.MAX_VALUE; // L: 16
		this.regionHighX = 0; // L: 17
		this.regionLowY = Integer.MAX_VALUE; // L: 18
		this.regionHighY = 0; // L: 19
		this.isMain = false; // L: 20
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)V",
		garbageValue = "-18"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 24
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 26
		this.origin = new Coord(var1.readInt()); // L: 27
		this.backGroundColor = var1.readInt(); // L: 28
		this.field2519 = var1.readInt(); // L: 29
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Lkv;",
		garbageValue = "-1516038777"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 42
		WorldMapSectionType var3 = (WorldMapSectionType)class356.findEnumerated(WorldMapSectionType.method4994(), var2); // L: 43
		Object var4 = null; // L: 44
		switch(var3.type) { // L: 45
		case 0:
			var4 = new WorldMapSection1(); // L: 47
			break;
		case 1:
			var4 = new WorldMapSection2(); // L: 53
			break; // L: 54
		case 2:
			var4 = new class245(); // L: 50
			break; // L: 51
		case 3:
			var4 = new WorldMapSection0(); // L: 56
			break; // L: 57
		default:
			throw new IllegalStateException(""); // L: 59
		}

		((WorldMapSection)var4).read(var1); // L: 61
		return (WorldMapSection)var4; // L: 62
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "728381007"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "541613775"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-7"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 94

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 101
				return null; // L: 102
			}

			var5 = (WorldMapSection)var4.next(); // L: 95
		} while(!var5.containsCoord(var1, var2, var3)); // L: 97

		return var5.getBorderTileLengths(var1, var2, var3); // L: 98
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Lns;",
		garbageValue = "-1376413085"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 106

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 114
			}

			var4 = (WorldMapSection)var3.next(); // L: 107
		} while(!var4.containsPosition(var1, var2)); // L: 109

		return var4.coord(var1, var2); // L: 110
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "65"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 118

		while (var1.hasNext()) { // L: 123
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 119
			var2.expandBounds(this); // L: 121
		}

	} // L: 124

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1487997510"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 127
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-254552801"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 131
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "68"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 135
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1555399985"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 139
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-750004589"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 143
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	int method4707() {
		return this.field2519; // L: 147
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1413123352"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 151
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-13105"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 155
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-82"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 159
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1237133339"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 163
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-109"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 167
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1062403635"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 171
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 175
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 179
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lns;",
		garbageValue = "59"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 183
	}
}
