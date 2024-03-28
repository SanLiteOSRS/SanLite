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

@ObfuscatedName("mx")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bh")
	static AtomicBoolean field3519;
	@ObfuscatedName("bs")
	static ThreadPoolExecutor field3528;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1232505159
	)
	int field3505;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1876602435
	)
	int field3506;
	@ObfuscatedName("at")
	int[] field3520;
	@ObfuscatedName("an")
	int[] field3508;
	@ObfuscatedName("ao")
	int[] field3517;
	@ObfuscatedName("ab")
	int[] field3510;
	@ObfuscatedName("aw")
	int[] field3511;
	@ObfuscatedName("ad")
	int[] field3512;
	@ObfuscatedName("al")
	int[] field3535;
	@ObfuscatedName("as")
	int[] field3514;
	@ObfuscatedName("ag")
	int[] field3531;
	@ObfuscatedName("av")
	int[] field3516;
	@ObfuscatedName("aa")
	int[] field3533;
	@ObfuscatedName("aq")
	int[] field3518;
	@ObfuscatedName("am")
	int[] field3507;
	@ObfuscatedName("ac")
	int[] field3513;
	@ObfuscatedName("ae")
	int[] field3521;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lme;"
	)
	MusicPatchNode[][] field3522;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[[Lme;"
	)
	MusicPatchNode[][] field3523;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bc")
	boolean field3525;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 806727885
	)
	@Export("track")
	int track;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1400628395
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		longValue = 5342612596381340661L
	)
	long field3509;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -7189705389303690993L
	)
	long field3529;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	PcmPlayer field3504;
	@ObfuscatedName("bl")
	PriorityQueue field3532;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1531536061
	)
	public int field3534;

	static {
		field3519 = null; // L: 53
		field3528 = null; // L: 54
	}

	@ObfuscatedSignature(
		descriptor = "(Lby;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3505 = 256; // L: 22
		this.field3506 = 1000000; // L: 23
		this.field3520 = new int[16]; // L: 24
		this.field3508 = new int[16]; // L: 25
		this.field3517 = new int[16]; // L: 26
		this.field3510 = new int[16]; // L: 27
		this.field3511 = new int[16]; // L: 28
		this.field3512 = new int[16]; // L: 29
		this.field3535 = new int[16]; // L: 30
		this.field3514 = new int[16]; // L: 31
		this.field3531 = new int[16]; // L: 32
		this.field3516 = new int[16]; // L: 36
		this.field3533 = new int[16]; // L: 37
		this.field3518 = new int[16]; // L: 38
		this.field3507 = new int[16]; // L: 39
		this.field3513 = new int[16]; // L: 40
		this.field3521 = new int[16]; // L: 41
		this.field3522 = new MusicPatchNode[16][128]; // L: 42
		this.field3523 = new MusicPatchNode[16][128]; // L: 43
		this.midiFile = new MidiFileReader(); // L: 44
		this.patchStream = new MusicPatchPcmStream(this); // L: 50
		this.field3504 = null; // L: 51
		this.field3532 = new PriorityQueue(5, new class332()); // L: 52
		this.field3534 = 0; // L: 55
		this.field3504 = var1; // L: 58
		this.musicPatches = new NodeHashTable(128); // L: 59
		this.method6020(); // L: 60
	} // L: 61

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1707051618"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3504) { // L: 64
			this.field3505 = var1; // L: 65
		}
	} // L: 67

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1748103113"
	)
	public int method6000() {
		return this.field3505; // L: 70
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Loc;Lbq;B)Z",
		garbageValue = "71"
	)
	public boolean method6085(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3504) { // L: 74
			boolean var5 = true; // L: 75
			synchronized(this.field3532) { // L: 76
				this.field3532.clear(); // L: 77
			} // L: 78

			for (class334 var6 = (class334)var1.field3574.first(); var6 != null; var6 = (class334)var1.field3574.next()) { // L: 79
				int var14 = (int)var6.key; // L: 80
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14); // L: 81
				if (var8 == null) { // L: 82
					var8 = HealthBarDefinition.method3813(var2, var14); // L: 83
					if (var8 == null) { // L: 84
						var5 = false; // L: 85
						continue; // L: 86
					}

					this.musicPatches.put(var8, (long)var14); // L: 88
				}

				if (!var8.method6186(var3, var6.field3618)) { // L: 90
					var5 = false;
				} else if (this.field3532 != null) { // L: 91
					synchronized(this.field3532) { // L: 92
						Iterator var10 = var8.field3560.iterator(); // L: 93

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next(); // L: 94
							this.field3532.add(new class325(var6.field3622, var11)); // L: 96
						}
					}
				}
			}

			return var5; // L: 102
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-435435149"
	)
	public void method6002() {
		if (this.field3532 != null) { // L: 107
			if (field3519 != null) { // L: 110
				field3519.set(true); // L: 111
			}

			field3519 = new AtomicBoolean(false); // L: 113
			AtomicBoolean var1 = field3519; // L: 114
			if (field3528 == null) { // L: 115
				int var2 = Runtime.getRuntime().availableProcessors(); // L: 116
				field3528 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class324(this)); // L: 117
			}

			field3528.submit(new class328(this, var1)); // L: 124
		}
	} // L: 108 140

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1799863503"
	)
	public void method6093() {
		synchronized(this.field3504) { // L: 143
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 144
				var2.clear();
			}

		}
	} // L: 146

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream; // L: 542
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null; // L: 546
	}

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return 0; // L: 550
	}

	@ObfuscatedName("ad")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 554
			int var4 = this.midiFile.division * this.field3506 * -727379968 / (class472.field4892 * 722468864); // L: 555

			do {
				long var5 = (long)var3 * (long)var4 + this.field3509; // L: 557
				if (this.field3529 - var5 >= 0L) { // L: 558
					this.field3509 = var5; // L: 559
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3529 - this.field3509) - 1L) / (long)var4); // L: 562
				this.field3509 += (long)var4 * (long)var7; // L: 563
				this.patchStream.fill(var1, var2, var7); // L: 564
				var2 += var7; // L: 565
				var3 -= var7; // L: 566
				this.method6034(); // L: 567
			} while(this.midiFile.isReady()); // L: 568
		}

		this.patchStream.fill(var1, var2, var3); // L: 571
	} // L: 572

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method6004() {
		synchronized(this.field3504) { // L: 149
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) { // L: 150
				var2.remove();
			}

		}
	} // L: 152

	@ObfuscatedName("as")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 575
			int var2 = this.midiFile.division * this.field3506 * -727379968 / (class472.field4892 * 722468864); // L: 576

			do {
				long var3 = (long)var2 * (long)var1 + this.field3509; // L: 578
				if (this.field3529 - var3 >= 0L) { // L: 579
					this.field3509 = var3; // L: 580
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3529 - this.field3509) - 1L) / (long)var2); // L: 583
				this.field3509 += (long)var5 * (long)var2; // L: 584
				this.patchStream.skip(var5); // L: 585
				var1 -= var5; // L: 586
				this.method6034(); // L: 587
			} while(this.midiFile.isReady()); // L: 588
		}

		this.patchStream.skip(var1); // L: 591
	} // L: 592

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZI)V",
		garbageValue = "-1881676391"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3504) { // L: 155
			this.clear(); // L: 156
			this.midiFile.parse(var1.midi); // L: 157
			this.field3525 = var2; // L: 158
			this.field3509 = 0L; // L: 159
			int var4 = this.midiFile.trackCount(); // L: 160

			for (int var5 = 0; var5 < var4; ++var5) { // L: 161
				this.midiFile.gotoTrack(var5); // L: 162
				this.midiFile.readTrackLength(var5); // L: 163
				this.midiFile.markTrackPosition(var5); // L: 164
			}

			this.track = this.midiFile.getPrioritizedTrack(); // L: 166
			this.trackLength = this.midiFile.trackLengths[this.track]; // L: 167
			this.field3529 = this.midiFile.method6142(this.trackLength); // L: 168
		}
	} // L: 170

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1568230116"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3504) { // L: 173
			this.midiFile.clear(); // L: 174
			this.method6020(); // L: 175
		}
	} // L: 177

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3504) { // L: 180
			return this.midiFile.isReady(); // L: 181
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1230358681"
	)
	public boolean method6113() {
		synchronized(this.field3504) { // L: 186
			return this.musicPatches.load() > 0; // L: 187
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "324552685"
	)
	public void method6009(int var1, int var2) {
		synchronized(this.field3504) { // L: 192
			this.method6010(var1, var2); // L: 193
		}
	} // L: 195

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1868799263"
	)
	void method6010(int var1, int var2) {
		this.field3510[var1] = var2; // L: 198
		this.field3512[var1] = var2 & -128; // L: 199
		this.method6011(var1, var2); // L: 200
	} // L: 201

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "245482142"
	)
	void method6011(int var1, int var2) {
		if (var2 != this.field3511[var1]) { // L: 204
			this.field3511[var1] = var2; // L: 205

			for (int var3 = 0; var3 < 128; ++var3) { // L: 206
				this.field3523[var1][var3] = null;
			}
		}

	} // L: 208

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-892706501"
	)
	void method6127(int var1, int var2, int var3) {
		this.method6014(var1, var2, 64); // L: 211
		if ((this.field3516[var1] & 2) != 0) { // L: 212
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 213
				if (var4.field3590 == var1 && var4.field3582 < 0) { // L: 214
					this.field3522[var1][var4.field3581] = null; // L: 215
					this.field3522[var1][var2] = var4; // L: 216
					int var8 = (var4.field3586 * var4.field3596 >> 12) + var4.field3583; // L: 217
					var4.field3583 += var2 - var4.field3581 << 8; // L: 218
					var4.field3596 = var8 - var4.field3583; // L: 219
					var4.field3586 = 4096; // L: 220
					var4.field3581 = var2; // L: 221
					return; // L: 222
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3511[var1]); // L: 226
		if (var9 != null) { // L: 227
			if (var9.rawSounds[var2] != null) { // L: 228
				RawSound var5 = var9.rawSounds[var2].method1044(); // L: 229
				if (var5 != null) { // L: 230
					MusicPatchNode var6 = new MusicPatchNode(); // L: 231
					var6.field3590 = var1; // L: 232
					var6.table = var9; // L: 233
					var6.rawSound = var5; // L: 234
					var6.field3579 = var9.field3563[var2]; // L: 235
					var6.field3580 = var9.field3564[var2]; // L: 236
					var6.field3581 = var2; // L: 237
					var6.field3576 = var3 * var3 * var9.field3561[var2] * var9.field3565 + 1024 >> 11; // L: 238
					var6.field3589 = var9.field3562[var2] & 255; // L: 239
					var6.field3583 = (var2 << 8) - (var9.field3557[var2] & 32767); // L: 240
					var6.field3587 = 0; // L: 241
					var6.field3588 = 0; // L: 242
					var6.field3593 = 0; // L: 243
					var6.field3582 = -1; // L: 244
					var6.field3584 = 0; // L: 245
					if (this.field3507[var1] == 0) { // L: 246
						var6.stream = RawPcmStream.method856(var5, this.method6094(var6), this.method6027(var6), this.method6028(var6)); // L: 247
					} else {
						var6.stream = RawPcmStream.method856(var5, this.method6094(var6), 0, this.method6028(var6)); // L: 250
						this.method6013(var6, var9.field3557[var2] < 0); // L: 251
					}

					if (var9.field3557[var2] < 0) { // L: 253
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3580 >= 0) { // L: 254
						MusicPatchNode var7 = this.field3523[var1][var6.field3580]; // L: 255
						if (var7 != null && var7.field3582 < 0) { // L: 256
							this.field3522[var1][var7.field3581] = null; // L: 257
							var7.field3582 = 0; // L: 258
						}

						this.field3523[var1][var6.field3580] = var6; // L: 260
					}

					this.patchStream.queue.addFirst(var6); // L: 262
					this.field3522[var1][var2] = var6; // L: 263
				}
			}
		}
	} // L: 264

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lme;ZI)V",
		garbageValue = "-1782952424"
	)
	void method6013(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 267
		int var4;
		if (var2 && var1.rawSound.field254) { // L: 269
			int var5 = var3 + var3 - var1.rawSound.start; // L: 270
			var4 = (int)((long)var5 * (long)this.field3507[var1.field3590] >> 6); // L: 271
			var3 <<= 8; // L: 272
			if (var4 >= var3) { // L: 273
				var4 = var3 + var3 - 1 - var4; // L: 274
				var1.stream.method865(); // L: 275
			}
		} else {
			var4 = (int)((long)this.field3507[var1.field3590] * (long)var3 >> 6); // L: 279
		}

		var1.stream.method899(var4); // L: 281
	} // L: 282

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-35"
	)
	void method6014(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3522[var1][var2]; // L: 285
		if (var4 != null) { // L: 286
			this.field3522[var1][var2] = null; // L: 287
			if ((this.field3516[var1] & 2) != 0) { // L: 288
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
					if (var4.field3590 == var5.field3590 && var5.field3582 < 0 && var4 != var5) { // L: 290
						var4.field3582 = 0; // L: 291
						break; // L: 292
					}
				}
			} else {
				var4.field3582 = 0; // L: 297
			}

		}
	} // L: 299

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "32"
	)
	void method6015(int var1, int var2, int var3) {
	} // L: 301

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "41"
	)
	void method6032(int var1, int var2) {
	} // L: 302

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1901244464"
	)
	void method6017(int var1, int var2) {
		this.field3535[var1] = var2; // L: 305
	} // L: 306

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-55"
	)
	void method6019(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 309
			if (var1 < 0 || var2.field3590 == var1) { // L: 310
				if (var2.stream != null) { // L: 311
					var2.stream.method862(class472.field4892 * 722468864 / 100); // L: 312
					if (var2.stream.method873()) { // L: 313
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6225(); // L: 314
				}

				if (var2.field3582 < 0) { // L: 316
					this.field3522[var2.field3590][var2.field3581] = null;
				}

				var2.remove(); // L: 317
			}
		}

	} // L: 320

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	void method6099(int var1) {
		if (var1 >= 0) { // L: 323
			this.field3520[var1] = 12800; // L: 327
			this.field3508[var1] = 8192; // L: 328
			this.field3517[var1] = 16383; // L: 329
			this.field3535[var1] = 8192; // L: 330
			this.field3514[var1] = 0; // L: 331
			this.field3531[var1] = 8192; // L: 332
			this.method6022(var1); // L: 333
			this.method6023(var1); // L: 334
			this.field3516[var1] = 0; // L: 335
			this.field3533[var1] = 32767; // L: 336
			this.field3518[var1] = 256; // L: 337
			this.field3507[var1] = 0; // L: 338
			this.method6025(var1, 8192); // L: 339
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 324
				this.method6099(var1);
			}

		}
	} // L: 325 340

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-80"
	)
	void method6001(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 343
			if ((var1 < 0 || var2.field3590 == var1) && var2.field3582 < 0) { // L: 344 345
				this.field3522[var2.field3590][var2.field3581] = null; // L: 346
				var2.field3582 = 0; // L: 347
			}
		}

	} // L: 351

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-798437721"
	)
	void method6020() {
		this.method6019(-1); // L: 354
		this.method6099(-1); // L: 355

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 356
			this.field3511[var1] = this.field3510[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 357
			this.field3512[var1] = this.field3510[var1] & -128;
		}

	} // L: 358

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1648662084"
	)
	void method6022(int var1) {
		if ((this.field3516[var1] & 2) != 0) { // L: 361
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 362
				if (var2.field3590 == var1 && this.field3522[var1][var2.field3581] == null && var2.field3582 < 0) { // L: 363 364
					var2.field3582 = 0;
				}
			}
		}

	} // L: 368

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6023(int var1) {
		if ((this.field3516[var1] & 4) != 0) { // L: 371
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 372
				if (var2.field3590 == var1) { // L: 373
					var2.field3597 = 0;
				}
			}
		}

	} // L: 376

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1128476609"
	)
	void method6024(int var1) {
		int var2 = var1 & 240; // L: 379
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 380
			var3 = var1 & 15; // L: 381
			var4 = var1 >> 8 & 127; // L: 382
			var5 = var1 >> 16 & 127; // L: 383
			this.method6014(var3, var4, var5); // L: 384
		} else if (var2 == 144) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = var1 >> 8 & 127; // L: 389
			var5 = var1 >> 16 & 127; // L: 390
			if (var5 > 0) { // L: 391
				this.method6127(var3, var4, var5);
			} else {
				this.method6014(var3, var4, 64); // L: 392
			}

		} else if (var2 == 160) { // L: 395
			var3 = var1 & 15; // L: 396
			var4 = var1 >> 8 & 127; // L: 397
			var5 = var1 >> 16 & 127; // L: 398
			this.method6015(var3, var4, var5); // L: 399
		} else if (var2 == 176) { // L: 402
			var3 = var1 & 15; // L: 403
			var4 = var1 >> 8 & 127; // L: 404
			var5 = var1 >> 16 & 127; // L: 405
			if (var4 == 0) { // L: 406
				this.field3512[var3] = (var5 << 14) + (this.field3512[var3] & -2080769);
			}

			if (var4 == 32) { // L: 407
				this.field3512[var3] = (var5 << 7) + (this.field3512[var3] & -16257);
			}

			if (var4 == 1) { // L: 408
				this.field3514[var3] = (var5 << 7) + (this.field3514[var3] & -16257);
			}

			if (var4 == 33) { // L: 409
				this.field3514[var3] = var5 + (this.field3514[var3] & -128);
			}

			if (var4 == 5) { // L: 410
				this.field3531[var3] = (var5 << 7) + (this.field3531[var3] & -16257);
			}

			if (var4 == 37) { // L: 411
				this.field3531[var3] = var5 + (this.field3531[var3] & -128);
			}

			if (var4 == 7) { // L: 412
				this.field3520[var3] = (var5 << 7) + (this.field3520[var3] & -16257);
			}

			if (var4 == 39) { // L: 413
				this.field3520[var3] = var5 + (this.field3520[var3] & -128);
			}

			if (var4 == 10) { // L: 414
				this.field3508[var3] = (var5 << 7) + (this.field3508[var3] & -16257);
			}

			if (var4 == 42) { // L: 415
				this.field3508[var3] = var5 + (this.field3508[var3] & -128);
			}

			if (var4 == 11) { // L: 416
				this.field3517[var3] = (var5 << 7) + (this.field3517[var3] & -16257);
			}

			if (var4 == 43) { // L: 417
				this.field3517[var3] = var5 + (this.field3517[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 418
				if (var5 >= 64) { // L: 419
					var10000 = this.field3516;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3516; // L: 420
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 422
				if (var5 >= 64) { // L: 423
					var10000 = this.field3516;
					var10000[var3] |= 2;
				} else {
					this.method6022(var3); // L: 425
					var10000 = this.field3516; // L: 426
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 429
				this.field3533[var3] = (var5 << 7) + (this.field3533[var3] & 127);
			}

			if (var4 == 98) { // L: 430
				this.field3533[var3] = (this.field3533[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 431
				this.field3533[var3] = (var5 << 7) + (this.field3533[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 432
				this.field3533[var3] = (this.field3533[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 433
				this.method6019(var3);
			}

			if (var4 == 121) { // L: 434
				this.method6099(var3);
			}

			if (var4 == 123) { // L: 435
				this.method6001(var3);
			}

			int var6;
			if (var4 == 6) { // L: 436
				var6 = this.field3533[var3]; // L: 437
				if (var6 == 16384) { // L: 438
					this.field3518[var3] = (var5 << 7) + (this.field3518[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 440
				var6 = this.field3533[var3]; // L: 441
				if (var6 == 16384) { // L: 442
					this.field3518[var3] = var5 + (this.field3518[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 444
				this.field3507[var3] = (var5 << 7) + (this.field3507[var3] & -16257);
			}

			if (var4 == 48) { // L: 445
				this.field3507[var3] = var5 + (this.field3507[var3] & -128);
			}

			if (var4 == 81) { // L: 446
				if (var5 >= 64) { // L: 447
					var10000 = this.field3516;
					var10000[var3] |= 4;
				} else {
					this.method6023(var3); // L: 449
					var10000 = this.field3516; // L: 450
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6025(var3, (var5 << 7) + (this.field3513[var3] & -16257)); // L: 453
			}

			if (var4 == 49) { // L: 454
				this.method6025(var3, var5 + (this.field3513[var3] & -128));
			}

		} else if (var2 == 192) { // L: 457
			var3 = var1 & 15; // L: 458
			var4 = var1 >> 8 & 127; // L: 459
			this.method6011(var3, var4 + this.field3512[var3]); // L: 460
		} else if (var2 == 208) { // L: 463
			var3 = var1 & 15; // L: 464
			var4 = var1 >> 8 & 127; // L: 465
			this.method6032(var3, var4); // L: 466
		} else if (var2 == 224) { // L: 469
			var3 = var1 & 15; // L: 470
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 471
			this.method6017(var3, var4); // L: 472
		} else {
			var2 = var1 & 255; // L: 475
			if (var2 == 255) { // L: 476
				this.method6020(); // L: 477
			}
		}
	} // L: 385 393 400 455 461 467 473 478 480

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2035548933"
	)
	void method6025(int var1, int var2) {
		this.field3513[var1] = var2; // L: 483
		this.field3521[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 484
	} // L: 485

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "2025674930"
	)
	int method6094(MusicPatchNode var1) {
		int var2 = (var1.field3586 * var1.field3596 >> 12) + var1.field3583; // L: 488
		var2 += (this.field3535[var1.field3590] - 8192) * this.field3518[var1.field3590] >> 12; // L: 489
		MusicPatchNode2 var3 = var1.field3579; // L: 490
		int var4;
		if (var3.field3485 > 0 && (var3.field3483 > 0 || this.field3514[var1.field3590] > 0)) { // L: 491
			var4 = var3.field3483 << 2; // L: 492
			int var5 = var3.field3481 << 1; // L: 493
			if (var1.field3592 < var5) { // L: 494
				var4 = var4 * var1.field3592 / var5;
			}

			var4 += this.field3514[var1.field3590] >> 7; // L: 495
			double var6 = Math.sin((double)(var1.field3595 & 511) * 0.01227184630308513D); // L: 496
			var2 += (int)((double)var4 * var6); // L: 497
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class472.field4892 * 722468864) + 0.5D); // L: 499
		return var4 < 1 ? 1 : var4; // L: 500
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "1315318775"
	)
	int method6027(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3579; // L: 504
		int var3 = this.field3520[var1.field3590] * this.field3517[var1.field3590] + 4096 >> 13; // L: 505
		var3 = var3 * var3 + 16384 >> 15; // L: 506
		var3 = var3 * var1.field3576 + 16384 >> 15; // L: 507
		var3 = var3 * this.field3505 + 128 >> 8; // L: 508
		if (var2.field3489 > 0) { // L: 509
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3489 * (double)var1.field3587 * 1.953125E-5D) + 0.5D); // L: 510
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3488 != null) { // L: 512
			var4 = var1.field3588; // L: 513
			var5 = var2.field3488[var1.field3593 * 4 + 1]; // L: 514
			if (var1.field3593 * 4 < var2.field3488.length - 2) { // L: 515
				var6 = (var2.field3488[var1.field3593 * 4] & 255) << 8; // L: 516
				var7 = (var2.field3488[var1.field3593 * 4 + 2] & 255) << 8; // L: 517
				var5 += (var4 - var6) * (var2.field3488[var1.field3593 * 4 + 3] - var5) / (var7 - var6); // L: 518
			}

			var3 = var3 * var5 + 32 >> 6; // L: 520
		}

		if (var1.field3582 > 0 && var2.field3482 != null) { // L: 522
			var4 = var1.field3582; // L: 523
			var5 = var2.field3482[var1.field3584 * 2 + 1]; // L: 524
			if (var1.field3584 * 2 < var2.field3482.length - 2) { // L: 525
				var6 = (var2.field3482[var1.field3584 * 2] & 255) << 8; // L: 526
				var7 = (var2.field3482[var1.field3584 * 2 + 2] & 255) << 8; // L: 527
				var5 += (var2.field3482[var1.field3584 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 528
			}

			var3 = var5 * var3 + 32 >> 6; // L: 530
		}

		return var3; // L: 532
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "-1571379808"
	)
	int method6028(MusicPatchNode var1) {
		int var2 = this.field3508[var1.field3590]; // L: 536
		return var2 < 8192 ? var2 * var1.field3589 + 32 >> 6 : 16384 - ((128 - var1.field3589) * (16384 - var2) + 32 >> 6); // L: 537 538
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "23791"
	)
	void method6034() {
		int var1 = this.track; // L: 595
		int var2 = this.trackLength; // L: 596

		long var3;
		for (var3 = this.field3529; var2 == this.trackLength; var3 = this.midiFile.method6142(var2)) { // L: 597 598 620
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 599
				this.midiFile.gotoTrack(var1); // L: 600
				int var5 = this.midiFile.readMessage(var1); // L: 601
				if (var5 == 1) { // L: 602
					this.midiFile.setTrackDone(); // L: 603
					this.midiFile.markTrackPosition(var1); // L: 604
					if (this.midiFile.isDone()) { // L: 605
						if (!this.field3525 || var2 == 0) { // L: 606
							this.method6020(); // L: 610
							this.midiFile.clear(); // L: 611
							return; // L: 612
						}

						this.midiFile.reset(var3); // L: 607
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 614
					this.method6024(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 615
				this.midiFile.markTrackPosition(var1); // L: 616
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 618
			var2 = this.midiFile.trackLengths[var1]; // L: 619
		}

		this.track = var1; // L: 622
		this.trackLength = var2; // L: 623
		this.field3529 = var3; // L: 624
	} // L: 625

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)Z",
		garbageValue = "2146565938"
	)
	boolean method6003(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 628
			if (var1.field3582 >= 0) { // L: 629
				var1.remove(); // L: 630
				if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) { // L: 631
					this.field3523[var1.field3590][var1.field3580] = null; // L: 632
				}
			}

			return true; // L: 635
		} else {
			return false; // L: 637
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lme;[IIII)Z",
		garbageValue = "1082346919"
	)
	boolean method6037(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3577 = class472.field4892 * 722468864 / 100; // L: 641
		if (var1.field3582 < 0 || var1.stream != null && !var1.stream.method853()) { // L: 642
			int var5 = var1.field3586; // L: 650
			if (var5 > 0) { // L: 651
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3531[var1.field3590]) + 0.5D); // L: 652
				if (var5 < 0) { // L: 653
					var5 = 0;
				}

				var1.field3586 = var5; // L: 654
			}

			var1.stream.method896(this.method6094(var1)); // L: 656
			MusicPatchNode2 var6 = var1.field3579; // L: 657
			boolean var7 = false; // L: 658
			++var1.field3592; // L: 659
			var1.field3595 += var6.field3485; // L: 660
			double var8 = (double)((var1.field3581 - 60 << 8) + (var1.field3586 * var1.field3596 >> 12)) * 5.086263020833333E-6D; // L: 661
			if (var6.field3489 > 0) { // L: 662
				if (var6.field3486 > 0) { // L: 663
					var1.field3587 = var1.field3587 * -1599848448 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3486) + 0.5D) * -1599848448;
				} else {
					var1.field3587 = var1.field3587 * -1599848448 + 1377828864; // L: 664
				}
			}

			if (var6.field3488 != null) { // L: 666
				if (var6.field3484 > 0) { // L: 667
					var1.field3588 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3484 * var8) + 0.5D);
				} else {
					var1.field3588 += 128; // L: 668
				}

				while (var1.field3593 * 4 < var6.field3488.length - 2 && var1.field3588 > (var6.field3488[var1.field3593 * 4 + 2] & 255) << 8) { // L: 669
					var1.field3593 = var1.field3593 * 4 + 2;
				}

				if (var1.field3593 * 4 == var6.field3488.length - 2 && var6.field3488[var1.field3593 * 4 + 1] == 0) { // L: 670
					var7 = true;
				}
			}

			if (var1.field3582 >= 0 && var6.field3482 != null && (this.field3516[var1.field3590] & 1) == 0 && (var1.field3580 < 0 || var1 != this.field3523[var1.field3590][var1.field3580])) { // L: 672 673
				if (var6.field3487 > 0) { // L: 674
					var1.field3582 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3487) + 0.5D);
				} else {
					var1.field3582 += 128; // L: 675
				}

				while (var1.field3584 * 2 < var6.field3482.length - 2 && var1.field3582 > (var6.field3482[var1.field3584 * 2 + 2] & 255) << 8) { // L: 676
					var1.field3584 = var1.field3584 * 4 + 4;
				}

				if (var1.field3584 * 2 == var6.field3482.length - 2) { // L: 677
					var7 = true;
				}
			}

			if (var7) { // L: 680
				var1.stream.method862(var1.field3577); // L: 681
				if (var2 != null) { // L: 682
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 683
				}

				if (var1.stream.method873()) { // L: 684
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6225(); // L: 685
				if (var1.field3582 >= 0) { // L: 686
					var1.remove(); // L: 687
					if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) { // L: 688
						this.field3523[var1.field3590][var1.field3580] = null; // L: 689
					}
				}

				return true; // L: 692
			} else {
				var1.stream.method868(var1.field3577, this.method6027(var1), this.method6028(var1)); // L: 694
				return false; // L: 695
			}
		} else {
			var1.method6225(); // L: 643
			var1.remove(); // L: 644
			if (var1.field3580 > 0 && var1 == this.field3523[var1.field3590][var1.field3580]) { // L: 645
				this.field3523[var1.field3590][var1.field3580] = null; // L: 646
			}

			return true; // L: 648
		}
	}
}
