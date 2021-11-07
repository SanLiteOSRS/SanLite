import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -755097021
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2006486583
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1176524853
	)
	@Export("z")
	int z;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 836304425
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lhp;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1811785448"
	)
	static void method4623() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class132.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
