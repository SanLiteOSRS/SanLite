import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1178096389
	)
	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[[Lmo;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 1940974701
	)
	static int field1453;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;I)I",
		garbageValue = "-677007994"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lep;",
		garbageValue = "67"
	)
	static class127 method2903(int var0) {
		class127[] var1 = new class127[]{class127.field1492, class127.field1491, class127.field1490, class127.field1493, class127.field1494}; // L: 142
		class127 var2 = (class127)class217.findEnumerated(var1, var0); // L: 144
		if (var2 == null) { // L: 145
			var2 = class127.field1492;
		}

		return var2; // L: 146
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltt;IIII)V",
		garbageValue = "-2140736778"
	)
	static void method2900(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 47
		long var6 = (long)(var3 << 16 | var1 << 8 | var2); // L: 51
		var4.put(var0, var6, var0.pixels.length * 4); // L: 53
	} // L: 54

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "([Lmo;IIIZS)V",
		garbageValue = "-10367"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10830
			Widget var6 = var0[var5]; // L: 10831
			if (var6 != null && var6.parentId == var1) { // L: 10832 10833
				class30.alignWidgetSize(var6, var2, var3, var4); // L: 10834
				LoginScreenAnimation.alignWidgetPosition(var6, var2, var3); // L: 10835
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10836
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10837
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10838
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10839
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10840
					class166.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10842
}
