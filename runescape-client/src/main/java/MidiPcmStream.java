import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1432164919
	)
	int field3362;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 58001557
	)
	int field3370;
	@ObfuscatedName("x")
	int[] field3359;
	@ObfuscatedName("m")
	int[] field3363;
	@ObfuscatedName("q")
	int[] field3367;
	@ObfuscatedName("f")
	int[] field3361;
	@ObfuscatedName("r")
	int[] field3381;
	@ObfuscatedName("u")
	int[] field3373;
	@ObfuscatedName("b")
	int[] field3364;
	@ObfuscatedName("j")
	int[] field3365;
	@ObfuscatedName("g")
	int[] field3366;
	@ObfuscatedName("t")
	int[] field3356;
	@ObfuscatedName("c")
	int[] field3368;
	@ObfuscatedName("p")
	int[] field3369;
	@ObfuscatedName("d")
	int[] field3358;
	@ObfuscatedName("y")
	int[] field3371;
	@ObfuscatedName("z")
	int[] field3372;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[[Lkx;"
	)
	MusicPatchNode[][] field3357;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[Lkx;"
	)
	MusicPatchNode[][] field3374;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field3355;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1192963143
	)
	@Export("track")
	int track;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1500458693
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 2172914929519981185L
	)
	long field3379;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 2756622200726587743L
	)
	long field3380;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3362 = 256; // L: 14
		this.field3370 = 1000000; // L: 15
		this.field3359 = new int[16]; // L: 16
		this.field3363 = new int[16]; // L: 17
		this.field3367 = new int[16]; // L: 18
		this.field3361 = new int[16]; // L: 19
		this.field3381 = new int[16]; // L: 20
		this.field3373 = new int[16]; // L: 21
		this.field3364 = new int[16]; // L: 22
		this.field3365 = new int[16]; // L: 23
		this.field3366 = new int[16]; // L: 24
		this.field3356 = new int[16]; // L: 28
		this.field3368 = new int[16]; // L: 29
		this.field3369 = new int[16]; // L: 30
		this.field3358 = new int[16]; // L: 31
		this.field3371 = new int[16]; // L: 32
		this.field3372 = new int[16]; // L: 33
		this.field3357 = new MusicPatchNode[16][128]; // L: 34
		this.field3374 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5676(); // L: 46
	} // L: 47

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	@Export("setPcmStreamVolume")
	synchronized void setPcmStreamVolume(int var1) {
		this.field3362 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-278818537"
	)
	int method5650() {
		return this.field3362; // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkc;Lly;Laj;II)Z",
		garbageValue = "-1248465768"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5777(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				var9 = class338.method6604(var2, var8); // L: 66
				if (var9 == null) { // L: 67
					var5 = false; // L: 68
					continue;
				}

				this.musicPatches.put(var9, (long)var8); // L: 71
			}

			if (!var9.method5739(var3, var7.byteArray, var6)) { // L: 73
				var5 = false;
			}
		}

		if (var5) { // L: 75
			var1.clear();
		}

		return var5; // L: 76
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 80
			var1.clear();
		}

	} // L: 81

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16022"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 84
			var1.remove();
		}

	} // L: 85

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Laa;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 460
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "()Laa;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 464
	}

	@ObfuscatedName("r")
	protected synchronized int vmethod5753() {
		return 0; // L: 468
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 472
			int var4 = this.midiFile.division * this.field3370 * -727379968 / (PcmPlayer.field325 * 22050); // L: 473

			do {
				long var5 = (long)var4 * (long)var3 + this.field3379; // L: 475
				if (this.field3380 - var5 >= 0L) { // L: 476
					this.field3379 = var5; // L: 477
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3380 - this.field3379) - 1L) / (long)var4); // L: 480
				this.field3379 += (long)var7 * (long)var4; // L: 481
				this.patchStream.fill(var1, var2, var7); // L: 482
				var2 += var7; // L: 483
				var3 -= var7; // L: 484
				this.method5597(); // L: 485
			} while(this.midiFile.isReady()); // L: 486
		}

		this.patchStream.fill(var1, var2, var3); // L: 489
	} // L: 490

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkc;ZI)V",
		garbageValue = "951999290"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 88
		this.midiFile.parse(var1.midi); // L: 89
		this.field3355 = var2; // L: 90
		this.field3379 = 0L; // L: 91
		int var3 = this.midiFile.trackCount(); // L: 92

		for (int var4 = 0; var4 < var3; ++var4) { // L: 93
			this.midiFile.gotoTrack(var4); // L: 94
			this.midiFile.readTrackLength(var4); // L: 95
			this.midiFile.markTrackPosition(var4); // L: 96
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 98
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 99
		this.field3380 = this.midiFile.method5716(this.trackLength); // L: 100
	} // L: 101

	@ObfuscatedName("j")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 493
			int var2 = this.midiFile.division * this.field3370 * -727379968 / (PcmPlayer.field325 * 22050); // L: 494

			do {
				long var3 = (long)var1 * (long)var2 + this.field3379; // L: 496
				if (this.field3380 - var3 >= 0L) { // L: 497
					this.field3379 = var3; // L: 498
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3380 - this.field3379) - 1L) / (long)var2); // L: 501
				this.field3379 += (long)var5 * (long)var2; // L: 502
				this.patchStream.skip(var5); // L: 503
				var1 -= var5; // L: 504
				this.method5597(); // L: 505
			} while(this.midiFile.isReady()); // L: 506
		}

		this.patchStream.skip(var1); // L: 509
	} // L: 510

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear(); // L: 104
		this.method5676(); // L: 105
	} // L: 106

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "32"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 109
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "71"
	)
	public synchronized void method5572(int var1, int var2) {
		this.method5573(var1, var2); // L: 113
	} // L: 114

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-46"
	)
	void method5573(int var1, int var2) {
		this.field3361[var1] = var2; // L: 117
		this.field3373[var1] = var2 & -128; // L: 118
		this.method5574(var1, var2); // L: 119
	} // L: 120

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-582359120"
	)
	void method5574(int var1, int var2) {
		if (var2 != this.field3381[var1]) { // L: 123
			this.field3381[var1] = var2; // L: 124

			for (int var3 = 0; var3 < 128; ++var3) { // L: 125
				this.field3374[var1][var3] = null;
			}
		}

	} // L: 127

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-477011775"
	)
	void method5575(int var1, int var2, int var3) {
		this.method5622(var1, var2, 64); // L: 130
		if ((this.field3356[var1] & 2) != 0) { // L: 131
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 132
				if (var4.field3427 == var1 && var4.field3415 < 0) { // L: 133
					this.field3357[var1][var4.field3419] = null; // L: 134
					this.field3357[var1][var2] = var4; // L: 135
					int var8 = (var4.field3424 * var4.field3414 >> 12) + var4.field3422; // L: 136
					var4.field3422 += var2 - var4.field3419 << 8; // L: 137
					var4.field3414 = var8 - var4.field3422; // L: 138
					var4.field3424 = 4096; // L: 139
					var4.field3419 = var2; // L: 140
					return; // L: 141
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3381[var1]); // L: 145
		if (var9 != null) { // L: 146
			RawSound var5 = var9.rawSounds[var2]; // L: 147
			if (var5 != null) { // L: 148
				MusicPatchNode var6 = new MusicPatchNode(); // L: 149
				var6.field3427 = var1; // L: 150
				var6.patch = var9; // L: 151
				var6.rawSound = var5; // L: 152
				var6.field3428 = var9.field3400[var2]; // L: 153
				var6.field3418 = var9.field3403[var2]; // L: 154
				var6.field3419 = var2; // L: 155
				var6.field3423 = var3 * var3 * var9.field3402[var2] * var9.field3401 + 1024 >> 11; // L: 156
				var6.field3421 = var9.field3405[var2] & 255; // L: 157
				var6.field3422 = (var2 << 8) - (var9.field3399[var2] & 32767); // L: 158
				var6.field3425 = 0; // L: 159
				var6.field3420 = 0; // L: 160
				var6.field3416 = 0; // L: 161
				var6.field3415 = -1; // L: 162
				var6.field3429 = 0; // L: 163
				if (this.field3358[var1] == 0) { // L: 164
					var6.stream = RawPcmStream.method1029(var5, this.method5589(var6), this.method5590(var6), this.method5591(var6)); // L: 165
				} else {
					var6.stream = RawPcmStream.method1029(var5, this.method5589(var6), 0, this.method5591(var6)); // L: 168
					this.method5637(var6, var9.field3399[var2] < 0); // L: 169
				}

				if (var9.field3399[var2] < 0) { // L: 171
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3418 >= 0) { // L: 172
					MusicPatchNode var7 = this.field3374[var1][var6.field3418]; // L: 173
					if (var7 != null && var7.field3415 < 0) { // L: 174
						this.field3357[var1][var7.field3419] = null; // L: 175
						var7.field3415 = 0; // L: 176
					}

					this.field3374[var1][var6.field3418] = var6; // L: 178
				}

				this.patchStream.queue.addFirst(var6); // L: 180
				this.field3357[var1][var2] = var6; // L: 181
			}
		}
	} // L: 182

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkx;ZI)V",
		garbageValue = "1046946935"
	)
	void method5637(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 185
		int var4;
		if (var2 && var1.rawSound.field299) { // L: 187
			int var5 = var3 + var3 - var1.rawSound.start; // L: 188
			var4 = (int)((long)this.field3358[var1.field3427] * (long)var5 >> 6); // L: 189
			var3 <<= 8; // L: 190
			if (var4 >= var3) { // L: 191
				var4 = var3 + var3 - 1 - var4; // L: 192
				var1.stream.method912(); // L: 193
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3358[var1.field3427] >> 6); // L: 197
		}

		var1.stream.method911(var4); // L: 199
	} // L: 200

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "676426616"
	)
	void method5622(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3357[var1][var2]; // L: 203
		if (var4 != null) { // L: 204
			this.field3357[var1][var2] = null; // L: 205
			if ((this.field3356[var1] & 2) != 0) { // L: 206
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 207
					if (var5.field3427 == var4.field3427 && var5.field3415 < 0 && var4 != var5) { // L: 208
						var4.field3415 = 0; // L: 209
						break; // L: 210
					}
				}
			} else {
				var4.field3415 = 0; // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "484115766"
	)
	void method5634(int var1, int var2, int var3) {
	} // L: 219

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1185959546"
	)
	void method5668(int var1, int var2) {
	} // L: 220

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1772680532"
	)
	void method5580(int var1, int var2) {
		this.field3364[var1] = var2; // L: 223
	} // L: 224

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1248985050"
	)
	void method5588(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 227
			if (var1 < 0 || var2.field3427 == var1) { // L: 228
				if (var2.stream != null) { // L: 229
					var2.stream.method916(PcmPlayer.field325 * 22050 / 100); // L: 230
					if (var2.stream.method976()) { // L: 231
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5787(); // L: 232
				}

				if (var2.field3415 < 0) { // L: 234
					this.field3357[var2.field3427][var2.field3419] = null;
				}

				var2.remove(); // L: 235
			}
		}

	} // L: 238

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-712942864"
	)
	void method5582(int var1) {
		if (var1 >= 0) { // L: 241
			this.field3359[var1] = 12800; // L: 245
			this.field3363[var1] = 8192; // L: 246
			this.field3367[var1] = 16383; // L: 247
			this.field3364[var1] = 8192; // L: 248
			this.field3365[var1] = 0; // L: 249
			this.field3366[var1] = 8192; // L: 250
			this.method5685(var1); // L: 251
			this.method5586(var1); // L: 252
			this.field3356[var1] = 0; // L: 253
			this.field3368[var1] = 32767; // L: 254
			this.field3369[var1] = 256; // L: 255
			this.field3358[var1] = 0; // L: 256
			this.method5679(var1, 8192); // L: 257
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 242
				this.method5582(var1);
			}

		}
	} // L: 243 258

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "914760617"
	)
	void method5583(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 261
			if ((var1 < 0 || var2.field3427 == var1) && var2.field3415 < 0) { // L: 262 263
				this.field3357[var2.field3427][var2.field3419] = null; // L: 264
				var2.field3415 = 0; // L: 265
			}
		}

	} // L: 269

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-17"
	)
	void method5676() {
		this.method5588(-1); // L: 272
		this.method5582(-1); // L: 273

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 274
			this.field3381[var1] = this.field3361[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 275
			this.field3373[var1] = this.field3361[var1] & -128;
		}

	} // L: 276

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-992120375"
	)
	void method5685(int var1) {
		if ((this.field3356[var1] & 2) != 0) { // L: 279
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 280
				if (var2.field3427 == var1 && this.field3357[var1][var2.field3419] == null && var2.field3415 < 0) { // L: 281 282
					var2.field3415 = 0;
				}
			}
		}

	} // L: 286

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1159932724"
	)
	void method5586(int var1) {
		if ((this.field3356[var1] & 4) != 0) { // L: 289
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 290
				if (var2.field3427 == var1) { // L: 291
					var2.field3434 = 0;
				}
			}
		}

	} // L: 294

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	void method5594(int var1) {
		int var2 = var1 & 240; // L: 297
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 298
			var3 = var1 & 15; // L: 299
			var4 = var1 >> 8 & 127; // L: 300
			var5 = var1 >> 16 & 127; // L: 301
			this.method5622(var3, var4, var5); // L: 302
		} else if (var2 == 144) { // L: 305
			var3 = var1 & 15; // L: 306
			var4 = var1 >> 8 & 127; // L: 307
			var5 = var1 >> 16 & 127; // L: 308
			if (var5 > 0) { // L: 309
				this.method5575(var3, var4, var5);
			} else {
				this.method5622(var3, var4, 64); // L: 310
			}

		} else if (var2 == 160) { // L: 313
			var3 = var1 & 15; // L: 314
			var4 = var1 >> 8 & 127; // L: 315
			var5 = var1 >> 16 & 127; // L: 316
			this.method5634(var3, var4, var5); // L: 317
		} else if (var2 == 176) { // L: 320
			var3 = var1 & 15; // L: 321
			var4 = var1 >> 8 & 127; // L: 322
			var5 = var1 >> 16 & 127; // L: 323
			if (var4 == 0) { // L: 324
				this.field3373[var3] = (var5 << 14) + (this.field3373[var3] & -2080769);
			}

			if (var4 == 32) { // L: 325
				this.field3373[var3] = (var5 << 7) + (this.field3373[var3] & -16257);
			}

			if (var4 == 1) { // L: 326
				this.field3365[var3] = (var5 << 7) + (this.field3365[var3] & -16257);
			}

			if (var4 == 33) { // L: 327
				this.field3365[var3] = var5 + (this.field3365[var3] & -128);
			}

			if (var4 == 5) { // L: 328
				this.field3366[var3] = (var5 << 7) + (this.field3366[var3] & -16257);
			}

			if (var4 == 37) { // L: 329
				this.field3366[var3] = var5 + (this.field3366[var3] & -128);
			}

			if (var4 == 7) { // L: 330
				this.field3359[var3] = (var5 << 7) + (this.field3359[var3] & -16257);
			}

			if (var4 == 39) { // L: 331
				this.field3359[var3] = var5 + (this.field3359[var3] & -128);
			}

			if (var4 == 10) { // L: 332
				this.field3363[var3] = (var5 << 7) + (this.field3363[var3] & -16257);
			}

			if (var4 == 42) { // L: 333
				this.field3363[var3] = var5 + (this.field3363[var3] & -128);
			}

			if (var4 == 11) { // L: 334
				this.field3367[var3] = (var5 << 7) + (this.field3367[var3] & -16257);
			}

			if (var4 == 43) { // L: 335
				this.field3367[var3] = var5 + (this.field3367[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 336
				if (var5 >= 64) { // L: 337
					var10000 = this.field3356;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3356; // L: 338
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 340
				if (var5 >= 64) { // L: 341
					var10000 = this.field3356;
					var10000[var3] |= 2;
				} else {
					this.method5685(var3); // L: 343
					var10000 = this.field3356; // L: 344
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 347
				this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & 127);
			}

			if (var4 == 98) { // L: 348
				this.field3368[var3] = (this.field3368[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 349
				this.field3368[var3] = (var5 << 7) + (this.field3368[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 350
				this.field3368[var3] = (this.field3368[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 351
				this.method5588(var3);
			}

			if (var4 == 121) { // L: 352
				this.method5582(var3);
			}

			if (var4 == 123) { // L: 353
				this.method5583(var3);
			}

			int var6;
			if (var4 == 6) { // L: 354
				var6 = this.field3368[var3]; // L: 355
				if (var6 == 16384) { // L: 356
					this.field3369[var3] = (var5 << 7) + (this.field3369[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 358
				var6 = this.field3368[var3]; // L: 359
				if (var6 == 16384) { // L: 360
					this.field3369[var3] = var5 + (this.field3369[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 362
				this.field3358[var3] = (var5 << 7) + (this.field3358[var3] & -16257);
			}

			if (var4 == 48) { // L: 363
				this.field3358[var3] = var5 + (this.field3358[var3] & -128);
			}

			if (var4 == 81) { // L: 364
				if (var5 >= 64) { // L: 365
					var10000 = this.field3356;
					var10000[var3] |= 4;
				} else {
					this.method5586(var3); // L: 367
					var10000 = this.field3356;
					var10000[var3] &= -5; // L: 368
				}
			}

			if (var4 == 17) { // L: 371
				this.method5679(var3, (var5 << 7) + (this.field3371[var3] & -16257));
			}

			if (var4 == 49) { // L: 372
				this.method5679(var3, var5 + (this.field3371[var3] & -128));
			}

		} else if (var2 == 192) { // L: 375
			var3 = var1 & 15; // L: 376
			var4 = var1 >> 8 & 127; // L: 377
			this.method5574(var3, var4 + this.field3373[var3]); // L: 378
		} else if (var2 == 208) { // L: 381
			var3 = var1 & 15; // L: 382
			var4 = var1 >> 8 & 127; // L: 383
			this.method5668(var3, var4); // L: 384
		} else if (var2 == 224) { // L: 387
			var3 = var1 & 15; // L: 388
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 389
			this.method5580(var3, var4); // L: 390
		} else {
			var2 = var1 & 255; // L: 393
			if (var2 == 255) { // L: 394
				this.method5676(); // L: 395
			}
		}
	} // L: 303 311 318 373 379 385 391 396 398

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "181224742"
	)
	void method5679(int var1, int var2) {
		this.field3371[var1] = var2; // L: 401
		this.field3372[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 402
	} // L: 403

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)I",
		garbageValue = "1148770502"
	)
	int method5589(MusicPatchNode var1) {
		int var2 = (var1.field3414 * var1.field3424 >> 12) + var1.field3422; // L: 406
		var2 += (this.field3364[var1.field3427] - 8192) * this.field3369[var1.field3427] >> 12; // L: 407
		MusicPatchNode2 var3 = var1.field3428; // L: 408
		int var4;
		if (var3.field3339 > 0 && (var3.field3338 > 0 || this.field3365[var1.field3427] > 0)) { // L: 409
			var4 = var3.field3338 << 2; // L: 410
			int var5 = var3.field3334 << 1; // L: 411
			if (var1.field3430 < var5) { // L: 412
				var4 = var4 * var1.field3430 / var5;
			}

			var4 += this.field3365[var1.field3427] >> 7; // L: 413
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3431 & 511)); // L: 414
			var2 += (int)((double)var4 * var6); // L: 415
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(PcmPlayer.field325 * 22050) + 0.5D); // L: 417
		return var4 < 1 ? 1 : var4; // L: 418
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)I",
		garbageValue = "1303045954"
	)
	int method5590(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3428; // L: 422
		int var3 = this.field3359[var1.field3427] * this.field3367[var1.field3427] + 4096 >> 13; // L: 423
		var3 = var3 * var3 + 16384 >> 15; // L: 424
		var3 = var3 * var1.field3423 + 16384 >> 15; // L: 425
		var3 = var3 * this.field3362 + 128 >> 8; // L: 426
		if (var2.field3335 > 0) { // L: 427
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3425 * 1.953125E-5D * (double)var2.field3335) + 0.5D); // L: 428
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3337 != null) { // L: 430
			var4 = var1.field3420; // L: 431
			var5 = var2.field3337[var1.field3416 * 4 + 1]; // L: 432
			if (var1.field3416 * 4 < var2.field3337.length - 2) { // L: 433
				var6 = (var2.field3337[var1.field3416 * 4] & 255) << 8; // L: 434
				var7 = (var2.field3337[var1.field3416 * 4 + 2] & 255) << 8; // L: 435
				var5 += (var4 - var6) * (var2.field3337[var1.field3416 * 4 + 3] - var5) / (var7 - var6); // L: 436
			}

			var3 = var5 * var3 + 32 >> 6; // L: 438
		}

		if (var1.field3415 > 0 && var2.field3333 != null) { // L: 440
			var4 = var1.field3415; // L: 441
			var5 = var2.field3333[var1.field3429 * 4 + 1]; // L: 442
			if (var1.field3429 * 4 < var2.field3333.length - 2) { // L: 443
				var6 = (var2.field3333[var1.field3429 * 4] & 255) << 8; // L: 444
				var7 = (var2.field3333[var1.field3429 * 4 + 2] & 255) << 8; // L: 445
				var5 += (var2.field3333[var1.field3429 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 446
			}

			var3 = var3 * var5 + 32 >> 6; // L: 448
		}

		return var3; // L: 450
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)I",
		garbageValue = "402004555"
	)
	int method5591(MusicPatchNode var1) {
		int var2 = this.field3363[var1.field3427]; // L: 454
		return var2 < 8192 ? var2 * var1.field3421 + 32 >> 6 : 16384 - ((128 - var1.field3421) * (16384 - var2) + 32 >> 6); // L: 455 456
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1623545318"
	)
	void method5597() {
		int var1 = this.track; // L: 513
		int var2 = this.trackLength; // L: 514

		long var3;
		for (var3 = this.field3380; var2 == this.trackLength; var3 = this.midiFile.method5716(var2)) { // L: 515 516 538
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 517
				this.midiFile.gotoTrack(var1); // L: 518
				int var5 = this.midiFile.readMessage(var1); // L: 519
				if (var5 == 1) { // L: 520
					this.midiFile.setTrackDone(); // L: 521
					this.midiFile.markTrackPosition(var1); // L: 522
					if (this.midiFile.isDone()) { // L: 523
						if (!this.field3355 || var2 == 0) { // L: 524
							this.method5676(); // L: 528
							this.midiFile.clear(); // L: 529
							return; // L: 530
						}

						this.midiFile.reset(var3); // L: 525
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 532
					this.method5594(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 533
				this.midiFile.markTrackPosition(var1); // L: 534
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 536
			var2 = this.midiFile.trackLengths[var1]; // L: 537
		}

		this.track = var1; // L: 540
		this.trackLength = var2; // L: 541
		this.field3380 = var3; // L: 542
	} // L: 543

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)Z",
		garbageValue = "1"
	)
	boolean method5598(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 546
			if (var1.field3415 >= 0) { // L: 547
				var1.remove(); // L: 548
				if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) { // L: 549
					this.field3374[var1.field3427][var1.field3418] = null; // L: 550
				}
			}

			return true; // L: 553
		} else {
			return false; // L: 555
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkx;[IIIB)Z",
		garbageValue = "-44"
	)
	boolean method5599(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3433 = PcmPlayer.field325 * 22050 / 100; // L: 559
		if (var1.field3415 < 0 || var1.stream != null && !var1.stream.method919()) { // L: 560
			int var5 = var1.field3424; // L: 568
			if (var5 > 0) { // L: 569
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3366[var1.field3427]) + 0.5D); // L: 570
				if (var5 < 0) { // L: 571
					var5 = 0;
				}

				var1.field3424 = var5; // L: 572
			}

			var1.stream.method917(this.method5589(var1)); // L: 574
			MusicPatchNode2 var6 = var1.field3428; // L: 575
			boolean var7 = false; // L: 576
			++var1.field3430; // L: 577
			var1.field3431 += var6.field3339; // L: 578
			double var8 = (double)((var1.field3419 - 60 << 8) + (var1.field3414 * var1.field3424 >> 12)) * 5.086263020833333E-6D; // L: 579
			if (var6.field3335 > 0) { // L: 580
				if (var6.field3332 > 0) { // L: 581
					var1.field3425 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3332 * var8) + 0.5D);
				} else {
					var1.field3425 += 128; // L: 582
				}
			}

			if (var6.field3337 != null) { // L: 584
				if (var6.field3340 > 0) { // L: 585
					var1.field3420 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3340 * var8) + 0.5D);
				} else {
					var1.field3420 += 128; // L: 586
				}

				while (var1.field3416 * 4 < var6.field3337.length - 2 && var1.field3420 > (var6.field3337[var1.field3416 * 4 + 2] & 255) << 8) { // L: 587
					var1.field3416 = var1.field3416 * 4 + 2;
				}

				if (var1.field3416 * 4 == var6.field3337.length - 2 && var6.field3337[var1.field3416 * 4 + 1] == 0) { // L: 588
					var7 = true;
				}
			}

			if (var1.field3415 >= 0 && var6.field3333 != null && (this.field3356[var1.field3427] & 1) == 0 && (var1.field3418 < 0 || var1 != this.field3374[var1.field3427][var1.field3418])) { // L: 590 591
				if (var6.field3336 > 0) { // L: 592
					var1.field3415 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3336 * var8) + 0.5D);
				} else {
					var1.field3415 += 128; // L: 593
				}

				while (var1.field3429 * 4 < var6.field3333.length - 2 && var1.field3415 > (var6.field3333[var1.field3429 * 4 + 2] & 255) << 8) { // L: 594
					var1.field3429 = var1.field3429 * 4 + 2;
				}

				if (var1.field3429 * 4 == var6.field3333.length - 2) { // L: 595
					var7 = true;
				}
			}

			if (var7) { // L: 598
				var1.stream.method916(var1.field3433); // L: 599
				if (var2 != null) { // L: 600
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 601
				}

				if (var1.stream.method976()) { // L: 602
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5787(); // L: 603
				if (var1.field3415 >= 0) { // L: 604
					var1.remove(); // L: 605
					if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) { // L: 606
						this.field3374[var1.field3427][var1.field3418] = null; // L: 607
					}
				}

				return true; // L: 610
			} else {
				var1.stream.method915(var1.field3433, this.method5590(var1), this.method5591(var1)); // L: 612
				return false; // L: 613
			}
		} else {
			var1.method5787(); // L: 561
			var1.remove(); // L: 562
			if (var1.field3418 > 0 && var1 == this.field3374[var1.field3427][var1.field3418]) { // L: 563
				this.field3374[var1.field3427][var1.field3418] = null; // L: 564
			}

			return true; // L: 566
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldp;",
		garbageValue = "-36297467"
	)
	static class124[] method5640() {
		return new class124[]{class124.field1535, class124.field1528, class124.field1529, class124.field1536, class124.field1531}; // L: 143
	}
}
