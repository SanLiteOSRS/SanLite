import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("o")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("m")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("r")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("h")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 403704851
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("z")
	int[] field1886;
	@ObfuscatedName("b")
	public boolean field1888;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1860367517
	)
	public int field1892;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1677443273
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -757910463
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -374777757
	)
	public int field1896;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -302620765
	)
	public int field1895;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 317689877
	)
	public int field1893;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2048501497
	)
	public int field1894;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1888 = false;
		this.field1892 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1896 = 99;
		this.field1895 = -1;
		this.field1893 = -1;
		this.field1894 = 2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1823528439"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "48"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field1886 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1886[var4] = var1.readUnsignedByte();
			}

			this.field1886[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1888 = true;
		} else if (var2 == 5) {
			this.field1892 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1896 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field1895 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1893 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field1894 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1961662829"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1895 == -1) {
			if (this.field1886 != null) {
				this.field1895 = 2;
			} else {
				this.field1895 = 0;
			}
		}

		if (this.field1893 == -1) {
			if (this.field1886 != null) {
				this.field1893 = 2;
			} else {
				this.field1893 = 0;
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgd;II)Lgd;",
		garbageValue = "-237449426"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = class69.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lgd;III)Lgd;",
		garbageValue = "-188678867"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = class69.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2));
			var3 &= 3;
			if (var3 == 1) {
				var5.rotateY270Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2);
			if (var3 == 1) {
				var5.rotateY90Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY270Ccw();
			}

			return var5;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IB)Lgd;",
		garbageValue = "-1"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = class69.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lgd;ILfm;II)Lgd;",
		garbageValue = "-1179378305"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = class69.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = class69.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field1886);
				return var7;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgd;II)Lgd;",
		garbageValue = "-23683496"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = class69.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = class69.getFrames(var6 >> 16);
				var6 &= 65535;
			}

			Model var7;
			if (var5 != null && var6 != 65535) {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
				var7.animate(var4, var3);
				var7.animate(var5, var6);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
				var7.animate(var4, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-88"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else {
			if (Tiles.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < class372.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == class372.ByteArrayPool_alternativeSizes[var1] && WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var1] < Tiles.ByteArrayPool_arrays[var1].length) {
						Tiles.ByteArrayPool_arrays[var1][WorldMapScaleHandler.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}
}
