import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = 1167994355
	)
	static int field225;
	@ObfuscatedName("as")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -432633541
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1968130081
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -741529837
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1317553213
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1484434025
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2055867539
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -38953615
	)
	int field222;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 458609745
	)
	int field223;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 562473149
	)
	int field224;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2130603605
	)
	int field226;

	WorldMapSection2() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field222) {
			var1.regionLowX = this.field222;
		}

		if (var1.regionHighX < this.field224) {
			var1.regionHighX = this.field224;
		}

		if (var1.regionLowY > this.field223) {
			var1.regionLowY = this.field223;
		}

		if (var1.regionHighY < this.field226) {
			var1.regionHighY = this.field226;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIB)Z",
		garbageValue = "10"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field222 && var1 >> 6 <= this.field224 && var2 >> 6 >= this.field223 && var2 >> 6 <= this.field226;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIB)[I",
		garbageValue = "-25"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field222 * 64 - this.regionStartX * 64 + var2, var3 + (this.field223 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIB)Lhw;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field222 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field223 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field222 = var1.readUnsignedShort();
		this.field223 = var1.readUnsignedShort();
		this.field224 = var1.readUnsignedShort();
		this.field226 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "335411255"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(CB)C",
		garbageValue = "0"
	)
	static char method426(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "166784628"
	)
	static final boolean method425() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-26"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		AbstractWorldMapData.method375();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
