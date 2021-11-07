import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2132883567
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1424345203
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -737589469
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1977093803
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "133240278"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2184.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method6946();
			super.fileId = var1.method6946();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "530647470"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2154 = new byte[super.planes][64][64];
		super.field2145 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class194.field2178.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "179463257"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1932347732"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-728228144"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1064426552"
	)
	static void method3844() {
		try {
			File var0 = new File(TriBool.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < AbstractRasterProvider.cacheSubPaths.length; ++var1) {
					for (var2 = 0; var2 < NPC.cacheParentPaths.length; ++var2) {
						File var3 = new File(NPC.cacheParentPaths[var2] + AbstractRasterProvider.cacheSubPaths[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1129195954"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				ArchiveLoader.client.method508();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				UserComparator6.method2503(0);
				Client.field496 = 0;
				Client.field685 = 0;
				Client.timer.method5973(var0);
				if (var0 != 20) {
					WorldMapSection2.method3584(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Projectile.field915 != null) {
				Projectile.field915.close();
				Projectile.field915 = null;
			}

			if (Client.gameState == 25) {
				Client.field485 = 0;
				Client.field521 = 0;
				Client.field522 = 1;
				Client.field523 = 0;
				Client.field524 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, true, var3);
				} else if (var0 == 11) {
					class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, false, 4);
				} else {
					ArchiveDiskActionHandler.method5258();
				}
			} else {
				boolean var1 = class408.clientPreferences.field1182 >= Client.field467;
				int var2 = var1 ? 0 : 12;
				class113.method2529(ChatChannel.archive10, GrandExchangeOfferOwnWorldComparator.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
