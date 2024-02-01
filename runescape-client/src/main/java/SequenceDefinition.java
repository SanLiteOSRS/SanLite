import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("am")
	static boolean field2231;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1635263435
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("an")
	public Map field2228;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1045519337
	)
	int field2229;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1909784595
	)
	int field2241;
	@ObfuscatedName("aw")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("az")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("av")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ak")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1609959357
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("as")
	int[] field2236;
	@ObfuscatedName("ab")
	boolean[] field2223;
	@ObfuscatedName("ah")
	public boolean field2238;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1235576383
	)
	public int field2220;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -973083085
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 722601619
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -9981513
	)
	public int field2242;
	@ObfuscatedName("bj")
	public boolean field2235;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2103885911
	)
	public int field2244;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 682714777
	)
	public int field2226;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -10256845
	)
	public int field2246;

	static {
		field2231 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2229 = 0; // L: 29
		this.field2241 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2238 = false; // L: 38
		this.field2220 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2242 = 99; // L: 42
		this.field2235 = false; // L: 43
		this.field2244 = -1; // L: 44
		this.field2226 = -1; // L: 45
		this.field2246 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-442022302"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "668196048"
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
			this.field2236 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2236[var4] = var1.readUnsignedByte();
			}

			this.field2236[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2238 = true;
		} else if (var2 == 5) { // L: 96
			this.field2220 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field2242 = var1.readUnsignedByte(); // L: 100
			this.field2235 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2244 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2226 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2246 = var1.readUnsignedByte();
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
			this.field2228 = new HashMap(); // L: 122

			for (var4 = 0; var4 < var3; ++var4) { // L: 123
				int var5 = var1.readUnsignedShort(); // L: 124
				int var6 = var1.readMedium(); // L: 125
				this.field2228.put(var5, var6); // L: 126
			}
		} else if (var2 == 16) { // L: 129
			this.field2229 = var1.readUnsignedShort(); // L: 130
			this.field2241 = var1.readUnsignedShort(); // L: 131
		} else if (var2 == 17) { // L: 133
			this.field2223 = new boolean[256]; // L: 134

			for (var3 = 0; var3 < this.field2223.length; ++var3) { // L: 135
				this.field2223[var3] = false; // L: 136
			}

			var3 = var1.readUnsignedByte(); // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2223[var1.readUnsignedByte()] = true; // L: 140
			}
		}

	} // L: 144

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-212721931"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2244 == -1) { // L: 147
			if (this.field2236 == null && this.field2223 == null) { // L: 148
				this.field2244 = 0; // L: 149
			} else {
				this.field2244 = 2;
			}
		}

		if (this.field2226 == -1) { // L: 151
			if (this.field2236 == null && this.field2223 == null) { // L: 152
				this.field2226 = 0; // L: 153
			} else {
				this.field2226 = 2;
			}
		}

	} // L: 155

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-1598781637"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 158
			var2 = this.frameIds[var2]; // L: 159
			Frames var8 = class165.getFrames(var2 >> 16); // L: 160
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
			class138 var3;
			if (RouteStrategy.method4508(var4) != 0) { // L: 171
				var3 = null; // L: 172
			} else {
				var3 = class430.method8064(var4); // L: 175
			}

			if (var3 == null) { // L: 178
				return var1.toSharedSequenceModel(true);
			} else {
				Model var6 = var1.toSharedSequenceModel(!var3.method3161()); // L: 179
				var6.method5749(var3, var2); // L: 180
				return var6; // L: 181
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lko;III)Lko;",
		garbageValue = "-1880887547"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		if (!this.isCachedModelIdSet()) { // L: 186
			var2 = this.frameIds[var2]; // L: 187
			Frames var9 = class165.getFrames(var2 >> 16); // L: 188
			var2 &= 65535; // L: 189
			if (var9 == null) { // L: 190
				return var1.toSharedSequenceModel(true);
			} else {
				Model var8 = var1.toSharedSequenceModel(!var9.hasAlphaTransform(var2)); // L: 191
				var3 &= 3; // L: 192
				if (var3 == 1) { // L: 193
					var8.rotateY270Ccw();
				} else if (var3 == 2) { // L: 194
					var8.rotateY180();
				} else if (var3 == 3) { // L: 195
					var8.rotateY90Ccw();
				}

				var8.animate(var9, var2); // L: 196
				if (var3 == 1) { // L: 197
					var8.rotateY90Ccw();
				} else if (var3 == 2) { // L: 198
					var8.rotateY180();
				} else if (var3 == 3) { // L: 199
					var8.rotateY270Ccw();
				}

				return var8; // L: 200
			}
		} else {
			int var5 = this.SequenceDefinition_cachedModelId; // L: 204
			class138 var4;
			if (RouteStrategy.method4508(var5) != 0) { // L: 206
				var4 = null; // L: 207
			} else {
				var4 = class430.method8064(var5); // L: 210
			}

			if (var4 == null) { // L: 213
				return var1.toSharedSequenceModel(true);
			} else {
				Model var7 = var1.toSharedSequenceModel(!var4.method3161()); // L: 214
				var3 &= 3; // L: 215
				if (var3 == 1) { // L: 216
					var7.rotateY270Ccw();
				} else if (var3 == 2) { // L: 217
					var7.rotateY180();
				} else if (var3 == 3) { // L: 218
					var7.rotateY90Ccw();
				}

				var7.method5749(var4, var2); // L: 219
				if (var3 == 1) { // L: 220
					var7.rotateY90Ccw();
				} else if (var3 == 2) { // L: 221
					var7.rotateY180();
				} else if (var3 == 3) { // L: 222
					var7.rotateY270Ccw();
				}

				return var7; // L: 223
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-2038269298"
	)
	Model method4092(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 228
			var2 = this.frameIds[var2]; // L: 229
			Frames var8 = class165.getFrames(var2 >> 16); // L: 230
			var2 &= 65535; // L: 231
			if (var8 == null) { // L: 232
				return var1.method5639(true);
			} else {
				Model var7 = var1.method5639(!var8.hasAlphaTransform(var2)); // L: 233
				var7.animate(var8, var2); // L: 234
				return var7; // L: 235
			}
		} else {
			int var4 = this.SequenceDefinition_cachedModelId; // L: 239
			class138 var3;
			if (RouteStrategy.method4508(var4) != 0) { // L: 241
				var3 = null; // L: 242
			} else {
				var3 = class430.method8064(var4); // L: 245
			}

			if (var3 == null) { // L: 248
				return var1.method5639(true);
			} else {
				Model var6 = var1.method5639(!var3.method3161()); // L: 249
				var6.method5749(var3, var2); // L: 250
				return var6; // L: 251
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lko;ILhl;II)Lko;",
		garbageValue = "677104730"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2231 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 256
			return this.method4076(var1, var2, var3, var4); // L: 257
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 259
			boolean var6 = false; // L: 260
			Frames var7 = null; // L: 261
			Skeleton var8 = null; // L: 262
			class138 var9;
			if (this.isCachedModelIdSet()) { // L: 263
				var9 = this.method4118(); // L: 264
				if (var9 == null) { // L: 265
					return var5; // L: 266
				}

				if (var3.isCachedModelIdSet() && this.field2223 == null) { // L: 268
					var5.method5749(var9, var2); // L: 269
					return var5; // L: 270
				}

				var8 = var9.field1601; // L: 272
				var5.method5650(var8, var9, var2, this.field2223, false, !var3.isCachedModelIdSet()); // L: 273
			} else {
				var2 = this.frameIds[var2]; // L: 276
				var7 = class165.getFrames(var2 >> 16); // L: 277
				var2 &= 65535; // L: 278
				if (var7 == null) { // L: 279
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2236 == null || var4 == -1)) { // L: 280
					var5.animate(var7, var2); // L: 281
					return var5; // L: 282
				}

				if (this.field2236 == null || var4 == -1) { // L: 284
					var5.animate(var7, var2); // L: 285
					return var5; // L: 286
				}

				var6 = var3.isCachedModelIdSet(); // L: 288
				if (!var6) { // L: 289
					var5.method5652(var7, var2, this.field2236, false); // L: 290
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 293
				var9 = var3.method4118(); // L: 294
				if (var9 == null) { // L: 295
					return var5; // L: 296
				}

				if (var8 == null) { // L: 298
					var8 = var9.field1601; // L: 299
				}

				var5.method5650(var8, var9, var4, this.field2223, true, true); // L: 301
			} else {
				var4 = var3.frameIds[var4]; // L: 304
				Frames var10 = class165.getFrames(var4 >> 16); // L: 305
				var4 &= 65535; // L: 306
				if (var10 == null) { // L: 307
					return this.transformActorModel(var1, var2);
				}

				var5.method5652(var10, var4, this.field2236, true); // L: 308
			}

			if (var6 && var7 != null) { // L: 310
				var5.method5652(var7, var2, this.field2236, false); // L: 311
			}

			var5.resetBounds(); // L: 313
			return var5; // L: 314
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lko;ILhl;II)Lko;",
		garbageValue = "863867270"
	)
	Model method4076(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 318
		Frames var5 = class165.getFrames(var2 >> 16); // L: 319
		var2 &= 65535; // L: 320
		if (var5 == null) { // L: 321
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 322
			Frames var6 = class165.getFrames(var4 >> 16); // L: 323
			var4 &= 65535; // L: 324
			Model var7;
			if (var6 == null) { // L: 325
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 326
				var7.animate(var5, var2); // L: 327
				return var7; // L: 328
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 330
				var7.animate2(var5, var2, var6, var4, this.field2236); // L: 331
				return var7; // L: 332
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lko;II)Lko;",
		garbageValue = "-1321918544"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 336
			int var3 = this.frameIds[var2]; // L: 337
			Frames var4 = class165.getFrames(var3 >> 16); // L: 338
			var3 &= 65535; // L: 339
			if (var4 == null) { // L: 340
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 341
				int var6 = 0; // L: 342
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 343
					var6 = this.chatFrameIds[var2]; // L: 344
					var5 = class165.getFrames(var6 >> 16); // L: 345
					var6 &= 65535; // L: 346
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 348
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 353
					var7.animate(var4, var3); // L: 354
					var7.animate(var5, var6); // L: 355
					return var7; // L: 356
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 349
					var7.animate(var4, var3); // L: 350
					return var7; // L: 351
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 359
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-73"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 364
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1536177939"
	)
	public int method4106() {
		return this.field2241 - this.field2229; // L: 368
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lfu;",
		garbageValue = "-2116033712"
	)
	class138 method4118() {
		if (this.isCachedModelIdSet()) { // L: 388
			int var2 = this.SequenceDefinition_cachedModelId; // L: 390
			class138 var1;
			if (RouteStrategy.method4508(var2) != 0) { // L: 392
				var1 = null; // L: 393
			} else {
				var1 = class430.method8064(var2); // L: 396
			}

			return var1; // L: 398
		} else {
			return null; // L: 401
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-173005104"
	)
	static int method4122(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}

	@ObfuscatedName("aq")
	public static int method4123(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 68
	}
}
