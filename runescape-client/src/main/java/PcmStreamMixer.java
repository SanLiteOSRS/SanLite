import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lju;"
	)
	NodeDeque field363;
	@ObfuscatedName("u")
	int field362;
	@ObfuscatedName("p")
	int field364;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field363 = new NodeDeque();
		this.field362 = 0;
		this.field364 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lbt;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lbt;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("u")
	void method757() {
		if (this.field362 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field363.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field363.previous()) {
				var1.field501 -= this.field362;
			}

			this.field364 -= this.field362;
			this.field362 = 0;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(Lmh;Lbj;)V"
	)
	void method731(Node var1, PcmStreamMixerListener var2) {
		while (this.field363.sentinel != var1 && ((PcmStreamMixerListener)var1).field501 <= var2.field501) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field364 = ((PcmStreamMixerListener)this.field363.sentinel.previous).field501;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lbj;)V"
	)
	void method762(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field363.sentinel.previous;
		if (var2 == this.field363.sentinel) {
			this.field364 = -1;
		} else {
			this.field364 = ((PcmStreamMixerListener)var2).field501;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("g")
	protected int vmethod4124() {
		return 0;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field364 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field362 < this.field364) {
				this.field362 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field364 - this.field362;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field362 += var4;
			this.method757();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field363.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field501 = 0;
					this.method762(var5);
				} else {
					var5.field501 = var7;
					this.method731(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("n")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("l")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field364 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field362 + var1 < this.field364) {
				this.field362 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field364 - this.field362;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field362 += var2;
			this.method757();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field363.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field501 = 0;
					this.method762(var3);
				} else {
					var3.field501 = var5;
					this.method731(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("m")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
