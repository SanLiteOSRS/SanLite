import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("wz")
	@ObfuscatedGetter(
		intValue = -1052831761
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field1460;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;B)I",
		garbageValue = "95"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-457265261"
	)
	public static boolean method3006() {
		if (!class316.field3413.isEmpty()) { // L: 118
			return true; // L: 119
		} else {
			return !class316.field3422.isEmpty() && class316.field3422.get(0) != null && ((class328)class316.field3422.get(0)).field3522 != null ? ((class328)class316.field3422.get(0)).field3522.isReady() : false; // L: 121 122 124
		}
	}
}
