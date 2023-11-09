import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public enum class89 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1074(0, -1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1066(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1067(2, 7),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1068(3, 8),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1069(4, 9);

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 820901355
	)
	final int field1070;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 54547317
	)
	final int field1076;

	class89(int var3, int var4) {
		this.field1070 = var3; // L: 20
		this.field1076 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1076; // L: 26
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1477670144"
	)
	static final float method2260(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 17
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 18
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static final void method2264() {
		int var0 = class218.menuX; // L: 8892
		int var1 = UrlRequester.menuY; // L: 8893
		int var2 = Actor.menuWidth; // L: 8894
		int var3 = SceneTilePaint.menuHeight; // L: 8895
		int var4 = 6116423; // L: 8896
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8897
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8898
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8899
		class126.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8900
		int var5 = MouseHandler.MouseHandler_x; // L: 8901
		int var6 = MouseHandler.MouseHandler_y; // L: 8902

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8903
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31; // L: 8904
			int var9 = 16777215; // L: 8905
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8906
				var9 = 16776960;
			}

			Font var10 = class126.fontBold12; // L: 8907
			String var11;
			if (var7 < 0) { // L: 8910
				var11 = ""; // L: 8911
			} else if (Client.menuTargets[var7].length() > 0) { // L: 8914
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7]; // L: 8915
			}

			var10.draw(var11, var0 + 3, var8, var9, 0); // L: 8917
		}

		class166.method3341(class218.menuX, UrlRequester.menuY, Actor.menuWidth, SceneTilePaint.menuHeight); // L: 8919
	} // L: 8920
}
