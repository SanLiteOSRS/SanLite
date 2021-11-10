import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1803205059
	)
	int field2930;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1989507264
	)
	int field2931;
	@ObfuscatedName("o")
	int[] field2956;
	@ObfuscatedName("g")
	int[] field2933;
	@ObfuscatedName("e")
	int[] field2934;
	@ObfuscatedName("p")
	int[] field2941;
	@ObfuscatedName("j")
	int[] field2936;
	@ObfuscatedName("b")
	int[] field2937;
	@ObfuscatedName("x")
	int[] field2938;
	@ObfuscatedName("y")
	int[] field2939;
	@ObfuscatedName("k")
	int[] field2940;
	@ObfuscatedName("d")
	int[] field2944;
	@ObfuscatedName("r")
	int[] field2942;
	@ObfuscatedName("m")
	int[] field2943;
	@ObfuscatedName("c")
	int[] field2932;
	@ObfuscatedName("f")
	int[] field2945;
	@ObfuscatedName("h")
	int[] field2946;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2952;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Liu;"
	)
	MusicPatchNode[][] field2949;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("aq")
	boolean field2950;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -825600901
	)
	@Export("track")
	int track;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1277249171
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -2626160015081860905L
	)
	long field2953;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 8598063187503057895L
	)
	long field2954;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lij;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;

	public MidiPcmStream() {
		this.field2930 = 256;
		this.field2931 = -727379968;
		this.field2956 = new int[16];
		this.field2933 = new int[16];
		this.field2934 = new int[16];
		this.field2941 = new int[16];
		this.field2936 = new int[16];
		this.field2937 = new int[16];
		this.field2938 = new int[16];
		this.field2939 = new int[16];
		this.field2940 = new int[16];
		this.field2944 = new int[16];
		this.field2942 = new int[16];
		this.field2943 = new int[16];
		this.field2932 = new int[16];
		this.field2945 = new int[16];
		this.field2946 = new int[16];
		this.field2952 = new MusicPatchNode[16][128];
		this.field2949 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.musicPatches = new NodeHashTable(128);
		this.method4773();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "649793377"
	)
	@Export("setPcmStreamVolume")
	public synchronized void setPcmStreamVolume(int var1) {
		this.field2930 = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	int method4754() {
		return this.field2930;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Liv;Lko;Lad;IB)Z",
		garbageValue = "84"
	)
	@Export("loadMusicTrack")
	public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
		var1.method4981();
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

			if (!var9.method4945(var3, var7.byteArray, var6)) {
				var5 = false;
			}
		}

		if (var5) {
			var1.clear();
		}

		return var5;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clearAll")
	public synchronized void clearAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.clear();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("removeAll")
	synchronized void removeAll() {
		for (MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
			var1.remove();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected synchronized PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected synchronized PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("p")
	protected synchronized int vmethod4958() {
		return 0;
	}

	@ObfuscatedName("j")
	@Export("fill")
	protected synchronized void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field2931 * 1000000 / UserComparator2.field4359;

			do {
				long var5 = this.field2953 + (long)var4 * (long)var3;
				if (this.field2954 - var5 >= 0L) {
					this.field2953 = var5;
					break;
				}

				int var7 = (int)((this.field2954 - this.field2953 + (long)var4 - 1L) / (long)var4);
				this.field2953 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method4758();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Liv;ZI)V",
		garbageValue = "-323229472"
	)
	@Export("setMusicTrack")
	public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
		this.clear();
		this.midiFile.parse(var1.midi);
		this.field2950 = var2;
		this.field2953 = 0L;
		int var3 = this.midiFile.trackCount();

		for (int var4 = 0; var4 < var3; ++var4) {
			this.midiFile.gotoTrack(var4);
			this.midiFile.readTrackLength(var4);
			this.midiFile.markTrackPosition(var4);
		}

		this.track = this.midiFile.getPrioritizedTrack();
		this.trackLength = this.midiFile.trackLengths[this.track];
		this.field2954 = this.midiFile.method4934(this.trackLength);
	}

	@ObfuscatedName("x")
	@Export("skip")
	protected synchronized void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field2931 * 1000000 / UserComparator2.field4359;

			do {
				long var3 = (long)var1 * (long)var2 + this.field2953;
				if (this.field2954 - var3 >= 0L) {
					this.field2953 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field2954 - this.field2953) - 1L) / (long)var2);
				this.field2953 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method4758();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clear")
	public synchronized void clear() {
		this.midiFile.clear();
		this.method4773();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-131350281"
	)
	@Export("isReady")
	public synchronized boolean isReady() {
		return this.midiFile.isReady();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2025298930"
	)
	public synchronized void method4761(int var1, int var2) {
		this.method4826(var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-59"
	)
	void method4826(int var1, int var2) {
		this.field2941[var1] = var2;
		this.field2937[var1] = var2 & -128;
		this.method4863(var1, var2);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-70"
	)
	void method4863(int var1, int var2) {
		if (var2 != this.field2936[var1]) {
			this.field2936[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field2949[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	void method4764(int var1, int var2, int var3) {
		this.method4847(var1, var2, 64);
		if ((this.field2944[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field2996 == var1 && var4.field2999 < 0) {
					this.field2952[var1][var4.field2990] = null;
					this.field2952[var1][var2] = var4;
					int var8 = (var4.field2998 * var4.field2997 >> 12) + var4.field2993;
					var4.field2993 += var2 - var4.field2990 << 8;
					var4.field2997 = var8 - var4.field2993;
					var4.field2998 = 4096;
					var4.field2990 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2936[var1]);
		if (var9 != null) {
			RawSound var5 = var9.rawSounds[var2];
			if (var5 != null) {
				MusicPatchNode var6 = new MusicPatchNode();
				var6.field2996 = var1;
				var6.patch = var9;
				var6.rawSound = var5;
				var6.field2988 = var9.field2976[var2];
				var6.field2989 = var9.field2977[var2];
				var6.field2990 = var2;
				var6.field2991 = var3 * var3 * var9.field2974[var2] * var9.field2973 + 1024 >> 11;
				var6.field2992 = var9.field2971[var2] & 255;
				var6.field2993 = (var2 << 8) - (var9.field2972[var2] & 32767);
				var6.field2986 = 0;
				var6.field3004 = 0;
				var6.field2994 = 0;
				var6.field2999 = -1;
				var6.field3000 = 0;
				if (this.field2932[var1] == 0) {
					var6.stream = RawPcmStream.method817(var5, this.method4778(var6), this.method4779(var6), this.method4780(var6));
				} else {
					var6.stream = RawPcmStream.method817(var5, this.method4778(var6), 0, this.method4780(var6));
					this.method4765(var6, var9.field2972[var2] < 0);
				}

				if (var9.field2972[var2] < 0) {
					var6.stream.setNumLoops(-1);
				}

				if (var6.field2989 >= 0) {
					MusicPatchNode var7 = this.field2949[var1][var6.field2989];
					if (var7 != null && var7.field2999 < 0) {
						this.field2952[var1][var7.field2990] = null;
						var7.field2999 = 0;
					}

					this.field2949[var1][var6.field2989] = var6;
				}

				this.patchStream.queue.addFirst(var6);
				this.field2952[var1][var2] = var6;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Liu;ZI)V",
		garbageValue = "1139290365"
	)
	void method4765(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field238) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field2932[var1.field2996] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method922();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field2932[var1.field2996] >> 6);
		}

		var1.stream.method825(var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1890191910"
	)
	void method4847(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field2952[var1][var2];
		if (var4 != null) {
			this.field2952[var1][var2] = null;
			if ((this.field2944[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field2996 == var5.field2996 && var5.field2999 < 0 && var4 != var5) {
						var4.field2999 = 0;
						break;
					}
				}
			} else {
				var4.field2999 = 0;
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1181683312"
	)
	void method4853(int var1, int var2, int var3) {
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "825528878"
	)
	void method4768(int var1, int var2) {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "21"
	)
	void method4769(int var1, int var2) {
		this.field2938[var1] = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1217191884"
	)
	void method4770(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field2996 == var1) {
				if (var2.stream != null) {
					var2.stream.method830(UserComparator2.field4359 / 100);
					if (var2.stream.method834()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method4992();
				}

				if (var2.field2999 < 0) {
					this.field2952[var2.field2996][var2.field2990] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "87"
	)
	void method4771(int var1) {
		if (var1 >= 0) {
			this.field2956[var1] = 12800;
			this.field2933[var1] = 8192;
			this.field2934[var1] = 16383;
			this.field2938[var1] = 8192;
			this.field2939[var1] = 0;
			this.field2940[var1] = 8192;
			this.method4774(var1);
			this.method4775(var1);
			this.field2944[var1] = 0;
			this.field2942[var1] = 32767;
			this.field2943[var1] = 256;
			this.field2932[var1] = 0;
			this.method4777(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method4771(var1);
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "94"
	)
	void method4772(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field2996 == var1) && var2.field2999 < 0) {
				this.field2952[var2.field2996][var2.field2990] = null;
				var2.field2999 = 0;
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "53312168"
	)
	void method4773() {
		this.method4770(-1);
		this.method4771(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field2936[var1] = this.field2941[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field2937[var1] = this.field2941[var1] & -128;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "453228054"
	)
	void method4774(int var1) {
		if ((this.field2944[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2996 == var1 && this.field2952[var1][var2.field2990] == null && var2.field2999 < 0) {
					var2.field2999 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2001136983"
	)
	void method4775(int var1) {
		if ((this.field2944[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field2996 == var1) {
					var2.field3003 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method4776(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4847(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method4764(var3, var4, var5);
			} else {
				this.method4847(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method4853(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field2937[var3] = (var5 << 14) + (this.field2937[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field2937[var3] = (var5 << 7) + (this.field2937[var3] & -16257);
			}

			if (var4 == 1) {
				this.field2939[var3] = (var5 << 7) + (this.field2939[var3] & -16257);
			}

			if (var4 == 33) {
				this.field2939[var3] = var5 + (this.field2939[var3] & -128);
			}

			if (var4 == 5) {
				this.field2940[var3] = (var5 << 7) + (this.field2940[var3] & -16257);
			}

			if (var4 == 37) {
				this.field2940[var3] = var5 + (this.field2940[var3] & -128);
			}

			if (var4 == 7) {
				this.field2956[var3] = (var5 << 7) + (this.field2956[var3] & -16257);
			}

			if (var4 == 39) {
				this.field2956[var3] = var5 + (this.field2956[var3] & -128);
			}

			if (var4 == 10) {
				this.field2933[var3] = (var5 << 7) + (this.field2933[var3] & -16257);
			}

			if (var4 == 42) {
				this.field2933[var3] = var5 + (this.field2933[var3] & -128);
			}

			if (var4 == 11) {
				this.field2934[var3] = (var5 << 7) + (this.field2934[var3] & -16257);
			}

			if (var4 == 43) {
				this.field2934[var3] = var5 + (this.field2934[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field2944;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field2944;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field2944;
					var10000[var3] |= 2;
				} else {
					this.method4774(var3);
					var10000 = this.field2944;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field2942[var3] = (var5 << 7) + (this.field2942[var3] & 127);
			}

			if (var4 == 98) {
				this.field2942[var3] = (this.field2942[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field2942[var3] = (var5 << 7) + (this.field2942[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field2942[var3] = (this.field2942[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method4770(var3);
			}

			if (var4 == 121) {
				this.method4771(var3);
			}

			if (var4 == 123) {
				this.method4772(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field2942[var3];
				if (var6 == 16384) {
					this.field2943[var3] = (var5 << 7) + (this.field2943[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field2942[var3];
				if (var6 == 16384) {
					this.field2943[var3] = var5 + (this.field2943[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field2932[var3] = (var5 << 7) + (this.field2932[var3] & -16257);
			}

			if (var4 == 48) {
				this.field2932[var3] = var5 + (this.field2932[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field2944;
					var10000[var3] |= 4;
				} else {
					this.method4775(var3);
					var10000 = this.field2944;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method4777(var3, (var5 << 7) + (this.field2945[var3] & -16257));
			}

			if (var4 == 49) {
				this.method4777(var3, var5 + (this.field2945[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4863(var3, var4 + this.field2937[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method4768(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method4769(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method4773();
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1520019758"
	)
	void method4777(int var1, int var2) {
		this.field2945[var1] = var2;
		this.field2946[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Liu;B)I",
		garbageValue = "0"
	)
	int method4778(MusicPatchNode var1) {
		int var2 = (var1.field2998 * var1.field2997 >> 12) + var1.field2993;
		var2 += (this.field2938[var1.field2996] - 8192) * this.field2943[var1.field2996] >> 12;
		MusicPatchNode2 var3 = var1.field2988;
		int var4;
		if (var3.field2911 > 0 && (var3.field2917 > 0 || this.field2939[var1.field2996] > 0)) {
			var4 = var3.field2917 << 2;
			int var5 = var3.field2919 << 1;
			if (var1.field3001 < var5) {
				var4 = var4 * var1.field3001 / var5;
			}

			var4 += this.field2939[var1.field2996] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3002 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)UserComparator2.field4359 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Liu;B)I",
		garbageValue = "4"
	)
	int method4779(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field2988;
		int var3 = this.field2934[var1.field2996] * this.field2956[var1.field2996] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field2991 + 16384 >> 15;
		var3 = var3 * this.field2930 + 128 >> 8;
		if (var2.field2913 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2913 * (double)var1.field2986 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field2916 != null) {
			var4 = var1.field3004;
			var5 = var2.field2916[var1.field2994 * 4 + 1];
			if (var1.field2994 * 4 < var2.field2916.length - 2) {
				var6 = (var2.field2916[var1.field2994 * 4] & 255) << 8;
				var7 = (var2.field2916[var1.field2994 * 4 + 2] & 255) << 8;
				var5 += (var2.field2916[var1.field2994 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field2999 > 0 && var2.field2914 != null) {
			var4 = var1.field2999;
			var5 = var2.field2914[var1.field3000 * 4 + 1];
			if (var1.field3000 * 4 < var2.field2914.length - 2) {
				var6 = (var2.field2914[var1.field3000 * 4] & 255) << 8;
				var7 = (var2.field2914[var1.field3000 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field2914[var1.field3000 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)I",
		garbageValue = "702321980"
	)
	int method4780(MusicPatchNode var1) {
		int var2 = this.field2933[var1.field2996];
		return var2 < 8192 ? var2 * var1.field2992 + 32 >> 6 : 16384 - ((128 - var1.field2992) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	void method4758() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field2954; var2 == this.trackLength; var3 = this.midiFile.method4934(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field2950 || var2 == 0) {
							this.method4773();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method4776(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field2954 = var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Liu;I)Z",
		garbageValue = "-1636960835"
	)
	boolean method4787(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field2999 >= 0) {
				var1.remove();
				if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) {
					this.field2949[var1.field2996][var1.field2989] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liu;[IIII)Z",
		garbageValue = "-47865740"
	)
	boolean method4788(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field2995 = UserComparator2.field4359 / 100;
		if (var1.field2999 < 0 || var1.stream != null && !var1.stream.method833()) {
			int var5 = var1.field2998;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2940[var1.field2996]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field2998 = var5;
			}

			var1.stream.method912(this.method4778(var1));
			MusicPatchNode2 var6 = var1.field2988;
			boolean var7 = false;
			++var1.field3001;
			var1.field3002 += var6.field2911;
			double var8 = 5.086263020833333E-6D * (double)((var1.field2990 - 60 << 8) + (var1.field2997 * var1.field2998 >> 12));
			if (var6.field2913 > 0) {
				if (var6.field2912 > 0) {
					var1.field2986 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2912 * var8) + 0.5D);
				} else {
					var1.field2986 += 128;
				}
			}

			if (var6.field2916 != null) {
				if (var6.field2918 > 0) {
					var1.field3004 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2918) + 0.5D);
				} else {
					var1.field3004 += 128;
				}

				while (var1.field2994 * 4 < var6.field2916.length - 2 && var1.field3004 > (var6.field2916[var1.field2994 * 4 + 2] & 255) << 8) {
					var1.field2994 = var1.field2994 * 4 + 2;
				}

				if (var1.field2994 * 4 == var6.field2916.length - 2 && var6.field2916[var1.field2994 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field2999 >= 0 && var6.field2914 != null && (this.field2944[var1.field2996] & 1) == 0 && (var1.field2989 < 0 || var1 != this.field2949[var1.field2996][var1.field2989])) {
				if (var6.field2915 > 0) {
					var1.field2999 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2915) + 0.5D);
				} else {
					var1.field2999 += 128;
				}

				while (var1.field3000 * 4 < var6.field2914.length - 2 && var1.field2999 > (var6.field2914[var1.field3000 * 4 + 2] & 255) << 8) {
					var1.field3000 = var1.field3000 * 4 + 2;
				}

				if (var1.field3000 * 4 == var6.field2914.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method830(var1.field2995);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method834()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method4992();
				if (var1.field2999 >= 0) {
					var1.remove();
					if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) {
						this.field2949[var1.field2996][var1.field2989] = null;
					}
				}

				return true;
			} else {
				var1.stream.method829(var1.field2995, this.method4779(var1), this.method4780(var1));
				return false;
			}
		} else {
			var1.method4992();
			var1.remove();
			if (var1.field2989 > 0 && var1 == this.field2949[var1.field2996][var1.field2989]) {
				this.field2949[var1.field2996][var1.field2989] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbw;B)V",
		garbageValue = "97"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			FriendSystem.method1755(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = GrandExchangeOfferOwnWorldComparator.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		WorldMapIcon_0.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		ApproximateRouteStrategy.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		ParamComposition.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		ScriptEvent.currentPort = ApproximateRouteStrategy.worldPort;
	}
}
