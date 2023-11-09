import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1984190391
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)I",
		garbageValue = "-1019476190"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)I",
		garbageValue = "1756748027"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	static final void method7992() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8451 8452 8495
			if (var0.hitpoints > 0) { // L: 8453
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 8454
				if (var0.objectId >= 0) { // L: 8456
					var2 = var0.objectId; // L: 8458
					var3 = var0.field1186; // L: 8459
					var4 = WorldMapElement.getObjectDefinition(var2); // L: 8461
					if (var3 == 11) { // L: 8462
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 8463
						var3 = 4;
					}

					var1 = var4.method3892(var3); // L: 8464
					if (!var1) { // L: 8466
						continue;
					}
				}

				WorldMap.method8696(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1185, var0.field1186, var0.field1190); // L: 8468
				var0.remove(); // L: 8469
			} else {
				if (var0.delay > 0) { // L: 8473
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 8474
					if (var0.field1187 >= 0) { // L: 8476
						var2 = var0.field1187; // L: 8478
						var3 = var0.field1183; // L: 8479
						var4 = WorldMapElement.getObjectDefinition(var2); // L: 8481
						if (var3 == 11) { // L: 8482
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 8483
							var3 = 4;
						}

						var1 = var4.method3892(var3); // L: 8484
						if (!var1) { // L: 8486
							continue;
						}
					}

					WorldMap.method8696(var0.plane, var0.type, var0.x, var0.y, var0.field1187, var0.field1189, var0.field1183, var0.field1190); // L: 8488
					var0.delay = -1; // L: 8489
					if (var0.field1187 == var0.objectId && var0.objectId == -1) {
						var0.remove(); // L: 8490
					} else if (var0.field1187 == var0.objectId && var0.field1189 == var0.field1185 && var0.field1186 == var0.field1183) { // L: 8491
						var0.remove();
					}
				}
			}
		}

	} // L: 8497
}
