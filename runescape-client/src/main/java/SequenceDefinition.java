import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("aq")
	static boolean field2267;
	@ObfuscatedName("az")
	public static boolean field2250;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2108507
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("aj")
	public Map field2255;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1375143013
	)
	int field2261;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1718625263
	)
	int field2260;
	@ObfuscatedName("an")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ag")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("am")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lhy;"
	)
	public class202[] field2257;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 537916267
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("ay")
	int[] field2263;
	@ObfuscatedName("ae")
	boolean[] field2264;
	@ObfuscatedName("ac")
	public boolean field2265;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1408260703
	)
	public int field2266;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1602960935
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1327703397
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 7085519
	)
	public int field2269;
	@ObfuscatedName("bo")
	public boolean field2270;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2102314929
	)
	public int field2271;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -578940565
	)
	public int field2273;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1306198175
	)
	public int field2272;

	static {
		field2267 = false; // L: 17
		field2250 = false; // L: 24
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 25
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 26
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 27
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 28
		this.field2261 = 0; // L: 30
		this.field2260 = 0; // L: 31
		this.frameCount = -1; // L: 36
		this.field2265 = false; // L: 39
		this.field2266 = 5; // L: 40
		this.shield = -1; // L: 41
		this.weapon = -1; // L: 42
		this.field2269 = 99; // L: 43
		this.field2270 = false; // L: 44
		this.field2271 = -1; // L: 45
		this.field2273 = -1; // L: 46
		this.field2272 = 2; // L: 47
	} // L: 49

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-471377319"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 68
			if (var2 == 0) { // L: 69
				return; // L: 72
			}

			this.decodeNext(var1, var2); // L: 70
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-225778054"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 75
			var3 = var1.readUnsignedShort(); // L: 76
			this.frameLengths = new int[var3]; // L: 77

			for (var4 = 0; var4 < var3; ++var4) { // L: 78
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 79

			for (var4 = 0; var4 < var3; ++var4) { // L: 80
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 81
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 83
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 84
			var3 = var1.readUnsignedByte(); // L: 85
			this.field2263 = new int[var3 + 1]; // L: 86

			for (var4 = 0; var4 < var3; ++var4) { // L: 87
				this.field2263[var4] = var1.readUnsignedByte();
			}

			this.field2263[var3] = 9999999; // L: 88
		} else if (var2 == 4) { // L: 90
			this.field2265 = true;
		} else if (var2 == 5) { // L: 91
			this.field2266 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 92
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 93
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 94
			this.field2269 = var1.readUnsignedByte(); // L: 95
			this.field2270 = true; // L: 96
		} else if (var2 == 9) { // L: 98
			this.field2271 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 99
			this.field2273 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 100
			this.field2272 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 101
			var3 = var1.readUnsignedByte(); // L: 102
			this.chatFrameIds = new int[var3]; // L: 103

			for (var4 = 0; var4 < var3; ++var4) { // L: 104
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 105
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else {
			boolean var8;
			boolean var9;
			int var11;
			int var17;
			int var18;
			int var19;
			if (var2 == 13) { // L: 107
				var3 = var1.readUnsignedByte(); // L: 108
				this.field2257 = new class202[var3]; // L: 109

				for (var4 = 0; var4 < var3; ++var4) { // L: 110
					class202 var13;
					class202[] var14;
					label163: {
						var14 = this.field2257; // L: 111
						if (var1 != null) { // L: 115
							var8 = false; // L: 116
							var9 = false; // L: 117
							boolean var10 = false; // L: 118
							var11 = 0; // L: 119
							if (!field2250) { // L: 120
								int var12 = var1.readMedium(); // L: 121
								var19 = var12 & 15; // L: 122
								var17 = var12 >> 8; // L: 123
								var18 = var12 >> 4 & 7; // L: 124
							} else {
								var17 = var1.readUnsignedShort(); // L: 127
								var18 = var1.readUnsignedByte(); // L: 128
								var19 = var1.readUnsignedByte(); // L: 129
								var11 = var1.readUnsignedByte(); // L: 130
							}

							if (var17 >= 1 && var18 >= 1 && var19 >= 0 && var11 >= 0) { // L: 132
								var13 = new class202(var17, var18, var19, var11); // L: 133
								break label163; // L: 134
							}
						}

						var13 = null; // L: 137
					}

					var14[var4] = var13;
				}
			} else if (var2 == 14) { // L: 142
				this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 143
			} else if (var2 == 15) { // L: 145
				var3 = var1.readUnsignedShort(); // L: 146
				this.field2255 = new HashMap(); // L: 147

				for (var4 = 0; var4 < var3; ++var4) { // L: 148
					int var5;
					class202 var6;
					label177: {
						var5 = var1.readUnsignedShort(); // L: 149
						if (var1 != null) { // L: 152
							boolean var7 = false; // L: 153
							var8 = false; // L: 154
							var9 = false; // L: 155
							var19 = 0; // L: 156
							int var16;
							if (!field2250) { // L: 157
								var11 = var1.readMedium(); // L: 158
								var18 = var11 & 15; // L: 159
								var16 = var11 >> 8; // L: 160
								var17 = var11 >> 4 & 7; // L: 161
							} else {
								var16 = var1.readUnsignedShort(); // L: 164
								var17 = var1.readUnsignedByte(); // L: 165
								var18 = var1.readUnsignedByte(); // L: 166
								var19 = var1.readUnsignedByte(); // L: 167
							}

							if (var16 >= 1 && var17 >= 1 && var18 >= 0 && var19 >= 0) { // L: 169
								var6 = new class202(var16, var17, var18, var19); // L: 170
								break label177; // L: 171
							}
						}

						var6 = null; // L: 174
					}

					this.field2255.put(var5, var6); // L: 177
				}
			} else if (var2 == 16) { // L: 180
				this.field2261 = var1.readUnsignedShort(); // L: 181
				this.field2260 = var1.readUnsignedShort(); // L: 182
			} else if (var2 == 17) { // L: 184
				this.field2264 = new boolean[256]; // L: 185

				for (var3 = 0; var3 < this.field2264.length; ++var3) { // L: 186
					this.field2264[var3] = false; // L: 187
				}

				var3 = var1.readUnsignedByte(); // L: 189

				for (var4 = 0; var4 < var3; ++var4) { // L: 190
					this.field2264[var1.readUnsignedByte()] = true; // L: 191
				}
			}
		}

	} // L: 195

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1373764768"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2271 == -1) { // L: 198
			if (this.field2263 == null && this.field2264 == null) { // L: 199
				this.field2271 = 0; // L: 200
			} else {
				this.field2271 = 2;
			}
		}

		if (this.field2273 == -1) { // L: 202
			if (this.field2263 == null && this.field2264 == null) { // L: 203
				this.field2273 = 0; // L: 204
			} else {
				this.field2273 = 2;
			}
		}

	} // L: 206

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "-1346011414"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 209
			var2 = this.frameIds[var2]; // L: 210
			Frames var10 = class332.getFrames(var2 >> 16); // L: 211
			var2 &= 65535; // L: 212
			if (var10 == null) { // L: 213
				return var1.toSharedSequenceModel(true);
			} else {
				Model var9 = var1.toSharedSequenceModel(!var10.hasAlphaTransform(var2)); // L: 214
				var9.animate(var10, var2); // L: 215
				return var9; // L: 216
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 220
			class140 var7 = (class140)SequenceDefinition_cachedModel.get((long)var4); // L: 226
			class140 var6;
			if (var7 != null) { // L: 227
				var6 = var7; // L: 228
			} else {
				var7 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var4, false); // L: 231
				if (var7 != null) { // L: 232
					SequenceDefinition_cachedModel.put(var7, (long)var4);
				}

				var6 = var7; // L: 233
			}

			int var5;
			if (var6 == null) { // L: 236
				var5 = 2; // L: 237
			} else {
				var5 = var6.method3160() ? 0 : 1; // L: 240
			}

			class140 var3;
			if (var5 != 0) { // L: 242
				var3 = null; // L: 243
			} else {
				var7 = (class140)SequenceDefinition_cachedModel.get((long)var4); // L: 248
				if (var7 != null) { // L: 249
					var6 = var7; // L: 250
				} else {
					var7 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var4, false); // L: 253
					if (var7 != null) { // L: 254
						SequenceDefinition_cachedModel.put(var7, (long)var4);
					}

					var6 = var7; // L: 255
				}

				var3 = var6; // L: 257
			}

			if (var3 == null) { // L: 260
				return var1.toSharedSequenceModel(true);
			} else {
				Model var11 = var1.toSharedSequenceModel(!var3.method3156()); // L: 261
				var11.method5694(var3, var2); // L: 262
				return var11; // L: 263
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)Lkz;",
		garbageValue = "1542813033"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 268
			var2 = this.frameIds[var2]; // L: 269
			Frames var11 = class332.getFrames(var2 >> 16); // L: 270
			var2 &= 65535; // L: 271
			if (var11 == null) { // L: 272
				return var1.toSharedSequenceModel(true);
			} else {
				Model var10 = var1.toSharedSequenceModel(!var11.hasAlphaTransform(var2)); // L: 273
				var3 &= 3; // L: 274
				if (var3 == 1) { // L: 275
					var10.rotateY270Ccw();
				} else if (var3 == 2) { // L: 276
					var10.rotateY180();
				} else if (var3 == 3) { // L: 277
					var10.rotateY90Ccw();
				}

				var10.animate(var11, var2); // L: 278
				if (var3 == 1) { // L: 279
					var10.rotateY90Ccw();
				} else if (var3 == 2) { // L: 280
					var10.rotateY180();
				} else if (var3 == 3) { // L: 281
					var10.rotateY270Ccw();
				}

				return var10; // L: 282
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 286
			class140 var8 = (class140)SequenceDefinition_cachedModel.get((long)var5); // L: 292
			class140 var7;
			if (var8 != null) { // L: 293
				var7 = var8; // L: 294
			} else {
				var8 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var5, false); // L: 297
				if (var8 != null) { // L: 298
					SequenceDefinition_cachedModel.put(var8, (long)var5);
				}

				var7 = var8; // L: 299
			}

			int var6;
			if (var7 == null) { // L: 302
				var6 = 2; // L: 303
			} else {
				var6 = var7.method3160() ? 0 : 1; // L: 306
			}

			class140 var4;
			if (var6 != 0) { // L: 308
				var4 = null; // L: 309
			} else {
				var8 = (class140)SequenceDefinition_cachedModel.get((long)var5); // L: 314
				if (var8 != null) { // L: 315
					var7 = var8; // L: 316
				} else {
					var8 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var5, false); // L: 319
					if (var8 != null) { // L: 320
						SequenceDefinition_cachedModel.put(var8, (long)var5);
					}

					var7 = var8; // L: 321
				}

				var4 = var7; // L: 323
			}

			if (var4 == null) { // L: 326
				return var1.toSharedSequenceModel(true);
			} else {
				Model var12 = var1.toSharedSequenceModel(!var4.method3156()); // L: 327
				var3 &= 3; // L: 328
				if (var3 == 1) { // L: 329
					var12.rotateY270Ccw();
				} else if (var3 == 2) { // L: 330
					var12.rotateY180();
				} else if (var3 == 3) { // L: 331
					var12.rotateY90Ccw();
				}

				var12.method5694(var4, var2); // L: 332
				if (var3 == 1) { // L: 333
					var12.rotateY90Ccw();
				} else if (var3 == 2) { // L: 334
					var12.rotateY180();
				} else if (var3 == 3) { // L: 335
					var12.rotateY270Ccw();
				}

				return var12; // L: 336
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "725333832"
	)
	Model method4060(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 341
			var2 = this.frameIds[var2]; // L: 342
			Frames var10 = class332.getFrames(var2 >> 16); // L: 343
			var2 &= 65535; // L: 344
			if (var10 == null) { // L: 345
				return var1.method5704(true);
			} else {
				Model var9 = var1.method5704(!var10.hasAlphaTransform(var2)); // L: 346
				var9.animate(var10, var2); // L: 347
				return var9; // L: 348
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 352
			class140 var7 = (class140)SequenceDefinition_cachedModel.get((long)var4); // L: 358
			class140 var6;
			if (var7 != null) { // L: 359
				var6 = var7; // L: 360
			} else {
				var7 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var4, false); // L: 363
				if (var7 != null) { // L: 364
					SequenceDefinition_cachedModel.put(var7, (long)var4);
				}

				var6 = var7; // L: 365
			}

			int var5;
			if (var6 == null) { // L: 368
				var5 = 2; // L: 369
			} else {
				var5 = var6.method3160() ? 0 : 1; // L: 372
			}

			class140 var3;
			if (var5 != 0) { // L: 374
				var3 = null; // L: 375
			} else {
				var7 = (class140)SequenceDefinition_cachedModel.get((long)var4); // L: 380
				if (var7 != null) { // L: 381
					var6 = var7; // L: 382
				} else {
					var7 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var4, false); // L: 385
					if (var7 != null) { // L: 386
						SequenceDefinition_cachedModel.put(var7, (long)var4);
					}

					var6 = var7; // L: 387
				}

				var3 = var6; // L: 389
			}

			if (var3 == null) { // L: 392
				return var1.method5704(true);
			} else {
				Model var11 = var1.method5704(!var3.method3156()); // L: 393
				var11.method5694(var3, var2); // L: 394
				return var11; // L: 395
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkz;ILhs;II)Lkz;",
		garbageValue = "-2132715747"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2267 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 400
			return this.method4062(var1, var2, var3, var4); // L: 401
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 403
			boolean var6 = false; // L: 404
			Frames var7 = null; // L: 405
			Skeleton var8 = null; // L: 406
			class140 var9;
			if (this.isCachedModelIdSet()) { // L: 407
				var9 = this.method4059(); // L: 408
				if (var9 == null) { // L: 409
					return var5; // L: 410
				}

				if (var3.isCachedModelIdSet() && this.field2264 == null) { // L: 412
					var5.method5694(var9, var2); // L: 413
					return var5; // L: 414
				}

				var8 = var9.field1635; // L: 416
				var5.method5698(var8, var9, var2, this.field2264, false, !var3.isCachedModelIdSet()); // L: 417
			} else {
				var2 = this.frameIds[var2]; // L: 420
				var7 = class332.getFrames(var2 >> 16); // L: 421
				var2 &= 65535; // L: 422
				if (var7 == null) { // L: 423
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2263 == null || var4 == -1)) { // L: 424
					var5.animate(var7, var2); // L: 425
					return var5; // L: 426
				}

				if (this.field2263 == null || var4 == -1) { // L: 428
					var5.animate(var7, var2); // L: 429
					return var5; // L: 430
				}

				var6 = var3.isCachedModelIdSet(); // L: 432
				if (!var6) { // L: 433
					var5.method5699(var7, var2, this.field2263, false); // L: 434
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 437
				var9 = var3.method4059(); // L: 438
				if (var9 == null) { // L: 439
					return var5; // L: 440
				}

				if (var8 == null) { // L: 442
					var8 = var9.field1635; // L: 443
				}

				var5.method5698(var8, var9, var4, this.field2264, true, true); // L: 445
			} else {
				var4 = var3.frameIds[var4]; // L: 448
				Frames var10 = class332.getFrames(var4 >> 16); // L: 449
				var4 &= 65535; // L: 450
				if (var10 == null) { // L: 451
					return this.transformActorModel(var1, var2);
				}

				var5.method5699(var10, var4, this.field2263, true); // L: 452
			}

			if (var6 && var7 != null) { // L: 454
				var5.method5699(var7, var2, this.field2263, false); // L: 455
			}

			var5.resetBounds(); // L: 457
			return var5; // L: 458
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lkz;ILhs;IB)Lkz;",
		garbageValue = "21"
	)
	Model method4062(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 462
		Frames var5 = class332.getFrames(var2 >> 16); // L: 463
		var2 &= 65535; // L: 464
		if (var5 == null) { // L: 465
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 466
			Frames var6 = class332.getFrames(var4 >> 16); // L: 467
			var4 &= 65535; // L: 468
			Model var7;
			if (var6 == null) { // L: 469
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 470
				var7.animate(var5, var2); // L: 471
				return var7; // L: 472
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 474
				var7.animate2(var5, var2, var6, var4, this.field2263); // L: 475
				return var7; // L: 476
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkz;II)Lkz;",
		garbageValue = "-1066115582"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 480
			int var3 = this.frameIds[var2]; // L: 481
			Frames var4 = class332.getFrames(var3 >> 16); // L: 482
			var3 &= 65535; // L: 483
			if (var4 == null) { // L: 484
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 485
				int var6 = 0; // L: 486
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 487
					var6 = this.chatFrameIds[var2]; // L: 488
					var5 = class332.getFrames(var6 >> 16); // L: 489
					var6 &= 65535; // L: 490
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 492
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 497
					var7.animate(var4, var3); // L: 498
					var7.animate(var5, var6); // L: 499
					return var7; // L: 500
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 493
					var7.animate(var4, var3); // L: 494
					return var7; // L: 495
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 503
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-20"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 508
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method4065() {
		return this.field2260 - this.field2261; // L: 512
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lfc;",
		garbageValue = "-1356929050"
	)
	class140 method4059() {
		if (this.isCachedModelIdSet()) { // L: 524
			int var2 = this.SequenceDefinition_cachedModelId; // L: 526
			class140 var5 = (class140)SequenceDefinition_cachedModel.get((long)var2); // L: 532
			class140 var4;
			if (var5 != null) { // L: 533
				var4 = var5; // L: 534
			} else {
				var5 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var2, false); // L: 537
				if (var5 != null) { // L: 538
					SequenceDefinition_cachedModel.put(var5, (long)var2);
				}

				var4 = var5; // L: 539
			}

			int var3;
			if (var4 == null) { // L: 542
				var3 = 2; // L: 543
			} else {
				var3 = var4.method3160() ? 0 : 1; // L: 546
			}

			class140 var1;
			if (var3 != 0) { // L: 548
				var1 = null; // L: 549
			} else {
				var5 = (class140)SequenceDefinition_cachedModel.get((long)var2); // L: 554
				if (var5 != null) { // L: 555
					var4 = var5; // L: 556
				} else {
					var5 = class93.method2440(class135.SequenceDefinition_animationsArchive, class138.SequenceDefinition_skeletonsArchive, var2, false); // L: 559
					if (var5 != null) { // L: 560
						SequenceDefinition_cachedModel.put(var5, (long)var2);
					}

					var4 = var5; // L: 561
				}

				var1 = var4; // L: 563
			}

			return var1; // L: 565
		} else {
			return null; // L: 568
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1088349080"
	)
	public static void method4104() {
		KitDefinition.KitDefinition_cached.clear(); // L: 139
	} // L: 140

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1954725929"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 640
		if (class14.garbageCollector == null || !class14.garbageCollector.isValid()) { // L: 641
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 643

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 644
					if (var2.isValid()) { // L: 646
						class14.garbageCollector = var2; // L: 647
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 648
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 649
					}
				}
			} catch (Throwable var11) { // L: 654
			}
		}

		if (class14.garbageCollector != null) { // L: 656
			long var9 = SecureRandomCallable.method2320(); // L: 657
			long var3 = class14.garbageCollector.getCollectionTime(); // L: 658
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 659
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 660
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 661
				if (0L != var7) { // L: 662
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 664
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 665
		}

		return var0; // L: 667
	}
}
