import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "[Llp;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1799517865
	)
	int field2458;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 269082816
	)
	int field2456;
	@ObfuscatedName("t")
	int[] field2449;
	@ObfuscatedName("i")
	int[] field2445;
	@ObfuscatedName("o")
	int[] field2446;
	@ObfuscatedName("x")
	int[] field2447;
	@ObfuscatedName("g")
	int[] field2448;
	@ObfuscatedName("m")
	int[] field2465;
	@ObfuscatedName("n")
	int[] field2450;
	@ObfuscatedName("d")
	int[] field2451;
	@ObfuscatedName("h")
	int[] field2452;
	@ObfuscatedName("j")
	int[] field2453;
	@ObfuscatedName("r")
	int[] field2454;
	@ObfuscatedName("u")
	int[] field2455;
	@ObfuscatedName("p")
	int[] field2441;
	@ObfuscatedName("b")
	int[] field2457;
	@ObfuscatedName("l")
	int[] field2442;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "[[Lhe;"
	)
	MusicPatchNode[][] field2459;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "[[Lhe;"
	)
	MusicPatchNode[][] field2460;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "Lhf;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2462;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -986851911
	)
	@Export("track")
	int track;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1235186361
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -3470294739041308975L
	)
	long field2444;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 2378753574421297803L
	)
	long field2466;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "Lhb;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2458 = 256;
		this.field2456 = -727379968;
		this.field2449 = new int[16];
		this.field2445 = new int[16];
		this.field2446 = new int[16];
		this.field2447 = new int[16];
		this.field2448 = new int[16];
		this.field2465 = new int[16];
		this.field2450 = new int[16];
		this.field2451 = new int[16];
		this.field2452 = new int[16];
		this.field2453 = new int[16];
		this.field2454 = new int[16];
		this.field2455 = new int[16];
		this.field2441 = new int[16];
		this.field2457 = new int[16];
		this.field2442 = new int[16];
		this.field2459 = new MusicPatchNode[16][128];
		this.field2460 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method3824();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "371443257"
	)
	@Export("setPcmStreamVolume")
	synchronized void setPcmStreamVolume(int var1) {
		this.field2458 = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1211509882"
	)
	int method3806() {
		return this.field2458;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lhj;Lic;Lds;IB)Z",
		garbageValue = "5"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4008();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				byte[] var11 = var2.takeFileFlat(var8);
				MusicPatch var10;
				if (var11 == null) {
					var10 = null;
				} else {
					var10 = new MusicPatch(var11);
				}

				var9 = var10;
				if (var10 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var10, (long)var8);
			}

			if (!var9.method3979(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "140866669"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1347552645"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected synchronized int vmethod3987() {
		return 0;
	}

	@ObfuscatedName("g")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2456 * 1000000 / PcmPlayer.field1447;

			do {
				long var5 = this.field2444 + (long)var4 * (long)var3;
				if (this.field2466 - var5 >= 0L) {
					this.field2444 = var5;
					break;
				}

				int var7 = (int)((this.field2466 - this.field2444 + (long)var4 - 1L) / (long)var4);
				this.field2444 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method3894();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lhj;ZI)V",
		garbageValue = "2052345707"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2462 = var2;
		this.field2444 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2466 = this.midiFile.method3942(this.trackLength);
	}

	@ObfuscatedName("n")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2456 * 1000000 / PcmPlayer.field1447;

			do {
				long var3 = (long)var2 * (long)var1 + this.field2444;
				if (this.field2466 - var3 >= 0L) {
					this.field2444 = var3;
					break;
				}

				int var5 = (int)((this.field2466 - this.field2444 + (long)var2 - 1L) / (long)var2);
				this.field2444 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method3894();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-836752904"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method3824();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1789477746"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1223302618"
	)
	public synchronized void method3813(int var1, int var2) {
		this.method3814(var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1252013432"
	)
	void method3814(int var1, int var2) {
		this.field2447[var1] = var2;
		this.field2465[var1] = var2 & -128;
		this.method3898(var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2030467233"
	)
	void method3898(int var1, int var2) {
		if (var2 != this.field2448[var1]) {
			this.field2448[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2460[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "1188319217"
	)
	void method3816(int var1, int var2, int var3) {
		this.method3847(var1, var2, 64);
		if ((this.field2453[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2484 == var1 && var4.field2483 < 0) {
					this.field2459[var1][var4.field2474] = null;
					this.field2459[var1][var2] = var4;
					int var5 = (var4.field2487 * var4.field2479 >> 12) + var4.field2477;
					var4.field2477 += var2 - var4.field2474 << 8;
					var4.field2487 = var5 - var4.field2477;
					var4.field2479 = 4096;
					var4.field2474 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2448[var1]);
		if (var9 != null) {
			RawSound var8 = var9.rawSounds[var2];
			if (var8 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2484 = var1;
				var6.patch = var9;
				var6.rawSound = var8;
				var6.field2472 = var9.field2506[var2];
				var6.field2473 = var9.field2511[var2];
				var6.field2474 = var2;
				var6.field2475 = var3 * var3 * var9.field2507[var2] * var9.field2513 + 1024 >> 11;
				var6.field2481 = var9.field2509[var2] & 255;
				var6.field2477 = (var2 << 8) - (var9.field2510[var2] & 32767);
				var6.field2480 = 0;
				var6.field2478 = 0;
				var6.field2482 = 0;
				var6.field2483 = -1;
				var6.field2489 = 0;
				if (this.field2441[var1] == 0) {
					var6.stream = RawPcmStream.method2638(var8, this.method3829(var6), this.method3830(var6), this.method3831(var6));
				} else {
					var6.stream = RawPcmStream.method2638(var8, this.method3829(var6), 0, this.method3831(var6));
					this.method3817(var6, var9.field2510[var2] < 0);
				}

				if (var9.field2510[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2473 >= 0) {
					MusicPatchNode var7 = this.field2460[var1][var6.field2473];
					if (var7 != null && var7.field2483 < 0) {
						this.field2459[var1][var7.field2474] = null;
						var7.field2483 = 0;
					}

					this.field2460[var1][var6.field2473] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2459[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(Lhe;ZI)V",
		garbageValue = "-457799331"
	)
	void method3817(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1417) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2441[var1.field2484] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method2777();
			}
		} else {
			var4 = (int)((long)this.field2441[var1.field2484] * (long)var3 >> 6);
		}

		var1.stream.method2646(var4);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIIS)V",
		garbageValue = "6369"
	)
	void method3847(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2459[var1][var2];
		if (var4 != null) {
			this.field2459[var1][var2] = null;
			if ((this.field2453[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field2484 == var4.field2484 && var5.field2483 < 0 && var4 != var5) {
						var4.field2483 = 0;
						break;
					}
				}
			} else {
				var4.field2483 = 0;
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "1803842317"
	)
	void method3818(int var1, int var2, int var3) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1018786390"
	)
	void method3856(int var1, int var2) {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "0"
	)
	void method3820(int var1, int var2) {
		this.field2450[var1] = var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1073895974"
	)
	void method3821(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2484 == var1) {
				if (var2.stream != null) {
					var2.stream.method2681(PcmPlayer.field1447 / 100);
					if (var2.stream.method2655()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method3926();
				}

				if (var2.field2483 < 0) {
					this.field2459[var2.field2484][var2.field2474] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1858394144"
	)
	void method3808(int var1) {
		if (var1 >= 0) {
			this.field2449[var1] = 12800;
			this.field2445[var1] = 8192;
			this.field2446[var1] = 16383;
			this.field2450[var1] = 8192;
			this.field2451[var1] = 0;
			this.field2452[var1] = 8192;
			this.method3834(var1);
			this.method3888(var1);
			this.field2453[var1] = 0;
			this.field2454[var1] = 32767;
			this.field2455[var1] = 256;
			this.field2441[var1] = 0;
			this.method3828(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method3808(var1);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-980197433"
	)
	void method3826(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2484 == var1) && var2.field2483 < 0) {
				this.field2459[var2.field2484][var2.field2474] = null;
				var2.field2483 = 0;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "3"
	)
	void method3824() {
		this.method3821(-1);
		this.method3808(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2448[var1] = this.field2447[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2465[var1] = this.field2447[var1] & -128;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-290917818"
	)
	void method3834(int var1) {
		if ((this.field2453[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2484 == var1 && this.field2459[var1][var2.field2474] == null && var2.field2483 < 0) {
					var2.field2483 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "30"
	)
	void method3888(int var1) {
		if ((this.field2453[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2484 == var1) {
					var2.field2486 = 0;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1286820157"
	)
	void method3827(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3847(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method3816(var3, var4, var5);
			} else {
				this.method3847(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3818(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2465[var3] = (var5 << 14) + (this.field2465[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2465[var3] = (var5 << 7) + (this.field2465[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2451[var3] = (var5 << 7) + (this.field2451[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2451[var3] = var5 + (this.field2451[var3] & -128);
			}

			if (var4 == 5) {
				this.field2452[var3] = (var5 << 7) + (this.field2452[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2452[var3] = var5 + (this.field2452[var3] & -128);
			}

			if (var4 == 7) {
				this.field2449[var3] = (var5 << 7) + (this.field2449[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2449[var3] = var5 + (this.field2449[var3] & -128);
			}

			if (var4 == 10) {
				this.field2445[var3] = (var5 << 7) + (this.field2445[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2445[var3] = var5 + (this.field2445[var3] & -128);
			}

			if (var4 == 11) {
				this.field2446[var3] = (var5 << 7) + (this.field2446[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2446[var3] = var5 + (this.field2446[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2453;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2453;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2453;
					var10000[var3] |= 2;
				} else {
					this.method3834(var3);
					var10000 = this.field2453;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2454[var3] = (var5 << 7) + (this.field2454[var3] & 127);
			}

			if (var4 == 98) {
				this.field2454[var3] = (this.field2454[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2454[var3] = (var5 << 7) + (this.field2454[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2454[var3] = (this.field2454[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method3821(var3);
			}

			if (var4 == 121) {
				this.method3808(var3);
			}

			if (var4 == 123) {
				this.method3826(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2454[var3];
				if (var6 == 16384) {
					this.field2455[var3] = (var5 << 7) + (this.field2455[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2454[var3];
				if (var6 == 16384) {
					this.field2455[var3] = var5 + (this.field2455[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2441[var3] = (var5 << 7) + (this.field2441[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2441[var3] = var5 + (this.field2441[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2453;
					var10000[var3] |= 4;
				} else {
					this.method3888(var3);
					var10000 = this.field2453;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3828(var3, (var5 << 7) + (this.field2457[var3] & -16257));
			}

			if (var4 == 49) {
				this.method3828(var3, var5 + (this.field2457[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3898(var3, var4 + this.field2465[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3856(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method3820(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method3824();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1909425318"
	)
	void method3828(int var1, int var2) {
		this.field2457[var1] = var2;
		this.field2442[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(Lhe;I)I",
		garbageValue = "2112020444"
	)
	int method3829(MusicPatchNode var1) {
		int var2 = (var1.field2479 * var1.field2487 >> 12) + var1.field2477;
		var2 += (this.field2450[var1.field2484] - 8192) * this.field2455[var1.field2484] >> 12;
		MusicPatchNode2 var3 = var1.field2472;
		int var4;
		if (var3.field2431 > 0 && (var3.field2430 > 0 || this.field2451[var1.field2484] > 0)) {
			var4 = var3.field2430 << 2;
			int var5 = var3.field2432 << 1;
			if (var1.field2485 < var5) {
				var4 = var4 * var1.field2485 / var5;
			}

			var4 += this.field2451[var1.field2484] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2469 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field1447 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(Lhe;I)I",
		garbageValue = "1971108645"
	)
	int method3830(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2472;
		int var3 = this.field2449[var1.field2484] * this.field2446[var1.field2484] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2475 + 16384 >> 15;
		var3 = var3 * this.field2458 + 128 >> 8;
		if (var2.field2425 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2425 * 1.953125E-5D * (double)(var1.field2480 * 128)) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2426 != null) {
			var4 = var1.field2478;
			var5 = var2.field2426[var1.field2482 * 2 + 1];
			if (var1.field2482 * 2 < var2.field2426.length - 2) {
				var6 = (var2.field2426[var1.field2482 * 2] & 255) << 8;
				var7 = (var2.field2426[var1.field2482 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2426[var1.field2482 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2483 > 0 && var2.field2433 != null) {
			var4 = var1.field2483;
			var5 = var2.field2433[var1.field2489 * 4 + 1];
			if (var1.field2489 * 4 < var2.field2433.length - 2) {
				var6 = (var2.field2433[var1.field2489 * 4] & 255) << 8;
				var7 = (var2.field2433[var1.field2489 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2433[var1.field2489 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(Lhe;I)I",
		garbageValue = "1180870566"
	)
	int method3831(MusicPatchNode var1) {
		int var2 = this.field2445[var1.field2484];
		return var2 < 8192 ? var2 * var1.field2481 + 32 >> 6 : 16384 - ((128 - var1.field2481) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1881987389"
	)
	void method3894() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2466; var2 == this.trackLength; var3 = this.midiFile.method3942(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2462 || var2 == 0) {
							this.method3824();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method3827(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2466 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(Lhe;I)Z",
		garbageValue = "1071340203"
	)
	boolean method3838(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2483 >= 0) {
				var1.remove();
				if (var1.field2473 > 0 && var1 == this.field2460[var1.field2484][var1.field2473]) {
					this.field2460[var1.field2484][var1.field2473] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Lhe;[IIII)Z",
		garbageValue = "648141605"
	)
	boolean method3839(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2488 = PcmPlayer.field1447 / 100;
		if (var1.field2483 < 0 || var1.stream != null && !var1.stream.method2654()) {
			int var5 = var1.field2479;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2452[var1.field2484]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2479 = var5;
			}

			var1.stream.method2652(this.method3829(var1));
			MusicPatchNode2 var6 = var1.field2472;
			boolean var7 = false;
			++var1.field2485;
			var1.field2469 += var6.field2431;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2474 - 60 << 8) + (var1.field2487 * var1.field2479 >> 12));
			if (var6.field2425 > 0) {
				if (var6.field2429 > 0) {
					var1.field2480 = var1.field2480 * 1721516032 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2429) + 0.5D) * -556976000;
				} else {
					var1.field2480 = var1.field2480 * 1721516032 + 1721516032;
				}
			}

			if (var6.field2426 != null) {
				if (var6.field2427 > 0) {
					var1.field2478 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2427 * var8) + 0.5D);
				} else {
					var1.field2478 += 128;
				}

				while (var1.field2482 * 2 < var6.field2426.length - 2 && var1.field2478 > (var6.field2426[var1.field2482 * 2 + 2] & 255) << 8) {
					var1.field2482 = var1.field2482 * 4 + 4;
				}

				if (var1.field2482 * 2 == var6.field2426.length - 2 && var6.field2426[var1.field2482 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2483 >= 0 && var6.field2433 != null && (this.field2453[var1.field2484] & 1) == 0 && (var1.field2473 < 0 || var1 != this.field2460[var1.field2484][var1.field2473])) {
				if (var6.field2428 > 0) {
					var1.field2483 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2428) + 0.5D);
				} else {
					var1.field2483 += 128;
				}

				while (var1.field2489 * 4 < var6.field2433.length - 2 && var1.field2483 > (var6.field2433[var1.field2489 * 4 + 2] & 255) << 8) {
					var1.field2489 = var1.field2489 * 4 + 2;
				}

				if (var1.field2489 * 4 == var6.field2433.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method2681(var1.field2488);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method2655()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method3926();
				if (var1.field2483 >= 0) {
					var1.remove();
					if (var1.field2473 > 0 && var1 == this.field2460[var1.field2484][var1.field2473]) {
						this.field2460[var1.field2484][var1.field2473] = null;
					}
				}

				return true;
			} else {
				var1.stream.method2650(var1.field2488, this.method3830(var1), this.method3831(var1));
				return false;
			}
		} else {
			var1.method3926();
			var1.remove();
			if (var1.field2473 > 0 && var1 == this.field2460[var1.field2484][var1.field2473]) {
				this.field2460[var1.field2484][var1.field2473] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Ljg;",
		garbageValue = "-2143531135"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1815090828"
	)
	static void method3920() {
		Tiles.Tiles_minPlane = 99;
		Tiles.field528 = new byte[4][104][104];
		Tiles.field521 = new byte[4][104][104];
		class297.field3668 = new byte[4][104][104];
		class171.field2049 = new byte[4][104][104];
		class204.field2421 = new int[4][105][105];
		class22.field122 = new byte[4][105][105];
		class39.field282 = new int[105][105];
		Tiles.Tiles_hue = new int[104];
		Tiles.Tiles_saturation = new int[104];
		WorldMapRectangle.Tiles_lightness = new int[104];
		WorldMapScaleHandler.Tiles_hueMultiplier = new int[104];
		class60.field453 = new int[104];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-1830398004"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
