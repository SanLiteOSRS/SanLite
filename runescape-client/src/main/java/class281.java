import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class281 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive10")
	static Archive archive10;

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Llc;",
		garbageValue = "1924580283"
	)
	static SpritePixels method5132() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class336.SpriteBuffer_spriteWidth;
		var0.height = class336.SpriteBuffer_spriteHeight;
		var0.xOffset = class336.SpriteBuffer_xOffsets[0];
		var0.yOffset = class225.SpriteBuffer_yOffsets[0];
		var0.subWidth = class336.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class336.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = class13.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = WorldMapID.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class336.SpriteBuffer_xOffsets = null;
		class225.SpriteBuffer_yOffsets = null;
		class336.SpriteBuffer_spriteWidths = null;
		class336.SpriteBuffer_spriteHeights = null;
		WorldMapID.SpriteBuffer_spritePalette = null;
		class13.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		signature = "(Lbi;IIBB)V",
		garbageValue = "1"
	)
	static final void method5133(Player var0, int var1, int var2, byte var3) {
		int var4 = var0.pathX[0];
		int var5 = var0.pathY[0];
		int var6 = var0.transformedSize();
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) {
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) {
				int var9 = var0.transformedSize();
				Client.field877.approxDestinationX = var1;
				Client.field877.approxDestinationY = var2;
				Client.field877.approxDestinationSizeX = 1;
				Client.field877.approxDestinationSizeY = 1;
				ApproximateRouteStrategy var10 = Client.field877;
				int var11 = ApproximateRouteStrategy.method1321(var4, var5, var9, var10, Client.collisionMaps[var0.plane], true, Client.field695, Client.field956);
				if (var11 >= 1) {
					for (int var12 = 0; var12 < var11 - 1; ++var12) {
						var0.method1337(Client.field695[var12], Client.field956[var12], var3);
					}

				}
			}
		}
	}
}
