import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	} // L: 7

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1478013130"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012786095"
	)
	public abstract int vmethod8271() throws IOException;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "257991578"
	)
	public abstract int vmethod8273() throws IOException;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "1"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "1580683310"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-1"
	)
	static void method8256(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10089
		int[] var3 = Players.Players_indices; // L: 10090
		boolean var4 = false; // L: 10091
		Username var5 = new Username(var1, class127.loginType); // L: 10092

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10093
			Player var7 = Client.players[var3[var6]]; // L: 10094
			if (var7 != null && var7 != class133.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10095
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10096
					var8 = class425.getPacketBufferNode(ClientPacket.field3204, Client.packetWriter.isaacCipher); // L: 10098
					var8.packetBuffer.method9398(var3[var6]); // L: 10099
					var8.packetBuffer.writeByte(0); // L: 10100
					Client.packetWriter.addNode(var8); // L: 10101
				} else if (var0 == 4) { // L: 10103
					var8 = class425.getPacketBufferNode(ClientPacket.field3287, Client.packetWriter.isaacCipher); // L: 10105
					var8.packetBuffer.method9304(var3[var6]); // L: 10106
					var8.packetBuffer.method9296(0); // L: 10107
					Client.packetWriter.addNode(var8); // L: 10108
				} else if (var0 == 6) { // L: 10110
					var8 = class425.getPacketBufferNode(ClientPacket.field3298, Client.packetWriter.isaacCipher); // L: 10112
					var8.packetBuffer.method9398(var3[var6]); // L: 10113
					var8.packetBuffer.method9296(0); // L: 10114
					Client.packetWriter.addNode(var8); // L: 10115
				} else if (var0 == 7) { // L: 10117
					var8 = class425.getPacketBufferNode(ClientPacket.field3226, Client.packetWriter.isaacCipher); // L: 10119
					var8.packetBuffer.method9296(0); // L: 10120
					var8.packetBuffer.method9398(var3[var6]); // L: 10121
					Client.packetWriter.addNode(var8); // L: 10122
				}

				var4 = true; // L: 10124
				break;
			}
		}

		if (!var4) { // L: 10128
			SecureRandomCallable.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10129
}
