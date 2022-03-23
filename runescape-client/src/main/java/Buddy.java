import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -329261875
	)
	@Export("world")
	public int world;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 942443689
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1490614651
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "33"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-204003720"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1184612078"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
