import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("j")
	static int[][][] field2489;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1019449591
	)
	int field2512;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 562676288
	)
	int field2494;
	@ObfuscatedName("p")
	int[] field2500;
	@ObfuscatedName("b")
	int[] field2492;
	@ObfuscatedName("e")
	int[] field2493;
	@ObfuscatedName("k")
	int[] field2491;
	@ObfuscatedName("g")
	int[] field2495;
	@ObfuscatedName("h")
	int[] field2505;
	@ObfuscatedName("n")
	int[] field2497;
	@ObfuscatedName("l")
	int[] field2498;
	@ObfuscatedName("m")
	int[] field2499;
	@ObfuscatedName("x")
	int[] field2516;
	@ObfuscatedName("z")
	int[] field2501;
	@ObfuscatedName("i")
	int[] field2502;
	@ObfuscatedName("a")
	int[] field2503;
	@ObfuscatedName("w")
	int[] field2488;
	@ObfuscatedName("s")
	int[] field2490;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "[[Lhj;"
	)
	MusicPatchNode[][] field2506;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "[[Lhj;"
	)
	MusicPatchNode[][] field2507;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "Lhs;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("am")
	boolean field2509;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -177178127
	)
	@Export("track")
	int track;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -97944121
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -7685461656623230769L
	)
	long field2496;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 1216058038878883829L
	)
	long field2513;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "Lhv;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2512 = 256;
		this.field2494 = -727379968;
		this.field2500 = new int[16];
		this.field2492 = new int[16];
		this.field2493 = new int[16];
		this.field2491 = new int[16];
		this.field2495 = new int[16];
		this.field2505 = new int[16];
		this.field2497 = new int[16];
		this.field2498 = new int[16];
		this.field2499 = new int[16];
		this.field2516 = new int[16];
		this.field2501 = new int[16];
		this.field2502 = new int[16];
		this.field2503 = new int[16];
		this.field2488 = new int[16];
		this.field2490 = new int[16];
		this.field2506 = new MusicPatchNode[16][128];
		this.field2507 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method3950();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2119488267"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2512 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1779220205"
	)
	public int method4018() {
		return this.field2512;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lho;Lir;Lbi;IB)Z",
		garbageValue = "2"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4154();
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

			if (!var9.method4111(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1548325300"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1457707769"
	)
	@Export("removeAll")
	public synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("g")
	protected synchronized int vmethod4124() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2494 * 1000000 / (PcmPlayer.field394 * 22050);

			do {
				long var5 = this.field2496 + (long)var3 * (long)var4;
				if (this.field2513 - var5 >= 0L) {
					this.field2496 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2513 - this.field2496) - 1L) / (long)var4);
				this.field2496 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method3934();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lho;ZI)V",
		garbageValue = "-2104011211"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2509 = var2;
		this.field2496 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2513 = this.midiFile.method4070(this.trackLength);
	}

	@ObfuscatedName("l")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2494 * 1000000 / (PcmPlayer.field394 * 22050);

			do {
				long var3 = (long)var1 * (long)var2 + this.field2496;
				if (this.field2513 - var3 >= 0L) {
					this.field2496 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2513 - this.field2496) - 1L) / (long)var2);
				this.field2496 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method3934();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1436028334"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method3950();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1133378291"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1540065246"
	)
	public synchronized void method3938(int var1, int var2) {
		this.method3939(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1211768698"
	)
	void method3939(int var1, int var2) {
		this.field2491[var1] = var2;
		this.field2505[var1] = var2 & -128;
		this.method3963(var1, var2);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1642628999"
	)
	void method3963(int var1, int var2) {
		if (var2 != this.field2495[var1]) {
			this.field2495[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2507[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIII)V",
		garbageValue = "1083924196"
	)
	void method3941(int var1, int var2, int var3) {
		this.method4017(var1, var2, 64);
		if ((this.field2516[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2554 == var1 && var4.field2561 < 0) {
					this.field2506[var1][var4.field2547] = null;
					this.field2506[var1][var2] = var4;
					int var5 = (var4.field2552 * var4.field2556 >> 12) + var4.field2555;
					var4.field2555 += var2 - var4.field2547 << 8;
					var4.field2556 = var5 - var4.field2555;
					var4.field2552 = 4096;
					var4.field2547 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2495[var1]);
		if (var9 != null) {
			RawSound var8 = var9.rawSounds[var2];
			if (var8 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2554 = var1;
				var6.patch = var9;
				var6.rawSound = var8;
				var6.field2550 = var9.field2536[var2];
				var6.field2551 = var9.field2537[var2];
				var6.field2547 = var2;
				var6.field2553 = var3 * var3 * var9.field2534[var2] * var9.field2532 + 1024 >> 11;
				var6.field2557 = var9.field2539[var2] & 255;
				var6.field2555 = (var2 << 8) - (var9.field2533[var2] & 32767);
				var6.field2568 = 0;
				var6.field2559 = 0;
				var6.field2560 = 0;
				var6.field2561 = -1;
				var6.field2562 = 0;
				if (this.field2503[var1] == 0) {
					var6.stream = RawPcmStream.method898(var8, this.method3955(var6), this.method3956(var6), this.method4032(var6));
				} else {
					var6.stream = RawPcmStream.method898(var8, this.method3955(var6), 0, this.method4032(var6));
					this.method3933(var6, var9.field2533[var2] < 0);
				}

				if (var9.field2533[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2551 >= 0) {
					MusicPatchNode var7 = this.field2507[var1][var6.field2551];
					if (var7 != null && var7.field2561 < 0) {
						this.field2506[var1][var7.field2547] = null;
						var7.field2561 = 0;
					}

					this.field2507[var1][var6.field2551] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2506[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lhj;ZI)V",
		garbageValue = "-744125730"
	)
	void method3933(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field370) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2503[var1.field2554] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method907();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2503[var1.field2554] >> 6);
		}

		var1.stream.method906(var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "41"
	)
	void method4017(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2506[var1][var2];
		if (var4 != null) {
			this.field2506[var1][var2] = null;
			if ((this.field2516[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field2554 == var4.field2554 && var5.field2561 < 0 && var4 != var5) {
						var4.field2561 = 0;
						break;
					}
				}
			} else {
				var4.field2561 = 0;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "-74"
	)
	void method3944(int var1, int var2, int var3) {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-886416554"
	)
	void method3945(int var1, int var2) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1447688346"
	)
	void method4034(int var1, int var2) {
		this.field2497[var1] = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1464923908"
	)
	void method3947(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2554 == var1) {
				if (var2.stream != null) {
					var2.stream.method920(PcmPlayer.field394 * 22050 / 100);
					if (var2.stream.method941()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4163();
				}

				if (var2.field2561 < 0) {
					this.field2506[var2.field2554][var2.field2547] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "119"
	)
	void method3948(int var1) {
		if (var1 >= 0) {
			this.field2500[var1] = 12800;
			this.field2492[var1] = 8192;
			this.field2493[var1] = 16383;
			this.field2497[var1] = 8192;
			this.field2498[var1] = 0;
			this.field2499[var1] = 8192;
			this.method3969(var1);
			this.method3999(var1);
			this.field2516[var1] = 0;
			this.field2501[var1] = 32767;
			this.field2502[var1] = 256;
			this.field2503[var1] = 0;
			this.method3967(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method3948(var1);
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1519020600"
	)
	void method3949(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2554 == var1) && var2.field2561 < 0) {
				this.field2506[var2.field2554][var2.field2547] = null;
				var2.field2561 = 0;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1718659694"
	)
	void method3950() {
		this.method3947(-1);
		this.method3948(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2495[var1] = this.field2491[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2505[var1] = this.field2491[var1] & -128;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "882944366"
	)
	void method3969(int var1) {
		if ((this.field2516[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2554 == var1 && this.field2506[var1][var2.field2547] == null && var2.field2561 < 0) {
					var2.field2561 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "6"
	)
	void method3999(int var1) {
		if ((this.field2516[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2554 == var1) {
					var2.field2567 = 0;
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "8"
	)
	void method4050(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4017(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method3941(var3, var4, var5);
			} else {
				this.method4017(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method3944(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2505[var3] = (var5 << 14) + (this.field2505[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2505[var3] = (var5 << 7) + (this.field2505[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2498[var3] = (var5 << 7) + (this.field2498[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2498[var3] = var5 + (this.field2498[var3] & -128);
			}

			if (var4 == 5) {
				this.field2499[var3] = (var5 << 7) + (this.field2499[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2499[var3] = var5 + (this.field2499[var3] & -128);
			}

			if (var4 == 7) {
				this.field2500[var3] = (var5 << 7) + (this.field2500[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2500[var3] = var5 + (this.field2500[var3] & -128);
			}

			if (var4 == 10) {
				this.field2492[var3] = (var5 << 7) + (this.field2492[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2492[var3] = var5 + (this.field2492[var3] & -128);
			}

			if (var4 == 11) {
				this.field2493[var3] = (var5 << 7) + (this.field2493[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2493[var3] = var5 + (this.field2493[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2516;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2516;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2516;
					var10000[var3] |= 2;
				} else {
					this.method3969(var3);
					var10000 = this.field2516;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2501[var3] = (var5 << 7) + (this.field2501[var3] & 127);
			}

			if (var4 == 98) {
				this.field2501[var3] = (this.field2501[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2501[var3] = (var5 << 7) + (this.field2501[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2501[var3] = (this.field2501[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method3947(var3);
			}

			if (var4 == 121) {
				this.method3948(var3);
			}

			if (var4 == 123) {
				this.method3949(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2501[var3];
				if (var6 == 16384) {
					this.field2502[var3] = (var5 << 7) + (this.field2502[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2501[var3];
				if (var6 == 16384) {
					this.field2502[var3] = var5 + (this.field2502[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2503[var3] = (var5 << 7) + (this.field2503[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2503[var3] = var5 + (this.field2503[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2516;
					var10000[var3] |= 4;
				} else {
					this.method3999(var3);
					var10000 = this.field2516;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method3967(var3, (var5 << 7) + (this.field2488[var3] & -16257));
			}

			if (var4 == 49) {
				this.method3967(var3, var5 + (this.field2488[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3963(var3, var4 + this.field2505[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method3945(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4034(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method3950();
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "26"
	)
	void method3967(int var1, int var2) {
		this.field2488[var1] = var2;
		this.field2490[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Lhj;I)I",
		garbageValue = "519117207"
	)
	int method3955(MusicPatchNode var1) {
		int var2 = (var1.field2552 * var1.field2556 >> 12) + var1.field2555;
		var2 += (this.field2497[var1.field2554] - 8192) * this.field2502[var1.field2554] >> 12;
		MusicPatchNode2 var3 = var1.field2550;
		int var4;
		if (var3.field2474 > 0 && (var3.field2473 > 0 || this.field2498[var1.field2554] > 0)) {
			var4 = var3.field2473 << 2;
			int var5 = var3.field2468 << 1;
			if (var1.field2563 < var5) {
				var4 = var4 * var1.field2563 / var5;
			}

			var4 += this.field2498[var1.field2554] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2564 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(PcmPlayer.field394 * 22050) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(Lhj;I)I",
		garbageValue = "1024887560"
	)
	int method3956(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2550;
		int var3 = this.field2500[var1.field2554] * this.field2493[var1.field2554] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2553 + 16384 >> 15;
		var3 = var3 * this.field2512 + 128 >> 8;
		if (var2.field2469 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2469 * 1.953125E-5D * (double)var1.field2568) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2470 != null) {
			var4 = var1.field2559;
			var5 = var2.field2470[var1.field2560 * 2 + 1];
			if (var1.field2560 * 2 < var2.field2470.length - 2) {
				var6 = (var2.field2470[var1.field2560 * 2] & 255) << 8;
				var7 = (var2.field2470[var1.field2560 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2470[var1.field2560 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2561 > 0 && var2.field2467 != null) {
			var4 = var1.field2561;
			var5 = var2.field2467[var1.field2562 * 4 + 1];
			if (var1.field2562 * 4 < var2.field2467.length - 2) {
				var6 = (var2.field2467[var1.field2562 * 4] & 255) << 8;
				var7 = (var2.field2467[var1.field2562 * 4 + 2] & 255) << 8;
				var5 += (var2.field2467[var1.field2562 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(Lhj;I)I",
		garbageValue = "1588980488"
	)
	int method4032(MusicPatchNode var1) {
		int var2 = this.field2492[var1.field2554];
		return var2 < 8192 ? var2 * var1.field2557 + 32 >> 6 : 16384 - ((128 - var1.field2557) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1441796047"
	)
	void method3934() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2513; var2 == this.trackLength; var3 = this.midiFile.method4070(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2509 || var2 == 0) {
							this.method3950();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4050(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2513 = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Lhj;I)Z",
		garbageValue = "2136157877"
	)
	boolean method3964(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2561 >= 0) {
				var1.remove();
				if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) {
					this.field2507[var1.field2554][var1.field2551] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		signature = "(Lhj;[IIIB)Z",
		garbageValue = "75"
	)
	boolean method3965(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2566 = PcmPlayer.field394 * 22050 / 100;
		if (var1.field2561 < 0 || var1.stream != null && !var1.stream.method973()) {
			int var5 = var1.field2552;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2499[var1.field2554]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2552 = var5;
			}

			var1.stream.method912(this.method3955(var1));
			MusicPatchNode2 var6 = var1.field2550;
			boolean var7 = false;
			++var1.field2563;
			var1.field2564 += var6.field2474;
			double var8 = (double)((var1.field2547 - 60 << 8) + (var1.field2556 * var1.field2552 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2469 > 0) {
				if (var6.field2472 > 0) {
					var1.field2568 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2472) + 0.5D);
				} else {
					var1.field2568 += 128;
				}
			}

			if (var6.field2470 != null) {
				if (var6.field2475 > 0) {
					var1.field2559 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2475) + 0.5D);
				} else {
					var1.field2559 += 128;
				}

				while (var1.field2560 * 2 < var6.field2470.length - 2 && var1.field2559 > (var6.field2470[var1.field2560 * 2 + 2] & 255) << 8) {
					var1.field2560 = var1.field2560 * 4 + 4;
				}

				if (var1.field2560 * 2 == var6.field2470.length - 2 && var6.field2470[var1.field2560 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2561 >= 0 && var6.field2467 != null && (this.field2516[var1.field2554] & 1) == 0 && (var1.field2551 < 0 || var1 != this.field2507[var1.field2554][var1.field2551])) {
				if (var6.field2476 > 0) {
					var1.field2561 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2476) + 0.5D);
				} else {
					var1.field2561 += 128;
				}

				while (var1.field2562 * 4 < var6.field2467.length - 2 && var1.field2561 > (var6.field2467[var1.field2562 * 4 + 2] & 255) << 8) {
					var1.field2562 = var1.field2562 * 4 + 2;
				}

				if (var1.field2562 * 4 == var6.field2467.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method920(var1.field2566);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method941()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4163();
				if (var1.field2561 >= 0) {
					var1.remove();
					if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) {
						this.field2507[var1.field2554][var1.field2551] = null;
					}
				}

				return true;
			} else {
				var1.stream.method910(var1.field2566, this.method3956(var1), this.method4032(var1));
				return false;
			}
		} else {
			var1.method4163();
			var1.remove();
			if (var1.field2551 > 0 && var1 == this.field2507[var1.field2554][var1.field2551]) {
				this.field2507[var1.field2554][var1.field2551] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Lln;",
		garbageValue = "45"
	)
	public static PrivateChatMode method3952(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3892, PrivateChatMode.field3893, PrivateChatMode.field3891};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field3890) {
				return var4;
			}
		}

		return null;
	}
}
