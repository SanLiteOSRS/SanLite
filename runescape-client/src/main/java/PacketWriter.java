import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1289075821
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1552785885
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("h")
	boolean field1328;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2051211853
	)
	int field1332;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1703250495
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	ServerPacket field1339;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	ServerPacket field1338;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	ServerPacket field1333;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1328 = true; // L: 22
		this.field1332 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796874878"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lji;I)V",
		garbageValue = "85695598"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I)V",
		garbageValue = "956369932"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "845615957"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1350533680"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Lnj;",
		garbageValue = "-1"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lku;B)I",
		garbageValue = "-79"
	)
	static int method2600(Widget var0) {
		if (var0.type != 11) { // L: 1237
			--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 1238
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 1239
			return 1; // L: 1240
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize]; // L: 1242
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var0.method5641(var1); // L: 1243
			return 1; // L: 1244
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1508117485"
	)
	static int method2599(String var0) {
		if (var0.equals("centre")) { // L: 297
			return 1; // L: 298
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2; // L: 300 301 303
		}
	}
}
