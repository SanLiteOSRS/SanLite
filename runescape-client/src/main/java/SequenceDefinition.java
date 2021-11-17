import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("g")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("e")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("p")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("j")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -724339659
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field1957;
	@ObfuscatedName("y")
	public boolean field1958;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1109851961
	)
	public int field1959;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2080361701
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 911643557
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1755314831
	)
	public int field1962;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1777344097
	)
	public int field1963;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 532178661
	)
	public int field1956;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1664617853
	)
	public int field1965;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1958 = false;
		this.field1959 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1962 = 99;
		this.field1963 = -1;
		this.field1956 = -1;
		this.field1965 = 2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;S)V",
		garbageValue = "-19285"
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
		descriptor = "(Lop;II)V",
		garbageValue = "1217260020"
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
			this.field1957 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1957[var4] = var1.readUnsignedByte();
			}

			this.field1957[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1958 = true;
		} else if (var2 == 5) {
			this.field1959 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1962 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field1963 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1956 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field1965 = var1.readUnsignedByte();
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2018272752"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1963 == -1) {
			if (this.field1957 != null) {
				this.field1963 = 2;
			} else {
				this.field1963 = 0;
			}
		}

		if (this.field1956 == -1) {
			if (this.field1957 != null) {
				this.field1956 = 2;
			} else {
				this.field1956 = 0;
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IS)Lhl;",
		garbageValue = "11483"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = DynamicObject.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIB)Lhl;",
		garbageValue = "0"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = DynamicObject.getFrames(var2 >> 16);
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IB)Lhl;",
		garbageValue = "55"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = DynamicObject.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ILfm;II)Lhl;",
		garbageValue = "1824353368"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = DynamicObject.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = DynamicObject.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field1957);
				return var7;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhl;II)Lhl;",
		garbageValue = "530277296"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = DynamicObject.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = DynamicObject.getFrames(var6 >> 16);
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
	public static final int method3461(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (0.0D != var2) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (6.0D * var16 < 1.0D) {
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (var0 * 6.0D < 1.0D) {
				var8 = var14 + 6.0D * (var12 - var14) * var0;
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + (var12 - var14) * (0.6666666666666666D - var0) * 6.0D;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(var10 * 256.0D);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1706767111"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class19.method289();
		GameBuild.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class247.musicPlayerStatus = 1;
		class128.musicTrackArchive = null;
		class411.musicTrackGroupId = -1;
		ArchiveDiskActionHandler.musicTrackFileId = -1;
		class247.musicTrackVolume = 0;
		SecureRandomCallable.musicTrackBoolean = false;
		class247.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.field710 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				BuddyRankComparator.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				BuddyRankComparator.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		WorldMapData_1.updateGameState(10);
	}
}
