import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 209603829
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1642289935
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1346002845
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1531578947"
	)
	static final void method5650() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8655 8656 8662
			if (var0.hitpoints == -1) { // L: 8657
				var0.delay = 0; // L: 8658
				GrandExchangeOfferOwnWorldComparator.method1237(var0); // L: 8659
			} else {
				var0.remove(); // L: 8661
			}
		}

	} // L: 8664
}
