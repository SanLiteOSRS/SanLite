import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lji;"
	)
	NodeDeque field1365;
	@ObfuscatedName("s")
	int field1366;
	@ObfuscatedName("t")
	int field1368;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field1365 = new NodeDeque();
		this.field1366 = 0;
		this.field1368 = -1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ldc;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ldc;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("s")
	void method2385() {
		if (this.field1366 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field1365.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field1365.previous()) {
				var1.field1476 -= this.field1366;
			}

			this.field1368 -= this.field1366;
			this.field1366 = 0;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Lgw;Ldi;)V"
	)
	void method2408(Node var1, PcmStreamMixerListener var2) {
		while (this.field1365.sentinel != var1 && ((PcmStreamMixerListener)var1).field1476 <= var2.field1476) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field1368 = ((PcmStreamMixerListener)this.field1365.sentinel.previous).field1476;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ldi;)V"
	)
	void method2388(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field1365.sentinel.previous;
		if (var2 == this.field1365.sentinel) {
			this.field1368 = -1;
		} else {
			this.field1368 = ((PcmStreamMixerListener)var2).field1476;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "()Ldc;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("w")
	protected int vmethod3987() {
		return 0;
	}

	@ObfuscatedName("g")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field1368 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field1366 < this.field1368) {
				this.field1366 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field1368 - this.field1366;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field1366 += var4;
			this.method2385();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field1365.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field1476 = 0;
					this.method2388(var5);
				} else {
					var5.field1476 = var7;
					this.method2408(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("m")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("n")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field1368 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field1366 + var1 < this.field1368) {
				this.field1366 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field1368 - this.field1366;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field1366 += var2;
			this.method2385();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field1365.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field1476 = 0;
					this.method2388(var3);
				} else {
					var3.field1476 = var5;
					this.method2408(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("d")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
