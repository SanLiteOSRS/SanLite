import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class314 implements class309 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3435;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3425;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3424;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3426;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3433;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3429;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	public static final class314 field3430;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	static final class314 field3427;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lmf;"
	)
	static final class314[] field3434;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 858522627
	)
	public final int field3432;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1221085013
	)
	public final int field3431;

	static {
		field3435 = new class314(14, 0); // L: 5
		field3425 = new class314(15, 4); // L: 6
		field3424 = new class314(16, -2); // L: 7
		field3426 = new class314(18, -2); // L: 8
		field3433 = new class314(19, -2); // L: 9
		field3429 = new class314(20, 58); // L: 10
		field3430 = new class314(21, 37); // L: 11
		field3427 = new class314(27, 0); // L: 12
		field3434 = new class314[32]; // L: 15
		class314[] var0 = class172.method3542(); // L: 18

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 19
			field3434[var0[var1].field3432] = var0[var1]; // L: 20
		}

	} // L: 22

	class314(int var1, int var2) {
		this.field3432 = var1; // L: 29
		this.field3431 = var2; // L: 30
	} // L: 31
}
