import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1396616335
	)
	static int field2552;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2052975947
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -583477063
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("s")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("t")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "1864355280"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		signature = "(Lhq;I)Ljava/lang/String;",
		garbageValue = "1504596976"
	)
	static String method4059(Widget var0) {
		if (GrandExchangeOfferTotalQuantityComparator.method176(WorldMapIcon_0.getWidgetClickMask(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
