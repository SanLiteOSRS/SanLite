import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class427 {
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1086858940"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4792
			byte var2 = 4; // L: 4793
			int var3 = var2 + 6; // L: 4794
			int var4 = var2 + 6; // L: 4795
			int var5 = UserComparator6.fontPlain12.lineWidth(var0, 250); // L: 4796
			int var6 = UserComparator6.fontPlain12.lineCount(var0, 250) * 13; // L: 4797
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 0); // L: 4798
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215); // L: 4799
			UserComparator6.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4800
			class19.method284(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2); // L: 4801
			if (var1) { // L: 4802
				class223.rasterProvider.drawFull(0, 0); // L: 4803
			} else {
				int var7 = var3; // L: 4806
				int var8 = var4; // L: 4807
				int var9 = var5; // L: 4808
				int var10 = var6; // L: 4809

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4811
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4812
						Client.field735[var11] = true;
					}
				}
			}

		}
	} // L: 4816
}
