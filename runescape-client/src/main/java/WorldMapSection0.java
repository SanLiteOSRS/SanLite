import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static Bounds field2593;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2587;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1535711209
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1132794749
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 466239837
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1420998895
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -356735879
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2053219027
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -198325951
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2114111879
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -341538293
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -679910723
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1712794079
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2081464963
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 363584625
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1760815649
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljr;S)V",
		garbageValue = "30931"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1446024671"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1938918886"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "2068201380"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Lmu;",
		garbageValue = "1554678257"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "16"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "328659164"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "31859955"
	)
	static final void method4978(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10910
		int var7 = var3 - var1; // L: 10911
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10912
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10913
		int var10 = var8; // L: 10914
		if (var8 < var9) { // L: 10915
			var10 = var9;
		}

		if (var10 != 0) { // L: 10916
			int var11 = (var6 << 16) / var10; // L: 10917
			int var12 = (var7 << 16) / var10; // L: 10918
			if (var12 <= var11) { // L: 10919
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10920
			}

			int var13 = var5 * var12 >> 17; // L: 10921
			int var14 = var5 * var12 + 1 >> 17; // L: 10922
			int var15 = var5 * var11 >> 17; // L: 10923
			int var16 = var5 * var11 + 1 >> 17; // L: 10924
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10925
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10926
			int var17 = var0 + var13; // L: 10927
			int var18 = var0 - var14; // L: 10928
			int var19 = var0 + var6 - var14; // L: 10929
			int var20 = var0 + var6 + var13; // L: 10930
			int var21 = var15 + var1; // L: 10931
			int var22 = var1 - var16; // L: 10932
			int var23 = var7 + var1 - var16; // L: 10933
			int var24 = var7 + var15 + var1; // L: 10934
			Rasterizer3D.method5265(var17, var18, var19); // L: 10935
			Rasterizer3D.method5309(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 10936
			Rasterizer3D.method5265(var17, var19, var20); // L: 10937
			Rasterizer3D.method5309(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 10938
		}
	} // L: 10939
}
