import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class262 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class262 field3024;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	static final class262 field3027;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1658005443
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1203100125
	)
	@Export("value")
	final int value;

	static {
		field3024 = new class262(0); // L: 4
		field3027 = new class262(1); // L: 5
	}

	class262(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-521149946"
	)
	public static int method5474(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 13
	}
}
