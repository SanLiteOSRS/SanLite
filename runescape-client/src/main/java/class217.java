import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public enum class217 implements class371 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	field2393((byte)-1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	field2392((byte)0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	field2391((byte)1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	field2395((byte)2);

	@ObfuscatedName("ay")
	public byte field2394;

	class217(byte var3) {
		this.field2394 = var3; // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1233989967"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2394; // L: 23
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1571144597"
	)
	public static int method4379(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 26
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Llq;Luc;B)Llc;",
		garbageValue = "30"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = VertexNormal.method5010(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0;
		return var2; // L: 38
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-439014366"
	)
	public static int method4380(int var0) {
		return class303.field3379[var0]; // L: 37
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-365739068"
	)
	public static byte[] method4378() {
		byte[] var0 = new byte[24]; // L: 323

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 325
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 326

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 327 328 329
			}

			if (var1 >= 24) { // L: 331
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 334
				var0[var2] = -1;
			}
		}

		return var0; // L: 336
	}
}
