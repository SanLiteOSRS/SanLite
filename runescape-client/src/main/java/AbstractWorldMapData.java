import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 143413248
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 287649792
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1224582621
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1447419567
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -156049595
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 237039767
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2062701093
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1770671525
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("k")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("t")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("l")
	byte[][][] field2154;
	@ObfuscatedName("u")
	byte[][][] field2145;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[[[Lgp;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("z")
	boolean field2158;
	@ObfuscatedName("q")
	boolean field2149;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2158 = false;
		this.field2149 = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "530647470"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "109"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2158 && this.field2149;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "1857158984"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2158 = true;
				this.field2149 = true;
			}

		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2035301414"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2154 = null;
		this.field2145 = null;
		this.decorations = null;
		this.field2158 = false;
		this.field2149 = false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILop;I)V",
		garbageValue = "-167681766"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3929(var1, var2, var3, var4);
			} else {
				this.method3930(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILop;II)V",
		garbageValue = "-358725932"
	)
	void method3929(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILop;II)V",
		garbageValue = "314745138"
	)
	void method3930(int var1, int var2, Buffer var3, int var4) {
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
					this.field2154[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2145[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6946();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1248831647"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1001102625"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lik;Lpw;B)Lib;",
		garbageValue = "-34"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class92.method2296();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)Ljava/lang/String;",
		garbageValue = "-2039941836"
	)
	static String method3956(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class264.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class264.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)[Loe;",
		garbageValue = "70"
	)
	static IndexedSprite[] method3958() {
		IndexedSprite[] var0 = new IndexedSprite[class414.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < class414.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = class414.SpriteBuffer_spriteWidth;
			var2.height = class414.SpriteBuffer_spriteHeight;
			var2.xOffset = class414.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class414.SpriteBuffer_yOffsets[var1];
			var2.subWidth = UrlRequester.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class414.SpriteBuffer_spriteHeights[var1];
			var2.palette = HitSplatDefinition.SpriteBuffer_spritePalette;
			var2.pixels = class295.SpriteBuffer_pixels[var1];
		}

		PacketBuffer.method6913();
		return var0;
	}
}
