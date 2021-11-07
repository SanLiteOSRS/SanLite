import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 738275543
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lop;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1382536787
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("j")
	boolean field1280;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -284843695
	)
	int field1275;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2120666223
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1277;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1284;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	ServerPacket field1285;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1280 = true;
		this.field1275 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "480041256"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-635097246"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lib;B)V",
		garbageValue = "-1"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lmp;I)V",
		garbageValue = "-597928557"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401992191"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1183328030"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Lmp;",
		garbageValue = "113"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("w")
	public static double method2425(double var0, double var2, double var4) {
		return class112.method2517((var0 - var2) / var4) / var4;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-459150971"
	)
	public static void method2401() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
