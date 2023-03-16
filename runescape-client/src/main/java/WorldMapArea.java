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
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1364779187
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("ac")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -861936449
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1914508313
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1244824785
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -609305437
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1790684409
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1015122273
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("ak")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("ax")
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "70"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)Lkd;",
		garbageValue = "1493006035"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType var3 = (WorldMapSectionType)SpriteMask.findEnumerated(WorldMapSectionType.method5187(), var2); // L: 41
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new class248(); // L: 45
			break;
		case 1:
			var4 = new WorldMapSection1(); // L: 54
			break; // L: 55
		case 2:
			var4 = new WorldMapSection0(); // L: 48
			break; // L: 49
		case 3:
			var4 = new WorldMapSection2(); // L: 51
			break; // L: 52
		default:
			throw new IllegalStateException(""); // L: 57
		}

		((WorldMapSection)var4).read(var1); // L: 59
		return (WorldMapSection)var4; // L: 60
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1950894227"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 64

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 72
			}

			var5 = (WorldMapSection)var4.next(); // L: 65
		} while(!var5.containsCoord(var1, var2, var3)); // L: 67

		return true; // L: 68
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-375705273"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 76
		int var4 = var2 / 64; // L: 77
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 78
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 79
				Iterator var5 = this.sections.iterator();

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) { // L: 80
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1460236922"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 92

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 100
			}

			var5 = (WorldMapSection)var4.next(); // L: 93
		} while(!var5.containsCoord(var1, var2, var3)); // L: 95

		return var5.getBorderTileLengths(var1, var2, var3); // L: 96
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Llt;",
		garbageValue = "-1410281579"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 104

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 112
			}

			var4 = (WorldMapSection)var3.next(); // L: 105
		} while(!var4.containsPosition(var1, var2)); // L: 107

		return var4.coord(var1, var2); // L: 108
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1716718867"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 116

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 117
			var2.expandBounds(this); // L: 119
		}

	} // L: 122

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 125
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "10996936"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 129
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-65"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 133
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "94"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 137
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "570565152"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 141
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1040127358"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 145
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 149
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "632784773"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 153
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-7674"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 157
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1770419527"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 161
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "689611916"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 165
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 169
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 173
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Llt;",
		garbageValue = "631641282"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 177
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[Lln;",
		garbageValue = "6"
	)
	static LoginPacket[] method4920() {
		return new LoginPacket[]{LoginPacket.field3285, LoginPacket.field3286, LoginPacket.field3284, LoginPacket.field3288, LoginPacket.field3289, LoginPacket.field3290}; // L: 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsn;IIII)V",
		garbageValue = "-553024587"
	)
	static void method4918(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, class122.method2891(var1, var2, var3), var0.pixels.length * 4); // L: 42
	} // L: 43

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "69"
	)
	static final void method4919(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12049
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3329()) { // L: 12050
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12051
				PacketBufferNode var4 = UserComparator9.getPacketBufferNode(ClientPacket.field3145, Client.packetWriter.isaacCipher); // L: 12052
				var4.packetBuffer.writeByte(4 + WorldMapLabel.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12053
				var4.packetBuffer.writeByte(var0); // L: 12054
				var4.packetBuffer.writeShort(var1); // L: 12055
				var4.packetBuffer.writeBoolean(var2); // L: 12056
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12057
				Client.packetWriter.addNode(var4); // L: 12058
			}
		}
	} // L: 12059
}
