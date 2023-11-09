import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class473 {
	@ObfuscatedName("at")
	public final Object field4903;
	@ObfuscatedName("an")
	public final Object field4904;

	public class473(Object var1, Object var2) {
		this.field4903 = var1; // L: 8
		this.field4904 = var2; // L: 9
	} // L: 10

	public String toString() {
		return this.field4903 + ", " + this.field4904; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4903 != null) { // L: 38
			var1 += this.field4903.hashCode();
		}

		if (this.field4904 != null) {
			var1 += 31 * this.field4904.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class473) {
			class473 var2 = (class473)var1;
			if (this.field4903 == null) {
				if (var2.field4903 != null) {
					return false;
				}
			} else if (!this.field4903.equals(var2.field4903)) {
				return false;
			}

			if (this.field4904 == null) { // L: 28
				if (var2.field4904 != null) { // L: 29
					return false;
				}
			} else if (!this.field4904.equals(var2.field4904)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltp;",
		garbageValue = "0"
	)
	public static class495 method8587(int var0) {
		class495 var1 = (class495)class495.DBRowType_cache.get((long)var0); // L: 20
		if (var1 != null) { // L: 21
			return var1;
		} else {
			byte[] var2 = class495.field4997.takeFile(38, var0); // L: 22
			var1 = new class495(); // L: 23
			if (var2 != null) { // L: 24
				var1.method8811(new Buffer(var2));
			}

			var1.method8814(); // L: 25
			class495.DBRowType_cache.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}
}
