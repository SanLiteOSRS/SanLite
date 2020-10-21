import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jd")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	public static AbstractArchive field3364;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lel;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 840460821
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -910808373
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1699415327
	)
	public int field3356;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -359975217
	)
	int field3357;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1100166573
	)
	int field3351;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 620979093
	)
	int field3359;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1746417223
	)
	int field3360;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1873666251
	)
	public int field3368;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1145971425
	)
	public int field3362;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1152481113
	)
	public int field3355;
	@ObfuscatedName("u")
	String field3361;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -444433025
	)
	public int field3365;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1573149035
	)
	public int field3366;
	@ObfuscatedName("l")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1795835533
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1163513145
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
		this.field3356 = 70;
		this.field3357 = -1;
		this.field3351 = -1;
		this.field3359 = -1;
		this.field3360 = -1;
		this.field3368 = 0;
		this.field3362 = 0;
		this.field3355 = -1;
		this.field3361 = "";
		this.field3365 = -1;
		this.field3366 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "183277091"
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
		garbageValue = "-2105056828"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method5634();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field3357 = var1.method5634();
		} else if (var2 == 4) {
			this.field3359 = var1.method5634();
		} else if (var2 == 5) {
			this.field3351 = var1.method5634();
		} else if (var2 == 6) {
			this.field3360 = var1.method5634();
		} else if (var2 == 7) {
			this.field3368 = var1.readShort();
		} else if (var2 == 8) {
			this.field3361 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field3356 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field3362 = var1.readShort();
		} else if (var2 == 11) {
			this.field3355 = 0;
		} else if (var2 == 12) {
			this.field3365 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field3366 = var1.readShort();
		} else if (var2 == 14) {
			this.field3355 = var1.readUnsignedShort();
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)Ljd;",
		garbageValue = "-79"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = WorldMapSection1.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? MusicPatchNode.method3929(var2) : null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-265851490"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field3361;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + ModeWhere.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Llp;",
		garbageValue = "-339938865"
	)
	public SpritePixels method4668() {
		if (this.field3357 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3357);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3357, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3357);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)Llp;",
		garbageValue = "68117664"
	)
	public SpritePixels method4681() {
		if (this.field3351 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3351);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3351, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3351);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(I)Llp;",
		garbageValue = "962785869"
	)
	public SpritePixels method4670() {
		if (this.field3359 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3359);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3359, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3359);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)Llp;",
		garbageValue = "-16"
	)
	public SpritePixels method4678() {
		if (this.field3360 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field3360);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field3364, this.field3360, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field3360);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Lkr;",
		garbageValue = "-456462046"
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
				var1 = RouteStrategy.method3688(field3364, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(ILcy;ZB)I",
		garbageValue = "20"
	)
	static int method4698(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Canvas.field438 : class3.field12;
		}

		if (var0 == ScriptOpcodes.CC_CALLONRESIZE) {
			if (Interpreter.field1135 >= 10) {
				throw new RuntimeException();
			} else if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var4 = new ScriptEvent();
				var4.widget = var3;
				var4.args = var3.onResize;
				var4.field593 = Interpreter.field1135 + 1;
				Client.scriptEvents.addFirst(var4);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
