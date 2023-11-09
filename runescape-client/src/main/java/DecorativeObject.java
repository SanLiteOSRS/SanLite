import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 848620101
	)
	@Export("z")
	int z;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2051663691
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1383364191
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -620450551
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2006194271
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2110885147
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1599637189
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -7020316289370538733L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -4966827
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1258682815"
	)
	public static boolean method4865(int var0) {
		return var0 >= WorldMapDecorationType.field3752.id && var0 <= WorldMapDecorationType.field3746.id || var0 == WorldMapDecorationType.field3751.id; // L: 43
	}

	@ObfuscatedName("s")
	public static int method4863(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 56
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)Lkz;",
		garbageValue = "1159720695"
	)
	static Widget method4864(Widget var0) {
		Widget var2 = var0; // L: 12615
		int var3 = ClanChannel.method3366(class173.getWidgetFlags(var0)); // L: 12617
		Widget var1;
		if (var3 == 0) { // L: 12618
			var1 = null; // L: 12619
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2; // L: 12629
					break;
				}

				var2 = class133.getWidget(var2.parentId); // L: 12623
				if (var2 == null) { // L: 12624
					var1 = null; // L: 12625
					break; // L: 12626
				}

				++var4; // L: 12622
			}
		}

		Widget var5 = var1; // L: 12631
		if (var1 == null) { // L: 12632
			var5 = var0.parent;
		}

		return var5; // L: 12633
	}
}
