import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-999239127"
	)
	static int method8281(int var0, int var1) {
		FloorOverlayDefinition var2 = Canvas.method333(var0); // L: 15
		if (var2 == null) { // L: 16
			return var1; // L: 17
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) { // L: 19
				var4 = var2.secondaryHue; // L: 21
				var5 = var2.secondarySaturation; // L: 22
				var6 = var2.secondaryLightness; // L: 23
				if (var6 > 179) { // L: 25
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2; // L: 26
				}

				if (var6 > 217) { // L: 27
					var5 /= 2;
				}

				if (var6 > 243) { // L: 28
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10); // L: 29
				var8 = UserComparator3.method2984(var7, 96); // L: 33
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216; // L: 34
			} else if (var2.texture >= 0) { // L: 36
				int var3 = UserComparator3.method2984(Rasterizer3D.field2772.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 37
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216; // L: 38
			} else if (var2.primaryRgb == 16711935) { // L: 40
				return var1; // L: 41
			} else {
				var4 = var2.hue; // L: 45
				var5 = var2.saturation; // L: 46
				var6 = var2.lightness; // L: 47
				if (var6 > 179) { // L: 49
					var5 /= 2;
				}

				if (var6 > 192) { // L: 50
					var5 /= 2;
				}

				if (var6 > 217) { // L: 51
					var5 /= 2;
				}

				if (var6 > 243) { // L: 52
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10); // L: 53
				var8 = UserComparator3.method2984(var7, 96); // L: 57
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216; // L: 58
			}
		}
	}
}
