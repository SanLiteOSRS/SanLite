import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -22329009
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1149109749
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ae")
	boolean field1387;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 372058233
	)
	int field1388;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1074296969
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1390;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1393;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	ServerPacket field1392;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1387 = true; // L: 22
		this.field1388 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16711935"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1733515630"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)V",
		garbageValue = "-792658230"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqz;I)V",
		garbageValue = "-325785679"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1129024542"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-220432815"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lqz;",
		garbageValue = "31"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}
}
