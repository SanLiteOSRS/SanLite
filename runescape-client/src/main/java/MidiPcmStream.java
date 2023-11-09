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

@ObfuscatedName("lc")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bo")
	static AtomicBoolean field3437;
	@ObfuscatedName("br")
	static ThreadPoolExecutor field3438;
	@ObfuscatedName("rb")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	@Export("mouseWheel")
	static class174 mouseWheel;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1773416571
	)
	int field3420;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1978733760
	)
	int field3410;
	@ObfuscatedName("am")
	int[] field3412;
	@ObfuscatedName("as")
	int[] field3413;
	@ObfuscatedName("aj")
	int[] field3425;
	@ObfuscatedName("ag")
	int[] field3415;
	@ObfuscatedName("az")
	int[] field3414;
	@ObfuscatedName("av")
	int[] field3421;
	@ObfuscatedName("ap")
	int[] field3409;
	@ObfuscatedName("aq")
	int[] field3419;
	@ObfuscatedName("at")
	int[] field3432;
	@ObfuscatedName("ao")
	int[] field3433;
	@ObfuscatedName("ac")
	int[] field3422;
	@ObfuscatedName("ak")
	int[] field3423;
	@ObfuscatedName("an")
	int[] field3424;
	@ObfuscatedName("af")
	int[] field3417;
	@ObfuscatedName("ai")
	int[] field3440;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3427;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3428;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bn")
	boolean field3430;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1759403075
	)
	@Export("track")
	int track;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1224296529
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 7703786557427217681L
	)
	long field3416;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = -8249805723708220471L
	)
	long field3434;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bq")
	PriorityQueue field3436;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -662818405
	)
	public int field3439;

	static {
		field3437 = null; // L: 52
		field3438 = null; // L: 53
	}

	public MidiPcmStream() {
		this.field3420 = 256; // L: 22
		this.field3410 = -727379968; // L: 23
		this.field3412 = new int[16]; // L: 24
		this.field3413 = new int[16]; // L: 25
		this.field3425 = new int[16]; // L: 26
		this.field3415 = new int[16]; // L: 27
		this.field3414 = new int[16]; // L: 28
		this.field3421 = new int[16]; // L: 29
		this.field3409 = new int[16]; // L: 30
		this.field3419 = new int[16]; // L: 31
		this.field3432 = new int[16]; // L: 32
		this.field3433 = new int[16]; // L: 36
		this.field3422 = new int[16]; // L: 37
		this.field3423 = new int[16]; // L: 38
		this.field3424 = new int[16]; // L: 39
		this.field3417 = new int[16]; // L: 40
		this.field3440 = new int[16]; // L: 41
		this.field3427 = new MusicPatchNode[16][128]; // L: 42
		this.field3428 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3436 = new PriorityQueue(5, new class317()); // L: 51
		this.field3439 = 0; // L: 54
		this.musicPatches = new NodeHashTable(128); // L: 57
		this.method5878(); // L: 58
	} // L: 59

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3420 = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1139038647"
	)
	public int method5816() {
		return this.field3420; // L: 66
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmp;Lnd;Lbh;S)Z",
		garbageValue = "195"
	)
	public synchronized boolean method5817(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 70
		synchronized(this.field3436) { // L: 71
			this.field3436.clear(); // L: 72
		} // L: 73

		for (class319 var5 = (class319)var1.field3483.first(); var5 != null; var5 = (class319)var1.field3483.next()) { // L: 74
			int var12 = (int)var5.key; // L: 75
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12); // L: 76
			if (var7 == null) { // L: 77
				byte[] var9 = var2.takeFileFlat(var12); // L: 80
				MusicPatch var8;
				if (var9 == null) { // L: 81
					var8 = null; // L: 82
				} else {
					var8 = new MusicPatch(var9); // L: 85
				}

				var7 = var8; // L: 87
				if (var8 == null) { // L: 88
					var4 = false; // L: 89
					continue; // L: 90
				}

				this.musicPatches.put(var8, (long)var12); // L: 92
			}

			if (!var7.method6010(var3, var5.field3520)) { // L: 94
				var4 = false;
			} else if (this.field3436 != null) { // L: 95
				synchronized(this.field3436) { // L: 96
					Iterator var15 = var7.field3471.iterator(); // L: 97

					while (var15.hasNext()) {
						class53 var10 = (class53)var15.next(); // L: 98
						this.field3436.add(new class310(var5.field3519, var10)); // L: 100
					}
				}
			}
		}

		return var4; // L: 106
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1319222681"
	)
	public void method5840() {
		if (this.field3436 != null) { // L: 110
			if (field3437 != null) { // L: 113
				field3437.set(true); // L: 114
			}

			field3437 = new AtomicBoolean(false); // L: 116
			AtomicBoolean var1 = field3437; // L: 117
			if (field3438 == null) { // L: 118
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 119
				field3438 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class309(this)); // L: 120
			}

			field3438.submit(new class313(this, var1)); // L: 127
		}
	} // L: 111 143

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	public synchronized void method5819() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 146
			var1.clear();
		}

	} // L: 147

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 531
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 535
	}

	@ObfuscatedName("az")
	protected synchronized int vmethod6028() {
		return 0; // L: 539
	}

	@ObfuscatedName("av")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 543
			int var4 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field314; // L: 544

			do {
				long var5 = (long)var4 * (long)var3 + this.field3416; // L: 546
				if (this.field3434 - var5 >= 0L) { // L: 547
					this.field3416 = var5; // L: 548
					break;
				}

				int var7 = (int)((this.field3434 - this.field3416 + (long)var4 - 1L) / (long)var4); // L: 551
				this.field3416 += (long)var4 * (long)var7; // L: 552
				this.patchStream.fill(var1, var2, var7); // L: 553
				var2 += var7; // L: 554
				var3 -= var7; // L: 555
				this.method5850(); // L: 556
			} while(this.midiFile.isReady()); // L: 557
		}

		this.patchStream.fill(var1, var2, var3); // L: 560
	} // L: 561

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	public synchronized void method5820() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 150
			var1.remove();
		}

	} // L: 151

	@ObfuscatedName("aq")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 564
			int var2 = this.midiFile.division * this.field3410 * 1000000 / PcmPlayer.field314; // L: 565

			do {
				long var3 = this.field3416 + (long)var1 * (long)var2; // L: 567
				if (this.field3434 - var3 >= 0L) { // L: 568
					this.field3416 = var3; // L: 569
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3434 - this.field3416) - 1L) / (long)var2); // L: 572
				this.field3416 += (long)var2 * (long)var5; // L: 573
				this.patchStream.skip(var5); // L: 574
				var1 -= var5; // L: 575
				this.method5850(); // L: 576
			} while(this.midiFile.isReady()); // L: 577
		}

		this.patchStream.skip(var1); // L: 580
	} // L: 581

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmp;ZI)V",
		garbageValue = "1966762890"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 154
		this.midiFile.parse(var1.midi); // L: 155
		this.field3430 = var2; // L: 156
		this.field3416 = 0L; // L: 157
		int var3 = this.midiFile.trackCount(); // L: 158

		for (int var4 = 0; var4 < var3; ++var4) { // L: 159
			this.midiFile.gotoTrack(var4); // L: 160
			this.midiFile.readTrackLength(var4); // L: 161
			this.midiFile.markTrackPosition(var4); // L: 162
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 164
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 165
		this.field3434 = this.midiFile.method5956(this.trackLength); // L: 166
	} // L: 167

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 170
		this.method5878(); // L: 171
	} // L: 172

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 175
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-958919488"
	)
	public synchronized boolean method5926() {
		return this.musicPatches.method8791() > 0; // L: 179
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-736064552"
	)
	public synchronized void method5825(int var1, int var2) {
		this.method5905(var1, var2); // L: 183
	} // L: 184

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1708470262"
	)
	void method5905(int var1, int var2) {
		this.field3415[var1] = var2; // L: 187
		this.field3421[var1] = var2 & -128; // L: 188
		this.method5827(var1, var2); // L: 189
	} // L: 190

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1087105384"
	)
	void method5827(int var1, int var2) {
		if (var2 != this.field3414[var1]) { // L: 193
			this.field3414[var1] = var2; // L: 194

			for (int var3 = 0; var3 < 128; ++var3) { // L: 195
				this.field3428[var1][var3] = null;
			}
		}

	} // L: 197

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2143768499"
	)
	void method5902(int var1, int var2, int var3) {
		this.method5830(var1, var2, 64); // L: 200
		if ((this.field3433[var1] & 2) != 0) { // L: 201
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 202
				if (var4.field3494 == var1 && var4.field3499 < 0) { // L: 203
					this.field3427[var1][var4.field3490] = null; // L: 204
					this.field3427[var1][var2] = var4; // L: 205
					int var8 = (var4.field3495 * var4.field3488 >> 12) + var4.field3503; // L: 206
					var4.field3503 += var2 - var4.field3490 << 8; // L: 207
					var4.field3488 = var8 - var4.field3503; // L: 208
					var4.field3495 = 4096; // L: 209
					var4.field3490 = var2; // L: 210
					return; // L: 211
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3414[var1]); // L: 215
		if (var9 != null) { // L: 216
			if (var9.rawSounds[var2] != null) { // L: 217
				RawSound var5 = var9.rawSounds[var2].method1098(); // L: 218
				if (var5 != null) { // L: 219
					MusicPatchNode var6 = new MusicPatchNode(); // L: 220
					var6.field3494 = var1; // L: 221
					var6.table = var9; // L: 222
					var6.rawSound = var5; // L: 223
					var6.field3504 = var9.field3469[var2]; // L: 224
					var6.field3492 = var9.field3468[var2]; // L: 225
					var6.field3490 = var2; // L: 226
					var6.field3491 = var3 * var3 * var9.field3467[var2] * var9.field3470 + 1024 >> 11; // L: 227
					var6.field3485 = var9.field3472[var2] & 255; // L: 228
					var6.field3503 = (var2 << 8) - (var9.field3465[var2] & 32767); // L: 229
					var6.field3493 = 0; // L: 230
					var6.field3497 = 0; // L: 231
					var6.field3498 = 0; // L: 232
					var6.field3499 = -1; // L: 233
					var6.field3500 = 0; // L: 234
					if (this.field3424[var1] == 0) { // L: 235
						var6.stream = RawPcmStream.method887(var5, this.method5932(var6), this.method5940(var6), this.method5844(var6)); // L: 236
					} else {
						var6.stream = RawPcmStream.method887(var5, this.method5932(var6), 0, this.method5844(var6)); // L: 239
						this.method5829(var6, var9.field3465[var2] < 0); // L: 240
					}

					if (var9.field3465[var2] < 0) { // L: 242
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3492 >= 0) { // L: 243
						MusicPatchNode var7 = this.field3428[var1][var6.field3492]; // L: 244
						if (var7 != null && var7.field3499 < 0) { // L: 245
							this.field3427[var1][var7.field3490] = null; // L: 246
							var7.field3499 = 0; // L: 247
						}

						this.field3428[var1][var6.field3492] = var6; // L: 249
					}

					this.patchStream.queue.addFirst(var6); // L: 251
					this.field3427[var1][var2] = var6; // L: 252
				}
			}
		}
	} // L: 253

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "1430069342"
	)
	void method5829(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 256
		int var4;
		if (var2 && var1.rawSound.field282) { // L: 258
			int var5 = var3 + var3 - var1.rawSound.start; // L: 259
			var4 = (int)((long)this.field3424[var1.field3494] * (long)var5 >> 6); // L: 260
			var3 <<= 8; // L: 261
			if (var4 >= var3) { // L: 262
				var4 = var3 + var3 - 1 - var4; // L: 263
				var1.stream.method1012(); // L: 264
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3424[var1.field3494] >> 6); // L: 268
		}

		var1.stream.method988(var4); // L: 270
	} // L: 271

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1076595045"
	)
	void method5830(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3427[var1][var2]; // L: 274
		if (var4 != null) { // L: 275
			this.field3427[var1][var2] = null; // L: 276
			if ((this.field3433[var1] & 2) != 0) { // L: 277
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 278
					if (var4.field3494 == var5.field3494 && var5.field3499 < 0 && var4 != var5) { // L: 279
						var4.field3499 = 0; // L: 280
						break; // L: 281
					}
				}
			} else {
				var4.field3499 = 0; // L: 286
			}

		}
	} // L: 288

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2035773529"
	)
	void method5831(int var1, int var2, int var3) {
	} // L: 290

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "105"
	)
	void method5832(int var1, int var2) {
	} // L: 291

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1823688205"
	)
	void method5833(int var1, int var2) {
		this.field3409[var1] = var2; // L: 294
	} // L: 295

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-361813593"
	)
	void method5874(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 298
			if (var1 < 0 || var2.field3494 == var1) { // L: 299
				if (var2.stream != null) { // L: 300
					var2.stream.method900(PcmPlayer.field314 / 100); // L: 301
					if (var2.stream.method1031()) { // L: 302
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6052(); // L: 303
				}

				if (var2.field3499 < 0) { // L: 305
					this.field3427[var2.field3494][var2.field3490] = null;
				}

				var2.remove(); // L: 306
			}
		}

	} // L: 309

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1673747519"
	)
	void method5835(int var1) {
		if (var1 >= 0) { // L: 312
			this.field3412[var1] = 12800; // L: 316
			this.field3413[var1] = 8192; // L: 317
			this.field3425[var1] = 16383; // L: 318
			this.field3409[var1] = 8192; // L: 319
			this.field3419[var1] = 0; // L: 320
			this.field3432[var1] = 8192; // L: 321
			this.method5838(var1); // L: 322
			this.method5839(var1); // L: 323
			this.field3433[var1] = 0; // L: 324
			this.field3422[var1] = 32767; // L: 325
			this.field3423[var1] = 256; // L: 326
			this.field3424[var1] = 0; // L: 327
			this.method5841(var1, 8192); // L: 328
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 313
				this.method5835(var1);
			}

		}
	} // L: 314 329

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-694816578"
	)
	void method5836(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 332
			if ((var1 < 0 || var2.field3494 == var1) && var2.field3499 < 0) { // L: 333 334
				this.field3427[var2.field3494][var2.field3490] = null; // L: 335
				var2.field3499 = 0; // L: 336
			}
		}

	} // L: 340

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1070396160"
	)
	void method5878() {
		this.method5874(-1); // L: 343
		this.method5835(-1); // L: 344

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 345
			this.field3414[var1] = this.field3415[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 346
			this.field3421[var1] = this.field3415[var1] & -128;
		}

	} // L: 347

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1321540000"
	)
	void method5838(int var1) {
		if ((this.field3433[var1] & 2) != 0) { // L: 350
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 351
				if (var2.field3494 == var1 && this.field3427[var1][var2.field3490] == null && var2.field3499 < 0) { // L: 352 353
					var2.field3499 = 0;
				}
			}
		}

	} // L: 357

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2058782045"
	)
	void method5839(int var1) {
		if ((this.field3433[var1] & 4) != 0) { // L: 360
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 361
				if (var2.field3494 == var1) { // L: 362
					var2.field3505 = 0;
				}
			}
		}

	} // L: 365

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-76"
	)
	void method5875(int var1) {
		int var2 = var1 & 240; // L: 368
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 369
			var3 = var1 & 15; // L: 370
			var4 = var1 >> 8 & 127; // L: 371
			var5 = var1 >> 16 & 127; // L: 372
			this.method5830(var3, var4, var5); // L: 373
		} else if (var2 == 144) { // L: 376
			var3 = var1 & 15; // L: 377
			var4 = var1 >> 8 & 127; // L: 378
			var5 = var1 >> 16 & 127; // L: 379
			if (var5 > 0) { // L: 380
				this.method5902(var3, var4, var5);
			} else {
				this.method5830(var3, var4, 64); // L: 381
			}

		} else if (var2 == 160) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			var5 = var1 >> 16 & 127; // L: 387
			this.method5831(var3, var4, var5); // L: 388
		} else if (var2 == 176) { // L: 391
			var3 = var1 & 15; // L: 392
			var4 = var1 >> 8 & 127; // L: 393
			var5 = var1 >> 16 & 127; // L: 394
			if (var4 == 0) { // L: 395
				this.field3421[var3] = (var5 << 14) + (this.field3421[var3] & -2080769);
			}

			if (var4 == 32) { // L: 396
				this.field3421[var3] = (var5 << 7) + (this.field3421[var3] & -16257);
			}

			if (var4 == 1) { // L: 397
				this.field3419[var3] = (var5 << 7) + (this.field3419[var3] & -16257);
			}

			if (var4 == 33) { // L: 398
				this.field3419[var3] = var5 + (this.field3419[var3] & -128);
			}

			if (var4 == 5) { // L: 399
				this.field3432[var3] = (var5 << 7) + (this.field3432[var3] & -16257);
			}

			if (var4 == 37) { // L: 400
				this.field3432[var3] = var5 + (this.field3432[var3] & -128);
			}

			if (var4 == 7) { // L: 401
				this.field3412[var3] = (var5 << 7) + (this.field3412[var3] & -16257);
			}

			if (var4 == 39) { // L: 402
				this.field3412[var3] = var5 + (this.field3412[var3] & -128);
			}

			if (var4 == 10) { // L: 403
				this.field3413[var3] = (var5 << 7) + (this.field3413[var3] & -16257);
			}

			if (var4 == 42) { // L: 404
				this.field3413[var3] = var5 + (this.field3413[var3] & -128);
			}

			if (var4 == 11) { // L: 405
				this.field3425[var3] = (var5 << 7) + (this.field3425[var3] & -16257);
			}

			if (var4 == 43) { // L: 406
				this.field3425[var3] = var5 + (this.field3425[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 407
				if (var5 >= 64) { // L: 408
					var10000 = this.field3433;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3433; // L: 409
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 411
				if (var5 >= 64) { // L: 412
					var10000 = this.field3433;
					var10000[var3] |= 2;
				} else {
					this.method5838(var3); // L: 414
					var10000 = this.field3433; // L: 415
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 418
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127);
			}

			if (var4 == 98) { // L: 419
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 420
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 421
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 422
				this.method5874(var3);
			}

			if (var4 == 121) { // L: 423
				this.method5835(var3);
			}

			if (var4 == 123) { // L: 424
				this.method5836(var3);
			}

			int var6;
			if (var4 == 6) { // L: 425
				var6 = this.field3422[var3]; // L: 426
				if (var6 == 16384) { // L: 427
					this.field3423[var3] = (var5 << 7) + (this.field3423[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 429
				var6 = this.field3422[var3]; // L: 430
				if (var6 == 16384) { // L: 431
					this.field3423[var3] = var5 + (this.field3423[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 433
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 48) { // L: 434
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 81) { // L: 435
				if (var5 >= 64) { // L: 436
					var10000 = this.field3433;
					var10000[var3] |= 4;
				} else {
					this.method5839(var3); // L: 438
					var10000 = this.field3433; // L: 439
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5841(var3, (var5 << 7) + (this.field3417[var3] & -16257)); // L: 442
			}

			if (var4 == 49) { // L: 443
				this.method5841(var3, var5 + (this.field3417[var3] & -128));
			}

		} else if (var2 == 192) { // L: 446
			var3 = var1 & 15; // L: 447
			var4 = var1 >> 8 & 127; // L: 448
			this.method5827(var3, var4 + this.field3421[var3]); // L: 449
		} else if (var2 == 208) { // L: 452
			var3 = var1 & 15; // L: 453
			var4 = var1 >> 8 & 127; // L: 454
			this.method5832(var3, var4); // L: 455
		} else if (var2 == 224) { // L: 458
			var3 = var1 & 15; // L: 459
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 460
			this.method5833(var3, var4); // L: 461
		} else {
			var2 = var1 & 255; // L: 464
			if (var2 == 255) { // L: 465
				this.method5878(); // L: 466
			}
		}
	} // L: 374 382 389 444 450 456 462 467 469

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1175935963"
	)
	void method5841(int var1, int var2) {
		this.field3417[var1] = var2; // L: 472
		this.field3440[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 473
	} // L: 474

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "389364679"
	)
	int method5932(MusicPatchNode var1) {
		int var2 = (var1.field3495 * var1.field3488 >> 12) + var1.field3503; // L: 477
		var2 += (this.field3409[var1.field3494] - 8192) * this.field3423[var1.field3494] >> 12; // L: 478
		MusicPatchNode2 var3 = var1.field3504; // L: 479
		int var4;
		if (var3.field3387 > 0 && (var3.field3386 > 0 || this.field3419[var1.field3494] > 0)) { // L: 480
			var4 = var3.field3386 << 2; // L: 481
			int var5 = var3.field3388 << 1; // L: 482
			if (var1.field3501 < var5) { // L: 483
				var4 = var4 * var1.field3501 / var5;
			}

			var4 += this.field3419[var1.field3494] >> 7; // L: 484
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3502 & 511)); // L: 485
			var2 += (int)((double)var4 * var6); // L: 486
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field314 + 0.5D); // L: 488
		return var4 < 1 ? 1 : var4; // L: 489
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "92"
	)
	int method5940(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3504; // L: 493
		int var3 = this.field3425[var1.field3494] * this.field3412[var1.field3494] + 4096 >> 13; // L: 494
		var3 = var3 * var3 + 16384 >> 15; // L: 495
		var3 = var3 * var1.field3491 + 16384 >> 15; // L: 496
		var3 = var3 * this.field3420 + 128 >> 8; // L: 497
		if (var2.field3382 > 0) { // L: 498
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3382 * 1.953125E-5D * (double)var1.field3493) + 0.5D); // L: 499
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3381 != null) { // L: 501
			var4 = var1.field3497; // L: 502
			var5 = var2.field3381[var1.field3498 * 4 + 1]; // L: 503
			if (var1.field3498 * 4 < var2.field3381.length - 2) { // L: 504
				var6 = (var2.field3381[var1.field3498 * 4] & 255) << 8; // L: 505
				var7 = (var2.field3381[var1.field3498 * 4 + 2] & 255) << 8; // L: 506
				var5 += (var2.field3381[var1.field3498 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 507
			}

			var3 = var5 * var3 + 32 >> 6; // L: 509
		}

		if (var1.field3499 > 0 && var2.field3380 != null) { // L: 511
			var4 = var1.field3499; // L: 512
			var5 = var2.field3380[var1.field3500 * 4 + 1]; // L: 513
			if (var1.field3500 * 4 < var2.field3380.length - 2) { // L: 514
				var6 = (var2.field3380[var1.field3500 * 4] & 255) << 8; // L: 515
				var7 = (var2.field3380[var1.field3500 * 4 + 2] & 255) << 8; // L: 516
				var5 += (var2.field3380[var1.field3500 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 517
			}

			var3 = var3 * var5 + 32 >> 6; // L: 519
		}

		return var3; // L: 521
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)I",
		garbageValue = "5"
	)
	int method5844(MusicPatchNode var1) {
		int var2 = this.field3413[var1.field3494]; // L: 525
		return var2 < 8192 ? var2 * var1.field3485 + 32 >> 6 : 16384 - ((128 - var1.field3485) * (16384 - var2) + 32 >> 6); // L: 526 527
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-78"
	)
	void method5850() {
		int var1 = this.track; // L: 584
		int var2 = this.trackLength; // L: 585

		long var3;
		for (var3 = this.field3434; var2 == this.trackLength; var3 = this.midiFile.method5956(var2)) { // L: 586 587 609
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 588
				this.midiFile.gotoTrack(var1); // L: 589
				int var5 = this.midiFile.readMessage(var1); // L: 590
				if (var5 == 1) { // L: 591
					this.midiFile.setTrackDone(); // L: 592
					this.midiFile.markTrackPosition(var1); // L: 593
					if (this.midiFile.isDone()) { // L: 594
						if (!this.field3430 || var2 == 0) { // L: 595
							this.method5878(); // L: 599
							this.midiFile.clear(); // L: 600
							return; // L: 601
						}

						this.midiFile.reset(var3); // L: 596
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 603
					this.method5875(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 604
				this.midiFile.markTrackPosition(var1); // L: 605
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 607
			var2 = this.midiFile.trackLengths[var1]; // L: 608
		}

		this.track = var1; // L: 611
		this.trackLength = var2; // L: 612
		this.field3434 = var3; // L: 613
	} // L: 614

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)Z",
		garbageValue = "1531525351"
	)
	boolean method5851(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 617
			if (var1.field3499 >= 0) { // L: 618
				var1.remove(); // L: 619
				if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) { // L: 620
					this.field3428[var1.field3494][var1.field3492] = null; // L: 621
				}
			}

			return true; // L: 624
		} else {
			return false; // L: 626
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIS)Z",
		garbageValue = "16345"
	)
	boolean method5852(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3486 = PcmPlayer.field314 / 100; // L: 630
		if (var1.field3499 < 0 || var1.stream != null && !var1.stream.method903()) { // L: 631
			int var5 = var1.field3495; // L: 639
			if (var5 > 0) { // L: 640
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3432[var1.field3494]) + 0.5D); // L: 641
				if (var5 < 0) { // L: 642
					var5 = 0;
				}

				var1.field3495 = var5; // L: 643
			}

			var1.stream.method901(this.method5932(var1)); // L: 645
			MusicPatchNode2 var6 = var1.field3504; // L: 646
			boolean var7 = false; // L: 647
			++var1.field3501; // L: 648
			var1.field3502 += var6.field3387; // L: 649
			double var8 = (double)((var1.field3490 - 60 << 8) + (var1.field3495 * var1.field3488 >> 12)) * 5.086263020833333E-6D; // L: 650
			if (var6.field3382 > 0) { // L: 651
				if (var6.field3391 > 0) { // L: 652
					var1.field3493 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3391 * var8) + 0.5D);
				} else {
					var1.field3493 += 128; // L: 653
				}
			}

			if (var6.field3381 != null) { // L: 655
				if (var6.field3383 > 0) { // L: 656
					var1.field3497 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3383 * var8) + 0.5D);
				} else {
					var1.field3497 += 128; // L: 657
				}

				while (var1.field3498 * 4 < var6.field3381.length - 2 && var1.field3497 > (var6.field3381[var1.field3498 * 4 + 2] & 255) << 8) { // L: 658
					var1.field3498 = var1.field3498 * 4 + 2;
				}

				if (var1.field3498 * 4 == var6.field3381.length - 2 && var6.field3381[var1.field3498 * 4 + 1] == 0) { // L: 659
					var7 = true;
				}
			}

			if (var1.field3499 >= 0 && var6.field3380 != null && (this.field3433[var1.field3494] & 1) == 0 && (var1.field3492 < 0 || var1 != this.field3428[var1.field3494][var1.field3492])) { // L: 661 662
				if (var6.field3385 > 0) { // L: 663
					var1.field3499 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3385 * var8) + 0.5D);
				} else {
					var1.field3499 += 128; // L: 664
				}

				while (var1.field3500 * 4 < var6.field3380.length - 2 && var1.field3499 > (var6.field3380[var1.field3500 * 4 + 2] & 255) << 8) { // L: 665
					var1.field3500 = var1.field3500 * 4 + 2;
				}

				if (var1.field3500 * 4 == var6.field3380.length - 2) { // L: 666
					var7 = true;
				}
			}

			if (var7) { // L: 669
				var1.stream.method900(var1.field3486); // L: 670
				if (var2 != null) { // L: 671
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 672
				}

				if (var1.stream.method1031()) { // L: 673
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6052(); // L: 674
				if (var1.field3499 >= 0) { // L: 675
					var1.remove(); // L: 676
					if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) { // L: 677
						this.field3428[var1.field3494][var1.field3492] = null; // L: 678
					}
				}

				return true; // L: 681
			} else {
				var1.stream.method899(var1.field3486, this.method5940(var1), this.method5844(var1)); // L: 683
				return false; // L: 684
			}
		} else {
			var1.method6052(); // L: 632
			var1.remove(); // L: 633
			if (var1.field3492 > 0 && var1 == this.field3428[var1.field3494][var1.field3492]) { // L: 634
				this.field3428[var1.field3494][var1.field3492] = null; // L: 635
			}

			return true; // L: 637
		}
	}
}
