import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 360317377
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1203952317
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -291449039
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -518457143
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "10"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field3044.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 4096; // L: 21
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method9198();
			super.fileId = var1.method9198();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "2049371979"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64]; // L: 35
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 36
		super.field3014 = new byte[super.planes][64][64]; // L: 37
		super.field3000 = new byte[super.planes][64][64]; // L: 38
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 39
		int var2 = var1.readUnsignedByte(); // L: 40
		if (var2 != class270.field3039.value) { // L: 41
			throw new IllegalStateException(""); // L: 42
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2024763677"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 76
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1047328997"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 80
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "127"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 84
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1777174100"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 88
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (super.regionX == var2.regionX && var2.regionY == super.regionY) {
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 72
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)Lui;",
		garbageValue = "-2044426638"
	)
	public static final SpritePixels method5347(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class; // L: 22
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 23
			} // L: 24

			int var6 = var1.getWidth(); // L: 25
			int var7 = var1.getHeight(); // L: 26
			int[] var4 = new int[var7 * var6]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6); // L: 28
			var5.grabPixels(); // L: 29
			return new SpritePixels(var4, var6, var7); // L: 30
		} catch (IOException var9) { // L: 32
		} catch (InterruptedException var10) { // L: 33
		}

		return new SpritePixels(0, 0); // L: 34
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "-1629994488"
	)
	static boolean method5345(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 44
			boolean var3 = false; // L: 45
			boolean var4 = false; // L: 46
			int var5 = 0; // L: 47
			int var6 = var0.length(); // L: 48

			for (int var7 = 0; var7 < var6; ++var7) { // L: 49
				char var8 = var0.charAt(var7); // L: 50
				if (var7 == 0) { // L: 51
					if (var8 == '-') { // L: 52
						var3 = true; // L: 53
						continue;
					}

					if (var8 == '+') { // L: 56
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 58
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 59
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 60
						return false; // L: 61
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 62
					return false;
				}

				if (var3) { // L: 63
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 64
				if (var9 / var1 != var5) { // L: 65
					return false;
				}

				var5 = var9; // L: 66
				var4 = true; // L: 67
			}

			return var4; // L: 69
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "90675667"
	)
	static void method5372() {
		Login.worldSelectOpen = false; // L: 1922
		Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1923
		Bounds.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1924
		SoundSystem.logoSprite.drawAt(Login.xPadding + 382 - SoundSystem.logoSprite.subWidth / 2, 18); // L: 1925
	} // L: 1926
}
