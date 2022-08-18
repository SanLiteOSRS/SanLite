import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("e")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Ljv;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1; // L: 15
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljf;[IIIII)V",
		garbageValue = "1654088686"
	)
	void method5451(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3219[var1.field3274] & 4) != 0 && var1.field3275 < 0) { // L: 73
			int var6 = this.superStream.field3222[var1.field3274] / class301.field3595; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3281) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3281 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3281 += var7 * var6 - 1048576; // L: 81
				int var8 = class301.field3595 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3212[var1.field3274] == 0) { // L: 86
					var1.stream = RawPcmStream.method795(var1.rawSound, var10.method844(), var10.method810(), var10.method840()); // L: 87
				} else {
					var1.stream = RawPcmStream.method795(var1.rawSound, var10.method844(), 0, var10.method840()); // L: 90
					this.superStream.method5280(var1, var1.patch.field3245[var1.field3279] < 0); // L: 91
					var1.stream.method806(var8, var10.method810()); // L: 92
				}

				if (var1.patch.field3245[var1.field3279] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method823(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method908()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)V",
		garbageValue = "-2137885796"
	)
	void method5448(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3219[var1.field3274] & 4) != 0 && var1.field3275 < 0) { // L: 105
			int var3 = this.superStream.field3222[var1.field3274] / class301.field3595; // L: 106
			int var4 = (var3 + 1048575 - var1.field3281) / var3; // L: 107
			var1.field3281 = var3 * var2 + var1.field3281 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3212[var1.field3274] == 0) { // L: 110
					var1.stream = RawPcmStream.method795(var1.rawSound, var1.stream.method844(), var1.stream.method810(), var1.stream.method840()); // L: 111
				} else {
					var1.stream = RawPcmStream.method795(var1.rawSound, var1.stream.method844(), 0, var1.stream.method840()); // L: 114
					this.superStream.method5280(var1, var1.patch.field3245[var1.field3279] < 0); // L: 115
				}

				if (var1.patch.field3245[var1.field3279] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3281 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Lae;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) { // L: 20
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lae;"
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

	@ObfuscatedName("j")
	protected int vmethod5453() {
		return 0; // L: 34
	}

	@ObfuscatedName("h")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5379(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3280) { // L: 45
						this.method5451(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3280 -= var5; // L: 52
						break;
					}

					this.method5451(var6, var1, var4, var6.field3280, var4 + var5); // L: 46
					var4 += var6.field3280; // L: 47
					var5 -= var6.field3280; // L: 48
				} while(!this.superStream.method5303(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("d")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5379(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3280) { // L: 62
						this.method5448(var3, var2); // L: 67
						var3.field3280 -= var2; // L: 68
						break;
					}

					this.method5448(var3, var3.field3280); // L: 63
					var2 -= var3.field3280; // L: 64
				} while(!this.superStream.method5303(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "40"
	)
	public static byte[] method5470(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}
}
