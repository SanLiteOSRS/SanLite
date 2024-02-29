import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 548444203
	)
	@Export("world")
	public int world;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1270931115
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 599549949
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2017934332"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "799949886"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "237"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}
}
