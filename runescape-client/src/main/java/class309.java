import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class309 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3235;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3239;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3240;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3237;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3238;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3246;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3234;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3241;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3242;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3243;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3244;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3245;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	public static final class309 field3236;

	static {
		field3235 = new class309(5); // L: 5
		field3239 = new class309(4); // L: 6
		field3240 = new class309(7); // L: 7
		field3237 = new class309(4); // L: 8
		field3238 = new class309(14); // L: 9
		field3246 = new class309(16); // L: 10
		field3234 = new class309(14); // L: 11
		field3241 = new class309(6); // L: 12
		field3242 = new class309(5); // L: 13
		field3243 = new class309(19); // L: 14
		field3244 = new class309(11); // L: 15
		field3245 = new class309(2); // L: 16
		field3236 = new class309(20); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class309(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)Lmq;",
		garbageValue = "-1598987475"
	)
	static MusicPatch method5871(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-191003094"
	)
	static void method5867() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Luz;",
		garbageValue = "-108536845"
	)
	public static class520 method5866(int var0) {
		class520 var1 = (class520)class520.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class520.field5080.takeFile(39, var0); // L: 25
			var1 = new class520(); // L: 26
			if (var2 != null) { // L: 27
				var1.method9080(new Buffer(var2));
			}

			var1.method9068(); // L: 28
			class520.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnm;II)V",
		garbageValue = "-1795308286"
	)
	public static void method5870(Widget var0, int var1) {
		ItemComposition var2 = class214.ItemComposition_get(var1); // L: 1035
		var0.field3734.equipment[var2.maleModel] = var1 + 512; // L: 1036
		if (var2.maleModel1 != -1) { // L: 1037
			var0.field3734.equipment[var2.maleModel1] = 0; // L: 1038
		}

		if (var2.maleModel2 != -1) { // L: 1040
			var0.field3734.equipment[var2.maleModel2] = 0; // L: 1041
		}

		var0.field3734.method6291(); // L: 1043
	} // L: 1044
}
