import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lja;"
	)
	NodeDeque field1368;
	@ObfuscatedName("l")
	int field1369;
	@ObfuscatedName("m")
	int field1367;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1368 = new NodeDeque();
		this.field1369 = 0;
		this.field1367 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lde;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Lde;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("l")
	void method2455() {
		if (this.field1369 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1368.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1368.previous()) {
				var1.field1477 -= this.field1369;
			}

			this.field1367 -= this.field1369;
			this.field1369 = 0;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lgn;Ldy;)V"
	)
	void method2460(Node var1, PcmStreamMixerListener var2) {
		while (this.field1368.sentinel != var1 && ((PcmStreamMixerListener)var1).field1477 <= var2.field1477) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1367 = ((PcmStreamMixerListener)this.field1368.sentinel.previous).field1477;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ldy;)V"
	)
	void method2430(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1368.sentinel.previous;
		if (var2 == this.field1368.sentinel) {
			this.field1367 = -1;
		} else {
			this.field1367 = ((PcmStreamMixerListener)var2).field1477;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lde;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("c")
	protected int vmethod4043() {
		return 0;
	}

	@ObfuscatedName("u")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1367 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1369 < this.field1367) {
				this.field1369 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1367 - this.field1369;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1369 += var4;
			this.method2455();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1368.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1477 = 0;
					this.method2430(var5);
				} else {
					var5.field1477 = var7;
					this.method2460(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("t")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("e")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1367 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1369 + var1 < this.field1367) {
				this.field1369 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1367 - this.field1369;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1369 += var2;
			this.method2455();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1368.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1477 = 0;
					this.method2430(var3);
				} else {
					var3.field1477 = var5;
					this.method2460(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("o")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
