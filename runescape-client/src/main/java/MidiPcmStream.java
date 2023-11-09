import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -524126217
	)
	static int field3381;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -267967717
	)
	int field3366;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -698110144
	)
	int field3367;
	@ObfuscatedName("z")
	int[] field3368;
	@ObfuscatedName("j")
	int[] field3392;
	@ObfuscatedName("i")
	int[] field3370;
	@ObfuscatedName("n")
	int[] field3388;
	@ObfuscatedName("l")
	int[] field3372;
	@ObfuscatedName("k")
	int[] field3369;
	@ObfuscatedName("c")
	int[] field3374;
	@ObfuscatedName("r")
	int[] field3380;
	@ObfuscatedName("b")
	int[] field3376;
	@ObfuscatedName("x")
	int[] field3375;
	@ObfuscatedName("a")
	int[] field3378;
	@ObfuscatedName("q")
	int[] field3379;
	@ObfuscatedName("d")
	int[] field3384;
	@ObfuscatedName("e")
	int[] field3365;
	@ObfuscatedName("g")
	int[] field3373;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[[Lkv;"
	)
	MusicPatchNode[][] field3383;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lkv;"
	)
	MusicPatchNode[][] field3391;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ai")
	boolean field3371;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 504327329
	)
	@Export("track")
	int track;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1877242811
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 8647271195752951509L
	)
	long field3389;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 200143050739431559L
	)
	long field3390;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3366 = 256; // L: 14
		this.field3367 = -727379968; // L: 15
		this.field3368 = new int[16]; // L: 16
		this.field3392 = new int[16]; // L: 17
		this.field3370 = new int[16]; // L: 18
		this.field3388 = new int[16]; // L: 19
		this.field3372 = new int[16]; // L: 20
		this.field3369 = new int[16]; // L: 21
		this.field3374 = new int[16];
		this.field3380 = new int[16]; // L: 23
		this.field3376 = new int[16]; // L: 24
		this.field3375 = new int[16]; // L: 28
		this.field3378 = new int[16]; // L: 29
		this.field3379 = new int[16]; // L: 30
		this.field3384 = new int[16]; // L: 31
		this.field3365 = new int[16]; // L: 32
		this.field3373 = new int[16]; // L: 33
		this.field3383 = new MusicPatchNode[16][128]; // L: 34
		this.field3391 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5634(); // L: 46
	} // L: 47

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-921376443"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3366 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-548589206"
	)
	public int method5615() {
		return this.field3366; // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Lln;Lah;IB)Z",
		garbageValue = "81"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5817(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = class155.method3333(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method5779(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-128962148"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 80
			var1.clear();
		}

	} // L: 81

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-693763094"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 84
			var1.remove();
		}

	} // L: 85

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("n")
	protected synchronized int vmethod5793() {
		return 0; // L: 468
	}

	@ObfuscatedName("l")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field3367 * 1000000 / class284.field3321; // L: 473

			do {
				long var5 = (long)var4 * (long)var3 + this.field3389; // L: 475
				if (this.field3390 - var5 >= 0L) { // L: 476
					this.field3389 = var5; // L: 477
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3390 - this.field3389) - 1L) / (long)var4); // L: 480
				this.field3389 += (long)var4 * (long)var7; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method5679(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkd;ZI)V",
		garbageValue = "1213360117"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field3371 = var2; // L: 90
		this.field3389 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field3390 = this.midiFile.method5741(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("c")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field3367 * 1000000 / class284.field3321; // L: 494

			do {
				long var3 = this.field3389 + (long)var1 * (long)var2; // L: 496
				if (this.field3390 - var3 >= 0L) { // L: 497
					this.field3389 = var3; // L: 498
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3390 - this.field3389) - 1L) / (long)var2); // L: 501
				this.field3389 += (long)var2 * (long)var5; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method5679(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2145050906"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method5634(); // L: 105
	} // L: 106

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-643635418"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "120"
	)
	public synchronized void method5622(int var1, int var2) {
		this.method5623(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-571066266"
	)
	void method5623(int var1, int var2) {
		this.field3388[var1] = var2; // L: 117
		this.field3369[var1] = var2 & -128; // L: 118
		this.method5624(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1695536423"
	)
	void method5624(int var1, int var2) {
		if (var2 != this.field3372[var1]) { // L: 123
			this.field3372[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field3391[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1757055647"
	)
	void method5625(int var1, int var2, int var3) {
		this.method5627(var1, var2, 64); // L: 130
		if ((this.field3375[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field3436 == var1 && var4.field3440 < 0) { // L: 133
					this.field3383[var1][var4.field3431] = null; // L: 134
					this.field3383[var1][var2] = var4; // L: 135
					int var8 = (var4.field3428 * var4.field3439 >> 12) + var4.field3434; // L: 136
					var4.field3434 += var2 - var4.field3431 << 8; // L: 137
					var4.field3428 = var8 - var4.field3434; // L: 138
					var4.field3439 = 4096; // L: 139
					var4.field3431 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3372[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field3436 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field3429 = var9.field3408[var2]; // L: 153
				var6.field3430 = var9.field3413[var2]; // L: 154
				var6.field3431 = var2; // L: 155
				var6.field3432 = var3 * var3 * var9.field3410[var2] * var9.field3412 + 1024 >> 11; // L: 156
				var6.field3433 = var9.field3411[var2] & 255; // L: 157
				var6.field3434 = (var2 << 8) - (var9.field3418[var2] & 32767); // L: 158
				var6.field3437 = 0; // L: 159
				var6.field3438 = 0; // L: 160
				var6.field3442 = 0; // L: 161
				var6.field3440 = -1; // L: 162
				var6.field3426 = 0; // L: 163
				if (this.field3384[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method913(var5, this.method5639(var6), this.method5640(var6), this.method5613(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method913(var5, this.method5639(var6), 0, this.method5613(var6)); // L: 168
					this.method5659(var6, var9.field3418[var2] < 0); // L: 169
				}

				if (var9.field3418[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3430 >= 0) { // L: 172
					MusicPatchNode var7 = this.field3391[var1][var6.field3430]; // L: 173
					if (var7 != null && var7.field3440 < 0) { // L: 174
						this.field3383[var1][var7.field3431] = null; // L: 175
						var7.field3440 = 0; // L: 176
					}

					this.field3391[var1][var6.field3430] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field3383[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkv;ZI)V",
		garbageValue = "1738453403"
	)
	void method5659(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field292) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)this.field3384[var1.field3436] * (long)var5 >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method911(); // L: 193
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3384[var1.field3436] >> 6); // L: 197
		}

		var1.stream.method890(var4); // L: 199
	} // L: 200

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "74"
	)
	void method5627(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3383[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field3383[var1][var2] = null; // L: 205
			if ((this.field3375[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var5.field3436 == var4.field3436 && var5.field3440 < 0 && var4 != var5) { // L: 208
						var4.field3440 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field3440 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2120112247"
	)
	void method5628(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1370666986"
	)
	void method5629(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1376092933"
	)
	void method5630(int var1, int var2) {
		this.field3374[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-110"
	)
	void method5631(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field3436 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method895(class284.field3321 / 100); // L: 230
					if (var2.stream.method899()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5828(); // L: 232
				}

				if (var2.field3440 < 0) { // L: 234
					this.field3383[var2.field3436][var2.field3431] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-525596200"
	)
	void method5632(int var1) {
		if (var1 >= 0) { // L: 241
			this.field3368[var1] = 12800; // L: 245
			this.field3392[var1] = 8192; // L: 246
			this.field3370[var1] = 16383; // L: 247
			this.field3374[var1] = 8192; // L: 248
			this.field3380[var1] = 0; // L: 249
			this.field3376[var1] = 8192; // L: 250
			this.method5635(var1); // L: 251
			this.method5636(var1); // L: 252
			this.field3375[var1] = 0; // L: 253
			this.field3378[var1] = 32767; // L: 254
			this.field3379[var1] = 256; // L: 255
			this.field3384[var1] = 0; // L: 256
			this.method5614(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method5632(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1393661383"
	)
	void method5668(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field3436 == var1) && var2.field3440 < 0) { // L: 262 263
				this.field3383[var2.field3436][var2.field3431] = null; // L: 264
				var2.field3440 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1548255752"
	)
	void method5634() {
		this.method5631(-1); // L: 272
		this.method5632(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field3372[var1] = this.field3388[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field3369[var1] = this.field3388[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-446668646"
	)
	void method5635(int var1) {
		if ((this.field3375[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field3436 == var1 && this.field3383[var1][var2.field3431] == null && var2.field3440 < 0) { // L: 281 282
					var2.field3440 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1107503455"
	)
	void method5636(int var1) {
		if ((this.field3375[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field3436 == var1) { // L: 291
					var2.field3446 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1277317735"
	)
	void method5637(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method5627(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method5625(var3, var4, var5);
			} else {
				this.method5627(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method5628(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field3369[var3] = (var5 << 14) + (this.field3369[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field3369[var3] = (var5 << 7) + (this.field3369[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field3380[var3] = (var5 << 7) + (this.field3380[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field3380[var3] = var5 + (this.field3380[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field3376[var3] = (var5 << 7) + (this.field3376[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field3376[var3] = var5 + (this.field3376[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field3368[var3] = var5 + (this.field3368[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field3392[var3] = (var5 << 7) + (this.field3392[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field3392[var3] = var5 + (this.field3392[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field3370[var3] = (var5 << 7) + (this.field3370[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field3370[var3] = var5 + (this.field3370[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field3375;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3375; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field3375;
					var10000[var3] |= 2;
				} else {
					this.method5635(var3); // L: 343
					var10000 = this.field3375; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field3378[var3] = (var5 << 7) + (this.field3378[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field3378[var3] = (this.field3378[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field3378[var3] = (var5 << 7) + (this.field3378[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field3378[var3] = (this.field3378[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method5631(var3);
			}

			if (var4 == 121) { // L: 352
				this.method5632(var3);
			}

			if (var4 == 123) { // L: 353
				this.method5668(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field3378[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field3379[var3] = (var5 << 7) + (this.field3379[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field3378[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field3379[var3] = var5 + (this.field3379[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field3384[var3] = (var5 << 7) + (this.field3384[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field3384[var3] = var5 + (this.field3384[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field3375;
					var10000[var3] |= 4;
				} else {
					this.method5636(var3); // L: 367
					var10000 = this.field3375; // L: 368
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5614(var3, (var5 << 7) + (this.field3365[var3] & -16257)); // L: 371
			}

			if (var4 == 49) { // L: 372
				this.method5614(var3, var5 + (this.field3365[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method5624(var3, var4 + this.field3369[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method5629(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method5630(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method5634(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-800776544"
	)
	void method5614(int var1, int var2) {
		this.field3365[var1] = var2; // L: 401
		this.field3373[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkv;I)I",
		garbageValue = "-20440613"
	)
	int method5639(MusicPatchNode var1) {
		int var2 = (var1.field3439 * var1.field3428 >> 12) + var1.field3434; // L: 406
		var2 += (this.field3374[var1.field3436] - 8192) * this.field3379[var1.field3436] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field3429; // L: 408
		int var4;
		if (var3.field3354 > 0 && (var3.field3349 > 0 || this.field3380[var1.field3436] > 0)) { // L: 409
			var4 = var3.field3349 << 2; // L: 410
			int var5 = var3.field3350 << 1; // L: 411
			if (var1.field3441 < var5) { // L: 412
				var4 = var4 * var1.field3441 / var5;
			}

			var4 += this.field3380[var1.field3436] >> 7; // L: 413
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3443 & 511)); // L: 414
			var2 += (int)((double)var4 * var6); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)class284.field3321 + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkv;B)I",
		garbageValue = "40"
	)
	int method5640(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3429; // L: 422
		int var3 = this.field3370[var1.field3436] * this.field3368[var1.field3436] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field3432 + 16384 >> 15; // L: 425
		var3 = var3 * this.field3366 + 128 >> 8; // L: 426
		if (var2.field3345 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3345 * 1.953125E-5D * (double)var1.field3437) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3353 != null) { // L: 430
			var4 = var1.field3438; // L: 431
			var5 = var2.field3353[var1.field3442 * 4 + 1]; // L: 432
			if (var1.field3442 * 4 < var2.field3353.length - 2) { // L: 433
				var6 = (var2.field3353[var1.field3442 * 4] & 255) << 8; // L: 434
				var7 = (var2.field3353[var1.field3442 * 4 + 2] & 255) << 8; // L: 435
				var5 += (var4 - var6) * (var2.field3353[var1.field3442 * 4 + 3] - var5) / (var7 - var6); // L: 436
			}

			var3 = var3 * var5 + 32 >> 6; // L: 438
		}

		if (var1.field3440 > 0 && var2.field3351 != null) { // L: 440
			var4 = var1.field3440; // L: 441
			var5 = var2.field3351[var1.field3426 * 4 + 1]; // L: 442
			if (var1.field3426 * 4 < var2.field3351.length - 2) { // L: 443
				var6 = (var2.field3351[var1.field3426 * 4] & 255) << 8; // L: 444
				var7 = (var2.field3351[var1.field3426 * 4 + 2] & 255) << 8; // L: 445
				var5 += (var2.field3351[var1.field3426 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 446
			}

			var3 = var5 * var3 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkv;S)I",
		garbageValue = "3641"
	)
	int method5613(MusicPatchNode var1) {
		int var2 = this.field3392[var1.field3436]; // L: 454
		return var2 < 8192 ? var2 * var1.field3433 + 32 >> 6 : 16384 - ((128 - var1.field3433) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25173"
	)
	void method5679() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field3390; var2 == this.trackLength; var3 = this.midiFile.method5741(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field3371 || var2 == 0) { // L: 524
							this.method5634(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method5637(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field3390 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkv;I)Z",
		garbageValue = "1287702671"
	)
	boolean method5648(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field3440 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) { // L: 549
					this.field3391[var1.field3436][var1.field3430] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkv;[IIII)Z",
		garbageValue = "-834801053"
	)
	boolean method5626(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3445 = class284.field3321 / 100; // L: 559
		if (var1.field3440 < 0 || var1.stream != null && !var1.stream.method898()) { // L: 560
			int var5 = var1.field3439; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3376[var1.field3436] * 4.921259842519685E-4D) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field3439 = var5; // L: 572
			}

			var1.stream.method1014(this.method5639(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field3429; // L: 575
			boolean var7 = false; // L: 576
			++var1.field3441; // L: 577
			var1.field3443 += var6.field3354; // L: 578
			double var8 = (double)((var1.field3431 - 60 << 8) + (var1.field3439 * var1.field3428 >> 12)) * 5.086263020833333E-6D; // L: 579
			if (var6.field3345 > 0) { // L: 580
				if (var6.field3352 > 0) { // L: 581
					var1.field3437 = var1.field3437 * 231489536 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3352) + 0.5D) * 231489536;
				} else {
					var1.field3437 = var1.field3437 * 231489536 + -434110464; // L: 582
				}
			}

			if (var6.field3353 != null) { // L: 584
				if (var6.field3346 > 0) { // L: 585
					var1.field3438 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3346) + 0.5D);
				} else {
					var1.field3438 += 128; // L: 586
				}

				while (var1.field3442 * 4 < var6.field3353.length - 2 && var1.field3438 > (var6.field3353[var1.field3442 * 4 + 2] & 255) << 8) { // L: 587
					var1.field3442 = var1.field3442 * 4 + 2;
				}

				if (var1.field3442 * 4 == var6.field3353.length - 2 && var6.field3353[var1.field3442 * 4 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field3440 >= 0 && var6.field3351 != null && (this.field3375[var1.field3436] & 1) == 0 && (var1.field3430 < 0 || var1 != this.field3391[var1.field3436][var1.field3430])) { // L: 590 591
				if (var6.field3347 > 0) { // L: 592
					var1.field3440 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3347) + 0.5D);
				} else {
					var1.field3440 += 128; // L: 593
				}

				while (var1.field3426 * 4 < var6.field3351.length - 2 && var1.field3440 > (var6.field3351[var1.field3426 * 4 + 2] & 255) << 8) { // L: 594
					var1.field3426 = var1.field3426 * 4 + 2;
				}

				if (var1.field3426 * 4 == var6.field3351.length - 2) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method895(var1.field3445); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method899()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5828(); // L: 603
				if (var1.field3440 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) { // L: 606
						this.field3391[var1.field3436][var1.field3430] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method894(var1.field3445, this.method5640(var1), this.method5613(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method5828(); // L: 561
			var1.remove(); // L: 562
			if (var1.field3430 > 0 && var1 == this.field3391[var1.field3436][var1.field3430]) { // L: 563
				this.field3391[var1.field3436][var1.field3430] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "8"
	)
	public static int method5728(int var0) {
		return var0 >>> 4 & class469.field4921; // L: 22
	}
}
