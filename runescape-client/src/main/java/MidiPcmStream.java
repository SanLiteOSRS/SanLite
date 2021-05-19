import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -721191879
	)
	int field2859;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -937356665
	)
	int field2839;
	@ObfuscatedName("g")
	int[] field2840;
	@ObfuscatedName("l")
	int[] field2847;
	@ObfuscatedName("z")
	int[] field2842;
	@ObfuscatedName("t")
	int[] field2843;
	@ObfuscatedName("v")
	int[] field2844;
	@ObfuscatedName("b")
	int[] field2845;
	@ObfuscatedName("q")
	int[] field2846;
	@ObfuscatedName("i")
	int[] field2852;
	@ObfuscatedName("x")
	int[] field2848;
	@ObfuscatedName("m")
	int[] field2853;
	@ObfuscatedName("j")
	int[] field2862;
	@ObfuscatedName("f")
	int[] field2861;
	@ObfuscatedName("s")
	int[] field2854;
	@ObfuscatedName("y")
	int[] field2855;
	@ObfuscatedName("w")
	int[] field2841;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[Liz;"
	)
	MusicPatchNode[][] field2857;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Liz;"
	)
	MusicPatchNode[][] field2858;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ao")
	boolean field2860;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 583793183
	)
	@Export("track")
	int track;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1823610323
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -5295398764407046939L
	)
	long field2863;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 8913828661084540373L
	)
	long field2864;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2859 = 256;
		this.field2839 = 1000000;
		this.field2840 = new int[16];
		this.field2847 = new int[16];
		this.field2842 = new int[16];
		this.field2843 = new int[16];
		this.field2844 = new int[16];
		this.field2845 = new int[16];
		this.field2846 = new int[16];
		this.field2852 = new int[16];
		this.field2848 = new int[16];
		this.field2853 = new int[16];
		this.field2862 = new int[16];
		this.field2861 = new int[16];
		this.field2854 = new int[16];
		this.field2855 = new int[16];
		this.field2841 = new int[16];
		this.field2857 = new MusicPatchNode[16][128];
		this.field2858 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4443();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1642106109"
	)
	@Export("setPcmStreamVolume")
	synchronized void setPcmStreamVolume(int var1) {
		this.field2859 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-189437667"
	)
	int method4370() {
		return this.field2859;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljp;Lbu;II)Z",
		garbageValue = "-945056189"
	)
	@Export("loadMusicTrack")
	synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4562();
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

			if (!var9.method4533(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1664614714"
	)
	@Export("clearAll")
	synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("v")
	protected synchronized int vmethod4560() {
		return 0;
	}

	@ObfuscatedName("b")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2839 * -727379968 / PcmPlayer.field401;

			do {
				long var5 = (long)var3 * (long)var4 + this.field2863;
				if (this.field2864 - var5 >= 0L) {
					this.field2863 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field2864 - this.field2863) - 1L) / (long)var4);
				this.field2863 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4457();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lit;ZI)V",
		garbageValue = "-1708010896"
	)
	@Export("setMusicTrack")
	synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2860 = var2;
		this.field2863 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2864 = this.midiFile.method4498(this.trackLength);
	}

	@ObfuscatedName("i")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2839 * -727379968 / PcmPlayer.field401;

			do {
				long var3 = this.field2863 + (long)var2 * (long)var1;
				if (this.field2864 - var3 >= 0L) {
					this.field2863 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2864 - this.field2863) - 1L) / (long)var2);
				this.field2863 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4457();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method4443();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "108"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1960430804"
	)
	public synchronized void method4467(int var1, int var2) {
		this.method4378(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1901698457"
	)
	void method4378(int var1, int var2) {
		this.field2843[var1] = var2;
		this.field2845[var1] = var2 & -128;
		this.method4379(var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-9"
	)
	void method4379(int var1, int var2) {
		if (var2 != this.field2844[var1]) {
			this.field2844[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2858[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1677515144"
	)
	void method4380(int var1, int var2, int var3) {
		this.method4382(var1, var2, 64);
		if ((this.field2853[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2908 == var1 && var4.field2898 < 0) {
					this.field2857[var1][var4.field2902] = null;
					this.field2857[var1][var2] = var4;
					int var8 = (var4.field2900 * var4.field2906 >> 12) + var4.field2905;
					var4.field2905 += var2 - var4.field2902 << 8;
					var4.field2906 = var8 - var4.field2905;
					var4.field2900 = 4096;
					var4.field2902 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2844[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2908 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2915 = var9.field2880[var2];
				var6.field2907 = var9.field2886[var2];
				var6.field2902 = var2;
				var6.field2903 = var3 * var3 * var9.field2888[var2] * var9.field2883 + 1024 >> 11;
				var6.field2904 = var9.field2884[var2] & 255;
				var6.field2905 = (var2 << 8) - (var9.field2881[var2] & 32767);
				var6.field2911 = 0;
				var6.field2909 = 0;
				var6.field2910 = 0;
				var6.field2898 = -1;
				var6.field2912 = 0;
				if (this.field2854[var1] == 0) {
					var6.stream = RawPcmStream.method885(var5, this.method4402(var6), this.method4395(var6), this.method4480(var6));
				} else {
					var6.stream = RawPcmStream.method885(var5, this.method4402(var6), 0, this.method4480(var6));
					this.method4430(var6, var9.field2881[var2] < 0);
				}

				if (var9.field2881[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2907 >= 0) {
					MusicPatchNode var7 = this.field2858[var1][var6.field2907];
					if (var7 != null && var7.field2898 < 0) {
						this.field2857[var1][var7.field2902] = null;
						var7.field2898 = 0;
					}

					this.field2858[var1][var6.field2907] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2857[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Liz;ZI)V",
		garbageValue = "-1985723327"
	)
	void method4430(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field381) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field2854[var1.field2908] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method959();
			}
		} else {
			var4 = (int)((long)this.field2854[var1.field2908] * (long)var3 >> 6);
		}

		var1.stream.method893(var4);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "346835095"
	)
	void method4382(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2857[var1][var2];
		if (var4 != null) {
			this.field2857[var1][var2] = null;
			if ((this.field2853[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field2908 == var4.field2908 && var5.field2898 < 0 && var5 != var4) {
						var4.field2898 = 0;
						break;
					}
				}
			} else {
				var4.field2898 = 0;
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2125411861"
	)
	void method4383(int var1, int var2, int var3) {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1228183682"
	)
	void method4384(int var1, int var2) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "58"
	)
	void method4414(int var1, int var2) {
		this.field2846[var1] = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1869660394"
	)
	void method4386(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2908 == var1) {
				if (var2.stream != null) {
					var2.stream.method898(PcmPlayer.field401 / 100);
					if (var2.stream.method902()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4575();
				}

				if (var2.field2898 < 0) {
					this.field2857[var2.field2908][var2.field2902] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2132119463"
	)
	void method4387(int var1) {
		if (var1 >= 0) {
			this.field2840[var1] = 12800;
			this.field2847[var1] = 8192;
			this.field2842[var1] = 16383;
			this.field2846[var1] = 8192;
			this.field2852[var1] = 0;
			this.field2848[var1] = 8192;
			this.method4390(var1);
			this.method4391(var1);
			this.field2853[var1] = 0;
			this.field2862[var1] = 32767;
			this.field2861[var1] = 256;
			this.field2854[var1] = 0;
			this.method4454(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4387(var1);
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "68"
	)
	void method4388(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2908 == var1) && var2.field2898 < 0) {
				this.field2857[var2.field2908][var2.field2902] = null;
				var2.field2898 = 0;
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1564118561"
	)
	void method4443() {
		this.method4386(-1);
		this.method4387(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2844[var1] = this.field2843[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2845[var1] = this.field2843[var1] & -128;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	void method4390(int var1) {
		if ((this.field2853[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2908 == var1 && this.field2857[var1][var2.field2902] == null && var2.field2898 < 0) {
					var2.field2898 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-588228357"
	)
	void method4391(int var1) {
		if ((this.field2853[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2908 == var1) {
					var2.field2917 = 0;
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "74597031"
	)
	void method4392(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4382(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4380(var3, var4, var5);
			} else {
				this.method4382(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4383(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2845[var3] = (var5 << 14) + (this.field2845[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2845[var3] = (var5 << 7) + (this.field2845[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2852[var3] = var5 + (this.field2852[var3] & -128);
			}

			if (var4 == 5) {
				this.field2848[var3] = (var5 << 7) + (this.field2848[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2848[var3] = var5 + (this.field2848[var3] & -128);
			}

			if (var4 == 7) {
				this.field2840[var3] = (var5 << 7) + (this.field2840[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2840[var3] = var5 + (this.field2840[var3] & -128);
			}

			if (var4 == 10) {
				this.field2847[var3] = (var5 << 7) + (this.field2847[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2847[var3] = var5 + (this.field2847[var3] & -128);
			}

			if (var4 == 11) {
				this.field2842[var3] = (var5 << 7) + (this.field2842[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2842[var3] = var5 + (this.field2842[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2853;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2853;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2853;
					var10000[var3] |= 2;
				} else {
					this.method4390(var3);
					var10000 = this.field2853;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2862[var3] = (var5 << 7) + (this.field2862[var3] & 127);
			}

			if (var4 == 98) {
				this.field2862[var3] = (this.field2862[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2862[var3] = (var5 << 7) + (this.field2862[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2862[var3] = (this.field2862[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4386(var3);
			}

			if (var4 == 121) {
				this.method4387(var3);
			}

			if (var4 == 123) {
				this.method4388(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2862[var3];
				if (var6 == 16384) {
					this.field2861[var3] = (var5 << 7) + (this.field2861[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2862[var3];
				if (var6 == 16384) {
					this.field2861[var3] = var5 + (this.field2861[var3] & -128);
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
					var10000 = this.field2853;
					var10000[var3] |= 4;
				} else {
					this.method4391(var3);
					var10000 = this.field2853;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4454(var3, (var5 << 7) + (this.field2855[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4454(var3, var5 + (this.field2855[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4379(var3, var4 + this.field2845[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4384(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4414(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4443();
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "49"
	)
	void method4454(int var1, int var2) {
		this.field2855[var1] = var2;
		this.field2841[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-2127783338"
	)
	int method4402(MusicPatchNode var1) {
		int var2 = (var1.field2906 * var1.field2900 >> 12) + var1.field2905;
		var2 += (this.field2846[var1.field2908] - 8192) * this.field2861[var1.field2908] >> 12;
		MusicPatchNode2 var3 = var1.field2915;
		int var4;
		if (var3.field2826 > 0 && (var3.field2824 > 0 || this.field2852[var1.field2908] > 0)) {
			var4 = var3.field2824 << 2;
			int var5 = var3.field2817 << 1;
			if (var1.field2913 < var5) {
				var4 = var4 * var1.field2913 / var5;
			}

			var4 += this.field2852[var1.field2908] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2901 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)PcmPlayer.field401 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-1764215804"
	)
	int method4395(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2915;
		int var3 = this.field2842[var1.field2908] * this.field2840[var1.field2908] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2903 + 16384 >> 15;
		var3 = var3 * this.field2859 + 128 >> 8;
		if (var2.field2825 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)(var1.field2911 * 128) * (double)var2.field2825) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2819 != null) {
			var4 = var1.field2909;
			var5 = var2.field2819[var1.field2910 * 4 + 1];
			if (var1.field2910 * 4 < var2.field2819.length - 2) {
				var6 = (var2.field2819[var1.field2910 * 4] & 255) << 8;
				var7 = (var2.field2819[var1.field2910 * 4 + 2] & 255) << 8;
				var5 += (var2.field2819[var1.field2910 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2898 > 0 && var2.field2818 != null) {
			var4 = var1.field2898;
			var5 = var2.field2818[var1.field2912 * 4 + 1];
			if (var1.field2912 * 4 < var2.field2818.length - 2) {
				var6 = (var2.field2818[var1.field2912 * 4] & 255) << 8;
				var7 = (var2.field2818[var1.field2912 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2818[var1.field2912 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)I",
		garbageValue = "-1625883404"
	)
	int method4480(MusicPatchNode var1) {
		int var2 = this.field2847[var1.field2908];
		return var2 < 8192 ? var2 * var1.field2904 + 32 >> 6 : 16384 - ((128 - var1.field2904) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1065370929"
	)
	void method4457() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2864; var2 == this.trackLength; var3 = this.midiFile.method4498(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2860 || var2 == 0) {
							this.method4443();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4392(var5);
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)Z",
		garbageValue = "-1827120522"
	)
	boolean method4403(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2898 >= 0) {
				var1.remove();
				if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) {
					this.field2858[var1.field2908][var1.field2907] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liz;[IIII)Z",
		garbageValue = "-2104430914"
	)
	boolean method4419(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2916 = PcmPlayer.field401 / 100;
		if (var1.field2898 < 0 || var1.stream != null && !var1.stream.method1004()) {
			int var5 = var1.field2900;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2848[var1.field2908]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2900 = var5;
			}

			var1.stream.method899(this.method4402(var1));
			MusicPatchNode2 var6 = var1.field2915;
			boolean var7 = false;
			++var1.field2913;
			var1.field2901 += var6.field2826;
			double var8 = (double)((var1.field2902 - 60 << 8) + (var1.field2906 * var1.field2900 >> 12)) * 5.086263020833333E-6D;
			if (var6.field2825 > 0) {
				if (var6.field2822 > 0) {
					var1.field2911 = var1.field2911 * 1645756416 + (int)(128.0D * Math.pow(2.0D, (double)var6.field2822 * var8) + 0.5D) * 1287925888;
				} else {
					var1.field2911 = var1.field2911 * 1645756416 + 1645756416;
				}
			}

			if (var6.field2819 != null) {
				if (var6.field2820 > 0) {
					var1.field2909 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2820) + 0.5D);
				} else {
					var1.field2909 += 128;
				}

				while (var1.field2910 * 4 < var6.field2819.length - 2 && var1.field2909 > (var6.field2819[var1.field2910 * 4 + 2] & 255) << 8) {
					var1.field2910 = var1.field2910 * 4 + 2;
				}

				if (var1.field2910 * 4 == var6.field2819.length - 2 && var6.field2819[var1.field2910 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2898 >= 0 && var6.field2818 != null && (this.field2853[var1.field2908] & 1) == 0 && (var1.field2907 < 0 || var1 != this.field2858[var1.field2908][var1.field2907])) {
				if (var6.field2821 > 0) {
					var1.field2898 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2821 * var8) + 0.5D);
				} else {
					var1.field2898 += 128;
				}

				while (var1.field2912 * 4 < var6.field2818.length - 2 && var1.field2898 > (var6.field2818[var1.field2912 * 4 + 2] & 255) << 8) {
					var1.field2912 = var1.field2912 * 4 + 2;
				}

				if (var1.field2912 * 4 == var6.field2818.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method898(var1.field2916);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method902()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4575();
				if (var1.field2898 >= 0) {
					var1.remove();
					if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) {
						this.field2858[var1.field2908][var1.field2907] = null;
					}
				}

				return true;
			} else {
				var1.stream.method897(var1.field2916, this.method4395(var1), this.method4480(var1));
				return false;
			}
		} else {
			var1.method4575();
			var1.remove();
			if (var1.field2907 > 0 && var1 == this.field2858[var1.field2908][var1.field2907]) {
				this.field2858[var1.field2908][var1.field2907] = null;
			}

			return true;
		}
	}
}
