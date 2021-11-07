import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lib;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1045179261
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -881664177
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1172776223
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705967924"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}
}
