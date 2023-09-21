import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class47 {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field343;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	VorbisSample field345;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	RawSound field344;
	@ObfuscatedName("ak")
	ReentrantLock field348;

	@ObfuscatedSignature(
		descriptor = "(Lcw;Lbs;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field345 = var1; // L: 11
		this.field344 = var2; // L: 12
		this.field348 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lom;III)Lud;",
		garbageValue = "1460191246"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class164.method3376(var0, var1, var2)) { // L: 47
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 50
			var4.width = class159.SpriteBuffer_spriteWidth; // L: 51
			var4.height = class500.SpriteBuffer_spriteHeight; // L: 52
			var4.xOffset = class326.SpriteBuffer_xOffsets[0]; // L: 53
			var4.yOffset = ModelData0.SpriteBuffer_yOffsets[0]; // L: 54
			var4.subWidth = class59.SpriteBuffer_spriteWidths[0]; // L: 55
			var4.subHeight = class544.SpriteBuffer_spriteHeights[0]; // L: 56
			int var5 = var4.subHeight * var4.subWidth; // L: 57
			byte[] var6 = class414.SpriteBuffer_pixels[0]; // L: 58
			var4.pixels = new int[var5]; // L: 59

			for (int var7 = 0; var7 < var5; ++var7) { // L: 60
				var4.pixels[var7] = class372.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class407.method7453(); // L: 61
			return var4; // L: 64
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1083704336"
	)
	static boolean method871() {
		return (Client.drawPlayerNames & 2) != 0; // L: 5375
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "117649211"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop; // L: 11457
	}
}
