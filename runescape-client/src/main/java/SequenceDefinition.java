import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("h")
	static boolean field2302;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("SequenceDefinition_cachedModel")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -407314397
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("u")
	public Map field2283;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1363129383
	)
	int field2299;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 882940487
	)
	int field2285;
	@ObfuscatedName("g")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("i")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("o")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("n")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2135707529
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("a")
	int[] field2291;
	@ObfuscatedName("s")
	boolean[] field2292;
	@ObfuscatedName("l")
	public boolean field2281;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1831885199
	)
	public int field2300;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1340317649
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1154134933
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1794667521
	)
	public int field2301;
	@ObfuscatedName("y")
	public boolean field2298;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1085888001
	)
	public int field2290;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -746157259
	)
	public int field2284;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1460955579
	)
	public int field2276;

	static {
		field2302 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 21
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 22
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 23
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 24
		this.field2299 = 0; // L: 26
		this.field2285 = 0; // L: 27
		this.frameCount = -1; // L: 32
		this.field2281 = false; // L: 35
		this.field2300 = 5; // L: 36
		this.shield = -1; // L: 37
		this.weapon = -1; // L: 38
		this.field2301 = 99; // L: 39
		this.field2298 = false;
		this.field2290 = -1;
		this.field2284 = -1;
		this.field2276 = 2; // L: 43
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-2110484685"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 70
			if (var2 == 0) { // L: 71
				return; // L: 74
			}

			this.decodeNext(var1, var2); // L: 72
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "80993823"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 77
			var3 = var1.readUnsignedShort(); // L: 78
			this.frameLengths = new int[var3]; // L: 79

			for (var4 = 0; var4 < var3; ++var4) { // L: 80
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 81

			for (var4 = 0; var4 < var3; ++var4) { // L: 82
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 85
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 86
			var3 = var1.readUnsignedByte(); // L: 87
			this.field2291 = new int[var3 + 1]; // L: 88

			for (var4 = 0; var4 < var3; ++var4) { // L: 89
				this.field2291[var4] = var1.readUnsignedByte();
			}

			this.field2291[var3] = 9999999; // L: 90
		} else if (var2 == 4) { // L: 92
			this.field2281 = true;
		} else if (var2 == 5) { // L: 93
			this.field2300 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 94
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 95
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 96
			this.field2301 = var1.readUnsignedByte(); // L: 97
			this.field2298 = true; // L: 98
		} else if (var2 == 9) { // L: 100
			this.field2290 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 101
			this.field2284 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 102
			this.field2276 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 103
			var3 = var1.readUnsignedByte(); // L: 104
			this.chatFrameIds = new int[var3]; // L: 105

			for (var4 = 0; var4 < var3; ++var4) { // L: 106
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 107
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 109
			var3 = var1.readUnsignedByte(); // L: 110
			this.soundEffects = new int[var3]; // L: 111

			for (var4 = 0; var4 < var3; ++var4) { // L: 112
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 114
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 115
		} else if (var2 == 15) { // L: 117
			var3 = var1.readUnsignedShort(); // L: 118
			this.field2283 = new HashMap(); // L: 119

			for (var4 = 0; var4 < var3; ++var4) { // L: 120
				int var5 = var1.readUnsignedShort(); // L: 121
				int var6 = var1.readMedium(); // L: 122
				this.field2283.put(var5, var6); // L: 123
			}
		} else if (var2 == 16) { // L: 126
			this.field2299 = var1.readUnsignedShort(); // L: 127
			this.field2285 = var1.readUnsignedShort(); // L: 128
		} else if (var2 == 17) { // L: 130
			this.field2292 = new boolean[256]; // L: 131

			for (var3 = 0; var3 < this.field2292.length; ++var3) { // L: 132
				this.field2292[var3] = false; // L: 133
			}

			var3 = var1.readUnsignedByte(); // L: 135

			for (var4 = 0; var4 < var3; ++var4) { // L: 136
				this.field2292[var1.readUnsignedByte()] = true; // L: 137
			}
		}

	} // L: 141

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "746372140"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2290 == -1) { // L: 144
			if (this.field2291 == null && this.field2292 == null) { // L: 145
				this.field2290 = 0; // L: 146
			} else {
				this.field2290 = 2;
			}
		}

		if (this.field2284 == -1) { // L: 148
			if (this.field2291 == null && this.field2292 == null) { // L: 149
				this.field2284 = 0; // L: 150
			} else {
				this.field2284 = 2;
			}
		}

	} // L: 152

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lhh;II)Lhh;",
		garbageValue = "-292484261"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 155
			var2 = this.frameIds[var2]; // L: 156
			Frames var5 = SecureRandomCallable.getFrames(var2 >> 16); // L: 157
			var2 &= 65535; // L: 158
			if (var5 == null) { // L: 159
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 160
				var4.animate(var5, var2); // L: 161
				return var4; // L: 162
			}
		} else {
			class130 var3 = Login.method2096(this.SequenceDefinition_cachedModelId); // L: 165
			if (var3 == null) { // L: 166
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method3005()); // L: 167
				var4.method4713(var3, var2); // L: 168
				return var4; // L: 169
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhh;III)Lhh;",
		garbageValue = "1558211812"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 174
			var2 = this.frameIds[var2]; // L: 175
			Frames var6 = SecureRandomCallable.getFrames(var2 >> 16); // L: 176
			var2 &= 65535; // L: 177
			if (var6 == null) { // L: 178
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 179
				var3 &= 3; // L: 180
				if (var3 == 1) { // L: 181
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 182
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 183
				}

				var5.animate(var6, var2); // L: 184
				if (var3 == 1) { // L: 185
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 186
					var5.rotateY180();
				} else if (var3 == 3) { // L: 187
					var5.rotateY270Ccw();
				}

				return var5; // L: 188
			}
		} else {
			class130 var4 = Login.method2096(this.SequenceDefinition_cachedModelId); // L: 191
			if (var4 == null) { // L: 192
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method3005()); // L: 193
				var3 &= 3; // L: 194
				if (var3 == 1) { // L: 195
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 196
					var5.rotateY180();
				} else if (var3 == 3) { // L: 197
					var5.rotateY90Ccw();
				}

				var5.method4713(var4, var2); // L: 198
				if (var3 == 1) { // L: 199
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 200
					var5.rotateY180();
				} else if (var3 == 3) { // L: 201
					var5.rotateY270Ccw();
				}

				return var5; // L: 202
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lhh;II)Lhh;",
		garbageValue = "-168718404"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 207
			var2 = this.frameIds[var2]; // L: 208
			Frames var5 = SecureRandomCallable.getFrames(var2 >> 16); // L: 209
			var2 &= 65535; // L: 210
			if (var5 == null) { // L: 211
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 212
				var4.animate(var5, var2); // L: 213
				return var4; // L: 214
			}
		} else {
			class130 var3 = Login.method2096(this.SequenceDefinition_cachedModelId); // L: 217
			if (var3 == null) { // L: 218
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method3005()); // L: 219
				var4.method4713(var3, var2); // L: 220
				return var4; // L: 221
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhh;ILga;IB)Lhh;",
		garbageValue = "28"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2302 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 226
			return this.method4030(var1, var2, var3, var4); // L: 227
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 229
			boolean var6 = false; // L: 230
			Frames var7 = null; // L: 231
			Skeleton var8 = null; // L: 232
			class130 var9;
			if (this.isCachedModelIdSet()) {
				var9 = this.method4025();
				if (var9 == null) {
					return var5;
				}

				if (var3.isCachedModelIdSet() && this.field2292 == null) {
					var5.method4713(var9, var2);
					return var5; // L: 240
				}

				var8 = var9.field1603; // L: 242
				var5.method4738(var8, var9, var2, this.field2292, false, !var3.isCachedModelIdSet()); // L: 243
			} else {
				var2 = this.frameIds[var2]; // L: 246
				var7 = SecureRandomCallable.getFrames(var2 >> 16); // L: 247
				var2 &= 65535; // L: 248
				if (var7 == null) { // L: 249
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2291 == null || var4 == -1)) { // L: 250
					var5.animate(var7, var2); // L: 251
					return var5; // L: 252
				}

				if (this.field2291 == null || var4 == -1) { // L: 254
					var5.animate(var7, var2); // L: 255
					return var5; // L: 256
				}

				var6 = var3.isCachedModelIdSet(); // L: 258
				if (!var6) { // L: 259
					var5.method4674(var7, var2, this.field2291, false); // L: 260
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 263
				var9 = var3.method4025(); // L: 264
				if (var9 == null) { // L: 265
					return var5; // L: 266
				}

				if (var8 == null) { // L: 268
					var8 = var9.field1603; // L: 269
				}

				var5.method4738(var8, var9, var4, this.field2292, true, true); // L: 271
			} else {
				var4 = var3.frameIds[var4]; // L: 274
				Frames var10 = SecureRandomCallable.getFrames(var4 >> 16); // L: 275
				var4 &= 65535; // L: 276
				if (var10 == null) { // L: 277
					return this.transformActorModel(var1, var2);
				}

				var5.method4674(var10, var4, this.field2291, true); // L: 278
			}

			if (var6 && var7 != null) { // L: 280
				var5.method4674(var7, var2, this.field2291, false); // L: 281
			}

			var5.resetBounds(); // L: 283
			return var5; // L: 284
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lhh;ILga;II)Lhh;",
		garbageValue = "1307679838"
	)
	Model method4030(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 288
		Frames var5 = SecureRandomCallable.getFrames(var2 >> 16); // L: 289
		var2 &= 65535; // L: 290
		if (var5 == null) { // L: 291
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 292
			Frames var6 = SecureRandomCallable.getFrames(var4 >> 16); // L: 293
			var4 &= 65535; // L: 294
			Model var7;
			if (var6 == null) { // L: 295
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 296
				var7.animate(var5, var2); // L: 297
				return var7; // L: 298
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 300
				var7.animate2(var5, var2, var6, var4, this.field2291); // L: 301
				return var7; // L: 302
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhh;II)Lhh;",
		garbageValue = "128420513"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 306
			int var3 = this.frameIds[var2]; // L: 307
			Frames var4 = SecureRandomCallable.getFrames(var3 >> 16); // L: 308
			var3 &= 65535; // L: 309
			if (var4 == null) { // L: 310
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 311
				int var6 = 0; // L: 312
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 313
					var6 = this.chatFrameIds[var2]; // L: 314
					var5 = SecureRandomCallable.getFrames(var6 >> 16); // L: 315
					var6 &= 65535; // L: 316
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 318
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 323
					var7.animate(var4, var3); // L: 324
					var7.animate(var5, var6); // L: 325
					return var7; // L: 326
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 319
					var7.animate(var4, var3); // L: 320
					return var7; // L: 321
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 329
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2096381759"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 334
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	public int method4024() {
		return this.field2285 - this.field2299; // L: 338
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lew;",
		garbageValue = "-1717186294"
	)
	class130 method4025() {
		return this.isCachedModelIdSet() ? Login.method2096(this.SequenceDefinition_cachedModelId) : null; // L: 379 380 383
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;Lly;Lly;I)V",
		garbageValue = "-1993472449"
	)
	public static void method4063(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		class422.Widget_archive = var0; // L: 233
		Widget.field3531 = var1; // L: 234
		Widget.Widget_spritesArchive = var2; // L: 235
		PacketBufferNode.Widget_fontsArchive = var3; // L: 236
		class71.Widget_interfaceComponents = new Widget[class422.Widget_archive.getGroupCount()][]; // L: 237
		Language.Widget_loadedInterfaces = new boolean[class422.Widget_archive.getGroupCount()]; // L: 238
	} // L: 239

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lly;III)[Lrx;",
		garbageValue = "1693404332"
	)
	public static SpritePixels[] method4064(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 40
		boolean var3;
		if (var4 == null) { // L: 41
			var3 = false; // L: 42
		} else {
			VarpDefinition.SpriteBuffer_decode(var4); // L: 45
			var3 = true; // L: 46
		}

		return !var3 ? null : class374.method7318(); // L: 48 49
	}
}
