import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = -1282789779
	)
	static int field3361;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1964431473
	)
	int field3335;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -346441309
	)
	int field3336;
	@ObfuscatedName("ab")
	int[] field3337;
	@ObfuscatedName("an")
	int[] field3352;
	@ObfuscatedName("ao")
	int[] field3339;
	@ObfuscatedName("av")
	int[] field3340;
	@ObfuscatedName("aq")
	int[] field3341;
	@ObfuscatedName("ap")
	int[] field3334;
	@ObfuscatedName("ar")
	int[] field3343;
	@ObfuscatedName("ak")
	int[] field3360;
	@ObfuscatedName("ax")
	int[] field3338;
	@ObfuscatedName("at")
	int[] field3350;
	@ObfuscatedName("af")
	int[] field3347;
	@ObfuscatedName("ai")
	int[] field3348;
	@ObfuscatedName("aw")
	int[] field3353;
	@ObfuscatedName("aa")
	int[] field3342;
	@ObfuscatedName("ah")
	int[] field3351;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[Llp;"
	)
	MusicPatchNode[][] field3356;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[[Llp;"
	)
	MusicPatchNode[][] field3349;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bo")
	boolean field3355;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 873878831
	)
	@Export("track")
	int track;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1308416127
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = -1406500278912290481L
	)
	long field3358;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 3417130340268019577L
	)
	long field3359;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3335 = 256; // L: 14
		this.field3336 = 1000000; // L: 15
		this.field3337 = new int[16]; // L: 16
		this.field3352 = new int[16]; // L: 17
		this.field3339 = new int[16]; // L: 18
		this.field3340 = new int[16]; // L: 19
		this.field3341 = new int[16]; // L: 20
		this.field3334 = new int[16]; // L: 21
		this.field3343 = new int[16]; // L: 22
		this.field3360 = new int[16]; // L: 23
		this.field3338 = new int[16]; // L: 24
		this.field3350 = new int[16]; // L: 28
		this.field3347 = new int[16]; // L: 29
		this.field3348 = new int[16]; // L: 30
		this.field3353 = new int[16]; // L: 31
		this.field3342 = new int[16]; // L: 32
		this.field3351 = new int[16]; // L: 33
		this.field3356 = new MusicPatchNode[16][128]; // L: 34
		this.field3349 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5542(); // L: 46
	} // L: 47

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2026232471"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3335 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1058020738"
	)
	public int method5526() {
		return this.field3335; // L: 54
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Llh;Lne;Lbb;II)Z",
		garbageValue = "-1261281110"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5724(); // L: 58
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

			if (!var9.method5693(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1680529445"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 89
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1951099218"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("aq")
	protected synchronized int vmethod5700() {
		return 0; // L: 477
	}

	@ObfuscatedName("ap")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field3336 * -727379968 / PcmPlayer.field292; // L: 482

			do {
				long var5 = this.field3358 + (long)var4 * (long)var3; // L: 484
				if (this.field3359 - var5 >= 0L) { // L: 485
					this.field3358 = var5; // L: 486
					break;
				}

				int var7 = (int)((this.field3359 - this.field3358 + (long)var4 - 1L) / (long)var4); // L: 489
				this.field3358 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method5555(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llh;ZB)V",
		garbageValue = "-41"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field3355 = var2; // L: 99
		this.field3358 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field3359 = this.midiFile.method5655(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("ak")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field3336 * -727379968 / PcmPlayer.field292; // L: 503

			do {
				long var3 = this.field3358 + (long)var1 * (long)var2; // L: 505
				if (this.field3359 - var3 >= 0L) { // L: 506
					this.field3358 = var3; // L: 507
					break;
				}

				int var5 = (int)((this.field3359 - this.field3358 + (long)var2 - 1L) / (long)var2); // L: 510
				this.field3358 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method5555(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1515299645"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method5542(); // L: 114
	} // L: 115

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1455017401"
	)
	public synchronized void method5530(int var1, int var2) {
		this.method5531(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-6"
	)
	void method5531(int var1, int var2) {
		this.field3340[var1] = var2; // L: 126
		this.field3334[var1] = var2 & -128; // L: 127
		this.method5611(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	void method5611(int var1, int var2) {
		if (var2 != this.field3341[var1]) { // L: 132
			this.field3341[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field3349[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-164791979"
	)
	void method5637(int var1, int var2, int var3) {
		this.method5533(var1, var2, 64); // L: 139
		if ((this.field3350[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field3417 == var1 && var4.field3413 < 0) { // L: 142
					this.field3356[var1][var4.field3401] = null; // L: 143
					this.field3356[var1][var2] = var4; // L: 144
					int var8 = (var4.field3406 * var4.field3405 >> 12) + var4.field3404; // L: 145
					var4.field3404 += var2 - var4.field3401 << 8; // L: 146
					var4.field3405 = var8 - var4.field3404; // L: 147
					var4.field3406 = 4096; // L: 148
					var4.field3401 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3341[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field3417 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field3399 = var9.field3378[var2]; // L: 162
				var6.field3396 = var9.field3382[var2]; // L: 163
				var6.field3401 = var2; // L: 164
				var6.field3416 = var3 * var3 * var9.field3383[var2] * var9.field3381 + 1024 >> 11; // L: 165
				var6.field3403 = var9.field3380[var2] & 255; // L: 166
				var6.field3404 = (var2 << 8) - (var9.field3379[var2] & 32767); // L: 167
				var6.field3402 = 0; // L: 168
				var6.field3408 = 0; // L: 169
				var6.field3409 = 0; // L: 170
				var6.field3413 = -1; // L: 171
				var6.field3411 = 0; // L: 172
				if (this.field3353[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method866(var5, this.method5547(var6), this.method5548(var6), this.method5549(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method866(var5, this.method5547(var6), 0, this.method5549(var6)); // L: 177
					this.method5593(var6, var9.field3379[var2] < 0); // L: 178
				}

				if (var9.field3379[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3396 >= 0) { // L: 181
					MusicPatchNode var7 = this.field3349[var1][var6.field3396]; // L: 182
					if (var7 != null && var7.field3413 < 0) { // L: 183
						this.field3356[var1][var7.field3401] = null; // L: 184
						var7.field3413 = 0; // L: 185
					}

					this.field3349[var1][var6.field3396] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field3356[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Llp;ZB)V",
		garbageValue = "109"
	)
	void method5593(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field269) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field3353[var1.field3417] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method875(); // L: 202
			}
		} else {
			var4 = (int)((long)this.field3353[var1.field3417] * (long)var3 >> 6); // L: 206
		}

		var1.stream.method964(var4); // L: 208
	} // L: 209

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2075556238"
	)
	void method5533(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3356[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field3356[var1][var2] = null; // L: 214
			if ((this.field3350[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var4.field3417 == var5.field3417 && var5.field3413 < 0 && var4 != var5) { // L: 217
						var4.field3413 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field3413 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2110724161"
	)
	void method5536(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-11303"
	)
	void method5537(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1657999339"
	)
	void method5538(int var1, int var2) {
		this.field3343[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-23831"
	)
	void method5535(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field3417 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method879(PcmPlayer.field292 / 100); // L: 239
					if (var2.stream.method1018()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5736(); // L: 241
				}

				if (var2.field3413 < 0) { // L: 243
					this.field3356[var2.field3417][var2.field3401] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-569264191"
	)
	void method5588(int var1) {
		if (var1 >= 0) { // L: 250
			this.field3337[var1] = 12800; // L: 254
			this.field3352[var1] = 8192; // L: 255
			this.field3339[var1] = 16383; // L: 256
			this.field3343[var1] = 8192; // L: 257
			this.field3360[var1] = 0; // L: 258
			this.field3338[var1] = 8192; // L: 259
			this.method5570(var1); // L: 260
			this.method5544(var1); // L: 261
			this.field3350[var1] = 0; // L: 262
			this.field3347[var1] = 32767; // L: 263
			this.field3348[var1] = 256; // L: 264
			this.field3353[var1] = 0; // L: 265
			this.method5546(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method5588(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1716555008"
	)
	void method5534(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field3417 == var1) && var2.field3413 < 0) { // L: 271 272
				this.field3356[var2.field3417][var2.field3401] = null; // L: 273
				var2.field3413 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-434781812"
	)
	void method5542() {
		this.method5535(-1); // L: 281
		this.method5588(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3341[var1] = this.field3340[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field3334[var1] = this.field3340[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	void method5570(int var1) {
		if ((this.field3350[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field3417 == var1 && this.field3356[var1][var2.field3401] == null && var2.field3413 < 0) { // L: 290 291
					var2.field3413 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1624323475"
	)
	void method5544(int var1) {
		if ((this.field3350[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field3417 == var1) { // L: 300
					var2.field3410 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "25010659"
	)
	void method5545(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method5533(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method5637(var3, var4, var5);
			} else {
				this.method5533(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method5536(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field3334[var3] = (var5 << 14) + (this.field3334[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field3334[var3] = (var5 << 7) + (this.field3334[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field3360[var3] = (var5 << 7) + (this.field3360[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field3360[var3] = var5 + (this.field3360[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field3338[var3] = (var5 << 7) + (this.field3338[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field3338[var3] = var5 + (this.field3338[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field3337[var3] = (var5 << 7) + (this.field3337[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field3337[var3] = var5 + (this.field3337[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field3352[var3] = (var5 << 7) + (this.field3352[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field3352[var3] = var5 + (this.field3352[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field3339[var3] = (var5 << 7) + (this.field3339[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field3339[var3] = var5 + (this.field3339[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field3350;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3350; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field3350;
					var10000[var3] |= 2;
				} else {
					this.method5570(var3); // L: 352
					var10000 = this.field3350; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field3347[var3] = (var5 << 7) + (this.field3347[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field3347[var3] = (this.field3347[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field3347[var3] = (var5 << 7) + (this.field3347[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field3347[var3] = (this.field3347[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method5535(var3);
			}

			if (var4 == 121) { // L: 361
				this.method5588(var3);
			}

			if (var4 == 123) { // L: 362
				this.method5534(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field3347[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field3348[var3] = (var5 << 7) + (this.field3348[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field3347[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field3348[var3] = var5 + (this.field3348[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field3353[var3] = (var5 << 7) + (this.field3353[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field3353[var3] = var5 + (this.field3353[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field3350;
					var10000[var3] |= 4;
				} else {
					this.method5544(var3); // L: 376
					var10000 = this.field3350; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5546(var3, (var5 << 7) + (this.field3342[var3] & -16257)); // L: 380
			}

			if (var4 == 49) { // L: 381
				this.method5546(var3, var5 + (this.field3342[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method5611(var3, var4 + this.field3334[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method5537(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method5538(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method5542(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method5546(int var1, int var2) {
		this.field3342[var1] = var2; // L: 410
		this.field3351[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)I",
		garbageValue = "0"
	)
	int method5547(MusicPatchNode var1) {
		int var2 = (var1.field3405 * var1.field3406 >> 12) + var1.field3404; // L: 415
		var2 += (this.field3343[var1.field3417] - 8192) * this.field3348[var1.field3417] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field3399; // L: 417
		int var4;
		if (var3.field3313 > 0 && (var3.field3320 > 0 || this.field3360[var1.field3417] > 0)) { // L: 418
			var4 = var3.field3320 << 2; // L: 419
			int var5 = var3.field3317 << 1; // L: 420
			if (var1.field3412 < var5) { // L: 421
				var4 = var4 * var1.field3412 / var5;
			}

			var4 += this.field3360[var1.field3417] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3400 & 511)); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field292 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Llp;B)I",
		garbageValue = "0"
	)
	int method5548(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3399; // L: 431
		int var3 = this.field3339[var1.field3417] * this.field3337[var1.field3417] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field3416 + 16384 >> 15; // L: 434
		var3 = var3 * this.field3335 + 128 >> 8; // L: 435
		if (var2.field3315 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3315 * 1.953125E-5D * (double)(var1.field3402 * 128)) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3319 != null) { // L: 439
			var4 = var1.field3408; // L: 440
			var5 = var2.field3319[var1.field3409 * 4 + 1]; // L: 441
			if (var1.field3409 * 4 < var2.field3319.length - 2) { // L: 442
				var6 = (var2.field3319[var1.field3409 * 4] & 255) << 8; // L: 443
				var7 = (var2.field3319[var1.field3409 * 4 + 2] & 255) << 8; // L: 444
				var5 += (var2.field3319[var1.field3409 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 445
			}

			var3 = var5 * var3 + 32 >> 6; // L: 447
		}

		if (var1.field3413 > 0 && var2.field3314 != null) { // L: 449
			var4 = var1.field3413; // L: 450
			var5 = var2.field3314[var1.field3411 * 4 + 1]; // L: 451
			if (var1.field3411 * 4 < var2.field3314.length - 2) { // L: 452
				var6 = (var2.field3314[var1.field3411 * 4] & 255) << 8; // L: 453
				var7 = (var2.field3314[var1.field3411 * 4 + 2] & 255) << 8; // L: 454
				var5 += (var2.field3314[var1.field3411 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var5 * var3 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)I",
		garbageValue = "-1478359391"
	)
	int method5549(MusicPatchNode var1) {
		int var2 = this.field3352[var1.field3417]; // L: 463
		return var2 < 8192 ? var2 * var1.field3403 + 32 >> 6 : 16384 - ((128 - var1.field3403) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1307"
	)
	void method5555() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field3359; var2 == this.trackLength; var3 = this.midiFile.method5655(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field3355 || var2 == 0) { // L: 533
							this.method5542(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method5545(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field3359 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)Z",
		garbageValue = "-561025908"
	)
	boolean method5556(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field3413 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) { // L: 558
					this.field3349[var1.field3417][var1.field3396] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Llp;[IIII)Z",
		garbageValue = "-189241326"
	)
	boolean method5557(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3415 = PcmPlayer.field292 / 100; // L: 568
		if (var1.field3413 < 0 || var1.stream != null && !var1.stream.method923()) { // L: 569
			int var5 = var1.field3406; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3338[var1.field3417]) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field3406 = var5; // L: 581
			}

			var1.stream.method880(this.method5547(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field3399; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3412; // L: 586
			var1.field3400 += var6.field3313; // L: 587
			double var8 = 5.086263020833333E-6D * (double)((var1.field3401 - 60 << 8) + (var1.field3405 * var1.field3406 >> 12)); // L: 588
			if (var6.field3315 > 0) { // L: 589
				if (var6.field3318 > 0) { // L: 590
					var1.field3402 = var1.field3402 * -1797767168 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3318 * var8) + 0.5D) * 153727104;
				} else {
					var1.field3402 = var1.field3402 * -1797767168 + -1797767168; // L: 591
				}
			}

			if (var6.field3319 != null) { // L: 593
				if (var6.field3316 > 0) { // L: 594
					var1.field3408 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3316) + 0.5D);
				} else {
					var1.field3408 += 128; // L: 595
				}

				while (var1.field3409 * 4 < var6.field3319.length - 2 && var1.field3408 > (var6.field3319[var1.field3409 * 4 + 2] & 255) << 8) { // L: 596
					var1.field3409 = var1.field3409 * 4 + 2;
				}

				if (var1.field3409 * 4 == var6.field3319.length - 2 && var6.field3319[var1.field3409 * 4 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field3413 >= 0 && var6.field3314 != null && (this.field3350[var1.field3417] & 1) == 0 && (var1.field3396 < 0 || var1 != this.field3349[var1.field3417][var1.field3396])) { // L: 599 600
				if (var6.field3321 > 0) { // L: 601
					var1.field3413 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3321) + 0.5D);
				} else {
					var1.field3413 += 128; // L: 602
				}

				while (var1.field3411 * 4 < var6.field3314.length - 2 && var1.field3413 > (var6.field3314[var1.field3411 * 4 + 2] & 255) << 8) { // L: 603
					var1.field3411 = var1.field3411 * 4 + 2;
				}

				if (var1.field3411 * 4 == var6.field3314.length - 2) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method879(var1.field3415); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method1018()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5736(); // L: 612
				if (var1.field3413 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) { // L: 615
						this.field3349[var1.field3417][var1.field3396] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method878(var1.field3415, this.method5548(var1), this.method5549(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method5736(); // L: 570
			var1.remove(); // L: 571
			if (var1.field3396 > 0 && var1 == this.field3349[var1.field3417][var1.field3396]) { // L: 572
				this.field3349[var1.field3417][var1.field3396] = null; // L: 573
			}

			return true; // L: 575
		}
	}
}
