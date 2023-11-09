import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -311195513
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2078791209
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("av")
	boolean field1417;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2107809583
	)
	int field1423;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1108173533
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1416;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1421;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	ServerPacket field1422;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1417 = true; // L: 22
		this.field1423 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1305418239"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
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
		descriptor = "(Llv;I)V",
		garbageValue = "1819467600"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "12780855"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2143075980"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1207430407"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "29"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Liy;I)V",
		garbageValue = "-950444283"
	)
	static void method2802(class212 var0) {
		if (var0 != null && var0.field2313 != null) { // L: 5081
			if (var0.field2313.childIndex >= 0) { // L: 5082
				Widget var1 = VarbitComposition.getWidget(var0.field2313.parentId); // L: 5083
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2313.childIndex >= var1.children.length || var0.field2313 != var1.children[var0.field2313.childIndex]) { // L: 5084
					return; // L: 5085
				}
			}

			if (var0.field2313.type == 11 && var0.field2310 == 0) { // L: 5088
				if (var0.field2313.method6488(var0.field2311, var0.field2312, 0, 0)) { // L: 5089
					switch(var0.field2313.method6462()) { // L: 5090
					case 0:
						NPC.openURL(var0.field2313.method6464(), true, false); // L: 5112
						break;
					case 1:
						int var2 = UserComparator8.getWidgetFlags(var0.field2313); // L: 5093
						boolean var5 = (var2 >> 22 & 1) != 0; // L: 5095
						if (var5) { // L: 5097
							int[] var3 = var0.field2313.method6561(); // L: 5098
							if (var3 != null) { // L: 5099
								PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3186, Client.packetWriter.isaacCipher); // L: 5100
								var4.packetBuffer.writeIntME(var0.field2313.childIndex); // L: 5101
								var4.packetBuffer.method9138(var3[1]); // L: 5102
								var4.packetBuffer.method9139(var0.field2313.method6437()); // L: 5103
								var4.packetBuffer.method9137(var3[2]); // L: 5104
								var4.packetBuffer.method9137(var3[0]); // L: 5105
								var4.packetBuffer.method9139(var0.field2313.id); // L: 5106
								Client.packetWriter.addNode(var4); // L: 5107
							}
						}
					}
				}
			} else if (var0.field2313.type == 12) { // L: 5117
				class330 var6 = var0.field2313.method6504(); // L: 5118
				if (var6 != null && var6.method6212()) { // L: 5119
					switch(var0.field2310) { // L: 5120
					case 0:
						Client.field612.method4126(var0.field2313); // L: 5122
						var6.method6160(true); // L: 5123
						var6.method6427(var0.field2311, var0.field2312, Client.field750.method4151(82), Client.field750.method4151(81)); // L: 5124
						break;
					case 1:
						var6.method6200(var0.field2311, var0.field2312); // L: 5127
					}
				}
			}

		}
	} // L: 5132
}
