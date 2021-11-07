import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	NodeDeque field227;
	@ObfuscatedName("a")
	int field226;
	@ObfuscatedName("o")
	int field229;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field227 = new NodeDeque();
		this.field226 = 0;
		this.field229 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lav;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lav;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("s")
	void method663() {
		if (this.field226 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field227.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field227.previous()) {
				var1.field368 -= this.field226;
			}

			this.field229 -= this.field226;
			this.field226 = 0;
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lns;Law;)V"
	)
	void method651(Node var1, PcmStreamMixerListener var2) {
		while (this.field227.sentinel != var1 && ((PcmStreamMixerListener)var1).field368 <= var2.field368) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field229 = ((PcmStreamMixerListener)this.field227.sentinel.previous).field368;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Law;)V"
	)
	void method633(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field227.sentinel.previous;
		if (var2 == this.field227.sentinel) {
			this.field229 = -1;
		} else {
			this.field229 = ((PcmStreamMixerListener)var2).field368;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("p")
	protected int vmethod4958() {
		return 0;
	}

	@ObfuscatedName("j")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field229 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field226 < this.field229) {
				this.field226 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field229 - this.field226;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field226 += var4;
			this.method663();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field227.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field368 = 0;
					this.method633(var5);
				} else {
					var5.field368 = var7;
					this.method651(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("b")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("x")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field229 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field226 + var1 < this.field229) {
				this.field226 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field229 - this.field226;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field226 += var2;
			this.method663();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field227.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field368 = 0;
					this.method633(var3);
				} else {
					var3.field368 = var5;
					this.method651(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("y")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
