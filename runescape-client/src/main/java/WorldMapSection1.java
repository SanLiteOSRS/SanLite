import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -172548833
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1748120497
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1884871101
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -942039983
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 813017915
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -667785063
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lju;B)V",
		garbageValue = "-106"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 18
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 19
		}

		if (var1.regionLowY > this.regionEndY) { // L: 20
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 21
			var1.regionHighY = this.regionEndY;
		}

	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "0"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 26
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 29
		} else {
			return false; // L: 27
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "326256885"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "3148"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 39
			return null; // L: 40
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 42 43 44
			return var4; // L: 45
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lms;",
		garbageValue = "-2137162191"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 50
			return null; // L: 51
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 53
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2; // L: 54
			return new Coord(this.minPlane, var3, var4); // L: 55
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "8"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 60
		this.planes = var1.readUnsignedByte(); // L: 61
		this.regionStartX = var1.readUnsignedShort(); // L: 62
		this.regionStartY = var1.readUnsignedShort(); // L: 63
		this.regionEndX = var1.readUnsignedShort(); // L: 64
		this.regionEndY = var1.readUnsignedShort(); // L: 65
		this.postRead(); // L: 66
	} // L: 67

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("postRead")
	void postRead() {
	} // L: 69

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1129359607"
	)
	static int method5518(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1102163779"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 441
		int var2 = var1.readUnsignedByte(); // L: 442
		int var3 = var1.readInt(); // L: 443
		if (var3 < 0 || AbstractArchive.field4273 != 0 && var3 > AbstractArchive.field4273) { // L: 444
			throw new RuntimeException(); // L: 445
		} else if (var2 == 0) { // L: 447
			byte[] var6 = new byte[var3]; // L: 448
			var1.readBytes(var6, 0, var3); // L: 449
			return var6; // L: 450
		} else {
			int var4 = var1.readInt(); // L: 453
			if (var4 >= 0 && (AbstractArchive.field4273 == 0 || var4 <= AbstractArchive.field4273)) { // L: 454
				byte[] var5 = new byte[var4]; // L: 457
				if (var2 == 1) { // L: 458
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 459
				}

				return var5; // L: 460
			} else {
				throw new RuntimeException(); // L: 455
			}
		}
	}
}
