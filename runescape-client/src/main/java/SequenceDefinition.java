import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("q")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("k")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("c")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("u")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1610785433
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("e")
	int[] field3543;
	@ObfuscatedName("o")
	public boolean field3544;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -780702177
	)
	public int field3545;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -825305281
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1577634901
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 508955331
	)
	public int field3547;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -370859363
	)
	public int field3549;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -190010935
	)
	public int field3550;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 758592065
	)
	public int field3551;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3544 = false;
		this.field3545 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3547 = 99;
		this.field3549 = -1;
		this.field3550 = -1;
		this.field3551 = 2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "1755425441"
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-1461293345"
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
			this.field3543 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3543[var4] = var1.readUnsignedByte();
			}

			this.field3543[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3544 = true;
		} else if (var2 == 5) {
			this.field3545 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3547 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3549 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3550 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3551 = var1.readUnsignedByte();
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "498097204"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3549 == -1) {
			if (this.field3543 != null) {
				this.field3549 = 2;
			} else {
				this.field3549 = 0;
			}
		}

		if (this.field3550 == -1) {
			if (this.field3543 != null) {
				this.field3550 = 2;
			} else {
				this.field3550 = 0;
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Leh;II)Leh;",
		garbageValue = "311789628"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = LoginPacket.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Leh;III)Leh;",
		garbageValue = "-1889831767"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = LoginPacket.getFrames(var2 >> 16);
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
		signature = "(Leh;II)Leh;",
		garbageValue = "-52965568"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = LoginPacket.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Leh;ILjg;II)Leh;",
		garbageValue = "-1275419577"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = LoginPacket.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = LoginPacket.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3543);
				return var7;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Leh;II)Leh;",
		garbageValue = "211879185"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = LoginPacket.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = LoginPacket.getFrames(var6 >> 16);
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
