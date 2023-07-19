import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
public class class344 {
	@ObfuscatedName("ba")
	protected static String field3852;

	static {
		Math.sqrt(8192.0D); // L: 9
	} // L: 10

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	static int method6653(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 33
			var1 /= 2;
		}

		if (var2 > 192) { // L: 34
			var1 /= 2;
		}

		if (var2 > 217) { // L: 35
			var1 /= 2;
		}

		if (var2 > 243) { // L: 36
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 37
		return var3; // L: 38
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1684425927"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5045
			var2 = 1;
		}

		if (var3 < 1) { // L: 5046
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5047
		int var6;
		if (var5 < 0) { // L: 5049
			var6 = Client.field769;
		} else if (var5 >= 100) { // L: 5050
			var6 = Client.field585;
		} else {
			var6 = (Client.field585 - Client.field769) * var5 / 100 + Client.field769; // L: 5051
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5052
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field775) { // L: 5053
			var14 = Client.field775; // L: 5054
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 5055
			if (var6 > Client.field774) { // L: 5056
				var6 = Client.field774; // L: 5057
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 5058
				var9 = (var2 - var8) / 2; // L: 5059
				if (var4) { // L: 5060
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5061
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5062
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5063
				}

				var0 += var9; // L: 5065
				var2 -= var9 * 2; // L: 5066
			}
		} else if (var7 > Client.field542) { // L: 5069
			var14 = Client.field542; // L: 5070
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 5071
			if (var6 < Client.field612) { // L: 5072
				var6 = Client.field612; // L: 5073
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 5074
				var9 = (var3 - var8) / 2; // L: 5075
				if (var4) { // L: 5076
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5077
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5078
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5079
				}

				var1 += var9; // L: 5081
				var3 -= var9 * 2; // L: 5082
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5085
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5086
			int[] var13 = new int[9]; // L: 5088

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 5089
				int var10 = var9 * 32 + 15 + 128; // L: 5090
				int var11 = class36.method693(var10); // L: 5091
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5092
				var11 = GrandExchangeEvents.method6907(var11, var3); // L: 5093
				var13[var9] = var12 * var11 >> 16; // L: 5094
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 5096
		}

		Client.viewportOffsetX = var0; // L: 5099
		Client.viewportOffsetY = var1; // L: 5100
		Client.viewportWidth = var2; // L: 5101
		Client.viewportHeight = var3; // L: 5102
	} // L: 5103

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method6652(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12647
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3423()) { // L: 12648
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12649
				PacketBufferNode var4 = class217.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher); // L: 12650
				var4.packetBuffer.writeByte(4 + Player.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12651
				var4.packetBuffer.writeByte(var0); // L: 12652
				var4.packetBuffer.writeShort(var1); // L: 12653
				var4.packetBuffer.writeBoolean(var2); // L: 12654
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12655
				Client.packetWriter.addNode(var4); // L: 12656
			}
		}
	} // L: 12657
}
