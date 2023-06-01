import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1603645389
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILms;Lms;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ae")
	static final void method5640(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 106
	} // L: 107

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2119168570"
	)
	static void method5639(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9721
		int[] var3 = Players.Players_indices; // L: 9722
		boolean var4 = false; // L: 9723
		Username var5 = new Username(var1, class31.loginType); // L: 9724

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9725
			Player var7 = Client.players[var3[var6]]; // L: 9726
			if (var7 != null && var7 != HitSplatDefinition.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9727
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9728
					var8 = class251.getPacketBufferNode(ClientPacket.field3103, Client.packetWriter.isaacCipher); // L: 9730
					var8.packetBuffer.method8995(0); // L: 9731
					var8.packetBuffer.method9139(var3[var6]); // L: 9732
					Client.packetWriter.addNode(var8); // L: 9733
				} else if (var0 == 4) { // L: 9735
					var8 = class251.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher); // L: 9737
					var8.packetBuffer.method9002(var3[var6]); // L: 9738
					var8.packetBuffer.method8993(0); // L: 9739
					Client.packetWriter.addNode(var8); // L: 9740
				} else if (var0 == 6) { // L: 9742
					var8 = class251.getPacketBufferNode(ClientPacket.field3188, Client.packetWriter.isaacCipher); // L: 9744
					var8.packetBuffer.method8994(0); // L: 9745
					var8.packetBuffer.writeShort(var3[var6]); // L: 9746
					Client.packetWriter.addNode(var8); // L: 9747
				} else if (var0 == 7) { // L: 9749
					var8 = class251.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher); // L: 9751
					var8.packetBuffer.writeByte(0); // L: 9752
					var8.packetBuffer.method9004(var3[var6]); // L: 9753
					Client.packetWriter.addNode(var8); // L: 9754
				}

				var4 = true; // L: 9756
				break;
			}
		}

		if (!var4) { // L: 9760
			HealthBarUpdate.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9761
}
