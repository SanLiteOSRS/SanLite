import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("az")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)I",
		garbageValue = "-2144575347"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-125"
	)
	public static int method2933(int var0) {
		return class484.field4915[var0 & 16383]; // L: 28
	}
}
