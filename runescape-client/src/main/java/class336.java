import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class336 {
	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "99"
	)
	static void method6569() {
		int var0 = Players.Players_count; // L: 5064
		int[] var1 = Players.Players_indices; // L: 5065

		for (int var2 = 0; var2 < var0; ++var2) { // L: 5066
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 5067
				HealthBarUpdate.addPlayerToScene(Client.players[var1[var2]], true); // L: 5068
			}
		}

	} // L: 5070
}
