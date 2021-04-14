import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	static AbstractArchive field3562;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgf;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -921028973
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1347105069
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1413295459
	)
	public int field3581;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 445711767
	)
	int field3573;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1796599539
	)
	int field3577;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -978444857
	)
	int field3575;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -215883891
	)
	int field3576;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1377029969
	)
	public int field3572;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1878239229
	)
	public int field3584;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 412111735
	)
	public int field3579;
	@ObfuscatedName("i")
	String field3580;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -700419329
	)
	public int field3586;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1204516257
	)
	public int field3582;
	@ObfuscatedName("s")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 931180183
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -700804289
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field3581 = 70;
		this.field3573 = -1;
		this.field3577 = -1;
		this.field3575 = -1;
		this.field3576 = -1;
		this.field3572 = 0;
		this.field3584 = 0;
		this.field3579 = -1;
		this.field3580 = "";
		this.field3586 = -1;
		this.field3582 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "1349410227"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lnu;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6597();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field3573 = var1.method6597();
		} else if (var2 == 4) {
			this.field3575 = var1.method6597();
		} else if (var2 == 5) {
			this.field3577 = var1.method6597();
		} else if (var2 == 6) {
			this.field3576 = var1.method6597();
		} else if (var2 == 7) {
			this.field3572 = var1.readShort();
		} else if (var2 == 8) {
			this.field3580 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field3581 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field3584 = var1.readShort();
		} else if (var2 == 11) {
			this.field3579 = 0;
		} else if (var2 == 12) {
			this.field3586 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field3582 = var1.readShort();
		} else if (var2 == 14) {
			this.field3579 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)Lkt;",
		garbageValue = "-1486809095"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class2.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? StudioGame.method4391(var2) : null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "1639056635"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3580;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + WallDecoration.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Loh;",
		garbageValue = "-1023418983"
	)
	public SpritePixels method5166() {
		if (this.field3573 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3573);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3573, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3573);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Loh;",
		garbageValue = "1414227613"
	)
	public SpritePixels method5137() {
		if (this.field3577 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3577);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3577, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3577);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Loh;",
		garbageValue = "-1065428410"
	)
	public SpritePixels method5138() {
		if (this.field3575 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3575);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3575, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3575);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Loh;",
		garbageValue = "-438870038"
	)
	public SpritePixels method5157() {
		if (this.field3576 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3576);
			if (var1 != null) {
				return var1;
			} else {
				var1 = ModelData0.SpriteBuffer_getSprite(field3562, this.field3576, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3576);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Lkq;",
		garbageValue = "513658947"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class236.method4378(field3562, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		signature = "(IZZZB)Lig;",
		garbageValue = "9"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, PendingSpawn.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, FriendLoginUpdate.masterDisk, var0, var1, var2, var3);
	}
}
