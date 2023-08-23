import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -1500772979
	)
	static int field2916;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 318342769
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ao")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1879737221
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -57065415
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -970396571
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1612980305
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1545324723
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1385317393
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ad")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("aq")
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;IB)V",
		garbageValue = "-21"
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
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Lkw;",
		garbageValue = "2096840833"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE3}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)class25.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new class260(); // L: 52
			break; // L: 53
		case 1:
			var5 = new WorldMapSection0(); // L: 55
			break; // L: 56
		case 2:
			var5 = new WorldMapSection2(); // L: 49
			break;
		case 3:
			var5 = new WorldMapSection1(); // L: 58
			break; // L: 59
		default:
			throw new IllegalStateException(""); // L: 61
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "367578160"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 68

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 76
			}

			var5 = (WorldMapSection)var4.next(); // L: 69
		} while(!var5.containsCoord(var1, var2, var3)); // L: 71

		return true; // L: 72
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "770144654"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 80
		int var4 = var2 / 64; // L: 81
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 82
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 83
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) { // L: 84
						return false; // L: 92
					}

					var6 = (WorldMapSection)var5.next(); // L: 85
				} while(!var6.containsPosition(var1, var2)); // L: 87

				return true; // L: 88
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1546478082"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "1756558235"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-338264651"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) { // L: 125
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-846319025"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1901446023"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "22"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1846298842"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-797170066"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "69"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1630610237"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-439375988"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2074797827"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "123"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "-1932226468"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1197510480"
	)
	static void method5176(int var0) {
	} // L: 32

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-41"
	)
	public static boolean method5162() {
		boolean var0 = false; // L: 146
		boolean var1 = false; // L: 147
		if (!class305.field3406.isEmpty()) { // L: 148
			class406 var2 = (class406)class305.field3406.get(0); // L: 149
			if (var2 == null) { // L: 150
				class305.field3406.remove(0); // L: 151
			} else if (var2.vmethod7621()) { // L: 153
				if (var2.method7598()) { // L: 154
					System.out.println("Error in midimanager.service: " + var2.method7595()); // L: 155
					var0 = true; // L: 156
				} else {
					if (var2.method7600() != null) { // L: 159
						class305.field3406.add(1, var2.method7600()); // L: 160
					}

					var1 = var2.method7603(); // L: 162
				}

				class305.field3406.remove(0); // L: 164
			} else {
				var1 = var2.method7603(); // L: 167
			}
		}

		if (var0) { // L: 170
			class305.field3406.clear(); // L: 171
			ByteArrayPool.method7671(); // L: 172
		}

		return var1; // L: 174
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lmi;IIB)V",
		garbageValue = "116"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 11108
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 11109
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 11110
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 11111
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 11112
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 11113
		}

		if (var0.yAlignment == 0) { // L: 11114
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 11115
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 11116
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 11117
		} else if (var0.yAlignment == 4) { // L: 11118
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 11119
		}

	} // L: 11120
}
