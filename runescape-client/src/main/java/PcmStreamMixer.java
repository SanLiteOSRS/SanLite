import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	NodeDeque field372;
	@ObfuscatedName("o")
	int field371;
	@ObfuscatedName("g")
	int field373;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field372 = new NodeDeque();
		this.field371 = 0;
		this.field373 = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lbt;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("o")
	void method719() {
		if (this.field371 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field372.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field372.previous()) {
				var1.field515 -= this.field371;
			}

			this.field373 -= this.field371;
			this.field371 = 0;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lbn;)V"
	)
	void method734(Node var1, PcmStreamMixerListener var2) {
		while (this.field372.sentinel != var1 && ((PcmStreamMixerListener)var1).field515 <= var2.field515) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field373 = ((PcmStreamMixerListener)this.field372.sentinel.previous).field515;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lbn;)V"
	)
	void method721(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field372.sentinel.previous;
		if (var2 == this.field372.sentinel) {
			this.field373 = -1;
		} else {
			this.field373 = ((PcmStreamMixerListener)var2).field515;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("v")
	protected int vmethod4560() {
		return 0;
	}

	@ObfuscatedName("b")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field373 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field371 < this.field373) {
				this.field371 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field373 - this.field371;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field371 += var4;
			this.method719();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field372.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field515 = 0;
					this.method721(var5);
				} else {
					var5.field515 = var7;
					this.method734(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("q")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("i")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field373 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field371 + var1 < this.field373) {
				this.field371 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field373 - this.field371;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field371 += var2;
			this.method719();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field372.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field515 = 0;
					this.method721(var3);
				} else {
					var3.field515 = var5;
					this.method734(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("x")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
