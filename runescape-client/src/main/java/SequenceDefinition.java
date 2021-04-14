import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("e")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("k")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("g")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("h")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -888681217
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("l")
	int[] field3716;
	@ObfuscatedName("m")
	public boolean field3712;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1130836393
	)
	public int field3718;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 28936023
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1915786669
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -933418559
	)
	public int field3721;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -891959581
	)
	public int field3722;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 468418513
	)
	public int field3723;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 167187007
	)
	public int field3707;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3712 = false;
		this.field3718 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3721 = 99;
		this.field3722 = -1;
		this.field3723 = -1;
		this.field3707 = 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "633278870"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;IB)V",
		garbageValue = "1"
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
			this.field3716 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3716[var4] = var1.readUnsignedByte();
			}

			this.field3716[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3712 = true;
		} else if (var2 == 5) {
			this.field3718 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3721 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3722 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3723 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3707 = var1.readUnsignedByte();
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "6"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3722 == -1) {
			if (this.field3716 != null) {
				this.field3722 = 2;
			} else {
				this.field3722 = 0;
			}
		}

		if (this.field3723 == -1) {
			if (this.field3716 != null) {
				this.field3723 = 2;
			} else {
				this.field3723 = 0;
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lgv;IB)Lgv;",
		garbageValue = "96"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = AttackOption.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lgv;III)Lgv;",
		garbageValue = "2141999408"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = AttackOption.getFrames(var2 >> 16);
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lgv;IB)Lgv;",
		garbageValue = "17"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = AttackOption.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lgv;ILkw;II)Lgv;",
		garbageValue = "-1406133435"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = AttackOption.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = AttackOption.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3716);
				return var7;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lgv;II)Lgv;",
		garbageValue = "2014076676"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = AttackOption.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = AttackOption.getFrames(var6 >> 16);
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
}
