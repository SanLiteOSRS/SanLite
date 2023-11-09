import java.awt.Image;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("bo")
	static Image field1394;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1859952183
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 889658999
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("at")
	boolean field1388;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 997558489
	)
	int field1389;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1383386157
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1391;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1392;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1386;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1388 = true; // L: 22
		this.field1389 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1845394626"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "421941662"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "414135591"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lph;B)V",
		garbageValue = "1"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-343033137"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-274968704"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lph;",
		garbageValue = "2"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}
}
