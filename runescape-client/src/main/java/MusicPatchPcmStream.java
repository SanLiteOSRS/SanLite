import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmn;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIII)V",
		garbageValue = "-1281472428"
	)
	void method6214(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3450[var1.field3515] & 4) != 0 && var1.field3498 < 0) { // L: 73
			int var6 = this.superStream.field3442[var1.field3515] / (PcmPlayer.field275 * 1019137945); // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3516) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3516 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3516 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field275 * 1019137945 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3440[var1.field3515] == 0) { // L: 86
					var1.stream = RawPcmStream.method904(var1.rawSound, var10.method919(), var10.method994(), var10.method988()); // L: 87
				} else {
					var1.stream = RawPcmStream.method904(var1.rawSound, var10.method919(), 0, var10.method988());
					this.superStream.method6020(var1, var1.table.field3478[var1.field3517] < 0);
					var1.stream.method915(var8, var10.method994());
				}

				if (var1.table.field3478[var1.field3517] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method917(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method921()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lmw;II)V",
		garbageValue = "-1821439633"
	)
	void method6227(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3450[var1.field3515] & 4) != 0 && var1.field3498 < 0) {
			int var3 = this.superStream.field3442[var1.field3515] / (PcmPlayer.field275 * 1019137945);
			int var4 = (var3 + 1048575 - var1.field3516) / var3;
			var1.field3516 = var3 * var2 + var1.field3516 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3440[var1.field3515] == 0) {
					var1.stream = RawPcmStream.method904(var1.rawSound, var1.stream.method919(), var1.stream.method994(), var1.stream.method988());
				} else {
					var1.stream = RawPcmStream.method904(var1.rawSound, var1.stream.method919(), 0, var1.stream.method988());
					this.superStream.method6020(var1, var1.table.field3478[var1.field3517] < 0);
				}

				if (var1.table.field3478[var1.field3517] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3516 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
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

	@ObfuscatedName("ac")
	protected int vmethod6210() {
		return 0; // L: 34
	}

	@ObfuscatedName("al")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method6041(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3513) { // L: 45
						this.method6214(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3513 -= var5; // L: 52
						break;
					}

					this.method6214(var6, var1, var4, var6.field3513, var5 + var4); // L: 46
					var4 += var6.field3513; // L: 47
					var5 -= var6.field3513; // L: 48
				} while(!this.superStream.method6042(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ap")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method6041(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3513) { // L: 62
						this.method6227(var3, var2); // L: 67
						var3.field3513 -= var2; // L: 68
						break;
					}

					this.method6227(var3, var3.field3513); // L: 63
					var2 -= var3.field3513; // L: 64
				} while(!this.superStream.method6042(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "125922381"
	)
	public static byte[] method6233(CharSequence var0) {
		int var1 = var0.length(); // L: 90
		byte[] var2 = new byte[var1]; // L: 91

		for (int var3 = 0; var3 < var1; ++var3) { // L: 92
			char var4 = var0.charAt(var3); // L: 93
			if ((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) { // L: 94
				if (var4 == 8364) { // L: 95
					var2[var3] = -128;
				} else if (var4 == 8218) { // L: 96
					var2[var3] = -126;
				} else if (var4 == 402) { // L: 97
					var2[var3] = -125;
				} else if (var4 == 8222) { // L: 98
					var2[var3] = -124;
				} else if (var4 == 8230) { // L: 99
					var2[var3] = -123;
				} else if (var4 == 8224) { // L: 100
					var2[var3] = -122;
				} else if (var4 == 8225) { // L: 101
					var2[var3] = -121;
				} else if (var4 == 710) { // L: 102
					var2[var3] = -120;
				} else if (var4 == 8240) { // L: 103
					var2[var3] = -119;
				} else if (var4 == 352) {
					var2[var3] = -118; // L: 104
				} else if (var4 == 8249) { // L: 105
					var2[var3] = -117;
				} else if (var4 == 338) { // L: 106
					var2[var3] = -116;
				} else if (var4 == 381) { // L: 107
					var2[var3] = -114;
				} else if (var4 == 8216) { // L: 108
					var2[var3] = -111;
				} else if (var4 == 8217) { // L: 109
					var2[var3] = -110;
				} else if (var4 == 8220) { // L: 110
					var2[var3] = -109;
				} else if (var4 == 8221) { // L: 111
					var2[var3] = -108;
				} else if (var4 == 8226) { // L: 112
					var2[var3] = -107;
				} else if (var4 == 8211) { // L: 113
					var2[var3] = -106;
				} else if (var4 == 8212) { // L: 114
					var2[var3] = -105;
				} else if (var4 == 732) { // L: 115
					var2[var3] = -104;
				} else if (var4 == 8482) { // L: 116
					var2[var3] = -103;
				} else if (var4 == 353) {
					var2[var3] = -102; // L: 117
				} else if (var4 == 8250) { // L: 118
					var2[var3] = -101;
				} else if (var4 == 339) { // L: 119
					var2[var3] = -100;
				} else if (var4 == 382) { // L: 120
					var2[var3] = -98;
				} else if (var4 == 376) { // L: 121
					var2[var3] = -97;
				} else {
					var2[var3] = 63; // L: 122
				}
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2; // L: 124
	}
}
