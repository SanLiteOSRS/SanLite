import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class47 {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "[Ltj;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	VorbisSample field333;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	RawSound field332;
	@ObfuscatedName("av")
	ReentrantLock field331;

	@ObfuscatedSignature(
		descriptor = "(Lca;Lbp;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field333 = var1; // L: 11
		this.field332 = var2; // L: 12
		this.field331 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1898758545"
	)
	static void method844() {
		class390.method7249(24); // L: 2056
		class478.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 2057
	} // L: 2058

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-53"
	)
	static int method843(int var0, Script var1, boolean var2) {
		return 2; // L: 5241
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1940419951"
	)
	static void method845(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9940
		int[] var3 = Players.Players_indices; // L: 9941
		boolean var4 = false; // L: 9942
		Username var5 = new Username(var1, WorldMapScaleHandler.loginType); // L: 9943

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9944
			Player var7 = Client.players[var3[var6]]; // L: 9945
			if (var7 != null && var7 != Projectile.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9946
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9947
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher); // L: 9949
					var8.packetBuffer.method8940(0); // L: 9950
					var8.packetBuffer.method8948(var3[var6]); // L: 9951
					Client.packetWriter.addNode(var8); // L: 9952
				} else if (var0 == 4) { // L: 9954
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 9956
					var8.packetBuffer.method9000(var3[var6]); // L: 9957
					var8.packetBuffer.method8939(0); // L: 9958
					Client.packetWriter.addNode(var8); // L: 9959
				} else if (var0 == 6) { // L: 9961
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9963
					var8.packetBuffer.writeIntME(0); // L: 9964
					var8.packetBuffer.writeShort(var3[var6]); // L: 9965
					Client.packetWriter.addNode(var8); // L: 9966
				} else if (var0 == 7) { // L: 9968
					var8 = ObjectComposition.getPacketBufferNode(ClientPacket.field3102, Client.packetWriter.isaacCipher); // L: 9970
					var8.packetBuffer.writeByte(0); // L: 9971
					var8.packetBuffer.method8949(var3[var6]); // L: 9972
					Client.packetWriter.addNode(var8); // L: 9973
				}

				var4 = true; // L: 9975
				break;
			}
		}

		if (!var4) { // L: 9979
			class59.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9980
}
