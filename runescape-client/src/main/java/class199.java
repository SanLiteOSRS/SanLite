import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class199 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("ar")
	static byte[][][] field2004;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2009;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2010;

	static {
		field2007 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "-74786800"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5189
			var0.isUnanimated = false; // L: 5190
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 5191 5192
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5194
			int var3 = var0.y >> 7; // L: 5195
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5196
				long var4 = GrandExchangeOfferAgeComparator.calculateTag(0, 0, 0, false, var0.index); // L: 5197
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5198
					var0.isUnanimated = false; // L: 5199
					var0.tileHeight = class115.getTileHeight(var0.x, var0.y, class87.Client_plane); // L: 5200
					var0.playerCycle = Client.cycle; // L: 5201
					class10.scene.addNullableObject(class87.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5202
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5205
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5206
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5207
					}

					var0.tileHeight = class115.getTileHeight(var0.x, var0.y, class87.Client_plane); // L: 5209
					var0.playerCycle = Client.cycle; // L: 5210
					class10.scene.drawEntity(class87.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5211
				}
			}
		}

	} // L: 5215
}
