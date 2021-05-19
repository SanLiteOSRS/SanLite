import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("z")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("t")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("v")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("b")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1353705589
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("i")
	int[] field1892;
	@ObfuscatedName("x")
	public boolean field1898;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 302624317
	)
	public int field1894;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1963322079
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2146887017
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 964366639
	)
	public int field1897;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1889756253
	)
	public int field1886;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1557873209
	)
	public int field1882;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -125818589
	)
	public int field1900;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field1898 = false;
		this.field1894 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field1897 = 99;
		this.field1886 = -1;
		this.field1882 = -1;
		this.field1900 = 2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "492235636"
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "24"
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
			this.field1892 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field1892[var4] = var1.readUnsignedByte();
			}

			this.field1892[var3] = 9999999;
		} else if (var2 == 4) {
			this.field1898 = true;
		} else if (var2 == 5) {
			this.field1894 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field1897 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field1886 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field1882 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field1900 = var1.readUnsignedByte();
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field1886 == -1) {
			if (this.field1892 != null) {
				this.field1886 = 2;
			} else {
				this.field1886 = 0;
			}
		}

		if (this.field1882 == -1) {
			if (this.field1892 != null) {
				this.field1882 = 2;
			} else {
				this.field1882 = 0;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgj;II)Lgj;",
		garbageValue = "-668605957"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ParamComposition.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lgj;III)Lgj;",
		garbageValue = "2138325603"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = ParamComposition.getFrames(var2 >> 16);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IB)Lgj;",
		garbageValue = "86"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ParamComposition.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgj;ILfb;II)Lgj;",
		garbageValue = "-1845064839"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ParamComposition.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ParamComposition.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field1892);
				return var7;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgj;IB)Lgj;",
		garbageValue = "2"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = ParamComposition.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = ParamComposition.getFrames(var6 >> 16);
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;III)Lof;",
		garbageValue = "-6114463"
	)
	static IndexedSprite method3091(AbstractArchive var0, int var1, int var2) {
		return !Username.method5711(var0, var1, var2) ? null : GraphicsObject.method1938();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1309555794"
	)
	static byte[] method3087(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "1"
	)
	static final void method3086(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field661; ++var1) {
			int var2 = Client.field662[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			int var6;
			int var7;
			if ((var4 & 32) != 0) {
				var5 = var0.method6620();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method6478();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = Player.SequenceDefinition_get(var5).field1900;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1244 = 0;
					}

					if (var7 == 2) {
						var3.field1244 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || Player.SequenceDefinition_get(var5).field1894 >= Player.SequenceDefinition_get(var3.sequence).field1894) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1244 = 0;
					var3.field1215 = var3.pathLength;
				}
			}

			int var8;
			if ((var4 & 8) != 0) {
				var5 = var0.method6648();
				var6 = var0.readUnsignedShort();
				var7 = var3.x - (var5 - JagexCache.baseX * 64 - JagexCache.baseX * 64) * 64;
				var8 = var3.y - (var6 - Messages.baseY * 64 - Messages.baseY * 64) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1247 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 2) != 0) {
				var3.definition = class8.getNpcDefinition(var0.method6620());
				var3.field1211 = var3.definition.size;
				var3.field1261 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 1) != 0) {
				var3.targetIndex = var0.method6620();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 128) != 0) {
				var3.field1236 = var0.method6530();
				var3.field1252 = var0.method6530();
				var3.field1251 = var0.method6526();
				var3.field1253 = var0.method6480();
				var3.field1254 = var0.method6486() + Client.cycle;
				var3.field1237 = var0.method6620() + Client.cycle;
				var3.field1256 = var0.method6486();
				var3.pathLength = 1;
				var3.field1215 = 0;
				var3.field1236 += var3.pathX[0];
				var3.field1252 += var3.pathY[0];
				var3.field1251 += var3.pathX[0];
				var3.field1253 += var3.pathY[0];
			}

			if ((var4 & 64) != 0) {
				var5 = var0.method6478();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.method6477();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.method6477();
							int var12 = var9 > 0 ? var0.method6478() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 4) != 0) {
				var3.spotAnimation = var0.method6648();
				var5 = var0.method6428();
				var3.field1224 = var5 >> 16;
				var3.field1243 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1243 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 16) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}
		}

	}
}
