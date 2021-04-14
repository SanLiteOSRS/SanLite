import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		signature = "Lhu;"
	)
	static Widget field1394;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lli;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1424950051
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lnu;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lnk;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -408097885
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("h")
	boolean field1388;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1141971331
	)
	int field1391;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1591339787
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	ServerPacket field1381;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	ServerPacket field1392;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgg;"
	)
	ServerPacket field1393;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1388 = true;
		this.field1391 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "5"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "18"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lgy;B)V",
		garbageValue = "95"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lli;I)V",
		garbageValue = "949465191"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-76"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-80"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Lli;",
		garbageValue = "-99883679"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[Lgc;",
		garbageValue = "22"
	)
	static LoginPacket[] method2386() {
		return new LoginPacket[]{LoginPacket.field2449, LoginPacket.field2450, LoginPacket.field2454, LoginPacket.field2452, LoginPacket.field2451, LoginPacket.field2456};
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "35"
	)
	public static void method2368(int var0) {
		class210.musicPlayerStatus = 1;
		class210.musicTrackArchive = null;
		FaceNormal.musicTrackGroupId = -1;
		WorldMapID.musicTrackFileId = -1;
		class375.musicTrackVolume = 0;
		class210.musicTrackBoolean = false;
		class1.pcmSampleLength = var0;
	}
}
