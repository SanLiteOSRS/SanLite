import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1993208527
	)
	static int field2516;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 30245019
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("af")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1046103495
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1588698159
	)
	int field2505;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 470698669
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1426613693
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 647809487
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2082099409
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1097772665
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("an")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ad")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.field2505 = -16777216; // L: 13
		this.zoom = -1; // L: 14
		this.origin = null; // L: 15
		this.regionLowX = Integer.MAX_VALUE; // L: 16
		this.regionHighX = 0; // L: 17
		this.regionLowY = Integer.MAX_VALUE; // L: 18
		this.regionHighY = 0; // L: 19
		this.isMain = false; // L: 20
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "1333488747"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 24
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 26
		this.origin = new Coord(var1.readInt()); // L: 27
		this.backGroundColor = var1.readInt(); // L: 28
		this.field2505 = var1.readInt(); // L: 29
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljd;",
		garbageValue = "131071"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 42
		WorldMapSectionType var3 = (WorldMapSectionType)GrandExchangeEvents.findEnumerated(WorldMapSectionType.method4985(), var2); // L: 43
		Object var4 = null; // L: 44
		switch(var3.type) { // L: 45
		case 0:
			var4 = new WorldMapSection1(); // L: 52
			break; // L: 53
		case 1:
			var4 = new WorldMapSection0(); // L: 55
			break; // L: 56
		case 2:
			var4 = new class243(); // L: 49
			break;
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
		garbageValue = "10"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 66

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 73
				return false; // L: 74
			}

			var5 = (WorldMapSection)var4.next(); // L: 67
		} while(!var5.containsCoord(var1, var2, var3)); // L: 69

		return true; // L: 70
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1584054510"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lmu;",
		garbageValue = "44"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "550290297"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 118

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 119
			var2.expandBounds(this); // L: 121
		}

	} // L: 124

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1326520224"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 127
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1460044081"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 131
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1709987285"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 135
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "69"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 139
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1309784879"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 143
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-99914285"
	)
	int method4690() {
		return this.field2505; // L: 147
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2073876228"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 151
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-106"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 155
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1605275765"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 159
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1705736926"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 163
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1487952028"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 167
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 171
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-543157203"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 175
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-901241814"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 179
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lmu;",
		garbageValue = "421546103"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 183
	}
}
