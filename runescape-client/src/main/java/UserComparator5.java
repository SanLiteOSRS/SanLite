import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;B)I",
		garbageValue = "9"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}
}
