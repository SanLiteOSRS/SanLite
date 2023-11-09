import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lm")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bj")
	static AtomicBoolean field3418;
	@ObfuscatedName("bf")
	static ThreadPoolExecutor field3437;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 225356373
	)
	int field3409;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1388472512
	)
	int field3410;
	@ObfuscatedName("aw")
	int[] field3411;
	@ObfuscatedName("ay")
	int[] field3412;
	@ObfuscatedName("ap")
	int[] field3414;
	@ObfuscatedName("av")
	int[] field3423;
	@ObfuscatedName("an")
	int[] field3415;
	@ObfuscatedName("au")
	int[] field3436;
	@ObfuscatedName("az")
	int[] field3417;
	@ObfuscatedName("ab")
	int[] field3416;
	@ObfuscatedName("ao")
	int[] field3419;
	@ObfuscatedName("af")
	int[] field3420;
	@ObfuscatedName("ae")
	int[] field3413;
	@ObfuscatedName("al")
	int[] field3422;
	@ObfuscatedName("aq")
	int[] field3421;
	@ObfuscatedName("ah")
	int[] field3424;
	@ObfuscatedName("ak")
	int[] field3429;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[Lmh;"
	)
	MusicPatchNode[][] field3426;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[[Lmh;"
	)
	MusicPatchNode[][] field3427;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("by")
	boolean field3408;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1537905545
	)
	@Export("track")
	int track;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 704448507
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = 2912679154200171941L
	)
	long field3432;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = -9188018337586354989L
	)
	long field3433;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bi")
	PriorityQueue field3435;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2113843295
	)
	public int field3434;

	static {
		field3418 = null; // L: 52
		field3437 = null; // L: 53
	}

	public MidiPcmStream() {
		this.field3409 = 256; // L: 22
		this.field3410 = -727379968; // L: 23
		this.field3411 = new int[16]; // L: 24
		this.field3412 = new int[16]; // L: 25
		this.field3414 = new int[16]; // L: 26
		this.field3423 = new int[16]; // L: 27
		this.field3415 = new int[16]; // L: 28
		this.field3436 = new int[16]; // L: 29
		this.field3417 = new int[16]; // L: 30
		this.field3416 = new int[16]; // L: 31
		this.field3419 = new int[16]; // L: 32
		this.field3420 = new int[16]; // L: 36
		this.field3413 = new int[16]; // L: 37
		this.field3422 = new int[16]; // L: 38
		this.field3421 = new int[16]; // L: 39
		this.field3424 = new int[16]; // L: 40
		this.field3429 = new int[16]; // L: 41
		this.field3426 = new MusicPatchNode[16][128]; // L: 42
		this.field3427 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3435 = new PriorityQueue(5, new class316()); // L: 51
		this.field3434 = 0; // L: 54
		this.musicPatches = new NodeHashTable(128); // L: 57
		this.method5849(); // L: 58
	} // L: 59

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1606640584"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3409 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "939750139"
	)
	public int method5887() {
		return this.field3409;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmb;Lnr;Lbx;I)Z",
		garbageValue = "-445428129"
	)
	public synchronized boolean method5829(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true;
		synchronized(this.field3435) {
			this.field3435.clear();
		}

		for (class318 var5 = (class318)var1.field3485.first(); var5 != null; var5 = (class318)var1.field3485.next()) { // L: 74
			int var12 = (int)var5.key; // L: 75
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12); // L: 76
			if (var7 == null) { // L: 77
				var7 = class163.method3418(var2, var12); // L: 78
				if (var7 == null) { // L: 79
					var4 = false; // L: 80
					continue; // L: 81
				}

				this.musicPatches.put(var7, (long)var12); // L: 83
			}

			if (!var7.method6020(var3, var5.field3522)) {
				var4 = false; // L: 85
			} else if (this.field3435 != null) { // L: 86
				synchronized(this.field3435) { // L: 87
					Iterator var9 = var7.field3473.iterator(); // L: 88

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next(); // L: 89
						this.field3435.add(new class309(var5.field3524, var10)); // L: 91
					}
				}
			}
		}

		return var4; // L: 97
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-90335056"
	)
	public void method5830() {
		if (this.field3435 != null) { // L: 101
			if (field3418 != null) { // L: 104
				field3418.set(true); // L: 105
			}

			field3418 = new AtomicBoolean(false); // L: 107
			AtomicBoolean var1 = field3418; // L: 108
			if (field3437 == null) { // L: 109
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 110
				field3437 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class308(this)); // L: 111
			}

			field3437.submit(new class312(this, var1)); // L: 118
		}
	} // L: 102

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1242002917"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 137
			var1.clear();
		}

	} // L: 138

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 522
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 526
	}

	@ObfuscatedName("an")
	protected synchronized int vmethod6035() {
		return 0; // L: 530
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 534
			int var4 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field271; // L: 535

			do {
				long var5 = this.field3432 + (long)var3 * (long)var4; // L: 537
				if (this.field3433 - var5 >= 0L) { // L: 538
					this.field3432 = var5; // L: 539
					break;
				}

				int var7 = (int)((this.field3433 - this.field3432 + (long)var4 - 1L) / (long)var4); // L: 542
				this.field3432 += (long)var7 * (long)var4; // L: 543
				this.patchStream.fill(var1, var2, var7); // L: 544
				var2 += var7; // L: 545
				var3 -= var7; // L: 546
				this.method5861(); // L: 547
			} while(this.midiFile.isReady()); // L: 548
		}

		this.patchStream.fill(var1, var2, var3); // L: 551
	} // L: 552

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2132125430"
	)
	public synchronized void method5832() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 141
			var1.remove();
		}

	} // L: 142

	@ObfuscatedName("ab")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 555
			int var2 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field271; // L: 556

			do {
				long var3 = (long)var1 * (long)var2 + this.field3432; // L: 558
				if (this.field3433 - var3 >= 0L) { // L: 559
					this.field3432 = var3; // L: 560
					break;
				}

				int var5 = (int)((this.field3433 - this.field3432 + (long)var2 - 1L) / (long)var2); // L: 563
				this.field3432 += (long)var2 * (long)var5; // L: 564
				this.patchStream.skip(var5); // L: 565
				var1 -= var5; // L: 566
				this.method5861(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.skip(var1); // L: 571
	} // L: 572

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmb;ZI)V",
		garbageValue = "-2066735342"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 145
		this.midiFile.parse(var1.midi); // L: 146
		this.field3408 = var2; // L: 147
		this.field3432 = 0L; // L: 148
		int var3 = this.midiFile.trackCount(); // L: 149

		for (int var4 = 0; var4 < var3; ++var4) { // L: 150
			this.midiFile.gotoTrack(var4); // L: 151
			this.midiFile.readTrackLength(var4); // L: 152
			this.midiFile.markTrackPosition(var4); // L: 153
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 155
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 156
		this.field3433 = this.midiFile.method5973(this.trackLength); // L: 157
	} // L: 158

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1870653879"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 161
		this.method5849(); // L: 162
	} // L: 163

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-87"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 166
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001505651"
	)
	public synchronized boolean method5850() {
		return this.musicPatches.load() > 0; // L: 170
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-305429865"
	)
	public synchronized void method5837(int var1, int var2) {
		this.method5852(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "493149003"
	)
	void method5852(int var1, int var2) {
		this.field3423[var1] = var2; // L: 178
		this.field3436[var1] = var2 & -128; // L: 179
		this.method5929(var1, var2); // L: 180
	} // L: 181

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	void method5929(int var1, int var2) {
		if (var2 != this.field3415[var1]) { // L: 184
			this.field3415[var1] = var2; // L: 185

			for (int var3 = 0; var3 < 128; ++var3) { // L: 186
				this.field3427[var1][var3] = null;
			}
		}

	} // L: 188

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-12"
	)
	void method5840(int var1, int var2, int var3) {
		this.method5842(var1, var2, 64); // L: 191
		if ((this.field3420[var1] & 2) != 0) { // L: 192
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 193
				if (var4.field3486 == var1 && var4.field3503 < 0) { // L: 194
					this.field3426[var1][var4.field3491] = null; // L: 195
					this.field3426[var1][var2] = var4; // L: 196
					int var8 = (var4.field3496 * var4.field3500 >> 12) + var4.field3494; // L: 197
					var4.field3494 += var2 - var4.field3491 << 8; // L: 198
					var4.field3500 = var8 - var4.field3494; // L: 199
					var4.field3496 = 4096; // L: 200
					var4.field3491 = var2; // L: 201
					return; // L: 202
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3415[var1]); // L: 206
		if (var9 != null) { // L: 207
			if (var9.rawSounds[var2] != null) { // L: 208
				RawSound var5 = var9.rawSounds[var2].method1099(); // L: 209
				if (var5 != null) { // L: 210
					MusicPatchNode var6 = new MusicPatchNode(); // L: 211
					var6.field3486 = var1; // L: 212
					var6.table = var9; // L: 213
					var6.rawSound = var5; // L: 214
					var6.field3489 = var9.field3466[var2]; // L: 215
					var6.field3490 = var9.field3472[var2]; // L: 216
					var6.field3491 = var2; // L: 217
					var6.field3492 = var3 * var3 * var9.field3467[var2] * var9.field3471 + 1024 >> 11; // L: 218
					var6.field3493 = var9.field3465[var2] & 255; // L: 219
					var6.field3494 = (var2 << 8) - (var9.field3470[var2] & 32767); // L: 220
					var6.field3497 = 0; // L: 221
					var6.field3498 = 0; // L: 222
					var6.field3507 = 0; // L: 223
					var6.field3503 = -1; // L: 224
					var6.field3501 = 0; // L: 225
					if (this.field3421[var1] == 0) { // L: 226
						var6.stream = RawPcmStream.method894(var5, this.method5916(var6), this.method5854(var6), this.method5855(var6)); // L: 227
					} else {
						var6.stream = RawPcmStream.method894(var5, this.method5916(var6), 0, this.method5855(var6)); // L: 230
						this.method5841(var6, var9.field3470[var2] < 0); // L: 231
					}

					if (var9.field3470[var2] < 0) { // L: 233
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3490 >= 0) { // L: 234
						MusicPatchNode var7 = this.field3427[var1][var6.field3490]; // L: 235
						if (var7 != null && var7.field3503 < 0) { // L: 236
							this.field3426[var1][var7.field3491] = null; // L: 237
							var7.field3503 = 0; // L: 238
						}

						this.field3427[var1][var6.field3490] = var6; // L: 240
					}

					this.patchStream.queue.addFirst(var6); // L: 242
					this.field3426[var1][var2] = var6; // L: 243
				}
			}
		}
	} // L: 244

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmh;ZI)V",
		garbageValue = "892951360"
	)
	void method5841(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 247
		int var4;
		if (var2 && var1.rawSound.field261) { // L: 249
			int var5 = var3 + var3 - var1.rawSound.start; // L: 250
			var4 = (int)((long)this.field3421[var1.field3486] * (long)var5 >> 6); // L: 251
			var3 <<= 8; // L: 252
			if (var4 >= var3) { // L: 253
				var4 = var3 + var3 - 1 - var4; // L: 254
				var1.stream.method908(); // L: 255
			}
		} else {
			var4 = (int)((long)this.field3421[var1.field3486] * (long)var3 >> 6); // L: 259
		}

		var1.stream.method902(var4); // L: 261
	} // L: 262

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2142127163"
	)
	void method5842(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3426[var1][var2]; // L: 265
		if (var4 != null) { // L: 266
			this.field3426[var1][var2] = null; // L: 267
			if ((this.field3420[var1] & 2) != 0) { // L: 268
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 269
					if (var4.field3486 == var5.field3486 && var5.field3503 < 0 && var4 != var5) { // L: 270
						var4.field3503 = 0; // L: 271
						break; // L: 272
					}
				}
			} else {
				var4.field3503 = 0; // L: 277
			}

		}
	} // L: 279

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-67"
	)
	void method5843(int var1, int var2, int var3) {
	} // L: 281

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "64"
	)
	void method5844(int var1, int var2) {
	} // L: 282

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "13"
	)
	void method5833(int var1, int var2) {
		this.field3417[var1] = var2; // L: 285
	} // L: 286

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method5846(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
			if (var1 < 0 || var2.field3486 == var1) { // L: 290
				if (var2.stream != null) { // L: 291
					var2.stream.method907(PcmPlayer.field271 / 100); // L: 292
					if (var2.stream.method911()) { // L: 293
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6061(); // L: 294
				}

				if (var2.field3503 < 0) { // L: 296
					this.field3426[var2.field3486][var2.field3491] = null;
				}

				var2.remove(); // L: 297
			}
		}

	} // L: 300

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1108969"
	)
	void method5876(int var1) {
		if (var1 >= 0) { // L: 303
			this.field3411[var1] = 12800; // L: 307
			this.field3412[var1] = 8192; // L: 308
			this.field3414[var1] = 16383; // L: 309
			this.field3417[var1] = 8192; // L: 310
			this.field3416[var1] = 0; // L: 311
			this.field3419[var1] = 8192; // L: 312
			this.method5856(var1); // L: 313
			this.method5948(var1); // L: 314
			this.field3420[var1] = 0; // L: 315
			this.field3413[var1] = 32767; // L: 316
			this.field3422[var1] = 256; // L: 317
			this.field3421[var1] = 0; // L: 318
			this.method5955(var1, 8192); // L: 319
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 304
				this.method5876(var1);
			}

		}
	} // L: 305 320

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
	)
	void method5898(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 323
			if ((var1 < 0 || var2.field3486 == var1) && var2.field3503 < 0) { // L: 324 325
				this.field3426[var2.field3486][var2.field3491] = null; // L: 326
				var2.field3503 = 0; // L: 327
			}
		}

	} // L: 331

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-210629883"
	)
	void method5849() {
		this.method5846(-1); // L: 334
		this.method5876(-1); // L: 335

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 336
			this.field3415[var1] = this.field3423[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 337
			this.field3436[var1] = this.field3423[var1] & -128;
		}

	} // L: 338

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "695561299"
	)
	void method5856(int var1) {
		if ((this.field3420[var1] & 2) != 0) { // L: 341
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 342
				if (var2.field3486 == var1 && this.field3426[var1][var2.field3491] == null && var2.field3503 < 0) { // L: 343 344
					var2.field3503 = 0;
				}
			}
		}

	} // L: 348

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1223403424"
	)
	void method5948(int var1) {
		if ((this.field3420[var1] & 4) != 0) { // L: 351
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 352
				if (var2.field3486 == var1) { // L: 353
					var2.field3487 = 0;
				}
			}
		}

	} // L: 356

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "659832066"
	)
	void method5949(int var1) {
		int var2 = var1 & 240; // L: 359
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 360
			var3 = var1 & 15; // L: 361
			var4 = var1 >> 8 & 127; // L: 362
			var5 = var1 >> 16 & 127; // L: 363
			this.method5842(var3, var4, var5); // L: 364
		} else if (var2 == 144) { // L: 367
			var3 = var1 & 15; // L: 368
			var4 = var1 >> 8 & 127; // L: 369
			var5 = var1 >> 16 & 127; // L: 370
			if (var5 > 0) { // L: 371
				this.method5840(var3, var4, var5);
			} else {
				this.method5842(var3, var4, 64); // L: 372
			}

		} else if (var2 == 160) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			var5 = var1 >> 16 & 127; // L: 378
			this.method5843(var3, var4, var5); // L: 379
		} else if (var2 == 176) { // L: 382
			var3 = var1 & 15; // L: 383
			var4 = var1 >> 8 & 127; // L: 384
			var5 = var1 >> 16 & 127; // L: 385
			if (var4 == 0) { // L: 386
				this.field3436[var3] = (var5 << 14) + (this.field3436[var3] & -2080769);
			}

			if (var4 == 32) { // L: 387
				this.field3436[var3] = (var5 << 7) + (this.field3436[var3] & -16257);
			}

			if (var4 == 1) { // L: 388
				this.field3416[var3] = (var5 << 7) + (this.field3416[var3] & -16257);
			}

			if (var4 == 33) { // L: 389
				this.field3416[var3] = var5 + (this.field3416[var3] & -128);
			}

			if (var4 == 5) { // L: 390
				this.field3419[var3] = (var5 << 7) + (this.field3419[var3] & -16257);
			}

			if (var4 == 37) { // L: 391
				this.field3419[var3] = var5 + (this.field3419[var3] & -128);
			}

			if (var4 == 7) { // L: 392
				this.field3411[var3] = (var5 << 7) + (this.field3411[var3] & -16257);
			}

			if (var4 == 39) { // L: 393
				this.field3411[var3] = var5 + (this.field3411[var3] & -128);
			}

			if (var4 == 10) { // L: 394
				this.field3412[var3] = (var5 << 7) + (this.field3412[var3] & -16257);
			}

			if (var4 == 42) { // L: 395
				this.field3412[var3] = var5 + (this.field3412[var3] & -128);
			}

			if (var4 == 11) { // L: 396
				this.field3414[var3] = (var5 << 7) + (this.field3414[var3] & -16257);
			}

			if (var4 == 43) { // L: 397
				this.field3414[var3] = var5 + (this.field3414[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 398
				if (var5 >= 64) { // L: 399
					var10000 = this.field3420;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3420; // L: 400
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 402
				if (var5 >= 64) { // L: 403
					var10000 = this.field3420;
					var10000[var3] |= 2;
				} else {
					this.method5856(var3); // L: 405
					var10000 = this.field3420; // L: 406
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 409
				this.field3413[var3] = (var5 << 7) + (this.field3413[var3] & 127);
			}

			if (var4 == 98) { // L: 410
				this.field3413[var3] = (this.field3413[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 411
				this.field3413[var3] = (var5 << 7) + (this.field3413[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 412
				this.field3413[var3] = (this.field3413[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 413
				this.method5846(var3);
			}

			if (var4 == 121) { // L: 414
				this.method5876(var3);
			}

			if (var4 == 123) { // L: 415
				this.method5898(var3);
			}

			int var6;
			if (var4 == 6) { // L: 416
				var6 = this.field3413[var3]; // L: 417
				if (var6 == 16384) { // L: 418
					this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 420
				var6 = this.field3413[var3]; // L: 421
				if (var6 == 16384) { // L: 422
					this.field3422[var3] = var5 + (this.field3422[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 424
				this.field3421[var3] = (var5 << 7) + (this.field3421[var3] & -16257);
			}

			if (var4 == 48) { // L: 425
				this.field3421[var3] = var5 + (this.field3421[var3] & -128);
			}

			if (var4 == 81) { // L: 426
				if (var5 >= 64) { // L: 427
					var10000 = this.field3420;
					var10000[var3] |= 4;
				} else {
					this.method5948(var3); // L: 429
					var10000 = this.field3420;
					var10000[var3] &= -5; // L: 430
				}
			}

			if (var4 == 17) { // L: 433
				this.method5955(var3, (var5 << 7) + (this.field3424[var3] & -16257));
			}

			if (var4 == 49) { // L: 434
				this.method5955(var3, var5 + (this.field3424[var3] & -128));
			}

		} else if (var2 == 192) { // L: 437
			var3 = var1 & 15; // L: 438
			var4 = var1 >> 8 & 127; // L: 439
			this.method5929(var3, var4 + this.field3436[var3]); // L: 440
		} else if (var2 == 208) { // L: 443
			var3 = var1 & 15; // L: 444
			var4 = var1 >> 8 & 127; // L: 445
			this.method5844(var3, var4); // L: 446
		} else if (var2 == 224) { // L: 449
			var3 = var1 & 15; // L: 450
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 451
			this.method5833(var3, var4); // L: 452
		} else {
			var2 = var1 & 255; // L: 455
			if (var2 == 255) { // L: 456
				this.method5849(); // L: 457
			}
		}
	} // L: 365 373 380 435 441 447 453 458 460

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "108"
	)
	void method5955(int var1, int var2) {
		this.field3424[var1] = var2; // L: 463
		this.field3429[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 464
	} // L: 465

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmh;B)I",
		garbageValue = "-63"
	)
	int method5916(MusicPatchNode var1) {
		int var2 = (var1.field3496 * var1.field3500 >> 12) + var1.field3494; // L: 468
		var2 += (this.field3417[var1.field3486] - 8192) * this.field3422[var1.field3486] >> 12; // L: 469
		MusicPatchNode2 var3 = var1.field3489; // L: 470
		int var4;
		if (var3.field3386 > 0 && (var3.field3389 > 0 || this.field3416[var1.field3486] > 0)) { // L: 471
			var4 = var3.field3389 << 2; // L: 472
			int var5 = var3.field3383 << 1; // L: 473
			if (var1.field3495 < var5) { // L: 474
				var4 = var4 * var1.field3495 / var5;
			}

			var4 += this.field3416[var1.field3486] >> 7; // L: 475
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3505 & 511)); // L: 476
			var2 += (int)(var6 * (double)var4); // L: 477
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field271 + 0.5D); // L: 479
		return var4 < 1 ? 1 : var4; // L: 480
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)I",
		garbageValue = "-583109755"
	)
	int method5854(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3489; // L: 484
		int var3 = this.field3411[var1.field3486] * this.field3414[var1.field3486] + 4096 >> 13; // L: 485
		var3 = var3 * var3 + 16384 >> 15; // L: 486
		var3 = var3 * var1.field3492 + 16384 >> 15; // L: 487
		var3 = var3 * this.field3409 + 128 >> 8; // L: 488
		if (var2.field3385 > 0) { // L: 489
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3497 * 1.953125E-5D * (double)var2.field3385) + 0.5D); // L: 490
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3391 != null) { // L: 492
			var4 = var1.field3498; // L: 493
			var5 = var2.field3391[var1.field3507 * 2 + 1]; // L: 494
			if (var1.field3507 * 2 < var2.field3391.length - 2) { // L: 495
				var6 = (var2.field3391[var1.field3507 * 2] & 255) << 8; // L: 496
				var7 = (var2.field3391[var1.field3507 * 2 + 2] & 255) << 8; // L: 497
				var5 += (var4 - var6) * (var2.field3391[var1.field3507 * 2 + 3] - var5) / (var7 - var6); // L: 498
			}

			var3 = var5 * var3 + 32 >> 6; // L: 500
		}

		if (var1.field3503 > 0 && var2.field3384 != null) { // L: 502
			var4 = var1.field3503; // L: 503
			var5 = var2.field3384[var1.field3501 * 4 + 1]; // L: 504
			if (var1.field3501 * 4 < var2.field3384.length - 2) { // L: 505
				var6 = (var2.field3384[var1.field3501 * 4] & 255) << 8; // L: 506
				var7 = (var2.field3384[var1.field3501 * 4 + 2] & 255) << 8; // L: 507
				var5 += (var2.field3384[var1.field3501 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 508
			}

			var3 = var3 * var5 + 32 >> 6; // L: 510
		}

		return var3; // L: 512
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)I",
		garbageValue = "164299352"
	)
	int method5855(MusicPatchNode var1) {
		int var2 = this.field3412[var1.field3486]; // L: 516
		return var2 < 8192 ? var2 * var1.field3493 + 32 >> 6 : 16384 - ((128 - var1.field3493) * (16384 - var2) + 32 >> 6); // L: 517 518
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1359637831"
	)
	void method5861() {
		int var1 = this.track; // L: 575
		int var2 = this.trackLength; // L: 576

		long var3;
		for (var3 = this.field3433; var2 == this.trackLength; var3 = this.midiFile.method5973(var2)) { // L: 577 578 600
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 579
				this.midiFile.gotoTrack(var1); // L: 580
				int var5 = this.midiFile.readMessage(var1); // L: 581
				if (var5 == 1) { // L: 582
					this.midiFile.setTrackDone(); // L: 583
					this.midiFile.markTrackPosition(var1); // L: 584
					if (this.midiFile.isDone()) { // L: 585
						if (!this.field3408 || var2 == 0) { // L: 586
							this.method5849(); // L: 590
							this.midiFile.clear(); // L: 591
							return; // L: 592
						}

						this.midiFile.reset(var3); // L: 587
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 594
					this.method5949(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 595
				this.midiFile.markTrackPosition(var1); // L: 596
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 598
			var2 = this.midiFile.trackLengths[var1]; // L: 599
		}

		this.track = var1; // L: 602
		this.trackLength = var2; // L: 603
		this.field3433 = var3; // L: 604
	} // L: 605

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lmh;I)Z",
		garbageValue = "-1622138956"
	)
	boolean method5862(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 608
			if (var1.field3503 >= 0) { // L: 609
				var1.remove(); // L: 610
				if (var1.field3490 > 0 && var1 == this.field3427[var1.field3486][var1.field3490]) { // L: 611
					this.field3427[var1.field3486][var1.field3490] = null; // L: 612
				}
			}

			return true; // L: 615
		} else {
			return false; // L: 617
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmh;[IIII)Z",
		garbageValue = "2082169658"
	)
	boolean method5890(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3506 = PcmPlayer.field271 / 100; // L: 621
		if (var1.field3503 < 0 || var1.stream != null && !var1.stream.method1002()) { // L: 622
			int var5 = var1.field3496; // L: 630
			if (var5 > 0) { // L: 631
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3419[var1.field3486]) + 0.5D); // L: 632
				if (var5 < 0) { // L: 633
					var5 = 0;
				}

				var1.field3496 = var5; // L: 634
			}

			var1.stream.method948(this.method5916(var1)); // L: 636
			MusicPatchNode2 var6 = var1.field3489; // L: 637
			boolean var7 = false; // L: 638
			++var1.field3495; // L: 639
			var1.field3505 += var6.field3386; // L: 640
			double var8 = 5.086263020833333E-6D * (double)((var1.field3491 - 60 << 8) + (var1.field3500 * var1.field3496 >> 12)); // L: 641
			if (var6.field3385 > 0) { // L: 642
				if (var6.field3388 > 0) { // L: 643
					var1.field3497 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3388 * var8) + 0.5D);
				} else {
					var1.field3497 += 128; // L: 644
				}
			}

			if (var6.field3391 != null) { // L: 646
				if (var6.field3390 > 0) { // L: 647
					var1.field3498 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3390) + 0.5D);
				} else {
					var1.field3498 += 128; // L: 648
				}

				while (var1.field3507 * 2 < var6.field3391.length - 2 && var1.field3498 > (var6.field3391[var1.field3507 * 2 + 2] & 255) << 8) { // L: 649
					var1.field3507 = var1.field3507 * 4 + 4;
				}

				if (var1.field3507 * 2 == var6.field3391.length - 2 && var6.field3391[var1.field3507 * 2 + 1] == 0) { // L: 650
					var7 = true;
				}
			}

			if (var1.field3503 >= 0 && var6.field3384 != null && (this.field3420[var1.field3486] & 1) == 0 && (var1.field3490 < 0 || var1 != this.field3427[var1.field3486][var1.field3490])) { // L: 652 653
				if (var6.field3387 > 0) { // L: 654
					var1.field3503 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3387 * var8) + 0.5D);
				} else {
					var1.field3503 += 128; // L: 655
				}

				while (var1.field3501 * 4 < var6.field3384.length - 2 && var1.field3503 > (var6.field3384[var1.field3501 * 4 + 2] & 255) << 8) { // L: 656
					var1.field3501 = var1.field3501 * 4 + 2;
				}

				if (var1.field3501 * 4 == var6.field3384.length - 2) { // L: 657
					var7 = true;
				}
			}

			if (var7) { // L: 660
				var1.stream.method907(var1.field3506); // L: 661
				if (var2 != null) { // L: 662
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 663
				}

				if (var1.stream.method911()) { // L: 664
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6061(); // L: 665
				if (var1.field3503 >= 0) { // L: 666
					var1.remove(); // L: 667
					if (var1.field3490 > 0 && var1 == this.field3427[var1.field3486][var1.field3490]) { // L: 668
						this.field3427[var1.field3486][var1.field3490] = null; // L: 669
					}
				}

				return true; // L: 672
			} else {
				var1.stream.method1030(var1.field3506, this.method5854(var1), this.method5855(var1)); // L: 674
				return false; // L: 675
			}
		} else {
			var1.method6061(); // L: 623
			var1.remove(); // L: 624
			if (var1.field3490 > 0 && var1 == this.field3427[var1.field3486][var1.field3490]) { // L: 625
				this.field3427[var1.field3486][var1.field3490] = null; // L: 626
			}

			return true; // L: 628
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1838965374"
	)
	static void method5959() {
		Tiles.field1018 = null; // L: 61
		Tiles.field1033 = null; // L: 62
		class53.field367 = null; // L: 63
		Tiles.field1019 = null; // L: 64
		WorldMapCacheName.field3059 = null; // L: 65
		class350.field3891 = null; // L: 66
		Tiles.field1021 = null; // L: 67
		class509.Tiles_hue = null; // L: 68
		GrandExchangeOfferNameComparator.Tiles_saturation = null; // L: 69
		class350.Tiles_lightness = null; // L: 70
		class27.Tiles_hueMultiplier = null; // L: 71
		class59.field430 = null; // L: 72
	} // L: 73

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2036584600"
	)
	public static boolean method5958() {
		if (!class305.field3393.isEmpty()) { // L: 128
			return true; // L: 129
		} else {
			return !class305.field3397.isEmpty() && class305.field3397.get(0) != null && ((class317)class305.field3397.get(0)).field3511 != null ? ((class317)class305.field3397.get(0)).field3511.isReady() : false; // L: 131 132 134
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1524507890"
	)
	static int method5960(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 3242
			if (Skeleton.guestClanSettings != null) { // L: 3243
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3244
				class305.field3406 = Skeleton.guestClanSettings; // L: 3245
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3247
			}

			return 1; // L: 3248
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 3250
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3251
				if (Client.currentClanSettings[var3] != null) { // L: 3252
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3253
					class305.field3406 = Client.currentClanSettings[var3]; // L: 3254
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3256
				}

				return 1; // L: 3257
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 3259
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class305.field3406.name; // L: 3260
				return 1; // L: 3261
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 3263
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.allowGuests ? 1 : 0; // L: 3264
				return 1; // L: 3265
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 3267
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1723; // L: 3268
				return 1; // L: 3269
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 3271
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1725; // L: 3272
				return 1; // L: 3273
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 3275
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1727; // L: 3276
				return 1; // L: 3277
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 3279
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1715; // L: 3280
				return 1; // L: 3281
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 3283
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.memberCount; // L: 3284
				return 1; // L: 3285
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 3287
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3288
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class305.field3406.memberNames[var3]; // L: 3289
				return 1; // L: 3290
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 3292
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3293
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.memberRanks[var3]; // L: 3294
				return 1; // L: 3295
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 3297
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.bannedMemberCount; // L: 3298
				return 1; // L: 3299
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 3301
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3302
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class305.field3406.bannedMemberNames[var3]; // L: 3303
				return 1; // L: 3304
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 3306
					Interpreter.Interpreter_intStackSize -= 3; // L: 3307
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3308
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3309
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3310
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.method3342(var3, var6, var5); // L: 3311
					return 1; // L: 3312
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 3314
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.currentOwner; // L: 3315
					return 1; // L: 3316
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 3318
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1735; // L: 3319
					return 1; // L: 3320
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 3322
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.method3289(Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]); // L: 3323
					return 1; // L: 3324
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 3326
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class305.field3406.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3327
					return 1; // L: 3328
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 3330
					Interpreter.Interpreter_intStackSize -= 2; // L: 3331
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3332
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3333
					class165.method3442(var6, var3); // L: 3334
					return 1; // L: 3335
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 3337
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3338
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1732[var3]; // L: 3339
					return 1; // L: 3340
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 3342
						Interpreter.Interpreter_intStackSize -= 3; // L: 3343
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3344
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 3345
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3346
						class344.method6652(var5, var3, var4); // L: 3347
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 3349
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3350
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class305.field3406.field1733[var3] ? 1 : 0; // L: 3351
						return 1; // L: 3352
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 3354
						if (class9.guestClanChannel != null) { // L: 3355
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3356
							WorldMapArchiveLoader.field4876 = class9.guestClanChannel; // L: 3357
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3359
						}

						return 1; // L: 3360
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 3362
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3363
						if (Client.currentClanChannels[var3] != null) { // L: 3364
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 3365
							WorldMapArchiveLoader.field4876 = Client.currentClanChannels[var3]; // L: 3366
							class152.field1701 = var3; // L: 3367
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3369
						}

						return 1; // L: 3370
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 3372
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = WorldMapArchiveLoader.field4876.name; // L: 3373
						return 1; // L: 3374
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 3376
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.field4876.field1780; // L: 3377
						return 1; // L: 3378
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 3380
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.field4876.field1787; // L: 3381
						return 1; // L: 3382
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 3384
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.field4876.method3423(); // L: 3385
						return 1; // L: 3386
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 3388
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3389
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ((ClanChannelMember)WorldMapArchiveLoader.field4876.members.get(var3)).username.getName(); // L: 3390
						return 1; // L: 3391
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 3393
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3394
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapArchiveLoader.field4876.members.get(var3)).rank; // L: 3395
						return 1; // L: 3396
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 3398
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3399
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)WorldMapArchiveLoader.field4876.members.get(var3)).world; // L: 3400
						return 1; // L: 3401
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 3403
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3404
						class141.method3192(class152.field1701, var3); // L: 3405
						return 1; // L: 3406
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 3408
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.field4876.method3424(Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]); // L: 3409
						return 1; // L: 3410
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 3412
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.field4876.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 3413
						return 1; // L: 3414
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 3416
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class72.field895 != null ? 1 : 0; // L: 3417
						return 1; // L: 3418
					} else {
						return 2; // L: 3420
					}
				}
			}
		}
	}
}
