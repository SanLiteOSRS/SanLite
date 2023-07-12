import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 556850453
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1359819173
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 628991733
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1162232203"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 61
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 62
		}
	} // L: 63

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1844218282"
	)
	static int method5673(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 191
		return ApproximateRouteStrategy.NetCache_currentResponse != null && ApproximateRouteStrategy.NetCache_currentResponse.key == var2 ? ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - ApproximateRouteStrategy.NetCache_currentResponse.padding) + 1 : 0; // L: 192 193
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1194868259"
	)
	static final void method5665() {
		Client.field707 = Client.cycleCntr; // L: 12547
	} // L: 12548
}
