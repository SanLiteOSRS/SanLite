import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class490 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	public static final class490 field4981;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	public static final class490 field4974;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	public static final class490 field4975;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1802209965
	)
	public final int field4976;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1251478577
	)
	public final int field4977;
	@ObfuscatedName("ax")
	public final Class field4978;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	final class486 field4979;

	static {
		field4981 = new class490(2, 0, Integer.class, new class487()); // L: 10
		field4974 = new class490(1, 1, Long.class, new class489()); // L: 24
		field4975 = new class490(0, 2, String.class, new class491()); // L: 38
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lsh;)V"
	)
	class490(int var1, int var2, Class var3, class486 var4) {
		this.field4976 = var1; // L: 62
		this.field4977 = var2; // L: 63
		this.field4978 = var3; // L: 64
		this.field4979 = var4; // L: 65
	} // L: 66

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4977; // L: 96
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)Ljava/lang/Object;",
		garbageValue = "53817404"
	)
	public Object method8826(Buffer var1) {
		return this.field4979.vmethod8847(var1); // L: 100
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsx;",
		garbageValue = "1567602492"
	)
	public static class490[] method8832() {
		return new class490[]{field4981, field4974, field4975}; // L: 58
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;S)Lsx;",
		garbageValue = "-22734"
	)
	public static class490 method8835(Class var0) {
		class490[] var1 = method8832(); // L: 70

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 71
			class490 var3 = var1[var2]; // L: 72
			if (var3.field4978 == var0) {
				return var3; // L: 74
			}
		}

		return null; // L: 78
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltc;I)V",
		garbageValue = "-1693701433"
	)
	public static void method8827(Object var0, Buffer var1) {
		class486 var2 = method8828(var0.getClass()); // L: 83
		var2.vmethod8848(var0, var1); // L: 84
	} // L: 85

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lsh;",
		garbageValue = "-87"
	)
	static class486 method8828(Class var0) {
		class490 var1 = method8835(var0); // L: 89
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 90
		} else {
			return var1.field4979; // L: 91
		}
	}
}
