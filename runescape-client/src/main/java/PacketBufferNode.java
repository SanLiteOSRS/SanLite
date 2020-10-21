import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "[Lgb;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 110077839
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1747169149
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lky;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1051886947
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1940555210"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "416660759"
	)
	static void method3726() {
		Login.worldSelectOpen = false;
		UserComparator2.leftTitleSprite.drawAt(Login.xPadding, 0);
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		AbstractByteArrayCopier.logoSprite.drawAt(Login.xPadding + 382 - AbstractByteArrayCopier.logoSprite.subWidth / 2, 18);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(Ldc;B)V",
		garbageValue = "1"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
