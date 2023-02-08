import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class165 extends class177 {
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("f")
	String field1815;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfs;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class165(class166 var1, String var2, String var3) {
		super(var1, var2); // L: 386
		this.this$0 = var1; // L: 385
		this.field1815 = var3; // L: 387
	} // L: 388

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1024"
	)
	public int vmethod3537() {
		return 1; // L: 391
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1616244476"
	)
	public String vmethod3540() {
		return this.field1815; // L: 396
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1463339864"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4746
			byte var2 = 4; // L: 4747
			int var3 = var2 + 6; // L: 4748
			int var4 = var2 + 6; // L: 4749
			int var5 = MenuAction.fontPlain12.lineWidth(var0, 250); // L: 4750
			int var6 = MenuAction.fontPlain12.lineCount(var0, 250) * 13; // L: 4751
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2, 0); // L: 4752
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 4753
			MenuAction.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4754
			Language.method6779(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2); // L: 4755
			if (var1) { // L: 4756
				class25.rasterProvider.drawFull(0, 0); // L: 4757
			} else {
				class7.method70(var3, var4, var5, var6); // L: 4760
			}

		}
	} // L: 4762
}
