import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field4811;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "-958861827"
	)
	public static class525 method8249(int var0) {
		class525 var1 = (class525)class525.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class525.field5163.takeFile(39, var0); // L: 25
			var1 = new class525(); // L: 26
			if (var2 != null) { // L: 27
				var1.method9148(new Buffer(var2));
			}

			var1.method9151(); // L: 28
			class525.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
