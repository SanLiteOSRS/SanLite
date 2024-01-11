import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1338249477
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1199529387
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("af")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("aj")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1019
		this.height = var2; // L: 1020
		this.xWidths = var3; // L: 1021
		this.xStarts = var4; // L: 1022
	} // L: 1023

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1733503749"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1026
			int var3 = this.xStarts[var2]; // L: 1027
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1028
				return true;
			}
		}

		return false; // L: 1030
	}
}
