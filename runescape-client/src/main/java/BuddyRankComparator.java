import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-1874488966"
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

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)Lmi;",
		garbageValue = "915415331"
	)
	static Widget method2916(Widget var0) {
		int var1 = SpriteMask.method6023(class194.getWidgetFlags(var0)); // L: 12684
		if (var1 == 0) { // L: 12685
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12686
				var0 = class92.getWidget(var0.parentId); // L: 12687
				if (var0 == null) { // L: 12688
					return null;
				}
			}

			return var0; // L: 12690
		}
	}
}
