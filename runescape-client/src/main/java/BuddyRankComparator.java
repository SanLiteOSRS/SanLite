import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;I)I",
		garbageValue = "383953435"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1321294301"
	)
	static void method2933() {
		World.field841 = null; // L: 61
		VertexNormal.field2820 = null; // L: 62
		SecureRandomFuture.field997 = null; // L: 63
		class199.field2004 = null; // L: 64
		UserComparator6.field1486 = null; // L: 65
		Tiles.field1045 = null; // L: 66
		class158.field1739 = null; // L: 67
		SecureRandomFuture.Tiles_hue = null; // L: 68
		class135.Tiles_saturation = null; // L: 69
		Tiles.Tiles_lightness = null; // L: 70
		WorldMapSection2.Tiles_hueMultiplier = null; // L: 71
		Script.field1008 = null; // L: 72
	} // L: 73

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	protected static final int method2936() {
		return GameEngine.field221.method345(); // L: 138
	}
}
