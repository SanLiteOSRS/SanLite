import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class345 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static final class345 field3855;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	static final class345 field3856;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1657575025
	)
	final int field3857;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 644653215
	)
	final int field3858;

	static {
		field3855 = new class345(51, 27, 800, 0, 16, 16);
		field3856 = new class345(25, 28, 800, 656, 40, 40);
	}

	class345(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3857 = var5; // L: 39
		this.field3858 = var6; // L: 40
	} // L: 41

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)Ltn;",
		garbageValue = "-2875"
	)
	public static class507 method6654(int var0) {
		class507 var1 = (class507)class507.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class504.field5039.takeFile(38, var0); // L: 26
			var1 = new class507(); // L: 27
			if (var2 != null) { // L: 28
				var1.method8956(new Buffer(var2));
			}

			var1.method8958(); // L: 29
			class507.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
