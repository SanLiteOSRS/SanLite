import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
	@ObfuscatedName("aj")
	@Export("reversed")
	final boolean reversed;

	public UserComparator2(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;I)I",
		garbageValue = "785266400"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	static final void method8945() {
		int var0 = class20.menuX; // L: 8683
		int var1 = Login.menuY; // L: 8684
		int var2 = PacketWriter.menuWidth; // L: 8685
		int var3 = class30.menuHeight; // L: 8686
		int var4 = 6116423; // L: 8687
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8688
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8689
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8690
		class7.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8691
		int var5 = MouseHandler.MouseHandler_x; // L: 8692
		int var6 = MouseHandler.MouseHandler_y; // L: 8693

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8694
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31; // L: 8695
			int var9 = 16777215; // L: 8696
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8697
				var9 = 16776960;
			}

			class7.fontBold12.draw(SceneTilePaint.method4753(var7), var0 + 3, var8, var9, 0); // L: 8698
		}

		VarbitComposition.method3769(class20.menuX, Login.menuY, PacketWriter.menuWidth, class30.menuHeight); // L: 8700
	} // L: 8701
}
