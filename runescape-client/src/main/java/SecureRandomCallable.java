import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 42

	public Object call() {
		SecureRandom var2 = new SecureRandom(); // L: 48
		var2.nextInt(); // L: 49
		return var2; // L: 52
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1949956925"
	)
	public static final synchronized long method2320() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class317.field3452) { // L: 15
			class317.field3451 += class317.field3452 - var0; // L: 16
		}

		class317.field3452 = var0; // L: 18
		return var0 + class317.field3451; // L: 19
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "15"
	)
	static final void method2319(String var0) {
		class209.addGameMessage(30, "", var0); // L: 109
	} // L: 110

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1186987746"
	)
	static void method2318(int var0, String var1) {
		int var2 = Players.Players_count; // L: 10049
		int[] var3 = Players.Players_indices; // L: 10050
		boolean var4 = false; // L: 10051
		Username var5 = new Username(var1, FriendLoginUpdate.loginType); // L: 10052

		for (int var6 = 0; var6 < var2; ++var6) { // L: 10053
			Player var7 = Client.players[var3[var6]]; // L: 10054
			if (var7 != null && var7 != VarpDefinition.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 10055
				PacketBufferNode var8;
				if (var0 == 1) { // L: 10056
					var8 = ViewportMouse.getPacketBufferNode(ClientPacket.field3211, Client.packetWriter.isaacCipher); // L: 10058
					var8.packetBuffer.writeByte(0); // L: 10059
					var8.packetBuffer.method9508(var3[var6]); // L: 10060
					Client.packetWriter.addNode(var8); // L: 10061
				} else if (var0 == 4) { // L: 10063
					var8 = ViewportMouse.getPacketBufferNode(ClientPacket.field3265, Client.packetWriter.isaacCipher); // L: 10065
					var8.packetBuffer.writeShort(var3[var6]); // L: 10066
					var8.packetBuffer.method9505(0); // L: 10067
					Client.packetWriter.addNode(var8); // L: 10068
				} else if (var0 == 6) { // L: 10070
					var8 = ViewportMouse.getPacketBufferNode(ClientPacket.field3247, Client.packetWriter.isaacCipher); // L: 10072
					var8.packetBuffer.method9505(0); // L: 10073
					var8.packetBuffer.method9508(var3[var6]); // L: 10074
					Client.packetWriter.addNode(var8); // L: 10075
				} else if (var0 == 7) { // L: 10077
					var8 = ViewportMouse.getPacketBufferNode(ClientPacket.field3207, Client.packetWriter.isaacCipher); // L: 10079
					var8.packetBuffer.method9505(0); // L: 10080
					var8.packetBuffer.method9548(var3[var6]); // L: 10081
					Client.packetWriter.addNode(var8); // L: 10082
				}

				var4 = true; // L: 10084
				break;
			}
		}

		if (!var4) { // L: 10088
			class209.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 10089

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIZI)V",
		garbageValue = "-2090331591"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11194
		int var5 = var0.height; // L: 11195
		if (var0.widthAlignment == 0) { // L: 11196
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11197
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11198
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11199
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11200
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 11201
		}

		if (var0.widthAlignment == 4) { // L: 11202
			var0.width = var0.field3843 * var0.height / var0.field3732;
		}

		if (var0.heightAlignment == 4) { // L: 11203
			var0.height = var0.field3732 * var0.width / var0.field3843;
		}

		if (var0.contentType == 1337) { // L: 11204
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11205
			var0.method6806().method6512(var0.width, var0.height); // L: 11206
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11208
			ScriptEvent var6 = new ScriptEvent(); // L: 11209
			var6.widget = var0; // L: 11210
			var6.args = var0.onResize; // L: 11211
			Client.scriptEvents.addFirst(var6); // L: 11212
		}

	} // L: 11214
}
