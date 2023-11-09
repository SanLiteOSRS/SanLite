import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Ljg;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 230152311
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	static AbstractSocket field3045;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1911786961
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1990774047
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1882304710"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 45
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 46
		}
	} // L: 47

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1762838535"
	)
	static final void method5137() {
		class4.method20("You can't add yourself to your own ignore list"); // L: 168
	} // L: 169
}
