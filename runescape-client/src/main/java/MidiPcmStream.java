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

@ObfuscatedName("mt")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bo")
	static AtomicBoolean field3473;
	@ObfuscatedName("bp")
	static ThreadPoolExecutor field3454;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1345811845
	)
	int field3445;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1623814097
	)
	int field3446;
	@ObfuscatedName("ax")
	int[] field3447;
	@ObfuscatedName("ao")
	int[] field3448;
	@ObfuscatedName("ah")
	int[] field3449;
	@ObfuscatedName("ar")
	int[] field3458;
	@ObfuscatedName("ab")
	int[] field3451;
	@ObfuscatedName("am")
	int[] field3444;
	@ObfuscatedName("av")
	int[] field3453;
	@ObfuscatedName("ag")
	int[] field3474;
	@ObfuscatedName("aa")
	int[] field3455;
	@ObfuscatedName("ae")
	int[] field3457;
	@ObfuscatedName("aw")
	int[] field3467;
	@ObfuscatedName("aq")
	int[] field3459;
	@ObfuscatedName("az")
	int[] field3460;
	@ObfuscatedName("at")
	int[] field3461;
	@ObfuscatedName("af")
	int[] field3475;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[[Lms;"
	)
	MusicPatchNode[][] field3465;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[[Lms;"
	)
	MusicPatchNode[][] field3462;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("by")
	boolean field3463;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1049039467
	)
	@Export("track")
	int track;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1236508829
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		longValue = -1904008253243275471L
	)
	long field3471;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -4957310323141208567L
	)
	long field3470;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bb")
	PriorityQueue field3472;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 817128569
	)
	public int field3450;

	static {
		field3473 = null; // L: 52
		field3454 = null; // L: 53
	}

	public MidiPcmStream() {
		this.field3445 = 256; // L: 22
		this.field3446 = 1000000; // L: 23
		this.field3447 = new int[16]; // L: 24
		this.field3448 = new int[16]; // L: 25
		this.field3449 = new int[16]; // L: 26
		this.field3458 = new int[16]; // L: 27
		this.field3451 = new int[16]; // L: 28
		this.field3444 = new int[16]; // L: 29
		this.field3453 = new int[16]; // L: 30
		this.field3474 = new int[16]; // L: 31
		this.field3455 = new int[16]; // L: 32
		this.field3457 = new int[16]; // L: 36
		this.field3467 = new int[16]; // L: 37
		this.field3459 = new int[16]; // L: 38
		this.field3460 = new int[16]; // L: 39
		this.field3461 = new int[16]; // L: 40
		this.field3475 = new int[16]; // L: 41
		this.field3465 = new MusicPatchNode[16][128]; // L: 42
		this.field3462 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3472 = new PriorityQueue(5, new class330()); // L: 51
		this.field3450 = 0; // L: 54
		this.musicPatches = new NodeHashTable(128); // L: 57
		this.method5992(); // L: 58
	} // L: 59

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "109"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3445 = var1; // L: 62
	} // L: 63

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-13"
	)
	public int method5971() {
		return this.field3445; // L: 66
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lom;Lbl;I)Z",
		garbageValue = "-1830159532"
	)
	public synchronized boolean method5972(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 70
		synchronized(this.field3472) { // L: 71
			this.field3472.clear(); // L: 72
		} // L: 73

		for (class332 var5 = (class332)var1.field3514.first(); var5 != null; var5 = (class332)var1.field3514.next()) { // L: 74
			int var12 = (int)var5.key; // L: 75
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12); // L: 76
			if (var7 == null) { // L: 77
				var7 = class309.method5871(var2, var12); // L: 78
				if (var7 == null) { // L: 79
					var4 = false; // L: 80
					continue; // L: 81
				}

				this.musicPatches.put(var7, (long)var12); // L: 83
			}

			if (!var7.method6157(var3, var5.field3554)) { // L: 85
				var4 = false;
			} else if (this.field3472 != null) { // L: 86
				synchronized(this.field3472) { // L: 87
					Iterator var9 = var7.field3503.iterator(); // L: 88

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next(); // L: 89
						this.field3472.add(new class323(var5.field3555, var10)); // L: 91
					}
				}
			}
		}

		return var4; // L: 97
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public void method5979() {
		if (this.field3472 != null) { // L: 101
			if (field3473 != null) { // L: 104
				field3473.set(true); // L: 105
			}

			field3473 = new AtomicBoolean(false); // L: 107
			AtomicBoolean var1 = field3473; // L: 108
			if (field3454 == null) { // L: 109
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 110
				field3454 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class322(this)); // L: 111
			}

			field3454.submit(new class326(this, var1)); // L: 118
		}
	} // L: 102 134

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "356838086"
	)
	public synchronized void method5974() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 137
			var1.clear();
		}

	} // L: 138

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 522
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 526
	}

	@ObfuscatedName("ab")
	protected synchronized int vmethod6188() {
		return 0; // L: 530
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 534
			int var4 = this.midiFile.division * this.field3446 * -727379968 / PcmPlayer.field306; // L: 535

			do {
				long var5 = this.field3471 + (long)var3 * (long)var4; // L: 537
				if (this.field3470 - var5 >= 0L) { // L: 538
					this.field3471 = var5; // L: 539
					break;
				}

				int var7 = (int)((this.field3470 - this.field3471 + (long)var4 - 1L) / (long)var4); // L: 542
				this.field3471 += (long)var7 * (long)var4; // L: 543
				this.patchStream.fill(var1, var2, var7); // L: 544
				var2 += var7; // L: 545
				var3 -= var7; // L: 546
				this.method6005(); // L: 547
			} while(this.midiFile.isReady()); // L: 548
		}

		this.patchStream.fill(var1, var2, var3); // L: 551
	} // L: 552

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public synchronized void method6044() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 141
			var1.remove();
		}

	} // L: 142

	@ObfuscatedName("ag")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 555
			int var2 = this.midiFile.division * this.field3446 * -727379968 / PcmPlayer.field306; // L: 556

			do {
				long var3 = this.field3471 + (long)var1 * (long)var2; // L: 558
				if (this.field3470 - var3 >= 0L) { // L: 559
					this.field3471 = var3; // L: 560
					break;
				}

				int var5 = (int)((this.field3470 - this.field3471 + (long)var2 - 1L) / (long)var2); // L: 563
				this.field3471 += (long)var5 * (long)var2; // L: 564
				this.patchStream.skip(var5); // L: 565
				var1 -= var5; // L: 566
				this.method6005(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.skip(var1); // L: 571
	} // L: 572

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lmk;ZI)V",
		garbageValue = "-1812900871"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 145
		this.midiFile.parse(var1.midi); // L: 146
		this.field3463 = var2; // L: 147
		this.field3471 = 0L; // L: 148
		int var3 = this.midiFile.trackCount(); // L: 149

		for (int var4 = 0; var4 < var3; ++var4) { // L: 150
			this.midiFile.gotoTrack(var4); // L: 151
			this.midiFile.readTrackLength(var4); // L: 152
			this.midiFile.markTrackPosition(var4); // L: 153
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 155
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 156
		this.field3470 = this.midiFile.method6144(this.trackLength); // L: 157
	} // L: 158

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705880184"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 161
		this.method5992(); // L: 162
	} // L: 163

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1826603097"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 166
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1035642858"
	)
	public synchronized boolean method6050() {
		return this.musicPatches.method8894() > 0; // L: 170
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public synchronized void method5980(int var1, int var2) {
		this.method5981(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "160"
	)
	void method5981(int var1, int var2) {
		this.field3458[var1] = var2; // L: 178
		this.field3444[var1] = var2 & -128; // L: 179
		this.method5982(var1, var2); // L: 180
	} // L: 181

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2093622252"
	)
	void method5982(int var1, int var2) {
		if (var2 != this.field3451[var1]) { // L: 184
			this.field3451[var1] = var2; // L: 185

			for (int var3 = 0; var3 < 128; ++var3) { // L: 186
				this.field3462[var1][var3] = null;
			}
		}

	} // L: 188

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1932106886"
	)
	void method6065(int var1, int var2, int var3) {
		this.method5985(var1, var2, 64); // L: 191
		if ((this.field3457[var1] & 2) != 0) { // L: 192
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 193
				if (var4.field3516 == var1 && var4.field3524 < 0) { // L: 194
					this.field3465[var1][var4.field3520] = null; // L: 195
					this.field3465[var1][var2] = var4; // L: 196
					int var8 = (var4.field3525 * var4.field3529 >> 12) + var4.field3517; // L: 197
					var4.field3517 += var2 - var4.field3520 << 8; // L: 198
					var4.field3529 = var8 - var4.field3517; // L: 199
					var4.field3525 = 4096; // L: 200
					var4.field3520 = var2; // L: 201
					return; // L: 202
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3451[var1]); // L: 206
		if (var9 != null) { // L: 207
			if (var9.rawSounds[var2] != null) { // L: 208
				RawSound var5 = var9.rawSounds[var2].method1078(); // L: 209
				if (var5 != null) { // L: 210
					MusicPatchNode var6 = new MusicPatchNode(); // L: 211
					var6.field3516 = var1; // L: 212
					var6.table = var9; // L: 213
					var6.rawSound = var5; // L: 214
					var6.field3518 = var9.field3501[var2]; // L: 215
					var6.field3519 = var9.field3495[var2]; // L: 216
					var6.field3520 = var2; // L: 217
					var6.field3521 = var3 * var3 * var9.field3499[var2] * var9.field3500 + 1024 >> 11; // L: 218
					var6.field3522 = var9.field3502[var2] & 255; // L: 219
					var6.field3517 = (var2 << 8) - (var9.field3498[var2] & 32767); // L: 220
					var6.field3526 = 0; // L: 221
					var6.field3527 = 0; // L: 222
					var6.field3528 = 0; // L: 223
					var6.field3524 = -1; // L: 224
					var6.field3530 = 0; // L: 225
					if (this.field3460[var1] == 0) { // L: 226
						var6.stream = RawPcmStream.method942(var5, this.method6025(var6), this.method5998(var6), this.method5999(var6)); // L: 227
					} else {
						var6.stream = RawPcmStream.method942(var5, this.method6025(var6), 0, this.method5999(var6)); // L: 230
						this.method5984(var6, var9.field3498[var2] < 0); // L: 231
					}

					if (var9.field3498[var2] < 0) { // L: 233
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3519 >= 0) { // L: 234
						MusicPatchNode var7 = this.field3462[var1][var6.field3519]; // L: 235
						if (var7 != null && var7.field3524 < 0) { // L: 236
							this.field3465[var1][var7.field3520] = null; // L: 237
							var7.field3524 = 0; // L: 238
						}

						this.field3462[var1][var6.field3519] = var6; // L: 240
					}

					this.patchStream.queue.addFirst(var6); // L: 242
					this.field3465[var1][var2] = var6; // L: 243
				}
			}
		}
	} // L: 244

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lms;ZI)V",
		garbageValue = "240911451"
	)
	void method5984(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 247
		int var4;
		if (var2 && var1.rawSound.field279) { // L: 249
			int var5 = var3 + var3 - var1.rawSound.start; // L: 250
			var4 = (int)((long)this.field3460[var1.field3516] * (long)var5 >> 6); // L: 251
			var3 <<= 8; // L: 252
			if (var4 >= var3) { // L: 253
				var4 = var3 + var3 - 1 - var4; // L: 254
				var1.stream.method886(); // L: 255
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3460[var1.field3516] >> 6); // L: 259
		}

		var1.stream.method885(var4); // L: 261
	} // L: 262

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1358549088"
	)
	void method5985(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3465[var1][var2]; // L: 265
		if (var4 != null) { // L: 266
			this.field3465[var1][var2] = null; // L: 267
			if ((this.field3457[var1] & 2) != 0) { // L: 268
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 269
					if (var5.field3516 == var4.field3516 && var5.field3524 < 0 && var5 != var4) { // L: 270
						var4.field3524 = 0; // L: 271
						break; // L: 272
					}
				}
			} else {
				var4.field3524 = 0; // L: 277
			}

		}
	} // L: 279

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "714069724"
	)
	void method6053(int var1, int var2, int var3) {
	} // L: 281

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-454645454"
	)
	void method5987(int var1, int var2) {
	} // L: 282

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2005247777"
	)
	void method5988(int var1, int var2) {
		this.field3453[var1] = var2; // L: 285
	} // L: 286

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	void method5989(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
			if (var1 < 0 || var2.field3516 == var1) { // L: 290
				if (var2.stream != null) { // L: 291
					var2.stream.method890(PcmPlayer.field306 / 100); // L: 292
					if (var2.stream.method904()) { // L: 293
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6195(); // L: 294
				}

				if (var2.field3524 < 0) { // L: 296
					this.field3465[var2.field3516][var2.field3520] = null;
				}

				var2.remove(); // L: 297
			}
		}

	} // L: 300

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-58"
	)
	void method5990(int var1) {
		if (var1 >= 0) { // L: 303
			this.field3447[var1] = 12800; // L: 307
			this.field3448[var1] = 8192; // L: 308
			this.field3449[var1] = 16383; // L: 309
			this.field3453[var1] = 8192; // L: 310
			this.field3474[var1] = 0; // L: 311
			this.field3455[var1] = 8192; // L: 312
			this.method6001(var1); // L: 313
			this.method6079(var1); // L: 314
			this.field3457[var1] = 0; // L: 315
			this.field3467[var1] = 32767; // L: 316
			this.field3459[var1] = 256; // L: 317
			this.field3460[var1] = 0; // L: 318
			this.method6004(var1, 8192); // L: 319
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 304
				this.method5990(var1);
			}

		}
	} // L: 305 320

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1157620765"
	)
	void method5991(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 323
			if ((var1 < 0 || var2.field3516 == var1) && var2.field3524 < 0) { // L: 324 325
				this.field3465[var2.field3516][var2.field3520] = null; // L: 326
				var2.field3524 = 0; // L: 327
			}
		}

	} // L: 331

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "421748536"
	)
	void method5992() {
		this.method5989(-1); // L: 334
		this.method5990(-1); // L: 335

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 336
			this.field3451[var1] = this.field3458[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 337
			this.field3444[var1] = this.field3458[var1] & -128;
		}

	} // L: 338

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "666381709"
	)
	void method6001(int var1) {
		if ((this.field3457[var1] & 2) != 0) { // L: 341
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 342
				if (var2.field3516 == var1 && this.field3465[var1][var2.field3520] == null && var2.field3524 < 0) { // L: 343 344
					var2.field3524 = 0;
				}
			}
		}

	} // L: 348

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	void method6079(int var1) {
		if ((this.field3457[var1] & 4) != 0) { // L: 351
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 352
				if (var2.field3516 == var1) { // L: 353
					var2.field3535 = 0;
				}
			}
		}

	} // L: 356

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1231976764"
	)
	void method5995(int var1) {
		int var2 = var1 & 240; // L: 359
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 360
			var3 = var1 & 15; // L: 361
			var4 = var1 >> 8 & 127; // L: 362
			var5 = var1 >> 16 & 127; // L: 363
			this.method5985(var3, var4, var5); // L: 364
		} else if (var2 == 144) { // L: 367
			var3 = var1 & 15; // L: 368
			var4 = var1 >> 8 & 127; // L: 369
			var5 = var1 >> 16 & 127; // L: 370
			if (var5 > 0) { // L: 371
				this.method6065(var3, var4, var5);
			} else {
				this.method5985(var3, var4, 64); // L: 372
			}

		} else if (var2 == 160) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			var5 = var1 >> 16 & 127; // L: 378
			this.method6053(var3, var4, var5); // L: 379
		} else if (var2 == 176) { // L: 382
			var3 = var1 & 15; // L: 383
			var4 = var1 >> 8 & 127; // L: 384
			var5 = var1 >> 16 & 127; // L: 385
			if (var4 == 0) { // L: 386
				this.field3444[var3] = (var5 << 14) + (this.field3444[var3] & -2080769);
			}

			if (var4 == 32) { // L: 387
				this.field3444[var3] = (var5 << 7) + (this.field3444[var3] & -16257);
			}

			if (var4 == 1) { // L: 388
				this.field3474[var3] = (var5 << 7) + (this.field3474[var3] & -16257);
			}

			if (var4 == 33) { // L: 389
				this.field3474[var3] = var5 + (this.field3474[var3] & -128);
			}

			if (var4 == 5) { // L: 390
				this.field3455[var3] = (var5 << 7) + (this.field3455[var3] & -16257);
			}

			if (var4 == 37) { // L: 391
				this.field3455[var3] = var5 + (this.field3455[var3] & -128);
			}

			if (var4 == 7) { // L: 392
				this.field3447[var3] = (var5 << 7) + (this.field3447[var3] & -16257);
			}

			if (var4 == 39) { // L: 393
				this.field3447[var3] = var5 + (this.field3447[var3] & -128);
			}

			if (var4 == 10) { // L: 394
				this.field3448[var3] = (var5 << 7) + (this.field3448[var3] & -16257);
			}

			if (var4 == 42) { // L: 395
				this.field3448[var3] = var5 + (this.field3448[var3] & -128);
			}

			if (var4 == 11) { // L: 396
				this.field3449[var3] = (var5 << 7) + (this.field3449[var3] & -16257);
			}

			if (var4 == 43) { // L: 397
				this.field3449[var3] = var5 + (this.field3449[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 398
				if (var5 >= 64) { // L: 399
					var10000 = this.field3457;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3457; // L: 400
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 402
				if (var5 >= 64) { // L: 403
					var10000 = this.field3457;
					var10000[var3] |= 2;
				} else {
					this.method6001(var3); // L: 405
					var10000 = this.field3457; // L: 406
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 409
				this.field3467[var3] = (var5 << 7) + (this.field3467[var3] & 127);
			}

			if (var4 == 98) { // L: 410
				this.field3467[var3] = (this.field3467[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 411
				this.field3467[var3] = (var5 << 7) + (this.field3467[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 412
				this.field3467[var3] = (this.field3467[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 413
				this.method5989(var3);
			}

			if (var4 == 121) { // L: 414
				this.method5990(var3);
			}

			if (var4 == 123) { // L: 415
				this.method5991(var3);
			}

			int var6;
			if (var4 == 6) { // L: 416
				var6 = this.field3467[var3]; // L: 417
				if (var6 == 16384) { // L: 418
					this.field3459[var3] = (var5 << 7) + (this.field3459[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 420
				var6 = this.field3467[var3]; // L: 421
				if (var6 == 16384) { // L: 422
					this.field3459[var3] = var5 + (this.field3459[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 424
				this.field3460[var3] = (var5 << 7) + (this.field3460[var3] & -16257);
			}

			if (var4 == 48) { // L: 425
				this.field3460[var3] = var5 + (this.field3460[var3] & -128);
			}

			if (var4 == 81) { // L: 426
				if (var5 >= 64) { // L: 427
					var10000 = this.field3457;
					var10000[var3] |= 4;
				} else {
					this.method6079(var3); // L: 429
					var10000 = this.field3457; // L: 430
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6004(var3, (var5 << 7) + (this.field3461[var3] & -16257)); // L: 433
			}

			if (var4 == 49) { // L: 434
				this.method6004(var3, var5 + (this.field3461[var3] & -128));
			}

		} else if (var2 == 192) { // L: 437
			var3 = var1 & 15; // L: 438
			var4 = var1 >> 8 & 127; // L: 439
			this.method5982(var3, var4 + this.field3444[var3]); // L: 440
		} else if (var2 == 208) { // L: 443
			var3 = var1 & 15; // L: 444
			var4 = var1 >> 8 & 127; // L: 445
			this.method5987(var3, var4); // L: 446
		} else if (var2 == 224) { // L: 449
			var3 = var1 & 15; // L: 450
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 451
			this.method5988(var3, var4); // L: 452
		} else {
			var2 = var1 & 255; // L: 455
			if (var2 == 255) { // L: 456
				this.method5992(); // L: 457
			}
		}
	} // L: 365 373 380 435 441 447 453 458 460

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-742542086"
	)
	void method6004(int var1, int var2) {
		this.field3461[var1] = var2; // L: 463
		this.field3475[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 464
	} // L: 465

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lms;S)I",
		garbageValue = "2001"
	)
	int method6025(MusicPatchNode var1) {
		int var2 = (var1.field3529 * var1.field3525 >> 12) + var1.field3517; // L: 468
		var2 += (this.field3453[var1.field3516] - 8192) * this.field3459[var1.field3516] >> 12; // L: 469
		MusicPatchNode2 var3 = var1.field3518; // L: 470
		int var4;
		if (var3.field3424 > 0 && (var3.field3423 > 0 || this.field3474[var1.field3516] > 0)) { // L: 471
			var4 = var3.field3423 << 2; // L: 472
			int var5 = var3.field3426 << 1; // L: 473
			if (var1.field3531 < var5) { // L: 474
				var4 = var4 * var1.field3531 / var5;
			}

			var4 += this.field3474[var1.field3516] >> 7; // L: 475
			double var6 = Math.sin((double)(var1.field3534 & 511) * 0.01227184630308513D); // L: 476
			var2 += (int)((double)var4 * var6); // L: 477
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field306 + 0.5D); // L: 479
		return var4 < 1 ? 1 : var4; // L: 480
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)I",
		garbageValue = "59"
	)
	int method5998(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3518; // L: 484
		int var3 = this.field3449[var1.field3516] * this.field3447[var1.field3516] + 4096 >> 13; // L: 485
		var3 = var3 * var3 + 16384 >> 15; // L: 486
		var3 = var3 * var1.field3521 + 16384 >> 15; // L: 487
		var3 = var3 * this.field3445 + 128 >> 8; // L: 488
		if (var2.field3419 > 0) { // L: 489
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3419 * (double)var1.field3526 * 1.953125E-5D) + 0.5D); // L: 490
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3420 != null) { // L: 492
			var4 = var1.field3527; // L: 493
			var5 = var2.field3420[var1.field3528 * 4 + 1]; // L: 494
			if (var1.field3528 * 4 < var2.field3420.length - 2) { // L: 495
				var6 = (var2.field3420[var1.field3528 * 4] & 255) << 8; // L: 496
				var7 = (var2.field3420[var1.field3528 * 4 + 2] & 255) << 8; // L: 497
				var5 += (var2.field3420[var1.field3528 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 498
			}

			var3 = var5 * var3 + 32 >> 6; // L: 500
		}

		if (var1.field3524 > 0 && var2.field3418 != null) { // L: 502
			var4 = var1.field3524; // L: 503
			var5 = var2.field3418[var1.field3530 * 4 + 1]; // L: 504
			if (var1.field3530 * 4 < var2.field3418.length - 2) { // L: 505
				var6 = (var2.field3418[var1.field3530 * 4] & 255) << 8; // L: 506
				var7 = (var2.field3418[var1.field3530 * 4 + 2] & 255) << 8; // L: 507
				var5 += (var4 - var6) * (var2.field3418[var1.field3530 * 4 + 3] - var5) / (var7 - var6); // L: 508
			}

			var3 = var5 * var3 + 32 >> 6; // L: 510
		}

		return var3; // L: 512
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)I",
		garbageValue = "2"
	)
	int method5999(MusicPatchNode var1) {
		int var2 = this.field3448[var1.field3516]; // L: 516
		return var2 < 8192 ? var2 * var1.field3522 + 32 >> 6 : 16384 - ((128 - var1.field3522) * (16384 - var2) + 32 >> 6); // L: 517 518
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2129137394"
	)
	void method6005() {
		int var1 = this.track; // L: 575
		int var2 = this.trackLength; // L: 576

		long var3;
		for (var3 = this.field3470; var2 == this.trackLength; var3 = this.midiFile.method6144(var2)) { // L: 577 578 600
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 579
				this.midiFile.gotoTrack(var1); // L: 580
				int var5 = this.midiFile.readMessage(var1); // L: 581
				if (var5 == 1) { // L: 582
					this.midiFile.setTrackDone(); // L: 583
					this.midiFile.markTrackPosition(var1); // L: 584
					if (this.midiFile.isDone()) { // L: 585
						if (!this.field3463 || var2 == 0) { // L: 586
							this.method5992(); // L: 590
							this.midiFile.clear(); // L: 591
							return; // L: 592
						}

						this.midiFile.reset(var3); // L: 587
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 594
					this.method5995(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 595
				this.midiFile.markTrackPosition(var1); // L: 596
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 598
			var2 = this.midiFile.trackLengths[var1]; // L: 599
		}

		this.track = var1; // L: 602
		this.trackLength = var2; // L: 603
		this.field3470 = var3; // L: 604
	} // L: 605

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lms;B)Z",
		garbageValue = "-28"
	)
	boolean method6045(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 608
			if (var1.field3524 >= 0) { // L: 609
				var1.remove(); // L: 610
				if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) { // L: 611
					this.field3462[var1.field3516][var1.field3519] = null; // L: 612
				}
			}

			return true; // L: 615
		} else {
			return false; // L: 617
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lms;[IIIS)Z",
		garbageValue = "27530"
	)
	boolean method6007(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3536 = PcmPlayer.field306 / 100; // L: 621
		if (var1.field3524 < 0 || var1.stream != null && !var1.stream.method893()) { // L: 622
			int var5 = var1.field3525; // L: 630
			if (var5 > 0) { // L: 631
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3455[var1.field3516] * 4.921259842519685E-4D) + 0.5D); // L: 632
				if (var5 < 0) { // L: 633
					var5 = 0;
				}

				var1.field3525 = var5; // L: 634
			}

			var1.stream.method891(this.method6025(var1)); // L: 636
			MusicPatchNode2 var6 = var1.field3518; // L: 637
			boolean var7 = false; // L: 638
			++var1.field3531; // L: 639
			var1.field3534 += var6.field3424; // L: 640
			double var8 = (double)((var1.field3520 - 60 << 8) + (var1.field3529 * var1.field3525 >> 12)) * 5.086263020833333E-6D; // L: 641
			if (var6.field3419 > 0) { // L: 642
				if (var6.field3421 > 0) { // L: 643
					var1.field3526 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3421 * var8) + 0.5D);
				} else {
					var1.field3526 += 128; // L: 644
				}
			}

			if (var6.field3420 != null) { // L: 646
				if (var6.field3425 > 0) { // L: 647
					var1.field3527 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3425 * var8) + 0.5D);
				} else {
					var1.field3527 += 128; // L: 648
				}

				while (var1.field3528 * 4 < var6.field3420.length - 2 && var1.field3527 > (var6.field3420[var1.field3528 * 4 + 2] & 255) << 8) { // L: 649
					var1.field3528 = var1.field3528 * 4 + 2;
				}

				if (var1.field3528 * 4 == var6.field3420.length - 2 && var6.field3420[var1.field3528 * 4 + 1] == 0) { // L: 650
					var7 = true;
				}
			}

			if (var1.field3524 >= 0 && var6.field3418 != null && (this.field3457[var1.field3516] & 1) == 0 && (var1.field3519 < 0 || var1 != this.field3462[var1.field3516][var1.field3519])) { // L: 652 653
				if (var6.field3417 > 0) { // L: 654
					var1.field3524 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3417 * var8) + 0.5D);
				} else {
					var1.field3524 += 128; // L: 655
				}

				while (var1.field3530 * 4 < var6.field3418.length - 2 && var1.field3524 > (var6.field3418[var1.field3530 * 4 + 2] & 255) << 8) { // L: 656
					var1.field3530 = var1.field3530 * 4 + 2;
				}

				if (var1.field3530 * 4 == var6.field3418.length - 2) { // L: 657
					var7 = true;
				}
			}

			if (var7) { // L: 660
				var1.stream.method890(var1.field3536); // L: 661
				if (var2 != null) { // L: 662
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 663
				}

				if (var1.stream.method904()) { // L: 664
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6195(); // L: 665
				if (var1.field3524 >= 0) { // L: 666
					var1.remove(); // L: 667
					if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) { // L: 668
						this.field3462[var1.field3516][var1.field3519] = null; // L: 669
					}
				}

				return true; // L: 672
			} else {
				var1.stream.method889(var1.field3536, this.method5998(var1), this.method5999(var1)); // L: 674
				return false; // L: 675
			}
		} else {
			var1.method6195(); // L: 623
			var1.remove(); // L: 624
			if (var1.field3519 > 0 && var1 == this.field3462[var1.field3516][var1.field3519]) { // L: 625
				this.field3462[var1.field3516][var1.field3519] = null; // L: 626
			}

			return true; // L: 628
		}
	}
}
