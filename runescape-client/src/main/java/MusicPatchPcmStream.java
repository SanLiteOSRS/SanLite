import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lio;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Liu;[IIIII)V",
		garbageValue = "-887110953"
	)
	void method4974(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2944[var1.field2996] & 4) != 0 && var1.field2999 < 0) {
			int var6 = this.superStream.field2946[var1.field2996] / UserComparator2.field4359;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3003) / var6;
				if (var7 > var4) {
					var1.field3003 += var6 * var4;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3003 += var6 * var7 - 1048576;
				int var8 = UserComparator2.field4359 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2932[var1.field2996] == 0) {
					var1.stream = RawPcmStream.method817(var1.rawSound, var10.method832(), var10.method936(), var10.method824());
				} else {
					var1.stream = RawPcmStream.method817(var1.rawSound, var10.method832(), 0, var10.method824());
					this.superStream.method4765(var1, var1.patch.field2972[var1.field2990] < 0);
					var1.stream.method941(var8, var10.method936());
				}

				if (var1.patch.field2972[var1.field2990] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method830(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method834()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Liu;IB)V",
		garbageValue = "50"
	)
	void method4959(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2944[var1.field2996] & 4) != 0 && var1.field2999 < 0) {
			int var3 = this.superStream.field2946[var1.field2996] / UserComparator2.field4359;
			int var4 = (var3 + 1048575 - var1.field3003) / var3;
			var1.field3003 = var3 * var2 + var1.field3003 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2932[var1.field2996] == 0) {
					var1.stream = RawPcmStream.method817(var1.rawSound, var1.stream.method832(), var1.stream.method936(), var1.stream.method824());
				} else {
					var1.stream = RawPcmStream.method817(var1.rawSound, var1.stream.method832(), 0, var1.stream.method824());
					this.superStream.method4765(var1, var1.patch.field2972[var1.field2990] < 0);
				}

				if (var1.patch.field2972[var1.field2990] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3003 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
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

	@ObfuscatedName("p")
	protected int vmethod4958() {
		return 0;
	}

	@ObfuscatedName("j")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4787(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2995) {
						this.method4974(var6, var1, var4, var5, var5 + var4);
						var6.field2995 -= var5;
						break;
					}

					this.method4974(var6, var1, var4, var6.field2995, var5 + var4);
					var4 += var6.field2995;
					var5 -= var6.field2995;
				} while(!this.superStream.method4788(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("x")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method4787(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2995) {
						this.method4959(var3, var2);
						var3.field2995 -= var2;
						break;
					}

					this.method4959(var3, var3.field2995);
					var2 -= var3.field2995;
				} while(!this.superStream.method4788(var3, (int[])null, 0, var2));
			}
		}

	}
}
