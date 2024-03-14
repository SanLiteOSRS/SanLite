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

@ObfuscatedName("mo")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bv")
	static AtomicBoolean field3511;
	@ObfuscatedName("by")
	static ThreadPoolExecutor field3517;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1100227907
	)
	int field3488;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1891368640
	)
	int field3495;
	@ObfuscatedName("ai")
	int[] field3490;
	@ObfuscatedName("ar")
	int[] field3491;
	@ObfuscatedName("as")
	int[] field3514;
	@ObfuscatedName("aa")
	int[] field3493;
	@ObfuscatedName("az")
	int[] field3494;
	@ObfuscatedName("ao")
	int[] field3503;
	@ObfuscatedName("au")
	int[] field3496;
	@ObfuscatedName("ak")
	int[] field3502;
	@ObfuscatedName("ah")
	int[] field3492;
	@ObfuscatedName("at")
	int[] field3499;
	@ObfuscatedName("ay")
	int[] field3500;
	@ObfuscatedName("ae")
	int[] field3501;
	@ObfuscatedName("ac")
	int[] field3497;
	@ObfuscatedName("ab")
	int[] field3504;
	@ObfuscatedName("av")
	int[] field3516;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3505;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[[Lmw;"
	)
	MusicPatchNode[][] field3506;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bd")
	boolean field3508;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -695121899
	)
	@Export("track")
	int track;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -984331291
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = -4100503427476976343L
	)
	long field3498;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = -3899664085788780929L
	)
	long field3512;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	PcmPlayer field3489;
	@ObfuscatedName("bw")
	PriorityQueue field3515;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1588859775
	)
	public int field3518;

	static {
		field3511 = null; // L: 53
		field3517 = null; // L: 54
	}

	@ObfuscatedSignature(
		descriptor = "(Lbf;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3488 = 256; // L: 22
		this.field3495 = -727379968; // L: 23
		this.field3490 = new int[16]; // L: 24
		this.field3491 = new int[16]; // L: 25
		this.field3514 = new int[16]; // L: 26
		this.field3493 = new int[16]; // L: 27
		this.field3494 = new int[16]; // L: 28
		this.field3503 = new int[16]; // L: 29
		this.field3496 = new int[16]; // L: 30
		this.field3502 = new int[16]; // L: 31
		this.field3492 = new int[16]; // L: 32
		this.field3499 = new int[16]; // L: 36
		this.field3500 = new int[16]; // L: 37
		this.field3501 = new int[16]; // L: 38
		this.field3497 = new int[16]; // L: 39
		this.field3504 = new int[16]; // L: 40
		this.field3516 = new int[16]; // L: 41
		this.field3505 = new MusicPatchNode[16][128]; // L: 42
		this.field3506 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3489 = null; // L: 51
		this.field3515 = new PriorityQueue(5, new class332()); // L: 52
		this.field3518 = 0; // L: 55
		this.field3489 = var1; // L: 58
		this.musicPatches = new NodeHashTable(128); // L: 59
		this.method6171(); // L: 60
	} // L: 61

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1261452882"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3489) { // L: 64
			this.field3488 = var1; // L: 65
		}
	} // L: 67

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6201"
	)
	public int method6150() {
		return this.field3488; // L: 70
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lof;Lbc;I)Z",
		garbageValue = "1123969906"
	)
	public boolean method6151(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3489) { // L: 74
			boolean var5 = true; // L: 75
			synchronized(this.field3515) { // L: 76
				this.field3515.clear(); // L: 77
			} // L: 78

			for (class334 var6 = (class334)var1.field3563.first(); var6 != null; var6 = (class334)var1.field3563.next()) { // L: 79
				int var14 = (int)var6.key; // L: 80
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14); // L: 81
				if (var8 == null) { // L: 82
					byte[] var10 = var2.takeFileFlat(var14); // L: 85
					MusicPatch var9;
					if (var10 == null) { // L: 86
						var9 = null; // L: 87
					} else {
						var9 = new MusicPatch(var10); // L: 90
					}

					var8 = var9; // L: 92
					if (var9 == null) { // L: 93
						var5 = false; // L: 94
						continue; // L: 95
					}

					this.musicPatches.put(var9, (long)var14); // L: 97
				}

				if (!var8.method6328(var3, var6.field3606)) { // L: 99
					var5 = false;
				} else if (this.field3515 != null) { // L: 100
					synchronized(this.field3515) { // L: 101
						Iterator var18 = var8.field3545.iterator(); // L: 102

						while (var18.hasNext()) {
							class53 var11 = (class53)var18.next(); // L: 103
							this.field3515.add(new class325(var6.field3604, var11)); // L: 105
						}
					}
				}
			}

			return var5; // L: 111
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public void method6152() {
		if (this.field3515 != null) { // L: 116
			if (field3511 != null) { // L: 119
				field3511.set(true); // L: 120
			}

			field3511 = new AtomicBoolean(false); // L: 122
			AtomicBoolean var1 = field3511; // L: 123
			if (field3517 == null) { // L: 124
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 125
				field3517 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class324(this)); // L: 126
			}

			field3517.submit(new class328(this, var1)); // L: 133
		}
	} // L: 117 149

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	public void method6153() {
		synchronized(this.field3489) { // L: 152
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 153
				var2.clear();
			}

		}
	} // L: 155

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream; // L: 551
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null; // L: 555
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return 0; // L: 559
	}

	@ObfuscatedName("ao")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 563
			int var4 = this.midiFile.division * this.field3495 * 1000000 / PcmPlayer.field295; // L: 564

			do {
				long var5 = this.field3498 + (long)var4 * (long)var3; // L: 566
				if (this.field3512 - var5 >= 0L) { // L: 567
					this.field3498 = var5; // L: 568
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3512 - this.field3498) - 1L) / (long)var4); // L: 571
				this.field3498 += (long)var4 * (long)var7; // L: 572
				this.patchStream.fill(var1, var2, var7); // L: 573
				var2 += var7; // L: 574
				var3 -= var7; // L: 575
				this.method6188(); // L: 576
			} while(this.midiFile.isReady()); // L: 577
		}

		this.patchStream.fill(var1, var2, var3); // L: 580
	} // L: 581

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	public void method6202() {
		synchronized(this.field3489) { // L: 158
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 159
				var2.remove();
			}

		}
	} // L: 161

	@ObfuscatedName("ak")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 584
			int var2 = this.midiFile.division * this.field3495 * 1000000 / PcmPlayer.field295; // L: 585

			do {
				long var3 = (long)var2 * (long)var1 + this.field3498; // L: 587
				if (this.field3512 - var3 >= 0L) { // L: 588
					this.field3498 = var3; // L: 589
					break;
				}

				int var5 = (int)((this.field3512 - this.field3498 + (long)var2 - 1L) / (long)var2); // L: 592
				this.field3498 += (long)var5 * (long)var2; // L: 593
				this.patchStream.skip(var5); // L: 594
				var1 -= var5; // L: 595
				this.method6188(); // L: 596
			} while(this.midiFile.isReady()); // L: 597
		}

		this.patchStream.skip(var1); // L: 600
	} // L: 601

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmu;ZI)V",
		garbageValue = "-127379304"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3489) { // L: 164
			this.clear(); // L: 165
			this.midiFile.parse(var1.midi); // L: 166
			this.field3508 = var2; // L: 167
			this.field3498 = 0L; // L: 168
			int var4 = this.midiFile.trackCount(); // L: 169

			for (int var5 = 0; var5 < var4; ++var5) { // L: 170
				this.midiFile.gotoTrack(var5); // L: 171
				this.midiFile.readTrackLength(var5); // L: 172
				this.midiFile.markTrackPosition(var5); // L: 173
			}

			this.track = this.midiFile.getPrioritizedTrack(); // L: 175
			this.trackLength = this.midiFile.trackLengths[this.track]; // L: 176
			this.field3512 = this.midiFile.method6323(this.trackLength); // L: 177
		}
	} // L: 179

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3489) { // L: 182
			this.midiFile.clear(); // L: 183
			this.method6171(); // L: 184
		}
	} // L: 186

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-112"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3489) { // L: 189
			return this.midiFile.isReady(); // L: 190
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	public boolean method6229() {
		synchronized(this.field3489) { // L: 195
			return this.musicPatches.method9165() > 0; // L: 196
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public void method6230(int var1, int var2) {
		synchronized(this.field3489) { // L: 201
			this.method6160(var1, var2); // L: 202
		}
	} // L: 204

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1765229247"
	)
	void method6160(int var1, int var2) {
		this.field3493[var1] = var2; // L: 207
		this.field3503[var1] = var2 & -128; // L: 208
		this.method6161(var1, var2); // L: 209
	} // L: 210

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-79"
	)
	void method6161(int var1, int var2) {
		if (var2 != this.field3494[var1]) { // L: 213
			this.field3494[var1] = var2; // L: 214

			for (int var3 = 0; var3 < 128; ++var3) { // L: 215
				this.field3506[var1][var3] = null;
			}
		}

	} // L: 217

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-124"
	)
	void method6162(int var1, int var2, int var3) {
		this.method6164(var1, var2, 64); // L: 220
		if ((this.field3499[var1] & 2) != 0) { // L: 221
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 222
				if (var4.field3576 == var1 && var4.field3578 < 0) { // L: 223
					this.field3505[var1][var4.field3569] = null; // L: 224
					this.field3505[var1][var2] = var4; // L: 225
					int var8 = (var4.field3573 * var4.field3574 >> 12) + var4.field3581; // L: 226
					var4.field3581 += var2 - var4.field3569 << 8; // L: 227
					var4.field3573 = var8 - var4.field3581; // L: 228
					var4.field3574 = 4096; // L: 229
					var4.field3569 = var2; // L: 230
					return; // L: 231
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3494[var1]); // L: 235
		if (var9 != null) { // L: 236
			if (var9.rawSounds[var2] != null) { // L: 237
				RawSound var5 = var9.rawSounds[var2].method1067(); // L: 238
				if (var5 != null) { // L: 239
					MusicPatchNode var6 = new MusicPatchNode(); // L: 240
					var6.field3576 = var1; // L: 241
					var6.table = var9; // L: 242
					var6.rawSound = var5; // L: 243
					var6.field3567 = var9.field3552[var2]; // L: 244
					var6.field3572 = var9.field3554[var2]; // L: 245
					var6.field3569 = var2; // L: 246
					var6.field3570 = var3 * var3 * var9.field3549[var2] * var9.field3551 + 1024 >> 11; // L: 247
					var6.field3580 = var9.field3550[var2] & 255; // L: 248
					var6.field3581 = (var2 << 8) - (var9.field3548[var2] & 32767); // L: 249
					var6.field3571 = 0; // L: 250
					var6.field3582 = 0; // L: 251
					var6.field3577 = 0; // L: 252
					var6.field3578 = -1; // L: 253
					var6.field3579 = 0; // L: 254
					if (this.field3497[var1] == 0) { // L: 255
						var6.stream = RawPcmStream.method846(var5, this.method6176(var6), this.method6177(var6), this.method6178(var6)); // L: 256
					} else {
						var6.stream = RawPcmStream.method846(var5, this.method6176(var6), 0, this.method6178(var6)); // L: 259
						this.method6163(var6, var9.field3548[var2] < 0); // L: 260
					}

					if (var9.field3548[var2] < 0) { // L: 262
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3572 >= 0) { // L: 263
						MusicPatchNode var7 = this.field3506[var1][var6.field3572]; // L: 264
						if (var7 != null && var7.field3578 < 0) { // L: 265
							this.field3505[var1][var7.field3569] = null; // L: 266
							var7.field3578 = 0; // L: 267
						}

						this.field3506[var1][var6.field3572] = var6; // L: 269
					}

					this.patchStream.queue.addFirst(var6); // L: 271
					this.field3505[var1][var2] = var6; // L: 272
				}
			}
		}
	} // L: 273

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "-1050214773"
	)
	void method6163(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 276
		int var4;
		if (var2 && var1.rawSound.field266) { // L: 278
			int var5 = var3 + var3 - var1.rawSound.start; // L: 279
			var4 = (int)((long)this.field3497[var1.field3576] * (long)var5 >> 6); // L: 280
			var3 <<= 8; // L: 281
			if (var4 >= var3) { // L: 282
				var4 = var3 + var3 - 1 - var4; // L: 283
				var1.stream.method855(); // L: 284
			}
		} else {
			var4 = (int)((long)this.field3497[var1.field3576] * (long)var3 >> 6); // L: 288
		}

		var1.stream.method889(var4); // L: 290
	} // L: 291

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-146148879"
	)
	void method6164(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3505[var1][var2]; // L: 294
		if (var4 != null) { // L: 295
			this.field3505[var1][var2] = null; // L: 296
			if ((this.field3499[var1] & 2) != 0) { // L: 297
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 298
					if (var5.field3576 == var4.field3576 && var5.field3578 < 0 && var4 != var5) { // L: 299
						var4.field3578 = 0; // L: 300
						break; // L: 301
					}
				}
			} else {
				var4.field3578 = 0; // L: 306
			}

		}
	} // L: 308

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method6154(int var1, int var2, int var3) {
	} // L: 310

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "12"
	)
	void method6209(int var1, int var2) {
	} // L: 311

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1772179237"
	)
	void method6167(int var1, int var2) {
		this.field3496[var1] = var2; // L: 314
	} // L: 315

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	void method6168(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 318
			if (var1 < 0 || var2.field3576 == var1) { // L: 319
				if (var2.stream != null) { // L: 320
					var2.stream.method951(PcmPlayer.field295 / 100); // L: 321
					if (var2.stream.method849()) { // L: 322
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6378(); // L: 323
				}

				if (var2.field3578 < 0) { // L: 325
					this.field3505[var2.field3576][var2.field3569] = null;
				}

				var2.remove(); // L: 326
			}
		}

	} // L: 329

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-181524970"
	)
	void method6226(int var1) {
		if (var1 >= 0) { // L: 332
			this.field3490[var1] = 12800; // L: 336
			this.field3491[var1] = 8192; // L: 337
			this.field3514[var1] = 16383; // L: 338
			this.field3496[var1] = 8192; // L: 339
			this.field3502[var1] = 0; // L: 340
			this.field3492[var1] = 8192; // L: 341
			this.method6172(var1); // L: 342
			this.method6186(var1); // L: 343
			this.field3499[var1] = 0; // L: 344
			this.field3500[var1] = 32767; // L: 345
			this.field3501[var1] = 256; // L: 346
			this.field3497[var1] = 0; // L: 347
			this.method6173(var1, 8192); // L: 348
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 333
				this.method6226(var1);
			}

		}
	} // L: 334 349

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1332909523"
	)
	void method6248(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 352
			if ((var1 < 0 || var2.field3576 == var1) && var2.field3578 < 0) { // L: 353 354
				this.field3505[var2.field3576][var2.field3569] = null; // L: 355
				var2.field3578 = 0; // L: 356
			}
		}

	} // L: 360

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6171() {
		this.method6168(-1); // L: 363
		this.method6226(-1); // L: 364

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 365
			this.field3494[var1] = this.field3493[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 366
			this.field3503[var1] = this.field3493[var1] & -128;
		}

	} // L: 367

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2105906400"
	)
	void method6172(int var1) {
		if ((this.field3499[var1] & 2) != 0) { // L: 370
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 371
				if (var2.field3576 == var1 && this.field3505[var1][var2.field3569] == null && var2.field3578 < 0) { // L: 372 373
					var2.field3578 = 0;
				}
			}
		}

	} // L: 377

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1575578518"
	)
	void method6186(int var1) {
		if ((this.field3499[var1] & 4) != 0) { // L: 380
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 381
				if (var2.field3576 == var1) { // L: 382
					var2.field3584 = 0;
				}
			}
		}

	} // L: 385

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-97"
	)
	void method6241(int var1) {
		int var2 = var1 & 240; // L: 388
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 389
			var3 = var1 & 15; // L: 390
			var4 = var1 >> 8 & 127; // L: 391
			var5 = var1 >> 16 & 127; // L: 392
			this.method6164(var3, var4, var5); // L: 393
		} else if (var2 == 144) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = var1 >> 8 & 127; // L: 398
			var5 = var1 >> 16 & 127; // L: 399
			if (var5 > 0) { // L: 400
				this.method6162(var3, var4, var5);
			} else {
				this.method6164(var3, var4, 64); // L: 401
			}

		} else if (var2 == 160) { // L: 404
			var3 = var1 & 15; // L: 405
			var4 = var1 >> 8 & 127; // L: 406
			var5 = var1 >> 16 & 127; // L: 407
			this.method6154(var3, var4, var5); // L: 408
		} else if (var2 == 176) { // L: 411
			var3 = var1 & 15; // L: 412
			var4 = var1 >> 8 & 127; // L: 413
			var5 = var1 >> 16 & 127; // L: 414
			if (var4 == 0) { // L: 415
				this.field3503[var3] = (var5 << 14) + (this.field3503[var3] & -2080769);
			}

			if (var4 == 32) { // L: 416
				this.field3503[var3] = (var5 << 7) + (this.field3503[var3] & -16257);
			}

			if (var4 == 1) { // L: 417
				this.field3502[var3] = (var5 << 7) + (this.field3502[var3] & -16257);
			}

			if (var4 == 33) { // L: 418
				this.field3502[var3] = var5 + (this.field3502[var3] & -128);
			}

			if (var4 == 5) { // L: 419
				this.field3492[var3] = (var5 << 7) + (this.field3492[var3] & -16257);
			}

			if (var4 == 37) { // L: 420
				this.field3492[var3] = var5 + (this.field3492[var3] & -128);
			}

			if (var4 == 7) { // L: 421
				this.field3490[var3] = (var5 << 7) + (this.field3490[var3] & -16257);
			}

			if (var4 == 39) { // L: 422
				this.field3490[var3] = var5 + (this.field3490[var3] & -128);
			}

			if (var4 == 10) { // L: 423
				this.field3491[var3] = (var5 << 7) + (this.field3491[var3] & -16257);
			}

			if (var4 == 42) { // L: 424
				this.field3491[var3] = var5 + (this.field3491[var3] & -128);
			}

			if (var4 == 11) { // L: 425
				this.field3514[var3] = (var5 << 7) + (this.field3514[var3] & -16257);
			}

			if (var4 == 43) { // L: 426
				this.field3514[var3] = var5 + (this.field3514[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 427
				if (var5 >= 64) { // L: 428
					var10000 = this.field3499;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3499; // L: 429
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 431
				if (var5 >= 64) { // L: 432
					var10000 = this.field3499;
					var10000[var3] |= 2;
				} else {
					this.method6172(var3); // L: 434
					var10000 = this.field3499; // L: 435
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 438
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & 127);
			}

			if (var4 == 98) { // L: 439
				this.field3500[var3] = (this.field3500[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 440
				this.field3500[var3] = (var5 << 7) + (this.field3500[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 441
				this.field3500[var3] = (this.field3500[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 442
				this.method6168(var3);
			}

			if (var4 == 121) { // L: 443
				this.method6226(var3);
			}

			if (var4 == 123) { // L: 444
				this.method6248(var3);
			}

			int var6;
			if (var4 == 6) { // L: 445
				var6 = this.field3500[var3]; // L: 446
				if (var6 == 16384) { // L: 447
					this.field3501[var3] = (var5 << 7) + (this.field3501[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 449
				var6 = this.field3500[var3]; // L: 450
				if (var6 == 16384) { // L: 451
					this.field3501[var3] = var5 + (this.field3501[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 453
				this.field3497[var3] = (var5 << 7) + (this.field3497[var3] & -16257);
			}

			if (var4 == 48) { // L: 454
				this.field3497[var3] = var5 + (this.field3497[var3] & -128);
			}

			if (var4 == 81) { // L: 455
				if (var5 >= 64) { // L: 456
					var10000 = this.field3499;
					var10000[var3] |= 4;
				} else {
					this.method6186(var3); // L: 458
					var10000 = this.field3499; // L: 459
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6173(var3, (var5 << 7) + (this.field3504[var3] & -16257)); // L: 462
			}

			if (var4 == 49) { // L: 463
				this.method6173(var3, var5 + (this.field3504[var3] & -128));
			}

		} else if (var2 == 192) { // L: 466
			var3 = var1 & 15; // L: 467
			var4 = var1 >> 8 & 127; // L: 468
			this.method6161(var3, var4 + this.field3503[var3]); // L: 469
		} else if (var2 == 208) { // L: 472
			var3 = var1 & 15; // L: 473
			var4 = var1 >> 8 & 127; // L: 474
			this.method6209(var3, var4); // L: 475
		} else if (var2 == 224) { // L: 478
			var3 = var1 & 15; // L: 479
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 480
			this.method6167(var3, var4); // L: 481
		} else {
			var2 = var1 & 255; // L: 484
			if (var2 == 255) { // L: 485
				this.method6171(); // L: 486
			}
		}
	} // L: 394 402 409 464 470 476 482 487 489

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1812753781"
	)
	void method6173(int var1, int var2) {
		this.field3504[var1] = var2; // L: 492
		this.field3516[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 493
	} // L: 494

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "26734457"
	)
	int method6176(MusicPatchNode var1) {
		int var2 = (var1.field3573 * var1.field3574 >> 12) + var1.field3581; // L: 497
		var2 += (this.field3496[var1.field3576] - 8192) * this.field3501[var1.field3576] >> 12; // L: 498
		MusicPatchNode2 var3 = var1.field3567; // L: 499
		int var4;
		if (var3.field3472 > 0 && (var3.field3471 > 0 || this.field3502[var1.field3576] > 0)) { // L: 500
			var4 = var3.field3471 << 2; // L: 501
			int var5 = var3.field3473 << 1; // L: 502
			if (var1.field3586 < var5) { // L: 503
				var4 = var4 * var1.field3586 / var5;
			}

			var4 += this.field3502[var1.field3576] >> 7; // L: 504
			double var6 = Math.sin((double)(var1.field3565 & 511) * 0.01227184630308513D); // L: 505
			var2 += (int)(var6 * (double)var4); // L: 506
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field295 + 0.5D); // L: 508
		return var4 < 1 ? 1 : var4; // L: 509
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "1785127689"
	)
	int method6177(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3567; // L: 513
		int var3 = this.field3490[var1.field3576] * this.field3514[var1.field3576] + 4096 >> 13; // L: 514
		var3 = var3 * var3 + 16384 >> 15; // L: 515
		var3 = var3 * var1.field3570 + 16384 >> 15; // L: 516
		var3 = var3 * this.field3488 + 128 >> 8; // L: 517
		if (var2.field3465 > 0) { // L: 518
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3465 * 1.953125E-5D * (double)(var1.field3571 * 128)) + 0.5D); // L: 519
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3467 != null) { // L: 521
			var4 = var1.field3582; // L: 522
			var5 = var2.field3467[var1.field3577 * 4 + 1]; // L: 523
			if (var1.field3577 * 4 < var2.field3467.length - 2) { // L: 524
				var6 = (var2.field3467[var1.field3577 * 4] & 255) << 8; // L: 525
				var7 = (var2.field3467[var1.field3577 * 4 + 2] & 255) << 8; // L: 526
				var5 += (var2.field3467[var1.field3577 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 527
			}

			var3 = var5 * var3 + 32 >> 6; // L: 529
		}

		if (var1.field3578 > 0 && var2.field3466 != null) { // L: 531
			var4 = var1.field3578; // L: 532
			var5 = var2.field3466[var1.field3579 * 4 + 1]; // L: 533
			if (var1.field3579 * 4 < var2.field3466.length - 2) { // L: 534
				var6 = (var2.field3466[var1.field3579 * 4] & 255) << 8; // L: 535
				var7 = (var2.field3466[var1.field3579 * 4 + 2] & 255) << 8; // L: 536
				var5 += (var4 - var6) * (var2.field3466[var1.field3579 * 4 + 3] - var5) / (var7 - var6); // L: 537
			}

			var3 = var5 * var3 + 32 >> 6; // L: 539
		}

		return var3; // L: 541
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lmw;I)I",
		garbageValue = "169543047"
	)
	int method6178(MusicPatchNode var1) {
		int var2 = this.field3491[var1.field3576]; // L: 545
		return var2 < 8192 ? var2 * var1.field3580 + 32 >> 6 : 16384 - ((128 - var1.field3580) * (16384 - var2) + 32 >> 6); // L: 546 547
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-21270581"
	)
	void method6188() {
		int var1 = this.track; // L: 604
		int var2 = this.trackLength; // L: 605

		long var3;
		for (var3 = this.field3512; var2 == this.trackLength; var3 = this.midiFile.method6323(var2)) { // L: 606 607 629
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 608
				this.midiFile.gotoTrack(var1); // L: 609
				int var5 = this.midiFile.readMessage(var1); // L: 610
				if (var5 == 1) { // L: 611
					this.midiFile.setTrackDone(); // L: 612
					this.midiFile.markTrackPosition(var1); // L: 613
					if (this.midiFile.isDone()) { // L: 614
						if (!this.field3508 || var2 == 0) { // L: 615
							this.method6171(); // L: 619
							this.midiFile.clear(); // L: 620
							return; // L: 621
						}

						this.midiFile.reset(var3); // L: 616
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 623
					this.method6241(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 624
				this.midiFile.markTrackPosition(var1); // L: 625
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 627
			var2 = this.midiFile.trackLengths[var1]; // L: 628
		}

		this.track = var1; // L: 631
		this.trackLength = var2; // L: 632
		this.field3512 = var3; // L: 633
	} // L: 634

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmw;B)Z",
		garbageValue = "4"
	)
	boolean method6180(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 637
			if (var1.field3578 >= 0) { // L: 638
				var1.remove(); // L: 639
				if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) { // L: 640
					this.field3506[var1.field3576][var1.field3572] = null; // L: 641
				}
			}

			return true; // L: 644
		} else {
			return false; // L: 646
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIB)Z",
		garbageValue = "46"
	)
	boolean method6219(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3583 = PcmPlayer.field295 / 100; // L: 650
		if (var1.field3578 < 0 || var1.stream != null && !var1.stream.method979()) { // L: 651
			int var5 = var1.field3574; // L: 659
			if (var5 > 0) { // L: 660
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3492[var1.field3576] * 4.921259842519685E-4D) + 0.5D); // L: 661
				if (var5 < 0) { // L: 662
					var5 = 0;
				}

				var1.field3574 = var5; // L: 663
			}

			var1.stream.method954(this.method6176(var1)); // L: 665
			MusicPatchNode2 var6 = var1.field3567; // L: 666
			boolean var7 = false; // L: 667
			++var1.field3586; // L: 668
			var1.field3565 += var6.field3472; // L: 669
			double var8 = (double)((var1.field3569 - 60 << 8) + (var1.field3574 * var1.field3573 >> 12)) * 5.086263020833333E-6D; // L: 670
			if (var6.field3465 > 0) { // L: 671
				if (var6.field3470 > 0) { // L: 672
					var1.field3571 = var1.field3571 * 240926720 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3470 * var8) + 0.5D) * -937641856;
				} else {
					var1.field3571 = var1.field3571 * 240926720 + 240926720; // L: 673
				}
			}

			if (var6.field3467 != null) { // L: 675
				if (var6.field3468 > 0) { // L: 676
					var1.field3582 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3468) + 0.5D);
				} else {
					var1.field3582 += 128; // L: 677
				}

				while (var1.field3577 * 4 < var6.field3467.length - 2 && var1.field3582 > (var6.field3467[var1.field3577 * 4 + 2] & 255) << 8) { // L: 678
					var1.field3577 = var1.field3577 * 4 + 2;
				}

				if (var1.field3577 * 4 == var6.field3467.length - 2 && var6.field3467[var1.field3577 * 4 + 1] == 0) { // L: 679
					var7 = true;
				}
			}

			if (var1.field3578 >= 0 && var6.field3466 != null && (this.field3499[var1.field3576] & 1) == 0 && (var1.field3572 < 0 || var1 != this.field3506[var1.field3576][var1.field3572])) { // L: 681 682
				if (var6.field3469 > 0) { // L: 683
					var1.field3578 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3469) + 0.5D);
				} else {
					var1.field3578 += 128; // L: 684
				}

				while (var1.field3579 * 4 < var6.field3466.length - 2 && var1.field3578 > (var6.field3466[var1.field3579 * 4 + 2] & 255) << 8) { // L: 685
					var1.field3579 = var1.field3579 * 4 + 2;
				}

				if (var1.field3579 * 4 == var6.field3466.length - 2) { // L: 686
					var7 = true;
				}
			}

			if (var7) { // L: 689
				var1.stream.method951(var1.field3583); // L: 690
				if (var2 != null) { // L: 691
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 692
				}

				if (var1.stream.method849()) { // L: 693
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6378(); // L: 694
				if (var1.field3578 >= 0) { // L: 695
					var1.remove(); // L: 696
					if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) { // L: 697
						this.field3506[var1.field3576][var1.field3572] = null; // L: 698
					}
				}

				return true; // L: 701
			} else {
				var1.stream.method858(var1.field3583, this.method6177(var1), this.method6178(var1)); // L: 703
				return false; // L: 704
			}
		} else {
			var1.method6378(); // L: 652
			var1.remove(); // L: 653
			if (var1.field3572 > 0 && var1 == this.field3506[var1.field3576][var1.field3572]) { // L: 654
				this.field3506[var1.field3576][var1.field3572] = null; // L: 655
			}

			return true; // L: 657
		}
	}
}
