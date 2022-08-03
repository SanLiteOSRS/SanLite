import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1154494191
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1482789283
	)
	@Export("world")
	public int world;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1921385587
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1193472669
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}
}
