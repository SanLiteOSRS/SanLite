import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class441 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	public static final class441 field4672;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	public static final class441 field4667;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static final class441 field4670;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static final class441 field4669;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static final class441 field4673;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	static final class441 field4671;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1789333857
	)
	final int field4668;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -863462931
	)
	final int field4666;

	static {
		field4672 = new class441(0, 0);
		field4667 = new class441(2, 2);
		field4670 = new class441(3, 5);
		field4669 = new class441(5, 6);
		field4673 = new class441(4, 7);
		field4671 = new class441(1, 8);
	}

	class441(int var1, int var2) {
		this.field4668 = var1;
		this.field4666 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1638703737"
	)
	public boolean method8013() {
		return this == field4667;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4666;
	}
}
