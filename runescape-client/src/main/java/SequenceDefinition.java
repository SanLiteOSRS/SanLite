import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("at")
	static boolean field2206;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -569745451
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("av")
	public Map field2212;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -843852473
	)
	int field2213;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1032248213
	)
	int field2219;
	@ObfuscatedName("ay")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ak")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("aj")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("am")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1433820539
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ai")
	int[] field2220;
	@ObfuscatedName("aw")
	boolean[] field2221;
	@ObfuscatedName("ae")
	public boolean field2224;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1596578627
	)
	public int field2223;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1008837529
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 640845315
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -893117653
	)
	public int field2211;
	@ObfuscatedName("be")
	public boolean field2210;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -595997513
	)
	public int field2218;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1548671259
	)
	public int field2205;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1712808465
	)
	public int field2230;

	static {
		field2206 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2213 = 0; // L: 29
		this.field2219 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2224 = false; // L: 38
		this.field2223 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2211 = 99; // L: 42
		this.field2210 = false; // L: 43
		this.field2218 = -1; // L: 44
		this.field2205 = -1; // L: 45
		this.field2230 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "724172563"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 67
			if (var2 == 0) { // L: 68
				return; // L: 71
			}

			this.decodeNext(var1, var2); // L: 69
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "-848433725"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 74
			var3 = var1.readUnsignedShort(); // L: 75
			this.frameLengths = new int[var3]; // L: 76

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 78

			for (var4 = 0; var4 < var3; ++var4) { // L: 79
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 80
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 82
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 83
			var3 = var1.readUnsignedByte(); // L: 84
			this.field2220 = new int[var3 + 1]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.field2220[var4] = var1.readUnsignedByte();
			}

			this.field2220[var3] = 9999999; // L: 87
		} else if (var2 == 4) { // L: 89
			this.field2224 = true;
		} else if (var2 == 5) { // L: 90
			this.field2223 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 91
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 92
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 93
			this.field2211 = var1.readUnsignedByte(); // L: 94
			this.field2210 = true; // L: 95
		} else if (var2 == 9) { // L: 97
			this.field2218 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 98
			this.field2205 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 99
			this.field2230 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 100
			var3 = var1.readUnsignedByte(); // L: 101
			this.chatFrameIds = new int[var3]; // L: 102

			for (var4 = 0; var4 < var3; ++var4) { // L: 103
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 104
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			this.soundEffects = new int[var3]; // L: 108

			for (var4 = 0; var4 < var3; ++var4) { // L: 109
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 111
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 112
		} else if (var2 == 15) { // L: 114
			var3 = var1.readUnsignedShort(); // L: 115
			this.field2212 = new HashMap(); // L: 116

			for (var4 = 0; var4 < var3; ++var4) { // L: 117
				int var5 = var1.readUnsignedShort(); // L: 118
				int var6 = var1.readMedium(); // L: 119
				this.field2212.put(var5, var6); // L: 120
			}
		} else if (var2 == 16) { // L: 123
			this.field2213 = var1.readUnsignedShort(); // L: 124
			this.field2219 = var1.readUnsignedShort(); // L: 125
		} else if (var2 == 17) { // L: 127
			this.field2221 = new boolean[256]; // L: 128

			for (var3 = 0; var3 < this.field2221.length; ++var3) { // L: 129
				this.field2221[var3] = false; // L: 130
			}

			var3 = var1.readUnsignedByte(); // L: 132

			for (var4 = 0; var4 < var3; ++var4) { // L: 133
				this.field2221[var1.readUnsignedByte()] = true; // L: 134
			}
		}

	} // L: 138

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2218 == -1) { // L: 141
			if (this.field2220 == null && this.field2221 == null) { // L: 142
				this.field2218 = 0; // L: 143
			} else {
				this.field2218 = 2;
			}
		}

		if (this.field2205 == -1) { // L: 145
			if (this.field2220 == null && this.field2221 == null) { // L: 146
				this.field2205 = 0; // L: 147
			} else {
				this.field2205 = 2;
			}
		}

	} // L: 149

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lka;IB)Lka;",
		garbageValue = "61"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 152
			var2 = this.frameIds[var2]; // L: 153
			Frames var5 = class102.getFrames(var2 >> 16); // L: 154
			var2 &= 65535; // L: 155
			if (var5 == null) { // L: 156
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 157
				var4.animate(var5, var2); // L: 158
				return var4; // L: 159
			}
		} else {
			class139 var3 = class151.method3292(this.SequenceDefinition_cachedModelId); // L: 162
			if (var3 == null) { // L: 163
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3187()); // L: 164
				var4.method5572(var3, var2); // L: 165
				return var4; // L: 166
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lka;III)Lka;",
		garbageValue = "-1872374798"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 171
			var2 = this.frameIds[var2]; // L: 172
			Frames var6 = class102.getFrames(var2 >> 16); // L: 173
			var2 &= 65535; // L: 174
			if (var6 == null) { // L: 175
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 176
				var3 &= 3; // L: 177
				if (var3 == 1) { // L: 178
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 179
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 180
				}

				var5.animate(var6, var2); // L: 181
				if (var3 == 1) { // L: 182
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 183
					var5.rotateY180();
				} else if (var3 == 3) { // L: 184
					var5.rotateY270Ccw();
				}

				return var5; // L: 185
			}
		} else {
			class139 var4 = class151.method3292(this.SequenceDefinition_cachedModelId); // L: 188
			if (var4 == null) { // L: 189
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3187()); // L: 190
				var3 &= 3; // L: 191
				if (var3 == 1) { // L: 192
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 193
					var5.rotateY180();
				} else if (var3 == 3) { // L: 194
					var5.rotateY90Ccw();
				}

				var5.method5572(var4, var2); // L: 195
				if (var3 == 1) { // L: 196
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 197
					var5.rotateY180();
				} else if (var3 == 3) { // L: 198
					var5.rotateY270Ccw();
				}

				return var5; // L: 199
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lka;IB)Lka;",
		garbageValue = "55"
	)
	Model method4049(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 204
			var2 = this.frameIds[var2]; // L: 205
			Frames var5 = class102.getFrames(var2 >> 16); // L: 206
			var2 &= 65535; // L: 207
			if (var5 == null) { // L: 208
				return var1.method5636(true);
			} else {
				var4 = var1.method5636(!var5.hasAlphaTransform(var2)); // L: 209
				var4.animate(var5, var2); // L: 210
				return var4; // L: 211
			}
		} else {
			class139 var3 = class151.method3292(this.SequenceDefinition_cachedModelId); // L: 214
			if (var3 == null) { // L: 215
				return var1.method5636(true);
			} else {
				var4 = var1.method5636(!var3.method3187()); // L: 216
				var4.method5572(var3, var2); // L: 217
				return var4; // L: 218
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lka;ILhx;IB)Lka;",
		garbageValue = "-75"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2206 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 223
			return this.method4074(var1, var2, var3, var4); // L: 224
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 226
			boolean var6 = false; // L: 227
			Frames var7 = null; // L: 228
			Skeleton var8 = null; // L: 229
			class139 var9;
			if (this.isCachedModelIdSet()) { // L: 230
				var9 = this.method4061(); // L: 231
				if (var9 == null) { // L: 232
					return var5; // L: 233
				}

				if (var3.isCachedModelIdSet() && this.field2221 == null) { // L: 235
					var5.method5572(var9, var2); // L: 236
					return var5; // L: 237
				}

				var8 = var9.field1600; // L: 239
				var5.method5576(var8, var9, var2, this.field2221, false, !var3.isCachedModelIdSet()); // L: 240
			} else {
				var2 = this.frameIds[var2]; // L: 243
				var7 = class102.getFrames(var2 >> 16); // L: 244
				var2 &= 65535; // L: 245
				if (var7 == null) { // L: 246
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2220 == null || var4 == -1)) { // L: 247
					var5.animate(var7, var2); // L: 248
					return var5; // L: 249
				}

				if (this.field2220 == null || var4 == -1) { // L: 251
					var5.animate(var7, var2); // L: 252
					return var5; // L: 253
				}

				var6 = var3.isCachedModelIdSet(); // L: 255
				if (!var6) { // L: 256
					var5.method5577(var7, var2, this.field2220, false); // L: 257
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 260
				var9 = var3.method4061(); // L: 261
				if (var9 == null) { // L: 262
					return var5; // L: 263
				}

				if (var8 == null) { // L: 265
					var8 = var9.field1600; // L: 266
				}

				var5.method5576(var8, var9, var4, this.field2221, true, true); // L: 268
			} else {
				var4 = var3.frameIds[var4]; // L: 271
				Frames var10 = class102.getFrames(var4 >> 16); // L: 272
				var4 &= 65535; // L: 273
				if (var10 == null) { // L: 274
					return this.transformActorModel(var1, var2);
				}

				var5.method5577(var10, var4, this.field2220, true); // L: 275
			}

			if (var6 && var7 != null) { // L: 277
				var5.method5577(var7, var2, this.field2220, false); // L: 278
			}

			var5.resetBounds(); // L: 280
			return var5; // L: 281
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lka;ILhx;II)Lka;",
		garbageValue = "1735546670"
	)
	Model method4074(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 285
		Frames var5 = class102.getFrames(var2 >> 16); // L: 286
		var2 &= 65535; // L: 287
		if (var5 == null) { // L: 288
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 289
			Frames var6 = class102.getFrames(var4 >> 16); // L: 290
			var4 &= 65535; // L: 291
			Model var7;
			if (var6 == null) { // L: 292
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 293
				var7.animate(var5, var2); // L: 294
				return var7; // L: 295
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 297
				var7.animate2(var5, var2, var6, var4, this.field2220); // L: 298
				return var7; // L: 299
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lka;II)Lka;",
		garbageValue = "1947242189"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 303
			int var3 = this.frameIds[var2]; // L: 304
			Frames var4 = class102.getFrames(var3 >> 16); // L: 305
			var3 &= 65535; // L: 306
			if (var4 == null) { // L: 307
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 308
				int var6 = 0; // L: 309
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 310
					var6 = this.chatFrameIds[var2]; // L: 311
					var5 = class102.getFrames(var6 >> 16); // L: 312
					var6 &= 65535; // L: 313
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 315
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 320
					var7.animate(var4, var3); // L: 321
					var7.animate(var5, var6); // L: 322
					return var7; // L: 323
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 316
					var7.animate(var4, var3); // L: 317
					return var7; // L: 318
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 326
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2015458472"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 331
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "759292138"
	)
	public int method4064() {
		return this.field2219 - this.field2213; // L: 335
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lfo;",
		garbageValue = "52"
	)
	class139 method4061() {
		return this.isCachedModelIdSet() ? class151.method3292(this.SequenceDefinition_cachedModelId) : null; // L: 366 367 370
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "12"
	)
	public static int method4094(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047; // L: 11
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "294649800"
	)
	public static int method4092(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "2048798044"
	)
	static int method4096(int var0, Script var1, boolean var2) {
		return 2; // L: 3256
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Loh;",
		garbageValue = "550564154"
	)
	static Archive method4093(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null; // L: 1989
		if (JagexCache.JagexCache_dat2File != null) { // L: 1990
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class25.JagexCache_idxFiles[var0], 1000000); // L: 1991
		}

		return new Archive(var6, class302.field3118, WorldMapSectionType.field2556, var0, var1, var2, var3, var4, var5); // L: 1993
	}
}
