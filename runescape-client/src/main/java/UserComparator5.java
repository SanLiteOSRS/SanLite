import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		signature = "Lfu;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lkl;Lkl;I)I",
		garbageValue = "-1154663749"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) {
			if (var2.world == 0) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;IIB)[Lle;",
		garbageValue = "-1"
	)
	public static IndexedSprite[] method3540(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class217.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class336.SpriteBuffer_spriteCount];

			for (int var6 = 0; var6 < class336.SpriteBuffer_spriteCount; ++var6) {
				IndexedSprite var7 = var5[var6] = new IndexedSprite();
				var7.width = class336.SpriteBuffer_spriteWidth;
				var7.height = class336.SpriteBuffer_spriteHeight;
				var7.xOffset = class336.SpriteBuffer_xOffsets[var6];
				var7.yOffset = class225.SpriteBuffer_yOffsets[var6];
				var7.subWidth = class336.SpriteBuffer_spriteWidths[var6];
				var7.subHeight = class336.SpriteBuffer_spriteHeights[var6];
				var7.palette = WorldMapID.SpriteBuffer_spritePalette;
				var7.pixels = class13.SpriteBuffer_pixels[var6];
			}

			class336.SpriteBuffer_xOffsets = null;
			class225.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			WorldMapID.SpriteBuffer_spritePalette = null;
			class13.SpriteBuffer_pixels = null;
			return var5;
		}
	}
}
