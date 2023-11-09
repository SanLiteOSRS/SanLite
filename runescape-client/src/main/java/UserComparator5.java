import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("s")
	@Export("JagexCache_locationFile")
	public static File JagexCache_locationFile;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "600195653"
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

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)Z",
		garbageValue = "-279294198"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11556
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11557
				int var2 = Language.method6780(var0, var1); // L: 11558
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11559
				if (var0.cs1Comparisons[var1] == 2) { // L: 11560
					if (var2 >= var3) { // L: 11561
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11563
					if (var2 <= var3) { // L: 11564
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11566
					if (var3 == var2) { // L: 11567
						return false;
					}
				} else if (var2 != var3) { // L: 11569
					return false;
				}
			}

			return true; // L: 11571
		}
	}
}
