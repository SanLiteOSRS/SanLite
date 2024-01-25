import java.io.File;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loo;Loo;I)I",
		garbageValue = "-2124939265"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "1287482454"
	)
	static void method7178(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method7181() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 5017 5018 5056
			if (var0.plane == class113.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 5019
				if (Client.cycle >= var0.cycleStart) { // L: 5020
					NPC var1;
					int var2;
					Player var3;
					if (!var0.isMoving && var0.field959 != 0) { // L: 5021
						if (var0.field959 > 0) { // L: 5022
							var1 = Client.npcs[var0.field959 - 1]; // L: 5023
							if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5024
								var0.sourceX = var1.x; // L: 5025
								var0.sourceY = var1.y; // L: 5026
								var0.setDestination(var0.field960, var0.field953, var0.field954, Client.cycle); // L: 5027
							}
						} else {
							var2 = -var0.field959 - 1; // L: 5032
							if (var2 == Client.localPlayerIndex) { // L: 5033
								var3 = class25.localPlayer;
							} else {
								var3 = Client.players[var2]; // L: 5034
							}

							if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) { // L: 5035
								var0.sourceX = var3.x; // L: 5036
								var0.sourceY = var3.y; // L: 5037
								var0.setDestination(var0.field960, var0.field953, var0.field954, Client.cycle); // L: 5038
							}
						}
					}

					if (var0.targetIndex > 0) { // L: 5042
						var1 = Client.npcs[var0.targetIndex - 1]; // L: 5043
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5044
							var0.setDestination(var1.x, var1.y, class19.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 5046
						var2 = -var0.targetIndex - 1; // L: 5048
						if (var2 == Client.localPlayerIndex) { // L: 5049
							var3 = class25.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 5050
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class19.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 5051
						}
					}

					var0.advance(Client.field576); // L: 5053
					GrandExchangeOfferOwnWorldComparator.scene.drawEntity(class113.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 5054
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5058
}
