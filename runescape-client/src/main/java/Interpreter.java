import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("x")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("q")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("f")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("r")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("b")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 54505361
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1648484327
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("l")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("t")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("p")
	static boolean field865;
	@ObfuscatedName("d")
	static boolean field868;
	@ObfuscatedName("y")
	static ArrayList field867;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 478223063
	)
	static int field874;
	@ObfuscatedName("ao")
	static final double field871;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 80
		Interpreter_arrays = new int[5][5000]; // L: 81
		Interpreter_intStack = new int[1000]; // L: 82
		Interpreter_stringStack = new String[1000]; // L: 84
		Interpreter_frameDepth = 0; // L: 86
		Interpreter_frames = new ScriptFrame[50]; // L: 87
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 93
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 96
		field865 = false; // L: 99
		field868 = false; // L: 100
		field867 = new ArrayList(); // L: 101
		field874 = 0; // L: 102
		field871 = Math.log(2.0D); // L: 106
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1706343111"
	)
	static int method1988(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 17
		FloorOverlayDefinition var2;
		if (var3 != null) { // L: 18
			var2 = var3; // L: 19
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 22
			var3 = new FloorOverlayDefinition(); // L: 23
			if (var4 != null) { // L: 24
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode(); // L: 25
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0); // L: 26
			var2 = var3; // L: 27
		}

		if (var2 == null) { // L: 30
			return var1; // L: 31
		} else if (var2.secondaryRgb >= 0) { // L: 33
			return var2.secondaryRgb | -16777216; // L: 34
		} else if (var2.texture >= 0) { // L: 36
			int var10 = MusicPatchPcmStream.method5774(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 37
			return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 38
		} else if (var2.primaryRgb == 16711935) { // L: 40
			return var1; // L: 41
		} else {
			int var5 = var2.hue; // L: 45
			int var6 = var2.saturation; // L: 46
			int var7 = var2.lightness; // L: 47
			if (var7 > 179) { // L: 49
				var6 /= 2;
			}

			if (var7 > 192) { // L: 50
				var6 /= 2;
			}

			if (var7 > 217) { // L: 51
				var6 /= 2;
			}

			if (var7 > 243) { // L: 52
				var6 /= 2;
			}

			int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10); // L: 53
			int var9 = MusicPatchPcmStream.method5774(var8, 96); // L: 57
			return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 58
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkq;S)V",
		garbageValue = "750"
	)
	public static void method1960(Huffman var0) {
		class308.huffman = var0; // L: 14
	} // L: 15

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1417118672"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class89.scrollBarSprites[0].drawAt(var0, var1); // L: 11004
		class89.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11005
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field719); // L: 11006
		int var5 = var3 * (var3 - 32) / var4; // L: 11007
		if (var5 < 8) { // L: 11008
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11009
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field651); // L: 11010
		Rasterizer2D.method8894(var0, var6 + var1 + 16, var5, Client.field584); // L: 11011
		Rasterizer2D.method8894(var0 + 1, var6 + var1 + 16, var5, Client.field584); // L: 11012
		Rasterizer2D.method8892(var0, var6 + var1 + 16, 16, Client.field584); // L: 11013
		Rasterizer2D.method8892(var0, var6 + var1 + 17, 16, Client.field584); // L: 11014
		Rasterizer2D.method8894(var0 + 15, var6 + var1 + 16, var5, Client.field532); // L: 11015
		Rasterizer2D.method8894(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field532); // L: 11016
		Rasterizer2D.method8892(var0, var6 + var5 + var1 + 15, 16, Client.field532); // L: 11017
		Rasterizer2D.method8892(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field532); // L: 11018
	} // L: 11019
}
