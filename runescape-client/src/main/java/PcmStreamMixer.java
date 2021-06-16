import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	NodeDeque field374;
	@ObfuscatedName("v")
	int field373;
	@ObfuscatedName("y")
	int field371;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field374 = new NodeDeque();
		this.field373 = 0;
		this.field371 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lbc;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lbc;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("v")
	void method778() {
		if (this.field373 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field374.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field374.previous()) {
				var1.field519 -= this.field373;
			}

			this.field371 -= this.field373;
			this.field373 = 0;
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lmf;Lbw;)V"
	)
	void method755(Node var1, PcmStreamMixerListener var2) {
		while (this.field374.sentinel != var1 && ((PcmStreamMixerListener)var1).field519 <= var2.field519) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field371 = ((PcmStreamMixerListener)this.field374.sentinel.previous).field519;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lbw;)V"
	)
	void method756(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field374.sentinel.previous;
		if (var2 == this.field374.sentinel) {
			this.field371 = -1;
		} else {
			this.field371 = ((PcmStreamMixerListener)var2).field519;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("r")
	protected int vmethod4740() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field371 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field373 < this.field371) {
				this.field373 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field371 - this.field373;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field373 += var4;
			this.method778();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field374.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field519 = 0;
					this.method756(var5);
				} else {
					var5.field519 = var7;
					this.method755(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("d")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("z")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field371 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field373 + var1 < this.field371) {
				this.field373 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field371 - this.field373;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field373 += var2;
			this.method778();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field374.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field519 = 0;
					this.method756(var3);
				} else {
					var3.field519 = var5;
					this.method755(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("b")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
