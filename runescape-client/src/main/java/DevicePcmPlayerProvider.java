import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("sp")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lbf;",
		garbageValue = "-265670238"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "42"
	)
	static final void method287(boolean var0) {
		class190.method3774(); // L: 6041
		++Client.packetWriter.pendingWrites; // L: 6042
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 6043
			Client.packetWriter.pendingWrites = 0; // L: 6044
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 6045
				PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3225, Client.packetWriter.isaacCipher); // L: 6047
				Client.packetWriter.addNode(var1); // L: 6048

				try {
					Client.packetWriter.flush(); // L: 6050
				} catch (IOException var3) { // L: 6052
					Client.hadNetworkError = true; // L: 6053
				}
			}

		}
	} // L: 6056
}
