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

@ObfuscatedName("mk")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bc")
	static AtomicBoolean field3497;
	@ObfuscatedName("bx")
	static ThreadPoolExecutor field3487;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1518385287
	)
	int field3470;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1432425152
	)
	int field3498;
	@ObfuscatedName("aj")
	int[] field3480;
	@ObfuscatedName("aq")
	int[] field3472;
	@ObfuscatedName("ar")
	int[] field3500;
	@ObfuscatedName("ag")
	int[] field3474;
	@ObfuscatedName("ao")
	int[] field3475;
	@ObfuscatedName("ae")
	int[] field3476;
	@ObfuscatedName("aa")
	int[] field3477;
	@ObfuscatedName("au")
	int[] field3478;
	@ObfuscatedName("an")
	int[] field3479;
	@ObfuscatedName("as")
	int[] field3481;
	@ObfuscatedName("ab")
	int[] field3473;
	@ObfuscatedName("ah")
	int[] field3471;
	@ObfuscatedName("ai")
	int[] field3484;
	@ObfuscatedName("ac")
	int[] field3485;
	@ObfuscatedName("al")
	int[] field3494;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[[Lmv;"
	)
	MusicPatchNode[][] field3490;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[[Lmv;"
	)
	MusicPatchNode[][] field3488;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bg")
	boolean field3469;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1050180227
	)
	@Export("track")
	int track;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -543510225
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -8628189700403988937L
	)
	long field3493;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		longValue = -1845324877038206627L
	)
	long field3482;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("by")
	PriorityQueue field3496;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 590471631
	)
	public int field3499;

	static {
		field3497 = null; // L: 52
		field3487 = null; // L: 53
	}

	public MidiPcmStream() {
		this.field3470 = 256; // L: 22
		this.field3498 = -727379968; // L: 23
		this.field3480 = new int[16]; // L: 24
		this.field3472 = new int[16]; // L: 25
		this.field3500 = new int[16]; // L: 26
		this.field3474 = new int[16]; // L: 27
		this.field3475 = new int[16]; // L: 28
		this.field3476 = new int[16]; // L: 29
		this.field3477 = new int[16]; // L: 30
		this.field3478 = new int[16]; // L: 31
		this.field3479 = new int[16]; // L: 32
		this.field3481 = new int[16]; // L: 36
		this.field3473 = new int[16]; // L: 37
		this.field3471 = new int[16]; // L: 38
		this.field3484 = new int[16]; // L: 39
		this.field3485 = new int[16]; // L: 40
		this.field3494 = new int[16]; // L: 41
		this.field3490 = new MusicPatchNode[16][128]; // L: 42
		this.field3488 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3496 = new PriorityQueue(5, new class330()); // L: 51
		this.field3499 = 0; // L: 54
		this.musicPatches = new NodeHashTable(128); // L: 57
		this.method6091(); // L: 58
	} // L: 59

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "618137822"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3470 = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2250"
	)
	public int method6071() {
		return this.field3470; // L: 66
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Low;Lbi;B)Z",
		garbageValue = "96"
	)
	public synchronized boolean method6072(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 70
		synchronized(this.field3496) { // L: 71
			this.field3496.clear(); // L: 72
		} // L: 73

		for (class332 var5 = (class332)var1.field3543.first(); var5 != null; var5 = (class332)var1.field3543.next()) { // L: 74
			int var12 = (int)var5.key; // L: 75
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var12); // L: 76
			if (var7 == null) { // L: 77
				var7 = MusicPatchNode2.method6039(var2, var12); // L: 78
				if (var7 == null) { // L: 79
					var4 = false; // L: 80
					continue; // L: 81
				}

				this.musicPatches.put(var7, (long)var12); // L: 83
			}

			if (!var7.method6243(var3, var5.field3586)) { // L: 85
				var4 = false;
			} else if (this.field3496 != null) { // L: 86
				synchronized(this.field3496) { // L: 87
					Iterator var9 = var7.field3528.iterator(); // L: 88

					while (var9.hasNext()) {
						class53 var10 = (class53)var9.next(); // L: 89
						this.field3496.add(new class323(var5.field3585, var10)); // L: 91
					}
				}
			}
		}

		return var4; // L: 97
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	public void method6073() {
		if (this.field3496 != null) { // L: 101
			if (field3497 != null) { // L: 104
				field3497.set(true); // L: 105
			}

			field3497 = new AtomicBoolean(false); // L: 107
			AtomicBoolean var1 = field3497; // L: 108
			if (field3487 == null) { // L: 109
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 110
				field3487 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class322(this)); // L: 111
			}

			field3487.submit(new class326(this, var1)); // L: 118
		}
	} // L: 102 134

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1106474056"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 137
			var1.clear();
		}

	} // L: 138

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 522
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 526
	}

	@ObfuscatedName("ao")
	protected synchronized int vmethod6281() {
		return 0; // L: 530
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 534
			int var4 = this.midiFile.division * this.field3498 * 1000000 / (class189.field1993 * 22050); // L: 535

			do {
				long var5 = this.field3493 + (long)var4 * (long)var3; // L: 537
				if (this.field3482 - var5 >= 0L) { // L: 538
					this.field3493 = var5; // L: 539
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3482 - this.field3493) - 1L) / (long)var4); // L: 542
				this.field3493 += (long)var7 * (long)var4; // L: 543
				this.patchStream.fill(var1, var2, var7); // L: 544
				var2 += var7; // L: 545
				var3 -= var7; // L: 546
				this.method6104(); // L: 547
			} while(this.midiFile.isReady()); // L: 548
		}

		this.patchStream.fill(var1, var2, var3); // L: 551
	} // L: 552

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1535924462"
	)
	public synchronized void method6075() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 141
			var1.remove();
		}

	} // L: 142

	@ObfuscatedName("au")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 555
			int var2 = this.midiFile.division * this.field3498 * 1000000 / (class189.field1993 * 22050); // L: 556

			do {
				long var3 = this.field3493 + (long)var2 * (long)var1; // L: 558
				if (this.field3482 - var3 >= 0L) { // L: 559
					this.field3493 = var3; // L: 560
					break;
				}

				int var5 = (int)((this.field3482 - this.field3493 + (long)var2 - 1L) / (long)var2); // L: 563
				this.field3493 += (long)var2 * (long)var5; // L: 564
				this.patchStream.skip(var5); // L: 565
				var1 -= var5; // L: 566
				this.method6104(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.skip(var1); // L: 571
	} // L: 572

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZB)V",
		garbageValue = "125"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 145
		this.midiFile.parse(var1.midi); // L: 146
		this.field3469 = var2; // L: 147
		this.field3493 = 0L; // L: 148
		int var3 = this.midiFile.trackCount(); // L: 149

		for (int var4 = 0; var4 < var3; ++var4) { // L: 150
			this.midiFile.gotoTrack(var4); // L: 151
			this.midiFile.readTrackLength(var4); // L: 152
			this.midiFile.markTrackPosition(var4); // L: 153
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 155
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 156
		this.field3482 = this.midiFile.method6205(this.trackLength); // L: 157
	} // L: 158

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1256499276"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 161
		this.method6091(); // L: 162
	} // L: 163

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1271037352"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 166
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-67"
	)
	public synchronized boolean method6079() {
		return this.musicPatches.load() > 0; // L: 170
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1798130100"
	)
	public synchronized void method6080(int var1, int var2) {
		this.method6081(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-89"
	)
	void method6081(int var1, int var2) {
		this.field3474[var1] = var2; // L: 178
		this.field3476[var1] = var2 & -128; // L: 179
		this.method6145(var1, var2); // L: 180
	} // L: 181

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	void method6145(int var1, int var2) {
		if (var2 != this.field3475[var1]) { // L: 184
			this.field3475[var1] = var2; // L: 185

			for (int var3 = 0; var3 < 128; ++var3) { // L: 186
				this.field3488[var1][var3] = null;
			}
		}

	} // L: 188

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-63"
	)
	void method6128(int var1, int var2, int var3) {
		this.method6097(var1, var2, 64); // L: 191
		if ((this.field3481[var1] & 2) != 0) { // L: 192
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 193
				if (var4.field3557 == var1 && var4.field3559 < 0) { // L: 194
					this.field3490[var1][var4.field3568] = null; // L: 195
					this.field3490[var1][var2] = var4; // L: 196
					int var8 = (var4.field3567 * var4.field3550 >> 12) + var4.field3549; // L: 197
					var4.field3549 += var2 - var4.field3568 << 8; // L: 198
					var4.field3567 = var8 - var4.field3549; // L: 199
					var4.field3550 = 4096; // L: 200
					var4.field3568 = var2; // L: 201
					return; // L: 202
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3475[var1]); // L: 206
		if (var9 != null) { // L: 207
			if (var9.rawSounds[var2] != null) { // L: 208
				RawSound var5 = var9.rawSounds[var2].method1099(); // L: 209
				if (var5 != null) { // L: 210
					MusicPatchNode var6 = new MusicPatchNode(); // L: 211
					var6.field3557 = var1; // L: 212
					var6.table = var9; // L: 213
					var6.rawSound = var5; // L: 214
					var6.field3545 = var9.field3526[var2]; // L: 215
					var6.field3553 = var9.field3523[var2]; // L: 216
					var6.field3568 = var2; // L: 217
					var6.field3551 = var3 * var3 * var9.field3524[var2] * var9.field3531 + 1024 >> 11; // L: 218
					var6.field3552 = var9.field3525[var2] & 255; // L: 219
					var6.field3549 = (var2 << 8) - (var9.field3522[var2] & 32767); // L: 220
					var6.field3556 = 0; // L: 221
					var6.field3566 = 0; // L: 222
					var6.field3558 = 0; // L: 223
					var6.field3559 = -1; // L: 224
					var6.field3560 = 0; // L: 225
					if (this.field3484[var1] == 0) { // L: 226
						var6.stream = RawPcmStream.method919(var5, this.method6096(var6), this.method6186(var6), this.method6144(var6)); // L: 227
					} else {
						var6.stream = RawPcmStream.method919(var5, this.method6096(var6), 0, this.method6144(var6)); // L: 230
						this.method6084(var6, var9.field3522[var2] < 0); // L: 231
					}

					if (var9.field3522[var2] < 0) { // L: 233
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3553 >= 0) { // L: 234
						MusicPatchNode var7 = this.field3488[var1][var6.field3553]; // L: 235
						if (var7 != null && var7.field3559 < 0) { // L: 236
							this.field3490[var1][var7.field3568] = null; // L: 237
							var7.field3559 = 0; // L: 238
						}

						this.field3488[var1][var6.field3553] = var6; // L: 240
					}

					this.patchStream.queue.addFirst(var6); // L: 242
					this.field3490[var1][var2] = var6; // L: 243
				}
			}
		}
	} // L: 244

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZB)V",
		garbageValue = "-127"
	)
	void method6084(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 247
		int var4;
		if (var2 && var1.rawSound.field267) { // L: 249
			int var5 = var3 + var3 - var1.rawSound.start; // L: 250
			var4 = (int)((long)var5 * (long)this.field3484[var1.field3557] >> 6); // L: 251
			var3 <<= 8; // L: 252
			if (var4 >= var3) { // L: 253
				var4 = var3 + var3 - 1 - var4; // L: 254
				var1.stream.method923(); // L: 255
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3484[var1.field3557] >> 6); // L: 259
		}

		var1.stream.method959(var4); // L: 261
	} // L: 262

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "115"
	)
	void method6097(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3490[var1][var2]; // L: 265
		if (var4 != null) { // L: 266
			this.field3490[var1][var2] = null; // L: 267
			if ((this.field3481[var1] & 2) != 0) { // L: 268
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 269
					if (var4.field3557 == var5.field3557 && var5.field3559 < 0 && var5 != var4) { // L: 270
						var4.field3559 = 0; // L: 271
						break; // L: 272
					}
				}
			} else {
				var4.field3559 = 0; // L: 277
			}

		}
	} // L: 279

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "255"
	)
	void method6135(int var1, int var2, int var3) {
	} // L: 281

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1927423918"
	)
	void method6086(int var1, int var2) {
	} // L: 282

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "699999928"
	)
	void method6087(int var1, int var2) {
		this.field3477[var1] = var2; // L: 285
	} // L: 286

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "466938433"
	)
	void method6088(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
			if (var1 < 0 || var2.field3557 == var1) { // L: 290
				if (var2.stream != null) { // L: 291
					var2.stream.method1022(class189.field1993 * 22050 / 100); // L: 292
					if (var2.stream.method936()) { // L: 293
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6288(); // L: 294
				}

				if (var2.field3559 < 0) { // L: 296
					this.field3490[var2.field3557][var2.field3568] = null;
				}

				var2.remove(); // L: 297
			}
		}

	} // L: 300

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-49"
	)
	void method6089(int var1) {
		if (var1 >= 0) { // L: 303
			this.field3480[var1] = 12800; // L: 307
			this.field3472[var1] = 8192; // L: 308
			this.field3500[var1] = 16383; // L: 309
			this.field3477[var1] = 8192; // L: 310
			this.field3478[var1] = 0; // L: 311
			this.field3479[var1] = 8192; // L: 312
			this.method6107(var1); // L: 313
			this.method6093(var1); // L: 314
			this.field3481[var1] = 0; // L: 315
			this.field3473[var1] = 32767; // L: 316
			this.field3471[var1] = 256; // L: 317
			this.field3484[var1] = 0; // L: 318
			this.method6159(var1, 8192); // L: 319
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 304
				this.method6089(var1);
			}

		}
	} // L: 305 320

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1547440629"
	)
	void method6090(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 323
			if ((var1 < 0 || var2.field3557 == var1) && var2.field3559 < 0) { // L: 324 325
				this.field3490[var2.field3557][var2.field3568] = null; // L: 326
				var2.field3559 = 0; // L: 327
			}
		}

	} // L: 331

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	void method6091() {
		this.method6088(-1); // L: 334
		this.method6089(-1); // L: 335

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 336
			this.field3475[var1] = this.field3474[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 337
			this.field3476[var1] = this.field3474[var1] & -128;
		}

	} // L: 338

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2091346053"
	)
	void method6107(int var1) {
		if ((this.field3481[var1] & 2) != 0) { // L: 341
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 342
				if (var2.field3557 == var1 && this.field3490[var1][var2.field3568] == null && var2.field3559 < 0) { // L: 343 344
					var2.field3559 = 0;
				}
			}
		}

	} // L: 348

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "592552276"
	)
	void method6093(int var1) {
		if ((this.field3481[var1] & 4) != 0) { // L: 351
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 352
				if (var2.field3557 == var1) { // L: 353
					var2.field3554 = 0;
				}
			}
		}

	} // L: 356

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-871283348"
	)
	void method6094(int var1) {
		int var2 = var1 & 240; // L: 359
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 360
			var3 = var1 & 15; // L: 361
			var4 = var1 >> 8 & 127; // L: 362
			var5 = var1 >> 16 & 127; // L: 363
			this.method6097(var3, var4, var5); // L: 364
		} else if (var2 == 144) { // L: 367
			var3 = var1 & 15; // L: 368
			var4 = var1 >> 8 & 127; // L: 369
			var5 = var1 >> 16 & 127; // L: 370
			if (var5 > 0) { // L: 371
				this.method6128(var3, var4, var5);
			} else {
				this.method6097(var3, var4, 64); // L: 372
			}

		} else if (var2 == 160) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			var5 = var1 >> 16 & 127; // L: 378
			this.method6135(var3, var4, var5); // L: 379
		} else if (var2 == 176) { // L: 382
			var3 = var1 & 15; // L: 383
			var4 = var1 >> 8 & 127; // L: 384
			var5 = var1 >> 16 & 127; // L: 385
			if (var4 == 0) { // L: 386
				this.field3476[var3] = (var5 << 14) + (this.field3476[var3] & -2080769);
			}

			if (var4 == 32) { // L: 387
				this.field3476[var3] = (var5 << 7) + (this.field3476[var3] & -16257);
			}

			if (var4 == 1) { // L: 388
				this.field3478[var3] = (var5 << 7) + (this.field3478[var3] & -16257);
			}

			if (var4 == 33) { // L: 389
				this.field3478[var3] = var5 + (this.field3478[var3] & -128);
			}

			if (var4 == 5) { // L: 390
				this.field3479[var3] = (var5 << 7) + (this.field3479[var3] & -16257);
			}

			if (var4 == 37) { // L: 391
				this.field3479[var3] = var5 + (this.field3479[var3] & -128);
			}

			if (var4 == 7) { // L: 392
				this.field3480[var3] = (var5 << 7) + (this.field3480[var3] & -16257);
			}

			if (var4 == 39) { // L: 393
				this.field3480[var3] = var5 + (this.field3480[var3] & -128);
			}

			if (var4 == 10) { // L: 394
				this.field3472[var3] = (var5 << 7) + (this.field3472[var3] & -16257);
			}

			if (var4 == 42) { // L: 395
				this.field3472[var3] = var5 + (this.field3472[var3] & -128);
			}

			if (var4 == 11) { // L: 396
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & -16257);
			}

			if (var4 == 43) { // L: 397
				this.field3500[var3] = var5 + (this.field3500[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 398
				if (var5 >= 64) { // L: 399
					var10000 = this.field3481;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3481; // L: 400
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 402
				if (var5 >= 64) { // L: 403
					var10000 = this.field3481;
					var10000[var3] |= 2;
				} else {
					this.method6107(var3); // L: 405
					var10000 = this.field3481; // L: 406
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 409
				this.field3473[var3] = (var5 << 7) + (this.field3473[var3] & 127);
			}

			if (var4 == 98) { // L: 410
				this.field3473[var3] = (this.field3473[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 411
				this.field3473[var3] = (var5 << 7) + (this.field3473[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 412
				this.field3473[var3] = (this.field3473[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 413
				this.method6088(var3);
			}

			if (var4 == 121) { // L: 414
				this.method6089(var3);
			}

			if (var4 == 123) { // L: 415
				this.method6090(var3);
			}

			int var6;
			if (var4 == 6) { // L: 416
				var6 = this.field3473[var3]; // L: 417
				if (var6 == 16384) { // L: 418
					this.field3471[var3] = (var5 << 7) + (this.field3471[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 420
				var6 = this.field3473[var3]; // L: 421
				if (var6 == 16384) { // L: 422
					this.field3471[var3] = var5 + (this.field3471[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 424
				this.field3484[var3] = (var5 << 7) + (this.field3484[var3] & -16257);
			}

			if (var4 == 48) { // L: 425
				this.field3484[var3] = var5 + (this.field3484[var3] & -128);
			}

			if (var4 == 81) { // L: 426
				if (var5 >= 64) { // L: 427
					var10000 = this.field3481;
					var10000[var3] |= 4;
				} else {
					this.method6093(var3); // L: 429
					var10000 = this.field3481; // L: 430
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6159(var3, (var5 << 7) + (this.field3485[var3] & -16257)); // L: 433
			}

			if (var4 == 49) { // L: 434
				this.method6159(var3, var5 + (this.field3485[var3] & -128));
			}

		} else if (var2 == 192) { // L: 437
			var3 = var1 & 15; // L: 438
			var4 = var1 >> 8 & 127; // L: 439
			this.method6145(var3, var4 + this.field3476[var3]); // L: 440
		} else if (var2 == 208) { // L: 443
			var3 = var1 & 15; // L: 444
			var4 = var1 >> 8 & 127; // L: 445
			this.method6086(var3, var4); // L: 446
		} else if (var2 == 224) { // L: 449
			var3 = var1 & 15; // L: 450
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 451
			this.method6087(var3, var4); // L: 452
		} else {
			var2 = var1 & 255; // L: 455
			if (var2 == 255) { // L: 456
				this.method6091(); // L: 457
			}
		}
	} // L: 365 373 380 435 441 447 453 458 460

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1103725518"
	)
	void method6159(int var1, int var2) {
		this.field3485[var1] = var2; // L: 463
		this.field3494[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 464
	} // L: 465

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmv;B)I",
		garbageValue = "111"
	)
	int method6096(MusicPatchNode var1) {
		int var2 = (var1.field3550 * var1.field3567 >> 12) + var1.field3549; // L: 468
		var2 += (this.field3477[var1.field3557] - 8192) * this.field3471[var1.field3557] >> 12; // L: 469
		MusicPatchNode2 var3 = var1.field3545; // L: 470
		int var4;
		if (var3.field3452 > 0 && (var3.field3451 > 0 || this.field3478[var1.field3557] > 0)) { // L: 471
			var4 = var3.field3451 << 2; // L: 472
			int var5 = var3.field3449 << 1; // L: 473
			if (var1.field3561 < var5) { // L: 474
				var4 = var4 * var1.field3561 / var5;
			}

			var4 += this.field3478[var1.field3557] >> 7; // L: 475
			double var6 = Math.sin((double)(var1.field3562 & 511) * 0.01227184630308513D); // L: 476
			var2 += (int)((double)var4 * var6); // L: 477
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class189.field1993 * 22050) + 0.5D); // L: 479
		return var4 < 1 ? 1 : var4; // L: 480
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-1407702522"
	)
	int method6186(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3545; // L: 484
		int var3 = this.field3480[var1.field3557] * this.field3500[var1.field3557] + 4096 >> 13; // L: 485
		var3 = var3 * var3 + 16384 >> 15; // L: 486
		var3 = var3 * var1.field3551 + 16384 >> 15; // L: 487
		var3 = var3 * this.field3470 + 128 >> 8; // L: 488
		if (var2.field3453 > 0) { // L: 489
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)(var1.field3556 * 128) * 1.953125E-5D * (double)var2.field3453) + 0.5D); // L: 490
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3446 != null) { // L: 492
			var4 = var1.field3566; // L: 493
			var5 = var2.field3446[var1.field3558 * 4 + 1]; // L: 494
			if (var1.field3558 * 4 < var2.field3446.length - 2) { // L: 495
				var6 = (var2.field3446[var1.field3558 * 4] & 255) << 8; // L: 496
				var7 = (var2.field3446[var1.field3558 * 4 + 2] & 255) << 8; // L: 497
				var5 += (var2.field3446[var1.field3558 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 498
			}

			var3 = var3 * var5 + 32 >> 6; // L: 500
		}

		if (var1.field3559 > 0 && var2.field3445 != null) { // L: 502
			var4 = var1.field3559; // L: 503
			var5 = var2.field3445[var1.field3560 * 4 + 1]; // L: 504
			if (var1.field3560 * 4 < var2.field3445.length - 2) { // L: 505
				var6 = (var2.field3445[var1.field3560 * 4] & 255) << 8; // L: 506
				var7 = (var2.field3445[var1.field3560 * 4 + 2] & 255) << 8; // L: 507
				var5 += (var2.field3445[var1.field3560 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 508
			}

			var3 = var5 * var3 + 32 >> 6; // L: 510
		}

		return var3; // L: 512
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)I",
		garbageValue = "-953411793"
	)
	int method6144(MusicPatchNode var1) {
		int var2 = this.field3472[var1.field3557]; // L: 516
		return var2 < 8192 ? var2 * var1.field3552 + 32 >> 6 : 16384 - ((128 - var1.field3552) * (16384 - var2) + 32 >> 6); // L: 517 518
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method6104() {
		int var1 = this.track; // L: 575
		int var2 = this.trackLength; // L: 576

		long var3;
		for (var3 = this.field3482; var2 == this.trackLength; var3 = this.midiFile.method6205(var2)) { // L: 577 578 600
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 579
				this.midiFile.gotoTrack(var1); // L: 580
				int var5 = this.midiFile.readMessage(var1); // L: 581
				if (var5 == 1) { // L: 582
					this.midiFile.setTrackDone(); // L: 583
					this.midiFile.markTrackPosition(var1); // L: 584
					if (this.midiFile.isDone()) { // L: 585
						if (!this.field3469 || var2 == 0) { // L: 586
							this.method6091(); // L: 590
							this.midiFile.clear(); // L: 591
							return; // L: 592
						}

						this.midiFile.reset(var3); // L: 587
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 594
					this.method6094(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 595
				this.midiFile.markTrackPosition(var1); // L: 596
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 598
			var2 = this.midiFile.trackLengths[var1]; // L: 599
		}

		this.track = var1; // L: 602
		this.trackLength = var2; // L: 603
		this.field3482 = var3; // L: 604
	} // L: 605

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lmv;I)Z",
		garbageValue = "456617802"
	)
	boolean method6105(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 608
			if (var1.field3559 >= 0) { // L: 609
				var1.remove(); // L: 610
				if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) { // L: 611
					this.field3488[var1.field3557][var1.field3553] = null; // L: 612
				}
			}

			return true; // L: 615
		} else {
			return false; // L: 617
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmv;[IIII)Z",
		garbageValue = "167898530"
	)
	boolean method6106(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3564 = class189.field1993 * 22050 / 100; // L: 621
		if (var1.field3559 < 0 || var1.stream != null && !var1.stream.method988()) { // L: 622
			int var5 = var1.field3550; // L: 630
			if (var5 > 0) { // L: 631
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3479[var1.field3557]) + 0.5D); // L: 632
				if (var5 < 0) { // L: 633
					var5 = 0;
				}

				var1.field3550 = var5; // L: 634
			}

			var1.stream.method933(this.method6096(var1)); // L: 636
			MusicPatchNode2 var6 = var1.field3545; // L: 637
			boolean var7 = false; // L: 638
			++var1.field3561; // L: 639
			var1.field3562 += var6.field3452; // L: 640
			double var8 = (double)((var1.field3568 - 60 << 8) + (var1.field3567 * var1.field3550 >> 12)) * 5.086263020833333E-6D; // L: 641
			if (var6.field3453 > 0) { // L: 642
				if (var6.field3450 > 0) { // L: 643
					var1.field3556 = var1.field3556 * -885506048 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3450) + 0.5D) * 261517440;
				} else {
					var1.field3556 = var1.field3556 * -885506048 + -885506048; // L: 644
				}
			}

			if (var6.field3446 != null) { // L: 646
				if (var6.field3448 > 0) { // L: 647
					var1.field3566 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3448) + 0.5D);
				} else {
					var1.field3566 += 128; // L: 648
				}

				while (var1.field3558 * 4 < var6.field3446.length - 2 && var1.field3566 > (var6.field3446[var1.field3558 * 4 + 2] & 255) << 8) { // L: 649
					var1.field3558 = var1.field3558 * 4 + 2;
				}

				if (var1.field3558 * 4 == var6.field3446.length - 2 && var6.field3446[var1.field3558 * 4 + 1] == 0) { // L: 650
					var7 = true;
				}
			}

			if (var1.field3559 >= 0 && var6.field3445 != null && (this.field3481[var1.field3557] & 1) == 0 && (var1.field3553 < 0 || var1 != this.field3488[var1.field3557][var1.field3553])) { // L: 652 653
				if (var6.field3447 > 0) { // L: 654
					var1.field3559 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3447) + 0.5D);
				} else {
					var1.field3559 += 128; // L: 655
				}

				while (var1.field3560 * 4 < var6.field3445.length - 2 && var1.field3559 > (var6.field3445[var1.field3560 * 4 + 2] & 255) << 8) { // L: 656
					var1.field3560 = var1.field3560 * 4 + 2;
				}

				if (var1.field3560 * 4 == var6.field3445.length - 2) { // L: 657
					var7 = true;
				}
			}

			if (var7) { // L: 660
				var1.stream.method1022(var1.field3564); // L: 661
				if (var2 != null) { // L: 662
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 663
				}

				if (var1.stream.method936()) { // L: 664
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6288(); // L: 665
				if (var1.field3559 >= 0) { // L: 666
					var1.remove(); // L: 667
					if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) { // L: 668
						this.field3488[var1.field3557][var1.field3553] = null; // L: 669
					}
				}

				return true; // L: 672
			} else {
				var1.stream.method931(var1.field3564, this.method6186(var1), this.method6144(var1)); // L: 674
				return false; // L: 675
			}
		} else {
			var1.method6288(); // L: 623
			var1.remove(); // L: 624
			if (var1.field3553 > 0 && var1 == this.field3488[var1.field3557][var1.field3553]) { // L: 625
				this.field3488[var1.field3557][var1.field3553] = null; // L: 626
			}

			return true; // L: 628
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-45"
	)
	public static String method6176(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : ""; // L: 126 127
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "1456727681"
	)
	public static void method6132(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3759; // L: 942
		boolean var4 = var2 != var3.field3640; // L: 943
		var3.field3640 = var2; // L: 944
		if (var4) { // L: 945
			int var5;
			int var6;
			if (var3.field3640 == var1) { // L: 946
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) { // L: 947
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 948
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 949
						var3.equipment[var6] = var3.field3643[var6]; // L: 950
					}
				}
			} else {
				if (var3.equipment[0] < 512 || FriendsChatMember.method8252(var3)) { // L: 955
					var3.equipment[class205.field2257.field2259] = 1; // L: 956
				}

				for (var5 = 0; var5 < 7; ++var5) { // L: 958
					var6 = PlayerComposition.equipmentIndices[var5]; // L: 959
					if (var3.equipment[var6] > 0 && var3.equipment[var6] < 512) { // L: 960
						int[] var7 = var3.equipment; // L: 961

						for (int var8 = 0; var8 < KitDefinition.field1871; ++var8) { // L: 963
							KitDefinition var9 = PlayerType.KitDefinition_get(var8); // L: 964
							if (var9 != null && !var9.nonSelectable && (var2 == 1 ? 7 : 0) + var5 == var9.bodypartID) { // L: 965
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256; // L: 966
								break; // L: 967
							}
						}
					}
				}
			}
		}

		var3.method6383(); // L: 975
	} // L: 976

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Z",
		garbageValue = "52"
	)
	static final boolean method6149(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8520

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8521 8522 8527
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8523
				var5 = var6; // L: 8524
				break;
			}
		}

		if (var5 != null) { // L: 8529
			var5.field1167 = var4; // L: 8530
			return true; // L: 8531
		} else {
			return false; // L: 8533
		}
	}

	@ObfuscatedName("no")
	static final void method6190(double var0) {
		Rasterizer3D.method5296(var0); // L: 12104
		((TextureProvider)Rasterizer3D.field2809.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12105
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12107
		class93.clientPreferences.method2544(var0); // L: 12109
	} // L: 12110
}
