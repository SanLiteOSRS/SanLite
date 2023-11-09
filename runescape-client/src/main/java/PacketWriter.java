import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 368896299
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 807398607
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("o")
	boolean field1335;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1783168523
	)
	int field1336;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1886150225
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1337;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1339;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	ServerPacket field1330;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1335 = true; // L: 22
		this.field1336 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-51645083"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25497"
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljg;I)V",
		garbageValue = "-1493234153"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-1478290701"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1758085375"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lnc;",
		garbageValue = "2"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (ParamComposition.loadInterface(var0)) { // L: 11524
			Widget[] var1 = class358.Widget_interfaceComponents[var0]; // L: 11525

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11526
				Widget var3 = var1[var2]; // L: 11527
				if (var3 != null) { // L: 11528
					var3.modelFrame = 0; // L: 11529
					var3.modelFrameCycle = 0; // L: 11530
				}
			}

		}
	} // L: 11532
}
