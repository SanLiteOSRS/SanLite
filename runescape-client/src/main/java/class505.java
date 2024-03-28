import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("td")
public class class505 {
	@ObfuscatedName("az")
	public final Object field5090;
	@ObfuscatedName("ah")
	public final Object field5089;

	public class505(Object var1, Object var2) {
		this.field5090 = var1; // L: 8
		this.field5089 = var2; // L: 9
	} // L: 10

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field5090 != null) { // L: 38
			var1 += this.field5090.hashCode();
		}

		if (this.field5089 != null) {
			var1 += 31 * this.field5089.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class505) { // L: 20
			class505 var2 = (class505)var1; // L: 23
			if (this.field5090 == null) { // L: 24
				if (var2.field5090 != null) { // L: 25
					return false;
				}
			} else if (!this.field5090.equals(var2.field5090)) { // L: 27
				return false;
			}

			if (this.field5089 == null) { // L: 28
				if (var2.field5089 != null) { // L: 29
					return false;
				}
			} else if (!this.field5089.equals(var2.field5089)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public String toString() {
		return this.field5090 + ", " + this.field5089; // L: 14
	}
}
