import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;I)I",
		garbageValue = "-1676940583"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "1"
	)
	static Object method2610(int var0) {
		return UserComparator9.method2593((class433)GameEngine.findEnumerated(class433.method7494(), var0)); // L: 5029
	}
}
