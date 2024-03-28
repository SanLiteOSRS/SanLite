import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class192 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field1985;

	static {
		field1985 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-15"
	)
	public static int method3717(int var0) {
		class138 var1 = class90.method2315(var0); // L: 414
		if (var1 == null) { // L: 415
			return 2; // L: 416
		} else {
			return var1.method3087() ? 0 : 1; // L: 418
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	static final void method3720() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8618 8619 8662
			if (var0.hitpoints > 0) { // L: 8620
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 8621
				if (var0.objectId >= 0) { // L: 8623
					var2 = var0.objectId; // L: 8625
					var3 = var0.field1188; // L: 8626
					var4 = MouseRecorder.getObjectDefinition(var2); // L: 8628
					if (var3 == 11) { // L: 8629
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 8630
						var3 = 4;
					}

					var1 = var4.method4098(var3); // L: 8631
					if (!var1) { // L: 8633
						continue;
					}
				}

				ObjectSound.method1920(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1187, var0.field1188, var0.field1192); // L: 8635
				var0.remove(); // L: 8636
			} else {
				if (var0.delay > 0) { // L: 8640
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 8641
					if (var0.field1198 >= 0) { // L: 8643
						var2 = var0.field1198; // L: 8645
						var3 = var0.field1191; // L: 8646
						var4 = MouseRecorder.getObjectDefinition(var2); // L: 8648
						if (var3 == 11) { // L: 8649
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 8650
							var3 = 4;
						}

						var1 = var4.method4098(var3); // L: 8651
						if (!var1) { // L: 8653
							continue;
						}
					}

					ObjectSound.method1920(var0.plane, var0.type, var0.x, var0.y, var0.field1198, var0.field1190, var0.field1191, var0.field1192); // L: 8655
					var0.delay = -1; // L: 8656
					if (var0.field1198 == var0.objectId && var0.objectId == -1) { // L: 8657
						var0.remove();
					} else if (var0.objectId == var0.field1198 && var0.field1190 == var0.field1187 && var0.field1191 == var0.field1188) { // L: 8658
						var0.remove();
					}
				}
			}
		}

	} // L: 8664
}
