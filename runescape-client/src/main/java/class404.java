import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class404 implements MouseWheel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	public static final class404 field4351;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	public static final class404 field4352;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static final class404 field4350;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static final class404 field4349;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static final class404 field4353;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	static final class404 field4354;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1390706717
	)
	final int field4355;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -611515957
	)
	final int field4356;

	static {
		field4351 = new class404(2, 0);
		field4352 = new class404(5, 2);
		field4350 = new class404(3, 5);
		field4349 = new class404(0, 6);
		field4353 = new class404(1, 7);
		field4354 = new class404(4, 8);
	}

	class404(int var1, int var2) {
		this.field4355 = var1;
		this.field4356 = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1832160876"
	)
	public boolean method7220() {
		return this == field4352;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "238732485"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4356;
	}
}
