import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("am")
	int field337;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("af")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("aj")
	protected abstract int vmethod6018();

	@ObfuscatedName("ac")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ad")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("bm")
	int vmethod1021() {
		return 255; // L: 16
	}

	@ObfuscatedName("fk")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
