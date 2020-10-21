import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
final class class4 implements class0 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "192866787"
	)
	public void vmethod69(Object var1, Buffer var2) {
		this.method67((String)var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1094020977"
	)
	public Object vmethod72(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lkb;B)V",
		garbageValue = "-103"
	)
	void method67(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lhi;S)V",
		garbageValue = "-19591"
	)
	public static void method77(Huffman var0) {
		class219.huffman = var0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lgz;Lmh;B)Lgk;",
		garbageValue = "10"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = ChatChannel.method2363();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIB)Lbk;",
		garbageValue = "-20"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "43"
	)
	static void method78() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "([BIII)I",
		garbageValue = "-56891300"
	)
	public static int method81(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
