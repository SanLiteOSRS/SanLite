import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lje;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljl;[IIIIB)V",
		garbageValue = "39"
	)
	void method5381(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3223[var1.field3280] & 4) != 0 && var1.field3266 < 0) { // L: 73
			int var6 = this.superStream.field3214[var1.field3280] / (class344.field4152 * -449918071); // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3283) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3283 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3283 += var7 * var6 - 1048576; // L: 81
				int var8 = class344.field4152 * -449918071 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3221[var1.field3280] == 0) { // L: 86
					var1.stream = RawPcmStream.method769(var1.rawSound, var10.method784(), var10.method775(), var10.method776()); // L: 87
				} else {
					var1.stream = RawPcmStream.method769(var1.rawSound, var10.method784(), 0, var10.method776()); // L: 90
					this.superStream.method5202(var1, var1.patch.field3249[var1.field3286] < 0); // L: 91
					var1.stream.method780(var8, var10.method775()); // L: 92
				}

				if (var1.patch.field3249[var1.field3286] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method782(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method820()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljl;IB)V",
		garbageValue = "0"
	)
	void method5382(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3223[var1.field3280] & 4) != 0 && var1.field3266 < 0) { // L: 105
			int var3 = this.superStream.field3214[var1.field3280] / (class344.field4152 * -449918071); // L: 106
			int var4 = (var3 + 1048575 - var1.field3283) / var3; // L: 107
			var1.field3283 = var3 * var2 + var1.field3283 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3221[var1.field3280] == 0) { // L: 110
					var1.stream = RawPcmStream.method769(var1.rawSound, var1.stream.method784(), var1.stream.method775(), var1.stream.method776()); // L: 111
				} else {
					var1.stream = RawPcmStream.method769(var1.rawSound, var1.stream.method784(), 0, var1.stream.method776()); // L: 114
					this.superStream.method5202(var1, var1.patch.field3249[var1.field3286] < 0); // L: 115
				}

				if (var1.patch.field3249[var1.field3286] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3283 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("k")
	protected int vmethod5396() {
		return 0; // L: 34
	}

	@ObfuscatedName("o")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5224(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3282) { // L: 45
						this.method5381(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3282 -= var5; // L: 52
						break;
					}

					this.method5381(var6, var1, var4, var6.field3282, var5 + var4); // L: 46
					var4 += var6.field3282; // L: 47
					var5 -= var6.field3282; // L: 48
				} while(!this.superStream.method5225(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("d")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5224(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3282) { // L: 62
						this.method5382(var3, var2); // L: 67
						var3.field3282 -= var2; // L: 68
						break;
					}

					this.method5382(var3, var3.field3282); // L: 63
					var2 -= var3.field3282; // L: 64
				} while(!this.superStream.method5225(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70
}
