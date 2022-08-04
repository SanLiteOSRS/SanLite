import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("o")
	static boolean field2155;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1880277889
	)
	public static int field2176;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 623530715
	)
	@Export("SequenceDefinition_cachedModelId")
	int SequenceDefinition_cachedModelId;
	@ObfuscatedName("h")
	public Map field2159;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1990276969
	)
	int field2172;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -725076183
	)
	int field2164;
	@ObfuscatedName("n")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("x")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("g")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("p")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 220322921
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("l")
	int[] field2165;
	@ObfuscatedName("y")
	boolean[] field2160;
	@ObfuscatedName("k")
	public boolean field2167;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1807890315
	)
	public int field2168;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1258545031
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -66294021
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1002119731
	)
	public int field2166;
	@ObfuscatedName("i")
	public boolean field2174;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1270638441
	)
	public int field2173;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 855452311
	)
	public int field2156;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1725407875
	)
	public int field2175;

	static {
		field2155 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 21
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 22
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 23
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 24
		this.field2172 = 0; // L: 26
		this.field2164 = 0; // L: 27
		this.frameCount = -1; // L: 32
		this.field2167 = false;
		this.field2168 = 5;
		this.shield = -1;
		this.weapon = -1; // L: 38
		this.field2166 = 99; // L: 39
		this.field2174 = false; // L: 40
		this.field2173 = -1; // L: 41
		this.field2156 = -1; // L: 42
		this.field2175 = 2; // L: 43
	} // L: 45

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 64
			if (var2 == 0) { // L: 65
				return; // L: 68
			}

			this.decodeNext(var1, var2); // L: 66
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1805713737"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 71
			var3 = var1.readUnsignedShort(); // L: 72
			this.frameLengths = new int[var3]; // L: 73

			for (var4 = 0; var4 < var3; ++var4) { // L: 74
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3]; // L: 75

			for (var4 = 0; var4 < var3; ++var4) { // L: 76
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 77
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) { // L: 79
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) { // L: 80
			var3 = var1.readUnsignedByte(); // L: 81
			this.field2165 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2165[var4] = var1.readUnsignedByte();
			}

			this.field2165[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2167 = true;
		} else if (var2 == 5) { // L: 87
			this.field2168 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2166 = var1.readUnsignedByte(); // L: 91
			this.field2174 = true; // L: 92
		} else if (var2 == 9) { // L: 94
			this.field2173 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 95
			this.field2156 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 96
			this.field2175 = var1.readUnsignedByte();
		} else if (var2 == 12) { // L: 97
			var3 = var1.readUnsignedByte(); // L: 98
			this.chatFrameIds = new int[var3]; // L: 99

			for (var4 = 0; var4 < var3; ++var4) { // L: 100
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) { // L: 101
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) { // L: 103
			var3 = var1.readUnsignedByte(); // L: 104
			this.soundEffects = new int[var3]; // L: 105

			for (var4 = 0; var4 < var3; ++var4) { // L: 106
				this.soundEffects[var4] = var1.readMedium();
			}
		} else if (var2 == 14) { // L: 108
			this.SequenceDefinition_cachedModelId = var1.readInt(); // L: 109
		} else if (var2 == 15) { // L: 111
			var3 = var1.readUnsignedShort(); // L: 112
			this.field2159 = new HashMap(); // L: 113

			for (var4 = 0; var4 < var3; ++var4) { // L: 114
				int var5 = var1.readUnsignedShort(); // L: 115
				int var6 = var1.readMedium(); // L: 116
				this.field2159.put(var5, var6); // L: 117
			}
		} else if (var2 == 16) { // L: 120
			this.field2172 = var1.readUnsignedShort(); // L: 121
			this.field2164 = var1.readUnsignedShort(); // L: 122
		} else if (var2 == 17) { // L: 124
			this.field2160 = new boolean[256]; // L: 125

			for (var3 = 0; var3 < this.field2160.length; ++var3) { // L: 126
				this.field2160[var3] = false; // L: 127
			}

			var3 = var1.readUnsignedByte(); // L: 129

			for (var4 = 0; var4 < var3; ++var4) { // L: 130
				this.field2160[var1.readUnsignedByte()] = true; // L: 131
			}
		}

	} // L: 135

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2072822091"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2173 == -1) { // L: 138
			if (this.field2165 == null && this.field2160 == null) { // L: 139
				this.field2173 = 0; // L: 140
			} else {
				this.field2173 = 2;
			}
		}

		if (this.field2156 == -1) { // L: 142
			if (this.field2165 == null && this.field2160 == null) { // L: 143
				this.field2156 = 0; // L: 144
			} else {
				this.field2156 = 2;
			}
		}

	} // L: 146

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lhd;II)Lhd;",
		garbageValue = "-519779474"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 149
			var2 = this.frameIds[var2]; // L: 150
			Frames var5 = class143.getFrames(var2 >> 16); // L: 151
			var2 &= 65535; // L: 152
			if (var5 == null) { // L: 153
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 154
				var4.animate(var5, var2); // L: 155
				return var4; // L: 156
			}
		} else {
			class122 var3 = class282.method5493(this.SequenceDefinition_cachedModelId); // L: 159
			if (var3 == null) { // L: 160
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2828()); // L: 161
				var4.method4372(var3, var2); // L: 162
				return var4; // L: 163
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lhd;III)Lhd;",
		garbageValue = "1864568782"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 168
			var2 = this.frameIds[var2]; // L: 169
			Frames var6 = class143.getFrames(var2 >> 16); // L: 170
			var2 &= 65535; // L: 171
			if (var6 == null) { // L: 172
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var6.hasAlphaTransform(var2)); // L: 173
				var3 &= 3; // L: 174
				if (var3 == 1) { // L: 175
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 176
					var5.rotateY180();
				} else if (var3 == 3) {
					var5.rotateY90Ccw(); // L: 177
				}

				var5.animate(var6, var2); // L: 178
				if (var3 == 1) { // L: 179
					var5.rotateY90Ccw();
				} else if (var3 == 2) { // L: 180
					var5.rotateY180();
				} else if (var3 == 3) { // L: 181
					var5.rotateY270Ccw();
				}

				return var5; // L: 182
			}
		} else {
			class122 var4 = class282.method5493(this.SequenceDefinition_cachedModelId); // L: 185
			if (var4 == null) { // L: 186
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2828()); // L: 187
				var3 &= 3; // L: 188
				if (var3 == 1) { // L: 189
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 190
					var5.rotateY180();
				} else if (var3 == 3) { // L: 191
					var5.rotateY90Ccw();
				}

				var5.method4372(var4, var2); // L: 192
				if (var3 == 1) { // L: 193
					var5.rotateY90Ccw();
				} else if (var3 == 2) {
					var5.rotateY180(); // L: 194
				} else if (var3 == 3) { // L: 195
					var5.rotateY270Ccw();
				}

				return var5; // L: 196
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lhd;II)Lhd;",
		garbageValue = "-2075457680"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 201
			var2 = this.frameIds[var2]; // L: 202
			Frames var5 = class143.getFrames(var2 >> 16); // L: 203
			var2 &= 65535; // L: 204
			if (var5 == null) { // L: 205
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 206
				var4.animate(var5, var2); // L: 207
				return var4; // L: 208
			}
		} else {
			class122 var3 = class282.method5493(this.SequenceDefinition_cachedModelId); // L: 211
			if (var3 == null) { // L: 212
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2828()); // L: 213
				var4.method4372(var3, var2); // L: 214
				return var4; // L: 215
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lhd;ILgc;IB)Lhd;",
		garbageValue = "-10"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2155 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 220
			return this.method3809(var1, var2, var3, var4); // L: 221
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 223
			boolean var6 = false; // L: 224
			Frames var7 = null; // L: 225
			Skeleton var8 = null; // L: 226
			class122 var9;
			if (this.isCachedModelIdSet()) { // L: 227
				var9 = this.method3801(); // L: 228
				if (var9 == null) { // L: 229
					return var5; // L: 230
				}

				if (var3.isCachedModelIdSet() && this.field2160 == null) { // L: 232
					var5.method4372(var9, var2); // L: 233
					return var5; // L: 234
				}

				var8 = var9.field1498; // L: 236
				var5.method4352(var8, var9, var2, this.field2160, false, !var3.isCachedModelIdSet()); // L: 237
			} else {
				var2 = this.frameIds[var2]; // L: 240
				var7 = class143.getFrames(var2 >> 16); // L: 241
				var2 &= 65535; // L: 242
				if (var7 == null) { // L: 243
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2165 == null || var4 == -1)) { // L: 244
					var5.animate(var7, var2); // L: 245
					return var5; // L: 246
				}

				if (this.field2165 == null || var4 == -1) { // L: 248
					var5.animate(var7, var2); // L: 249
					return var5; // L: 250
				}

				var6 = var3.isCachedModelIdSet(); // L: 252
				if (!var6) { // L: 253
					var5.method4441(var7, var2, this.field2165, false); // L: 254
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 257
				var9 = var3.method3801(); // L: 258
				if (var9 == null) { // L: 259
					return var5; // L: 260
				}

				if (var8 == null) { // L: 262
					var8 = var9.field1498; // L: 263
				}

				var5.method4352(var8, var9, var4, this.field2160, true, true); // L: 265
			} else {
				var4 = var3.frameIds[var4]; // L: 268
				Frames var10 = class143.getFrames(var4 >> 16); // L: 269
				var4 &= 65535; // L: 270
				if (var10 == null) { // L: 271
					return this.transformActorModel(var1, var2);
				}

				var5.method4441(var10, var4, this.field2165, true); // L: 272
			}

			if (var6 && var7 != null) { // L: 274
				var5.method4441(var7, var2, this.field2165, false); // L: 275
			}

			var5.resetBounds(); // L: 277
			return var5; // L: 278
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lhd;ILgc;II)Lhd;",
		garbageValue = "-132918024"
	)
	Model method3809(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 282
		Frames var5 = class143.getFrames(var2 >> 16); // L: 283
		var2 &= 65535; // L: 284
		if (var5 == null) { // L: 285
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 286
			Frames var6 = class143.getFrames(var4 >> 16); // L: 287
			var4 &= 65535; // L: 288
			Model var7;
			if (var6 == null) { // L: 289
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 290
				var7.animate(var5, var2); // L: 291
				return var7; // L: 292
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 294
				var7.animate2(var5, var2, var6, var4, this.field2165); // L: 295
				return var7; // L: 296
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lhd;IB)Lhd;",
		garbageValue = "-115"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 300
			int var3 = this.frameIds[var2]; // L: 301
			Frames var4 = class143.getFrames(var3 >> 16); // L: 302
			var3 &= 65535; // L: 303
			if (var4 == null) { // L: 304
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 305
				int var6 = 0; // L: 306
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 307
					var6 = this.chatFrameIds[var2]; // L: 308
					var5 = class143.getFrames(var6 >> 16); // L: 309
					var6 &= 65535; // L: 310
				}

				Model var7;
				if (var5 != null && var6 != 65535) { // L: 312
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6)); // L: 317
					var7.animate(var4, var3); // L: 318
					var7.animate(var5, var6); // L: 319
					return var7; // L: 320
				} else {
					var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3)); // L: 313
					var7.animate(var4, var3); // L: 314
					return var7; // L: 315
				}
			}
		} else {
			return this.transformActorModel(var1, var2); // L: 323
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "678280636"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 328
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "180"
	)
	public int method3812() {
		return this.field2164 - this.field2172; // L: 332
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ldj;",
		garbageValue = "-2065576976"
	)
	class122 method3801() {
		return this.isCachedModelIdSet() ? class282.method5493(this.SequenceDefinition_cachedModelId) : null; // L: 344 345 348
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldk;",
		garbageValue = "-1004740067"
	)
	static class118 method3854(int var0) {
		class118 var1 = (class118)class271.findEnumerated(Script.method2024(), var0); // L: 35
		if (var1 == null) {
			var1 = class118.field1462; // L: 36
		}

		return var1; // L: 37
	}
}
