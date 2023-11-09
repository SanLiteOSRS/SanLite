import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("bk")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 85072149
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1223275017
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ar")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ao")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1056
		this.height = var2; // L: 1057
		this.xWidths = var3; // L: 1058
		this.xStarts = var4; // L: 1059
	} // L: 1060

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1206229207"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1063
			int var3 = this.xStarts[var2]; // L: 1064
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1065
				return true;
			}
		}

		return false; // L: 1067
	}
}
