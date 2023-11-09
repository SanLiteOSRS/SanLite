import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2079877291
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -990976707
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1032310717
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1065975564"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2067963771"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Lqn;",
		garbageValue = "-8191"
	)
	public static class438 method7950() {
		synchronized(class438.field4693) { // L: 27
			if (class438.field4697 == 0) { // L: 28
				return new class438();
			} else {
				class438.field4693[--class438.field4697].method8207(); // L: 30
				return class438.field4693[class438.field4697]; // L: 31
			}
		}
	}
}
