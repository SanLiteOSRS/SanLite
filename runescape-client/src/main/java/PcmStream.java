import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("y")
	int field348;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "()Lah;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("k")
	protected abstract int vmethod5396();

	@ObfuscatedName("o")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("d")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("az")
	int vmethod920() {
		return 255; // L: 16
	}

	@ObfuscatedName("ft")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
