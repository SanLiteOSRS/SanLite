import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -43988345
	)
	static int field3628;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field3623;
	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	static TextureProvider field3627;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1227224767
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1511040213
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("af")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("at")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1; // L: 1080
		this.height = var2; // L: 1081
		this.xWidths = var3; // L: 1082
		this.xStarts = var4; // L: 1083
	} // L: 1084

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "106"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) { // L: 1087
			int var3 = this.xStarts[var2]; // L: 1088
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) { // L: 1089
				return true;
			}
		}

		return false; // L: 1091
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "8"
	)
	static final void method6248(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 76
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 77
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 78
					TextureProvider.field2750[0][var5][var4] = 127; // L: 79
					if (var0 == var5 && var5 > 0) { // L: 80
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var0 + var2 == var5 && var5 < 103) { // L: 81
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 82
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var3 + var1 == var4 && var4 < 103) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 87

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)I",
		garbageValue = "1"
	)
	static int method6247(Widget var0) {
		if (var0.type != 11) { // L: 1605
			Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = ""; // L: 1606
			return 1; // L: 1607
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1609
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var0.method6770(var1); // L: 1610
			return 1; // L: 1611
		}
	}
}
