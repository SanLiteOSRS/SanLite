import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("a")
	static boolean field2230;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("SequenceDefinition_cached")
	static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("SequenceDefinition_cachedFrames")
	static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("SequenceDefinition_cachedModel")
	static EvictingDualNodeHashTable SequenceDefinition_cachedModel;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 676867587
	)
	@Export("SequenceDefinition_cachedModelId")
	public int SequenceDefinition_cachedModelId;
	@ObfuscatedName("n")
	public Map field2214;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -660948097
	)
	int field2207;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1915837811
	)
	int field2216;
	@ObfuscatedName("s")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("p")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("b")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("o")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -544051619
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("z")
	int[] field2222;
	@ObfuscatedName("t")
	boolean[] field2223;
	@ObfuscatedName("w")
	public boolean field2224;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1913234535
	)
	public int field2225;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1522102509
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1707428897
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 127455917
	)
	public int field2228;
	@ObfuscatedName("g")
	public boolean field2227;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1958786829
	)
	public int field2221;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1804859823
	)
	public int field2211;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1921469993
	)
	public int field2232;

	static {
		field2230 = false; // L: 17
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64); // L: 21
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100); // L: 22
		SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100); // L: 23
	}

	SequenceDefinition() {
		this.SequenceDefinition_cachedModelId = -1; // L: 24
		this.field2207 = 0; // L: 26
		this.field2216 = 0; // L: 27
		this.frameCount = -1; // L: 32
		this.field2224 = false; // L: 35
		this.field2225 = 5; // L: 36
		this.shield = -1; // L: 37
		this.weapon = -1; // L: 38
		this.field2228 = 99; // L: 39
		this.field2227 = false; // L: 40
		this.field2221 = -1; // L: 41
		this.field2211 = -1; // L: 42
		this.field2232 = 2; // L: 43
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-78830429"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqr;II)V",
		garbageValue = "454545126"
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
			this.field2222 = new int[var3 + 1]; // L: 82

			for (var4 = 0; var4 < var3; ++var4) { // L: 83
				this.field2222[var4] = var1.readUnsignedByte();
			}

			this.field2222[var3] = 9999999; // L: 84
		} else if (var2 == 4) { // L: 86
			this.field2224 = true;
		} else if (var2 == 5) { // L: 87
			this.field2225 = var1.readUnsignedByte();
		} else if (var2 == 6) { // L: 88
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 89
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) { // L: 90
			this.field2228 = var1.readUnsignedByte(); // L: 91
			this.field2227 = true; // L: 92
		} else if (var2 == 9) { // L: 94
			this.field2221 = var1.readUnsignedByte();
		} else if (var2 == 10) { // L: 95
			this.field2211 = var1.readUnsignedByte();
		} else if (var2 == 11) { // L: 96
			this.field2232 = var1.readUnsignedByte();
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
			this.field2214 = new HashMap(); // L: 113

			for (var4 = 0; var4 < var3; ++var4) { // L: 114
				int var5 = var1.readUnsignedShort(); // L: 115
				int var6 = var1.readMedium(); // L: 116
				this.field2214.put(var5, var6); // L: 117
			}
		} else if (var2 == 16) { // L: 120
			this.field2207 = var1.readUnsignedShort(); // L: 121
			this.field2216 = var1.readUnsignedShort(); // L: 122
		} else if (var2 == 17) { // L: 124
			this.field2223 = new boolean[256]; // L: 125

			for (var3 = 0; var3 < this.field2223.length; ++var3) { // L: 126
				this.field2223[var3] = false; // L: 127
			}

			var3 = var1.readUnsignedByte(); // L: 129

			for (var4 = 0; var4 < var3; ++var4) { // L: 130
				this.field2223[var1.readUnsignedByte()] = true; // L: 131
			}
		}

	} // L: 135

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-852175246"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field2221 == -1) { // L: 138
			if (this.field2222 == null && this.field2223 == null) { // L: 139
				this.field2221 = 0; // L: 140
			} else {
				this.field2221 = 2;
			}
		}

		if (this.field2211 == -1) { // L: 142
			if (this.field2222 == null && this.field2223 == null) { // L: 143
				this.field2211 = 0; // L: 144
			} else {
				this.field2211 = 2;
			}
		}

	} // L: 146

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lha;IB)Lha;",
		garbageValue = "-9"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 149
			var2 = this.frameIds[var2]; // L: 150
			Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16); // L: 151
			var2 &= 65535; // L: 152
			if (var5 == null) { // L: 153
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 154
				var4.animate(var5, var2); // L: 155
				return var4; // L: 156
			}
		} else {
			class129 var3 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId); // L: 159
			if (var3 == null) { // L: 160
				return var1.toSharedSequenceModel(true);
			} else {
				var4 = var1.toSharedSequenceModel(!var3.method2928()); // L: 161
				var4.method4573(var3, var2); // L: 162
				return var4; // L: 163
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIB)Lha;",
		garbageValue = "70"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		Model var5;
		if (!this.isCachedModelIdSet()) { // L: 168
			var2 = this.frameIds[var2]; // L: 169
			Frames var6 = LoginScreenAnimation.getFrames(var2 >> 16); // L: 170
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
			class129 var4 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId); // L: 185
			if (var4 == null) { // L: 186
				return var1.toSharedSequenceModel(true);
			} else {
				var5 = var1.toSharedSequenceModel(!var4.method2928()); // L: 187
				var3 &= 3; // L: 188
				if (var3 == 1) { // L: 189
					var5.rotateY270Ccw();
				} else if (var3 == 2) { // L: 190
					var5.rotateY180();
				} else if (var3 == 3) { // L: 191
					var5.rotateY90Ccw();
				}

				var5.method4573(var4, var2); // L: 192
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lha;II)Lha;",
		garbageValue = "308821069"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		Model var4;
		if (!this.isCachedModelIdSet()) { // L: 201
			var2 = this.frameIds[var2]; // L: 202
			Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16); // L: 203
			var2 &= 65535; // L: 204
			if (var5 == null) { // L: 205
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var5.hasAlphaTransform(var2)); // L: 206
				var4.animate(var5, var2); // L: 207
				return var4; // L: 208
			}
		} else {
			class129 var3 = ObjectComposition.method3734(this.SequenceDefinition_cachedModelId); // L: 211
			if (var3 == null) { // L: 212
				return var1.toSharedSpotAnimationModel(true);
			} else {
				var4 = var1.toSharedSpotAnimationModel(!var3.method2928()); // L: 213
				var4.method4573(var3, var2); // L: 214
				return var4; // L: 215
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILgg;II)Lha;",
		garbageValue = "-928359800"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		if (field2230 && !this.isCachedModelIdSet() && !var3.isCachedModelIdSet()) { // L: 220
			return this.method3896(var1, var2, var3, var4); // L: 221
		} else {
			Model var5 = var1.toSharedSequenceModel(false); // L: 223
			boolean var6 = false; // L: 224
			Frames var7 = null; // L: 225
			Skeleton var8 = null; // L: 226
			class129 var9;
			if (this.isCachedModelIdSet()) { // L: 227
				var9 = this.method3877(); // L: 228
				if (var9 == null) { // L: 229
					return var5; // L: 230
				}

				if (var3.isCachedModelIdSet() && this.field2223 == null) { // L: 232
					var5.method4573(var9, var2); // L: 233
					return var5; // L: 234
				}

				var8 = var9.field1541; // L: 236
				var5.method4571(var8, var9, var2, this.field2223, false, !var3.isCachedModelIdSet()); // L: 237
			} else {
				var2 = this.frameIds[var2]; // L: 240
				var7 = LoginScreenAnimation.getFrames(var2 >> 16); // L: 241
				var2 &= 65535; // L: 242
				if (var7 == null) { // L: 243
					return var3.transformActorModel(var1, var4);
				}

				if (!var3.isCachedModelIdSet() && (this.field2222 == null || var4 == -1)) { // L: 244
					var5.animate(var7, var2); // L: 245
					return var5; // L: 246
				}

				if (this.field2222 == null || var4 == -1) { // L: 248
					var5.animate(var7, var2); // L: 249
					return var5; // L: 250
				}

				var6 = var3.isCachedModelIdSet(); // L: 252
				if (!var6) { // L: 253
					var5.method4518(var7, var2, this.field2222, false); // L: 254
				}
			}

			if (var3.isCachedModelIdSet()) { // L: 257
				var9 = var3.method3877(); // L: 258
				if (var9 == null) { // L: 259
					return var5; // L: 260
				}

				if (var8 == null) { // L: 262
					var8 = var9.field1541; // L: 263
				}

				var5.method4571(var8, var9, var4, this.field2223, true, true); // L: 265
			} else {
				var4 = var3.frameIds[var4]; // L: 268
				Frames var10 = LoginScreenAnimation.getFrames(var4 >> 16); // L: 269
				var4 &= 65535; // L: 270
				if (var10 == null) { // L: 271
					return this.transformActorModel(var1, var2);
				}

				var5.method4518(var10, var4, this.field2222, true); // L: 272
			}

			if (var6 && var7 != null) { // L: 274
				var5.method4518(var7, var2, this.field2222, false); // L: 275
			}

			var5.resetBounds(); // L: 277
			return var5; // L: 278
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILgg;II)Lha;",
		garbageValue = "-862806047"
	)
	Model method3896(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2]; // L: 282
		Frames var5 = LoginScreenAnimation.getFrames(var2 >> 16); // L: 283
		var2 &= 65535; // L: 284
		if (var5 == null) { // L: 285
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4]; // L: 286
			Frames var6 = LoginScreenAnimation.getFrames(var4 >> 16); // L: 287
			var4 &= 65535; // L: 288
			Model var7;
			if (var6 == null) { // L: 289
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2)); // L: 290
				var7.animate(var5, var2); // L: 291
				return var7; // L: 292
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4)); // L: 294
				var7.animate2(var5, var2, var6, var4, this.field2222); // L: 295
				return var7; // L: 296
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lha;II)Lha;",
		garbageValue = "-744796911"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		if (!this.isCachedModelIdSet()) { // L: 300
			int var3 = this.frameIds[var2]; // L: 301
			Frames var4 = LoginScreenAnimation.getFrames(var3 >> 16); // L: 302
			var3 &= 65535; // L: 303
			if (var4 == null) { // L: 304
				return var1.toSharedSequenceModel(true);
			} else {
				Frames var5 = null; // L: 305
				int var6 = 0; // L: 306
				if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) { // L: 307
					var6 = this.chatFrameIds[var2]; // L: 308
					var5 = LoginScreenAnimation.getFrames(var6 >> 16); // L: 309
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2109703319"
	)
	@Export("isCachedModelIdSet")
	public boolean isCachedModelIdSet() {
		return this.SequenceDefinition_cachedModelId >= 0; // L: 328
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1791836412"
	)
	public int method3876() {
		return this.field2216 - this.field2207; // L: 332
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Ldh;",
		garbageValue = "-35"
	)
	class129 method3877() {
		return this.isCachedModelIdSet() ? ObjectComposition.method3734(this.SequenceDefinition_cachedModelId) : null; // L: 373 374 377
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-461262132"
	)
	public static int method3898(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var1;
		} else if (var2 == 1) { // L: 11
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0; // L: 12
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "-98319081"
	)
	static int method3890(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 2266
			class379.Interpreter_intStackSize -= 3; // L: 2267
			class273.queueSoundEffect(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]); // L: 2268
			return 1; // L: 2269
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 2271
			class37.playSong(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 2272
			return 1; // L: 2273
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 2275
			class379.Interpreter_intStackSize -= 2; // L: 2276
			GroundObject.method4135(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]); // L: 2277
			return 1; // L: 2278
		} else {
			class87 var3;
			class86 var4;
			int var5;
			int var6;
			String var7;
			if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) { // L: 2280
				if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) { // L: 2392
					return var0 == 3211 ? 1 : 2; // L: 2501 2502 2504
				} else {
					var3 = class87.field1084; // L: 2393
					var4 = class86.field1068; // L: 2394
					boolean var8 = false; // L: 2395
					if (var0 == 3214) { // L: 2396
						var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2397
						var3 = (class87)DecorativeObject.findEnumerated(class157.method3236(), var6); // L: 2398
						if (var3 == null) { // L: 2399
							throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2400
						}
					}

					if (var0 == 3215) { // L: 2403
						var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2404
						var4 = (class86)DecorativeObject.findEnumerated(SecureRandomFuture.method2104(), var6); // L: 2405
						if (var4 == null) { // L: 2406
							throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2407
						}
					}

					if (var0 == 3210) { // L: 2410
						var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2411
						var3 = (class87)DecorativeObject.findEnumerated(class157.method3236(), var6); // L: 2412
						if (var3 == null) { // L: 2413
							var4 = (class86)DecorativeObject.findEnumerated(SecureRandomFuture.method2104(), var6); // L: 2414
							if (var4 == null) { // L: 2415
								throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2416
							}
						}
					} else if (var0 == 3182) { // L: 2420
						var3 = class87.field1077; // L: 2421
					} else if (var0 == 3204) { // L: 2423
						var4 = class86.field1075; // L: 2424
					} else if (var0 == 3206) { // L: 2426
						var4 = class86.field1069; // L: 2427
					} else if (var0 == 3208) { // L: 2429
						var4 = class86.field1070; // L: 2430
					}

					if (var4 == class86.field1068) { // L: 2432
						switch(var3.field1079) { // L: 2433
						case 1:
							var5 = BufferedSink.clientPreferences.method2381() ? 1 : 0; // L: 2456
							break; // L: 2457
						case 2:
							var5 = BufferedSink.clientPreferences.method2383() ? 1 : 0; // L: 2446
							break; // L: 2447
						case 3:
							var5 = BufferedSink.clientPreferences.method2386() ? 1 : 0; // L: 2441
							break; // L: 2442
						case 4:
							var5 = BufferedSink.clientPreferences.method2441(); // L: 2461
							break; // L: 2462
						case 5:
							var5 = class356.method6783(); // L: 2436
							break;
						default:
							var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2451
							throw new RuntimeException(var7); // L: 2452
						}
					} else {
						switch(var4.field1071) { // L: 2467
						case 1:
							var5 = BufferedSink.clientPreferences.method2452() ? 1 : 0; // L: 2470
							break; // L: 2471
						case 2:
							var6 = BufferedSink.clientPreferences.method2391(); // L: 2486
							var5 = Math.round((float)(var6 * 100) / 255.0F); // L: 2487
							break; // L: 2488
						case 3:
							var6 = BufferedSink.clientPreferences.method2427(); // L: 2492
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2493
							break; // L: 2494
						case 4:
							var6 = BufferedSink.clientPreferences.method2411(); // L: 2480
							var5 = Math.round((float)(var6 * 100) / 127.0F); // L: 2481
							break; // L: 2482
						default:
							var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2475
							throw new RuntimeException(var7); // L: 2476
						}
					}

					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5; // L: 2498
					return 1; // L: 2499
				}
			} else {
				var3 = class87.field1084; // L: 2281
				var4 = class86.field1068; // L: 2282
				var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2283
				if (var0 == 3212) { // L: 2284
					var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2285
					var3 = (class87)DecorativeObject.findEnumerated(class157.method3236(), var6); // L: 2286
					if (var3 == null) { // L: 2287
						throw new RuntimeException(String.format("Unrecognized device option %d", var6)); // L: 2288
					}
				}

				if (var0 == 3213) { // L: 2291
					var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2292
					var4 = (class86)DecorativeObject.findEnumerated(SecureRandomFuture.method2104(), var6); // L: 2293
					if (var4 == null) { // L: 2294
						throw new RuntimeException(String.format("Unrecognized game option %d", var6)); // L: 2295
					}
				}

				if (var0 == 3209) { // L: 2298
					var6 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 2299
					var3 = (class87)DecorativeObject.findEnumerated(class157.method3236(), var6); // L: 2300
					if (var3 == null) { // L: 2301
						var4 = (class86)DecorativeObject.findEnumerated(SecureRandomFuture.method2104(), var6); // L: 2302
						if (var4 == null) { // L: 2303
							throw new RuntimeException(String.format("Unrecognized client option %d", var6)); // L: 2304
						}
					}
				} else if (var0 == 3181) { // L: 2308
					var3 = class87.field1077; // L: 2309
				} else if (var0 == 3203) { // L: 2311
					var4 = class86.field1075; // L: 2312
				} else if (var0 == 3205) { // L: 2314
					var4 = class86.field1069; // L: 2315
				} else if (var0 == 3207) { // L: 2317
					var4 = class86.field1070; // L: 2318
				}

				if (var4 == class86.field1068) { // L: 2320
					switch(var3.field1079) { // L: 2321
					case 1:
						BufferedSink.clientPreferences.method2430(var5 == 1); // L: 2329
						break; // L: 2330
					case 2:
						BufferedSink.clientPreferences.method2382(var5 == 1); // L: 2345
						break; // L: 2346
					case 3:
						BufferedSink.clientPreferences.method2384(var5 == 1); // L: 2324
						break;
					case 4:
						if (var5 < 0) { // L: 2339
							var5 = 0;
						}

						BufferedSink.clientPreferences.method2387(var5); // L: 2340
						break; // L: 2341
					case 5:
						WorldMapData_0.method4676(var5); // L: 2334
						break; // L: 2335
					default:
						var7 = String.format("Unkown device option: %s.", var3.toString()); // L: 2350
						throw new RuntimeException(var7); // L: 2351
					}
				} else {
					switch(var4.field1071) { // L: 2356
					case 1:
						BufferedSink.clientPreferences.method2378(var5 == 1); // L: 2378
						break; // L: 2379
					case 2:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2364
						var6 = Math.round((float)(var5 * 255) / 100.0F); // L: 2365
						class20.method288(var6); // L: 2366
						break; // L: 2367
					case 3:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2383
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2384
						Message.method1150(var6); // L: 2385
						break; // L: 2386
					case 4:
						var5 = Math.min(Math.max(var5, 0), 100); // L: 2371
						var6 = Math.round((float)(var5 * 127) / 100.0F); // L: 2372
						Calendar.method6226(var6); // L: 2373
						break; // L: 2374
					default:
						var7 = String.format("Unkown game option: %s.", var4.toString()); // L: 2359
						throw new RuntimeException(var7); // L: 2360
					}
				}

				return 1; // L: 2390
			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1465679823"
	)
	static void method3881() {
		for (class198 var0 = (class198)Client.field713.last(); var0 != null; var0 = (class198)Client.field713.previous()) { // L: 4900
			var0.remove(); // L: 4901
		}

	} // L: 4903
}
