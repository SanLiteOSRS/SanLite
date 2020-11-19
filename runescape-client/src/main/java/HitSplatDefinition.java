import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	public static AbstractArchive field3350;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -815033711
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1301515825
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1266638287
	)
	public int field3370;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -83015757
	)
	int field3360;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 651149395
	)
	int field3349;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1270434679
	)
	int field3362;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1716225461
	)
	int field3363;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 779984005
	)
	public int field3364;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -770163669
	)
	public int field3365;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -604727169
	)
	public int field3366;
	@ObfuscatedName("d")
	String field3367;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1273582511
	)
	public int field3361;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -991437923
	)
	public int field3351;
	@ObfuscatedName("h")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1964734149
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1049290465
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
		this.field3370 = 70;
		this.field3360 = -1;
		this.field3349 = -1;
		this.field3362 = -1;
		this.field3363 = -1;
		this.field3364 = 0;
		this.field3365 = 0;
		this.field3366 = -1;
		this.field3367 = "";
		this.field3361 = -1;
		this.field3351 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "738572554"
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
		garbageValue = "-403077535"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method5851();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field3360 = var1.method5851();
		} else if (var2 == 4) {
			this.field3362 = var1.method5851();
		} else if (var2 == 5) {
			this.field3349 = var1.method5851();
		} else if (var2 == 6) {
			this.field3363 = var1.method5851();
		} else if (var2 == 7) {
			this.field3364 = var1.readShort();
		} else if (var2 == 8) {
			this.field3367 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field3370 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field3365 = var1.readShort();
		} else if (var2 == 11) {
			this.field3366 = 0;
		} else if (var2 == 12) {
			this.field3361 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field3351 = var1.readShort();
		} else if (var2 == 14) {
			this.field3366 = var1.readUnsignedShort();
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)Ljx;",
		garbageValue = "29"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ApproximateRouteStrategy.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class258.method4654(var2) : null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "722247792"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3367;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + class197.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)Llc;",
		garbageValue = "1144318986"
	)
	public SpritePixels method4748() {
		if (this.field3360 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3360);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3360, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3360);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)Llc;",
		garbageValue = "-104"
	)
	public SpritePixels method4733() {
		if (this.field3349 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3349);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3349, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3349);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(S)Llc;",
		garbageValue = "1003"
	)
	public SpritePixels method4731() {
		if (this.field3362 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3362);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3362, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3362);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Llc;",
		garbageValue = "1948931470"
	)
	public SpritePixels method4727() {
		if (this.field3363 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3363);
			if (var1 != null) {
				return var1;
			} else {
				var1 = FloorDecoration.SpriteBuffer_getSprite(field3350, this.field3363, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3363);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)Lkq;",
		garbageValue = "-1921749751"
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
				AbstractArchive var3 = field3350;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				byte[] var7 = var3.takeFile(var5, 0);
				boolean var6;
				if (var7 == null) {
					var6 = false;
				} else {
					class217.SpriteBuffer_decode(var7);
					var6 = true;
				}

				Font var2;
				if (!var6) {
					var2 = null;
				} else {
					var2 = UrlRequester.method3430(var4.takeFile(var5, 0));
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}
}
