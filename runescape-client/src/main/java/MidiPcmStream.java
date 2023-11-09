import java.util.Iterator;
import java.util.PriorityQueue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 677776113
	)
	int field3410;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1613903296
	)
	int field3409;
	@ObfuscatedName("as")
	int[] field3412;
	@ObfuscatedName("ax")
	int[] field3427;
	@ObfuscatedName("ap")
	int[] field3431;
	@ObfuscatedName("ab")
	int[] field3415;
	@ObfuscatedName("ak")
	int[] field3416;
	@ObfuscatedName("ae")
	int[] field3417;
	@ObfuscatedName("af")
	int[] field3418;
	@ObfuscatedName("ao")
	int[] field3414;
	@ObfuscatedName("aa")
	int[] field3420;
	@ObfuscatedName("au")
	int[] field3421;
	@ObfuscatedName("ai")
	int[] field3422;
	@ObfuscatedName("aq")
	int[] field3423;
	@ObfuscatedName("aw")
	int[] field3424;
	@ObfuscatedName("ay")
	int[] field3425;
	@ObfuscatedName("al")
	int[] field3430;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[[Lma;"
	)
	MusicPatchNode[][] field3436;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[[Lma;"
	)
	MusicPatchNode[][] field3428;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bj")
	boolean field3411;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1055138713
	)
	@Export("track")
	int track;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 698650773
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = -3703653601253318223L
	)
	long field3433;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = 3529635704974986047L
	)
	long field3434;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("ba")
	public PriorityQueue field3419;

	public MidiPcmStream() {
		this.field3410 = 256; // L: 16
		this.field3409 = -727379968; // L: 17
		this.field3412 = new int[16]; // L: 18
		this.field3427 = new int[16]; // L: 19
		this.field3431 = new int[16]; // L: 20
		this.field3415 = new int[16]; // L: 21
		this.field3416 = new int[16]; // L: 22
		this.field3417 = new int[16]; // L: 23
		this.field3418 = new int[16]; // L: 24
		this.field3414 = new int[16]; // L: 25
		this.field3420 = new int[16]; // L: 26
		this.field3421 = new int[16]; // L: 30
		this.field3422 = new int[16]; // L: 31
		this.field3423 = new int[16]; // L: 32
		this.field3424 = new int[16]; // L: 33
		this.field3425 = new int[16]; // L: 34
		this.field3430 = new int[16]; // L: 35
		this.field3436 = new MusicPatchNode[16][128]; // L: 36
		this.field3428 = new MusicPatchNode[16][128]; // L: 37
		this.midiFile = new MidiFileReader(); // L: 38
		this.patchStream = new MusicPatchPcmStream(this); // L: 44
		this.field3419 = new PriorityQueue(5, new class306()); // L: 45
		this.musicPatches = new NodeHashTable(128); // L: 48
		this.method5814(); // L: 49
	} // L: 50

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3410 = var1; // L: 53
	} // L: 54

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-111377530"
	)
	public int method5737() {
		return this.field3410; // L: 57
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lnq;Lbz;B)Z",
		garbageValue = "6"
	)
	synchronized boolean method5806(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		boolean var4 = true; // L: 61

		for (class316 var5 = (class316)var1.field3473.first(); var5 != null; var5 = (class316)var1.field3473.next()) { // L: 62
			int var6 = (int)var5.key; // L: 63
			MusicPatch var7 = (MusicPatch)this.musicPatches.get((long)var6); // L: 64
			if (var7 == null) { // L: 65
				byte[] var9 = var2.takeFileFlat(var6); // L: 68
				MusicPatch var8;
				if (var9 == null) { // L: 69
					var8 = null; // L: 70
				} else {
					var8 = new MusicPatch(var9); // L: 73
				}

				var7 = var8; // L: 75
				if (var8 == null) { // L: 76
					var4 = false; // L: 77
					continue;
				}

				this.musicPatches.put(var8, (long)var6); // L: 80
			}

			if (!var7.method5912(var3, var5.field3500)) {
				var4 = false; // L: 82
			} else if (this.field3419 != null) { // L: 83
				Iterator var10 = var7.field3466.iterator(); // L: 84

				while (var10.hasNext()) {
					class53 var11 = (class53)var10.next(); // L: 85
					this.field3419.add(new class310(var5.field3499, var11)); // L: 87
				}
			}
		}

		return var4; // L: 92
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	synchronized void method5739() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 96
			var1.clear();
		}

	} // L: 97

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "923743711"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 100
			var1.remove();
		}

	} // L: 101

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 477
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 481
	}

	@ObfuscatedName("ak")
	protected synchronized int vmethod5920() {
		return 0; // L: 485
	}

	@ObfuscatedName("ae")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 489
			int var4 = this.midiFile.division * this.field3409 * 1000000 / PcmPlayer.field291; // L: 490

			do {
				long var5 = this.field3433 + (long)var4 * (long)var3; // L: 492
				if (this.field3434 - var5 >= 0L) { // L: 493
					this.field3433 = var5; // L: 494
					break;
				}

				int var7 = (int)((this.field3434 - this.field3433 + (long)var4 - 1L) / (long)var4); // L: 497
				this.field3433 += (long)var7 * (long)var4; // L: 498
				this.patchStream.fill(var1, var2, var7); // L: 499
				var2 += var7; // L: 500
				var3 -= var7; // L: 501
				this.method5807(); // L: 502
			} while(this.midiFile.isReady()); // L: 503
		}

		this.patchStream.fill(var1, var2, var3); // L: 506
	} // L: 507

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZI)V",
		garbageValue = "-907641791"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 104
		this.midiFile.parse(var1.midi); // L: 105
		this.field3411 = var2; // L: 106
		this.field3433 = 0L; // L: 107
		int var3 = this.midiFile.trackCount(); // L: 108

		for (int var4 = 0; var4 < var3; ++var4) { // L: 109
			this.midiFile.gotoTrack(var4); // L: 110
			this.midiFile.readTrackLength(var4); // L: 111
			this.midiFile.markTrackPosition(var4); // L: 112
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 114
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 115
		this.field3434 = this.midiFile.method5877(this.trackLength); // L: 116
	} // L: 117

	@ObfuscatedName("ao")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 510
			int var2 = this.midiFile.division * this.field3409 * 1000000 / PcmPlayer.field291; // L: 511

			do {
				long var3 = this.field3433 + (long)var2 * (long)var1; // L: 513
				if (this.field3434 - var3 >= 0L) { // L: 514
					this.field3433 = var3; // L: 515
					break;
				}

				int var5 = (int)((this.field3434 - this.field3433 + (long)var2 - 1L) / (long)var2); // L: 518
				this.field3433 += (long)var5 * (long)var2; // L: 519
				this.patchStream.skip(var5); // L: 520
				var1 -= var5; // L: 521
				this.method5807(); // L: 522
			} while(this.midiFile.isReady()); // L: 523
		}

		this.patchStream.skip(var1); // L: 526
	} // L: 527

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1496424318"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 120
		this.method5814(); // L: 121
	} // L: 122

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-4147255"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 125
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1457303388"
	)
	public synchronized void method5769(int var1, int var2) {
		this.method5783(var1, var2); // L: 129
	} // L: 130

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-15"
	)
	void method5783(int var1, int var2) {
		this.field3415[var1] = var2; // L: 133
		this.field3417[var1] = var2 & -128; // L: 134
		this.method5834(var1, var2); // L: 135
	} // L: 136

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "326324678"
	)
	void method5834(int var1, int var2) {
		if (var2 != this.field3416[var1]) { // L: 139
			this.field3416[var1] = var2; // L: 140

			for (int var3 = 0; var3 < 128; ++var3) { // L: 141
				this.field3428[var1][var3] = null;
			}
		}

	} // L: 143

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2066005019"
	)
	void method5746(int var1, int var2, int var3) {
		this.method5749(var1, var2, 64); // L: 146
		if ((this.field3421[var1] & 2) != 0) { // L: 147
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 148
				if (var4.field3490 == var1 && var4.field3489 < 0) { // L: 149
					this.field3436[var1][var4.field3480] = null; // L: 150
					this.field3436[var1][var2] = var4; // L: 151
					int var8 = (var4.field3485 * var4.field3484 >> 12) + var4.field3491; // L: 152
					var4.field3491 += var2 - var4.field3480 << 8; // L: 153
					var4.field3484 = var8 - var4.field3491; // L: 154
					var4.field3485 = 4096; // L: 155
					var4.field3480 = var2; // L: 156
					return; // L: 157
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3416[var1]); // L: 161
		if (var9 != null) { // L: 162
			if (var9.rawSounds[var2] != null) { // L: 163
				RawSound var5 = var9.rawSounds[var2].method1038(); // L: 164
				if (var5 != null) { // L: 165
					MusicPatchNode var6 = new MusicPatchNode(); // L: 166
					var6.field3490 = var1; // L: 167
					var6.table = var9; // L: 168
					var6.rawSound = var5; // L: 169
					var6.field3498 = var9.field3465[var2]; // L: 170
					var6.field3479 = var9.field3459[var2]; // L: 171
					var6.field3480 = var2; // L: 172
					var6.field3481 = var3 * var3 * var9.field3463[var2] * var9.field3464 + 1024 >> 11; // L: 173
					var6.field3482 = var9.field3468[var2] & 255; // L: 174
					var6.field3491 = (var2 << 8) - (var9.field3462[var2] & 32767); // L: 175
					var6.field3486 = 0; // L: 176
					var6.field3487 = 0; // L: 177
					var6.field3488 = 0; // L: 178
					var6.field3489 = -1; // L: 179
					var6.field3495 = 0; // L: 180
					if (this.field3424[var1] == 0) { // L: 181
						var6.stream = RawPcmStream.method949(var5, this.method5761(var6), this.method5762(var6), this.method5763(var6)); // L: 182
					} else {
						var6.stream = RawPcmStream.method949(var5, this.method5761(var6), 0, this.method5763(var6)); // L: 185
						this.method5781(var6, var9.field3462[var2] < 0); // L: 186
					}

					if (var9.field3462[var2] < 0) { // L: 188
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3479 >= 0) { // L: 189
						MusicPatchNode var7 = this.field3428[var1][var6.field3479]; // L: 190
						if (var7 != null && var7.field3489 < 0) { // L: 191
							this.field3436[var1][var7.field3480] = null; // L: 192
							var7.field3489 = 0; // L: 193
						}

						this.field3428[var1][var6.field3479] = var6; // L: 195
					}

					this.patchStream.queue.addFirst(var6); // L: 197
					this.field3436[var1][var2] = var6; // L: 198
				}
			}
		}
	} // L: 199

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lma;ZB)V",
		garbageValue = "20"
	)
	void method5781(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 202
		int var4;
		if (var2 && var1.rawSound.field267) { // L: 204
			int var5 = var3 + var3 - var1.rawSound.start; // L: 205
			var4 = (int)((long)this.field3424[var1.field3490] * (long)var5 >> 6); // L: 206
			var3 <<= 8; // L: 207
			if (var4 >= var3) { // L: 208
				var4 = var3 + var3 - 1 - var4; // L: 209
				var1.stream.method859(); // L: 210
			}
		} else {
			var4 = (int)((long)this.field3424[var1.field3490] * (long)var3 >> 6); // L: 214
		}

		var1.stream.method858(var4); // L: 216
	} // L: 217

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1654252881"
	)
	void method5749(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3436[var1][var2]; // L: 220
		if (var4 != null) { // L: 221
			this.field3436[var1][var2] = null; // L: 222
			if ((this.field3421[var1] & 2) != 0) { // L: 223
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 224
					if (var4.field3490 == var5.field3490 && var5.field3489 < 0 && var5 != var4) { // L: 225
						var4.field3489 = 0; // L: 226
						break; // L: 227
					}
				}
			} else {
				var4.field3489 = 0; // L: 232
			}

		}
	} // L: 234

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-733972794"
	)
	void method5750(int var1, int var2, int var3) {
	} // L: 236

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2133532598"
	)
	void method5751(int var1, int var2) {
	} // L: 237

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "688083182"
	)
	void method5756(int var1, int var2) {
		this.field3418[var1] = var2; // L: 240
	} // L: 241

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method5753(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 244
			if (var1 < 0 || var2.field3490 == var1) { // L: 245
				if (var2.stream != null) { // L: 246
					var2.stream.method863(PcmPlayer.field291 / 100); // L: 247
					if (var2.stream.method944()) { // L: 248
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5948(); // L: 249
				}

				if (var2.field3489 < 0) { // L: 251
					this.field3436[var2.field3490][var2.field3480] = null;
				}

				var2.remove(); // L: 252
			}
		}

	} // L: 255

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "13497"
	)
	void method5788(int var1) {
		if (var1 >= 0) { // L: 258
			this.field3412[var1] = 12800; // L: 262
			this.field3427[var1] = 8192; // L: 263
			this.field3431[var1] = 16383; // L: 264
			this.field3418[var1] = 8192; // L: 265
			this.field3414[var1] = 0; // L: 266
			this.field3420[var1] = 8192; // L: 267
			this.method5757(var1); // L: 268
			this.method5813(var1); // L: 269
			this.field3421[var1] = 0; // L: 270
			this.field3422[var1] = 32767; // L: 271
			this.field3423[var1] = 256; // L: 272
			this.field3424[var1] = 0; // L: 273
			this.method5760(var1, 8192); // L: 274
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 259
				this.method5788(var1);
			}

		}
	} // L: 260 275

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1903106973"
	)
	void method5755(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 278
			if ((var1 < 0 || var2.field3490 == var1) && var2.field3489 < 0) { // L: 279 280
				this.field3436[var2.field3490][var2.field3480] = null; // L: 281
				var2.field3489 = 0; // L: 282
			}
		}

	} // L: 286

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073460150"
	)
	void method5814() {
		this.method5753(-1); // L: 289
		this.method5788(-1); // L: 290

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 291
			this.field3416[var1] = this.field3415[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 292
			this.field3417[var1] = this.field3415[var1] & -128;
		}

	} // L: 293

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1165288902"
	)
	void method5757(int var1) {
		if ((this.field3421[var1] & 2) != 0) { // L: 296
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 297
				if (var2.field3490 == var1 && this.field3436[var1][var2.field3480] == null && var2.field3489 < 0) { // L: 298 299
					var2.field3489 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1448952082"
	)
	void method5813(int var1) {
		if ((this.field3421[var1] & 4) != 0) { // L: 306
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 307
				if (var2.field3490 == var1) { // L: 308
					var2.field3483 = 0;
				}
			}
		}

	} // L: 311

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1513062170"
	)
	void method5759(int var1) {
		int var2 = var1 & 240; // L: 314
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 315
			var3 = var1 & 15; // L: 316
			var4 = var1 >> 8 & 127; // L: 317
			var5 = var1 >> 16 & 127; // L: 318
			this.method5749(var3, var4, var5); // L: 319
		} else if (var2 == 144) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			if (var5 > 0) { // L: 326
				this.method5746(var3, var4, var5);
			} else {
				this.method5749(var3, var4, 64); // L: 327
			}

		} else if (var2 == 160) { // L: 330
			var3 = var1 & 15; // L: 331
			var4 = var1 >> 8 & 127; // L: 332
			var5 = var1 >> 16 & 127; // L: 333
			this.method5750(var3, var4, var5); // L: 334
		} else if (var2 == 176) { // L: 337
			var3 = var1 & 15; // L: 338
			var4 = var1 >> 8 & 127; // L: 339
			var5 = var1 >> 16 & 127; // L: 340
			if (var4 == 0) { // L: 341
				this.field3417[var3] = (var5 << 14) + (this.field3417[var3] & -2080769);
			}

			if (var4 == 32) { // L: 342
				this.field3417[var3] = (var5 << 7) + (this.field3417[var3] & -16257);
			}

			if (var4 == 1) { // L: 343
				this.field3414[var3] = (var5 << 7) + (this.field3414[var3] & -16257);
			}

			if (var4 == 33) { // L: 344
				this.field3414[var3] = var5 + (this.field3414[var3] & -128);
			}

			if (var4 == 5) { // L: 345
				this.field3420[var3] = (var5 << 7) + (this.field3420[var3] & -16257);
			}

			if (var4 == 37) { // L: 346
				this.field3420[var3] = var5 + (this.field3420[var3] & -128);
			}

			if (var4 == 7) { // L: 347
				this.field3412[var3] = (var5 << 7) + (this.field3412[var3] & -16257);
			}

			if (var4 == 39) { // L: 348
				this.field3412[var3] = var5 + (this.field3412[var3] & -128);
			}

			if (var4 == 10) { // L: 349
				this.field3427[var3] = (var5 << 7) + (this.field3427[var3] & -16257);
			}

			if (var4 == 42) { // L: 350
				this.field3427[var3] = var5 + (this.field3427[var3] & -128);
			}

			if (var4 == 11) { // L: 351
				this.field3431[var3] = (var5 << 7) + (this.field3431[var3] & -16257);
			}

			if (var4 == 43) { // L: 352
				this.field3431[var3] = var5 + (this.field3431[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 353
				if (var5 >= 64) { // L: 354
					var10000 = this.field3421;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3421; // L: 355
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 357
				if (var5 >= 64) { // L: 358
					var10000 = this.field3421;
					var10000[var3] |= 2;
				} else {
					this.method5757(var3); // L: 360
					var10000 = this.field3421; // L: 361
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 364
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127);
			}

			if (var4 == 98) { // L: 365
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 366
				this.field3422[var3] = (var5 << 7) + (this.field3422[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 367
				this.field3422[var3] = (this.field3422[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 368
				this.method5753(var3);
			}

			if (var4 == 121) { // L: 369
				this.method5788(var3);
			}

			if (var4 == 123) { // L: 370
				this.method5755(var3);
			}

			int var6;
			if (var4 == 6) { // L: 371
				var6 = this.field3422[var3]; // L: 372
				if (var6 == 16384) { // L: 373
					this.field3423[var3] = (var5 << 7) + (this.field3423[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 375
				var6 = this.field3422[var3]; // L: 376
				if (var6 == 16384) { // L: 377
					this.field3423[var3] = var5 + (this.field3423[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 379
				this.field3424[var3] = (var5 << 7) + (this.field3424[var3] & -16257);
			}

			if (var4 == 48) { // L: 380
				this.field3424[var3] = var5 + (this.field3424[var3] & -128);
			}

			if (var4 == 81) { // L: 381
				if (var5 >= 64) { // L: 382
					var10000 = this.field3421;
					var10000[var3] |= 4;
				} else {
					this.method5813(var3); // L: 384
					var10000 = this.field3421; // L: 385
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 388
				this.method5760(var3, (var5 << 7) + (this.field3425[var3] & -16257));
			}

			if (var4 == 49) { // L: 389
				this.method5760(var3, var5 + (this.field3425[var3] & -128));
			}

		} else if (var2 == 192) { // L: 392
			var3 = var1 & 15; // L: 393
			var4 = var1 >> 8 & 127; // L: 394
			this.method5834(var3, var4 + this.field3417[var3]); // L: 395
		} else if (var2 == 208) { // L: 398
			var3 = var1 & 15; // L: 399
			var4 = var1 >> 8 & 127; // L: 400
			this.method5751(var3, var4); // L: 401
		} else if (var2 == 224) { // L: 404
			var3 = var1 & 15; // L: 405
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 406
			this.method5756(var3, var4); // L: 407
		} else {
			var2 = var1 & 255; // L: 410
			if (var2 == 255) { // L: 411
				this.method5814(); // L: 412
			}
		}
	} // L: 320 328 335 390 396 402 408 413 415

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "37"
	)
	void method5760(int var1, int var2) {
		this.field3425[var1] = var2; // L: 418
		this.field3430[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 419
	} // L: 420

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)I",
		garbageValue = "1"
	)
	int method5761(MusicPatchNode var1) {
		int var2 = (var1.field3484 * var1.field3485 >> 12) + var1.field3491; // L: 423
		var2 += (this.field3418[var1.field3490] - 8192) * this.field3423[var1.field3490] >> 12; // L: 424
		MusicPatchNode2 var3 = var1.field3498; // L: 425
		int var4;
		if (var3.field3372 > 0 && (var3.field3378 > 0 || this.field3414[var1.field3490] > 0)) { // L: 426
			var4 = var3.field3378 << 2; // L: 427
			int var5 = var3.field3377 << 1; // L: 428
			if (var1.field3493 < var5) { // L: 429
				var4 = var4 * var1.field3493 / var5;
			}

			var4 += this.field3414[var1.field3490] >> 7; // L: 430
			double var6 = Math.sin((double)(var1.field3492 & 511) * 0.01227184630308513D); // L: 431
			var2 += (int)((double)var4 * var6); // L: 432
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field291 + 0.5D); // L: 434
		return var4 < 1 ? 1 : var4; // L: 435
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)I",
		garbageValue = "-305726576"
	)
	int method5762(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3498; // L: 439
		int var3 = this.field3412[var1.field3490] * this.field3431[var1.field3490] + 4096 >> 13; // L: 440
		var3 = var3 * var3 + 16384 >> 15; // L: 441
		var3 = var3 * var1.field3481 + 16384 >> 15; // L: 442
		var3 = var3 * this.field3410 + 128 >> 8; // L: 443
		if (var2.field3373 > 0) { // L: 444
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3373 * 1.953125E-5D * (double)var1.field3486) + 0.5D); // L: 445
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3374 != null) { // L: 447
			var4 = var1.field3487; // L: 448
			var5 = var2.field3374[var1.field3488 * 4 + 1]; // L: 449
			if (var1.field3488 * 4 < var2.field3374.length - 2) { // L: 450
				var6 = (var2.field3374[var1.field3488 * 4] & 255) << 8; // L: 451
				var7 = (var2.field3374[var1.field3488 * 4 + 2] & 255) << 8; // L: 452
				var5 += (var2.field3374[var1.field3488 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 453
			}

			var3 = var3 * var5 + 32 >> 6; // L: 455
		}

		if (var1.field3489 > 0 && var2.field3381 != null) { // L: 457
			var4 = var1.field3489; // L: 458
			var5 = var2.field3381[var1.field3495 * 4 + 1]; // L: 459
			if (var1.field3495 * 4 < var2.field3381.length - 2) { // L: 460
				var6 = (var2.field3381[var1.field3495 * 4] & 255) << 8; // L: 461
				var7 = (var2.field3381[var1.field3495 * 4 + 2] & 255) << 8; // L: 462
				var5 += (var4 - var6) * (var2.field3381[var1.field3495 * 4 + 3] - var5) / (var7 - var6); // L: 463
			}

			var3 = var5 * var3 + 32 >> 6; // L: 465
		}

		return var3; // L: 467
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lma;B)I",
		garbageValue = "9"
	)
	int method5763(MusicPatchNode var1) {
		int var2 = this.field3427[var1.field3490]; // L: 471
		return var2 < 8192 ? var2 * var1.field3482 + 32 >> 6 : 16384 - ((128 - var1.field3482) * (16384 - var2) + 32 >> 6); // L: 472 473
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method5807() {
		int var1 = this.track; // L: 530
		int var2 = this.trackLength; // L: 531

		long var3;
		for (var3 = this.field3434; var2 == this.trackLength; var3 = this.midiFile.method5877(var2)) { // L: 532 533 555
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 534
				this.midiFile.gotoTrack(var1); // L: 535
				int var5 = this.midiFile.readMessage(var1); // L: 536
				if (var5 == 1) { // L: 537
					this.midiFile.setTrackDone(); // L: 538
					this.midiFile.markTrackPosition(var1); // L: 539
					if (this.midiFile.isDone()) { // L: 540
						if (!this.field3411 || var2 == 0) { // L: 541
							this.method5814(); // L: 545
							this.midiFile.clear(); // L: 546
							return; // L: 547
						}

						this.midiFile.reset(var3); // L: 542
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 549
					this.method5759(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 550
				this.midiFile.markTrackPosition(var1); // L: 551
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 553
			var2 = this.midiFile.trackLengths[var1]; // L: 554
		}

		this.track = var1; // L: 557
		this.trackLength = var2; // L: 558
		this.field3434 = var3; // L: 559
	} // L: 560

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lma;I)Z",
		garbageValue = "1497880317"
	)
	boolean method5770(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 563
			if (var1.field3489 >= 0) { // L: 564
				var1.remove(); // L: 565
				if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) { // L: 566
					this.field3428[var1.field3490][var1.field3479] = null; // L: 567
				}
			}

			return true; // L: 570
		} else {
			return false; // L: 572
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lma;[IIIB)Z",
		garbageValue = "-28"
	)
	boolean method5771(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3494 = PcmPlayer.field291 / 100; // L: 576
		if (var1.field3489 < 0 || var1.stream != null && !var1.stream.method951()) { // L: 577
			int var5 = var1.field3485; // L: 585
			if (var5 > 0) { // L: 586
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3420[var1.field3490] * 4.921259842519685E-4D) + 0.5D); // L: 587
				if (var5 < 0) { // L: 588
					var5 = 0;
				}

				var1.field3485 = var5; // L: 589
			}

			var1.stream.method864(this.method5761(var1)); // L: 591
			MusicPatchNode2 var6 = var1.field3498; // L: 592
			boolean var7 = false; // L: 593
			++var1.field3493; // L: 594
			var1.field3492 += var6.field3372; // L: 595
			double var8 = (double)((var1.field3480 - 60 << 8) + (var1.field3485 * var1.field3484 >> 12)) * 5.086263020833333E-6D; // L: 596
			if (var6.field3373 > 0) { // L: 597
				if (var6.field3379 > 0) { // L: 598
					var1.field3486 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3379 * var8) + 0.5D);
				} else {
					var1.field3486 += 128; // L: 599
				}
			}

			if (var6.field3374 != null) { // L: 601
				if (var6.field3375 > 0) { // L: 602
					var1.field3487 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3375 * var8) + 0.5D);
				} else {
					var1.field3487 += 128; // L: 603
				}

				while (var1.field3488 * 4 < var6.field3374.length - 2 && var1.field3487 > (var6.field3374[var1.field3488 * 4 + 2] & 255) << 8) { // L: 604
					var1.field3488 = var1.field3488 * 4 + 2;
				}

				if (var1.field3488 * 4 == var6.field3374.length - 2 && var6.field3374[var1.field3488 * 4 + 1] == 0) { // L: 605
					var7 = true;
				}
			}

			if (var1.field3489 >= 0 && var6.field3381 != null && (this.field3421[var1.field3490] & 1) == 0 && (var1.field3479 < 0 || var1 != this.field3428[var1.field3490][var1.field3479])) { // L: 607 608
				if (var6.field3376 > 0) { // L: 609
					var1.field3489 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3376) + 0.5D);
				} else {
					var1.field3489 += 128; // L: 610
				}

				while (var1.field3495 * 4 < var6.field3381.length - 2 && var1.field3489 > (var6.field3381[var1.field3495 * 4 + 2] & 255) << 8) { // L: 611
					var1.field3495 = var1.field3495 * 4 + 2;
				}

				if (var1.field3495 * 4 == var6.field3381.length - 2) { // L: 612
					var7 = true;
				}
			}

			if (var7) { // L: 615
				var1.stream.method863(var1.field3494); // L: 616
				if (var2 != null) { // L: 617
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 618
				}

				if (var1.stream.method944()) { // L: 619
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5948(); // L: 620
				if (var1.field3489 >= 0) { // L: 621
					var1.remove(); // L: 622
					if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) { // L: 623
						this.field3428[var1.field3490][var1.field3479] = null; // L: 624
					}
				}

				return true; // L: 627
			} else {
				var1.stream.method862(var1.field3494, this.method5762(var1), this.method5763(var1)); // L: 629
				return false; // L: 630
			}
		} else {
			var1.method5948(); // L: 578
			var1.remove(); // L: 579
			if (var1.field3479 > 0 && var1 == this.field3428[var1.field3490][var1.field3479]) { // L: 580
				this.field3428[var1.field3490][var1.field3479] = null; // L: 581
			}

			return true; // L: 583
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1033246315"
	)
	static int method5848(int var0, Script var1, boolean var2) {
		return 2; // L: 3199
	}
}
