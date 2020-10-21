import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("cw")
	public static char field1350;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1900413985
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lky;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1678952517
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("g")
	boolean field1344;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2044305253
	)
	int field1345;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2009057559
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	ServerPacket field1336;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	ServerPacket field1348;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lga;"
	)
	ServerPacket field1346;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1344 = true;
		this.field1345 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-256200238"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1276124374"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lgb;I)V",
		garbageValue = "1906163027"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lln;I)V",
		garbageValue = "-666263315"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2058968107"
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
		signature = "(B)V",
		garbageValue = "-102"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(B)Lln;",
		garbageValue = "43"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)J",
		garbageValue = "-123"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis();
		if (var0 < class306.field3723) {
			class217.field2536 += class306.field3723 - var0;
		}

		class306.field3723 = var0;
		return class217.field2536 + var0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkf;Llq;I)Llq;",
		garbageValue = "309027289"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class297.method5378(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-371855810"
	)
	public static void method2357() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IS)I",
		garbageValue = "-27993"
	)
	public static int method2360(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "82642187"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapSprite.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
