import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	NodeDeque field243;
	@ObfuscatedName("ar")
	int field242;
	@ObfuscatedName("ao")
	int field244;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field243 = new NodeDeque(); // L: 10
		this.field242 = 0; // L: 11
		this.field244 = -1; // L: 12
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbk;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("ar")
	void method715() {
		if (this.field242 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field243.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field243.previous()) { // L: 24
				var1.field385 -= this.field242; // L: 25
			}

			this.field244 -= this.field242; // L: 27
			this.field242 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lcx;)V"
	)
	void method716(Node var1, PcmStreamMixerListener var2) {
		while (this.field243.sentinel != var1 && ((PcmStreamMixerListener)var1).field385 <= var2.field385) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field244 = ((PcmStreamMixerListener)this.field243.sentinel.previous).field385; // L: 35
	} // L: 36

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcx;)V"
	)
	void method717(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field243.sentinel.previous; // L: 41
		if (var2 == this.field243.sentinel) {
			this.field244 = -1; // L: 42
		} else {
			this.field244 = ((PcmStreamMixerListener)var2).field385; // L: 43
		}

	} // L: 44

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("ac")
	protected int vmethod6210() {
		return 0; // L: 55
	}

	@ObfuscatedName("al")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field244 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field242 < this.field244) { // L: 64
				this.field242 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field244 - this.field242; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field242 += var4; // L: 73
			this.method715(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field243.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field385 = 0; // L: 79
					this.method717(var5); // L: 80
				} else {
					var5.field385 = var7; // L: 83
					this.method716(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("az")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("ap")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field244 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field242 + var1 < this.field244) { // L: 103
				this.field242 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field244 - this.field242; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field242 += var2; // L: 111
			this.method715(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field243.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field385 = 0; // L: 117
					this.method717(var3); // L: 118
				} else {
					var3.field385 = var5; // L: 121
					this.method716(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("av")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
