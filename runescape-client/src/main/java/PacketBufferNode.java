import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Llt;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2000268077
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1985357597
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 267810715
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 42
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 43
		}
	} // L: 44

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "-2052914707"
	)
	static void method5741(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 166
			Buffer var3 = new Buffer(500); // L: 167
			var3.writeByte(3); // L: 168
			var3.writeByte(var1 != null ? 1 : 0); // L: 169
			var3.writeCESU8(var0.getPath()); // L: 170
			if (var1 != null) {
				var3.writeCESU8(""); // L: 171
			}

			var2.write(var3.array, 0, var3.offset); // L: 172
			var2.close(); // L: 173
		} catch (IOException var4) { // L: 175
			var4.printStackTrace(); // L: 176
		}

	} // L: 178
}
