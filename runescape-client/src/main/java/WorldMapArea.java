import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eq")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		signature = "Lfu;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 1615990339
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1514003013
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("u")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -720115575
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -297812541
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lhk;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 904812453
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 766167871
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 832142727
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1806584787
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("l")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("m")
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;II)V",
		garbageValue = "747590204"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Lfv;",
		garbageValue = "715187393"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE2, WorldMapSectionType.WORLDMAPSECTIONTYPE1};
		WorldMapSectionType var4 = (WorldMapSectionType)UserComparator8.findEnumerated(var3, var2);
		Object var5 = null;
		switch(var4.type) {
		case 0:
			var5 = new class147();
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "1809400826"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-1003463071"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "416531869"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(III)Lhk;",
		garbageValue = "2101787802"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1832411393"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator();

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next();
			var2.expandBounds(this);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "2062295342"
	)
	@Export("getId")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "461643784"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-1819862501"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(B)Ljava/lang/String;",
		garbageValue = "-82"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "753799862"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1445982184"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "24"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "116"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-2085770909"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1254165829"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1410964110"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(S)I",
		garbageValue = "4919"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "63"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Lhk;",
		garbageValue = "-714822914"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-947353982"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class21.method316(var0, 10, true);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)[B",
		garbageValue = "18"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-993034647"
	)
	static int method2740(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? FriendSystem.field905 : class4.field35;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		signature = "(Lhu;I)Z",
		garbageValue = "440915192"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
