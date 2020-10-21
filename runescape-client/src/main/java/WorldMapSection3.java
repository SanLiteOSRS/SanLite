import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 375073711
	)
	int field381;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -670342777
	)
	int field387;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -831871381
	)
	int field382;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1970843519
	)
	int field383;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1989869311
	)
	int field384;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1016940673
	)
	int field385;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -597741031
	)
	int field386;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -664935547
	)
	int field389;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 266959941
	)
	int field388;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -486540041
	)
	int field391;

	WorldMapSection3() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lak;I)V",
		garbageValue = "-1645245778"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field384) {
			var1.regionLowX = this.field384;
		}

		if (var1.regionHighX < this.field384) {
			var1.regionHighX = this.field384;
		}

		if (var1.regionLowY > this.field385) {
			var1.regionLowY = this.field385;
		}

		if (var1.regionHighY < this.field385) {
			var1.regionHighY = this.field385;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIB)Z",
		garbageValue = "51"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field381 && var1 < this.field381 + this.field387) {
			return var2 >= (this.field382 << 6) + (this.field386 << 3) && var2 <= (this.field382 << 6) + (this.field386 << 3) + 7 && var3 >= (this.field383 << 6) + (this.field389 << 3) && var3 <= (this.field383 << 6) + (this.field389 << 3) + 7;
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
		return var1 >= (this.field384 << 6) + (this.field388 << 3) && var1 <= (this.field384 << 6) + (this.field388 << 3) + 7 && var2 >= (this.field385 << 6) + (this.field391 << 3) && var2 <= (this.field385 << 6) + (this.field391 << 3) + 7;
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
			int[] var4 = new int[]{this.field384 * 64 - this.field382 * 64 + var2 + (this.field388 * 8 - this.field386 * 8), var3 + (this.field385 * 64 - this.field383 * 64) + (this.field391 * 8 - this.field389 * 8)};
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
			int var3 = this.field382 * 64 - this.field384 * 64 + (this.field386 * 8 - this.field388 * 8) + var1;
			int var4 = this.field383 * 64 - this.field385 * 64 + var2 + (this.field389 * 8 - this.field391 * 8);
			return new Coord(this.field381, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-222098123"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field381 = var1.readUnsignedByte();
		this.field387 = var1.readUnsignedByte();
		this.field382 = var1.readUnsignedShort();
		this.field386 = var1.readUnsignedByte();
		this.field383 = var1.readUnsignedShort();
		this.field389 = var1.readUnsignedByte();
		this.field384 = var1.readUnsignedShort();
		this.field388 = var1.readUnsignedByte();
		this.field385 = var1.readUnsignedShort();
		this.field391 = var1.readUnsignedByte();
		this.method874();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-115"
	)
	void method874() {
	}

	@ObfuscatedName("f")
	public static final void method894(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				VertexNormal.method3135(var0 - 1L);
				VertexNormal.method3135(1L);
			} else {
				VertexNormal.method3135(var0);
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "606509160"
	)
	static void method870(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
		if (var4 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var4);
		}
	}
}
