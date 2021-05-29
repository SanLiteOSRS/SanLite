import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("av")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -432974383
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -83736147
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("d")
	boolean field1408;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1169449061
	)
	int field1409;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 239536285
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1411;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1412;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	ServerPacket field1400;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1408 = true;
		this.field1409 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "238860483"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1875758370"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "-2081373116"
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
		descriptor = "(Lls;I)V",
		garbageValue = "-1060689503"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-329279812"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lls;",
		garbageValue = "-1467210924"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lcz;B)V",
		garbageValue = "1"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		World.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "0"
	)
	public static void method2384(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1183744930"
	)
	static final void method2402(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != ObjectComposition.clientPreferences.musicVolume) {
			if (ObjectComposition.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				LoginScreenAnimation.method2219(UrlRequest.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field881 = false;
			} else if (var0 == 0) {
				class124.midiPcmStream.clear();
				class232.musicPlayerStatus = 1;
				ModelData0.musicTrackArchive = null;
				Client.field881 = false;
			} else if (class232.musicPlayerStatus != 0) {
				class232.musicTrackVolume = var0;
			} else {
				class124.midiPcmStream.setPcmStreamVolume(var0);
			}

			ObjectComposition.clientPreferences.musicVolume = var0;
			TileItem.savePreferences();
		}

	}
}
