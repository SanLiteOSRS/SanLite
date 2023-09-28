import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -1717515341
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 768863193
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ak")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1722496541
	)
	int field2933;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1517544639
	)
	int field2934;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1199981927
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 372936079
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 895762939
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1140483929
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -465829911
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("aa")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ap")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.field2933 = -1; // L: 12
		this.field2934 = -16777216; // L: 13
		this.zoom = -1; // L: 14
		this.origin = null; // L: 15
		this.regionLowX = Integer.MAX_VALUE; // L: 16
		this.regionHighX = 0; // L: 17
		this.regionLowY = Integer.MAX_VALUE; // L: 18
		this.regionHighY = 0; // L: 19
		this.isMain = false; // L: 20
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;IZI)V",
		garbageValue = "1729868446"
	)
	public void method5266(Buffer var1, int var2, boolean var3) {
		this.id = var2; // L: 24
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 26
		this.origin = new Coord(var1.readInt()); // L: 27
		this.field2933 = var1.readInt(); // L: 28
		if (var3) { // L: 29
			this.field2934 = var1.readInt(); // L: 30
		}

		var1.readUnsignedByte(); // L: 32
		this.isMain = var1.readUnsignedByte() == 1; // L: 33
		this.zoom = var1.readUnsignedByte(); // L: 34
		int var4 = var1.readUnsignedByte(); // L: 35
		this.sections = new LinkedList(); // L: 36

		for (int var5 = 0; var5 < var4; ++var5) { // L: 37
			this.sections.add(this.readWorldMapSection(var1)); // L: 38
		}

		this.setBounds(); // L: 40
	} // L: 41

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Llm;",
		garbageValue = "-358116235"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 44
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE1}; // L: 47
		WorldMapSectionType var4 = (WorldMapSectionType)SequenceDefinition.findEnumerated(var3, var2); // L: 49
		Object var5 = null; // L: 50
		switch(var4.type) { // L: 51
		case 0:
			var5 = new WorldMapSection2(); // L: 59
			break; // L: 60
		case 1:
			var5 = new WorldMapSection0(); // L: 53
			break;
		case 2:
			var5 = new WorldMapSection1(); // L: 56
			break; // L: 57
		case 3:
			var5 = new class274(); // L: 64
			break;
		default:
			throw new IllegalStateException(""); // L: 62
		}

		((WorldMapSection)var5).read(var1); // L: 67
		return (WorldMapSection)var5; // L: 68
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "18238"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 72

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) { // L: 79
				return false; // L: 80
			}

			var5 = (WorldMapSection)var4.next(); // L: 73
		} while(!var5.containsCoord(var1, var2, var3)); // L: 75

		return true; // L: 76
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1010823945"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 84
		int var4 = var2 / 64; // L: 85
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 86
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 87
				Iterator var5 = this.sections.iterator(); // L: 88

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 96
					}

					var6 = (WorldMapSection)var5.next(); // L: 89
				} while(!var6.containsPosition(var1, var2)); // L: 91

				return true; // L: 92
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "150153753"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 100

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 108
			}

			var5 = (WorldMapSection)var4.next(); // L: 101
		} while(!var5.containsCoord(var1, var2, var3)); // L: 103

		return var5.getBorderTileLengths(var1, var2, var3); // L: 104
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "-1645849130"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 112

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 120
			}

			var4 = (WorldMapSection)var3.next(); // L: 113
		} while(!var4.containsPosition(var1, var2)); // L: 115

		return var4.coord(var1, var2); // L: 116
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "834208858"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 124

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 125
			var2.expandBounds(this); // L: 127
		}

	} // L: 130

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-20045"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 133
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-105"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 137
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "47"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 141
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1404403293"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 145
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2113761361"
	)
	int method5317() {
		return this.field2933; // L: 149
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-293473033"
	)
	int method5277() {
		return this.field2934; // L: 153
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "220732046"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 157
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "112"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 161
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 165
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 169
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-90"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 173
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-23241120"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 177
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 181
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 185
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "1687888353"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 189
	}
}
