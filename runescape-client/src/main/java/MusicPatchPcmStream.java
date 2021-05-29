import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ag")
	static String field2885;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lay;"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Liq;[IIIIS)V",
		garbageValue = "25857"
	)
	void method4604(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2846[var1.field2905] & 4) != 0 && var1.field2895 < 0) {
			int var6 = this.superStream.field2851[var1.field2905] / (PcmPlayer.field428 * 22050);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2904) / var6;
				if (var7 > var4) {
					var1.field2904 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2904 += var6 * var7 - 1048576;
				int var8 = PcmPlayer.field428 * 22050 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2836[var1.field2905] == 0) {
					var1.stream = RawPcmStream.method842(var1.rawSound, var10.method857(), var10.method914(), var10.method971());
				} else {
					var1.stream = RawPcmStream.method842(var1.rawSound, var10.method857(), 0, var10.method971());
					this.superStream.method4421(var1, var1.patch.field2878[var1.field2896] < 0);
					var1.stream.method853(var8, var10.method914());
				}

				if (var1.patch.field2878[var1.field2896] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method855(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method859()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Liq;II)V",
		garbageValue = "1404066411"
	)
	void method4605(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2846[var1.field2905] & 4) != 0 && var1.field2895 < 0) {
			int var3 = this.superStream.field2851[var1.field2905] / (PcmPlayer.field428 * 22050);
			int var4 = (var3 + 1048575 - var1.field2904) / var3;
			var1.field2904 = var3 * var2 + var1.field2904 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2836[var1.field2905] == 0) {
					var1.stream = RawPcmStream.method842(var1.rawSound, var1.stream.method857(), var1.stream.method914(), var1.stream.method971());
				} else {
					var1.stream = RawPcmStream.method842(var1.rawSound, var1.stream.method857(), 0, var1.stream.method971());
					this.superStream.method4421(var1, var1.patch.field2878[var1.field2896] < 0);
				}

				if (var1.patch.field2878[var1.field2896] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2904 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
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

	@ObfuscatedName("b")
	protected int vmethod4610() {
		return 0;
	}

	@ObfuscatedName("d")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4442(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2891) {
						this.method4604(var6, var1, var4, var5, var4 + var5);
						var6.field2891 -= var5;
						break;
					}

					this.method4604(var6, var1, var4, var6.field2891, var5 + var4);
					var4 += var6.field2891;
					var5 -= var6.field2891;
				} while(!this.superStream.method4443(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("u")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4442(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2891) {
						this.method4605(var3, var2);
						var3.field2891 -= var2;
						break;
					}

					this.method4605(var3, var3.field2891);
					var2 -= var3.field2891;
				} while(!this.superStream.method4443(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-53"
	)
	static char method4620(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}
}
