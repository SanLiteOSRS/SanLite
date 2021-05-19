import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -127047771
	)
	@Export("width")
	int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1046559811
	)
	@Export("height")
	int height;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1278151187
	)
	@Export("x")
	int x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -234126027
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfs;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "847610173"
	)
	public static boolean method3569(int var0) {
		return var0 >= WorldMapDecorationType.field3159.id && var0 <= WorldMapDecorationType.field3148.id || var0 == WorldMapDecorationType.field3162.id;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-116"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		GrandExchangeOfferTotalQuantityComparator.scrollBarSprites[0].drawAt(var0, var1);
		GrandExchangeOfferTotalQuantityComparator.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field679);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field680);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field658);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field658);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field658);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field658);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field681);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field681);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field681);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field681);
	}
}
