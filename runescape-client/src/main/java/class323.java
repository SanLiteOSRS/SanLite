import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public enum class323 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	field4092(-1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	field4088(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	field4090(1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	field4089(2);

	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = 1507802483
	)
	static int field4093;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -174911481
	)
	final int field4091;

	class323(int var3) {
		this.field4091 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4091; // L: 20
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1944501029"
	)
	static final void method6271(boolean var0) {
		class355.playPcmPlayers(); // L: 5778
		++Client.packetWriter.pendingWrites; // L: 5779
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5780
			Client.packetWriter.pendingWrites = 0; // L: 5781
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5782
				PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3040, Client.packetWriter.isaacCipher); // L: 5784
				Client.packetWriter.addNode(var1); // L: 5785

				try {
					Client.packetWriter.flush(); // L: 5787
				} catch (IOException var3) { // L: 5789
					Client.hadNetworkError = true; // L: 5790
				}
			}

		}
	} // L: 5793
}
