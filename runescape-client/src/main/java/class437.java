import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pv")
public class class437 {
	@ObfuscatedName("a")
	public final Object field4764;
	@ObfuscatedName("f")
	public final Object field4765;

	public class437(Object var1, Object var2) {
		this.field4764 = var1; // L: 8
		this.field4765 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class437) { // L: 20
			class437 var2 = (class437)var1; // L: 23
			if (this.field4764 == null) { // L: 24
				if (var2.field4764 != null) { // L: 25
					return false;
				}
			} else if (!this.field4764.equals(var2.field4764)) { // L: 27
				return false;
			}

			if (this.field4765 == null) { // L: 28
				if (var2.field4765 != null) { // L: 29
					return false;
				}
			} else if (!this.field4765.equals(var2.field4765)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field4764 + ", " + this.field4765; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4764 != null) { // L: 38
			var1 += this.field4764.hashCode();
		}

		if (this.field4765 != null) {
			var1 += 31 * this.field4765.hashCode(); // L: 39
		}

		return var1; // L: 40
	}
}
