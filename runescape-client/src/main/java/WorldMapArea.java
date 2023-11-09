import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 849917093
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ar")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 898934693
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1787701241
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1354035795
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -527199435
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1541917825
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1923999583
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("aq")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("at")
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "1472949028"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)Lkz;",
		garbageValue = "2141604791"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE2}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)ClientPreferences.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection1(); // L: 58
			break;
		case 1:
			var5 = new WorldMapSection2(); // L: 49
			break;
		case 2:
			var5 = new class261(); // L: 55
			break; // L: 56
		case 3:
			var5 = new WorldMapSection0(); // L: 52
			break; // L: 53
		default:
			throw new IllegalStateException(""); // L: 61
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "2035965907"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1924447461"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 80
		int var4 = var2 / 64; // L: 81
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 82
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 83
				Iterator var5 = this.sections.iterator(); // L: 84

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-40"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lmr;",
		garbageValue = "322661377"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 108

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) { // L: 115
				return null; // L: 116
			}

			var4 = (WorldMapSection)var3.next(); // L: 109
		} while(!var4.containsPosition(var1, var2)); // L: 111

		return var4.coord(var1, var2); // L: 112
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141810509"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-104"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1427046787"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1981016427"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-389390805"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-155817671"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1352292707"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-101"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lmr;",
		garbageValue = "117"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1522833237"
	)
	static final boolean method5212(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 28
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1581255918"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class503.getPacketBufferNode(ClientPacket.field3163, Client.packetWriter.isaacCipher); // L: 10081
		var2.packetBuffer.writeIntME(var1); // L: 10082
		var2.packetBuffer.method9138(var0); // L: 10083
		Client.packetWriter.addNode(var2); // L: 10084
	} // L: 10085
}
