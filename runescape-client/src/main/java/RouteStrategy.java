import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 898172715
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1058943793
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 420319251
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1635143841
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;I)Z",
		garbageValue = "-101996106"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-107"
	)
	public static void method4513() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 57
	} // L: 58

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1091177009"
	)
	static int method4510(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 961
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 962
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "89"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4781
			byte var2 = 4; // L: 4782
			int var3 = var2 + 6; // L: 4783
			int var4 = var2 + 6; // L: 4784
			int var5 = class141.fontPlain12.lineWidth(var0, 250); // L: 4785
			int var6 = class141.fontPlain12.lineCount(var0, 250) * 13; // L: 4786
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 4787
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 16777215); // L: 4788
			class141.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4789
			Language.method7364(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6); // L: 4790
			if (var1) { // L: 4791
				UserComparator8.rasterProvider.drawFull(0, 0); // L: 4792
			} else {
				class106.method2774(var3, var4, var5, var6); // L: 4795
			}

		}
	} // L: 4797
}
