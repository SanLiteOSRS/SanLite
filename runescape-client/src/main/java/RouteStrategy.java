import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1047579843
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1846311175
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1025962081
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -881860999
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIILft;I)Z",
		garbageValue = "-1274441547"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;III)Lkr;",
		garbageValue = "87805054"
	)
	public static Font method3688(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			Occluder.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, Username.SpriteBuffer_xOffsets, class335.SpriteBuffer_yOffsets, class335.SpriteBuffer_spriteWidths, class335.SpriteBuffer_spriteHeights, TaskHandler.SpriteBuffer_spritePalette, class92.SpriteBuffer_pixels);
				Username.SpriteBuffer_xOffsets = null;
				class335.SpriteBuffer_yOffsets = null;
				class335.SpriteBuffer_spriteWidths = null;
				class335.SpriteBuffer_spriteHeights = null;
				TaskHandler.SpriteBuffer_spritePalette = null;
				class92.SpriteBuffer_pixels = null;
				var8 = var7;
			}

			return var8;
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1480468521"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (IntHashTable.pcmPlayer1 != null) {
			IntHashTable.pcmPlayer1.run();
		}

		if (WorldMapManager.pcmPlayer0 != null) {
			WorldMapManager.pcmPlayer0.run();
		}

	}
}
