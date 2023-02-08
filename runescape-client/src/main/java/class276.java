import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class276 {
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)Z",
		garbageValue = "536221061"
	)
	static final boolean method5534(Widget var0) {
		int var1 = var0.contentType; // L: 12940
		if (var1 == 205) { // L: 12941
			Client.logoutTimer = 250; // L: 12942
			return true; // L: 12943
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12945
				var2 = (var1 - 300) / 2; // L: 12946
				var3 = var1 & 1; // L: 12947
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12948
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12950
				var2 = (var1 - 314) / 2; // L: 12951
				var3 = var1 & 1; // L: 12952
				Client.playerAppearance.method5885(var2, var3 == 1); // L: 12953
			}

			if (var1 == 324) {
				Client.playerAppearance.method5898(0); // L: 12955
			}

			if (var1 == 325) { // L: 12956
				Client.playerAppearance.method5898(1);
			}

			if (var1 == 326) { // L: 12957
				PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher); // L: 12959
				Client.playerAppearance.write(var4.packetBuffer); // L: 12960
				Client.packetWriter.addNode(var4); // L: 12961
				return true; // L: 12962
			} else {
				return false; // L: 12964
			}
		}
	}
}
