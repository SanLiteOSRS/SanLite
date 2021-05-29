import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -254849601
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = -145310383
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	ModelData0() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)Ljava/lang/String;",
		garbageValue = "25"
	)
	static String method4261(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class249.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = class43.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Loh;",
		garbageValue = "768816682"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class260.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class260.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1);
		if (var21 == null) {
			return null;
		} else {
			SpritePixels var22 = null;
			if (var9.noteTemplate != -1) {
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var22 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var22 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var22 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			int[] var15 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var15);
			var8 = new SpritePixels(36, 32);
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.method3848(16, 16);
			Rasterizer3D.field2282 = false;
			if (var9.placeholderTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) {
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var21.calculateBoundsCylinder();
			var21.method4217(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
			if (var9.noteTemplate != -1) {
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var19 = class288.ItemDefinition_fontPlain11;
				String var20;
				if (var1 < 100000) {
					var20 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var19.draw(var20, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2282 = true;
			return var8;
		}
	}
}
