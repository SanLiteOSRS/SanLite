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
	@ObfuscatedName("aj")
	static boolean field2270;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -116697075
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("ax")
	public Map field2273;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1611094419
	)
	int field2259;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -399381697
	)
	int field2260;
	@ObfuscatedName("am")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("az")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("ae")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("au")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1094970191
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("at")
	int[] field2266;
	@ObfuscatedName("af")
	boolean[] field2267;
	@ObfuscatedName("ai")
	public boolean field2268;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -949116119
	)
	public int field2269;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -638480153
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 762216371
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1388097267
	)
	public int field2261;
	@ObfuscatedName("bm")
	public boolean field2272;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1681358687
	)
	public int field2277;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1977046449
	)
	public int field2255;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -93498907
	)
	public int field2276;

	static {
		field2270 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 24
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 25
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 26
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 27
		this.field2259 = 0; // L: 29
		this.field2260 = 0; // L: 30
		this.frameCount = -1; // L: 35
		this.field2268 = false; // L: 38
		this.field2269 = 5; // L: 39
		this.shield = -1; // L: 40
		this.weapon = -1; // L: 41
		this.field2261 = 99; // L: 42
		this.field2272 = false; // L: 43
		this.field2277 = -1; // L: 44
		this.field2255 = -1; // L: 45
		this.field2276 = 2; // L: 46
	} // L: 48

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "-94"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-1653065285"
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
			this.field2266 = new int[var3 + 1]; // L: 85

			for (var4 = 0; var4 < var3; ++var4) { // L: 86
				this.field2266[var4] = var1.readUnsignedByte();
			}

			this.field2266[var3] = 9999999; // L: 87
		} else if (var2 == 4) { // L: 89
			this.field2268 = true;
		} else if (var2 == 5) { // L: 90
			this.field2269 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 91
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 92
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 93
			this.field2261 = var1.readUnsignedByte(); // L: 94
			this.field2272 = true; // L: 95
		} else if (var2 == 9) { // L: 97
			this.field2277 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 98
			this.field2255 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 99
			this.field2276 = var1.readUnsignedByte();
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
			this.field2273 = new HashMap(); // L: 116

			for (var4 = 0; var4 < var3; ++var4) { // L: 117
				int var5 = var1.readUnsignedShort(); // L: 118
				int var6 = var1.readMedium(); // L: 119
				this.field2273.put(var5, var6); // L: 120
			}
		} else if (var2 == 16) { // L: 123
			this.field2259 = var1.readUnsignedShort(); // L: 124
			this.field2260 = var1.readUnsignedShort(); // L: 125
		} else if (var2 == 17) { // L: 127
			this.field2267 = new boolean[256]; // L: 128

			for (var3 = 0; var3 < this.field2267.length; ++var3) { // L: 129
				this.field2267[var3] = false; // L: 130
			}

			var3 = var1.readUnsignedByte(); // L: 132

			for (var4 = 0; var4 < var3; ++var4) { // L: 133
				this.field2267[var1.readUnsignedByte()] = true; // L: 134
			}
		}

	} // L: 138

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2277 == -1) { // L: 141
			if (this.field2266 == null && this.field2267 == null) { // L: 142
				this.field2277 = 0; // L: 143
			} else {
				this.field2277 = 2;
			}
		}

		if (this.field2255 == -1) { // L: 145
			if (this.field2266 == null && this.field2267 == null) { // L: 146
				this.field2255 = 0; // L: 147
			} else {
				this.field2255 = 2;
			}
		}

	} // L: 149

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lix;II)Lix;",
		garbageValue = "-1277891900"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 152
			var2 = this.frameIds[var2]; // L: 153
			Frames var5 = VarbitComposition.getFrames(var2 >> 16); // L: 154
			var2 &= 65535; // L: 155
			if (var5 == null) { // L: 156
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 157
				var4.animate(var5, var2); // L: 158
				return var4; // L: 159
			}
		} else {
			class134 var3 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId); // L: 162
			if (var3 == null) { // L: 163
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3043()); // L: 164
				var4.method4603(var3, var2); // L: 165
				return var4; // L: 166
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lix;IIB)Lix;",
		garbageValue = "5"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 171
			var2 = this.frameIds[var2]; // L: 172
			Frames var6 = VarbitComposition.getFrames(var2 >> 16); // L: 173
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
			class134 var4 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId); // L: 188
			if (var4 == null) { // L: 189
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3043()); // L: 190
				var3 &= 3; // L: 191
				if (var3 == 1) { // L: 192
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 193
					var5.rotateY180();
				} else if (var3 == 3) { // L: 194
					var5.rotateY90Ccw();
				}

				var5.method4603(var4, var2); // L: 195
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lix;II)Lix;",
		garbageValue = "484101201"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 204
			var2 = this.frameIds[var2]; // L: 205
			Frames var5 = VarbitComposition.getFrames(var2 >> 16); // L: 206
			var2 &= 65535; // L: 207
			if (var5 == null) { // L: 208
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 209
				var4.animate(var5, var2); // L: 210
				return var4; // L: 211
			}
		} else {
			class134 var3 = TaskHandler.method3458(this.SequenceDefinition_cachedModelId); // L: 214
			if (var3 == null) { // L: 215
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3043()); // L: 216
				var4.method4603(var3, var2); // L: 217
				return var4; // L: 218
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lix;ILhx;IS)Lix;",
		garbageValue = "223"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2270 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 223
			return this.method4006(var1, var2, var3, var4); // L: 224
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 226
			boolean var6 = false; // L: 227
			Frames var7 = null; // L: 228
			Skeleton var8 = null; // L: 229
			class134 var9;
			if (this.isCachedModelIdSet()) { // L: 230
				var9 = this.method4016(); // L: 231
				if (var9 == null) { // L: 232
					return var5; // L: 233
				}

				if (var3.isCachedModelIdSet() && this.field2267 == null) { // L: 235
					var5.method4603(var9, var2); // L: 236
					return var5; // L: 237
				}

				var8 = var9.field1570; // L: 239
				var5.method4639(var8, var9, var2, this.field2267, false, !var3.isCachedModelIdSet()); // L: 240
			} else {
				var2 = this.frameIds[var2]; // L: 243
				var7 = VarbitComposition.getFrames(var2 >> 16); // L: 244
				var2 &= 65535; // L: 245
				if (var7 == null) { // L: 246
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2266 == null || var4 == -1)) { // L: 247
					var5.animate(var7, var2); // L: 248
					return var5; // L: 249
				}

				if (this.field2266 == null || var4 == -1) { // L: 251
					var5.animate(var7, var2); // L: 252
					return var5; // L: 253
				}

				var6 = var3.isCachedModelIdSet(); // L: 255
				if (!var6) { // L: 256
					var5.method4617(var7, var2, this.field2266, false); // L: 257
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 260
				var9 = var3.method4016(); // L: 261
				if (var9 == null) { // L: 262
					return var5; // L: 263
				}

				if (var8 == null) { // L: 265
					var8 = var9.field1570; // L: 266
				}

				var5.method4639(var8, var9, var4, this.field2267, true, true); // L: 268
			} else {
				var4 = var3.frameIds[var4]; // L: 271
				Frames var10 = VarbitComposition.getFrames(var4 >> 16); // L: 272
				var4 &= 65535; // L: 273
				if (var10 == null) { // L: 274
					return this.transformActorModel(var1, var2);
				}

				var5.method4617(var10, var4, this.field2266, true); // L: 275
			}

			if (var6 && var7 != null) { // L: 277
				var5.method4617(var7, var2, this.field2266, false); // L: 278
			}

			var5.resetBounds(); // L: 280
			return var5; // L: 281
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lix;ILhx;II)Lix;",
		garbageValue = "-1108712217"
	)
	Model method4006(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 285
		Frames var5 = VarbitComposition.getFrames(var2 >> 16); // L: 286
		var2 &= 65535; // L: 287
		if (var5 == null) { // L: 288
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 289
			Frames var6 = VarbitComposition.getFrames(var4 >> 16); // L: 290
			var4 &= 65535; // L: 291
			Model var7;
			if (var6 == null) { // L: 292
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 293
				var7.animate(var5, var2); // L: 294
				return var7; // L: 295
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 297
				var7.animate2(var5, var2, var6, var4, this.field2266); // L: 298
				return var7; // L: 299
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lix;II)Lix;",
		garbageValue = "193586456"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 303
			int var3 = this.frameIds[var2]; // L: 304
			Frames var4 = VarbitComposition.getFrames(var3 >> 16); // L: 305
			var3 &= 65535; // L: 306
			if (var4 == null) { // L: 307
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 308
				int var6 = 0; // L: 309
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 310
					var6 = this.chatFrameIds[var2]; // L: 311
					var5 = VarbitComposition.getFrames(var6 >> 16); // L: 312
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-343581928"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 331
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1289109169"
	)
	public int method4015() {
		return this.field2260 - this.field2259; // L: 335
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lfl;",
		garbageValue = "1383539197"
	)
	class134 method4016() {
		return this.isCachedModelIdSet() ? TaskHandler.method3458(this.SequenceDefinition_cachedModelId) : null; // L: 347 348 351
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method4012(int var0) {
		return class435.field4650[var0 & 16383]; // L: 28
	}
}
