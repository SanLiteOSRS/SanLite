import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -978459205
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class497 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Llm;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lmh;[IIIII)V",
		garbageValue = "1966200444"
	)
	void method6032(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3420[var1.field3486] & 4) != 0 && var1.field3503 < 0) { // L: 73
			int var6 = this.superStream.field3429[var1.field3486] / PcmPlayer.field271; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3487) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3487 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3487 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field271 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3421[var1.field3486] == 0) { // L: 86
					var1.stream = RawPcmStream.method894(var1.rawSound, var10.method924(), var10.method900(), var10.method901()); // L: 87
				} else {
					var1.stream = RawPcmStream.method894(var1.rawSound, var10.method924(), 0, var10.method901()); // L: 90
					this.superStream.method5841(var1, var1.table.field3470[var1.field3491] < 0); // L: 91
					var1.stream.method905(var8, var10.method900()); // L: 92
				}

				if (var1.table.field3470[var1.field3491] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method907(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method911()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lmh;II)V",
		garbageValue = "-741990843"
	)
	void method6039(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3420[var1.field3486] & 4) != 0 && var1.field3503 < 0) { // L: 105
			int var3 = this.superStream.field3429[var1.field3486] / PcmPlayer.field271; // L: 106
			int var4 = (var3 + 1048575 - var1.field3487) / var3; // L: 107
			var1.field3487 = var3 * var2 + var1.field3487 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3421[var1.field3486] == 0) { // L: 110
					var1.stream = RawPcmStream.method894(var1.rawSound, var1.stream.method924(), var1.stream.method900(), var1.stream.method901()); // L: 111
				} else {
					var1.stream = RawPcmStream.method894(var1.rawSound, var1.stream.method924(), 0, var1.stream.method901()); // L: 114
					this.superStream.method5841(var1, var1.table.field3470[var1.field3491] < 0); // L: 115
				}

				if (var1.table.field3470[var1.field3491] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3487 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
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

	@ObfuscatedName("an")
	protected int vmethod6035() {
		return 0; // L: 34
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5862(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3506) { // L: 45
						this.method6032(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3506 -= var5; // L: 52
						break;
					}

					this.method6032(var6, var1, var4, var6.field3506, var5 + var4); // L: 46
					var4 += var6.field3506; // L: 47
					var5 -= var6.field3506; // L: 48
				} while(!this.superStream.method5890(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ab")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5862(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3506) { // L: 62
						this.method6039(var3, var2); // L: 67
						var3.field3506 -= var2; // L: 68
						break;
					}

					this.method6039(var3, var3.field3506); // L: 63
					var2 -= var3.field3506; // L: 64
				} while(!this.superStream.method5890(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-950947458"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		HealthBar.scrollBarSprites[0].drawAt(var0, var1); // L: 11151
		HealthBar.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11152
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field576); // L: 11153
		int var5 = var3 * (var3 - 32) / var4; // L: 11154
		if (var5 < 8) { // L: 11155
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11156
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field529); // L: 11157
		Rasterizer2D.method9410(var0, var6 + var1 + 16, var5, Client.field579); // L: 11158
		Rasterizer2D.method9410(var0 + 1, var6 + var1 + 16, var5, Client.field579); // L: 11159
		Rasterizer2D.method9408(var0, var6 + var1 + 16, 16, Client.field579); // L: 11160
		Rasterizer2D.method9408(var0, var6 + var1 + 17, 16, Client.field579); // L: 11161
		Rasterizer2D.method9410(var0 + 15, var6 + var1 + 16, var5, Client.field641); // L: 11162
		Rasterizer2D.method9410(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field641); // L: 11163
		Rasterizer2D.method9408(var0, var6 + var5 + var1 + 15, 16, Client.field641); // L: 11164
		Rasterizer2D.method9408(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field641); // L: 11165
	} // L: 11166
}
