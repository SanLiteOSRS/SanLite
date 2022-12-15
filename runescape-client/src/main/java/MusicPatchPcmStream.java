import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static Widget field3411;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lka;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;[IIIII)V",
		garbageValue = "771309267"
	)
	void method5762(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3356[var1.field3427] & 4) != 0 && var1.field3415 < 0) { // L: 73
			int var6 = this.superStream.field3372[var1.field3427] / (PcmPlayer.field325 * 22050);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3434) / var6;
				if (var7 > var4) {
					var1.field3434 += var4 * var6; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3434 += var7 * var6 - 1048576; // L: 81
				int var8 = PcmPlayer.field325 * 22050 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3358[var1.field3427] == 0) { // L: 86
					var1.stream = RawPcmStream.method1029(var1.rawSound, var10.method918(), var10.method964(), var10.method921()); // L: 87
				} else {
					var1.stream = RawPcmStream.method1029(var1.rawSound, var10.method918(), 0, var10.method921()); // L: 90
					this.superStream.method5637(var1, var1.patch.field3399[var1.field3419] < 0); // L: 91
					var1.stream.method914(var8, var10.method964()); // L: 92
				}

				if (var1.patch.field3399[var1.field3419] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method916(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method976()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkx;II)V",
		garbageValue = "-81280386"
	)
	void method5755(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3356[var1.field3427] & 4) != 0 && var1.field3415 < 0) { // L: 105
			int var3 = this.superStream.field3372[var1.field3427] / (PcmPlayer.field325 * 22050); // L: 106
			int var4 = (var3 + 1048575 - var1.field3434) / var3; // L: 107
			var1.field3434 = var3 * var2 + var1.field3434 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3358[var1.field3427] == 0) { // L: 110
					var1.stream = RawPcmStream.method1029(var1.rawSound, var1.stream.method918(), var1.stream.method964(), var1.stream.method921()); // L: 111
				} else {
					var1.stream = RawPcmStream.method1029(var1.rawSound, var1.stream.method918(), 0, var1.stream.method921()); // L: 114
					this.superStream.method5637(var1, var1.patch.field3399[var1.field3419] < 0); // L: 115
				}

				if (var1.patch.field3399[var1.field3419] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3434 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Laa;"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "()Laa;"
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

	@ObfuscatedName("r")
	protected int vmethod5753() {
		return 0; // L: 34
	}

	@ObfuscatedName("u")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5598(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3433) { // L: 45
						this.method5762(var6, var1, var4, var5, var4 + var5); // L: 51
						var6.field3433 -= var5; // L: 52
						break;
					}

					this.method5762(var6, var1, var4, var6.field3433, var5 + var4); // L: 46
					var4 += var6.field3433; // L: 47
					var5 -= var6.field3433; // L: 48
				} while(!this.superStream.method5599(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("j")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5598(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3433) { // L: 62
						this.method5755(var3, var2); // L: 67
						var3.field3433 -= var2;
						break;
					}

					this.method5755(var3, var3.field3433);
					var2 -= var3.field3433;
				} while(!this.superStream.method5599(var3, (int[])null, 0, var2));
			}
		}

	} // L: 70

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "255"
	)
	static int method5774(int var0, int var1) {
		if (var0 == -2) { // L: 63
			return 12345678;
		} else if (var0 == -1) { // L: 64
			if (var1 < 0) { // L: 65
				var1 = 0; // L: 66
			} else if (var1 > 127) { // L: 68
				var1 = 127; // L: 69
			}

			var1 = 127 - var1; // L: 71
			return var1; // L: 72
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 74
			if (var1 < 2) { // L: 75
				var1 = 2;
			} else if (var1 > 126) { // L: 76
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 77
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-1863786248"
	)
	static int method5751(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1490
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1491
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemId; // L: 1492
			return 1; // L: 1493
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1495
			if (var3.itemId != -1) { // L: 1496
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 1497
			}

			return 1; // L: 1498
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1500
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1501
			return 1; // L: 1502
		} else if (var0 == 1707) { // L: 1504
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method6172() ? 1 : 0; // L: 1505
			return 1; // L: 1506
		} else if (var0 == 1708) { // L: 1508
			return class300.method5846(var3); // L: 1509
		} else {
			return var0 == 1709 ? LoginScreenAnimation.method2380(var3) : 2; // L: 1511 1512 1514
		}
	}
}
