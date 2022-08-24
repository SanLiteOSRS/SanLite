import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 945152209
	)
	int field3206;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1527124495
	)
	int field3207;
	@ObfuscatedName("c")
	int[] field3228;
	@ObfuscatedName("q")
	int[] field3208;
	@ObfuscatedName("i")
	int[] field3210;
	@ObfuscatedName("k")
	int[] field3205;
	@ObfuscatedName("o")
	int[] field3212;
	@ObfuscatedName("n")
	int[] field3224;
	@ObfuscatedName("d")
	int[] field3209;
	@ObfuscatedName("a")
	int[] field3218;
	@ObfuscatedName("m")
	int[] field3216;
	@ObfuscatedName("e")
	int[] field3223;
	@ObfuscatedName("b")
	int[] field3219;
	@ObfuscatedName("x")
	int[] field3220;
	@ObfuscatedName("f")
	int[] field3221;
	@ObfuscatedName("t")
	int[] field3222;
	@ObfuscatedName("j")
	int[] field3214;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "[[Ljl;"
	)
	MusicPatchNode[][] field3229;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[Ljl;"
	)
	MusicPatchNode[][] field3211;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("av")
	boolean field3213;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 750816385
	)
	@Export("track")
	int track;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1424179677
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 7267383447845986699L
	)
	long field3230;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 2251608804778444067L
	)
	long field3231;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field3206 = 256; // L: 14
		this.field3207 = 1000000; // L: 15
		this.field3228 = new int[16]; // L: 16
		this.field3208 = new int[16]; // L: 17
		this.field3210 = new int[16]; // L: 18
		this.field3205 = new int[16]; // L: 19
		this.field3212 = new int[16]; // L: 20
		this.field3224 = new int[16]; // L: 21
		this.field3209 = new int[16]; // L: 22
		this.field3218 = new int[16]; // L: 23
		this.field3216 = new int[16]; // L: 24
		this.field3223 = new int[16]; // L: 28
		this.field3219 = new int[16]; // L: 29
		this.field3220 = new int[16]; // L: 30
		this.field3221 = new int[16]; // L: 31
		this.field3222 = new int[16]; // L: 32
		this.field3214 = new int[16]; // L: 33
		this.field3229 = new MusicPatchNode[16][128]; // L: 34
		this.field3211 = new MusicPatchNode[16][128]; // L: 35
		this.midiFile = new MidiFileReader(); // L: 36
		this.patchStream = new MusicPatchPcmStream(this); // L: 42
		this.musicPatches = new NodeHashTable(128); // L: 45
		this.method5240(); // L: 46
	} // L: 47

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "406140515"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field3206 = var1; // L: 50
	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-571564591"
	)
	int method5237() {
		return this.field3206; // L: 54
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lja;Lls;Lap;II)Z",
		garbageValue = "912390095"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method5408(); // L: 58
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

			if (!var9.method5369(var3, var7.byteArray, var6)) { // L: 82
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779976021"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	} // L: 90

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-191760391"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) { // L: 93
			var1.remove();
		}

	} // L: 94

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream; // L: 469
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null; // L: 473
	}

	@ObfuscatedName("k")
	protected synchronized int vmethod5396() {
		return 0; // L: 477
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) { // L: 481
			int var4 = this.midiFile.division * this.field3207 * -727379968 / (class344.field4152 * -449918071); // L: 482

			do {
				long var5 = (long)var4 * (long)var3 + this.field3230; // L: 484
				if (this.field3231 - var5 >= 0L) { // L: 485
					this.field3230 = var5; // L: 486
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3231 - this.field3230) - 1L) / (long)var4); // L: 489
				this.field3230 += (long)var4 * (long)var7; // L: 490
				this.patchStream.fill(var1, var2, var7); // L: 491
				var2 += var7; // L: 492
				var3 -= var7; // L: 493
				this.method5223(); // L: 494
			} while(this.midiFile.isReady()); // L: 495
		}

		this.patchStream.fill(var1, var2, var3); // L: 498
	} // L: 499

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lja;ZI)V",
		garbageValue = "-1535614413"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear(); // L: 97
		this.midiFile.parse(var1.midi); // L: 98
		this.field3213 = var2; // L: 99
		this.field3230 = 0L; // L: 100
		int var3 = this.midiFile.trackCount(); // L: 101

		for (int var4 = 0; var4 < var3; ++var4) { // L: 102
			this.midiFile.gotoTrack(var4); // L: 103
			this.midiFile.readTrackLength(var4); // L: 104
			this.midiFile.markTrackPosition(var4); // L: 105
		}

		this.track = this.midiFile.getPrioritizedTrack(); // L: 107
		this.trackLength = this.midiFile.trackLengths[this.track]; // L: 108
		this.field3231 = this.midiFile.method5330(this.trackLength); // L: 109
	} // L: 110

	@ObfuscatedName("d")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) { // L: 502
			int var2 = this.midiFile.division * this.field3207 * -727379968 / (class344.field4152 * -449918071); // L: 503

			do {
				long var3 = (long)var1 * (long)var2 + this.field3230; // L: 505
				if (this.field3231 - var3 >= 0L) { // L: 506
					this.field3230 = var3; // L: 507
					break;
				}

				int var5 = (int)((this.field3231 - this.field3230 + (long)var2 - 1L) / (long)var2); // L: 510
				this.field3230 += (long)var5 * (long)var2; // L: 511
				this.patchStream.skip(var5); // L: 512
				var1 -= var5; // L: 513
				this.method5223(); // L: 514
			} while(this.midiFile.isReady()); // L: 515
		}

		this.patchStream.skip(var1); // L: 518
	} // L: 519

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear(); // L: 113
		this.method5240(); // L: 114
	} // L: 115

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady(); // L: 118
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-106"
	)
	public synchronized void method5198(int var1, int var2) {
		this.method5199(var1, var2); // L: 122
	} // L: 123

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	void method5199(int var1, int var2) {
		this.field3205[var1] = var2; // L: 126
		this.field3224[var1] = var2 & -128; // L: 127
		this.method5200(var1, var2); // L: 128
	} // L: 129

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1539743468"
	)
	void method5200(int var1, int var2) {
		if (var2 != this.field3212[var1]) { // L: 132
			this.field3212[var1] = var2; // L: 133

			for (int var3 = 0; var3 < 128; ++var3) { // L: 134
				this.field3211[var1][var3] = null;
			}
		}

	} // L: 136

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1108184532"
	)
	void method5201(int var1, int var2, int var3) {
		this.method5203(var1, var2, 64); // L: 139
		if ((this.field3223[var1] & 2) != 0) { // L: 140
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) { // L: 141
				if (var4.field3280 == var1 && var4.field3266 < 0) { // L: 142
					this.field3229[var1][var4.field3286] = null; // L: 143
					this.field3229[var1][var2] = var4; // L: 144
					int var8 = (var4.field3272 * var4.field3273 >> 12) + var4.field3271; // L: 145
					var4.field3271 += var2 - var4.field3286 << 8; // L: 146
					var4.field3272 = var8 - var4.field3271; // L: 147
					var4.field3273 = 4096; // L: 148
					var4.field3286 = var2; // L: 149
					return; // L: 150
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3212[var1]); // L: 154
		if (var9 != null) { // L: 155
			RawSound var5 = var9.rawSounds[var2]; // L: 156
			if (var5 != null) { // L: 157
				MusicPatchNode var6 = new MusicPatchNode(); // L: 158
				var6.field3280 = var1; // L: 159
				var6.patch = var9; // L: 160
				var6.rawSound = var5; // L: 161
				var6.field3284 = var9.field3255[var2]; // L: 162
				var6.field3267 = var9.field3253[var2]; // L: 163
				var6.field3286 = var2; // L: 164
				var6.field3269 = var3 * var3 * var9.field3252[var2] * var9.field3248 + 1024 >> 11; // L: 165
				var6.field3270 = var9.field3251[var2] & 255; // L: 166
				var6.field3271 = (var2 << 8) - (var9.field3249[var2] & 32767); // L: 167
				var6.field3263 = 0; // L: 168
				var6.field3275 = 0; // L: 169
				var6.field3276 = 0; // L: 170
				var6.field3266 = -1; // L: 171
				var6.field3281 = 0; // L: 172
				if (this.field3221[var1] == 0) { // L: 173
					var6.stream = RawPcmStream.method769(var5, this.method5215(var6), this.method5216(var6), this.method5300(var6)); // L: 174
				} else {
					var6.stream = RawPcmStream.method769(var5, this.method5215(var6), 0, this.method5300(var6)); // L: 177
					this.method5202(var6, var9.field3249[var2] < 0); // L: 178
				}

				if (var9.field3249[var2] < 0) { // L: 180
					var6.stream.setNumLoops(-1);
				}

				if (var6.field3267 >= 0) { // L: 181
					MusicPatchNode var7 = this.field3211[var1][var6.field3267]; // L: 182
					if (var7 != null && var7.field3266 < 0) { // L: 183
						this.field3229[var1][var7.field3286] = null; // L: 184
						var7.field3266 = 0; // L: 185
					}

					this.field3211[var1][var6.field3267] = var6; // L: 187
				}

				this.patchStream.queue.addFirst(var6); // L: 189
				this.field3229[var1][var2] = var6; // L: 190
			}
		}
	} // L: 191

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljl;ZI)V",
		garbageValue = "-2091594866"
	)
	void method5202(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length; // L: 194
		int var4;
		if (var2 && var1.rawSound.field264) { // L: 196
			int var5 = var3 + var3 - var1.rawSound.start; // L: 197
			var4 = (int)((long)var5 * (long)this.field3221[var1.field3280] >> 6); // L: 198
			var3 <<= 8; // L: 199
			if (var4 >= var3) { // L: 200
				var4 = var3 + var3 - 1 - var4; // L: 201
				var1.stream.method778(); // L: 202
			}
		} else {
			var4 = (int)((long)this.field3221[var1.field3280] * (long)var3 >> 6); // L: 206
		}

		var1.stream.method793(var4); // L: 208
	} // L: 209

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "88"
	)
	void method5203(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3229[var1][var2]; // L: 212
		if (var4 != null) { // L: 213
			this.field3229[var1][var2] = null; // L: 214
			if ((this.field3223[var1] & 2) != 0) { // L: 215
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 216
					if (var5.field3280 == var4.field3280 && var5.field3266 < 0 && var5 != var4) { // L: 217
						var4.field3266 = 0; // L: 218
						break; // L: 219
					}
				}
			} else {
				var4.field3266 = 0; // L: 224
			}

		}
	} // L: 226

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2083947219"
	)
	void method5204(int var1, int var2, int var3) {
	} // L: 228

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-27277"
	)
	void method5294(int var1, int var2) {
	} // L: 229

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "582010167"
	)
	void method5206(int var1, int var2) {
		this.field3209[var1] = var2; // L: 232
	} // L: 233

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1944528994"
	)
	void method5207(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 236
			if (var1 < 0 || var2.field3280 == var1) { // L: 237
				if (var2.stream != null) { // L: 238
					var2.stream.method782(class344.field4152 * -449918071 / 100); // L: 239
					if (var2.stream.method820()) { // L: 240
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method5415(); // L: 241
				}

				if (var2.field3266 < 0) { // L: 243
					this.field3229[var2.field3280][var2.field3286] = null;
				}

				var2.remove(); // L: 244
			}
		}

	} // L: 247

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "519673015"
	)
	void method5208(int var1) {
		if (var1 >= 0) { // L: 250
			this.field3228[var1] = 12800; // L: 254
			this.field3208[var1] = 8192; // L: 255
			this.field3210[var1] = 16383; // L: 256
			this.field3209[var1] = 8192; // L: 257
			this.field3218[var1] = 0; // L: 258
			this.field3216[var1] = 8192; // L: 259
			this.method5211(var1); // L: 260
			this.method5212(var1); // L: 261
			this.field3223[var1] = 0; // L: 262
			this.field3219[var1] = 32767; // L: 263
			this.field3220[var1] = 256; // L: 264
			this.field3221[var1] = 0; // L: 265
			this.method5214(var1, 8192); // L: 266
		} else {
			for (var1 = 0; var1 < 16; ++var1) { // L: 251
				this.method5208(var1);
			}

		}
	} // L: 252 267

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1761941662"
	)
	void method5264(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 270
			if ((var1 < 0 || var2.field3280 == var1) && var2.field3266 < 0) { // L: 271 272
				this.field3229[var2.field3280][var2.field3286] = null; // L: 273
				var2.field3266 = 0; // L: 274
			}
		}

	} // L: 278

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2007631477"
	)
	void method5240() {
		this.method5207(-1); // L: 281
		this.method5208(-1); // L: 282

		int var1;
		for (var1 = 0; var1 < 16; ++var1) { // L: 283
			this.field3212[var1] = this.field3205[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) { // L: 284
			this.field3224[var1] = this.field3205[var1] & -128;
		}

	} // L: 285

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-72"
	)
	void method5211(int var1) {
		if ((this.field3223[var1] & 2) != 0) { // L: 288
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 289
				if (var2.field3280 == var1 && this.field3229[var1][var2.field3286] == null && var2.field3266 < 0) { // L: 290 291
					var2.field3266 = 0;
				}
			}
		}

	} // L: 295

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1573730813"
	)
	void method5212(int var1) {
		if ((this.field3223[var1] & 4) != 0) { // L: 298
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) { // L: 299
				if (var2.field3280 == var1) { // L: 300
					var2.field3283 = 0;
				}
			}
		}

	} // L: 303

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "100"
	)
	void method5213(int var1) {
		int var2 = var1 & 240; // L: 306
		int var3;
		int var4;
		int var5;
		if (var2 == 128) { // L: 307
			var3 = var1 & 15; // L: 308
			var4 = var1 >> 8 & 127; // L: 309
			var5 = var1 >> 16 & 127; // L: 310
			this.method5203(var3, var4, var5); // L: 311
		} else if (var2 == 144) { // L: 314
			var3 = var1 & 15; // L: 315
			var4 = var1 >> 8 & 127; // L: 316
			var5 = var1 >> 16 & 127; // L: 317
			if (var5 > 0) { // L: 318
				this.method5201(var3, var4, var5);
			} else {
				this.method5203(var3, var4, 64); // L: 319
			}

		} else if (var2 == 160) { // L: 322
			var3 = var1 & 15; // L: 323
			var4 = var1 >> 8 & 127; // L: 324
			var5 = var1 >> 16 & 127; // L: 325
			this.method5204(var3, var4, var5); // L: 326
		} else if (var2 == 176) { // L: 329
			var3 = var1 & 15; // L: 330
			var4 = var1 >> 8 & 127; // L: 331
			var5 = var1 >> 16 & 127; // L: 332
			if (var4 == 0) { // L: 333
				this.field3224[var3] = (var5 << 14) + (this.field3224[var3] & -2080769);
			}

			if (var4 == 32) { // L: 334
				this.field3224[var3] = (var5 << 7) + (this.field3224[var3] & -16257);
			}

			if (var4 == 1) { // L: 335
				this.field3218[var3] = (var5 << 7) + (this.field3218[var3] & -16257);
			}

			if (var4 == 33) { // L: 336
				this.field3218[var3] = var5 + (this.field3218[var3] & -128);
			}

			if (var4 == 5) { // L: 337
				this.field3216[var3] = (var5 << 7) + (this.field3216[var3] & -16257);
			}

			if (var4 == 37) { // L: 338
				this.field3216[var3] = var5 + (this.field3216[var3] & -128);
			}

			if (var4 == 7) { // L: 339
				this.field3228[var3] = (var5 << 7) + (this.field3228[var3] & -16257);
			}

			if (var4 == 39) { // L: 340
				this.field3228[var3] = var5 + (this.field3228[var3] & -128);
			}

			if (var4 == 10) { // L: 341
				this.field3208[var3] = (var5 << 7) + (this.field3208[var3] & -16257);
			}

			if (var4 == 42) { // L: 342
				this.field3208[var3] = var5 + (this.field3208[var3] & -128);
			}

			if (var4 == 11) { // L: 343
				this.field3210[var3] = (var5 << 7) + (this.field3210[var3] & -16257);
			}

			if (var4 == 43) { // L: 344
				this.field3210[var3] = var5 + (this.field3210[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) { // L: 345
				if (var5 >= 64) { // L: 346
					var10000 = this.field3223;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3223; // L: 347
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) { // L: 349
				if (var5 >= 64) { // L: 350
					var10000 = this.field3223;
					var10000[var3] |= 2;
				} else {
					this.method5211(var3); // L: 352
					var10000 = this.field3223; // L: 353
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) { // L: 356
				this.field3219[var3] = (var5 << 7) + (this.field3219[var3] & 127);
			}

			if (var4 == 98) { // L: 357
				this.field3219[var3] = (this.field3219[var3] & 16256) + var5;
			}

			if (var4 == 101) { // L: 358
				this.field3219[var3] = (var5 << 7) + (this.field3219[var3] & 127) + 16384;
			}

			if (var4 == 100) { // L: 359
				this.field3219[var3] = (this.field3219[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) { // L: 360
				this.method5207(var3);
			}

			if (var4 == 121) { // L: 361
				this.method5208(var3);
			}

			if (var4 == 123) { // L: 362
				this.method5264(var3);
			}

			int var6;
			if (var4 == 6) { // L: 363
				var6 = this.field3219[var3]; // L: 364
				if (var6 == 16384) { // L: 365
					this.field3220[var3] = (var5 << 7) + (this.field3220[var3] & -16257);
				}
			}

			if (var4 == 38) { // L: 367
				var6 = this.field3219[var3]; // L: 368
				if (var6 == 16384) { // L: 369
					this.field3220[var3] = var5 + (this.field3220[var3] & -128);
				}
			}

			if (var4 == 16) { // L: 371
				this.field3221[var3] = (var5 << 7) + (this.field3221[var3] & -16257);
			}

			if (var4 == 48) { // L: 372
				this.field3221[var3] = var5 + (this.field3221[var3] & -128);
			}

			if (var4 == 81) { // L: 373
				if (var5 >= 64) { // L: 374
					var10000 = this.field3223;
					var10000[var3] |= 4;
				} else {
					this.method5212(var3); // L: 376
					var10000 = this.field3223; // L: 377
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) { // L: 380
				this.method5214(var3, (var5 << 7) + (this.field3222[var3] & -16257));
			}

			if (var4 == 49) { // L: 381
				this.method5214(var3, var5 + (this.field3222[var3] & -128));
			}

		} else if (var2 == 192) { // L: 384
			var3 = var1 & 15; // L: 385
			var4 = var1 >> 8 & 127; // L: 386
			this.method5200(var3, var4 + this.field3224[var3]); // L: 387
		} else if (var2 == 208) { // L: 390
			var3 = var1 & 15; // L: 391
			var4 = var1 >> 8 & 127; // L: 392
			this.method5294(var3, var4); // L: 393
		} else if (var2 == 224) { // L: 396
			var3 = var1 & 15; // L: 397
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256); // L: 398
			this.method5206(var3, var4); // L: 399
		} else {
			var2 = var1 & 255; // L: 402
			if (var2 == 255) { // L: 403
				this.method5240(); // L: 404
			}
		}
	} // L: 312 320 327 382 388 394 400 405 407

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "6872"
	)
	void method5214(int var1, int var2) {
		this.field3222[var1] = var2; // L: 410
		this.field3214[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D); // L: 411
	} // L: 412

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljl;B)I",
		garbageValue = "-22"
	)
	int method5215(MusicPatchNode var1) {
		int var2 = (var1.field3273 * var1.field3272 >> 12) + var1.field3271; // L: 415
		var2 += (this.field3209[var1.field3280] - 8192) * this.field3220[var1.field3280] >> 12; // L: 416
		MusicPatchNode2 var3 = var1.field3284; // L: 417
		int var4;
		if (var3.field3193 > 0 && (var3.field3194 > 0 || this.field3218[var1.field3280] > 0)) { // L: 418
			var4 = var3.field3194 << 2; // L: 419
			int var5 = var3.field3196 << 1; // L: 420
			if (var1.field3268 < var5) { // L: 421
				var4 = var4 * var1.field3268 / var5;
			}

			var4 += this.field3218[var1.field3280] >> 7; // L: 422
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3279 & 511)); // L: 423
			var2 += (int)(var6 * (double)var4); // L: 424
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(class344.field4152 * -449918071) + 0.5D); // L: 426
		return var4 < 1 ? 1 : var4; // L: 427
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljl;S)I",
		garbageValue = "-22694"
	)
	int method5216(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3284; // L: 431
		int var3 = this.field3210[var1.field3280] * this.field3228[var1.field3280] + 4096 >> 13; // L: 432
		var3 = var3 * var3 + 16384 >> 15; // L: 433
		var3 = var3 * var1.field3269 + 16384 >> 15; // L: 434
		var3 = var3 * this.field3206 + 128 >> 8; // L: 435
		if (var2.field3190 > 0) { // L: 436
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3190 * (double)var1.field3263 * 1.953125E-5D) + 0.5D); // L: 437
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3189 != null) { // L: 439
			var4 = var1.field3275; // L: 440
			var5 = var2.field3189[var1.field3276 * 4 + 1]; // L: 441
			if (var1.field3276 * 4 < var2.field3189.length - 2) { // L: 442
				var6 = (var2.field3189[var1.field3276 * 4] & 255) << 8; // L: 443
				var7 = (var2.field3189[var1.field3276 * 4 + 2] & 255) << 8; // L: 444
				var5 += (var4 - var6) * (var2.field3189[var1.field3276 * 4 + 3] - var5) / (var7 - var6); // L: 445
			}

			var3 = var5 * var3 + 32 >> 6; // L: 447
		}

		if (var1.field3266 > 0 && var2.field3195 != null) { // L: 449
			var4 = var1.field3266; // L: 450
			var5 = var2.field3195[var1.field3281 * 4 + 1]; // L: 451
			if (var1.field3281 * 4 < var2.field3195.length - 2) { // L: 452
				var6 = (var2.field3195[var1.field3281 * 4] & 255) << 8; // L: 453
				var7 = (var2.field3195[var1.field3281 * 4 + 2] & 255) << 8; // L: 454
				var5 += (var2.field3195[var1.field3281 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6); // L: 455
			}

			var3 = var5 * var3 + 32 >> 6; // L: 457
		}

		return var3; // L: 459
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljl;S)I",
		garbageValue = "24564"
	)
	int method5300(MusicPatchNode var1) {
		int var2 = this.field3208[var1.field3280]; // L: 463
		return var2 < 8192 ? var2 * var1.field3270 + 32 >> 6 : 16384 - ((128 - var1.field3270) * (16384 - var2) + 32 >> 6); // L: 464 465
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1086583875"
	)
	void method5223() {
		int var1 = this.track; // L: 522
		int var2 = this.trackLength; // L: 523

		long var3;
		for (var3 = this.field3231; var2 == this.trackLength; var3 = this.midiFile.method5330(var2)) { // L: 524 525 547
			while (var2 == this.midiFile.trackLengths[var1]) { // L: 526
				this.midiFile.gotoTrack(var1); // L: 527
				int var5 = this.midiFile.readMessage(var1); // L: 528
				if (var5 == 1) { // L: 529
					this.midiFile.setTrackDone(); // L: 530
					this.midiFile.markTrackPosition(var1); // L: 531
					if (this.midiFile.isDone()) { // L: 532
						if (!this.field3213 || var2 == 0) { // L: 533
							this.method5240(); // L: 537
							this.midiFile.clear(); // L: 538
							return; // L: 539
						}

						this.midiFile.reset(var3); // L: 534
					}
					break;
				}

				if ((var5 & 128) != 0) { // L: 541
					this.method5213(var5);
				}

				this.midiFile.readTrackLength(var1); // L: 542
				this.midiFile.markTrackPosition(var1); // L: 543
			}

			var1 = this.midiFile.getPrioritizedTrack(); // L: 545
			var2 = this.midiFile.trackLengths[var1]; // L: 546
		}

		this.track = var1; // L: 549
		this.trackLength = var2; // L: 550
		this.field3231 = var3; // L: 551
	} // L: 552

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljl;I)Z",
		garbageValue = "1853843219"
	)
	boolean method5224(MusicPatchNode var1) {
		if (var1.stream == null) { // L: 555
			if (var1.field3266 >= 0) { // L: 556
				var1.remove(); // L: 557
				if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) { // L: 558
					this.field3211[var1.field3280][var1.field3267] = null; // L: 559
				}
			}

			return true; // L: 562
		} else {
			return false; // L: 564
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljl;[IIII)Z",
		garbageValue = "2071249267"
	)
	boolean method5225(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3282 = class344.field4152 * -449918071 / 100; // L: 568
		if (var1.field3266 < 0 || var1.stream != null && !var1.stream.method785()) { // L: 569
			int var5 = var1.field3273; // L: 577
			if (var5 > 0) { // L: 578
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3216[var1.field3280] * 4.921259842519685E-4D) + 0.5D); // L: 579
				if (var5 < 0) { // L: 580
					var5 = 0;
				}

				var1.field3273 = var5; // L: 581
			}

			var1.stream.method808(this.method5215(var1)); // L: 583
			MusicPatchNode2 var6 = var1.field3284; // L: 584
			boolean var7 = false; // L: 585
			++var1.field3268; // L: 586
			var1.field3279 += var6.field3193; // L: 587
			double var8 = (double)((var1.field3286 - 60 << 8) + (var1.field3273 * var1.field3272 >> 12)) * 5.086263020833333E-6D; // L: 588
			if (var6.field3190 > 0) { // L: 589
				if (var6.field3188 > 0) { // L: 590
					var1.field3263 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3188 * var8) + 0.5D);
				} else {
					var1.field3263 += 128; // L: 591
				}
			}

			if (var6.field3189 != null) { // L: 593
				if (var6.field3191 > 0) { // L: 594
					var1.field3275 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3191) + 0.5D);
				} else {
					var1.field3275 += 128; // L: 595
				}

				while (var1.field3276 * 4 < var6.field3189.length - 2 && var1.field3275 > (var6.field3189[var1.field3276 * 4 + 2] & 255) << 8) { // L: 596
					var1.field3276 = var1.field3276 * 4 + 2;
				}

				if (var1.field3276 * 4 == var6.field3189.length - 2 && var6.field3189[var1.field3276 * 4 + 1] == 0) { // L: 597
					var7 = true;
				}
			}

			if (var1.field3266 >= 0 && var6.field3195 != null && (this.field3223[var1.field3280] & 1) == 0 && (var1.field3267 < 0 || var1 != this.field3211[var1.field3280][var1.field3267])) { // L: 599 600
				if (var6.field3192 > 0) { // L: 601
					var1.field3266 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3192) + 0.5D);
				} else {
					var1.field3266 += 128; // L: 602
				}

				while (var1.field3281 * 4 < var6.field3195.length - 2 && var1.field3266 > (var6.field3195[var1.field3281 * 4 + 2] & 255) << 8) { // L: 603
					var1.field3281 = var1.field3281 * 4 + 2;
				}

				if (var1.field3281 * 4 == var6.field3195.length - 2) { // L: 604
					var7 = true;
				}
			}

			if (var7) { // L: 607
				var1.stream.method782(var1.field3282); // L: 608
				if (var2 != null) { // L: 609
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4); // L: 610
				}

				if (var1.stream.method820()) { // L: 611
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method5415(); // L: 612
				if (var1.field3266 >= 0) { // L: 613
					var1.remove(); // L: 614
					if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) { // L: 615
						this.field3211[var1.field3280][var1.field3267] = null; // L: 616
					}
				}

				return true; // L: 619
			} else {
				var1.stream.method781(var1.field3282, this.method5216(var1), this.method5300(var1)); // L: 621
				return false; // L: 622
			}
		} else {
			var1.method5415(); // L: 570
			var1.remove(); // L: 571
			if (var1.field3267 > 0 && var1 == this.field3211[var1.field3280][var1.field3267]) { // L: 572
				this.field3211[var1.field3280][var1.field3267] = null; // L: 573
			}

			return true; // L: 575
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;Lls;ZLmg;I)V",
		garbageValue = "16711935"
	)
	public static void method5316(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemComposition_archive = var0; // L: 84
		ItemComposition.ItemComposition_modelArchive = var1; // L: 85
		InterfaceParent.ItemComposition_inMembersWorld = var2; // L: 86
		class144.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 87
		class137.ItemComposition_fontPlain11 = var3; // L: 88
	} // L: 89
}
