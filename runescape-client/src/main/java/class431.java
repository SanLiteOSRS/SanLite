import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public enum class431 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	field4588(1, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	field4591(2, 2);

	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1460775291
	)
	public final int field4590;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1881974467
	)
	final int field4587;

	class431(int var3, int var4) {
		this.field4590 = var3;
		this.field4587 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4587;
	}
}
