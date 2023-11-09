import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class96 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("World_request")
	static UrlRequest World_request;

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1862516219"
	)
	static final void method2519(int var0, int var1, int var2) {
		if (TextureProvider.cameraX < var0) { // L: 3979
			TextureProvider.cameraX = (var0 - TextureProvider.cameraX) * UrlRequest.field1398 / 1000 + TextureProvider.cameraX + class323.field4093; // L: 3980
			if (TextureProvider.cameraX > var0) { // L: 3981
				TextureProvider.cameraX = var0;
			}
		}

		if (TextureProvider.cameraX > var0) { // L: 3983
			TextureProvider.cameraX -= (TextureProvider.cameraX - var0) * UrlRequest.field1398 / 1000 + class323.field4093; // L: 3984
			if (TextureProvider.cameraX < var0) { // L: 3985
				TextureProvider.cameraX = var0;
			}
		}

		if (class31.cameraY < var1) { // L: 3987
			class31.cameraY = (var1 - class31.cameraY) * UrlRequest.field1398 / 1000 + class31.cameraY + class323.field4093; // L: 3988
			if (class31.cameraY > var1) { // L: 3989
				class31.cameraY = var1;
			}
		}

		if (class31.cameraY > var1) { // L: 3991
			class31.cameraY -= (class31.cameraY - var1) * UrlRequest.field1398 / 1000 + class323.field4093; // L: 3992
			if (class31.cameraY < var1) { // L: 3993
				class31.cameraY = var1;
			}
		}

		if (class313.cameraZ < var2) { // L: 3995
			class313.cameraZ = (var2 - class313.cameraZ) * UrlRequest.field1398 / 1000 + class313.cameraZ + class323.field4093; // L: 3996
			if (class313.cameraZ > var2) { // L: 3997
				class313.cameraZ = var2;
			}
		}

		if (class313.cameraZ > var2) { // L: 3999
			class313.cameraZ -= (class313.cameraZ - var2) * UrlRequest.field1398 / 1000 + class323.field4093; // L: 4000
			if (class313.cameraZ < var2) { // L: 4001
				class313.cameraZ = var2;
			}
		}

	} // L: 4003

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "64"
	)
	static void method2517(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9702
		int[] var3 = Players.Players_indices; // L: 9703
		boolean var4 = false; // L: 9704
		Username var5 = new Username(var1, ViewportMouse.loginType); // L: 9705

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9706
			Player var7 = Client.players[var3[var6]]; // L: 9707
			if (var7 != null && var7 != class296.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9708
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9709
					var8 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3067, Client.packetWriter.isaacCipher); // L: 9711
					var8.packetBuffer.method8434(0); // L: 9712
					var8.packetBuffer.method8443(var3[var6]); // L: 9713
					Client.packetWriter.addNode(var8); // L: 9714
				} else if (var0 == 4) { // L: 9716
					var8 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2999, Client.packetWriter.isaacCipher); // L: 9718
					var8.packetBuffer.method8434(0); // L: 9719
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9720
					Client.packetWriter.addNode(var8); // L: 9721
				} else if (var0 == 6) { // L: 9723
					var8 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3027, Client.packetWriter.isaacCipher); // L: 9725
					var8.packetBuffer.method8443(var3[var6]); // L: 9726
					var8.packetBuffer.method8434(0); // L: 9727
					Client.packetWriter.addNode(var8); // L: 9728
				} else if (var0 == 7) { // L: 9730
					var8 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3046, Client.packetWriter.isaacCipher); // L: 9732
					var8.packetBuffer.writeShort(var3[var6]); // L: 9733
					var8.packetBuffer.writeByte(0); // L: 9734
					Client.packetWriter.addNode(var8); // L: 9735
				}

				var4 = true; // L: 9737
				break;
			}
		}

		if (!var4) { // L: 9741
			MouseHandler.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9742
}
