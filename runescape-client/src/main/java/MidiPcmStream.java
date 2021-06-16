import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1826648467
	)
	int field2840;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2141093893
	)
	int field2841;
	@ObfuscatedName("y")
	int[] field2842;
	@ObfuscatedName("j")
	int[] field2846;
	@ObfuscatedName("o")
	int[] field2861;
	@ObfuscatedName("m")
	int[] field2847;
	@ObfuscatedName("r")
	int[] field2845;
	@ObfuscatedName("h")
	int[] field2844;
	@ObfuscatedName("d")
	int[] field2848;
	@ObfuscatedName("z")
	int[] field2849;
	@ObfuscatedName("b")
	int[] field2853;
	@ObfuscatedName("s")
	int[] field2851;
	@ObfuscatedName("p")
	int[] field2852;
	@ObfuscatedName("c")
	int[] field2850;
	@ObfuscatedName("n")
	int[] field2854;
	@ObfuscatedName("l")
	int[] field2855;
	@ObfuscatedName("w")
	int[] field2856;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2857;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lib;"
	)
	MusicPatchNode[][] field2858;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ad")
	boolean field2839;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1423807839
	)
	@Export("track")
	int track;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 414893157
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 8042341810818492123L
	)
	long field2863;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 7751692967903643467L
	)
	long field2864;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2840 = 256;
		this.field2841 = 1000000;
		this.field2842 = new int[16];
		this.field2846 = new int[16];
		this.field2861 = new int[16];
		this.field2847 = new int[16];
		this.field2845 = new int[16];
		this.field2844 = new int[16];
		this.field2848 = new int[16];
		this.field2849 = new int[16];
		this.field2853 = new int[16];
		this.field2851 = new int[16];
		this.field2852 = new int[16];
		this.field2850 = new int[16];
		this.field2854 = new int[16];
		this.field2855 = new int[16];
		this.field2856 = new int[16];
		this.field2857 = new MusicPatchNode[16][128];
		this.field2858 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4575();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "56"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2840 = var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method4660() {
		return this.field2840;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lio;Ljp;Lbz;II)Z",
		garbageValue = "-673775951"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4771();
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

			if (!var9.method4731(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1280921587"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "787769784"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("r")
	protected synchronized int vmethod4740() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2841 * -727379968 / class341.field3921;

			do {
				long var5 = (long)var3 * (long)var4 + this.field2863;
				if (this.field2864 - var5 >= 0L) {
					this.field2863 = var5;
					break;
				}

				int var7 = (int)((this.field2864 - this.field2863 + (long)var4 - 1L) / (long)var4);
				this.field2863 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4588();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lio;ZI)V",
		garbageValue = "-2021811263"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2839 = var2;
		this.field2863 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2864 = this.midiFile.method4710(this.trackLength);
	}

	@ObfuscatedName("z")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2841 * -727379968 / class341.field3921;

			do {
				long var3 = (long)var1 * (long)var2 + this.field2863;
				if (this.field2864 - var3 >= 0L) {
					this.field2863 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2864 - this.field2863) - 1L) / (long)var2);
				this.field2863 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4588();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	@Export("clear")
	synchronized void clear() {
		this.midiFile.clear();
		this.method4575();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1843453272"
	)
	@Export("isReady")
	synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "42"
	)
	public synchronized void method4563(int var1, int var2) {
		this.method4564(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-70"
	)
	void method4564(int var1, int var2) {
		this.field2847[var1] = var2;
		this.field2844[var1] = var2 & -128;
		this.method4574(var1, var2);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1581669707"
	)
	void method4574(int var1, int var2) {
		if (var2 != this.field2845[var1]) {
			this.field2845[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2858[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1801299833"
	)
	void method4566(int var1, int var2, int var3) {
		this.method4666(var1, var2, 64);
		if ((this.field2851[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2898 == var1 && var4.field2903 < 0) {
					this.field2857[var1][var4.field2910] = null;
					this.field2857[var1][var2] = var4;
					int var8 = (var4.field2914 * var4.field2901 >> 12) + var4.field2907;
					var4.field2907 += var2 - var4.field2910 << 8;
					var4.field2901 = var8 - var4.field2907;
					var4.field2914 = 4096;
					var4.field2910 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2845[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2898 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2904 = var9.field2884[var2];
				var6.field2897 = var9.field2886[var2];
				var6.field2910 = var2;
				var6.field2900 = var3 * var3 * var9.field2883[var2] * var9.field2885 + 1024 >> 11;
				var6.field2902 = var9.field2880[var2] & 255;
				var6.field2907 = (var2 << 8) - (var9.field2882[var2] & 32767);
				var6.field2894 = 0;
				var6.field2906 = 0;
				var6.field2905 = 0;
				var6.field2903 = -1;
				var6.field2909 = 0;
				if (this.field2854[var1] == 0) {
					var6.stream = RawPcmStream.method937(var5, this.method4632(var6), this.method4581(var6), this.method4650(var6));
				} else {
					var6.stream = RawPcmStream.method937(var5, this.method4632(var6), 0, this.method4650(var6));
					this.method4567(var6, var9.field2882[var2] < 0);
				}

				if (var9.field2882[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2897 >= 0) {
					MusicPatchNode var7 = this.field2858[var1][var6.field2897];
					if (var7 != null && var7.field2903 < 0) {
						this.field2857[var1][var7.field2910] = null;
						var7.field2903 = 0;
					}

					this.field2858[var1][var6.field2897] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2857[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;ZI)V",
		garbageValue = "1606151244"
	)
	void method4567(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field380) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2854[var1.field2898] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method941();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2854[var1.field2898] >> 6);
		}

		var1.stream.method950(var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1927529539"
	)
	void method4666(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2857[var1][var2];
		if (var4 != null) {
			this.field2857[var1][var2] = null;
			if ((this.field2851[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2898 == var5.field2898 && var5.field2903 < 0 && var5 != var4) {
						var4.field2903 = 0;
						break;
					}
				}
			} else {
				var4.field2903 = 0;
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2002263313"
	)
	void method4569(int var1, int var2, int var3) {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-459034632"
	)
	void method4568(int var1, int var2) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1249872896"
	)
	void method4571(int var1, int var2) {
		this.field2848[var1] = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-353606321"
	)
	void method4572(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2898 == var1) {
				if (var2.stream != null) {
					var2.stream.method955(class341.field3921 / 100);
					if (var2.stream.method959()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4772();
				}

				if (var2.field2903 < 0) {
					this.field2857[var2.field2898][var2.field2910] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "905785527"
	)
	void method4573(int var1) {
		if (var1 >= 0) {
			this.field2842[var1] = 12800;
			this.field2846[var1] = 8192;
			this.field2861[var1] = 16383;
			this.field2848[var1] = 8192;
			this.field2849[var1] = 0;
			this.field2853[var1] = 8192;
			this.method4649(var1);
			this.method4617(var1);
			this.field2851[var1] = 0;
			this.field2852[var1] = 32767;
			this.field2850[var1] = 256;
			this.field2854[var1] = 0;
			this.method4579(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4573(var1);
			}

		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "133609518"
	)
	void method4644(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2898 == var1) && var2.field2903 < 0) {
				this.field2857[var2.field2898][var2.field2910] = null;
				var2.field2903 = 0;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2004654152"
	)
	void method4575() {
		this.method4572(-1);
		this.method4573(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2845[var1] = this.field2847[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2844[var1] = this.field2847[var1] & -128;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2122126750"
	)
	void method4649(int var1) {
		if ((this.field2851[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2898 == var1 && this.field2857[var1][var2.field2910] == null && var2.field2903 < 0) {
					var2.field2903 = 0;
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1304197009"
	)
	void method4617(int var1) {
		if ((this.field2851[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2898 == var1) {
					var2.field2899 = 0;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1402753770"
	)
	void method4578(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4666(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4566(var3, var4, var5);
			} else {
				this.method4666(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4569(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2844[var3] = (var5 << 14) + (this.field2844[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2849[var3] = (var5 << 7) + (this.field2849[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2849[var3] = var5 + (this.field2849[var3] & -128);
			}

			if (var4 == 5) {
				this.field2853[var3] = (var5 << 7) + (this.field2853[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2853[var3] = var5 + (this.field2853[var3] & -128);
			}

			if (var4 == 7) {
				this.field2842[var3] = (var5 << 7) + (this.field2842[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2842[var3] = var5 + (this.field2842[var3] & -128);
			}

			if (var4 == 10) {
				this.field2846[var3] = (var5 << 7) + (this.field2846[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2846[var3] = var5 + (this.field2846[var3] & -128);
			}

			if (var4 == 11) {
				this.field2861[var3] = (var5 << 7) + (this.field2861[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2861[var3] = var5 + (this.field2861[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2851;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2851;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2851;
					var10000[var3] |= 2;
				} else {
					this.method4649(var3);
					var10000 = this.field2851;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & 127);
			}

			if (var4 == 98) {
				this.field2852[var3] = (this.field2852[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2852[var3] = (this.field2852[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4572(var3);
			}

			if (var4 == 121) {
				this.method4573(var3);
			}

			if (var4 == 123) {
				this.method4644(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2852[var3];
				if (var6 == 16384) {
					this.field2850[var3] = (var5 << 7) + (this.field2850[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2852[var3];
				if (var6 == 16384) {
					this.field2850[var3] = var5 + (this.field2850[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2854[var3] = (var5 << 7) + (this.field2854[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2854[var3] = var5 + (this.field2854[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2851;
					var10000[var3] |= 4;
				} else {
					this.method4617(var3);
					var10000 = this.field2851;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4579(var3, (var5 << 7) + (this.field2855[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4579(var3, var5 + (this.field2855[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4574(var3, var4 + this.field2844[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4568(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4571(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4575();
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-264828177"
	)
	void method4579(int var1, int var2) {
		this.field2855[var1] = var2;
		this.field2856[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "627320861"
	)
	int method4632(MusicPatchNode var1) {
		int var2 = (var1.field2914 * var1.field2901 >> 12) + var1.field2907;
		var2 += (this.field2848[var1.field2898] - 8192) * this.field2850[var1.field2898] >> 12;
		MusicPatchNode2 var3 = var1.field2904;
		int var4;
		if (var3.field2827 > 0 && (var3.field2826 > 0 || this.field2849[var1.field2898] > 0)) {
			var4 = var3.field2826 << 2;
			int var5 = var3.field2829 << 1;
			if (var1.field2908 < var5) {
				var4 = var4 * var1.field2908 / var5;
			}

			var4 += this.field2849[var1.field2898] >> 7;
			double var6 = Math.sin((double)(var1.field2911 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)class341.field3921 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "-1286368221"
	)
	int method4581(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2904;
		int var3 = this.field2842[var1.field2898] * this.field2861[var1.field2898] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2900 + 16384 >> 15;
		var3 = var3 * this.field2840 + 128 >> 8;
		if (var2.field2823 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2823 * 1.953125E-5D * (double)var1.field2894) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2821 != null) {
			var4 = var1.field2906;
			var5 = var2.field2821[var1.field2905 * 4 + 1];
			if (var1.field2905 * 4 < var2.field2821.length - 2) {
				var6 = (var2.field2821[var1.field2905 * 4] & 255) << 8;
				var7 = (var2.field2821[var1.field2905 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2821[var1.field2905 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2903 > 0 && var2.field2828 != null) {
			var4 = var1.field2903;
			var5 = var2.field2828[var1.field2909 * 2 + 1];
			if (var1.field2909 * 2 < var2.field2828.length - 2) {
				var6 = (var2.field2828[var1.field2909 * 2] & 255) << 8;
				var7 = (var2.field2828[var1.field2909 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2828[var1.field2909 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)I",
		garbageValue = "2045479165"
	)
	int method4650(MusicPatchNode var1) {
		int var2 = this.field2846[var1.field2898];
		return var2 < 8192 ? var2 * var1.field2902 + 32 >> 6 : 16384 - ((128 - var1.field2902) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	void method4588() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2864; var2 == this.trackLength; var3 = this.midiFile.method4710(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2839 || var2 == 0) {
							this.method4575();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4578(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2864 = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)Z",
		garbageValue = "896454021"
	)
	boolean method4589(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2903 >= 0) {
				var1.remove();
				if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) {
					this.field2858[var1.field2898][var1.field2897] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lib;[IIII)Z",
		garbageValue = "-1780917654"
	)
	boolean method4590(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2913 = class341.field3921 / 100;
		if (var1.field2903 < 0 || var1.stream != null && !var1.stream.method1065()) {
			int var5 = var1.field2914;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2853[var1.field2898] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2914 = var5;
			}

			var1.stream.method1052(this.method4632(var1));
			MusicPatchNode2 var6 = var1.field2904;
			boolean var7 = false;
			++var1.field2908;
			var1.field2911 += var6.field2827;
			double var8 = (double)((var1.field2910 - 60 << 8) + (var1.field2914 * var1.field2901 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2823 > 0) {
				if (var6.field2822 > 0) {
					var1.field2894 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2822) + 0.5D);
				} else {
					var1.field2894 += 128;
				}
			}

			if (var6.field2821 != null) {
				if (var6.field2824 > 0) {
					var1.field2906 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2824 * var8) + 0.5D);
				} else {
					var1.field2906 += 128;
				}

				while (var1.field2905 * 4 < var6.field2821.length - 2 && var1.field2906 > (var6.field2821[var1.field2905 * 4 + 2] & 255) << 8) {
					var1.field2905 = var1.field2905 * 4 + 2;
				}

				if (var1.field2905 * 4 == var6.field2821.length - 2 && var6.field2821[var1.field2905 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2903 >= 0 && var6.field2828 != null && (this.field2851[var1.field2898] & 1) == 0 && (var1.field2897 < 0 || var1 != this.field2858[var1.field2898][var1.field2897])) {
				if (var6.field2825 > 0) {
					var1.field2903 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2825 * var8) + 0.5D);
				} else {
					var1.field2903 += 128;
				}

				while (var1.field2909 * 2 < var6.field2828.length - 2 && var1.field2903 > (var6.field2828[var1.field2909 * 2 + 2] & 255) << 8) {
					var1.field2909 = var1.field2909 * 4 + 4;
				}

				if (var1.field2909 * 2 == var6.field2828.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method955(var1.field2913);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method959()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4772();
				if (var1.field2903 >= 0) {
					var1.remove();
					if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) {
						this.field2858[var1.field2898][var1.field2897] = null;
					}
				}

				return true;
			} else {
				var1.stream.method954(var1.field2913, this.method4581(var1), this.method4650(var1));
				return false;
			}
		} else {
			var1.method4772();
			var1.remove();
			if (var1.field2897 > 0 && var1 == this.field2858[var1.field2898][var1.field2897]) {
				this.field2858[var1.field2898][var1.field2897] = null;
			}

			return true;
		}
	}
}
