import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class270 {
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1345506166"
	)
	static int method5223(int var0, int var1) {
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
			int var10 = class160.method3277(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 37
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
			int var9 = class160.method3277(var8, 96); // L: 57
			return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 58
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 134

		try {
			var0 = Actor.getPreferencesFile("", AbstractByteArrayCopier.field3293.name, true); // L: 136
			Buffer var1 = class260.clientPreferences.toBuffer(); // L: 137
			var0.write(var1.array, 0, var1.offset); // L: 138
		} catch (Exception var3) { // L: 140
		}

		try {
			if (var0 != null) { // L: 142
				var0.closeSync(true); // L: 143
			}
		} catch (Exception var2) { // L: 146
		}

	} // L: 147
}
