import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 904047133
	)
	@Export("world")
	public int world;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2142778633
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 751855853
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-32731778"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1595265658"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1427847583"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
