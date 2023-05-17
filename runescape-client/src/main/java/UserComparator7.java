import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;B)I",
		garbageValue = "-76"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("af")
	public static final int method2910(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (1.0D + var2);
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = 6.0D * (var12 - var14) * var16 + var14;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var0);
			} else {
				var8 = var14; // L: 29
			}

			if (6.0D * var20 < 1.0D) { // L: 30
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = (0.6666666666666666D - var20) * (var12 - var14) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1532029373"
	)
	public static int method2904() {
		return Rasterizer3D.field2514.field2790; // L: 122
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-1934960343"
	)
	static int method2911(int var0, Script var1, boolean var2) {
		return 2; // L: 5044
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "129719618"
	)
	static void method2909(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9421
		int[] var3 = Players.Players_indices; // L: 9422
		boolean var4 = false; // L: 9423
		Username var5 = new Username(var1, class70.loginType); // L: 9424

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9425
			Player var7 = Client.players[var3[var6]]; // L: 9426
			if (var7 != null && var7 != MusicPatchNode.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9427
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9428
					var8 = class330.getPacketBufferNode(ClientPacket.field3127, Client.packetWriter.isaacCipher); // L: 9430
					var8.packetBuffer.method9203(0); // L: 9431
					var8.packetBuffer.writeShort(var3[var6]); // L: 9432
					Client.packetWriter.addNode(var8); // L: 9433
				} else if (var0 == 4) { // L: 9435
					var8 = class330.getPacketBufferNode(ClientPacket.field3160, Client.packetWriter.isaacCipher); // L: 9437
					var8.packetBuffer.method9114(0); // L: 9438
					var8.packetBuffer.method9132(var3[var6]); // L: 9439
					Client.packetWriter.addNode(var8); // L: 9440
				} else if (var0 == 6) { // L: 9442
					var8 = class330.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 9444
					var8.packetBuffer.method9096(var3[var6]); // L: 9445
					var8.packetBuffer.method9114(0); // L: 9446
					Client.packetWriter.addNode(var8); // L: 9447
				} else if (var0 == 7) { // L: 9449
					var8 = class330.getPacketBufferNode(ClientPacket.field3116, Client.packetWriter.isaacCipher); // L: 9451
					var8.packetBuffer.method9257(var3[var6]); // L: 9452
					var8.packetBuffer.method9086(0); // L: 9453
					Client.packetWriter.addNode(var8); // L: 9454
				}

				var4 = true; // L: 9456
				break;
			}
		}

		if (!var4) { // L: 9460
			UserComparator5.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9461
}
