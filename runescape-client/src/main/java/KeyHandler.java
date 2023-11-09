import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("wd")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("dn")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("ed")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1789640955
	)
	static int field162;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-60773254"
	)
	public static int method431(int var0, int var1, int var2) {
		int var3 = class228.method4505(var2 - var1 + 1); // L: 50
		var3 <<= var1; // L: 51
		return var0 & ~var3; // L: 52
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-725833336"
	)
	static boolean method430() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1453
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1454
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1455
				if (!var0.isLoaded()) {
					return false; // L: 1456
				}

				++Client.archiveLoadersDone; // L: 1457
			}

			return true; // L: 1459
		} else {
			return true; // L: 1458
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "123"
	)
	static void method428(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10007
		int[] var3 = Players.Players_indices; // L: 10008
		boolean var4 = false; // L: 10009
		Username var5 = new Username(var1, class457.loginType); // L: 10010

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10011
			Player var7 = Client.players[var3[var6]]; // L: 10012
			if (var7 != null && var7 != class136.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10013
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10014
					var8 = class503.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher); // L: 10016
					var8.packetBuffer.writeIntME(var3[var6]); // L: 10017
					var8.packetBuffer.method9118(0); // L: 10018
					Client.packetWriter.addNode(var8); // L: 10019
				} else if (var0 == 4) { // L: 10021
					var8 = class503.getPacketBufferNode(ClientPacket.field3150, Client.packetWriter.isaacCipher); // L: 10023
					var8.packetBuffer.method9126(var3[var6]); // L: 10024
					var8.packetBuffer.writeByte(0); // L: 10025
					Client.packetWriter.addNode(var8); // L: 10026
				} else if (var0 == 6) { // L: 10028
					var8 = class503.getPacketBufferNode(ClientPacket.field3140, Client.packetWriter.isaacCipher); // L: 10030
					var8.packetBuffer.writeIntME(var3[var6]); // L: 10031
					var8.packetBuffer.method9118(0); // L: 10032
					Client.packetWriter.addNode(var8); // L: 10033
				} else if (var0 == 7) { // L: 10035
					var8 = class503.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 10037
					var8.packetBuffer.writeShort(var3[var6]); // L: 10038
					var8.packetBuffer.method9244(0); // L: 10039
					Client.packetWriter.addNode(var8); // L: 10040
				}

				var4 = true; // L: 10042
				break;
			}
		}

		if (!var4) { // L: 10046
			class415.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10047
}
