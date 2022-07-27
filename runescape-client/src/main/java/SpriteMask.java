import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("gr")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2024477891
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1726190535
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("f")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("u")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 981
		this.height = var2; // L: 982
		this.xWidths = var3; // L: 983
		this.xStarts = var4; // L: 984
	} // L: 985

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-40"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 988
			int var3 = this.xStarts[var2]; // L: 989
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 990
				return true;
			}
		}

		return false; // L: 992
	}
}
