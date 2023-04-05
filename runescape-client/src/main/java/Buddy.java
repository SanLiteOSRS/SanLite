import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1743020357
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -58671067
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1912476299
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-170651115"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1953082718"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-117"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}
}
