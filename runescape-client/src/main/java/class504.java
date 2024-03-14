import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class504 {
	@ObfuscatedName("aq")
	public final Object field5063;
	@ObfuscatedName("aw")
	public final Object field5064;

	public class504(Object var1, Object var2) {
		this.field5063 = var1; // L: 8
		this.field5064 = var2; // L: 9
	} // L: 10

	public boolean equals(Object var1) {
		if (var1 != null && var1 instanceof class504) { // L: 20
			class504 var2 = (class504)var1; // L: 23
			if (this.field5063 == null) { // L: 24
				if (var2.field5063 != null) { // L: 25
					return false;
				}
			} else if (!this.field5063.equals(var2.field5063)) { // L: 27
				return false;
			}

			if (this.field5064 == null) { // L: 28
				if (var2.field5064 != null) { // L: 29
					return false;
				}
			} else if (!this.field5064.equals(var2.field5064)) { // L: 31
				return false;
			}

			return true; // L: 32
		} else {
			return false; // L: 21
		}
	}

	public int hashCode() {
		int var1 = 0; // L: 37
		if (this.field5063 != null) { // L: 38
			var1 += this.field5063.hashCode();
		}

		if (this.field5064 != null) {
			var1 += 31 * this.field5064.hashCode(); // L: 39
		}

		return var1; // L: 40
	}

	public String toString() {
		return this.field5063 + ", " + this.field5064; // L: 14
	}
}
