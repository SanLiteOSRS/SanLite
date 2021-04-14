import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("h")
	public static short[] field1753;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1410379801
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1271552449
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1025111875
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -151560709
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -857538819
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1507190369
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Leq;I)V",
		garbageValue = "-609192354"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-2146205978"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-916390789"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "1101045563"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)Lhk;",
		garbageValue = "1643926479"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-576756767"
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-28"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(CI)C",
		garbageValue = "-1918017802"
	)
	static char method3154(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)Low;",
		garbageValue = "-466976069"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		byte[] var7 = var0.takeFile(var3, var4);
		boolean var6;
		if (var7 == null) {
			var6 = false;
		} else {
			class244.SpriteBuffer_decode(var7);
			var6 = true;
		}

		IndexedSprite var5;
		if (!var6) {
			var5 = null;
		} else {
			var5 = ArchiveLoader.method2076();
		}

		return var5;
	}

	@ObfuscatedName("k")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
