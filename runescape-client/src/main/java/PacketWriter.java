import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1797910505
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2096948369
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("b")
	boolean field1383;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -553813647
	)
	int field1384;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1243600265
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1386;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1387;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1391;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1383 = true;
		this.field1384 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383742396"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-727119774"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhm;S)V",
		garbageValue = "15740"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "-2036896276"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "446343289"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1365475884"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("h")
	public static double method2400(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(var8 * -var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-571772420"
	)
	public static boolean method2410(int var0) {
		return (var0 & 1) != 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Liv;",
		garbageValue = "-96"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = DevicePcmPlayerProvider.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("l")
	static int method2409(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
