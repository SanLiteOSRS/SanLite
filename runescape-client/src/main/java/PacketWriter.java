import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1878760487
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 824884821
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("h")
	boolean field1412;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1875627651
	)
	int field1408;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 120433437
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1410;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1411;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	ServerPacket field1399;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1412 = true;
		this.field1408 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055980283"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1160814368"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "-1221651734"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Llk;S)V",
		garbageValue = "3168"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2099753174"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1099127678"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Llk;",
		garbageValue = "526936130"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1259341442"
	)
	static boolean method2496(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "22"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-277336927"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class20.loadInterface(var0)) {
			MenuAction.updateInterface(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
