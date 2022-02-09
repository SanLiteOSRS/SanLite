import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("PcmStreamMixer")
public class PcmStreamMixer extends PcmStream {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("subStreams")
	NodeDeque subStreams;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	NodeDeque field262;
	@ObfuscatedName("s")
	int field264;
	@ObfuscatedName("e")
	int field265;

	public PcmStreamMixer() {
		this.subStreams = new NodeDeque();
		this.field262 = new NodeDeque();
		this.field264 = 0;
		this.field265 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lan;)V"
	)
	@Export("addSubStream")
	public final synchronized void addSubStream(PcmStream var1) {
		this.subStreams.addLast(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lan;)V"
	)
	@Export("removeSubStream")
	public final synchronized void removeSubStream(PcmStream var1) {
		var1.remove();
	}

	@ObfuscatedName("s")
	void method635() {
		if (this.field264 > 0) {
			for (PcmStreamMixerListener var1 = (PcmStreamMixerListener)this.field262.last(); var1 != null; var1 = (PcmStreamMixerListener)this.field262.previous()) {
				var1.field407 -= this.field264;
			}

			this.field265 -= this.field264;
			this.field264 = 0;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Loe;Lam;)V"
	)
	void method637(Node var1, PcmStreamMixerListener var2) {
		while (this.field262.sentinel != var1 && ((PcmStreamMixerListener)var1).field407 <= var2.field407) {
			var1 = var1.previous;
		}

		NodeDeque.NodeDeque_addBefore(var2, var1);
		this.field265 = ((PcmStreamMixerListener)this.field262.sentinel.previous).field407;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lam;)V"
	)
	void method632(PcmStreamMixerListener var1) {
		var1.remove();
		var1.remove2();
		Node var2 = this.field262.sentinel.previous;
		if (var2 == this.field262.sentinel) {
			this.field265 = -1;
		} else {
			this.field265 = ((PcmStreamMixerListener)var2).field407;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return (PcmStream)this.subStreams.last();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lan;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return (PcmStream)this.subStreams.previous();
	}

	@ObfuscatedName("w")
	protected int vmethod5241() {
		return 0;
	}

	@ObfuscatedName("v")
	@Export("fill")
	public final synchronized void fill(int[] var1, int var2, int var3) {
		do {
			if (this.field265 < 0) {
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			if (var3 + this.field264 < this.field265) {
				this.field264 += var3;
				this.updateSubStreams(var1, var2, var3);
				return;
			}

			int var4 = this.field265 - this.field264;
			this.updateSubStreams(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field264 += var4;
			this.method635();
			PcmStreamMixerListener var5 = (PcmStreamMixerListener)this.field262.last();
			synchronized(var5) {
				int var7 = var5.update();
				if (var7 < 0) {
					var5.field407 = 0;
					this.method632(var5);
				} else {
					var5.field407 = var7;
					this.method637(var5.previous, var5);
				}
			}
		} while(var3 != 0);

	}

	@ObfuscatedName("a")
	@Export("updateSubStreams")
	void updateSubStreams(int[] var1, int var2, int var3) {
		for (PcmStream var4 = (PcmStream)this.subStreams.last(); var4 != null; var4 = (PcmStream)this.subStreams.previous()) {
			var4.update(var1, var2, var3);
		}

	}

	@ObfuscatedName("y")
	@Export("skip")
	public final synchronized void skip(int var1) {
		do {
			if (this.field265 < 0) {
				this.skipSubStreams(var1);
				return;
			}

			if (this.field264 + var1 < this.field265) {
				this.field264 += var1;
				this.skipSubStreams(var1);
				return;
			}

			int var2 = this.field265 - this.field264;
			this.skipSubStreams(var2);
			var1 -= var2;
			this.field264 += var2;
			this.method635();
			PcmStreamMixerListener var3 = (PcmStreamMixerListener)this.field262.last();
			synchronized(var3) {
				int var5 = var3.update();
				if (var5 < 0) {
					var3.field407 = 0;
					this.method632(var3);
				} else {
					var3.field407 = var5;
					this.method637(var3.previous, var3);
				}
			}
		} while(var1 != 0);

	}

	@ObfuscatedName("u")
	@Export("skipSubStreams")
	void skipSubStreams(int var1) {
		for (PcmStream var2 = (PcmStream)this.subStreams.last(); var2 != null; var2 = (PcmStream)this.subStreams.previous()) {
			var2.skip(var1);
		}

	}
}
