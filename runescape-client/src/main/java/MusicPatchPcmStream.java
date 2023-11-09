import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llc;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lmw;[IIIIB)V",
		garbageValue = "106"
	)
	void method6043(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3433[var1.field3494] & 4) != 0 && var1.field3499 < 0) { // L: 73
			int var6 = this.superStream.field3440[var1.field3494] / PcmPlayer.field314; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3505) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3505 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3505 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field314 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3424[var1.field3494] == 0) { // L: 86
					var1.stream = RawPcmStream.method887(var1.rawSound, var10.method902(), var10.method1007(), var10.method918()); // L: 87
				} else {
					var1.stream = RawPcmStream.method887(var1.rawSound, var10.method902(), 0, var10.method918()); // L: 90
					this.superStream.method5829(var1, var1.table.field3465[var1.field3490] < 0); // L: 91
					var1.stream.method898(var8, var10.method1007()); // L: 92
				}

				if (var1.table.field3465[var1.field3490] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method900(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method1031()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmw;IB)V",
		garbageValue = "1"
	)
	void method6040(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3433[var1.field3494] & 4) != 0 && var1.field3499 < 0) { // L: 105
			int var3 = this.superStream.field3440[var1.field3494] / PcmPlayer.field314; // L: 106
			int var4 = (var3 + 1048575 - var1.field3505) / var3; // L: 107
			var1.field3505 = var3 * var2 + var1.field3505 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3424[var1.field3494] == 0) { // L: 110
					var1.stream = RawPcmStream.method887(var1.rawSound, var1.stream.method902(), var1.stream.method1007(), var1.stream.method918()); // L: 111
				} else {
					var1.stream = RawPcmStream.method887(var1.rawSound, var1.stream.method902(), 0, var1.stream.method918()); // L: 114
					this.superStream.method5829(var1, var1.table.field3465[var1.field3490] < 0); // L: 115
				}

				if (var1.table.field3465[var1.field3490] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3505 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
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

	@ObfuscatedName("az")
	protected int vmethod6028() {
		return 0; // L: 34
	}

	@ObfuscatedName("av")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5851(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3;

				do {
					if (var5 <= var6.field3486) {
						this.method6043(var6, var1, var4, var5, var4 + var5);
						var6.field3486 -= var5;
						break;
					}

					this.method6043(var6, var1, var4, var6.field3486, var5 + var4);
					var4 += var6.field3486;
					var5 -= var6.field3486;
				} while(!this.superStream.method5852(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("aq")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method5851(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3486) { // L: 62
						this.method6040(var3, var2); // L: 67
						var3.field3486 -= var2; // L: 68
						break;
					}

					this.method6040(var3, var3.field3486); // L: 63
					var2 -= var3.field3486; // L: 64
				} while(!this.superStream.method5852(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;S)Ljava/lang/String;",
		garbageValue = "-15982"
	)
	public static String method6034(CharSequence var0) {
		long var3 = 0L; // L: 44
		int var5 = var0.length(); // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			var3 *= 37L; // L: 47
			char var7 = var0.charAt(var6); // L: 48
			if (var7 >= 'A' && var7 <= 'Z') { // L: 49
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 50
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 51
			}

			if (var3 >= 177917621779460413L) { // L: 52
				break;
			}
		}

		while (0L == var3 % 37L && var3 != 0L) { // L: 54
			var3 /= 37L;
		}

		String var8 = class170.base37DecodeLong(var3); // L: 57
		if (var8 == null) { // L: 58
			var8 = "";
		}

		return var8; // L: 59
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1520826927"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}
}
