import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1192849408
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -459616256
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -721187647
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -338323933
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -75895465
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1081572037
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -418249645
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 873736715
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("i")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("k")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("g")
	byte[][][] field2068;
	@ObfuscatedName("t")
	byte[][][] field2074;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[[[[Lfw;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("u")
	boolean field2066;
	@ObfuscatedName("q")
	boolean field2073;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2066 = false;
		this.field2073 = false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1563875465"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1807805876"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2066 && this.field2073;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "39585450"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2066 = true;
				this.field2073 = true;
			}

		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2068 = null;
		this.field2074 = null;
		this.decorations = null;
		this.field2066 = false;
		this.field2073 = false;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILnt;B)V",
		garbageValue = "-90"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3683(var1, var2, var3, var4);
			} else {
				this.method3693(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILnt;IB)V",
		garbageValue = "-56"
	)
	void method3683(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILnt;II)V",
		garbageValue = "-1310691805"
	)
	void method3693(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2068[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2074[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6630();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1191625155"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "210506971"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljava/lang/String;Ljava/lang/String;I)Lkj;",
		garbageValue = "907646932"
	)
	public static Font method3696(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2);
		int var5 = var0.getFileId(var4, var3);
		return Bounds.method6034(var0, var1, var4, var5);
	}
}
