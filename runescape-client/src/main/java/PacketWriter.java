import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -881098545
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 894589585
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("am")
	boolean field1432;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1260788979
	)
	int field1429;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1395259855
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1431;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1420;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1433;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1432 = true; // L: 22
		this.field1429 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-633870649"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1725575924"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llx;B)V",
		garbageValue = "22"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "-584011742"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087446789"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-669241034"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "-1314055794"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;I)[Lud;",
		garbageValue = "1067620942"
	)
	public static SpritePixels[] method2826(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 98
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 99
			int var4 = var0.getFileId(var3, var2); // L: 100
			SpritePixels[] var5;
			if (!class164.method3376(var0, var3, var4)) { // L: 103
				var5 = null; // L: 104
			} else {
				SpritePixels[] var7 = new SpritePixels[class544.SpriteBuffer_spriteCount]; // L: 109

				for (int var8 = 0; var8 < class544.SpriteBuffer_spriteCount; ++var8) { // L: 110
					SpritePixels var9 = var7[var8] = new SpritePixels(); // L: 111
					var9.width = class159.SpriteBuffer_spriteWidth; // L: 112
					var9.height = class500.SpriteBuffer_spriteHeight; // L: 113
					var9.xOffset = class326.SpriteBuffer_xOffsets[var8]; // L: 114
					var9.yOffset = ModelData0.SpriteBuffer_yOffsets[var8]; // L: 115
					var9.subWidth = class59.SpriteBuffer_spriteWidths[var8]; // L: 116
					var9.subHeight = class544.SpriteBuffer_spriteHeights[var8]; // L: 117
					int var10 = var9.subWidth * var9.subHeight; // L: 118
					byte[] var11 = class414.SpriteBuffer_pixels[var8]; // L: 119
					var9.pixels = new int[var10]; // L: 120

					for (int var12 = 0; var12 < var10; ++var12) { // L: 121
						var9.pixels[var12] = class372.SpriteBuffer_spritePalette[var11[var12] & 255];
					}
				}

				class407.method7453(); // L: 123
				var5 = var7; // L: 126
			}

			return var5; // L: 128
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-63"
	)
	public static int method2809(CharSequence var0) {
		int var1 = var0.length(); // L: 140
		int var2 = 0; // L: 141

		for (int var3 = 0; var3 < var1; ++var3) { // L: 142
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 143
	}
}
