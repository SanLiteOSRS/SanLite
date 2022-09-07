import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	NodeDeque field252;
	@ObfuscatedName("v")
	int field253;
	@ObfuscatedName("c")
	int field255;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field252 = new NodeDeque(); // L: 10
		this.field253 = 0; // L: 11
		this.field255 = -1; // L: 12
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lah;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("w")
	void method584() {
		if (this.field253 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field252.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field252.previous()) { // L: 24
				var1.field397 -= this.field253; // L: 25
			}

			this.field255 -= this.field253; // L: 27
			this.field253 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lon;Lac;)V"
	)
	void method588(Node var1, PcmStreamMixerListener var2) {
		while (this.field252.sentinel != var1 && ((PcmStreamMixerListener)var1).field397 <= var2.field397) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field255 = ((PcmStreamMixerListener)this.field252.sentinel.previous).field397; // L: 35
	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lac;)V"
	)
	void method597(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field252.sentinel.previous; // L: 41
		if (var2 == this.field252.sentinel) {
			this.field255 = -1; // L: 42
		} else {
			this.field255 = ((PcmStreamMixerListener)var2).field397; // L: 43
		}

	} // L: 44

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("k")
	protected int vmethod5396() {
		return 0; // L: 55
	}

	@ObfuscatedName("o")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field255 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field253 < this.field255) { // L: 64
				this.field253 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field255 - this.field253; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field253 += var4; // L: 73
			this.method584(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field252.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field397 = 0; // L: 79
					this.method597(var5); // L: 80
				} else {
					var5.field397 = var7; // L: 83
					this.method588(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("n")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("d")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field255 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field253 + var1 < this.field255) { // L: 103
				this.field253 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field255 - this.field253; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field253 += var2; // L: 111
			this.method584(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field252.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field397 = 0; // L: 117
					this.method597(var3); // L: 118
				} else {
					var3.field397 = var5; // L: 121
					this.method588(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("a")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
