import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("PcmStream")
public abstract class PcmStream extends Node {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "Lbt;"
	)
	@Export("after")
	PcmStream after;
	@ObfuscatedName("q")
	int field454;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lbc;"
	)
	@Export("sound")
	AbstractSound sound;
	@ObfuscatedName("v")
	@Export("active")
	volatile boolean active;

	protected PcmStream() {
		this.active = true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("firstSubStream")
	protected abstract PcmStream firstSubStream();

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "()Lbt;"
	)
	@Export("nextSubStream")
	protected abstract PcmStream nextSubStream();

	@ObfuscatedName("g")
	protected abstract int vmethod4124();

	@ObfuscatedName("h")
	@Export("fill")
	protected abstract void fill(int[] var1, int var2, int var3);

	@ObfuscatedName("l")
	@Export("skip")
	protected abstract void skip(int var1);

	@ObfuscatedName("af")
	int vmethod1039() {
		return 255;
	}

	@ObfuscatedName("ef")
	@Export("update")
	final void update(int[] var1, int var2, int var3) {
		if (this.active) {
			this.fill(var1, var2, var3);
		} else {
			this.skip(var3);
		}

	}
}
