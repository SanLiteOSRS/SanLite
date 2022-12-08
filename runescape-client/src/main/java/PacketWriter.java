import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1512304017
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 395481445
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1430;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -562413973
	)
	int field1420;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1673559747
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	ServerPacket field1431;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	ServerPacket field1432;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	ServerPacket field1433;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1430 = true; // L: 22
		this.field1420 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1102121791"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1736028032"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljx;S)V",
		garbageValue = "21536"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lou;B)V",
		garbageValue = "41"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1012692446"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1728539133"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	} // L: 74

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Lou;",
		garbageValue = "121"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;ZII)V",
		garbageValue = "1924558705"
	)
	public static void method2741(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		NPCComposition.NpcDefinition_archive = var0; // L: 69
		class363.field4361 = var1; // L: 70
		GrandExchangeOfferUnitPriceComparator.field4275 = var2; // L: 71
		NPCComposition.field2022 = var3; // L: 72
	} // L: 73

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "315974479"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1292831199"
	)
	public static int method2729(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) { // L: 87 88 91
			var2 = var2 << 1 | var0 & 1; // L: 89
			var0 >>>= 1; // L: 90
		}

		return var2; // L: 93
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1918112547"
	)
	static final String method2742(int var0) {
		if (var0 < 100000) { // L: 447
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 448 449
		}
	}
}
