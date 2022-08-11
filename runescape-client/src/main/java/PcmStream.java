import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("w")
	@Export("active")
	volatile boolean active;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("y")
	int field354;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("sound")
	AbstractSound sound;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "()Lae;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "()Lae;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("j")
	protected abstract int vmethod5453();

	@ObfuscatedName("h")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("d")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("at")
	int vmethod959() {
		return 255; // L: 16
	}

	@ObfuscatedName("eg")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
