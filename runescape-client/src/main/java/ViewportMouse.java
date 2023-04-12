import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("tr")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("aj")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 690969373
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1274028649
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ab")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -933761275
	)
	static int field2730;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1060408687
	)
	static int field2731;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1455619147
	)
	static int field2732;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -798713269
	)
	static int field2726;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2090508739
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("am")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lkp;",
		garbageValue = "94"
	)
	public static PacketBufferNode method4751() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 47
			var0 = new PacketBufferNode(); // L: 48
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 51
		}

		var0.clientPacket = null; // L: 54
		var0.clientPacketLength = 0; // L: 55
		var0.packetBuffer = new PacketBuffer(5000); // L: 56
		return var0; // L: 57
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsn;",
		garbageValue = "709294084"
	)
	static SpritePixels[] method4752() {
		SpritePixels[] var0 = new SpritePixels[class492.SpriteBuffer_spriteCount]; // L: 176

		for (int var1 = 0; var1 < class492.SpriteBuffer_spriteCount; ++var1) { // L: 177
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 178
			var2.width = class492.SpriteBuffer_spriteWidth; // L: 179
			var2.height = class492.SpriteBuffer_spriteHeight; // L: 180
			var2.xOffset = class492.SpriteBuffer_xOffsets[var1]; // L: 181
			var2.yOffset = Canvas.SpriteBuffer_yOffsets[var1]; // L: 182
			var2.subWidth = InterfaceParent.SpriteBuffer_spriteWidths[var1]; // L: 183
			var2.subHeight = class144.SpriteBuffer_spriteHeights[var1]; // L: 184
			int var3 = var2.subHeight * var2.subWidth; // L: 185
			byte[] var4 = class144.SpriteBuffer_pixels[var1]; // L: 186
			var2.pixels = new int[var3]; // L: 187

			for (int var5 = 0; var5 < var3; ++var5) { // L: 188
				var2.pixels[var5] = class181.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		FriendsList.method7473(); // L: 190
		return var0; // L: 191
	}
}
