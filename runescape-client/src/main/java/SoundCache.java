import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -350003391
	)
	static int field323;
	@ObfuscatedName("i")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1871604293
	)
	static int field322;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lag;",
		garbageValue = "1853906698"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null; // L: 23
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lag;",
		garbageValue = "-2091085778"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lag;",
		garbageValue = "-1831147556"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lag;",
		garbageValue = "-1611201037"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "1629817495"
	)
	static int method744(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3286
			var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3287
			var9 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3288
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3289
			return 1; // L: 3290
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3292
				UserComparator8.Interpreter_stringStackSize -= 2; // L: 3293
				var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 3294
				var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 3295
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3296
				return 1; // L: 3297
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3299
				var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3300
				var9 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3301
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + Archive.intToString(var9, true); // L: 3302
				return 1; // L: 3303
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3305
				var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3306
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3307
				return 1; // L: 3308
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3310
					var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3311
					long var13 = 86400000L * (11745L + (long)var10); // L: 3312
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3313
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3314
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3315
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3316
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3317
					return 1; // L: 3318
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3320
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3328
						var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3329
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3330
						return 1; // L: 3331
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3333
						UserComparator8.Interpreter_stringStackSize -= 2; // L: 3334
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = ScriptEvent.method2064(WorldMapIcon_0.compareStrings(Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1], MilliClock.clientLanguage)); // L: 3335
						return 1; // L: 3336
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3338
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3339
							Nameable.Interpreter_intStackSize -= 2; // L: 3340
							var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3341
							var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3342
							var11 = MouseRecorder.archive13.takeFile(var5, 0); // L: 3343
							var12 = new Font(var11); // L: 3344
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3345
							return 1; // L: 3346
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3348
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3349
							Nameable.Interpreter_intStackSize -= 2; // L: 3350
							var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3351
							var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3352
							var11 = MouseRecorder.archive13.takeFile(var5, 0); // L: 3353
							var12 = new Font(var11); // L: 3354
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3355
							return 1; // L: 3356
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3358
							UserComparator8.Interpreter_stringStackSize -= 2; // L: 3359
							var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 3360
							var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 3361
							if (Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1) { // L: 3362
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4; // L: 3363
							}

							return 1; // L: 3364
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3366
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3367
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3368
							return 1; // L: 3369
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3371
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3372
							var9 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3373
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3374
							return 1; // L: 3375
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3377
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3378
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class124.isCharPrintable((char)var10) ? 1 : 0; // L: 3379
							return 1; // L: 3380
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3382
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3383
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class113.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3384
							return 1; // L: 3385
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3387
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3388
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class78.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3389
							return 1; // L: 3390
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3392
							var10 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3393
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = UserComparator9.isDigit((char)var10) ? 1 : 0; // L: 3394
							return 1; // L: 3395
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3397
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3398
							if (var3 != null) { // L: 3399
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3400
							}

							return 1; // L: 3401
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3403
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3404
							Nameable.Interpreter_intStackSize -= 2; // L: 3405
							var9 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 3406
							var5 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 3407
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3408
							return 1; // L: 3409
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3411
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3412
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3413
							boolean var16 = false; // L: 3414

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3415
								char var7 = var3.charAt(var6); // L: 3416
								if (var7 == '<') { // L: 3417
									var16 = true;
								} else if (var7 == '>') { // L: 3418
									var16 = false;
								} else if (!var16) { // L: 3419
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3421
							return 1; // L: 3422
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3424
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3425
							var9 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3426
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3427
							return 1; // L: 3428
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3430
							UserComparator8.Interpreter_stringStackSize -= 2; // L: 3431
							var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 3432
							var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 3433
							var5 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3434
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3435
							return 1; // L: 3436
						} else if (var0 == 4122) { // L: 3438
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize]; // L: 3439
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3440
							return 1; // L: 3441
						} else {
							return 2; // L: 3443
						}
					}
				} else {
					UserComparator8.Interpreter_stringStackSize -= 2; // L: 3321
					var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize]; // L: 3322
					var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1]; // L: 3323
					if (ScriptFrame.localPlayer.appearance != null && ScriptFrame.localPlayer.appearance.isFemale) { // L: 3324
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3; // L: 3325
					}

					return 1; // L: 3326
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "170435945"
	)
	static final void method757(Actor var0, int var1) {
		Bounds.worldToScreen(var0.x, var0.y, var1); // L: 5402
	} // L: 5403
}
