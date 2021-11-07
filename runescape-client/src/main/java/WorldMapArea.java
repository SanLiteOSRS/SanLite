import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -808178711
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("s")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 819237223
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -755296395
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1548910029
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -79899971
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -619522771
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 156762923
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("x")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("y")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1;
		this.backGroundColor = -1;
		this.zoom = -1;
		this.origin = null;
		this.regionLowX = Integer.MAX_VALUE;
		this.regionHighX = 0;
		this.regionLowY = Integer.MAX_VALUE;
		this.regionHighY = 0;
		this.isMain = false;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;IB)V",
		garbageValue = "-41"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2;
		this.internalName = var1.readStringCp1252NullTerminated();
		this.externalName = var1.readStringCp1252NullTerminated();
		this.origin = new Coord(var1.readInt());
		this.backGroundColor = var1.readInt();
		var1.readUnsignedByte();
		this.isMain = var1.readUnsignedByte() == 1;
		this.zoom = var1.readUnsignedByte();
		int var3 = var1.readUnsignedByte();
		this.sections = new LinkedList();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.sections.add(this.readWorldMapSection(var1));
		}

		this.setBounds();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)Lgx;",
		garbageValue = "1722623204"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE2};
		WorldMapSectionType var4 = (WorldMapSectionType)UserComparator4.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new class184();
			break;
		case 1:
			var5 = new WorldMapSection1();
			break;
		case 2:
			var5 = new WorldMapSection2();
			break;
		case 3:
			var5 = new WorldMapSection0();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var5).read(var1);
		return (WorldMapSection)var5;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2062291574"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-25"
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
						return false;
					}

					var6 = (WorldMapSection)var5.next();
				} while(!var6.containsPosition(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "35"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator();

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapSection)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5.getBorderTileLengths(var1, var2, var3);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lie;",
		garbageValue = "58"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator();

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (WorldMapSection)var3.next();
		} while(!var4.containsPosition(var1, var2));

		return var4.coord(var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982690372"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147380047"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-60"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1017230656"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1217738287"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-438706152"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116545091"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1073343926"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1503026192"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-6358"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1994315244"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lie;",
		garbageValue = "90"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Loe;",
		garbageValue = "-22529"
	)
	static IndexedSprite method3654() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class414.SpriteBuffer_spriteWidth;
		var0.height = class414.SpriteBuffer_spriteHeight;
		var0.xOffset = class414.SpriteBuffer_xOffsets[0];
		var0.yOffset = class414.SpriteBuffer_yOffsets[0];
		var0.subWidth = UrlRequester.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class414.SpriteBuffer_spriteHeights[0] * 1094459920;
		var0.palette = HitSplatDefinition.SpriteBuffer_spritePalette;
		var0.pixels = class295.SpriteBuffer_pixels[0];
		PacketBuffer.method6913();
		return var0;
	}
}
