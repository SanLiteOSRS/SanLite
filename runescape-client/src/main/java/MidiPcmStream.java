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

@ObfuscatedName("mn")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	public static class381 field3456;
	@ObfuscatedName("bp")
	static AtomicBoolean field3453;
	@ObfuscatedName("bw")
	static ThreadPoolExecutor field3430;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1898062855
	)
	int field3437;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -672663247
	)
	int field3427;
	@ObfuscatedName("ao")
	int[] field3428;
	@ObfuscatedName("ab")
	int[] field3446;
	@ObfuscatedName("au")
	int[] field3426;
	@ObfuscatedName("aa")
	int[] field3454;
	@ObfuscatedName("ac")
	int[] field3432;
	@ObfuscatedName("al")
	int[] field3433;
	@ObfuscatedName("az")
	int[] field3448;
	@ObfuscatedName("ap")
	int[] field3435;
	@ObfuscatedName("av")
	int[] field3436;
	@ObfuscatedName("ai")
	int[] field3450;
	@ObfuscatedName("aw")
	int[] field3438;
	@ObfuscatedName("ae")
	int[] field3439;
	@ObfuscatedName("an")
	int[] field3440;
	@ObfuscatedName("ag")
	int[] field3443;
	@ObfuscatedName("ad")
	int[] field3442;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3434;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3444;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bl")
	boolean field3425;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -945236811
	)
	@Export("track")
	int track;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 574733067
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = -4602302537664311021L
	)
	long field3449;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = 109747029175512933L
	)
	long field3431;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	PriorityQueue field3452;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1731385213
	)
	public int field3455;

	static {
		field3453 = null;
		field3430 = null;
	}

	public MidiPcmStream() {
		this.field3437 = 256; // L: 22
		this.field3427 = 1000000; // L: 23
		this.field3428 = new int[16]; // L: 24
		this.field3446 = new int[16]; // L: 25
		this.field3426 = new int[16]; // L: 26
		this.field3454 = new int[16]; // L: 27
		this.field3432 = new int[16]; // L: 28
		this.field3433 = new int[16]; // L: 29
		this.field3448 = new int[16]; // L: 30
		this.field3435 = new int[16]; // L: 31
		this.field3436 = new int[16]; // L: 32
		this.field3450 = new int[16]; // L: 36
		this.field3438 = new int[16]; // L: 37
		this.field3439 = new int[16]; // L: 38
		this.field3440 = new int[16]; // L: 39
		this.field3443 = new int[16]; // L: 40
		this.field3442 = new int[16]; // L: 41
		this.field3434 = new MusicPatchNode[16][128]; // L: 42
		this.field3444 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3452 = new PriorityQueue(5, new class327());
		this.field3455 = 0;
		this.musicPatches = new NodeHashTable(128);
		this.method6027();
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3437 = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "30"
	)
	public int method6007() {
		return this.field3437; // L: 66
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lms;Lol;Lbc;I)Z",
		garbageValue = "289790936"
	)
	public synchronized boolean method6008(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 70
		synchronized(this.field3452) { // L: 71
			this.field3452.clear(); // L: 72
		} // L: 73

		for (class329 var5 = (class329)var1.field3496.first(); var5 != null; var5 = (class329)var1.field3496.next()) { // L: 74
			int var12 = (int)var5.key; // L: 75
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12); // L: 76
			if (var7 == null) { // L: 77
				var7 = LoginScreenAnimation.method2536(var2, var12); // L: 78
				if (var7 == null) { // L: 79
					var4 = false; // L: 80
					continue; // L: 81
				}

				this.musicPatches.put(var7, (long)var12); // L: 83
			}

			if (!var7.method6191(var3, var5.field3540)) {
				var4 = false; // L: 85
			} else if (this.field3452 != null) { // L: 86
				synchronized(this.field3452) { // L: 87
					Iterator var9 = var7.field3479.iterator(); // L: 88

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next(); // L: 89
						this.field3452.add(new class320(var5.field3539, var10)); // L: 91
					}
				}
			}
		}

		return var4; // L: 97
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "121"
	)
	public void method6009() {
		if (this.field3452 != null) { // L: 101
			if (field3453 != null) { // L: 104
				field3453.set(true); // L: 105
			}

			field3453 = new AtomicBoolean(false); // L: 107
			AtomicBoolean var1 = field3453; // L: 108
			if (field3430 == null) { // L: 109
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 110
				field3430 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class319(this)); // L: 111
			}

			field3430.submit(new class323(this, var1)); // L: 118
		}
	} // L: 102 134

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1842485318"
	)
	public synchronized void method6059() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 137
			var1.clear();
		}

	} // L: 138

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 522
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 526
	}

	@ObfuscatedName("ac")
	protected synchronized int vmethod6210() {
		return 0; // L: 530
	}

	@ObfuscatedName("al")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 534
			int var4 = this.midiFile.division * this.field3427 * -727379968 / (PcmPlayer.field275 * 1019137945); // L: 535

			do {
				long var5 = (long)var3 * (long)var4 + this.field3449; // L: 537
				if (this.field3431 - var5 >= 0L) { // L: 538
					this.field3449 = var5; // L: 539
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3431 - this.field3449) - 1L) / (long)var4); // L: 542
				this.field3449 += (long)var4 * (long)var7; // L: 543
				this.patchStream.fill(var1, var2, var7); // L: 544
				var2 += var7; // L: 545
				var3 -= var7; // L: 546
				this.method6040(); // L: 547
			} while(this.midiFile.isReady()); // L: 548
		}

		this.patchStream.fill(var1, var2, var3); // L: 551
	} // L: 552

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	public synchronized void method6011() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 141
			var1.remove();
		}

	} // L: 142

	@ObfuscatedName("ap")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 555
			int var2 = this.midiFile.division * this.field3427 * -727379968 / (PcmPlayer.field275 * 1019137945); // L: 556

			do {
				long var3 = (long)var1 * (long)var2 + this.field3449; // L: 558
				if (this.field3431 - var3 >= 0L) { // L: 559
					this.field3449 = var3; // L: 560
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3431 - this.field3449) - 1L) / (long)var2); // L: 563
				this.field3449 += (long)var2 * (long)var5; // L: 564
				this.patchStream.skip(var5); // L: 565
				var1 -= var5; // L: 566
				this.method6040(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.skip(var1); // L: 571
	} // L: 572

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lms;ZI)V",
		garbageValue = "-624556623"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 145
		this.midiFile.parse(var1.midi); // L: 146
		this.field3425 = var2; // L: 147
		this.field3449 = 0L; // L: 148
		int var3 = this.midiFile.trackCount(); // L: 149

		for (int var4 = 0; var4 < var3; ++var4) { // L: 150
			this.midiFile.gotoTrack(var4); // L: 151
			this.midiFile.readTrackLength(var4); // L: 152
			this.midiFile.markTrackPosition(var4); // L: 153
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 155
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 156
		this.field3431 = this.midiFile.method6145(this.trackLength); // L: 157
	} // L: 158

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 161
		this.method6027(); // L: 162
	} // L: 163

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2096879002"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 166
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "26568"
	)
	public synchronized boolean method6015() {
		return this.musicPatches.method8971() > 0; // L: 170
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-438742560"
	)
	public synchronized void method6016(int var1, int var2) {
		this.method6024(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "31"
	)
	void method6024(int var1, int var2) {
		this.field3454[var1] = var2; // L: 178
		this.field3433[var1] = var2 & -128; // L: 179
		this.method6107(var1, var2); // L: 180
	} // L: 181

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "39"
	)
	void method6107(int var1, int var2) {
		if (var2 != this.field3432[var1]) { // L: 184
			this.field3432[var1] = var2; // L: 185

			for (int var3 = 0; var3 < 128; ++var3) { // L: 186
				this.field3444[var1][var3] = null;
			}
		}

	} // L: 188

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "123"
	)
	void method6102(int var1, int var2, int var3) {
		this.method6019(var1, var2, 64); // L: 191
		if ((this.field3450[var1] & 2) != 0) { // L: 192
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 193
				if (var4.field3515 == var1 && var4.field3498 < 0) { // L: 194
					this.field3434[var1][var4.field3517] = null; // L: 195
					this.field3434[var1][var2] = var4; // L: 196
					int var8 = (var4.field3507 * var4.field3508 >> 12) + var4.field3506; // L: 197
					var4.field3506 += var2 - var4.field3517 << 8; // L: 198
					var4.field3507 = var8 - var4.field3506; // L: 199
					var4.field3508 = 4096; // L: 200
					var4.field3517 = var2; // L: 201
					return; // L: 202
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3432[var1]); // L: 206
		if (var9 != null) { // L: 207
			if (var9.rawSounds[var2] != null) { // L: 208
				RawSound var5 = var9.rawSounds[var2].method1094(); // L: 209
				if (var5 != null) { // L: 210
					MusicPatchNode var6 = new MusicPatchNode(); // L: 211
					var6.field3515 = var1; // L: 212
					var6.table = var9; // L: 213
					var6.rawSound = var5; // L: 214
					var6.field3501 = var9.field3485[var2]; // L: 215
					var6.field3502 = var9.field3482[var2]; // L: 216
					var6.field3517 = var2; // L: 217
					var6.field3504 = var3 * var3 * var9.field3483[var2] * var9.field3481 + 1024 >> 11; // L: 218
					var6.field3505 = var9.field3480[var2] & 255; // L: 219
					var6.field3506 = (var2 << 8) - (var9.field3478[var2] & 32767); // L: 220
					var6.field3509 = 0; // L: 221
					var6.field3510 = 0; // L: 222
					var6.field3511 = 0; // L: 223
					var6.field3498 = -1; // L: 224
					var6.field3519 = 0; // L: 225
					if (this.field3440[var1] == 0) { // L: 226
						var6.stream = RawPcmStream.method904(var5, this.method6010(var6), this.method6021(var6), this.method6034(var6)); // L: 227
					} else {
						var6.stream = RawPcmStream.method904(var5, this.method6010(var6), 0, this.method6034(var6)); // L: 230
						this.method6020(var6, var9.field3478[var2] < 0); // L: 231
					}

					if (var9.field3478[var2] < 0) { // L: 233
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3502 >= 0) { // L: 234
						MusicPatchNode var7 = this.field3444[var1][var6.field3502]; // L: 235
						if (var7 != null && var7.field3498 < 0) { // L: 236
							this.field3434[var1][var7.field3517] = null; // L: 237
							var7.field3498 = 0; // L: 238
						}

						this.field3444[var1][var6.field3502] = var6; // L: 240
					}

					this.patchStream.queue.addFirst(var6); // L: 242
					this.field3434[var1][var2] = var6; // L: 243
				}
			}
		}
	} // L: 244

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZB)V",
		garbageValue = "8"
	)
	void method6020(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 247
		int var4;
		if (var2 && var1.rawSound.field250) { // L: 249
			int var5 = var3 + var3 - var1.rawSound.start; // L: 250
			var4 = (int)((long)this.field3440[var1.field3515] * (long)var5 >> 6); // L: 251
			var3 <<= 8; // L: 252
			if (var4 >= var3) { // L: 253
				var4 = var3 + var3 - 1 - var4; // L: 254
				var1.stream.method902(); // L: 255
			}
		} else {
			var4 = (int)((long)this.field3440[var1.field3515] * (long)var3 >> 6); // L: 259
		}

		var1.stream.method912(var4); // L: 261
	} // L: 262

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1277420327"
	)
	void method6019(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3434[var1][var2]; // L: 265
		if (var4 != null) { // L: 266
			this.field3434[var1][var2] = null; // L: 267
			if ((this.field3450[var1] & 2) != 0) { // L: 268
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 269
					if (var5.field3515 == var4.field3515 && var5.field3498 < 0 && var5 != var4) { // L: 270
						var4.field3498 = 0; // L: 271
						break; // L: 272
					}
				}
			} else {
				var4.field3498 = 0; // L: 277
			}

		}
	} // L: 279

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-84"
	)
	void method6115(int var1, int var2, int var3) {
	} // L: 281

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method6022(int var1, int var2) {
	} // L: 282

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-5960"
	)
	void method6065(int var1, int var2) {
		this.field3448[var1] = var2; // L: 285
	} // L: 286

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2098056782"
	)
	void method6120(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
			if (var1 < 0 || var2.field3515 == var1) { // L: 290
				if (var2.stream != null) { // L: 291
					var2.stream.method917(PcmPlayer.field275 * 1019137945 / 100); // L: 292
					if (var2.stream.method921()) { // L: 293
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6239(); // L: 294
				}

				if (var2.field3498 < 0) { // L: 296
					this.field3434[var2.field3515][var2.field3517] = null;
				}

				var2.remove(); // L: 297
			}
		}

	} // L: 300

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6025(int var1) {
		if (var1 >= 0) { // L: 303
			this.field3428[var1] = 12800; // L: 307
			this.field3446[var1] = 8192; // L: 308
			this.field3426[var1] = 16383; // L: 309
			this.field3448[var1] = 8192; // L: 310
			this.field3435[var1] = 0; // L: 311
			this.field3436[var1] = 8192; // L: 312
			this.method6005(var1); // L: 313
			this.method6029(var1); // L: 314
			this.field3450[var1] = 0; // L: 315
			this.field3438[var1] = 32767; // L: 316
			this.field3439[var1] = 256; // L: 317
			this.field3440[var1] = 0; // L: 318
			this.method6050(var1, 8192); // L: 319
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 304
				this.method6025(var1);
			}

		}
	} // L: 305 320

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2027347232"
	)
	void method6026(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 323
			if ((var1 < 0 || var2.field3515 == var1) && var2.field3498 < 0) { // L: 324 325
				this.field3434[var2.field3515][var2.field3517] = null; // L: 326
				var2.field3498 = 0; // L: 327
			}
		}

	} // L: 331

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3235279"
	)
	void method6027() {
		this.method6120(-1); // L: 334
		this.method6025(-1); // L: 335

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 336
			this.field3432[var1] = this.field3454[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 337
			this.field3433[var1] = this.field3454[var1] & -128;
		}

	} // L: 338

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "936925077"
	)
	void method6005(int var1) {
		if ((this.field3450[var1] & 2) != 0) { // L: 341
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 342
				if (var2.field3515 == var1 && this.field3434[var1][var2.field3517] == null && var2.field3498 < 0) { // L: 343 344
					var2.field3498 = 0;
				}
			}
		}

	} // L: 348

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	void method6029(int var1) {
		if ((this.field3450[var1] & 4) != 0) { // L: 351
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 352
				if (var2.field3515 == var1) { // L: 353
					var2.field3516 = 0;
				}
			}
		}

	} // L: 356

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1011808650"
	)
	void method6030(int var1) {
		int var2 = var1 & 240; // L: 359
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 360
			var3 = var1 & 15; // L: 361
			var4 = var1 >> 8 & 127; // L: 362
			var5 = var1 >> 16 & 127; // L: 363
			this.method6019(var3, var4, var5); // L: 364
		} else if (var2 == 144) { // L: 367
			var3 = var1 & 15; // L: 368
			var4 = var1 >> 8 & 127; // L: 369
			var5 = var1 >> 16 & 127; // L: 370
			if (var5 > 0) { // L: 371
				this.method6102(var3, var4, var5);
			} else {
				this.method6019(var3, var4, 64); // L: 372
			}

		} else if (var2 == 160) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			var5 = var1 >> 16 & 127; // L: 378
			this.method6115(var3, var4, var5); // L: 379
		} else if (var2 == 176) { // L: 382
			var3 = var1 & 15; // L: 383
			var4 = var1 >> 8 & 127; // L: 384
			var5 = var1 >> 16 & 127; // L: 385
			if (var4 == 0) { // L: 386
				this.field3433[var3] = (var5 << 14) + (this.field3433[var3] & -2080769);
			}

			if (var4 == 32) { // L: 387
				this.field3433[var3] = (var5 << 7) + (this.field3433[var3] & -16257);
			}

			if (var4 == 1) { // L: 388
				this.field3435[var3] = (var5 << 7) + (this.field3435[var3] & -16257);
			}

			if (var4 == 33) { // L: 389
				this.field3435[var3] = var5 + (this.field3435[var3] & -128);
			}

			if (var4 == 5) { // L: 390
				this.field3436[var3] = (var5 << 7) + (this.field3436[var3] & -16257);
			}

			if (var4 == 37) { // L: 391
				this.field3436[var3] = var5 + (this.field3436[var3] & -128);
			}

			if (var4 == 7) { // L: 392
				this.field3428[var3] = (var5 << 7) + (this.field3428[var3] & -16257);
			}

			if (var4 == 39) { // L: 393
				this.field3428[var3] = var5 + (this.field3428[var3] & -128);
			}

			if (var4 == 10) { // L: 394
				this.field3446[var3] = (var5 << 7) + (this.field3446[var3] & -16257);
			}

			if (var4 == 42) { // L: 395
				this.field3446[var3] = var5 + (this.field3446[var3] & -128);
			}

			if (var4 == 11) { // L: 396
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & -16257);
			}

			if (var4 == 43) { // L: 397
				this.field3426[var3] = var5 + (this.field3426[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 398
				if (var5 >= 64) { // L: 399
					var10000 = this.field3450;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3450; // L: 400
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 402
				if (var5 >= 64) { // L: 403
					var10000 = this.field3450;
					var10000[var3] |= 2;
				} else {
					this.method6005(var3); // L: 405
					var10000 = this.field3450; // L: 406
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 409
				this.field3438[var3] = (var5 << 7) + (this.field3438[var3] & 127);
			}

			if (var4 == 98) { // L: 410
				this.field3438[var3] = (this.field3438[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 411
				this.field3438[var3] = (var5 << 7) + (this.field3438[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 412
				this.field3438[var3] = (this.field3438[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 413
				this.method6120(var3);
			}

			if (var4 == 121) { // L: 414
				this.method6025(var3);
			}

			if (var4 == 123) { // L: 415
				this.method6026(var3);
			}

			int var6;
			if (var4 == 6) { // L: 416
				var6 = this.field3438[var3]; // L: 417
				if (var6 == 16384) { // L: 418
					this.field3439[var3] = (var5 << 7) + (this.field3439[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 420
				var6 = this.field3438[var3]; // L: 421
				if (var6 == 16384) { // L: 422
					this.field3439[var3] = var5 + (this.field3439[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 424
				this.field3440[var3] = (var5 << 7) + (this.field3440[var3] & -16257);
			}

			if (var4 == 48) { // L: 425
				this.field3440[var3] = var5 + (this.field3440[var3] & -128);
			}

			if (var4 == 81) { // L: 426
				if (var5 >= 64) { // L: 427
					var10000 = this.field3450;
					var10000[var3] |= 4;
				} else {
					this.method6029(var3); // L: 429
					var10000 = this.field3450; // L: 430
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 433
				this.method6050(var3, (var5 << 7) + (this.field3443[var3] & -16257));
			}

			if (var4 == 49) { // L: 434
				this.method6050(var3, var5 + (this.field3443[var3] & -128));
			}

		} else if (var2 == 192) { // L: 437
			var3 = var1 & 15; // L: 438
			var4 = var1 >> 8 & 127; // L: 439
			this.method6107(var3, var4 + this.field3433[var3]); // L: 440
		} else if (var2 == 208) { // L: 443
			var3 = var1 & 15; // L: 444
			var4 = var1 >> 8 & 127; // L: 445
			this.method6022(var3, var4); // L: 446
		} else if (var2 == 224) { // L: 449
			var3 = var1 & 15; // L: 450
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 451
			this.method6065(var3, var4); // L: 452
		} else {
			var2 = var1 & 255; // L: 455
			if (var2 == 255) { // L: 456
				this.method6027(); // L: 457
			}
		}
	} // L: 365 373 380 435 441 447 453 458 460

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "23"
	)
	void method6050(int var1, int var2) {
		this.field3443[var1] = var2; // L: 463
		this.field3442[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 464
	} // L: 465

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "2086193831"
	)
	int method6010(MusicPatchNode var1) {
		int var2 = (var1.field3507 * var1.field3508 >> 12) + var1.field3506; // L: 468
		var2 += (this.field3448[var1.field3515] - 8192) * this.field3439[var1.field3515] >> 12; // L: 469
		MusicPatchNode2 var3 = var1.field3501; // L: 470
		int var4;
		if (var3.field3410 > 0 && (var3.field3409 > 0 || this.field3435[var1.field3515] > 0)) { // L: 471
			var4 = var3.field3409 << 2; // L: 472
			int var5 = var3.field3404 << 1; // L: 473
			if (var1.field3512 < var5) { // L: 474
				var4 = var4 * var1.field3512 / var5;
			}

			var4 += this.field3435[var1.field3515] >> 7; // L: 475
			double var6 = Math.sin((double)(var1.field3503 & 511) * 0.01227184630308513D); // L: 476
			var2 += (int)((double)var4 * var6); // L: 477
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(PcmPlayer.field275 * 1019137945) + 0.5D); // L: 479
		return var4 < 1 ? 1 : var4; // L: 480
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "-88"
	)
	int method6021(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3501; // L: 484
		int var3 = this.field3428[var1.field3515] * this.field3426[var1.field3515] + 4096 >> 13; // L: 485
		var3 = var3 * var3 + 16384 >> 15; // L: 486
		var3 = var3 * var1.field3504 + 16384 >> 15; // L: 487
		var3 = var3 * this.field3437 + 128 >> 8; // L: 488
		if (var2.field3405 > 0) { // L: 489
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)(var1.field3509 * 128) * (double)var2.field3405) + 0.5D); // L: 490
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3406 != null) { // L: 492
			var4 = var1.field3510; // L: 493
			var5 = var2.field3406[var1.field3511 * 4 + 1]; // L: 494
			if (var1.field3511 * 4 < var2.field3406.length - 2) { // L: 495
				var6 = (var2.field3406[var1.field3511 * 4] & 255) << 8; // L: 496
				var7 = (var2.field3406[var1.field3511 * 4 + 2] & 255) << 8; // L: 497
				var5 += (var4 - var6) * (var2.field3406[var1.field3511 * 4 + 3] - var5) / (var7 - var6); // L: 498
			}

			var3 = var3 * var5 + 32 >> 6; // L: 500
		}

		if (var1.field3498 > 0 && var2.field3411 != null) { // L: 502
			var4 = var1.field3498; // L: 503
			var5 = var2.field3411[var1.field3519 * 2 + 1]; // L: 504
			if (var1.field3519 * 2 < var2.field3411.length - 2) { // L: 505
				var6 = (var2.field3411[var1.field3519 * 2] & 255) << 8; // L: 506
				var7 = (var2.field3411[var1.field3519 * 2 + 2] & 255) << 8; // L: 507
				var5 += (var4 - var6) * (var2.field3411[var1.field3519 * 2 + 3] - var5) / (var7 - var6); // L: 508
			}

			var3 = var5 * var3 + 32 >> 6; // L: 510
		}

		return var3; // L: 512
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "-7"
	)
	int method6034(MusicPatchNode var1) {
		int var2 = this.field3446[var1.field3515]; // L: 516
		return var2 < 8192 ? var2 * var1.field3505 + 32 >> 6 : 16384 - ((128 - var1.field3505) * (16384 - var2) + 32 >> 6); // L: 517 518
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1708238703"
	)
	void method6040() {
		int var1 = this.track; // L: 575
		int var2 = this.trackLength; // L: 576

		long var3;
		for (var3 = this.field3431; var2 == this.trackLength; var3 = this.midiFile.method6145(var2)) { // L: 577 578 600
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 579
				this.midiFile.gotoTrack(var1); // L: 580
				int var5 = this.midiFile.readMessage(var1); // L: 581
				if (var5 == 1) { // L: 582
					this.midiFile.setTrackDone(); // L: 583
					this.midiFile.markTrackPosition(var1); // L: 584
					if (this.midiFile.isDone()) { // L: 585
						if (!this.field3425 || var2 == 0) { // L: 586
							this.method6027(); // L: 590
							this.midiFile.clear(); // L: 591
							return; // L: 592
						}

						this.midiFile.reset(var3); // L: 587
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 594
					this.method6030(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 595
				this.midiFile.markTrackPosition(var1); // L: 596
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 598
			var2 = this.midiFile.trackLengths[var1]; // L: 599
		}

		this.track = var1; // L: 602
		this.trackLength = var2; // L: 603
		this.field3431 = var3; // L: 604
	} // L: 605

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)Z",
		garbageValue = "1582725415"
	)
	boolean method6041(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 608
			if (var1.field3498 >= 0) { // L: 609
				var1.remove(); // L: 610
				if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) { // L: 611
					this.field3444[var1.field3515][var1.field3502] = null; // L: 612
				}
			}

			return true; // L: 615
		} else {
			return false; // L: 617
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIII)Z",
		garbageValue = "1206952354"
	)
	boolean method6042(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3513 = PcmPlayer.field275 * 1019137945 / 100; // L: 621
		if (var1.field3498 < 0 || var1.stream != null && !var1.stream.method1008()) { // L: 622
			int var5 = var1.field3508; // L: 630
			if (var5 > 0) { // L: 631
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3436[var1.field3515] * 4.921259842519685E-4D) + 0.5D); // L: 632
				if (var5 < 0) { // L: 633
					var5 = 0;
				}

				var1.field3508 = var5; // L: 634
			}

			var1.stream.method913(this.method6010(var1)); // L: 636
			MusicPatchNode2 var6 = var1.field3501; // L: 637
			boolean var7 = false; // L: 638
			++var1.field3512; // L: 639
			var1.field3503 += var6.field3410; // L: 640
			double var8 = (double)((var1.field3517 - 60 << 8) + (var1.field3507 * var1.field3508 >> 12)) * 5.086263020833333E-6D; // L: 641
			if (var6.field3405 > 0) { // L: 642
				if (var6.field3408 > 0) { // L: 643
					var1.field3509 = var1.field3509 * -1887682560 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3408 * var8) + 0.5D) * 589232256;
				} else {
					var1.field3509 = var1.field3509 * -1887682560 + -1887682560; // L: 644
				}
			}

			if (var6.field3406 != null) { // L: 646
				if (var6.field3412 > 0) { // L: 647
					var1.field3510 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3412 * var8) + 0.5D);
				} else {
					var1.field3510 += 128; // L: 648
				}

				while (var1.field3511 * 4 < var6.field3406.length - 2 && var1.field3510 > (var6.field3406[var1.field3511 * 4 + 2] & 255) << 8) { // L: 649
					var1.field3511 = var1.field3511 * 4 + 2;
				}

				if (var1.field3511 * 4 == var6.field3406.length - 2 && var6.field3406[var1.field3511 * 4 + 1] == 0) { // L: 650
					var7 = true;
				}
			}

			if (var1.field3498 >= 0 && var6.field3411 != null && (this.field3450[var1.field3515] & 1) == 0 && (var1.field3502 < 0 || var1 != this.field3444[var1.field3515][var1.field3502])) { // L: 652 653
				if (var6.field3407 > 0) { // L: 654
					var1.field3498 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3407 * var8) + 0.5D);
				} else {
					var1.field3498 += 128; // L: 655
				}

				while (var1.field3519 * 2 < var6.field3411.length - 2 && var1.field3498 > (var6.field3411[var1.field3519 * 2 + 2] & 255) << 8) { // L: 656
					var1.field3519 = var1.field3519 * 4 + 4;
				}

				if (var1.field3519 * 2 == var6.field3411.length - 2) { // L: 657
					var7 = true;
				}
			}

			if (var7) { // L: 660
				var1.stream.method917(var1.field3513); // L: 661
				if (var2 != null) { // L: 662
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 663
				}

				if (var1.stream.method921()) { // L: 664
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6239(); // L: 665
				if (var1.field3498 >= 0) { // L: 666
					var1.remove(); // L: 667
					if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) { // L: 668
						this.field3444[var1.field3515][var1.field3502] = null; // L: 669
					}
				}

				return true; // L: 672
			} else {
				var1.stream.method916(var1.field3513, this.method6021(var1), this.method6034(var1)); // L: 674
				return false; // L: 675
			}
		} else {
			var1.method6239(); // L: 623
			var1.remove(); // L: 624
			if (var1.field3502 > 0 && var1 == this.field3444[var1.field3515][var1.field3502]) { // L: 625
				this.field3444[var1.field3515][var1.field3502] = null; // L: 626
			}

			return true; // L: 628
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1188911227"
	)
	static void method6133() {
		Tiles.Tiles_minPlane = 99; // L: 45
		class74.field891 = new short[4][104][104]; // L: 46
		Interpreter.field833 = new short[4][104][104]; // L: 47
		ViewportMouse.field3018 = new byte[4][104][104]; // L: 48
		class369.field4297 = new byte[4][104][104]; // L: 49
		class344.field3814 = new int[4][105][105]; // L: 50
		class93.field1150 = new byte[4][105][105]; // L: 51
		Tiles.field999 = new int[105][105]; // L: 52
		class337.Tiles_hue = new int[104]; // L: 53
		Tiles.Tiles_saturation = new int[104]; // L: 54
		class185.Tiles_lightness = new int[104]; // L: 55
		MenuAction.Tiles_hueMultiplier = new int[104]; // L: 56
		WorldMapLabelSize.field2441 = new int[104]; // L: 57
	} // L: 58
}
