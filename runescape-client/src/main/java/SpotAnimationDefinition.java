import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1638565333
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2042923893
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1562787325
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("r")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("h")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("d")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("z")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -131798201
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1053916553
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -715862297
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1937159093
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2094133553
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "-47"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "95"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgd;",
		garbageValue = "-1"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}

			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) {
			var5 = WorldMapScaleHandler.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}

			if (this.orientation == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}

		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CLkn;I)I",
		garbageValue = "-1325304015"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Loa;",
		garbageValue = "1093852955"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class250.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class250.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1);
		if (var19 == null) {
			return null;
		} else {
			SpritePixels var20 = null;
			if (var9.noteTemplate != -1) {
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var20 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var20 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var20 == null) {
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
			Rasterizer3D.method3950(16, 16);
			Rasterizer3D.field2281 = false;
			if (var9.placeholderTemplate != -1) {
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d;
			if (var5) {
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) {
				var16 = (int)((double)var16 * 1.04D);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var19.calculateBoundsCylinder();
			var19.method4347(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var20.drawTransBgAt(0, 0);
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
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				ItemComposition.ItemDefinition_fontPlain11.draw(MenuAction.method2026(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
			Rasterizer2D.Rasterizer2D_setClipArray(var15);
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
			Rasterizer3D.field2281 = true;
			return var8;
		}
	}
}
