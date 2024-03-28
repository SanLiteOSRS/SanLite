import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	NodeDeque field247;
	@ObfuscatedName("af")
	int field248;
	@ObfuscatedName("at")
	int field249;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque(); // L: 9
		this.field247 = new NodeDeque(); // L: 10
		this.field248 = 0; // L: 11
		this.field249 = -1; // L: 12
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1); // L: 15
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lba;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove(); // L: 19
	} // L: 20

	@ObfuscatedName("af")
	void method677() {
		if (this.field248 > 0) { // L: 23
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field247.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field247.previous()) { // L: 24
				var1.field391 -= this.field248; // L: 25
			}

			this.field249 -= this.field248; // L: 27
			this.field248 = 0; // L: 28
		}

	} // L: 30

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lcg;)V"
	)
	void method675(Node var1, PcmStreamMixerListener var2) {
		while (this.field247.sentinel != var1 && ((PcmStreamMixerListener)var1).field391 <= var2.field391) { // L: 33
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1); // L: 34
		this.field249 = ((PcmStreamMixerListener)this.field247.sentinel.previous).field391; // L: 35
	} // L: 36

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lcg;)V"
	)
	void method676(PcmStreamMixerListener var1) {
		var1.remove(); // L: 39
		var1.remove2(); // L: 40
		Node var2 = this.field247.sentinel.previous; // L: 41
		if (var2 == this.field247.sentinel) {
			this.field249 = -1; // L: 42
		} else {
			this.field249 = ((PcmStreamMixerListener)var2).field391; // L: 43
		}

	} // L: 44

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last(); // L: 47
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous(); // L: 51
	}

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return 0; // L: 55
	}

	@ObfuscatedName("ad")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field249 < 0) { // L: 60
				this.updateSubStreams(var1, var2, var3); // L: 61
				return; // L: 62
			}

			if (var3 + this.field248 < this.field249) { // L: 64
				this.field248 += var3; // L: 65
				this.updateSubStreams(var1, var2, var3); // L: 66
				return; // L: 67
			}

			int var4 = this.field249 - this.field248; // L: 69
			this.updateSubStreams(var1, var2, var4); // L: 70
			var2 += var4; // L: 71
			var3 -= var4; // L: 72
			this.field248 += var4; // L: 73
			this.method677(); // L: 74
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field247.last(); // L: 75
			synchronized(var5) { // L: 76
				int var7 = var5.update(); // L: 77
				if (var7 < 0) { // L: 78
					var5.field391 = 0; // L: 79
					this.method676(var5); // L: 80
				} else {
					var5.field391 = var7; // L: 83
					this.method675(var5.previous, var5); // L: 84
				}
			}
		} while(var3 != 0); // L: 87

	}

	@ObfuscatedName("al")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) { // L: 92
			var4.update(var1, var2, var3); // L: 93
		}

	} // L: 95

	@ObfuscatedName("as")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field249 < 0) { // L: 99
				this.skipSubStreams(var1); // L: 100
				return; // L: 101
			}

			if (this.field248 + var1 < this.field249) { // L: 103
				this.field248 += var1; // L: 104
				this.skipSubStreams(var1); // L: 105
				return; // L: 106
			}

			int var2 = this.field249 - this.field248; // L: 108
			this.skipSubStreams(var2); // L: 109
			var1 -= var2; // L: 110
			this.field248 += var2; // L: 111
			this.method677(); // L: 112
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field247.last(); // L: 113
			synchronized(var3) { // L: 114
				int var5 = var3.update(); // L: 115
				if (var5 < 0) { // L: 116
					var3.field391 = 0; // L: 117
					this.method676(var3); // L: 118
				} else {
					var3.field391 = var5; // L: 121
					this.method675(var3.previous, var3); // L: 122
				}
			}
		} while(var1 != 0); // L: 125

	}

	@ObfuscatedName("ag")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) { // L: 130
			var2.skip(var1); // L: 131
		}

	} // L: 133
}
