import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class9 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	public static final class9 field46;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	public static final class9 field36;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field43;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field38;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ln;"
	)
	static final class9 field39;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -571441693
	)
	int field40;
	@ObfuscatedName("i")
	String field41;
	@ObfuscatedName("k")
	boolean field42;
	@ObfuscatedName("o")
	boolean field35;

	static {
		field46 = new class9(0, "POST", true, true); // L: 6
		field36 = new class9(1, "GET", true, false); // L: 7
		field43 = new class9(2, "PUT", false, true); // L: 8
		field38 = new class9(3, "PATCH", false, true); // L: 9
		field39 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field40 = var1; // L: 17
		this.field41 = var2; // L: 18
		this.field42 = var3; // L: 19
		this.field35 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "16776960"
	)
	boolean method64() {
		return this.field42; // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field40; // L: 37
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "19617"
	)
	public String method76() {
		return this.field41; // L: 28
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-460350352"
	)
	boolean method66() {
		return this.field35; // L: 32
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "(Lcq;ZI)V",
		garbageValue = "-1754587512"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4831
			var0.isUnanimated = false; // L: 4832
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4833 4834
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4836
			int var3 = var0.y >> 7; // L: 4837
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4838
				long var4 = GroundObject.calculateTag(0, 0, 0, false, var0.index); // L: 4839
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4840
					var0.isUnanimated = false; // L: 4841
					var0.tileHeight = ObjectComposition.getTileHeight(var0.x, var0.y, class268.Client_plane); // L: 4842
					var0.playerCycle = Client.cycle; // L: 4843
					class12.scene.addNullableObject(class268.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4844
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4847
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4848
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4849
					}

					var0.tileHeight = ObjectComposition.getTileHeight(var0.x, var0.y, class268.Client_plane); // L: 4851
					var0.playerCycle = Client.cycle; // L: 4852
					class12.scene.drawEntity(class268.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4853
				}
			}
		}

	} // L: 4857

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIZS)V",
		garbageValue = "12510"
	)
	public static void method79(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher); // L: 12212
		var4.packetBuffer.method7878(var2); // L: 12213
		var4.packetBuffer.method7687(var3 ? Client.field621 : 0); // L: 12214
		var4.packetBuffer.writeIntME(var1); // L: 12215
		var4.packetBuffer.writeIntME(var0); // L: 12216
		Client.packetWriter.addNode(var4); // L: 12217
	} // L: 12218
}
