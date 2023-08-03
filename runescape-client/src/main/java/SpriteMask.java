import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1227105827
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 64643147
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ar")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("am")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1033
		this.height = var2; // L: 1034
		this.xWidths = var3; // L: 1035
		this.xStarts = var4; // L: 1036
	} // L: 1037

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2123679375"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1040
			int var3 = this.xStarts[var2]; // L: 1041
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1042
				return true;
			}
		}

		return false; // L: 1044
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "4"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}
}
