import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("tx")
	@ObfuscatedGetter(
		intValue = 219986407
	)
	static int field3326;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -557063845
	)
	int field3299;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -57181760
	)
	int field3324;
	@ObfuscatedName("x")
	int[] field3301;
	@ObfuscatedName("h")
	int[] field3298;
	@ObfuscatedName("j")
	int[] field3319;
	@ObfuscatedName("y")
	int[] field3307;
	@ObfuscatedName("d")
	int[] field3305;
	@ObfuscatedName("n")
	int[] field3320;
	@ObfuscatedName("r")
	int[] field3312;
	@ObfuscatedName("l")
	int[] field3308;
	@ObfuscatedName("s")
	int[] field3309;
	@ObfuscatedName("m")
	int[] field3310;
	@ObfuscatedName("q")
	int[] field3311;
	@ObfuscatedName("i")
	int[] field3303;
	@ObfuscatedName("e")
	int[] field3325;
	@ObfuscatedName("g")
	int[] field3314;
	@ObfuscatedName("k")
	int[] field3315;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Lkj;"
	)
	MusicPatchNode[][] field3316;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Lkj;"
	)
	MusicPatchNode[][] field3317;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ah")
	boolean field3313;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2114625077
	)
	@Export("track")
	int track;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 473007987
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 1403801666084551283L
	)
	long field3322;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -859009345527054569L
	)
	long field3323;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3299 = 256; // L: 14
		this.field3324 = -727379968; // L: 15
		this.field3301 = new int[16]; // L: 16
		this.field3298 = new int[16]; // L: 17
		this.field3319 = new int[16]; // L: 18
		this.field3307 = new int[16]; // L: 19
		this.field3305 = new int[16]; // L: 20
		this.field3320 = new int[16]; // L: 21
		this.field3312 = new int[16]; // L: 22
		this.field3308 = new int[16]; // L: 23
		this.field3309 = new int[16]; // L: 24
		this.field3310 = new int[16]; // L: 28
		this.field3311 = new int[16]; // L: 29
		this.field3303 = new int[16]; // L: 30
		this.field3325 = new int[16]; // L: 31
		this.field3314 = new int[16]; // L: 32
		this.field3315 = new int[16]; // L: 33
		this.field3316 = new MusicPatchNode[16][128]; // L: 34
		this.field3317 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5472(); // L: 46
	} // L: 47

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1291938970"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3299 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	int method5576() {
		return this.field3299; // L: 54
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Llg;Law;IB)Z",
		garbageValue = "75"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5661(); // L: 58
		boolean var5 = true; // L: 59
		int[] var6 = null; // L: 60
		if (var4 > 0) { // L: 61
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) { // L: 62
			int var8 = (int)var7.key; // L: 63
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8); // L: 64
			if (var9 == null) { // L: 65
				byte[] var11 = var2.takeFileFlat(var8); // L: 68
				MusicPatch var10;
				if (var11 == null) { // L: 69
					var10 = null; // L: 70
				} else {
					var10 = new MusicPatch(var11); // L: 73
				}

				var9 = var10; // L: 75
				if (var10 == null) { // L: 76
					var5 = false; // L: 77
					continue;
				}

				this.musicPatches.put(var10, (long)var8); // L: 80
			}

			if (!var9.method5630(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) { // L: 84
			var1.clear();
		}

		return var5; // L: 85
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2065502092"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lay;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "()Lay;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("d")
	protected synchronized int vmethod5648() {
		return 0; // L: 477
	}

	@ObfuscatedName("n")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field3324 * 1000000 / SoundCache.field337; // L: 482

			do {
				long var5 = (long)var3 * (long)var4 + this.field3322; // L: 484
				if (this.field3323 - var5 >= 0L) { // L: 485
					this.field3322 = var5; // L: 486
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3323 - this.field3322) - 1L) / (long)var4); // L: 489
				this.field3322 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method5485(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lkf;ZB)V",
		garbageValue = "0"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field3313 = var2;
		this.field3322 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field3323 = this.midiFile.method5595(this.trackLength);
	}

	@ObfuscatedName("l")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field3324 * 1000000 / SoundCache.field337; // L: 503

			do {
				long var3 = this.field3322 + (long)var1 * (long)var2; // L: 505
				if (this.field3323 - var3 >= 0L) { // L: 506
					this.field3322 = var3; // L: 507
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3323 - this.field3322) - 1L) / (long)var2); // L: 510
				this.field3322 += (long)var2 * (long)var5; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method5485(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1110522631"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method5472();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-79"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1688953858"
	)
	public synchronized void method5480(int var1, int var2) {
		this.method5572(var1, var2);
	} // L: 123

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2104178421"
	)
	void method5572(int var1, int var2) {
		this.field3307[var1] = var2; // L: 126
		this.field3320[var1] = var2 & -128; // L: 127
		this.method5462(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "25860"
	)
	void method5462(int var1, int var2) {
		if (var2 != this.field3305[var1]) { // L: 132
			this.field3305[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field3317[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-315683773"
	)
	void method5463(int var1, int var2, int var3) {
		this.method5465(var1, var2, 64); // L: 139
		if ((this.field3310[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field3361 == var1 && var4.field3373 < 0) { // L: 142
					this.field3316[var1][var4.field3364] = null; // L: 143
					this.field3316[var1][var2] = var4; // L: 144
					int var8 = (var4.field3369 * var4.field3368 >> 12) + var4.field3376; // L: 145
					var4.field3376 += var2 - var4.field3364 << 8; // L: 146
					var4.field3368 = var8 - var4.field3376; // L: 147
					var4.field3369 = 4096; // L: 148
					var4.field3364 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3305[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field3361 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field3374 = var9.field3346[var2]; // L: 162
				var6.field3359 = var9.field3347[var2]; // L: 163
				var6.field3364 = var2; // L: 164
				var6.field3365 = var3 * var3 * var9.field3344[var2] * var9.field3350 + 1024 >> 11; // L: 165
				var6.field3366 = var9.field3345[var2] & 255; // L: 166
				var6.field3376 = (var2 << 8) - (var9.field3343[var2] & 32767); // L: 167
				var6.field3370 = 0; // L: 168
				var6.field3379 = 0; // L: 169
				var6.field3372 = 0; // L: 170
				var6.field3373 = -1; // L: 171
				var6.field3371 = 0; // L: 172
				if (this.field3325[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method889(var5, this.method5477(var6), this.method5478(var6), this.method5479(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method889(var5, this.method5477(var6), 0, this.method5479(var6)); // L: 177
					this.method5579(var6, var9.field3343[var2] < 0); // L: 178
				}

				if (var9.field3343[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3359 >= 0) { // L: 181
					MusicPatchNode var7 = this.field3317[var1][var6.field3359]; // L: 182
					if (var7 != null && var7.field3373 < 0) { // L: 183
						this.field3316[var1][var7.field3364] = null; // L: 184
						var7.field3373 = 0; // L: 185
					}

					this.field3317[var1][var6.field3359] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field3316[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkj;ZI)V",
		garbageValue = "-2124213671"
	)
	void method5579(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field284) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field3325[var1.field3361] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method898(); // L: 202
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3325[var1.field3361] >> 6); // L: 206
		}

		var1.stream.method1007(var4); // L: 208
	} // L: 209

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "863946990"
	)
	void method5465(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3316[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field3316[var1][var2] = null; // L: 214
			if ((this.field3310[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var4.field3361 == var5.field3361 && var5.field3373 < 0 && var4 != var5) { // L: 217
						var4.field3373 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field3373 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-976368336"
	)
	void method5534(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-89"
	)
	void method5467(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "16384"
	)
	void method5468(int var1, int var2) {
		this.field3312[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1300315147"
	)
	void method5490(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field3361 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method893(SoundCache.field337 / 100); // L: 239
					if (var2.stream.method895()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5670(); // L: 241
				}

				if (var2.field3373 < 0) { // L: 243
					this.field3316[var2.field3361][var2.field3364] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1032166120"
	)
	void method5470(int var1) {
		if (var1 >= 0) { // L: 250
			this.field3301[var1] = 12800; // L: 254
			this.field3298[var1] = 8192; // L: 255
			this.field3319[var1] = 16383; // L: 256
			this.field3312[var1] = 8192; // L: 257
			this.field3308[var1] = 0; // L: 258
			this.field3309[var1] = 8192; // L: 259
			this.method5473(var1); // L: 260
			this.method5454(var1); // L: 261
			this.field3310[var1] = 0; // L: 262
			this.field3311[var1] = 32767; // L: 263
			this.field3303[var1] = 256; // L: 264
			this.field3325[var1] = 0; // L: 265
			this.method5476(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method5470(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "30459"
	)
	void method5475(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field3361 == var1) && var2.field3373 < 0) { // L: 271 272
				this.field3316[var2.field3361][var2.field3364] = null; // L: 273
				var2.field3373 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812466376"
	)
	void method5472() {
		this.method5490(-1); // L: 281
		this.method5470(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3305[var1] = this.field3307[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field3320[var1] = this.field3307[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "27"
	)
	void method5473(int var1) {
		if ((this.field3310[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field3361 == var1 && this.field3316[var1][var2.field3364] == null && var2.field3373 < 0) { // L: 290 291
					var2.field3373 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1480688586"
	)
	void method5454(int var1) {
		if ((this.field3310[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field3361 == var1) { // L: 300
					var2.field3362 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method5530(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method5465(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method5463(var3, var4, var5);
			} else {
				this.method5465(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method5534(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field3320[var3] = (var5 << 14) + (this.field3320[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field3320[var3] = (var5 << 7) + (this.field3320[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field3308[var3] = (var5 << 7) + (this.field3308[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field3308[var3] = var5 + (this.field3308[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field3309[var3] = (var5 << 7) + (this.field3309[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field3309[var3] = var5 + (this.field3309[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field3301[var3] = (var5 << 7) + (this.field3301[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field3301[var3] = var5 + (this.field3301[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field3298[var3] = (var5 << 7) + (this.field3298[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field3298[var3] = var5 + (this.field3298[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field3319[var3] = (var5 << 7) + (this.field3319[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field3319[var3] = var5 + (this.field3319[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field3310;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3310; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field3310;
					var10000[var3] |= 2;
				} else {
					this.method5473(var3); // L: 352
					var10000 = this.field3310; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field3311[var3] = (var5 << 7) + (this.field3311[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field3311[var3] = (this.field3311[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field3311[var3] = (var5 << 7) + (this.field3311[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field3311[var3] = (this.field3311[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method5490(var3);
			}

			if (var4 == 121) { // L: 361
				this.method5470(var3);
			}

			if (var4 == 123) { // L: 362
				this.method5475(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field3311[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field3303[var3] = (var5 << 7) + (this.field3303[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field3311[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field3303[var3] = var5 + (this.field3303[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field3325[var3] = (var5 << 7) + (this.field3325[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field3325[var3] = var5 + (this.field3325[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field3310;
					var10000[var3] |= 4;
				} else {
					this.method5454(var3); // L: 376
					var10000 = this.field3310; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 380
				this.method5476(var3, (var5 << 7) + (this.field3314[var3] & -16257));
			}

			if (var4 == 49) { // L: 381
				this.method5476(var3, var5 + (this.field3314[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method5462(var3, var4 + this.field3320[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method5467(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method5468(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method5472(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-372814053"
	)
	void method5476(int var1, int var2) {
		this.field3314[var1] = var2; // L: 410
		this.field3315[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)I",
		garbageValue = "94"
	)
	int method5477(MusicPatchNode var1) {
		int var2 = (var1.field3369 * var1.field3368 >> 12) + var1.field3376; // L: 415
		var2 += (this.field3312[var1.field3361] - 8192) * this.field3303[var1.field3361] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field3374; // L: 417
		int var4;
		if (var3.field3287 > 0 && (var3.field3280 > 0 || this.field3308[var1.field3361] > 0)) { // L: 418
			var4 = var3.field3280 << 2; // L: 419
			int var5 = var3.field3281 << 1; // L: 420
			if (var1.field3375 < var5) { // L: 421
				var4 = var4 * var1.field3375 / var5;
			}

			var4 += this.field3308[var1.field3361] >> 7; // L: 422
			double var6 = Math.sin((double)(var1.field3363 & 511) * 0.01227184630308513D); // L: 423
			var2 += (int)((double)var4 * var6); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)SoundCache.field337 + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)I",
		garbageValue = "-1070589370"
	)
	int method5478(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3374; // L: 431
		int var3 = this.field3301[var1.field3361] * this.field3319[var1.field3361] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field3365 + 16384 >> 15; // L: 434
		var3 = var3 * this.field3299 + 128 >> 8; // L: 435
		if (var2.field3282 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3282 * (double)var1.field3370 * 1.953125E-5D) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3288 != null) { // L: 439
			var4 = var1.field3379; // L: 440
			var5 = var2.field3288[var1.field3372 * 4 + 1]; // L: 441
			if (var1.field3372 * 4 < var2.field3288.length - 2) { // L: 442
				var6 = (var2.field3288[var1.field3372 * 4] & 255) << 8; // L: 443
				var7 = (var2.field3288[var1.field3372 * 4 + 2] & 255) << 8; // L: 444
				var5 += (var2.field3288[var1.field3372 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 445
			}

			var3 = var3 * var5 + 32 >> 6; // L: 447
		}

		if (var1.field3373 > 0 && var2.field3286 != null) { // L: 449
			var4 = var1.field3373; // L: 450
			var5 = var2.field3286[var1.field3371 * 4 + 1]; // L: 451
			if (var1.field3371 * 4 < var2.field3286.length - 2) { // L: 452
				var6 = (var2.field3286[var1.field3371 * 4] & 255) << 8; // L: 453
				var7 = (var2.field3286[var1.field3371 * 4 + 2] & 255) << 8; // L: 454
				var5 += (var4 - var6) * (var2.field3286[var1.field3371 * 4 + 3] - var5) / (var7 - var6); // L: 455
			}

			var3 = var3 * var5 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)I",
		garbageValue = "-4"
	)
	int method5479(MusicPatchNode var1) {
		int var2 = this.field3298[var1.field3361]; // L: 463
		return var2 < 8192 ? var2 * var1.field3366 + 32 >> 6 : 16384 - ((128 - var1.field3366) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-727513121"
	)
	void method5485() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field3323; var2 == this.trackLength; var3 = this.midiFile.method5595(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field3313 || var2 == 0) { // L: 533
							this.method5472(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method5530(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field3323 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)Z",
		garbageValue = "-59"
	)
	boolean method5486(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field3373 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) { // L: 558
					this.field3317[var1.field3361][var1.field3359] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkj;[IIIB)Z",
		garbageValue = "0"
	)
	boolean method5487(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3378 = SoundCache.field337 / 100; // L: 568
		if (var1.field3373 < 0 || var1.stream != null && !var1.stream.method905()) { // L: 569
			int var5 = var1.field3369; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3309[var1.field3361] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field3369 = var5; // L: 581
			}

			var1.stream.method944(this.method5477(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field3374; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3375; // L: 586
			var1.field3363 += var6.field3287; // L: 587
			double var8 = (double)((var1.field3364 - 60 << 8) + (var1.field3368 * var1.field3369 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field3282 > 0) { // L: 589
				if (var6.field3285 > 0) { // L: 590
					var1.field3370 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3285 * var8) + 0.5D);
				} else {
					var1.field3370 += 128; // L: 591
				}
			}

			if (var6.field3288 != null) { // L: 593
				if (var6.field3283 > 0) { // L: 594
					var1.field3379 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3283) + 0.5D);
				} else {
					var1.field3379 += 128; // L: 595
				}

				while (var1.field3372 * 4 < var6.field3288.length - 2 && var1.field3379 > (var6.field3288[var1.field3372 * 4 + 2] & 255) << 8) { // L: 596
					var1.field3372 = var1.field3372 * 4 + 2;
				}

				if (var1.field3372 * 4 == var6.field3288.length - 2 && var6.field3288[var1.field3372 * 4 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field3373 >= 0 && var6.field3286 != null && (this.field3310[var1.field3361] & 1) == 0 && (var1.field3359 < 0 || var1 != this.field3317[var1.field3361][var1.field3359])) { // L: 599 600
				if (var6.field3284 > 0) { // L: 601
					var1.field3373 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3284 * var8) + 0.5D);
				} else {
					var1.field3373 += 128; // L: 602
				}

				while (var1.field3371 * 4 < var6.field3286.length - 2 && var1.field3373 > (var6.field3286[var1.field3371 * 4 + 2] & 255) << 8) { // L: 603
					var1.field3371 = var1.field3371 * 4 + 2;
				}

				if (var1.field3371 * 4 == var6.field3286.length - 2) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method893(var1.field3378); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method895()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5670(); // L: 612
				if (var1.field3373 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) { // L: 615
						this.field3317[var1.field3361][var1.field3359] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method884(var1.field3378, this.method5478(var1), this.method5479(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method5670(); // L: 570
			var1.remove(); // L: 571
			if (var1.field3359 > 0 && var1 == this.field3317[var1.field3361][var1.field3359]) { // L: 572
				this.field3317[var1.field3361][var1.field3359] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lgp;",
		garbageValue = "-531059897"
	)
	@Export("ItemComposition_get")
	public static ItemComposition ItemComposition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemComposition_cached.get((long)var0); // L: 88
		if (var1 != null) { // L: 89
			return var1;
		} else {
			byte[] var2 = SpriteMask.ItemComposition_archive.takeFile(10, var0); // L: 90
			var1 = new ItemComposition(); // L: 91
			var1.id = var0; // L: 92
			if (var2 != null) { // L: 93
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 94
			if (var1.noteTemplate != -1) { // L: 95
				var1.genCert(ItemComposition_get(var1.noteTemplate), ItemComposition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 96
				var1.genBought(ItemComposition_get(var1.notedId), ItemComposition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 97
				var1.genPlaceholder(ItemComposition_get(var1.placeholderTemplate), ItemComposition_get(var1.placeholder));
			}

			if (!class1.ItemComposition_inMembersWorld && var1.isMembersOnly) { // L: 98
				var1.name = "Members object"; // L: 99
				var1.isTradable = false; // L: 100

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) { // L: 101
					var1.groundActions[var3] = null; // L: 102
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) { // L: 104
					if (var3 != 4) { // L: 105
						var1.inventoryActions[var3] = null; // L: 106
					}
				}

				var1.shiftClickIndex = -2; // L: 109
				var1.team = 0; // L: 110
				if (var1.params != null) { // L: 111
					boolean var6 = false; // L: 112

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 113
						ParamComposition var5 = class230.getParamDefinition((int)var4.key); // L: 114
						if (var5.autoDisable) { // L: 115
							var4.remove();
						} else {
							var6 = true; // L: 116
						}
					}

					if (!var6) { // L: 118
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemComposition_cached.put(var1, (long)var0); // L: 121
			return var1; // L: 122
		}
	}
}
