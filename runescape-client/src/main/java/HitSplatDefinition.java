import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static AbstractArchive field2135;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -452341601
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 29790821
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1571140211
	)
	public int field2132;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1857088509
	)
	int field2138;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 519800861
	)
	int field2145;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1875529689
	)
	int field2140;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 866194173
	)
	int field2141;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1183512901
	)
	public int field2142;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 695762813
	)
	public int field2137;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -220285237
	)
	public int field2144;
	@ObfuscatedName("p")
	String field2128;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1451388863
	)
	public int field2146;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1013670435
	)
	public int field2147;
	@ObfuscatedName("z")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 327667697
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -20536057
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2132 = 70; // L: 28
		this.field2138 = -1; // L: 29
		this.field2145 = -1; // L: 30
		this.field2140 = -1; // L: 31
		this.field2141 = -1; // L: 32
		this.field2142 = 0; // L: 33
		this.field2137 = 0; // L: 34
		this.field2144 = -1; // L: 35
		this.field2128 = ""; // L: 36
		this.field2146 = -1; // L: 37
		this.field2147 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1235490196"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;IB)V",
		garbageValue = "2"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method8568();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2138 = var1.method8568();
		} else if (var2 == 4) { // L: 67
			this.field2140 = var1.method8568();
		} else if (var2 == 5) { // L: 68
			this.field2145 = var1.method8568();
		} else if (var2 == 6) { // L: 69
			this.field2141 = var1.method8568();
		} else if (var2 == 7) { // L: 70
			this.field2142 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2128 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2132 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2137 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2144 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2146 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2147 = var1.readShort();
		} else if (var2 == 14) {
			this.field2144 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lgm;",
		garbageValue = "-80"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = class175.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class364.method6987(var2) : null; // L: 106 107
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "633340831"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2128; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + Huffman.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Lrx;",
		garbageValue = "-31390"
	)
	public SpritePixels method3827() {
		if (this.field2138 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2138); // L: 122
			if (var1 != null) { // L: 123
				return var1;
			} else {
				var1 = class125.SpriteBuffer_getSprite(field2135, this.field2138, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2138); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lrx;",
		garbageValue = "14281"
	)
	public SpritePixels method3828() {
		if (this.field2145 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2145); // L: 132
			if (var1 != null) {
				return var1; // L: 133
			} else {
				var1 = class125.SpriteBuffer_getSprite(field2135, this.field2145, 0); // L: 134
				if (var1 != null) { // L: 135
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2145);
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "1577011085"
	)
	public SpritePixels method3862() {
		if (this.field2140 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2140); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = class125.SpriteBuffer_getSprite(field2135, this.field2140, 0); // L: 144
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2140); // L: 145
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lrx;",
		garbageValue = "0"
	)
	public SpritePixels method3830() {
		if (this.field2141 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2141); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = class125.SpriteBuffer_getSprite(field2135, this.field2141, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2141);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Lnv;",
		garbageValue = "15"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = Timer.method7358(field2135, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	public static void method3850(int var0) {
		if (var0 != -1) { // L: 283
			if (Language.Widget_loadedInterfaces[var0]) { // L: 284
				class422.Widget_archive.clearFilesGroup(var0); // L: 285
				if (class71.Widget_interfaceComponents[var0] != null) { // L: 286
					boolean var1 = true; // L: 287

					for (int var2 = 0; var2 < class71.Widget_interfaceComponents[var0].length; ++var2) { // L: 288
						if (class71.Widget_interfaceComponents[var0][var2] != null) { // L: 289
							if (class71.Widget_interfaceComponents[var0][var2].type != 2) { // L: 290
								class71.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false; // L: 291
							}
						}
					}

					if (var1) {
						class71.Widget_interfaceComponents[var0] = null; // L: 294
					}

					Language.Widget_loadedInterfaces[var0] = false; // L: 295
				}
			}
		}
	} // L: 296

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "23723"
	)
	static boolean method3824() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1433
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1434
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1435
				if (!var0.isLoaded()) {
					return false; // L: 1436
				}

				++Client.archiveLoadersDone; // L: 1437
			}

			return true; // L: 1439
		} else {
			return true; // L: 1438
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-745676909"
	)
	static final void method3860() {
		int var0 = Players.Players_count; // L: 3856
		int[] var1 = Players.Players_indices; // L: 3857

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3858
			Player var3 = Client.players[var1[var2]]; // L: 3859
			if (var3 != null) { // L: 3860
				GroundObject.updateActorSequence(var3, 1); // L: 3861
			}
		}

	} // L: 3864
}
