import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("az")
	static boolean field2400;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1158511669
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ag")
	public Map field2373;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 355460473
	)
	int field2383;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1153977257
	)
	int field2384;
	@ObfuscatedName("ar")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("aj")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("au")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lim;"
	)
	public class220[] field2374;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1326039963
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("av")
	int[] field2390;
	@ObfuscatedName("aa")
	boolean[] field2391;
	@ObfuscatedName("aq")
	public boolean field2376;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1407034777
	)
	public int field2393;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1356573699
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1389248087
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 350626781
	)
	public int field2388;
	@ObfuscatedName("bp")
	public boolean field2397;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1128908439
	)
	public int field2398;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1758700787
	)
	public int field2399;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1127724015
	)
	public int field2396;

	static {
		field2400 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2383 = 0; // L: 29
		this.field2384 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2376 = false; // L: 38
		this.field2393 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2388 = 99; // L: 42
		this.field2397 = false; // L: 43
		this.field2398 = -1; // L: 44
		this.field2399 = -1; // L: 45
		this.field2396 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "-1018876135"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "550667970"
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
			this.field2390 = new int[var3 + 1]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.field2390[var4] = var1.readUnsignedByte();
			}

			this.field2390[var3] = 9999999; // L: 87
		} else if (var2 == 4) { // L: 89
			this.field2376 = true;
		} else if (var2 == 5) { // L: 90
			this.field2393 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 91
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 92
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 93
			this.field2388 = var1.readUnsignedByte(); // L: 94
			this.field2397 = true; // L: 95
		} else if (var2 == 9) { // L: 97
			this.field2398 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 98
			this.field2399 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 99
			this.field2396 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 100
			var3 = var1.readUnsignedByte(); // L: 101
			this.chatFrameIds = new int[var3]; // L: 102

			for (var4 = 0; var4 < var3; ++var4) { // L: 103
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 104
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else {
			boolean var8;
			boolean var9;
			boolean var10;
			int var16;
			int var17;
			int var18;
			if (var2 == 13) { // L: 106
				var3 = var1.readUnsignedByte(); // L: 107
				this.field2374 = new class220[var3]; // L: 108

				for (var4 = 0; var4 < var3; ++var4) { // L: 109
					class220 var12;
					class220[] var13;
					label155: {
						var13 = this.field2374; // L: 110
						if (var1 != null) { // L: 114
							var8 = false; // L: 115
							var9 = false; // L: 116
							var10 = false; // L: 117
							boolean var11 = false; // L: 118
							var16 = var1.readUnsignedShort(); // L: 119
							var17 = var1.readUnsignedByte(); // L: 120
							var18 = var1.readUnsignedByte();
							int var19 = var1.readUnsignedByte(); // L: 122
							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) { // L: 123
								var12 = new class220(var16, var17, var18, var19); // L: 124
								break label155; // L: 125
							}
						}

						var12 = null; // L: 128
					}

					var13[var4] = var12; // L: 130
				}
			} else if (var2 == 14) { // L: 133
				this.SequenceDefinition_cachedModelId = var1.readInt();
			} else if (var2 == 15) { // L: 136
				var3 = var1.readUnsignedShort(); // L: 137
				this.field2373 = new HashMap(); // L: 138

				for (var4 = 0; var4 < var3; ++var4) { // L: 139
					int var5;
					class220 var6;
					label168: {
						var5 = var1.readUnsignedShort(); // L: 140
						if (var1 != null) { // L: 143
							boolean var7 = false; // L: 144
							var8 = false; // L: 145
							var9 = false; // L: 146
							var10 = false; // L: 147
							int var15 = var1.readUnsignedShort(); // L: 148
							var16 = var1.readUnsignedByte(); // L: 149
							var17 = var1.readUnsignedByte(); // L: 150
							var18 = var1.readUnsignedByte(); // L: 151
							if (var15 >= 1 && var16 >= 1 && var17 >= 0 && var18 >= 0) { // L: 152
								var6 = new class220(var15, var16, var17, var18); // L: 153
								break label168; // L: 154
							}
						}

						var6 = null; // L: 157
					}

					this.field2373.put(var5, var6); // L: 160
				}
			} else if (var2 == 16) { // L: 163
				this.field2383 = var1.readUnsignedShort(); // L: 164
				this.field2384 = var1.readUnsignedShort(); // L: 165
			} else if (var2 == 17) { // L: 167
				this.field2391 = new boolean[256]; // L: 168

				for (var3 = 0; var3 < this.field2391.length; ++var3) { // L: 169
					this.field2391[var3] = false; // L: 170
				}

				var3 = var1.readUnsignedByte(); // L: 172

				for (var4 = 0; var4 < var3; ++var4) { // L: 173
					this.field2391[var1.readUnsignedByte()] = true; // L: 174
				}
			}
		}

	} // L: 178

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-681718141"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2398 == -1) { // L: 181
			if (this.field2390 == null && this.field2391 == null) { // L: 182
				this.field2398 = 0; // L: 183
			} else {
				this.field2398 = 2;
			}
		}

		if (this.field2399 == -1) { // L: 185
			if (this.field2390 == null && this.field2391 == null) { // L: 186
				this.field2399 = 0; // L: 187
			} else {
				this.field2399 = 2;
			}
		}

	} // L: 189

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "-74"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 192
			var2 = this.frameIds[var2]; // L: 193
			Frames var8 = class204.getFrames(var2 >> 16); // L: 194
			var2 &= 65535; // L: 195
			if (var8 == null) { // L: 196
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var8.hasAlphaTransform(var2)); // L: 197
				var7.animate(var8, var2); // L: 198
				return var7; // L: 199
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 203
			class138 var3;
			if (class192.method3717(var4) != 0) { // L: 205
				var3 = null; // L: 206
			} else {
				var3 = class90.method2315(var4); // L: 209
			}

			if (var3 == null) { // L: 212
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3089()); // L: 213
				var6.method4960(var3, var2); // L: 214
				return var6; // L: 215
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljn;III)Ljn;",
		garbageValue = "-85472262"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 220
			var2 = this.frameIds[var2]; // L: 221
			Frames var9 = class204.getFrames(var2 >> 16); // L: 222
			var2 &= 65535; // L: 223
			if (var9 == null) { // L: 224
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2)); // L: 225
				var3 &= 3; // L: 226
				if (var3 == 1) { // L: 227
					var8.rotateY270Ccw();
				} else if (var3 == 2) { // L: 228
					var8.rotateY180();
				} else if (var3 == 3) { // L: 229
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2); // L: 230
				if (var3 == 1) { // L: 231
					var8.rotateY90Ccw();
				} else if (var3 == 2) { // L: 232
					var8.rotateY180();
				} else if (var3 == 3) { // L: 233
					var8.rotateY270Ccw();
				}

				return var8; // L: 234
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 238
			class138 var4;
			if (class192.method3717(var5) != 0) { // L: 240
				var4 = null; // L: 241
			} else {
				var4 = class90.method2315(var5); // L: 244
			}

			if (var4 == null) { // L: 247
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3089()); // L: 248
				var3 &= 3; // L: 249
				if (var3 == 1) { // L: 250
					var7.rotateY270Ccw();
				} else if (var3 == 2) { // L: 251
					var7.rotateY180();
				} else if (var3 == 3) { // L: 252
					var7.rotateY90Ccw();
				}

				var7.method4960(var4, var2); // L: 253
				if (var3 == 1) { // L: 254
					var7.rotateY90Ccw();
				} else if (var3 == 2) { // L: 255
					var7.rotateY180();
				} else if (var3 == 3) { // L: 256
					var7.rotateY270Ccw();
				}

				return var7; // L: 257
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "-39"
	)
	Model method4227(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 262
			var2 = this.frameIds[var2]; // L: 263
			Frames var8 = class204.getFrames(var2 >> 16); // L: 264
			var2 &= 65535; // L: 265
			if (var8 == null) { // L: 266
				return var1.method5035(true);
			} else {
				Model var7 = var1.method5035(!var8.hasAlphaTransform(var2)); // L: 267
				var7.animate(var8, var2); // L: 268
				return var7; // L: 269
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 273
			class138 var3;
			if (class192.method3717(var4) != 0) { // L: 275
				var3 = null; // L: 276
			} else {
				var3 = class90.method2315(var4); // L: 279
			}

			if (var3 == null) { // L: 282
				return var1.method5035(true);
			} else {
				Model var6 = var1.method5035(!var3.method3089()); // L: 283
				var6.method4960(var3, var2); // L: 284
				return var6; // L: 285
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILig;IB)Ljn;",
		garbageValue = "122"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2400 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 290
			return this.method4229(var1, var2, var3, var4); // L: 291
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 293
			boolean var6 = false; // L: 294
			Frames var7 = null; // L: 295
			Skeleton var8 = null; // L: 296
			class138 var9;
			if (this.isCachedModelIdSet()) { // L: 297
				var9 = this.method4233(); // L: 298
				if (var9 == null) { // L: 299
					return var5; // L: 300
				}

				if (var3.isCachedModelIdSet() && this.field2391 == null) { // L: 302
					var5.method4960(var9, var2); // L: 303
					return var5; // L: 304
				}

				var8 = var9.field1635; // L: 306
				var5.method4964(var8, var9, var2, this.field2391, false, !var3.isCachedModelIdSet()); // L: 307
			} else {
				var2 = this.frameIds[var2]; // L: 310
				var7 = class204.getFrames(var2 >> 16); // L: 311
				var2 &= 65535; // L: 312
				if (var7 == null) { // L: 313
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2390 == null || var4 == -1)) { // L: 314
					var5.animate(var7, var2); // L: 315
					return var5; // L: 316
				}

				if (this.field2390 == null || var4 == -1) { // L: 318
					var5.animate(var7, var2); // L: 319
					return var5; // L: 320
				}

				var6 = var3.isCachedModelIdSet(); // L: 322
				if (!var6) { // L: 323
					var5.method5060(var7, var2, this.field2390, false); // L: 324
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 327
				var9 = var3.method4233(); // L: 328
				if (var9 == null) { // L: 329
					return var5; // L: 330
				}

				if (var8 == null) { // L: 332
					var8 = var9.field1635; // L: 333
				}

				var5.method4964(var8, var9, var4, this.field2391, true, true); // L: 335
			} else {
				var4 = var3.frameIds[var4]; // L: 338
				Frames var10 = class204.getFrames(var4 >> 16); // L: 339
				var4 &= 65535; // L: 340
				if (var10 == null) { // L: 341
					return this.transformActorModel(var1, var2);
				}

				var5.method5060(var10, var4, this.field2390, true); // L: 342
			}

			if (var6 && var7 != null) { // L: 344
				var5.method5060(var7, var2, this.field2390, false); // L: 345
			}

			var5.resetBounds(); // L: 347
			return var5; // L: 348
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljn;ILig;II)Ljn;",
		garbageValue = "-1536368955"
	)
	Model method4229(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 352
		Frames var5 = class204.getFrames(var2 >> 16); // L: 353
		var2 &= 65535; // L: 354
		if (var5 == null) { // L: 355
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 356
			Frames var6 = class204.getFrames(var4 >> 16); // L: 357
			var4 &= 65535; // L: 358
			Model var7;
			if (var6 == null) { // L: 359
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 360
				var7.animate(var5, var2); // L: 361
				return var7; // L: 362
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 364
				var7.animate2(var5, var2, var6, var4, this.field2390); // L: 365
				return var7; // L: 366
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IB)Ljn;",
		garbageValue = "63"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 370
			int var3 = this.frameIds[var2]; // L: 371
			Frames var4 = class204.getFrames(var3 >> 16); // L: 372
			var3 &= 65535; // L: 373
			if (var4 == null) { // L: 374
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 375
				int var6 = 0; // L: 376
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 377
					var6 = this.chatFrameIds[var2]; // L: 378
					var5 = class204.getFrames(var6 >> 16); // L: 379
					var6 &= 65535; // L: 380
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 382
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 387
					var7.animate(var4, var3); // L: 388
					var7.animate(var5, var6); // L: 389
					return var7; // L: 390
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 383
					var7.animate(var4, var3); // L: 384
					return var7; // L: 385
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 393
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1986690179"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 398
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "58"
	)
	public int method4232() {
		return this.field2384 - this.field2383; // L: 402
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lfa;",
		garbageValue = "513425715"
	)
	class138 method4233() {
		if (this.isCachedModelIdSet()) { // L: 422
			int var2 = this.SequenceDefinition_cachedModelId; // L: 424
			class138 var1;
			if (class192.method3717(var2) != 0) { // L: 426
				var1 = null; // L: 427
			} else {
				var1 = class90.method2315(var2); // L: 430
			}

			return var1; // L: 432
		} else {
			return null; // L: 435
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1639567067"
	)
	static final void method4270() {
		class6.method40("You can't add yourself to your own friend list"); // L: 134
	} // L: 135

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1946307811"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 121
	}
}
