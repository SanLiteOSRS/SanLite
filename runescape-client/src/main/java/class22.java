import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class22 extends class14 {
	@ObfuscatedName("t")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1115122599
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 242899457
	)
	int field194;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field194 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field194 = var1.readUnsignedShort();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method121(this.field194);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "-115271413"
	)
	public static PacketBufferNode method247() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "188298202"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class21.getPacketBufferNode(ClientPacket.field2652, Client.packetWriter.isaacCipher);
		var2.packetBuffer.method6619(var1);
		var2.packetBuffer.writeIntME(var0);
		Client.packetWriter.addNode(var2);
	}
}
