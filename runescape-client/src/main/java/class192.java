import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class192 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	public static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2103900652"
	)
	static final void method3779() {
		int var0;
		int var1;
		int var2;
		if (!Client.field789) { // L: 4029
			var0 = WorldMapArea.field2529 * 128 + 64; // L: 4030
			var1 = UserComparator7.field1462 * 128 + 64; // L: 4031
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - WorldMapSectionType.field2609; // L: 4032
			class7.method53(var0, var2, var1); // L: 4033
		} else if (Client.field813 != null) { // L: 4035
			FriendsChatMember.cameraX = Client.field813.vmethod8869(); // L: 4036
			class317.cameraZ = Client.field813.vmethod8868(); // L: 4037
			if (Client.field614) { // L: 4038
				class18.cameraY = Client.field813.vmethod8874(); // L: 4039
			} else {
				class18.cameraY = class272.getTileHeight(FriendsChatMember.cameraX, class317.cameraZ, class473.Client_plane) - Client.field813.vmethod8874(); // L: 4042
			}

			Client.field813.method8882(); // L: 4044
		}

		if (!Client.field790) { // L: 4046
			var0 = VarbitComposition.field2065 * 16384 + 64; // L: 4047
			var1 = class11.field46 * 16384 + 64; // L: 4048
			var2 = class272.getTileHeight(var0, var1, class473.Client_plane) - ChatChannel.field1045; // L: 4049
			int var3 = var0 - FriendsChatMember.cameraX; // L: 4050
			int var4 = var2 - class18.cameraY; // L: 4051
			int var5 = var1 - class317.cameraZ; // L: 4052
			int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3)); // L: 4053
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 4054
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 4055
			ScriptEvent.method2360(var7, var8); // L: 4056
		} else {
			if (Client.field794 != null) { // L: 4059
				FriendSystem.cameraPitch = Client.field794.method8865(); // L: 4060
				FriendSystem.cameraPitch = Math.min(Math.max(FriendSystem.cameraPitch, 128), 383); // L: 4061
				Client.field794.method8882(); // L: 4062
			}

			if (Client.field793 != null) { // L: 4064
				Script.cameraYaw = Client.field793.method8865() & 2047; // L: 4065
				Client.field793.method8882(); // L: 4066
			}
		}

	} // L: 4069

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "997645488"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3251, Client.packetWriter.isaacCipher); // L: 10123
		var2.packetBuffer.writeIntME(var1); // L: 10124
		var2.packetBuffer.method9525(var0); // L: 10125
		Client.packetWriter.addNode(var2); // L: 10126
	} // L: 10127
}
