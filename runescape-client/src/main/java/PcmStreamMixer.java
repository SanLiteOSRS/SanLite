import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	NodeDeque field391;
	@ObfuscatedName("f")
	int field392;
	@ObfuscatedName("y")
	int field390;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field391 = new NodeDeque();
		this.field392 = 0;
		this.field390 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lbm;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lbm;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("f")
	void method665() {
		if (this.field392 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field391.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field391.previous()) {
				var1.field541 -= this.field392;
			}

			this.field390 -= this.field392;
			this.field392 = 0;
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lmw;Lbf;)V"
	)
	void method654(Node var1, PcmStreamMixerListener var2) {
		while (this.field391.sentinel != var1 && ((PcmStreamMixerListener)var1).field541 <= var2.field541) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field390 = ((PcmStreamMixerListener)this.field391.sentinel.previous).field541;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lbf;)V"
	)
	void method653(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field391.sentinel.previous;
		if (var2 == this.field391.sentinel) {
			this.field390 = -1;
		} else {
			this.field390 = ((PcmStreamMixerListener)var2).field541;
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("b")
	protected int vmethod4610() {
		return 0;
	}

	@ObfuscatedName("d")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field390 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field392 < this.field390) {
				this.field392 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field390 - this.field392;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field392 += var4;
			this.method665();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field391.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field541 = 0;
					this.method653(var5);
				} else {
					var5.field541 = var7;
					this.method654(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("s")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("u")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field390 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field392 + var1 < this.field390) {
				this.field392 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field390 - this.field392;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field392 += var2;
			this.method665();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field391.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field541 = 0;
					this.method653(var3);
				} else {
					var3.field541 = var5;
					this.method654(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("l")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
