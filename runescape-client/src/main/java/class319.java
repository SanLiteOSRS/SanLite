import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public class class319 {
	@ObfuscatedName("h")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "28"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4771
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4772
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4773
				int var3 = var2.x >> 7; // L: 4774
				int var4 = var2.y >> 7; // L: 4775
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4776
					if (var2.field1201 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4777
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4778
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4779
					}

					long var5 = SpotAnimationDefinition.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4781
					var2.playerCycle = Client.cycle; // L: 4782
					class139.scene.drawEntity(ApproximateRouteStrategy.Client_plane, var2.x, var2.y, class132.getTileHeight(var2.field1201 * 64 - 64 + var2.x, var2.field1201 * 64 - 64 + var2.y, ApproximateRouteStrategy.Client_plane), var2.field1201 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4783
				}
			}
		}

	} // L: 4787
}
