import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lji;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1278824965
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1228062939
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -905803903
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lck;",
		garbageValue = "-1678569517"
	)
	static class86[] method5551() {
		return new class86[]{class86.field1098, class86.field1094, class86.field1096, class86.field1102, class86.field1097, class86.field1095}; // L: 17
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method5557() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 13105
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 13106
			var1.clearIsInFriendsChat(); // L: 13107
		}

	} // L: 13109
}
