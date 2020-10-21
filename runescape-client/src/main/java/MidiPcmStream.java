import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -50885851
	)
	int field2440;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 588111065
	)
	int field2446;
	@ObfuscatedName("m")
	int[] field2438;
	@ObfuscatedName("z")
	int[] field2448;
	@ObfuscatedName("q")
	int[] field2450;
	@ObfuscatedName("k")
	int[] field2462;
	@ObfuscatedName("c")
	int[] field2442;
	@ObfuscatedName("u")
	int[] field2459;
	@ObfuscatedName("t")
	int[] field2435;
	@ObfuscatedName("e")
	int[] field2436;
	@ObfuscatedName("o")
	int[] field2444;
	@ObfuscatedName("w")
	int[] field2449;
	@ObfuscatedName("v")
	int[] field2441;
	@ObfuscatedName("d")
	int[] field2451;
	@ObfuscatedName("a")
	int[] field2452;
	@ObfuscatedName("g")
	int[] field2453;
	@ObfuscatedName("h")
	int[] field2454;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "[[Lhl;"
	)
	MusicPatchNode[][] field2455;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "[[Lhl;"
	)
	MusicPatchNode[][] field2456;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "Lhy;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2458;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 236042269
	)
	@Export("track")
	int track;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -813288527
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 4033442646314588215L
	)
	long field2461;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 5989401490553660197L
	)
	long field2445;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "Lhz;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2440 = 256;
		this.field2446 = 1000000;
		this.field2438 = new int[16];
		this.field2448 = new int[16];
		this.field2450 = new int[16];
		this.field2462 = new int[16];
		this.field2442 = new int[16];
		this.field2459 = new int[16];
		this.field2435 = new int[16];
		this.field2436 = new int[16];
		this.field2444 = new int[16];
		this.field2449 = new int[16];
		this.field2441 = new int[16];
		this.field2451 = new int[16];
		this.field2452 = new int[16];
		this.field2453 = new int[16];
		this.field2454 = new int[16];
		this.field2455 = new MusicPatchNode[16][128];
		this.field2456 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method3875();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1236957115"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2440 = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1869146108"
	)
	public int method3856() {
		return this.field2440;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lhj;Liw;Lds;II)Z",
		garbageValue = "-577987969"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4061();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = UserComparator4.method3497(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4026(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1712766376"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1913865181"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("c")
	protected synchronized int vmethod4043() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2446 * -727379968 / PcmPlayer.field1442;

			do {
				long var5 = this.field2461 + (long)var4 * (long)var3;
				if (this.field2445 - var5 >= 0L) {
					this.field2461 = var5;
					break;
				}

				int var7 = (int)((this.field2445 - this.field2461 + (long)var4 - 1L) / (long)var4);
				this.field2461 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method3888();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lhj;ZI)V",
		garbageValue = "1794864455"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2458 = var2;
		this.field2461 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2445 = this.midiFile.method4025(this.trackLength);
	}

	@ObfuscatedName("e")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2446 * -727379968 / PcmPlayer.field1442;

			do {
				long var3 = this.field2461 + (long)var1 * (long)var2;
				if (this.field2445 - var3 >= 0L) {
					this.field2461 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2445 - this.field2461) - 1L) / (long)var2);
				this.field2461 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method3888();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "100"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method3875();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1819990348"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "11"
	)
	public synchronized void method3863(int var1, int var2) {
		this.method3915(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIS)V",
		garbageValue = "-20747"
	)
	void method3915(int var1, int var2) {
		this.field2462[var1] = var2;
		this.field2459[var1] = var2 & -128;
		this.method3929(var1, var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-313859079"
	)
	void method3929(int var1, int var2) {
		if (var2 != this.field2442[var1]) {
			this.field2442[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2456[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-384310039"
	)
	void method3866(int var1, int var2, int var3) {
		this.method3913(var1, var2, 64);
		if ((this.field2449[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2479 == var1 && var4.field2473 < 0) {
					this.field2455[var1][var4.field2466] = null;
					this.field2455[var1][var2] = var4;
					int var5 = (var4.field2470 * var4.field2474 >> 12) + var4.field2472;
					var4.field2472 += var2 - var4.field2466 << 8;
					var4.field2470 = var5 - var4.field2472;
					var4.field2474 = 4096;
					var4.field2466 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2442[var1]);
		if (var9 != null) {
			RawSound var8 = var9.rawSounds[var2];
			if (var8 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2479 = var1;
				var6.patch = var9;
				var6.rawSound = var8;
				var6.field2464 = var9.field2506[var2];
				var6.field2468 = var9.field2509[var2];
				var6.field2466 = var2;
				var6.field2469 = var3 * var3 * var9.field2502[var2] * var9.field2507 + 1024 >> 11;
				var6.field2465 = var9.field2505[var2] & 255;
				var6.field2472 = (var2 << 8) - (var9.field2504[var2] & 32767);
				var6.field2475 = 0;
				var6.field2476 = 0;
				var6.field2477 = 0;
				var6.field2473 = -1;
				var6.field2485 = 0;
				if (this.field2452[var1] == 0) {
					var6.stream = RawPcmStream.method2683(var8, this.method3880(var6), this.method3881(var6), this.method3882(var6));
				} else {
					var6.stream = RawPcmStream.method2683(var8, this.method3880(var6), 0, this.method3882(var6));
					this.method3867(var6, var9.field2504[var2] < 0);
				}

				if (var9.field2504[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2468 >= 0) {
					MusicPatchNode var7 = this.field2456[var1][var6.field2468];
					if (var7 != null && var7.field2473 < 0) {
						this.field2455[var1][var7.field2466] = null;
						var7.field2473 = 0;
					}

					this.field2456[var1][var6.field2468] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2455[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lhl;ZI)V",
		garbageValue = "1636095944"
	)
	void method3867(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1416) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2452[var1.field2479] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method2788();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2452[var1.field2479] >> 6);
		}

		var1.stream.method2682(var4);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "-722165372"
	)
	void method3913(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2455[var1][var2];
		if (var4 != null) {
			this.field2455[var1][var2] = null;
			if ((this.field2449[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2479 == var5.field2479 && var5.field2473 < 0 && var5 != var4) {
						var4.field2473 = 0;
						break;
					}
				}
			} else {
				var4.field2473 = 0;
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "121"
	)
	void method3897(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1674175932"
	)
	void method3870(int var1, int var2) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1933284003"
	)
	void method3854(int var1, int var2) {
		this.field2435[var1] = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-406448805"
	)
	void method3909(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2479 == var1) {
				if (var2.stream != null) {
					var2.stream.method2687(PcmPlayer.field1442 / 100);
					if (var2.stream.method2786()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3971();
				}

				if (var2.field2473 < 0) {
					this.field2455[var2.field2479][var2.field2466] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1555645586"
	)
	void method3873(int var1) {
		if (var1 >= 0) {
			this.field2438[var1] = 12800;
			this.field2448[var1] = 8192;
			this.field2450[var1] = 16383;
			this.field2435[var1] = 8192;
			this.field2436[var1] = 0;
			this.field2444[var1] = 8192;
			this.method3876(var1);
			this.method3896(var1);
			this.field2449[var1] = 0;
			this.field2441[var1] = 32767;
			this.field2451[var1] = 256;
			this.field2452[var1] = 0;
			this.method3879(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method3873(var1);
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1324388853"
	)
	void method3874(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2479 == var1) && var2.field2473 < 0) {
				this.field2455[var2.field2479][var2.field2466] = null;
				var2.field2473 = 0;
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1070781239"
	)
	void method3875() {
		this.method3909(-1);
		this.method3873(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2442[var1] = this.field2462[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2459[var1] = this.field2462[var1] & -128;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-394347948"
	)
	void method3876(int var1) {
		if ((this.field2449[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2479 == var1 && this.field2455[var1][var2.field2466] == null && var2.field2473 < 0) {
					var2.field2473 = 0;
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-121"
	)
	void method3896(int var1) {
		if ((this.field2449[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2479 == var1) {
					var2.field2484 = 0;
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "0"
	)
	void method3908(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3913(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method3866(var3, var4, var5);
			} else {
				this.method3913(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3897(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2459[var3] = (var5 << 14) + (this.field2459[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2459[var3] = (var5 << 7) + (this.field2459[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2436[var3] = (var5 << 7) + (this.field2436[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2436[var3] = var5 + (this.field2436[var3] & -128);
			}

			if (var4 == 5) {
				this.field2444[var3] = (var5 << 7) + (this.field2444[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2444[var3] = var5 + (this.field2444[var3] & -128);
			}

			if (var4 == 7) {
				this.field2438[var3] = (var5 << 7) + (this.field2438[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2438[var3] = var5 + (this.field2438[var3] & -128);
			}

			if (var4 == 10) {
				this.field2448[var3] = (var5 << 7) + (this.field2448[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2448[var3] = var5 + (this.field2448[var3] & -128);
			}

			if (var4 == 11) {
				this.field2450[var3] = (var5 << 7) + (this.field2450[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2450[var3] = var5 + (this.field2450[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2449;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2449;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2449;
					var10000[var3] |= 2;
				} else {
					this.method3876(var3);
					var10000 = this.field2449;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2441[var3] = (var5 << 7) + (this.field2441[var3] & 127);
			}

			if (var4 == 98) {
				this.field2441[var3] = (this.field2441[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2441[var3] = (var5 << 7) + (this.field2441[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2441[var3] = (this.field2441[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method3909(var3);
			}

			if (var4 == 121) {
				this.method3873(var3);
			}

			if (var4 == 123) {
				this.method3874(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2441[var3];
				if (var6 == 16384) {
					this.field2451[var3] = (var5 << 7) + (this.field2451[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2441[var3];
				if (var6 == 16384) {
					this.field2451[var3] = var5 + (this.field2451[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2452[var3] = (var5 << 7) + (this.field2452[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2452[var3] = var5 + (this.field2452[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2449;
					var10000[var3] |= 4;
				} else {
					this.method3896(var3);
					var10000 = this.field2449;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3879(var3, (var5 << 7) + (this.field2453[var3] & -16257));
			}

			if (var4 == 49) {
				this.method3879(var3, var5 + (this.field2453[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3929(var3, var4 + this.field2459[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3870(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method3854(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method3875();
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1675086749"
	)
	void method3879(int var1, int var2) {
		this.field2453[var1] = var2;
		this.field2454[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(Lhl;B)I",
		garbageValue = "12"
	)
	int method3880(MusicPatchNode var1) {
		int var2 = (var1.field2474 * var1.field2470 >> 12) + var1.field2472;
		var2 += (this.field2435[var1.field2479] - 8192) * this.field2451[var1.field2479] >> 12;
		MusicPatchNode2 var3 = var1.field2464;
		int var4;
		if (var3.field2424 > 0 && (var3.field2418 > 0 || this.field2436[var1.field2479] > 0)) {
			var4 = var3.field2418 << 2;
			int var5 = var3.field2425 << 1;
			if (var1.field2480 < var5) {
				var4 = var4 * var1.field2480 / var5;
			}

			var4 += this.field2436[var1.field2479] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2467 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field1442 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(Lhl;I)I",
		garbageValue = "1185861696"
	)
	int method3881(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2464;
		int var3 = this.field2438[var1.field2479] * this.field2450[var1.field2479] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2469 + 16384 >> 15;
		var3 = var3 * this.field2440 + 128 >> 8;
		if (var2.field2419 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field2475 * (double)var2.field2419) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2423 != null) {
			var4 = var1.field2476;
			var5 = var2.field2423[var1.field2477 * 4 + 1];
			if (var1.field2477 * 4 < var2.field2423.length - 2) {
				var6 = (var2.field2423[var1.field2477 * 4] & 255) << 8;
				var7 = (var2.field2423[var1.field2477 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2423[var1.field2477 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2473 > 0 && var2.field2426 != null) {
			var4 = var1.field2473;
			var5 = var2.field2426[var1.field2485 * 4 + 1];
			if (var1.field2485 * 4 < var2.field2426.length - 2) {
				var6 = (var2.field2426[var1.field2485 * 4] & 255) << 8;
				var7 = (var2.field2426[var1.field2485 * 4 + 2] & 255) << 8;
				var5 += (var2.field2426[var1.field2485 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(Lhl;B)I",
		garbageValue = "-20"
	)
	int method3882(MusicPatchNode var1) {
		int var2 = this.field2448[var1.field2479];
		return var2 < 8192 ? var2 * var1.field2465 + 32 >> 6 : 16384 - ((128 - var1.field2465) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "74"
	)
	void method3888() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2445; var2 == this.trackLength; var3 = this.midiFile.method4025(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2458 || var2 == 0) {
							this.method3875();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method3908(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2445 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(Lhl;I)Z",
		garbageValue = "1703844968"
	)
	boolean method3889(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2473 >= 0) {
				var1.remove();
				if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) {
					this.field2456[var1.field2479][var1.field2468] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(Lhl;[IIIB)Z",
		garbageValue = "-77"
	)
	boolean method3877(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2483 = PcmPlayer.field1442 / 100;
		if (var1.field2473 < 0 || var1.stream != null && !var1.stream.method2690()) {
			int var5 = var1.field2474;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2444[var1.field2479] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2474 = var5;
			}

			var1.stream.method2733(this.method3880(var1));
			MusicPatchNode2 var6 = var1.field2464;
			boolean var7 = false;
			++var1.field2480;
			var1.field2467 += var6.field2424;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2466 - 60 << 8) + (var1.field2470 * var1.field2474 >> 12));
			if (var6.field2419 > 0) {
				if (var6.field2422 > 0) {
					var1.field2475 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2422 * var8) + 0.5D);
				} else {
					var1.field2475 += 128;
				}
			}

			if (var6.field2423 != null) {
				if (var6.field2420 > 0) {
					var1.field2476 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2420) + 0.5D);
				} else {
					var1.field2476 += 128;
				}

				while (var1.field2477 * 4 < var6.field2423.length - 2 && var1.field2476 > (var6.field2423[var1.field2477 * 4 + 2] & 255) << 8) {
					var1.field2477 = var1.field2477 * 4 + 2;
				}

				if (var1.field2477 * 4 == var6.field2423.length - 2 && var6.field2423[var1.field2477 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2473 >= 0 && var6.field2426 != null && (this.field2449[var1.field2479] & 1) == 0 && (var1.field2468 < 0 || var1 != this.field2456[var1.field2479][var1.field2468])) {
				if (var6.field2421 > 0) {
					var1.field2473 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2421) + 0.5D);
				} else {
					var1.field2473 += 128;
				}

				while (var1.field2485 * 4 < var6.field2426.length - 2 && var1.field2473 > (var6.field2426[var1.field2485 * 4 + 2] & 255) << 8) {
					var1.field2485 = var1.field2485 * 4 + 2;
				}

				if (var1.field2485 * 4 == var6.field2426.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method2687(var1.field2483);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method2786()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3971();
				if (var1.field2473 >= 0) {
					var1.remove();
					if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) {
						this.field2456[var1.field2479][var1.field2468] = null;
					}
				}

				return true;
			} else {
				var1.stream.method2686(var1.field2483, this.method3881(var1), this.method3882(var1));
				return false;
			}
		} else {
			var1.method3971();
			var1.remove();
			if (var1.field2468 > 0 && var1 == this.field2456[var1.field2479][var1.field2468]) {
				this.field2456[var1.field2479][var1.field2468] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1417043368"
	)
	public static void method3970() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}
}
