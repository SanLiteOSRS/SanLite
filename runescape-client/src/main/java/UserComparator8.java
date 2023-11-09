import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("aj")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpt;I)I",
		garbageValue = "-870240222"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "643209545"
	)
	public static int method2849(int var0, int var1, int var2) {
		int var3 = class206.method4069(var2 - var1 + 1); // L: 53
		var3 <<= var1; // L: 54
		return var0 & ~var3; // L: 55
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1768721944"
	)
	static final void method2847() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7895 7896 7902
			if (var0.hitpoints == -1) { // L: 7897
				var0.delay = 0; // L: 7898
				class27.method383(var0); // L: 7899
			} else {
				var0.remove(); // L: 7901
			}
		}

	} // L: 7904
}
