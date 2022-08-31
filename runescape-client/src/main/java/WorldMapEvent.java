import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1706747549
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILku;Lku;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	public static void method5064() {
		try {
			if (class273.musicPlayerStatus == 1) { // L: 62
				int var0 = ItemContainer.midiPcmStream.method5237(); // L: 63
				if (var0 > 0 && ItemContainer.midiPcmStream.isReady()) { // L: 64
					var0 -= class160.pcmSampleLength; // L: 65
					if (var0 < 0) { // L: 66
						var0 = 0;
					}

					ItemContainer.midiPcmStream.setPcmStreamVolume(var0); // L: 67
					return; // L: 68
				}

				ItemContainer.midiPcmStream.clear(); // L: 70
				ItemContainer.midiPcmStream.removeAll(); // L: 71
				if (NetFileRequest.musicTrackArchive != null) { // L: 72
					class273.musicPlayerStatus = 2;
				} else {
					class273.musicPlayerStatus = 0; // L: 73
				}

				Username.musicTrack = null; // L: 74
				Script.soundCache = null; // L: 75
			}
		} catch (Exception var2) { // L: 78
			var2.printStackTrace(); // L: 79
			ItemContainer.midiPcmStream.clear(); // L: 80
			class273.musicPlayerStatus = 0; // L: 81
			Username.musicTrack = null; // L: 82
			Script.soundCache = null; // L: 83
			NetFileRequest.musicTrackArchive = null; // L: 84
		}

	} // L: 86

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "3"
	)
	static void method5063(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9208
		int[] var3 = Players.Players_indices; // L: 9209
		boolean var4 = false; // L: 9210
		Username var5 = new Username(var1, StructComposition.loginType); // L: 9211

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9212
			Player var7 = Client.players[var3[var6]]; // L: 9213
			if (var7 != null && var7 != ScriptFrame.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9214
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9215
					var8 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2934, Client.packetWriter.isaacCipher); // L: 9217
					var8.packetBuffer.method7667(0); // L: 9218
					var8.packetBuffer.method7647(var3[var6]); // L: 9219
					Client.packetWriter.addNode(var8); // L: 9220
				} else if (var0 == 4) { // L: 9222
					var8 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2957, Client.packetWriter.isaacCipher); // L: 9224
					var8.packetBuffer.method7647(var3[var6]); // L: 9225
					var8.packetBuffer.method7667(0); // L: 9226
					Client.packetWriter.addNode(var8); // L: 9227
				} else if (var0 == 6) { // L: 9229
					var8 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher); // L: 9231
					var8.packetBuffer.method7878(0); // L: 9232
					var8.packetBuffer.method7647(var3[var6]); // L: 9233
					Client.packetWriter.addNode(var8); // L: 9234
				} else if (var0 == 7) { // L: 9236
					var8 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3000, Client.packetWriter.isaacCipher); // L: 9238
					var8.packetBuffer.writeByte(0); // L: 9239
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9240
					Client.packetWriter.addNode(var8); // L: 9241
				}

				var4 = true; // L: 9243
				break;
			}
		}

		if (!var4) { // L: 9247
			VarcInt.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9248
}
