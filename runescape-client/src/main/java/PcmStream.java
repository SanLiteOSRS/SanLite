import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("b")
	int field349;
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "()Lal;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("f")
	protected abstract int vmethod5476();

	@ObfuscatedName("u")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("k")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("aq")
	int vmethod968() {
		return 255;
	}

	@ObfuscatedName("fa")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
