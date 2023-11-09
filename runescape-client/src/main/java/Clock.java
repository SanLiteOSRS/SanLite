import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1571265211"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "56"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-596131229"
	)
	public static void method3265(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lls;III)Lqe;",
		garbageValue = "325266913"
	)
	static IndexedSprite method3260(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) { // L: 52
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite(); // L: 55
			var4.width = class457.SpriteBuffer_spriteWidth; // L: 56
			var4.height = class457.SpriteBuffer_spriteHeight; // L: 57
			var4.xOffset = class457.SpriteBuffer_xOffsets[0]; // L: 58
			var4.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0]; // L: 59
			var4.subWidth = class457.SpriteBuffer_spriteWidths[0]; // L: 60
			var4.subHeight = SoundCache.SpriteBuffer_spriteHeights[0]; // L: 61
			var4.palette = class457.SpriteBuffer_spritePalette; // L: 62
			var4.pixels = class181.SpriteBuffer_pixels[0]; // L: 63
			class457.SpriteBuffer_xOffsets = null; // L: 65
			InterfaceParent.SpriteBuffer_yOffsets = null; // L: 66
			class457.SpriteBuffer_spriteWidths = null; // L: 67
			SoundCache.SpriteBuffer_spriteHeights = null; // L: 68
			class457.SpriteBuffer_spritePalette = null; // L: 69
			class181.SpriteBuffer_pixels = null; // L: 70
			return var4; // L: 74
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-332792055"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	static final void method3264() {
		if (Client.logoutTimer > 0) { // L: 2926
			UserComparator8.logOut(); // L: 2927
		} else {
			Client.timer.method6468(); // L: 2930
			class4.updateGameState(40); // L: 2931
			PacketBufferNode.field3045 = Client.packetWriter.getSocket(); // L: 2932
			Client.packetWriter.removeSocket(); // L: 2933
		}
	} // L: 2928 2934
}
