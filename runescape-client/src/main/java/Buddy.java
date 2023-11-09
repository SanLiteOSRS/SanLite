import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = 339796037
	)
	static int field4655;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 483726265
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1942829033
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -583560957
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "64"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1300381580"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-29"
	)
	public static int method8045(int var0) {
		return class464.field4782[var0 & 16383]; // L: 28
	}
}
