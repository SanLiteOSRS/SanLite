import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public class class475 extends class476 {
	public class475(int var1) {
		super(var1); // L: 7
	} // L: 8

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1596270008"
	)
	void vmethod8737(Buffer var1, int var2) {
	} // L: 12

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "2043831976"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5127
			var0.isUnanimated = false; // L: 5128
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5129 5130
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5132
			int var3 = var0.y >> 7; // L: 5133
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5134
				long var4 = class18.calculateTag(0, 0, 0, false, var0.index); // L: 5135
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5136
					var0.isUnanimated = false; // L: 5137
					var0.tileHeight = class272.getTileHeight(var0.x, var0.y, class473.Client_plane); // L: 5138
					var0.playerCycle = Client.cycle; // L: 5139
					Actor.scene.addNullableObject(class473.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5140
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5143
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5144
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5145
					}

					var0.tileHeight = class272.getTileHeight(var0.x, var0.y, class473.Client_plane); // L: 5147
					var0.playerCycle = Client.cycle; // L: 5148
					Actor.scene.drawEntity(class473.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5149
				}
			}
		}

	} // L: 5153
}
