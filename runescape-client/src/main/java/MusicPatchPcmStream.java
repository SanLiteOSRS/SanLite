import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkv;[IIIIB)V",
		garbageValue = "26"
	)
	void method5795(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3375[var1.field3436] & 4) != 0 && var1.field3440 < 0) { // L: 73
			int var6 = this.superStream.field3373[var1.field3436] / class284.field3321; // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3446) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3446 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3446 += var7 * var6 - 1048576; // L: 81
				int var8 = class284.field3321 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3384[var1.field3436] == 0) { // L: 86
					var1.stream = RawPcmStream.method913(var1.rawSound, var10.method979(), var10.method888(), var10.method933()); // L: 87
				} else {
					var1.stream = RawPcmStream.method913(var1.rawSound, var10.method979(), 0, var10.method933()); // L: 90
					this.superStream.method5659(var1, var1.patch.field3418[var1.field3431] < 0); // L: 91
					var1.stream.method893(var8, var10.method888()); // L: 92
				}

				if (var1.patch.field3418[var1.field3431] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method895(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method899()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkv;IB)V",
		garbageValue = "0"
	)
	void method5796(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3375[var1.field3436] & 4) != 0 && var1.field3440 < 0) { // L: 105
			int var3 = this.superStream.field3373[var1.field3436] / class284.field3321; // L: 106
			int var4 = (var3 + 1048575 - var1.field3446) / var3; // L: 107
			var1.field3446 = var3 * var2 + var1.field3446 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3384[var1.field3436] == 0) { // L: 110
					var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method979(), var1.stream.method888(), var1.stream.method933()); // L: 111
				} else {
					var1.stream = RawPcmStream.method913(var1.rawSound, var1.stream.method979(), 0, var1.stream.method933()); // L: 114
					this.superStream.method5659(var1, var1.patch.field3418[var1.field3431] < 0); // L: 115
				}

				if (var1.patch.field3418[var1.field3431] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3446 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
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
		descriptor = "()Lan;"
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

	@ObfuscatedName("n")
	protected int vmethod5793() {
		return 0; // L: 34
	}

	@ObfuscatedName("l")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5648(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3445) { // L: 45
						this.method5795(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3445 -= var5; // L: 52
						break;
					}

					this.method5795(var6, var1, var4, var6.field3445, var4 + var5); // L: 46
					var4 += var6.field3445; // L: 47
					var5 -= var6.field3445; // L: 48
				} while(!this.superStream.method5626(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("c")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5648(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3445) { // L: 62
						this.method5796(var3, var2); // L: 67
						var3.field3445 -= var2; // L: 68
						break;
					}

					this.method5796(var3, var3.field3445); // L: 63
					var2 -= var3.field3445; // L: 64
				} while(!this.superStream.method5626(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1425861786"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4998
			var2 = 1;
		}

		if (var3 < 1) { // L: 4999
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5000
		int var6;
		if (var5 < 0) { // L: 5002
			var6 = Client.field773;
		} else if (var5 >= 100) { // L: 5003
			var6 = Client.field774;
		} else {
			var6 = (Client.field774 - Client.field773) * var5 / 100 + Client.field773; // L: 5004
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5005
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field779) { // L: 5006
			var10 = Client.field779; // L: 5007
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5008
			if (var6 > Client.field778) { // L: 5009
				var6 = Client.field778; // L: 5010
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 5011
				var9 = (var2 - var8) / 2; // L: 5012
				if (var4) { // L: 5013
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5014
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5015
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5016
				}

				var0 += var9; // L: 5018
				var2 -= var9 * 2; // L: 5019
			}
		} else if (var7 > Client.field780) { // L: 5022
			var10 = Client.field780; // L: 5023
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 5024
			if (var6 < Client.field763) { // L: 5025
				var6 = Client.field763; // L: 5026
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 5027
				var9 = (var3 - var8) / 2; // L: 5028
				if (var4) { // L: 5029
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5030
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5031
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5032
				}

				var1 += var9; // L: 5034
				var3 -= var9 * 2; // L: 5035
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5038
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5039
			class174.method3525(var2, var3); // L: 5040
		}

		Client.viewportOffsetX = var0; // L: 5042
		Client.viewportOffsetY = var1; // L: 5043
		Client.viewportWidth = var2; // L: 5044
		Client.viewportHeight = var3; // L: 5045
	} // L: 5046
}
