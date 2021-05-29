import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -386188103
	)
	int field2834;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 759378439
	)
	int field2853;
	@ObfuscatedName("y")
	int[] field2854;
	@ObfuscatedName("p")
	int[] field2837;
	@ObfuscatedName("j")
	int[] field2835;
	@ObfuscatedName("r")
	int[] field2839;
	@ObfuscatedName("b")
	int[] field2861;
	@ObfuscatedName("d")
	int[] field2841;
	@ObfuscatedName("s")
	int[] field2842;
	@ObfuscatedName("u")
	int[] field2843;
	@ObfuscatedName("l")
	int[] field2852;
	@ObfuscatedName("x")
	int[] field2846;
	@ObfuscatedName("z")
	int[] field2844;
	@ObfuscatedName("w")
	int[] field2848;
	@ObfuscatedName("t")
	int[] field2836;
	@ObfuscatedName("h")
	int[] field2850;
	@ObfuscatedName("q")
	int[] field2851;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "[[Liq;"
	)
	MusicPatchNode[][] field2847;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Liq;"
	)
	MusicPatchNode[][] field2849;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("ab")
	boolean field2855;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -398624825
	)
	@Export("track")
	int track;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 495959299
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 8283552259153278903L
	)
	long field2858;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5710666307152973315L
	)
	long field2859;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2834 = 256;
		this.field2853 = 1000000;
		this.field2854 = new int[16];
		this.field2837 = new int[16];
		this.field2835 = new int[16];
		this.field2839 = new int[16];
		this.field2861 = new int[16];
		this.field2841 = new int[16];
		this.field2842 = new int[16];
		this.field2843 = new int[16];
		this.field2852 = new int[16];
		this.field2846 = new int[16];
		this.field2844 = new int[16];
		this.field2848 = new int[16];
		this.field2836 = new int[16];
		this.field2850 = new int[16];
		this.field2851 = new int[16];
		this.field2847 = new MusicPatchNode[16][128];
		this.field2849 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4429();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-315791633"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2834 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1796230784"
	)
	int method4410() {
		return this.field2834;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lie;Ljv;Lbu;II)Z",
		garbageValue = "-1829332053"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4622();
		boolean var5 = true;
		int[] var6 = null;
		if (var4 > 0) {
			var6 = new int[]{var4};
		}

		for (ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
			int var8 = (int)var7.key;
			MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
			if (var9 == null) {
				var9 = InvDefinition.method2609(var2, var8);
				if (var9 == null) {
					var5 = false;
					continue;
				}

				this.musicPatches.put(var9, (long)var8);
			}

			if (!var9.method4588(var3, var7.byteArray, var6)) {
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
		descriptor = "(B)V",
		garbageValue = "89"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244074850"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("b")
	protected synchronized int vmethod4610() {
		return 0;
	}

	@ObfuscatedName("d")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2853 * -727379968 / (PcmPlayer.field428 * 22050);

			do {
				long var5 = this.field2858 + (long)var3 * (long)var4;
				if (this.field2859 - var5 >= 0L) {
					this.field2858 = var5;
					break;
				}

				int var7 = (int)((this.field2859 - this.field2858 + (long)var4 - 1L) / (long)var4);
				this.field2858 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4441();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lie;ZI)V",
		garbageValue = "1330192797"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2855 = var2;
		this.field2858 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2859 = this.midiFile.method4552(this.trackLength);
	}

	@ObfuscatedName("u")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2853 * -727379968 / (PcmPlayer.field428 * 22050);

			do {
				long var3 = this.field2858 + (long)var2 * (long)var1;
				if (this.field2859 - var3 >= 0L) {
					this.field2858 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2859 - this.field2858) - 1L) / (long)var2);
				this.field2858 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4441();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1985172216"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method4429();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1892448379"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1570912029"
	)
	public synchronized void method4502(int var1, int var2) {
		this.method4512(var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-75"
	)
	void method4512(int var1, int var2) {
		this.field2839[var1] = var2;
		this.field2841[var1] = var2 & -128;
		this.method4419(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-81134935"
	)
	void method4419(int var1, int var2) {
		if (var2 != this.field2861[var1]) {
			this.field2861[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2849[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1345766655"
	)
	void method4420(int var1, int var2, int var3) {
		this.method4418(var1, var2, 64);
		if ((this.field2846[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2905 == var1 && var4.field2895 < 0) {
					this.field2847[var1][var4.field2896] = null;
					this.field2847[var1][var2] = var4;
					int var8 = (var4.field2901 * var4.field2899 >> 12) + var4.field2900;
					var4.field2900 += var2 - var4.field2896 << 8;
					var4.field2899 = var8 - var4.field2900;
					var4.field2901 = 4096;
					var4.field2896 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2861[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2905 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2894 = var9.field2876[var2];
				var6.field2893 = var9.field2882[var2];
				var6.field2896 = var2;
				var6.field2897 = var3 * var3 * var9.field2879[var2] * var9.field2881 + 1024 >> 11;
				var6.field2898 = var9.field2880[var2] & 255;
				var6.field2900 = (var2 << 8) - (var9.field2878[var2] & 32767);
				var6.field2902 = 0;
				var6.field2903 = 0;
				var6.field2911 = 0;
				var6.field2895 = -1;
				var6.field2906 = 0;
				if (this.field2836[var1] == 0) {
					var6.stream = RawPcmStream.method842(var5, this.method4415(var6), this.method4434(var6), this.method4435(var6));
				} else {
					var6.stream = RawPcmStream.method842(var5, this.method4415(var6), 0, this.method4435(var6));
					this.method4421(var6, var9.field2878[var2] < 0);
				}

				if (var9.field2878[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2893 >= 0) {
					MusicPatchNode var7 = this.field2849[var1][var6.field2893];
					if (var7 != null && var7.field2895 < 0) {
						this.field2847[var1][var7.field2896] = null;
						var7.field2895 = 0;
					}

					this.field2849[var1][var6.field2893] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2847[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Liq;ZB)V",
		garbageValue = "-23"
	)
	void method4421(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field399) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2836[var1.field2905] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method888();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2836[var1.field2905] >> 6);
		}

		var1.stream.method900(var4);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "58"
	)
	void method4418(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2847[var1][var2];
		if (var4 != null) {
			this.field2847[var1][var2] = null;
			if ((this.field2846[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field2905 == var4.field2905 && var5.field2895 < 0 && var4 != var5) {
						var4.field2895 = 0;
						break;
					}
				}
			} else {
				var4.field2895 = 0;
			}

		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-366047626"
	)
	void method4423(int var1, int var2, int var3) {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "852353128"
	)
	void method4501(int var1, int var2) {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-5"
	)
	void method4425(int var1, int var2) {
		this.field2842[var1] = var2;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2477568"
	)
	void method4426(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2905 == var1) {
				if (var2.stream != null) {
					var2.stream.method855(PcmPlayer.field428 * 22050 / 100);
					if (var2.stream.method859()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4634();
				}

				if (var2.field2895 < 0) {
					this.field2847[var2.field2905][var2.field2896] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1043884473"
	)
	void method4433(int var1) {
		if (var1 >= 0) {
			this.field2854[var1] = 12800;
			this.field2837[var1] = 8192;
			this.field2835[var1] = 16383;
			this.field2842[var1] = 8192;
			this.field2843[var1] = 0;
			this.field2852[var1] = 8192;
			this.method4438(var1);
			this.method4431(var1);
			this.field2846[var1] = 0;
			this.field2844[var1] = 32767;
			this.field2848[var1] = 256;
			this.field2836[var1] = 0;
			this.method4474(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4433(var1);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1363851317"
	)
	void method4436(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2905 == var1) && var2.field2895 < 0) {
				this.field2847[var2.field2905][var2.field2896] = null;
				var2.field2895 = 0;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1017241688"
	)
	void method4429() {
		this.method4426(-1);
		this.method4433(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2861[var1] = this.field2839[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2841[var1] = this.field2839[var1] & -128;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1658989122"
	)
	void method4438(int var1) {
		if ((this.field2846[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2905 == var1 && this.field2847[var1][var2.field2896] == null && var2.field2895 < 0) {
					var2.field2895 = 0;
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "119"
	)
	void method4431(int var1) {
		if ((this.field2846[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2905 == var1) {
					var2.field2904 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method4452(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4418(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4420(var3, var4, var5);
			} else {
				this.method4418(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4423(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2841[var3] = (var5 << 14) + (this.field2841[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2841[var3] = (var5 << 7) + (this.field2841[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2843[var3] = (var5 << 7) + (this.field2843[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2843[var3] = var5 + (this.field2843[var3] & -128);
			}

			if (var4 == 5) {
				this.field2852[var3] = (var5 << 7) + (this.field2852[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2852[var3] = var5 + (this.field2852[var3] & -128);
			}

			if (var4 == 7) {
				this.field2854[var3] = (var5 << 7) + (this.field2854[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2854[var3] = var5 + (this.field2854[var3] & -128);
			}

			if (var4 == 10) {
				this.field2837[var3] = (var5 << 7) + (this.field2837[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2837[var3] = var5 + (this.field2837[var3] & -128);
			}

			if (var4 == 11) {
				this.field2835[var3] = (var5 << 7) + (this.field2835[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2835[var3] = var5 + (this.field2835[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2846;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2846;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2846;
					var10000[var3] |= 2;
				} else {
					this.method4438(var3);
					var10000 = this.field2846;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & 127);
			}

			if (var4 == 98) {
				this.field2844[var3] = (this.field2844[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2844[var3] = (var5 << 7) + (this.field2844[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2844[var3] = (this.field2844[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4426(var3);
			}

			if (var4 == 121) {
				this.method4433(var3);
			}

			if (var4 == 123) {
				this.method4436(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2844[var3];
				if (var6 == 16384) {
					this.field2848[var3] = (var5 << 7) + (this.field2848[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2844[var3];
				if (var6 == 16384) {
					this.field2848[var3] = var5 + (this.field2848[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2836[var3] = (var5 << 7) + (this.field2836[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2836[var3] = var5 + (this.field2836[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2846;
					var10000[var3] |= 4;
				} else {
					this.method4431(var3);
					var10000 = this.field2846;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4474(var3, (var5 << 7) + (this.field2850[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4474(var3, var5 + (this.field2850[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4419(var3, var4 + this.field2841[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4501(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4425(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4429();
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "498737337"
	)
	void method4474(int var1, int var2) {
		this.field2850[var1] = var2;
		this.field2851[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Liq;B)I",
		garbageValue = "1"
	)
	int method4415(MusicPatchNode var1) {
		int var2 = (var1.field2901 * var1.field2899 >> 12) + var1.field2900;
		var2 += (this.field2842[var1.field2905] - 8192) * this.field2848[var1.field2905] >> 12;
		MusicPatchNode2 var3 = var1.field2894;
		int var4;
		if (var3.field2817 > 0 && (var3.field2822 > 0 || this.field2843[var1.field2905] > 0)) {
			var4 = var3.field2822 << 2;
			int var5 = var3.field2823 << 1;
			if (var1.field2907 < var5) {
				var4 = var4 * var1.field2907 / var5;
			}

			var4 += this.field2843[var1.field2905] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2908 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(PcmPlayer.field428 * 22050) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liq;I)I",
		garbageValue = "-2121980978"
	)
	int method4434(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2894;
		int var3 = this.field2854[var1.field2905] * this.field2835[var1.field2905] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2897 + 16384 >> 15;
		var3 = var3 * this.field2834 + 128 >> 8;
		if (var2.field2815 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2815 * (double)var1.field2902 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2825 != null) {
			var4 = var1.field2903;
			var5 = var2.field2825[var1.field2911 * 4 + 1];
			if (var1.field2911 * 4 < var2.field2825.length - 2) {
				var6 = (var2.field2825[var1.field2911 * 4] & 255) << 8;
				var7 = (var2.field2825[var1.field2911 * 4 + 2] & 255) << 8;
				var5 += (var2.field2825[var1.field2911 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field2895 > 0 && var2.field2816 != null) {
			var4 = var1.field2895;
			var5 = var2.field2816[var1.field2906 * 4 + 1];
			if (var1.field2906 * 4 < var2.field2816.length - 2) {
				var6 = (var2.field2816[var1.field2906 * 4] & 255) << 8;
				var7 = (var2.field2816[var1.field2906 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2816[var1.field2906 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liq;I)I",
		garbageValue = "-1483701319"
	)
	int method4435(MusicPatchNode var1) {
		int var2 = this.field2837[var1.field2905];
		return var2 < 8192 ? var2 * var1.field2898 + 32 >> 6 : 16384 - ((128 - var1.field2898) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "981767255"
	)
	void method4441() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2859; var2 == this.trackLength; var3 = this.midiFile.method4552(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2855 || var2 == 0) {
							this.method4429();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4452(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2859 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Liq;B)Z",
		garbageValue = "-21"
	)
	boolean method4442(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2895 >= 0) {
				var1.remove();
				if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) {
					this.field2849[var1.field2905][var1.field2893] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liq;[IIII)Z",
		garbageValue = "-1838256621"
	)
	boolean method4443(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2891 = PcmPlayer.field428 * 22050 / 100;
		if (var1.field2895 < 0 || var1.stream != null && !var1.stream.method848()) {
			int var5 = var1.field2901;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2852[var1.field2905] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2901 = var5;
			}

			var1.stream.method959(this.method4415(var1));
			MusicPatchNode2 var6 = var1.field2894;
			boolean var7 = false;
			++var1.field2907;
			var1.field2908 += var6.field2817;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2896 - 60 << 8) + (var1.field2901 * var1.field2899 >> 12));
			if (var6.field2815 > 0) {
				if (var6.field2820 > 0) {
					var1.field2902 = var1.field2902 * 1260404736 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2820) + 0.5D) * 1260404736;
				} else {
					var1.field2902 = var1.field2902 * 1260404736 + -1876951040;
				}
			}

			if (var6.field2825 != null) {
				if (var6.field2821 > 0) {
					var1.field2903 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2821 * var8) + 0.5D);
				} else {
					var1.field2903 += 128;
				}

				while (var1.field2911 * 4 < var6.field2825.length - 2 && var1.field2903 > (var6.field2825[var1.field2911 * 4 + 2] & 255) << 8) {
					var1.field2911 = var1.field2911 * 4 + 2;
				}

				if (var1.field2911 * 4 == var6.field2825.length - 2 && var6.field2825[var1.field2911 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2895 >= 0 && var6.field2816 != null && (this.field2846[var1.field2905] & 1) == 0 && (var1.field2893 < 0 || var1 != this.field2849[var1.field2905][var1.field2893])) {
				if (var6.field2819 > 0) {
					var1.field2895 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2819 * var8) + 0.5D);
				} else {
					var1.field2895 += 128;
				}

				while (var1.field2906 * 4 < var6.field2816.length - 2 && var1.field2895 > (var6.field2816[var1.field2906 * 4 + 2] & 255) << 8) {
					var1.field2906 = var1.field2906 * 4 + 2;
				}

				if (var1.field2906 * 4 == var6.field2816.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method855(var1.field2891);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method859()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4634();
				if (var1.field2895 >= 0) {
					var1.remove();
					if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) {
						this.field2849[var1.field2905][var1.field2893] = null;
					}
				}

				return true;
			} else {
				var1.stream.method983(var1.field2891, this.method4434(var1), this.method4435(var1));
				return false;
			}
		} else {
			var1.method4634();
			var1.remove();
			if (var1.field2893 > 0 && var1 == this.field2849[var1.field2905][var1.field2893]) {
				this.field2849[var1.field2905][var1.field2893] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-792504046"
	)
	static boolean method4445() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
