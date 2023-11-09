import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 2073555541
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1277128427
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 630160811
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("ap")
	boolean field1385;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 924409333
	)
	int field1383;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -943421313
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	ServerPacket field1388;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	ServerPacket field1389;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	ServerPacket field1390;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1385 = true; // L: 22
		this.field1383 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2072551795"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("al")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)V",
		garbageValue = "-712600048"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpj;I)V",
		garbageValue = "1344285266"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-56"
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
		garbageValue = "-1871566155"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lpj;",
		garbageValue = "0"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "442725709"
	)
	static void method2787(int var0) {
		SequenceDefinition var1 = Coord.SequenceDefinition_get(var0); // L: 12271
		if (var1.isCachedModelIdSet()) { // L: 12272
			int var3 = var1.SequenceDefinition_cachedModelId; // L: 12276
			class134 var5 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var3); // L: 12280
			class134 var4;
			if (var5 != null) { // L: 12281
				var4 = var5; // L: 12282
			} else {
				AbstractArchive var7 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 12286
				AbstractArchive var8 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 12287
				boolean var9 = true; // L: 12289
				byte[] var10 = var7.getFile(var3 >> 16 & 65535, var3 & 65535); // L: 12290
				class134 var6;
				if (var10 == null) { // L: 12291
					var9 = false; // L: 12292
					var6 = null; // L: 12293
				} else {
					int var11 = (var10[1] & 255) << 8 | var10[2] & 255; // L: 12296
					byte[] var12 = var8.getFile(var11, 0); // L: 12299
					if (var12 == null) { // L: 12300
						var9 = false;
					}

					if (!var9) { // L: 12301
						var6 = null; // L: 12302
					} else {
						if (UserComparator7.field1413 == null) { // L: 12305
							class134.field1573 = Runtime.getRuntime().availableProcessors(); // L: 12306
							UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class60()); // L: 12307
						}

						try {
							var6 = new class134(var7, var8, var3, false); // L: 12315
						} catch (Exception var14) { // L: 12317
							var6 = null; // L: 12318
						}
					}
				}

				if (var6 != null) { // L: 12322
					SequenceDefinition.SequenceDefinition_cachedModel.put(var6, (long)var3);
				}

				var4 = var6; // L: 12323
			}

			int var2;
			if (var4 == null) { // L: 12326
				var2 = 2; // L: 12327
			} else {
				var2 = var4.method3044() ? 0 : 1; // L: 12330
			}

			if (var2 == 2) { // L: 12332
				Client.field745.add(var1.SequenceDefinition_cachedModelId); // L: 12333
			}

		}
	} // L: 12273 12335
}
