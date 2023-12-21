import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class101 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 719406161
	)
	@Export("baseY")
	static int baseY;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "-1222371777"
	)
	public static FloorUnderlayDefinition method2723(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2011.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2015.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.field2011.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-429343938"
	)
	static final boolean method2724(Widget var0) {
		int var1 = var0.contentType; // L: 12510
		if (var1 == 205) { // L: 12511
			Client.logoutTimer = 250; // L: 12512
			return true; // L: 12513
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12515
				var2 = (var1 - 300) / 2; // L: 12516
				var3 = var1 & 1; // L: 12517
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12518
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12520
				var2 = (var1 - 314) / 2; // L: 12521
				var3 = var1 & 1; // L: 12522
				Client.playerAppearance.method6317(var2, var3 == 1); // L: 12523
			}

			if (var1 == 324) {
				Client.playerAppearance.method6322(0); // L: 12525
			}

			if (var1 == 325) { // L: 12526
				Client.playerAppearance.method6322(1);
			}

			if (var1 == 326) { // L: 12527
				PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher); // L: 12529
				Client.playerAppearance.write(var4.packetBuffer); // L: 12530
				Client.packetWriter.addNode(var4); // L: 12531
				return true; // L: 12532
			} else {
				return false; // L: 12534
			}
		}
	}
}
