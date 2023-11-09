import java.util.Iterator;
import java.util.PriorityQueue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2056399103
	)
	int field3404;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2108596065
	)
	int field3408;
	@ObfuscatedName("ab")
	int[] field3406;
	@ObfuscatedName("at")
	int[] field3413;
	@ObfuscatedName("ax")
	int[] field3425;
	@ObfuscatedName("al")
	int[] field3409;
	@ObfuscatedName("aj")
	int[] field3410;
	@ObfuscatedName("ac")
	int[] field3411;
	@ObfuscatedName("ag")
	int[] field3412;
	@ObfuscatedName("ad")
	int[] field3424;
	@ObfuscatedName("aw")
	int[] field3414;
	@ObfuscatedName("av")
	int[] field3417;
	@ObfuscatedName("aq")
	int[] field3416;
	@ObfuscatedName("az")
	int[] field3419;
	@ObfuscatedName("ak")
	int[] field3420;
	@ObfuscatedName("aa")
	int[] field3421;
	@ObfuscatedName("au")
	int[] field3405;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[[Lmu;"
	)
	MusicPatchNode[][] field3423;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[[Lmu;"
	)
	MusicPatchNode[][] field3432;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bq")
	boolean field3426;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1035434585
	)
	@Export("track")
	int track;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1860988789
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		longValue = -1924257819441260279L
	)
	long field3429;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		longValue = 8429705480258582159L
	)
	long field3430;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("be")
	public PriorityQueue field3422;

	public MidiPcmStream() {
		this.field3404 = 256; // L: 16
		this.field3408 = 1000000; // L: 17
		this.field3406 = new int[16]; // L: 18
		this.field3413 = new int[16];
		this.field3425 = new int[16];
		this.field3409 = new int[16]; // L: 21
		this.field3410 = new int[16]; // L: 22
		this.field3411 = new int[16]; // L: 23
		this.field3412 = new int[16]; // L: 24
		this.field3424 = new int[16]; // L: 25
		this.field3414 = new int[16]; // L: 26
		this.field3417 = new int[16]; // L: 30
		this.field3416 = new int[16]; // L: 31
		this.field3419 = new int[16]; // L: 32
		this.field3420 = new int[16]; // L: 33
		this.field3421 = new int[16]; // L: 34
		this.field3405 = new int[16]; // L: 35
		this.field3423 = new MusicPatchNode[16][128]; // L: 36
		this.field3432 = new MusicPatchNode[16][128]; // L: 37
		this.midiFile = new MidiFileReader(); // L: 38
		this.patchStream = new MusicPatchPcmStream(this); // L: 44
		this.field3422 = new PriorityQueue(5, new class306()); // L: 45
		this.musicPatches = new NodeHashTable(128); // L: 48
		this.method5846(); // L: 49
	} // L: 50

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-749344371"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3404 = var1; // L: 53
	} // L: 54

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1377133291"
	)
	int method5892() {
		return this.field3404; // L: 57
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmr;Lni;Lbx;I)Z",
		garbageValue = "-565366236"
	)
	public synchronized boolean method5825(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 61

		for (class316 var5 = (class316)var1.field3474.first(); var5 != null; var5 = (class316)var1.field3474.next()) { // L: 62
			int var6 = (int)var5.key; // L: 63
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var6); // L: 64
			if (var7 == null) { // L: 65
				var7 = ApproximateRouteStrategy.method1199(var2, var6); // L: 66
				if (var7 == null) { // L: 67
					var4 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var7, (long)var6); // L: 71
			}

			if (!var7.method5997(var3, var5.field3498)) { // L: 73
				var4 = false;
			} else if (this.field3422 != null) { // L: 74
				Iterator var8 = var7.field3458.iterator(); // L: 75

				while (var8.hasNext()) {
					class53 var9 = (class53)var8.next(); // L: 76
					this.field3422.add(new class310(var5.field3499, var9)); // L: 78
				}
			}
		}

		return var4; // L: 83
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1531514240"
	)
	public synchronized void method5829() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 87
			var1.method5998();
		}

	} // L: 88

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2071593709"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove(); // L: 91
		}

	} // L: 92

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 468
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 472
	}

	@ObfuscatedName("aj")
	protected synchronized int vmethod6018() {
		return 0; // L: 476
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 480
			int var4 = this.midiFile.division * this.field3408 * -727379968 / PcmPlayer.field279; // L: 481

			do {
				long var5 = (long)var4 * (long)var3 + this.field3429; // L: 483
				if (this.field3430 - var5 >= 0L) { // L: 484
					this.field3429 = var5; // L: 485
					break;
				}

				int var7 = (int)((this.field3430 - this.field3429 + (long)var4 - 1L) / (long)var4); // L: 488
				this.field3429 += (long)var4 * (long)var7; // L: 489
				this.patchStream.fill(var1, var2, var7); // L: 490
				var2 += var7; // L: 491
				var3 -= var7; // L: 492
				this.method5859(); // L: 493
			} while(this.midiFile.isReady()); // L: 494
		}

		this.patchStream.fill(var1, var2, var3); // L: 497
	} // L: 498

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ZI)V",
		garbageValue = "1048017948"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 95
		this.midiFile.parse(var1.midi); // L: 96
		this.field3426 = var2; // L: 97
		this.field3429 = 0L; // L: 98
		int var3 = this.midiFile.trackCount(); // L: 99

		for (int var4 = 0; var4 < var3; ++var4) { // L: 100
			this.midiFile.gotoTrack(var4); // L: 101
			this.midiFile.readTrackLength(var4); // L: 102
			this.midiFile.markTrackPosition(var4); // L: 103
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 105
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 106
		this.field3430 = this.midiFile.method5955(this.trackLength); // L: 107
	} // L: 108

	@ObfuscatedName("ad")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 501
			int var2 = this.midiFile.division * this.field3408 * -727379968 / PcmPlayer.field279; // L: 502

			do {
				long var3 = (long)var2 * (long)var1 + this.field3429; // L: 504
				if (this.field3430 - var3 >= 0L) { // L: 505
					this.field3429 = var3; // L: 506
					break;
				}

				int var5 = (int)((this.field3430 - this.field3429 + (long)var2 - 1L) / (long)var2); // L: 509
				this.field3429 += (long)var2 * (long)var5; // L: 510
				this.patchStream.skip(var5); // L: 511
				var1 -= var5; // L: 512
				this.method5859(); // L: 513
			} while(this.midiFile.isReady()); // L: 514
		}

		this.patchStream.skip(var1); // L: 517
	} // L: 518

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 111
		this.method5846(); // L: 112
	} // L: 113

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-101"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 116
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1789256244"
	)
	public synchronized void method5836(int var1, int var2) {
		this.method5832(var1, var2); // L: 120
	} // L: 121

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "634750960"
	)
	void method5832(int var1, int var2) {
		this.field3409[var1] = var2; // L: 124
		this.field3411[var1] = var2 & -128; // L: 125
		this.method5912(var1, var2); // L: 126
	} // L: 127

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-634181762"
	)
	void method5912(int var1, int var2) {
		if (var2 != this.field3410[var1]) { // L: 130
			this.field3410[var1] = var2; // L: 131

			for (int var3 = 0; var3 < 128; ++var3) { // L: 132
				this.field3432[var1][var3] = null;
			}
		}

	} // L: 134

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-1"
	)
	void method5837(int var1, int var2, int var3) {
		this.method5839(var1, var2, 64); // L: 137
		if ((this.field3417[var1] & 2) != 0) { // L: 138
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 139
				if (var4.field3485 == var1 && var4.field3489 < 0) { // L: 140
					this.field3423[var1][var4.field3477] = null; // L: 141
					this.field3423[var1][var2] = var4; // L: 142
					int var8 = (var4.field3488 * var4.field3484 >> 12) + var4.field3493; // L: 143
					var4.field3493 += var2 - var4.field3477 << 8; // L: 144
					var4.field3484 = var8 - var4.field3493; // L: 145
					var4.field3488 = 4096; // L: 146
					var4.field3477 = var2; // L: 147
					return; // L: 148
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3410[var1]); // L: 152
		if (var9 != null) { // L: 153
			if (var9.rawSounds[var2] != null) { // L: 154
				RawSound var5 = var9.rawSounds[var2].method1062(); // L: 155
				if (var5 != null) { // L: 156
					MusicPatchNode var6 = new MusicPatchNode(); // L: 157
					var6.field3485 = var1; // L: 158
					var6.table = var9; // L: 159
					var6.rawSound = var5; // L: 160
					var6.field3478 = var9.field3455[var2]; // L: 161
					var6.field3479 = var9.field3461[var2]; // L: 162
					var6.field3477 = var2; // L: 163
					var6.field3481 = var3 * var3 * var9.field3465[var2] * var9.field3460 + 1024 >> 11; // L: 164
					var6.field3482 = var9.field3466[var2] & 255; // L: 165
					var6.field3493 = (var2 << 8) - (var9.field3457[var2] & 32767); // L: 166
					var6.field3480 = 0; // L: 167
					var6.field3487 = 0; // L: 168
					var6.field3486 = 0; // L: 169
					var6.field3489 = -1; // L: 170
					var6.field3490 = 0; // L: 171
					if (this.field3420[var1] == 0) { // L: 172
						var6.stream = RawPcmStream.method890(var5, this.method5827(var6), this.method5852(var6), this.method5878(var6)); // L: 173
					} else {
						var6.stream = RawPcmStream.method890(var5, this.method5827(var6), 0, this.method5878(var6)); // L: 176
						this.method5841(var6, var9.field3457[var2] < 0); // L: 177
					}

					if (var9.field3457[var2] < 0) { // L: 179
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3479 >= 0) { // L: 180
						MusicPatchNode var7 = this.field3432[var1][var6.field3479]; // L: 181
						if (var7 != null && var7.field3489 < 0) { // L: 182
							this.field3423[var1][var7.field3477] = null; // L: 183
							var7.field3489 = 0; // L: 184
						}

						this.field3432[var1][var6.field3479] = var6; // L: 186
					}

					this.patchStream.queue.addFirst(var6); // L: 188
					this.field3423[var1][var2] = var6; // L: 189
				}
			}
		}
	} // L: 190

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmu;ZB)V",
		garbageValue = "74"
	)
	void method5841(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 193
		int var4;
		if (var2 && var1.rawSound.field247) { // L: 195
			int var5 = var3 + var3 - var1.rawSound.start; // L: 196
			var4 = (int)((long)this.field3420[var1.field3485] * (long)var5 >> 6); // L: 197
			var3 <<= 8; // L: 198
			if (var4 >= var3) { // L: 199
				var4 = var3 + var3 - 1 - var4; // L: 200
				var1.stream.method883(); // L: 201
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3420[var1.field3485] >> 6); // L: 205
		}

		var1.stream.method882(var4); // L: 207
	} // L: 208

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2111650790"
	)
	void method5839(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3423[var1][var2]; // L: 211
		if (var4 != null) { // L: 212
			this.field3423[var1][var2] = null; // L: 213
			if ((this.field3417[var1] & 2) != 0) { // L: 214
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 215
					if (var5.field3485 == var4.field3485 && var5.field3489 < 0 && var5 != var4) { // L: 216
						var4.field3489 = 0; // L: 217
						break; // L: 218
					}
				}
			} else {
				var4.field3489 = 0; // L: 223
			}

		}
	} // L: 225

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "900001308"
	)
	void method5840(int var1, int var2, int var3) {
	} // L: 227

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1813269982"
	)
	void method5869(int var1, int var2) {
	} // L: 228

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2007487994"
	)
	void method5842(int var1, int var2) {
		this.field3412[var1] = var2; // L: 231
	} // L: 232

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	void method5843(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 235
			if (var1 < 0 || var2.field3485 == var1) { // L: 236
				if (var2.stream != null) { // L: 237
					var2.stream.method887(PcmPlayer.field279 / 100);
					if (var2.stream.method965()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6047();
				}

				if (var2.field3489 < 0) { // L: 242
					this.field3423[var2.field3485][var2.field3477] = null;
				}

				var2.remove(); // L: 243
			}
		}

	} // L: 246

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18146"
	)
	void method5844(int var1) {
		if (var1 >= 0) { // L: 249
			this.field3406[var1] = 12800; // L: 253
			this.field3413[var1] = 8192; // L: 254
			this.field3425[var1] = 16383; // L: 255
			this.field3412[var1] = 8192; // L: 256
			this.field3424[var1] = 0; // L: 257
			this.field3414[var1] = 8192; // L: 258
			this.method5847(var1); // L: 259
			this.method5848(var1); // L: 260
			this.field3417[var1] = 0; // L: 261
			this.field3416[var1] = 32767; // L: 262
			this.field3419[var1] = 256; // L: 263
			this.field3420[var1] = 0; // L: 264
			this.method5850(var1, 8192); // L: 265
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 250
				this.method5844(var1);
			}

		}
	} // L: 251 266

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	void method5834(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 269
			if ((var1 < 0 || var2.field3485 == var1) && var2.field3489 < 0) { // L: 270 271
				this.field3423[var2.field3485][var2.field3477] = null; // L: 272
				var2.field3489 = 0; // L: 273
			}
		}

	} // L: 277

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1695156524"
	)
	void method5846() {
		this.method5843(-1); // L: 280
		this.method5844(-1); // L: 281

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 282
			this.field3410[var1] = this.field3409[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3411[var1] = this.field3409[var1] & -128;
		}

	} // L: 284

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1039614104"
	)
	void method5847(int var1) {
		if ((this.field3417[var1] & 2) != 0) { // L: 287
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 288
				if (var2.field3485 == var1 && this.field3423[var1][var2.field3477] == null && var2.field3489 < 0) { // L: 289 290
					var2.field3489 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "4409429"
	)
	void method5848(int var1) {
		if ((this.field3417[var1] & 4) != 0) { // L: 297
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 298
				if (var2.field3485 == var1) { // L: 299
					var2.field3495 = 0;
				}
			}
		}

	} // L: 302

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1308059919"
	)
	void method5849(int var1) {
		int var2 = var1 & 240; // L: 305
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 306
			var3 = var1 & 15; // L: 307
			var4 = var1 >> 8 & 127; // L: 308
			var5 = var1 >> 16 & 127; // L: 309
			this.method5839(var3, var4, var5); // L: 310
		} else if (var2 == 144) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			if (var5 > 0) { // L: 317
				this.method5837(var3, var4, var5);
			} else {
				this.method5839(var3, var4, 64); // L: 318
			}

		} else if (var2 == 160) { // L: 321
			var3 = var1 & 15; // L: 322
			var4 = var1 >> 8 & 127; // L: 323
			var5 = var1 >> 16 & 127; // L: 324
			this.method5840(var3, var4, var5); // L: 325
		} else if (var2 == 176) { // L: 328
			var3 = var1 & 15; // L: 329
			var4 = var1 >> 8 & 127; // L: 330
			var5 = var1 >> 16 & 127; // L: 331
			if (var4 == 0) { // L: 332
				this.field3411[var3] = (var5 << 14) + (this.field3411[var3] & -2080769);
			}

			if (var4 == 32) { // L: 333
				this.field3411[var3] = (var5 << 7) + (this.field3411[var3] & -16257);
			}

			if (var4 == 1) { // L: 334
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 33) { // L: 335
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 5) { // L: 336
				this.field3414[var3] = (var5 << 7) + (this.field3414[var3] & -16257);
			}

			if (var4 == 37) { // L: 337
				this.field3414[var3] = var5 + (this.field3414[var3] & -128);
			}

			if (var4 == 7) { // L: 338
				this.field3406[var3] = (var5 << 7) + (this.field3406[var3] & -16257);
			}

			if (var4 == 39) { // L: 339
				this.field3406[var3] = var5 + (this.field3406[var3] & -128);
			}

			if (var4 == 10) { // L: 340
				this.field3413[var3] = (var5 << 7) + (this.field3413[var3] & -16257);
			}

			if (var4 == 42) { // L: 341
				this.field3413[var3] = var5 + (this.field3413[var3] & -128);
			}

			if (var4 == 11) { // L: 342
				this.field3425[var3] = (var5 << 7) + (this.field3425[var3] & -16257);
			}

			if (var4 == 43) { // L: 343
				this.field3425[var3] = var5 + (this.field3425[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 344
				if (var5 >= 64) { // L: 345
					var10000 = this.field3417;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3417; // L: 346
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 348
				if (var5 >= 64) { // L: 349
					var10000 = this.field3417;
					var10000[var3] |= 2;
				} else {
					this.method5847(var3); // L: 351
					var10000 = this.field3417; // L: 352
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 355
				this.field3416[var3] = (var5 << 7) + (this.field3416[var3] & 127);
			}

			if (var4 == 98) { // L: 356
				this.field3416[var3] = (this.field3416[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 357
				this.field3416[var3] = (var5 << 7) + (this.field3416[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 358
				this.field3416[var3] = (this.field3416[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 359
				this.method5843(var3);
			}

			if (var4 == 121) { // L: 360
				this.method5844(var3);
			}

			if (var4 == 123) { // L: 361
				this.method5834(var3);
			}

			int var6;
			if (var4 == 6) { // L: 362
				var6 = this.field3416[var3]; // L: 363
				if (var6 == 16384) { // L: 364
					this.field3419[var3] = (var5 << 7) + (this.field3419[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 366
				var6 = this.field3416[var3]; // L: 367
				if (var6 == 16384) { // L: 368
					this.field3419[var3] = var5 + (this.field3419[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 370
				this.field3420[var3] = (var5 << 7) + (this.field3420[var3] & -16257);
			}

			if (var4 == 48) { // L: 371
				this.field3420[var3] = var5 + (this.field3420[var3] & -128);
			}

			if (var4 == 81) { // L: 372
				if (var5 >= 64) { // L: 373
					var10000 = this.field3417;
					var10000[var3] |= 4;
				} else {
					this.method5848(var3); // L: 375
					var10000 = this.field3417; // L: 376
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method5850(var3, (var5 << 7) + (this.field3421[var3] & -16257)); // L: 379
			}

			if (var4 == 49) { // L: 380
				this.method5850(var3, var5 + (this.field3421[var3] & -128));
			}

		} else if (var2 == 192) { // L: 383
			var3 = var1 & 15; // L: 384
			var4 = var1 >> 8 & 127; // L: 385
			this.method5912(var3, var4 + this.field3411[var3]); // L: 386
		} else if (var2 == 208) { // L: 389
			var3 = var1 & 15; // L: 390
			var4 = var1 >> 8 & 127; // L: 391
			this.method5869(var3, var4); // L: 392
		} else if (var2 == 224) { // L: 395
			var3 = var1 & 15; // L: 396
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 397
			this.method5842(var3, var4); // L: 398
		} else {
			var2 = var1 & 255; // L: 401
			if (var2 == 255) { // L: 402
				this.method5846(); // L: 403
			}
		}
	} // L: 311 319 326 381 387 393 399 404 406

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-919442602"
	)
	void method5850(int var1, int var2) {
		this.field3421[var1] = var2; // L: 409
		this.field3405[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 410
	} // L: 411

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)I",
		garbageValue = "-1319164464"
	)
	int method5827(MusicPatchNode var1) {
		int var2 = (var1.field3488 * var1.field3484 >> 12) + var1.field3493; // L: 414
		var2 += (this.field3412[var1.field3485] - 8192) * this.field3419[var1.field3485] >> 12; // L: 415
		MusicPatchNode2 var3 = var1.field3478; // L: 416
		int var4;
		if (var3.field3382 > 0 && (var3.field3378 > 0 || this.field3424[var1.field3485] > 0)) { // L: 417
			var4 = var3.field3378 << 2; // L: 418
			int var5 = var3.field3383 << 1; // L: 419
			if (var1.field3491 < var5) { // L: 420
				var4 = var4 * var1.field3491 / var5;
			}

			var4 += this.field3424[var1.field3485] >> 7; // L: 421
			double var6 = Math.sin((double)(var1.field3492 & 511) * 0.01227184630308513D); // L: 422
			var2 += (int)(var6 * (double)var4); // L: 423
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field279 + 0.5D); // L: 425
		return var4 < 1 ? 1 : var4; // L: 426
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lmu;B)I",
		garbageValue = "-24"
	)
	int method5852(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3478; // L: 430
		int var3 = this.field3406[var1.field3485] * this.field3425[var1.field3485] + 4096 >> 13; // L: 431
		var3 = var3 * var3 + 16384 >> 15; // L: 432
		var3 = var3 * var1.field3481 + 16384 >> 15; // L: 433
		var3 = var3 * this.field3404 + 128 >> 8; // L: 434
		if (var2.field3377 > 0) { // L: 435
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3480 * 1.953125E-5D * (double)var2.field3377) + 0.5D); // L: 436
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3376 != null) { // L: 438
			var4 = var1.field3487; // L: 439
			var5 = var2.field3376[var1.field3486 * 4 + 1]; // L: 440
			if (var1.field3486 * 4 < var2.field3376.length - 2) { // L: 441
				var6 = (var2.field3376[var1.field3486 * 4] & 255) << 8; // L: 442
				var7 = (var2.field3376[var1.field3486 * 4 + 2] & 255) << 8; // L: 443
				var5 += (var4 - var6) * (var2.field3376[var1.field3486 * 4 + 3] - var5) / (var7 - var6); // L: 444
			}

			var3 = var5 * var3 + 32 >> 6; // L: 446
		}

		if (var1.field3489 > 0 && var2.field3375 != null) { // L: 448
			var4 = var1.field3489; // L: 449
			var5 = var2.field3375[var1.field3490 * 2 + 1]; // L: 450
			if (var1.field3490 * 2 < var2.field3375.length - 2) { // L: 451
				var6 = (var2.field3375[var1.field3490 * 2] & 255) << 8; // L: 452
				var7 = (var2.field3375[var1.field3490 * 2 + 2] & 255) << 8; // L: 453
				var5 += (var2.field3375[var1.field3490 * 2 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 454
			}

			var3 = var3 * var5 + 32 >> 6; // L: 456
		}

		return var3; // L: 458
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)I",
		garbageValue = "2046730532"
	)
	int method5878(MusicPatchNode var1) {
		int var2 = this.field3413[var1.field3485]; // L: 462
		return var2 < 8192 ? var2 * var1.field3482 + 32 >> 6 : 16384 - ((128 - var1.field3482) * (16384 - var2) + 32 >> 6); // L: 463 464
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-975503442"
	)
	void method5859() {
		int var1 = this.track; // L: 521
		int var2 = this.trackLength; // L: 522

		long var3;
		for (var3 = this.field3430; var2 == this.trackLength; var3 = this.midiFile.method5955(var2)) { // L: 523 524 546
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 525
				this.midiFile.gotoTrack(var1); // L: 526
				int var5 = this.midiFile.readMessage(var1); // L: 527
				if (var5 == 1) { // L: 528
					this.midiFile.setTrackDone(); // L: 529
					this.midiFile.markTrackPosition(var1); // L: 530
					if (this.midiFile.isDone()) { // L: 531
						if (!this.field3426 || var2 == 0) { // L: 532
							this.method5846(); // L: 536
							this.midiFile.clear(); // L: 537
							return; // L: 538
						}

						this.midiFile.reset(var3); // L: 533
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 540
					this.method5849(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 541
				this.midiFile.markTrackPosition(var1); // L: 542
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 544
			var2 = this.midiFile.trackLengths[var1]; // L: 545
		}

		this.track = var1; // L: 548
		this.trackLength = var2; // L: 549
		this.field3430 = var3; // L: 550
	} // L: 551

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lmu;S)Z",
		garbageValue = "31891"
	)
	boolean method5860(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 554
			if (var1.field3489 >= 0) { // L: 555
				var1.remove(); // L: 556
				if (var1.field3479 > 0 && var1 == this.field3432[var1.field3485][var1.field3479]) { // L: 557
					this.field3432[var1.field3485][var1.field3479] = null; // L: 558
				}
			}

			return true; // L: 561
		} else {
			return false; // L: 563
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lmu;[IIII)Z",
		garbageValue = "-828649375"
	)
	boolean method5861(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3476 = PcmPlayer.field279 / 100; // L: 567
		if (var1.field3489 < 0 || var1.stream != null && !var1.stream.method948()) { // L: 568
			int var5 = var1.field3488; // L: 576
			if (var5 > 0) { // L: 577
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3414[var1.field3485] * 4.921259842519685E-4D) + 0.5D); // L: 578
				if (var5 < 0) { // L: 579
					var5 = 0;
				}

				var1.field3488 = var5; // L: 580
			}

			var1.stream.method888(this.method5827(var1)); // L: 582
			MusicPatchNode2 var6 = var1.field3478; // L: 583
			boolean var7 = false; // L: 584
			++var1.field3491; // L: 585
			var1.field3492 += var6.field3382; // L: 586
			double var8 = (double)((var1.field3477 - 60 << 8) + (var1.field3484 * var1.field3488 >> 12)) * 5.086263020833333E-6D; // L: 587
			if (var6.field3377 > 0) { // L: 588
				if (var6.field3380 > 0) { // L: 589
					var1.field3480 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3380) + 0.5D);
				} else {
					var1.field3480 += 128; // L: 590
				}
			}

			if (var6.field3376 != null) { // L: 592
				if (var6.field3381 > 0) { // L: 593
					var1.field3487 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3381 * var8) + 0.5D);
				} else {
					var1.field3487 += 128; // L: 594
				}

				while (var1.field3486 * 4 < var6.field3376.length - 2 && var1.field3487 > (var6.field3376[var1.field3486 * 4 + 2] & 255) << 8) { // L: 595
					var1.field3486 = var1.field3486 * 4 + 2;
				}

				if (var1.field3486 * 4 == var6.field3376.length - 2 && var6.field3376[var1.field3486 * 4 + 1] == 0) { // L: 596
					var7 = true;
				}
			}

			if (var1.field3489 >= 0 && var6.field3375 != null && (this.field3417[var1.field3485] & 1) == 0 && (var1.field3479 < 0 || var1 != this.field3432[var1.field3485][var1.field3479])) { // L: 598 599
				if (var6.field3379 > 0) { // L: 600
					var1.field3489 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3379) + 0.5D);
				} else {
					var1.field3489 += 128; // L: 601
				}

				while (var1.field3490 * 2 < var6.field3375.length - 2 && var1.field3489 > (var6.field3375[var1.field3490 * 2 + 2] & 255) << 8) { // L: 602
					var1.field3490 = var1.field3490 * 4 + 4;
				}

				if (var1.field3490 * 2 == var6.field3375.length - 2) { // L: 603
					var7 = true;
				}
			}

			if (var7) { // L: 606
				var1.stream.method887(var1.field3476); // L: 607
				if (var2 != null) { // L: 608
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 609
				}

				if (var1.stream.method965()) { // L: 610
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6047(); // L: 611
				if (var1.field3489 >= 0) { // L: 612
					var1.remove(); // L: 613
					if (var1.field3479 > 0 && var1 == this.field3432[var1.field3485][var1.field3479]) { // L: 614
						this.field3432[var1.field3485][var1.field3479] = null; // L: 615
					}
				}

				return true; // L: 618
			} else {
				var1.stream.method981(var1.field3476, this.method5852(var1), this.method5878(var1)); // L: 620
				return false; // L: 621
			}
		} else {
			var1.method6047(); // L: 569
			var1.remove(); // L: 570
			if (var1.field3479 > 0 && var1 == this.field3432[var1.field3485][var1.field3479]) { // L: 571
				this.field3432[var1.field3485][var1.field3479] = null; // L: 572
			}

			return true; // L: 574
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "948643568"
	)
	public static void method5830(AbstractArchive var0) {
		class493.field4985 = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-884428443"
	)
	public static int method5942(int var0) {
		if (var0 > 0) { // L: 238
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 239 240
		}
	}
}
