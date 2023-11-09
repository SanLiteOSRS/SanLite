import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class85 {
	@ObfuscatedName("bk")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	public static int method2273(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lto;B)V",
		garbageValue = "82"
	)
	static final void method2275(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) { // L: 444
			int var2 = Players.Players_pendingUpdateIndices[var1]; // L: 445
			Player var3 = Client.players[var2]; // L: 446
			int var4 = var0.readUnsignedByte(); // L: 447
			if ((var4 & 1) != 0) { // L: 448
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 32768) != 0) {
				var4 += var0.readUnsignedByte() << 16; // L: 449
			}

			class53.method1086(var0, var2, var3, var4); // L: 450
		}

	} // L: 452

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-67"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3735
			class449.clientPreferences.method2447(!class449.clientPreferences.method2448()); // L: 3736
			if (class449.clientPreferences.method2448()) { // L: 3737
				MouseHandler.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3738
			} else {
				MouseHandler.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3741
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3744
			boolean var1 = HealthBarUpdate.method2412(var0.substring(5).trim()) == 1; // L: 3745
			class219.client.method510(var1); // L: 3746
			Rasterizer3D.method4390(var1); // L: 3747
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3749
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3750
			class449.clientPreferences.method2453();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3751
			Client.field764 = !Client.field764;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3752
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3753
			if (var0.equalsIgnoreCase("errortest")) { // L: 3754
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				Canvas.worldMap.showCoord = !Canvas.worldMap.showCoord; // L: 3755
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3756
				class449.clientPreferences.method2452(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3757
				class449.clientPreferences.method2452(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3758
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3759
				Renderable.method4709();
			}
		}

		PacketBufferNode var2 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3190, Client.packetWriter.isaacCipher); // L: 3762
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3763
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3764
		Client.packetWriter.addNode(var2); // L: 3765
	} // L: 3766
}
