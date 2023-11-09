import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1711809679
	)
	public static int field1444;
	@ObfuscatedName("bh")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ji")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;B)I",
		garbageValue = "95"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "-72"
	)
	public static void method2858(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var5 || !class306.field3396.isEmpty() && !var0.isEmpty()) { // L: 52
			class306.field3396.clear(); // L: 53
			class306.field3399.clear(); // L: 54
		}

		if (!var0.isEmpty()) { // L: 56
			class144.method3148(var0, var5); // L: 59
			if (!class306.field3396.isEmpty()) { // L: 60
				ArchiveLoader.method2259(var1, var2, var3, var4); // L: 63
				class306.field3399.add(new class400((class407)null)); // L: 64
				class306.field3399.add(new class409((class407)null, class306.field3393, class306.field3397, class306.field3401)); // L: 65
				if (!class306.field3394.isEmpty()) { // L: 66
					ArrayList var6 = new ArrayList(); // L: 67
					var6.add(new class403(new class404(new class406((class407)null, 0, true, class306.field3407)), class306.field3403)); // L: 68
					ArrayList var7 = class162.method3356(); // L: 69
					var6.add(new class403(new class405(new class402((class407)null, var7), 0, false, class306.field3402), class306.field3392)); // L: 70
					class306.field3399.add(new class408((class407)null, var6)); // L: 71
				} else {
					class306.field3399.add(new class403((class407)null, class306.field3403)); // L: 74
					class306.field3399.add(new class404((class407)null)); // L: 75
					class306.field3399.add(new class406((class407)null, 0, true, class306.field3407)); // L: 76
				}

			}
		}
	} // L: 57 61 78
}
