import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("ac")
	static boolean field2324;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2316;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -171195263
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aa")
	public Map field2322;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1703695491
	)
	int field2323;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1591528455
	)
	int field2335;
	@ObfuscatedName("as")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("aj")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("an")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("au")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1144530421
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ae")
	int[] field2330;
	@ObfuscatedName("aw")
	boolean[] field2331;
	@ObfuscatedName("aq")
	public boolean field2338;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -298932043
	)
	public int field2333;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1468148285
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -873805365
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1821071213
	)
	public int field2341;
	@ObfuscatedName("bn")
	public boolean field2319;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 888504245
	)
	public int field2327;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 234643047
	)
	public int field2339;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1115829053
	)
	public int field2340;

	static {
		field2324 = false;
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2323 = 0; // L: 29
		this.field2335 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2338 = false; // L: 38
		this.field2333 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2341 = 99; // L: 42
		this.field2319 = false; // L: 43
		this.field2327 = -1; // L: 44
		this.field2339 = -1; // L: 45
		this.field2340 = 2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "-79"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 73
			if (var2 == 0) { // L: 74
				return; // L: 77
			}

			this.decodeNext(var1, var2); // L: 75
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "839529749"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 80
			var3 = var1.readUnsignedShort(); // L: 81
			this.frameLengths = new int[var3]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 84

			for (var4 = 0; var4 < var3; ++var4) { // L: 85
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 88
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 89
			var3 = var1.readUnsignedByte(); // L: 90
			this.field2330 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2330[var4] = var1.readUnsignedByte();
			}

			this.field2330[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2338 = true;
		} else if (var2 == 5) { // L: 96
			this.field2333 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 99
			this.field2341 = var1.readUnsignedByte(); // L: 100
			this.field2319 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2327 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2339 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2340 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			this.chatFrameIds = new int[var3]; // L: 108

			for (var4 = 0; var4 < var3; ++var4) { // L: 109
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 110
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 112
			var3 = var1.readUnsignedByte(); // L: 113
			this.soundEffects = new int[var3]; // L: 114

			for (var4 = 0; var4 < var3; ++var4) { // L: 115
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 117
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 118
		} else if (var2 == 15) { // L: 120
			var3 = var1.readUnsignedShort(); // L: 121
			this.field2322 = new HashMap(); // L: 122

			for (var4 = 0; var4 < var3; ++var4) { // L: 123
				int var5 = var1.readUnsignedShort(); // L: 124
				int var6 = var1.readMedium(); // L: 125
				this.field2322.put(var5, var6); // L: 126
			}
		} else if (var2 == 16) { // L: 129
			this.field2323 = var1.readUnsignedShort(); // L: 130
			this.field2335 = var1.readUnsignedShort(); // L: 131
		} else if (var2 == 17) { // L: 133
			this.field2331 = new boolean[256]; // L: 134

			for (var3 = 0; var3 < this.field2331.length; ++var3) { // L: 135
				this.field2331[var3] = false; // L: 136
			}

			var3 = var1.readUnsignedByte(); // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2331[var1.readUnsignedByte()] = true; // L: 140
			}
		}

	} // L: 144

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12569"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2327 == -1) { // L: 147
			if (this.field2330 == null && this.field2331 == null) { // L: 148
				this.field2327 = 0; // L: 149
			} else {
				this.field2327 = 2;
			}
		}

		if (this.field2339 == -1) { // L: 151
			if (this.field2330 == null && this.field2331 == null) { // L: 152
				this.field2339 = 0; // L: 153
			} else {
				this.field2339 = 2;
			}
		}

	} // L: 155

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljn;II)Ljn;",
		garbageValue = "119029641"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 158
			var2 = this.frameIds[var2]; // L: 159
			Frames var5 = class14.getFrames(var2 >> 16); // L: 160
			var2 &= 65535; // L: 161
			if (var5 == null) { // L: 162
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 163
				var4.animate(var5, var2); // L: 164
				return var4; // L: 165
			}
		} else {
			class139 var3 = class214.method3910(this.SequenceDefinition_cachedModelId); // L: 168
			if (var3 == null) { // L: 169
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3088()); // L: 170
				var4.method4915(var3, var2); // L: 171
				return var4; // L: 172
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljn;III)Ljn;",
		garbageValue = "2034057429"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 177
			var2 = this.frameIds[var2]; // L: 178
			Frames var6 = class14.getFrames(var2 >> 16); // L: 179
			var2 &= 65535; // L: 180
			if (var6 == null) { // L: 181
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 182
				var3 &= 3; // L: 183
				if (var3 == 1) { // L: 184
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 185
					var5.rotateY180();
				} else if (var3 == 3) { // L: 186
					var5.rotateY90Ccw();
				}

				var5.animate(var6, var2); // L: 187
				if (var3 == 1) { // L: 188
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 189
					var5.rotateY180();
				} else if (var3 == 3) { // L: 190
					var5.rotateY270Ccw();
				}

				return var5; // L: 191
			}
		} else {
			class139 var4 = class214.method3910(this.SequenceDefinition_cachedModelId); // L: 194
			if (var4 == null) { // L: 195
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3088()); // L: 196
				var3 &= 3; // L: 197
				if (var3 == 1) { // L: 198
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 199
					var5.rotateY180();
				} else if (var3 == 3) { // L: 200
					var5.rotateY90Ccw();
				}

				var5.method4915(var4, var2); // L: 201
				if (var3 == 1) { // L: 202
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 203
				} else if (var3 == 3) { // L: 204
					var5.rotateY270Ccw();
				}

				return var5; // L: 205
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "58"
	)
	Model method4164(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 210
			var2 = this.frameIds[var2]; // L: 211
			Frames var5 = class14.getFrames(var2 >> 16); // L: 212
			var2 &= 65535; // L: 213
			if (var5 == null) { // L: 214
				return var1.method4907(true);
			} else {
				var4 = var1.method4907(!var5.hasAlphaTransform(var2)); // L: 215
				var4.animate(var5, var2); // L: 216
				return var4; // L: 217
			}
		} else {
			class139 var3 = class214.method3910(this.SequenceDefinition_cachedModelId); // L: 220
			if (var3 == null) { // L: 221
				return var1.method4907(true);
			} else {
				var4 = var1.method4907(!var3.method3088()); // L: 222
				var4.method4915(var3, var2); // L: 223
				return var4; // L: 224
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILif;II)Ljn;",
		garbageValue = "-130759845"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2324 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 229
			return this.method4207(var1, var2, var3, var4); // L: 230
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 232
			boolean var6 = false; // L: 233
			Frames var7 = null; // L: 234
			Skeleton var8 = null; // L: 235
			class139 var9;
			if (this.isCachedModelIdSet()) { // L: 236
				var9 = this.method4170(); // L: 237
				if (var9 == null) { // L: 238
					return var5; // L: 239
				}

				if (var3.isCachedModelIdSet() && this.field2331 == null) { // L: 241
					var5.method4915(var9, var2); // L: 242
					return var5; // L: 243
				}

				var8 = var9.field1606; // L: 245
				var5.method4918(var8, var9, var2, this.field2331, false, !var3.isCachedModelIdSet()); // L: 246
			} else {
				var2 = this.frameIds[var2]; // L: 249
				var7 = class14.getFrames(var2 >> 16); // L: 250
				var2 &= 65535; // L: 251
				if (var7 == null) { // L: 252
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2330 == null || var4 == -1)) { // L: 253
					var5.animate(var7, var2); // L: 254
					return var5; // L: 255
				}

				if (this.field2330 == null || var4 == -1) { // L: 257
					var5.animate(var7, var2); // L: 258
					return var5; // L: 259
				}

				var6 = var3.isCachedModelIdSet(); // L: 261
				if (!var6) { // L: 262
					var5.method4919(var7, var2, this.field2330, false); // L: 263
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 266
				var9 = var3.method4170(); // L: 267
				if (var9 == null) { // L: 268
					return var5; // L: 269
				}

				if (var8 == null) { // L: 271
					var8 = var9.field1606; // L: 272
				}

				var5.method4918(var8, var9, var4, this.field2331, true, true); // L: 274
			} else {
				var4 = var3.frameIds[var4]; // L: 277
				Frames var10 = class14.getFrames(var4 >> 16); // L: 278
				var4 &= 65535; // L: 279
				if (var10 == null) { // L: 280
					return this.transformActorModel(var1, var2);
				}

				var5.method4919(var10, var4, this.field2330, true); // L: 281
			}

			if (var6 && var7 != null) { // L: 283
				var5.method4919(var7, var2, this.field2330, false); // L: 284
			}

			var5.resetBounds(); // L: 286
			return var5; // L: 287
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILif;II)Ljn;",
		garbageValue = "-561327832"
	)
	Model method4207(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 291
		Frames var5 = class14.getFrames(var2 >> 16); // L: 292
		var2 &= 65535; // L: 293
		if (var5 == null) { // L: 294
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 295
			Frames var6 = class14.getFrames(var4 >> 16); // L: 296
			var4 &= 65535; // L: 297
			Model var7;
			if (var6 == null) { // L: 298
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 299
				var7.animate(var5, var2); // L: 300
				return var7; // L: 301
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 303
				var7.animate2(var5, var2, var6, var4, this.field2330); // L: 304
				return var7; // L: 305
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IS)Ljn;",
		garbageValue = "6000"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 309
			int var3 = this.frameIds[var2]; // L: 310
			Frames var4 = class14.getFrames(var3 >> 16); // L: 311
			var3 &= 65535; // L: 312
			if (var4 == null) { // L: 313
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 314
				int var6 = 0; // L: 315
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 316
					var6 = this.chatFrameIds[var2]; // L: 317
					var5 = class14.getFrames(var6 >> 16); // L: 318
					var6 &= 65535; // L: 319
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 321
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 326
					var7.animate(var4, var3); // L: 327
					var7.animate(var5, var6); // L: 328
					return var7; // L: 329
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 322
					var7.animate(var4, var3); // L: 323
					return var7; // L: 324
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 332
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1797639917"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 337
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1128031722"
	)
	public int method4177() {
		return this.field2335 - this.field2323; // L: 341
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lfk;",
		garbageValue = "-585395726"
	)
	class139 method4170() {
		return this.isCachedModelIdSet() ? class214.method3910(this.SequenceDefinition_cachedModelId) : null; // L: 353 354 357
	}

	@ObfuscatedName("ac")
	static boolean method4210(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L); // L: 46
		return var2 == 2; // L: 48
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Lon;II)Lon;",
		garbageValue = "-805987290"
	)
	@Export("findEnumerated")
	public static class386 findEnumerated(class386[] var0, int var1) {
		class386[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class386 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}
}
