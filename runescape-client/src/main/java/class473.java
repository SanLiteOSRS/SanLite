import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sk")
public class class473 {
	@ObfuscatedName("ay")
	public final Object field4909;
	@ObfuscatedName("an")
	public final Object field4908;

	public class473(Object var1, Object var2) {
		this.field4909 = var1; // L: 8
		this.field4908 = var2; // L: 9
	} // L: 10

	public String toString() {
		return this.field4909 + ", " + this.field4908; // L: 14
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field4909 != null) { // L: 38
			var1 += this.field4909.hashCode();
		}

		if (this.field4908 != null) {
			var1 += 31 * this.field4908.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class473) { // L: 20
			class473 var2 = (class473)var1; // L: 23
			if (this.field4909 == null) { // L: 24
				if (var2.field4909 != null) { // L: 25
					return false;
				}
			} else if (!this.field4909.equals(var2.field4909)) { // L: 27
				return false;
			}

			if (this.field4908 == null) { // L: 28
				if (var2.field4908 != null) { // L: 29
					return false;
				}
			} else if (!this.field4908.equals(var2.field4908)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}
}
