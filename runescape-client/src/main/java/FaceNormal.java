import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("as")
	static short[][][] field2621;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1665801521
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 441548053
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 968012837
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1944292281"
	)
	static int method4719(int var0, int var1) {
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
		} else {
			int var5;
			if (var2.secondaryRgb >= 0) { // L: 33
				var5 = var2.secondaryHue; // L: 35
				int var6 = var2.secondarySaturation; // L: 36
				int var7 = var2.secondaryLightness; // L: 37
				if (var7 > 179) { // L: 39
					var6 /= 2;
				}

				if (var7 > 192) { // L: 40
					var6 /= 2;
				}

				if (var7 > 217) { // L: 41
					var6 /= 2;
				}

				if (var7 > 243) { // L: 42
					var6 /= 2;
				}

				int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10); // L: 43
				int var9 = SecureRandomCallable.method2214(var8, 96); // L: 47
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 48
			} else {
				int var10;
				if (var2.texture >= 0) { // L: 50
					var10 = SecureRandomCallable.method2214(Rasterizer3D.field2520.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 51
					return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 52
				} else if (var2.primaryRgb == 16711935) { // L: 54
					return var1; // L: 55
				} else {
					var10 = Occluder.method4725(var2.hue, var2.saturation, var2.lightness); // L: 58
					var5 = SecureRandomCallable.method2214(var10, 96); // L: 59
					return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -16777216; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lhy;IIII)V",
		garbageValue = "-680386934"
	)
	static void method4718(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class10.clientPreferences.method2450() != 0) { // L: 3723
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3724
				ClientPreferences.method2541(var0.soundEffects[var1], var2, var3); // L: 3725
			}
		}
	} // L: 3726

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1206794042"
	)
	static boolean method4720(int var0) {
		for (int var1 = 0; var1 < Client.field741; ++var1) { // L: 11878
			if (Client.field545[var1] == var0) { // L: 11879
				return true;
			}
		}

		return false; // L: 11881
	}
}
