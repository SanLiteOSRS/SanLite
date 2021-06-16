import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2120559769
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 20308873
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1110742467
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -109322199
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -705603633
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2092573819
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lfa;B)V",
		garbageValue = "120"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2105423832"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-173753307"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2086451205"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liw;",
		garbageValue = "-36"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1313413902"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-533258975"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "-360609536"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		Varcs.runScript(var0, 500000, 475000);
	}
}
