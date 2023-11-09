import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class453 {
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -38953883
	)
	static int field4760;
	@ObfuscatedName("aw")
	float[] field4757;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1269321367
	)
	int field4758;

	class453(float[] var1, int var2) {
		this.field4757 = var1; // L: 10
		this.field4758 = var2; // L: 11
	} // L: 12

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnd;III)[Lud;",
		garbageValue = "-2024085770"
	)
	public static SpritePixels[] method8339(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			VarbitComposition.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		if (!var3) { // L: 48
			return null;
		} else {
			SpritePixels[] var5 = new SpritePixels[class528.SpriteBuffer_spriteCount]; // L: 51

			for (int var6 = 0; var6 < class528.SpriteBuffer_spriteCount; ++var6) { // L: 52
				SpritePixels var7 = var5[var6] = new SpritePixels(); // L: 53
				var7.width = class528.SpriteBuffer_spriteWidth; // L: 54
				var7.height = class528.SpriteBuffer_spriteHeight; // L: 55
				var7.xOffset = class492.SpriteBuffer_xOffsets[var6]; // L: 56
				var7.yOffset = class134.SpriteBuffer_yOffsets[var6]; // L: 57
				var7.subWidth = class172.SpriteBuffer_spriteWidths[var6]; // L: 58
				var7.subHeight = class528.SpriteBuffer_spriteHeights[var6]; // L: 59
				int var8 = var7.subWidth * var7.subHeight; // L: 60
				byte[] var9 = ArchiveDiskAction.SpriteBuffer_pixels[var6]; // L: 61
				var7.pixels = new int[var8]; // L: 62

				for (int var10 = 0; var10 < var8; ++var10) { // L: 63
					var7.pixels[var10] = class528.SpriteBuffer_spritePalette[var9[var10] & 255];
				}
			}

			class506.method8985(); // L: 65
			return var5; // L: 68
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-2100779061"
	)
	static boolean method8341(Date var0) {
		Date var1 = WorldMapElement.method3625(); // L: 1070
		return var0.after(var1); // L: 1071
	}
}
