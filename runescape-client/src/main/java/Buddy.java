import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 129094601
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 819600821
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -511271259
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-288484565"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1081684215"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1206486735"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}
}
