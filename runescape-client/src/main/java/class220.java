import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class220 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 2096870165
	)
	int field2600;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 332866065
	)
	int field2607;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2013647353
	)
	int field2602;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 465602659
	)
	int field2601;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 838590455
	)
	int field2604;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1243099435
	)
	int field2605;

	class220(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2600 = var1; // L: 12
		this.field2607 = var2; // L: 13
		this.field2602 = var3; // L: 14
		this.field2601 = var4; // L: 15
		this.field2604 = var5; // L: 16
		this.field2605 = var6; // L: 17
	} // L: 18

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;III)[Lrs;",
		garbageValue = "-1540758388"
	)
	public static SpritePixels[] method4629(AbstractArchive var0, int var1, int var2) {
		if (!Buffer.method8892(var0, var1, var2)) { // L: 23
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class488.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class488.SpriteBuffer_spriteCount; ++var5) { // L: 27
				SpritePixels var6 = var4[var5] = new SpritePixels(); // L: 28
				var6.width = class488.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class488.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class488.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = FriendsList.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class132.SpriteBuffer_spriteHeights[var5]; // L: 34
				int var7 = var6.subWidth * var6.subHeight; // L: 35
				byte[] var8 = class140.SpriteBuffer_pixels[var5]; // L: 36
				var6.pixels = new int[var7]; // L: 37

				for (int var9 = 0; var9 < var7; ++var9) { // L: 38
					var6.pixels[var9] = class100.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class100.method2724(); // L: 40
			return var4; // L: 43
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1608051056"
	)
	static final void method4628(int var0, int var1, int var2, int var3) {
		Client.field626 = 0; // L: 5736
		int var4 = ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7); // L: 5737
		int var5 = Client.baseY * 64 + (class387.localPlayer.y >> 7); // L: 5738
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) { // L: 5739
			Client.field626 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) { // L: 5740
			Client.field626 = 1;
		}

		if (Client.field626 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) { // L: 5741
			Client.field626 = 0;
		}

	} // L: 5743
}
