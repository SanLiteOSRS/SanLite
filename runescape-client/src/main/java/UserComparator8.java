import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)I",
		garbageValue = "-1437399450"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "-613643844"
	)
	public static void method2664(AbstractArchive var0) {
	} // L: 16
}
