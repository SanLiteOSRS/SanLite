import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("f")
	static boolean field2306;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -267802227
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("r")
	public Map field2290;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 494645969
	)
	int field2305;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 120591319
	)
	int field2300;
	@ObfuscatedName("t")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("h")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("p")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("o")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 984617043
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("x")
	int[] field2298;
	@ObfuscatedName("a")
	boolean[] field2299;
	@ObfuscatedName("q")
	public boolean field2293;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1032909961
	)
	public int field2292;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 2123963467
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1840198861
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2027973353
	)
	public int field2304;
	@ObfuscatedName("af")
	public boolean field2297;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 998246135
	)
	public int field2307;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 864092839
	)
	public int field2301;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 527050943
	)
	public int field2308;

	static {
		field2306 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2305 = 0; // L: 29
		this.field2300 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2293 = false; // L: 38
		this.field2292 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2304 = 99; // L: 42
		this.field2297 = false; // L: 43
		this.field2307 = -1; // L: 44
		this.field2301 = -1; // L: 45
		this.field2308 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "1334689844"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "2142217777"
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
			this.field2298 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2298[var4] = var1.readUnsignedByte();
			}

			this.field2298[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2293 = true;
		} else if (var2 == 5) { // L: 96
			this.field2292 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 99
			this.field2304 = var1.readUnsignedByte(); // L: 100
			this.field2297 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2307 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2301 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2308 = var1.readUnsignedByte();
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
			this.field2290 = new HashMap(); // L: 122

			for (var4 = 0; var4 < var3; ++var4) { // L: 123
				int var5 = var1.readUnsignedShort(); // L: 124
				int var6 = var1.readMedium(); // L: 125
				this.field2290.put(var5, var6); // L: 126
			}
		} else if (var2 == 16) { // L: 129
			this.field2305 = var1.readUnsignedShort(); // L: 130
			this.field2300 = var1.readUnsignedShort(); // L: 131
		} else if (var2 == 17) { // L: 133
			this.field2299 = new boolean[256]; // L: 134

			for (var3 = 0; var3 < this.field2299.length; ++var3) { // L: 135
				this.field2299[var3] = false; // L: 136
			}

			var3 = var1.readUnsignedByte(); // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2299[var1.readUnsignedByte()] = true; // L: 140
			}
		}

	} // L: 144

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1438810920"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2307 == -1) { // L: 147
			if (this.field2298 == null && this.field2299 == null) { // L: 148
				this.field2307 = 0; // L: 149
			} else {
				this.field2307 = 2;
			}
		}

		if (this.field2301 == -1) { // L: 151
			if (this.field2298 == null && this.field2299 == null) { // L: 152
				this.field2301 = 0; // L: 153
			} else {
				this.field2301 = 2;
			}
		}

	} // L: 155

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IB)Lhs;",
		garbageValue = "80"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 158
			var2 = this.frameIds[var2]; // L: 159
			Frames var8 = class131.getFrames(var2 >> 16); // L: 160
			var2 &= 65535; // L: 161
			if (var8 == null) { // L: 162
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2)); // L: 163
				var7.animate(var8, var2); // L: 164
				return var7; // L: 165
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 169
			class133 var3;
			if (class70.method2087(var4) != 0) { // L: 171
				var3 = null; // L: 172
			} else {
				class133 var6 = (class133)SequenceDefinition_cachedModel.get((long)var4); // L: 177
				class133 var5;
				if (var6 != null) { // L: 178
					var5 = var6; // L: 179
				} else {
					var6 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var4, false); // L: 182
					if (var6 != null) { // L: 183
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6; // L: 184
				}

				var3 = var5; // L: 186
			}

			if (var3 == null) { // L: 189
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var3.method3096()); // L: 190
				var9.method4727(var3, var2); // L: 191
				return var9; // L: 192
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIB)Lhs;",
		garbageValue = "-110"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 197
			var2 = this.frameIds[var2]; // L: 198
			Frames var9 = class131.getFrames(var2 >> 16); // L: 199
			var2 &= 65535; // L: 200
			if (var9 == null) { // L: 201
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2)); // L: 202
				var3 &= 3; // L: 203
				if (var3 == 1) { // L: 204
					var8.rotateY270Ccw();
				} else if (var3 == 2) { // L: 205
					var8.rotateY180();
				} else if (var3 == 3) { // L: 206
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2); // L: 207
				if (var3 == 1) { // L: 208
					var8.rotateY90Ccw();
				} else if (var3 == 2) { // L: 209
					var8.rotateY180();
				} else if (var3 == 3) { // L: 210
					var8.rotateY270Ccw();
				}

				return var8; // L: 211
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 215
			class133 var4;
			if (class70.method2087(var5) != 0) { // L: 217
				var4 = null; // L: 218
			} else {
				class133 var7 = (class133)SequenceDefinition_cachedModel.get((long)var5); // L: 223
				class133 var6;
				if (var7 != null) { // L: 224
					var6 = var7; // L: 225
				} else {
					var7 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var5, false); // L: 228
					if (var7 != null) { // L: 229
						SequenceDefinition_cachedModel.put(var7, (long)var5);
					}

					var6 = var7; // L: 230
				}

				var4 = var6; // L: 232
			}

			if (var4 == null) { // L: 235
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var4.method3096()); // L: 236
				var3 &= 3; // L: 237
				if (var3 == 1) { // L: 238
					var10.rotateY270Ccw();
				} else if (var3 == 2) { // L: 239
					var10.rotateY180();
				} else if (var3 == 3) { // L: 240
					var10.rotateY90Ccw();
				}

				var10.method4727(var4, var2); // L: 241
				if (var3 == 1) { // L: 242
					var10.rotateY90Ccw();
				} else if (var3 == 2) { // L: 243
					var10.rotateY180();
				} else if (var3 == 3) { // L: 244
					var10.rotateY270Ccw();
				}

				return var10; // L: 245
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IB)Lhs;",
		garbageValue = "1"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 250
			var2 = this.frameIds[var2]; // L: 251
			Frames var8 = class131.getFrames(var2 >> 16); // L: 252
			var2 &= 65535; // L: 253
			if (var8 == null) { // L: 254
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var7 = var1.toSharedSpotAnimationModel(!var8.hasAlphaTransform(var2)); // L: 255
				var7.animate(var8, var2); // L: 256
				return var7; // L: 257
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 261
			class133 var3;
			if (class70.method2087(var4) != 0) { // L: 263
				var3 = null; // L: 264
			} else {
				class133 var6 = (class133)SequenceDefinition_cachedModel.get((long)var4); // L: 269
				class133 var5;
				if (var6 != null) { // L: 270
					var5 = var6; // L: 271
				} else {
					var6 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var4, false); // L: 274
					if (var6 != null) { // L: 275
						SequenceDefinition_cachedModel.put(var6, (long)var4);
					}

					var5 = var6; // L: 276
				}

				var3 = var5; // L: 278
			}

			if (var3 == null) { // L: 281
				return var1.toSharedSpotAnimationModel(true);
			} else {
				Model var9 = var1.toSharedSpotAnimationModel(!var3.method3096()); // L: 282
				var9.method4727(var3, var2); // L: 283
				return var9; // L: 284
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILge;II)Lhs;",
		garbageValue = "-202244152"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2306 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 289
			return this.method4056(var1, var2, var3, var4); // L: 290
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 292
			boolean var6 = false; // L: 293
			Frames var7 = null; // L: 294
			Skeleton var8 = null; // L: 295
			class133 var9;
			if (this.isCachedModelIdSet()) { // L: 296
				var9 = this.method4052(); // L: 297
				if (var9 == null) { // L: 298
					return var5; // L: 299
				}

				if (var3.isCachedModelIdSet() && this.field2299 == null) { // L: 301
					var5.method4727(var9, var2); // L: 302
					return var5; // L: 303
				}

				var8 = var9.field1600; // L: 305
				var5.method4697(var8, var9, var2, this.field2299, false, !var3.isCachedModelIdSet()); // L: 306
			} else {
				var2 = this.frameIds[var2]; // L: 309
				var7 = class131.getFrames(var2 >> 16); // L: 310
				var2 &= 65535; // L: 311
				if (var7 == null) { // L: 312
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2298 == null || var4 == -1)) { // L: 313
					var5.animate(var7, var2); // L: 314
					return var5; // L: 315
				}

				if (this.field2298 == null || var4 == -1) { // L: 317
					var5.animate(var7, var2); // L: 318
					return var5; // L: 319
				}

				var6 = var3.isCachedModelIdSet(); // L: 321
				if (!var6) { // L: 322
					var5.method4801(var7, var2, this.field2298, false); // L: 323
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 326
				var9 = var3.method4052(); // L: 327
				if (var9 == null) { // L: 328
					return var5; // L: 329
				}

				if (var8 == null) { // L: 331
					var8 = var9.field1600; // L: 332
				}

				var5.method4697(var8, var9, var4, this.field2299, true, true); // L: 334
			} else {
				var4 = var3.frameIds[var4]; // L: 337
				Frames var10 = class131.getFrames(var4 >> 16); // L: 338
				var4 &= 65535; // L: 339
				if (var10 == null) { // L: 340
					return this.transformActorModel(var1, var2);
				}

				var5.method4801(var10, var4, this.field2298, true); // L: 341
			}

			if (var6 && var7 != null) { // L: 343
				var5.method4801(var7, var2, this.field2298, false); // L: 344
			}

			var5.resetBounds(); // L: 346
			return var5; // L: 347
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILge;II)Lhs;",
		garbageValue = "-2099671514"
	)
	Model method4056(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 351
		Frames var5 = class131.getFrames(var2 >> 16); // L: 352
		var2 &= 65535; // L: 353
		if (var5 == null) { // L: 354
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 355
			Frames var6 = class131.getFrames(var4 >> 16); // L: 356
			var4 &= 65535; // L: 357
			Model var7;
			if (var6 == null) { // L: 358
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 359
				var7.animate(var5, var2); // L: 360
				return var7; // L: 361
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 363
				var7.animate2(var5, var2, var6, var4, this.field2298); // L: 364
				return var7; // L: 365
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhs;II)Lhs;",
		garbageValue = "164179866"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 369
			int var3 = this.frameIds[var2]; // L: 370
			Frames var4 = class131.getFrames(var3 >> 16); // L: 371
			var3 &= 65535; // L: 372
			if (var4 == null) { // L: 373
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 374
				int var6 = 0; // L: 375
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 376
					var6 = this.chatFrameIds[var2]; // L: 377
					var5 = class131.getFrames(var6 >> 16); // L: 378
					var6 &= 65535; // L: 379
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 381
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 386
					var7.animate(var4, var3); // L: 387
					var7.animate(var5, var6); // L: 388
					return var7; // L: 389
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 382
					var7.animate(var4, var3); // L: 383
					return var7; // L: 384
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 392
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1029590355"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 397
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2032080348"
	)
	public int method4055() {
		return this.field2300 - this.field2305; // L: 401
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lei;",
		garbageValue = "894053899"
	)
	class133 method4052() {
		if (this.isCachedModelIdSet()) { // L: 461
			int var2 = this.SequenceDefinition_cachedModelId; // L: 463
			class133 var1;
			if (class70.method2087(var2) != 0) { // L: 465
				var1 = null; // L: 466
			} else {
				class133 var4 = (class133)SequenceDefinition_cachedModel.get((long)var2); // L: 471
				class133 var3;
				if (var4 != null) { // L: 472
					var3 = var4; // L: 473
				} else {
					var4 = Login.method2165(SequenceDefinition_animationsArchive, class16.SequenceDefinition_skeletonsArchive, var2, false); // L: 476
					if (var4 != null) { // L: 477
						SequenceDefinition_cachedModel.put(var4, (long)var2);
					}

					var3 = var4; // L: 478
				}

				var1 = var3; // L: 480
			}

			return var1; // L: 482
		} else {
			return null; // L: 485
		}
	}
}
