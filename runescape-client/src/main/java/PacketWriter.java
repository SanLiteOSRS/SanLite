import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1288575101
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1040078129
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("al")
	boolean field1411;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1263938853
	)
	int field1412;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1428520947
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1414;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1409;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	ServerPacket field1416;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1411 = true; // L: 22
		this.field1412 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "225"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lld;I)V",
		garbageValue = "-1187530783"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1775171508"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "-1239264198"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1549345675"
	)
	static void method2884() {
		try {
			File var0 = new File(Login.userHomeDirectory, "random.dat"); // L: 296
			int var2;
			if (var0.exists()) { // L: 297
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 298
			} else {
				label39:
				for (int var1 = 0; var1 < class85.field1039.length; ++var1) { // L: 301
					for (var2 = 0; var2 < GameObject.field3091.length; ++var2) { // L: 302
						File var3 = new File(GameObject.field3091[var2] + class85.field1039[var1] + File.separatorChar + "random.dat"); // L: 303
						if (var3.exists()) { // L: 304
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 305
							break label39; // L: 306
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 311
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 312
				var2 = var4.read(); // L: 313
				var4.seek(0L); // L: 314
				var4.write(var2); // L: 315
				var4.seek(0L); // L: 316
				var4.close(); // L: 317
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 318
			}
		} catch (IOException var5) { // L: 321
		}

	} // L: 322

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1585666384"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class361.World_worlds != null) { // L: 172
			class129.doWorldSorting(0, class361.World_worlds.length - 1, var0, var1, var2, var3); // L: 173
		}

	} // L: 175

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-577406943"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class13.method177(); // L: 2880
		switch(var0) { // L: 2881
		case 1:
			UserComparator7.method2966(24); // L: 2885
			class139.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2886
			break;
		case 2:
			CollisionMap.method4354(); // L: 2892
		}

	} // L: 2896
}
