import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Llr;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1424440789
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3284;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1419817901
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1932494637
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 42
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 43
		}
	} // L: 44
}
