import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 519247697
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("o")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1230995281
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 526581911
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 399363655
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 383400035
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1375320443
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2005754791
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("i")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("x")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1004377036"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Lgl;",
		garbageValue = "860405758"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType var3 = (WorldMapSectionType)UserComparator4.findEnumerated(WorldMapSectionType.method3537(), var2);
		Object var4 = null;
		switch(var3.type) {
		case 0:
			var4 = new class169();
			break;
		case 1:
			var4 = new WorldMapSection0();
			break;
		case 2:
			var4 = new WorldMapSection2();
			break;
		case 3:
			var4 = new WorldMapSection1();
			break;
		default:
			throw new IllegalStateException("");
		}

		((WorldMapSection)var4).read(var1);
		return (WorldMapSection)var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "99"
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1146651555"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-311505931"
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;",
		garbageValue = "-474140202"
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2003225896"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1745178974"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1950754805"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "725085100"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1184219144"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1551948679"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1392872851"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-759231934"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1206209836"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-16776142"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-804224518"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1864891878"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "-742727761"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}
}
