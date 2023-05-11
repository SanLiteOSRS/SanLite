import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1380277371
	)
	int field3416;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 437930689
	)
	int field3394;
	@ObfuscatedName("ac")
	int[] field3403;
	@ObfuscatedName("au")
	int[] field3411;
	@ObfuscatedName("ab")
	int[] field3397;
	@ObfuscatedName("aq")
	int[] field3398;
	@ObfuscatedName("al")
	int[] field3404;
	@ObfuscatedName("at")
	int[] field3400;
	@ObfuscatedName("aa")
	int[] field3401;
	@ObfuscatedName("ay")
	int[] field3399;
	@ObfuscatedName("ao")
	int[] field3420;
	@ObfuscatedName("as")
	int[] field3405;
	@ObfuscatedName("aj")
	int[] field3406;
	@ObfuscatedName("ak")
	int[] field3395;
	@ObfuscatedName("az")
	int[] field3408;
	@ObfuscatedName("ad")
	int[] field3409;
	@ObfuscatedName("ae")
	int[] field3410;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Llq;"
	)
	MusicPatchNode[][] field3392;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[[Llq;"
	)
	MusicPatchNode[][] field3412;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bi")
	boolean field3419;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -2130330853
	)
	@Export("track")
	int track;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2049666181
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 8370013022464380265L
	)
	long field3417;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = -8691691867109044431L
	)
	long field3396;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3416 = 256; // L: 14
		this.field3394 = 1000000; // L: 15
		this.field3403 = new int[16]; // L: 16
		this.field3411 = new int[16]; // L: 17
		this.field3397 = new int[16]; // L: 18
		this.field3398 = new int[16]; // L: 19
		this.field3404 = new int[16]; // L: 20
		this.field3400 = new int[16]; // L: 21
		this.field3401 = new int[16]; // L: 22
		this.field3399 = new int[16]; // L: 23
		this.field3420 = new int[16]; // L: 24
		this.field3405 = new int[16]; // L: 28
		this.field3406 = new int[16]; // L: 29
		this.field3395 = new int[16]; // L: 30
		this.field3408 = new int[16]; // L: 31
		this.field3409 = new int[16]; // L: 32
		this.field3410 = new int[16]; // L: 33
		this.field3392 = new MusicPatchNode[16][128]; // L: 34
		this.field3412 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5784(); // L: 46
	} // L: 47

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3416 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	public int method5867() {
		return this.field3416; // L: 54
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lld;Lnm;Lba;II)Z",
		garbageValue = "-1174424990"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5971(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				byte[] var11 = var2.takeFileFlat(var8); // L: 68
				MusicPatch var10;
				if (var11 == null) { // L: 69
					var10 = null; // L: 70
				} else {
					var10 = new MusicPatch(var11); // L: 73
				}

				var9 = var10; // L: 75
				if (var10 == null) { // L: 76
					var5 = false; // L: 77
					continue;
				}

				this.musicPatches.put(var10, (long)var8); // L: 80
			}

			if (!var9.method5937(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-371554309"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "34803635"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lbp;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbp;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("al")
	protected synchronized int vmethod5949() {
		return 0; // L: 477
	}

	@ObfuscatedName("at")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field3394 * -727379968 / (PcmPlayer.field306 * -1110828124); // L: 482

			do {
				long var5 = (long)var3 * (long)var4 + this.field3417; // L: 484
				if (this.field3396 - var5 >= 0L) { // L: 485
					this.field3417 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field3396 - this.field3417 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field3417 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method5797(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lld;ZI)V",
		garbageValue = "-972368442"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field3419 = var2; // L: 99
		this.field3417 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field3396 = this.midiFile.method5903(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("ay")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field3394 * -727379968 / (PcmPlayer.field306 * -1110828124); // L: 503

			do {
				long var3 = this.field3417 + (long)var2 * (long)var1; // L: 505
				if (this.field3396 - var3 >= 0L) { // L: 506
					this.field3417 = var3; // L: 507
					break;
				}

				int var5 = (int)((this.field3396 - this.field3417 + (long)var2 - 1L) / (long)var2); // L: 510
				this.field3417 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method5797(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method5784(); // L: 114
	} // L: 115

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1577692860"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-114"
	)
	public synchronized void method5772(int var1, int var2) {
		this.method5773(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-22"
	)
	void method5773(int var1, int var2) {
		this.field3398[var1] = var2; // L: 126
		this.field3400[var1] = var2 & -128; // L: 127
		this.method5839(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1627005536"
	)
	void method5839(int var1, int var2) {
		if (var2 != this.field3404[var1]) { // L: 132
			this.field3404[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field3412[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1380723164"
	)
	void method5775(int var1, int var2, int var3) {
		this.method5777(var1, var2, 64); // L: 139
		if ((this.field3405[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field3467 == var1 && var4.field3464 < 0) { // L: 142
					this.field3392[var1][var4.field3454] = null; // L: 143
					this.field3392[var1][var2] = var4; // L: 144
					int var8 = (var4.field3459 * var4.field3458 >> 12) + var4.field3470; // L: 145
					var4.field3470 += var2 - var4.field3454 << 8; // L: 146
					var4.field3458 = var8 - var4.field3470; // L: 147
					var4.field3459 = 4096; // L: 148
					var4.field3454 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3404[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field3467 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field3452 = var9.field3440[var2]; // L: 162
				var6.field3450 = var9.field3441[var2]; // L: 163
				var6.field3454 = var2; // L: 164
				var6.field3455 = var3 * var3 * var9.field3438[var2] * var9.field3437 + 1024 >> 11; // L: 165
				var6.field3456 = var9.field3439[var2] & 255; // L: 166
				var6.field3470 = (var2 << 8) - (var9.field3436[var2] & 32767); // L: 167
				var6.field3460 = 0; // L: 168
				var6.field3461 = 0; // L: 169
				var6.field3468 = 0; // L: 170
				var6.field3464 = -1; // L: 171
				var6.field3449 = 0; // L: 172
				if (this.field3408[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method978(var5, this.method5789(var6), this.method5790(var6), this.method5791(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method978(var5, this.method5789(var6), 0, this.method5791(var6)); // L: 177
					this.method5805(var6, var9.field3436[var2] < 0); // L: 178
				}

				if (var9.field3436[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3450 >= 0) { // L: 181
					MusicPatchNode var7 = this.field3412[var1][var6.field3450]; // L: 182
					if (var7 != null && var7.field3464 < 0) { // L: 183
						this.field3392[var1][var7.field3454] = null; // L: 184
						var7.field3464 = 0; // L: 185
					}

					this.field3412[var1][var6.field3450] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field3392[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llq;ZI)V",
		garbageValue = "2143076996"
	)
	void method5805(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field280) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)this.field3408[var1.field3467] * (long)var5 >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method912(); // L: 202
			}
		} else {
			var4 = (int)((long)this.field3408[var1.field3467] * (long)var3 >> 6); // L: 206
		}

		var1.stream.method911(var4); // L: 208
	} // L: 209

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "71"
	)
	void method5777(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3392[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field3392[var1][var2] = null; // L: 214
			if ((this.field3405[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var5.field3467 == var4.field3467 && var5.field3464 < 0 && var5 != var4) { // L: 217
						var4.field3464 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field3464 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-939740093"
	)
	void method5778(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1736841186"
	)
	void method5846(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1611025845"
	)
	void method5780(int var1, int var2) {
		this.field3401[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1037039964"
	)
	void method5781(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field3467 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method916(PcmPlayer.field306 * -1110828124 / 100); // L: 239
					if (var2.stream.method1021()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5986(); // L: 241
				}

				if (var2.field3464 < 0) { // L: 243
					this.field3392[var2.field3467][var2.field3454] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1613137555"
	)
	void method5782(int var1) {
		if (var1 >= 0) { // L: 250
			this.field3403[var1] = 12800; // L: 254
			this.field3411[var1] = 8192; // L: 255
			this.field3397[var1] = 16383; // L: 256
			this.field3401[var1] = 8192; // L: 257
			this.field3399[var1] = 0; // L: 258
			this.field3420[var1] = 8192; // L: 259
			this.method5819(var1); // L: 260
			this.method5786(var1); // L: 261
			this.field3405[var1] = 0; // L: 262
			this.field3406[var1] = 32767; // L: 263
			this.field3395[var1] = 256; // L: 264
			this.field3408[var1] = 0; // L: 265
			this.method5788(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method5782(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2058759132"
	)
	void method5765(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field3467 == var1) && var2.field3464 < 0) { // L: 271 272
				this.field3392[var2.field3467][var2.field3454] = null; // L: 273
				var2.field3464 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-964267539"
	)
	void method5784() {
		this.method5781(-1); // L: 281
		this.method5782(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3404[var1] = this.field3398[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field3400[var1] = this.field3398[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-109"
	)
	void method5819(int var1) {
		if ((this.field3405[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field3467 == var1 && this.field3392[var1][var2.field3454] == null && var2.field3464 < 0) { // L: 290 291
					var2.field3464 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1437271181"
	)
	void method5786(int var1) {
		if ((this.field3405[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field3467 == var1) { // L: 300
					var2.field3469 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1376449037"
	)
	void method5787(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method5777(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method5775(var3, var4, var5);
			} else {
				this.method5777(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method5778(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field3400[var3] = (var5 << 14) + (this.field3400[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field3400[var3] = (var5 << 7) + (this.field3400[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field3399[var3] = (var5 << 7) + (this.field3399[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field3399[var3] = var5 + (this.field3399[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field3420[var3] = (var5 << 7) + (this.field3420[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field3420[var3] = var5 + (this.field3420[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field3403[var3] = (var5 << 7) + (this.field3403[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field3403[var3] = var5 + (this.field3403[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field3411[var3] = (var5 << 7) + (this.field3411[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field3411[var3] = var5 + (this.field3411[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field3397[var3] = (var5 << 7) + (this.field3397[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field3397[var3] = var5 + (this.field3397[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field3405;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3405; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field3405;
					var10000[var3] |= 2;
				} else {
					this.method5819(var3); // L: 352
					var10000 = this.field3405; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field3406[var3] = (var5 << 7) + (this.field3406[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field3406[var3] = (this.field3406[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field3406[var3] = (var5 << 7) + (this.field3406[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field3406[var3] = (this.field3406[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method5781(var3);
			}

			if (var4 == 121) { // L: 361
				this.method5782(var3);
			}

			if (var4 == 123) { // L: 362
				this.method5765(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field3406[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field3395[var3] = (var5 << 7) + (this.field3395[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field3406[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field3395[var3] = var5 + (this.field3395[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field3408[var3] = (var5 << 7) + (this.field3408[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field3408[var3] = var5 + (this.field3408[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field3405;
					var10000[var3] |= 4;
				} else {
					this.method5786(var3); // L: 376
					var10000 = this.field3405; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5788(var3, (var5 << 7) + (this.field3409[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method5788(var3, var5 + (this.field3409[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method5839(var3, var4 + this.field3400[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method5846(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method5780(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method5784(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1731550836"
	)
	void method5788(int var1, int var2) {
		this.field3409[var1] = var2; // L: 410
		this.field3410[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)I",
		garbageValue = "1667221549"
	)
	int method5789(MusicPatchNode var1) {
		int var2 = (var1.field3458 * var1.field3459 >> 12) + var1.field3470; // L: 415
		var2 += (this.field3401[var1.field3467] - 8192) * this.field3395[var1.field3467] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field3452; // L: 417
		int var4;
		if (var3.field3380 > 0 && (var3.field3379 > 0 || this.field3399[var1.field3467] > 0)) { // L: 418
			var4 = var3.field3379 << 2; // L: 419
			int var5 = var3.field3377 << 1; // L: 420
			if (var1.field3465 < var5) { // L: 421
				var4 = var4 * var1.field3465 / var5;
			}

			var4 += this.field3399[var1.field3467] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3457 & 511)); // L: 423
			var2 += (int)(var6 * (double)var4); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(PcmPlayer.field306 * -1110828124) + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)I",
		garbageValue = "-606314672"
	)
	int method5790(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3452; // L: 431
		int var3 = this.field3403[var1.field3467] * this.field3397[var1.field3467] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field3455 + 16384 >> 15; // L: 434
		var3 = var3 * this.field3416 + 128 >> 8; // L: 435
		if (var2.field3375 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3375 * (double)var1.field3460 * 1.953125E-5D) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3374 != null) { // L: 439
			var4 = var1.field3461; // L: 440
			var5 = var2.field3374[var1.field3468 * 4 + 1]; // L: 441
			if (var1.field3468 * 4 < var2.field3374.length - 2) { // L: 442
				var6 = (var2.field3374[var1.field3468 * 4] & 255) << 8; // L: 443
				var7 = (var2.field3374[var1.field3468 * 4 + 2] & 255) << 8; // L: 444
				var5 += (var4 - var6) * (var2.field3374[var1.field3468 * 4 + 3] - var5) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field3464 > 0 && var2.field3373 != null) { // L: 449
			var4 = var1.field3464; // L: 450
			var5 = var2.field3373[var1.field3449 * 4 + 1]; // L: 451
			if (var1.field3449 * 4 < var2.field3373.length - 2) { // L: 452
				var6 = (var2.field3373[var1.field3449 * 4] & 255) << 8; // L: 453
				var7 = (var2.field3373[var1.field3449 * 4 + 2] & 255) << 8; // L: 454
				var5 += (var2.field3373[var1.field3449 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var5 * var3 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Llq;I)I",
		garbageValue = "-941309509"
	)
	int method5791(MusicPatchNode var1) {
		int var2 = this.field3411[var1.field3467]; // L: 463
		return var2 < 8192 ? var2 * var1.field3456 + 32 >> 6 : 16384 - ((128 - var1.field3456) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "486029060"
	)
	void method5797() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field3396; var2 == this.trackLength; var3 = this.midiFile.method5903(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field3419 || var2 == 0) { // L: 533
							this.method5784(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method5787(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field3396 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Llq;S)Z",
		garbageValue = "3954"
	)
	boolean method5878(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field3464 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) { // L: 558
					this.field3412[var1.field3467][var1.field3450] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Llq;[IIII)Z",
		garbageValue = "769270888"
	)
	boolean method5798(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3462 = PcmPlayer.field306 * -1110828124 / 100; // L: 568
		if (var1.field3464 < 0 || var1.stream != null && !var1.stream.method988()) { // L: 569
			int var5 = var1.field3459; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3420[var1.field3467] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field3459 = var5; // L: 581
			}

			var1.stream.method917(this.method5789(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field3452; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3465; // L: 586
			var1.field3457 += var6.field3380; // L: 587
			double var8 = 5.086263020833333E-6D * (double)((var1.field3454 - 60 << 8) + (var1.field3458 * var1.field3459 >> 12)); // L: 588
			if (var6.field3375 > 0) { // L: 589
				if (var6.field3378 > 0) { // L: 590
					var1.field3460 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3378 * var8) + 0.5D);
				} else {
					var1.field3460 += 128; // L: 591
				}
			}

			if (var6.field3374 != null) { // L: 593
				if (var6.field3376 > 0) { // L: 594
					var1.field3461 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3376 * var8) + 0.5D);
				} else {
					var1.field3461 += 128; // L: 595
				}

				while (var1.field3468 * 4 < var6.field3374.length - 2 && var1.field3461 > (var6.field3374[var1.field3468 * 4 + 2] & 255) << 8) { // L: 596
					var1.field3468 = var1.field3468 * 4 + 2;
				}

				if (var1.field3468 * 4 == var6.field3374.length - 2 && var6.field3374[var1.field3468 * 4 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field3464 >= 0 && var6.field3373 != null && (this.field3405[var1.field3467] & 1) == 0 && (var1.field3450 < 0 || var1 != this.field3412[var1.field3467][var1.field3450])) { // L: 599 600
				if (var6.field3381 > 0) { // L: 601
					var1.field3464 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3381 * var8) + 0.5D);
				} else {
					var1.field3464 += 128; // L: 602
				}

				while (var1.field3449 * 4 < var6.field3373.length - 2 && var1.field3464 > (var6.field3373[var1.field3449 * 4 + 2] & 255) << 8) { // L: 603
					var1.field3449 = var1.field3449 * 4 + 2;
				}

				if (var1.field3449 * 4 == var6.field3373.length - 2) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method916(var1.field3462); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method1021()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5986(); // L: 612
				if (var1.field3464 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) { // L: 615
						this.field3412[var1.field3467][var1.field3450] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method915(var1.field3462, this.method5790(var1), this.method5791(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method5986(); // L: 570
			var1.remove(); // L: 571
			if (var1.field3450 > 0 && var1 == this.field3412[var1.field3467][var1.field3450]) { // L: 572
				this.field3412[var1.field3467][var1.field3450] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-2144469370"
	)
	public static void method5891(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0; // L: 25
	} // L: 26
}
