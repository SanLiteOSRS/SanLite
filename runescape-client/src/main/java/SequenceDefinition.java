import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("af")
	static boolean field2297;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1238147375
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ao")
	public Map field2311;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -968724615
	)
	int field2285;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1833069719
	)
	int field2298;
	@ObfuscatedName("ag")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("ah")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("av")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("ar")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1363943497
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("as")
	int[] field2304;
	@ObfuscatedName("aj")
	boolean[] field2289;
	@ObfuscatedName("ak")
	public boolean field2306;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1932560049
	)
	public int field2293;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -932726919
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -170018527
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1786137655
	)
	public int field2287;
	@ObfuscatedName("by")
	public boolean field2307;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1069382699
	)
	public int field2312;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1957040329
	)
	public int field2313;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 789159225
	)
	public int field2314;

	static {
		field2297 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2285 = 0; // L: 29
		this.field2298 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2306 = false; // L: 38
		this.field2293 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2287 = 99; // L: 42
		this.field2307 = false; // L: 43
		this.field2312 = -1; // L: 44
		this.field2313 = -1; // L: 45
		this.field2314 = 2; // L: 46
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "1877633819"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsg;IB)V",
		garbageValue = "14"
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
			this.field2304 = new int[var3 + 1]; // L: 91

			for (var4 = 0; var4 < var3; ++var4) { // L: 92
				this.field2304[var4] = var1.readUnsignedByte();
			}

			this.field2304[var3] = 9999999; // L: 93
		} else if (var2 == 4) { // L: 95
			this.field2306 = true;
		} else if (var2 == 5) { // L: 96
			this.field2293 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 97
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 98
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 99
			this.field2287 = var1.readUnsignedByte(); // L: 100
			this.field2307 = true; // L: 101
		} else if (var2 == 9) { // L: 103
			this.field2312 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 104
			this.field2313 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 105
			this.field2314 = var1.readUnsignedByte();
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
			this.field2311 = new HashMap(); // L: 122

			for (var4 = 0; var4 < var3; ++var4) { // L: 123
				int var5 = var1.readUnsignedShort(); // L: 124
				int var6 = var1.readMedium(); // L: 125
				this.field2311.put(var5, var6); // L: 126
			}
		} else if (var2 == 16) { // L: 129
			this.field2285 = var1.readUnsignedShort(); // L: 130
			this.field2298 = var1.readUnsignedShort(); // L: 131
		} else if (var2 == 17) { // L: 133
			this.field2289 = new boolean[256]; // L: 134

			for (var3 = 0; var3 < this.field2289.length; ++var3) { // L: 135
				this.field2289[var3] = false; // L: 136
			}

			var3 = var1.readUnsignedByte(); // L: 138

			for (var4 = 0; var4 < var3; ++var4) { // L: 139
				this.field2289[var1.readUnsignedByte()] = true; // L: 140
			}
		}

	} // L: 144

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974157576"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2312 == -1) { // L: 147
			if (this.field2304 == null && this.field2289 == null) { // L: 148
				this.field2312 = 0; // L: 149
			} else {
				this.field2312 = 2;
			}
		}

		if (this.field2313 == -1) { // L: 151
			if (this.field2304 == null && this.field2289 == null) { // L: 152
				this.field2313 = 0; // L: 153
			} else {
				this.field2313 = 2;
			}
		}

	} // L: 155

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lit;IB)Lit;",
		garbageValue = "-114"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 158
			var2 = this.frameIds[var2]; // L: 159
			Frames var5 = WorldMapID.getFrames(var2 >> 16); // L: 160
			var2 &= 65535; // L: 161
			if (var5 == null) { // L: 162
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 163
				var4.animate(var5, var2); // L: 164
				return var4; // L: 165
			}
		} else {
			class133 var3 = TileItem.method2675(this.SequenceDefinition_cachedModelId); // L: 168
			if (var3 == null) { // L: 169
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3136()); // L: 170
				var4.method4761(var3, var2); // L: 171
				return var4; // L: 172
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lit;III)Lit;",
		garbageValue = "16711935"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 177
			var2 = this.frameIds[var2]; // L: 178
			Frames var6 = WorldMapID.getFrames(var2 >> 16); // L: 179
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
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 186
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
			class133 var4 = TileItem.method2675(this.SequenceDefinition_cachedModelId); // L: 194
			if (var4 == null) { // L: 195
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3136()); // L: 196
				var3 &= 3; // L: 197
				if (var3 == 1) { // L: 198
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 199
					var5.rotateY180();
				} else if (var3 == 3) { // L: 200
					var5.rotateY90Ccw();
				}

				var5.method4761(var4, var2); // L: 201
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lit;II)Lit;",
		garbageValue = "-1926546328"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 210
			var2 = this.frameIds[var2]; // L: 211
			Frames var5 = WorldMapID.getFrames(var2 >> 16); // L: 212
			var2 &= 65535; // L: 213
			if (var5 == null) { // L: 214
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 215
				var4.animate(var5, var2); // L: 216
				return var4; // L: 217
			}
		} else {
			class133 var3 = TileItem.method2675(this.SequenceDefinition_cachedModelId); // L: 220
			if (var3 == null) { // L: 221
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3136()); // L: 222
				var4.method4761(var3, var2); // L: 223
				return var4; // L: 224
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lit;ILha;II)Lit;",
		garbageValue = "1451879882"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2297 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 229
			return this.method4132(var1, var2, var3, var4); // L: 230
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 232
			boolean var6 = false; // L: 233
			Frames var7 = null; // L: 234
			Skeleton var8 = null; // L: 235
			class133 var9;
			if (this.isCachedModelIdSet()) { // L: 236
				var9 = this.method4154(); // L: 237
				if (var9 == null) { // L: 238
					return var5; // L: 239
				}

				if (var3.isCachedModelIdSet() && this.field2289 == null) { // L: 241
					var5.method4761(var9, var2); // L: 242
					return var5; // L: 243
				}

				var8 = var9.field1590; // L: 245
				var5.method4804(var8, var9, var2, this.field2289, false, !var3.isCachedModelIdSet()); // L: 246
			} else {
				var2 = this.frameIds[var2]; // L: 249
				var7 = WorldMapID.getFrames(var2 >> 16); // L: 250
				var2 &= 65535; // L: 251
				if (var7 == null) { // L: 252
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2304 == null || var4 == -1)) { // L: 253
					var5.animate(var7, var2); // L: 254
					return var5; // L: 255
				}

				if (this.field2304 == null || var4 == -1) { // L: 257
					var5.animate(var7, var2); // L: 258
					return var5; // L: 259
				}

				var6 = var3.isCachedModelIdSet(); // L: 261
				if (!var6) { // L: 262
					var5.method4766(var7, var2, this.field2304, false); // L: 263
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 266
				var9 = var3.method4154(); // L: 267
				if (var9 == null) { // L: 268
					return var5; // L: 269
				}

				if (var8 == null) { // L: 271
					var8 = var9.field1590; // L: 272
				}

				var5.method4804(var8, var9, var4, this.field2289, true, true); // L: 274
			} else {
				var4 = var3.frameIds[var4]; // L: 277
				Frames var10 = WorldMapID.getFrames(var4 >> 16); // L: 278
				var4 &= 65535; // L: 279
				if (var10 == null) { // L: 280
					return this.transformActorModel(var1, var2);
				}

				var5.method4766(var10, var4, this.field2304, true); // L: 281
			}

			if (var6 && var7 != null) { // L: 283
				var5.method4766(var7, var2, this.field2304, false); // L: 284
			}

			var5.resetBounds(); // L: 286
			return var5; // L: 287
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lit;ILha;IB)Lit;",
		garbageValue = "52"
	)
	Model method4132(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 291
		Frames var5 = WorldMapID.getFrames(var2 >> 16); // L: 292
		var2 &= 65535; // L: 293
		if (var5 == null) { // L: 294
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 295
			Frames var6 = WorldMapID.getFrames(var4 >> 16); // L: 296
			var4 &= 65535; // L: 297
			Model var7;
			if (var6 == null) { // L: 298
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 299
				var7.animate(var5, var2); // L: 300
				return var7; // L: 301
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 303
				var7.animate2(var5, var2, var6, var4, this.field2304); // L: 304
				return var7; // L: 305
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lit;IB)Lit;",
		garbageValue = "-59"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 309
			int var3 = this.frameIds[var2]; // L: 310
			Frames var4 = WorldMapID.getFrames(var3 >> 16); // L: 311
			var3 &= 65535; // L: 312
			if (var4 == null) { // L: 313
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 314
				int var6 = 0; // L: 315
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 316
					var6 = this.chatFrameIds[var2]; // L: 317
					var5 = WorldMapID.getFrames(var6 >> 16); // L: 318
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1471844378"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 337
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1838545993"
	)
	public int method4135() {
		return this.field2298 - this.field2285; // L: 341
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lfh;",
		garbageValue = "4"
	)
	class133 method4154() {
		return this.isCachedModelIdSet() ? TileItem.method2675(this.SequenceDefinition_cachedModelId) : null; // L: 372 373 376
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "645656657"
	)
	static int method4176(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-726165376"
	)
	static final void method4149(int var0, int var1, int var2, boolean var3) {
		if (SoundSystem.loadInterface(var0)) { // L: 10486
			class135.resizeInterface(VerticalAlignment.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10487
		}
	} // L: 10488
}
