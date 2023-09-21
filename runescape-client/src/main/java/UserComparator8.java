import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ltl;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ev")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field1457;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)I",
		garbageValue = "0"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method2890() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8687 8688 8731
			if (var0.hitpoints > 0) { // L: 8689
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) { // L: 8690
				if (var0.objectId >= 0) { // L: 8692
					var2 = var0.objectId; // L: 8694
					var3 = var0.field1176; // L: 8695
					var4 = class91.getObjectDefinition(var2); // L: 8697
					if (var3 == 11) { // L: 8698
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) { // L: 8699
						var3 = 4;
					}

					var1 = var4.method4007(var3); // L: 8700
					if (!var1) { // L: 8702
						continue;
					}
				}

				class115.method2852(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1178, var0.field1176, var0.field1180); // L: 8704
				var0.remove(); // L: 8705
			} else {
				if (var0.delay > 0) { // L: 8709
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) { // L: 8710
					if (var0.field1177 >= 0) { // L: 8712
						var2 = var0.field1177; // L: 8714
						var3 = var0.field1173; // L: 8715
						var4 = class91.getObjectDefinition(var2); // L: 8717
						if (var3 == 11) { // L: 8718
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) { // L: 8719
							var3 = 4;
						}

						var1 = var4.method4007(var3); // L: 8720
						if (!var1) { // L: 8722
							continue;
						}
					}

					class115.method2852(var0.plane, var0.type, var0.x, var0.y, var0.field1177, var0.field1170, var0.field1173, var0.field1180); // L: 8724
					var0.delay = -1; // L: 8725
					if (var0.objectId == var0.field1177 && var0.objectId == -1) {
						var0.remove(); // L: 8726
					} else if (var0.objectId == var0.field1177 && var0.field1170 == var0.field1178 && var0.field1173 == var0.field1176) { // L: 8727
						var0.remove();
					}
				}
			}
		}

	} // L: 8733
}
