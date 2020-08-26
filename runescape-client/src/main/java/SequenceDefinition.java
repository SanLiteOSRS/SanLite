import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("o")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("x")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("w")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("g")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 742845073
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("n")
	int[] field3550;
	@ObfuscatedName("d")
	public boolean field3544;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1230100641
	)
	public int field3537;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1046570775
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 435585977
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 391767143
	)
	public int field3548;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1813190021
	)
	public int field3549;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1744120745
	)
	public int field3541;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1460748063
	)
	public int field3535;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3544 = false;
		this.field3537 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3548 = 99;
		this.field3549 = -1;
		this.field3541 = -1;
		this.field3535 = 2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "892270610"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "322225834"
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
			this.field3550 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3550[var4] = var1.readUnsignedByte();
			}

			this.field3550[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3544 = true;
		} else if (var2 == 5) {
			this.field3537 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3548 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3549 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3541 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3535 = var1.readUnsignedByte();
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-125"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3549 == -1) {
			if (this.field3550 != null) {
				this.field3549 = 2;
			} else {
				this.field3549 = 0;
			}
		}

		if (this.field3541 == -1) {
			if (this.field3550 != null) {
				this.field3541 = 2;
			} else {
				this.field3541 = 0;
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ler;II)Ler;",
		garbageValue = "-1365991470"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = UrlRequester.getFrames(var2 >> 16);
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
		signature = "(Ler;III)Ler;",
		garbageValue = "2144819244"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = UrlRequester.getFrames(var2 >> 16);
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Ler;II)Ler;",
		garbageValue = "2009150039"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = UrlRequester.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ler;ILjm;IB)Ler;",
		garbageValue = "-2"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = UrlRequester.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = UrlRequester.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3550);
				return var7;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Ler;II)Ler;",
		garbageValue = "1789593927"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = UrlRequester.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = UrlRequester.getFrames(var6 >> 16);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-2006270151"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
