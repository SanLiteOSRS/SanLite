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

@ObfuscatedName("lf")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bf")
	static AtomicBoolean field3441;
	@ObfuscatedName("bq")
	static ThreadPoolExecutor field3438;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1749604367
	)
	int field3414;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -119074624
	)
	int field3422;
	@ObfuscatedName("at")
	int[] field3416;
	@ObfuscatedName("ac")
	int[] field3417;
	@ObfuscatedName("ai")
	int[] field3418;
	@ObfuscatedName("az")
	int[] field3419;
	@ObfuscatedName("ap")
	int[] field3420;
	@ObfuscatedName("aa")
	int[] field3425;
	@ObfuscatedName("af")
	int[] field3431;
	@ObfuscatedName("ad")
	int[] field3421;
	@ObfuscatedName("aq")
	int[] field3424;
	@ObfuscatedName("ah")
	int[] field3413;
	@ObfuscatedName("as")
	int[] field3426;
	@ObfuscatedName("ay")
	int[] field3427;
	@ObfuscatedName("aj")
	int[] field3415;
	@ObfuscatedName("av")
	int[] field3429;
	@ObfuscatedName("aw")
	int[] field3440;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	MusicPatchNode[][] field3428;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[[Lmg;"
	)
	MusicPatchNode[][] field3432;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bk")
	boolean field3434;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -716283687
	)
	@Export("track")
	int track;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -699922429
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -7285986816161155915L
	)
	long field3437;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = 6809306897544537L
	)
	long field3430;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	PriorityQueue field3423;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1591268569
	)
	public int field3443;

	static {
		field3441 = null; // L: 52
		field3438 = null; // L: 53
	}

	public MidiPcmStream() {
		this.field3414 = 256; // L: 22
		this.field3422 = -727379968; // L: 23
		this.field3416 = new int[16]; // L: 24
		this.field3417 = new int[16]; // L: 25
		this.field3418 = new int[16]; // L: 26
		this.field3419 = new int[16]; // L: 27
		this.field3420 = new int[16]; // L: 28
		this.field3425 = new int[16]; // L: 29
		this.field3431 = new int[16];
		this.field3421 = new int[16]; // L: 31
		this.field3424 = new int[16]; // L: 32
		this.field3413 = new int[16]; // L: 36
		this.field3426 = new int[16]; // L: 37
		this.field3427 = new int[16]; // L: 38
		this.field3415 = new int[16]; // L: 39
		this.field3429 = new int[16]; // L: 40
		this.field3440 = new int[16]; // L: 41
		this.field3428 = new MusicPatchNode[16][128]; // L: 42
		this.field3432 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3423 = new PriorityQueue(5, new class316()); // L: 51
		this.field3443 = 0; // L: 54
		this.musicPatches = new NodeHashTable(128); // L: 57
		this.method5803(); // L: 58
	} // L: 59

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "178339919"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3414 = var1; // L: 62
	} // L: 63

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1304608444"
	)
	public int method5830() {
		return this.field3414; // L: 66
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lnu;Lbi;I)Z",
		garbageValue = "2146420949"
	)
	public synchronized boolean method5781(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 70
		synchronized(this.field3423) { // L: 71
			this.field3423.clear(); // L: 72
		} // L: 73

		for (class318 var5 = (class318)var1.field3486.first(); var5 != null; var5 = (class318)var1.field3486.next()) { // L: 74
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

			if (!var7.method5959(var3, var5.field3526)) { // L: 94
				var4 = false;
			} else if (this.field3423 != null) { // L: 95
				synchronized(this.field3423) { // L: 96
					Iterator var15 = var7.field3475.iterator(); // L: 97

					while (var15.hasNext()) {
						class53 var10 = (class53)var15.next(); // L: 98
						this.field3423.add(new class309(var5.field3527, var10)); // L: 100
					}
				}
			}
		}

		return var4; // L: 106
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-932325376"
	)
	public void method5782() {
		if (this.field3423 != null) { // L: 110
			if (field3441 != null) { // L: 113
				field3441.set(true); // L: 114
			}

			field3441 = new AtomicBoolean(false); // L: 116
			AtomicBoolean var1 = field3441; // L: 117
			if (field3438 == null) { // L: 118
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 119
				field3438 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class308(this)); // L: 120
			}

			field3438.submit(new class312(this, var1)); // L: 127
		}
	} // L: 111 143

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2076204033"
	)
	public synchronized void method5783() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 146
			var1.method5960();
		}

	} // L: 147

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 531
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 535
	}

	@ObfuscatedName("ap")
	protected synchronized int vmethod5973() {
		return 0; // L: 539
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 543
			int var4 = this.midiFile.division * this.field3422 * 1000000 / PcmPlayer.field293; // L: 544

			do {
				long var5 = (long)var4 * (long)var3 + this.field3437; // L: 546
				if (this.field3430 - var5 >= 0L) { // L: 547
					this.field3437 = var5; // L: 548
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3430 - this.field3437) - 1L) / (long)var4); // L: 551
				this.field3437 += (long)var4 * (long)var7; // L: 552
				this.patchStream.fill(var1, var2, var7); // L: 553
				var2 += var7; // L: 554
				var3 -= var7; // L: 555
				this.method5814(); // L: 556
			} while(this.midiFile.isReady()); // L: 557
		}

		this.patchStream.fill(var1, var2, var3); // L: 560
	} // L: 561

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1876288055"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove(); // L: 150
		}

	} // L: 151

	@ObfuscatedName("ad")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 564
			int var2 = this.midiFile.division * this.field3422 * 1000000 / PcmPlayer.field293; // L: 565

			do {
				long var3 = this.field3437 + (long)var1 * (long)var2; // L: 567
				if (this.field3430 - var3 >= 0L) { // L: 568
					this.field3437 = var3; // L: 569
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3430 - this.field3437) - 1L) / (long)var2); // L: 572
				this.field3437 += (long)var2 * (long)var5; // L: 573
				this.patchStream.skip(var5); // L: 574
				var1 -= var5; // L: 575
				this.method5814(); // L: 576
			} while(this.midiFile.isReady()); // L: 577
		}

		this.patchStream.skip(var1); // L: 580
	} // L: 581

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZI)V",
		garbageValue = "718932503"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 154
		this.midiFile.parse(var1.midi); // L: 155
		this.field3434 = var2; // L: 156
		this.field3437 = 0L; // L: 157
		int var3 = this.midiFile.trackCount(); // L: 158

		for (int var4 = 0; var4 < var3; ++var4) { // L: 159
			this.midiFile.gotoTrack(var4); // L: 160
			this.midiFile.readTrackLength(var4); // L: 161
			this.midiFile.markTrackPosition(var4); // L: 162
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 164
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 165
		this.field3430 = this.midiFile.method5924(this.trackLength); // L: 166
	} // L: 167

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "965115955"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 170
		this.method5803(); // L: 171
	} // L: 172

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-12"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 175
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public synchronized boolean method5788() {
		return this.musicPatches.method8746() > 0; // L: 179
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1830042203"
	)
	public synchronized void method5811(int var1, int var2) {
		this.method5835(var1, var2); // L: 183
	} // L: 184

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-22"
	)
	void method5835(int var1, int var2) {
		this.field3419[var1] = var2; // L: 187
		this.field3425[var1] = var2 & -128; // L: 188
		this.method5791(var1, var2); // L: 189
	} // L: 190

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "71"
	)
	void method5791(int var1, int var2) {
		if (var2 != this.field3420[var1]) { // L: 193
			this.field3420[var1] = var2; // L: 194

			for (int var3 = 0; var3 < 128; ++var3) { // L: 195
				this.field3432[var1][var3] = null;
			}
		}

	} // L: 197

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "896950696"
	)
	void method5792(int var1, int var2, int var3) {
		this.method5794(var1, var2, 64); // L: 200
		if ((this.field3413[var1] & 2) != 0) { // L: 201
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 202
				if (var4.field3497 == var1 && var4.field3501 < 0) { // L: 203
					this.field3428[var1][var4.field3492] = null; // L: 204
					this.field3428[var1][var2] = var4; // L: 205
					int var8 = (var4.field3496 * var4.field3499 >> 12) + var4.field3491; // L: 206
					var4.field3491 += var2 - var4.field3492 << 8; // L: 207
					var4.field3496 = var8 - var4.field3491; // L: 208
					var4.field3499 = 4096; // L: 209
					var4.field3492 = var2; // L: 210
					return; // L: 211
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3420[var1]); // L: 215
		if (var9 != null) { // L: 216
			if (var9.rawSounds[var2] != null) { // L: 217
				RawSound var5 = var9.rawSounds[var2].method1087(); // L: 218
				if (var5 != null) { // L: 219
					MusicPatchNode var6 = new MusicPatchNode(); // L: 220
					var6.field3497 = var1; // L: 221
					var6.table = var9; // L: 222
					var6.rawSound = var5; // L: 223
					var6.field3490 = var9.field3471[var2]; // L: 224
					var6.field3503 = var9.field3472[var2]; // L: 225
					var6.field3492 = var2; // L: 226
					var6.field3493 = var3 * var3 * var9.field3469[var2] * var9.field3474 + 1024 >> 11; // L: 227
					var6.field3494 = var9.field3470[var2] & 255; // L: 228
					var6.field3491 = (var2 << 8) - (var9.field3468[var2] & 32767); // L: 229
					var6.field3498 = 0; // L: 230
					var6.field3505 = 0; // L: 231
					var6.field3500 = 0; // L: 232
					var6.field3501 = -1; // L: 233
					var6.field3502 = 0; // L: 234
					if (this.field3415[var1] == 0) { // L: 235
						var6.stream = RawPcmStream.method904(var5, this.method5843(var6), this.method5849(var6), this.method5808(var6)); // L: 236
					} else {
						var6.stream = RawPcmStream.method904(var5, this.method5843(var6), 0, this.method5808(var6)); // L: 239
						this.method5807(var6, var9.field3468[var2] < 0); // L: 240
					}

					if (var9.field3468[var2] < 0) { // L: 242
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3503 >= 0) { // L: 243
						MusicPatchNode var7 = this.field3432[var1][var6.field3503]; // L: 244
						if (var7 != null && var7.field3501 < 0) { // L: 245
							this.field3428[var1][var7.field3492] = null; // L: 246
							var7.field3501 = 0; // L: 247
						}

						this.field3432[var1][var6.field3503] = var6; // L: 249
					}

					this.patchStream.queue.addFirst(var6); // L: 251
					this.field3428[var1][var2] = var6; // L: 252
				}
			}
		}
	} // L: 253

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmg;ZS)V",
		garbageValue = "5717"
	)
	void method5807(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 256
		int var4;
		if (var2 && var1.rawSound.field283) { // L: 258
			int var5 = var3 + var3 - var1.rawSound.start; // L: 259
			var4 = (int)((long)var5 * (long)this.field3415[var1.field3497] >> 6); // L: 260
			var3 <<= 8; // L: 261
			if (var4 >= var3) { // L: 262
				var4 = var3 + var3 - 1 - var4; // L: 263
				var1.stream.method968(); // L: 264
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3415[var1.field3497] >> 6); // L: 268
		}

		var1.stream.method912(var4); // L: 270
	} // L: 271

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1002745448"
	)
	void method5794(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3428[var1][var2]; // L: 274
		if (var4 != null) { // L: 275
			this.field3428[var1][var2] = null; // L: 276
			if ((this.field3413[var1] & 2) != 0) { // L: 277
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 278
					if (var5.field3497 == var4.field3497 && var5.field3501 < 0 && var4 != var5) { // L: 279
						var4.field3501 = 0; // L: 280
						break; // L: 281
					}
				}
			} else {
				var4.field3501 = 0; // L: 286
			}

		}
	} // L: 288

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1830352831"
	)
	void method5795(int var1, int var2, int var3) {
	} // L: 290

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1399006127"
	)
	void method5796(int var1, int var2) {
	} // L: 291

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1713272694"
	)
	void method5797(int var1, int var2) {
		this.field3431[var1] = var2; // L: 294
	} // L: 295

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "405588365"
	)
	void method5876(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 298
			if (var1 < 0 || var2.field3497 == var1) { // L: 299
				if (var2.stream != null) { // L: 300
					var2.stream.method917(PcmPlayer.field293 / 100); // L: 301
					if (var2.stream.method921()) { // L: 302
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5998(); // L: 303
				}

				if (var2.field3501 < 0) { // L: 305
					this.field3428[var2.field3497][var2.field3492] = null;
				}

				var2.remove(); // L: 306
			}
		}

	} // L: 309

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	void method5799(int var1) {
		if (var1 >= 0) { // L: 312
			this.field3416[var1] = 12800; // L: 316
			this.field3417[var1] = 8192; // L: 317
			this.field3418[var1] = 16383; // L: 318
			this.field3431[var1] = 8192; // L: 319
			this.field3421[var1] = 0; // L: 320
			this.field3424[var1] = 8192; // L: 321
			this.method5802(var1); // L: 322
			this.method5840(var1); // L: 323
			this.field3413[var1] = 0; // L: 324
			this.field3426[var1] = 32767; // L: 325
			this.field3427[var1] = 256; // L: 326
			this.field3415[var1] = 0; // L: 327
			this.method5805(var1, 8192); // L: 328
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 313
				this.method5799(var1);
			}

		}
	} // L: 314 329

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	void method5800(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 332
			if ((var1 < 0 || var2.field3497 == var1) && var2.field3501 < 0) { // L: 333 334
				this.field3428[var2.field3497][var2.field3492] = null; // L: 335
				var2.field3501 = 0; // L: 336
			}
		}

	} // L: 340

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1873768041"
	)
	void method5803() {
		this.method5876(-1); // L: 343
		this.method5799(-1); // L: 344

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3420[var1] = this.field3419[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3425[var1] = this.field3419[var1] & -128;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931071556"
	)
	void method5802(int var1) {
		if ((this.field3413[var1] & 2) != 0) { // L: 350
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 351
				if (var2.field3497 == var1 && this.field3428[var1][var2.field3492] == null && var2.field3501 < 0) { // L: 352 353
					var2.field3501 = 0;
				}
			}
		}

	} // L: 357

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1591565057"
	)
	void method5840(int var1) {
		if ((this.field3413[var1] & 4) != 0) { // L: 360
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 361
				if (var2.field3497 == var1) { // L: 362
					var2.field3507 = 0;
				}
			}
		}

	} // L: 365

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-60"
	)
	void method5806(int var1) {
		int var2 = var1 & 240; // L: 368
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 369
			var3 = var1 & 15; // L: 370
			var4 = var1 >> 8 & 127; // L: 371
			var5 = var1 >> 16 & 127; // L: 372
			this.method5794(var3, var4, var5); // L: 373
		} else if (var2 == 144) { // L: 376
			var3 = var1 & 15; // L: 377
			var4 = var1 >> 8 & 127; // L: 378
			var5 = var1 >> 16 & 127; // L: 379
			if (var5 > 0) { // L: 380
				this.method5792(var3, var4, var5);
			} else {
				this.method5794(var3, var4, 64); // L: 381
			}

		} else if (var2 == 160) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			var5 = var1 >> 16 & 127; // L: 387
			this.method5795(var3, var4, var5); // L: 388
		} else if (var2 == 176) { // L: 391
			var3 = var1 & 15; // L: 392
			var4 = var1 >> 8 & 127; // L: 393
			var5 = var1 >> 16 & 127; // L: 394
			if (var4 == 0) { // L: 395
				this.field3425[var3] = (var5 << 14) + (this.field3425[var3] & -2080769);
			}

			if (var4 == 32) { // L: 396
				this.field3425[var3] = (var5 << 7) + (this.field3425[var3] & -16257);
			}

			if (var4 == 1) { // L: 397
				this.field3421[var3] = (var5 << 7) + (this.field3421[var3] & -16257);
			}

			if (var4 == 33) { // L: 398
				this.field3421[var3] = var5 + (this.field3421[var3] & -128);
			}

			if (var4 == 5) { // L: 399
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 37) { // L: 400
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 7) { // L: 401
				this.field3416[var3] = (var5 << 7) + (this.field3416[var3] & -16257);
			}

			if (var4 == 39) { // L: 402
				this.field3416[var3] = var5 + (this.field3416[var3] & -128);
			}

			if (var4 == 10) { // L: 403
				this.field3417[var3] = (var5 << 7) + (this.field3417[var3] & -16257);
			}

			if (var4 == 42) { // L: 404
				this.field3417[var3] = var5 + (this.field3417[var3] & -128);
			}

			if (var4 == 11) { // L: 405
				this.field3418[var3] = (var5 << 7) + (this.field3418[var3] & -16257);
			}

			if (var4 == 43) { // L: 406
				this.field3418[var3] = var5 + (this.field3418[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 407
				if (var5 >= 64) { // L: 408
					var10000 = this.field3413;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3413; // L: 409
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 411
				if (var5 >= 64) { // L: 412
					var10000 = this.field3413;
					var10000[var3] |= 2;
				} else {
					this.method5802(var3); // L: 414
					var10000 = this.field3413; // L: 415
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 418
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & 127);
			}

			if (var4 == 98) { // L: 419
				this.field3426[var3] = (this.field3426[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 420
				this.field3426[var3] = (var5 << 7) + (this.field3426[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 421
				this.field3426[var3] = (this.field3426[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 422
				this.method5876(var3);
			}

			if (var4 == 121) { // L: 423
				this.method5799(var3);
			}

			if (var4 == 123) { // L: 424
				this.method5800(var3);
			}

			int var6;
			if (var4 == 6) { // L: 425
				var6 = this.field3426[var3]; // L: 426
				if (var6 == 16384) { // L: 427
					this.field3427[var3] = (var5 << 7) + (this.field3427[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 429
				var6 = this.field3426[var3]; // L: 430
				if (var6 == 16384) { // L: 431
					this.field3427[var3] = var5 + (this.field3427[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 433
				this.field3415[var3] = (var5 << 7) + (this.field3415[var3] & -16257);
			}

			if (var4 == 48) { // L: 434
				this.field3415[var3] = var5 + (this.field3415[var3] & -128);
			}

			if (var4 == 81) { // L: 435
				if (var5 >= 64) { // L: 436
					var10000 = this.field3413;
					var10000[var3] |= 4;
				} else {
					this.method5840(var3); // L: 438
					var10000 = this.field3413; // L: 439
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 442
				this.method5805(var3, (var5 << 7) + (this.field3429[var3] & -16257));
			}

			if (var4 == 49) { // L: 443
				this.method5805(var3, var5 + (this.field3429[var3] & -128));
			}

		} else if (var2 == 192) { // L: 446
			var3 = var1 & 15; // L: 447
			var4 = var1 >> 8 & 127; // L: 448
			this.method5791(var3, var4 + this.field3425[var3]); // L: 449
		} else if (var2 == 208) { // L: 452
			var3 = var1 & 15; // L: 453
			var4 = var1 >> 8 & 127; // L: 454
			this.method5796(var3, var4); // L: 455
		} else if (var2 == 224) { // L: 458
			var3 = var1 & 15; // L: 459
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 460
			this.method5797(var3, var4); // L: 461
		} else {
			var2 = var1 & 255; // L: 464
			if (var2 == 255) { // L: 465
				this.method5803(); // L: 466
			}
		}
	} // L: 374 382 389 444 450 456 462 467 469

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "943957578"
	)
	void method5805(int var1, int var2) {
		this.field3429[var1] = var2; // L: 472
		this.field3440[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 473
	} // L: 474

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lmg;B)I",
		garbageValue = "-57"
	)
	int method5843(MusicPatchNode var1) {
		int var2 = (var1.field3499 * var1.field3496 >> 12) + var1.field3491; // L: 477
		var2 += (this.field3431[var1.field3497] - 8192) * this.field3427[var1.field3497] >> 12; // L: 478
		MusicPatchNode2 var3 = var1.field3490; // L: 479
		int var4;
		if (var3.field3394 > 0 && (var3.field3393 > 0 || this.field3421[var1.field3497] > 0)) { // L: 480
			var4 = var3.field3393 << 2; // L: 481
			int var5 = var3.field3395 << 1; // L: 482
			if (var1.field3487 < var5) { // L: 483
				var4 = var4 * var1.field3487 / var5;
			}

			var4 += this.field3421[var1.field3497] >> 7; // L: 484
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3504 & 511)); // L: 485
			var2 += (int)((double)var4 * var6); // L: 486
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field293 + 0.5D); // L: 488
		return var4 < 1 ? 1 : var4; // L: 489
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)I",
		garbageValue = "-1224155709"
	)
	int method5849(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3490; // L: 493
		int var3 = this.field3416[var1.field3497] * this.field3418[var1.field3497] + 4096 >> 13; // L: 494
		var3 = var3 * var3 + 16384 >> 15; // L: 495
		var3 = var3 * var1.field3493 + 16384 >> 15; // L: 496
		var3 = var3 * this.field3414 + 128 >> 8; // L: 497
		if (var2.field3389 > 0) { // L: 498
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3498 * (double)var2.field3389) + 0.5D); // L: 499
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3392 != null) { // L: 501
			var4 = var1.field3505; // L: 502
			var5 = var2.field3392[var1.field3500 * 2 + 1]; // L: 503
			if (var1.field3500 * 2 < var2.field3392.length - 2) { // L: 504
				var6 = (var2.field3392[var1.field3500 * 2] & 255) << 8; // L: 505
				var7 = (var2.field3392[var1.field3500 * 2 + 2] & 255) << 8; // L: 506
				var5 += (var2.field3392[var1.field3500 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 507
			}

			var3 = var5 * var3 + 32 >> 6; // L: 509
		}

		if (var1.field3501 > 0 && var2.field3398 != null) { // L: 511
			var4 = var1.field3501; // L: 512
			var5 = var2.field3398[var1.field3502 * 4 + 1]; // L: 513
			if (var1.field3502 * 4 < var2.field3398.length - 2) { // L: 514
				var6 = (var2.field3398[var1.field3502 * 4] & 255) << 8; // L: 515
				var7 = (var2.field3398[var1.field3502 * 4 + 2] & 255) << 8; // L: 516
				var5 += (var4 - var6) * (var2.field3398[var1.field3502 * 4 + 3] - var5) / (var7 - var6); // L: 517
			}

			var3 = var3 * var5 + 32 >> 6; // L: 519
		}

		return var3; // L: 521
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)I",
		garbageValue = "-1781769455"
	)
	int method5808(MusicPatchNode var1) {
		int var2 = this.field3417[var1.field3497]; // L: 525
		return var2 < 8192 ? var2 * var1.field3494 + 32 >> 6 : 16384 - ((128 - var1.field3494) * (16384 - var2) + 32 >> 6); // L: 526 527
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	void method5814() {
		int var1 = this.track; // L: 584
		int var2 = this.trackLength; // L: 585

		long var3;
		for (var3 = this.field3430; var2 == this.trackLength; var3 = this.midiFile.method5924(var2)) { // L: 586 587 609
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 588
				this.midiFile.gotoTrack(var1); // L: 589
				int var5 = this.midiFile.readMessage(var1); // L: 590
				if (var5 == 1) { // L: 591
					this.midiFile.setTrackDone(); // L: 592
					this.midiFile.markTrackPosition(var1); // L: 593
					if (this.midiFile.isDone()) { // L: 594
						if (!this.field3434 || var2 == 0) { // L: 595
							this.method5803(); // L: 599
							this.midiFile.clear(); // L: 600
							return; // L: 601
						}

						this.midiFile.reset(var3); // L: 596
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 603
					this.method5806(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 604
				this.midiFile.markTrackPosition(var1); // L: 605
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 607
			var2 = this.midiFile.trackLengths[var1]; // L: 608
		}

		this.track = var1; // L: 611
		this.trackLength = var2; // L: 612
		this.field3430 = var3; // L: 613
	} // L: 614

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmg;I)Z",
		garbageValue = "845643756"
	)
	boolean method5888(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 617
			if (var1.field3501 >= 0) { // L: 618
				var1.remove(); // L: 619
				if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) { // L: 620
					this.field3432[var1.field3497][var1.field3503] = null; // L: 621
				}
			}

			return true; // L: 624
		} else {
			return false; // L: 626
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lmg;[IIII)Z",
		garbageValue = "1875808849"
	)
	boolean method5816(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3506 = PcmPlayer.field293 / 100; // L: 630
		if (var1.field3501 < 0 || var1.stream != null && !var1.stream.method920()) { // L: 631
			int var5 = var1.field3499; // L: 639
			if (var5 > 0) { // L: 640
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3424[var1.field3497]) + 0.5D); // L: 641
				if (var5 < 0) { // L: 642
					var5 = 0;
				}

				var1.field3499 = var5; // L: 643
			}

			var1.stream.method918(this.method5843(var1)); // L: 645
			MusicPatchNode2 var6 = var1.field3490; // L: 646
			boolean var7 = false; // L: 647
			++var1.field3487; // L: 648
			var1.field3504 += var6.field3394; // L: 649
			double var8 = 5.086263020833333E-6D * (double)((var1.field3492 - 60 << 8) + (var1.field3496 * var1.field3499 >> 12)); // L: 650
			if (var6.field3389 > 0) { // L: 651
				if (var6.field3387 > 0) { // L: 652
					var1.field3498 = var1.field3498 * 380125184 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3387 * var8) + 0.5D) * 380125184;
				} else {
					var1.field3498 = var1.field3498 * 380125184 + 1411383296; // L: 653
				}
			}

			if (var6.field3392 != null) { // L: 655
				if (var6.field3388 > 0) { // L: 656
					var1.field3505 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3388) + 0.5D);
				} else {
					var1.field3505 += 128; // L: 657
				}

				while (var1.field3500 * 2 < var6.field3392.length - 2 && var1.field3505 > (var6.field3392[var1.field3500 * 2 + 2] & 255) << 8) { // L: 658
					var1.field3500 = var1.field3500 * 4 + 4;
				}

				if (var1.field3500 * 2 == var6.field3392.length - 2 && var6.field3392[var1.field3500 * 2 + 1] == 0) { // L: 659
					var7 = true;
				}
			}

			if (var1.field3501 >= 0 && var6.field3398 != null && (this.field3413[var1.field3497] & 1) == 0 && (var1.field3503 < 0 || var1 != this.field3432[var1.field3497][var1.field3503])) { // L: 661 662
				if (var6.field3391 > 0) { // L: 663
					var1.field3501 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3391) + 0.5D);
				} else {
					var1.field3501 += 128; // L: 664
				}

				while (var1.field3502 * 4 < var6.field3398.length - 2 && var1.field3501 > (var6.field3398[var1.field3502 * 4 + 2] & 255) << 8) { // L: 665
					var1.field3502 = var1.field3502 * 4 + 2;
				}

				if (var1.field3502 * 4 == var6.field3398.length - 2) { // L: 666
					var7 = true;
				}
			}

			if (var7) { // L: 669
				var1.stream.method917(var1.field3506); // L: 670
				if (var2 != null) { // L: 671
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 672
				}

				if (var1.stream.method921()) { // L: 673
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5998(); // L: 674
				if (var1.field3501 >= 0) { // L: 675
					var1.remove(); // L: 676
					if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) { // L: 677
						this.field3432[var1.field3497][var1.field3503] = null; // L: 678
					}
				}

				return true; // L: 681
			} else {
				var1.stream.method925(var1.field3506, this.method5849(var1), this.method5808(var1)); // L: 683
				return false; // L: 684
			}
		} else {
			var1.method5998(); // L: 632
			var1.remove(); // L: 633
			if (var1.field3503 > 0 && var1 == this.field3432[var1.field3497][var1.field3503]) { // L: 634
				this.field3432[var1.field3497][var1.field3503] = null; // L: 635
			}

			return true; // L: 637
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnn;",
		garbageValue = "1169137618"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4235, PlayerType.PlayerType_ultimateIronman, PlayerType.field4229, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_playerModerator, PlayerType.field4240, PlayerType.field4238, PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field4245, PlayerType.field4244, PlayerType.field4243, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4241, PlayerType.field4239, PlayerType.field4242, PlayerType.field4237}; // L: 30
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[Lum;",
		garbageValue = "37"
	)
	@Export("FillMode_values")
	public static class526[] FillMode_values() {
		return new class526[]{class526.field5193, class526.field5196, class526.SOLID}; // L: 15
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljt;",
		garbageValue = "2017214624"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 345
		if (var1 != null) { // L: 346
			return var1;
		} else {
			var1 = ArchiveLoader.method2254(VarpDefinition.SequenceDefinition_animationsArchive, class485.SequenceDefinition_skeletonsArchive, var0, false); // L: 347
			if (var1 != null) { // L: 348
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 349
		}
	}
}
