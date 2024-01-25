import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tg")
public class class501 {
	@ObfuscatedName("am")
	public final Object field5041;
	@ObfuscatedName("ap")
	public final Object field5042;

	public class501(Object var1, Object var2) {
		this.field5041 = var1; // L: 8
		this.field5042 = var2; // L: 9
	} // L: 10

	public String toString() {
		return this.field5041 + ", " + this.field5042; // L: 14
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class501) { // L: 20
			class501 var2 = (class501)var1; // L: 23
			if (this.field5041 == null) { // L: 24
				if (var2.field5041 != null) { // L: 25
					return false;
				}
			} else if (!this.field5041.equals(var2.field5041)) { // L: 27
				return false;
			}

			if (this.field5042 == null) { // L: 28
				if (var2.field5042 != null) { // L: 29
					return false;
				}
			} else if (!this.field5042.equals(var2.field5042)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field5041 != null) { // L: 38
			var1 += this.field5041.hashCode();
		}

		if (this.field5042 != null) {
			var1 += 31 * this.field5042.hashCode(); // L: 39
		}

		return var1; // L: 40
	}
}
