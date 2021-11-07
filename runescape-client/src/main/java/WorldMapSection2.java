import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	static Widget field2037;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 268471801
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2064297275
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 120844139
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 307764911
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1741263817
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1879263737
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -829160943
	)
	int field2033;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2138355431
	)
	int field2028;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1057428701
	)
	int field2026;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1043419133
	)
	int field2035;

	WorldMapSection2() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-1844012640"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2033) {
			var1.regionLowX = this.field2033;
		}

		if (var1.regionHighX < this.field2026) {
			var1.regionHighX = this.field2026;
		}

		if (var1.regionLowY > this.field2028) {
			var1.regionLowY = this.field2028;
		}

		if (var1.regionHighY < this.field2035) {
			var1.regionHighY = this.field2035;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1501827396"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-356013678"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2033 && var1 >> 6 <= this.field2026 && var2 >> 6 >= this.field2028 && var2 >> 6 <= this.field2035;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-79"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2033 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2028 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;",
		garbageValue = "494177498"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2033 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2028 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-682362313"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2033 = var1.readUnsignedShort();
		this.field2028 = var1.readUnsignedShort();
		this.field2026 = var1.readUnsignedShort();
		this.field2035 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1513297237"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "14"
	)
	static final void method3584(boolean var0) {
		if (var0) {
			Client.field693 = Login.field875 ? class112.field1345 : class112.field1347;
		} else {
			Client.field693 = class408.clientPreferences.parameters.containsKey(ClanChannel.method2824(Login.Login_username)) ? class112.field1350 : class112.field1346;
		}

	}
}
