import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public final class class305 {
	@ObfuscatedName("v")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("n")
	static long[] field3751;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field3751 = new long[12];

		for (int var0 = 0; var0 < field3751.length; ++var0) {
			field3751[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	static final void method5533(int var0, int var1) {
		if (Client.field871[var0] != null) {
			if (var1 >= 0 && var1 < Client.field871[var0].method27()) {
				class9 var2 = (class9)Client.field871[var0].field28.get(var1);
				if (var2.field83 == -1) {
					PacketWriter var3 = Client.packetWriter;
					PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2612, var3.isaacCipher);
					var4.packetBuffer.writeByte(3 + Tiles.stringCp1252NullTerminatedByteSize(var2.field84));
					var4.packetBuffer.writeByte(var0);
					var4.packetBuffer.writeShort(var1);
					var4.packetBuffer.writeStringCp1252NullTerminated(var2.field84);
					var3.addNode(var4);
				}
			}
		}
	}
}
