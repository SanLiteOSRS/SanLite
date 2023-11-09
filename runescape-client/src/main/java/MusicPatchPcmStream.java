import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llw;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lmu;[IIIII)V",
		garbageValue = "-79644207"
	)
	void method6021(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3417[var1.field3485] & 4) != 0 && var1.field3489 < 0) { // L: 73
			int var6 = this.superStream.field3405[var1.field3485] / PcmPlayer.field279; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3495) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3495 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3495 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field279 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3420[var1.field3485] == 0) { // L: 86
					var1.stream = RawPcmStream.method890(var1.rawSound, var10.method889(), var10.method992(), var10.method871()); // L: 87
				} else {
					var1.stream = RawPcmStream.method890(var1.rawSound, var10.method889(), 0, var10.method871()); // L: 90
					this.superStream.method5841(var1, var1.table.field3457[var1.field3477] < 0); // L: 91
					var1.stream.method885(var8, var10.method992()); // L: 92
				}

				if (var1.table.field3457[var1.field3477] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method887(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method965()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lmu;II)V",
		garbageValue = "-1095882678"
	)
	void method6022(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3417[var1.field3485] & 4) != 0 && var1.field3489 < 0) { // L: 105
			int var3 = this.superStream.field3405[var1.field3485] / PcmPlayer.field279; // L: 106
			int var4 = (var3 + 1048575 - var1.field3495) / var3; // L: 107
			var1.field3495 = var3 * var2 + var1.field3495 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3420[var1.field3485] == 0) { // L: 110
					var1.stream = RawPcmStream.method890(var1.rawSound, var1.stream.method889(), var1.stream.method992(), var1.stream.method871()); // L: 111
				} else {
					var1.stream = RawPcmStream.method890(var1.rawSound, var1.stream.method889(), 0, var1.stream.method871()); // L: 114
					this.superStream.method5841(var1, var1.table.field3457[var1.field3477] < 0); // L: 115
				}

				if (var1.table.field3457[var1.field3477] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3495 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) { // L: 28
				return null;
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("aj")
	protected int vmethod6018() {
		return 0; // L: 34
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5860(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3476) { // L: 45
						this.method6021(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3476 -= var5; // L: 52
						break;
					}

					this.method6021(var6, var1, var4, var6.field3476, var5 + var4); // L: 46
					var4 += var6.field3476; // L: 47
					var5 -= var6.field3476; // L: 48
				} while(!this.superStream.method5861(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ad")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5860(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3476) { // L: 62
						this.method6022(var3, var2); // L: 67
						var3.field3476 -= var2; // L: 68
						break;
					}

					this.method6022(var3, var3.field3476); // L: 63
					var2 -= var3.field3476; // L: 64
				} while(!this.superStream.method5861(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-337455415"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3733
			Friend.method7788(); // L: 3734
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && WorldMapManager.clientPreferences.method2440() != 0 && !Client.playingJingle) { // L: 3736
			ClanChannel.method3327(2, class33.archive6, var0, 0, WorldMapManager.clientPreferences.method2440(), false); // L: 3737
		}

		Client.currentTrackGroupId = var0; // L: 3739
	} // L: 3740
}
