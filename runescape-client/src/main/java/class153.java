import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class153 extends class139 {
	@ObfuscatedName("aw")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1864344367
	)
	int field1758;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class153(class142 var1) {
		this.this$0 = var1;
		this.field1758 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		this.field1758 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.method3224(this.field1758); // L: 222
	} // L: 223

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1867500284"
	)
	public static final synchronized long method3317() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class286.field3335) { // L: 15
			class286.field3337 += class286.field3335 - var0;
		}

		class286.field3335 = var0;
		return class286.field3337 + var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1876809547"
	)
	static int method3316(int var0, int var1) {
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
			int var6;
			int var7;
			int var8;
			int var9;
			if (var2.secondaryRgb >= 0) { // L: 33
				var5 = var2.secondaryHue; // L: 35
				var6 = var2.secondarySaturation; // L: 36
				var7 = var2.secondaryLightness; // L: 37
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

				var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10); // L: 43
				var9 = class86.method2346(var8, 96); // L: 47
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 48
			} else if (var2.texture >= 0) { // L: 50
				int var10 = class86.method2346(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96); // L: 51
				return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216; // L: 52
			} else if (var2.primaryRgb == 16711935) { // L: 54
				return var1; // L: 55
			} else {
				var5 = var2.hue; // L: 59
				var6 = var2.saturation; // L: 60
				var7 = var2.lightness; // L: 61
				if (var7 > 179) { // L: 63
					var6 /= 2;
				}

				if (var7 > 192) { // L: 64
					var6 /= 2;
				}

				if (var7 > 217) { // L: 65
					var6 /= 2;
				}

				if (var7 > 243) { // L: 66
					var6 /= 2;
				}

				var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10); // L: 67
				var9 = class86.method2346(var8, 96); // L: 71
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216; // L: 72
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;I)V",
		garbageValue = "-310260529"
	)
	public static void method3315(AbstractArchive var0) {
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-91961917"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class431.Widget_loadedInterfaces[var0]) { // L: 250
			return true;
		} else if (!UserComparator8.Widget_archive.tryLoadGroup(var0)) { // L: 251
			return false;
		} else {
			int var1 = UserComparator8.Widget_archive.getGroupFileCount(var0); // L: 252
			if (var1 == 0) { // L: 253
				class431.Widget_loadedInterfaces[var0] = true; // L: 254
				return true; // L: 255
			} else {
				if (WorldMapLabel.Widget_interfaceComponents[var0] == null) { // L: 257
					WorldMapLabel.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 258
					if (WorldMapLabel.Widget_interfaceComponents[var0][var2] == null) { // L: 259
						byte[] var3 = UserComparator8.Widget_archive.takeFile(var0, var2); // L: 260
						if (var3 != null) { // L: 261
							WorldMapLabel.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 262
							WorldMapLabel.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 263
							if (var3[0] == -1) { // L: 264
								WorldMapLabel.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								WorldMapLabel.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 265
							}
						}
					}
				}

				class431.Widget_loadedInterfaces[var0] = true; // L: 269
				return true; // L: 270
			}
		}
	}
}
