import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class89 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field1154;
	@ObfuscatedName("s")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "22246148"
	)
	public static int method2336(int var0) {
		return ClanChannelMember.method3084(ViewportMouse.ViewportMouse_entityTags[var0]); // L: 44
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIB)V",
		garbageValue = "84"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10957
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10958
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10959
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10960
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10961
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10962
		}

		if (var0.yAlignment == 0) { // L: 10963
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10964
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10965
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10966
		} else if (var0.yAlignment == 4) { // L: 10967
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10968
		}

	} // L: 10969
}
