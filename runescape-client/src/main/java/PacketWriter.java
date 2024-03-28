import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1737915133
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 571826815
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ad")
	boolean field1434;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -60278445
	)
	int field1442;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -313873225
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1444;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1446;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	ServerPacket field1447;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1434 = true; // L: 22
		this.field1442 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2050822204"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)V",
		garbageValue = "1820843042"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "1991611295"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2103979421"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrq;",
		garbageValue = "1648103891"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Z",
		garbageValue = "-459075448"
	)
	static final boolean method2801(Widget var0) {
		int var1 = var0.contentType; // L: 12576
		if (var1 == 205) { // L: 12577
			Client.logoutTimer = 250; // L: 12578
			return true; // L: 12579
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12581
				var2 = (var1 - 300) / 2; // L: 12582
				var3 = var1 & 1; // L: 12583
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12584
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12586
				var2 = (var1 - 314) / 2; // L: 12587
				var3 = var1 & 1; // L: 12588
				Client.playerAppearance.method6325(var2, var3 == 1); // L: 12589
			}

			if (var1 == 324) {
				Client.playerAppearance.method6326(0); // L: 12591
			}

			if (var1 == 325) { // L: 12592
				Client.playerAppearance.method6326(1);
			}

			if (var1 == 326) { // L: 12593
				PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3299, Client.packetWriter.isaacCipher); // L: 12595
				Client.playerAppearance.write(var4.packetBuffer); // L: 12596
				Client.packetWriter.addNode(var4); // L: 12597
				return true; // L: 12598
			} else {
				return false; // L: 12600
			}
		}
	}
}
