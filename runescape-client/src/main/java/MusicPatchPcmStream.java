import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lhp;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Liz;[IIIII)V",
		garbageValue = "382384073"
	)
	void method4546(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2853[var1.field2908] & 4) != 0 && var1.field2898 < 0) {
			int var6 = this.superStream.field2841[var1.field2908] / PcmPlayer.field401;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2917) / var6;
				if (var7 > var4) {
					var1.field2917 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2917 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field401 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2854[var1.field2908] == 0) {
					var1.stream = RawPcmStream.method885(var1.rawSound, var10.method935(), var10.method891(), var10.method892());
				} else {
					var1.stream = RawPcmStream.method885(var1.rawSound, var10.method935(), 0, var10.method892());
					this.superStream.method4430(var1, var1.patch.field2881[var1.field2902] < 0);
					var1.stream.method896(var8, var10.method891());
				}

				if (var1.patch.field2881[var1.field2902] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method898(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method902()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Liz;II)V",
		garbageValue = "-1341794565"
	)
	void method4547(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2853[var1.field2908] & 4) != 0 && var1.field2898 < 0) {
			int var3 = this.superStream.field2841[var1.field2908] / PcmPlayer.field401;
			int var4 = (var3 + 1048575 - var1.field2917) / var3;
			var1.field2917 = var3 * var2 + var1.field2917 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2854[var1.field2908] == 0) {
					var1.stream = RawPcmStream.method885(var1.rawSound, var1.stream.method935(), var1.stream.method891(), var1.stream.method892());
				} else {
					var1.stream = RawPcmStream.method885(var1.rawSound, var1.stream.method935(), 0, var1.stream.method892());
					this.superStream.method4430(var1, var1.patch.field2881[var1.field2902] < 0);
				}

				if (var1.patch.field2881[var1.field2902] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2917 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("v")
	protected int vmethod4560() {
		return 0;
	}

	@ObfuscatedName("b")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4403(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2916) {
						this.method4546(var6, var1, var4, var5, var5 + var4);
						var6.field2916 -= var5;
						break;
					}

					this.method4546(var6, var1, var4, var6.field2916, var5 + var4);
					var4 += var6.field2916;
					var5 -= var6.field2916;
				} while(!this.superStream.method4419(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("i")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4403(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2916) {
						this.method4547(var3, var2);
						var3.field2916 -= var2;
						break;
					}

					this.method4547(var3, var3.field2916);
					var2 -= var3.field2916;
				} while(!this.superStream.method4419(var3, (int[])null, 0, var2));
			}
		}

	}
}
