import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vd")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("az")
	@Export("array")
	int[] array;

	public IntHashTable(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) { // L: 7 8
		}

		this.array = new int[var2 + var2]; // L: 9

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) { // L: 10
			this.array[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.array[var4 + var4 + 1] = var3++) { // L: 11 15
			for (var4 = var1[var3] & var2 - 1; this.array[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) { // L: 12 13
			}

			this.array[var4 + var4] = var1[var3]; // L: 14
		}

	} // L: 17

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1726110087"
	)
	@Export("get")
	public int get(int var1) {
		int var2 = (this.array.length >> 1) - 1; // L: 20
		int var3 = var1 & var2; // L: 21

		while (true) {
			int var4 = this.array[var3 + var3 + 1]; // L: 23
			if (var4 == -1) { // L: 24
				return -1;
			}

			if (this.array[var3 + var3] == var1) { // L: 25
				return var4;
			}

			var3 = var3 + 1 & var2; // L: 26
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "8"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4009
			NPC.clientPreferences.method2458(!NPC.clientPreferences.method2459()); // L: 4010
			if (NPC.clientPreferences.method2459()) { // L: 4011
				SecureRandomCallable.addGameMessage(99, "", "Roofs are now all hidden"); // L: 4012
			} else {
				SecureRandomCallable.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4015
			}
		}

		if (var0.startsWith("zbuf")) { // L: 4018
			boolean var1 = KitDefinition.method3778(var0.substring(5).trim()) == 1; // L: 4019
			UrlRequest.client.method510(var1); // L: 4020
			Rasterizer3D.method4562(var1); // L: 4021
		}

		if (var0.equalsIgnoreCase("z")) { // L: 4023
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4024
			NPC.clientPreferences.method2465();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4025
			Client.field598 = !Client.field598;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4026
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 4027
			if (var0.equalsIgnoreCase("errortest")) { // L: 4028
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ModeWhere.worldMap.field5031 = !ModeWhere.worldMap.field5031; // L: 4029
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4030
				NPC.clientPreferences.method2464(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4031
				NPC.clientPreferences.method2464(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4032
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4033
				class190.method3709();
			}
		}

		PacketBufferNode var2 = class425.getPacketBufferNode(ClientPacket.field3245, Client.packetWriter.isaacCipher); // L: 4036
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 4037
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4038
		Client.packetWriter.addNode(var2); // L: 4039
	} // L: 4040
}
