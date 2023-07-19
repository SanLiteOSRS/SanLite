import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 2127538503
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -556987117
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2005510203
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("au")
	boolean field1415;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -331288825
	)
	int field1422;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1823012723
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	ServerPacket field1419;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	ServerPacket field1423;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	ServerPacket field1426;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1415 = true; // L: 22
		this.field1422 = 0; // L: 23
		this.pendingWrites = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "548415980"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-405185002"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llc;B)V",
		garbageValue = "14"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index;
	} // L: 59

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqg;I)V",
		garbageValue = "-72379757"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1514788786"
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
		garbageValue = "-659621408"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lqg;",
		garbageValue = "-1303509733"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILtl;I)Lhq;",
		garbageValue = "-2032143246"
	)
	public static class184 method2870(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		class184 var5 = new class184(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1906 != null && var7.length == var5.field1906.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1906[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1903 != null && var7.length == var5.field1903.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1903[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;I)V",
		garbageValue = "903028464"
	)
	public static void method2867(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfp;I)V",
		garbageValue = "1097628425"
	)
	static void method2869(float var0, float var1, float var2, float var3, class130 var4) {
		float var5 = var1 - var0; // L: 343
		float var6 = var2 - var1; // L: 344
		float var7 = var3 - var2; // L: 345
		float var8 = var6 - var5; // L: 346
		var4.field1541 = var7 - var6 - var8; // L: 347
		var4.field1540 = var8 + var8 + var8; // L: 348
		var4.field1549 = var5 + var5 + var5; // L: 349
		var4.field1538 = var0; // L: 350
	} // L: 351

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1479569640"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 11379
			class399.updateInterface(class179.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11380
		}
	} // L: 11381

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-29"
	)
	static final void method2871(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12213
		ScriptFrame.clientPreferences.method2519(var0); // L: 12214
	} // L: 12215
}
