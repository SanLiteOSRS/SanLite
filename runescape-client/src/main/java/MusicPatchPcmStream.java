import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "Llr;"
	)
	static Bounds field2519;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lge;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Ldh;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		signature = "(Lge;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lhe;[IIIII)V",
		garbageValue = "770177978"
	)
	void method3993(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field2453[var1.field2484] & 4) != 0 && var1.field2483 < 0) {
			int var6 = this.superStream.field2442[var1.field2484] / PcmPlayer.field1447;

			while (true) {
				int var7 = (var6 + 1048575 - var1.field2486) / var6;
				if (var7 > var4) {
					var1.field2486 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field2486 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field1447 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field2441[var1.field2484] == 0) {
					var1.stream = RawPcmStream.method2638(var1.rawSound, var10.method2687(), var10.method2644(), var10.method2675());
				} else {
					var1.stream = RawPcmStream.method2638(var1.rawSound, var10.method2687(), 0, var10.method2675());
					this.superStream.method3817(var1, var1.patch.field2510[var1.field2474] < 0);
					var1.stream.method2744(var8, var10.method2644());
				}

				if (var1.patch.field2510[var1.field2474] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method2681(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method2655()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lhe;II)V",
		garbageValue = "-1243702200"
	)
	void method3998(MusicPatchNode var1, int var2) {
		if ((this.superStream.field2453[var1.field2484] & 4) != 0 && var1.field2483 < 0) {
			int var3 = this.superStream.field2442[var1.field2484] / PcmPlayer.field1447;
			int var4 = (var3 + 1048575 - var1.field2486) / var3;
			var1.field2486 = var3 * var2 + var1.field2486 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field2441[var1.field2484] == 0) {
					var1.stream = RawPcmStream.method2638(var1.rawSound, var1.stream.method2687(), var1.stream.method2644(), var1.stream.method2675());
				} else {
					var1.stream = RawPcmStream.method2638(var1.rawSound, var1.stream.method2687(), 0, var1.stream.method2675());
					this.superStream.method3817(var1, var1.patch.field2510[var1.field2474] < 0);
				}

				if (var1.patch.field2510[var1.field2474] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field2486 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "()Ldc;"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "()Ldc;"
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

	@ObfuscatedName("w")
	protected int vmethod3987() {
		return 0;
	}

	@ObfuscatedName("g")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3838(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field2488) {
						this.method3993(var6, var1, var4, var5, var5 + var4);
						var6.field2488 -= var5;
						break;
					}

					this.method3993(var6, var1, var4, var6.field2488, var5 + var4);
					var4 += var6.field2488;
					var5 -= var6.field2488;
				} while(!this.superStream.method3839(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("n")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method3838(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field2488) {
						this.method3998(var3, var2);
						var3.field2488 -= var2;
						break;
					}

					this.method3998(var3, var3.field2488);
					var2 -= var3.field2488;
				} while(!this.superStream.method3839(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Liq;",
		garbageValue = "-367277844"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
