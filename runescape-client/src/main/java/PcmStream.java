import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("ar")
	int field352;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcw;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("at")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true; // L: 11
	} // L: 13

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("an")
	protected abstract int vmethod6035();

	@ObfuscatedName("au")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("ab")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("be")
	int vmethod1055() {
		return 255; // L: 16
	}

	@ObfuscatedName("gb")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) { // L: 24
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3); // L: 25
		}

	} // L: 26
}
