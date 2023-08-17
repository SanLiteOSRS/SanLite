import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -344611225
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -585067103
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1542031327
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2111367662"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-120"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}
}
